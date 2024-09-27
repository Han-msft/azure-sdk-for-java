// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter;

import com.azure.communication.common.implementation.CommunicationConnectionString;
import com.azure.communication.common.implementation.HmacAuthenticationPolicy;
import com.azure.communication.jobrouter.implementation.JobRouterAdministrationClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.ConnectionStringTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.KeyCredentialTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.KeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A builder for creating a new instance of the JobRouterAdministrationClient type.
 */
@ServiceClientBuilder(
    serviceClients = { JobRouterAdministrationClient.class, JobRouterAdministrationAsyncClient.class })
public final class JobRouterAdministrationClientBuilder implements HttpTrait<JobRouterAdministrationClientBuilder>,
    ConfigurationTrait<JobRouterAdministrationClientBuilder>, EndpointTrait<JobRouterAdministrationClientBuilder>,
    TokenCredentialTrait<JobRouterAdministrationClientBuilder>,
    KeyCredentialTrait<JobRouterAdministrationClientBuilder>,
    ConnectionStringTrait<JobRouterAdministrationClientBuilder> {

    @Generated
    private static final String SDK_NAME = "name";

    @Generated
    private static final String SDK_VERSION = "version";

    @Generated
    private static final Map<String, String> PROPERTIES
        = CoreUtils.getProperties("azure-communication-jobrouter.properties");

    @Generated
    private final List<HttpPipelinePolicy> pipelinePolicies;

    private TokenCredential tokenCredential;

    private KeyCredential keyCredential;

    /**
     * Create an instance of the JobRouterAdministrationClientBuilder.
     */
    @Generated
    public JobRouterAdministrationClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated
    private HttpPipeline pipeline;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder pipeline(HttpPipeline pipeline) {
        if (this.pipeline != null && pipeline == null) {
            LOGGER.atInfo().log("HttpPipeline is being set to 'null' when it was previously configured.");
        }
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated
    private HttpClient httpClient;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated
    private HttpLogOptions httpLogOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated
    private ClientOptions clientOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated
    private RetryOptions retryOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null.");
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated
    private Configuration configuration;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The service endpoint
     */
    @Generated
    private String endpoint;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public JobRouterAdministrationClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Service version
     */
    @Generated
    private JobRouterServiceVersion serviceVersion;

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the JobRouterAdministrationClientBuilder.
     */
    @Generated
    public JobRouterAdministrationClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of JobRouterAdministrationClientImpl with the provided parameters.
     *
     * @return an instance of JobRouterAdministrationClientImpl.
     */
    @Generated
    private JobRouterAdministrationClientImpl buildInnerClient() {
        this.validateClient();
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        JobRouterServiceVersion localServiceVersion
            = (serviceVersion != null) ? serviceVersion : JobRouterServiceVersion.getLatest();
        JobRouterAdministrationClientImpl client = new JobRouterAdministrationClientImpl(localPipeline,
            JacksonAdapter.createDefaultSerializerAdapter(), this.endpoint, localServiceVersion);
        return client;
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration
            = (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpLogOptions localHttpLogOptions = this.httpLogOptions == null ? new HttpLogOptions() : this.httpLogOptions;
        ClientOptions localClientOptions = this.clientOptions == null ? new ClientOptions() : this.clientOptions;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(localClientOptions, localHttpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = new HttpHeaders();
        localClientOptions.getHeaders()
            .forEach(header -> headers.set(HttpHeaderName.fromString(header.getName()), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        policies.add(createHttpPipelineAuthPolicy());
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(localHttpLogOptions));
        HttpPipeline httpPipeline = new HttpPipelineBuilder().policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .clientOptions(localClientOptions)
            .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of JobRouterAdministrationAsyncClient class.
     *
     * @return an instance of JobRouterAdministrationAsyncClient.
     */
    @Generated
    public JobRouterAdministrationAsyncClient buildAsyncClient() {
        return new JobRouterAdministrationAsyncClient(buildInnerClient());
    }

    /**
     * Builds an instance of JobRouterAdministrationClient class.
     *
     * @return an instance of JobRouterAdministrationClient.
     */
    @Generated
    public JobRouterAdministrationClient buildClient() {
        return new JobRouterAdministrationClient(buildInnerClient());
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobRouterAdministrationClientBuilder.class);

    /**
     * Sets the {@link TokenCredential} used to authorize requests sent to the service. Refer to the Azure SDK for Java
     * <a href="https://aka.ms/azsdk/java/docs/identity">identity and authentication</a>
     * documentation for more details on proper usage of the {@link TokenCredential} type.
     *
     * @param tokenCredential {@link TokenCredential} used to authorize requests sent to the service.
     * @return Updated {@link JobRouterClientBuilder} object.
     * @throws NullPointerException If {@code tokenCredential} is null.
     */
    public JobRouterAdministrationClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = Objects.requireNonNull(tokenCredential, "'tokenCredential' cannot be null.");
        return this;
    }

    /**
     * Set a key credential for authorization
     *
     * @param credential valid credential as a string
     * @return the updated RouterAdministrationClientBuilder object
     */
    public JobRouterAdministrationClientBuilder credential(KeyCredential credential) {
        this.keyCredential = Objects.requireNonNull(credential, "'credential' cannot be null.");
        return this;
    }

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the JobRouterAdministrationClientBuilder.
     */
    @Generated
    public JobRouterAdministrationClientBuilder serviceVersion(JobRouterServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * Set a connection string for authorization.
     *
     * @param connectionString valid connectionString as a string.
     * @return the updated JobRouterAdministrationClientBuilder object.
     */
    public JobRouterAdministrationClientBuilder connectionString(String connectionString) {
        CommunicationConnectionString connection = new CommunicationConnectionString(connectionString);
        this.credential(new AzureKeyCredential(connection.getAccessKey()));
        this.endpoint(connection.getEndpoint());
        return this;
    }

    private HttpPipelinePolicy createHttpPipelineAuthPolicy() {
        if (this.tokenCredential != null) {
            return new BearerTokenAuthenticationPolicy(this.tokenCredential,
                "https://communication.azure.com/.default");
        } else if (this.keyCredential != null) {
            return new HmacAuthenticationPolicy(new AzureKeyCredential(this.keyCredential.getKey()));
        } else {
            throw LOGGER.logExceptionAsError(
                new IllegalStateException("Missing credential information while building a client."));
        }
    }

    @Generated
    private void validateClient() {
        // This method is invoked from 'buildInnerClient'/'buildClient' method.
        // Developer can customize this method, to validate that the necessary conditions are met for the new client.
        Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");
    }
}
