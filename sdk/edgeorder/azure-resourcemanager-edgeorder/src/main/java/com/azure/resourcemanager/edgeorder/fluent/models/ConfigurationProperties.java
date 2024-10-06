// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.edgeorder.models.AvailabilityInformation;
import com.azure.resourcemanager.edgeorder.models.CommonProperties;
import com.azure.resourcemanager.edgeorder.models.CostInformation;
import com.azure.resourcemanager.edgeorder.models.Description;
import com.azure.resourcemanager.edgeorder.models.Dimensions;
import com.azure.resourcemanager.edgeorder.models.FilterableProperty;
import com.azure.resourcemanager.edgeorder.models.HierarchyInformation;
import com.azure.resourcemanager.edgeorder.models.ImageInformation;
import com.azure.resourcemanager.edgeorder.models.Specification;
import java.io.IOException;
import java.util.List;

/**
 * Properties of configuration.
 */
@Immutable
public final class ConfigurationProperties extends CommonProperties {
    /*
     * Specifications of the configuration
     */
    private List<Specification> specifications;

    /*
     * Dimensions of the configuration
     */
    private Dimensions dimensions;

    /*
     * list of filters supported for a product
     */
    private List<FilterableProperty> filterableProperties;

    /*
     * Hierarchy information of a product.
     */
    private HierarchyInformation hierarchyInformation;

    /*
     * Availability information of the product system.
     */
    private AvailabilityInformation availabilityInformation;

    /*
     * Cost information for the product system.
     */
    private CostInformation costInformation;

    /*
     * Image information for the product system.
     */
    private List<ImageInformation> imageInformation;

    /*
     * Description related to the product system.
     */
    private Description description;

    /*
     * Display Name for the product system.
     */
    private String displayName;

    /**
     * Creates an instance of ConfigurationProperties class.
     */
    public ConfigurationProperties() {
    }

    /**
     * Get the specifications property: Specifications of the configuration.
     * 
     * @return the specifications value.
     */
    public List<Specification> specifications() {
        return this.specifications;
    }

    /**
     * Get the dimensions property: Dimensions of the configuration.
     * 
     * @return the dimensions value.
     */
    public Dimensions dimensions() {
        return this.dimensions;
    }

    /**
     * Get the filterableProperties property: list of filters supported for a product.
     * 
     * @return the filterableProperties value.
     */
    @Override
    public List<FilterableProperty> filterableProperties() {
        return this.filterableProperties;
    }

    /**
     * Get the hierarchyInformation property: Hierarchy information of a product.
     * 
     * @return the hierarchyInformation value.
     */
    @Override
    public HierarchyInformation hierarchyInformation() {
        return this.hierarchyInformation;
    }

    /**
     * Get the availabilityInformation property: Availability information of the product system.
     * 
     * @return the availabilityInformation value.
     */
    @Override
    public AvailabilityInformation availabilityInformation() {
        return this.availabilityInformation;
    }

    /**
     * Get the costInformation property: Cost information for the product system.
     * 
     * @return the costInformation value.
     */
    @Override
    public CostInformation costInformation() {
        return this.costInformation;
    }

    /**
     * Get the imageInformation property: Image information for the product system.
     * 
     * @return the imageInformation value.
     */
    @Override
    public List<ImageInformation> imageInformation() {
        return this.imageInformation;
    }

    /**
     * Get the description property: Description related to the product system.
     * 
     * @return the description value.
     */
    @Override
    public Description description() {
        return this.description;
    }

    /**
     * Get the displayName property: Display Name for the product system.
     * 
     * @return the displayName value.
     */
    @Override
    public String displayName() {
        return this.displayName;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (specifications() != null) {
            specifications().forEach(e -> e.validate());
        }
        if (dimensions() != null) {
            dimensions().validate();
        }
        if (description() != null) {
            description().validate();
        }
        if (imageInformation() != null) {
            imageInformation().forEach(e -> e.validate());
        }
        if (costInformation() != null) {
            costInformation().validate();
        }
        if (availabilityInformation() != null) {
            availabilityInformation().validate();
        }
        if (hierarchyInformation() != null) {
            hierarchyInformation().validate();
        }
        if (filterableProperties() != null) {
            filterableProperties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationProperties.
     */
    public static ConfigurationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationProperties deserializedConfigurationProperties = new ConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedConfigurationProperties.displayName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedConfigurationProperties.description = Description.fromJson(reader);
                } else if ("imageInformation".equals(fieldName)) {
                    List<ImageInformation> imageInformation
                        = reader.readArray(reader1 -> ImageInformation.fromJson(reader1));
                    deserializedConfigurationProperties.imageInformation = imageInformation;
                } else if ("costInformation".equals(fieldName)) {
                    deserializedConfigurationProperties.costInformation = CostInformation.fromJson(reader);
                } else if ("availabilityInformation".equals(fieldName)) {
                    deserializedConfigurationProperties.availabilityInformation
                        = AvailabilityInformation.fromJson(reader);
                } else if ("hierarchyInformation".equals(fieldName)) {
                    deserializedConfigurationProperties.hierarchyInformation = HierarchyInformation.fromJson(reader);
                } else if ("filterableProperties".equals(fieldName)) {
                    List<FilterableProperty> filterableProperties
                        = reader.readArray(reader1 -> FilterableProperty.fromJson(reader1));
                    deserializedConfigurationProperties.filterableProperties = filterableProperties;
                } else if ("specifications".equals(fieldName)) {
                    List<Specification> specifications = reader.readArray(reader1 -> Specification.fromJson(reader1));
                    deserializedConfigurationProperties.specifications = specifications;
                } else if ("dimensions".equals(fieldName)) {
                    deserializedConfigurationProperties.dimensions = Dimensions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationProperties;
        });
    }
}
