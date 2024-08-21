// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Informix table dataset properties.
 */
@Fluent
public final class InformixTableDatasetTypeProperties implements JsonSerializable<InformixTableDatasetTypeProperties> {
    /*
     * The Informix table name. Type: string (or Expression with resultType string).
     */
    private Object tableName;

    /**
     * Creates an instance of InformixTableDatasetTypeProperties class.
     */
    public InformixTableDatasetTypeProperties() {
    }

    /**
     * Get the tableName property: The Informix table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The Informix table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the InformixTableDatasetTypeProperties object itself.
     */
    public InformixTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
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
        jsonWriter.writeUntypedField("tableName", this.tableName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InformixTableDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InformixTableDatasetTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InformixTableDatasetTypeProperties.
     */
    public static InformixTableDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InformixTableDatasetTypeProperties deserializedInformixTableDatasetTypeProperties
                = new InformixTableDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedInformixTableDatasetTypeProperties.tableName = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInformixTableDatasetTypeProperties;
        });
    }
}
