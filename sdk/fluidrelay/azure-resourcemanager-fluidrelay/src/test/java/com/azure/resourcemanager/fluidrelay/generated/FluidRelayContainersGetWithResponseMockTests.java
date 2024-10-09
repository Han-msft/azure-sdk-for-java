// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.fluidrelay.FluidRelayManager;
import com.azure.resourcemanager.fluidrelay.models.FluidRelayContainer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FluidRelayContainersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"frsTenantId\":\"yb\",\"frsContainerId\":\"ehoqfbowskan\",\"provisioningState\":\"Failed\",\"creationTime\":\"2021-04-16T07:17:05Z\",\"lastAccessTime\":\"2021-08-28T08:23:16Z\"},\"id\":\"y\",\"name\":\"gqywgndrv\",\"type\":\"nhzgpphrcgyn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FluidRelayManager manager = FluidRelayManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FluidRelayContainer response = manager.fluidRelayContainers()
            .getWithResponse("utqxlngx", "efgugnxk", "xdqmidtthzrvqdra", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
