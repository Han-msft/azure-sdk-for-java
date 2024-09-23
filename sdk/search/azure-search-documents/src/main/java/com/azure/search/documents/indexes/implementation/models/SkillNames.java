// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The SkillNames model.
 */
@Fluent
public final class SkillNames implements JsonSerializable<SkillNames> {
    /*
     * the names of skills to be reset.
     */
    private List<String> skillNames;

    /**
     * Creates an instance of SkillNames class.
     */
    public SkillNames() {
    }

    /**
     * Get the skillNames property: the names of skills to be reset.
     * 
     * @return the skillNames value.
     */
    public List<String> getSkillNames() {
        return this.skillNames;
    }

    /**
     * Set the skillNames property: the names of skills to be reset.
     * 
     * @param skillNames the skillNames value to set.
     * @return the SkillNames object itself.
     */
    public SkillNames setSkillNames(List<String> skillNames) {
        this.skillNames = skillNames;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("skillNames", this.skillNames, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SkillNames from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SkillNames if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SkillNames.
     */
    public static SkillNames fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SkillNames deserializedSkillNames = new SkillNames();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("skillNames".equals(fieldName)) {
                    List<String> skillNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedSkillNames.skillNames = skillNames;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSkillNames;
        });
    }
}
