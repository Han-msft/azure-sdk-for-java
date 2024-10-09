// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The query parameters to use for vector search when a raw vector value is provided.
 */
@Fluent
public final class VectorizedQuery extends VectorQuery {

    /*
     * The kind of vector query being performed.
     */
    private VectorQueryKind kind = VectorQueryKind.VECTOR;

    /*
     * The vector representation of a search query.
     */
    private final List<Float> vector;

    /**
     * Creates an instance of VectorizedQuery class.
     *
     * @param vector the vector value to set.
     */
    public VectorizedQuery(List<Float> vector) {
        this.vector = vector;
    }

    /**
     * Get the kind property: The kind of vector query being performed.
     *
     * @return the kind value.
     */
    @Override
    public VectorQueryKind getKind() {
        return this.kind;
    }

    /**
     * Get the vector property: The vector representation of a search query.
     *
     * @return the vector value.
     */
    public List<Float> getVector() {
        return this.vector;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setKNearestNeighborsCount(Integer kNearestNeighborsCount) {
        super.setKNearestNeighborsCount(kNearestNeighborsCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setFields(String... fields) {
        super.setFields(fields);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setExhaustive(Boolean exhaustive) {
        super.setExhaustive(exhaustive);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setOversampling(Double oversampling) {
        super.setOversampling(oversampling);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setWeight(Float weight) {
        super.setWeight(weight);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setThreshold(VectorThreshold threshold) {
        super.setThreshold(threshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setFilterOverride(String filterOverride) {
        super.setFilterOverride(filterOverride);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("k", getKNearestNeighborsCount());
        jsonWriter.writeStringField("fields", getFields());
        jsonWriter.writeBooleanField("exhaustive", isExhaustive());
        jsonWriter.writeNumberField("oversampling", getOversampling());
        jsonWriter.writeNumberField("weight", getWeight());
        jsonWriter.writeJsonField("threshold", getThreshold());
        jsonWriter.writeStringField("filterOverride", getFilterOverride());
        jsonWriter.writeArrayField("vector", this.vector, (writer, element) -> writer.writeFloat(element));
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VectorizedQuery from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VectorizedQuery if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VectorizedQuery.
     */
    public static VectorizedQuery fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Integer kNearestNeighborsCount = null;
            String fields = null;
            Boolean exhaustive = null;
            Double oversampling = null;
            Float weight = null;
            VectorThreshold threshold = null;
            String filterOverride = null;
            boolean vectorFound = false;
            List<Float> vector = null;
            VectorQueryKind kind = VectorQueryKind.VECTOR;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("k".equals(fieldName)) {
                    kNearestNeighborsCount = reader.getNullable(JsonReader::getInt);
                } else if ("fields".equals(fieldName)) {
                    fields = reader.getString();
                } else if ("exhaustive".equals(fieldName)) {
                    exhaustive = reader.getNullable(JsonReader::getBoolean);
                } else if ("oversampling".equals(fieldName)) {
                    oversampling = reader.getNullable(JsonReader::getDouble);
                } else if ("weight".equals(fieldName)) {
                    weight = reader.getNullable(JsonReader::getFloat);
                } else if ("threshold".equals(fieldName)) {
                    threshold = VectorThreshold.fromJson(reader);
                } else if ("filterOverride".equals(fieldName)) {
                    filterOverride = reader.getString();
                } else if ("vector".equals(fieldName)) {
                    vector = reader.readArray(reader1 -> reader1.getFloat());
                    vectorFound = true;
                } else if ("kind".equals(fieldName)) {
                    kind = VectorQueryKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            if (vectorFound) {
                VectorizedQuery deserializedVectorizedQuery = new VectorizedQuery(vector);
                deserializedVectorizedQuery.setKNearestNeighborsCount(kNearestNeighborsCount);
                deserializedVectorizedQuery.setFields(fields);
                deserializedVectorizedQuery.setExhaustive(exhaustive);
                deserializedVectorizedQuery.setOversampling(oversampling);
                deserializedVectorizedQuery.setWeight(weight);
                deserializedVectorizedQuery.setThreshold(threshold);
                deserializedVectorizedQuery.setFilterOverride(filterOverride);
                deserializedVectorizedQuery.kind = kind;
                return deserializedVectorizedQuery;
            }
            throw new IllegalStateException("Missing required property: vector");
        });
    }
}
