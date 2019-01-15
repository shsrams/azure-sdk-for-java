/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Execute SSIS package activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecuteSSISPackage")
@JsonFlatten
public class ExecuteSSISPackageActivity extends ExecutionActivity {
    /**
     * SSIS package location.
     */
    @JsonProperty(value = "typeProperties.packageLocation", required = true)
    private SSISPackageLocation packageLocation;

    /**
     * Specifies the runtime to execute SSIS package. The value should be "x86"
     * or "x64". Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.runtime")
    private Object runtime;

    /**
     * The logging level of SSIS package execution. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.loggingLevel")
    private Object loggingLevel;

    /**
     * The environment path to execute the SSIS package. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.environmentPath")
    private Object environmentPath;

    /**
     * The package execution credential.
     */
    @JsonProperty(value = "typeProperties.executionCredential")
    private Map<String, SSISExecutionCredential> executionCredential;

    /**
     * The package execution credential.
     */
    @JsonProperty(value = "typeProperties.executionCredential")
    private Map<String, SSISExecutionCredential> executionCredential;

    /**
     * The integration runtime reference.
     */
    @JsonProperty(value = "typeProperties.connectVia", required = true)
    private IntegrationRuntimeReference connectVia;

    /**
     * The project level parameters to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.projectParameters")
    private Map<String, SSISExecutionParameter> projectParameters;

    /**
     * The package level parameters to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.packageParameters")
    private Map<String, SSISExecutionParameter> packageParameters;

    /**
     * The project level connection managers to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.projectConnectionManagers")
    private Map<String, Map<String, SSISExecutionParameter>> projectConnectionManagers;

    /**
     * The package level connection managers to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.packageConnectionManagers")
    private Map<String, Map<String, SSISExecutionParameter>> packageConnectionManagers;

    /**
     * The property overrides to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.propertyOverrides")
    private Map<String, SSISPropertyOverride> propertyOverrides;

    /**
     * Get sSIS package location.
     *
     * @return the packageLocation value
     */
    public SSISPackageLocation packageLocation() {
        return this.packageLocation;
    }

    /**
     * Set sSIS package location.
     *
     * @param packageLocation the packageLocation value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withPackageLocation(SSISPackageLocation packageLocation) {
        this.packageLocation = packageLocation;
        return this;
    }

    /**
     * Get specifies the runtime to execute SSIS package. The value should be "x86" or "x64". Type: string (or Expression with resultType string).
     *
     * @return the runtime value
     */
    public Object runtime() {
        return this.runtime;
    }

    /**
     * Set specifies the runtime to execute SSIS package. The value should be "x86" or "x64". Type: string (or Expression with resultType string).
     *
     * @param runtime the runtime value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withRuntime(Object runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * Get the logging level of SSIS package execution. Type: string (or Expression with resultType string).
     *
     * @return the loggingLevel value
     */
    public Object loggingLevel() {
        return this.loggingLevel;
    }

    /**
     * Set the logging level of SSIS package execution. Type: string (or Expression with resultType string).
     *
     * @param loggingLevel the loggingLevel value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withLoggingLevel(Object loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * Get the environment path to execute the SSIS package. Type: string (or Expression with resultType string).
     *
     * @return the environmentPath value
     */
    public Object environmentPath() {
        return this.environmentPath;
    }

    /**
     * Set the environment path to execute the SSIS package. Type: string (or Expression with resultType string).
     *
     * @param environmentPath the environmentPath value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withEnvironmentPath(Object environmentPath) {
        this.environmentPath = environmentPath;
        return this;
    }

    /**
     * Get the package execution credential.
     *
     * @return the executionCredential value
     */
    public Map<String, SSISExecutionCredential> executionCredential() {
        return this.executionCredential;
    }

    /**
     * Set the package execution credential.
     *
     * @param executionCredential the executionCredential value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withExecutionCredential(Map<String, SSISExecutionCredential> executionCredential) {
        this.executionCredential = executionCredential;
        return this;
    }

    /**
     * Get the integration runtime reference.
     *
     * @return the connectVia value
     */
    public IntegrationRuntimeReference connectVia() {
        return this.connectVia;
    }

    /**
     * Set the integration runtime reference.
     *
     * @param connectVia the connectVia value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withConnectVia(IntegrationRuntimeReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Get the project level parameters to execute the SSIS package.
     *
     * @return the projectParameters value
     */
    public Map<String, SSISExecutionParameter> projectParameters() {
        return this.projectParameters;
    }

    /**
     * Set the project level parameters to execute the SSIS package.
     *
     * @param projectParameters the projectParameters value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withProjectParameters(Map<String, SSISExecutionParameter> projectParameters) {
        this.projectParameters = projectParameters;
        return this;
    }

    /**
     * Get the package level parameters to execute the SSIS package.
     *
     * @return the packageParameters value
     */
    public Map<String, SSISExecutionParameter> packageParameters() {
        return this.packageParameters;
    }

    /**
     * Set the package level parameters to execute the SSIS package.
     *
     * @param packageParameters the packageParameters value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withPackageParameters(Map<String, SSISExecutionParameter> packageParameters) {
        this.packageParameters = packageParameters;
        return this;
    }

    /**
     * Get the project level connection managers to execute the SSIS package.
     *
     * @return the projectConnectionManagers value
     */
    public Map<String, Map<String, SSISExecutionParameter>> projectConnectionManagers() {
        return this.projectConnectionManagers;
    }

    /**
     * Set the project level connection managers to execute the SSIS package.
     *
     * @param projectConnectionManagers the projectConnectionManagers value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withProjectConnectionManagers(Map<String, Map<String, SSISExecutionParameter>> projectConnectionManagers) {
        this.projectConnectionManagers = projectConnectionManagers;
        return this;
    }

    /**
     * Get the package level connection managers to execute the SSIS package.
     *
     * @return the packageConnectionManagers value
     */
    public Map<String, Map<String, SSISExecutionParameter>> packageConnectionManagers() {
        return this.packageConnectionManagers;
    }

    /**
     * Set the package level connection managers to execute the SSIS package.
     *
     * @param packageConnectionManagers the packageConnectionManagers value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withPackageConnectionManagers(Map<String, Map<String, SSISExecutionParameter>> packageConnectionManagers) {
        this.packageConnectionManagers = packageConnectionManagers;
        return this;
    }

    /**
     * Get the property overrides to execute the SSIS package.
     *
     * @return the propertyOverrides value
     */
    public Map<String, SSISPropertyOverride> propertyOverrides() {
        return this.propertyOverrides;
    }

    /**
     * Set the property overrides to execute the SSIS package.
     *
     * @param propertyOverrides the propertyOverrides value to set
     * @return the ExecuteSSISPackageActivity object itself.
     */
    public ExecuteSSISPackageActivity withPropertyOverrides(Map<String, SSISPropertyOverride> propertyOverrides) {
        this.propertyOverrides = propertyOverrides;
        return this;
    }

}
