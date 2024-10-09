// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.iotcentral.IotCentralManager;
import com.azure.resourcemanager.iotcentral.models.App;
import com.azure.resourcemanager.iotcentral.models.AppSku;
import com.azure.resourcemanager.iotcentral.models.NetworkAction;
import com.azure.resourcemanager.iotcentral.models.PublicNetworkAccess;
import com.azure.resourcemanager.iotcentral.models.SystemAssignedServiceIdentityType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AppsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"applicationId\":\"txmedj\",\"displayName\":\"slynqwwnc\",\"subdomain\":\"zhxgktrmgucn\",\"template\":\"kteo\",\"state\":\"created\",\"publicNetworkAccess\":\"Enabled\",\"networkRuleSets\":{\"applyToDevices\":false,\"applyToIoTCentral\":true,\"defaultAction\":\"Deny\",\"ipRules\":[{\"action\":\"Allow\",\"filterName\":\"eopzfqrhhuaopp\",\"ipMask\":\"qeqxo\"}]},\"privateEndpointConnections\":[{\"properties\":{\"groupIds\":[\"xcto\",\"gbkdmoizpos\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"fbunrmfqjhhk\",\"name\":\"bpvjymjhx\",\"type\":\"j\"},{\"properties\":{\"groupIds\":[\"divkrt\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Deleting\"},\"id\":\"zvszj\",\"name\":\"auvjfdxxivet\",\"type\":\"t\"},{\"properties\":{\"groupIds\":[\"tdo\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"vwvxyslqbhsfx\",\"name\":\"blytk\",\"type\":\"lmpewwwfbkr\"}]},\"sku\":{\"name\":\"ST0\"},\"identity\":{\"principalId\":\"cd28888c-6987-4e94-a53e-f04d534fcb6b\",\"tenantId\":\"98f5c50c-80db-400f-801c-be7cff6d4e66\",\"type\":\"SystemAssigned\"},\"location\":\"q\",\"tags\":{\"sbfov\":\"xc\"},\"id\":\"srruvwbhsqfsubcg\",\"name\":\"birx\",\"type\":\"pybsrfbjfdtw\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        IotCentralManager manager = IotCentralManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<App> response = manager.apps().listByResourceGroup("gvpgy", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("q", response.iterator().next().location());
        Assertions.assertEquals("xc", response.iterator().next().tags().get("sbfov"));
        Assertions.assertEquals(AppSku.ST0, response.iterator().next().sku().name());
        Assertions.assertEquals(SystemAssignedServiceIdentityType.SYSTEM_ASSIGNED,
            response.iterator().next().identity().type());
        Assertions.assertEquals("slynqwwnc", response.iterator().next().displayName());
        Assertions.assertEquals("zhxgktrmgucn", response.iterator().next().subdomain());
        Assertions.assertEquals("kteo", response.iterator().next().template());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals(false, response.iterator().next().networkRuleSets().applyToDevices());
        Assertions.assertEquals(true, response.iterator().next().networkRuleSets().applyToIoTCentral());
        Assertions.assertEquals(NetworkAction.DENY, response.iterator().next().networkRuleSets().defaultAction());
        Assertions.assertEquals("eopzfqrhhuaopp",
            response.iterator().next().networkRuleSets().ipRules().get(0).filterName());
        Assertions.assertEquals("qeqxo", response.iterator().next().networkRuleSets().ipRules().get(0).ipMask());
    }
}
