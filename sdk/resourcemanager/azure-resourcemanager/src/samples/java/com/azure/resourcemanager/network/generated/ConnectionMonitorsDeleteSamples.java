// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ConnectionMonitors Delete.
 */
public final class ConnectionMonitorsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * NetworkWatcherConnectionMonitorDelete.json
     */
    /**
     * Sample code: Delete connection monitor.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteConnectionMonitor(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getConnectionMonitors()
            .delete("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
