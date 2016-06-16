/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DisableJobOption.
 */
public enum DisableJobOption {
    /** Enum value requeue. */
    REQUEUE("requeue"),

    /** Enum value terminate. */
    TERMINATE("terminate"),

    /** Enum value wait. */
    WAIT("wait");

    /** The actual serialized value for a DisableJobOption instance. */
    private String value;

    DisableJobOption(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a DisableJobOption instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a DisableJobOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DisableJobOption object, or null if unable to parse.
     */
    @JsonCreator
    public static DisableJobOption fromValue(String value) {
        DisableJobOption[] items = DisableJobOption.values();
        for (DisableJobOption item : items) {
            if (item.toValue().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}
