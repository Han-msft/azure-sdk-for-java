// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.consumption.ConsumptionManager;
import com.azure.resourcemanager.consumption.models.ReservationDetail;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReservationsDetailsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"reservationOrderId\":\"lgbhgauacdi\",\"instanceFlexibilityRatio\":\"xufrsryjqgdk\",\"instanceFlexibilityGroup\":\"ozo\",\"reservationId\":\"qb\",\"skuName\":\"h\",\"usageDate\":\"2021-12-06T13:45:13Z\",\"instanceId\":\"mqjch\",\"kind\":\"sf\"},\"etag\":\"mx\",\"tags\":{\"vf\":\"pzealbmqkyojw\",\"jcmmzrrscub\":\"mbtsuahxsg\",\"jxcjrmmuabwib\":\"wsdrnpxqwodif\",\"e\":\"jogjonmc\"},\"id\":\"oyzbamwineofvf\",\"name\":\"akpoldtvevbo\",\"type\":\"lz\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConsumptionManager manager = ConsumptionManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ReservationDetail> response = manager.reservationsDetails()
            .list("wqejpmvsse", "aepwamcxtcz", "upeuknijduyye", "pydjfboc", "v", "hulrtywikdmhla",
                com.azure.core.util.Context.NONE);

    }
}
