// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Message Interactive list reply content for a user to business message.
 */
@Fluent
public final class AcsMessageInteractiveListReplyContent
    implements JsonSerializable<AcsMessageInteractiveListReplyContent> {
    /*
     * The ID of the selected list item
     */
    private String listItemId;

    /*
     * The title of the selected list item
     */
    private String title;

    /*
     * The description of the selected row
     */
    private String description;

    /**
     * Creates an instance of AcsMessageInteractiveListReplyContent class.
     */
    public AcsMessageInteractiveListReplyContent() {
    }

    /**
     * Get the listItemId property: The ID of the selected list item.
     * 
     * @return the listItemId value.
     */
    public String getListItemId() {
        return this.listItemId;
    }

    /**
     * Set the listItemId property: The ID of the selected list item.
     * 
     * @param listItemId the listItemId value to set.
     * @return the AcsMessageInteractiveListReplyContent object itself.
     */
    public AcsMessageInteractiveListReplyContent setListItemId(String listItemId) {
        this.listItemId = listItemId;
        return this;
    }

    /**
     * Get the title property: The title of the selected list item.
     * 
     * @return the title value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The title of the selected list item.
     * 
     * @param title the title value to set.
     * @return the AcsMessageInteractiveListReplyContent object itself.
     */
    public AcsMessageInteractiveListReplyContent setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: The description of the selected row.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the selected row.
     * 
     * @param description the description value to set.
     * @return the AcsMessageInteractiveListReplyContent object itself.
     */
    public AcsMessageInteractiveListReplyContent setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.listItemId);
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsMessageInteractiveListReplyContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsMessageInteractiveListReplyContent if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsMessageInteractiveListReplyContent.
     */
    public static AcsMessageInteractiveListReplyContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsMessageInteractiveListReplyContent deserializedAcsMessageInteractiveListReplyContent
                = new AcsMessageInteractiveListReplyContent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAcsMessageInteractiveListReplyContent.listItemId = reader.getString();
                } else if ("title".equals(fieldName)) {
                    deserializedAcsMessageInteractiveListReplyContent.title = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedAcsMessageInteractiveListReplyContent.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcsMessageInteractiveListReplyContent;
        });
    }
}
