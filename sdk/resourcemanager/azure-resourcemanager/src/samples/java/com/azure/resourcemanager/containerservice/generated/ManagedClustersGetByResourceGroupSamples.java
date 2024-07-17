// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for ManagedClusters GetByResourceGroup.
 */
public final class ManagedClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * ManagedClustersGet.json
     */
    /**
     * Sample code: Get Managed Cluster.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getManagedCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getManagedClusters()
            .getByResourceGroupWithResponse("rg1", "clustername1", com.azure.core.util.Context.NONE);
    }
}
