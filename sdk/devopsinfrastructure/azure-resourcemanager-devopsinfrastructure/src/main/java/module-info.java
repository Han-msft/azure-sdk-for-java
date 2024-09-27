// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.resourcemanager.devopsinfrastructure {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.devopsinfrastructure;
    exports com.azure.resourcemanager.devopsinfrastructure.fluent;
    exports com.azure.resourcemanager.devopsinfrastructure.fluent.models;
    exports com.azure.resourcemanager.devopsinfrastructure.models;

    opens com.azure.resourcemanager.devopsinfrastructure.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.devopsinfrastructure.models to com.azure.core;
    opens com.azure.resourcemanager.devopsinfrastructure.implementation.models to com.azure.core;
}
