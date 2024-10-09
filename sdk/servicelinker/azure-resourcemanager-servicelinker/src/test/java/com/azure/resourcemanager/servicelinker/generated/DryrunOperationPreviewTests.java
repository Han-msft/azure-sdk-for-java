// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicelinker.models.DryrunOperationPreview;
import com.azure.resourcemanager.servicelinker.models.DryrunPreviewOperationType;
import org.junit.jupiter.api.Assertions;

public final class DryrunOperationPreviewTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DryrunOperationPreview model = BinaryData.fromString(
            "{\"name\":\"lgphu\",\"operationType\":\"configConnection\",\"description\":\"dvkaozw\",\"action\":\"ftyhxhurokf\",\"scope\":\"xolniwpwcukjfk\"}")
            .toObject(DryrunOperationPreview.class);
        Assertions.assertEquals("lgphu", model.name());
        Assertions.assertEquals(DryrunPreviewOperationType.CONFIG_CONNECTION, model.operationType());
        Assertions.assertEquals("dvkaozw", model.description());
        Assertions.assertEquals("ftyhxhurokf", model.action());
        Assertions.assertEquals("xolniwpwcukjfk", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DryrunOperationPreview model = new DryrunOperationPreview().withName("lgphu")
            .withOperationType(DryrunPreviewOperationType.CONFIG_CONNECTION)
            .withDescription("dvkaozw")
            .withAction("ftyhxhurokf")
            .withScope("xolniwpwcukjfk");
        model = BinaryData.fromObject(model).toObject(DryrunOperationPreview.class);
        Assertions.assertEquals("lgphu", model.name());
        Assertions.assertEquals(DryrunPreviewOperationType.CONFIG_CONNECTION, model.operationType());
        Assertions.assertEquals("dvkaozw", model.description());
        Assertions.assertEquals("ftyhxhurokf", model.action());
        Assertions.assertEquals("xolniwpwcukjfk", model.scope());
    }
}
