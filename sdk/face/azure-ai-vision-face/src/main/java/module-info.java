// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.ai.vision.face {
    requires transitive com.azure.core;

    exports com.azure.ai.vision.face;
    exports com.azure.ai.vision.face.administration;
    exports com.azure.ai.vision.face.models;

    opens com.azure.ai.vision.face.implementation.models to com.azure.core;
    opens com.azure.ai.vision.face.models to com.azure.core;
}
