// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for DdosCustomPolicies Delete.
 */
public final class DdosCustomPoliciesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/DdosCustomPolicyDelete.json
     */
    /**
     * Sample code: Delete DDoS custom policy.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteDDoSCustomPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getDdosCustomPolicies()
            .delete("rg1", "test-ddos-custom-policy", com.azure.core.util.Context.NONE);
    }
}
