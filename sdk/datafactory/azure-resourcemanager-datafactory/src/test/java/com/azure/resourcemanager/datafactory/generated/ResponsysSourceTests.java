// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ResponsysSource;

public final class ResponsysSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResponsysSource model = BinaryData.fromString(
            "{\"type\":\"ResponsysSource\",\"query\":\"datayjzferhxgstiawy\",\"queryTimeout\":\"datapqxujxbd\",\"additionalColumns\":\"datazplmlj\",\"sourceRetryCount\":\"datas\",\"sourceRetryWait\":\"datawsftytpjmu\",\"maxConcurrentConnections\":\"dataynhqlzantahuy\",\"disableMetricsCollection\":\"datasjympsxmoad\",\"\":{\"jvlzqsyvr\":\"datansmpfe\",\"bobx\":\"dataoleqikcorkem\"}}")
            .toObject(ResponsysSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResponsysSource model = new ResponsysSource().withSourceRetryCount("datas")
            .withSourceRetryWait("datawsftytpjmu")
            .withMaxConcurrentConnections("dataynhqlzantahuy")
            .withDisableMetricsCollection("datasjympsxmoad")
            .withQueryTimeout("datapqxujxbd")
            .withAdditionalColumns("datazplmlj")
            .withQuery("datayjzferhxgstiawy");
        model = BinaryData.fromObject(model).toObject(ResponsysSource.class);
    }
}
