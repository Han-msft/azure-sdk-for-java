// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicenetworking.fluent.models.AssociationInner;
import com.azure.resourcemanager.servicenetworking.models.Association;
import com.azure.resourcemanager.servicenetworking.models.AssociationProperties;
import com.azure.resourcemanager.servicenetworking.models.AssociationUpdate;
import com.azure.resourcemanager.servicenetworking.models.AssociationUpdateProperties;
import java.util.Collections;
import java.util.Map;

public final class AssociationImpl implements Association, Association.Definition, Association.Update {
    private AssociationInner innerObject;

    private final com.azure.resourcemanager.servicenetworking.TrafficControllerManager serviceManager;

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

    public AssociationProperties properties() {
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

    public AssociationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicenetworking.TrafficControllerManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String trafficControllerName;

    private String associationName;

    private AssociationUpdate updateProperties;

    public AssociationImpl withExistingTrafficController(String resourceGroupName, String trafficControllerName) {
        this.resourceGroupName = resourceGroupName;
        this.trafficControllerName = trafficControllerName;
        return this;
    }

    public Association create() {
        this.innerObject = serviceManager.serviceClient()
            .getAssociationsInterfaces()
            .createOrUpdate(resourceGroupName, trafficControllerName, associationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Association create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssociationsInterfaces()
            .createOrUpdate(resourceGroupName, trafficControllerName, associationName, this.innerModel(), context);
        return this;
    }

    AssociationImpl(String name, com.azure.resourcemanager.servicenetworking.TrafficControllerManager serviceManager) {
        this.innerObject = new AssociationInner();
        this.serviceManager = serviceManager;
        this.associationName = name;
    }

    public AssociationImpl update() {
        this.updateProperties = new AssociationUpdate();
        return this;
    }

    public Association apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAssociationsInterfaces()
            .updateWithResponse(resourceGroupName, trafficControllerName, associationName, updateProperties,
                Context.NONE)
            .getValue();
        return this;
    }

    public Association apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssociationsInterfaces()
            .updateWithResponse(resourceGroupName, trafficControllerName, associationName, updateProperties, context)
            .getValue();
        return this;
    }

    AssociationImpl(AssociationInner innerObject,
        com.azure.resourcemanager.servicenetworking.TrafficControllerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.trafficControllerName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "trafficControllers");
        this.associationName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "associations");
    }

    public Association refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAssociationsInterfaces()
            .getWithResponse(resourceGroupName, trafficControllerName, associationName, Context.NONE)
            .getValue();
        return this;
    }

    public Association refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssociationsInterfaces()
            .getWithResponse(resourceGroupName, trafficControllerName, associationName, context)
            .getValue();
        return this;
    }

    public AssociationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AssociationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AssociationImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public AssociationImpl withProperties(AssociationProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public AssociationImpl withProperties(AssociationUpdateProperties properties) {
        this.updateProperties.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
