// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Returns link related to the product.
 */
@Immutable
public final class Link implements JsonSerializable<Link> {
    /*
     * Type of link
     */
    private LinkType linkType;

    /*
     * Url of the link
     */
    private String linkUrl;

    /**
     * Creates an instance of Link class.
     */
    public Link() {
    }

    /**
     * Get the linkType property: Type of link.
     * 
     * @return the linkType value.
     */
    public LinkType linkType() {
        return this.linkType;
    }

    /**
     * Get the linkUrl property: Url of the link.
     * 
     * @return the linkUrl value.
     */
    public String linkUrl() {
        return this.linkUrl;
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
     * Reads an instance of Link from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Link if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Link.
     */
    public static Link fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Link deserializedLink = new Link();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkType".equals(fieldName)) {
                    deserializedLink.linkType = LinkType.fromString(reader.getString());
                } else if ("linkUrl".equals(fieldName)) {
                    deserializedLink.linkUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLink;
        });
    }
}
