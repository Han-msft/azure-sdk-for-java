// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The restrictions of the SKU.
 */
@Immutable
public final class ResourceSkuRestrictions implements JsonSerializable<ResourceSkuRestrictions> {
    /*
     * the type of restrictions.
     */
    private ResourceSkuRestrictionsType type;

    /*
     * The value of restrictions. If the restriction type is set to location. This would be different locations where
     * the SKU is restricted.
     */
    private List<String> values;

    /*
     * The information about the restriction where the SKU cannot be used.
     */
    private ResourceSkuRestrictionInfo restrictionInfo;

    /*
     * the reason for restriction.
     */
    private ResourceSkuRestrictionsReasonCode reasonCode;

    /**
     * Creates an instance of ResourceSkuRestrictions class.
     */
    private ResourceSkuRestrictions() {
    }

    /**
     * Get the type property: the type of restrictions.
     * 
     * @return the type value.
     */
    public ResourceSkuRestrictionsType type() {
        return this.type;
    }

    /**
     * Get the values property: The value of restrictions. If the restriction type is set to location. This would be
     * different locations where the SKU is restricted.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Get the restrictionInfo property: The information about the restriction where the SKU cannot be used.
     * 
     * @return the restrictionInfo value.
     */
    public ResourceSkuRestrictionInfo restrictionInfo() {
        return this.restrictionInfo;
    }

    /**
     * Get the reasonCode property: the reason for restriction.
     * 
     * @return the reasonCode value.
     */
    public ResourceSkuRestrictionsReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (values() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property values in model ResourceSkuRestrictions"));
        }
        if (restrictionInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property restrictionInfo in model ResourceSkuRestrictions"));
        } else {
            restrictionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceSkuRestrictions.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("restrictionInfo", this.restrictionInfo);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("reasonCode", this.reasonCode == null ? null : this.reasonCode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceSkuRestrictions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSkuRestrictions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceSkuRestrictions.
     */
    public static ResourceSkuRestrictions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSkuRestrictions deserializedResourceSkuRestrictions = new ResourceSkuRestrictions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceSkuRestrictions.values = values;
                } else if ("restrictionInfo".equals(fieldName)) {
                    deserializedResourceSkuRestrictions.restrictionInfo = ResourceSkuRestrictionInfo.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedResourceSkuRestrictions.type
                        = ResourceSkuRestrictionsType.fromString(reader.getString());
                } else if ("reasonCode".equals(fieldName)) {
                    deserializedResourceSkuRestrictions.reasonCode
                        = ResourceSkuRestrictionsReasonCode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSkuRestrictions;
        });
    }
}
