// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.AccessRule;
import com.azure.resourcemanager.batch.models.AccessRuleDirection;
import com.azure.resourcemanager.batch.models.AccessRuleProperties;
import com.azure.resourcemanager.batch.models.AccessRulePropertiesSubscriptionsItem;
import com.azure.resourcemanager.batch.models.NetworkSecurityPerimeter;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class AccessRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessRule model = BinaryData.fromString(
            "{\"name\":\"gzukxitmm\",\"properties\":{\"direction\":\"Outbound\",\"addressPrefixes\":[\"x\"],\"subscriptions\":[{\"id\":\"rxcpjuisavo\"}],\"networkSecurityPerimeters\":[{\"id\":\"fvazivjlfrqttba\",\"perimeterGuid\":\"94378cbc-6a02-46fe-b45a-1fcde6eabef3\",\"location\":\"atnwxyiopi\"}],\"fullyQualifiedDomainNames\":[\"qfkuvscxkdmli\",\"ovibrxkp\"],\"emailAddresses\":[\"azur\"],\"phoneNumbers\":[\"bgo\",\"rb\"]}}")
            .toObject(AccessRule.class);
        Assertions.assertEquals("gzukxitmm", model.name());
        Assertions.assertEquals(AccessRuleDirection.OUTBOUND, model.properties().direction());
        Assertions.assertEquals("x", model.properties().addressPrefixes().get(0));
        Assertions.assertEquals("rxcpjuisavo", model.properties().subscriptions().get(0).id());
        Assertions.assertEquals("fvazivjlfrqttba", model.properties().networkSecurityPerimeters().get(0).id());
        Assertions.assertEquals(UUID.fromString("94378cbc-6a02-46fe-b45a-1fcde6eabef3"),
            model.properties().networkSecurityPerimeters().get(0).perimeterGuid());
        Assertions.assertEquals("atnwxyiopi", model.properties().networkSecurityPerimeters().get(0).location());
        Assertions.assertEquals("qfkuvscxkdmli", model.properties().fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("azur", model.properties().emailAddresses().get(0));
        Assertions.assertEquals("bgo", model.properties().phoneNumbers().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessRule model = new AccessRule().withName("gzukxitmm")
            .withProperties(new AccessRuleProperties().withDirection(AccessRuleDirection.OUTBOUND)
                .withAddressPrefixes(Arrays.asList("x"))
                .withSubscriptions(Arrays.asList(new AccessRulePropertiesSubscriptionsItem().withId("rxcpjuisavo")))
                .withNetworkSecurityPerimeters(Arrays.asList(new NetworkSecurityPerimeter().withId("fvazivjlfrqttba")
                    .withPerimeterGuid(UUID.fromString("94378cbc-6a02-46fe-b45a-1fcde6eabef3"))
                    .withLocation("atnwxyiopi")))
                .withFullyQualifiedDomainNames(Arrays.asList("qfkuvscxkdmli", "ovibrxkp"))
                .withEmailAddresses(Arrays.asList("azur"))
                .withPhoneNumbers(Arrays.asList("bgo", "rb")));
        model = BinaryData.fromObject(model).toObject(AccessRule.class);
        Assertions.assertEquals("gzukxitmm", model.name());
        Assertions.assertEquals(AccessRuleDirection.OUTBOUND, model.properties().direction());
        Assertions.assertEquals("x", model.properties().addressPrefixes().get(0));
        Assertions.assertEquals("rxcpjuisavo", model.properties().subscriptions().get(0).id());
        Assertions.assertEquals("fvazivjlfrqttba", model.properties().networkSecurityPerimeters().get(0).id());
        Assertions.assertEquals(UUID.fromString("94378cbc-6a02-46fe-b45a-1fcde6eabef3"),
            model.properties().networkSecurityPerimeters().get(0).perimeterGuid());
        Assertions.assertEquals("atnwxyiopi", model.properties().networkSecurityPerimeters().get(0).location());
        Assertions.assertEquals("qfkuvscxkdmli", model.properties().fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("azur", model.properties().emailAddresses().get(0));
        Assertions.assertEquals("bgo", model.properties().phoneNumbers().get(0));
    }
}
