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
 * Db2 table dataset properties.
 */
@Fluent
public final class Db2TableDatasetTypeProperties implements JsonSerializable<Db2TableDatasetTypeProperties> {
    /*
     * This property will be retired. Please consider using schema + table properties instead.
     */
    private Object tableName;

    /*
     * The Db2 schema name. Type: string (or Expression with resultType string).
     */
    private Object schema;

    /*
     * The Db2 table name. Type: string (or Expression with resultType string).
     */
    private Object table;

    /**
     * Creates an instance of Db2TableDatasetTypeProperties class.
     */
    public Db2TableDatasetTypeProperties() {
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @param tableName the tableName value to set.
     * @return the Db2TableDatasetTypeProperties object itself.
     */
    public Db2TableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the schema property: The Db2 schema name. Type: string (or Expression with resultType string).
     * 
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: The Db2 schema name. Type: string (or Expression with resultType string).
     * 
     * @param schema the schema value to set.
     * @return the Db2TableDatasetTypeProperties object itself.
     */
    public Db2TableDatasetTypeProperties withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the table property: The Db2 table name. Type: string (or Expression with resultType string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The Db2 table name. Type: string (or Expression with resultType string).
     * 
     * @param table the table value to set.
     * @return the Db2TableDatasetTypeProperties object itself.
     */
    public Db2TableDatasetTypeProperties withTable(Object table) {
        this.table = table;
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
        jsonWriter.writeUntypedField("schema", this.schema);
        jsonWriter.writeUntypedField("table", this.table);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Db2TableDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Db2TableDatasetTypeProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the Db2TableDatasetTypeProperties.
     */
    public static Db2TableDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Db2TableDatasetTypeProperties deserializedDb2TableDatasetTypeProperties
                = new Db2TableDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedDb2TableDatasetTypeProperties.tableName = reader.readUntyped();
                } else if ("schema".equals(fieldName)) {
                    deserializedDb2TableDatasetTypeProperties.schema = reader.readUntyped();
                } else if ("table".equals(fieldName)) {
                    deserializedDb2TableDatasetTypeProperties.table = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDb2TableDatasetTypeProperties;
        });
    }
}
