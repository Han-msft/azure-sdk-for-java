// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mongocluster.MongoClusterManager;
import com.azure.resourcemanager.mongocluster.models.FirewallRule;
import com.azure.resourcemanager.mongocluster.models.FirewallRuleProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FirewallRulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"startIpAddress\":\"nvudwtiukb\",\"endIpAddress\":\"dng\"},\"id\":\"ocipazyxoeg\",\"name\":\"kgjn\",\"type\":\"iucgygevqzn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MongoClusterManager manager = MongoClusterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FirewallRule response = manager.firewallRules()
            .define("eggzfb")
            .withExistingMongoCluster("onpc", "hocohslkev")
            .withProperties(new FirewallRuleProperties().withStartIpAddress("vfaxkffeiith").withEndIpAddress("vmezy"))
            .create();

        Assertions.assertEquals("nvudwtiukb", response.properties().startIpAddress());
        Assertions.assertEquals("dng", response.properties().endIpAddress());
    }
}
