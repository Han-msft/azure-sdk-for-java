// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Activity model = BinaryData.fromString(
            "{\"type\":\"Activity\",\"name\":\"ljyxgtczhe\",\"description\":\"bsdshmkxmaehvbbx\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"n\",\"dependencyConditions\":[\"Succeeded\",\"Failed\"],\"\":{\"wrck\":\"datagx\",\"gzibthostgktstv\":\"datayklyhpluodpvruud\"}},{\"activity\":\"xeclzedqbcvhzlhp\",\"dependencyConditions\":[\"Skipped\",\"Failed\",\"Succeeded\"],\"\":{\"smlmbtxhwgfwsrta\":\"datawwqfbumlkxtrqj\",\"dyg\":\"datacoezbrhubskh\",\"fqjbvleo\":\"dataookk\",\"qybaryeua\":\"datafmluiqtqzfavyvn\"}},{\"activity\":\"jkqa\",\"dependencyConditions\":[\"Completed\",\"Skipped\"],\"\":{\"tiewdj\":\"dataesjcbhern\",\"ehwagoh\":\"datavbquwr\"}}],\"userProperties\":[{\"name\":\"fkmr\",\"value\":\"dataemvvhm\"}],\"\":{\"coebjvewzcj\":\"datarjfut\"}}")
            .toObject(Activity.class);
        Assertions.assertEquals("ljyxgtczhe", model.name());
        Assertions.assertEquals("bsdshmkxmaehvbbx", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("n", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("fkmr", model.userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Activity model
            = new Activity().withName("ljyxgtczhe")
                .withDescription("bsdshmkxmaehvbbx")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                .withDependsOn(Arrays.asList(
                    new ActivityDependency().withActivity("n")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.FAILED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("xeclzedqbcvhzlhp")
                        .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.FAILED,
                            DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("jkqa")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.SKIPPED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("fkmr").withValue("dataemvvhm")))
                .withAdditionalProperties(mapOf("type", "Activity"));
        model = BinaryData.fromObject(model).toObject(Activity.class);
        Assertions.assertEquals("ljyxgtczhe", model.name());
        Assertions.assertEquals("bsdshmkxmaehvbbx", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("n", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("fkmr", model.userProperties().get(0).name());
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
