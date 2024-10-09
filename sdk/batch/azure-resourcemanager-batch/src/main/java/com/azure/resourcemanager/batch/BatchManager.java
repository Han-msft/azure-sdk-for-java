// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.fluent.BatchManagementClient;
import com.azure.resourcemanager.batch.implementation.ApplicationPackagesImpl;
import com.azure.resourcemanager.batch.implementation.ApplicationsImpl;
import com.azure.resourcemanager.batch.implementation.BatchAccountsImpl;
import com.azure.resourcemanager.batch.implementation.BatchManagementClientBuilder;
import com.azure.resourcemanager.batch.implementation.CertificatesImpl;
import com.azure.resourcemanager.batch.implementation.LocationsImpl;
import com.azure.resourcemanager.batch.implementation.NetworkSecurityPerimetersImpl;
import com.azure.resourcemanager.batch.implementation.OperationsImpl;
import com.azure.resourcemanager.batch.implementation.PoolsImpl;
import com.azure.resourcemanager.batch.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.batch.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.batch.models.ApplicationPackages;
import com.azure.resourcemanager.batch.models.Applications;
import com.azure.resourcemanager.batch.models.BatchAccounts;
import com.azure.resourcemanager.batch.models.Certificates;
import com.azure.resourcemanager.batch.models.Locations;
import com.azure.resourcemanager.batch.models.NetworkSecurityPerimeters;
import com.azure.resourcemanager.batch.models.Operations;
import com.azure.resourcemanager.batch.models.Pools;
import com.azure.resourcemanager.batch.models.PrivateEndpointConnections;
import com.azure.resourcemanager.batch.models.PrivateLinkResources;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to BatchManager.
 * Batch Client.
 */
public final class BatchManager {
    private BatchAccounts batchAccounts;

    private ApplicationPackages applicationPackages;

    private Applications applications;

    private Locations locations;

    private Operations operations;

    private Certificates certificates;

    private PrivateLinkResources privateLinkResources;

    private PrivateEndpointConnections privateEndpointConnections;

    private Pools pools;

    private NetworkSecurityPerimeters networkSecurityPerimeters;

    private final BatchManagementClient clientObject;

    private BatchManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new BatchManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of Batch service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Batch service API instance.
     */
    public static BatchManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of Batch service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the Batch service API instance.
     */
    public static BatchManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new BatchManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create BatchManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new BatchManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Batch service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Batch service API instance.
         */
        public BatchManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.batch")
                .append("/")
                .append("2.0.0");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new BatchManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of BatchAccounts. It manages BatchAccount.
     * 
     * @return Resource collection API of BatchAccounts.
     */
    public BatchAccounts batchAccounts() {
        if (this.batchAccounts == null) {
            this.batchAccounts = new BatchAccountsImpl(clientObject.getBatchAccounts(), this);
        }
        return batchAccounts;
    }

    /**
     * Gets the resource collection API of ApplicationPackages. It manages ApplicationPackage.
     * 
     * @return Resource collection API of ApplicationPackages.
     */
    public ApplicationPackages applicationPackages() {
        if (this.applicationPackages == null) {
            this.applicationPackages = new ApplicationPackagesImpl(clientObject.getApplicationPackages(), this);
        }
        return applicationPackages;
    }

    /**
     * Gets the resource collection API of Applications. It manages Application.
     * 
     * @return Resource collection API of Applications.
     */
    public Applications applications() {
        if (this.applications == null) {
            this.applications = new ApplicationsImpl(clientObject.getApplications(), this);
        }
        return applications;
    }

    /**
     * Gets the resource collection API of Locations.
     * 
     * @return Resource collection API of Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(clientObject.getLocations(), this);
        }
        return locations;
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of Certificates. It manages Certificate.
     * 
     * @return Resource collection API of Certificates.
     */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(clientObject.getCertificates(), this);
        }
        return certificates;
    }

    /**
     * Gets the resource collection API of PrivateLinkResources.
     * 
     * @return Resource collection API of PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /**
     * Gets the resource collection API of PrivateEndpointConnections.
     * 
     * @return Resource collection API of PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections
                = new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /**
     * Gets the resource collection API of Pools. It manages Pool.
     * 
     * @return Resource collection API of Pools.
     */
    public Pools pools() {
        if (this.pools == null) {
            this.pools = new PoolsImpl(clientObject.getPools(), this);
        }
        return pools;
    }

    /**
     * Gets the resource collection API of NetworkSecurityPerimeters.
     * 
     * @return Resource collection API of NetworkSecurityPerimeters.
     */
    public NetworkSecurityPerimeters networkSecurityPerimeters() {
        if (this.networkSecurityPerimeters == null) {
            this.networkSecurityPerimeters
                = new NetworkSecurityPerimetersImpl(clientObject.getNetworkSecurityPerimeters(), this);
        }
        return networkSecurityPerimeters;
    }

    /**
     * Gets wrapped service client BatchManagementClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client BatchManagementClient.
     */
    public BatchManagementClient serviceClient() {
        return this.clientObject;
    }
}
