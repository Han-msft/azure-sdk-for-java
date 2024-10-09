// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

/**
 * Samples for Connector GetDryrun.
 */
public final class ConnectorGetDryrunSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2024-07-01-preview/examples/
     * ConnectorDryrunGet.json
     */
    /**
     * Sample code: ConnectorDryrunGet.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void connectorDryrunGet(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.connectors()
            .getDryrunWithResponse("00000000-0000-0000-0000-000000000000", "test-rg", "westus", "dryrunName",
                com.azure.core.util.Context.NONE);
    }
}
