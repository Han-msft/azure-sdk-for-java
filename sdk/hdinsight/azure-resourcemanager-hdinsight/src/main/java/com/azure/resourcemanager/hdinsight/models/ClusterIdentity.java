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
import java.util.Map;

/**
 * Identity for the cluster.
 */
@Fluent
public final class ClusterIdentity implements JsonSerializable<ClusterIdentity> {
    /*
     * The principal id of cluster identity. This property will only be provided for a system assigned identity.
     */
    private String principalId;

    /*
     * The tenant id associated with the cluster. This property will only be provided for a system assigned identity.
     */
    private String tenantId;

    /*
     * The type of identity used for the cluster. The type 'SystemAssigned, UserAssigned' includes both an implicitly
     * created identity and a set of user assigned identities.
     */
    private ResourceIdentityType type;

    /*
     * The list of user identities associated with the cluster. The user identity dictionary key references will be ARM
     * resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/
     * userAssignedIdentities/{identityName}'.
     */
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of ClusterIdentity class.
     */
    public ClusterIdentity() {
    }

    /**
     * Get the principalId property: The principal id of cluster identity. This property will only be provided for a
     * system assigned identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id associated with the cluster. This property will only be provided for a
     * system assigned identity.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the cluster. The type 'SystemAssigned, UserAssigned'
     * includes both an implicitly created identity and a set of user assigned identities.
     * 
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the cluster. The type 'SystemAssigned, UserAssigned'
     * includes both an implicitly created identity and a set of user assigned identities.
     * 
     * @param type the type value to set.
     * @return the ClusterIdentity object itself.
     */
    public ClusterIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the cluster. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the cluster. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ClusterIdentity object itself.
     */
    public ClusterIdentity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeMapField("userAssignedIdentities", this.userAssignedIdentities,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterIdentity.
     */
    public static ClusterIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterIdentity deserializedClusterIdentity = new ClusterIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedClusterIdentity.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedClusterIdentity.tenantId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterIdentity.type = ResourceIdentityType.fromString(reader.getString());
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    Map<String, UserAssignedIdentity> userAssignedIdentities
                        = reader.readMap(reader1 -> UserAssignedIdentity.fromJson(reader1));
                    deserializedClusterIdentity.userAssignedIdentities = userAssignedIdentities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterIdentity;
        });
    }
}
