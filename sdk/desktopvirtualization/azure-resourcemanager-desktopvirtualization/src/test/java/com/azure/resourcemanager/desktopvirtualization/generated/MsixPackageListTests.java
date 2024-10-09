// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.MsixPackageInner;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageList;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MsixPackageListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MsixPackageList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"imagePath\":\"trqjfsmlmbtx\",\"packageName\":\"gfwsrtaw\",\"packageFamilyName\":\"ezbrhubskh\",\"displayName\":\"ygo\",\"packageRelativePath\":\"kkqfqjbvle\",\"isRegularRegistration\":true,\"isActive\":true,\"packageDependencies\":[{\"dependencyName\":\"tqzfavyv\",\"publisher\":\"qybaryeua\",\"minVersion\":\"kq\"},{\"dependencyName\":\"qgzsles\",\"publisher\":\"bhernntiew\",\"minVersion\":\"cv\"},{\"dependencyName\":\"uwrbehwagoh\",\"publisher\":\"f\",\"minVersion\":\"mrqemvvhmx\"}],\"version\":\"rjfut\",\"lastUpdated\":\"2021-07-23T18:17:28Z\",\"packageApplications\":[{\"appId\":\"vewzcj\",\"description\":\"m\",\"appUserModelID\":\"pmguaadraufac\",\"friendlyName\":\"ahzovajjziuxxp\",\"iconImageName\":\"neekulfg\"}]},\"id\":\"bkwdlenrds\",\"name\":\"tujbazpju\",\"type\":\"hminyflnorwmduv\"},{\"properties\":{\"imagePath\":\"klvxwmyg\",\"packageName\":\"pgpqchiszepnnb\",\"packageFamilyName\":\"rxgibbd\",\"displayName\":\"confozauors\",\"packageRelativePath\":\"okwbqplh\",\"isRegularRegistration\":true,\"isActive\":false,\"packageDependencies\":[{\"dependencyName\":\"lrphwzsoldw\",\"publisher\":\"uqdunvmnnrwrbi\",\"minVersion\":\"ktalywjhhgdnhxms\"},{\"dependencyName\":\"fomiloxgg\",\"publisher\":\"fi\",\"minVersion\":\"dieuzaofj\"}],\"version\":\"vcyy\",\"lastUpdated\":\"2021-10-27T10:23:18Z\",\"packageApplications\":[{\"appId\":\"tcubiipuipwoqonm\",\"description\":\"jeknizshq\",\"appUserModelID\":\"impevf\",\"friendlyName\":\"b\",\"iconImageName\":\"rilbywdx\"},{\"appId\":\"cwrwfs\",\"description\":\"fnynszqujizdvoqy\",\"appUserModelID\":\"byowbblgyavutp\",\"friendlyName\":\"joxoism\",\"iconImageName\":\"sbpimlq\"},{\"appId\":\"kcgxxlxsffgcvi\",\"description\":\"zdwlvwlyoupfgfb\",\"appUserModelID\":\"ubdyhgk\",\"friendlyName\":\"in\",\"iconImageName\":\"owzfttsttkt\"}]},\"id\":\"qactxtgzukxitmmq\",\"name\":\"gqqqxh\",\"type\":\"n\"}],\"nextLink\":\"xcpjuisavokqdzf\"}")
            .toObject(MsixPackageList.class);
        Assertions.assertEquals("trqjfsmlmbtx", model.value().get(0).imagePath());
        Assertions.assertEquals("gfwsrtaw", model.value().get(0).packageName());
        Assertions.assertEquals("ezbrhubskh", model.value().get(0).packageFamilyName());
        Assertions.assertEquals("ygo", model.value().get(0).displayName());
        Assertions.assertEquals("kkqfqjbvle", model.value().get(0).packageRelativePath());
        Assertions.assertEquals(true, model.value().get(0).isRegularRegistration());
        Assertions.assertEquals(true, model.value().get(0).isActive());
        Assertions.assertEquals("tqzfavyv", model.value().get(0).packageDependencies().get(0).dependencyName());
        Assertions.assertEquals("qybaryeua", model.value().get(0).packageDependencies().get(0).publisher());
        Assertions.assertEquals("kq", model.value().get(0).packageDependencies().get(0).minVersion());
        Assertions.assertEquals("rjfut", model.value().get(0).version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T18:17:28Z"), model.value().get(0).lastUpdated());
        Assertions.assertEquals("vewzcj", model.value().get(0).packageApplications().get(0).appId());
        Assertions.assertEquals("m", model.value().get(0).packageApplications().get(0).description());
        Assertions.assertEquals("pmguaadraufac", model.value().get(0).packageApplications().get(0).appUserModelId());
        Assertions.assertEquals("ahzovajjziuxxp", model.value().get(0).packageApplications().get(0).friendlyName());
        Assertions.assertEquals("neekulfg", model.value().get(0).packageApplications().get(0).iconImageName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MsixPackageList model = new MsixPackageList().withValue(Arrays.asList(
            new MsixPackageInner().withImagePath("trqjfsmlmbtx")
                .withPackageName("gfwsrtaw")
                .withPackageFamilyName("ezbrhubskh")
                .withDisplayName("ygo")
                .withPackageRelativePath("kkqfqjbvle")
                .withIsRegularRegistration(true)
                .withIsActive(true)
                .withPackageDependencies(Arrays.asList(
                    new MsixPackageDependencies().withDependencyName("tqzfavyv")
                        .withPublisher("qybaryeua")
                        .withMinVersion("kq"),
                    new MsixPackageDependencies().withDependencyName("qgzsles")
                        .withPublisher("bhernntiew")
                        .withMinVersion("cv"),
                    new MsixPackageDependencies().withDependencyName("uwrbehwagoh")
                        .withPublisher("f")
                        .withMinVersion("mrqemvvhmx")))
                .withVersion("rjfut")
                .withLastUpdated(OffsetDateTime.parse("2021-07-23T18:17:28Z"))
                .withPackageApplications(Arrays.asList(new MsixPackageApplications().withAppId("vewzcj")
                    .withDescription("m")
                    .withAppUserModelId("pmguaadraufac")
                    .withFriendlyName("ahzovajjziuxxp")
                    .withIconImageName("neekulfg"))),
            new MsixPackageInner().withImagePath("klvxwmyg")
                .withPackageName("pgpqchiszepnnb")
                .withPackageFamilyName("rxgibbd")
                .withDisplayName("confozauors")
                .withPackageRelativePath("okwbqplh")
                .withIsRegularRegistration(true)
                .withIsActive(false)
                .withPackageDependencies(Arrays.asList(
                    new MsixPackageDependencies().withDependencyName("lrphwzsoldw")
                        .withPublisher("uqdunvmnnrwrbi")
                        .withMinVersion("ktalywjhhgdnhxms"),
                    new MsixPackageDependencies().withDependencyName("fomiloxgg")
                        .withPublisher("fi")
                        .withMinVersion("dieuzaofj")))
                .withVersion("vcyy")
                .withLastUpdated(OffsetDateTime.parse("2021-10-27T10:23:18Z"))
                .withPackageApplications(Arrays.asList(
                    new MsixPackageApplications().withAppId("tcubiipuipwoqonm")
                        .withDescription("jeknizshq")
                        .withAppUserModelId("impevf")
                        .withFriendlyName("b")
                        .withIconImageName("rilbywdx"),
                    new MsixPackageApplications().withAppId("cwrwfs")
                        .withDescription("fnynszqujizdvoqy")
                        .withAppUserModelId("byowbblgyavutp")
                        .withFriendlyName("joxoism")
                        .withIconImageName("sbpimlq"),
                    new MsixPackageApplications().withAppId("kcgxxlxsffgcvi")
                        .withDescription("zdwlvwlyoupfgfb")
                        .withAppUserModelId("ubdyhgk")
                        .withFriendlyName("in")
                        .withIconImageName("owzfttsttkt")))));
        model = BinaryData.fromObject(model).toObject(MsixPackageList.class);
        Assertions.assertEquals("trqjfsmlmbtx", model.value().get(0).imagePath());
        Assertions.assertEquals("gfwsrtaw", model.value().get(0).packageName());
        Assertions.assertEquals("ezbrhubskh", model.value().get(0).packageFamilyName());
        Assertions.assertEquals("ygo", model.value().get(0).displayName());
        Assertions.assertEquals("kkqfqjbvle", model.value().get(0).packageRelativePath());
        Assertions.assertEquals(true, model.value().get(0).isRegularRegistration());
        Assertions.assertEquals(true, model.value().get(0).isActive());
        Assertions.assertEquals("tqzfavyv", model.value().get(0).packageDependencies().get(0).dependencyName());
        Assertions.assertEquals("qybaryeua", model.value().get(0).packageDependencies().get(0).publisher());
        Assertions.assertEquals("kq", model.value().get(0).packageDependencies().get(0).minVersion());
        Assertions.assertEquals("rjfut", model.value().get(0).version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T18:17:28Z"), model.value().get(0).lastUpdated());
        Assertions.assertEquals("vewzcj", model.value().get(0).packageApplications().get(0).appId());
        Assertions.assertEquals("m", model.value().get(0).packageApplications().get(0).description());
        Assertions.assertEquals("pmguaadraufac", model.value().get(0).packageApplications().get(0).appUserModelId());
        Assertions.assertEquals("ahzovajjziuxxp", model.value().get(0).packageApplications().get(0).friendlyName());
        Assertions.assertEquals("neekulfg", model.value().get(0).packageApplications().get(0).iconImageName());
    }
}
