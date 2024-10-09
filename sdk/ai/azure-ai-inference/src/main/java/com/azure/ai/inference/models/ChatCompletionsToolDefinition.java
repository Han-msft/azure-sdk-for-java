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
 * The definition of a chat completions tool that can call a function.
 */
@Immutable
public class ChatCompletionsToolDefinition implements JsonSerializable<ChatCompletionsToolDefinition> {

    /*
     * The type of the tool. Currently, only `function` is supported.
     */
    @Generated
    private final String type = "function";

    /*
     * The function definition details for the function tool.
     */
    @Generated
    private final FunctionDefinition function;

    /**
     * Creates an instance of ChatCompletionsToolDefinition class.
     *
     * @param function the function value to set.
     */
    @Generated
    public ChatCompletionsToolDefinition(FunctionDefinition function) {
        this.function = function;
    }

    /**
     * Get the type property: The type of the tool. Currently, only `function` is supported.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the function property: The function definition details for the function tool.
     *
     * @return the function value.
     */
    @Generated
    public FunctionDefinition getFunction() {
        return this.function;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionsToolDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionsToolDefinition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionsToolDefinition.
     */
    @Generated
    public static ChatCompletionsToolDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionDefinition function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("function".equals(fieldName)) {
                    function = FunctionDefinition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ChatCompletionsToolDefinition(function);
        });
    }
}
