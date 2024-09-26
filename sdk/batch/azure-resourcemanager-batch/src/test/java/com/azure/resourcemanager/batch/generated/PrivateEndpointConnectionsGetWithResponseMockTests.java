// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.models.PrivateEndpointConnection;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"privateEndpoint\":{\"id\":\"cunezzcezelfw\"},\"groupIds\":[\"lwxjwetn\"],\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"clafzvaylpt\",\"actionsRequired\":\"qqwzt\"}},\"etag\":\"w\",\"tags\":{\"exfdeqvhpsylk\":\"hcxwaxfewzjk\",\"ffmbmxzjrg\":\"shk\",\"jx\":\"wwp\"},\"id\":\"nptfujgi\",\"name\":\"gaao\",\"type\":\"pttaqutd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BatchManager manager = BatchManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.privateEndpointConnections()
            .getWithResponse("nktwfansnvpdibmi", "ostbzbkiwb", "qnyophzfyls", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("hcxwaxfewzjk", response.tags().get("exfdeqvhpsylk"));
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.PENDING,
            response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("clafzvaylpt", response.privateLinkServiceConnectionState().description());
    }
}
