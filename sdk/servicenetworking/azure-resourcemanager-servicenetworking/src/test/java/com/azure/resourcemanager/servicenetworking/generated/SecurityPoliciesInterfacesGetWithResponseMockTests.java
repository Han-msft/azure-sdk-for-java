// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicenetworking.TrafficControllerManager;
import com.azure.resourcemanager.servicenetworking.models.SecurityPolicy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SecurityPoliciesInterfacesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"policyType\":\"waf\",\"wafPolicy\":{\"id\":\"eli\"},\"provisioningState\":\"Canceled\"},\"location\":\"ztfolhbnxk\",\"tags\":{\"pnapnyiropuh\":\"aulppggd\",\"git\":\"igvpgylg\"},\"id\":\"medjvcslynqwwncw\",\"name\":\"zhxgktrmgucn\",\"type\":\"pkteo\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        TrafficControllerManager manager = TrafficControllerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SecurityPolicy response = manager.securityPoliciesInterfaces()
            .getWithResponse("aalnjixi", "xyawj", "yaqcslyjpkiidz", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ztfolhbnxk", response.location());
        Assertions.assertEquals("aulppggd", response.tags().get("pnapnyiropuh"));
        Assertions.assertEquals("eli", response.properties().wafPolicy().id());
    }
}
