// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.inference.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A tool selection of a specific, named function tool that will limit chat completions to using the named function.
 */
@Immutable
public final class ChatCompletionsFunctionToolSelection
    implements JsonSerializable<ChatCompletionsFunctionToolSelection> {

    /*
     * The name of the function that should be called.
     */
    @Generated
    private final String name;

    /**
     * Creates an instance of ChatCompletionsFunctionToolSelection class.
     *
     * @param name the name value to set.
     */
    @Generated
    public ChatCompletionsFunctionToolSelection(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the function that should be called.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionsFunctionToolSelection from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionsFunctionToolSelection if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionsFunctionToolSelection.
     */
    @Generated
    public static ChatCompletionsFunctionToolSelection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new ChatCompletionsFunctionToolSelection(name);
        });
    }
}
