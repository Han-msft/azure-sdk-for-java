// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.ServerTrustGroupInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of server trust groups.
 */
@Immutable
public final class ServerTrustGroupListResult implements JsonSerializable<ServerTrustGroupListResult> {
    /*
     * Array of results.
     */
    private List<ServerTrustGroupInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ServerTrustGroupListResult class.
     */
    public ServerTrustGroupListResult() {
    }

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<ServerTrustGroupInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
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
     * Reads an instance of ServerTrustGroupListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerTrustGroupListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServerTrustGroupListResult.
     */
    public static ServerTrustGroupListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerTrustGroupListResult deserializedServerTrustGroupListResult = new ServerTrustGroupListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ServerTrustGroupInner> value
                        = reader.readArray(reader1 -> ServerTrustGroupInner.fromJson(reader1));
                    deserializedServerTrustGroupListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedServerTrustGroupListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerTrustGroupListResult;
        });
    }
}
