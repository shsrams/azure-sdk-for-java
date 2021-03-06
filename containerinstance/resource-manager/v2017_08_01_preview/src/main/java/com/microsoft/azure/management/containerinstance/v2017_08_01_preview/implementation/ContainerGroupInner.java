/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_08_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.Container;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.ImageRegistryCredential;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.ContainerRestartPolicy;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.IpAddress;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.OperatingSystemTypes;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.Volume;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A container group.
 */
@JsonFlatten
public class ContainerGroupInner extends Resource {
    /**
     * The provisioning state of the container group. This only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The containers within the container group.
     */
    @JsonProperty(value = "properties.containers", required = true)
    private List<Container> containers;

    /**
     * The image registry credentials by which the container group is created
     * from.
     */
    @JsonProperty(value = "properties.imageRegistryCredentials")
    private List<ImageRegistryCredential> imageRegistryCredentials;

    /**
     * Restart policy for all containers within the container group. Currently
     * the only available option is `always`. Possible values include:
     * 'always'.
     */
    @JsonProperty(value = "properties.restartPolicy")
    private ContainerRestartPolicy restartPolicy;

    /**
     * The IP address type of the container group.
     */
    @JsonProperty(value = "properties.ipAddress")
    private IpAddress ipAddress;

    /**
     * The operating system type required by the containers in the container
     * group. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType", required = true)
    private OperatingSystemTypes osType;

    /**
     * The current state of the container group. This is only valid for the
     * response.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * The list of volumes that can be mounted by containers in this container
     * group.
     */
    @JsonProperty(value = "properties.volumes")
    private List<Volume> volumes;

    /**
     * Get the provisioning state of the container group. This only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the containers within the container group.
     *
     * @return the containers value
     */
    public List<Container> containers() {
        return this.containers;
    }

    /**
     * Set the containers within the container group.
     *
     * @param containers the containers value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withContainers(List<Container> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Get the image registry credentials by which the container group is created from.
     *
     * @return the imageRegistryCredentials value
     */
    public List<ImageRegistryCredential> imageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    /**
     * Set the image registry credentials by which the container group is created from.
     *
     * @param imageRegistryCredentials the imageRegistryCredentials value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        return this;
    }

    /**
     * Get restart policy for all containers within the container group. Currently the only available option is `always`. Possible values include: 'always'.
     *
     * @return the restartPolicy value
     */
    public ContainerRestartPolicy restartPolicy() {
        return this.restartPolicy;
    }

    /**
     * Set restart policy for all containers within the container group. Currently the only available option is `always`. Possible values include: 'always'.
     *
     * @param restartPolicy the restartPolicy value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withRestartPolicy(ContainerRestartPolicy restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * Get the IP address type of the container group.
     *
     * @return the ipAddress value
     */
    public IpAddress ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address type of the container group.
     *
     * @param ipAddress the ipAddress value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withIpAddress(IpAddress ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the operating system type required by the containers in the container group. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the operating system type required by the containers in the container group. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the current state of the container group. This is only valid for the response.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the list of volumes that can be mounted by containers in this container group.
     *
     * @return the volumes value
     */
    public List<Volume> volumes() {
        return this.volumes;
    }

    /**
     * Set the list of volumes that can be mounted by containers in this container group.
     *
     * @param volumes the volumes value to set
     * @return the ContainerGroupInner object itself.
     */
    public ContainerGroupInner withVolumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

}
