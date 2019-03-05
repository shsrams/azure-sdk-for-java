/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import java.util.List;
import com.microsoft.azure.graphrbac.AppRole;
import com.microsoft.azure.graphrbac.InformationalUrl;
import com.microsoft.azure.graphrbac.OAuth2Permission;
import com.microsoft.azure.graphrbac.OptionalClaims;
import com.microsoft.azure.graphrbac.PreAuthorizedApplication;
import com.microsoft.azure.graphrbac.RequiredResourceAccess;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Active Directory application information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("Application")
public class ApplicationInner extends DirectoryObjectInner {
    /**
     * The application ID.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /**
     * A property on the application to indicate if the application accepts
     * other IDPs or not or partially accepts.
     */
    @JsonProperty(value = "allowGuestsSignIn")
    private Boolean allowGuestsSignIn;

    /**
     * Indicates that the application supports pass through users who have no
     * presence in the resource tenant.
     */
    @JsonProperty(value = "allowPassthroughUsers")
    private Boolean allowPassthroughUsers;

    /**
     * The url for the application logo image stored in a CDN.
     */
    @JsonProperty(value = "appLogoUrl")
    private String appLogoUrl;

    /**
     * The collection of application roles that an application may declare.
     * These roles can be assigned to users, groups or service principals.
     */
    @JsonProperty(value = "appRoles")
    private List<AppRole> appRoles;

    /**
     * The application permissions.
     */
    @JsonProperty(value = "appPermissions")
    private List<String> appPermissions;

    /**
     * Whether the application is available to other tenants.
     */
    @JsonProperty(value = "availableToOtherTenants")
    private Boolean availableToOtherTenants;

    /**
     * The display name of the application.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * A URL provided by the author of the application to report errors when
     * using the application.
     */
    @JsonProperty(value = "errorUrl")
    private String errorUrl;

    /**
     * The home page of the application.
     */
    @JsonProperty(value = "homepage")
    private String homepage;

    /**
     * A collection of URIs for the application.
     */
    @JsonProperty(value = "identifierUris")
    private List<String> identifierUris;

    /**
     * urls with more informations of the application.
     */
    @JsonProperty(value = "informationalUrls")
    private InformationalUrl informationalUrls;

    /**
     * Specifies whether this application supports device authentication
     * without a user. The default is false.
     */
    @JsonProperty(value = "isDeviceOnlyAuthSupported")
    private Boolean isDeviceOnlyAuthSupported;

    /**
     * A collection of KeyCredential objects.
     */
    @JsonProperty(value = "keyCredentials")
    private List<KeyCredentialInner> keyCredentials;

    /**
     * Client applications that are tied to this resource application. Consent
     * to any of the known client applications will result in implicit consent
     * to the resource application through a combined consent dialog (showing
     * the OAuth permission scopes required by the client and the resource).
     */
    @JsonProperty(value = "knownClientApplications")
    private List<String> knownClientApplications;

    /**
     * the url of the logout page.
     */
    @JsonProperty(value = "logoutUrl")
    private String logoutUrl;

    /**
     * Whether to allow implicit grant flow for OAuth2.
     */
    @JsonProperty(value = "oauth2AllowImplicitFlow")
    private Boolean oauth2AllowImplicitFlow;

    /**
     * Specifies whether during a token Request Azure AD will allow path
     * matching of the redirect URI against the applications collection of
     * replyURLs. The default is false.
     */
    @JsonProperty(value = "oauth2AllowUrlPathMatching")
    private Boolean oauth2AllowUrlPathMatching;

    /**
     * The collection of OAuth 2.0 permission scopes that the web API
     * (resource) application exposes to client applications. These permission
     * scopes may be granted to client applications during consent.
     */
    @JsonProperty(value = "oauth2Permissions")
    private List<OAuth2Permission> oauth2Permissions;

    /**
     * Specifies whether, as part of OAuth 2.0 token requests, Azure AD will
     * allow POST requests, as opposed to GET requests. The default is false,
     * which specifies that only GET requests will be allowed.
     */
    @JsonProperty(value = "oauth2RequirePostResponse")
    private Boolean oauth2RequirePostResponse;

