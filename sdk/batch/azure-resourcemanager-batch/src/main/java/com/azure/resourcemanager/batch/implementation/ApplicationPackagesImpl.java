// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.fluent.ApplicationPackagesClient;
import com.azure.resourcemanager.batch.fluent.models.ApplicationPackageInner;
import com.azure.resourcemanager.batch.models.ActivateApplicationPackageParameters;
import com.azure.resourcemanager.batch.models.ApplicationPackage;
import com.azure.resourcemanager.batch.models.ApplicationPackages;

public final class ApplicationPackagesImpl implements ApplicationPackages {
    private static final ClientLogger LOGGER = new ClientLogger(ApplicationPackagesImpl.class);

    private final ApplicationPackagesClient innerClient;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    public ApplicationPackagesImpl(ApplicationPackagesClient innerClient,
        com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ApplicationPackage> activateWithResponse(String resourceGroupName, String accountName,
        String applicationName, String versionName, ActivateApplicationPackageParameters parameters, Context context) {
        Response<ApplicationPackageInner> inner = this.serviceClient()
            .activateWithResponse(resourceGroupName, accountName, applicationName, versionName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApplicationPackageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationPackage activate(String resourceGroupName, String accountName, String applicationName,
        String versionName, ActivateApplicationPackageParameters parameters) {
        ApplicationPackageInner inner
            = this.serviceClient().activate(resourceGroupName, accountName, applicationName, versionName, parameters);
        if (inner != null) {
            return new ApplicationPackageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String applicationName,
        String versionName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, accountName, applicationName, versionName, context);
    }

    public void delete(String resourceGroupName, String accountName, String applicationName, String versionName) {
        this.serviceClient().delete(resourceGroupName, accountName, applicationName, versionName);
    }

    public Response<ApplicationPackage> getWithResponse(String resourceGroupName, String accountName,
        String applicationName, String versionName, Context context) {
        Response<ApplicationPackageInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, accountName, applicationName, versionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApplicationPackageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationPackage get(String resourceGroupName, String accountName, String applicationName,
        String versionName) {
        ApplicationPackageInner inner
            = this.serviceClient().get(resourceGroupName, accountName, applicationName, versionName);
        if (inner != null) {
            return new ApplicationPackageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ApplicationPackage> list(String resourceGroupName, String accountName,
        String applicationName) {
        PagedIterable<ApplicationPackageInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, applicationName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationPackageImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationPackage> list(String resourceGroupName, String accountName, String applicationName,
        Integer maxresults, Context context) {
        PagedIterable<ApplicationPackageInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, applicationName, maxresults, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationPackageImpl(inner1, this.manager()));
    }

    public ApplicationPackage getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, applicationName, versionName, Context.NONE)
            .getValue();
    }

    public Response<ApplicationPackage> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, applicationName, versionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, applicationName, versionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String applicationName = ResourceManagerUtils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, applicationName, versionName, context);
    }

    private ApplicationPackagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }

    public ApplicationPackageImpl define(String name) {
        return new ApplicationPackageImpl(name, this.manager());
    }
}
