// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The Azure Data Factory nested object which contains the information and credential which can be used to connect with
 * related store or compute resource.
 */
@Fluent
public class Credential implements JsonSerializable<Credential> {
    /*
     * Type of credential.
     */
    private String type = "Credential";

    /*
     * Credential description.
     */
    private String description;

    /*
     * List of tags that can be used for describing the Credential.
     */
    private List<Object> annotations;

    /*
     * The Azure Data Factory nested object which contains the information and credential which can be used to connect
     * with related store or compute resource.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of Credential class.
     */
    public Credential() {
    }

    /**
     * Get the type property: Type of credential.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the description property: Credential description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Credential description.
     * 
     * @param description the description value to set.
     * @return the Credential object itself.
     */
    public Credential withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the Credential.
     * 
     * @return the annotations value.
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the Credential.
     * 
     * @param annotations the annotations value to set.
     * @return the Credential object itself.
     */
    public Credential withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the additionalProperties property: The Azure Data Factory nested object which contains the information and
     * credential which can be used to connect with related store or compute resource.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The Azure Data Factory nested object which contains the information and
     * credential which can be used to connect with related store or compute resource.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the Credential object itself.
     */
    public Credential withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("annotations", this.annotations, (writer, element) -> writer.writeUntyped(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Credential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Credential if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Credential.
     */
    public static Credential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("ServicePrincipal".equals(discriminatorValue)) {
                    return ServicePrincipalCredential.fromJson(readerToUse.reset());
                } else if ("ManagedIdentity".equals(discriminatorValue)) {
                    return ManagedIdentityCredential.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static Credential fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Credential deserializedCredential = new Credential();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedCredential.type = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedCredential.description = reader.getString();
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedCredential.annotations = annotations;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedCredential.additionalProperties = additionalProperties;

            return deserializedCredential;
        });
    }
}
