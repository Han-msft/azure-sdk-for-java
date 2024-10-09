// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iotcentral.fluent.models.PrivateLinkResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of private link resources.
 */
@Fluent
public final class PrivateLinkResourceListResult implements JsonSerializable<PrivateLinkResourceListResult> {
    /*
     * Array of private link resources
     */
    private List<PrivateLinkResourceInner> value;

    /**
     * Creates an instance of PrivateLinkResourceListResult class.
     */
    public PrivateLinkResourceListResult() {
    }

    /**
     * Get the value property: Array of private link resources.
     * 
     * @return the value value.
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private link resources.
     * 
     * @param value the value value to set.
     * @return the PrivateLinkResourceListResult object itself.
     */
    public PrivateLinkResourceListResult withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkResourceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceListResult.
     */
    public static PrivateLinkResourceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceListResult deserializedPrivateLinkResourceListResult
                = new PrivateLinkResourceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PrivateLinkResourceInner> value
                        = reader.readArray(reader1 -> PrivateLinkResourceInner.fromJson(reader1));
                    deserializedPrivateLinkResourceListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceListResult;
        });
    }
}
