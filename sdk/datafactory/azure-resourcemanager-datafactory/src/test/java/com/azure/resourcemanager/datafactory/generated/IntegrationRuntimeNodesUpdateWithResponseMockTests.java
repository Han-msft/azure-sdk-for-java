// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeNode;
import com.azure.resourcemanager.datafactory.models.UpdateIntegrationRuntimeNodeRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimeNodesUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"nodeName\":\"gwbavlgovgthpp\",\"machineName\":\"dn\",\"hostServiceUri\":\"a\",\"status\":\"InitializeFailed\",\"capabilities\":{\"cgap\":\"hvimstbyaklfvcir\",\"imnfvbfj\":\"yof\",\"yjdwdaocwqkxwoq\":\"vspxxbfqlfkwjiui\",\"nhrencxoktsdgnh\":\"ffnojiqtpbfc\"},\"versionStatus\":\"qcc\",\"version\":\"xxytmx\",\"registerTime\":\"2021-08-19T22:14:19Z\",\"lastConnectTime\":\"2021-08-26T08:29:30Z\",\"expiryTime\":\"2021-09-28T16:44:54Z\",\"lastStartTime\":\"2021-08-03T18:43:13Z\",\"lastStopTime\":\"2021-07-04T02:54:39Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-06-02T05:47:08Z\",\"lastEndUpdateTime\":\"2021-05-15T14:01:31Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":252084786,\"maxConcurrentJobs\":1910937514,\"\":{\"urjynezpewjxc\":\"datartnksl\",\"gi\":\"datavwnptmriqea\",\"vwhjf\":\"dataszgstqsrtz\",\"h\":\"dataoipstvcqhzejbro\"}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SelfHostedIntegrationRuntimeNode response = manager.integrationRuntimeNodes()
            .updateWithResponse("zrs", "sxncykfq", "bwes", "gqctrvfpg",
                new UpdateIntegrationRuntimeNodeRequest().withConcurrentJobsLimit(54879885),
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
