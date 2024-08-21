// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The compute isolation properties.
 */
@Fluent
public final class ComputeIsolationProperties implements JsonSerializable<ComputeIsolationProperties> {
    /*
     * The flag indicates whether enable compute isolation or not.
     */
    private Boolean enableComputeIsolation;

    /*
     * The host sku.
     */
    private String hostSku;

    /**
     * Creates an instance of ComputeIsolationProperties class.
     */
    public ComputeIsolationProperties() {
    }

    /**
     * Get the enableComputeIsolation property: The flag indicates whether enable compute isolation or not.
     * 
     * @return the enableComputeIsolation value.
     */
    public Boolean enableComputeIsolation() {
        return this.enableComputeIsolation;
    }

    /**
     * Set the enableComputeIsolation property: The flag indicates whether enable compute isolation or not.
     * 
     * @param enableComputeIsolation the enableComputeIsolation value to set.
     * @return the ComputeIsolationProperties object itself.
     */
    public ComputeIsolationProperties withEnableComputeIsolation(Boolean enableComputeIsolation) {
        this.enableComputeIsolation = enableComputeIsolation;
        return this;
    }

    /**
     * Get the hostSku property: The host sku.
     * 
     * @return the hostSku value.
     */
    public String hostSku() {
        return this.hostSku;
    }

    /**
     * Set the hostSku property: The host sku.
     * 
     * @param hostSku the hostSku value to set.
     * @return the ComputeIsolationProperties object itself.
     */
    public ComputeIsolationProperties withHostSku(String hostSku) {
        this.hostSku = hostSku;
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
        jsonWriter.writeBooleanField("enableComputeIsolation", this.enableComputeIsolation);
        jsonWriter.writeStringField("hostSku", this.hostSku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeIsolationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeIsolationProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComputeIsolationProperties.
     */
    public static ComputeIsolationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeIsolationProperties deserializedComputeIsolationProperties = new ComputeIsolationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enableComputeIsolation".equals(fieldName)) {
                    deserializedComputeIsolationProperties.enableComputeIsolation
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("hostSku".equals(fieldName)) {
                    deserializedComputeIsolationProperties.hostSku = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeIsolationProperties;
        });
    }
}
