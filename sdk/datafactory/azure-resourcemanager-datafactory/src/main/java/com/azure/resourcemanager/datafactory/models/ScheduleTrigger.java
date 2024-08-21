// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.ScheduleTriggerTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Trigger that creates pipeline runs periodically, on schedule.
 */
@Fluent
public final class ScheduleTrigger extends MultiplePipelineTrigger {
    /*
     * Trigger type.
     */
    private String type = "ScheduleTrigger";

    /*
     * Schedule Trigger properties.
     */
    private ScheduleTriggerTypeProperties innerTypeProperties = new ScheduleTriggerTypeProperties();

    /*
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     */
    private TriggerRuntimeState runtimeState;

    /**
     * Creates an instance of ScheduleTrigger class.
     */
    public ScheduleTrigger() {
    }

    /**
     * Get the type property: Trigger type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Schedule Trigger properties.
     * 
     * @return the innerTypeProperties value.
     */
    private ScheduleTriggerTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the runtimeState property: Indicates if trigger is running or not. Updated when Start/Stop APIs are called on
     * the Trigger.
     * 
     * @return the runtimeState value.
     */
    @Override
    public TriggerRuntimeState runtimeState() {
        return this.runtimeState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleTrigger withPipelines(List<TriggerPipelineReference> pipelines) {
        super.withPipelines(pipelines);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleTrigger withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScheduleTrigger withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the recurrence property: Recurrence schedule configuration.
     * 
     * @return the recurrence value.
     */
    public ScheduleTriggerRecurrence recurrence() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().recurrence();
    }

    /**
     * Set the recurrence property: Recurrence schedule configuration.
     * 
     * @param recurrence the recurrence value to set.
     * @return the ScheduleTrigger object itself.
     */
    public ScheduleTrigger withRecurrence(ScheduleTriggerRecurrence recurrence) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ScheduleTriggerTypeProperties();
        }
        this.innerTypeProperties().withRecurrence(recurrence);
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
                    "Missing required property innerTypeProperties in model ScheduleTrigger"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScheduleTrigger.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeArrayField("pipelines", pipelines(), (writer, element) -> writer.writeJson(element));
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
     * Reads an instance of ScheduleTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduleTrigger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScheduleTrigger.
     */
    public static ScheduleTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduleTrigger deserializedScheduleTrigger = new ScheduleTrigger();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedScheduleTrigger.withDescription(reader.getString());
                } else if ("runtimeState".equals(fieldName)) {
                    deserializedScheduleTrigger.runtimeState = TriggerRuntimeState.fromString(reader.getString());
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedScheduleTrigger.withAnnotations(annotations);
                } else if ("pipelines".equals(fieldName)) {
                    List<TriggerPipelineReference> pipelines
                        = reader.readArray(reader1 -> TriggerPipelineReference.fromJson(reader1));
                    deserializedScheduleTrigger.withPipelines(pipelines);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedScheduleTrigger.innerTypeProperties = ScheduleTriggerTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedScheduleTrigger.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedScheduleTrigger.withAdditionalProperties(additionalProperties);

            return deserializedScheduleTrigger;
        });
    }
}
