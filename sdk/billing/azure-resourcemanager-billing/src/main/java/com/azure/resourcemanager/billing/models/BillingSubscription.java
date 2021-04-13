// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner;
import java.util.UUID;

/** An immutable client-side representation of BillingSubscription. */
public interface BillingSubscription {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the displayName property: The name of the subscription.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the subscriptionId property: The ID of the subscription.
     *
     * @return the subscriptionId value.
     */
    UUID subscriptionId();

    /**
     * Gets the subscriptionBillingStatus property: The current billing status of the subscription.
     *
     * @return the subscriptionBillingStatus value.
     */
    BillingSubscriptionStatusType subscriptionBillingStatus();

    /**
     * Gets the lastMonthCharges property: The last month charges.
     *
     * @return the lastMonthCharges value.
     */
    Amount lastMonthCharges();

    /**
     * Gets the monthToDateCharges property: The current month to date charges.
     *
     * @return the monthToDateCharges value.
     */
    Amount monthToDateCharges();

    /**
     * Gets the billingProfileId property: The ID of the billing profile to which the subscription is billed.
     *
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * Gets the billingProfileDisplayName property: The name of the billing profile to which the subscription is billed.
     *
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * Gets the costCenter property: The cost center applied to the subscription.
     *
     * @return the costCenter value.
     */
    String costCenter();

    /**
     * Gets the customerId property: The ID of the customer for whom the subscription was created. The field is
     * applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerId value.
     */
    String customerId();

    /**
     * Gets the customerDisplayName property: The name of the customer for whom the subscription was created. The field
     * is applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerDisplayName value.
     */
    String customerDisplayName();

    /**
     * Gets the invoiceSectionId property: The ID of the invoice section to which the subscription is billed.
     *
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * Gets the invoiceSectionDisplayName property: The name of the invoice section to which the subscription is billed.
     *
     * @return the invoiceSectionDisplayName value.
     */
    String invoiceSectionDisplayName();

    /**
     * Gets the reseller property: Reseller for this subscription.
     *
     * @return the reseller value.
     */
    Reseller reseller();

    /**
     * Gets the skuId property: The sku ID of the Azure plan for the subscription.
     *
     * @return the skuId value.
     */
    String skuId();

    /**
     * Gets the skuDescription property: The sku description of the Azure plan for the subscription.
     *
     * @return the skuDescription value.
     */
    String skuDescription();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner object.
     *
     * @return the inner object.
     */
    BillingSubscriptionInner innerModel();
}