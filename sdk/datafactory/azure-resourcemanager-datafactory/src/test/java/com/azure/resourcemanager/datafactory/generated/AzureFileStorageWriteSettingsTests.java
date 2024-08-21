// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureFileStorageWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureFileStorageWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileStorageWriteSettings model = BinaryData.fromString(
            "{\"type\":\"AzureFileStorageWriteSettings\",\"maxConcurrentConnections\":\"datasqlyahlaoqkcit\",\"disableMetricsCollection\":\"datauzvaxltrznwh\",\"copyBehavior\":\"datatsauvprqzpfpbx\",\"metadata\":[{\"name\":\"datakkoyzsy\",\"value\":\"datakcld\"},{\"name\":\"dataseka\",\"value\":\"datae\"},{\"name\":\"datalpch\",\"value\":\"datazqmdxmyfrmfclkyn\"}],\"\":{\"zcbohbb\":\"dataaf\",\"c\":\"datavoderduabqbverb\",\"pc\":\"dataszbvhxnjor\",\"uknnm\":\"dataxdlp\"}}")
            .toObject(AzureFileStorageWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileStorageWriteSettings model
            = new AzureFileStorageWriteSettings().withMaxConcurrentConnections("datasqlyahlaoqkcit")
                .withDisableMetricsCollection("datauzvaxltrznwh")
                .withCopyBehavior("datatsauvprqzpfpbx")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datakkoyzsy").withValue("datakcld"),
                    new MetadataItem().withName("dataseka").withValue("datae"),
                    new MetadataItem().withName("datalpch").withValue("datazqmdxmyfrmfclkyn")));
        model = BinaryData.fromObject(model).toObject(AzureFileStorageWriteSettings.class);
    }
}
