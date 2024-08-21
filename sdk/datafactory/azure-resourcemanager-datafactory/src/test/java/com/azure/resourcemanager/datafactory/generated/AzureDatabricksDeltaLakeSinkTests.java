// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeImportCommand;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeSink;

public final class AzureDatabricksDeltaLakeSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDatabricksDeltaLakeSink model = BinaryData.fromString(
            "{\"type\":\"AzureDatabricksDeltaLakeSink\",\"preCopyScript\":\"datadhr\",\"importSettings\":{\"type\":\"AzureDatabricksDeltaLakeImportCommand\",\"dateFormat\":\"datakstrmsbmdgrzke\",\"timestampFormat\":\"datalorntnssma\",\"\":{\"htbjyycacoelv\":\"datacdlnvupiscbz\",\"ry\":\"datayltmxqalq\",\"gdubwmalt\":\"datajwwoxanefellhdsg\"}},\"writeBatchSize\":\"databvuv\",\"writeBatchTimeout\":\"datapylphnaghglaxjm\",\"sinkRetryCount\":\"datam\",\"sinkRetryWait\":\"dataloqatswvt\",\"maxConcurrentConnections\":\"datapicwnbtvlrs\",\"disableMetricsCollection\":\"datatrmodknxerkaiik\",\"\":{\"qrkeyh\":\"dataaqx\"}}")
            .toObject(AzureDatabricksDeltaLakeSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDatabricksDeltaLakeSink model = new AzureDatabricksDeltaLakeSink().withWriteBatchSize("databvuv")
            .withWriteBatchTimeout("datapylphnaghglaxjm")
            .withSinkRetryCount("datam")
            .withSinkRetryWait("dataloqatswvt")
            .withMaxConcurrentConnections("datapicwnbtvlrs")
            .withDisableMetricsCollection("datatrmodknxerkaiik")
            .withPreCopyScript("datadhr")
            .withImportSettings(new AzureDatabricksDeltaLakeImportCommand().withDateFormat("datakstrmsbmdgrzke")
                .withTimestampFormat("datalorntnssma"));
        model = BinaryData.fromObject(model).toObject(AzureDatabricksDeltaLakeSink.class);
    }
}
