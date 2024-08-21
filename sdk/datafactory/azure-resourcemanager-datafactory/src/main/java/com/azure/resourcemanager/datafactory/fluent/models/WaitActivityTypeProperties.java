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
import java.io.IOException;

/**
 * Wait activity properties.
 */
@Fluent
public final class WaitActivityTypeProperties implements JsonSerializable<WaitActivityTypeProperties> {
    /*
     * Duration in seconds. Type: integer (or Expression with resultType integer).
     */
    private Object waitTimeInSeconds;

    /**
     * Creates an instance of WaitActivityTypeProperties class.
     */
    public WaitActivityTypeProperties() {
    }

    /**
     * Get the waitTimeInSeconds property: Duration in seconds. Type: integer (or Expression with resultType integer).
     * 
     * @return the waitTimeInSeconds value.
     */
    public Object waitTimeInSeconds() {
        return this.waitTimeInSeconds;
    }

    /**
     * Set the waitTimeInSeconds property: Duration in seconds. Type: integer (or Expression with resultType integer).
     * 
     * @param waitTimeInSeconds the waitTimeInSeconds value to set.
     * @return the WaitActivityTypeProperties object itself.
     */
    public WaitActivityTypeProperties withWaitTimeInSeconds(Object waitTimeInSeconds) {
        this.waitTimeInSeconds = waitTimeInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (waitTimeInSeconds() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property waitTimeInSeconds in model WaitActivityTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WaitActivityTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("waitTimeInSeconds", this.waitTimeInSeconds);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WaitActivityTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WaitActivityTypeProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WaitActivityTypeProperties.
     */
    public static WaitActivityTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WaitActivityTypeProperties deserializedWaitActivityTypeProperties = new WaitActivityTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("waitTimeInSeconds".equals(fieldName)) {
                    deserializedWaitActivityTypeProperties.waitTimeInSeconds = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWaitActivityTypeProperties;
        });
    }
}
