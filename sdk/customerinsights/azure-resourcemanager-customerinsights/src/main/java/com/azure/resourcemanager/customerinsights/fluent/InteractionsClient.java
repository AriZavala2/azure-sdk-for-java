// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.customerinsights.fluent.models.InteractionResourceFormatInner;
import com.azure.resourcemanager.customerinsights.fluent.models.SuggestRelationshipLinksResponseInner;

/** An instance of this class provides access to all the operations defined in InteractionsClient. */
public interface InteractionsClient {
    /**
     * Creates an interaction or updates an existing interaction within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @param parameters Parameters supplied to the CreateOrUpdate Interaction operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the interaction resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InteractionResourceFormatInner>, InteractionResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName, String hubName, String interactionName, InteractionResourceFormatInner parameters);

    /**
     * Creates an interaction or updates an existing interaction within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @param parameters Parameters supplied to the CreateOrUpdate Interaction operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the interaction resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InteractionResourceFormatInner>, InteractionResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName,
        String hubName,
        String interactionName,
        InteractionResourceFormatInner parameters,
        Context context);

    /**
     * Creates an interaction or updates an existing interaction within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @param parameters Parameters supplied to the CreateOrUpdate Interaction operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the interaction resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InteractionResourceFormatInner createOrUpdate(
        String resourceGroupName, String hubName, String interactionName, InteractionResourceFormatInner parameters);

    /**
     * Creates an interaction or updates an existing interaction within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @param parameters Parameters supplied to the CreateOrUpdate Interaction operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the interaction resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InteractionResourceFormatInner createOrUpdate(
        String resourceGroupName,
        String hubName,
        String interactionName,
        InteractionResourceFormatInner parameters,
        Context context);

    /**
     * Gets information about the specified interaction.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified interaction.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InteractionResourceFormatInner get(String resourceGroupName, String hubName, String interactionName);

    /**
     * Gets information about the specified interaction.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @param localeCode Locale of interaction to retrieve, default is en-us.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified interaction.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InteractionResourceFormatInner> getWithResponse(
        String resourceGroupName, String hubName, String interactionName, String localeCode, Context context);

    /**
     * Gets all interactions in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all interactions in the hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InteractionResourceFormatInner> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all interactions in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param localeCode Locale of interaction to retrieve, default is en-us.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all interactions in the hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InteractionResourceFormatInner> listByHub(
        String resourceGroupName, String hubName, String localeCode, Context context);

    /**
     * Suggests relationships to create relationship links.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of suggest relationship links operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SuggestRelationshipLinksResponseInner suggestRelationshipLinks(
        String resourceGroupName, String hubName, String interactionName);

    /**
     * Suggests relationships to create relationship links.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param interactionName The name of the interaction.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of suggest relationship links operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SuggestRelationshipLinksResponseInner> suggestRelationshipLinksWithResponse(
        String resourceGroupName, String hubName, String interactionName, Context context);
}