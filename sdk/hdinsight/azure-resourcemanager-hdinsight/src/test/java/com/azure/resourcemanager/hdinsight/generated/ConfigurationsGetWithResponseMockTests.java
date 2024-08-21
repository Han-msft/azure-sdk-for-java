// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConfigurationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr = "{\"ikjcjcazt\":\"kkum\",\"comlikytwvczc\":\"wsnsqowx\",\"ve\":\"wka\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HDInsightManager manager = HDInsightManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Map<String, String> response = manager.configurations()
            .getWithResponse("rhpw", "gddeimaw", "o", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("kkum", response.get("ikjcjcazt"));
    }
}
