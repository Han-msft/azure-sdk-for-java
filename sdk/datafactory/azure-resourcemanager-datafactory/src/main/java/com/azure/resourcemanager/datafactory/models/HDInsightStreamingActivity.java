// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightStreamingActivityTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * HDInsight streaming activity type.
 */
@Fluent
public final class HDInsightStreamingActivity extends ExecutionActivity {
    /*
     * Type of activity.
     */
    private String type = "HDInsightStreaming";

    /*
     * HDInsight streaming activity properties.
     */
    private HDInsightStreamingActivityTypeProperties innerTypeProperties
        = new HDInsightStreamingActivityTypeProperties();

    /**
     * Creates an instance of HDInsightStreamingActivity class.
     */
    public HDInsightStreamingActivity() {
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
     * Get the innerTypeProperties property: HDInsight streaming activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private HDInsightStreamingActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HDInsightStreamingActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the storageLinkedServices property: Storage linked service references.
     * 
     * @return the storageLinkedServices value.
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().storageLinkedServices();
    }

    /**
     * Set the storageLinkedServices property: Storage linked service references.
     * 
     * @param storageLinkedServices the storageLinkedServices value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withStorageLinkedServices(storageLinkedServices);
        return this;
    }

    /**
     * Get the arguments property: User specified arguments to HDInsightActivity.
     * 
     * @return the arguments value.
     */
    public List<Object> arguments() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().arguments();
    }

    /**
     * Set the arguments property: User specified arguments to HDInsightActivity.
     * 
     * @param arguments the arguments value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withArguments(List<Object> arguments) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withArguments(arguments);
        return this;
    }

    /**
     * Get the getDebugInfo property: Debug info option.
     * 
     * @return the getDebugInfo value.
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().getDebugInfo();
    }

    /**
     * Set the getDebugInfo property: Debug info option.
     * 
     * @param getDebugInfo the getDebugInfo value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withGetDebugInfo(getDebugInfo);
        return this;
    }

    /**
     * Get the mapper property: Mapper executable name. Type: string (or Expression with resultType string).
     * 
     * @return the mapper value.
     */
    public Object mapper() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().mapper();
    }

    /**
     * Set the mapper property: Mapper executable name. Type: string (or Expression with resultType string).
     * 
     * @param mapper the mapper value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withMapper(Object mapper) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withMapper(mapper);
        return this;
    }

    /**
     * Get the reducer property: Reducer executable name. Type: string (or Expression with resultType string).
     * 
     * @return the reducer value.
     */
    public Object reducer() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().reducer();
    }

    /**
     * Set the reducer property: Reducer executable name. Type: string (or Expression with resultType string).
     * 
     * @param reducer the reducer value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withReducer(Object reducer) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withReducer(reducer);
        return this;
    }

    /**
     * Get the input property: Input blob path. Type: string (or Expression with resultType string).
     * 
     * @return the input value.
     */
    public Object input() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().input();
    }

    /**
     * Set the input property: Input blob path. Type: string (or Expression with resultType string).
     * 
     * @param input the input value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withInput(Object input) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withInput(input);
        return this;
    }

    /**
     * Get the output property: Output blob path. Type: string (or Expression with resultType string).
     * 
     * @return the output value.
     */
    public Object output() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().output();
    }

    /**
     * Set the output property: Output blob path. Type: string (or Expression with resultType string).
     * 
     * @param output the output value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withOutput(Object output) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withOutput(output);
        return this;
    }

    /**
     * Get the filePaths property: Paths to streaming job files. Can be directories.
     * 
     * @return the filePaths value.
     */
    public List<Object> filePaths() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().filePaths();
    }

    /**
     * Set the filePaths property: Paths to streaming job files. Can be directories.
     * 
     * @param filePaths the filePaths value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withFilePaths(List<Object> filePaths) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withFilePaths(filePaths);
        return this;
    }

    /**
     * Get the fileLinkedService property: Linked service reference where the files are located.
     * 
     * @return the fileLinkedService value.
     */
    public LinkedServiceReference fileLinkedService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileLinkedService();
    }

    /**
     * Set the fileLinkedService property: Linked service reference where the files are located.
     * 
     * @param fileLinkedService the fileLinkedService value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withFileLinkedService(LinkedServiceReference fileLinkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withFileLinkedService(fileLinkedService);
        return this;
    }

    /**
     * Get the combiner property: Combiner executable name. Type: string (or Expression with resultType string).
     * 
     * @return the combiner value.
     */
    public Object combiner() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().combiner();
    }

    /**
     * Set the combiner property: Combiner executable name. Type: string (or Expression with resultType string).
     * 
     * @param combiner the combiner value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withCombiner(Object combiner) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withCombiner(combiner);
        return this;
    }

    /**
     * Get the commandEnvironment property: Command line environment values.
     * 
     * @return the commandEnvironment value.
     */
    public List<Object> commandEnvironment() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().commandEnvironment();
    }

    /**
     * Set the commandEnvironment property: Command line environment values.
     * 
     * @param commandEnvironment the commandEnvironment value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withCommandEnvironment(List<Object> commandEnvironment) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withCommandEnvironment(commandEnvironment);
        return this;
    }

    /**
     * Get the defines property: Allows user to specify defines for streaming job request.
     * 
     * @return the defines value.
     */
    public Map<String, Object> defines() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().defines();
    }

    /**
     * Set the defines property: Allows user to specify defines for streaming job request.
     * 
     * @param defines the defines value to set.
     * @return the HDInsightStreamingActivity object itself.
     */
    public HDInsightStreamingActivity withDefines(Map<String, Object> defines) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightStreamingActivityTypeProperties();
        }
        this.innerTypeProperties().withDefines(defines);
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
                    "Missing required property innerTypeProperties in model HDInsightStreamingActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HDInsightStreamingActivity.class);

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
     * Reads an instance of HDInsightStreamingActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HDInsightStreamingActivity if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HDInsightStreamingActivity.
     */
    public static HDInsightStreamingActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HDInsightStreamingActivity deserializedHDInsightStreamingActivity = new HDInsightStreamingActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity.withName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity.withDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity.withState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedHDInsightStreamingActivity.withDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedHDInsightStreamingActivity.withUserProperties(userProperties);
                } else if ("linkedServiceName".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity
                        .withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("policy".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity.withPolicy(ActivityPolicy.fromJson(reader));
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity.innerTypeProperties
                        = HDInsightStreamingActivityTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedHDInsightStreamingActivity.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedHDInsightStreamingActivity.withAdditionalProperties(additionalProperties);

            return deserializedHDInsightStreamingActivity;
        });
    }
}
