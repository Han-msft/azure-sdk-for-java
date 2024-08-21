// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackageDebugSettings;
import com.azure.resourcemanager.datafactory.models.DataFlowSourceSetting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugPackageDebugSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugPackageDebugSettings model = BinaryData.fromString(
            "{\"sourceSettings\":[{\"sourceName\":\"z\",\"rowLimit\":470619426,\"\":{\"pkt\":\"dataedmurrxxge\",\"cgwgcloxoebqinji\":\"dataqylkmqpzoyhlf\",\"qlafcbahhpzpofoi\":\"datanwjfu\",\"kholvd\":\"datajwpfilkm\"}},{\"sourceName\":\"viauogphua\",\"rowLimit\":1965289703,\"\":{\"xjqirwrweoox\":\"dataukyefchnmnahmnxh\",\"ozqvbubqmam\":\"datafifhxwrsnew\",\"taboidvmf\":\"datasycxhxzgaz\"}}],\"parameters\":{\"mtdherngb\":\"datapubowsepdfg\"},\"datasetParameters\":\"datajuahokqto\"}")
            .toObject(DataFlowDebugPackageDebugSettings.class);
        Assertions.assertEquals("z", model.sourceSettings().get(0).sourceName());
        Assertions.assertEquals(470619426, model.sourceSettings().get(0).rowLimit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugPackageDebugSettings model = new DataFlowDebugPackageDebugSettings()
            .withSourceSettings(Arrays.asList(
                new DataFlowSourceSetting().withSourceName("z")
                    .withRowLimit(470619426)
                    .withAdditionalProperties(mapOf()),
                new DataFlowSourceSetting().withSourceName("viauogphua")
                    .withRowLimit(1965289703)
                    .withAdditionalProperties(mapOf())))
            .withParameters(mapOf("mtdherngb", "datapubowsepdfg"))
            .withDatasetParameters("datajuahokqto");
        model = BinaryData.fromObject(model).toObject(DataFlowDebugPackageDebugSettings.class);
        Assertions.assertEquals("z", model.sourceSettings().get(0).sourceName());
        Assertions.assertEquals(470619426, model.sourceSettings().get(0).rowLimit());
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
