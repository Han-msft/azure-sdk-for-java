// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Specific Databases to restore.
 */
@Fluent
public final class DatabaseRestoreResource implements JsonSerializable<DatabaseRestoreResource> {
    /*
     * The name of the database available for restore.
     */
    private String databaseName;

    /*
     * The names of the collections available for restore.
     */
    private List<String> collectionNames;

    /**
     * Creates an instance of DatabaseRestoreResource class.
     */
    public DatabaseRestoreResource() {
    }

    /**
     * Get the databaseName property: The name of the database available for restore.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the database available for restore.
     * 
     * @param databaseName the databaseName value to set.
     * @return the DatabaseRestoreResource object itself.
     */
    public DatabaseRestoreResource withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the collectionNames property: The names of the collections available for restore.
     * 
     * @return the collectionNames value.
     */
    public List<String> collectionNames() {
        return this.collectionNames;
    }

    /**
     * Set the collectionNames property: The names of the collections available for restore.
     * 
     * @param collectionNames the collectionNames value to set.
     * @return the DatabaseRestoreResource object itself.
     */
    public DatabaseRestoreResource withCollectionNames(List<String> collectionNames) {
        this.collectionNames = collectionNames;
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
        jsonWriter.writeStringField("databaseName", this.databaseName);
        jsonWriter.writeArrayField("collectionNames", this.collectionNames,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseRestoreResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseRestoreResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DatabaseRestoreResource.
     */
    public static DatabaseRestoreResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseRestoreResource deserializedDatabaseRestoreResource = new DatabaseRestoreResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("databaseName".equals(fieldName)) {
                    deserializedDatabaseRestoreResource.databaseName = reader.getString();
                } else if ("collectionNames".equals(fieldName)) {
                    List<String> collectionNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedDatabaseRestoreResource.collectionNames = collectionNames;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseRestoreResource;
        });
    }
}
