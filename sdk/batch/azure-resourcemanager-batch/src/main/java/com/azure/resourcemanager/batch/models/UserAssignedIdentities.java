// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The list of associated user identities.
 */
@Immutable
public final class UserAssignedIdentities implements JsonSerializable<UserAssignedIdentities> {
    /*
     * The principal id of user assigned identity.
     */
    private String principalId;

    /*
     * The client id of user assigned identity.
     */
    private String clientId;

    /**
     * Creates an instance of UserAssignedIdentities class.
     */
    public UserAssignedIdentities() {
    }

    /**
     * Get the principalId property: The principal id of user assigned identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId property: The client id of user assigned identity.
     * 
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserAssignedIdentities from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserAssignedIdentities if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserAssignedIdentities.
     */
    public static UserAssignedIdentities fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserAssignedIdentities deserializedUserAssignedIdentities = new UserAssignedIdentities();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedUserAssignedIdentities.principalId = reader.getString();
                } else if ("clientId".equals(fieldName)) {
                    deserializedUserAssignedIdentities.clientId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserAssignedIdentities;
        });
    }
}
