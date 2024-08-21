// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

/**
 * Samples for Clusters GetGatewaySettings.
 */
public final class ClustersGetGatewaySettingsSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/preview/2024-08-01-preview/examples/
     * HDI_Clusters_GetGatewaySettings.json
     */
    /**
     * Sample code: Get HTTP settings.
     * 
     * @param manager Entry point to HDInsightManager.
     */
    public static void getHTTPSettings(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.clusters().getGatewaySettingsWithResponse("rg1", "cluster1", com.azure.core.util.Context.NONE);
    }
}
