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

/**
 * Cosmos DB Cassandra table partition key.
 */
@Fluent
public final class CassandraPartitionKey implements JsonSerializable<CassandraPartitionKey> {
    /*
     * Name of the Cosmos DB Cassandra table partition key
     */
    private String name;

    /**
     * Creates an instance of CassandraPartitionKey class.
     */
    public CassandraPartitionKey() {
    }

    /**
     * Get the name property: Name of the Cosmos DB Cassandra table partition key.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Cosmos DB Cassandra table partition key.
     * 
     * @param name the name value to set.
     * @return the CassandraPartitionKey object itself.
     */
    public CassandraPartitionKey withName(String name) {
        this.name = name;
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
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CassandraPartitionKey from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CassandraPartitionKey if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CassandraPartitionKey.
     */
    public static CassandraPartitionKey fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CassandraPartitionKey deserializedCassandraPartitionKey = new CassandraPartitionKey();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCassandraPartitionKey.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCassandraPartitionKey;
        });
    }
}
