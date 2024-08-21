// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.BigDataPoolParametrizationReference;
import com.azure.resourcemanager.datafactory.models.BigDataPoolReferenceType;
import com.azure.resourcemanager.datafactory.models.ConfigurationType;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.NotebookParameter;
import com.azure.resourcemanager.datafactory.models.NotebookParameterType;
import com.azure.resourcemanager.datafactory.models.NotebookReferenceType;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationParametrizationReference;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationReferenceType;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookActivity;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SynapseNotebookActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SynapseNotebookActivity model = BinaryData.fromString(
            "{\"type\":\"SynapseNotebook\",\"typeProperties\":{\"notebook\":{\"type\":\"NotebookReference\",\"referenceName\":\"datafroynfloam\"},\"sparkPool\":{\"type\":\"BigDataPoolReference\",\"referenceName\":\"datafiivgdsnrknikp\"},\"parameters\":{\"hmfbzkfehrslvofn\":{\"value\":\"dataqnxyloyclrle\",\"type\":\"float\"},\"ahsqo\":{\"value\":\"datawsuroddohng\",\"type\":\"float\"},\"kdmnvaibh\":{\"value\":\"dataandslrndius\",\"type\":\"bool\"},\"ssweznzfdext\":{\"value\":\"datajg\",\"type\":\"string\"}},\"executorSize\":\"datarnhpxzjk\",\"conf\":\"datavzpcecisnhtds\",\"driverSize\":\"datanigohafud\",\"numExecutors\":\"datao\",\"configurationType\":\"Default\",\"targetSparkConfiguration\":{\"type\":\"SparkConfigurationReference\",\"referenceName\":\"dataqgrcnf\"},\"sparkConfig\":{\"vfzl\":\"datagjvl\",\"j\":\"dataugxpugetw\"}},\"linkedServiceName\":{\"referenceName\":\"dddvfnqazvavsp\",\"parameters\":{\"lkyrssyy\":\"dataaytzkdqimumaijcu\",\"rvrx\":\"dataedzhnyl\",\"jsqazecdomjrrolw\":\"datakpl\"}},\"policy\":{\"timeout\":\"datacaqxstykusfqmgj\",\"retry\":\"dataiqejvpdrcnoe\",\"retryIntervalInSeconds\":730397817,\"secureInput\":true,\"secureOutput\":true,\"\":{\"zyycev\":\"datar\",\"y\":\"dataazwewhobxlk\",\"nuxvyalkcuozwow\":\"dataspidcnxjfgx\",\"qlb\":\"datamulqgaeqnlx\"}},\"name\":\"ezcwfscxkrzuze\",\"description\":\"vxmkzg\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"sgebw\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"yahurxtpuyuradf\":\"dataguplzdoamqkdwag\",\"ivkmdfwfzkocdj\":\"datawjounvfqyk\",\"rbphtllkpkcqzbvy\":\"dataj\"}},{\"activity\":\"vfx\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\"],\"\":{\"ypevfrbujltg\":\"dataxrjidxio\",\"as\":\"datahgyl\",\"mhknsknnnpyo\":\"datawhbmo\"}}],\"userProperties\":[{\"name\":\"nyqsdsuewfgrijd\",\"value\":\"datakmcrtmvtfeyopg\"},{\"name\":\"iwebmcizmggvsxv\",\"value\":\"datawrqywaagzaxqh\"},{\"name\":\"erkyimcfmdhwtlli\",\"value\":\"datacyxcluvj\"}],\"\":{\"hshcjgoobltoar\":\"datajpld\",\"fsmabuur\":\"datacntgqyqwmzzcgbg\",\"hf\":\"datauqwvybxmu\"}}")
            .toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("ezcwfscxkrzuze", model.name());
        Assertions.assertEquals("vxmkzg", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("sgebw", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nyqsdsuewfgrijd", model.userProperties().get(0).name());
        Assertions.assertEquals("dddvfnqazvavsp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(730397817, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.FLOAT, model.parameters().get("hmfbzkfehrslvofn").type());
        Assertions.assertEquals(ConfigurationType.DEFAULT, model.configurationType());
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE,
            model.targetSparkConfiguration().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SynapseNotebookActivity model = new SynapseNotebookActivity().withName("ezcwfscxkrzuze")
            .withDescription("vxmkzg")
            .withState(ActivityState.ACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("sgebw")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("vfx")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(
                Arrays.asList(new UserProperty().withName("nyqsdsuewfgrijd").withValue("datakmcrtmvtfeyopg"),
                    new UserProperty().withName("iwebmcizmggvsxv").withValue("datawrqywaagzaxqh"),
                    new UserProperty().withName("erkyimcfmdhwtlli").withValue("datacyxcluvj")))
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("dddvfnqazvavsp")
                    .withParameters(mapOf("lkyrssyy", "dataaytzkdqimumaijcu", "rvrx", "dataedzhnyl", "jsqazecdomjrrolw",
                        "datakpl")))
            .withPolicy(new ActivityPolicy().withTimeout("datacaqxstykusfqmgj")
                .withRetry("dataiqejvpdrcnoe")
                .withRetryIntervalInSeconds(730397817)
                .withSecureInput(true)
                .withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withNotebook(new SynapseNotebookReference().withType(NotebookReferenceType.NOTEBOOK_REFERENCE)
                .withReferenceName("datafroynfloam"))
            .withSparkPool(
                new BigDataPoolParametrizationReference().withType(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE)
                    .withReferenceName("datafiivgdsnrknikp"))
            .withParameters(mapOf("hmfbzkfehrslvofn",
                new NotebookParameter().withValue("dataqnxyloyclrle").withType(NotebookParameterType.FLOAT), "ahsqo",
                new NotebookParameter().withValue("datawsuroddohng").withType(NotebookParameterType.FLOAT), "kdmnvaibh",
                new NotebookParameter().withValue("dataandslrndius").withType(NotebookParameterType.BOOL),
                "ssweznzfdext", new NotebookParameter().withValue("datajg").withType(NotebookParameterType.STRING)))
            .withExecutorSize("datarnhpxzjk")
            .withConf("datavzpcecisnhtds")
            .withDriverSize("datanigohafud")
            .withNumExecutors("datao")
            .withConfigurationType(ConfigurationType.DEFAULT)
            .withTargetSparkConfiguration(new SparkConfigurationParametrizationReference()
                .withType(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE)
                .withReferenceName("dataqgrcnf"))
            .withSparkConfig(mapOf("vfzl", "datagjvl", "j", "dataugxpugetw"));
        model = BinaryData.fromObject(model).toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("ezcwfscxkrzuze", model.name());
        Assertions.assertEquals("vxmkzg", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("sgebw", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nyqsdsuewfgrijd", model.userProperties().get(0).name());
        Assertions.assertEquals("dddvfnqazvavsp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(730397817, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.FLOAT, model.parameters().get("hmfbzkfehrslvofn").type());
        Assertions.assertEquals(ConfigurationType.DEFAULT, model.configurationType());
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE,
            model.targetSparkConfiguration().type());
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
