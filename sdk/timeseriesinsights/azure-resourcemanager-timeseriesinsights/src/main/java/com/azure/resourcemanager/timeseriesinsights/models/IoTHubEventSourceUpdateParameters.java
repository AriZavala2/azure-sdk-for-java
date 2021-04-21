// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Parameters supplied to the Update Event Source operation to update an IoTHub event source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Microsoft.IoTHub")
@JsonFlatten
@Fluent
public class IoTHubEventSourceUpdateParameters extends EventSourceUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IoTHubEventSourceUpdateParameters.class);

    /*
     * The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or
     * empty-string is specified, the event creation time will be used.
     */
    @JsonProperty(value = "properties.timestampPropertyName")
    private String timestampPropertyName;

    /*
     * An object that represents the local timestamp property. It contains the
     * format of local timestamp that needs to be used and the corresponding
     * timezone offset information. If a value isn't specified for
     * localTimestamp, or if null, then the local timestamp will not be
     * ingressed with the events.
     */
    @JsonProperty(value = "properties.localTimestamp")
    private LocalTimestamp localTimestamp;

    /*
     * The value of the shared access key that grants the Time Series Insights
     * service read access to the iot hub. This property is not shown in event
     * source responses.
     */
    @JsonProperty(value = "properties.sharedAccessKey")
    private String sharedAccessKey;

    /**
     * Get the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @return the timestampPropertyName value.
     */
    public String timestampPropertyName() {
        return this.timestampPropertyName;
    }

    /**
     * Set the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @param timestampPropertyName the timestampPropertyName value to set.
     * @return the IoTHubEventSourceUpdateParameters object itself.
     */
    public IoTHubEventSourceUpdateParameters withTimestampPropertyName(String timestampPropertyName) {
        this.timestampPropertyName = timestampPropertyName;
        return this;
    }

    /**
     * Get the localTimestamp property: An object that represents the local timestamp property. It contains the format
     * of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't
     * specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     *
     * @return the localTimestamp value.
     */
    public LocalTimestamp localTimestamp() {
        return this.localTimestamp;
    }

    /**
     * Set the localTimestamp property: An object that represents the local timestamp property. It contains the format
     * of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't
     * specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     *
     * @param localTimestamp the localTimestamp value to set.
     * @return the IoTHubEventSourceUpdateParameters object itself.
     */
    public IoTHubEventSourceUpdateParameters withLocalTimestamp(LocalTimestamp localTimestamp) {
        this.localTimestamp = localTimestamp;
        return this;
    }

    /**
     * Get the sharedAccessKey property: The value of the shared access key that grants the Time Series Insights service
     * read access to the iot hub. This property is not shown in event source responses.
     *
     * @return the sharedAccessKey value.
     */
    public String sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Set the sharedAccessKey property: The value of the shared access key that grants the Time Series Insights service
     * read access to the iot hub. This property is not shown in event source responses.
     *
     * @param sharedAccessKey the sharedAccessKey value to set.
     * @return the IoTHubEventSourceUpdateParameters object itself.
     */
    public IoTHubEventSourceUpdateParameters withSharedAccessKey(String sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (localTimestamp() != null) {
            localTimestamp().validate();
        }
    }
}