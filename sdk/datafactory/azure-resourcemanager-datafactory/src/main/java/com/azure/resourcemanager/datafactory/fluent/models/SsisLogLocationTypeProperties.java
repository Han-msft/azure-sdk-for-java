// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.SsisAccessCredential;
import java.io.IOException;

/**
 * SSIS package execution log location properties.
 */
@Fluent
public final class SsisLogLocationTypeProperties implements JsonSerializable<SsisLogLocationTypeProperties> {
    /*
     * The package execution log access credential.
     */
    private SsisAccessCredential accessCredential;

    /*
     * Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    private Object logRefreshInterval;

    /**
     * Creates an instance of SsisLogLocationTypeProperties class.
     */
    public SsisLogLocationTypeProperties() {
    }

    /**
     * Get the accessCredential property: The package execution log access credential.
     * 
     * @return the accessCredential value.
     */
    public SsisAccessCredential accessCredential() {
        return this.accessCredential;
    }

    /**
     * Set the accessCredential property: The package execution log access credential.
     * 
     * @param accessCredential the accessCredential value to set.
     * @return the SsisLogLocationTypeProperties object itself.
     */
    public SsisLogLocationTypeProperties withAccessCredential(SsisAccessCredential accessCredential) {
        this.accessCredential = accessCredential;
        return this;
    }

    /**
     * Get the logRefreshInterval property: Specifies the interval to refresh log. The default interval is 5 minutes.
     * Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the logRefreshInterval value.
     */
    public Object logRefreshInterval() {
        return this.logRefreshInterval;
    }

    /**
     * Set the logRefreshInterval property: Specifies the interval to refresh log. The default interval is 5 minutes.
     * Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param logRefreshInterval the logRefreshInterval value to set.
     * @return the SsisLogLocationTypeProperties object itself.
     */
    public SsisLogLocationTypeProperties withLogRefreshInterval(Object logRefreshInterval) {
        this.logRefreshInterval = logRefreshInterval;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessCredential() != null) {
            accessCredential().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("accessCredential", this.accessCredential);
        jsonWriter.writeUntypedField("logRefreshInterval", this.logRefreshInterval);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SsisLogLocationTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SsisLogLocationTypeProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SsisLogLocationTypeProperties.
     */
    public static SsisLogLocationTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SsisLogLocationTypeProperties deserializedSsisLogLocationTypeProperties
                = new SsisLogLocationTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accessCredential".equals(fieldName)) {
                    deserializedSsisLogLocationTypeProperties.accessCredential = SsisAccessCredential.fromJson(reader);
                } else if ("logRefreshInterval".equals(fieldName)) {
                    deserializedSsisLogLocationTypeProperties.logRefreshInterval = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSsisLogLocationTypeProperties;
        });
    }
}
