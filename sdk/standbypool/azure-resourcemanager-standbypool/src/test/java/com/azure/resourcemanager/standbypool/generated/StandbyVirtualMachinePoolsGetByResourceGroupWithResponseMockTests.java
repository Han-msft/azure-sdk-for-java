// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.standbypool.StandbyPoolManager;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResource;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StandbyVirtualMachinePoolsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":6053350952914955236,\"minReadyCapacity\":5121289277423210616},\"virtualMachineState\":\"Running\",\"attachedVirtualMachineScaleSetId\":\"md\",\"provisioningState\":\"Deleting\"},\"location\":\"alpbuxwgipwhon\",\"tags\":{\"injep\":\"gshwankixz\",\"iyqzrnk\":\"ttmrywnuzoqf\"},\"id\":\"qvyxlwhzlsicoho\",\"name\":\"qnwvlrya\",\"type\":\"w\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StandbyPoolManager manager = StandbyPoolManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        StandbyVirtualMachinePoolResource response = manager.standbyVirtualMachinePools()
            .getByResourceGroupWithResponse("jttgzf", "ishc", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("alpbuxwgipwhon", response.location());
        Assertions.assertEquals("gshwankixz", response.tags().get("injep"));
        Assertions.assertEquals(6053350952914955236L, response.properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(5121289277423210616L, response.properties().elasticityProfile().minReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.RUNNING, response.properties().virtualMachineState());
        Assertions.assertEquals("md", response.properties().attachedVirtualMachineScaleSetId());
    }
}
