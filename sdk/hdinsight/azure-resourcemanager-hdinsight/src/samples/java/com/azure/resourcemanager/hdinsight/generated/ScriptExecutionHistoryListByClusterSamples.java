// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

/**
 * Samples for ScriptExecutionHistory ListByCluster.
 */
public final class ScriptExecutionHistoryListByClusterSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/preview/2024-08-01-preview/examples/
     * GetScriptExecutionHistory.json
     */
    /**
     * Sample code: Get Script Execution History List.
     * 
     * @param manager Entry point to HDInsightManager.
     */
    public static void getScriptExecutionHistoryList(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.scriptExecutionHistories().listByCluster("rg1", "cluster1", com.azure.core.util.Context.NONE);
    }
}
