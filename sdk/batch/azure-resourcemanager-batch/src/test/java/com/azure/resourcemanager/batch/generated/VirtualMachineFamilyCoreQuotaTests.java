// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.VirtualMachineFamilyCoreQuota;

public final class VirtualMachineFamilyCoreQuotaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineFamilyCoreQuota model = BinaryData.fromString("{\"name\":\"pdappds\",\"coreQuota\":253055122}")
            .toObject(VirtualMachineFamilyCoreQuota.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineFamilyCoreQuota model = new VirtualMachineFamilyCoreQuota();
        model = BinaryData.fromObject(model).toObject(VirtualMachineFamilyCoreQuota.class);
    }
}
