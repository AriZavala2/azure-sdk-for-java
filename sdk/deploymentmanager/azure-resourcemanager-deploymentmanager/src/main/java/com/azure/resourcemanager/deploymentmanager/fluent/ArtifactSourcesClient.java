// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ArtifactSourceInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in ArtifactSourcesClient. */
public interface ArtifactSourcesClient {
    /**
     * Synchronously creates a new artifact source or updates an existing artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource that defines the source location where the artifacts are located.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArtifactSourceInner createOrUpdate(String resourceGroupName, String artifactSourceName);

    /**
     * Synchronously creates a new artifact source or updates an existing artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @param artifactSourceInfo Source object that defines the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource that defines the source location where the artifacts are located.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArtifactSourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String artifactSourceName, ArtifactSourceInner artifactSourceInfo, Context context);

    /**
     * Gets an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an artifact source.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArtifactSourceInner getByResourceGroup(String resourceGroupName, String artifactSourceName);

    /**
     * Gets an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an artifact source.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArtifactSourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String artifactSourceName, Context context);

    /**
     * Deletes an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String artifactSourceName);

    /**
     * Deletes an artifact source.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param artifactSourceName The name of the artifact source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String artifactSourceName, Context context);

    /**
     * Lists the artifact sources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of artifact sources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<ArtifactSourceInner> list(String resourceGroupName);

    /**
     * Lists the artifact sources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of artifact sources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<ArtifactSourceInner>> listWithResponse(String resourceGroupName, Context context);
}