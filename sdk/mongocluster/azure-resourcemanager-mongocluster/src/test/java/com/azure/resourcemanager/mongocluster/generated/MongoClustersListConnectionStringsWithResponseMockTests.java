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
import com.azure.resourcemanager.mongocluster.models.ListConnectionStringsResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MongoClustersListConnectionStringsWithResponseMockTests {
    @Test
    public void testListConnectionStringsWithResponse() throws Exception {
        String responseStr
            = "{\"connectionStrings\":[{\"connectionString\":\"hbkuofqwey\",\"description\":\"menevfyexfwh\",\"name\":\"cibvyvdcsitynn\"},{\"connectionString\":\"mdectehfiqscjey\",\"description\":\"hezrkgq\",\"name\":\"jrefovgmkqsle\"},{\"connectionString\":\"vxyqjpkcattpngjc\",\"description\":\"czsqpjhvm\",\"name\":\"jvnysounqe\"},{\"connectionString\":\"noae\",\"description\":\"fhyhltrpmopjmcma\",\"name\":\"okth\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MongoClusterManager manager = MongoClusterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ListConnectionStringsResult response = manager.mongoClusters()
            .listConnectionStringsWithResponse("owgujjugwdkcglhs", "azjdyggd", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
