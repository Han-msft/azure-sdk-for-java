// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.implementation.http.HttpRequestAccessHelper;
import io.clientcore.core.util.ClientLogger;
import io.clientcore.core.util.binarydata.BinaryData;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

import static io.clientcore.core.annotation.TypeConditions.FLUENT;

/**
 * The outgoing HTTP request. This class provides ways to construct it with an {@link HttpMethod}, {@link URI},
 * {@link HttpHeader} and request body.
 */
@Metadata(conditions = FLUENT)
public class HttpRequest {
    // HttpRequest is a highly used, short-lived class, use a static logger.
    private static final ClientLogger LOGGER = new ClientLogger(HttpRequest.class);

    static {
        HttpRequestAccessHelper.setAccessor(new HttpRequestAccessHelper.HttpRequestAccessor() {
            @Override
            public int getRetryCount(HttpRequest httpRequest) {
                return httpRequest.getRetryCount();
            }

            @Override
            public HttpRequest setRetryCount(HttpRequest httpRequest, int retryCount) {
                return httpRequest.setRetryCount(retryCount);
            }
        });
    }

    private HttpMethod httpMethod;
    private URI uri;
    private HttpHeaders headers;
    private BinaryData body;
    private ServerSentEventListener serverSentEventListener;
    private RequestOptions requestOptions;
    private int retryCount;

    /**
     * Create a new {@link HttpRequest} instance.
     *
     * @param httpMethod The request {@link HttpMethod}.
     * @param uri The target address to send the request to as a {@link URI}.
     * @throws NullPointerException if {@code uri} is {@code null}.
     */
    public HttpRequest(HttpMethod httpMethod, URI uri) {
        this.httpMethod = Objects.requireNonNull(httpMethod, "'httpMethod' cannot be null");
        this.uri = Objects.requireNonNull(uri, "'uri' cannot be null");
        this.headers = new HttpHeaders();
        this.requestOptions = RequestOptions.none();
    }

    /**
     * Create a new {@link HttpRequest} instance.
     *
     * @param httpMethod The request {@link HttpMethod}.
     * @param uri The target address to send the request to.
     * @throws NullPointerException if {@code uri} is {@code null}.
     * @throws IllegalArgumentException If {@code uri} cannot be parsed into a valid {@link URI}.
     */
    public HttpRequest(HttpMethod httpMethod, String uri) {
        this.httpMethod = Objects.requireNonNull(httpMethod, "'httpMethod' cannot be null");

        setUri(uri);

        this.headers = new HttpHeaders();
        this.requestOptions = RequestOptions.none();
    }

    /**
     * Get the request {@link HttpMethod}.
     *
     * @return The request {@link HttpMethod}.
     */
    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    /**
     * Set the request {@link HttpMethod}.
     *
     * @param httpMethod The request {@link HttpMethod}.
     * @return The updated {@link HttpRequest}.
     * @throws NullPointerException if {@code httpMethod} is {@code null}.
     */
    public HttpRequest setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = Objects.requireNonNull(httpMethod, "'httpMethod' cannot be null");

        return this;
    }

    /**
     * Get the target address as a {@link URI}.
     *
     * @return The target address as a {@link URI}.
     */
    public URI getUri() {
        return uri;
    }

    /**
     * Set the target address to send the request to.
     *
     * @param uri The target address as a {@link URI}.
     * @return The updated {@link HttpRequest}.
     * @throws NullPointerException if {@code uri} is null.
     */
    public HttpRequest setUri(URI uri) {
        this.uri = Objects.requireNonNull(uri, "'uri' cannot be null");

        return this;
    }

    /**
     * Set the target address to send the request to.
     *
     * @param uri The target address as a {@link URI}.
     * @return The updated {@link HttpRequest}.
     * @throws NullPointerException if {@code uri} is {@code null}.
     * @throws IllegalArgumentException If {@code uri} cannot be parsed into a valid {@link URI}.
     */
    public HttpRequest setUri(String uri) {
        try {
            this.uri = new URI(Objects.requireNonNull(uri, "'uri' cannot be null"));
        } catch (URISyntaxException ex) {
            throw LOGGER.logThrowableAsError(new IllegalArgumentException("'uri' must be a valid URI.", ex));
        }

        return this;
    }

    /**
     * Get the request {@link HttpHeaders headers}.
     *
     * @return The {@link HttpHeaders headers} to be sent.
     */
    public HttpHeaders getHeaders() {
        return headers;
    }

    /**
     * Set the request {@link HttpHeaders headers}.
     *
     * @param headers The {@link HttpHeaders headers} to set.
     * @return The updated {@link HttpRequest}.
     */
    public HttpRequest setHeaders(HttpHeaders headers) {
        this.headers = headers;

        return this;
    }

    /**
     * Get the request content.
     *
     * @return The content to be sent.
     */
    public BinaryData getBody() {
        return body;
    }

    /**
     * Set the request content.
     *
     * <p>If the provided content has known length, i.e. {@link BinaryData#getLength()} returns non-null then the
     * {@code Content-Length} header is updated. Otherwise, if the provided content has unknown length, i.e.
     * {@link BinaryData#getLength()} returns {@code null} then the caller must set the {@code Content-Length} header
     * to indicate the length of the content, or use {@code Transfer-Encoding: chunked}.</p>
     *
     * @param content The request content.
     * @return The updated {@link HttpRequest}.
     */
    public HttpRequest setBody(BinaryData content) {
        this.body = content;

        // TODO (alzimmer): should the Content-Length header be removed if content is null?
        if (content != null && content.getLength() != null) {
            headers.set(HttpHeaderName.CONTENT_LENGTH, String.valueOf(content.getLength()));
        }

        return this;
    }

    /**
     * Get the request {@link RequestOptions options}.
     *
     * @return The request {@link RequestOptions options}.
     */
    public RequestOptions getRequestOptions() {
        return requestOptions;
    }

    /**
     * Set the request {@link RequestOptions options}.
     *
     * @param requestOptions The request {@link RequestOptions options}.
     * @return The updated {@link HttpRequest}.
     */
    public HttpRequest setRequestOptions(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;

        return this;
    }

    /**
     * Get the specified event stream {@link ServerSentEventListener listener} for this request.
     *
     * @return The {@link ServerSentEventListener listener} for this request.
     */
    public ServerSentEventListener getServerSentEventListener() {
        return serverSentEventListener;
    }

    /**
     * Set an event stream {@link ServerSentEventListener listener} for this request.
     *
     * @param serverSentEventListener The {@link ServerSentEventListener listener} to set for this request.
     * @return The updated {@link HttpRequest}.
     */
    public HttpRequest setServerSentEventListener(ServerSentEventListener serverSentEventListener) {
        this.serverSentEventListener = serverSentEventListener;

        return this;
    }

    /**
     * Gets the number of times the request has been retried.
     *
     * @return The number of times the request has been retried.
     */
    private int getRetryCount() {
        return retryCount;
    }

    /**
     * Sets the number of times the request has been retried.
     *
     * @param retryCount The number of times the request has been retried.
     * @return The updated {@link HttpRequest} object.
     */
    private HttpRequest setRetryCount(int retryCount) {
        this.retryCount = retryCount;

        return this;
    }
}
