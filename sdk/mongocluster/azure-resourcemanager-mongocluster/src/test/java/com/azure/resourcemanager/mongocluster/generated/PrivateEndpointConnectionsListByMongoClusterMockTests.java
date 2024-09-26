// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mongocluster.MongoClusterManager;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListByMongoClusterMockTests {
    @Test
    public void testListByMongoCluster() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"groupIds\":[\"zbinjeputtm\",\"ywnuzoq\",\"tiyqzrnkcqv\"],\"privateEndpoint\":{\"id\":\"whzlsicohoq\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"lryav\",\"actionsRequired\":\"heun\"},\"provisioningState\":\"Failed\"},\"id\":\"gyxzk\",\"name\":\"noc\",\"type\":\"koklya\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MongoClusterManager manager = MongoClusterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateEndpointConnectionResource> response = manager.privateEndpointConnections()
            .listByMongoCluster("agalpbuxwgipwhon", "wkgshwa", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            response.iterator().next().properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("lryav",
            response.iterator().next().properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("heun",
            response.iterator().next().properties().privateLinkServiceConnectionState().actionsRequired());
    }
}
