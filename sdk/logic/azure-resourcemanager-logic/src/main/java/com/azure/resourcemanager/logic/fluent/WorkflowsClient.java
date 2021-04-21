// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.logic.fluent.models.WorkflowInner;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.GenerateUpgradedDefinitionParameters;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;
import com.azure.resourcemanager.logic.models.RegenerateActionParameter;
import com.azure.resourcemanager.logic.models.WorkflowReference;

/** An instance of this class provides access to all the operations defined in WorkflowsClient. */
public interface WorkflowsClient {
    /**
     * Gets a list of workflows by subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowInner> list();

    /**
     * Gets a list of workflows by subscription.
     *
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: State, Trigger, and
     *     ReferencedResourceId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowInner> list(Integer top, String filter, Context context);

    /**
     * Gets a list of workflows by resource group.
     *
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of workflows by resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: State, Trigger, and
     *     ReferencedResourceId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowInner> listByResourceGroup(
        String resourceGroupName, Integer top, String filter, Context context);

    /**
     * Gets a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowInner getByResourceGroup(String resourceGroupName, String workflowName);

    /**
     * Gets a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowInner> getByResourceGroupWithResponse(
        String resourceGroupName, String workflowName, Context context);

    /**
     * Creates or updates a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param workflow The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowInner createOrUpdate(String resourceGroupName, String workflowName, WorkflowInner workflow);

    /**
     * Creates or updates a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param workflow The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowInner> createOrUpdateWithResponse(
        String resourceGroupName, String workflowName, WorkflowInner workflow, Context context);

    /**
     * Updates a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowInner update(String resourceGroupName, String workflowName);

    /**
     * Updates a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowInner> updateWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Deletes a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workflowName);

    /**
     * Deletes a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Disables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disable(String resourceGroupName, String workflowName);

    /**
     * Disables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> disableWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Enables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enable(String resourceGroupName, String workflowName);

    /**
     * Enables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> enableWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Generates the upgraded definition for a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param parameters Parameters for generating an upgraded definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object generateUpgradedDefinition(
        String resourceGroupName, String workflowName, GenerateUpgradedDefinitionParameters parameters);

    /**
     * Generates the upgraded definition for a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param parameters Parameters for generating an upgraded definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Object> generateUpgradedDefinitionWithResponse(
        String resourceGroupName,
        String workflowName,
        GenerateUpgradedDefinitionParameters parameters,
        Context context);

    /**
     * Get the workflow callback Url.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param listCallbackUrl Which callback url to list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow callback Url.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowTriggerCallbackUrlInner listCallbackUrl(
        String resourceGroupName, String workflowName, GetCallbackUrlParameters listCallbackUrl);

    /**
     * Get the workflow callback Url.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param listCallbackUrl Which callback url to list.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow callback Url.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowTriggerCallbackUrlInner> listCallbackUrlWithResponse(
        String resourceGroupName, String workflowName, GetCallbackUrlParameters listCallbackUrl, Context context);

    /**
     * Gets an OpenAPI definition for the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an OpenAPI definition for the workflow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object listSwagger(String resourceGroupName, String workflowName);

    /**
     * Gets an OpenAPI definition for the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an OpenAPI definition for the workflow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Object> listSwaggerWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Moves an existing workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param move The workflow to move.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginMove(String resourceGroupName, String workflowName, WorkflowReference move);

    /**
     * Moves an existing workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param move The workflow to move.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginMove(
        String resourceGroupName, String workflowName, WorkflowReference move, Context context);

    /**
     * Moves an existing workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param move The workflow to move.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void move(String resourceGroupName, String workflowName, WorkflowReference move);

    /**
     * Moves an existing workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param move The workflow to move.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void move(String resourceGroupName, String workflowName, WorkflowReference move, Context context);

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void regenerateAccessKey(String resourceGroupName, String workflowName, RegenerateActionParameter keyType);

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> regenerateAccessKeyWithResponse(
        String resourceGroupName, String workflowName, RegenerateActionParameter keyType, Context context);

    /**
     * Validates the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateByResourceGroup(String resourceGroupName, String workflowName, WorkflowInner validate);

    /**
     * Validates the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> validateByResourceGroupWithResponse(
        String resourceGroupName, String workflowName, WorkflowInner validate, Context context);

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName The resource group name.
     * @param location The workflow location.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void validateByLocation(String resourceGroupName, String location, String workflowName, WorkflowInner validate);

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName The resource group name.
     * @param location The workflow location.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> validateByLocationWithResponse(
        String resourceGroupName, String location, String workflowName, WorkflowInner validate, Context context);
}