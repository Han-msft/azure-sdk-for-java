// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudSource;

public final class SalesforceServiceCloudSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudSource model = BinaryData.fromString(
            "{\"type\":\"SalesforceServiceCloudSource\",\"query\":\"datafafpyglnfwjs\",\"readBehavior\":\"datavexblucpmqwkfgm\",\"additionalColumns\":\"datavekstzqzhd\",\"sourceRetryCount\":\"datacajfersxnxlkcw\",\"sourceRetryWait\":\"dataejssksgxykdepqcy\",\"maxConcurrentConnections\":\"datahwsxpzkmotgmd\",\"disableMetricsCollection\":\"datawwqevbiuntp\",\"\":{\"qgywr\":\"datawjxlycelf\",\"ruldt\":\"datau\"}}")
            .toObject(SalesforceServiceCloudSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudSource model
            = new SalesforceServiceCloudSource().withSourceRetryCount("datacajfersxnxlkcw")
                .withSourceRetryWait("dataejssksgxykdepqcy")
                .withMaxConcurrentConnections("datahwsxpzkmotgmd")
                .withDisableMetricsCollection("datawwqevbiuntp")
                .withQuery("datafafpyglnfwjs")
                .withReadBehavior("datavexblucpmqwkfgm")
                .withAdditionalColumns("datavekstzqzhd");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudSource.class);
    }
}
