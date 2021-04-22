// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.CustomizationPolicyInner;

/** An immutable client-side representation of CustomizationPolicy. */
public interface CustomizationPolicy {
    /**
     * Gets the id property: Customization policy azure id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the location property: Azure region.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the name property: Customization policy name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type property.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the description property: Policy description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the privateCloudId property: The Private cloud id.
     *
     * @return the privateCloudId value.
     */
    String privateCloudId();

    /**
     * Gets the specification property: Detailed customization policy specification.
     *
     * @return the specification value.
     */
    CustomizationSpecification specification();

    /**
     * Gets the typePropertiesType property: The type of customization (Linux or Windows).
     *
     * @return the typePropertiesType value.
     */
    CustomizationPolicyPropertiesType typePropertiesType();

    /**
     * Gets the version property: Policy version.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the inner com.azure.resourcemanager.vmwarecloudsimple.fluent.models.CustomizationPolicyInner object.
     *
     * @return the inner object.
     */
    CustomizationPolicyInner innerModel();
}