    /**
     * A list of tenants allowed to access application.
     */
    @JsonProperty(value = "orgRestrictions")
    private List<String> orgRestrictions;

    /**
     * The optionalClaims property.
     */
    @JsonProperty(value = "optionalClaims")
    private OptionalClaims optionalClaims;

    /**
     * A collection of PasswordCredential objects.
     */
    @JsonProperty(value = "passwordCredentials")
    private List<PasswordCredentialInner> passwordCredentials;

    /**
     * list of pre-authorizaed applications.
     */
    @JsonProperty(value = "preAuthorizedApplications")
    private List<PreAuthorizedApplication> preAuthorizedApplications;

    /**
     * Specifies whether this application is a public client (such as an
     * installed application running on a mobile device). Default is false.
     */
    @JsonProperty(value = "publicClient")
    private Boolean publicClient;

    /**
     * Reliable domain which can be used to identify an application.
     */
    @JsonProperty(value = "publisherDomain")
    private String publisherDomain;

    /**
     * A collection of reply URLs for the application.
     */
    @JsonProperty(value = "replyUrls")
    private List<String> replyUrls;

    /**
     * Specifies resources that this application requires access to and the set
     * of OAuth permission scopes and application roles that it needs under
     * each of those resources. This pre-configuration of required resource
     * access drives the consent experience.
     */
    @JsonProperty(value = "requiredResourceAccess")
    private List<RequiredResourceAccess> requiredResourceAccess;

    /**
     * The URL to the SAML metadata for the application.
     */
    @JsonProperty(value = "samlMetadataUrl")
    private String samlMetadataUrl;

    /**
     * Audience for signing in to the application (AzureADMyOrganizatio,
     * AzureADAllorganizations, AzureADAndMicrosofAccounts).
     */
    @JsonProperty(value = "signInAudience")
    private String signInAudience;

    /**
     * The primary Web page.
     */
    @JsonProperty(value = "wwwHomepage")
    private String wwwHomepage;

    /**
     * Get the application ID.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the application ID.
     *
     * @param appId the appId value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get a property on the application to indicate if the application accepts other IDPs or not or partially accepts.
     *
     * @return the allowGuestsSignIn value
     */
    public Boolean allowGuestsSignIn() {
        return this.allowGuestsSignIn;
    }

    /**
     * Set a property on the application to indicate if the application accepts other IDPs or not or partially accepts.
     *
     * @param allowGuestsSignIn the allowGuestsSignIn value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAllowGuestsSignIn(Boolean allowGuestsSignIn) {
        this.allowGuestsSignIn = allowGuestsSignIn;
        return this;
    }

    /**
     * Get indicates that the application supports pass through users who have no presence in the resource tenant.
     *
     * @return the allowPassthroughUsers value
     */
    public Boolean allowPassthroughUsers() {
        return this.allowPassthroughUsers;
    }

    /**
     * Set indicates that the application supports pass through users who have no presence in the resource tenant.
     *
     * @param allowPassthroughUsers the allowPassthroughUsers value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAllowPassthroughUsers(Boolean allowPassthroughUsers) {
        this.allowPassthroughUsers = allowPassthroughUsers;
        return this;
    }

    /**
     * Get the url for the application logo image stored in a CDN.
     *
     * @return the appLogoUrl value
     */
    public String appLogoUrl() {
        return this.appLogoUrl;
    }

    /**
     * Set the url for the application logo image stored in a CDN.
     *
     * @param appLogoUrl the appLogoUrl value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAppLogoUrl(String appLogoUrl) {
        this.appLogoUrl = appLogoUrl;
        return this;
    }

    /**
     * Get the collection of application roles that an application may declare. These roles can be assigned to users, groups or service principals.
     *
     * @return the appRoles value
     */
    public List<AppRole> appRoles() {
        return this.appRoles;
    }

    /**
     * Set the collection of application roles that an application may declare. These roles can be assigned to users, groups or service principals.
     *
     * @param appRoles the appRoles value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAppRoles(List<AppRole> appRoles) {
        this.appRoles = appRoles;
        return this;
    }

    /**
     * Get the application permissions.
     *
     * @return the appPermissions value
     */
    public List<String> appPermissions() {
        return this.appPermissions;
    }

