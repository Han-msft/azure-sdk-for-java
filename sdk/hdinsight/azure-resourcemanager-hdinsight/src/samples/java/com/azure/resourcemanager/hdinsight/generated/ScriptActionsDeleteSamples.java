// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

/**
 * Samples for ScriptActions Delete.
 */
public final class ScriptActionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/preview/2024-08-01-preview/examples/
     * DeleteScriptAction.json
     */
    /**
     * Sample code: Delete a script action on HDInsight cluster.
     * 
     * @param manager Entry point to HDInsightManager.
     */
    public static void
        deleteAScriptActionOnHDInsightCluster(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.scriptActions().deleteWithResponse("rg1", "cluster1", "scriptName", com.azure.core.util.Context.NONE);
    }
}
