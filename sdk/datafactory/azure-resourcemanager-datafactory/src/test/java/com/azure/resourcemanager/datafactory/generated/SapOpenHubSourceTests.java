// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapOpenHubSource;

public final class SapOpenHubSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapOpenHubSource model = BinaryData.fromString(
            "{\"type\":\"SapOpenHubSource\",\"excludeLastRequest\":\"datar\",\"baseRequestId\":\"datalximvr\",\"customRfcReadTableFunctionModule\":\"datajja\",\"sapDataColumnDelimiter\":\"dataaskullvtsauj\",\"queryTimeout\":\"datahtz\",\"additionalColumns\":\"datazqrpfhzxkjyg\",\"sourceRetryCount\":\"dataidgwdhawj\",\"sourceRetryWait\":\"datazb\",\"maxConcurrentConnections\":\"datat\",\"disableMetricsCollection\":\"datacmxqdexnkp\",\"\":{\"kpn\":\"datacmsmz\"}}")
            .toObject(SapOpenHubSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapOpenHubSource model = new SapOpenHubSource().withSourceRetryCount("dataidgwdhawj")
            .withSourceRetryWait("datazb")
            .withMaxConcurrentConnections("datat")
            .withDisableMetricsCollection("datacmxqdexnkp")
            .withQueryTimeout("datahtz")
            .withAdditionalColumns("datazqrpfhzxkjyg")
            .withExcludeLastRequest("datar")
            .withBaseRequestId("datalximvr")
            .withCustomRfcReadTableFunctionModule("datajja")
            .withSapDataColumnDelimiter("dataaskullvtsauj");
        model = BinaryData.fromObject(model).toObject(SapOpenHubSource.class);
    }
}
