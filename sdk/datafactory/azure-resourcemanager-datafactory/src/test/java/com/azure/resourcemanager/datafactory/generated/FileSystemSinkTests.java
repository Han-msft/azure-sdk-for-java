// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileSystemSink;

public final class FileSystemSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileSystemSink model = BinaryData.fromString(
            "{\"type\":\"FileSystemSink\",\"copyBehavior\":\"datalvdenhguvaimko\",\"writeBatchSize\":\"datappsnljduwkb\",\"writeBatchTimeout\":\"datalmrhn\",\"sinkRetryCount\":\"datavlvdjxbjqiab\",\"sinkRetryWait\":\"dataevvowiypyljzkx\",\"maxConcurrentConnections\":\"datafyv\",\"disableMetricsCollection\":\"dataftaq\",\"\":{\"xewemtazmrejz\":\"datarjlhmney\"}}")
            .toObject(FileSystemSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileSystemSink model = new FileSystemSink().withWriteBatchSize("datappsnljduwkb")
            .withWriteBatchTimeout("datalmrhn")
            .withSinkRetryCount("datavlvdjxbjqiab")
            .withSinkRetryWait("dataevvowiypyljzkx")
            .withMaxConcurrentConnections("datafyv")
            .withDisableMetricsCollection("dataftaq")
            .withCopyBehavior("datalvdenhguvaimko");
        model = BinaryData.fromObject(model).toObject(FileSystemSink.class);
    }
}
