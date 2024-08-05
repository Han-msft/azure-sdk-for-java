// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.CassandraTableResource;
import com.azure.resourcemanager.cosmos.models.CreateUpdateOptions;
import java.io.IOException;

/**
 * Properties to create and update Azure Cosmos DB Cassandra table.
 */
@Fluent
public final class CassandraTableCreateUpdateProperties
    implements JsonSerializable<CassandraTableCreateUpdateProperties> {
    /*
     * The standard JSON format of a Cassandra table
     */
    private CassandraTableResource resource;

    /*
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     */
    private CreateUpdateOptions options;

    /**
     * Creates an instance of CassandraTableCreateUpdateProperties class.
     */
    public CassandraTableCreateUpdateProperties() {
    }

    /**
     * Get the resource property: The standard JSON format of a Cassandra table.
     * 
     * @return the resource value.
     */
    public CassandraTableResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a Cassandra table.
     * 
     * @param resource the resource value to set.
     * @return the CassandraTableCreateUpdateProperties object itself.
     */
    public CassandraTableCreateUpdateProperties withResource(CassandraTableResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @param options the options value to set.
     * @return the CassandraTableCreateUpdateProperties object itself.
     */
    public CassandraTableCreateUpdateProperties withOptions(CreateUpdateOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resource in model CassandraTableCreateUpdateProperties"));
        } else {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CassandraTableCreateUpdateProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("resource", this.resource);
        jsonWriter.writeJsonField("options", this.options);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CassandraTableCreateUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CassandraTableCreateUpdateProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CassandraTableCreateUpdateProperties.
     */
    public static CassandraTableCreateUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CassandraTableCreateUpdateProperties deserializedCassandraTableCreateUpdateProperties
                = new CassandraTableCreateUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resource".equals(fieldName)) {
                    deserializedCassandraTableCreateUpdateProperties.resource = CassandraTableResource.fromJson(reader);
                } else if ("options".equals(fieldName)) {
                    deserializedCassandraTableCreateUpdateProperties.options = CreateUpdateOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCassandraTableCreateUpdateProperties;
        });
    }
}
