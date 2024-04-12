// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
import com.azure.resourcemanager.standbypool.fluent.StandbyVirtualMachinesClient;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyVirtualMachineResourceInner;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachineResourceListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in StandbyVirtualMachinesClient.
 */
public final class StandbyVirtualMachinesClientImpl implements StandbyVirtualMachinesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final StandbyVirtualMachinesService service;

    /**
     * The service client containing this operation class.
     */
    private final StandbyPoolMgmtClientImpl client;

    /**
     * Initializes an instance of StandbyVirtualMachinesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    StandbyVirtualMachinesClientImpl(StandbyPoolMgmtClientImpl client) {
        this.service = RestProxy.create(StandbyVirtualMachinesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StandbyPoolMgmtClientStandbyVirtualMachines to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StandbyPoolMgmtClien")
    public interface StandbyVirtualMachinesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StandbyPool/standbyVirtualMachinePools/{standbyVirtualMachinePoolName}/standbyVirtualMachines")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StandbyVirtualMachineResourceListResult>> listByStandbyVirtualMachinePoolResource(
            @HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("standbyVirtualMachinePoolName") String standbyVirtualMachinePoolName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StandbyPool/standbyVirtualMachinePools/{standbyVirtualMachinePoolName}/standbyVirtualMachines/{standbyVirtualMachineName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StandbyVirtualMachineResourceInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("standbyVirtualMachinePoolName") String standbyVirtualMachinePoolName,
            @PathParam("standbyVirtualMachineName") String standbyVirtualMachineName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StandbyVirtualMachineResourceListResult>> listByStandbyVirtualMachinePoolResourceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyVirtualMachineResourceInner>>
        listByStandbyVirtualMachinePoolResourceSinglePageAsync(String resourceGroupName,
            String standbyVirtualMachinePoolName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyVirtualMachinePoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyVirtualMachinePoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByStandbyVirtualMachinePoolResource(this.client.getEndpoint(),
                this.client.getApiVersion(), this.client.getSubscriptionId(), resourceGroupName,
                standbyVirtualMachinePoolName, accept, context))
            .<PagedResponse<StandbyVirtualMachineResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyVirtualMachineResourceInner>>
        listByStandbyVirtualMachinePoolResourceSinglePageAsync(String resourceGroupName,
            String standbyVirtualMachinePoolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyVirtualMachinePoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyVirtualMachinePoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByStandbyVirtualMachinePoolResource(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, standbyVirtualMachinePoolName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StandbyVirtualMachineResourceInner>
        listByStandbyVirtualMachinePoolResourceAsync(String resourceGroupName, String standbyVirtualMachinePoolName) {
        return new PagedFlux<>(
            () -> listByStandbyVirtualMachinePoolResourceSinglePageAsync(resourceGroupName,
                standbyVirtualMachinePoolName),
            nextLink -> listByStandbyVirtualMachinePoolResourceNextSinglePageAsync(nextLink));
    }

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StandbyVirtualMachineResourceInner> listByStandbyVirtualMachinePoolResourceAsync(
        String resourceGroupName, String standbyVirtualMachinePoolName, Context context) {
        return new PagedFlux<>(
            () -> listByStandbyVirtualMachinePoolResourceSinglePageAsync(resourceGroupName,
                standbyVirtualMachinePoolName, context),
            nextLink -> listByStandbyVirtualMachinePoolResourceNextSinglePageAsync(nextLink, context));
    }

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StandbyVirtualMachineResourceInner>
        listByStandbyVirtualMachinePoolResource(String resourceGroupName, String standbyVirtualMachinePoolName) {
        return new PagedIterable<>(
            listByStandbyVirtualMachinePoolResourceAsync(resourceGroupName, standbyVirtualMachinePoolName));
    }

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StandbyVirtualMachineResourceInner> listByStandbyVirtualMachinePoolResource(
        String resourceGroupName, String standbyVirtualMachinePoolName, Context context) {
        return new PagedIterable<>(
            listByStandbyVirtualMachinePoolResourceAsync(resourceGroupName, standbyVirtualMachinePoolName, context));
    }

    /**
     * Get a StandbyVirtualMachineResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param standbyVirtualMachineName Name of the standby virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachineResource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<StandbyVirtualMachineResourceInner>> getWithResponseAsync(String resourceGroupName,
        String standbyVirtualMachinePoolName, String standbyVirtualMachineName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyVirtualMachinePoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyVirtualMachinePoolName is required and cannot be null."));
        }
        if (standbyVirtualMachineName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter standbyVirtualMachineName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, standbyVirtualMachinePoolName,
                standbyVirtualMachineName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a StandbyVirtualMachineResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param standbyVirtualMachineName Name of the standby virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachineResource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<StandbyVirtualMachineResourceInner>> getWithResponseAsync(String resourceGroupName,
        String standbyVirtualMachinePoolName, String standbyVirtualMachineName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyVirtualMachinePoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyVirtualMachinePoolName is required and cannot be null."));
        }
        if (standbyVirtualMachineName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter standbyVirtualMachineName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, standbyVirtualMachinePoolName, standbyVirtualMachineName, accept, context);
    }

    /**
     * Get a StandbyVirtualMachineResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param standbyVirtualMachineName Name of the standby virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachineResource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<StandbyVirtualMachineResourceInner> getAsync(String resourceGroupName,
        String standbyVirtualMachinePoolName, String standbyVirtualMachineName) {
        return getWithResponseAsync(resourceGroupName, standbyVirtualMachinePoolName, standbyVirtualMachineName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a StandbyVirtualMachineResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param standbyVirtualMachineName Name of the standby virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachineResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<StandbyVirtualMachineResourceInner> getWithResponse(String resourceGroupName,
        String standbyVirtualMachinePoolName, String standbyVirtualMachineName, Context context) {
        return getWithResponseAsync(resourceGroupName, standbyVirtualMachinePoolName, standbyVirtualMachineName,
            context).block();
    }

    /**
     * Get a StandbyVirtualMachineResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param standbyVirtualMachineName Name of the standby virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachineResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StandbyVirtualMachineResourceInner get(String resourceGroupName, String standbyVirtualMachinePoolName,
        String standbyVirtualMachineName) {
        return getWithResponse(resourceGroupName, standbyVirtualMachinePoolName, standbyVirtualMachineName,
            Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyVirtualMachineResourceInner>>
        listByStandbyVirtualMachinePoolResourceNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByStandbyVirtualMachinePoolResourceNext(nextLink,
                this.client.getEndpoint(), accept, context))
            .<PagedResponse<StandbyVirtualMachineResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyVirtualMachineResourceInner>>
        listByStandbyVirtualMachinePoolResourceNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByStandbyVirtualMachinePoolResourceNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
