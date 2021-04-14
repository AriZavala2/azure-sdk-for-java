// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChargeSummaryKind. */
public final class ChargeSummaryKind extends ExpandableStringEnum<ChargeSummaryKind> {
    /** Static value legacy for ChargeSummaryKind. */
    public static final ChargeSummaryKind LEGACY = fromString("legacy");

    /** Static value modern for ChargeSummaryKind. */
    public static final ChargeSummaryKind MODERN = fromString("modern");

    /**
     * Creates or finds a ChargeSummaryKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChargeSummaryKind.
     */
    @JsonCreator
    public static ChargeSummaryKind fromString(String name) {
        return fromString(name, ChargeSummaryKind.class);
    }

    /** @return known ChargeSummaryKind values. */
    public static Collection<ChargeSummaryKind> values() {
        return values(ChargeSummaryKind.class);
    }
}