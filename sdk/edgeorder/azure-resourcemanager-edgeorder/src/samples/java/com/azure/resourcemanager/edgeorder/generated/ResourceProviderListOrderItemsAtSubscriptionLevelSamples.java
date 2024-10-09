// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.generated;

/**
 * Samples for ResourceProvider ListOrderItemsAtSubscriptionLevel.
 */
public final class ResourceProviderListOrderItemsAtSubscriptionLevelSamples {
    /*
     * x-ms-original-file: specification/edgeorder/resource-manager/Microsoft.EdgeOrder/stable/2021-12-01/examples/
     * ListOrderItemsAtSubscriptionLevel.json
     */
    /**
     * Sample code: ListOrderItemsAtSubscriptionLevel.
     * 
     * @param manager Entry point to EdgeOrderManager.
     */
    public static void listOrderItemsAtSubscriptionLevel(com.azure.resourcemanager.edgeorder.EdgeOrderManager manager) {
        manager.resourceProviders()
            .listOrderItemsAtSubscriptionLevel(null, null, null, com.azure.core.util.Context.NONE);
    }
}
