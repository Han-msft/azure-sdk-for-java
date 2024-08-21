// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.fluent.models.PrivateLinkConfigurationProperties;
import com.azure.resourcemanager.hdinsight.models.IpConfiguration;
import com.azure.resourcemanager.hdinsight.models.PrivateIpAllocationMethod;
import com.azure.resourcemanager.hdinsight.models.ResourceId;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkConfigurationProperties model = BinaryData.fromString(
            "{\"groupId\":\"jzicwifsjt\",\"provisioningState\":\"Failed\",\"ipConfigurations\":[{\"id\":\"ishc\",\"name\":\"khaj\",\"type\":\"yeamdphagalpb\",\"properties\":{\"provisioningState\":\"Deleting\",\"primary\":true,\"privateIPAddress\":\"honowkgshwank\",\"privateIPAllocationMethod\":\"static\",\"subnet\":{\"id\":\"njeputtmrywn\"}}},{\"id\":\"oqftiyqzrnkcq\",\"name\":\"yx\",\"type\":\"hzls\",\"properties\":{\"provisioningState\":\"Succeeded\",\"primary\":false,\"privateIPAddress\":\"nwvlryavwhheunmm\",\"privateIPAllocationMethod\":\"dynamic\",\"subnet\":{\"id\":\"zko\"}}},{\"id\":\"cukoklyaxuconu\",\"name\":\"szfkbe\",\"type\":\"ewrmjmwvvjektc\",\"properties\":{\"provisioningState\":\"Succeeded\",\"primary\":true,\"privateIPAddress\":\"rsffrzpwvlqdqgbi\",\"privateIPAllocationMethod\":\"static\",\"subnet\":{\"id\":\"kaet\"}}}]}")
            .toObject(PrivateLinkConfigurationProperties.class);
        Assertions.assertEquals("jzicwifsjt", model.groupId());
        Assertions.assertEquals("khaj", model.ipConfigurations().get(0).name());
        Assertions.assertEquals(true, model.ipConfigurations().get(0).primary());
        Assertions.assertEquals("honowkgshwank", model.ipConfigurations().get(0).privateIpAddress());
        Assertions.assertEquals(PrivateIpAllocationMethod.STATIC,
            model.ipConfigurations().get(0).privateIpAllocationMethod());
        Assertions.assertEquals("njeputtmrywn", model.ipConfigurations().get(0).subnet().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkConfigurationProperties model = new PrivateLinkConfigurationProperties().withGroupId("jzicwifsjt")
            .withIpConfigurations(Arrays.asList(
                new IpConfiguration().withName("khaj")
                    .withPrimary(true)
                    .withPrivateIpAddress("honowkgshwank")
                    .withPrivateIpAllocationMethod(PrivateIpAllocationMethod.STATIC)
                    .withSubnet(new ResourceId().withId("njeputtmrywn")),
                new IpConfiguration().withName("yx")
                    .withPrimary(false)
                    .withPrivateIpAddress("nwvlryavwhheunmm")
                    .withPrivateIpAllocationMethod(PrivateIpAllocationMethod.DYNAMIC)
                    .withSubnet(new ResourceId().withId("zko")),
                new IpConfiguration().withName("szfkbe")
                    .withPrimary(true)
                    .withPrivateIpAddress("rsffrzpwvlqdqgbi")
                    .withPrivateIpAllocationMethod(PrivateIpAllocationMethod.STATIC)
                    .withSubnet(new ResourceId().withId("kaet"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkConfigurationProperties.class);
        Assertions.assertEquals("jzicwifsjt", model.groupId());
        Assertions.assertEquals("khaj", model.ipConfigurations().get(0).name());
        Assertions.assertEquals(true, model.ipConfigurations().get(0).primary());
        Assertions.assertEquals("honowkgshwank", model.ipConfigurations().get(0).privateIpAddress());
        Assertions.assertEquals(PrivateIpAllocationMethod.STATIC,
            model.ipConfigurations().get(0).privateIpAllocationMethod());
        Assertions.assertEquals("njeputtmrywn", model.ipConfigurations().get(0).subnet().id());
    }
}
