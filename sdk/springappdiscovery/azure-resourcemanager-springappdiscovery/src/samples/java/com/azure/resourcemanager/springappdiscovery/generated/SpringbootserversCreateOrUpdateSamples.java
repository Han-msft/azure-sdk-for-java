// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.generated;

import com.azure.resourcemanager.springappdiscovery.models.SpringbootserversProperties;
import java.util.Arrays;

/**
 * Samples for Springbootservers CreateOrUpdate.
 */
public final class SpringbootserversCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/
     * examples/springbootservers_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_CreateOrUpdate_MaximumSet_Gen.
     * 
     * @param manager Entry point to SpringAppDiscoveryManager.
     */
    public static void springbootserversCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager manager) {
        manager.springbootservers().define("zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn")
            .withExistingSpringbootsite("rgspringbootservers",
                "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj")
            .withProperties(new SpringbootserversProperties().withPort(10).withServer("thhuxocfyqpeluqcgnypi")
                .withFqdnAndIpAddressList(Arrays.asList()).withMachineArmId("fvfkiapbqsprnbzczdfmuryknrna")
                .withTotalApps(5).withSpringBootApps(17).withErrors(Arrays.asList()))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/offazurespringboot/resource-manager/Microsoft.OffAzureSpringBoot/preview/2023-01-01-preview/
     * examples/springbootservers_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: springbootservers_CreateOrUpdate_MinimumSet_Gen.
     * 
     * @param manager Entry point to SpringAppDiscoveryManager.
     */
    public static void springbootserversCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager manager) {
        manager.springbootservers().define("zkarbqnwnxeozvjrkpdqmgnwedwgtwcmmyqwaijkn").withExistingSpringbootsite(
            "rgspringbootservers", "hlkrzldhyobavtabgpubtjbhlslnjmsvkthwcfboriwyxndacjypzbj").create();
    }
}
