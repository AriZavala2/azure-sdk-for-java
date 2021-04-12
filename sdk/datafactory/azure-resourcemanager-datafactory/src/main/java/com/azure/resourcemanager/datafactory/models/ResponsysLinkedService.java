// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Responsys linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Responsys")
@JsonFlatten
@Fluent
public class ResponsysLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResponsysLinkedService.class);

    /*
     * The endpoint of the Responsys server.
     */
    @JsonProperty(value = "typeProperties.endpoint", required = true)
    private Object endpoint;

    /*
     * The client ID associated with the Responsys application. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId", required = true)
    private Object clientId;

    /*
     * The client secret associated with the Responsys application. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint property: The endpoint of the Responsys server.
     *
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of the Responsys server.
     *
     * @param endpoint the endpoint value to set.
     * @return the ResponsysLinkedService object itself.
     */
    public ResponsysLinkedService withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with the Responsys application. Type: string (or Expression
     * with resultType string).
     *
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with the Responsys application. Type: string (or Expression
     * with resultType string).
     *
     * @param clientId the clientId value to set.
     * @return the ResponsysLinkedService object itself.
     */
    public ResponsysLinkedService withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with the Responsys application. Type: string (or
     * Expression with resultType string).
     *
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with the Responsys application. Type: string (or
     * Expression with resultType string).
     *
     * @param clientSecret the clientSecret value to set.
     * @return the ResponsysLinkedService object itself.
     */
    public ResponsysLinkedService withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the ResponsysLinkedService object itself.
     */
    public ResponsysLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the ResponsysLinkedService object itself.
     */
    public ResponsysLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the ResponsysLinkedService object itself.
     */
    public ResponsysLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ResponsysLinkedService object itself.
     */
    public ResponsysLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResponsysLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResponsysLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResponsysLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResponsysLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (endpoint() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property endpoint in model ResponsysLinkedService"));
        }
        if (clientId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property clientId in model ResponsysLinkedService"));
        }
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }
}