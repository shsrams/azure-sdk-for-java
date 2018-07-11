/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.ContentKeyPolicyOption;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the Content Key Policy.
 */
public class ContentKeyPolicyPropertiesInner {
    /**
     * The legacy Policy ID.
     */
    @JsonProperty(value = "policyId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID policyId;

    /**
     * The creation date of the Policy.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The last modified date of the Policy.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * A description for the Policy.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The Key Policy options.
     */
    @JsonProperty(value = "options", required = true)
    private List<ContentKeyPolicyOption> options;

    /**
     * Get the legacy Policy ID.
     *
     * @return the policyId value
     */
    public UUID policyId() {
        return this.policyId;
    }

    /**
     * Get the creation date of the Policy.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the last modified date of the Policy.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get a description for the Policy.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set a description for the Policy.
     *
     * @param description the description value to set
     * @return the ContentKeyPolicyPropertiesInner object itself.
     */
    public ContentKeyPolicyPropertiesInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the Key Policy options.
     *
     * @return the options value
     */
    public List<ContentKeyPolicyOption> options() {
        return this.options;
    }

    /**
     * Set the Key Policy options.
     *
     * @param options the options value to set
     * @return the ContentKeyPolicyPropertiesInner object itself.
     */
    public ContentKeyPolicyPropertiesInner withOptions(List<ContentKeyPolicyOption> options) {
        this.options = options;
        return this;
    }

}