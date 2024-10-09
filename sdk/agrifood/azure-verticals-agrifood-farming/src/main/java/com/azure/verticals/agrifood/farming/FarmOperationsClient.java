// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;

/** Initializes a new instance of the synchronous FarmBeatsClient type. */
@ServiceClient(builder = FarmOperationsClientBuilder.class)
public final class FarmOperationsClient {
    @Generated
    private final FarmOperationsAsyncClient client;

    /**
     * Initializes an instance of FarmOperationsClient class.
     *
     * @param client the async client.
     */
    @Generated
    FarmOperationsClient(FarmOperationsAsyncClient client) {
        this.client = client;
    }

    /**
     * Create a farm operation data ingestion job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     authProviderId: String (Required)
     *     operations (Optional): [
     *         String (Optional)
     *     ]
     *     startYear: int (Required)
     *     isIncremental: Boolean (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     authProviderId: String (Required)
     *     operations (Optional): [
     *         String (Optional)
     *     ]
     *     startYear: int (Required)
     *     isIncremental: Boolean (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param jobId Job Id supplied by user.
     * @param job Job parameters supplied by user.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of schema of farm operation data ingestion job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginCreateDataIngestionJob(String jobId, BinaryData job,
        RequestOptions requestOptions) {
        return this.client.beginCreateDataIngestionJob(jobId, job, requestOptions).getSyncPoller();
    }

    /**
     * Get a farm operation data ingestion job.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     authProviderId: String (Required)
     *     operations (Optional): [
     *         String (Optional)
     *     ]
     *     startYear: int (Required)
     *     isIncremental: Boolean (Optional)
     *     id: String (Optional)
     *     status: String (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param jobId Id of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a farm operation data ingestion job along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDataIngestionJobDetailsWithResponse(String jobId, RequestOptions requestOptions) {
        return this.client.getDataIngestionJobDetailsWithResponse(jobId, requestOptions).block();
    }
}
