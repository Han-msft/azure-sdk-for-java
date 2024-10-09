// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for LoadBalancers List.
 */
public final class LoadBalancersListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/LoadBalancerListAll.json
     */
    /**
     * Sample code: List all load balancers.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllLoadBalancers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getLoadBalancers().list(com.azure.core.util.Context.NONE);
    }
}
