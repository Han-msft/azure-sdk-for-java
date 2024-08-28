// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for DevOpsInfrastructureClient class.
 */
public interface DevOpsInfrastructureClient {
    /**
     * Gets Service host.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Version parameter.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PoolsClient object to access its operations.
     * 
     * @return the PoolsClient object.
     */
    PoolsClient getPools();

    /**
     * Gets the ResourceDetailsClient object to access its operations.
     * 
     * @return the ResourceDetailsClient object.
     */
    ResourceDetailsClient getResourceDetails();

    /**
     * Gets the SkusClient object to access its operations.
     * 
     * @return the SkusClient object.
     */
    SkusClient getSkus();

    /**
     * Gets the SubscriptionUsagesClient object to access its operations.
     * 
     * @return the SubscriptionUsagesClient object.
     */
    SubscriptionUsagesClient getSubscriptionUsages();

    /**
     * Gets the ImageVersionsClient object to access its operations.
     * 
     * @return the ImageVersionsClient object.
     */
    ImageVersionsClient getImageVersions();
}
