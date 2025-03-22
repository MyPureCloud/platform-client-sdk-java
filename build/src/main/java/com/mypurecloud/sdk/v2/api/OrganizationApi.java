package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.EmbeddedIntegration;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FeatureState;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.FreeTrialLimitDocs;
import com.mypurecloud.sdk.v2.model.IpAddressAuthentication;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestDetails;
import com.mypurecloud.sdk.v2.model.LimitChangeRequestsEntityListing;
import com.mypurecloud.sdk.v2.model.LimitDocumentation;
import com.mypurecloud.sdk.v2.model.LimitsEntityListing;
import com.mypurecloud.sdk.v2.model.OrgAuthSettings;
import com.mypurecloud.sdk.v2.model.OrgWhitelistSettings;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;


import com.mypurecloud.sdk.v2.api.request.GetFieldconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsAuthenticationSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsEmbeddedintegrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsIpaddressauthenticationRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsChangerequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsChangerequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsDocsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsDocsFreetrialRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsNamespaceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsNamespaceDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsLimitsNamespacesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsWhitelistRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOrganizationsAuthenticationSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOrganizationsFeatureRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsEmbeddedintegrationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsIpaddressauthenticationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsMeRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsWhitelistRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizationApi {
  private final ApiClient pcapiClient;

  public OrganizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public FieldConfig getFieldconfig(String type) throws IOException, ApiException {
    return  getFieldconfig(createGetFieldconfigRequest(type));
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<FieldConfig> getFieldconfigWithHttpInfo(String type) throws IOException {
    return getFieldconfig(createGetFieldconfigRequest(type).withHttpInfo());
  }

  private GetFieldconfigRequest createGetFieldconfigRequest(String type) {
    return GetFieldconfigRequest.builder()
            .withType(type)

            .build();
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return FieldConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public FieldConfig getFieldconfig(GetFieldconfigRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FieldConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FieldConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<FieldConfig> getFieldconfig(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FieldConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets the organization's settings
   * 
   * @return OrgAuthSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrgAuthSettings getOrganizationsAuthenticationSettings() throws IOException, ApiException {
    return  getOrganizationsAuthenticationSettings(createGetOrganizationsAuthenticationSettingsRequest());
  }

  /**
   * Gets the organization's settings
   * 
   * @return OrgAuthSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrgAuthSettings> getOrganizationsAuthenticationSettingsWithHttpInfo() throws IOException {
    return getOrganizationsAuthenticationSettings(createGetOrganizationsAuthenticationSettingsRequest().withHttpInfo());
  }

  private GetOrganizationsAuthenticationSettingsRequest createGetOrganizationsAuthenticationSettingsRequest() {
    return GetOrganizationsAuthenticationSettingsRequest.builder()
            .build();
  }

  /**
   * Gets the organization's settings
   * 
   * @param request The request object
   * @return OrgAuthSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrgAuthSettings getOrganizationsAuthenticationSettings(GetOrganizationsAuthenticationSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrgAuthSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrgAuthSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the organization's settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrgAuthSettings> getOrganizationsAuthenticationSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrgAuthSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrgAuthSettings> response = (ApiResponse<OrgAuthSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrgAuthSettings> response = (ApiResponse<OrgAuthSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @return EmbeddedIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public EmbeddedIntegration getOrganizationsEmbeddedintegration() throws IOException, ApiException {
    return  getOrganizationsEmbeddedintegration(createGetOrganizationsEmbeddedintegrationRequest());
  }

  /**
   * Get the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @return EmbeddedIntegration
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<EmbeddedIntegration> getOrganizationsEmbeddedintegrationWithHttpInfo() throws IOException {
    return getOrganizationsEmbeddedintegration(createGetOrganizationsEmbeddedintegrationRequest().withHttpInfo());
  }

  private GetOrganizationsEmbeddedintegrationRequest createGetOrganizationsEmbeddedintegrationRequest() {
    return GetOrganizationsEmbeddedintegrationRequest.builder()
            .build();
  }

  /**
   * Get the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return EmbeddedIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public EmbeddedIntegration getOrganizationsEmbeddedintegration(GetOrganizationsEmbeddedintegrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmbeddedIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmbeddedIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<EmbeddedIntegration> getOrganizationsEmbeddedintegration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmbeddedIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @return IpAddressAuthentication
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public IpAddressAuthentication getOrganizationsIpaddressauthentication() throws IOException, ApiException {
    return  getOrganizationsIpaddressauthentication(createGetOrganizationsIpaddressauthenticationRequest());
  }

  /**
   * Get organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @return IpAddressAuthentication
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<IpAddressAuthentication> getOrganizationsIpaddressauthenticationWithHttpInfo() throws IOException {
    return getOrganizationsIpaddressauthentication(createGetOrganizationsIpaddressauthenticationRequest().withHttpInfo());
  }

  private GetOrganizationsIpaddressauthenticationRequest createGetOrganizationsIpaddressauthenticationRequest() {
    return GetOrganizationsIpaddressauthenticationRequest.builder()
            .build();
  }

  /**
   * Get organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return IpAddressAuthentication
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public IpAddressAuthentication getOrganizationsIpaddressauthentication(GetOrganizationsIpaddressauthenticationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IpAddressAuthentication> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IpAddressAuthentication>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<IpAddressAuthentication> getOrganizationsIpaddressauthentication(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IpAddressAuthentication>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a limit change request
   * 
   * @param requestId Unique id for the limit change request (required)
   * @return LimitChangeRequestDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitChangeRequestDetails getOrganizationsLimitsChangerequest(String requestId) throws IOException, ApiException {
    return  getOrganizationsLimitsChangerequest(createGetOrganizationsLimitsChangerequestRequest(requestId));
  }

  /**
   * Get a limit change request
   * 
   * @param requestId Unique id for the limit change request (required)
   * @return LimitChangeRequestDetails
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitChangeRequestDetails> getOrganizationsLimitsChangerequestWithHttpInfo(String requestId) throws IOException {
    return getOrganizationsLimitsChangerequest(createGetOrganizationsLimitsChangerequestRequest(requestId).withHttpInfo());
  }

  private GetOrganizationsLimitsChangerequestRequest createGetOrganizationsLimitsChangerequestRequest(String requestId) {
    return GetOrganizationsLimitsChangerequestRequest.builder()
            .withRequestId(requestId)

            .build();
  }

  /**
   * Get a limit change request
   * 
   * @param request The request object
   * @return LimitChangeRequestDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitChangeRequestDetails getOrganizationsLimitsChangerequest(GetOrganizationsLimitsChangerequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LimitChangeRequestDetails> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LimitChangeRequestDetails>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a limit change request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitChangeRequestDetails> getOrganizationsLimitsChangerequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LimitChangeRequestDetails>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LimitChangeRequestDetails> response = (ApiResponse<LimitChangeRequestDetails>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LimitChangeRequestDetails> response = (ApiResponse<LimitChangeRequestDetails>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the available limit change requests
   * Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.
   * @param after Timestamp indicating the date to begin after when searching for requests. (optional)
   * @param before Timestamp indicating the date to end before when searching for requests. (optional)
   * @param status Status of the request to be filtered by (optional)
   * @param pageSize Page Size (optional, default to 25)
   * @param expand Which fields, if any, to expand. (optional)
   * @return LimitChangeRequestsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitChangeRequestsEntityListing getOrganizationsLimitsChangerequests(Long after, Long before, String status, Integer pageSize, List<String> expand) throws IOException, ApiException {
    return  getOrganizationsLimitsChangerequests(createGetOrganizationsLimitsChangerequestsRequest(after, before, status, pageSize, expand));
  }

  /**
   * Get the available limit change requests
   * Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.
   * @param after Timestamp indicating the date to begin after when searching for requests. (optional)
   * @param before Timestamp indicating the date to end before when searching for requests. (optional)
   * @param status Status of the request to be filtered by (optional)
   * @param pageSize Page Size (optional, default to 25)
   * @param expand Which fields, if any, to expand. (optional)
   * @return LimitChangeRequestsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitChangeRequestsEntityListing> getOrganizationsLimitsChangerequestsWithHttpInfo(Long after, Long before, String status, Integer pageSize, List<String> expand) throws IOException {
    return getOrganizationsLimitsChangerequests(createGetOrganizationsLimitsChangerequestsRequest(after, before, status, pageSize, expand).withHttpInfo());
  }

  private GetOrganizationsLimitsChangerequestsRequest createGetOrganizationsLimitsChangerequestsRequest(Long after, Long before, String status, Integer pageSize, List<String> expand) {
    return GetOrganizationsLimitsChangerequestsRequest.builder()
            .withAfter(after)

            .withBefore(before)

            .withStatus(status)

            .withPageSize(pageSize)

            .withExpand(expand)

            .build();
  }

  /**
   * Get the available limit change requests
   * Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.
   * @param request The request object
   * @return LimitChangeRequestsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitChangeRequestsEntityListing getOrganizationsLimitsChangerequests(GetOrganizationsLimitsChangerequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LimitChangeRequestsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LimitChangeRequestsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the available limit change requests
   * Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitChangeRequestsEntityListing> getOrganizationsLimitsChangerequests(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LimitChangeRequestsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LimitChangeRequestsEntityListing> response = (ApiResponse<LimitChangeRequestsEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LimitChangeRequestsEntityListing> response = (ApiResponse<LimitChangeRequestsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get limit documentation
   * 
   * @return LimitDocumentation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitDocumentation getOrganizationsLimitsDocs() throws IOException, ApiException {
    return  getOrganizationsLimitsDocs(createGetOrganizationsLimitsDocsRequest());
  }

  /**
   * Get limit documentation
   * 
   * @return LimitDocumentation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitDocumentation> getOrganizationsLimitsDocsWithHttpInfo() throws IOException {
    return getOrganizationsLimitsDocs(createGetOrganizationsLimitsDocsRequest().withHttpInfo());
  }

  private GetOrganizationsLimitsDocsRequest createGetOrganizationsLimitsDocsRequest() {
    return GetOrganizationsLimitsDocsRequest.builder()
            .build();
  }

  /**
   * Get limit documentation
   * 
   * @param request The request object
   * @return LimitDocumentation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitDocumentation getOrganizationsLimitsDocs(GetOrganizationsLimitsDocsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LimitDocumentation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LimitDocumentation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get limit documentation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitDocumentation> getOrganizationsLimitsDocs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LimitDocumentation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LimitDocumentation> response = (ApiResponse<LimitDocumentation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LimitDocumentation> response = (ApiResponse<LimitDocumentation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get free trial limit documentation
   * 
   * @return FreeTrialLimitDocs
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FreeTrialLimitDocs getOrganizationsLimitsDocsFreetrial() throws IOException, ApiException {
    return  getOrganizationsLimitsDocsFreetrial(createGetOrganizationsLimitsDocsFreetrialRequest());
  }

  /**
   * Get free trial limit documentation
   * 
   * @return FreeTrialLimitDocs
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FreeTrialLimitDocs> getOrganizationsLimitsDocsFreetrialWithHttpInfo() throws IOException {
    return getOrganizationsLimitsDocsFreetrial(createGetOrganizationsLimitsDocsFreetrialRequest().withHttpInfo());
  }

  private GetOrganizationsLimitsDocsFreetrialRequest createGetOrganizationsLimitsDocsFreetrialRequest() {
    return GetOrganizationsLimitsDocsFreetrialRequest.builder()
            .build();
  }

  /**
   * Get free trial limit documentation
   * 
   * @param request The request object
   * @return FreeTrialLimitDocs
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FreeTrialLimitDocs getOrganizationsLimitsDocsFreetrial(GetOrganizationsLimitsDocsFreetrialRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FreeTrialLimitDocs> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FreeTrialLimitDocs>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get free trial limit documentation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FreeTrialLimitDocs> getOrganizationsLimitsDocsFreetrial(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FreeTrialLimitDocs>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FreeTrialLimitDocs> response = (ApiResponse<FreeTrialLimitDocs>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FreeTrialLimitDocs> response = (ApiResponse<FreeTrialLimitDocs>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the effective limits in a namespace for an organization
   * 
   * @param namespaceName The namespace to fetch limits for (required)
   * @return LimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitsEntityListing getOrganizationsLimitsNamespace(String namespaceName) throws IOException, ApiException {
    return  getOrganizationsLimitsNamespace(createGetOrganizationsLimitsNamespaceRequest(namespaceName));
  }

  /**
   * Get the effective limits in a namespace for an organization
   * 
   * @param namespaceName The namespace to fetch limits for (required)
   * @return LimitsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitsEntityListing> getOrganizationsLimitsNamespaceWithHttpInfo(String namespaceName) throws IOException {
    return getOrganizationsLimitsNamespace(createGetOrganizationsLimitsNamespaceRequest(namespaceName).withHttpInfo());
  }

  private GetOrganizationsLimitsNamespaceRequest createGetOrganizationsLimitsNamespaceRequest(String namespaceName) {
    return GetOrganizationsLimitsNamespaceRequest.builder()
            .withNamespaceName(namespaceName)

            .build();
  }

  /**
   * Get the effective limits in a namespace for an organization
   * 
   * @param request The request object
   * @return LimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitsEntityListing getOrganizationsLimitsNamespace(GetOrganizationsLimitsNamespaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LimitsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LimitsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the effective limits in a namespace for an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitsEntityListing> getOrganizationsLimitsNamespace(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LimitsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the default limits in a namespace for an organization
   * 
   * @param namespaceName The namespace to fetch defaults limits for (required)
   * @return LimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitsEntityListing getOrganizationsLimitsNamespaceDefaults(String namespaceName) throws IOException, ApiException {
    return  getOrganizationsLimitsNamespaceDefaults(createGetOrganizationsLimitsNamespaceDefaultsRequest(namespaceName));
  }

  /**
   * Get the default limits in a namespace for an organization
   * 
   * @param namespaceName The namespace to fetch defaults limits for (required)
   * @return LimitsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitsEntityListing> getOrganizationsLimitsNamespaceDefaultsWithHttpInfo(String namespaceName) throws IOException {
    return getOrganizationsLimitsNamespaceDefaults(createGetOrganizationsLimitsNamespaceDefaultsRequest(namespaceName).withHttpInfo());
  }

  private GetOrganizationsLimitsNamespaceDefaultsRequest createGetOrganizationsLimitsNamespaceDefaultsRequest(String namespaceName) {
    return GetOrganizationsLimitsNamespaceDefaultsRequest.builder()
            .withNamespaceName(namespaceName)

            .build();
  }

  /**
   * Get the default limits in a namespace for an organization
   * 
   * @param request The request object
   * @return LimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LimitsEntityListing getOrganizationsLimitsNamespaceDefaults(GetOrganizationsLimitsNamespaceDefaultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LimitsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LimitsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the default limits in a namespace for an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LimitsEntityListing> getOrganizationsLimitsNamespaceDefaults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LimitsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LimitsEntityListing> response = (ApiResponse<LimitsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the available limit namespaces
   * 
   * @param pageSize Page size (optional, default to 100)
   * @param pageNumber Page number (optional, default to 1)
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getOrganizationsLimitsNamespaces(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getOrganizationsLimitsNamespaces(createGetOrganizationsLimitsNamespacesRequest(pageSize, pageNumber));
  }

  /**
   * Get the available limit namespaces
   * 
   * @param pageSize Page size (optional, default to 100)
   * @param pageNumber Page number (optional, default to 1)
   * @return Object
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getOrganizationsLimitsNamespacesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getOrganizationsLimitsNamespaces(createGetOrganizationsLimitsNamespacesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetOrganizationsLimitsNamespacesRequest createGetOrganizationsLimitsNamespacesRequest(Integer pageSize, Integer pageNumber) {
    return GetOrganizationsLimitsNamespacesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get the available limit namespaces
   * 
   * @param request The request object
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getOrganizationsLimitsNamespaces(GetOrganizationsLimitsNamespacesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Object> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Object>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the available limit namespaces
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getOrganizationsLimitsNamespaces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Object>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get organization.
   * 
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization getOrganizationsMe() throws IOException, ApiException {
    return  getOrganizationsMe(createGetOrganizationsMeRequest());
  }

  /**
   * Get organization.
   * 
   * @return Organization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> getOrganizationsMeWithHttpInfo() throws IOException {
    return getOrganizationsMe(createGetOrganizationsMeRequest().withHttpInfo());
  }

  private GetOrganizationsMeRequest createGetOrganizationsMeRequest() {
    return GetOrganizationsMeRequest.builder()
            .build();
  }

  /**
   * Get organization.
   * 
   * @param request The request object
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization getOrganizationsMe(GetOrganizationsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Organization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Organization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> getOrganizationsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Organization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @return OrgWhitelistSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public OrgWhitelistSettings getOrganizationsWhitelist() throws IOException, ApiException {
    return  getOrganizationsWhitelist(createGetOrganizationsWhitelistRequest());
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @return OrgWhitelistSettings
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<OrgWhitelistSettings> getOrganizationsWhitelistWithHttpInfo() throws IOException {
    return getOrganizationsWhitelist(createGetOrganizationsWhitelistRequest().withHttpInfo());
  }

  private GetOrganizationsWhitelistRequest createGetOrganizationsWhitelistRequest() {
    return GetOrganizationsWhitelistRequest.builder()
            .build();
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @param request The request object
   * @return OrgWhitelistSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public OrgWhitelistSettings getOrganizationsWhitelist(GetOrganizationsWhitelistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrgWhitelistSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrgWhitelistSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<OrgWhitelistSettings> getOrganizationsWhitelist(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrgWhitelistSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the organization's settings
   * 
   * @param body Org settings (required)
   * @return OrgAuthSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrgAuthSettings patchOrganizationsAuthenticationSettings(OrgAuthSettings body) throws IOException, ApiException {
    return  patchOrganizationsAuthenticationSettings(createPatchOrganizationsAuthenticationSettingsRequest(body));
  }

  /**
   * Update the organization's settings
   * 
   * @param body Org settings (required)
   * @return OrgAuthSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrgAuthSettings> patchOrganizationsAuthenticationSettingsWithHttpInfo(OrgAuthSettings body) throws IOException {
    return patchOrganizationsAuthenticationSettings(createPatchOrganizationsAuthenticationSettingsRequest(body).withHttpInfo());
  }

  private PatchOrganizationsAuthenticationSettingsRequest createPatchOrganizationsAuthenticationSettingsRequest(OrgAuthSettings body) {
    return PatchOrganizationsAuthenticationSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the organization's settings
   * 
   * @param request The request object
   * @return OrgAuthSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrgAuthSettings patchOrganizationsAuthenticationSettings(PatchOrganizationsAuthenticationSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrgAuthSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrgAuthSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the organization's settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrgAuthSettings> patchOrganizationsAuthenticationSettings(ApiRequest<OrgAuthSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrgAuthSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrgAuthSettings> response = (ApiResponse<OrgAuthSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrgAuthSettings> response = (ApiResponse<OrgAuthSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update organization
   * 
   * @param featureName Organization feature (required)
   * @param enabled New state of feature (required)
   * @return OrganizationFeatures
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationFeatures patchOrganizationsFeature(String featureName, FeatureState enabled) throws IOException, ApiException {
    return  patchOrganizationsFeature(createPatchOrganizationsFeatureRequest(featureName, enabled));
  }

  /**
   * Update organization
   * 
   * @param featureName Organization feature (required)
   * @param enabled New state of feature (required)
   * @return OrganizationFeatures
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationFeatures> patchOrganizationsFeatureWithHttpInfo(String featureName, FeatureState enabled) throws IOException {
    return patchOrganizationsFeature(createPatchOrganizationsFeatureRequest(featureName, enabled).withHttpInfo());
  }

  private PatchOrganizationsFeatureRequest createPatchOrganizationsFeatureRequest(String featureName, FeatureState enabled) {
    return PatchOrganizationsFeatureRequest.builder()
            .withFeatureName(featureName)

            .withEnabled(enabled)

            .build();
  }

  /**
   * Update organization
   * 
   * @param request The request object
   * @return OrganizationFeatures
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationFeatures patchOrganizationsFeature(PatchOrganizationsFeatureRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationFeatures> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationFeatures>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationFeatures> patchOrganizationsFeature(ApiRequest<FeatureState> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationFeatures>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationFeatures> response = (ApiResponse<OrganizationFeatures>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationFeatures> response = (ApiResponse<OrganizationFeatures>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param body Whitelist settings (required)
   * @return EmbeddedIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public EmbeddedIntegration putOrganizationsEmbeddedintegration(EmbeddedIntegration body) throws IOException, ApiException {
    return  putOrganizationsEmbeddedintegration(createPutOrganizationsEmbeddedintegrationRequest(body));
  }

  /**
   * Update the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param body Whitelist settings (required)
   * @return EmbeddedIntegration
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<EmbeddedIntegration> putOrganizationsEmbeddedintegrationWithHttpInfo(EmbeddedIntegration body) throws IOException {
    return putOrganizationsEmbeddedintegration(createPutOrganizationsEmbeddedintegrationRequest(body).withHttpInfo());
  }

  private PutOrganizationsEmbeddedintegrationRequest createPutOrganizationsEmbeddedintegrationRequest(EmbeddedIntegration body) {
    return PutOrganizationsEmbeddedintegrationRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return EmbeddedIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public EmbeddedIntegration putOrganizationsEmbeddedintegration(PutOrganizationsEmbeddedintegrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmbeddedIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmbeddedIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the list of domains that will be allowed to embed PureCloud applications
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<EmbeddedIntegration> putOrganizationsEmbeddedintegration(ApiRequest<EmbeddedIntegration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmbeddedIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmbeddedIntegration> response = (ApiResponse<EmbeddedIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param body IP address Whitelist settings (required)
   * @return IpAddressAuthentication
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public IpAddressAuthentication putOrganizationsIpaddressauthentication(IpAddressAuthentication body) throws IOException, ApiException {
    return  putOrganizationsIpaddressauthentication(createPutOrganizationsIpaddressauthenticationRequest(body));
  }

  /**
   * Update organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param body IP address Whitelist settings (required)
   * @return IpAddressAuthentication
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<IpAddressAuthentication> putOrganizationsIpaddressauthenticationWithHttpInfo(IpAddressAuthentication body) throws IOException {
    return putOrganizationsIpaddressauthentication(createPutOrganizationsIpaddressauthenticationRequest(body).withHttpInfo());
  }

  private PutOrganizationsIpaddressauthenticationRequest createPutOrganizationsIpaddressauthenticationRequest(IpAddressAuthentication body) {
    return PutOrganizationsIpaddressauthenticationRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return IpAddressAuthentication
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public IpAddressAuthentication putOrganizationsIpaddressauthentication(PutOrganizationsIpaddressauthenticationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IpAddressAuthentication> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IpAddressAuthentication>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update organization IP address whitelist settings
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<IpAddressAuthentication> putOrganizationsIpaddressauthentication(ApiRequest<IpAddressAuthentication> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IpAddressAuthentication>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IpAddressAuthentication> response = (ApiResponse<IpAddressAuthentication>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update organization.
   * 
   * @param body Organization (optional)
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization putOrganizationsMe(Organization body) throws IOException, ApiException {
    return  putOrganizationsMe(createPutOrganizationsMeRequest(body));
  }

  /**
   * Update organization.
   * 
   * @param body Organization (optional)
   * @return Organization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> putOrganizationsMeWithHttpInfo(Organization body) throws IOException {
    return putOrganizationsMe(createPutOrganizationsMeRequest(body).withHttpInfo());
  }

  private PutOrganizationsMeRequest createPutOrganizationsMeRequest(Organization body) {
    return PutOrganizationsMeRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update organization.
   * 
   * @param request The request object
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization putOrganizationsMe(PutOrganizationsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Organization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Organization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> putOrganizationsMe(ApiRequest<Organization> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Organization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @param body Whitelist settings (required)
   * @return OrgWhitelistSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public OrgWhitelistSettings putOrganizationsWhitelist(OrgWhitelistSettings body) throws IOException, ApiException {
    return  putOrganizationsWhitelist(createPutOrganizationsWhitelistRequest(body));
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @param body Whitelist settings (required)
   * @return OrgWhitelistSettings
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<OrgWhitelistSettings> putOrganizationsWhitelistWithHttpInfo(OrgWhitelistSettings body) throws IOException {
    return putOrganizationsWhitelist(createPutOrganizationsWhitelistRequest(body).withHttpInfo());
  }

  private PutOrganizationsWhitelistRequest createPutOrganizationsWhitelistRequest(OrgWhitelistSettings body) {
    return PutOrganizationsWhitelistRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @param request The request object
   * @return OrgWhitelistSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public OrgWhitelistSettings putOrganizationsWhitelist(PutOrganizationsWhitelistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrgWhitelistSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrgWhitelistSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * This route is deprecated, please use /api/v2/organizations/authentication/settings instead
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<OrgWhitelistSettings> putOrganizationsWhitelist(ApiRequest<OrgWhitelistSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrgWhitelistSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OrgWhitelistSettings> response = (ApiResponse<OrgWhitelistSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
