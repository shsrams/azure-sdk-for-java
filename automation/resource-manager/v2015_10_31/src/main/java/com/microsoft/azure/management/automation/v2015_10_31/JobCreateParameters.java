/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters supplied to the create job operation.
 */
@JsonFlatten
public class JobCreateParameters {
    /**
     * Gets or sets the runbook.
     */
    @JsonProperty(value = "properties.runbook", required = true)
    private RunbookAssociationProperty runbook;

    /**
     * Gets or sets the parameters of the job.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, String> parameters;

    /**
     * Gets or sets the runOn which specifies the group name where the job is
     * to be executed.
     */
    @JsonProperty(value = "properties.runOn")
    private String runOn;

    /**
     * Get gets or sets the runbook.
     *
     * @return the runbook value
     */
    public RunbookAssociationProperty runbook() {
        return this.runbook;
    }

    /**
     * Set gets or sets the runbook.
     *
     * @param runbook the runbook value to set
     * @return the JobCreateParameters object itself.
     */
    public JobCreateParameters withRunbook(RunbookAssociationProperty runbook) {
        this.runbook = runbook;
        return this;
    }

    /**
     * Get gets or sets the parameters of the job.
     *
     * @return the parameters value
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the parameters of the job.
     *
     * @param parameters the parameters value to set
     * @return the JobCreateParameters object itself.
     */
    public JobCreateParameters withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @return the runOn value
     */
    public String runOn() {
        return this.runOn;
    }

    /**
     * Set gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @param runOn the runOn value to set
     * @return the JobCreateParameters object itself.
     */
    public JobCreateParameters withRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }

}
