// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.AvailableBalanceInner;
import com.azure.resourcemanager.billing.models.Amount;
import com.azure.resourcemanager.billing.models.AvailableBalance;

public final class AvailableBalanceImpl implements AvailableBalance {
    private AvailableBalanceInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    AvailableBalanceImpl(
        AvailableBalanceInner innerObject, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Amount amount() {
        return this.innerModel().amount();
    }

    public AvailableBalanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}