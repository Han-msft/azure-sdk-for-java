// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

/**
 * Samples for Connector Delete.
 */
public final class ConnectorDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2024-07-01-preview/examples/
     * DeleteConnector.json
     */
    /**
     * Sample code: DeleteConnector.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void deleteConnector(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.connectors()
            .delete("00000000-0000-0000-0000-000000000000", "test-rg", "westus", "connectorName",
                com.azure.core.util.Context.NONE);
    }
}
