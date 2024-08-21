// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DistcpSettings;

public final class DistcpSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DistcpSettings model = BinaryData.fromString(
            "{\"resourceManagerEndpoint\":\"dataqkmihggvyhqwyxba\",\"tempScriptPath\":\"datarviynlslgxifkds\",\"distcpOptions\":\"dataqwkddgep\"}")
            .toObject(DistcpSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DistcpSettings model = new DistcpSettings().withResourceManagerEndpoint("dataqkmihggvyhqwyxba")
            .withTempScriptPath("datarviynlslgxifkds")
            .withDistcpOptions("dataqwkddgep");
        model = BinaryData.fromObject(model).toObject(DistcpSettings.class);
    }
}
