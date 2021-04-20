// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.resourcemanager.deploymentmanager.fluent.models.OperationsListInner;

/** An immutable client-side representation of OperationsList. */
public interface OperationsList {
    /**
     * Gets the value property: The list of supported operations.
     *
     * @return the value value.
     */
    Operation value();

    /**
     * Gets the inner com.azure.resourcemanager.deploymentmanager.fluent.models.OperationsListInner object.
     *
     * @return the inner object.
     */
    OperationsListInner innerModel();
}