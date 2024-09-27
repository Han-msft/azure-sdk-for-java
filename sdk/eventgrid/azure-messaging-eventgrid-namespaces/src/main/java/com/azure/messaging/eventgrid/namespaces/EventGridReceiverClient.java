// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.namespaces;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.messaging.eventgrid.namespaces.implementation.EventGridReceiverClientImpl;
import com.azure.messaging.eventgrid.namespaces.implementation.models.AcknowledgeRequest;
import com.azure.messaging.eventgrid.namespaces.implementation.models.RejectRequest;
import com.azure.messaging.eventgrid.namespaces.implementation.models.ReleaseRequest;
import com.azure.messaging.eventgrid.namespaces.implementation.models.RenewLocksRequest;
import com.azure.messaging.eventgrid.namespaces.models.AcknowledgeResult;
import com.azure.messaging.eventgrid.namespaces.models.ReceiveResult;
import com.azure.messaging.eventgrid.namespaces.models.RejectResult;
import com.azure.messaging.eventgrid.namespaces.models.ReleaseDelay;
import com.azure.messaging.eventgrid.namespaces.models.ReleaseResult;
import com.azure.messaging.eventgrid.namespaces.models.RenewLocksResult;
import java.time.Duration;
import java.util.List;

/**
 * Initializes a new instance of the synchronous EventGridReceiverClient type.
 */
@ServiceClient(builder = EventGridReceiverClientBuilder.class)
public final class EventGridReceiverClient {

    @Generated
    private final EventGridReceiverClientImpl serviceClient;

    private final String topicName;

    private final String subscriptionName;

    /**
     * Initializes an instance of EventGridReceiverClient class.
     *
     * @param serviceClient the service client implementation.
     * @param topicName the topicName for this client.
     * @param subscriptionName the subscriptionName for this client.
     */
    EventGridReceiverClient(EventGridReceiverClientImpl serviceClient, String topicName, String subscriptionName) {
        this.serviceClient = serviceClient;
        this.topicName = topicName;
        this.subscriptionName = subscriptionName;
    }

