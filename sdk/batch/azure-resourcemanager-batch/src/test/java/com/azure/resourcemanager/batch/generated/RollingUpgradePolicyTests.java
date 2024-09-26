// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.RollingUpgradePolicy;
import org.junit.jupiter.api.Assertions;

public final class RollingUpgradePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RollingUpgradePolicy model = BinaryData.fromString(
            "{\"enableCrossZoneUpgrade\":true,\"maxBatchInstancePercent\":9753041,\"maxUnhealthyInstancePercent\":1101350352,\"maxUnhealthyUpgradedInstancePercent\":1130868680,\"pauseTimeBetweenBatches\":\"ft\",\"prioritizeUnhealthyInstances\":false,\"rollbackFailedInstancesOnPolicyBreach\":false}")
            .toObject(RollingUpgradePolicy.class);
        Assertions.assertEquals(true, model.enableCrossZoneUpgrade());
        Assertions.assertEquals(9753041, model.maxBatchInstancePercent());
        Assertions.assertEquals(1101350352, model.maxUnhealthyInstancePercent());
        Assertions.assertEquals(1130868680, model.maxUnhealthyUpgradedInstancePercent());
        Assertions.assertEquals("ft", model.pauseTimeBetweenBatches());
        Assertions.assertEquals(false, model.prioritizeUnhealthyInstances());
        Assertions.assertEquals(false, model.rollbackFailedInstancesOnPolicyBreach());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RollingUpgradePolicy model = new RollingUpgradePolicy().withEnableCrossZoneUpgrade(true)
            .withMaxBatchInstancePercent(9753041)
            .withMaxUnhealthyInstancePercent(1101350352)
            .withMaxUnhealthyUpgradedInstancePercent(1130868680)
            .withPauseTimeBetweenBatches("ft")
            .withPrioritizeUnhealthyInstances(false)
            .withRollbackFailedInstancesOnPolicyBreach(false);
        model = BinaryData.fromObject(model).toObject(RollingUpgradePolicy.class);
        Assertions.assertEquals(true, model.enableCrossZoneUpgrade());
        Assertions.assertEquals(9753041, model.maxBatchInstancePercent());
        Assertions.assertEquals(1101350352, model.maxUnhealthyInstancePercent());
        Assertions.assertEquals(1130868680, model.maxUnhealthyUpgradedInstancePercent());
        Assertions.assertEquals("ft", model.pauseTimeBetweenBatches());
        Assertions.assertEquals(false, model.prioritizeUnhealthyInstances());
        Assertions.assertEquals(false, model.rollbackFailedInstancesOnPolicyBreach());
    }
}
