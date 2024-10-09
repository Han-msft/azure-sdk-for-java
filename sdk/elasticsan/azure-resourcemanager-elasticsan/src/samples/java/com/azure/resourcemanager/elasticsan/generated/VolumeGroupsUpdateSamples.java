// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.resourcemanager.elasticsan.models.Action;
import com.azure.resourcemanager.elasticsan.models.EncryptionIdentity;
import com.azure.resourcemanager.elasticsan.models.EncryptionProperties;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.Identity;
import com.azure.resourcemanager.elasticsan.models.IdentityType;
import com.azure.resourcemanager.elasticsan.models.KeyVaultProperties;
import com.azure.resourcemanager.elasticsan.models.NetworkRuleSet;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.azure.resourcemanager.elasticsan.models.UserAssignedIdentity;
import com.azure.resourcemanager.elasticsan.models.VirtualNetworkRule;
import com.azure.resourcemanager.elasticsan.models.VolumeGroup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for VolumeGroups Update.
 */
public final class VolumeGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2024-05-01/examples/
     * VolumeGroups_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Update_MaximumSet_Gen.
     * 
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsUpdateMaximumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        VolumeGroup resource = manager.volumeGroups()
            .getWithResponse("resourcegroupname", "elasticsanname", "volumegroupname", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withIdentity(new Identity().withType(IdentityType.NONE)
                .withUserAssignedIdentities(mapOf("key1006", new UserAssignedIdentity())))
            .withProtocolType(StorageTargetType.ISCSI)
            .withEncryption(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY)
            .withEncryptionProperties(new EncryptionProperties()
                .withKeyVaultProperties(new KeyVaultProperties().withKeyName("fakeTokenPlaceholder")
                    .withKeyVersion("fakeTokenPlaceholder")
                    .withKeyVaultUri("fakeTokenPlaceholder"))
                .withEncryptionIdentity(
                    new EncryptionIdentity().withEncryptionUserAssignedIdentity("gfhkfbozahmmwluqndfgxunssafa")))
            .withNetworkAcls(new NetworkRuleSet().withVirtualNetworkRules(
                Arrays.asList(new VirtualNetworkRule().withVirtualNetworkResourceId("bkhwaiqvvaguymsmnzzbzz")
                    .withAction(Action.ALLOW))))
            .withEnforceDataIntegrityCheckForIscsi(true)
            .apply();
    }

    /*
     * x-ms-original-file: specification/elasticsan/resource-manager/Microsoft.ElasticSan/stable/2024-05-01/examples/
     * VolumeGroups_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: VolumeGroups_Update_MinimumSet_Gen.
     * 
     * @param manager Entry point to ElasticSanManager.
     */
    public static void volumeGroupsUpdateMinimumSetGen(com.azure.resourcemanager.elasticsan.ElasticSanManager manager) {
        VolumeGroup resource = manager.volumeGroups()
            .getWithResponse("resourcegroupname", "elasticsanname", "volumegroupname", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
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
