// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.AppAttachPackageInner;
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackage;
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackagePatch;
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackagePatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackageProperties;
import java.util.Collections;
import java.util.Map;

public final class AppAttachPackageImpl
    implements AppAttachPackage, AppAttachPackage.Definition, AppAttachPackage.Update {
    private AppAttachPackageInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public AppAttachPackageProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AppAttachPackageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String appAttachPackageName;

    private AppAttachPackagePatch updateAppAttachPackagePatch;

    public AppAttachPackageImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AppAttachPackage create() {
        this.innerObject = serviceManager.serviceClient()
            .getAppAttachPackages()
            .createOrUpdateWithResponse(resourceGroupName, appAttachPackageName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public AppAttachPackage create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppAttachPackages()
            .createOrUpdateWithResponse(resourceGroupName, appAttachPackageName, this.innerModel(), context)
            .getValue();
        return this;
    }

    AppAttachPackageImpl(String name,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = new AppAttachPackageInner();
        this.serviceManager = serviceManager;
        this.appAttachPackageName = name;
    }

    public AppAttachPackageImpl update() {
        this.updateAppAttachPackagePatch = new AppAttachPackagePatch();
        return this;
    }

    public AppAttachPackage apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAppAttachPackages()
            .updateWithResponse(resourceGroupName, appAttachPackageName, updateAppAttachPackagePatch, Context.NONE)
            .getValue();
        return this;
    }

    public AppAttachPackage apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppAttachPackages()
            .updateWithResponse(resourceGroupName, appAttachPackageName, updateAppAttachPackagePatch, context)
            .getValue();
        return this;
    }

    AppAttachPackageImpl(AppAttachPackageInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.appAttachPackageName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "appAttachPackages");
    }

    public AppAttachPackage refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAppAttachPackages()
            .getByResourceGroupWithResponse(resourceGroupName, appAttachPackageName, Context.NONE)
            .getValue();
        return this;
    }

    public AppAttachPackage refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAppAttachPackages()
            .getByResourceGroupWithResponse(resourceGroupName, appAttachPackageName, context)
            .getValue();
        return this;
    }

    public AppAttachPackageImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AppAttachPackageImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AppAttachPackageImpl withProperties(AppAttachPackageProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public AppAttachPackageImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AppAttachPackageImpl withProperties(AppAttachPackagePatchProperties properties) {
        this.updateAppAttachPackagePatch.withProperties(properties);
        return this;
    }
}
