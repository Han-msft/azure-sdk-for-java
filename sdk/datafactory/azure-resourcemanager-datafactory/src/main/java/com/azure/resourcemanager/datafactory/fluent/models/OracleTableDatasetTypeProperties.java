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
 * On-premises Oracle dataset properties.
 */
@Fluent
public final class OracleTableDatasetTypeProperties implements JsonSerializable<OracleTableDatasetTypeProperties> {
    /*
     * This property will be retired. Please consider using schema + table properties instead.
     */
    private Object tableName;

    /*
     * The schema name of the on-premises Oracle database. Type: string (or Expression with resultType string).
     */
    private Object schema;

    /*
     * The table name of the on-premises Oracle database. Type: string (or Expression with resultType string).
     */
    private Object table;

    /**
     * Creates an instance of OracleTableDatasetTypeProperties class.
     */
    public OracleTableDatasetTypeProperties() {
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
     * @return the OracleTableDatasetTypeProperties object itself.
     */
    public OracleTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the schema property: The schema name of the on-premises Oracle database. Type: string (or Expression with
     * resultType string).
     * 
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: The schema name of the on-premises Oracle database. Type: string (or Expression with
     * resultType string).
     * 
     * @param schema the schema value to set.
     * @return the OracleTableDatasetTypeProperties object itself.
     */
    public OracleTableDatasetTypeProperties withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the table property: The table name of the on-premises Oracle database. Type: string (or Expression with
     * resultType string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The table name of the on-premises Oracle database. Type: string (or Expression with
     * resultType string).
     * 
     * @param table the table value to set.
     * @return the OracleTableDatasetTypeProperties object itself.
     */
    public OracleTableDatasetTypeProperties withTable(Object table) {
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
     * Reads an instance of OracleTableDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OracleTableDatasetTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OracleTableDatasetTypeProperties.
     */
    public static OracleTableDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OracleTableDatasetTypeProperties deserializedOracleTableDatasetTypeProperties
                = new OracleTableDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedOracleTableDatasetTypeProperties.tableName = reader.readUntyped();
                } else if ("schema".equals(fieldName)) {
                    deserializedOracleTableDatasetTypeProperties.schema = reader.readUntyped();
                } else if ("table".equals(fieldName)) {
                    deserializedOracleTableDatasetTypeProperties.table = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOracleTableDatasetTypeProperties;
        });
    }
}
