// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computeschedule.models.ExecuteDeallocateRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExecuteDeallocateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExecuteDeallocateRequest model = BinaryData.fromString(
            "{\"executionParameters\":{\"optimizationPreference\":\"Cost\",\"retryPolicy\":{\"retryCount\":1070346714,\"retryWindowInMinutes\":890604952}},\"resources\":{\"ids\":[\"cqvkocrcjdkwtn\",\"xbnjbiksq\",\"gls\"]},\"correlationid\":\"ainqpjwnzlljfm\"}")
            .toObject(ExecuteDeallocateRequest.class);
        Assertions.assertEquals(OptimizationPreference.COST, model.executionParameters().optimizationPreference());
        Assertions.assertEquals(1070346714, model.executionParameters().retryPolicy().retryCount());
        Assertions.assertEquals(890604952, model.executionParameters().retryPolicy().retryWindowInMinutes());
        Assertions.assertEquals("cqvkocrcjdkwtn", model.resources().ids().get(0));
        Assertions.assertEquals("ainqpjwnzlljfm", model.correlationid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExecuteDeallocateRequest model = new ExecuteDeallocateRequest()
            .withExecutionParameters(new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                .withRetryPolicy(new RetryPolicy().withRetryCount(1070346714).withRetryWindowInMinutes(890604952)))
            .withResources(new Resources().withIds(Arrays.asList("cqvkocrcjdkwtn", "xbnjbiksq", "gls")))
            .withCorrelationid("ainqpjwnzlljfm");
        model = BinaryData.fromObject(model).toObject(ExecuteDeallocateRequest.class);
        Assertions.assertEquals(OptimizationPreference.COST, model.executionParameters().optimizationPreference());
        Assertions.assertEquals(1070346714, model.executionParameters().retryPolicy().retryCount());
        Assertions.assertEquals(890604952, model.executionParameters().retryPolicy().retryWindowInMinutes());
        Assertions.assertEquals("cqvkocrcjdkwtn", model.resources().ids().get(0));
        Assertions.assertEquals("ainqpjwnzlljfm", model.correlationid());
    }
}
