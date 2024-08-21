// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.EnvironmentVariableSetup;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentVariableSetupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentVariableSetup model = BinaryData.fromString(
            "{\"type\":\"EnvironmentVariableSetup\",\"typeProperties\":{\"variableName\":\"odbl\",\"variableValue\":\"pqr\"}}")
            .toObject(EnvironmentVariableSetup.class);
        Assertions.assertEquals("odbl", model.variableName());
        Assertions.assertEquals("pqr", model.variableValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentVariableSetup model
            = new EnvironmentVariableSetup().withVariableName("odbl").withVariableValue("pqr");
        model = BinaryData.fromObject(model).toObject(EnvironmentVariableSetup.class);
        Assertions.assertEquals("odbl", model.variableName());
        Assertions.assertEquals("pqr", model.variableValue());
    }
}
