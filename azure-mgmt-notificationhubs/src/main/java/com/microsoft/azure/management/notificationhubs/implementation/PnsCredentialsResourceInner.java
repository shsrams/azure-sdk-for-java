/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.implementation;

import com.microsoft.azure.management.notificationhubs.ApnsCredential;
import com.microsoft.azure.management.notificationhubs.WnsCredential;
import com.microsoft.azure.management.notificationhubs.GcmCredential;
import com.microsoft.azure.management.notificationhubs.MpnsCredential;
import com.microsoft.azure.management.notificationhubs.AdmCredential;
import com.microsoft.azure.management.notificationhubs.BaiduCredential;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of a NotificationHub PNS Credentials.
 */
@JsonFlatten
public class PnsCredentialsResourceInner extends Resource {
    /**
     * The ApnsCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.apnsCredential")
    private ApnsCredential apnsCredential;

    /**
     * The WnsCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.wnsCredential")
    private WnsCredential wnsCredential;

    /**
     * The GcmCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.gcmCredential")
    private GcmCredential gcmCredential;

    /**
     * The MpnsCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.mpnsCredential")
    private MpnsCredential mpnsCredential;

    /**
     * The AdmCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.admCredential")
    private AdmCredential admCredential;

    /**
     * The BaiduCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.baiduCredential")
    private BaiduCredential baiduCredential;

    /**
     * Get the apnsCredential value.
     *
     * @return the apnsCredential value
     */
    public ApnsCredential apnsCredential() {
        return this.apnsCredential;
    }

    /**
     * Set the apnsCredential value.
     *
     * @param apnsCredential the apnsCredential value to set
     * @return the PnsCredentialsResourceInner object itself.
     */
    public PnsCredentialsResourceInner withApnsCredential(ApnsCredential apnsCredential) {
        this.apnsCredential = apnsCredential;
        return this;
    }

    /**
     * Get the wnsCredential value.
     *
     * @return the wnsCredential value
     */
    public WnsCredential wnsCredential() {
        return this.wnsCredential;
    }

    /**
     * Set the wnsCredential value.
     *
     * @param wnsCredential the wnsCredential value to set
     * @return the PnsCredentialsResourceInner object itself.
     */
    public PnsCredentialsResourceInner withWnsCredential(WnsCredential wnsCredential) {
        this.wnsCredential = wnsCredential;
        return this;
    }

    /**
     * Get the gcmCredential value.
     *
     * @return the gcmCredential value
     */
    public GcmCredential gcmCredential() {
        return this.gcmCredential;
    }

    /**
     * Set the gcmCredential value.
     *
     * @param gcmCredential the gcmCredential value to set
     * @return the PnsCredentialsResourceInner object itself.
     */
    public PnsCredentialsResourceInner withGcmCredential(GcmCredential gcmCredential) {
        this.gcmCredential = gcmCredential;
        return this;
    }

    /**
     * Get the mpnsCredential value.
     *
     * @return the mpnsCredential value
     */
    public MpnsCredential mpnsCredential() {
        return this.mpnsCredential;
    }

    /**
     * Set the mpnsCredential value.
     *
     * @param mpnsCredential the mpnsCredential value to set
     * @return the PnsCredentialsResourceInner object itself.
     */
    public PnsCredentialsResourceInner withMpnsCredential(MpnsCredential mpnsCredential) {
        this.mpnsCredential = mpnsCredential;
        return this;
    }

    /**
     * Get the admCredential value.
     *
     * @return the admCredential value
     */
    public AdmCredential admCredential() {
        return this.admCredential;
    }

    /**
     * Set the admCredential value.
     *
     * @param admCredential the admCredential value to set
     * @return the PnsCredentialsResourceInner object itself.
     */
    public PnsCredentialsResourceInner withAdmCredential(AdmCredential admCredential) {
        this.admCredential = admCredential;
        return this;
    }

    /**
     * Get the baiduCredential value.
     *
     * @return the baiduCredential value
     */
    public BaiduCredential baiduCredential() {
        return this.baiduCredential;
    }

    /**
     * Set the baiduCredential value.
     *
     * @param baiduCredential the baiduCredential value to set
     * @return the PnsCredentialsResourceInner object itself.
     */
    public PnsCredentialsResourceInner withBaiduCredential(BaiduCredential baiduCredential) {
        this.baiduCredential = baiduCredential;
        return this;
    }

}