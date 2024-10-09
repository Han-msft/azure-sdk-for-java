// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicelinker.models.UserAssignedIdentityAuthInfo;
import org.junit.jupiter.api.Assertions;

public final class UserAssignedIdentityAuthInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAssignedIdentityAuthInfo model = BinaryData
            .fromString("{\"authType\":\"userAssignedIdentity\",\"clientId\":\"theotusiv\",\"subscriptionId\":\"v\"}")
            .toObject(UserAssignedIdentityAuthInfo.class);
        Assertions.assertEquals("theotusiv", model.clientId());
        Assertions.assertEquals("v", model.subscriptionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAssignedIdentityAuthInfo model
            = new UserAssignedIdentityAuthInfo().withClientId("theotusiv").withSubscriptionId("v");
        model = BinaryData.fromObject(model).toObject(UserAssignedIdentityAuthInfo.class);
        Assertions.assertEquals("theotusiv", model.clientId());
        Assertions.assertEquals("v", model.subscriptionId());
    }
}
