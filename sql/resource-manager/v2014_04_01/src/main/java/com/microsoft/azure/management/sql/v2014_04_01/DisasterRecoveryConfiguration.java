/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.DisasterRecoveryConfigurationInner;

/**
 * Type representing DisasterRecoveryConfiguration.
 */
public interface DisasterRecoveryConfiguration extends HasInner<DisasterRecoveryConfigurationInner>, HasManager<SqlManager> {
    /**
     * @return the autoFailover value.
     */
    DisasterRecoveryConfigurationAutoFailover autoFailover();

    /**
     * @return the failoverPolicy value.
     */
    DisasterRecoveryConfigurationFailoverPolicy failoverPolicy();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the logicalServerName value.
     */
    String logicalServerName();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the partnerLogicalServerName value.
     */
    String partnerLogicalServerName();

    /**
     * @return the partnerServerId value.
     */
    String partnerServerId();

    /**
     * @return the role value.
     */
    DisasterRecoveryConfigurationRole role();

    /**
     * @return the status value.
     */
    DisasterRecoveryConfigurationStatus status();

    /**
     * @return the type value.
     */
    String type();

}
