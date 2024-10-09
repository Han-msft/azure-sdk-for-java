// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * M365 Extensions definition.
 */
@Fluent
public final class M365Extensions extends Channel {
    /*
     * The channel name
     */
    private String channelName = "M365Extensions";

    /*
     * Provisioning state of the resource
     */
    private String provisioningState;

    /**
     * Creates an instance of M365Extensions class.
     */
    public M365Extensions() {
    }

    /**
     * Get the channelName property: The channel name.
     * 
     * @return the channelName value.
     */
    @Override
    public String channelName() {
        return this.channelName;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    @Override
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public M365Extensions withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public M365Extensions withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("etag", etag());
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeStringField("channelName", this.channelName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of M365Extensions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of M365Extensions if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the M365Extensions.
     */
    public static M365Extensions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            M365Extensions deserializedM365Extensions = new M365Extensions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("etag".equals(fieldName)) {
                    deserializedM365Extensions.withEtag(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedM365Extensions.provisioningState = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedM365Extensions.withLocation(reader.getString());
                } else if ("channelName".equals(fieldName)) {
                    deserializedM365Extensions.channelName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedM365Extensions;
        });
    }
}
