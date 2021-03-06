/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to specify configurations of PlayReady in Streaming Policy.
 */
public class StreamingPolicyPlayReadyConfiguration {
    /**
     * The template for a customer service to deliver keys to end users.  Not
     * needed when using Azure Media Services for issuing keys.
     */
    @JsonProperty(value = "customLicenseAcquisitionUrlTemplate")
    private String customLicenseAcquisitionUrlTemplate;

    /**
     * Custom attributes for PlayReady.
     */
    @JsonProperty(value = "playReadyCustomAttributes")
    private String playReadyCustomAttributes;

    /**
     * Get the template for a customer service to deliver keys to end users.  Not needed when using Azure Media Services for issuing keys.
     *
     * @return the customLicenseAcquisitionUrlTemplate value
     */
    public String customLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate;
    }

    /**
     * Set the template for a customer service to deliver keys to end users.  Not needed when using Azure Media Services for issuing keys.
     *
     * @param customLicenseAcquisitionUrlTemplate the customLicenseAcquisitionUrlTemplate value to set
     * @return the StreamingPolicyPlayReadyConfiguration object itself.
     */
    public StreamingPolicyPlayReadyConfiguration withCustomLicenseAcquisitionUrlTemplate(String customLicenseAcquisitionUrlTemplate) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        return this;
    }

    /**
     * Get custom attributes for PlayReady.
     *
     * @return the playReadyCustomAttributes value
     */
    public String playReadyCustomAttributes() {
        return this.playReadyCustomAttributes;
    }

    /**
     * Set custom attributes for PlayReady.
     *
     * @param playReadyCustomAttributes the playReadyCustomAttributes value to set
     * @return the StreamingPolicyPlayReadyConfiguration object itself.
     */
    public StreamingPolicyPlayReadyConfiguration withPlayReadyCustomAttributes(String playReadyCustomAttributes) {
        this.playReadyCustomAttributes = playReadyCustomAttributes;
        return this;
    }

}
