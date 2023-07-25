// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ApplicationGateways GetSslPredefinedPolicy. */
public final class ApplicationGatewaysGetSslPredefinedPolicySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/ApplicationGatewayAvailableSslOptionsPredefinedPolicyGet.json
     */
    /**
     * Sample code: Get Available Ssl Predefined Policy by name.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableSslPredefinedPolicyByName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getApplicationGateways()
            .getSslPredefinedPolicyWithResponse("AppGwSslPolicy20150501", com.azure.core.util.Context.NONE);
    }
}
