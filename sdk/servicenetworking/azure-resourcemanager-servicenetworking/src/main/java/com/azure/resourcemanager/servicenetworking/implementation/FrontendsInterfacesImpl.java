// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicenetworking.fluent.FrontendsInterfacesClient;
import com.azure.resourcemanager.servicenetworking.fluent.models.FrontendInner;
import com.azure.resourcemanager.servicenetworking.models.Frontend;
import com.azure.resourcemanager.servicenetworking.models.FrontendsInterfaces;

public final class FrontendsInterfacesImpl implements FrontendsInterfaces {
    private static final ClientLogger LOGGER = new ClientLogger(FrontendsInterfacesImpl.class);

    private final FrontendsInterfacesClient innerClient;

    private final com.azure.resourcemanager.servicenetworking.TrafficControllerManager serviceManager;

    public FrontendsInterfacesImpl(FrontendsInterfacesClient innerClient,
        com.azure.resourcemanager.servicenetworking.TrafficControllerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Frontend> listByTrafficController(String resourceGroupName, String trafficControllerName) {
        PagedIterable<FrontendInner> inner
            = this.serviceClient().listByTrafficController(resourceGroupName, trafficControllerName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FrontendImpl(inner1, this.manager()));
    }

    public PagedIterable<Frontend> listByTrafficController(String resourceGroupName, String trafficControllerName,
        Context context) {
        PagedIterable<FrontendInner> inner
            = this.serviceClient().listByTrafficController(resourceGroupName, trafficControllerName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FrontendImpl(inner1, this.manager()));
    }

    public Response<Frontend> getWithResponse(String resourceGroupName, String trafficControllerName,
        String frontendName, Context context) {
        Response<FrontendInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, trafficControllerName, frontendName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FrontendImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Frontend get(String resourceGroupName, String trafficControllerName, String frontendName) {
        FrontendInner inner = this.serviceClient().get(resourceGroupName, trafficControllerName, frontendName);
        if (inner != null) {
            return new FrontendImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String trafficControllerName, String frontendName) {
        this.serviceClient().delete(resourceGroupName, trafficControllerName, frontendName);
    }

    public void delete(String resourceGroupName, String trafficControllerName, String frontendName, Context context) {
        this.serviceClient().delete(resourceGroupName, trafficControllerName, frontendName, context);
    }

    public Frontend getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String trafficControllerName = ResourceManagerUtils.getValueFromIdByName(id, "trafficControllers");
        if (trafficControllerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'trafficControllers'.", id)));
        }
        String frontendName = ResourceManagerUtils.getValueFromIdByName(id, "frontends");
        if (frontendName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'frontends'.", id)));
        }
        return this.getWithResponse(resourceGroupName, trafficControllerName, frontendName, Context.NONE).getValue();
    }

    public Response<Frontend> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String trafficControllerName = ResourceManagerUtils.getValueFromIdByName(id, "trafficControllers");
        if (trafficControllerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'trafficControllers'.", id)));
        }
        String frontendName = ResourceManagerUtils.getValueFromIdByName(id, "frontends");
        if (frontendName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'frontends'.", id)));
        }
        return this.getWithResponse(resourceGroupName, trafficControllerName, frontendName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String trafficControllerName = ResourceManagerUtils.getValueFromIdByName(id, "trafficControllers");
        if (trafficControllerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'trafficControllers'.", id)));
        }
        String frontendName = ResourceManagerUtils.getValueFromIdByName(id, "frontends");
        if (frontendName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'frontends'.", id)));
        }
        this.delete(resourceGroupName, trafficControllerName, frontendName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String trafficControllerName = ResourceManagerUtils.getValueFromIdByName(id, "trafficControllers");
        if (trafficControllerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'trafficControllers'.", id)));
        }
        String frontendName = ResourceManagerUtils.getValueFromIdByName(id, "frontends");
        if (frontendName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'frontends'.", id)));
        }
        this.delete(resourceGroupName, trafficControllerName, frontendName, context);
    }

    private FrontendsInterfacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicenetworking.TrafficControllerManager manager() {
        return this.serviceManager;
    }

    public FrontendImpl define(String name) {
        return new FrontendImpl(name, this.manager());
    }
}
