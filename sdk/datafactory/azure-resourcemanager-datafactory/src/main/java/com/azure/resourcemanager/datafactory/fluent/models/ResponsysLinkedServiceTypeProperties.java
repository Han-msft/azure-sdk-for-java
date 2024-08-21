// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Responsys linked service properties.
 */
@Fluent
public final class ResponsysLinkedServiceTypeProperties
    implements JsonSerializable<ResponsysLinkedServiceTypeProperties> {
    /*
     * The endpoint of the Responsys server.
     */
    private Object endpoint;

    /*
     * The client ID associated with the Responsys application. Type: string (or Expression with resultType string).
     */
    private Object clientId;

    /*
     * The client secret associated with the Responsys application. Type: string (or Expression with resultType string).
     */
    private SecretBase clientSecret;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true. Type: boolean
     * (or Expression with resultType boolean).
     */
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     */
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true. Type:
     * boolean (or Expression with resultType boolean).
     */
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of ResponsysLinkedServiceTypeProperties class.
     */
    public ResponsysLinkedServiceTypeProperties() {
    }

    /**
     * Get the endpoint property: The endpoint of the Responsys server.
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of the Responsys server.
     * 
     * @param endpoint the endpoint value to set.
     * @return the ResponsysLinkedServiceTypeProperties object itself.
     */
    public ResponsysLinkedServiceTypeProperties withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with the Responsys application. Type: string (or Expression
     * with resultType string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with the Responsys application. Type: string (or Expression
     * with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the ResponsysLinkedServiceTypeProperties object itself.
     */
    public ResponsysLinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with the Responsys application. Type: string (or
     * Expression with resultType string).
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with the Responsys application. Type: string (or
     * Expression with resultType string).
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the ResponsysLinkedServiceTypeProperties object itself.
     */
    public ResponsysLinkedServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the ResponsysLinkedServiceTypeProperties object itself.
     */
    public ResponsysLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the ResponsysLinkedServiceTypeProperties object itself.
     */
    public ResponsysLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the ResponsysLinkedServiceTypeProperties object itself.
     */
    public ResponsysLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ResponsysLinkedServiceTypeProperties object itself.
     */
    public ResponsysLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endpoint in model ResponsysLinkedServiceTypeProperties"));
        }
        if (clientId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property clientId in model ResponsysLinkedServiceTypeProperties"));
        }
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResponsysLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("endpoint", this.endpoint);
        jsonWriter.writeUntypedField("clientId", this.clientId);
        jsonWriter.writeJsonField("clientSecret", this.clientSecret);
        jsonWriter.writeUntypedField("useEncryptedEndpoints", this.useEncryptedEndpoints);
        jsonWriter.writeUntypedField("useHostVerification", this.useHostVerification);
        jsonWriter.writeUntypedField("usePeerVerification", this.usePeerVerification);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResponsysLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResponsysLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResponsysLinkedServiceTypeProperties.
     */
    public static ResponsysLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResponsysLinkedServiceTypeProperties deserializedResponsysLinkedServiceTypeProperties
                = new ResponsysLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpoint".equals(fieldName)) {
                    deserializedResponsysLinkedServiceTypeProperties.endpoint = reader.readUntyped();
                } else if ("clientId".equals(fieldName)) {
                    deserializedResponsysLinkedServiceTypeProperties.clientId = reader.readUntyped();
                } else if ("clientSecret".equals(fieldName)) {
                    deserializedResponsysLinkedServiceTypeProperties.clientSecret = SecretBase.fromJson(reader);
                } else if ("useEncryptedEndpoints".equals(fieldName)) {
                    deserializedResponsysLinkedServiceTypeProperties.useEncryptedEndpoints = reader.readUntyped();
                } else if ("useHostVerification".equals(fieldName)) {
                    deserializedResponsysLinkedServiceTypeProperties.useHostVerification = reader.readUntyped();
                } else if ("usePeerVerification".equals(fieldName)) {
                    deserializedResponsysLinkedServiceTypeProperties.usePeerVerification = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedResponsysLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResponsysLinkedServiceTypeProperties;
        });
    }
}
