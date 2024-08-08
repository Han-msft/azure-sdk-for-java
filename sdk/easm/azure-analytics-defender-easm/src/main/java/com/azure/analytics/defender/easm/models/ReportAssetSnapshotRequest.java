// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A request body used to retrieve an asset report snapshot.
 */
@Fluent
public final class ReportAssetSnapshotRequest implements JsonSerializable<ReportAssetSnapshotRequest> {

    /*
     * The metric to retrieve a snapshot for.
     */
    @Generated
    private String metric;

    /*
     * The name of the label to retrieve a snapshot for.
     */
    @Generated
    private String labelName;

    /*
     * The number of assets per page.
     */
    @Generated
    private Integer size;

    /*
     * The page to retrieve.
     */
    @Generated
    private Integer page;

    /**
     * Creates an instance of ReportAssetSnapshotRequest class.
     */
    @Generated
    public ReportAssetSnapshotRequest() {
    }

    /**
     * Get the metric property: The metric to retrieve a snapshot for.
     *
     * @return the metric value.
     */
    @Generated
    public String getMetric() {
        return this.metric;
    }

    /**
     * Set the metric property: The metric to retrieve a snapshot for.
     *
     * @param metric the metric value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the labelName property: The name of the label to retrieve a snapshot for.
     *
     * @return the labelName value.
     */
    @Generated
    public String getLabelName() {
        return this.labelName;
    }

    /**
     * Set the labelName property: The name of the label to retrieve a snapshot for.
     *
     * @param labelName the labelName value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * Get the size property: The number of assets per page.
     *
     * @return the size value.
     */
    @Generated
    public Integer getSize() {
        return this.size;
    }

    /**
     * Set the size property: The number of assets per page.
     *
     * @param size the size value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the page property: The page to retrieve.
     *
     * @return the page value.
     */
    @Generated
    public Integer getPage() {
        return this.page;
    }

    /**
     * Set the page property: The page to retrieve.
     *
     * @param page the page value to set.
     * @return the ReportAssetSnapshotRequest object itself.
     */
    @Generated
    public ReportAssetSnapshotRequest setPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("metric", this.metric);
        jsonWriter.writeStringField("labelName", this.labelName);
        jsonWriter.writeNumberField("size", this.size);
        jsonWriter.writeNumberField("page", this.page);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReportAssetSnapshotRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReportAssetSnapshotRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReportAssetSnapshotRequest.
     */
    @Generated
    public static ReportAssetSnapshotRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReportAssetSnapshotRequest deserializedReportAssetSnapshotRequest = new ReportAssetSnapshotRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("metric".equals(fieldName)) {
                    deserializedReportAssetSnapshotRequest.metric = reader.getString();
                } else if ("labelName".equals(fieldName)) {
                    deserializedReportAssetSnapshotRequest.labelName = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedReportAssetSnapshotRequest.size = reader.getNullable(JsonReader::getInt);
                } else if ("page".equals(fieldName)) {
                    deserializedReportAssetSnapshotRequest.page = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedReportAssetSnapshotRequest;
        });
    }
}
