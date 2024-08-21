// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The kafka rest proxy configuration which contains AAD security group information.
 */
@Fluent
public final class KafkaRestProperties implements JsonSerializable<KafkaRestProperties> {
    /*
     * The information of AAD security group.
     */
    private ClientGroupInfo clientGroupInfo;

    /*
     * The configurations that need to be overriden.
     */
    private Map<String, String> configurationOverride;

    /**
     * Creates an instance of KafkaRestProperties class.
     */
    public KafkaRestProperties() {
    }

    /**
     * Get the clientGroupInfo property: The information of AAD security group.
     * 
     * @return the clientGroupInfo value.
     */
    public ClientGroupInfo clientGroupInfo() {
        return this.clientGroupInfo;
    }

    /**
     * Set the clientGroupInfo property: The information of AAD security group.
     * 
     * @param clientGroupInfo the clientGroupInfo value to set.
     * @return the KafkaRestProperties object itself.
     */
    public KafkaRestProperties withClientGroupInfo(ClientGroupInfo clientGroupInfo) {
        this.clientGroupInfo = clientGroupInfo;
        return this;
    }

    /**
     * Get the configurationOverride property: The configurations that need to be overriden.
     * 
     * @return the configurationOverride value.
     */
    public Map<String, String> configurationOverride() {
        return this.configurationOverride;
    }

    /**
     * Set the configurationOverride property: The configurations that need to be overriden.
     * 
     * @param configurationOverride the configurationOverride value to set.
     * @return the KafkaRestProperties object itself.
     */
    public KafkaRestProperties withConfigurationOverride(Map<String, String> configurationOverride) {
        this.configurationOverride = configurationOverride;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientGroupInfo() != null) {
            clientGroupInfo().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("clientGroupInfo", this.clientGroupInfo);
        jsonWriter.writeMapField("configurationOverride", this.configurationOverride,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KafkaRestProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KafkaRestProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KafkaRestProperties.
     */
    public static KafkaRestProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KafkaRestProperties deserializedKafkaRestProperties = new KafkaRestProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clientGroupInfo".equals(fieldName)) {
                    deserializedKafkaRestProperties.clientGroupInfo = ClientGroupInfo.fromJson(reader);
                } else if ("configurationOverride".equals(fieldName)) {
                    Map<String, String> configurationOverride = reader.readMap(reader1 -> reader1.getString());
                    deserializedKafkaRestProperties.configurationOverride = configurationOverride;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKafkaRestProperties;
        });
    }
}
