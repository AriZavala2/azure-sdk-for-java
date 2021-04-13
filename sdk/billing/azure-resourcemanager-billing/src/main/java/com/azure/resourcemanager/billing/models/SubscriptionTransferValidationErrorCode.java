// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SubscriptionTransferValidationErrorCode. */
public final class SubscriptionTransferValidationErrorCode
    extends ExpandableStringEnum<SubscriptionTransferValidationErrorCode> {
    /** Static value BillingAccountInactive for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode BILLING_ACCOUNT_INACTIVE =
        fromString("BillingAccountInactive");

    /** Static value CrossBillingAccountNotAllowed for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode CROSS_BILLING_ACCOUNT_NOT_ALLOWED =
        fromString("CrossBillingAccountNotAllowed");

    /** Static value DestinationBillingProfileInactive for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode DESTINATION_BILLING_PROFILE_INACTIVE =
        fromString("DestinationBillingProfileInactive");

    /** Static value DestinationBillingProfileNotFound for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode DESTINATION_BILLING_PROFILE_NOT_FOUND =
        fromString("DestinationBillingProfileNotFound");

    /** Static value DestinationBillingProfilePastDue for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode DESTINATION_BILLING_PROFILE_PAST_DUE =
        fromString("DestinationBillingProfilePastDue");

    /** Static value DestinationInvoiceSectionInactive for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode DESTINATION_INVOICE_SECTION_INACTIVE =
        fromString("DestinationInvoiceSectionInactive");

    /** Static value DestinationInvoiceSectionNotFound for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode DESTINATION_INVOICE_SECTION_NOT_FOUND =
        fromString("DestinationInvoiceSectionNotFound");

    /** Static value InsufficientPermissionOnDestination for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode INSUFFICIENT_PERMISSION_ON_DESTINATION =
        fromString("InsufficientPermissionOnDestination");

    /** Static value InsufficientPermissionOnSource for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode INSUFFICIENT_PERMISSION_ON_SOURCE =
        fromString("InsufficientPermissionOnSource");

    /** Static value InvalidDestination for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode INVALID_DESTINATION = fromString("InvalidDestination");

    /** Static value InvalidSource for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode INVALID_SOURCE = fromString("InvalidSource");

    /** Static value MarketplaceNotEnabledOnDestination for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode MARKETPLACE_NOT_ENABLED_ON_DESTINATION =
        fromString("MarketplaceNotEnabledOnDestination");

    /** Static value NotAvailableForDestinationMarket for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode NOT_AVAILABLE_FOR_DESTINATION_MARKET =
        fromString("NotAvailableForDestinationMarket");

    /** Static value ProductInactive for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode PRODUCT_INACTIVE = fromString("ProductInactive");

    /** Static value ProductNotFound for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode PRODUCT_NOT_FOUND = fromString("ProductNotFound");

    /** Static value ProductTypeNotSupported for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode PRODUCT_TYPE_NOT_SUPPORTED =
        fromString("ProductTypeNotSupported");

    /** Static value SourceBillingProfilePastDue for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode SOURCE_BILLING_PROFILE_PAST_DUE =
        fromString("SourceBillingProfilePastDue");

    /** Static value SourceInvoiceSectionInactive for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode SOURCE_INVOICE_SECTION_INACTIVE =
        fromString("SourceInvoiceSectionInactive");

    /** Static value SubscriptionNotActive for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode SUBSCRIPTION_NOT_ACTIVE =
        fromString("SubscriptionNotActive");

    /** Static value SubscriptionTypeNotSupported for SubscriptionTransferValidationErrorCode. */
    public static final SubscriptionTransferValidationErrorCode SUBSCRIPTION_TYPE_NOT_SUPPORTED =
        fromString("SubscriptionTypeNotSupported");

    /**
     * Creates or finds a SubscriptionTransferValidationErrorCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SubscriptionTransferValidationErrorCode.
     */
    @JsonCreator
    public static SubscriptionTransferValidationErrorCode fromString(String name) {
        return fromString(name, SubscriptionTransferValidationErrorCode.class);
    }

    /** @return known SubscriptionTransferValidationErrorCode values. */
    public static Collection<SubscriptionTransferValidationErrorCode> values() {
        return values(SubscriptionTransferValidationErrorCode.class);
    }
}