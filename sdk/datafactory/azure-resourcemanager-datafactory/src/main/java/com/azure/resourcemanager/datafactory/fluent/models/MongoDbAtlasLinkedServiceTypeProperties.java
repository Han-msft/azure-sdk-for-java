// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * MongoDB Atlas linked service properties.
 */
@Fluent
public final class MongoDbAtlasLinkedServiceTypeProperties
    implements JsonSerializable<MongoDbAtlasLinkedServiceTypeProperties> {
    /*
     * The MongoDB Atlas connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string,
     * SecureString or AzureKeyVaultSecretReference.
     */
    private Object connectionString;

    /*
     * The name of the MongoDB Atlas database that you want to access. Type: string (or Expression with resultType
     * string).
     */
    private Object database;

    /*
     * The driver version that you want to choose. Allowed value are v1 and v2. Type: string (or Expression with
     * resultType string).
     */
    private Object driverVersion;

    /**
     * Creates an instance of MongoDbAtlasLinkedServiceTypeProperties class.
     */
    public MongoDbAtlasLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the MongoDbAtlasLinkedServiceTypeProperties object itself.
     */
    public MongoDbAtlasLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: The name of the MongoDB Atlas database that you want to access. Type: string (or
     * Expression with resultType string).
     * 
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The name of the MongoDB Atlas database that you want to access. Type: string (or
     * Expression with resultType string).
     * 
     * @param database the database value to set.
     * @return the MongoDbAtlasLinkedServiceTypeProperties object itself.
     */
    public MongoDbAtlasLinkedServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the driverVersion property: The driver version that you want to choose. Allowed value are v1 and v2. Type:
     * string (or Expression with resultType string).
     * 
     * @return the driverVersion value.
     */
    public Object driverVersion() {
        return this.driverVersion;
    }

    /**
     * Set the driverVersion property: The driver version that you want to choose. Allowed value are v1 and v2. Type:
     * string (or Expression with resultType string).
     * 
     * @param driverVersion the driverVersion value to set.
     * @return the MongoDbAtlasLinkedServiceTypeProperties object itself.
     */
    public MongoDbAtlasLinkedServiceTypeProperties withDriverVersion(Object driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property connectionString in model MongoDbAtlasLinkedServiceTypeProperties"));
        }
        if (database() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property database in model MongoDbAtlasLinkedServiceTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbAtlasLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("connectionString", this.connectionString);
        jsonWriter.writeUntypedField("database", this.database);
        jsonWriter.writeUntypedField("driverVersion", this.driverVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoDbAtlasLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoDbAtlasLinkedServiceTypeProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MongoDbAtlasLinkedServiceTypeProperties.
     */
    public static MongoDbAtlasLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoDbAtlasLinkedServiceTypeProperties deserializedMongoDbAtlasLinkedServiceTypeProperties
                = new MongoDbAtlasLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionString".equals(fieldName)) {
                    deserializedMongoDbAtlasLinkedServiceTypeProperties.connectionString = reader.readUntyped();
                } else if ("database".equals(fieldName)) {
                    deserializedMongoDbAtlasLinkedServiceTypeProperties.database = reader.readUntyped();
                } else if ("driverVersion".equals(fieldName)) {
                    deserializedMongoDbAtlasLinkedServiceTypeProperties.driverVersion = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoDbAtlasLinkedServiceTypeProperties;
        });
    }
}
