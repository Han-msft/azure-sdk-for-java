// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.SharePointOnlineListDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The sharepoint online list resource dataset.
 */
@Fluent
public final class SharePointOnlineListResourceDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "SharePointOnlineListResource";

    /*
     * Sharepoint online list dataset properties.
     */
    private SharePointOnlineListDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of SharePointOnlineListResourceDataset class.
     */
    public SharePointOnlineListResourceDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Sharepoint online list dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SharePointOnlineListDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the listName property: The name of the SharePoint Online list. Type: string (or Expression with resultType
     * string).
     * 
     * @return the listName value.
     */
    public Object listName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().listName();
    }

    /**
     * Set the listName property: The name of the SharePoint Online list. Type: string (or Expression with resultType
     * string).
     * 
     * @param listName the listName value to set.
     * @return the SharePointOnlineListResourceDataset object itself.
     */
    public SharePointOnlineListResourceDataset withListName(Object listName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SharePointOnlineListDatasetTypeProperties();
        }
        this.innerTypeProperties().withListName(listName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", linkedServiceName());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeUntypedField("structure", structure());
        jsonWriter.writeUntypedField("schema", schema());
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", folder());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharePointOnlineListResourceDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharePointOnlineListResourceDataset if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SharePointOnlineListResourceDataset.
     */
    public static SharePointOnlineListResourceDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharePointOnlineListResourceDataset deserializedSharePointOnlineListResourceDataset
                = new SharePointOnlineListResourceDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedSharePointOnlineListResourceDataset
                        .withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedSharePointOnlineListResourceDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedSharePointOnlineListResourceDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedSharePointOnlineListResourceDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedSharePointOnlineListResourceDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSharePointOnlineListResourceDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedSharePointOnlineListResourceDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedSharePointOnlineListResourceDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedSharePointOnlineListResourceDataset.innerTypeProperties
                        = SharePointOnlineListDatasetTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSharePointOnlineListResourceDataset.withAdditionalProperties(additionalProperties);

            return deserializedSharePointOnlineListResourceDataset;
        });
    }
}
