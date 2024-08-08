// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The SslServerConfig model.
 */
@Immutable
public final class SslServerConfig implements JsonSerializable<SslServerConfig> {

    /*
     * The tlsVersions property.
     */
    @Generated
    private List<String> tlsVersions;

    /*
     * The cipherSuites property.
     */
    @Generated
    private List<String> cipherSuites;

    /*
     * The firstSeen property.
     */
    @Generated
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    private Long count;

    /*
     * The sources property.
     */
    @Generated
    private List<Source> sources;

    /**
     * Creates an instance of SslServerConfig class.
     */
    @Generated
    private SslServerConfig() {
    }

    /**
     * Get the tlsVersions property: The tlsVersions property.
     *
     * @return the tlsVersions value.
     */
    @Generated
    public List<String> getTlsVersions() {
        return this.tlsVersions;
    }

    /**
     * Get the cipherSuites property: The cipherSuites property.
     *
     * @return the cipherSuites value.
     */
    @Generated
    public List<String> getCipherSuites() {
        return this.cipherSuites;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    @Generated
    public List<Source> getSources() {
        return this.sources;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("tlsVersions", this.tlsVersions, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("cipherSuites", this.cipherSuites, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("firstSeen",
            this.firstSeen == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.firstSeen));
        jsonWriter.writeStringField("lastSeen",
            this.lastSeen == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastSeen));
        jsonWriter.writeNumberField("count", this.count);
        jsonWriter.writeArrayField("sources", this.sources, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SslServerConfig from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SslServerConfig if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SslServerConfig.
     */
    @Generated
    public static SslServerConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SslServerConfig deserializedSslServerConfig = new SslServerConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("tlsVersions".equals(fieldName)) {
                    List<String> tlsVersions = reader.readArray(reader1 -> reader1.getString());
                    deserializedSslServerConfig.tlsVersions = tlsVersions;
                } else if ("cipherSuites".equals(fieldName)) {
                    List<String> cipherSuites = reader.readArray(reader1 -> reader1.getString());
                    deserializedSslServerConfig.cipherSuites = cipherSuites;
                } else if ("firstSeen".equals(fieldName)) {
                    deserializedSslServerConfig.firstSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastSeen".equals(fieldName)) {
                    deserializedSslServerConfig.lastSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("count".equals(fieldName)) {
                    deserializedSslServerConfig.count = reader.getNullable(JsonReader::getLong);
                } else if ("sources".equals(fieldName)) {
                    List<Source> sources = reader.readArray(reader1 -> Source.fromJson(reader1));
                    deserializedSslServerConfig.sources = sources;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedSslServerConfig;
        });
    }
}
