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
 * AmazonRdsForOracle database linked service properties.
 */
@Fluent
public final class AmazonRdsForLinkedServiceTypeProperties
    implements JsonSerializable<AmazonRdsForLinkedServiceTypeProperties> {
    /*
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    private Object connectionString;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of AmazonRdsForLinkedServiceTypeProperties class.
     */
    public AmazonRdsForLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the AmazonRdsForLinkedServiceTypeProperties object itself.
     */
    public AmazonRdsForLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @param password the password value to set.
     * @return the AmazonRdsForLinkedServiceTypeProperties object itself.
     */
    public AmazonRdsForLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
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
     * @return the AmazonRdsForLinkedServiceTypeProperties object itself.
     */
    public AmazonRdsForLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property connectionString in model AmazonRdsForLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmazonRdsForLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("connectionString", this.connectionString);
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmazonRdsForLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmazonRdsForLinkedServiceTypeProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AmazonRdsForLinkedServiceTypeProperties.
     */
    public static AmazonRdsForLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmazonRdsForLinkedServiceTypeProperties deserializedAmazonRdsForLinkedServiceTypeProperties
                = new AmazonRdsForLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionString".equals(fieldName)) {
                    deserializedAmazonRdsForLinkedServiceTypeProperties.connectionString = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedAmazonRdsForLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedAmazonRdsForLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAmazonRdsForLinkedServiceTypeProperties;
        });
    }
}
