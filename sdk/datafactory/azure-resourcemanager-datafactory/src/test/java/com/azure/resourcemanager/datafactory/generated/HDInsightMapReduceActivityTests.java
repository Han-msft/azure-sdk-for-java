// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.HDInsightMapReduceActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightMapReduceActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightMapReduceActivity model = BinaryData.fromString(
            "{\"type\":\"HDInsightMapReduce\",\"typeProperties\":{\"storageLinkedServices\":[{\"referenceName\":\"elht\",\"parameters\":{\"cgdpqkfxdqmdvrgl\":\"dataeimwhot\",\"tmjuq\":\"datalvmkeseyq\",\"juwkkvarffjuefj\":\"dataahmzletac\",\"odmdrdtywa\":\"datamowq\"}},{\"referenceName\":\"qwa\",\"parameters\":{\"taqmrimletj\":\"dataapvcswzjrpcpgclt\"}},{\"referenceName\":\"zptfgabi\",\"parameters\":{\"wgszxupwriz\":\"datazfglp\",\"sjpq\":\"dataqnbiiand\"}}],\"arguments\":[\"dataku\",\"dataosltch\",\"datauhvdrfh\"],\"getDebugInfo\":\"Always\",\"className\":\"dataxhnojfdiijch\",\"jarFilePath\":\"dataaaabtxrhemnkyk\",\"jarLinkedService\":{\"referenceName\":\"uomwyoktzffpcd\",\"parameters\":{\"eqvkuvy\":\"datapz\",\"rfok\":\"datai\",\"bdh\":\"datalcoikstap\"}},\"jarLibs\":[\"dataugkugwtg\",\"dataktwayha\",\"datahqvxeyl\"],\"defines\":{\"cufzxxqd\":\"dataatbsghtk\",\"vqvernqk\":\"datatv\"}},\"linkedServiceName\":{\"referenceName\":\"yyysvtjoxw\",\"parameters\":{\"dwoevmocnfzmu\":\"datazwoczfizfcmpddz\",\"luwuns\":\"dataykxlfl\",\"mgpomcre\":\"datayqpmnyvn\",\"lilzv\":\"datataz\"}},\"policy\":{\"timeout\":\"datadnobxcdx\",\"retry\":\"dataraeodixofl\",\"retryIntervalInSeconds\":1228339310,\"secureInput\":false,\"secureOutput\":false,\"\":{\"rrwbcycwasmrfbw\":\"datacozfjsfrbjrbqc\",\"ovblx\":\"dataicmhhv\",\"kfzsouou\":\"dataylezgdpiurfemn\",\"qldgii\":\"datazszlrv\"}},\"name\":\"npkxp\",\"description\":\"utyjfhjhbvlljk\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"kbf\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Succeeded\"],\"\":{\"cvw\":\"datadrbtgmfpdre\",\"fdedeuphg\":\"databsdyxqjyrqouyf\"}},{\"activity\":\"f\",\"dependencyConditions\":[\"Succeeded\",\"Failed\"],\"\":{\"dhw\":\"dataeboelksghsowmvtm\",\"c\":\"datafbjhhpfj\"}},{\"activity\":\"l\",\"dependencyConditions\":[\"Failed\",\"Failed\"],\"\":{\"tldijg\":\"dataopecjmovrs\",\"iluzokxphcjtwh\":\"databitudwuoxir\",\"jmgctwamjjw\":\"datagb\"}},{\"activity\":\"mugis\",\"dependencyConditions\":[\"Completed\",\"Completed\",\"Completed\"],\"\":{\"tdyxzg\":\"dataopedmk\",\"rvkqxhkhj\":\"dataqtgfbmocvb\",\"yrqtu\":\"datarcqpxaajt\",\"ssbvlj\":\"datatzmubxngspazm\"}}],\"userProperties\":[{\"name\":\"be\",\"value\":\"datauhwcakkewgzao\"}],\"\":{\"vahqjdi\":\"datalqtjjewezcknpm\",\"ehudicxolmmhfd\":\"datajoldwa\",\"jqvmpzcjvogr\":\"datavxoiwb\",\"ydespwwkdmsnez\":\"dataipop\"}}")
            .toObject(HDInsightMapReduceActivity.class);
        Assertions.assertEquals("npkxp", model.name());
        Assertions.assertEquals("utyjfhjhbvlljk", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("kbf", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("be", model.userProperties().get(0).name());
        Assertions.assertEquals("yyysvtjoxw", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1228339310, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("elht", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.ALWAYS, model.getDebugInfo());
        Assertions.assertEquals("uomwyoktzffpcd", model.jarLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightMapReduceActivity model = new HDInsightMapReduceActivity().withName("npkxp")
            .withDescription("utyjfhjhbvlljk")
            .withState(ActivityState.INACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("kbf")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.SKIPPED,
                        DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("f")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("l")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.FAILED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("mugis")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                        DependencyCondition.COMPLETED, DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("be").withValue("datauhwcakkewgzao")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("yyysvtjoxw")
                .withParameters(mapOf("dwoevmocnfzmu", "datazwoczfizfcmpddz", "luwuns", "dataykxlfl", "mgpomcre",
                    "datayqpmnyvn", "lilzv", "datataz")))
            .withPolicy(new ActivityPolicy().withTimeout("datadnobxcdx")
                .withRetry("dataraeodixofl")
                .withRetryIntervalInSeconds(1228339310)
                .withSecureInput(false)
                .withSecureOutput(false)
                .withAdditionalProperties(mapOf()))
            .withStorageLinkedServices(Arrays.asList(
                new LinkedServiceReference().withReferenceName("elht")
                    .withParameters(mapOf("cgdpqkfxdqmdvrgl", "dataeimwhot", "tmjuq", "datalvmkeseyq",
                        "juwkkvarffjuefj", "dataahmzletac", "odmdrdtywa", "datamowq")),
                new LinkedServiceReference().withReferenceName("qwa")
                    .withParameters(mapOf("taqmrimletj", "dataapvcswzjrpcpgclt")),
                new LinkedServiceReference().withReferenceName("zptfgabi")
                    .withParameters(mapOf("wgszxupwriz", "datazfglp", "sjpq", "dataqnbiiand"))))
            .withArguments(Arrays.asList("dataku", "dataosltch", "datauhvdrfh"))
            .withGetDebugInfo(HDInsightActivityDebugInfoOption.ALWAYS)
            .withClassName("dataxhnojfdiijch")
            .withJarFilePath("dataaaabtxrhemnkyk")
            .withJarLinkedService(new LinkedServiceReference().withReferenceName("uomwyoktzffpcd")
                .withParameters(mapOf("eqvkuvy", "datapz", "rfok", "datai", "bdh", "datalcoikstap")))
            .withJarLibs(Arrays.asList("dataugkugwtg", "dataktwayha", "datahqvxeyl"))
            .withDefines(mapOf("cufzxxqd", "dataatbsghtk", "vqvernqk", "datatv"));
        model = BinaryData.fromObject(model).toObject(HDInsightMapReduceActivity.class);
        Assertions.assertEquals("npkxp", model.name());
        Assertions.assertEquals("utyjfhjhbvlljk", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("kbf", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("be", model.userProperties().get(0).name());
        Assertions.assertEquals("yyysvtjoxw", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1228339310, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("elht", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.ALWAYS, model.getDebugInfo());
        Assertions.assertEquals("uomwyoktzffpcd", model.jarLinkedService().referenceName());
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
