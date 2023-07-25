// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for LocalNetworkGateways ListByResourceGroup. */
public final class LocalNetworkGatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/LocalNetworkGatewayList.json
     */
    /**
     * Sample code: ListLocalNetworkGateways.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listLocalNetworkGateways(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLocalNetworkGateways()
            .listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
