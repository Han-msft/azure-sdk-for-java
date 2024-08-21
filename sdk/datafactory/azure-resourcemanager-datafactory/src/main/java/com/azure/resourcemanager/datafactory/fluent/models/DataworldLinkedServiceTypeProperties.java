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
 * Dataworld linked service type properties.
 */
@Fluent
public final class DataworldLinkedServiceTypeProperties
    implements JsonSerializable<DataworldLinkedServiceTypeProperties> {
    /*
     * The api token for the Dataworld source.
     */
    private SecretBase apiToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of DataworldLinkedServiceTypeProperties class.
     */
    public DataworldLinkedServiceTypeProperties() {
    }

    /**
     * Get the apiToken property: The api token for the Dataworld source.
     * 
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.apiToken;
    }

    /**
     * Set the apiToken property: The api token for the Dataworld source.
     * 
     * @param apiToken the apiToken value to set.
     * @return the DataworldLinkedServiceTypeProperties object itself.
     */
    public DataworldLinkedServiceTypeProperties withApiToken(SecretBase apiToken) {
        this.apiToken = apiToken;
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
     * @return the DataworldLinkedServiceTypeProperties object itself.
     */
    public DataworldLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (apiToken() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property apiToken in model DataworldLinkedServiceTypeProperties"));
        } else {
            apiToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataworldLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("apiToken", this.apiToken);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataworldLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataworldLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataworldLinkedServiceTypeProperties.
     */
    public static DataworldLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataworldLinkedServiceTypeProperties deserializedDataworldLinkedServiceTypeProperties
                = new DataworldLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("apiToken".equals(fieldName)) {
                    deserializedDataworldLinkedServiceTypeProperties.apiToken = SecretBase.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedDataworldLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataworldLinkedServiceTypeProperties;
        });
    }
}