    /**
     * Set the application permissions.
     *
     * @param appPermissions the appPermissions value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAppPermissions(List<String> appPermissions) {
        this.appPermissions = appPermissions;
        return this;
    }

    /**
     * Get whether the application is available to other tenants.
     *
     * @return the availableToOtherTenants value
     */
    public Boolean availableToOtherTenants() {
        return this.availableToOtherTenants;
    }

    /**
     * Set whether the application is available to other tenants.
     *
     * @param availableToOtherTenants the availableToOtherTenants value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAvailableToOtherTenants(Boolean availableToOtherTenants) {
        this.availableToOtherTenants = availableToOtherTenants;
        return this;
    }

    /**
     * Get the display name of the application.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the application.
     *
     * @param displayName the displayName value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get a URL provided by the author of the application to report errors when using the application.
     *
     * @return the errorUrl value
     */
    public String errorUrl() {
        return this.errorUrl;
    }

    /**
     * Set a URL provided by the author of the application to report errors when using the application.
     *
     * @param errorUrl the errorUrl value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
        return this;
    }

    /**
     * Get the home page of the application.
     *
     * @return the homepage value
     */
    public String homepage() {
        return this.homepage;
    }

    /**
     * Set the home page of the application.
     *
     * @param homepage the homepage value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Get a collection of URIs for the application.
     *
     * @return the identifierUris value
     */
    public List<String> identifierUris() {
        return this.identifierUris;
    }

    /**
     * Set a collection of URIs for the application.
     *
     * @param identifierUris the identifierUris value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withIdentifierUris(List<String> identifierUris) {
        this.identifierUris = identifierUris;
        return this;
    }

    /**
     * Get urls with more informations of the application.
     *
     * @return the informationalUrls value
     */
    public InformationalUrl informationalUrls() {
        return this.informationalUrls;
    }

    /**
     * Set urls with more informations of the application.
     *
     * @param informationalUrls the informationalUrls value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withInformationalUrls(InformationalUrl informationalUrls) {
        this.informationalUrls = informationalUrls;
        return this;
    }

    /**
     * Get specifies whether this application supports device authentication without a user. The default is false.
     *
     * @return the isDeviceOnlyAuthSupported value
     */
    public Boolean isDeviceOnlyAuthSupported() {
        return this.isDeviceOnlyAuthSupported;
    }

    /**
     * Set specifies whether this application supports device authentication without a user. The default is false.
     *
     * @param isDeviceOnlyAuthSupported the isDeviceOnlyAuthSupported value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withIsDeviceOnlyAuthSupported(Boolean isDeviceOnlyAuthSupported) {
        this.isDeviceOnlyAuthSupported = isDeviceOnlyAuthSupported;
        return this;
    }

    /**
     * Get a collection of KeyCredential objects.
     *
     * @return the keyCredentials value
     */
    public List<KeyCredentialInner> keyCredentials() {
        return this.keyCredentials;
    }

    /**
     * Set a collection of KeyCredential objects.
     *
     * @param keyCredentials the keyCredentials value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withKeyCredentials(List<KeyCredentialInner> keyCredentials) {
        this.keyCredentials = keyCredentials;
        return this;
    }

    /**
     * Get client applications that are tied to this resource application. Consent to any of the known client applications will result in implicit consent to the resource application through a combined consent dialog (showing the OAuth permission scopes required by the client and the resource).
     *
     * @return the knownClientApplications value
     */
    public List<String> knownClientApplications() {
        return this.knownClientApplications;
    }

    /**
     * Set client applications that are tied to this resource application. Consent to any of the known client applications will result in implicit consent to the resource application through a combined consent dialog (showing the OAuth permission scopes required by the client and the resource).
     *
     * @param knownClientApplications the knownClientApplications value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withKnownClientApplications(List<String> knownClientApplications) {
        this.knownClientApplications = knownClientApplications;
        return this;
    }

    /**
     * Get the url of the logout page.
     *
     * @return the logoutUrl value
     */
    public String logoutUrl() {
        return this.logoutUrl;
    }

