// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.springappdiscovery.fluent.SpringbootsitesClient;
import com.azure.resourcemanager.springappdiscovery.fluent.models.SpringbootsitesModelInner;
import com.azure.resourcemanager.springappdiscovery.models.Springbootsites;
import com.azure.resourcemanager.springappdiscovery.models.SpringbootsitesModel;

public final class SpringbootsitesImpl implements Springbootsites {
    private static final ClientLogger LOGGER = new ClientLogger(SpringbootsitesImpl.class);

    private final SpringbootsitesClient innerClient;

    private final com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager serviceManager;

    public SpringbootsitesImpl(SpringbootsitesClient innerClient,
        com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SpringbootsitesModel> getByResourceGroupWithResponse(String resourceGroupName,
        String springbootsitesName, Context context) {
        Response<SpringbootsitesModelInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, springbootsitesName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SpringbootsitesModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SpringbootsitesModel getByResourceGroup(String resourceGroupName, String springbootsitesName) {
        SpringbootsitesModelInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, springbootsitesName);
        if (inner != null) {
            return new SpringbootsitesModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String springbootsitesName) {
        this.serviceClient().delete(resourceGroupName, springbootsitesName);
    }

    public void delete(String resourceGroupName, String springbootsitesName, Context context) {
        this.serviceClient().delete(resourceGroupName, springbootsitesName, context);
    }

    public void triggerRefreshSite(String resourceGroupName, String springbootsitesName) {
        this.serviceClient().triggerRefreshSite(resourceGroupName, springbootsitesName);
    }

    public void triggerRefreshSite(String resourceGroupName, String springbootsitesName, Context context) {
        this.serviceClient().triggerRefreshSite(resourceGroupName, springbootsitesName, context);
    }

    public PagedIterable<SpringbootsitesModel> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SpringbootsitesModelInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootsitesModelImpl(inner1, this.manager()));
    }

    public PagedIterable<SpringbootsitesModel> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SpringbootsitesModelInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootsitesModelImpl(inner1, this.manager()));
    }

    public PagedIterable<SpringbootsitesModel> list() {
        PagedIterable<SpringbootsitesModelInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootsitesModelImpl(inner1, this.manager()));
    }

    public PagedIterable<SpringbootsitesModel> list(Context context) {
        PagedIterable<SpringbootsitesModelInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootsitesModelImpl(inner1, this.manager()));
    }

    public SpringbootsitesModel getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String springbootsitesName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (springbootsitesName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, springbootsitesName, Context.NONE).getValue();
    }

    public Response<SpringbootsitesModel> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String springbootsitesName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (springbootsitesName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, springbootsitesName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String springbootsitesName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (springbootsitesName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        this.delete(resourceGroupName, springbootsitesName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String springbootsitesName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (springbootsitesName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        this.delete(resourceGroupName, springbootsitesName, context);
    }

    private SpringbootsitesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager manager() {
        return this.serviceManager;
    }

    public SpringbootsitesModelImpl define(String name) {
        return new SpringbootsitesModelImpl(name, this.manager());
    }
}
