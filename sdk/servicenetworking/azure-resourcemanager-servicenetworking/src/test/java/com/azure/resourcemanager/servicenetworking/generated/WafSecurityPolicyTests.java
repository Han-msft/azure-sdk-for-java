// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.models.WafSecurityPolicy;
import org.junit.jupiter.api.Assertions;

public final class WafSecurityPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WafSecurityPolicy model
            = BinaryData.fromString("{\"id\":\"nhutjeltmrldhugj\"}").toObject(WafSecurityPolicy.class);
        Assertions.assertEquals("nhutjeltmrldhugj", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WafSecurityPolicy model = new WafSecurityPolicy().withId("nhutjeltmrldhugj");
        model = BinaryData.fromObject(model).toObject(WafSecurityPolicy.class);
        Assertions.assertEquals("nhutjeltmrldhugj", model.id());
    }
}
