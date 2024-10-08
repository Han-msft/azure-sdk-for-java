// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BlobSink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class BlobSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobSink model = BinaryData.fromString(
            "{\"type\":\"BlobSink\",\"blobWriterOverwriteFiles\":\"datayxtxerxttobosjx\",\"blobWriterDateTimeFormat\":\"dataytten\",\"blobWriterAddHeader\":\"dataditumyycvtya\",\"copyBehavior\":\"datayimhspjqhi\",\"metadata\":[{\"name\":\"dataqvwhjgtbhre\",\"value\":\"datatq\"},{\"name\":\"datapbtqibq\",\"value\":\"dataugcwzgdfdrdxo\"},{\"name\":\"datakgezulnntpbarej\",\"value\":\"datahlxoljbpoeoywykh\"}],\"writeBatchSize\":\"datavwhrivvzr\",\"writeBatchTimeout\":\"datayfrxlsypwu\",\"sinkRetryCount\":\"dataearbbxan\",\"sinkRetryWait\":\"dataiqkjupvidzh\",\"maxConcurrentConnections\":\"datappqcgbp\",\"disableMetricsCollection\":\"datani\",\"\":{\"arjbakpasuugcng\":\"datadlxuptbtl\"}}")
            .toObject(BlobSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobSink model = new BlobSink().withWriteBatchSize("datavwhrivvzr")
            .withWriteBatchTimeout("datayfrxlsypwu")
            .withSinkRetryCount("dataearbbxan")
            .withSinkRetryWait("dataiqkjupvidzh")
            .withMaxConcurrentConnections("datappqcgbp")
            .withDisableMetricsCollection("datani")
            .withBlobWriterOverwriteFiles("datayxtxerxttobosjx")
            .withBlobWriterDateTimeFormat("dataytten")
            .withBlobWriterAddHeader("dataditumyycvtya")
            .withCopyBehavior("datayimhspjqhi")
            .withMetadata(Arrays.asList(new MetadataItem().withName("dataqvwhjgtbhre").withValue("datatq"),
                new MetadataItem().withName("datapbtqibq").withValue("dataugcwzgdfdrdxo"),
                new MetadataItem().withName("datakgezulnntpbarej").withValue("datahlxoljbpoeoywykh")));
        model = BinaryData.fromObject(model).toObject(BlobSink.class);
    }
}
