// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

/**
 * Samples for Clusters GetAzureAsyncOperationStatus.
 */
public final class ClustersGetAzureAsyncOperationStatusSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/preview/2024-08-01-preview/examples/
     * GetClusterCreatingAsyncOperationStatus.json
     */
    /**
     * Sample code: Get Async Operation Status of Creating Cluster.
     * 
     * @param manager Entry point to HDInsightManager.
     */
    public static void
        getAsyncOperationStatusOfCreatingCluster(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.clusters()
            .getAzureAsyncOperationStatusWithResponse("rg1", "cluster1", "CF938302-6B4D-44A0-A6D2-C0D67E847AEC",
                com.azure.core.util.Context.NONE);
    }
}
