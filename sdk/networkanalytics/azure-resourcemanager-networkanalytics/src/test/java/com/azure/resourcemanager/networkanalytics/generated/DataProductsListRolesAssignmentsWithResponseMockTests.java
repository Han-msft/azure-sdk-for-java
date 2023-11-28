// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager;
import com.azure.resourcemanager.networkanalytics.models.DataProductUserRole;
import com.azure.resourcemanager.networkanalytics.models.ListRoleAssignments;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DataProductsListRolesAssignmentsWithResponseMockTests {
    @Test
    public void testListRolesAssignmentsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"count\":611656940,\"roleAssignmentResponse\":[{\"roleId\":\"psiebtfhvpes\",\"principalId\":\"pskrdqmh\",\"userName\":\"jdhtldwkyzxu\",\"dataTypeScope\":[\"kn\",\"ws\"],\"principalType\":\"wsvlxotogtwrupqs\",\"role\":\"Reader\",\"roleAssignmentId\":\"nmic\"},{\"roleId\":\"kvceoveilovnotyf\",\"principalId\":\"fcnj\",\"userName\":\"k\",\"dataTypeScope\":[\"x\",\"hbttkphyw\"],\"principalType\":\"nv\",\"role\":\"Reader\",\"roleAssignmentId\":\"oqnermclfpl\"},{\"roleId\":\"hoxus\",\"principalId\":\"rpabg\",\"userName\":\"epsbjtazqu\",\"dataTypeScope\":[\"ywpmueefjzwfqkq\",\"jidsuyonobglaoc\",\"xtccmg\",\"udxytlmoyrx\"],\"principalType\":\"wfudwpzntxhdzhl\",\"role\":\"Reader\",\"roleAssignmentId\":\"jbhckfrlhr\"},{\"roleId\":\"sbkyvpycanuzbp\",\"principalId\":\"kafkuwbcrnwbm\",\"userName\":\"hhseyv\",\"dataTypeScope\":[\"srtslhspkdeem\"],\"principalType\":\"ofmxagkvtmelmqkr\",\"role\":\"SensitiveReader\",\"roleAssignmentId\":\"hvljuahaquh\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        NetworkAnalyticsManager manager = NetworkAnalyticsManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        ListRoleAssignments response = manager.dataProducts().listRolesAssignmentsWithResponse("wiyighxpkdw",
            "baiuebbaumny", "dataupedeojnabckhs", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(611656940, response.count());
        Assertions.assertEquals("psiebtfhvpes", response.roleAssignmentResponse().get(0).roleId());
        Assertions.assertEquals("pskrdqmh", response.roleAssignmentResponse().get(0).principalId());
        Assertions.assertEquals("jdhtldwkyzxu", response.roleAssignmentResponse().get(0).username());
        Assertions.assertEquals("kn", response.roleAssignmentResponse().get(0).dataTypeScope().get(0));
        Assertions.assertEquals("wsvlxotogtwrupqs", response.roleAssignmentResponse().get(0).principalType());
        Assertions.assertEquals(DataProductUserRole.READER, response.roleAssignmentResponse().get(0).role());
        Assertions.assertEquals("nmic", response.roleAssignmentResponse().get(0).roleAssignmentId());
    }
}
