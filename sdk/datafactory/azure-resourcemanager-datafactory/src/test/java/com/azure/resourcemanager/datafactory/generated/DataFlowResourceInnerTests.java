// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DataFlowResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"type\":\"DataFlow\",\"description\":\"aeranokqgukkjqnv\",\"annotations\":[\"dataylaxxulcdi\",\"datadosfjbjsvgjrw\"],\"folder\":{\"name\":\"vyc\"}},\"name\":\"dclxgc\",\"type\":\"nfnw\",\"etag\":\"tmvpdvjdhtt\",\"id\":\"efedxihchrphkm\"}")
            .toObject(DataFlowResourceInner.class);
        Assertions.assertEquals("efedxihchrphkm", model.id());
        Assertions.assertEquals("aeranokqgukkjqnv", model.properties().description());
        Assertions.assertEquals("vyc", model.properties().folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowResourceInner model = new DataFlowResourceInner().withId("efedxihchrphkm")
            .withProperties(new DataFlow().withDescription("aeranokqgukkjqnv")
                .withAnnotations(Arrays.asList("dataylaxxulcdi", "datadosfjbjsvgjrw"))
                .withFolder(new DataFlowFolder().withName("vyc")));
        model = BinaryData.fromObject(model).toObject(DataFlowResourceInner.class);
        Assertions.assertEquals("efedxihchrphkm", model.id());
        Assertions.assertEquals("aeranokqgukkjqnv", model.properties().description());
        Assertions.assertEquals("vyc", model.properties().folder().name());
    }
}
