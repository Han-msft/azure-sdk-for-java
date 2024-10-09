// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.trustedsigning.implementation.models.CodeSigningAccountListResult;
import com.azure.resourcemanager.trustedsigning.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class CodeSigningAccountListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CodeSigningAccountListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"accountUri\":\"vmkjozkrwfndiodj\",\"sku\":{\"name\":\"Basic\"},\"provisioningState\":\"Succeeded\"},\"location\":\"dpvwryoqpsoaccta\",\"tags\":{\"dfdosygexp\":\"ljlahbcryf\",\"dphlxaolt\":\"ojakhmsbzjhcrze\"},\"id\":\"qtrgqjbpfzfsinzg\",\"name\":\"f\",\"type\":\"jrwzox\"}],\"nextLink\":\"tfell\"}")
            .toObject(CodeSigningAccountListResult.class);
        Assertions.assertEquals("dpvwryoqpsoaccta", model.value().get(0).location());
        Assertions.assertEquals("ljlahbcryf", model.value().get(0).tags().get("dfdosygexp"));
        Assertions.assertEquals(SkuName.BASIC, model.value().get(0).properties().sku().name());
        Assertions.assertEquals("tfell", model.nextLink());
    }
}
