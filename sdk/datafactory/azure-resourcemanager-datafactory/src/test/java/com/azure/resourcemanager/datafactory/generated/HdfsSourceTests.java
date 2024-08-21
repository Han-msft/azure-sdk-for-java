// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DistcpSettings;
import com.azure.resourcemanager.datafactory.models.HdfsSource;

public final class HdfsSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HdfsSource model = BinaryData.fromString(
            "{\"type\":\"HdfsSource\",\"recursive\":\"datadrvkbcsvnnvk\",\"distcpSettings\":{\"resourceManagerEndpoint\":\"datazldzzjj\",\"tempScriptPath\":\"datazhj\",\"distcpOptions\":\"datangopdvnzndliodaj\"},\"sourceRetryCount\":\"dataszdyv\",\"sourceRetryWait\":\"dataiufbw\",\"maxConcurrentConnections\":\"dataawh\",\"disableMetricsCollection\":\"datah\",\"\":{\"kqajia\":\"dataeedbhnklesvzdv\"}}")
            .toObject(HdfsSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HdfsSource model = new HdfsSource().withSourceRetryCount("dataszdyv")
            .withSourceRetryWait("dataiufbw")
            .withMaxConcurrentConnections("dataawh")
            .withDisableMetricsCollection("datah")
            .withRecursive("datadrvkbcsvnnvk")
            .withDistcpSettings(new DistcpSettings().withResourceManagerEndpoint("datazldzzjj")
                .withTempScriptPath("datazhj")
                .withDistcpOptions("datangopdvnzndliodaj"));
        model = BinaryData.fromObject(model).toObject(HdfsSource.class);
    }
}
