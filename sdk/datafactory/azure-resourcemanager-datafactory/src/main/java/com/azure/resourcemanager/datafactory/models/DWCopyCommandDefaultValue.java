// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Default value.
 */
@Fluent
public final class DWCopyCommandDefaultValue implements JsonSerializable<DWCopyCommandDefaultValue> {
    /*
     * Column name. Type: object (or Expression with resultType string).
     */
    private Object columnName;

    /*
     * The default value of the column. Type: object (or Expression with resultType string).
     */
    private Object defaultValue;

    /**
     * Creates an instance of DWCopyCommandDefaultValue class.
     */
    public DWCopyCommandDefaultValue() {
    }

    /**
     * Get the columnName property: Column name. Type: object (or Expression with resultType string).
     * 
     * @return the columnName value.
     */
    public Object columnName() {
        return this.columnName;
    }

    /**
     * Set the columnName property: Column name. Type: object (or Expression with resultType string).
     * 
     * @param columnName the columnName value to set.
     * @return the DWCopyCommandDefaultValue object itself.
     */
    public DWCopyCommandDefaultValue withColumnName(Object columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Get the defaultValue property: The default value of the column. Type: object (or Expression with resultType
     * string).
     * 
     * @return the defaultValue value.
     */
    public Object defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the defaultValue property: The default value of the column. Type: object (or Expression with resultType
     * string).
     * 
     * @param defaultValue the defaultValue value to set.
     * @return the DWCopyCommandDefaultValue object itself.
     */
    public DWCopyCommandDefaultValue withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("columnName", this.columnName);
        jsonWriter.writeUntypedField("defaultValue", this.defaultValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DWCopyCommandDefaultValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DWCopyCommandDefaultValue if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DWCopyCommandDefaultValue.
     */
    public static DWCopyCommandDefaultValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DWCopyCommandDefaultValue deserializedDWCopyCommandDefaultValue = new DWCopyCommandDefaultValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("columnName".equals(fieldName)) {
                    deserializedDWCopyCommandDefaultValue.columnName = reader.readUntyped();
                } else if ("defaultValue".equals(fieldName)) {
                    deserializedDWCopyCommandDefaultValue.defaultValue = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDWCopyCommandDefaultValue;
        });
    }
}
