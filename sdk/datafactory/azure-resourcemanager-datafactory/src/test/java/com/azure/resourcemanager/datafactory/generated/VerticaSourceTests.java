// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.VerticaSource;

public final class VerticaSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VerticaSource model = BinaryData.fromString(
            "{\"type\":\"VerticaSource\",\"query\":\"datapubsdinfauyt\",\"queryTimeout\":\"datavsdyqyjkmfo\",\"additionalColumns\":\"datamxedlcxm\",\"sourceRetryCount\":\"datatpbapojknvxantlp\",\"sourceRetryWait\":\"dataiipfgdnqpkvvrho\",\"maxConcurrentConnections\":\"datavqdvnruoduex\",\"disableMetricsCollection\":\"datakhkqlvocrddqxheg\",\"\":{\"zcklqrunqw\":\"datah\",\"pywgjgfbsfsvayg\":\"datarkkabyxxyfn\"}}")
            .toObject(VerticaSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VerticaSource model = new VerticaSource().withSourceRetryCount("datatpbapojknvxantlp")
            .withSourceRetryWait("dataiipfgdnqpkvvrho")
            .withMaxConcurrentConnections("datavqdvnruoduex")
            .withDisableMetricsCollection("datakhkqlvocrddqxheg")
            .withQueryTimeout("datavsdyqyjkmfo")
            .withAdditionalColumns("datamxedlcxm")
            .withQuery("datapubsdinfauyt");
        model = BinaryData.fromObject(model).toObject(VerticaSource.class);
    }
}
