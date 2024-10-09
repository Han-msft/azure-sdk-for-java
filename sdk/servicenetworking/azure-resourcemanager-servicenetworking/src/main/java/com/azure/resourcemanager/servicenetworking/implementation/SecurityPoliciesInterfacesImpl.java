// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicenetworking.fluent.SecurityPoliciesInterfacesClient;
import com.azure.resourcemanager.servicenetworking.fluent.models.SecurityPolicyInner;
import com.azure.resourcemanager.servicenetworking.models.SecurityPoliciesInterfaces;
import com.azure.resourcemanager.servicenetworking.models.SecurityPolicy;

public final class SecurityPoliciesInterfacesImpl implements SecurityPoliciesInterfaces {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityPoliciesInterfacesImpl.class);

    private final SecurityPoliciesInterfacesClient innerClient;

    private final com.azure.resourcemanager.servicenetworking.TrafficControllerManager serviceManager;

    public SecurityPoliciesInterfacesImpl(SecurityPoliciesInterfacesClient innerClient,
        com.azure.resourcemanager.servicenetworking.TrafficControllerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityPolicy> listByTrafficController(String resourceGroupName,
        String trafficControllerName) {
        PagedIterable<SecurityPolicyInner> inner
            = this.serviceClient().listByTrafficController(resourceGroupName, trafficControllerName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityPolicy> listByTrafficController(String resourceGroupName, String trafficControllerName,
        Context context) {
        PagedIterable<SecurityPolicyInner> inner
            = this.serviceClient().listByTrafficController(resourceGroupName, trafficControllerName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SecurityPolicyImpl(inner1, this.manager()));
    }

    public Response<SecurityPolicy> getWithResponse(String resourceGroupName, String trafficControllerName,
        String securityPolicyName, Context context) {
        Response<SecurityPolicyInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, trafficControllerName, securityPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecurityPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityPolicy get(String resourceGroupName, String trafficControllerName, String securityPolicyName) {
        SecurityPolicyInner inner
            = this.serviceClient().get(resourceGroupName, trafficControllerName, securityPolicyName);
        if (inner != null) {
            return new SecurityPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String trafficControllerName, String securityPolicyName) {
        this.serviceClient().delete(resourceGroupName, trafficControllerName, securityPolicyName);
    }

    public void delete(String resourceGroupName, String trafficControllerName, String securityPolicyName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, trafficControllerName, securityPolicyName, context);
    }

    public SecurityPolicy getById(String id) {
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
        String securityPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, trafficControllerName, securityPolicyName, Context.NONE)
            .getValue();
    }

    public Response<SecurityPolicy> getByIdWithResponse(String id, Context context) {
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
        String securityPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, trafficControllerName, securityPolicyName, context);
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
        String securityPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        this.delete(resourceGroupName, trafficControllerName, securityPolicyName, Context.NONE);
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
        String securityPolicyName = ResourceManagerUtils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        this.delete(resourceGroupName, trafficControllerName, securityPolicyName, context);
    }

    private SecurityPoliciesInterfacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicenetworking.TrafficControllerManager manager() {
        return this.serviceManager;
    }

    public SecurityPolicyImpl define(String name) {
        return new SecurityPolicyImpl(name, this.manager());
    }
}
