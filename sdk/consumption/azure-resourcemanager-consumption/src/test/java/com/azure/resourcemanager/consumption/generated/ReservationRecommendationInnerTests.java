// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationInner;

public final class ReservationRecommendationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationRecommendationInner model = BinaryData.fromString(
            "{\"kind\":\"ReservationRecommendation\",\"etag\":\"ag\",\"tags\":{\"itc\":\"imjwosyt\",\"ekkezzikhlyfjh\":\"kfcktqum\"},\"location\":\"qgge\",\"sku\":\"unygaeqid\",\"id\":\"qfatpxllrxcyjm\",\"name\":\"a\",\"type\":\"su\"}")
            .toObject(ReservationRecommendationInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationRecommendationInner model = new ReservationRecommendationInner();
        model = BinaryData.fromObject(model).toObject(ReservationRecommendationInner.class);
    }
}
