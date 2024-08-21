// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GreenplumSource;

public final class GreenplumSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GreenplumSource model = BinaryData.fromString(
            "{\"type\":\"GreenplumSource\",\"query\":\"datahndfpf\",\"queryTimeout\":\"datafdgf\",\"additionalColumns\":\"dataoeh\",\"sourceRetryCount\":\"datapkssjbw\",\"sourceRetryWait\":\"dataxdgcfcfky\",\"maxConcurrentConnections\":\"datajwxhslrbwwk\",\"disableMetricsCollection\":\"datawodhsodofsxjiky\",\"\":{\"cxdmxhuwldfa\":\"datauhuixqwogg\",\"dkbgsg\":\"datakyft\",\"ayqkg\":\"datapyckmncrutoudjm\"}}")
            .toObject(GreenplumSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GreenplumSource model = new GreenplumSource().withSourceRetryCount("datapkssjbw")
            .withSourceRetryWait("dataxdgcfcfky")
            .withMaxConcurrentConnections("datajwxhslrbwwk")
            .withDisableMetricsCollection("datawodhsodofsxjiky")
            .withQueryTimeout("datafdgf")
            .withAdditionalColumns("dataoeh")
            .withQuery("datahndfpf");
        model = BinaryData.fromObject(model).toObject(GreenplumSource.class);
    }
}
