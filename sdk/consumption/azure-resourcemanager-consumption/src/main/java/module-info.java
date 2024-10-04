// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.consumption {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.consumption;
    exports com.azure.resourcemanager.consumption.fluent;
    exports com.azure.resourcemanager.consumption.fluent.models;
    exports com.azure.resourcemanager.consumption.models;

    opens com.azure.resourcemanager.consumption.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.consumption.models to com.azure.core;
}
