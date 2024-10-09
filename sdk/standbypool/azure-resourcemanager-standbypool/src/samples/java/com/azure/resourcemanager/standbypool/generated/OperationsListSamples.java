// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-03-01/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void operationsList(com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
