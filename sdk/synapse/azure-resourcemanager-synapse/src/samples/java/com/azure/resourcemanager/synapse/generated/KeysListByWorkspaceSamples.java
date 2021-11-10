// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for Keys ListByWorkspace. */
public final class KeysListByWorkspaceSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: List keys in workspace.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listKeysInWorkspace(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.keys().listByWorkspace("ExampleResourceGroup", "ExampleWorkspace", Context.NONE);
    }
}
