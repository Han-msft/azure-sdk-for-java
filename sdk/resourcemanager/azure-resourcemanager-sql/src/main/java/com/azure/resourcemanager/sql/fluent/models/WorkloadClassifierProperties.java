// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Workload classifier definition. For more information look at sys.workload_management_workload_classifiers (DMV).
 */
@Fluent
public final class WorkloadClassifierProperties implements JsonSerializable<WorkloadClassifierProperties> {
    /*
     * The workload classifier member name.
     */
    private String memberName;

    /*
     * The workload classifier label.
     */
    private String label;

    /*
     * The workload classifier context.
     */
    private String context;

    /*
     * The workload classifier start time for classification.
     */
    private String startTime;

    /*
     * The workload classifier end time for classification.
     */
    private String endTime;

    /*
     * The workload classifier importance.
     */
    private String importance;

    /**
     * Creates an instance of WorkloadClassifierProperties class.
     */
    public WorkloadClassifierProperties() {
    }

    /**
     * Get the memberName property: The workload classifier member name.
     * 
     * @return the memberName value.
     */
    public String memberName() {
        return this.memberName;
    }

    /**
     * Set the memberName property: The workload classifier member name.
     * 
     * @param memberName the memberName value to set.
     * @return the WorkloadClassifierProperties object itself.
     */
    public WorkloadClassifierProperties withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get the label property: The workload classifier label.
     * 
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: The workload classifier label.
     * 
     * @param label the label value to set.
     * @return the WorkloadClassifierProperties object itself.
     */
    public WorkloadClassifierProperties withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the context property: The workload classifier context.
     * 
     * @return the context value.
     */
    public String context() {
        return this.context;
    }

    /**
     * Set the context property: The workload classifier context.
     * 
     * @param context the context value to set.
     * @return the WorkloadClassifierProperties object itself.
     */
    public WorkloadClassifierProperties withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get the startTime property: The workload classifier start time for classification.
     * 
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The workload classifier start time for classification.
     * 
     * @param startTime the startTime value to set.
     * @return the WorkloadClassifierProperties object itself.
     */
    public WorkloadClassifierProperties withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The workload classifier end time for classification.
     * 
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The workload classifier end time for classification.
     * 
     * @param endTime the endTime value to set.
     * @return the WorkloadClassifierProperties object itself.
     */
    public WorkloadClassifierProperties withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the importance property: The workload classifier importance.
     * 
     * @return the importance value.
     */
    public String importance() {
        return this.importance;
    }

    /**
     * Set the importance property: The workload classifier importance.
     * 
     * @param importance the importance value to set.
     * @return the WorkloadClassifierProperties object itself.
     */
    public WorkloadClassifierProperties withImportance(String importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (memberName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property memberName in model WorkloadClassifierProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkloadClassifierProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("memberName", this.memberName);
        jsonWriter.writeStringField("label", this.label);
        jsonWriter.writeStringField("context", this.context);
        jsonWriter.writeStringField("startTime", this.startTime);
        jsonWriter.writeStringField("endTime", this.endTime);
        jsonWriter.writeStringField("importance", this.importance);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadClassifierProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadClassifierProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkloadClassifierProperties.
     */
    public static WorkloadClassifierProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadClassifierProperties deserializedWorkloadClassifierProperties = new WorkloadClassifierProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("memberName".equals(fieldName)) {
                    deserializedWorkloadClassifierProperties.memberName = reader.getString();
                } else if ("label".equals(fieldName)) {
                    deserializedWorkloadClassifierProperties.label = reader.getString();
                } else if ("context".equals(fieldName)) {
                    deserializedWorkloadClassifierProperties.context = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    deserializedWorkloadClassifierProperties.startTime = reader.getString();
                } else if ("endTime".equals(fieldName)) {
                    deserializedWorkloadClassifierProperties.endTime = reader.getString();
                } else if ("importance".equals(fieldName)) {
                    deserializedWorkloadClassifierProperties.importance = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadClassifierProperties;
        });
    }
}
