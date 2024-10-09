// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.implementation.models.DataSourceCredentials;
import java.io.IOException;

/**
 * Represents a datasource definition, which can be used to configure an indexer.
 */
@Fluent
public final class SearchIndexerDataSourceConnection implements JsonSerializable<SearchIndexerDataSourceConnection> {

    /*
     * The name of the datasource.
     */
    private final String name;

    /*
     * The description of the datasource.
     */
    private String description;

    /*
     * The type of the datasource.
     */
    private SearchIndexerDataSourceType type;

    /*
     * Credentials for the datasource.
     */
    private DataSourceCredentials credentials;

    /*
     * The data container for the datasource.
     */
    private SearchIndexerDataContainer container;

    /*
     * An explicit managed identity to use for this datasource. If not specified and the connection string is a managed
     * identity, the system-assigned managed identity is used. If not specified, the value remains unchanged. If "none"
     * is specified, the value of this property is cleared.
     */
    private SearchIndexerDataIdentity identity;

    /*
     * The data change detection policy for the datasource.
     */
    private DataChangeDetectionPolicy dataChangeDetectionPolicy;

    /*
     * The data deletion detection policy for the datasource.
     */
    private DataDeletionDetectionPolicy dataDeletionDetectionPolicy;

    /*
     * The ETag of the data source.
     */
    private String eTag;

    /*
     * A description of an encryption key that you create in Azure Key Vault. This key is used to provide an additional
     * level of encryption-at-rest for your datasource definition when you want full assurance that no one, not even
     * Microsoft, can decrypt your data source definition. Once you have encrypted your data source definition, it will
     * always remain encrypted. The search service will ignore attempts to set this property to null. You can change
     * this property as needed if you want to rotate your encryption key; Your datasource definition will be unaffected.
     * Encryption with customer-managed keys is not available for free search services, and is only available for paid
     * services created on or after January 1, 2019.
     */
    private SearchResourceEncryptionKey encryptionKey;

