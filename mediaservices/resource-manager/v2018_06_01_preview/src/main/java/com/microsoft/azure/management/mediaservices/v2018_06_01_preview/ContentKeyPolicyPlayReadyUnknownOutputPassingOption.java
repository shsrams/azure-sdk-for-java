/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ContentKeyPolicyPlayReadyUnknownOutputPassingOption.
 */
public enum ContentKeyPolicyPlayReadyUnknownOutputPassingOption {
    /** Represents a ContentKeyPolicyPlayReadyUnknownOutputPassingOption that is unavailable in current API version. */
    UNKNOWN("Unknown"),

    /** Passing the video portion of protected content to an Unknown Output is not allowed. */
    NOT_ALLOWED("NotAllowed"),

    /** Passing the video portion of protected content to an Unknown Output is allowed. */
    ALLOWED("Allowed"),

    /** Passing the video portion of protected content to an Unknown Output is allowed but with constrained resolution. */
    ALLOWED_WITH_VIDEO_CONSTRICTION("AllowedWithVideoConstriction");

    /** The actual serialized value for a ContentKeyPolicyPlayReadyUnknownOutputPassingOption instance. */
    private String value;

    ContentKeyPolicyPlayReadyUnknownOutputPassingOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ContentKeyPolicyPlayReadyUnknownOutputPassingOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ContentKeyPolicyPlayReadyUnknownOutputPassingOption object, or null if unable to parse.
     */
    @JsonCreator
    public static ContentKeyPolicyPlayReadyUnknownOutputPassingOption fromString(String value) {
        ContentKeyPolicyPlayReadyUnknownOutputPassingOption[] items = ContentKeyPolicyPlayReadyUnknownOutputPassingOption.values();
        for (ContentKeyPolicyPlayReadyUnknownOutputPassingOption item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}