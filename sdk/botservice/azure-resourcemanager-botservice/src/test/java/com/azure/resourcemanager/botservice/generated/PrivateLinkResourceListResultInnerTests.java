// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.botservice.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.botservice.models.PrivateLinkResource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"aetcktvfcivfs\",\"requiredMembers\":[\"m\",\"ctq\",\"jf\",\"ebrjcxe\"],\"requiredZoneNames\":[\"wutttxfvjrbi\",\"phxepcyvahf\",\"ljkyqxjvuuj\",\"gidokgjljyoxgvcl\"]},\"id\":\"bgsncghkjeszzhb\",\"name\":\"jhtxfvgxbfsmxne\",\"type\":\"mpvecxgodebfqk\"},{\"properties\":{\"groupId\":\"mpukgriw\",\"requiredMembers\":[\"lfbxzpuzycisp\",\"qzahmgkbrp\",\"y\",\"hibnuqqkpika\"],\"requiredZoneNames\":[\"vtq\",\"gnbuy\",\"hijggme\"]},\"id\":\"fsiarbutr\",\"name\":\"vpnazzm\",\"type\":\"jrunmpxtt\"},{\"properties\":{\"groupId\":\"rbnlankxmyskp\",\"requiredMembers\":[\"nbtkcxywnytnr\",\"yn\",\"qidybyx\"],\"requiredZoneNames\":[\"clha\",\"xdbabphlwr\",\"lfktsths\",\"cocmnyyaztt\"]},\"id\":\"twwrqp\",\"name\":\"edckzywbiexzfey\",\"type\":\"eaxib\"}]}")
            .toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("wutttxfvjrbi", model.value().get(0).requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceListResultInner model = new PrivateLinkResourceListResultInner().withValue(Arrays.asList(
            new PrivateLinkResource()
                .withRequiredZoneNames(Arrays.asList("wutttxfvjrbi", "phxepcyvahf", "ljkyqxjvuuj", "gidokgjljyoxgvcl")),
            new PrivateLinkResource().withRequiredZoneNames(Arrays.asList("vtq", "gnbuy", "hijggme")),
            new PrivateLinkResource()
                .withRequiredZoneNames(Arrays.asList("clha", "xdbabphlwr", "lfktsths", "cocmnyyaztt"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResultInner.class);
        Assertions.assertEquals("wutttxfvjrbi", model.value().get(0).requiredZoneNames().get(0));
    }
}
