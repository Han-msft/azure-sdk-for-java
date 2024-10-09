// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.UserSessionInner;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationType;
import com.azure.resourcemanager.desktopvirtualization.models.SessionState;
import com.azure.resourcemanager.desktopvirtualization.models.UserSession;
import java.time.OffsetDateTime;

public final class UserSessionImpl implements UserSession {
    private UserSessionInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    UserSessionImpl(UserSessionInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String objectId() {
        return this.innerModel().objectId();
    }

    public String userPrincipalName() {
        return this.innerModel().userPrincipalName();
    }

    public ApplicationType applicationType() {
        return this.innerModel().applicationType();
    }

    public SessionState sessionState() {
        return this.innerModel().sessionState();
    }

    public String activeDirectoryUsername() {
        return this.innerModel().activeDirectoryUsername();
    }

    public OffsetDateTime createTime() {
        return this.innerModel().createTime();
    }

    public UserSessionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
