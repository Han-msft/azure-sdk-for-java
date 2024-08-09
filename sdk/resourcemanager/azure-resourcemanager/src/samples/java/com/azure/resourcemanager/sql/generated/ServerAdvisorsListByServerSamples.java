// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerAdvisors ListByServer.
 */
public final class ServerAdvisorsListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerAdvisorList.json
     */
    /**
     * Sample code: List of server advisors.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listOfServerAdvisors(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServerAdvisors()
            .listByServerWithResponse("workloadinsight-demos", "misosisvr", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerRecommendedActionListExpand.
     * json
     */
    /**
     * Sample code: List of server recommended actions for all advisors.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listOfServerRecommendedActionsForAllAdvisors(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServerAdvisors()
            .listByServerWithResponse("workloadinsight-demos", "misosisvr", "recommendedActions",
                com.azure.core.util.Context.NONE);
    }
}
