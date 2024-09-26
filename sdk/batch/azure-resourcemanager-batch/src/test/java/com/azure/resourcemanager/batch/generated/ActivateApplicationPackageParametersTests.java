// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.ActivateApplicationPackageParameters;
import org.junit.jupiter.api.Assertions;

public final class ActivateApplicationPackageParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActivateApplicationPackageParameters model
            = BinaryData.fromString("{\"format\":\"ugpbkw\"}").toObject(ActivateApplicationPackageParameters.class);
        Assertions.assertEquals("ugpbkw", model.format());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActivateApplicationPackageParameters model = new ActivateApplicationPackageParameters().withFormat("ugpbkw");
        model = BinaryData.fromObject(model).toObject(ActivateApplicationPackageParameters.class);
        Assertions.assertEquals("ugpbkw", model.format());
    }
}
