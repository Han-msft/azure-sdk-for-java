// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.desktopvirtualization.models.LogSpecification;
import com.azure.resourcemanager.desktopvirtualization.models.OperationProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceProviderOperationDisplay;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceProviderOperationList;
import com.azure.resourcemanager.desktopvirtualization.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceProviderOperationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationList model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"quvgjxpybczme\",\"display\":{\"provider\":\"zopbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"},\"isDataAction\":false,\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{},{}]}}},{\"name\":\"hwlrx\",\"display\":{\"provider\":\"soqijg\",\"resource\":\"mbpazlobcufpdzn\",\"operation\":\"t\",\"description\":\"qjnqglhqgnufoooj\"},\"isDataAction\":true,\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{},{}]}}},{\"name\":\"aagdfmg\",\"display\":{\"provider\":\"hjxri\",\"resource\":\"wmrvktsizntocipa\",\"operation\":\"ajpsquc\",\"description\":\"o\"},\"isDataAction\":false,\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{},{},{},{}]}}}],\"nextLink\":\"nygj\"}")
            .toObject(ResourceProviderOperationList.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationList model = new ResourceProviderOperationList().withValue(Arrays.asList(
            new ResourceProviderOperationInner().withName("quvgjxpybczme")
                .withDisplay(new ResourceProviderOperationDisplay().withProvider("zopbsphrupidgs")
                    .withResource("bejhphoycmsxa")
                    .withOperation("hdxbmtqio")
                    .withDescription("zehtbmu"))
                .withIsDataAction(false)
                .withProperties(new OperationProperties().withServiceSpecification(new ServiceSpecification()
                    .withLogSpecifications(Arrays.asList(new LogSpecification(), new LogSpecification())))),
            new ResourceProviderOperationInner().withName("hwlrx")
                .withDisplay(new ResourceProviderOperationDisplay().withProvider("soqijg")
                    .withResource("mbpazlobcufpdzn")
                    .withOperation("t")
                    .withDescription("qjnqglhqgnufoooj"))
                .withIsDataAction(true)
                .withProperties(new OperationProperties().withServiceSpecification(new ServiceSpecification()
                    .withLogSpecifications(Arrays.asList(new LogSpecification(), new LogSpecification())))),
            new ResourceProviderOperationInner().withName("aagdfmg")
                .withDisplay(new ResourceProviderOperationDisplay().withProvider("hjxri")
                    .withResource("wmrvktsizntocipa")
                    .withOperation("ajpsquc")
                    .withDescription("o"))
                .withIsDataAction(false)
                .withProperties(new OperationProperties().withServiceSpecification(
                    new ServiceSpecification().withLogSpecifications(Arrays.asList(new LogSpecification(),
                        new LogSpecification(), new LogSpecification(), new LogSpecification()))))));
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationList.class);
        Assertions.assertEquals("quvgjxpybczme", model.value().get(0).name());
        Assertions.assertEquals("zopbsphrupidgs", model.value().get(0).display().provider());
        Assertions.assertEquals("bejhphoycmsxa", model.value().get(0).display().resource());
        Assertions.assertEquals("hdxbmtqio", model.value().get(0).display().operation());
        Assertions.assertEquals("zehtbmu", model.value().get(0).display().description());
        Assertions.assertEquals(false, model.value().get(0).isDataAction());
    }
}
