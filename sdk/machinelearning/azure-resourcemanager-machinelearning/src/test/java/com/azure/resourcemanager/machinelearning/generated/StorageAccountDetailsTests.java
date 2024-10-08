// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ArmResourceId;
import com.azure.resourcemanager.machinelearning.models.StorageAccountDetails;
import com.azure.resourcemanager.machinelearning.models.SystemCreatedStorageAccount;
import com.azure.resourcemanager.machinelearning.models.UserCreatedStorageAccount;
import org.junit.jupiter.api.Assertions;

public final class StorageAccountDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageAccountDetails model = BinaryData.fromString(
            "{\"systemCreatedStorageAccount\":{\"allowBlobPublicAccess\":false,\"armResourceId\":{\"resourceId\":\"ibz\"},\"storageAccountHnsEnabled\":false,\"storageAccountName\":\"ee\",\"storageAccountType\":\"ph\"},\"userCreatedStorageAccount\":{\"armResourceId\":{\"resourceId\":\"jw\"}}}")
            .toObject(StorageAccountDetails.class);
        Assertions.assertEquals(false, model.systemCreatedStorageAccount().allowBlobPublicAccess());
        Assertions.assertEquals("ibz", model.systemCreatedStorageAccount().armResourceId().resourceId());
        Assertions.assertEquals(false, model.systemCreatedStorageAccount().storageAccountHnsEnabled());
        Assertions.assertEquals("ee", model.systemCreatedStorageAccount().storageAccountName());
        Assertions.assertEquals("ph", model.systemCreatedStorageAccount().storageAccountType());
        Assertions.assertEquals("jw", model.userCreatedStorageAccount().armResourceId().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageAccountDetails model = new StorageAccountDetails()
            .withSystemCreatedStorageAccount(new SystemCreatedStorageAccount().withAllowBlobPublicAccess(false)
                .withArmResourceId(new ArmResourceId().withResourceId("ibz"))
                .withStorageAccountHnsEnabled(false)
                .withStorageAccountName("ee")
                .withStorageAccountType("ph"))
            .withUserCreatedStorageAccount(
                new UserCreatedStorageAccount().withArmResourceId(new ArmResourceId().withResourceId("jw")));
        model = BinaryData.fromObject(model).toObject(StorageAccountDetails.class);
        Assertions.assertEquals(false, model.systemCreatedStorageAccount().allowBlobPublicAccess());
        Assertions.assertEquals("ibz", model.systemCreatedStorageAccount().armResourceId().resourceId());
        Assertions.assertEquals(false, model.systemCreatedStorageAccount().storageAccountHnsEnabled());
        Assertions.assertEquals("ee", model.systemCreatedStorageAccount().storageAccountName());
        Assertions.assertEquals("ph", model.systemCreatedStorageAccount().storageAccountType());
        Assertions.assertEquals("jw", model.userCreatedStorageAccount().armResourceId().resourceId());
    }
}
