// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.ServerKeyType;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A server key.
 */
@Fluent
public final class ServerKeyInner extends ProxyResource {
    /*
     * Kind of encryption protector. This is metadata used for the Azure portal experience.
     */
    private String kind;

    /*
     * Resource location.
     */
    private String location;

    /*
     * Resource properties.
     */
    private ServerKeyProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ServerKeyInner class.
     */
    public ServerKeyInner() {
    }

    /**
     * Get the kind property: Kind of encryption protector. This is metadata used for the Azure portal experience.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private ServerKeyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the subregion property: Subregion of the server key.
     * 
     * @return the subregion value.
     */
    public String subregion() {
        return this.innerProperties() == null ? null : this.innerProperties().subregion();
    }

    /**
     * Get the serverKeyType property: The server key type like 'ServiceManaged', 'AzureKeyVault'.
     * 
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.innerProperties() == null ? null : this.innerProperties().serverKeyType();
    }

    /**
     * Set the serverKeyType property: The server key type like 'ServiceManaged', 'AzureKeyVault'.
     * 
     * @param serverKeyType the serverKeyType value to set.
     * @return the ServerKeyInner object itself.
     */
    public ServerKeyInner withServerKeyType(ServerKeyType serverKeyType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerKeyProperties();
        }
        this.innerProperties().withServerKeyType(serverKeyType);
        return this;
    }

    /**
     * Get the uri property: The URI of the server key. If the ServerKeyType is AzureKeyVault, then the URI is required.
     * The AKV URI is required to be in this format:
     * 'https://YourVaultName.vault.azure.net/keys/YourKeyName/YourKeyVersion'.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.innerProperties() == null ? null : this.innerProperties().uri();
    }

    /**
     * Set the uri property: The URI of the server key. If the ServerKeyType is AzureKeyVault, then the URI is required.
     * The AKV URI is required to be in this format:
     * 'https://YourVaultName.vault.azure.net/keys/YourKeyName/YourKeyVersion'.
     * 
     * @param uri the uri value to set.
     * @return the ServerKeyInner object itself.
     */
    public ServerKeyInner withUri(String uri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerKeyProperties();
        }
        this.innerProperties().withUri(uri);
        return this;
    }

    /**
     * Get the thumbprint property: Thumbprint of the server key.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Get the creationDate property: The server key creation date.
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the autoRotationEnabled property: Key auto rotation opt-in flag. Either true or false.
     * 
     * @return the autoRotationEnabled value.
     */
    public Boolean autoRotationEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().autoRotationEnabled();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerKeyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerKeyInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerKeyInner.
     */
    public static ServerKeyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerKeyInner deserializedServerKeyInner = new ServerKeyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedServerKeyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedServerKeyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedServerKeyInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedServerKeyInner.kind = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedServerKeyInner.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedServerKeyInner.innerProperties = ServerKeyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerKeyInner;
        });
    }
}
