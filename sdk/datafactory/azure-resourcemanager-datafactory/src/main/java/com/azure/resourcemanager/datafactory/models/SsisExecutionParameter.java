// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SSIS execution parameter.
 */
@Fluent
public final class SsisExecutionParameter implements JsonSerializable<SsisExecutionParameter> {
    /*
     * SSIS package execution parameter value. Type: string (or Expression with resultType string).
     */
    private Object value;

    /**
     * Creates an instance of SsisExecutionParameter class.
     */
    public SsisExecutionParameter() {
    }

    /**
     * Get the value property: SSIS package execution parameter value. Type: string (or Expression with resultType
     * string).
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: SSIS package execution parameter value. Type: string (or Expression with resultType
     * string).
     * 
     * @param value the value value to set.
     * @return the SsisExecutionParameter object itself.
     */
    public SsisExecutionParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model SsisExecutionParameter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SsisExecutionParameter.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SsisExecutionParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SsisExecutionParameter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SsisExecutionParameter.
     */
    public static SsisExecutionParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SsisExecutionParameter deserializedSsisExecutionParameter = new SsisExecutionParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedSsisExecutionParameter.value = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSsisExecutionParameter;
        });
    }
}
