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
import com.azure.verticals.agrifood.farming.implementation.WeatherDatasImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous FarmBeatsClient type. */
@ServiceClient(builder = WeatherDataClientBuilder.class, isAsync = true)
public final class WeatherDataAsyncClient {
    @Generated
    private final WeatherDatasImpl serviceClient;

    /**
     * Initializes an instance of WeatherDataAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    WeatherDataAsyncClient(WeatherDatasImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Returns a list of WeatherData.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     locations (Optional): [
     *          (Optional){
     *             type: String(LatLong/IataCode/IcaoCode/PlaceId/PostalKey) (Required)
     *             value: String (Required)
     *         }
     *     ]
     *     providerAppId: String (Optional)
     *     providerApiKey: String (Required)
     *     extensionId: String (Required)
     *     extensionApiName: String (Required)
     *     language: String (Optional)
     *     startTimeHours: Integer (Optional)
     *     endTimeHours: Integer (Optional)
     *     duration: Integer (Optional)
     *     units: String (Required)
     *     additionalParams (Optional): {
     *         iconResolution: String (Optional)
     *         details: Boolean (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     weatherMetadata (Required): {
     *         extensionVersion: String (Required)
     *         weatherDataType: String (Required)
     *         extensionId: String (Required)
     *         extensionApiName: String (Required)
     *         language: String (Optional)
     *         startTimeHours: Integer (Optional)
     *         endTimeHours: Integer (Optional)
     *         duration: Integer (Optional)
     *         units: String (Required)
     *         additionalParams (Optional): {
     *             iconResolution: String (Optional)
     *             details: Boolean (Optional)
     *         }
     *     }
     *     status: String(Succeeded/Failed/PartiallySucceeded) (Optional)
     *     locations (Optional): [
     *          (Optional){
     *             location (Optional): {
     *                 type: String(LatLong/IataCode/IcaoCode/PlaceId/PostalKey) (Required)
     *                 value: String (Required)
     *             }
     *             requestCompletionTime: String (Optional)
     *             lastRefreshedDateTime: OffsetDateTime (Optional)
     *             data (Optional): {
     *                 wetBulbTemperature (Optional): {
     *                     unit: String (Optional)
     *                     values (Optional): [
     *                         double (Optional)
     *                     ]
     *                 }
     *                 cloudCover (Optional): (recursive schema, see cloudCover above)
     *                 dayOfWeek (Optional): [
     *                     String (Optional)
     *                 ]
     *                 dayOrNight (Optional): [
     *                     String (Optional)
     *                 ]
     *                 expirationTime (Optional): [
     *                     String (Optional)
     *                 ]
     *                 iconCode (Optional): [
     *                     String (Optional)
     *                 ]
     *                 iconCodeExtend (Optional): [
     *                     String (Optional)
     *                 ]
     *                 hasPrecipitation (Optional): [
     *                     boolean (Optional)
     *                 ]
     *                 pressureMeanSeaLevel (Optional): (recursive schema, see pressureMeanSeaLevel above)
     *                 relativeHumidity (Optional): (recursive schema, see relativeHumidity above)
     *                 temperature (Optional): (recursive schema, see temperature above)
     *                 temperatureDewPoint (Optional): (recursive schema, see temperatureDewPoint above)
     *                 temperatureFeelsLike (Optional): (recursive schema, see temperatureFeelsLike above)
     *                 temperatureHeatIndex (Optional): (recursive schema, see temperatureHeatIndex above)
     *                 temperatureWindChill (Optional): (recursive schema, see temperatureWindChill above)
     *                 uvDescription (Optional): [
     *                     String (Optional)
     *                 ]
     *                 uvIndex (Optional): [
     *                     String (Optional)
     *                 ]
     *                 validTimeLocal (Optional): [
     *                     String (Optional)
     *                 ]
     *                 validTime (Optional): [
     *                     String (Optional)
     *                 ]
     *                 visibility (Optional): (recursive schema, see visibility above)
     *                 windDirection (Optional): (recursive schema, see windDirection above)
     *                 windGust (Optional): (recursive schema, see windGust above)
     *                 windSpeed (Optional): (recursive schema, see windSpeed above)
     *                 wxPhraseLong (Optional): [
     *                     String (Optional)
     *                 ]
     *                 wxPhraseShort (Optional): [
     *                     String (Optional)
     *                 ]
     *                 additionalAttributes (Optional): {
     *                     String: Object (Optional)
     *                 }
     *             }
     *         }
     *     ]
     *     errors (Optional): {
     *         locations (Optional): [
     *              (Optional){
     *                 location (Optional): (recursive schema, see location above)
     *                 code: Integer (Optional)
     *                 description: String (Optional)
     *                 retryable: Boolean (Optional)
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param weatherDataProviderRequest Weather data provider request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return schema of Weather Data Provider Response along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(BinaryData weatherDataProviderRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(weatherDataProviderRequest, requestOptions);
    }
}
