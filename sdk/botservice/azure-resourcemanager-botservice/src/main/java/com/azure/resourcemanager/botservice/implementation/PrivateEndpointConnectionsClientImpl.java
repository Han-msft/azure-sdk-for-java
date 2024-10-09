// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.botservice.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.botservice.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.botservice.models.PrivateEndpointConnectionListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient.
 */
public final class PrivateEndpointConnectionsClientImpl implements PrivateEndpointConnectionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PrivateEndpointConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private final AzureBotServiceImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnectionsClientImpl(AzureBotServiceImpl client) {
        this.service = RestProxy.create(PrivateEndpointConnectionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBotServicePrivateEndpointConnections to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureBotServicePriva")
    public interface PrivateEndpointConnectionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.BotService/botServices/{resourceName}/privateEndpointConnections")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.BotService/botServices/{resourceName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionInner>> get(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.BotService/botServices/{resourceName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionInner>> create(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @BodyParam("application/json") PrivateEndpointConnectionInner properties,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.BotService/botServices/{resourceName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List all the private endpoint connections associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateEndpointConnectionInner>> listSinglePageAsync(String resourceGroupName,
        String resourceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceGroupName, resourceName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .<PagedResponse<PrivateEndpointConnectionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List all the private endpoint connections associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateEndpointConnectionInner>> listSinglePageAsync(String resourceGroupName,
        String resourceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), resourceGroupName, resourceName, this.client.getApiVersion(),
                this.client.getSubscriptionId(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), null, null));
    }

    /**
     * List all the private endpoint connections associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     * with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateEndpointConnectionInner> listAsync(String resourceGroupName, String resourceName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, resourceName));
    }

    /**
     * List all the private endpoint connections associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     * with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateEndpointConnectionInner> listAsync(String resourceGroupName, String resourceName,
        Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, resourceName, context));
    }

    /**
     * List all the private endpoint connections associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     * with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String resourceName) {
        return new PagedIterable<>(listAsync(resourceGroupName, resourceName));
    }

    /**
     * List all the private endpoint connections associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     * with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String resourceName,
        Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, resourceName, context));
    }

    /**
     * Gets the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the Bot along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> getWithResponseAsync(String resourceGroupName,
        String resourceName, String privateEndpointConnectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), resourceGroupName, resourceName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), privateEndpointConnectionName, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the Bot along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> getWithResponseAsync(String resourceGroupName,
        String resourceName, String privateEndpointConnectionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceGroupName, resourceName, this.client.getApiVersion(),
            this.client.getSubscriptionId(), privateEndpointConnectionName, accept, context);
    }

    /**
     * Gets the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the Bot on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, resourceName, privateEndpointConnectionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the Bot along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateEndpointConnectionInner> getWithResponse(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, resourceName, privateEndpointConnectionName, context).block();
    }

    /**
     * Gets the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the Bot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner get(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName) {
        return getWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName, Context.NONE).getValue();
    }

    /**
     * Update the state of specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> createWithResponseAsync(String resourceGroupName,
        String resourceName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.create(this.client.getEndpoint(), resourceGroupName, resourceName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), privateEndpointConnectionName, properties,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update the state of specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> createWithResponseAsync(String resourceGroupName,
        String resourceName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.create(this.client.getEndpoint(), resourceGroupName, resourceName, this.client.getApiVersion(),
            this.client.getSubscriptionId(), privateEndpointConnectionName, properties, accept, context);
    }

    /**
     * Update the state of specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionInner> createAsync(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return createWithResponseAsync(resourceGroupName, resourceName, privateEndpointConnectionName, properties)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update the state of specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateEndpointConnectionInner> createWithResponse(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner properties, Context context) {
        return createWithResponseAsync(resourceGroupName, resourceName, privateEndpointConnectionName, properties,
            context).block();
    }

    /**
     * Update the state of specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner create(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return createWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName, properties,
            Context.NONE).getValue();
    }

    /**
     * Deletes the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), resourceGroupName, resourceName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), privateEndpointConnectionName, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), resourceGroupName, resourceName, this.client.getApiVersion(),
            this.client.getSubscriptionId(), privateEndpointConnectionName, accept, context);
    }

    /**
     * Deletes the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName) {
        return deleteWithResponseAsync(resourceGroupName, resourceName, privateEndpointConnectionName)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceGroupName, String resourceName,
        String privateEndpointConnectionName, Context context) {
        return deleteWithResponseAsync(resourceGroupName, resourceName, privateEndpointConnectionName, context).block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the Bot.
     * 
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String resourceName, String privateEndpointConnectionName) {
        deleteWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName, Context.NONE);
    }
}
