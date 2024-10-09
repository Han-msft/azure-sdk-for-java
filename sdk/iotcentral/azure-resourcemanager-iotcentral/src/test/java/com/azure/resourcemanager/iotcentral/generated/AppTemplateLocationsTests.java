// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotcentral.models.AppTemplateLocations;

public final class AppTemplateLocationsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AppTemplateLocations model
            = BinaryData.fromString("{\"id\":\"walm\",\"displayName\":\"yoxa\"}").toObject(AppTemplateLocations.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AppTemplateLocations model = new AppTemplateLocations();
        model = BinaryData.fromObject(model).toObject(AppTemplateLocations.class);
    }
}
