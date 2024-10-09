// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkInterfaces ListCloudServiceRoleInstanceNetworkInterfaces.
 */
public final class NetworkInterfacesListCloudServiceRoleInstanceNetworkInterfacesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * CloudServiceRoleInstanceNetworkInterfaceList.json
     */
    /**
     * Sample code: List cloud service role instance network interfaces.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listCloudServiceRoleInstanceNetworkInterfaces(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaces()
            .listCloudServiceRoleInstanceNetworkInterfaces("rg1", "cs1", "TestVMRole_IN_0",
                com.azure.core.util.Context.NONE);
    }
}