    /**
     * Creates an instance of SearchIndexerDataSourceConnection class.
     *
     * @param name the name value to set.
     */
    public SearchIndexerDataSourceConnection(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the datasource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the description property: The description of the datasource.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the datasource.
     *
     * @param description the description value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the type property: The type of the datasource.
     *
     * @return the type value.
     */
    public SearchIndexerDataSourceType getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the datasource.
     *
     * @param type the type value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection setType(SearchIndexerDataSourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the container property: The data container for the datasource.
     *
     * @return the container value.
     */
    public SearchIndexerDataContainer getContainer() {
        return this.container;
    }

    /**
     * Set the container property: The data container for the datasource.
     *
     * @param container the container value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection setContainer(SearchIndexerDataContainer container) {
        this.container = container;
        return this;
    }

    /**
     * Get the identity property: An explicit managed identity to use for this datasource. If not specified and the
     * connection string is a managed identity, the system-assigned managed identity is used. If not specified, the
     * value remains unchanged. If "none" is specified, the value of this property is cleared.
     *
     * @return the identity value.
     */
    public SearchIndexerDataIdentity getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: An explicit managed identity to use for this datasource. If not specified and the
     * connection string is a managed identity, the system-assigned managed identity is used. If not specified, the
     * value remains unchanged. If "none" is specified, the value of this property is cleared.
     *
     * @param identity the identity value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection setIdentity(SearchIndexerDataIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the dataChangeDetectionPolicy property: The data change detection policy for the datasource.
     *
     * @return the dataChangeDetectionPolicy value.
     */
    public DataChangeDetectionPolicy getDataChangeDetectionPolicy() {
        return this.dataChangeDetectionPolicy;
    }

    /**
     * Set the dataChangeDetectionPolicy property: The data change detection policy for the datasource.
     *
     * @param dataChangeDetectionPolicy the dataChangeDetectionPolicy value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection
        setDataChangeDetectionPolicy(DataChangeDetectionPolicy dataChangeDetectionPolicy) {
        this.dataChangeDetectionPolicy = dataChangeDetectionPolicy;
        return this;
    }

    /**
     * Get the dataDeletionDetectionPolicy property: The data deletion detection policy for the datasource.
     *
     * @return the dataDeletionDetectionPolicy value.
     */
    public DataDeletionDetectionPolicy getDataDeletionDetectionPolicy() {
        return this.dataDeletionDetectionPolicy;
    }

    /**
     * Set the dataDeletionDetectionPolicy property: The data deletion detection policy for the datasource.
     *
     * @param dataDeletionDetectionPolicy the dataDeletionDetectionPolicy value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection
        setDataDeletionDetectionPolicy(DataDeletionDetectionPolicy dataDeletionDetectionPolicy) {
        this.dataDeletionDetectionPolicy = dataDeletionDetectionPolicy;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the data source.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the data source.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your datasource definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your data source definition. Once you have encrypted your
     * data source definition, it will always remain encrypted. The search service will ignore attempts to set this
     * property to null. You can change this property as needed if you want to rotate your encryption key; Your
     * datasource definition will be unaffected. Encryption with customer-managed keys is not available for free search
     * services, and is only available for paid services created on or after January 1, 2019.
     *
     * @return the encryptionKey value.
     */
    public SearchResourceEncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: A description of an encryption key that you create in Azure Key Vault. This key
     * is used to provide an additional level of encryption-at-rest for your datasource definition when you want full
     * assurance that no one, not even Microsoft, can decrypt your data source definition. Once you have encrypted your
     * data source definition, it will always remain encrypted. The search service will ignore attempts to set this
     * property to null. You can change this property as needed if you want to rotate your encryption key; Your
     * datasource definition will be unaffected. Encryption with customer-managed keys is not available for free search
     * services, and is only available for paid services created on or after January 1, 2019.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection setEncryptionKey(SearchResourceEncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("credentials", this.credentials);
        jsonWriter.writeJsonField("container", this.container);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("dataChangeDetectionPolicy", this.dataChangeDetectionPolicy);
        jsonWriter.writeJsonField("dataDeletionDetectionPolicy", this.dataDeletionDetectionPolicy);
        jsonWriter.writeStringField("@odata.etag", this.eTag);
        jsonWriter.writeJsonField("encryptionKey", this.encryptionKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerDataSourceConnection from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerDataSourceConnection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchIndexerDataSourceConnection.
     */
    public static SearchIndexerDataSourceConnection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            String description = null;
            SearchIndexerDataSourceType type = null;
            DataSourceCredentials credentials = null;
            SearchIndexerDataContainer container = null;
            SearchIndexerDataIdentity identity = null;
            DataChangeDetectionPolicy dataChangeDetectionPolicy = null;
            DataDeletionDetectionPolicy dataDeletionDetectionPolicy = null;
            String eTag = null;
            SearchResourceEncryptionKey encryptionKey = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = SearchIndexerDataSourceType.fromString(reader.getString());
                } else if ("credentials".equals(fieldName)) {
                    credentials = DataSourceCredentials.fromJson(reader);
                } else if ("container".equals(fieldName)) {
                    container = SearchIndexerDataContainer.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    identity = SearchIndexerDataIdentity.fromJson(reader);
                } else if ("dataChangeDetectionPolicy".equals(fieldName)) {
                    dataChangeDetectionPolicy = DataChangeDetectionPolicy.fromJson(reader);
                } else if ("dataDeletionDetectionPolicy".equals(fieldName)) {
                    dataDeletionDetectionPolicy = DataDeletionDetectionPolicy.fromJson(reader);
                } else if ("@odata.etag".equals(fieldName)) {
                    eTag = reader.getString();
                } else if ("encryptionKey".equals(fieldName)) {
                    encryptionKey = SearchResourceEncryptionKey.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                SearchIndexerDataSourceConnection deserializedSearchIndexerDataSourceConnection
                    = new SearchIndexerDataSourceConnection(name);
                deserializedSearchIndexerDataSourceConnection.description = description;
                deserializedSearchIndexerDataSourceConnection.type = type;
                deserializedSearchIndexerDataSourceConnection.credentials = credentials;
                deserializedSearchIndexerDataSourceConnection.container = container;
                deserializedSearchIndexerDataSourceConnection.identity = identity;
                deserializedSearchIndexerDataSourceConnection.dataChangeDetectionPolicy = dataChangeDetectionPolicy;
                deserializedSearchIndexerDataSourceConnection.dataDeletionDetectionPolicy = dataDeletionDetectionPolicy;
                deserializedSearchIndexerDataSourceConnection.eTag = eTag;
                deserializedSearchIndexerDataSourceConnection.encryptionKey = encryptionKey;
                return deserializedSearchIndexerDataSourceConnection;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }

    /**
     * Constructor of {@link SearchIndexerDataSourceConnection}.
     *
     * @param name The name of the datasource.
     * @param type The type of the datasource.
     * @param connectionString The connection string for the datasource.
     * @param container The data container for the datasource.
     */
    public SearchIndexerDataSourceConnection(String name, SearchIndexerDataSourceType type, String connectionString,
        SearchIndexerDataContainer container) {
        this.name = name;
        this.type = type;
        this.credentials
            = (connectionString == null) ? null : new DataSourceCredentials().setConnectionString(connectionString);
        this.container = container;
    }

    /**
     * Get the connectionString property: The connection string for the datasource.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return (credentials == null) ? null : credentials.getConnectionString();
    }

    /**
     * Set the connectionString property: The connection string for the datasource.
     *
     * @param connectionString the connectionString value to set.
     * @return the SearchIndexerDataSourceConnection object itself.
     */
    public SearchIndexerDataSourceConnection setConnectionString(String connectionString) {
        if (connectionString == null) {
            this.credentials = null;
        } else if (credentials == null) {
            this.credentials = new DataSourceCredentials().setConnectionString(connectionString);
        } else {
            credentials.setConnectionString(connectionString);
        }
        return this;
    }
}
