// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Delete private endpoint connection.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void deletePrivateEndpointConnection(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .privateEndpointConnections()
            .delete("ExampleResourceGroup", "ExampleWorkspace", "ExamplePrivateEndpointConnection", Context.NONE);
    }
}
