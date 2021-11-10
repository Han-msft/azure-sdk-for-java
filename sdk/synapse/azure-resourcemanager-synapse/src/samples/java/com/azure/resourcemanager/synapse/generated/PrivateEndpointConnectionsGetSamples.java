// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Get private endpoint connection.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getPrivateEndpointConnection(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse(
                "ExampleResourceGroup", "ExampleWorkspace", "ExamplePrivateEndpointConnection", Context.NONE);
    }
}
