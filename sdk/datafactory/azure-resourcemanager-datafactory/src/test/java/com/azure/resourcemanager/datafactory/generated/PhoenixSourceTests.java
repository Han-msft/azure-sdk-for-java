// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PhoenixSource;

public final class PhoenixSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PhoenixSource model = BinaryData.fromString(
            "{\"type\":\"PhoenixSource\",\"query\":\"datajjprd\",\"queryTimeout\":\"datablonlhtgexwjhicu\",\"additionalColumns\":\"dataavimxnhylwogtvl\",\"sourceRetryCount\":\"datagd\",\"sourceRetryWait\":\"datat\",\"maxConcurrentConnections\":\"datadxlfn\",\"disableMetricsCollection\":\"dataclkmggnzlfyxaiaf\",\"\":{\"uoayapzzcxkuusba\":\"dataxekfvycvhw\",\"yak\":\"datacassqeybdnz\",\"zkicxtumqinawct\":\"datarkohfqm\",\"kjnpe\":\"dataarboxaluoadmcv\"}}")
            .toObject(PhoenixSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PhoenixSource model = new PhoenixSource().withSourceRetryCount("datagd")
            .withSourceRetryWait("datat")
            .withMaxConcurrentConnections("datadxlfn")
            .withDisableMetricsCollection("dataclkmggnzlfyxaiaf")
            .withQueryTimeout("datablonlhtgexwjhicu")
            .withAdditionalColumns("dataavimxnhylwogtvl")
            .withQuery("datajjprd");
        model = BinaryData.fromObject(model).toObject(PhoenixSource.class);
    }
}
