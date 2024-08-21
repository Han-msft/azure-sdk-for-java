// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.SynapseSparkJobActivityTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Execute spark job activity.
 */
@Fluent
public final class SynapseSparkJobDefinitionActivity extends ExecutionActivity {
    /*
     * Type of activity.
     */
    private String type = "SparkJob";

    /*
     * Execute spark job activity properties.
     */
    private SynapseSparkJobActivityTypeProperties innerTypeProperties = new SynapseSparkJobActivityTypeProperties();

    /**
     * Creates an instance of SynapseSparkJobDefinitionActivity class.
     */
    public SynapseSparkJobDefinitionActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Execute spark job activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SynapseSparkJobActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynapseSparkJobDefinitionActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the sparkJob property: Synapse spark job reference.
     * 
     * @return the sparkJob value.
     */
    public SynapseSparkJobReference sparkJob() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sparkJob();
    }

    /**
     * Set the sparkJob property: Synapse spark job reference.
     * 
     * @param sparkJob the sparkJob value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withSparkJob(SynapseSparkJobReference sparkJob) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withSparkJob(sparkJob);
        return this;
    }

    /**
     * Get the arguments property: User specified arguments to SynapseSparkJobDefinitionActivity.
     * 
     * @return the arguments value.
     */
    public List<Object> arguments() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().arguments();
    }

    /**
     * Set the arguments property: User specified arguments to SynapseSparkJobDefinitionActivity.
     * 
     * @param arguments the arguments value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withArguments(List<Object> arguments) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withArguments(arguments);
        return this;
    }

    /**
     * Get the file property: The main file used for the job, which will override the 'file' of the spark job definition
     * you provide. Type: string (or Expression with resultType string).
     * 
     * @return the file value.
     */
    public Object file() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().file();
    }

    /**
     * Set the file property: The main file used for the job, which will override the 'file' of the spark job definition
     * you provide. Type: string (or Expression with resultType string).
     * 
     * @param file the file value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withFile(Object file) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withFile(file);
        return this;
    }

    /**
     * Get the scanFolder property: Scanning subfolders from the root folder of the main definition file, these files
     * will be added as reference files. The folders named 'jars', 'pyFiles', 'files' or 'archives' will be scanned, and
     * the folders name are case sensitive. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the scanFolder value.
     */
    public Object scanFolder() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scanFolder();
    }

    /**
     * Set the scanFolder property: Scanning subfolders from the root folder of the main definition file, these files
     * will be added as reference files. The folders named 'jars', 'pyFiles', 'files' or 'archives' will be scanned, and
     * the folders name are case sensitive. Type: boolean (or Expression with resultType boolean).
     * 
     * @param scanFolder the scanFolder value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withScanFolder(Object scanFolder) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withScanFolder(scanFolder);
        return this;
    }

    /**
     * Get the className property: The fully-qualified identifier or the main class that is in the main definition file,
     * which will override the 'className' of the spark job definition you provide. Type: string (or Expression with
     * resultType string).
     * 
     * @return the className value.
     */
    public Object className() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().className();
    }

    /**
     * Set the className property: The fully-qualified identifier or the main class that is in the main definition file,
     * which will override the 'className' of the spark job definition you provide. Type: string (or Expression with
     * resultType string).
     * 
     * @param className the className value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withClassName(Object className) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withClassName(className);
        return this;
    }

    /**
     * Get the files property: (Deprecated. Please use pythonCodeReference and filesV2) Additional files used for
     * reference in the main definition file, which will override the 'files' of the spark job definition you provide.
     * 
     * @return the files value.
     */
    public List<Object> files() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().files();
    }

    /**
     * Set the files property: (Deprecated. Please use pythonCodeReference and filesV2) Additional files used for
     * reference in the main definition file, which will override the 'files' of the spark job definition you provide.
     * 
     * @param files the files value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withFiles(List<Object> files) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withFiles(files);
        return this;
    }

    /**
     * Get the pythonCodeReference property: Additional python code files used for reference in the main definition
     * file, which will override the 'pyFiles' of the spark job definition you provide.
     * 
     * @return the pythonCodeReference value.
     */
    public List<Object> pythonCodeReference() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().pythonCodeReference();
    }

    /**
     * Set the pythonCodeReference property: Additional python code files used for reference in the main definition
     * file, which will override the 'pyFiles' of the spark job definition you provide.
     * 
     * @param pythonCodeReference the pythonCodeReference value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withPythonCodeReference(List<Object> pythonCodeReference) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withPythonCodeReference(pythonCodeReference);
        return this;
    }

    /**
     * Get the filesV2 property: Additional files used for reference in the main definition file, which will override
     * the 'jars' and 'files' of the spark job definition you provide.
     * 
     * @return the filesV2 value.
     */
    public List<Object> filesV2() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().filesV2();
    }

    /**
     * Set the filesV2 property: Additional files used for reference in the main definition file, which will override
     * the 'jars' and 'files' of the spark job definition you provide.
     * 
     * @param filesV2 the filesV2 value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withFilesV2(List<Object> filesV2) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withFilesV2(filesV2);
        return this;
    }

    /**
     * Get the targetBigDataPool property: The name of the big data pool which will be used to execute the spark batch
     * job, which will override the 'targetBigDataPool' of the spark job definition you provide.
     * 
     * @return the targetBigDataPool value.
     */
    public BigDataPoolParametrizationReference targetBigDataPool() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().targetBigDataPool();
    }

    /**
     * Set the targetBigDataPool property: The name of the big data pool which will be used to execute the spark batch
     * job, which will override the 'targetBigDataPool' of the spark job definition you provide.
     * 
     * @param targetBigDataPool the targetBigDataPool value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity
        withTargetBigDataPool(BigDataPoolParametrizationReference targetBigDataPool) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withTargetBigDataPool(targetBigDataPool);
        return this;
    }

    /**
     * Get the executorSize property: Number of core and memory to be used for executors allocated in the specified
     * Spark pool for the job, which will be used for overriding 'executorCores' and 'executorMemory' of the spark job
     * definition you provide. Type: string (or Expression with resultType string).
     * 
     * @return the executorSize value.
     */
    public Object executorSize() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().executorSize();
    }

    /**
     * Set the executorSize property: Number of core and memory to be used for executors allocated in the specified
     * Spark pool for the job, which will be used for overriding 'executorCores' and 'executorMemory' of the spark job
     * definition you provide. Type: string (or Expression with resultType string).
     * 
     * @param executorSize the executorSize value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withExecutorSize(Object executorSize) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withExecutorSize(executorSize);
        return this;
    }

    /**
     * Get the conf property: Spark configuration properties, which will override the 'conf' of the spark job definition
     * you provide.
     * 
     * @return the conf value.
     */
    public Object conf() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().conf();
    }

    /**
     * Set the conf property: Spark configuration properties, which will override the 'conf' of the spark job definition
     * you provide.
     * 
     * @param conf the conf value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withConf(Object conf) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withConf(conf);
        return this;
    }

    /**
     * Get the driverSize property: Number of core and memory to be used for driver allocated in the specified Spark
     * pool for the job, which will be used for overriding 'driverCores' and 'driverMemory' of the spark job definition
     * you provide. Type: string (or Expression with resultType string).
     * 
     * @return the driverSize value.
     */
    public Object driverSize() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().driverSize();
    }

    /**
     * Set the driverSize property: Number of core and memory to be used for driver allocated in the specified Spark
     * pool for the job, which will be used for overriding 'driverCores' and 'driverMemory' of the spark job definition
     * you provide. Type: string (or Expression with resultType string).
     * 
     * @param driverSize the driverSize value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withDriverSize(Object driverSize) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withDriverSize(driverSize);
        return this;
    }

    /**
     * Get the numExecutors property: Number of executors to launch for this job, which will override the 'numExecutors'
     * of the spark job definition you provide. Type: integer (or Expression with resultType integer).
     * 
     * @return the numExecutors value.
     */
    public Object numExecutors() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().numExecutors();
    }

    /**
     * Set the numExecutors property: Number of executors to launch for this job, which will override the 'numExecutors'
     * of the spark job definition you provide. Type: integer (or Expression with resultType integer).
     * 
     * @param numExecutors the numExecutors value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withNumExecutors(Object numExecutors) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withNumExecutors(numExecutors);
        return this;
    }

    /**
     * Get the configurationType property: The type of the spark config.
     * 
     * @return the configurationType value.
     */
    public ConfigurationType configurationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().configurationType();
    }

    /**
     * Set the configurationType property: The type of the spark config.
     * 
     * @param configurationType the configurationType value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withConfigurationType(ConfigurationType configurationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withConfigurationType(configurationType);
        return this;
    }

    /**
     * Get the targetSparkConfiguration property: The spark configuration of the spark job.
     * 
     * @return the targetSparkConfiguration value.
     */
    public SparkConfigurationParametrizationReference targetSparkConfiguration() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().targetSparkConfiguration();
    }

    /**
     * Set the targetSparkConfiguration property: The spark configuration of the spark job.
     * 
     * @param targetSparkConfiguration the targetSparkConfiguration value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity
        withTargetSparkConfiguration(SparkConfigurationParametrizationReference targetSparkConfiguration) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withTargetSparkConfiguration(targetSparkConfiguration);
        return this;
    }

    /**
     * Get the sparkConfig property: Spark configuration property.
     * 
     * @return the sparkConfig value.
     */
    public Map<String, Object> sparkConfig() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sparkConfig();
    }

    /**
     * Set the sparkConfig property: Spark configuration property.
     * 
     * @param sparkConfig the sparkConfig value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity withSparkConfig(Map<String, Object> sparkConfig) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SynapseSparkJobActivityTypeProperties();
        }
        this.innerTypeProperties().withSparkConfig(sparkConfig);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model SynapseSparkJobDefinitionActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SynapseSparkJobDefinitionActivity.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("state", state() == null ? null : state().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            onInactiveMarkAs() == null ? null : onInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", dependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", userProperties(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("linkedServiceName", linkedServiceName());
        jsonWriter.writeJsonField("policy", policy());
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SynapseSparkJobDefinitionActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SynapseSparkJobDefinitionActivity if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SynapseSparkJobDefinitionActivity.
     */
    public static SynapseSparkJobDefinitionActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SynapseSparkJobDefinitionActivity deserializedSynapseSparkJobDefinitionActivity
                = new SynapseSparkJobDefinitionActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity.withName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity.withDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity
                        .withState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedSynapseSparkJobDefinitionActivity.withDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedSynapseSparkJobDefinitionActivity.withUserProperties(userProperties);
                } else if ("linkedServiceName".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity
                        .withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("policy".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity.withPolicy(ActivityPolicy.fromJson(reader));
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity.innerTypeProperties
                        = SynapseSparkJobActivityTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedSynapseSparkJobDefinitionActivity.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSynapseSparkJobDefinitionActivity.withAdditionalProperties(additionalProperties);

            return deserializedSynapseSparkJobDefinitionActivity;
        });
    }
}
