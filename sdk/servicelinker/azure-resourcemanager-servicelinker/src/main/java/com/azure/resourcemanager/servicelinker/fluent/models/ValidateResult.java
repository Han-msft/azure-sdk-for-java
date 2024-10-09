// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicelinker.models.AuthType;
import com.azure.resourcemanager.servicelinker.models.ValidationResultItem;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The validation result for a Linker.
 */
@Fluent
public final class ValidateResult implements JsonSerializable<ValidateResult> {
    /*
     * The linker name.
     */
    private String linkerName;

    /*
     * A boolean value indicating whether the connection is available or not
     */
    private Boolean isConnectionAvailable;

    /*
     * The start time of the validation report.
     */
    private OffsetDateTime reportStartTimeUtc;

    /*
     * The end time of the validation report.
     */
    private OffsetDateTime reportEndTimeUtc;

    /*
     * The resource id of the Linker source application.
     */
    private String sourceId;

    /*
     * The resource Id of target service.
     */
    private String targetId;

    /*
     * The authentication type.
     */
    private AuthType authType;

    /*
     * The detail of validation result
     */
    private List<ValidationResultItem> validationDetail;

    /**
     * Creates an instance of ValidateResult class.
     */
    public ValidateResult() {
    }

    /**
     * Get the linkerName property: The linker name.
     * 
     * @return the linkerName value.
     */
    public String linkerName() {
        return this.linkerName;
    }

    /**
     * Set the linkerName property: The linker name.
     * 
     * @param linkerName the linkerName value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withLinkerName(String linkerName) {
        this.linkerName = linkerName;
        return this;
    }

    /**
     * Get the isConnectionAvailable property: A boolean value indicating whether the connection is available or not.
     * 
     * @return the isConnectionAvailable value.
     */
    public Boolean isConnectionAvailable() {
        return this.isConnectionAvailable;
    }

    /**
     * Set the isConnectionAvailable property: A boolean value indicating whether the connection is available or not.
     * 
     * @param isConnectionAvailable the isConnectionAvailable value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withIsConnectionAvailable(Boolean isConnectionAvailable) {
        this.isConnectionAvailable = isConnectionAvailable;
        return this;
    }

    /**
     * Get the reportStartTimeUtc property: The start time of the validation report.
     * 
     * @return the reportStartTimeUtc value.
     */
    public OffsetDateTime reportStartTimeUtc() {
        return this.reportStartTimeUtc;
    }

    /**
     * Set the reportStartTimeUtc property: The start time of the validation report.
     * 
     * @param reportStartTimeUtc the reportStartTimeUtc value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withReportStartTimeUtc(OffsetDateTime reportStartTimeUtc) {
        this.reportStartTimeUtc = reportStartTimeUtc;
        return this;
    }

    /**
     * Get the reportEndTimeUtc property: The end time of the validation report.
     * 
     * @return the reportEndTimeUtc value.
     */
    public OffsetDateTime reportEndTimeUtc() {
        return this.reportEndTimeUtc;
    }

    /**
     * Set the reportEndTimeUtc property: The end time of the validation report.
     * 
     * @param reportEndTimeUtc the reportEndTimeUtc value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withReportEndTimeUtc(OffsetDateTime reportEndTimeUtc) {
        this.reportEndTimeUtc = reportEndTimeUtc;
        return this;
    }

    /**
     * Get the sourceId property: The resource id of the Linker source application.
     * 
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: The resource id of the Linker source application.
     * 
     * @param sourceId the sourceId value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get the targetId property: The resource Id of target service.
     * 
     * @return the targetId value.
     */
    public String targetId() {
        return this.targetId;
    }

    /**
     * Set the targetId property: The resource Id of target service.
     * 
     * @param targetId the targetId value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * Get the authType property: The authentication type.
     * 
     * @return the authType value.
     */
    public AuthType authType() {
        return this.authType;
    }

    /**
     * Set the authType property: The authentication type.
     * 
     * @param authType the authType value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withAuthType(AuthType authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get the validationDetail property: The detail of validation result.
     * 
     * @return the validationDetail value.
     */
    public List<ValidationResultItem> validationDetail() {
        return this.validationDetail;
    }

    /**
     * Set the validationDetail property: The detail of validation result.
     * 
     * @param validationDetail the validationDetail value to set.
     * @return the ValidateResult object itself.
     */
    public ValidateResult withValidationDetail(List<ValidationResultItem> validationDetail) {
        this.validationDetail = validationDetail;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationDetail() != null) {
            validationDetail().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("linkerName", this.linkerName);
        jsonWriter.writeBooleanField("isConnectionAvailable", this.isConnectionAvailable);
        jsonWriter.writeStringField("reportStartTimeUtc",
            this.reportStartTimeUtc == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.reportStartTimeUtc));
        jsonWriter.writeStringField("reportEndTimeUtc",
            this.reportEndTimeUtc == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.reportEndTimeUtc));
        jsonWriter.writeStringField("sourceId", this.sourceId);
        jsonWriter.writeStringField("targetId", this.targetId);
        jsonWriter.writeStringField("authType", this.authType == null ? null : this.authType.toString());
        jsonWriter.writeArrayField("validationDetail", this.validationDetail,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidateResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidateResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ValidateResult.
     */
    public static ValidateResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidateResult deserializedValidateResult = new ValidateResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkerName".equals(fieldName)) {
                    deserializedValidateResult.linkerName = reader.getString();
                } else if ("isConnectionAvailable".equals(fieldName)) {
                    deserializedValidateResult.isConnectionAvailable = reader.getNullable(JsonReader::getBoolean);
                } else if ("reportStartTimeUtc".equals(fieldName)) {
                    deserializedValidateResult.reportStartTimeUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("reportEndTimeUtc".equals(fieldName)) {
                    deserializedValidateResult.reportEndTimeUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("sourceId".equals(fieldName)) {
                    deserializedValidateResult.sourceId = reader.getString();
                } else if ("targetId".equals(fieldName)) {
                    deserializedValidateResult.targetId = reader.getString();
                } else if ("authType".equals(fieldName)) {
                    deserializedValidateResult.authType = AuthType.fromString(reader.getString());
                } else if ("validationDetail".equals(fieldName)) {
                    List<ValidationResultItem> validationDetail
                        = reader.readArray(reader1 -> ValidationResultItem.fromJson(reader1));
                    deserializedValidateResult.validationDetail = validationDetail;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidateResult;
        });
    }
}
