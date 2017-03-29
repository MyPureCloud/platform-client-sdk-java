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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;


import com.mypurecloud.sdk.v2.api.request.DeletePresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSystempresencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresencedefinitionRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class PresenceApiAsync {
  private final ApiClient pcapiClient;

  public PresenceApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public PresenceApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deletePresencedefinitionAsync(DeletePresencedefinitionRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deletePresencedefinitionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationPresence> getPresencedefinitionAsync(GetPresencedefinitionRequest request, AsyncApiCallback<OrganizationPresence> callback) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {}, callback);
  }

  /**
   * Get a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationPresence>> getPresencedefinitionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrganizationPresence>> callback) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIVerboseAsync(request, new TypeReference<OrganizationPresence>() {}, callback);
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationPresenceEntityListing> getPresencedefinitionsAsync(GetPresencedefinitionsRequest request, AsyncApiCallback<OrganizationPresenceEntityListing> callback) throws ApiException {
    return pcapiClient.<OrganizationPresenceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationPresenceEntityListing>() {}, callback);
  }

  /**
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationPresenceEntityListing>> getPresencedefinitionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrganizationPresenceEntityListing>> callback) throws ApiException {
    return pcapiClient.<OrganizationPresenceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OrganizationPresenceEntityListing>() {}, callback);
  }

  /**
   * Get the list of SystemPresences
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<SystemPresence>> getSystempresencesAsync(GetSystempresencesRequest request, AsyncApiCallback<List<SystemPresence>> callback) throws ApiException {
    return pcapiClient.<List<SystemPresence>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<SystemPresence>>() {}, callback);
  }

  /**
   * Get the list of SystemPresences
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<SystemPresence>>> getSystempresencesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<SystemPresence>>> callback) throws ApiException {
    return pcapiClient.<List<SystemPresence>>invokeAPIVerboseAsync(request, new TypeReference<List<SystemPresence>>() {}, callback);
  }

  /**
   * Get a user&#39;s Presence
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresence> getUserPresenceAsync(GetUserPresenceRequest request, AsyncApiCallback<UserPresence> callback) throws ApiException {
    return pcapiClient.<UserPresence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresence>() {}, callback);
  }

  /**
   * Get a user&#39;s Presence
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresence>> getUserPresenceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresence>> callback) throws ApiException {
    return pcapiClient.<UserPresence>invokeAPIVerboseAsync(request, new TypeReference<UserPresence>() {}, callback);
  }

  /**
   * Patch a user&#39;s Presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresence> patchUserPresenceAsync(PatchUserPresenceRequest request, AsyncApiCallback<UserPresence> callback) throws ApiException {
    return pcapiClient.<UserPresence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresence>() {}, callback);
  }

  /**
   * Patch a user&#39;s Presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresence>> patchUserPresenceAsync(ApiRequest<UserPresence> request, AsyncApiCallback<ApiResponse<UserPresence>> callback) throws ApiException {
    return pcapiClient.<UserPresence>invokeAPIVerboseAsync(request, new TypeReference<UserPresence>() {}, callback);
  }

  /**
   * Create a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationPresence> postPresencedefinitionsAsync(PostPresencedefinitionsRequest request, AsyncApiCallback<OrganizationPresence> callback) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {}, callback);
  }

  /**
   * Create a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationPresence>> postPresencedefinitionsAsync(ApiRequest<OrganizationPresence> request, AsyncApiCallback<ApiResponse<OrganizationPresence>> callback) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIVerboseAsync(request, new TypeReference<OrganizationPresence>() {}, callback);
  }

  /**
   * Update a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationPresence> putPresencedefinitionAsync(PutPresencedefinitionRequest request, AsyncApiCallback<OrganizationPresence> callback) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {}, callback);
  }

  /**
   * Update a Presence Definition
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationPresence>> putPresencedefinitionAsync(ApiRequest<OrganizationPresence> request, AsyncApiCallback<ApiResponse<OrganizationPresence>> callback) throws ApiException {
    return pcapiClient.<OrganizationPresence>invokeAPIVerboseAsync(request, new TypeReference<OrganizationPresence>() {}, callback);
  }

}
