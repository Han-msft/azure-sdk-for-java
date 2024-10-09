// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkGroups Delete.
 */
public final class NetworkGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/NetworkManagerGroupDelete.
     * json
     */
    /**
     * Sample code: NetworkGroupsDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkGroupsDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkGroups()
            .delete("rg1", "testNetworkManager", "testNetworkGroup", false, com.azure.core.util.Context.NONE);
    }
}
