// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.RegistrationInner;
import com.azure.resourcemanager.azurestack.models.ActivationKeyResult;
import com.azure.resourcemanager.azurestack.models.Location;
import com.azure.resourcemanager.azurestack.models.Registration;
import com.azure.resourcemanager.azurestack.models.RegistrationParameter;
import java.util.Collections;
import java.util.Map;

public final class RegistrationImpl implements Registration, Registration.Definition, Registration.Update {
    private RegistrationInner innerObject;

    private final com.azure.resourcemanager.azurestack.AzureStackManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String objectId() {
        return this.innerModel().objectId();
    }

    public String cloudId() {
        return this.innerModel().cloudId();
    }

    public String billingModel() {
        return this.innerModel().billingModel();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public RegistrationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.AzureStackManager manager() {
        return this.serviceManager;
    }

    private String resourceGroup;

    private String registrationName;

    private RegistrationParameter createToken;

    private RegistrationParameter updateToken;

    public RegistrationImpl withExistingResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    public Registration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistrations()
                .createOrUpdateWithResponse(resourceGroup, registrationName, createToken, Context.NONE)
                .getValue();
        return this;
    }

    public Registration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistrations()
                .createOrUpdateWithResponse(resourceGroup, registrationName, createToken, context)
                .getValue();
        return this;
    }

    RegistrationImpl(String name, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerObject = new RegistrationInner();
        this.serviceManager = serviceManager;
        this.registrationName = name;
        this.createToken = new RegistrationParameter();
    }

    public RegistrationImpl update() {
        this.updateToken = new RegistrationParameter();
        return this;
    }

    public Registration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistrations()
                .updateWithResponse(resourceGroup, registrationName, updateToken, Context.NONE)
                .getValue();
        return this;
    }

    public Registration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistrations()
                .updateWithResponse(resourceGroup, registrationName, updateToken, context)
                .getValue();
        return this;
    }

    RegistrationImpl(
        RegistrationInner innerObject, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroup = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.registrationName = Utils.getValueFromIdByName(innerObject.id(), "registrations");
    }

    public Registration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistrations()
                .getByResourceGroupWithResponse(resourceGroup, registrationName, Context.NONE)
                .getValue();
        return this;
    }

    public Registration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistrations()
                .getByResourceGroupWithResponse(resourceGroup, registrationName, context)
                .getValue();
        return this;
    }

    public ActivationKeyResult getActivationKey() {
        return serviceManager.registrations().getActivationKey(resourceGroup, registrationName);
    }

    public Response<ActivationKeyResult> getActivationKeyWithResponse(Context context) {
        return serviceManager.registrations().getActivationKeyWithResponse(resourceGroup, registrationName, context);
    }

    public void enableRemoteManagement() {
        serviceManager.registrations().enableRemoteManagement(resourceGroup, registrationName);
    }

    public Response<Void> enableRemoteManagementWithResponse(Context context) {
        return serviceManager
            .registrations()
            .enableRemoteManagementWithResponse(resourceGroup, registrationName, context);
    }

    public RegistrationImpl withLocation(Location location) {
        this.createToken.withLocation(location);
        return this;
    }

    public RegistrationImpl withRegistrationToken(String registrationToken) {
        if (isInCreateMode()) {
            this.createToken.withRegistrationToken(registrationToken);
            return this;
        } else {
            this.updateToken.withRegistrationToken(registrationToken);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}