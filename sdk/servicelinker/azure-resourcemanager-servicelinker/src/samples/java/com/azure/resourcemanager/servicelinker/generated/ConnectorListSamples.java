// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

/**
 * Samples for Connector List.
 */
public final class ConnectorListSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2024-07-01-preview/examples/
     * ConnectorList.json
     */
    /**
     * Sample code: ConnectorList.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void connectorList(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.connectors()
            .list("00000000-0000-0000-0000-000000000000", "test-rg", "westus", com.azure.core.util.Context.NONE);
    }
}
