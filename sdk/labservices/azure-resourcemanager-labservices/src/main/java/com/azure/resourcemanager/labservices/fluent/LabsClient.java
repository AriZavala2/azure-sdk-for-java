// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.labservices.fluent.models.LabInner;
import com.azure.resourcemanager.labservices.models.AddUsersPayload;
import com.azure.resourcemanager.labservices.models.LabFragment;

/** An instance of this class provides access to all the operations defined in LabsClient. */
public interface LabsClient {
    /**
     * List labs in a given lab account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabInner> list(String resourceGroupName, String labAccountName);

    /**
     * List labs in a given lab account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param expand Specify the $expand query. Example: 'properties($select=maxUsersInLab)'.
     * @param filter The filter to apply to the operation.
     * @param top The maximum number of resources to return from the operation.
     * @param orderby The ordering expression for the results, using OData notation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LabInner> list(
        String resourceGroupName,
        String labAccountName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LabInner get(String resourceGroupName, String labAccountName, String labName);

    /**
     * Get lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=maxUsersInLab)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LabInner> getWithResponse(
        String resourceGroupName, String labAccountName, String labName, String expand, Context context);

    /**
     * Create or replace an existing Lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param lab Represents a lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LabInner createOrUpdate(String resourceGroupName, String labAccountName, String labName, LabInner lab);

    /**
     * Create or replace an existing Lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param lab Represents a lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LabInner> createOrUpdateWithResponse(
        String resourceGroupName, String labAccountName, String labName, LabInner lab, Context context);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String labAccountName, String labName);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String labAccountName, String labName, Context context);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labAccountName, String labName);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labAccountName, String labName, Context context);

    /**
     * Modify properties of labs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param lab Represents a lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LabInner update(String resourceGroupName, String labAccountName, String labName, LabFragment lab);

    /**
     * Modify properties of labs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param lab Represents a lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a lab.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LabInner> updateWithResponse(
        String resourceGroupName, String labAccountName, String labName, LabFragment lab, Context context);

    /**
     * Add users to a lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param addUsersPayload Payload for Add Users operation on a Lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void addUsers(String resourceGroupName, String labAccountName, String labName, AddUsersPayload addUsersPayload);

    /**
     * Add users to a lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param addUsersPayload Payload for Add Users operation on a Lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> addUsersWithResponse(
        String resourceGroupName,
        String labAccountName,
        String labName,
        AddUsersPayload addUsersPayload,
        Context context);

    /**
     * Register to managed lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void register(String resourceGroupName, String labAccountName, String labName);

    /**
     * Register to managed lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> registerWithResponse(
        String resourceGroupName, String labAccountName, String labName, Context context);
}