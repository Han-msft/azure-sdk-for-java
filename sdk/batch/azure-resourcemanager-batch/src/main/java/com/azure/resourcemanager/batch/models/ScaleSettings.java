// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Scale settings for the pool
 * 
 * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is
 * specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not
 * specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
 */
@Fluent
public final class ScaleSettings implements JsonSerializable<ScaleSettings> {
    /*
     * This property and autoScale are mutually exclusive and one of the properties must be specified.
     */
    private FixedScaleSettings fixedScale;

    /*
     * This property and fixedScale are mutually exclusive and one of the properties must be specified.
     */
    private AutoScaleSettings autoScale;

    /**
     * Creates an instance of ScaleSettings class.
     */
    public ScaleSettings() {
    }

    /**
     * Get the fixedScale property: This property and autoScale are mutually exclusive and one of the properties must be
     * specified.
     * 
     * @return the fixedScale value.
     */
    public FixedScaleSettings fixedScale() {
        return this.fixedScale;
    }

    /**
     * Set the fixedScale property: This property and autoScale are mutually exclusive and one of the properties must be
     * specified.
     * 
     * @param fixedScale the fixedScale value to set.
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withFixedScale(FixedScaleSettings fixedScale) {
        this.fixedScale = fixedScale;
        return this;
    }

    /**
     * Get the autoScale property: This property and fixedScale are mutually exclusive and one of the properties must be
     * specified.
     * 
     * @return the autoScale value.
     */
    public AutoScaleSettings autoScale() {
        return this.autoScale;
    }

    /**
     * Set the autoScale property: This property and fixedScale are mutually exclusive and one of the properties must be
     * specified.
     * 
     * @param autoScale the autoScale value to set.
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withAutoScale(AutoScaleSettings autoScale) {
        this.autoScale = autoScale;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fixedScale() != null) {
            fixedScale().validate();
        }
        if (autoScale() != null) {
            autoScale().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("fixedScale", this.fixedScale);
        jsonWriter.writeJsonField("autoScale", this.autoScale);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScaleSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScaleSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScaleSettings.
     */
    public static ScaleSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScaleSettings deserializedScaleSettings = new ScaleSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fixedScale".equals(fieldName)) {
                    deserializedScaleSettings.fixedScale = FixedScaleSettings.fromJson(reader);
                } else if ("autoScale".equals(fieldName)) {
                    deserializedScaleSettings.autoScale = AutoScaleSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScaleSettings;
        });
    }
}
