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
 * Oracle Service Cloud linked service properties.
 */
@Fluent
public final class OracleServiceCloudLinkedServiceTypeProperties
    implements JsonSerializable<OracleServiceCloudLinkedServiceTypeProperties> {
    /*
     * The URL of the Oracle Service Cloud instance.
     */
    private Object host;

    /*
     * The user name that you use to access Oracle Service Cloud server.
     */
    private Object username;

    /*
     * The password corresponding to the user name that you provided in the username key.
     */
    private SecretBase password;

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
     * Creates an instance of OracleServiceCloudLinkedServiceTypeProperties class.
     */
    public OracleServiceCloudLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The URL of the Oracle Service Cloud instance.
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The URL of the Oracle Service Cloud instance.
     * 
     * @param host the host value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the username property: The user name that you use to access Oracle Service Cloud server.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name that you use to access Oracle Service Cloud server.
     * 
     * @param username the username value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name that you provided in the username key.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name that you provided in the username key.
     * 
     * @param password the password value to set.
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
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
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
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
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
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
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
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
     * @return the OracleServiceCloudLinkedServiceTypeProperties object itself.
     */
    public OracleServiceCloudLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property host in model OracleServiceCloudLinkedServiceTypeProperties"));
        }
        if (username() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property username in model OracleServiceCloudLinkedServiceTypeProperties"));
        }
        if (password() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property password in model OracleServiceCloudLinkedServiceTypeProperties"));
        } else {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OracleServiceCloudLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("host", this.host);
        jsonWriter.writeUntypedField("username", this.username);
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeUntypedField("useEncryptedEndpoints", this.useEncryptedEndpoints);
        jsonWriter.writeUntypedField("useHostVerification", this.useHostVerification);
        jsonWriter.writeUntypedField("usePeerVerification", this.usePeerVerification);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OracleServiceCloudLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OracleServiceCloudLinkedServiceTypeProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OracleServiceCloudLinkedServiceTypeProperties.
     */
    public static OracleServiceCloudLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OracleServiceCloudLinkedServiceTypeProperties deserializedOracleServiceCloudLinkedServiceTypeProperties
                = new OracleServiceCloudLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("host".equals(fieldName)) {
                    deserializedOracleServiceCloudLinkedServiceTypeProperties.host = reader.readUntyped();
                } else if ("username".equals(fieldName)) {
                    deserializedOracleServiceCloudLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedOracleServiceCloudLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("useEncryptedEndpoints".equals(fieldName)) {
                    deserializedOracleServiceCloudLinkedServiceTypeProperties.useEncryptedEndpoints
                        = reader.readUntyped();
                } else if ("useHostVerification".equals(fieldName)) {
                    deserializedOracleServiceCloudLinkedServiceTypeProperties.useHostVerification
                        = reader.readUntyped();
                } else if ("usePeerVerification".equals(fieldName)) {
                    deserializedOracleServiceCloudLinkedServiceTypeProperties.usePeerVerification
                        = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedOracleServiceCloudLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOracleServiceCloudLinkedServiceTypeProperties;
        });
    }
}
