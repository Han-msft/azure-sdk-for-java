// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.PrestoDatasetTypeProperties;

public final class PrestoDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrestoDatasetTypeProperties model = BinaryData
            .fromString("{\"tableName\":\"datawb\",\"table\":\"dataiwtwfgoc\",\"schema\":\"datalvemnnzugabk\"}")
            .toObject(PrestoDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrestoDatasetTypeProperties model = new PrestoDatasetTypeProperties().withTableName("datawb")
            .withTable("dataiwtwfgoc")
            .withSchema("datalvemnnzugabk");
        model = BinaryData.fromObject(model).toObject(PrestoDatasetTypeProperties.class);
    }
}
