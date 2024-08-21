// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base definition of WebLinkedServiceTypeProperties, this typeProperties is polymorphic based on authenticationType, so
 * not flattened in SDK models.
 */
@Fluent
public class WebLinkedServiceTypeProperties implements JsonSerializable<WebLinkedServiceTypeProperties> {
    /*
     * Type of authentication used to connect to the web table source.
     */
    private WebAuthenticationType authenticationType
        = WebAuthenticationType.fromString("WebLinkedServiceTypeProperties");

    /*
     * The URL of the web service endpoint, e.g. https://www.microsoft.com . Type: string (or Expression with resultType
     * string).
     */
    private Object url;

    /**
     * Creates an instance of WebLinkedServiceTypeProperties class.
     */
    public WebLinkedServiceTypeProperties() {
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the web table source.
     * 
     * @return the authenticationType value.
     */
    public WebAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Get the url property: The URL of the web service endpoint, e.g. https://www.microsoft.com . Type: string (or
     * Expression with resultType string).
     * 
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of the web service endpoint, e.g. https://www.microsoft.com . Type: string (or
     * Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the WebLinkedServiceTypeProperties object itself.
     */
    public WebLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property url in model WebLinkedServiceTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("url", this.url);
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebLinkedServiceTypeProperties.
     */
    public static WebLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("authenticationType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Anonymous".equals(discriminatorValue)) {
                    return WebAnonymousAuthentication.fromJson(readerToUse.reset());
                } else if ("Basic".equals(discriminatorValue)) {
                    return WebBasicAuthentication.fromJson(readerToUse.reset());
                } else if ("ClientCertificate".equals(discriminatorValue)) {
                    return WebClientCertificateAuthentication.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static WebLinkedServiceTypeProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebLinkedServiceTypeProperties deserializedWebLinkedServiceTypeProperties
                = new WebLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("url".equals(fieldName)) {
                    deserializedWebLinkedServiceTypeProperties.url = reader.readUntyped();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedWebLinkedServiceTypeProperties.authenticationType
                        = WebAuthenticationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebLinkedServiceTypeProperties;
        });
    }
}
