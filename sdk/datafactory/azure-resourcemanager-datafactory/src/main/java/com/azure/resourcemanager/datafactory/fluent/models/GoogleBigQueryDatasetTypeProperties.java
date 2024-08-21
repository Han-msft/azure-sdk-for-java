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
 * Google BigQuery Dataset Properties.
 */
@Fluent
public final class GoogleBigQueryDatasetTypeProperties
    implements JsonSerializable<GoogleBigQueryDatasetTypeProperties> {
    /*
     * This property will be retired. Please consider using database + table properties instead.
     */
    private Object tableName;

    /*
     * The table name of the Google BigQuery. Type: string (or Expression with resultType string).
     */
    private Object table;

    /*
     * The database name of the Google BigQuery. Type: string (or Expression with resultType string).
     */
    private Object dataset;

    /**
     * Creates an instance of GoogleBigQueryDatasetTypeProperties class.
     */
    public GoogleBigQueryDatasetTypeProperties() {
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using database + table properties
     * instead.
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using database + table properties
     * instead.
     * 
     * @param tableName the tableName value to set.
     * @return the GoogleBigQueryDatasetTypeProperties object itself.
     */
    public GoogleBigQueryDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table property: The table name of the Google BigQuery. Type: string (or Expression with resultType
     * string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The table name of the Google BigQuery. Type: string (or Expression with resultType
     * string).
     * 
     * @param table the table value to set.
     * @return the GoogleBigQueryDatasetTypeProperties object itself.
     */
    public GoogleBigQueryDatasetTypeProperties withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the dataset property: The database name of the Google BigQuery. Type: string (or Expression with resultType
     * string).
     * 
     * @return the dataset value.
     */
    public Object dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: The database name of the Google BigQuery. Type: string (or Expression with resultType
     * string).
     * 
     * @param dataset the dataset value to set.
     * @return the GoogleBigQueryDatasetTypeProperties object itself.
     */
    public GoogleBigQueryDatasetTypeProperties withDataset(Object dataset) {
        this.dataset = dataset;
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
        jsonWriter.writeUntypedField("table", this.table);
        jsonWriter.writeUntypedField("dataset", this.dataset);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GoogleBigQueryDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GoogleBigQueryDatasetTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GoogleBigQueryDatasetTypeProperties.
     */
    public static GoogleBigQueryDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GoogleBigQueryDatasetTypeProperties deserializedGoogleBigQueryDatasetTypeProperties
                = new GoogleBigQueryDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedGoogleBigQueryDatasetTypeProperties.tableName = reader.readUntyped();
                } else if ("table".equals(fieldName)) {
                    deserializedGoogleBigQueryDatasetTypeProperties.table = reader.readUntyped();
                } else if ("dataset".equals(fieldName)) {
                    deserializedGoogleBigQueryDatasetTypeProperties.dataset = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGoogleBigQueryDatasetTypeProperties;
        });
    }
}
