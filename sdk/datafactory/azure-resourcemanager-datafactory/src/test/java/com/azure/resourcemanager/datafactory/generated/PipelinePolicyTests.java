// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PipelineElapsedTimeMetricPolicy;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;

public final class PipelinePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PipelinePolicy model = BinaryData.fromString("{\"elapsedTimeMetric\":{\"duration\":\"dataonfo\"}}")
            .toObject(PipelinePolicy.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PipelinePolicy model = new PipelinePolicy()
            .withElapsedTimeMetric(new PipelineElapsedTimeMetricPolicy().withDuration("dataonfo"));
        model = BinaryData.fromObject(model).toObject(PipelinePolicy.class);
    }
}
