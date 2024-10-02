// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A resource with narrative, extensions, and contained resources
 * Based on [FHIR DomainResource](https://www.hl7.org/fhir/domainresource.html).
 */
@Immutable
public class FhirR4DomainResource extends FhirR4Resource {

    /*
     * Discriminator property for Fhir_R4_DomainResource.
     */
    @Generated
    private String resourceType = "Fhir_R4_DomainResource";

    /*
     * Text summary of the resource, for human interpretation
     */
    @Generated
    private FhirR4Narrative text;

    /*
     * Contained, inline Resources
     */
    @Generated
    private List<FhirR4Resource> contained;

    /*
     * Additional Content defined by implementations
     */
    @Generated
    private List<FhirR4Extension> extension;

    /*
     * Extensions that cannot be ignored
     */
    @Generated
    private List<FhirR4Extension> modifierExtension;

    /**
     * Creates an instance of FhirR4DomainResource class.
     *
     * @param resourceType the resourceType value to set.
     */
    @Generated
    protected FhirR4DomainResource(String resourceType) {
        super(resourceType);
    }

    /**
     * Get the resourceType property: Discriminator property for Fhir_R4_DomainResource.
     *
     * @return the resourceType value.
     */
    @Generated
    @Override
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Get the text property: Text summary of the resource, for human interpretation.
     *
     * @return the text value.
     */
    @Generated
    public FhirR4Narrative getText() {
        return this.text;
    }

    /**
     * Get the contained property: Contained, inline Resources.
     *
     * @return the contained value.
     */
    @Generated
    public List<FhirR4Resource> getContained() {
        return this.contained;
    }

    /**
     * Get the extension property: Additional Content defined by implementations.
     *
     * @return the extension value.
     */
    @Generated
    public List<FhirR4Extension> getExtension() {
        return this.extension;
    }

    /**
     * Get the modifierExtension property: Extensions that cannot be ignored.
     *
     * @return the modifierExtension value.
     */
    @Generated
    public List<FhirR4Extension> getModifierExtension() {
        return this.modifierExtension;
    }

    /**
     * Set the text property: Text summary of the resource, for human interpretation.
     *
     * @param text the text value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    FhirR4DomainResource setText(FhirR4Narrative text) {
        this.text = text;
        return this;
    }

    /**
     * Set the contained property: Contained, inline Resources.
     *
     * @param contained the contained value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    FhirR4DomainResource setContained(List<FhirR4Resource> contained) {
        this.contained = contained;
        return this;
    }

    /**
     * Set the extension property: Additional Content defined by implementations.
     *
     * @param extension the extension value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    FhirR4DomainResource setExtension(List<FhirR4Extension> extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Set the modifierExtension property: Extensions that cannot be ignored.
     *
     * @param modifierExtension the modifierExtension value to set.
     * @return the FhirR4DomainResource object itself.
     */
    @Generated
    FhirR4DomainResource setModifierExtension(List<FhirR4Extension> modifierExtension) {
        this.modifierExtension = modifierExtension;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeJsonField("meta", getMeta());
        jsonWriter.writeStringField("implicitRules", getImplicitRules());
        jsonWriter.writeStringField("language", getLanguage());
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeJsonField("text", this.text);
        jsonWriter.writeArrayField("contained", this.contained, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("extension", this.extension, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("modifierExtension", this.modifierExtension,
            (writer, element) -> writer.writeJson(element));
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FhirR4DomainResource from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FhirR4DomainResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FhirR4DomainResource.
     */
    @Generated
    public static FhirR4DomainResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("resourceType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Condition".equals(discriminatorValue)) {
                    return FhirR4Condition.fromJson(readerToUse.reset());
                } else if ("ResearchStudy".equals(discriminatorValue)) {
                    return FhirR4ResearchStudy.fromJson(readerToUse.reset());
                } else if ("Observation".equals(discriminatorValue)) {
                    return FhirR4Observation.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static FhirR4DomainResource fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            FhirR4Meta meta = null;
            String implicitRules = null;
            String language = null;
            String resourceType = null;
            FhirR4Narrative text = null;
            List<FhirR4Resource> contained = null;
            List<FhirR4Extension> extension = null;
            List<FhirR4Extension> modifierExtension = null;
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("meta".equals(fieldName)) {
                    meta = FhirR4Meta.fromJson(reader);
                } else if ("implicitRules".equals(fieldName)) {
                    implicitRules = reader.getString();
                } else if ("language".equals(fieldName)) {
                    language = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    resourceType = reader.getString();
                } else if ("text".equals(fieldName)) {
                    text = FhirR4Narrative.fromJson(reader);
                } else if ("contained".equals(fieldName)) {
                    contained = reader.readArray(reader1 -> FhirR4Resource.fromJson(reader1));
                } else if ("extension".equals(fieldName)) {
                    extension = reader.readArray(reader1 -> FhirR4Extension.fromJson(reader1));
                } else if ("modifierExtension".equals(fieldName)) {
                    modifierExtension = reader.readArray(reader1 -> FhirR4Extension.fromJson(reader1));
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }
                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            FhirR4DomainResource deserializedFhirR4DomainResource = new FhirR4DomainResource(resourceType);
            deserializedFhirR4DomainResource.setId(id);
            deserializedFhirR4DomainResource.setMeta(meta);
            deserializedFhirR4DomainResource.setImplicitRules(implicitRules);
            deserializedFhirR4DomainResource.setLanguage(language);
            deserializedFhirR4DomainResource.resourceType = resourceType;
            deserializedFhirR4DomainResource.text = text;
            deserializedFhirR4DomainResource.contained = contained;
            deserializedFhirR4DomainResource.extension = extension;
            deserializedFhirR4DomainResource.modifierExtension = modifierExtension;
            deserializedFhirR4DomainResource.setAdditionalProperties(additionalProperties);
            return deserializedFhirR4DomainResource;
        });
    }
}
