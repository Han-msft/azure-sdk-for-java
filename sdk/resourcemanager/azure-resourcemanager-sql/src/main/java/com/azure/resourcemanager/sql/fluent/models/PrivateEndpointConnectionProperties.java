// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.PrivateEndpointProperty;
import com.azure.resourcemanager.sql.models.PrivateEndpointProvisioningState;
import com.azure.resourcemanager.sql.models.PrivateLinkServiceConnectionStateProperty;
import java.io.IOException;
import java.util.List;

/**
 * Properties of a private endpoint connection.
 */
@Fluent
public final class PrivateEndpointConnectionProperties
    implements JsonSerializable<PrivateEndpointConnectionProperties> {
    /*
     * Private endpoint which the connection belongs to.
     */
    private PrivateEndpointProperty privateEndpoint;

    /*
     * Group IDs.
     */
    private List<String> groupIds;

    /*
     * Connection state of the private endpoint connection.
     */
    private PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState;

    /*
     * State of the private endpoint connection.
     */
    private PrivateEndpointProvisioningState provisioningState;

    /**
     * Creates an instance of PrivateEndpointConnectionProperties class.
     */
    public PrivateEndpointConnectionProperties() {
    }

    /**
     * Get the privateEndpoint property: Private endpoint which the connection belongs to.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpointProperty privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Private endpoint which the connection belongs to.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the groupIds property: Group IDs.
     * 
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.groupIds;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Connection state of the private endpoint connection.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Connection state of the private endpoint connection.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: State of the private endpoint connection.
     * 
     * @return the provisioningState value.
     */
    public PrivateEndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("privateEndpoint", this.privateEndpoint);
        jsonWriter.writeJsonField("privateLinkServiceConnectionState", this.privateLinkServiceConnectionState);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionProperties.
     */
    public static PrivateEndpointConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionProperties deserializedPrivateEndpointConnectionProperties
                = new PrivateEndpointConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateEndpoint".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.privateEndpoint
                        = PrivateEndpointProperty.fromJson(reader);
                } else if ("groupIds".equals(fieldName)) {
                    List<String> groupIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateEndpointConnectionProperties.groupIds = groupIds;
                } else if ("privateLinkServiceConnectionState".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.privateLinkServiceConnectionState
                        = PrivateLinkServiceConnectionStateProperty.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.provisioningState
                        = PrivateEndpointProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionProperties;
        });
    }
}
