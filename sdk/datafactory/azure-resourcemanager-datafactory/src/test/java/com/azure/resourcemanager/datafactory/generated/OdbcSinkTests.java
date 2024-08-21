// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OdbcSink;

public final class OdbcSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OdbcSink model = BinaryData.fromString(
            "{\"type\":\"OdbcSink\",\"preCopyScript\":\"datadbe\",\"writeBatchSize\":\"datajhfszmxposmqsc\",\"writeBatchTimeout\":\"datauldkpdle\",\"sinkRetryCount\":\"dataljujpsubxggknmvk\",\"sinkRetryWait\":\"dataqoqyrcpsjeazz\",\"maxConcurrentConnections\":\"datacsbkmaluchbfrtaj\",\"disableMetricsCollection\":\"dataddyqdxpnzpuk\",\"\":{\"yxauw\":\"dataggitxsyufexivh\",\"xazywijb\":\"datakqofrkfccqjenzl\",\"flxdwliitaieledm\":\"dataqaeyjozbd\"}}")
            .toObject(OdbcSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OdbcSink model = new OdbcSink().withWriteBatchSize("datajhfszmxposmqsc")
            .withWriteBatchTimeout("datauldkpdle")
            .withSinkRetryCount("dataljujpsubxggknmvk")
            .withSinkRetryWait("dataqoqyrcpsjeazz")
            .withMaxConcurrentConnections("datacsbkmaluchbfrtaj")
            .withDisableMetricsCollection("dataddyqdxpnzpuk")
            .withPreCopyScript("datadbe");
        model = BinaryData.fromObject(model).toObject(OdbcSink.class);
    }
}
