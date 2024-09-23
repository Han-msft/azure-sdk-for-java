// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fabric.fluent.models.OperationInner;
import com.azure.resourcemanager.fabric.models.ActionType;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model = BinaryData.fromString(
            "{\"name\":\"uhmuouqfprwzwbn\",\"isDataAction\":true,\"display\":{\"provider\":\"wu\",\"resource\":\"gazxuf\",\"operation\":\"uckyf\",\"description\":\"rfidfvzwdz\"},\"origin\":\"system\",\"actionType\":\"Internal\"}")
            .toObject(OperationInner.class);
        Assertions.assertEquals(ActionType.INTERNAL, model.actionType());
    }
}
