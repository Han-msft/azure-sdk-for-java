// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SqlPoolSensitivityLabels DisableRecommendation. */
public final class SqlPoolSensitivityLabelsDisableRecommendationSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Disables sensitivity recommendations on a given column.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void disablesSensitivityRecommendationsOnAGivenColumn(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolSensitivityLabels()
            .disableRecommendationWithResponse(
                "myRG", "myServer", "myDatabase", "dbo", "myTable", "myColumn", Context.NONE);
    }
}
