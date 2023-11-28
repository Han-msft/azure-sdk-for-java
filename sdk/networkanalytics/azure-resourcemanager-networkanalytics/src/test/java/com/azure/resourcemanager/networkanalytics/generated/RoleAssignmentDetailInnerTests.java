// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkanalytics.fluent.models.RoleAssignmentDetailInner;
import com.azure.resourcemanager.networkanalytics.models.DataProductUserRole;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RoleAssignmentDetailInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoleAssignmentDetailInner model = BinaryData.fromString(
            "{\"roleId\":\"zdmohctbqvu\",\"principalId\":\"wxdndnvowgujjug\",\"userName\":\"dkcglhsl\",\"dataTypeScope\":[\"jdyggdtji\"],\"principalType\":\"hbkuofqwey\",\"role\":\"SensitiveReader\",\"roleAssignmentId\":\"menevfyexfwh\"}")
            .toObject(RoleAssignmentDetailInner.class);
        Assertions.assertEquals("zdmohctbqvu", model.roleId());
        Assertions.assertEquals("wxdndnvowgujjug", model.principalId());
        Assertions.assertEquals("dkcglhsl", model.username());
        Assertions.assertEquals("jdyggdtji", model.dataTypeScope().get(0));
        Assertions.assertEquals("hbkuofqwey", model.principalType());
        Assertions.assertEquals(DataProductUserRole.SENSITIVE_READER, model.role());
        Assertions.assertEquals("menevfyexfwh", model.roleAssignmentId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoleAssignmentDetailInner model
            = new RoleAssignmentDetailInner().withRoleId("zdmohctbqvu").withPrincipalId("wxdndnvowgujjug")
                .withUsername("dkcglhsl").withDataTypeScope(Arrays.asList("jdyggdtji")).withPrincipalType("hbkuofqwey")
                .withRole(DataProductUserRole.SENSITIVE_READER).withRoleAssignmentId("menevfyexfwh");
        model = BinaryData.fromObject(model).toObject(RoleAssignmentDetailInner.class);
        Assertions.assertEquals("zdmohctbqvu", model.roleId());
        Assertions.assertEquals("wxdndnvowgujjug", model.principalId());
        Assertions.assertEquals("dkcglhsl", model.username());
        Assertions.assertEquals("jdyggdtji", model.dataTypeScope().get(0));
        Assertions.assertEquals("hbkuofqwey", model.principalType());
        Assertions.assertEquals(DataProductUserRole.SENSITIVE_READER, model.role());
        Assertions.assertEquals("menevfyexfwh", model.roleAssignmentId());
    }
}
