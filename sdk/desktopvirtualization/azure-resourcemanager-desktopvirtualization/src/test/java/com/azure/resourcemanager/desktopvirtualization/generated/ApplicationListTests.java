// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationInner;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationList;
import com.azure.resourcemanager.desktopvirtualization.models.CommandLineSetting;
import com.azure.resourcemanager.desktopvirtualization.models.RemoteApplicationType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApplicationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"objectId\":\"qugjhkycube\",\"description\":\"gssofwq\",\"friendlyName\":\"qal\",\"filePath\":\"mnjijpxacqqudf\",\"msixPackageFamilyName\":\"yxbaaabjyvayf\",\"msixPackageApplicationId\":\"m\",\"applicationType\":\"InBuilt\",\"commandLineSetting\":\"Require\",\"commandLineArguments\":\"zqogse\",\"showInPortal\":true,\"iconPath\":\"fdnw\",\"iconIndex\":2059840008,\"iconHash\":\"wzsyyceuzs\"},\"id\":\"judpfrxt\",\"name\":\"thzvaytdwkqbrqu\",\"type\":\"paxh\"},{\"properties\":{\"objectId\":\"iilivpdtiirqtd\",\"description\":\"axoruzfgsquy\",\"friendlyName\":\"rxxle\",\"filePath\":\"ramxjezwlwnw\",\"msixPackageFamilyName\":\"qlcvydy\",\"msixPackageApplicationId\":\"tdooaoj\",\"applicationType\":\"MsixApplication\",\"commandLineSetting\":\"Require\",\"commandLineArguments\":\"kooebwnu\",\"showInPortal\":true,\"iconPath\":\"msbvdkcrodtjinf\",\"iconIndex\":1492452539,\"iconHash\":\"lt\"},\"id\":\"jvefkdlfoakggkfp\",\"name\":\"gaowpulpqblylsyx\",\"type\":\"qjnsjervtia\"},{\"properties\":{\"objectId\":\"sdszue\",\"description\":\"sbzkf\",\"friendlyName\":\"eyvpnqicvinvkj\",\"filePath\":\"dxrbuukzcle\",\"msixPackageFamilyName\":\"hmlwpaztzpo\",\"msixPackageApplicationId\":\"cckwyfzqwhxxbu\",\"applicationType\":\"InBuilt\",\"commandLineSetting\":\"Require\",\"commandLineArguments\":\"feqztppriol\",\"showInPortal\":true,\"iconPath\":\"altol\",\"iconIndex\":136991246,\"iconHash\":\"sobqw\"},\"id\":\"bnwdcfh\",\"name\":\"cqdpfuv\",\"type\":\"lsbjjcanvxbv\"}],\"nextLink\":\"udutnco\"}")
            .toObject(ApplicationList.class);
        Assertions.assertEquals("gssofwq", model.value().get(0).description());
        Assertions.assertEquals("qal", model.value().get(0).friendlyName());
        Assertions.assertEquals("mnjijpxacqqudf", model.value().get(0).filePath());
        Assertions.assertEquals("yxbaaabjyvayf", model.value().get(0).msixPackageFamilyName());
        Assertions.assertEquals("m", model.value().get(0).msixPackageApplicationId());
        Assertions.assertEquals(RemoteApplicationType.IN_BUILT, model.value().get(0).applicationType());
        Assertions.assertEquals(CommandLineSetting.REQUIRE, model.value().get(0).commandLineSetting());
        Assertions.assertEquals("zqogse", model.value().get(0).commandLineArguments());
        Assertions.assertEquals(true, model.value().get(0).showInPortal());
        Assertions.assertEquals("fdnw", model.value().get(0).iconPath());
        Assertions.assertEquals(2059840008, model.value().get(0).iconIndex());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationList model = new ApplicationList().withValue(Arrays.asList(
            new ApplicationInner().withDescription("gssofwq")
                .withFriendlyName("qal")
                .withFilePath("mnjijpxacqqudf")
                .withMsixPackageFamilyName("yxbaaabjyvayf")
                .withMsixPackageApplicationId("m")
                .withApplicationType(RemoteApplicationType.IN_BUILT)
                .withCommandLineSetting(CommandLineSetting.REQUIRE)
                .withCommandLineArguments("zqogse")
                .withShowInPortal(true)
                .withIconPath("fdnw")
                .withIconIndex(2059840008),
            new ApplicationInner().withDescription("axoruzfgsquy")
                .withFriendlyName("rxxle")
                .withFilePath("ramxjezwlwnw")
                .withMsixPackageFamilyName("qlcvydy")
                .withMsixPackageApplicationId("tdooaoj")
                .withApplicationType(RemoteApplicationType.MSIX_APPLICATION)
                .withCommandLineSetting(CommandLineSetting.REQUIRE)
                .withCommandLineArguments("kooebwnu")
                .withShowInPortal(true)
                .withIconPath("msbvdkcrodtjinf")
                .withIconIndex(1492452539),
            new ApplicationInner().withDescription("sbzkf")
                .withFriendlyName("eyvpnqicvinvkj")
                .withFilePath("dxrbuukzcle")
                .withMsixPackageFamilyName("hmlwpaztzpo")
                .withMsixPackageApplicationId("cckwyfzqwhxxbu")
                .withApplicationType(RemoteApplicationType.IN_BUILT)
                .withCommandLineSetting(CommandLineSetting.REQUIRE)
                .withCommandLineArguments("feqztppriol")
                .withShowInPortal(true)
                .withIconPath("altol")
                .withIconIndex(136991246)));
        model = BinaryData.fromObject(model).toObject(ApplicationList.class);
        Assertions.assertEquals("gssofwq", model.value().get(0).description());
        Assertions.assertEquals("qal", model.value().get(0).friendlyName());
        Assertions.assertEquals("mnjijpxacqqudf", model.value().get(0).filePath());
        Assertions.assertEquals("yxbaaabjyvayf", model.value().get(0).msixPackageFamilyName());
        Assertions.assertEquals("m", model.value().get(0).msixPackageApplicationId());
        Assertions.assertEquals(RemoteApplicationType.IN_BUILT, model.value().get(0).applicationType());
        Assertions.assertEquals(CommandLineSetting.REQUIRE, model.value().get(0).commandLineSetting());
        Assertions.assertEquals("zqogse", model.value().get(0).commandLineArguments());
        Assertions.assertEquals(true, model.value().get(0).showInPortal());
        Assertions.assertEquals("fdnw", model.value().get(0).iconPath());
        Assertions.assertEquals(2059840008, model.value().get(0).iconIndex());
    }
}
