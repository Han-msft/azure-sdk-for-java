// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.models.RuntimeScriptActionDetail;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ScriptActionsListByClusterMockTests {
    @Test
    public void testListByCluster() throws Exception {
        String responseStr
            = "{\"value\":[{\"scriptExecutionId\":2665247310105497195,\"startTime\":\"xaeaovurexdnds\",\"endTime\":\"weaderzm\",\"status\":\"t\",\"operation\":\"agttm\",\"executionSummary\":[{\"status\":\"goaqylkjztj\",\"instanceCount\":1339575917},{\"status\":\"jcg\",\"instanceCount\":556812746},{\"status\":\"pfinzcpdltkrlg\",\"instanceCount\":408763108}],\"debugInformation\":\"drvcqguef\",\"name\":\"hompheqdurelyu\",\"uri\":\"lf\",\"parameters\":\"u\",\"roles\":[\"ckyeclcdigpta\",\"brzmqxucycijoclx\"],\"applicationName\":\"tgjcy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HDInsightManager manager = HDInsightManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<RuntimeScriptActionDetail> response
            = manager.scriptActions().listByCluster("lbnb", "xvhcs", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hompheqdurelyu", response.iterator().next().name());
        Assertions.assertEquals("lf", response.iterator().next().uri());
        Assertions.assertEquals("u", response.iterator().next().parameters());
        Assertions.assertEquals("ckyeclcdigpta", response.iterator().next().roles().get(0));
    }
}
