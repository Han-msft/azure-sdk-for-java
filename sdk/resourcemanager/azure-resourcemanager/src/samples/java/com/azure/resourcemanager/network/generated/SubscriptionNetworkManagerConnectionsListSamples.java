// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for SubscriptionNetworkManagerConnections List.
 */
public final class SubscriptionNetworkManagerConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * NetworkManagerConnectionSubscriptionList.json
     */
    /**
     * Sample code: List Subscription Network Manager Connection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSubscriptionNetworkManagerConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .list(null, null, com.azure.core.util.Context.NONE);
    }
}
