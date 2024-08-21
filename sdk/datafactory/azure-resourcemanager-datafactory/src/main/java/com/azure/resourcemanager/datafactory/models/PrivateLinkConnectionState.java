// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The state of a private link connection.
 */
@Fluent
public final class PrivateLinkConnectionState implements JsonSerializable<PrivateLinkConnectionState> {
    /*
     * Status of a private link connection
     */
    private String status;

    /*
     * Description of a private link connection
     */
    private String description;

    /*
     * ActionsRequired for a private link connection
     */
    private String actionsRequired;

    /**
     * Creates an instance of PrivateLinkConnectionState class.
     */
    public PrivateLinkConnectionState() {
    }

    /**
     * Get the status property: Status of a private link connection.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of a private link connection.
     * 
     * @param status the status value to set.
     * @return the PrivateLinkConnectionState object itself.
     */
    public PrivateLinkConnectionState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: Description of a private link connection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of a private link connection.
     * 
     * @param description the description value to set.
     * @return the PrivateLinkConnectionState object itself.
     */
    public PrivateLinkConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: ActionsRequired for a private link connection.
     * 
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: ActionsRequired for a private link connection.
     * 
     * @param actionsRequired the actionsRequired value to set.
     * @return the PrivateLinkConnectionState object itself.
     */
    public PrivateLinkConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
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
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("actionsRequired", this.actionsRequired);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkConnectionState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkConnectionState if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkConnectionState.
     */
    public static PrivateLinkConnectionState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkConnectionState deserializedPrivateLinkConnectionState = new PrivateLinkConnectionState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedPrivateLinkConnectionState.status = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedPrivateLinkConnectionState.description = reader.getString();
                } else if ("actionsRequired".equals(fieldName)) {
                    deserializedPrivateLinkConnectionState.actionsRequired = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkConnectionState;
        });
    }
}
