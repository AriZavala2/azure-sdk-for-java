// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.advisor.fluent.models.SuppressionContractInner;

/** An instance of this class provides access to all the operations defined in SuppressionsClient. */
public interface SuppressionsClient {
    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SuppressionContractInner get(String resourceUri, String recommendationId, String name);

    /**
     * Obtains the details of a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SuppressionContractInner> getWithResponse(
        String resourceUri, String recommendationId, String name, Context context);

    /**
     * Enables the snoozed or dismissed attribute of a recommendation. The snoozed or dismissed attribute is referred to
     * as a suppression. Use this API to create or update the snoozed or dismissed status of a recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param suppressionContract The snoozed or dismissed attribute; for example, the snooze duration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SuppressionContractInner create(
        String resourceUri, String recommendationId, String name, SuppressionContractInner suppressionContract);

    /**
     * Enables the snoozed or dismissed attribute of a recommendation. The snoozed or dismissed attribute is referred to
     * as a suppression. Use this API to create or update the snoozed or dismissed status of a recommendation.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param suppressionContract The snoozed or dismissed attribute; for example, the snooze duration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with
     *     the rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SuppressionContractInner> createWithResponse(
        String resourceUri,
        String recommendationId,
        String name,
        SuppressionContractInner suppressionContract,
        Context context);

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a
     * recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceUri, String recommendationId, String name);

    /**
     * Enables the activation of a snoozed or dismissed recommendation. The snoozed or dismissed attribute of a
     * recommendation is referred to as a suppression.
     *
     * @param resourceUri The fully qualified Azure Resource Manager identifier of the resource to which the
     *     recommendation applies.
     * @param recommendationId The recommendation ID.
     * @param name The name of the suppression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceUri, String recommendationId, String name, Context context);

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of
     * a recommendation is referred to as a suppression.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor suppressions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SuppressionContractInner> list();

    /**
     * Retrieves the list of snoozed or dismissed suppressions for a subscription. The snoozed or dismissed attribute of
     * a recommendation is referred to as a suppression.
     *
     * @param top The number of suppressions per page if a paged version of this API is being used.
     * @param skipToken The page-continuation token to use with a paged version of this API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor suppressions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SuppressionContractInner> list(Integer top, String skipToken, Context context);
}