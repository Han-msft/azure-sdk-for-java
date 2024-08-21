// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisParameter;
import org.junit.jupiter.api.Assertions;

public final class SsisParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisParameter model = BinaryData.fromString(
            "{\"id\":8967425448877390786,\"name\":\"rwqtb\",\"description\":\"sdta\",\"dataType\":\"y\",\"required\":true,\"sensitive\":false,\"designDefaultValue\":\"omywlypghh\",\"defaultValue\":\"u\",\"sensitiveDefaultValue\":\"fvg\",\"valueType\":\"wgiqmb\",\"valueSet\":true,\"variable\":\"mbuihtqfvyq\"}")
            .toObject(SsisParameter.class);
        Assertions.assertEquals(8967425448877390786L, model.id());
        Assertions.assertEquals("rwqtb", model.name());
        Assertions.assertEquals("sdta", model.description());
        Assertions.assertEquals("y", model.dataType());
        Assertions.assertEquals(true, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("omywlypghh", model.designDefaultValue());
        Assertions.assertEquals("u", model.defaultValue());
        Assertions.assertEquals("fvg", model.sensitiveDefaultValue());
        Assertions.assertEquals("wgiqmb", model.valueType());
        Assertions.assertEquals(true, model.valueSet());
        Assertions.assertEquals("mbuihtqfvyq", model.variable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisParameter model = new SsisParameter().withId(8967425448877390786L)
            .withName("rwqtb")
            .withDescription("sdta")
            .withDataType("y")
            .withRequired(true)
            .withSensitive(false)
            .withDesignDefaultValue("omywlypghh")
            .withDefaultValue("u")
            .withSensitiveDefaultValue("fvg")
            .withValueType("wgiqmb")
            .withValueSet(true)
            .withVariable("mbuihtqfvyq");
        model = BinaryData.fromObject(model).toObject(SsisParameter.class);
        Assertions.assertEquals(8967425448877390786L, model.id());
        Assertions.assertEquals("rwqtb", model.name());
        Assertions.assertEquals("sdta", model.description());
        Assertions.assertEquals("y", model.dataType());
        Assertions.assertEquals(true, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("omywlypghh", model.designDefaultValue());
        Assertions.assertEquals("u", model.defaultValue());
        Assertions.assertEquals("fvg", model.sensitiveDefaultValue());
        Assertions.assertEquals("wgiqmb", model.valueType());
        Assertions.assertEquals(true, model.valueSet());
        Assertions.assertEquals("mbuihtqfvyq", model.variable());
    }
}
