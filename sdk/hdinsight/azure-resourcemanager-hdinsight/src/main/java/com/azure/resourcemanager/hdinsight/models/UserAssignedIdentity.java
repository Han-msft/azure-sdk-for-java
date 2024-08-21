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
 * The User Assigned Identity.
 */
@Fluent
public final class UserAssignedIdentity implements JsonSerializable<UserAssignedIdentity> {
    /*
     * The principal id of user assigned identity.
     */
    private String principalId;

    /*
     * The client id of user assigned identity.
     */
    private String clientId;

    /*
     * The tenant id of user assigned identity.
     */
    private String tenantId;

    /**
     * Creates an instance of UserAssignedIdentity class.
     */
    public UserAssignedIdentity() {
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
     * Get the tenantId property: The tenant id of user assigned identity.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id of user assigned identity.
     * 
     * @param tenantId the tenantId value to set.
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withTenantId(String tenantId) {
        this.tenantId = tenantId;
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
        jsonWriter.writeStringField("tenantId", this.tenantId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserAssignedIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserAssignedIdentity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UserAssignedIdentity.
     */
    public static UserAssignedIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserAssignedIdentity deserializedUserAssignedIdentity = new UserAssignedIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedUserAssignedIdentity.principalId = reader.getString();
                } else if ("clientId".equals(fieldName)) {
                    deserializedUserAssignedIdentity.clientId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedUserAssignedIdentity.tenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserAssignedIdentity;
        });
    }
}
