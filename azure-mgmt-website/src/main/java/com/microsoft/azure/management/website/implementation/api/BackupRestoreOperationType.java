/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for BackupRestoreOperationType.
 */
public enum BackupRestoreOperationType {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Clone. */
    CLONE("Clone"),

    /** Enum value Relocation. */
    RELOCATION("Relocation");

    /** The actual serialized value for a BackupRestoreOperationType instance. */
    private String value;

    BackupRestoreOperationType(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a BackupRestoreOperationType instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a BackupRestoreOperationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BackupRestoreOperationType object, or null if unable to parse.
     */
    @JsonCreator
    public static BackupRestoreOperationType fromValue(String value) {
        BackupRestoreOperationType[] items = BackupRestoreOperationType.values();
        for (BackupRestoreOperationType item : items) {
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
