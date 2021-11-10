// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import java.util.HashMap;
import java.util.Map;

/** Samples for PrivateLinkHubs CreateOrUpdate. */
public final class PrivateLinkHubsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Create or update a privateLinkHub.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void createOrUpdateAPrivateLinkHub(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .privateLinkHubs()
            .define("privateLinkHub1")
            .withRegion("East US")
            .withExistingResourceGroup("resourceGroup1")
            .withTags(mapOf("key", "value"))
            .create();
    }

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