    /**
     * Set the url of the logout page.
     *
     * @param logoutUrl the logoutUrl value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
        return this;
    }

    /**
     * Get whether to allow implicit grant flow for OAuth2.
     *
     * @return the oauth2AllowImplicitFlow value
     */
    public Boolean oauth2AllowImplicitFlow() {
        return this.oauth2AllowImplicitFlow;
    }

    /**
     * Set whether to allow implicit grant flow for OAuth2.
     *
     * @param oauth2AllowImplicitFlow the oauth2AllowImplicitFlow value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withOauth2AllowImplicitFlow(Boolean oauth2AllowImplicitFlow) {
        this.oauth2AllowImplicitFlow = oauth2AllowImplicitFlow;
        return this;
    }

    /**
     * Get specifies whether during a token Request Azure AD will allow path matching of the redirect URI against the applications collection of replyURLs. The default is false.
     *
     * @return the oauth2AllowUrlPathMatching value
     */
    public Boolean oauth2AllowUrlPathMatching() {
        return this.oauth2AllowUrlPathMatching;
    }

    /**
     * Set specifies whether during a token Request Azure AD will allow path matching of the redirect URI against the applications collection of replyURLs. The default is false.
     *
     * @param oauth2AllowUrlPathMatching the oauth2AllowUrlPathMatching value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withOauth2AllowUrlPathMatching(Boolean oauth2AllowUrlPathMatching) {
        this.oauth2AllowUrlPathMatching = oauth2AllowUrlPathMatching;
        return this;
    }

    /**
     * Get the collection of OAuth 2.0 permission scopes that the web API (resource) application exposes to client applications. These permission scopes may be granted to client applications during consent.
     *
     * @return the oauth2Permissions value
     */
    public List<OAuth2Permission> oauth2Permissions() {
        return this.oauth2Permissions;
    }

    /**
     * Set the collection of OAuth 2.0 permission scopes that the web API (resource) application exposes to client applications. These permission scopes may be granted to client applications during consent.
     *
     * @param oauth2Permissions the oauth2Permissions value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withOauth2Permissions(List<OAuth2Permission> oauth2Permissions) {
        this.oauth2Permissions = oauth2Permissions;
        return this;
    }

    /**
     * Get specifies whether, as part of OAuth 2.0 token requests, Azure AD will allow POST requests, as opposed to GET requests. The default is false, which specifies that only GET requests will be allowed.
     *
     * @return the oauth2RequirePostResponse value
     */
    public Boolean oauth2RequirePostResponse() {
        return this.oauth2RequirePostResponse;
    }

    /**
     * Set specifies whether, as part of OAuth 2.0 token requests, Azure AD will allow POST requests, as opposed to GET requests. The default is false, which specifies that only GET requests will be allowed.
     *
     * @param oauth2RequirePostResponse the oauth2RequirePostResponse value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withOauth2RequirePostResponse(Boolean oauth2RequirePostResponse) {
        this.oauth2RequirePostResponse = oauth2RequirePostResponse;
        return this;
    }

    /**
     * Get a list of tenants allowed to access application.
     *
     * @return the orgRestrictions value
     */
    public List<String> orgRestrictions() {
        return this.orgRestrictions;
    }

    /**
     * Set a list of tenants allowed to access application.
     *
     * @param orgRestrictions the orgRestrictions value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withOrgRestrictions(List<String> orgRestrictions) {
        this.orgRestrictions = orgRestrictions;
        return this;
    }

    /**
     * Get the optionalClaims value.
     *
     * @return the optionalClaims value
     */
    public OptionalClaims optionalClaims() {
        return this.optionalClaims;
    }

    /**
     * Set the optionalClaims value.
     *
     * @param optionalClaims the optionalClaims value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withOptionalClaims(OptionalClaims optionalClaims) {
        this.optionalClaims = optionalClaims;
        return this;
    }

    /**
     * Get a collection of PasswordCredential objects.
     *
     * @return the passwordCredentials value
     */
    public List<PasswordCredentialInner> passwordCredentials() {
        return this.passwordCredentials;
    }

