// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for OutboundFirewallRules CreateOrUpdate.
 */
public final class OutboundFirewallRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/OutboundFirewallRuleCreate.json
     */
    /**
     * Sample code: Approve or reject a outbound firewall rule with a given name.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        approveOrRejectAOutboundFirewallRuleWithAGivenName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getOutboundFirewallRules()
            .createOrUpdate("sqlcrudtest-7398", "sqlcrudtest-4645", "server.database.windows.net",
                com.azure.core.util.Context.NONE);
    }
}
