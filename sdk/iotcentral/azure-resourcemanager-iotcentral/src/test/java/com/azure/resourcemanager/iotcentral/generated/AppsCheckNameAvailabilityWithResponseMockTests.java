// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.iotcentral.IotCentralManager;
import com.azure.resourcemanager.iotcentral.models.AppAvailabilityInfo;
import com.azure.resourcemanager.iotcentral.models.OperationInputs;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AppsCheckNameAvailabilityWithResponseMockTests {
    @Test
    public void testCheckNameAvailabilityWithResponse() throws Exception {
        String responseStr = "{\"nameAvailable\":false,\"reason\":\"oujmkcjhwqytj\",\"message\":\"bnw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        IotCentralManager manager = IotCentralManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AppAvailabilityInfo response = manager.apps()
            .checkNameAvailabilityWithResponse(new OperationInputs().withName("sotftpvj").withType("exilzznfqqnvwpmq"),
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
