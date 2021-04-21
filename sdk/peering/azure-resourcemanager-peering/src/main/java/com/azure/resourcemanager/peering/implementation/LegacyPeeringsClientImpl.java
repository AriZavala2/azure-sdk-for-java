// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.fluent.LegacyPeeringsClient;
import com.azure.resourcemanager.peering.fluent.models.PeeringInner;
import com.azure.resourcemanager.peering.models.LegacyPeeringsKind;
import com.azure.resourcemanager.peering.models.PeeringListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LegacyPeeringsClient. */
public final class LegacyPeeringsClientImpl implements LegacyPeeringsClient {
    private final ClientLogger logger = new ClientLogger(LegacyPeeringsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LegacyPeeringsService service;

    /** The service client containing this operation class. */
    private final PeeringManagementClientImpl client;

    /**
     * Initializes an instance of LegacyPeeringsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LegacyPeeringsClientImpl(PeeringManagementClientImpl client) {
        this.service =
            RestProxy.create(LegacyPeeringsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PeeringManagementClientLegacyPeerings to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PeeringManagementCli")
    private interface LegacyPeeringsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Peering/legacyPeerings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeeringListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("peeringLocation") String peeringLocation,
            @QueryParam("kind") LegacyPeeringsKind kind,
            @QueryParam("asn") Integer asn,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PeeringListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @param asn The ASN number associated with a legacy peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringInner>> listSinglePageAsync(
        String peeringLocation, LegacyPeeringsKind kind, Integer asn) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peeringLocation == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter peeringLocation is required and cannot be null."));
        }
        if (kind == null) {
            return Mono.error(new IllegalArgumentException("Parameter kind is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            peeringLocation,
                            kind,
                            asn,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<PeeringInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @param asn The ASN number associated with a legacy peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringInner>> listSinglePageAsync(
        String peeringLocation, LegacyPeeringsKind kind, Integer asn, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (peeringLocation == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter peeringLocation is required and cannot be null."));
        }
        if (kind == null) {
            return Mono.error(new IllegalArgumentException("Parameter kind is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                peeringLocation,
                kind,
                asn,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @param asn The ASN number associated with a legacy peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PeeringInner> listAsync(String peeringLocation, LegacyPeeringsKind kind, Integer asn) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(peeringLocation, kind, asn), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PeeringInner> listAsync(String peeringLocation, LegacyPeeringsKind kind) {
        final Integer asn = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(peeringLocation, kind, asn), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @param asn The ASN number associated with a legacy peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PeeringInner> listAsync(
        String peeringLocation, LegacyPeeringsKind kind, Integer asn, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(peeringLocation, kind, asn, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeeringInner> list(String peeringLocation, LegacyPeeringsKind kind) {
        final Integer asn = null;
        return new PagedIterable<>(listAsync(peeringLocation, kind, asn));
    }

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @param asn The ASN number associated with a legacy peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PeeringInner> list(
        String peeringLocation, LegacyPeeringsKind kind, Integer asn, Context context) {
        return new PagedIterable<>(listAsync(peeringLocation, kind, asn, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PeeringInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PeeringInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}