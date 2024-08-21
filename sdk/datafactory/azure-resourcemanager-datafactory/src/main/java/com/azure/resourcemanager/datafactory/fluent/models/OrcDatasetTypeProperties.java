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
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.io.IOException;

/**
 * ORC dataset properties.
 */
@Fluent
public final class OrcDatasetTypeProperties implements JsonSerializable<OrcDatasetTypeProperties> {
    /*
     * The location of the ORC data storage.
     */
    private DatasetLocation location;

    /*
     * The data orcCompressionCodec. Type: string (or Expression with resultType string).
     */
    private Object orcCompressionCodec;

    /**
     * Creates an instance of OrcDatasetTypeProperties class.
     */
    public OrcDatasetTypeProperties() {
    }

    /**
     * Get the location property: The location of the ORC data storage.
     * 
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the ORC data storage.
     * 
     * @param location the location value to set.
     * @return the OrcDatasetTypeProperties object itself.
     */
    public OrcDatasetTypeProperties withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the orcCompressionCodec property: The data orcCompressionCodec. Type: string (or Expression with resultType
     * string).
     * 
     * @return the orcCompressionCodec value.
     */
    public Object orcCompressionCodec() {
        return this.orcCompressionCodec;
    }

    /**
     * Set the orcCompressionCodec property: The data orcCompressionCodec. Type: string (or Expression with resultType
     * string).
     * 
     * @param orcCompressionCodec the orcCompressionCodec value to set.
     * @return the OrcDatasetTypeProperties object itself.
     */
    public OrcDatasetTypeProperties withOrcCompressionCodec(Object orcCompressionCodec) {
        this.orcCompressionCodec = orcCompressionCodec;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model OrcDatasetTypeProperties"));
        } else {
            location().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OrcDatasetTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("location", this.location);
        jsonWriter.writeUntypedField("orcCompressionCodec", this.orcCompressionCodec);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OrcDatasetTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OrcDatasetTypeProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OrcDatasetTypeProperties.
     */
    public static OrcDatasetTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OrcDatasetTypeProperties deserializedOrcDatasetTypeProperties = new OrcDatasetTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedOrcDatasetTypeProperties.location = DatasetLocation.fromJson(reader);
                } else if ("orcCompressionCodec".equals(fieldName)) {
                    deserializedOrcDatasetTypeProperties.orcCompressionCodec = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOrcDatasetTypeProperties;
        });
    }
}
