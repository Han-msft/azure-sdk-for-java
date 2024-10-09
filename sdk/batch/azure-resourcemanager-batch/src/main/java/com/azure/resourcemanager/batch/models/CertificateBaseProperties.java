// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base certificate properties.
 */
@Fluent
public class CertificateBaseProperties implements JsonSerializable<CertificateBaseProperties> {
    /*
     * This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     */
    private String thumbprintAlgorithm;

    /*
     * This must match the thumbprint from the name.
     */
    private String thumbprint;

    /*
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     */
    private CertificateFormat format;

    /**
     * Creates an instance of CertificateBaseProperties class.
     */
    public CertificateBaseProperties() {
    }

    /**
     * Get the thumbprintAlgorithm property: This must match the first portion of the certificate name. Currently
     * required to be 'SHA1'.
     * 
     * @return the thumbprintAlgorithm value.
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Set the thumbprintAlgorithm property: This must match the first portion of the certificate name. Currently
     * required to be 'SHA1'.
     * 
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set.
     * @return the CertificateBaseProperties object itself.
     */
    public CertificateBaseProperties withThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        return this;
    }

    /**
     * Get the thumbprint property: This must match the thumbprint from the name.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: This must match the thumbprint from the name.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateBaseProperties object itself.
     */
    public CertificateBaseProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     * @return the format value.
     */
    public CertificateFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     * @param format the format value to set.
     * @return the CertificateBaseProperties object itself.
     */
    public CertificateBaseProperties withFormat(CertificateFormat format) {
        this.format = format;
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
        jsonWriter.writeStringField("thumbprintAlgorithm", this.thumbprintAlgorithm);
        jsonWriter.writeStringField("thumbprint", this.thumbprint);
        jsonWriter.writeStringField("format", this.format == null ? null : this.format.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateBaseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateBaseProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateBaseProperties.
     */
    public static CertificateBaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateBaseProperties deserializedCertificateBaseProperties = new CertificateBaseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("thumbprintAlgorithm".equals(fieldName)) {
                    deserializedCertificateBaseProperties.thumbprintAlgorithm = reader.getString();
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedCertificateBaseProperties.thumbprint = reader.getString();
                } else if ("format".equals(fieldName)) {
                    deserializedCertificateBaseProperties.format = CertificateFormat.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateBaseProperties;
        });
    }
}
