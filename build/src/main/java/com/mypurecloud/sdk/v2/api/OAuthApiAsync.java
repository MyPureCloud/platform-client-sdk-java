package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OAuthClient;
import com.mypurecloud.sdk.v2.model.OAuthClientEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientSecretRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.PutOauthClientRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class OAuthApiAsync {
  private final ApiClient pcapiClient;

  public OAuthApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteOauthClientAsync(DeleteOauthClientRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteOauthClientAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthClient> getOauthClientAsync(GetOauthClientRequest request, AsyncApiCallback<OAuthClient> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, callback);
  }

  /**
   * Get OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthClient>> getOauthClientAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OAuthClient>> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerboseAsync(request, new TypeReference<OAuthClient>() {}, callback);
  }

  /**
   * The list of OAuth clients
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthClientEntityListing> getOauthClientsAsync(GetOauthClientsRequest request, AsyncApiCallback<OAuthClientEntityListing> callback) throws ApiException {
    return pcapiClient.<OAuthClientEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthClientEntityListing>() {}, callback);
  }

  /**
   * The list of OAuth clients
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthClientEntityListing>> getOauthClientsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OAuthClientEntityListing>> callback) throws ApiException {
    return pcapiClient.<OAuthClientEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OAuthClientEntityListing>() {}, callback);
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthClient> postOauthClientSecretAsync(PostOauthClientSecretRequest request, AsyncApiCallback<OAuthClient> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, callback);
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthClient>> postOauthClientSecretAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OAuthClient>> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerboseAsync(request, new TypeReference<OAuthClient>() {}, callback);
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthClient> postOauthClientsAsync(PostOauthClientsRequest request, AsyncApiCallback<OAuthClient> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, callback);
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthClient>> postOauthClientsAsync(ApiRequest<OAuthClient> request, AsyncApiCallback<ApiResponse<OAuthClient>> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerboseAsync(request, new TypeReference<OAuthClient>() {}, callback);
  }

  /**
   * Update OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OAuthClient> putOauthClientAsync(PutOauthClientRequest request, AsyncApiCallback<OAuthClient> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, callback);
  }

  /**
   * Update OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OAuthClient>> putOauthClientAsync(ApiRequest<OAuthClient> request, AsyncApiCallback<ApiResponse<OAuthClient>> callback) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerboseAsync(request, new TypeReference<OAuthClient>() {}, callback);
  }

}