    /**
     * Receive a batch of Cloud Events from a subscription.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>maxEvents</td><td>Integer</td><td>No</td><td>Max Events count to be received. Minimum value is 1, while
     * maximum value is 100 events. If not specified, the default value is 1.</td></tr>
     * <tr><td>maxWaitTime</td><td>Duration</td><td>No</td><td>Max wait time value for receive operation in Seconds. It
     * is the time in seconds that the server approximately waits for the availability of an event and responds to the
     * request. If an event is available, the broker responds immediately to the client. Minimum value is 10 seconds,
     * while maximum value is 120 seconds. If not specified, the default value is 60 seconds.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     value (Required): [
     *          (Required){
     *             brokerProperties (Required): {
     *                 lockToken: String (Required)
     *                 deliveryCount: int (Required)
     *             }
     *             event (Required): {
     *                 id: String (Required)
     *                 source: String (Required)
     *                 data: Object (Optional)
     *                 data_base64: byte[] (Optional)
     *                 type: String (Required)
     *                 time: OffsetDateTime (Optional)
     *                 specversion: String (Required)
     *                 dataschema: String (Optional)
     *                 datacontenttype: String (Optional)
     *                 subject: String (Optional)
     *             }
     *         }
     *     ]
     * }
     * }
     * </pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return details of the Receive operation response along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> receiveWithResponse(String topicName, String eventSubscriptionName,
        RequestOptions requestOptions) {
        return this.serviceClient.receiveWithResponse(topicName, eventSubscriptionName, requestOptions);
    }

    /**
     * Acknowledge a batch of Cloud Events. The response will include the set of successfully acknowledged lock tokens,
     * along with other failed lock tokens with their corresponding error information. Successfully acknowledged events
     * will no longer be available to be received by any consumer.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     lockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     failedLockTokens (Required): [
     *          (Required){
     *             lockToken: String (Required)
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     succeededLockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param acknowledgeRequest The acknowledgeRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Acknowledge operation along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> acknowledgeWithResponse(String topicName, String eventSubscriptionName,
        BinaryData acknowledgeRequest, RequestOptions requestOptions) {
        return this.serviceClient.acknowledgeWithResponse(topicName, eventSubscriptionName, acknowledgeRequest,
            requestOptions);
    }

    /**
     * Release a batch of Cloud Events. The response will include the set of successfully released lock tokens, along
     * with other failed lock tokens with their corresponding error information. Successfully released events can be
     * received by consumers.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>releaseDelayInSeconds</td><td>String</td><td>No</td><td>Release cloud events with the specified delay in
     * seconds. Allowed values: "0", "10", "60", "600", "3600".</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     lockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     failedLockTokens (Required): [
     *          (Required){
     *             lockToken: String (Required)
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     succeededLockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param releaseRequest The releaseRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Release operation along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> releaseWithResponse(String topicName, String eventSubscriptionName, BinaryData releaseRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.releaseWithResponse(topicName, eventSubscriptionName, releaseRequest, requestOptions);
    }

    /**
     * Reject a batch of Cloud Events. The response will include the set of successfully rejected lock tokens, along
     * with other failed lock tokens with their corresponding error information. Successfully rejected events will be
     * dead-lettered and can no longer be received by a consumer.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     lockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     failedLockTokens (Required): [
     *          (Required){
     *             lockToken: String (Required)
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     succeededLockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param rejectRequest The rejectRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Reject operation along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> rejectWithResponse(String topicName, String eventSubscriptionName, BinaryData rejectRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.rejectWithResponse(topicName, eventSubscriptionName, rejectRequest, requestOptions);
    }

    /**
     * Renew locks for a batch of Cloud Events. The response will include the set of successfully renewed lock tokens,
     * along with other failed lock tokens with their corresponding error information. Successfully renewed locks will
     * ensure that the associated event is only available to the consumer that holds the renewed lock.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     lockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     failedLockTokens (Required): [
     *          (Required){
     *             lockToken: String (Required)
     *             error (Required): {
     *                 code: String (Required)
     *                 message: String (Required)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *                 innererror (Optional): {
     *                     code: String (Optional)
     *                     innererror (Optional): (recursive schema, see innererror above)
     *                 }
     *             }
     *         }
     *     ]
     *     succeededLockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }
     * </pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param renewLocksRequest The renewLocksRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the RenewLock operation along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> renewLocksWithResponse(String topicName, String eventSubscriptionName,
        BinaryData renewLocksRequest, RequestOptions requestOptions) {
        return this.serviceClient.renewLocksWithResponse(topicName, eventSubscriptionName, renewLocksRequest,
            requestOptions);
    }

    /**
     * Receive a batch of Cloud Events from a subscription.
     *
     * @param maxEvents Max Events count to be received. Minimum value is 1, while maximum value is 100 events. If not
     * specified, the default value is 1.
     * @param maxWaitTime Max wait time value for receive operation in Seconds. It is the time in seconds that the
     * server approximately waits for the availability of an event and responds to the request. If an event is
     * available, the broker responds immediately to the client. Minimum value is 10 seconds, while maximum value is 120
     * seconds. If not specified, the default value is 60 seconds. Fractional seconds are ignored and rounded down.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Receive operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReceiveResult receive(Integer maxEvents, Duration maxWaitTime) {
        RequestOptions requestOptions = new RequestOptions();
        if (maxEvents != null) {
            requestOptions.addQueryParam("maxEvents", String.valueOf(maxEvents), false);
        }
        if (maxWaitTime != null) {
            return receiveWithResponse(maxEvents, maxWaitTime, new RequestOptions()).getValue();
        }
        return receiveWithResponse(topicName, subscriptionName, requestOptions).getValue()
            .toObject(ReceiveResult.class);
    }

    /**
     * Receive a batch of Cloud Events from a subscription.
     *
     * @param maxEvents Max Events count to be received. Minimum value is 1, while maximum value is 100 events. If not
     * specified, the default value is 1.
     * @param maxWaitTime Max wait time value for receive operation in Seconds. It is the time in seconds that the
     * server approximately waits for the availability of an event and responds to the request. If an event is
     * available, the broker responds immediately to the client. Minimum value is 10 seconds, while maximum value is 120
     * seconds. If not specified, the default value is 60 seconds. Fractional seconds are ignored and rounded down.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Receive operation response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReceiveResult> receiveWithResponse(Integer maxEvents, Duration maxWaitTime,
        RequestOptions requestOptions) {
        if (maxEvents != null) {
            requestOptions.addQueryParam("maxEvents", String.valueOf(maxEvents), false);
        }
        if (maxWaitTime != null) {
            // Ensure the http client timeout is longer than the maxWaitTime
            addTimeoutToContext(requestOptions, maxWaitTime);
            requestOptions.addQueryParam("maxWaitTime", String.valueOf(maxWaitTime.getSeconds()), false);
        } else {
            // Extend the timeout with a buffer past the default maxWaitTime.
            addTimeoutToContext(requestOptions, Duration.ofSeconds(65));
        }
        Response<BinaryData> response = receiveWithResponse(topicName, subscriptionName, requestOptions);
        return new SimpleResponse<>(response, response.getValue().toObject(ReceiveResult.class));
    }

    /**
     * Receive a Cloud Event from a subscription. This method will wait 60 seconds for a response.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Receive operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReceiveResult receive() {
        RequestOptions requestOptions = new RequestOptions();
        return receiveWithResponse(topicName, subscriptionName, requestOptions).getValue()
            .toObject(ReceiveResult.class);
    }

    /**
     * Acknowledge a batch of Cloud Events. The response will include the set of successfully acknowledged lock tokens,
     * along with other failed lock tokens with their corresponding error information. Successfully acknowledged events
     * will no longer be available to be received by any consumer.
     *
     * @param lockTokens Array of lock tokens.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Acknowledge operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AcknowledgeResult acknowledge(List<String> lockTokens) {
        RequestOptions requestOptions = new RequestOptions();
        AcknowledgeRequest requestObj = new AcknowledgeRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        return acknowledgeWithResponse(topicName, subscriptionName, request, requestOptions).getValue()
            .toObject(AcknowledgeResult.class);
    }

    /**
     * Acknowledge a batch of Cloud Events. The response will include the set of successfully acknowledged lock tokens,
     * along with other failed lock tokens with their corresponding error information. Successfully acknowledged events
     * will no longer be available to be received by any consumer.
     *
     * @param lockTokens Array of lock tokens.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Acknowledge operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AcknowledgeResult> acknowledgeWithResponse(List<String> lockTokens, RequestOptions requestOptions) {
        AcknowledgeRequest requestObj = new AcknowledgeRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        Response<BinaryData> response = acknowledgeWithResponse(topicName, subscriptionName, request, requestOptions);
        return new SimpleResponse<>(response, response.getValue().toObject(AcknowledgeResult.class));
    }

    /**
     * Release a batch of Cloud Events. The response will include the set of successfully released lock tokens, along
     * with other failed lock tokens with their corresponding error information. Successfully released events can be
     * received by consumers.
     *
     * @param lockTokens Array of lock tokens.
     * @param releaseDelay Release cloud events with the specified delay in seconds.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Release operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReleaseResult release(List<String> lockTokens, ReleaseDelay releaseDelay) {
        RequestOptions requestOptions = new RequestOptions();
        ReleaseRequest requestObj = new ReleaseRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        if (releaseDelay != null) {
            requestOptions.addQueryParam("releaseDelayInSeconds", releaseDelay.toString(), false);
        }
        return releaseWithResponse(topicName, subscriptionName, request, requestOptions).getValue()
            .toObject(ReleaseResult.class);
    }

    /**
     * Release a batch of Cloud Events. The response will include the set of successfully released lock tokens, along
     * with other failed lock tokens with their corresponding error information. Successfully released events can be
     * received by consumers.
     *
     * @param lockTokens Array of lock tokens.
     * @param releaseDelay Release cloud events with the specified delay in seconds.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Release operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReleaseResult> releaseWithResponse(List<String> lockTokens, ReleaseDelay releaseDelay,
        RequestOptions requestOptions) {
        ReleaseRequest requestObj = new ReleaseRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        if (releaseDelay != null) {
            requestOptions.addQueryParam("releaseDelayInSeconds", releaseDelay.toString(), false);
        }
        Response<BinaryData> response = releaseWithResponse(topicName, subscriptionName, request, requestOptions);
        return new SimpleResponse<>(response, response.getValue().toObject(ReleaseResult.class));
    }

    /**
     * Release a batch of Cloud Events. The response will include the set of successfully released lock tokens, along
     * with other failed lock tokens with their corresponding error information. Successfully released events can be
     * received by consumers.
     *
     * @param lockTokens Array of lock tokens.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Release operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReleaseResult release(List<String> lockTokens) {
        RequestOptions requestOptions = new RequestOptions();
        ReleaseRequest requestObj = new ReleaseRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        return releaseWithResponse(topicName, subscriptionName, request, requestOptions).getValue()
            .toObject(ReleaseResult.class);
    }

    /**
     * Reject a batch of Cloud Events. The response will include the set of successfully rejected lock tokens, along
     * with other failed lock tokens with their corresponding error information. Successfully rejected events will be
     * dead-lettered and can no longer be received by a consumer.
     *
     * @param lockTokens Array of lock tokens.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Reject operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RejectResult reject(List<String> lockTokens) {
        RequestOptions requestOptions = new RequestOptions();
        RejectRequest requestObj = new RejectRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        return rejectWithResponse(topicName, subscriptionName, request, requestOptions).getValue()
            .toObject(RejectResult.class);
    }

    /**
     * Reject a batch of Cloud Events. The response will include the set of successfully rejected lock tokens, along
     * with other failed lock tokens with their corresponding error information. Successfully rejected events will be
     * dead-lettered and can no longer be received by a consumer.
     *
     * @param lockTokens Array of lock tokens.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Reject operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RejectResult> rejectWithResponse(List<String> lockTokens, RequestOptions requestOptions) {
        RejectRequest requestObj = new RejectRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        Response<BinaryData> response = rejectWithResponse(topicName, subscriptionName, request, requestOptions);
        return new SimpleResponse<>(response, response.getValue().toObject(RejectResult.class));
    }

    /**
     * Renew locks for a batch of Cloud Events. The response will include the set of successfully renewed lock tokens,
     * along with other failed lock tokens with their corresponding error information. Successfully renewed locks will
     * ensure that the associated event is only available to the consumer that holds the renewed lock.
     *
     * @param lockTokens Array of lock tokens.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the RenewLock operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RenewLocksResult renewLocks(List<String> lockTokens) {
        RequestOptions requestOptions = new RequestOptions();
        RenewLocksRequest requestObj = new RenewLocksRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        return renewLocksWithResponse(topicName, subscriptionName, request, requestOptions).getValue()
            .toObject(RenewLocksResult.class);
    }

    /**
     * Renew locks for a batch of Cloud Events. The response will include the set of successfully renewed lock tokens,
     * along with other failed lock tokens with their corresponding error information. Successfully renewed locks will
     * ensure that the associated event is only available to the consumer that holds the renewed lock.
     *
     * @param lockTokens Array of lock tokens.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the RenewLock operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RenewLocksResult> renewLocksWithResponse(List<String> lockTokens, RequestOptions requestOptions) {
        RenewLocksRequest requestObj = new RenewLocksRequest(lockTokens);
        BinaryData request = BinaryData.fromObject(requestObj);
        Response<BinaryData> response = renewLocksWithResponse(topicName, subscriptionName, request, requestOptions);
        return new SimpleResponse<>(response, response.getValue().toObject(RenewLocksResult.class));
    }

    /**
     * Gets the topicName for this client.
     *
     * @return the topic name.
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * Gets the subscriptionName for this client.
     *
     * @return the subscription name.
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Adds a timeout (maxWaitTime) to a context.
     *
     * @param requestOptions The request options to update.
     * @param timeout The timeout to add.
     * @return The updated context.
     */
    static void addTimeoutToContext(RequestOptions requestOptions, Duration timeout) {
        Context context = requestOptions.getContext();
        if (context == null) {
            context = new Context("azure-response-timeout", timeout.plusSeconds(5));
        } else {
            context = context.addData("azure-response-timeout", timeout.plusSeconds(5));
        }
        requestOptions.setContext(context);
    }
}
