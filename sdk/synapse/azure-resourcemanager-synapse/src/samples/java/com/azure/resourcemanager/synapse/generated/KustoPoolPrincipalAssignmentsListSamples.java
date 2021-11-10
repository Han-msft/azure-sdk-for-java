// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoPoolPrincipalAssignments List. */
public final class KustoPoolPrincipalAssignmentsListSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: KustoPoolPrincipalAssignmentsList.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolPrincipalAssignmentsList(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolPrincipalAssignments()
            .list("synapseWorkspaceName", "kustoclusterrptest4", "kustorptest", Context.NONE);
    }
}
