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
import com.mypurecloud.sdk.v2.model.DocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.DocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;
import com.mypurecloud.sdk.v2.model.SearchRequest;
import com.mypurecloud.sdk.v2.model.SuggestSearchRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;


import com.mypurecloud.sdk.v2.api.request.GetDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetSearchSuggestRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchSuggestRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class SearchApiAsync {
  private final ApiClient pcapiClient;

  public SearchApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DocumentationSearchResponse> getDocumentationSearchAsync(GetDocumentationSearchRequest request, AsyncApiCallback<DocumentationSearchResponse> callback) throws ApiException {
    return pcapiClient.<DocumentationSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {}, callback);
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DocumentationSearchResponse>> getDocumentationSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DocumentationSearchResponse>> callback) throws ApiException {
    return pcapiClient.<DocumentationSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<DocumentationSearchResponse>() {}, callback);
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GroupsSearchResponse> getGroupsSearchAsync(GetGroupsSearchRequest request, AsyncApiCallback<GroupsSearchResponse> callback) throws ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GroupsSearchResponse>> getGroupsSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<GroupsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocationsSearchResponse> getLocationsSearchAsync(GetLocationsSearchRequest request, AsyncApiCallback<LocationsSearchResponse> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, callback);
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocationsSearchResponse>> getLocationsSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<LocationsSearchResponse>() {}, callback);
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> getSearchAsync(GetSearchRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> getSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> getSearchSuggestAsync(GetSearchSuggestRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> getSearchSuggestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UsersSearchResponse> getUsersSearchAsync(GetUsersSearchRequest request, AsyncApiCallback<UsersSearchResponse> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UsersSearchResponse>> getUsersSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailsSearchResponse> getVoicemailSearchAsync(GetVoicemailSearchRequest request, AsyncApiCallback<VoicemailsSearchResponse> callback) throws ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailsSearchResponse>> getVoicemailSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

  /**
   * Search documentation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DocumentationSearchResponse> postDocumentationSearchAsync(PostDocumentationSearchRequest request, AsyncApiCallback<DocumentationSearchResponse> callback) throws ApiException {
    return pcapiClient.<DocumentationSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {}, callback);
  }

  /**
   * Search documentation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DocumentationSearchResponse>> postDocumentationSearchAsync(ApiRequest<DocumentationSearchRequest> request, AsyncApiCallback<ApiResponse<DocumentationSearchResponse>> callback) throws ApiException {
    return pcapiClient.<DocumentationSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<DocumentationSearchResponse>() {}, callback);
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GroupsSearchResponse> postGroupsSearchAsync(PostGroupsSearchRequest request, AsyncApiCallback<GroupsSearchResponse> callback) throws ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GroupsSearchResponse>> postGroupsSearchAsync(ApiRequest<GroupSearchRequest> request, AsyncApiCallback<ApiResponse<GroupsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocationsSearchResponse> postLocationsSearchAsync(PostLocationsSearchRequest request, AsyncApiCallback<LocationsSearchResponse> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, callback);
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocationsSearchResponse>> postLocationsSearchAsync(ApiRequest<LocationSearchRequest> request, AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<LocationsSearchResponse>() {}, callback);
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> postSearchAsync(PostSearchRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> postSearchAsync(ApiRequest<SearchRequest> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> postSearchSuggestAsync(PostSearchSuggestRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> postSearchSuggestAsync(ApiRequest<SuggestSearchRequest> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UsersSearchResponse> postUsersSearchAsync(PostUsersSearchRequest request, AsyncApiCallback<UsersSearchResponse> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UsersSearchResponse>> postUsersSearchAsync(ApiRequest<UserSearchRequest> request, AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<VoicemailsSearchResponse> postVoicemailSearchAsync(PostVoicemailSearchRequest request, AsyncApiCallback<VoicemailsSearchResponse> callback) throws ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<VoicemailsSearchResponse>> postVoicemailSearchAsync(ApiRequest<VoicemailSearchRequest> request, AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<VoicemailsSearchResponse>() {}, callback);
  }

}
