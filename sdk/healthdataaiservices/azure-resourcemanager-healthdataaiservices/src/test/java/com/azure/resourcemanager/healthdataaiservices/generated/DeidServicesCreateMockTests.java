// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.healthdataaiservices.HealthDataAIServicesManager;
import com.azure.resourcemanager.healthdataaiservices.models.DeidService;
import com.azure.resourcemanager.healthdataaiservices.models.DeidServiceProperties;
import com.azure.resourcemanager.healthdataaiservices.models.ManagedServiceIdentity;
import com.azure.resourcemanager.healthdataaiservices.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.healthdataaiservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.healthdataaiservices.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DeidServicesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"serviceUrl\":\"ivkrtsw\",\"privateEndpointConnections\":[{\"properties\":{\"groupIds\":[\"zjf\",\"uvjfdxxive\",\"vtcqaqtdo\",\"mcbxvwvxysl\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"xoblytkbl\",\"name\":\"pe\",\"type\":\"wwfbkrvrnsvshq\"},{\"properties\":{\"groupIds\":[\"crsbfovasr\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Deleting\"},\"id\":\"hsqfsubcgjbirxbp\",\"name\":\"bsrfbj\",\"type\":\"dtws\"}],\"publicNetworkAccess\":\"Enabled\"},\"identity\":{\"principalId\":\"pvjzbe\",\"tenantId\":\"l\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"ruoujmk\":{\"principalId\":\"q\",\"clientId\":\"wpmqt\"},\"ewgdrjervn\":{\"principalId\":\"hwqytj\",\"clientId\":\"bnw\"},\"mifthnzdnd\":{\"principalId\":\"nqpeh\",\"clientId\":\"doy\"},\"bgycduiertgccym\":{\"principalId\":\"gnayqigynduh\",\"clientId\":\"hqlkthumaqo\"}}},\"location\":\"olpsslqlf\",\"tags\":{\"bglzpswi\":\"n\",\"cwyhzdxssa\":\"d\",\"od\":\"bzmnvdfznud\"},\"id\":\"xzb\",\"name\":\"cblylpstdbhhxsr\",\"type\":\"dzu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HealthDataAIServicesManager manager = HealthDataAIServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DeidService response = manager.deidServices()
            .define("it")
            .withRegion("wncwzzhxgktrmg")
            .withExistingResourceGroup("x")
            .withTags(mapOf("fqbuaceopzf", "apkteoellwptfdyg", "lzdahzxctobgbkdm", "rhhuaopppcqeqx", "grcfb", "izpost"))
            .withProperties(new DeidServiceProperties().withPublicNetworkAccess(PublicNetworkAccess.ENABLED))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("vbxwyjsflhh", new UserAssignedIdentity(), "jpkiidzyexznelix", new UserAssignedIdentity(),
                        "aulppggd", new UserAssignedIdentity(), "n", new UserAssignedIdentity())))
            .create();

        Assertions.assertEquals("olpsslqlf", response.location());
        Assertions.assertEquals("n", response.tags().get("bglzpswi"));
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.properties().publicNetworkAccess());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_AND_USER_ASSIGNED, response.identity().type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
