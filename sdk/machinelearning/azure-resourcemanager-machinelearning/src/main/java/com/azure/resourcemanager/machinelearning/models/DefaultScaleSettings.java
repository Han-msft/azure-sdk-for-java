// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The DefaultScaleSettings model.
 */
@Immutable
public final class DefaultScaleSettings extends OnlineScaleSettings {
    /*
     * [Required] Type of deployment scaling algorithm
     */
    private ScaleType scaleType = ScaleType.DEFAULT;

    /**
     * Creates an instance of DefaultScaleSettings class.
     */
    public DefaultScaleSettings() {
    }

    /**
     * Get the scaleType property: [Required] Type of deployment scaling algorithm.
     * 
     * @return the scaleType value.
     */
    @Override
    public ScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scaleType", this.scaleType == null ? null : this.scaleType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DefaultScaleSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DefaultScaleSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DefaultScaleSettings.
     */
    public static DefaultScaleSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DefaultScaleSettings deserializedDefaultScaleSettings = new DefaultScaleSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scaleType".equals(fieldName)) {
                    deserializedDefaultScaleSettings.scaleType = ScaleType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDefaultScaleSettings;
        });
    }
}
