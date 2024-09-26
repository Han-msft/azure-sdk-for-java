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
 * Windows operating system settings to apply to the virtual machine.
 */
@Fluent
public final class WindowsConfiguration implements JsonSerializable<WindowsConfiguration> {
    /*
     * If omitted, the default value is true.
     */
    private Boolean enableAutomaticUpdates;

    /**
     * Creates an instance of WindowsConfiguration class.
     */
    public WindowsConfiguration() {
    }

    /**
     * Get the enableAutomaticUpdates property: If omitted, the default value is true.
     * 
     * @return the enableAutomaticUpdates value.
     */
    public Boolean enableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set the enableAutomaticUpdates property: If omitted, the default value is true.
     * 
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
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
        jsonWriter.writeBooleanField("enableAutomaticUpdates", this.enableAutomaticUpdates);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WindowsConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WindowsConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WindowsConfiguration.
     */
    public static WindowsConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WindowsConfiguration deserializedWindowsConfiguration = new WindowsConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enableAutomaticUpdates".equals(fieldName)) {
                    deserializedWindowsConfiguration.enableAutomaticUpdates
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWindowsConfiguration;
        });
    }
}
