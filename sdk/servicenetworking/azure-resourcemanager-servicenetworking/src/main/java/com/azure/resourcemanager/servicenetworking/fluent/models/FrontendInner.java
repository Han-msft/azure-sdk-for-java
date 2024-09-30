// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicenetworking.models.FrontendProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Frontend Sub Resource of Traffic Controller.
 */
@Fluent
public final class FrontendInner extends Resource {
    /*
     * The resource-specific properties for this resource.
     */
    private FrontendProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of FrontendInner class.
     */
    public FrontendInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public FrontendProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the FrontendInner object itself.
     */
    public FrontendInner withProperties(FrontendProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontendInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FrontendInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FrontendInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FrontendInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FrontendInner.
     */
    public static FrontendInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FrontendInner deserializedFrontendInner = new FrontendInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFrontendInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFrontendInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFrontendInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedFrontendInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedFrontendInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedFrontendInner.properties = FrontendProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedFrontendInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFrontendInner;
        });
    }
}
