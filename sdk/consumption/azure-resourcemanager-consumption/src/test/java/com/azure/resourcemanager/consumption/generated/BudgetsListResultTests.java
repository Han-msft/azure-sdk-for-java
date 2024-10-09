// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.models.BudgetsListResult;

public final class BudgetsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BudgetsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"category\":\"Cost\",\"timeGrain\":\"BillingAnnual\",\"timePeriod\":{\"startDate\":\"2021-03-19T19:19:25Z\",\"endDate\":\"2021-07-18T09:47:03Z\"},\"filter\":{\"and\":[{},{},{},{}],\"dimensions\":{\"name\":\"lovmclwhijcoe\",\"operator\":\"In\",\"values\":[\"bzaqsqsycbkbfk\",\"ukdkexxppofmxa\",\"c\",\"jpgd\"]},\"tags\":{\"name\":\"ocjjxhvpmouexh\",\"operator\":\"In\",\"values\":[\"i\",\"qeojnxqbzvddntw\",\"deicbtwnpzao\"]}},\"currentSpend\":{\"unit\":\"rhcffcydd\"},\"notifications\":{\"a\":{\"enabled\":true,\"operator\":\"GreaterThan\",\"contactEmails\":[\"jqkwpyeicx\"],\"contactRoles\":[\"iwqvhkh\",\"xuigdtopbobj\"],\"contactGroups\":[\"m\"],\"thresholdType\":\"Actual\",\"locale\":\"nb-no\"},\"zevgb\":{\"enabled\":true,\"operator\":\"EqualTo\",\"contactEmails\":[\"ayvvtpgvdf\"],\"contactRoles\":[\"tkftutqxlngx\",\"efgugnxk\",\"xdqmidtthzrvqdra\",\"hjybigehoqfbo\"],\"contactGroups\":[\"anyktzlcuiywg\",\"ywgndrv\",\"nhzgpphrcgyn\",\"ocpecfvmmco\"],\"thresholdType\":\"Forecasted\",\"locale\":\"fr-fr\"},\"zxdpnqbqqw\":{\"enabled\":true,\"operator\":\"GreaterThanOrEqualTo\",\"contactEmails\":[\"abcypmivk\",\"lzu\"],\"contactRoles\":[\"fwnfnb\"],\"contactGroups\":[\"ionle\",\"x\"],\"thresholdType\":\"Actual\",\"locale\":\"en-us\"}},\"forecastSpend\":{\"unit\":\"eallnwsubisnj\"}},\"eTag\":\"pmng\",\"id\":\"zscxaqwo\",\"name\":\"chcbonqvpkvlrxnj\",\"type\":\"ase\"},{\"properties\":{\"category\":\"Cost\",\"timeGrain\":\"BillingAnnual\",\"timePeriod\":{\"startDate\":\"2021-04-09T12:47:30Z\",\"endDate\":\"2021-04-05T14:36:27Z\"},\"filter\":{\"and\":[{}],\"dimensions\":{\"name\":\"y\",\"operator\":\"In\",\"values\":[\"jbdlwtgrhpdjpju\"]},\"tags\":{\"name\":\"sxazjpq\",\"operator\":\"In\",\"values\":[\"ualhbxxhejj\"]}},\"currentSpend\":{\"unit\":\"udgwdslfho\"},\"notifications\":{\"dyggdtjixhbku\":{\"enabled\":true,\"operator\":\"GreaterThanOrEqualTo\",\"contactEmails\":[\"pwlbjnpg\",\"cftadeh\",\"nltyfsoppusuesnz\"],\"contactRoles\":[\"jbavorxzdm\"],\"contactGroups\":[\"tbqvudw\",\"dndnvow\",\"ujjugwdkcglh\"],\"thresholdType\":\"Actual\",\"locale\":\"ko-kr\"}},\"forecastSpend\":{\"unit\":\"e\"}},\"eTag\":\"hmenevfyexfwhybc\",\"id\":\"bvyvdcsity\",\"name\":\"naamde\",\"type\":\"tehfiqscjeypvh\"}],\"nextLink\":\"rkgqhcjrefo\"}")
            .toObject(BudgetsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BudgetsListResult model = new BudgetsListResult();
        model = BinaryData.fromObject(model).toObject(BudgetsListResult.class);
    }
}
