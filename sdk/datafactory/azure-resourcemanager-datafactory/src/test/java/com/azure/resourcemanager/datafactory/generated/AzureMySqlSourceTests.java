// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureMySqlSource;

public final class AzureMySqlSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMySqlSource model = BinaryData.fromString(
            "{\"type\":\"AzureMySqlSource\",\"query\":\"datacyrdtrd\",\"queryTimeout\":\"datadmsktuvjh\",\"additionalColumns\":\"datatvyt\",\"sourceRetryCount\":\"datafbsgrzw\",\"sourceRetryWait\":\"datadudxqebtrpsplwt\",\"maxConcurrentConnections\":\"datacseybvtgcoznnjqx\",\"disableMetricsCollection\":\"datarnkuuotlymyb\",\"\":{\"j\":\"datarkxkmtuynugpt\",\"tqqshb\":\"dataisvfh\"}}")
            .toObject(AzureMySqlSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMySqlSource model = new AzureMySqlSource().withSourceRetryCount("datafbsgrzw")
            .withSourceRetryWait("datadudxqebtrpsplwt")
            .withMaxConcurrentConnections("datacseybvtgcoznnjqx")
            .withDisableMetricsCollection("datarnkuuotlymyb")
            .withQueryTimeout("datadmsktuvjh")
            .withAdditionalColumns("datatvyt")
            .withQuery("datacyrdtrd");
        model = BinaryData.fromObject(model).toObject(AzureMySqlSource.class);
    }
}
