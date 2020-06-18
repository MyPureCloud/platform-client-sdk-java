package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OAuthAuthorization;
import com.mypurecloud.sdk.v2.model.OAuthAuthorizationListing;
import com.mypurecloud.sdk.v2.model.OAuthClient;
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;
import com.mypurecloud.sdk.v2.model.OAuthClientEntityListing;
import com.mypurecloud.sdk.v2.model.OAuthScope;
import com.mypurecloud.sdk.v2.model.OAuthScopeListing;
import com.mypurecloud.sdk.v2.model.ApiUsageQuery;
import com.mypurecloud.sdk.v2.model.OAuthClientRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthAuthorizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthAuthorizationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageQueryResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthScopeRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthScopesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientSecretRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientUsageQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.PutOauthClientRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OAuthApi {
  private final ApiClient pcapiClient;

  public OAuthApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete OAuth Client
   * 
   * @param clientId Client ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOauthClient(String clientId) throws IOException, ApiException {
     deleteOauthClient(createDeleteOauthClientRequest(clientId));
  }

  /**
   * Delete OAuth Client
   * 
   * @param clientId Client ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOauthClientWithHttpInfo(String clientId) throws IOException {
    return deleteOauthClient(createDeleteOauthClientRequest(clientId).withHttpInfo());
  }

  private DeleteOauthClientRequest createDeleteOauthClientRequest(String clientId) {
    return DeleteOauthClientRequest.builder()
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Delete OAuth Client
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOauthClient(DeleteOauthClientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete OAuth Client
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOauthClient(ApiRequest<Void> request) throws IOException {
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
   * Get a client that is authorized by the resource owner
   * 
   * @param clientId The ID of client (required)
   * @return OAuthAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthAuthorization getOauthAuthorization(String clientId) throws IOException, ApiException {
    return  getOauthAuthorization(createGetOauthAuthorizationRequest(clientId));
  }

  /**
   * Get a client that is authorized by the resource owner
   * 
   * @param clientId The ID of client (required)
   * @return OAuthAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthAuthorization> getOauthAuthorizationWithHttpInfo(String clientId) throws IOException {
    return getOauthAuthorization(createGetOauthAuthorizationRequest(clientId).withHttpInfo());
  }

  private GetOauthAuthorizationRequest createGetOauthAuthorizationRequest(String clientId) {
    return GetOauthAuthorizationRequest.builder()
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Get a client that is authorized by the resource owner
   * 
   * @param request The request object
   * @return OAuthAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthAuthorization getOauthAuthorization(GetOauthAuthorizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthAuthorization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthAuthorization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a client that is authorized by the resource owner
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthAuthorization> getOauthAuthorization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthAuthorization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthAuthorization> response = (ApiResponse<OAuthAuthorization>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthAuthorization> response = (ApiResponse<OAuthAuthorization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List clients that are authorized by the resource owner
   * 
   * @return OAuthAuthorizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthAuthorizationListing getOauthAuthorizations() throws IOException, ApiException {
    return  getOauthAuthorizations(createGetOauthAuthorizationsRequest());
  }

  /**
   * List clients that are authorized by the resource owner
   * 
   * @return OAuthAuthorizationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthAuthorizationListing> getOauthAuthorizationsWithHttpInfo() throws IOException {
    return getOauthAuthorizations(createGetOauthAuthorizationsRequest().withHttpInfo());
  }

  private GetOauthAuthorizationsRequest createGetOauthAuthorizationsRequest() {
    return GetOauthAuthorizationsRequest.builder()
            .build();
  }

  /**
   * List clients that are authorized by the resource owner
   * 
   * @param request The request object
   * @return OAuthAuthorizationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthAuthorizationListing getOauthAuthorizations(GetOauthAuthorizationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthAuthorizationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthAuthorizationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List clients that are authorized by the resource owner
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthAuthorizationListing> getOauthAuthorizations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthAuthorizationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthAuthorizationListing> response = (ApiResponse<OAuthAuthorizationListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthAuthorizationListing> response = (ApiResponse<OAuthAuthorizationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient getOauthClient(String clientId) throws IOException, ApiException {
    return  getOauthClient(createGetOauthClientRequest(clientId));
  }

  /**
   * Get OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> getOauthClientWithHttpInfo(String clientId) throws IOException {
    return getOauthClient(createGetOauthClientRequest(clientId).withHttpInfo());
  }

  private GetOauthClientRequest createGetOauthClientRequest(String clientId) {
    return GetOauthClientRequest.builder()
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Get OAuth Client
   * 
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient getOauthClient(GetOauthClientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get OAuth Client
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> getOauthClient(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the results of a usage query
   * 
   * @param executionId ID of the query execution (required)
   * @param clientId Client ID (required)
   * @return ApiUsageQueryResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ApiUsageQueryResult getOauthClientUsageQueryResult(String executionId, String clientId) throws IOException, ApiException {
    return  getOauthClientUsageQueryResult(createGetOauthClientUsageQueryResultRequest(executionId, clientId));
  }

  /**
   * Get the results of a usage query
   * 
   * @param executionId ID of the query execution (required)
   * @param clientId Client ID (required)
   * @return ApiUsageQueryResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ApiUsageQueryResult> getOauthClientUsageQueryResultWithHttpInfo(String executionId, String clientId) throws IOException {
    return getOauthClientUsageQueryResult(createGetOauthClientUsageQueryResultRequest(executionId, clientId).withHttpInfo());
  }

  private GetOauthClientUsageQueryResultRequest createGetOauthClientUsageQueryResultRequest(String executionId, String clientId) {
    return GetOauthClientUsageQueryResultRequest.builder()
            .withExecutionId(executionId)
    
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Get the results of a usage query
   * 
   * @param request The request object
   * @return ApiUsageQueryResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ApiUsageQueryResult getOauthClientUsageQueryResult(GetOauthClientUsageQueryResultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ApiUsageQueryResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ApiUsageQueryResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the results of a usage query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ApiUsageQueryResult> getOauthClientUsageQueryResult(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ApiUsageQueryResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ApiUsageQueryResult> response = (ApiResponse<ApiUsageQueryResult>)(ApiResponse<?>)exception;
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
      ApiResponse<ApiUsageQueryResult> response = (ApiResponse<ApiUsageQueryResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param days Previous number of days to query (optional, default to 7)
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult getOauthClientUsageSummary(String clientId, String days) throws IOException, ApiException {
    return  getOauthClientUsageSummary(createGetOauthClientUsageSummaryRequest(clientId, days));
  }

  /**
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param days Previous number of days to query (optional, default to 7)
   * @return UsageExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> getOauthClientUsageSummaryWithHttpInfo(String clientId, String days) throws IOException {
    return getOauthClientUsageSummary(createGetOauthClientUsageSummaryRequest(clientId, days).withHttpInfo());
  }

  private GetOauthClientUsageSummaryRequest createGetOauthClientUsageSummaryRequest(String clientId, String days) {
    return GetOauthClientUsageSummaryRequest.builder()
            .withClientId(clientId)
    
            .withDays(days)
    
            .build();
  }

  /**
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult getOauthClientUsageSummary(GetOauthClientUsageSummaryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsageExecutionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsageExecutionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> getOauthClientUsageSummary(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsageExecutionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)exception;
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
      ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of OAuth clients
   * 
   * @return OAuthClientEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClientEntityListing getOauthClients() throws IOException, ApiException {
    return  getOauthClients(createGetOauthClientsRequest());
  }

  /**
   * The list of OAuth clients
   * 
   * @return OAuthClientEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClientEntityListing> getOauthClientsWithHttpInfo() throws IOException {
    return getOauthClients(createGetOauthClientsRequest().withHttpInfo());
  }

  private GetOauthClientsRequest createGetOauthClientsRequest() {
    return GetOauthClientsRequest.builder()
            .build();
  }

  /**
   * The list of OAuth clients
   * 
   * @param request The request object
   * @return OAuthClientEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClientEntityListing getOauthClients(GetOauthClientsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClientEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClientEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of OAuth clients
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClientEntityListing> getOauthClients(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClientEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClientEntityListing> response = (ApiResponse<OAuthClientEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClientEntityListing> response = (ApiResponse<OAuthClientEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * An OAuth scope
   * 
   * @param scopeId Scope ID (required)
   * @param acceptLanguage The language with which to display the scope description. (optional, default to en-us)
   * @return OAuthScope
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthScope getOauthScope(String scopeId, String acceptLanguage) throws IOException, ApiException {
    return  getOauthScope(createGetOauthScopeRequest(scopeId, acceptLanguage));
  }

  /**
   * An OAuth scope
   * 
   * @param scopeId Scope ID (required)
   * @param acceptLanguage The language with which to display the scope description. (optional, default to en-us)
   * @return OAuthScope
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthScope> getOauthScopeWithHttpInfo(String scopeId, String acceptLanguage) throws IOException {
    return getOauthScope(createGetOauthScopeRequest(scopeId, acceptLanguage).withHttpInfo());
  }

  private GetOauthScopeRequest createGetOauthScopeRequest(String scopeId, String acceptLanguage) {
    return GetOauthScopeRequest.builder()
            .withScopeId(scopeId)
    
            .withAcceptLanguage(acceptLanguage)
    
            .build();
  }

  /**
   * An OAuth scope
   * 
   * @param request The request object
   * @return OAuthScope
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthScope getOauthScope(GetOauthScopeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthScope> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthScope>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * An OAuth scope
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthScope> getOauthScope(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthScope>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthScope> response = (ApiResponse<OAuthScope>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthScope> response = (ApiResponse<OAuthScope>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of OAuth scopes
   * 
   * @param acceptLanguage The language with which to display the scope descriptions. (optional, default to en-us)
   * @return OAuthScopeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthScopeListing getOauthScopes(String acceptLanguage) throws IOException, ApiException {
    return  getOauthScopes(createGetOauthScopesRequest(acceptLanguage));
  }

  /**
   * The list of OAuth scopes
   * 
   * @param acceptLanguage The language with which to display the scope descriptions. (optional, default to en-us)
   * @return OAuthScopeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthScopeListing> getOauthScopesWithHttpInfo(String acceptLanguage) throws IOException {
    return getOauthScopes(createGetOauthScopesRequest(acceptLanguage).withHttpInfo());
  }

  private GetOauthScopesRequest createGetOauthScopesRequest(String acceptLanguage) {
    return GetOauthScopesRequest.builder()
            .withAcceptLanguage(acceptLanguage)
    
            .build();
  }

  /**
   * The list of OAuth scopes
   * 
   * @param request The request object
   * @return OAuthScopeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthScopeListing getOauthScopes(GetOauthScopesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthScopeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthScopeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of OAuth scopes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthScopeListing> getOauthScopes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthScopeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthScopeListing> response = (ApiResponse<OAuthScopeListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthScopeListing> response = (ApiResponse<OAuthScopeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClientSecret(String clientId) throws IOException, ApiException {
    return  postOauthClientSecret(createPostOauthClientSecretRequest(clientId));
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClientSecretWithHttpInfo(String clientId) throws IOException {
    return postOauthClientSecret(createPostOauthClientSecretRequest(clientId).withHttpInfo());
  }

  private PostOauthClientSecretRequest createPostOauthClientSecretRequest(String clientId) {
    return PostOauthClientSecretRequest.builder()
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClientSecret(PostOauthClientSecretRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClientSecret(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postOauthClientUsageQuery(String clientId, ApiUsageQuery body) throws IOException, ApiException {
    return  postOauthClientUsageQuery(createPostOauthClientUsageQueryRequest(clientId, body));
  }

  /**
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postOauthClientUsageQueryWithHttpInfo(String clientId, ApiUsageQuery body) throws IOException {
    return postOauthClientUsageQuery(createPostOauthClientUsageQueryRequest(clientId, body).withHttpInfo());
  }

  private PostOauthClientUsageQueryRequest createPostOauthClientUsageQueryRequest(String clientId, ApiUsageQuery body) {
    return PostOauthClientUsageQueryRequest.builder()
            .withClientId(clientId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postOauthClientUsageQuery(PostOauthClientUsageQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsageExecutionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsageExecutionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postOauthClientUsageQuery(ApiRequest<ApiUsageQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsageExecutionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)exception;
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
      ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClients(OAuthClientRequest body) throws IOException, ApiException {
    return  postOauthClients(createPostOauthClientsRequest(body));
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param body Client (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClientsWithHttpInfo(OAuthClientRequest body) throws IOException {
    return postOauthClients(createPostOauthClientsRequest(body).withHttpInfo());
  }

  private PostOauthClientsRequest createPostOauthClientsRequest(OAuthClientRequest body) {
    return PostOauthClientsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClients(PostOauthClientsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClients(ApiRequest<OAuthClientRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update OAuth Client
   * 
   * @param clientId Client ID (required)
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient putOauthClient(String clientId, OAuthClientRequest body) throws IOException, ApiException {
    return  putOauthClient(createPutOauthClientRequest(clientId, body));
  }

  /**
   * Update OAuth Client
   * 
   * @param clientId Client ID (required)
   * @param body Client (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> putOauthClientWithHttpInfo(String clientId, OAuthClientRequest body) throws IOException {
    return putOauthClient(createPutOauthClientRequest(clientId, body).withHttpInfo());
  }

  private PutOauthClientRequest createPutOauthClientRequest(String clientId, OAuthClientRequest body) {
    return PutOauthClientRequest.builder()
            .withClientId(clientId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update OAuth Client
   * 
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient putOauthClient(PutOauthClientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update OAuth Client
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> putOauthClient(ApiRequest<OAuthClientRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
