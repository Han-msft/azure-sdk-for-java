// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PublicIpPrefixes GetByResourceGroup.
 */
public final class PublicIpPrefixesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/PublicIpPrefixGet.json
     */
    /**
     * Sample code: Get public IP prefix.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPublicIPPrefix(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getPublicIpPrefixes()
            .getByResourceGroupWithResponse("rg1", "test-ipprefix", null, com.azure.core.util.Context.NONE);
    }
}
