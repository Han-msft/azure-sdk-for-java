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
import java.util.List;

/**
 * Any resource that is a [DomainResource](https://www.hl7.org/fhir/domainresource.html) may include a human-readable
 * narrative that contains a summary of the resource and may be used to represent the content of the resource to a
 * human.
 * Based on [FHIR Narrative](https://www.hl7.org/fhir/R4/narrative.html#Narrative).
 */
@Immutable
public final class FhirR4Narrative extends FhirR4Element {

    /*
     * generated, extensions, additional, empty
     */
    @Generated
    private final String status;

    /*
     * xhtml
     */
    @Generated
    private final String div;

    /**
     * Creates an instance of FhirR4Narrative class.
     *
     * @param status the status value to set.
     * @param div the div value to set.
     */
    @Generated
    private FhirR4Narrative(String status, String div) {
        this.status = status;
        this.div = div;
    }

    /**
     * Get the status property: generated, extensions, additional, empty.
     *
     * @return the status value.
     */
    @Generated
    public String getStatus() {
        return this.status;
    }

    /**
     * Get the div property: xhtml.
     *
     * @return the div value.
     */
    @Generated
    public String getDiv() {
        return this.div;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeArrayField("extension", getExtension(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("div", this.div);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FhirR4Narrative from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FhirR4Narrative if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FhirR4Narrative.
     */
    @Generated
    public static FhirR4Narrative fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            List<FhirR4Extension> extension = null;
            String status = null;
            String div = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("extension".equals(fieldName)) {
                    extension = reader.readArray(reader1 -> FhirR4Extension.fromJson(reader1));
                } else if ("status".equals(fieldName)) {
                    status = reader.getString();
                } else if ("div".equals(fieldName)) {
                    div = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            FhirR4Narrative deserializedFhirR4Narrative = new FhirR4Narrative(status, div);
            deserializedFhirR4Narrative.setId(id);
            deserializedFhirR4Narrative.setExtension(extension);
            return deserializedFhirR4Narrative;
        });
    }
}
