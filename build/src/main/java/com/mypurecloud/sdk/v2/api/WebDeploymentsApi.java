package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CobrowseWebMessagingSession;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExpandableWebDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.SignedData;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentActiveConfigurationOnDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeploymentsAuthorizationResponse;
import com.mypurecloud.sdk.v2.model.WebDeploymentsOAuthExchangeRequest;
import com.mypurecloud.sdk.v2.model.WebDeploymentsRefreshJWTRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteWebdeploymentsConfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebdeploymentsDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebdeploymentsTokenRevokeRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationVersionsDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsDeploymentCobrowseSessionIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsDeploymentConfigurationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsDeploymentIdentityresolutionRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsConfigurationVersionsDraftPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsConfigurationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsTokenRefreshRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebdeploymentsConfigurationVersionsDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebdeploymentsDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebdeploymentsDeploymentIdentityresolutionRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebDeploymentsApi {
  private final ApiClient pcapiClient;

  public WebDeploymentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebDeploymentsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete all versions of a configuration
   * 
   * @param configurationId The configuration version ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebdeploymentsConfiguration(String configurationId) throws IOException, ApiException {
     deleteWebdeploymentsConfiguration(createDeleteWebdeploymentsConfigurationRequest(configurationId));
  }

  /**
   * Delete all versions of a configuration
   * 
   * @param configurationId The configuration version ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebdeploymentsConfigurationWithHttpInfo(String configurationId) throws IOException {
    return deleteWebdeploymentsConfiguration(createDeleteWebdeploymentsConfigurationRequest(configurationId).withHttpInfo());
  }

  private DeleteWebdeploymentsConfigurationRequest createDeleteWebdeploymentsConfigurationRequest(String configurationId) {
    return DeleteWebdeploymentsConfigurationRequest.builder()
            .withConfigurationId(configurationId)

            .build();
  }

  /**
   * Delete all versions of a configuration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebdeploymentsConfiguration(DeleteWebdeploymentsConfigurationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete all versions of a configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebdeploymentsConfiguration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
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
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete a deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebdeploymentsDeployment(String deploymentId) throws IOException, ApiException {
     deleteWebdeploymentsDeployment(createDeleteWebdeploymentsDeploymentRequest(deploymentId));
  }

  /**
   * Delete a deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebdeploymentsDeploymentWithHttpInfo(String deploymentId) throws IOException {
    return deleteWebdeploymentsDeployment(createDeleteWebdeploymentsDeploymentRequest(deploymentId).withHttpInfo());
  }

  private DeleteWebdeploymentsDeploymentRequest createDeleteWebdeploymentsDeploymentRequest(String deploymentId) {
    return DeleteWebdeploymentsDeploymentRequest.builder()
            .withDeploymentId(deploymentId)

            .build();
  }

  /**
   * Delete a deployment
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebdeploymentsDeployment(DeleteWebdeploymentsDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebdeploymentsDeployment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
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
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Deletes a cobrowse session
   * 
   * @param deploymentId WebMessaging deployment ID (required)
   * @param sessionId Cobrowse session id or join code (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteWebdeploymentsDeploymentCobrowseSessionId(String deploymentId, String sessionId) throws IOException, ApiException {
    return  deleteWebdeploymentsDeploymentCobrowseSessionId(createDeleteWebdeploymentsDeploymentCobrowseSessionIdRequest(deploymentId, sessionId));
  }

  /**
   * Deletes a cobrowse session
   * 
   * @param deploymentId WebMessaging deployment ID (required)
   * @param sessionId Cobrowse session id or join code (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteWebdeploymentsDeploymentCobrowseSessionIdWithHttpInfo(String deploymentId, String sessionId) throws IOException {
    return deleteWebdeploymentsDeploymentCobrowseSessionId(createDeleteWebdeploymentsDeploymentCobrowseSessionIdRequest(deploymentId, sessionId).withHttpInfo());
  }

  private DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest createDeleteWebdeploymentsDeploymentCobrowseSessionIdRequest(String deploymentId, String sessionId) {
    return DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest.builder()
            .withDeploymentId(deploymentId)

            .withSessionId(sessionId)

            .build();
  }

  /**
   * Deletes a cobrowse session
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteWebdeploymentsDeploymentCobrowseSessionId(DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Deletes a cobrowse session
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteWebdeploymentsDeploymentCobrowseSessionId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Invalidate JWT
   * 
   * @param xJourneySessionId The Customer's journey sessionId. (optional)
   * @param xJourneySessionType The Customer's journey session type. (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebdeploymentsTokenRevoke(String xJourneySessionId, String xJourneySessionType) throws IOException, ApiException {
     deleteWebdeploymentsTokenRevoke(createDeleteWebdeploymentsTokenRevokeRequest(xJourneySessionId, xJourneySessionType));
  }

  /**
   * Invalidate JWT
   * 
   * @param xJourneySessionId The Customer's journey sessionId. (optional)
   * @param xJourneySessionType The Customer's journey session type. (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebdeploymentsTokenRevokeWithHttpInfo(String xJourneySessionId, String xJourneySessionType) throws IOException {
    return deleteWebdeploymentsTokenRevoke(createDeleteWebdeploymentsTokenRevokeRequest(xJourneySessionId, xJourneySessionType).withHttpInfo());
  }

  private DeleteWebdeploymentsTokenRevokeRequest createDeleteWebdeploymentsTokenRevokeRequest(String xJourneySessionId, String xJourneySessionType) {
    return DeleteWebdeploymentsTokenRevokeRequest.builder()
            .withXJourneySessionId(xJourneySessionId)

            .withXJourneySessionType(xJourneySessionType)

            .build();
  }

  /**
   * Invalidate JWT
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebdeploymentsTokenRevoke(DeleteWebdeploymentsTokenRevokeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Invalidate JWT
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebdeploymentsTokenRevoke(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
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
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a configuration version
   * 
   * @param configurationId The configuration version ID (required)
   * @param versionId The version of the configuration to get (required)
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion getWebdeploymentsConfigurationVersion(String configurationId, String versionId) throws IOException, ApiException {
    return  getWebdeploymentsConfigurationVersion(createGetWebdeploymentsConfigurationVersionRequest(configurationId, versionId));
  }

  /**
   * Get a configuration version
   * 
   * @param configurationId The configuration version ID (required)
   * @param versionId The version of the configuration to get (required)
   * @return WebDeploymentConfigurationVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> getWebdeploymentsConfigurationVersionWithHttpInfo(String configurationId, String versionId) throws IOException {
    return getWebdeploymentsConfigurationVersion(createGetWebdeploymentsConfigurationVersionRequest(configurationId, versionId).withHttpInfo());
  }

  private GetWebdeploymentsConfigurationVersionRequest createGetWebdeploymentsConfigurationVersionRequest(String configurationId, String versionId) {
    return GetWebdeploymentsConfigurationVersionRequest.builder()
            .withConfigurationId(configurationId)

            .withVersionId(versionId)

            .build();
  }

  /**
   * Get a configuration version
   * 
   * @param request The request object
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion getWebdeploymentsConfigurationVersion(GetWebdeploymentsConfigurationVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentConfigurationVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a configuration version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> getWebdeploymentsConfigurationVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentConfigurationVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the versions of a configuration
   * This returns the 50 most recent versions for this configuration
   * @param configurationId The configuration version ID (required)
   * @return WebDeploymentConfigurationVersionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersionEntityListing getWebdeploymentsConfigurationVersions(String configurationId) throws IOException, ApiException {
    return  getWebdeploymentsConfigurationVersions(createGetWebdeploymentsConfigurationVersionsRequest(configurationId));
  }

  /**
   * Get the versions of a configuration
   * This returns the 50 most recent versions for this configuration
   * @param configurationId The configuration version ID (required)
   * @return WebDeploymentConfigurationVersionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersionEntityListing> getWebdeploymentsConfigurationVersionsWithHttpInfo(String configurationId) throws IOException {
    return getWebdeploymentsConfigurationVersions(createGetWebdeploymentsConfigurationVersionsRequest(configurationId).withHttpInfo());
  }

  private GetWebdeploymentsConfigurationVersionsRequest createGetWebdeploymentsConfigurationVersionsRequest(String configurationId) {
    return GetWebdeploymentsConfigurationVersionsRequest.builder()
            .withConfigurationId(configurationId)

            .build();
  }

  /**
   * Get the versions of a configuration
   * This returns the 50 most recent versions for this configuration
   * @param request The request object
   * @return WebDeploymentConfigurationVersionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersionEntityListing getWebdeploymentsConfigurationVersions(GetWebdeploymentsConfigurationVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the versions of a configuration
   * This returns the 50 most recent versions for this configuration
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersionEntityListing> getWebdeploymentsConfigurationVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the configuration draft
   * 
   * @param configurationId The configuration version ID (required)
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion getWebdeploymentsConfigurationVersionsDraft(String configurationId) throws IOException, ApiException {
    return  getWebdeploymentsConfigurationVersionsDraft(createGetWebdeploymentsConfigurationVersionsDraftRequest(configurationId));
  }

  /**
   * Get the configuration draft
   * 
   * @param configurationId The configuration version ID (required)
   * @return WebDeploymentConfigurationVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> getWebdeploymentsConfigurationVersionsDraftWithHttpInfo(String configurationId) throws IOException {
    return getWebdeploymentsConfigurationVersionsDraft(createGetWebdeploymentsConfigurationVersionsDraftRequest(configurationId).withHttpInfo());
  }

  private GetWebdeploymentsConfigurationVersionsDraftRequest createGetWebdeploymentsConfigurationVersionsDraftRequest(String configurationId) {
    return GetWebdeploymentsConfigurationVersionsDraftRequest.builder()
            .withConfigurationId(configurationId)

            .build();
  }

  /**
   * Get the configuration draft
   * 
   * @param request The request object
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion getWebdeploymentsConfigurationVersionsDraft(GetWebdeploymentsConfigurationVersionsDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentConfigurationVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the configuration draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> getWebdeploymentsConfigurationVersionsDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentConfigurationVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * View configuration drafts
   * 
   * @param showOnlyPublished Filter by published status. (optional)
   * @return WebDeploymentConfigurationVersionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersionEntityListing getWebdeploymentsConfigurations(Boolean showOnlyPublished) throws IOException, ApiException {
    return  getWebdeploymentsConfigurations(createGetWebdeploymentsConfigurationsRequest(showOnlyPublished));
  }

  /**
   * View configuration drafts
   * 
   * @param showOnlyPublished Filter by published status. (optional)
   * @return WebDeploymentConfigurationVersionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersionEntityListing> getWebdeploymentsConfigurationsWithHttpInfo(Boolean showOnlyPublished) throws IOException {
    return getWebdeploymentsConfigurations(createGetWebdeploymentsConfigurationsRequest(showOnlyPublished).withHttpInfo());
  }

  private GetWebdeploymentsConfigurationsRequest createGetWebdeploymentsConfigurationsRequest(Boolean showOnlyPublished) {
    return GetWebdeploymentsConfigurationsRequest.builder()
            .withShowOnlyPublished(showOnlyPublished)

            .build();
  }

  /**
   * View configuration drafts
   * 
   * @param request The request object
   * @return WebDeploymentConfigurationVersionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersionEntityListing getWebdeploymentsConfigurations(GetWebdeploymentsConfigurationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * View configuration drafts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersionEntityListing> getWebdeploymentsConfigurations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected.  (optional)
   * @return WebDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeployment getWebdeploymentsDeployment(String deploymentId, List<String> expand) throws IOException, ApiException {
    return  getWebdeploymentsDeployment(createGetWebdeploymentsDeploymentRequest(deploymentId, expand));
  }

  /**
   * Get a deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @param expand The specified entity attributes will be filled. Comma separated values expected.  (optional)
   * @return WebDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeployment> getWebdeploymentsDeploymentWithHttpInfo(String deploymentId, List<String> expand) throws IOException {
    return getWebdeploymentsDeployment(createGetWebdeploymentsDeploymentRequest(deploymentId, expand).withHttpInfo());
  }

  private GetWebdeploymentsDeploymentRequest createGetWebdeploymentsDeploymentRequest(String deploymentId, List<String> expand) {
    return GetWebdeploymentsDeploymentRequest.builder()
            .withDeploymentId(deploymentId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get a deployment
   * 
   * @param request The request object
   * @return WebDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeployment getWebdeploymentsDeployment(GetWebdeploymentsDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeployment> getWebdeploymentsDeployment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves a cobrowse session
   * 
   * @param deploymentId WebMessaging deployment ID (required)
   * @param sessionId Cobrowse session id or join code (required)
   * @return CobrowseWebMessagingSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseWebMessagingSession getWebdeploymentsDeploymentCobrowseSessionId(String deploymentId, String sessionId) throws IOException, ApiException {
    return  getWebdeploymentsDeploymentCobrowseSessionId(createGetWebdeploymentsDeploymentCobrowseSessionIdRequest(deploymentId, sessionId));
  }

  /**
   * Retrieves a cobrowse session
   * 
   * @param deploymentId WebMessaging deployment ID (required)
   * @param sessionId Cobrowse session id or join code (required)
   * @return CobrowseWebMessagingSession
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseWebMessagingSession> getWebdeploymentsDeploymentCobrowseSessionIdWithHttpInfo(String deploymentId, String sessionId) throws IOException {
    return getWebdeploymentsDeploymentCobrowseSessionId(createGetWebdeploymentsDeploymentCobrowseSessionIdRequest(deploymentId, sessionId).withHttpInfo());
  }

  private GetWebdeploymentsDeploymentCobrowseSessionIdRequest createGetWebdeploymentsDeploymentCobrowseSessionIdRequest(String deploymentId, String sessionId) {
    return GetWebdeploymentsDeploymentCobrowseSessionIdRequest.builder()
            .withDeploymentId(deploymentId)

            .withSessionId(sessionId)

            .build();
  }

  /**
   * Retrieves a cobrowse session
   * 
   * @param request The request object
   * @return CobrowseWebMessagingSession
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CobrowseWebMessagingSession getWebdeploymentsDeploymentCobrowseSessionId(GetWebdeploymentsDeploymentCobrowseSessionIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CobrowseWebMessagingSession> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CobrowseWebMessagingSession>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves a cobrowse session
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CobrowseWebMessagingSession> getWebdeploymentsDeploymentCobrowseSessionId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CobrowseWebMessagingSession>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CobrowseWebMessagingSession> response = (ApiResponse<CobrowseWebMessagingSession>)(ApiResponse<?>)exception;
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
      ApiResponse<CobrowseWebMessagingSession> response = (ApiResponse<CobrowseWebMessagingSession>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get active configuration for a given deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @param type Get active configuration on a deployment (optional)
   * @param expand Expand instructions for the return value (optional)
   * @return WebDeploymentActiveConfigurationOnDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentActiveConfigurationOnDeployment getWebdeploymentsDeploymentConfigurations(String deploymentId, String type, List<String> expand) throws IOException, ApiException {
    return  getWebdeploymentsDeploymentConfigurations(createGetWebdeploymentsDeploymentConfigurationsRequest(deploymentId, type, expand));
  }

  /**
   * Get active configuration for a given deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @param type Get active configuration on a deployment (optional)
   * @param expand Expand instructions for the return value (optional)
   * @return WebDeploymentActiveConfigurationOnDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentActiveConfigurationOnDeployment> getWebdeploymentsDeploymentConfigurationsWithHttpInfo(String deploymentId, String type, List<String> expand) throws IOException {
    return getWebdeploymentsDeploymentConfigurations(createGetWebdeploymentsDeploymentConfigurationsRequest(deploymentId, type, expand).withHttpInfo());
  }

  private GetWebdeploymentsDeploymentConfigurationsRequest createGetWebdeploymentsDeploymentConfigurationsRequest(String deploymentId, String type, List<String> expand) {
    return GetWebdeploymentsDeploymentConfigurationsRequest.builder()
            .withDeploymentId(deploymentId)

            .withType(type)

            .withExpand(expand)

            .build();
  }

  /**
   * Get active configuration for a given deployment
   * 
   * @param request The request object
   * @return WebDeploymentActiveConfigurationOnDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentActiveConfigurationOnDeployment getWebdeploymentsDeploymentConfigurations(GetWebdeploymentsDeploymentConfigurationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentActiveConfigurationOnDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentActiveConfigurationOnDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get active configuration for a given deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentActiveConfigurationOnDeployment> getWebdeploymentsDeploymentConfigurations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentActiveConfigurationOnDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentActiveConfigurationOnDeployment> response = (ApiResponse<WebDeploymentActiveConfigurationOnDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentActiveConfigurationOnDeployment> response = (ApiResponse<WebDeploymentActiveConfigurationOnDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a deployment identity resolution setting.
   * 
   * @param deploymentId The deployment ID (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getWebdeploymentsDeploymentIdentityresolution(String deploymentId) throws IOException, ApiException {
    return  getWebdeploymentsDeploymentIdentityresolution(createGetWebdeploymentsDeploymentIdentityresolutionRequest(deploymentId));
  }

  /**
   * Get a deployment identity resolution setting.
   * 
   * @param deploymentId The deployment ID (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getWebdeploymentsDeploymentIdentityresolutionWithHttpInfo(String deploymentId) throws IOException {
    return getWebdeploymentsDeploymentIdentityresolution(createGetWebdeploymentsDeploymentIdentityresolutionRequest(deploymentId).withHttpInfo());
  }

  private GetWebdeploymentsDeploymentIdentityresolutionRequest createGetWebdeploymentsDeploymentIdentityresolutionRequest(String deploymentId) {
    return GetWebdeploymentsDeploymentIdentityresolutionRequest.builder()
            .withDeploymentId(deploymentId)

            .build();
  }

  /**
   * Get a deployment identity resolution setting.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getWebdeploymentsDeploymentIdentityresolution(GetWebdeploymentsDeploymentIdentityresolutionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a deployment identity resolution setting.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getWebdeploymentsDeploymentIdentityresolution(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get deployments
   * 
   * @param expand The specified entity attributes will be filled. Comma separated values expected.  (optional)
   * @return ExpandableWebDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExpandableWebDeploymentEntityListing getWebdeploymentsDeployments(List<String> expand) throws IOException, ApiException {
    return  getWebdeploymentsDeployments(createGetWebdeploymentsDeploymentsRequest(expand));
  }

  /**
   * Get deployments
   * 
   * @param expand The specified entity attributes will be filled. Comma separated values expected.  (optional)
   * @return ExpandableWebDeploymentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExpandableWebDeploymentEntityListing> getWebdeploymentsDeploymentsWithHttpInfo(List<String> expand) throws IOException {
    return getWebdeploymentsDeployments(createGetWebdeploymentsDeploymentsRequest(expand).withHttpInfo());
  }

  private GetWebdeploymentsDeploymentsRequest createGetWebdeploymentsDeploymentsRequest(List<String> expand) {
    return GetWebdeploymentsDeploymentsRequest.builder()
            .withExpand(expand)

            .build();
  }

  /**
   * Get deployments
   * 
   * @param request The request object
   * @return ExpandableWebDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExpandableWebDeploymentEntityListing getWebdeploymentsDeployments(GetWebdeploymentsDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExpandableWebDeploymentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExpandableWebDeploymentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get deployments
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExpandableWebDeploymentEntityListing> getWebdeploymentsDeployments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExpandableWebDeploymentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExpandableWebDeploymentEntityListing> response = (ApiResponse<ExpandableWebDeploymentEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExpandableWebDeploymentEntityListing> response = (ApiResponse<ExpandableWebDeploymentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish the configuration draft and create a new version
   * 
   * @param configurationId The configuration version ID (required)
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion postWebdeploymentsConfigurationVersionsDraftPublish(String configurationId) throws IOException, ApiException {
    return  postWebdeploymentsConfigurationVersionsDraftPublish(createPostWebdeploymentsConfigurationVersionsDraftPublishRequest(configurationId));
  }

  /**
   * Publish the configuration draft and create a new version
   * 
   * @param configurationId The configuration version ID (required)
   * @return WebDeploymentConfigurationVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> postWebdeploymentsConfigurationVersionsDraftPublishWithHttpInfo(String configurationId) throws IOException {
    return postWebdeploymentsConfigurationVersionsDraftPublish(createPostWebdeploymentsConfigurationVersionsDraftPublishRequest(configurationId).withHttpInfo());
  }

  private PostWebdeploymentsConfigurationVersionsDraftPublishRequest createPostWebdeploymentsConfigurationVersionsDraftPublishRequest(String configurationId) {
    return PostWebdeploymentsConfigurationVersionsDraftPublishRequest.builder()
            .withConfigurationId(configurationId)

            .build();
  }

  /**
   * Publish the configuration draft and create a new version
   * 
   * @param request The request object
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion postWebdeploymentsConfigurationVersionsDraftPublish(PostWebdeploymentsConfigurationVersionsDraftPublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentConfigurationVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish the configuration draft and create a new version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> postWebdeploymentsConfigurationVersionsDraftPublish(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentConfigurationVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a configuration draft
   * 
   * @param configurationVersion  (required)
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion postWebdeploymentsConfigurations(WebDeploymentConfigurationVersion configurationVersion) throws IOException, ApiException {
    return  postWebdeploymentsConfigurations(createPostWebdeploymentsConfigurationsRequest(configurationVersion));
  }

  /**
   * Create a configuration draft
   * 
   * @param configurationVersion  (required)
   * @return WebDeploymentConfigurationVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> postWebdeploymentsConfigurationsWithHttpInfo(WebDeploymentConfigurationVersion configurationVersion) throws IOException {
    return postWebdeploymentsConfigurations(createPostWebdeploymentsConfigurationsRequest(configurationVersion).withHttpInfo());
  }

  private PostWebdeploymentsConfigurationsRequest createPostWebdeploymentsConfigurationsRequest(WebDeploymentConfigurationVersion configurationVersion) {
    return PostWebdeploymentsConfigurationsRequest.builder()
            .withConfigurationVersion(configurationVersion)

            .build();
  }

  /**
   * Create a configuration draft
   * 
   * @param request The request object
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion postWebdeploymentsConfigurations(PostWebdeploymentsConfigurationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentConfigurationVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a configuration draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> postWebdeploymentsConfigurations(ApiRequest<WebDeploymentConfigurationVersion> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentConfigurationVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a deployment
   * 
   * @param deployment  (required)
   * @return WebDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeployment postWebdeploymentsDeployments(WebDeployment deployment) throws IOException, ApiException {
    return  postWebdeploymentsDeployments(createPostWebdeploymentsDeploymentsRequest(deployment));
  }

  /**
   * Create a deployment
   * 
   * @param deployment  (required)
   * @return WebDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeployment> postWebdeploymentsDeploymentsWithHttpInfo(WebDeployment deployment) throws IOException {
    return postWebdeploymentsDeployments(createPostWebdeploymentsDeploymentsRequest(deployment).withHttpInfo());
  }

  private PostWebdeploymentsDeploymentsRequest createPostWebdeploymentsDeploymentsRequest(WebDeployment deployment) {
    return PostWebdeploymentsDeploymentsRequest.builder()
            .withDeployment(deployment)

            .build();
  }

  /**
   * Create a deployment
   * 
   * @param request The request object
   * @return WebDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeployment postWebdeploymentsDeployments(PostWebdeploymentsDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeployment> postWebdeploymentsDeployments(ApiRequest<WebDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Exchange an oAuth code (obtained using the Authorization Code Flow) for a JWT that can be used by webdeployments.
   * 
   * @param body webDeploymentsOAuthExchangeRequest (required)
   * @return WebDeploymentsAuthorizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentsAuthorizationResponse postWebdeploymentsTokenOauthcodegrantjwtexchange(WebDeploymentsOAuthExchangeRequest body) throws IOException, ApiException {
    return  postWebdeploymentsTokenOauthcodegrantjwtexchange(createPostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest(body));
  }

  /**
   * Exchange an oAuth code (obtained using the Authorization Code Flow) for a JWT that can be used by webdeployments.
   * 
   * @param body webDeploymentsOAuthExchangeRequest (required)
   * @return WebDeploymentsAuthorizationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentsAuthorizationResponse> postWebdeploymentsTokenOauthcodegrantjwtexchangeWithHttpInfo(WebDeploymentsOAuthExchangeRequest body) throws IOException {
    return postWebdeploymentsTokenOauthcodegrantjwtexchange(createPostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest(body).withHttpInfo());
  }

  private PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest createPostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest(WebDeploymentsOAuthExchangeRequest body) {
    return PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Exchange an oAuth code (obtained using the Authorization Code Flow) for a JWT that can be used by webdeployments.
   * 
   * @param request The request object
   * @return WebDeploymentsAuthorizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentsAuthorizationResponse postWebdeploymentsTokenOauthcodegrantjwtexchange(PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentsAuthorizationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentsAuthorizationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Exchange an oAuth code (obtained using the Authorization Code Flow) for a JWT that can be used by webdeployments.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentsAuthorizationResponse> postWebdeploymentsTokenOauthcodegrantjwtexchange(ApiRequest<WebDeploymentsOAuthExchangeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentsAuthorizationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentsAuthorizationResponse> response = (ApiResponse<WebDeploymentsAuthorizationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentsAuthorizationResponse> response = (ApiResponse<WebDeploymentsAuthorizationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Refresh a JWT.
   * 
   * @param body  (optional)
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postWebdeploymentsTokenRefresh(WebDeploymentsRefreshJWTRequest body) throws IOException, ApiException {
    return  postWebdeploymentsTokenRefresh(createPostWebdeploymentsTokenRefreshRequest(body));
  }

  /**
   * Refresh a JWT.
   * 
   * @param body  (optional)
   * @return SignedData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postWebdeploymentsTokenRefreshWithHttpInfo(WebDeploymentsRefreshJWTRequest body) throws IOException {
    return postWebdeploymentsTokenRefresh(createPostWebdeploymentsTokenRefreshRequest(body).withHttpInfo());
  }

  private PostWebdeploymentsTokenRefreshRequest createPostWebdeploymentsTokenRefreshRequest(WebDeploymentsRefreshJWTRequest body) {
    return PostWebdeploymentsTokenRefreshRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Refresh a JWT.
   * 
   * @param request The request object
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postWebdeploymentsTokenRefresh(PostWebdeploymentsTokenRefreshRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SignedData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SignedData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Refresh a JWT.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postWebdeploymentsTokenRefresh(ApiRequest<WebDeploymentsRefreshJWTRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SignedData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SignedData> response = (ApiResponse<SignedData>)(ApiResponse<?>)exception;
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
      ApiResponse<SignedData> response = (ApiResponse<SignedData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the configuration draft
   * 
   * @param configurationId The configuration version ID (required)
   * @param configurationVersion  (required)
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion putWebdeploymentsConfigurationVersionsDraft(String configurationId, WebDeploymentConfigurationVersion configurationVersion) throws IOException, ApiException {
    return  putWebdeploymentsConfigurationVersionsDraft(createPutWebdeploymentsConfigurationVersionsDraftRequest(configurationId, configurationVersion));
  }

  /**
   * Update the configuration draft
   * 
   * @param configurationId The configuration version ID (required)
   * @param configurationVersion  (required)
   * @return WebDeploymentConfigurationVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> putWebdeploymentsConfigurationVersionsDraftWithHttpInfo(String configurationId, WebDeploymentConfigurationVersion configurationVersion) throws IOException {
    return putWebdeploymentsConfigurationVersionsDraft(createPutWebdeploymentsConfigurationVersionsDraftRequest(configurationId, configurationVersion).withHttpInfo());
  }

  private PutWebdeploymentsConfigurationVersionsDraftRequest createPutWebdeploymentsConfigurationVersionsDraftRequest(String configurationId, WebDeploymentConfigurationVersion configurationVersion) {
    return PutWebdeploymentsConfigurationVersionsDraftRequest.builder()
            .withConfigurationId(configurationId)

            .withConfigurationVersion(configurationVersion)

            .build();
  }

  /**
   * Update the configuration draft
   * 
   * @param request The request object
   * @return WebDeploymentConfigurationVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeploymentConfigurationVersion putWebdeploymentsConfigurationVersionsDraft(PutWebdeploymentsConfigurationVersionsDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeploymentConfigurationVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the configuration draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeploymentConfigurationVersion> putWebdeploymentsConfigurationVersionsDraft(ApiRequest<WebDeploymentConfigurationVersion> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeploymentConfigurationVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @param deployment  (required)
   * @return WebDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeployment putWebdeploymentsDeployment(String deploymentId, WebDeployment deployment) throws IOException, ApiException {
    return  putWebdeploymentsDeployment(createPutWebdeploymentsDeploymentRequest(deploymentId, deployment));
  }

  /**
   * Update a deployment
   * 
   * @param deploymentId The deployment ID (required)
   * @param deployment  (required)
   * @return WebDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeployment> putWebdeploymentsDeploymentWithHttpInfo(String deploymentId, WebDeployment deployment) throws IOException {
    return putWebdeploymentsDeployment(createPutWebdeploymentsDeploymentRequest(deploymentId, deployment).withHttpInfo());
  }

  private PutWebdeploymentsDeploymentRequest createPutWebdeploymentsDeploymentRequest(String deploymentId, WebDeployment deployment) {
    return PutWebdeploymentsDeploymentRequest.builder()
            .withDeploymentId(deploymentId)

            .withDeployment(deployment)

            .build();
  }

  /**
   * Update a deployment
   * 
   * @param request The request object
   * @return WebDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebDeployment putWebdeploymentsDeployment(PutWebdeploymentsDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebDeployment> putWebdeploymentsDeployment(ApiRequest<WebDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update identity resolution settings for a deployment.
   * 
   * @param deploymentId The deployment ID (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putWebdeploymentsDeploymentIdentityresolution(String deploymentId, IdentityResolutionConfig body) throws IOException, ApiException {
    return  putWebdeploymentsDeploymentIdentityresolution(createPutWebdeploymentsDeploymentIdentityresolutionRequest(deploymentId, body));
  }

  /**
   * Update identity resolution settings for a deployment.
   * 
   * @param deploymentId The deployment ID (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putWebdeploymentsDeploymentIdentityresolutionWithHttpInfo(String deploymentId, IdentityResolutionConfig body) throws IOException {
    return putWebdeploymentsDeploymentIdentityresolution(createPutWebdeploymentsDeploymentIdentityresolutionRequest(deploymentId, body).withHttpInfo());
  }

  private PutWebdeploymentsDeploymentIdentityresolutionRequest createPutWebdeploymentsDeploymentIdentityresolutionRequest(String deploymentId, IdentityResolutionConfig body) {
    return PutWebdeploymentsDeploymentIdentityresolutionRequest.builder()
            .withDeploymentId(deploymentId)

            .withBody(body)

            .build();
  }

  /**
   * Update identity resolution settings for a deployment.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putWebdeploymentsDeploymentIdentityresolution(PutWebdeploymentsDeploymentIdentityresolutionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update identity resolution settings for a deployment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putWebdeploymentsDeploymentIdentityresolution(ApiRequest<IdentityResolutionConfig> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
