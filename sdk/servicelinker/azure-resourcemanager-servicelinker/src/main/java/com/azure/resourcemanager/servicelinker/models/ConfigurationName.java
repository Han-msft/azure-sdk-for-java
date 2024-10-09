// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration names.
 */
@Fluent
public final class ConfigurationName implements JsonSerializable<ConfigurationName> {
    /*
     * The value property.
     */
    private String value;

    /*
     * Description for the configuration name.
     */
    private String description;

    /*
     * Represent the configuration is required or not
     */
    private Boolean required;

    /**
     * Creates an instance of ConfigurationName class.
     */
    public ConfigurationName() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the ConfigurationName object itself.
     */
    public ConfigurationName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the description property: Description for the configuration name.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the configuration name.
     * 
     * @param description the description value to set.
     * @return the ConfigurationName object itself.
     */
    public ConfigurationName withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the required property: Represent the configuration is required or not.
     * 
     * @return the required value.
     */
    public Boolean required() {
        return this.required;
    }

    /**
     * Set the required property: Represent the configuration is required or not.
     * 
     * @param required the required value to set.
     * @return the ConfigurationName object itself.
     */
    public ConfigurationName withRequired(Boolean required) {
        this.required = required;
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
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeBooleanField("required", this.required);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationName from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationName if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationName.
     */
    public static ConfigurationName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationName deserializedConfigurationName = new ConfigurationName();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedConfigurationName.value = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedConfigurationName.description = reader.getString();
                } else if ("required".equals(fieldName)) {
                    deserializedConfigurationName.required = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationName;
        });
    }
}
