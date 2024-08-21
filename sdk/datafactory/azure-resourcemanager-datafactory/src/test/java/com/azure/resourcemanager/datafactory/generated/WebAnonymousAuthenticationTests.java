// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.WebAnonymousAuthentication;

public final class WebAnonymousAuthenticationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebAnonymousAuthentication model
            = BinaryData.fromString("{\"authenticationType\":\"Anonymous\",\"url\":\"datar\"}")
                .toObject(WebAnonymousAuthentication.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebAnonymousAuthentication model = new WebAnonymousAuthentication().withUrl("datar");
        model = BinaryData.fromObject(model).toObject(WebAnonymousAuthentication.class);
    }
}