    /**
     * Set a collection of PasswordCredential objects.
     *
     * @param passwordCredentials the passwordCredentials value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withPasswordCredentials(List<PasswordCredentialInner> passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
        return this;
    }

    /**
     * Get list of pre-authorizaed applications.
     *
     * @return the preAuthorizedApplications value
     */
    public List<PreAuthorizedApplication> preAuthorizedApplications() {
        return this.preAuthorizedApplications;
    }

    /**
     * Set list of pre-authorizaed applications.
     *
     * @param preAuthorizedApplications the preAuthorizedApplications value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withPreAuthorizedApplications(List<PreAuthorizedApplication> preAuthorizedApplications) {
        this.preAuthorizedApplications = preAuthorizedApplications;
        return this;
    }

    /**
     * Get specifies whether this application is a public client (such as an installed application running on a mobile device). Default is false.
     *
     * @return the publicClient value
     */
    public Boolean publicClient() {
        return this.publicClient;
    }

    /**
     * Set specifies whether this application is a public client (such as an installed application running on a mobile device). Default is false.
     *
     * @param publicClient the publicClient value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withPublicClient(Boolean publicClient) {
        this.publicClient = publicClient;
        return this;
    }

    /**
     * Get reliable domain which can be used to identify an application.
     *
     * @return the publisherDomain value
     */
    public String publisherDomain() {
        return this.publisherDomain;
    }

    /**
     * Set reliable domain which can be used to identify an application.
     *
     * @param publisherDomain the publisherDomain value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withPublisherDomain(String publisherDomain) {
        this.publisherDomain = publisherDomain;
        return this;
    }

    /**
     * Get a collection of reply URLs for the application.
     *
     * @return the replyUrls value
     */
    public List<String> replyUrls() {
        return this.replyUrls;
    }

    /**
     * Set a collection of reply URLs for the application.
     *
     * @param replyUrls the replyUrls value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withReplyUrls(List<String> replyUrls) {
        this.replyUrls = replyUrls;
        return this;
    }

    /**
     * Get specifies resources that this application requires access to and the set of OAuth permission scopes and application roles that it needs under each of those resources. This pre-configuration of required resource access drives the consent experience.
     *
     * @return the requiredResourceAccess value
     */
    public List<RequiredResourceAccess> requiredResourceAccess() {
        return this.requiredResourceAccess;
    }

    /**
     * Set specifies resources that this application requires access to and the set of OAuth permission scopes and application roles that it needs under each of those resources. This pre-configuration of required resource access drives the consent experience.
     *
     * @param requiredResourceAccess the requiredResourceAccess value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withRequiredResourceAccess(List<RequiredResourceAccess> requiredResourceAccess) {
        this.requiredResourceAccess = requiredResourceAccess;
        return this;
    }

    /**
     * Get the URL to the SAML metadata for the application.
     *
     * @return the samlMetadataUrl value
     */
    public String samlMetadataUrl() {
        return this.samlMetadataUrl;
    }

    /**
     * Set the URL to the SAML metadata for the application.
     *
     * @param samlMetadataUrl the samlMetadataUrl value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withSamlMetadataUrl(String samlMetadataUrl) {
        this.samlMetadataUrl = samlMetadataUrl;
        return this;
    }

    /**
     * Get audience for signing in to the application (AzureADMyOrganizatio, AzureADAllorganizations, AzureADAndMicrosofAccounts).
     *
     * @return the signInAudience value
     */
    public String signInAudience() {
        return this.signInAudience;
    }

    /**
     * Set audience for signing in to the application (AzureADMyOrganizatio, AzureADAllorganizations, AzureADAndMicrosofAccounts).
     *
     * @param signInAudience the signInAudience value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withSignInAudience(String signInAudience) {
        this.signInAudience = signInAudience;
        return this;
    }

    /**
     * Get the primary Web page.
     *
     * @return the wwwHomepage value
     */
    public String wwwHomepage() {
        return this.wwwHomepage;
    }

    /**
     * Set the primary Web page.
     *
     * @param wwwHomepage the wwwHomepage value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withWwwHomepage(String wwwHomepage) {
        this.wwwHomepage = wwwHomepage;
        return this;
    }

}
