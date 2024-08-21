// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import java.io.IOException;
import java.util.List;

/**
 * Properties for a CDC table.
 */
@Fluent
public final class MapperTableProperties implements JsonSerializable<MapperTableProperties> {
    /*
     * List of columns for the source table.
     */
    private List<MapperTableSchema> schema;

    /*
     * List of name/value pairs for connection properties.
     */
    private List<MapperDslConnectorProperties> dslConnectorProperties;

    /**
     * Creates an instance of MapperTableProperties class.
     */
    public MapperTableProperties() {
    }

    /**
     * Get the schema property: List of columns for the source table.
     * 
     * @return the schema value.
     */
    public List<MapperTableSchema> schema() {
        return this.schema;
    }

    /**
     * Set the schema property: List of columns for the source table.
     * 
     * @param schema the schema value to set.
     * @return the MapperTableProperties object itself.
     */
    public MapperTableProperties withSchema(List<MapperTableSchema> schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the dslConnectorProperties property: List of name/value pairs for connection properties.
     * 
     * @return the dslConnectorProperties value.
     */
    public List<MapperDslConnectorProperties> dslConnectorProperties() {
        return this.dslConnectorProperties;
    }

    /**
     * Set the dslConnectorProperties property: List of name/value pairs for connection properties.
     * 
     * @param dslConnectorProperties the dslConnectorProperties value to set.
     * @return the MapperTableProperties object itself.
     */
    public MapperTableProperties withDslConnectorProperties(List<MapperDslConnectorProperties> dslConnectorProperties) {
        this.dslConnectorProperties = dslConnectorProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schema() != null) {
            schema().forEach(e -> e.validate());
        }
        if (dslConnectorProperties() != null) {
            dslConnectorProperties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("schema", this.schema, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("dslConnectorProperties", this.dslConnectorProperties,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MapperTableProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MapperTableProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MapperTableProperties.
     */
    public static MapperTableProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MapperTableProperties deserializedMapperTableProperties = new MapperTableProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schema".equals(fieldName)) {
                    List<MapperTableSchema> schema = reader.readArray(reader1 -> MapperTableSchema.fromJson(reader1));
                    deserializedMapperTableProperties.schema = schema;
                } else if ("dslConnectorProperties".equals(fieldName)) {
                    List<MapperDslConnectorProperties> dslConnectorProperties
                        = reader.readArray(reader1 -> MapperDslConnectorProperties.fromJson(reader1));
                    deserializedMapperTableProperties.dslConnectorProperties = dslConnectorProperties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMapperTableProperties;
        });
    }
}
