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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import com.azure.verticals.agrifood.farming.implementation.InsightsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous FarmBeatsClient type. */
@ServiceClient(builder = InsightsClientBuilder.class, isAsync = true)
public final class InsightsAsyncClient {
    @Generated
    private final InsightsImpl serviceClient;

    /**
     * Initializes an instance of InsightsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    InsightsAsyncClient(InsightsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create a cascade delete job for insights specified partyId/modelId/resourceType/resourceId.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Job ID supplied by end user.
     * @param partyId ID of the associated party.
     * @param modelId Id of the associated model.
     * @param resourceType Resource Type.
     * @param resourceId Id of the associated resource.
     * @param insightId Insight id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of schema of cascade delete job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateCascadeDeleteJob(String jobId, String partyId, String modelId,
        String resourceType, String resourceId, String insightId, RequestOptions requestOptions) {
        return this.serviceClient.beginCreateCascadeDeleteJobAsync(jobId, partyId, modelId, resourceType, resourceId,
            insightId, requestOptions);
    }

    /**
     * Get a cascade delete job for specified insight.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Id of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a cascade delete job for specified insight along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCascadeDeleteJobDetailsWithResponse(String jobId,
        RequestOptions requestOptions) {
        return this.serviceClient.getCascadeDeleteJobDetailsWithResponseAsync(jobId, requestOptions);
    }

    /**
     * Returns a paginated list of insight resources.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>minInsightStartDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum insightStartDateTime time of insight resources (inclusive), sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
     *     <tr><td>maxInsightStartDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum insightStartDateTime time of insight resources (inclusive), sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
     *     <tr><td>minInsightEndDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum insightEndDateTime time of insight resources (inclusive), sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
     *     <tr><td>maxInsightEndDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum insightEndDateTime time of insight resources (inclusive), sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
     *     <tr><td>measurementFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on measureKey.unit/unitValue or measureKey.value/value pairs within the Measures object.
     * eg. "measureKey.unit eq {testValue}" where testValue is string.
     * eg. "measureKey.value eq {testValue}" where testValue = double. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     modelId: String (Optional)
     *     resourceType: String(Party/Farm/Field/SeasonalField/Boundary) (Optional)
     *     resourceId: String (Optional)
     *     modelVersion: String (Optional)
     *     attachmentsLink: String (Optional)
     *     insightStartDateTime: OffsetDateTime (Optional)
     *     insightEndDateTime: OffsetDateTime (Optional)
     *     measurements (Optional): {
     *         String (Optional): {
     *             unit: String (Optional)
     *             value: Double (Optional)
     *         }
     *     }
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
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
     * @param partyId Id of the associated party.
     * @param modelId Id of the associated model.
     * @param resourceType Resource type associated with the record.
     * @param resourceId Id of the associated resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByPartyIdModelIdAndResource(String partyId, String modelId, String resourceType,
        String resourceId, RequestOptions requestOptions) {
        return this.serviceClient.listByPartyIdModelIdAndResourceAsync(partyId, modelId, resourceType, resourceId,
            requestOptions);
    }

    /**
     * Creates or updates insight entity.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     modelId: String (Optional)
     *     resourceType: String(Party/Farm/Field/SeasonalField/Boundary) (Optional)
     *     resourceId: String (Optional)
     *     modelVersion: String (Optional)
     *     attachmentsLink: String (Optional)
     *     insightStartDateTime: OffsetDateTime (Optional)
     *     insightEndDateTime: OffsetDateTime (Optional)
     *     measurements (Optional): {
     *         String (Optional): {
     *             unit: String (Optional)
     *             value: Double (Optional)
     *         }
     *     }
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
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
     *     partyId: String (Optional)
     *     modelId: String (Optional)
     *     resourceType: String(Party/Farm/Field/SeasonalField/Boundary) (Optional)
     *     resourceId: String (Optional)
     *     modelVersion: String (Optional)
     *     attachmentsLink: String (Optional)
     *     insightStartDateTime: OffsetDateTime (Optional)
     *     insightEndDateTime: OffsetDateTime (Optional)
     *     measurements (Optional): {
     *         String (Optional): {
     *             unit: String (Optional)
     *             value: Double (Optional)
     *         }
     *     }
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
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
     * @param partyId Id of the associated party.
     * @param modelId Id of the associated model. It can be either 'BiomassModelId', 'SensorPlacementModelId',
     *     'SoilMoistureModelId' or any solution id.
     * @param resourceType Resource type associated with the record.
     * @param resourceId Id of the associated resource.
     * @param insightId Id of the insight resource.
     * @param insightData Insight data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return schema of insight resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(String partyId, String modelId, String resourceType,
        String resourceId, String insightId, BinaryData insightData, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(partyId, modelId, resourceType, resourceId, insightId,
            insightData, requestOptions);
    }

    /**
     * Gets a specified insight resource under a particular party.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     modelId: String (Optional)
     *     resourceType: String(Party/Farm/Field/SeasonalField/Boundary) (Optional)
     *     resourceId: String (Optional)
     *     modelVersion: String (Optional)
     *     attachmentsLink: String (Optional)
     *     insightStartDateTime: OffsetDateTime (Optional)
     *     insightEndDateTime: OffsetDateTime (Optional)
     *     measurements (Optional): {
     *         String (Optional): {
     *             unit: String (Optional)
     *             value: Double (Optional)
     *         }
     *     }
     *     id: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     eTag: String (Optional)
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
     * @param partyId Id of the associated party.
     * @param modelId Id of the associated model. It can be either 'BiomassModelId', 'SensorPlacementModelId',
     *     'SoilMoistureModelId' or any solution id.
     * @param resourceType Resource type associated with the record.
     * @param resourceId Id of the associated resource.
     * @param insightId Id of the insight resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specified insight resource under a particular party along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String partyId, String modelId, String resourceType,
        String resourceId, String insightId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(partyId, modelId, resourceType, resourceId, insightId,
            requestOptions);
    }

    /**
     * Deletes a specified insight resource.
     *
     * @param partyId Id of the associated party.
     * @param modelId Id of the associated model. It can be either 'BiomassModelId', 'SensorPlacementModelId',
     *     'SoilMoistureModelId' or any solution id.
     * @param resourceType Resource type associated with the record.
     * @param resourceId Id of the associated resource.
     * @param insightId Id of the insight resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String partyId, String modelId, String resourceType,
        String resourceId, String insightId, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(partyId, modelId, resourceType, resourceId, insightId,
            requestOptions);
    }
}
