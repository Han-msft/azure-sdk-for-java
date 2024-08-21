// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * User property.
 */
@Fluent
public final class UserProperty implements JsonSerializable<UserProperty> {
    /*
     * User property name.
     */
    private String name;

    /*
     * User property value. Type: string (or Expression with resultType string).
     */
    private Object value;

    /**
     * Creates an instance of UserProperty class.
     */
    public UserProperty() {
    }

    /**
     * Get the name property: User property name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: User property name.
     * 
     * @param name the name value to set.
     * @return the UserProperty object itself.
     */
    public UserProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: User property value. Type: string (or Expression with resultType string).
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: User property value. Type: string (or Expression with resultType string).
     * 
     * @param value the value value to set.
     * @return the UserProperty object itself.
     */
    public UserProperty withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model UserProperty"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model UserProperty"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserProperty.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeUntypedField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UserProperty.
     */
    public static UserProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserProperty deserializedUserProperty = new UserProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedUserProperty.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedUserProperty.value = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserProperty;
        });
    }
}
