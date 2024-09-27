// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap;

import com.azure.analytics.purview.datamap.implementation.DiscoveriesImpl;
import com.azure.analytics.purview.datamap.models.AutoCompleteOptions;
import com.azure.analytics.purview.datamap.models.AutoCompleteResult;
import com.azure.analytics.purview.datamap.models.QueryOptions;
import com.azure.analytics.purview.datamap.models.QueryResult;
import com.azure.analytics.purview.datamap.models.SuggestOptions;
import com.azure.analytics.purview.datamap.models.SuggestResult;
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
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous DataMapClient type.
 */
@ServiceClient(builder = DataMapClientBuilder.class, isAsync = true)
public final class DiscoveryAsyncClient {
    @Generated
    private final DiscoveriesImpl serviceClient;

    /**
     * Initializes an instance of DiscoveryAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    DiscoveryAsyncClient(DiscoveriesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get data using search.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     keywords: String (Optional)
     *     limit: Integer (Optional)
     *     continuationToken: String (Optional)
     *     orderby (Optional): [
     *         Object (Optional)
     *     ]
     *     filter: Object (Optional)
     *     facets (Optional): [
     *          (Optional){
     *             count: Integer (Optional)
     *             facet: String (Optional)
     *             sort (Optional): {
     *                 count: String(asc/desc) (Optional)
     *                 value: String(asc/desc) (Optional)
     *             }
     *         }
     *     ]
     *     taxonomySetting (Optional): {
     *         assetTypes (Optional): [
     *             String (Optional)
     *         ]
     *         facet (Optional): (recursive schema, see facet above)
     *     }
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     &#64;search.count: Integer (Optional)
     *     &#64;search.count.approximate: Boolean (Optional)
     *     continuationToken: String (Optional)
     *     &#64;search.facets (Optional): {
     *         entityType (Optional): [
     *              (Optional){
     *                 count: Integer (Optional)
     *                 value: String (Optional)
     *             }
     *         ]
     *         assetType (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         classification (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         term (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         contactId (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         contactType (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         label (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         glossaryType (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         termStatus (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         termTemplate (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     value (Optional): [
     *          (Optional){
     *             &#64;search.score: Double (Optional)
     *             &#64;search.highlights (Optional): {
     *                 id (Optional): [
     *                     String (Optional)
     *                 ]
     *                 qualifiedName (Optional): [
     *                     String (Optional)
     *                 ]
     *                 name (Optional): [
     *                     String (Optional)
     *                 ]
     *                 description (Optional): [
     *                     String (Optional)
     *                 ]
     *                 entityType (Optional): [
     *                     String (Optional)
     *                 ]
     *             }
     *             objectType: String (Optional)
     *             createTime: Long (Optional)
     *             updateTime: Long (Optional)
     *             id: String (Optional)
     *             name: String (Optional)
     *             qualifiedName: String (Optional)
     *             entityType: String (Optional)
     *             description: String (Optional)
     *             endorsement: String (Optional)
     *             owner: String (Optional)
     *             classification (Optional): [
     *                 String (Optional)
     *             ]
     *             label (Optional): [
     *                 String (Optional)
     *             ]
     *             term (Optional): [
     *                  (Optional){
     *                     name: String (Optional)
     *                     glossaryName: String (Optional)
     *                     guid: String (Optional)
     *                 }
     *             ]
     *             contact (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     info: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             assetType (Optional): [
     *                 String (Optional)
     *             ]
     *             glossaryType: String (Optional)
     *             glossary: String (Optional)
     *             termStatus: String (Optional)
     *             termTemplate (Optional): [
     *                 String (Optional)
     *             ]
     *             longDescription: String (Optional)
     *         }
     *     ]
     * }
     * }
     * </pre>
     * 
     * @param body Body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return data using search along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> queryWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.queryWithResponseAsync(body, requestOptions);
    }

    /**
     * Get search suggestions by query criteria.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     keywords: String (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     value (Optional): [
     *          (Optional){
     *             &#64;search.score: Double (Optional)
     *             &#64;search.text: String (Optional)
     *             objectType: String (Optional)
     *             createTime: Long (Optional)
     *             updateTime: Long (Optional)
     *             id: String (Optional)
     *             name: String (Optional)
     *             qualifiedName: String (Optional)
     *             entityType: String (Optional)
     *             description: String (Optional)
     *             endorsement: String (Optional)
     *             owner: String (Optional)
     *             classification (Optional): [
     *                 String (Optional)
     *             ]
     *             label (Optional): [
     *                 String (Optional)
     *             ]
     *             term (Optional): [
     *                  (Optional){
     *                     name: String (Optional)
     *                     glossaryName: String (Optional)
     *                     guid: String (Optional)
     *                 }
     *             ]
     *             contact (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     info: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             assetType (Optional): [
     *                 String (Optional)
     *             ]
     *             glossaryType: String (Optional)
     *             glossary: String (Optional)
     *             termStatus: String (Optional)
     *             termTemplate (Optional): [
     *                 String (Optional)
     *             ]
     *             longDescription: String (Optional)
     *         }
     *     ]
     * }
     * }
     * </pre>
     * 
     * @param body Body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return search suggestions by query criteria along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> suggestWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.suggestWithResponseAsync(body, requestOptions);
    }

    /**
     * Get auto complete options.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     keywords: String (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     value (Optional): [
     *          (Optional){
     *             text: String (Optional)
     *             queryPlusText: String (Optional)
     *         }
     *     ]
     * }
     * }
     * </pre>
     * 
     * @param body Body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return auto complete options along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> autoCompleteWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.autoCompleteWithResponseAsync(body, requestOptions);
    }

    /**
     * Get data using search.
     * 
     * @param body Body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data using search on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<QueryResult> query(QueryOptions body) {
        // Generated convenience method for queryWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return queryWithResponse(BinaryData.fromObject(body), requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(QueryResult.class));
    }

    /**
     * Get search suggestions by query criteria.
     * 
     * @param body Body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return search suggestions by query criteria on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SuggestResult> suggest(SuggestOptions body) {
        // Generated convenience method for suggestWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return suggestWithResponse(BinaryData.fromObject(body), requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(SuggestResult.class));
    }

    /**
     * Get auto complete options.
     * 
     * @param body Body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto complete options on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AutoCompleteResult> autoComplete(AutoCompleteOptions body) {
        // Generated convenience method for autoCompleteWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return autoCompleteWithResponse(BinaryData.fromObject(body), requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(AutoCompleteResult.class));
    }
}
