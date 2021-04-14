// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.attestation.fluent.models.AttestationProviderInner;
import com.azure.resourcemanager.attestation.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.attestation.models.AttestationProvider;
import com.azure.resourcemanager.attestation.models.AttestationServiceCreationParams;
import com.azure.resourcemanager.attestation.models.AttestationServiceCreationSpecificParams;
import com.azure.resourcemanager.attestation.models.AttestationServicePatchParams;
import com.azure.resourcemanager.attestation.models.AttestationServiceStatus;
import com.azure.resourcemanager.attestation.models.PrivateEndpointConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class AttestationProviderImpl
    implements AttestationProvider, AttestationProvider.Definition, AttestationProvider.Update {
    private AttestationProviderInner innerObject;

    private final com.azure.resourcemanager.attestation.AttestationManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String trustModel() {
        return this.innerModel().trustModel();
    }

    public AttestationServiceStatus status() {
        return this.innerModel().status();
    }

    public String attestUri() {
        return this.innerModel().attestUri();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AttestationProviderInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.attestation.AttestationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String providerName;

    private AttestationServiceCreationParams createCreationParams;

    private AttestationServicePatchParams updateUpdateParams;

    public AttestationProviderImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AttestationProvider create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestationProviders()
                .createWithResponse(resourceGroupName, providerName, createCreationParams, Context.NONE)
                .getValue();
        return this;
    }

    public AttestationProvider create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestationProviders()
                .createWithResponse(resourceGroupName, providerName, createCreationParams, context)
                .getValue();
        return this;
    }

    AttestationProviderImpl(String name, com.azure.resourcemanager.attestation.AttestationManager serviceManager) {
        this.innerObject = new AttestationProviderInner();
        this.serviceManager = serviceManager;
        this.providerName = name;
        this.createCreationParams = new AttestationServiceCreationParams();
    }

    public AttestationProviderImpl update() {
        this.updateUpdateParams = new AttestationServicePatchParams();
        return this;
    }

    public AttestationProvider apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestationProviders()
                .updateWithResponse(resourceGroupName, providerName, updateUpdateParams, Context.NONE)
                .getValue();
        return this;
    }

    public AttestationProvider apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestationProviders()
                .updateWithResponse(resourceGroupName, providerName, updateUpdateParams, context)
                .getValue();
        return this;
    }

    AttestationProviderImpl(
        AttestationProviderInner innerObject, com.azure.resourcemanager.attestation.AttestationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.providerName = Utils.getValueFromIdByName(innerObject.id(), "attestationProviders");
    }

    public AttestationProvider refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestationProviders()
                .getByResourceGroupWithResponse(resourceGroupName, providerName, Context.NONE)
                .getValue();
        return this;
    }

    public AttestationProvider refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttestationProviders()
                .getByResourceGroupWithResponse(resourceGroupName, providerName, context)
                .getValue();
        return this;
    }

    public AttestationProviderImpl withRegion(Region location) {
        this.createCreationParams.withLocation(location.toString());
        return this;
    }

    public AttestationProviderImpl withRegion(String location) {
        this.createCreationParams.withLocation(location);
        return this;
    }

    public AttestationProviderImpl withProperties(AttestationServiceCreationSpecificParams properties) {
        this.createCreationParams.withProperties(properties);
        return this;
    }

    public AttestationProviderImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreationParams.withTags(tags);
            return this;
        } else {
            this.updateUpdateParams.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}