// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for IpFirewallRules ListByWorkspace. */
public final class IpFirewallRulesListByWorkspaceSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: List IP firewall rules in a workspace.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listIPFirewallRulesInAWorkspace(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.ipFirewallRules().listByWorkspace("ExampleResourceGroup", "ExampleWorkspace", Context.NONE);
    }
}
