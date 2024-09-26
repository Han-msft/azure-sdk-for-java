// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.batch.fluent.LocationsClient;
import com.azure.resourcemanager.batch.fluent.models.BatchLocationQuotaInner;
import com.azure.resourcemanager.batch.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.batch.fluent.models.SupportedSkuInner;
import com.azure.resourcemanager.batch.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.batch.models.SupportedSkusResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in LocationsClient.
 */
public final class LocationsClientImpl implements LocationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LocationsService service;

    /**
     * The service client containing this operation class.
     */
    private final BatchManagementClientImpl client;

    /**
     * Initializes an instance of LocationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    LocationsClientImpl(BatchManagementClientImpl client) {
        this.service
            = RestProxy.create(LocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BatchManagementClientLocations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BatchManagementClien")
    public interface LocationsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Batch/locations/{locationName}/quotas")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BatchLocationQuotaInner>> getQuotas(@HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Batch/locations/{locationName}/virtualMachineSkus")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SupportedSkusResult>> listSupportedVirtualMachineSkus(@HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName, @QueryParam("maxresults") Integer maxresults,
            @QueryParam("$filter") String filter, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Batch/locations/{locationName}/checkNameAvailability")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailability(@HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") CheckNameAvailabilityParameters parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SupportedSkusResult>> listSupportedVirtualMachineSkusNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service quotas.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BatchLocationQuotaInner>> getQuotasWithResponseAsync(String locationName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getQuotas(this.client.getEndpoint(), locationName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service quotas.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location along with {@link Response}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BatchLocationQuotaInner>> getQuotasWithResponseAsync(String locationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getQuotas(this.client.getEndpoint(), locationName, this.client.getApiVersion(),
            this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service quotas.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BatchLocationQuotaInner> getQuotasAsync(String locationName) {
        return getQuotasWithResponseAsync(locationName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service quotas.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BatchLocationQuotaInner> getQuotasWithResponse(String locationName, Context context) {
        return getQuotasWithResponseAsync(locationName, context).block();
    }

    /**
     * Gets the Batch service quotas for the specified subscription at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service quotas.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch service quotas for the specified subscription at the given location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BatchLocationQuotaInner getQuotas(String locationName) {
        return getQuotasWithResponse(locationName, Context.NONE).getValue();
    }

    /**
     * Gets the list of Batch supported Virtual Machine VM sizes available at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service supported SKUs.
     * @param maxresults The maximum number of items to return in the response.
     * @param filter OData filter expression. Valid properties for filtering are "familyName".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Batch supported Virtual Machine VM sizes available at the given location along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SupportedSkuInner>> listSupportedVirtualMachineSkusSinglePageAsync(String locationName,
        Integer maxresults, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listSupportedVirtualMachineSkus(this.client.getEndpoint(), locationName,
                maxresults, filter, this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .<PagedResponse<SupportedSkuInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of Batch supported Virtual Machine VM sizes available at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service supported SKUs.
     * @param maxresults The maximum number of items to return in the response.
     * @param filter OData filter expression. Valid properties for filtering are "familyName".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Batch supported Virtual Machine VM sizes available at the given location along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SupportedSkuInner>> listSupportedVirtualMachineSkusSinglePageAsync(String locationName,
        Integer maxresults, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listSupportedVirtualMachineSkus(this.client.getEndpoint(), locationName, maxresults, filter,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets the list of Batch supported Virtual Machine VM sizes available at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service supported SKUs.
     * @param maxresults The maximum number of items to return in the response.
     * @param filter OData filter expression. Valid properties for filtering are "familyName".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Batch supported Virtual Machine VM sizes available at the given location as paginated
     * response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SupportedSkuInner> listSupportedVirtualMachineSkusAsync(String locationName, Integer maxresults,
        String filter) {
        return new PagedFlux<>(() -> listSupportedVirtualMachineSkusSinglePageAsync(locationName, maxresults, filter),
            nextLink -> listSupportedVirtualMachineSkusNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of Batch supported Virtual Machine VM sizes available at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service supported SKUs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Batch supported Virtual Machine VM sizes available at the given location as paginated
     * response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SupportedSkuInner> listSupportedVirtualMachineSkusAsync(String locationName) {
        final Integer maxresults = null;
        final String filter = null;
        return new PagedFlux<>(() -> listSupportedVirtualMachineSkusSinglePageAsync(locationName, maxresults, filter),
            nextLink -> listSupportedVirtualMachineSkusNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of Batch supported Virtual Machine VM sizes available at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service supported SKUs.
     * @param maxresults The maximum number of items to return in the response.
     * @param filter OData filter expression. Valid properties for filtering are "familyName".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Batch supported Virtual Machine VM sizes available at the given location as paginated
     * response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SupportedSkuInner> listSupportedVirtualMachineSkusAsync(String locationName, Integer maxresults,
        String filter, Context context) {
        return new PagedFlux<>(
            () -> listSupportedVirtualMachineSkusSinglePageAsync(locationName, maxresults, filter, context),
            nextLink -> listSupportedVirtualMachineSkusNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of Batch supported Virtual Machine VM sizes available at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service supported SKUs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Batch supported Virtual Machine VM sizes available at the given location as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SupportedSkuInner> listSupportedVirtualMachineSkus(String locationName) {
        final Integer maxresults = null;
        final String filter = null;
        return new PagedIterable<>(listSupportedVirtualMachineSkusAsync(locationName, maxresults, filter));
    }

    /**
     * Gets the list of Batch supported Virtual Machine VM sizes available at the given location.
     * 
     * @param locationName The region for which to retrieve Batch service supported SKUs.
     * @param maxresults The maximum number of items to return in the response.
     * @param filter OData filter expression. Valid properties for filtering are "familyName".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Batch supported Virtual Machine VM sizes available at the given location as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SupportedSkuInner> listSupportedVirtualMachineSkus(String locationName, Integer maxresults,
        String filter, Context context) {
        return new PagedIterable<>(listSupportedVirtualMachineSkusAsync(locationName, maxresults, filter, context));
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     * 
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(String locationName,
        CheckNameAvailabilityParameters parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.checkNameAvailability(this.client.getEndpoint(), locationName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     * 
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(String locationName,
        CheckNameAvailabilityParameters parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.checkNameAvailability(this.client.getEndpoint(), locationName, this.client.getApiVersion(),
            this.client.getSubscriptionId(), parameters, accept, context);
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     * 
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(String locationName,
        CheckNameAvailabilityParameters parameters) {
        return checkNameAvailabilityWithResponseAsync(locationName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     * 
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResultInner> checkNameAvailabilityWithResponse(String locationName,
        CheckNameAvailabilityParameters parameters, Context context) {
        return checkNameAvailabilityWithResponseAsync(locationName, parameters, context).block();
    }

    /**
     * Checks whether the Batch account name is available in the specified region.
     * 
     * @param locationName The desired region for the name check.
     * @param parameters Properties needed to check the availability of a name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResultInner checkNameAvailability(String locationName,
        CheckNameAvailabilityParameters parameters) {
        return checkNameAvailabilityWithResponse(locationName, parameters, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch List supported SKUs operation response along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SupportedSkuInner>> listSupportedVirtualMachineSkusNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listSupportedVirtualMachineSkusNext(nextLink, this.client.getEndpoint(),
                accept, context))
            .<PagedResponse<SupportedSkuInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Batch List supported SKUs operation response along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SupportedSkuInner>> listSupportedVirtualMachineSkusNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listSupportedVirtualMachineSkusNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
