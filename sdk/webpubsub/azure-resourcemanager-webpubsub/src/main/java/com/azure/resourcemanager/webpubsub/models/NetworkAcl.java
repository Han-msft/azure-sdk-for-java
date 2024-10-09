// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Network ACL.
 */
@Fluent
public class NetworkAcl implements JsonSerializable<NetworkAcl> {
    /*
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     */
    private List<WebPubSubRequestType> allow;

    /*
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     */
    private List<WebPubSubRequestType> deny;

    /**
     * Creates an instance of NetworkAcl class.
     */
    public NetworkAcl() {
    }

    /**
     * Get the allow property: Allowed request types. The value can be one or more of: ClientConnection,
     * ServerConnection, RESTAPI.
     * 
     * @return the allow value.
     */
    public List<WebPubSubRequestType> allow() {
        return this.allow;
    }

    /**
     * Set the allow property: Allowed request types. The value can be one or more of: ClientConnection,
     * ServerConnection, RESTAPI.
     * 
     * @param allow the allow value to set.
     * @return the NetworkAcl object itself.
     */
    public NetworkAcl withAllow(List<WebPubSubRequestType> allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Get the deny property: Denied request types. The value can be one or more of: ClientConnection, ServerConnection,
     * RESTAPI.
     * 
     * @return the deny value.
     */
    public List<WebPubSubRequestType> deny() {
        return this.deny;
    }

    /**
     * Set the deny property: Denied request types. The value can be one or more of: ClientConnection, ServerConnection,
     * RESTAPI.
     * 
     * @param deny the deny value to set.
     * @return the NetworkAcl object itself.
     */
    public NetworkAcl withDeny(List<WebPubSubRequestType> deny) {
        this.deny = deny;
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
        jsonWriter.writeArrayField("allow", this.allow,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("deny", this.deny,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkAcl from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkAcl if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the NetworkAcl.
     */
    public static NetworkAcl fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkAcl deserializedNetworkAcl = new NetworkAcl();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("allow".equals(fieldName)) {
                    List<WebPubSubRequestType> allow
                        = reader.readArray(reader1 -> WebPubSubRequestType.fromString(reader1.getString()));
                    deserializedNetworkAcl.allow = allow;
                } else if ("deny".equals(fieldName)) {
                    List<WebPubSubRequestType> deny
                        = reader.readArray(reader1 -> WebPubSubRequestType.fromString(reader1.getString()));
                    deserializedNetworkAcl.deny = deny;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkAcl;
        });
    }
}
