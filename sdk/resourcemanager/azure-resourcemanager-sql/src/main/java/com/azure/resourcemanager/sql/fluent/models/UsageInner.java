// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.Name;
import java.io.IOException;

/**
 * ARM usage.
 */
@Immutable
public final class UsageInner implements JsonSerializable<UsageInner> {
    /*
     * Resource ID.
     */
    private String id;

    /*
     * Resource name.
     */
    private Name name;

    /*
     * Resource type.
     */
    private String type;

    /*
     * Usage unit.
     */
    private String unit;

    /*
     * Usage current value.
     */
    private Integer currentValue;

    /*
     * Usage limit.
     */
    private Integer limit;

    /*
     * Usage requested limit.
     */
    private Integer requestedLimit;

    /**
     * Creates an instance of UsageInner class.
     */
    public UsageInner() {
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public Name name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the unit property: Usage unit.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the currentValue property: Usage current value.
     * 
     * @return the currentValue value.
     */
    public Integer currentValue() {
        return this.currentValue;
    }

    /**
     * Get the limit property: Usage limit.
     * 
     * @return the limit value.
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the requestedLimit property: Usage requested limit.
     * 
     * @return the requestedLimit value.
     */
    public Integer requestedLimit() {
        return this.requestedLimit;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
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
     * Reads an instance of UsageInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the UsageInner.
     */
    public static UsageInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageInner deserializedUsageInner = new UsageInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedUsageInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedUsageInner.name = Name.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedUsageInner.type = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedUsageInner.unit = reader.getString();
                } else if ("currentValue".equals(fieldName)) {
                    deserializedUsageInner.currentValue = reader.getNullable(JsonReader::getInt);
                } else if ("limit".equals(fieldName)) {
                    deserializedUsageInner.limit = reader.getNullable(JsonReader::getInt);
                } else if ("requestedLimit".equals(fieldName)) {
                    deserializedUsageInner.requestedLimit = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageInner;
        });
    }
}
