// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicenetworking.TrafficControllerManager;
import com.azure.resourcemanager.servicenetworking.models.Frontend;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FrontendsInterfacesListByTrafficControllerMockTests {
    @Test
    public void testListByTrafficController() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"fqdn\":\"rts\",\"provisioningState\":\"Updating\"},\"location\":\"kdeemaofmxagkvtm\",\"tags\":{\"aquhcdhm\":\"qkrhahvljua\",\"rcrgvx\":\"ualaexqpvfadmw\",\"fmisg\":\"vgomz\",\"ali\":\"bnbbeldawkz\"},\"id\":\"urqhaka\",\"name\":\"hashsfwxosow\",\"type\":\"xcug\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        TrafficControllerManager manager = TrafficControllerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Frontend> response = manager.frontendsInterfaces()
            .listByTrafficController("kafkuwbcrnwbm", "hhseyv", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kdeemaofmxagkvtm", response.iterator().next().location());
        Assertions.assertEquals("qkrhahvljua", response.iterator().next().tags().get("aquhcdhm"));
    }
}
