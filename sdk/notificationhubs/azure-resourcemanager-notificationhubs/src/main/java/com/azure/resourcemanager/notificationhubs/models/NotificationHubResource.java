// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.notificationhubs.fluent.models.NotificationHubResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of NotificationHubResource. */
public interface NotificationHubResource {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the namePropertiesName property: The NotificationHub name.
     *
     * @return the namePropertiesName value.
     */
    String namePropertiesName();

    /**
     * Gets the registrationTtl property: The RegistrationTtl of the created NotificationHub.
     *
     * @return the registrationTtl value.
     */
    String registrationTtl();

    /**
     * Gets the authorizationRules property: The AuthorizationRules of the created NotificationHub.
     *
     * @return the authorizationRules value.
     */
    List<SharedAccessAuthorizationRuleProperties> authorizationRules();

    /**
     * Gets the apnsCredential property: The ApnsCredential of the created NotificationHub.
     *
     * @return the apnsCredential value.
     */
    ApnsCredential apnsCredential();

    /**
     * Gets the wnsCredential property: The WnsCredential of the created NotificationHub.
     *
     * @return the wnsCredential value.
     */
    WnsCredential wnsCredential();

    /**
     * Gets the gcmCredential property: The GcmCredential of the created NotificationHub.
     *
     * @return the gcmCredential value.
     */
    GcmCredential gcmCredential();

    /**
     * Gets the mpnsCredential property: The MpnsCredential of the created NotificationHub.
     *
     * @return the mpnsCredential value.
     */
    MpnsCredential mpnsCredential();

    /**
     * Gets the admCredential property: The AdmCredential of the created NotificationHub.
     *
     * @return the admCredential value.
     */
    AdmCredential admCredential();

    /**
     * Gets the baiduCredential property: The BaiduCredential of the created NotificationHub.
     *
     * @return the baiduCredential value.
     */
    BaiduCredential baiduCredential();

    /**
     * Gets the sku property: The sku of the created namespace.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.notificationhubs.fluent.models.NotificationHubResourceInner object.
     *
     * @return the inner object.
     */
    NotificationHubResourceInner innerModel();

    /** The entirety of the NotificationHubResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The NotificationHubResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the NotificationHubResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the NotificationHubResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the NotificationHubResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param namespaceName The namespace name.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }
        /**
         * The stage of the NotificationHubResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithNamePropertiesName,
                DefinitionStages.WithRegistrationTtl,
                DefinitionStages.WithAuthorizationRules,
                DefinitionStages.WithApnsCredential,
                DefinitionStages.WithWnsCredential,
                DefinitionStages.WithGcmCredential,
                DefinitionStages.WithMpnsCredential,
                DefinitionStages.WithAdmCredential,
                DefinitionStages.WithBaiduCredential,
                DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NotificationHubResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NotificationHubResource create(Context context);
        }
        /** The stage of the NotificationHubResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the NotificationHubResource definition allowing to specify namePropertiesName. */
        interface WithNamePropertiesName {
            /**
             * Specifies the namePropertiesName property: The NotificationHub name..
             *
             * @param namePropertiesName The NotificationHub name.
             * @return the next definition stage.
             */
            WithCreate withNamePropertiesName(String namePropertiesName);
        }
        /** The stage of the NotificationHubResource definition allowing to specify registrationTtl. */
        interface WithRegistrationTtl {
            /**
             * Specifies the registrationTtl property: The RegistrationTtl of the created NotificationHub.
             *
             * @param registrationTtl The RegistrationTtl of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withRegistrationTtl(String registrationTtl);
        }
        /** The stage of the NotificationHubResource definition allowing to specify authorizationRules. */
        interface WithAuthorizationRules {
            /**
             * Specifies the authorizationRules property: The AuthorizationRules of the created NotificationHub.
             *
             * @param authorizationRules The AuthorizationRules of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withAuthorizationRules(List<SharedAccessAuthorizationRuleProperties> authorizationRules);
        }
        /** The stage of the NotificationHubResource definition allowing to specify apnsCredential. */
        interface WithApnsCredential {
            /**
             * Specifies the apnsCredential property: The ApnsCredential of the created NotificationHub.
             *
             * @param apnsCredential The ApnsCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withApnsCredential(ApnsCredential apnsCredential);
        }
        /** The stage of the NotificationHubResource definition allowing to specify wnsCredential. */
        interface WithWnsCredential {
            /**
             * Specifies the wnsCredential property: The WnsCredential of the created NotificationHub.
             *
             * @param wnsCredential The WnsCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withWnsCredential(WnsCredential wnsCredential);
        }
        /** The stage of the NotificationHubResource definition allowing to specify gcmCredential. */
        interface WithGcmCredential {
            /**
             * Specifies the gcmCredential property: The GcmCredential of the created NotificationHub.
             *
             * @param gcmCredential The GcmCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withGcmCredential(GcmCredential gcmCredential);
        }
        /** The stage of the NotificationHubResource definition allowing to specify mpnsCredential. */
        interface WithMpnsCredential {
            /**
             * Specifies the mpnsCredential property: The MpnsCredential of the created NotificationHub.
             *
             * @param mpnsCredential The MpnsCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withMpnsCredential(MpnsCredential mpnsCredential);
        }
        /** The stage of the NotificationHubResource definition allowing to specify admCredential. */
        interface WithAdmCredential {
            /**
             * Specifies the admCredential property: The AdmCredential of the created NotificationHub.
             *
             * @param admCredential The AdmCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withAdmCredential(AdmCredential admCredential);
        }
        /** The stage of the NotificationHubResource definition allowing to specify baiduCredential. */
        interface WithBaiduCredential {
            /**
             * Specifies the baiduCredential property: The BaiduCredential of the created NotificationHub.
             *
             * @param baiduCredential The BaiduCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            WithCreate withBaiduCredential(BaiduCredential baiduCredential);
        }
        /** The stage of the NotificationHubResource definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of the created namespace.
             *
             * @param sku The sku of the created namespace.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
    }
    /**
     * Begins update for the NotificationHubResource resource.
     *
     * @return the stage of resource update.
     */
    NotificationHubResource.Update update();

