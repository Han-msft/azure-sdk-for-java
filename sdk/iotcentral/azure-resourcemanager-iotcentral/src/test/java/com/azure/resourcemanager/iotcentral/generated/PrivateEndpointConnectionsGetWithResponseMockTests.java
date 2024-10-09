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
import com.azure.resourcemanager.iotcentral.models.PrivateEndpointConnection;
import com.azure.resourcemanager.iotcentral.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupIds\":[\"vvcnayr\",\"yrnxxmueedn\",\"rdvstkwqqtch\"],\"privateEndpoint\":{\"id\":\"mfmtdaaygdvw\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"ohgwxrtfudxepxg\",\"actionsRequired\":\"agvrvmnpkuk\"},\"provisioningState\":\"Succeeded\"},\"id\":\"dblx\",\"name\":\"wi\",\"type\":\"fnjhfjxwmszkkfo\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        IotCentralManager manager = IotCentralManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.privateEndpointConnections()
            .getWithResponse("zikywgg", "kallatmel", "uipiccjzk", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ohgwxrtfudxepxg", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("agvrvmnpkuk", response.privateLinkServiceConnectionState().actionsRequired());
    }
}
