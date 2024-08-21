// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Switch cases with have a value and corresponding activities.
 */
@Fluent
public final class SwitchCase implements JsonSerializable<SwitchCase> {
    /*
     * Expected value that satisfies the expression result of the 'on' property.
     */
    private String value;

    /*
     * List of activities to execute for satisfied case condition.
     */
    private List<Activity> activities;

    /**
     * Creates an instance of SwitchCase class.
     */
    public SwitchCase() {
    }

    /**
     * Get the value property: Expected value that satisfies the expression result of the 'on' property.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Expected value that satisfies the expression result of the 'on' property.
     * 
     * @param value the value value to set.
     * @return the SwitchCase object itself.
     */
    public SwitchCase withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the activities property: List of activities to execute for satisfied case condition.
     * 
     * @return the activities value.
     */
    public List<Activity> activities() {
        return this.activities;
    }

    /**
     * Set the activities property: List of activities to execute for satisfied case condition.
     * 
     * @param activities the activities value to set.
     * @return the SwitchCase object itself.
     */
    public SwitchCase withActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activities() != null) {
            activities().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeArrayField("activities", this.activities, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SwitchCase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SwitchCase if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SwitchCase.
     */
    public static SwitchCase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SwitchCase deserializedSwitchCase = new SwitchCase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedSwitchCase.value = reader.getString();
                } else if ("activities".equals(fieldName)) {
                    List<Activity> activities = reader.readArray(reader1 -> Activity.fromJson(reader1));
                    deserializedSwitchCase.activities = activities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSwitchCase;
        });
    }
}
