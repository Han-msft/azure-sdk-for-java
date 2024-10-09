// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.implementation;

import com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubKeysInner;
import com.azure.resourcemanager.webpubsub.models.WebPubSubKeys;

public final class WebPubSubKeysImpl implements WebPubSubKeys {
    private WebPubSubKeysInner innerObject;

    private final com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager;

    WebPubSubKeysImpl(WebPubSubKeysInner innerObject,
        com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public String primaryConnectionString() {
        return this.innerModel().primaryConnectionString();
    }

    public String secondaryConnectionString() {
        return this.innerModel().secondaryConnectionString();
    }

    public WebPubSubKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.webpubsub.WebPubSubManager manager() {
        return this.serviceManager;
    }
}
