// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response body structure for starting data flow debug session.
 */
@Fluent
public final class AddDataFlowToDebugSessionResponseInner
    implements JsonSerializable<AddDataFlowToDebugSessionResponseInner> {
    /*
     * The ID of data flow debug job version.
     */
    private String jobVersion;

    /**
     * Creates an instance of AddDataFlowToDebugSessionResponseInner class.
     */
    public AddDataFlowToDebugSessionResponseInner() {
    }

    /**
     * Get the jobVersion property: The ID of data flow debug job version.
     * 
     * @return the jobVersion value.
     */
    public String jobVersion() {
        return this.jobVersion;
    }

    /**
     * Set the jobVersion property: The ID of data flow debug job version.
     * 
     * @param jobVersion the jobVersion value to set.
     * @return the AddDataFlowToDebugSessionResponseInner object itself.
     */
    public AddDataFlowToDebugSessionResponseInner withJobVersion(String jobVersion) {
        this.jobVersion = jobVersion;
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
        jsonWriter.writeStringField("jobVersion", this.jobVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AddDataFlowToDebugSessionResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AddDataFlowToDebugSessionResponseInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AddDataFlowToDebugSessionResponseInner.
     */
    public static AddDataFlowToDebugSessionResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AddDataFlowToDebugSessionResponseInner deserializedAddDataFlowToDebugSessionResponseInner
                = new AddDataFlowToDebugSessionResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobVersion".equals(fieldName)) {
                    deserializedAddDataFlowToDebugSessionResponseInner.jobVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAddDataFlowToDebugSessionResponseInner;
        });
    }
}
