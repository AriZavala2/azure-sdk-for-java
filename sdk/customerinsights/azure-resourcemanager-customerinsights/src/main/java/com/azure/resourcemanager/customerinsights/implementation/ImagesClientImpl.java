// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.ImagesClient;
import com.azure.resourcemanager.customerinsights.fluent.models.ImageDefinitionInner;
import com.azure.resourcemanager.customerinsights.models.GetImageUploadUrlInput;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ImagesClient. */
public final class ImagesClientImpl implements ImagesClient {
    private final ClientLogger logger = new ClientLogger(ImagesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ImagesService service;

    /** The service client containing this operation class. */
    private final CustomerInsightsManagementClientImpl client;

    /**
     * Initializes an instance of ImagesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ImagesClientImpl(CustomerInsightsManagementClientImpl client) {
        this.service = RestProxy.create(ImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CustomerInsightsManagementClientImages to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CustomerInsightsMana")
    private interface ImagesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomerInsights"
                + "/hubs/{hubName}/images/getEntityTypeImageUploadUrl")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ImageDefinitionInner>> getUploadUrlForEntityType(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("hubName") String hubName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") GetImageUploadUrlInput parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomerInsights"
                + "/hubs/{hubName}/images/getDataImageUploadUrl")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ImageDefinitionInner>> getUploadUrlForData(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("hubName") String hubName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") GetImageUploadUrlInput parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets entity type (profile or interaction) image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForEntityType operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity type (profile or interaction) image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ImageDefinitionInner>> getUploadUrlForEntityTypeWithResponseAsync(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (hubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hubName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getUploadUrlForEntityType(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            hubName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets entity type (profile or interaction) image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForEntityType operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity type (profile or interaction) image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ImageDefinitionInner>> getUploadUrlForEntityTypeWithResponseAsync(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (hubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hubName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getUploadUrlForEntityType(
                this.client.getEndpoint(),
                resourceGroupName,
                hubName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Gets entity type (profile or interaction) image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForEntityType operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity type (profile or interaction) image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ImageDefinitionInner> getUploadUrlForEntityTypeAsync(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters) {
        return getUploadUrlForEntityTypeWithResponseAsync(resourceGroupName, hubName, parameters)
            .flatMap(
                (Response<ImageDefinitionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets entity type (profile or interaction) image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForEntityType operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity type (profile or interaction) image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImageDefinitionInner getUploadUrlForEntityType(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters) {
        return getUploadUrlForEntityTypeAsync(resourceGroupName, hubName, parameters).block();
    }

    /**
     * Gets entity type (profile or interaction) image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForEntityType operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity type (profile or interaction) image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ImageDefinitionInner> getUploadUrlForEntityTypeWithResponse(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters, Context context) {
        return getUploadUrlForEntityTypeWithResponseAsync(resourceGroupName, hubName, parameters, context).block();
    }

    /**
     * Gets data image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForData operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ImageDefinitionInner>> getUploadUrlForDataWithResponseAsync(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (hubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hubName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getUploadUrlForData(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            hubName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets data image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForData operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ImageDefinitionInner>> getUploadUrlForDataWithResponseAsync(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (hubName == null) {
            return Mono.error(new IllegalArgumentException("Parameter hubName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getUploadUrlForData(
                this.client.getEndpoint(),
                resourceGroupName,
                hubName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Gets data image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForData operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ImageDefinitionInner> getUploadUrlForDataAsync(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters) {
        return getUploadUrlForDataWithResponseAsync(resourceGroupName, hubName, parameters)
            .flatMap(
                (Response<ImageDefinitionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets data image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForData operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImageDefinitionInner getUploadUrlForData(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters) {
        return getUploadUrlForDataAsync(resourceGroupName, hubName, parameters).block();
    }

    /**
     * Gets data image upload URL.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param parameters Parameters supplied to the GetUploadUrlForData operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data image upload URL.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ImageDefinitionInner> getUploadUrlForDataWithResponse(
        String resourceGroupName, String hubName, GetImageUploadUrlInput parameters, Context context) {
        return getUploadUrlForDataWithResponseAsync(resourceGroupName, hubName, parameters, context).block();
    }
}