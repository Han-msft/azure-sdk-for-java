// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.network.models.TransportProtocol;

/**
 * Samples for InboundNatRules CreateOrUpdate.
 */
public final class InboundNatRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/InboundNatRuleCreate.json
     */
    /**
     * Sample code: InboundNatRuleCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void inboundNatRuleCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getInboundNatRules()
            .createOrUpdate("testrg", "lb1", "natRule1.1",
                new InboundNatRuleInner().withFrontendIpConfiguration(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/testrg/providers/Microsoft.Network/loadBalancers/lb1/frontendIPConfigurations/ip1"))
                    .withProtocol(TransportProtocol.TCP)
                    .withFrontendPort(3390)
                    .withBackendPort(3389)
                    .withIdleTimeoutInMinutes(4)
                    .withEnableFloatingIp(false)
                    .withEnableTcpReset(false),
                com.azure.core.util.Context.NONE);
    }
}
