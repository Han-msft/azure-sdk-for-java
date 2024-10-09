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
import com.azure.verticals.agrifood.farming.implementation.WeathersImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous FarmBeatsClient type. */
@ServiceClient(builder = WeatherClientBuilder.class, isAsync = true)
public final class WeatherAsyncClient {
    @Generated
    private final WeathersImpl serviceClient;

    /**
     * Initializes an instance of WeatherAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    WeatherAsyncClient(WeathersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Returns a paginated list of weather data.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>startDateTime</td><td>OffsetDateTime</td><td>No</td><td>Weather data start UTC date-time (inclusive), sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
     *     <tr><td>endDateTime</td><td>OffsetDateTime</td><td>No</td><td>Weather data end UTC date-time (inclusive), sample format: yyyy-MM-ddTHH:mm:ssZ.</td></tr>
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
     *     partyId: String (Required)
     *     boundaryId: String (Required)
     *     extensionId: String (Required)
     *     location (Required): {
     *         latitude: double (Required)
     *         longitude: double (Required)
     *     }
     *     dateTime: OffsetDateTime (Required)
     *     unitSystemCode: String (Optional)
     *     extensionVersion: String (Required)
     *     weatherDataType: String (Required)
     *     granularity: String (Required)
     *     cloudCover (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     dewPoint (Optional): (recursive schema, see dewPoint above)
     *     growingDegreeDay (Optional): (recursive schema, see growingDegreeDay above)
     *     precipitation (Optional): (recursive schema, see precipitation above)
     *     pressure (Optional): (recursive schema, see pressure above)
     *     relativeHumidity (Optional): (recursive schema, see relativeHumidity above)
     *     soilMoisture (Optional): (recursive schema, see soilMoisture above)
     *     soilTemperature (Optional): (recursive schema, see soilTemperature above)
     *     temperature (Optional): (recursive schema, see temperature above)
     *     visibility (Optional): (recursive schema, see visibility above)
     *     wetBulbTemperature (Optional): (recursive schema, see wetBulbTemperature above)
     *     windChill (Optional): (recursive schema, see windChill above)
     *     windDirection (Optional): (recursive schema, see windDirection above)
     *     windGust (Optional): (recursive schema, see windGust above)
     *     windSpeed (Optional): (recursive schema, see windSpeed above)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Party ID.
     * @param boundaryId Boundary ID.
     * @param extensionId ID of the weather extension.
     * @param weatherDataType Type of weather data (forecast/historical).
     * @param granularity Granularity of weather data (daily/hourly).
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
    public PagedFlux<BinaryData> list(String partyId, String boundaryId, String extensionId, String weatherDataType,
        String granularity, RequestOptions requestOptions) {
        return this.serviceClient.listAsync(partyId, boundaryId, extensionId, weatherDataType, granularity,
            requestOptions);
    }

    /**
     * Get weather data delete job.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     extensionId: String (Required)
     *     partyId: String (Required)
     *     boundaryId: String (Required)
     *     weatherDataType: String (Optional)
     *     granularity: String (Optional)
     *     startDateTime: OffsetDateTime (Optional)
     *     endDateTime: OffsetDateTime (Optional)
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
     * @return weather data delete job along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDataDeleteJobDetailsWithResponse(String jobId, RequestOptions requestOptions) {
        return this.serviceClient.getDataDeleteJobDetailsWithResponseAsync(jobId, requestOptions);
    }

    /**
     * Create a weather data delete job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     extensionId: String (Required)
     *     partyId: String (Required)
     *     boundaryId: String (Required)
     *     weatherDataType: String (Optional)
     *     granularity: String (Optional)
     *     startDateTime: OffsetDateTime (Optional)
     *     endDateTime: OffsetDateTime (Optional)
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
     *     extensionId: String (Required)
     *     partyId: String (Required)
     *     boundaryId: String (Required)
     *     weatherDataType: String (Optional)
     *     granularity: String (Optional)
     *     startDateTime: OffsetDateTime (Optional)
     *     endDateTime: OffsetDateTime (Optional)
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
     * @param jobId Job Id supplied by end user.
     * @param job Job parameters supplied by user.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of schema of weather data delete job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateDataDeleteJob(String jobId, BinaryData job,
        RequestOptions requestOptions) {
        return this.serviceClient.beginCreateDataDeleteJobAsync(jobId, job, requestOptions);
    }

    /**
     * Get weather ingestion job.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     boundaryId: String (Required)
     *     partyId: String (Required)
     *     extensionId: String (Required)
     *     extensionApiName: String (Required)
     *     extensionApiInput (Required): {
     *         String: Object (Required)
     *     }
     *     extensionDataProviderAppId: String (Optional)
     *     extensionDataProviderApiKey: String (Optional)
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
     * @return weather ingestion job along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDataIngestionJobDetailsWithResponse(String jobId,
        RequestOptions requestOptions) {
        return this.serviceClient.getDataIngestionJobDetailsWithResponseAsync(jobId, requestOptions);
    }

    /**
     * Create a weather data ingestion job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     boundaryId: String (Required)
     *     partyId: String (Required)
     *     extensionId: String (Required)
     *     extensionApiName: String (Required)
     *     extensionApiInput (Required): {
     *         String: Object (Required)
     *     }
     *     extensionDataProviderAppId: String (Optional)
     *     extensionDataProviderApiKey: String (Optional)
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
     *     boundaryId: String (Required)
     *     partyId: String (Required)
     *     extensionId: String (Required)
     *     extensionApiName: String (Required)
     *     extensionApiInput (Required): {
     *         String: Object (Required)
     *     }
     *     extensionDataProviderAppId: String (Optional)
     *     extensionDataProviderApiKey: String (Optional)
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
     * @param jobId Job id supplied by user.
     * @param job Job parameters supplied by user.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of schema of weather ingestion job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateDataIngestionJob(String jobId, BinaryData job,
        RequestOptions requestOptions) {
        return this.serviceClient.beginCreateDataIngestionJobAsync(jobId, job, requestOptions);
    }
}