    /** The template for NotificationHubResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithNamePropertiesName,
            UpdateStages.WithRegistrationTtl,
            UpdateStages.WithAuthorizationRules,
            UpdateStages.WithApnsCredential,
            UpdateStages.WithWnsCredential,
            UpdateStages.WithGcmCredential,
            UpdateStages.WithMpnsCredential,
            UpdateStages.WithAdmCredential,
            UpdateStages.WithBaiduCredential,
            UpdateStages.WithSku {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NotificationHubResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NotificationHubResource apply(Context context);
    }
    /** The NotificationHubResource update stages. */
    interface UpdateStages {
        /** The stage of the NotificationHubResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the NotificationHubResource update allowing to specify namePropertiesName. */
        interface WithNamePropertiesName {
            /**
             * Specifies the namePropertiesName property: The NotificationHub name..
             *
             * @param namePropertiesName The NotificationHub name.
             * @return the next definition stage.
             */
            Update withNamePropertiesName(String namePropertiesName);
        }
        /** The stage of the NotificationHubResource update allowing to specify registrationTtl. */
        interface WithRegistrationTtl {
            /**
             * Specifies the registrationTtl property: The RegistrationTtl of the created NotificationHub.
             *
             * @param registrationTtl The RegistrationTtl of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withRegistrationTtl(String registrationTtl);
        }
        /** The stage of the NotificationHubResource update allowing to specify authorizationRules. */
        interface WithAuthorizationRules {
            /**
             * Specifies the authorizationRules property: The AuthorizationRules of the created NotificationHub.
             *
             * @param authorizationRules The AuthorizationRules of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withAuthorizationRules(List<SharedAccessAuthorizationRuleProperties> authorizationRules);
        }
        /** The stage of the NotificationHubResource update allowing to specify apnsCredential. */
        interface WithApnsCredential {
            /**
             * Specifies the apnsCredential property: The ApnsCredential of the created NotificationHub.
             *
             * @param apnsCredential The ApnsCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withApnsCredential(ApnsCredential apnsCredential);
        }
        /** The stage of the NotificationHubResource update allowing to specify wnsCredential. */
        interface WithWnsCredential {
            /**
             * Specifies the wnsCredential property: The WnsCredential of the created NotificationHub.
             *
             * @param wnsCredential The WnsCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withWnsCredential(WnsCredential wnsCredential);
        }
        /** The stage of the NotificationHubResource update allowing to specify gcmCredential. */
        interface WithGcmCredential {
            /**
             * Specifies the gcmCredential property: The GcmCredential of the created NotificationHub.
             *
             * @param gcmCredential The GcmCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withGcmCredential(GcmCredential gcmCredential);
        }
        /** The stage of the NotificationHubResource update allowing to specify mpnsCredential. */
        interface WithMpnsCredential {
            /**
             * Specifies the mpnsCredential property: The MpnsCredential of the created NotificationHub.
             *
             * @param mpnsCredential The MpnsCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withMpnsCredential(MpnsCredential mpnsCredential);
        }
        /** The stage of the NotificationHubResource update allowing to specify admCredential. */
        interface WithAdmCredential {
            /**
             * Specifies the admCredential property: The AdmCredential of the created NotificationHub.
             *
             * @param admCredential The AdmCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withAdmCredential(AdmCredential admCredential);
        }
        /** The stage of the NotificationHubResource update allowing to specify baiduCredential. */
        interface WithBaiduCredential {
            /**
             * Specifies the baiduCredential property: The BaiduCredential of the created NotificationHub.
             *
             * @param baiduCredential The BaiduCredential of the created NotificationHub.
             * @return the next definition stage.
             */
            Update withBaiduCredential(BaiduCredential baiduCredential);
        }
        /** The stage of the NotificationHubResource update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of the created namespace.
             *
             * @param sku The sku of the created namespace.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NotificationHubResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NotificationHubResource refresh(Context context);

    /**
     * test send a push notification.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a NotificationHub Resource.
     */
    DebugSendResponse debugSend();

    /**
     * test send a push notification.
     *
     * @param parameters Debug send parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a NotificationHub Resource.
     */
    Response<DebugSendResponse> debugSendWithResponse(Object parameters, Context context);

    /**
     * Lists the PNS Credentials associated with a notification hub .
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a NotificationHub PNS Credentials.
     */
    PnsCredentialsResource getPnsCredentials();

    /**
     * Lists the PNS Credentials associated with a notification hub .
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a NotificationHub PNS Credentials.
     */
    Response<PnsCredentialsResource> getPnsCredentialsWithResponse(Context context);
}