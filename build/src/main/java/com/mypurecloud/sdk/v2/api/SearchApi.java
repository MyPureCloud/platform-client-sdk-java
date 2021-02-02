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
import com.mypurecloud.sdk.v2.model.GKNDocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.DocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.TranscriptConversationDetailSearchRequest;
import com.mypurecloud.sdk.v2.model.GKNDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.DocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;
import com.mypurecloud.sdk.v2.model.SearchRequest;
import com.mypurecloud.sdk.v2.model.SuggestSearchRequest;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;


import com.mypurecloud.sdk.v2.api.request.GetDocumentationGknSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetSearchSuggestRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsTranscriptsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostDocumentationGknSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchSuggestRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTranscriptsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailSearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SearchApi {
  private final ApiClient pcapiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Search gkn documentation using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @return GKNDocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GKNDocumentationSearchResponse getDocumentationGknSearch(String q64) throws IOException, ApiException {
    return  getDocumentationGknSearch(createGetDocumentationGknSearchRequest(q64));
  }

  /**
   * Search gkn documentation using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @return GKNDocumentationSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GKNDocumentationSearchResponse> getDocumentationGknSearchWithHttpInfo(String q64) throws IOException {
    return getDocumentationGknSearch(createGetDocumentationGknSearchRequest(q64).withHttpInfo());
  }

  private GetDocumentationGknSearchRequest createGetDocumentationGknSearchRequest(String q64) {
    return GetDocumentationGknSearchRequest.builder()
            .withQ64(q64)
    
            .build();
  }

  /**
   * Search gkn documentation using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return GKNDocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GKNDocumentationSearchResponse getDocumentationGknSearch(GetDocumentationGknSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GKNDocumentationSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GKNDocumentationSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search gkn documentation using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GKNDocumentationSearchResponse> getDocumentationGknSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GKNDocumentationSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @return DocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentationSearchResponse getDocumentationSearch(String q64) throws IOException, ApiException {
    return  getDocumentationSearch(createGetDocumentationSearchRequest(q64));
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @return DocumentationSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentationSearchResponse> getDocumentationSearchWithHttpInfo(String q64) throws IOException {
    return getDocumentationSearch(createGetDocumentationSearchRequest(q64).withHttpInfo());
  }

  private GetDocumentationSearchRequest createGetDocumentationSearchRequest(String q64) {
    return GetDocumentationSearchRequest.builder()
            .withQ64(q64)
    
            .build();
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return DocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentationSearchResponse getDocumentationSearch(GetDocumentationSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentationSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentationSearchResponse> getDocumentationSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentationSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse getGroupsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getGroupsSearch(createGetGroupsSearchRequest(q64, expand));
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getGroupsSearch(createGetGroupsSearchRequest(q64, expand).withHttpInfo());
  }

  private GetGroupsSearchRequest createGetGroupsSearchRequest(String q64, List<String> expand) {
    return GetGroupsSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse getGroupsSearch(GetGroupsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GroupsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GroupsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand Provides more details about a specified resource (optional)
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse getLocationsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getLocationsSearch(createGetLocationsSearchRequest(q64, expand));
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand Provides more details about a specified resource (optional)
   * @return LocationsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getLocationsSearch(createGetLocationsSearchRequest(q64, expand).withHttpInfo());
  }

  private GetLocationsSearchRequest createGetLocationsSearchRequest(String q64, List<String> expand) {
    return GetLocationsSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse getLocationsSearch(GetLocationsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LocationsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LocationsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearch(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    return  getSearch(createGetSearchRequest(q64, expand, profile));
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchWithHttpInfo(String q64, List<String> expand, Boolean profile) throws IOException {
    return getSearch(createGetSearchRequest(q64, expand, profile).withHttpInfo());
  }

  private GetSearchRequest createGetSearchRequest(String q64, List<String> expand, Boolean profile) {
    return GetSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearch(GetSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearchSuggest(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    return  getSearchSuggest(createGetSearchSuggestRequest(q64, expand, profile));
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggestWithHttpInfo(String q64, List<String> expand, Boolean profile) throws IOException {
    return getSearchSuggest(createGetSearchSuggestRequest(q64, expand, profile).withHttpInfo());
  }

  private GetSearchSuggestRequest createGetSearchSuggestRequest(String q64, List<String> expand, Boolean profile) {
    return GetSearchSuggestRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearchSuggest(GetSearchSuggestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @param integrationPresenceSource integrationPresenceSource (optional)
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse getUsersSearch(String q64, List<String> expand, String integrationPresenceSource) throws IOException, ApiException {
    return  getUsersSearch(createGetUsersSearchRequest(q64, expand, integrationPresenceSource));
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @param integrationPresenceSource integrationPresenceSource (optional)
   * @return UsersSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> getUsersSearchWithHttpInfo(String q64, List<String> expand, String integrationPresenceSource) throws IOException {
    return getUsersSearch(createGetUsersSearchRequest(q64, expand, integrationPresenceSource).withHttpInfo());
  }

  private GetUsersSearchRequest createGetUsersSearchRequest(String q64, List<String> expand, String integrationPresenceSource) {
    return GetUsersSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .withIntegrationPresenceSource(integrationPresenceSource)
    
            .build();
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse getUsersSearch(GetUsersSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> getUsersSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse getVoicemailSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getVoicemailSearch(createGetVoicemailSearchRequest(q64, expand));
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getVoicemailSearch(createGetVoicemailSearchRequest(q64, expand).withHttpInfo());
  }

  private GetVoicemailSearchRequest createGetVoicemailSearchRequest(String q64, List<String> expand) {
    return GetVoicemailSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse getVoicemailSearch(GetVoicemailSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse postAnalyticsConversationsTranscriptsQuery(TranscriptConversationDetailSearchRequest body) throws IOException, ApiException {
    return  postAnalyticsConversationsTranscriptsQuery(createPostAnalyticsConversationsTranscriptsQueryRequest(body));
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> postAnalyticsConversationsTranscriptsQueryWithHttpInfo(TranscriptConversationDetailSearchRequest body) throws IOException {
    return postAnalyticsConversationsTranscriptsQuery(createPostAnalyticsConversationsTranscriptsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsTranscriptsQueryRequest createPostAnalyticsConversationsTranscriptsQueryRequest(TranscriptConversationDetailSearchRequest body) {
    return PostAnalyticsConversationsTranscriptsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse postAnalyticsConversationsTranscriptsQuery(PostAnalyticsConversationsTranscriptsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> postAnalyticsConversationsTranscriptsQuery(ApiRequest<TranscriptConversationDetailSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search gkn documentation
   * 
   * @param body Search request options (required)
   * @return GKNDocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GKNDocumentationSearchResponse postDocumentationGknSearch(GKNDocumentationSearchRequest body) throws IOException, ApiException {
    return  postDocumentationGknSearch(createPostDocumentationGknSearchRequest(body));
  }

  /**
   * Search gkn documentation
   * 
   * @param body Search request options (required)
   * @return GKNDocumentationSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GKNDocumentationSearchResponse> postDocumentationGknSearchWithHttpInfo(GKNDocumentationSearchRequest body) throws IOException {
    return postDocumentationGknSearch(createPostDocumentationGknSearchRequest(body).withHttpInfo());
  }

  private PostDocumentationGknSearchRequest createPostDocumentationGknSearchRequest(GKNDocumentationSearchRequest body) {
    return PostDocumentationGknSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search gkn documentation
   * 
   * @param request The request object
   * @return GKNDocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GKNDocumentationSearchResponse postDocumentationGknSearch(PostDocumentationGknSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GKNDocumentationSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GKNDocumentationSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search gkn documentation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GKNDocumentationSearchResponse> postDocumentationGknSearch(ApiRequest<GKNDocumentationSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GKNDocumentationSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search documentation
   * 
   * @param body Search request options (required)
   * @return DocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentationSearchResponse postDocumentationSearch(DocumentationSearchRequest body) throws IOException, ApiException {
    return  postDocumentationSearch(createPostDocumentationSearchRequest(body));
  }

  /**
   * Search documentation
   * 
   * @param body Search request options (required)
   * @return DocumentationSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentationSearchResponse> postDocumentationSearchWithHttpInfo(DocumentationSearchRequest body) throws IOException {
    return postDocumentationSearch(createPostDocumentationSearchRequest(body).withHttpInfo());
  }

  private PostDocumentationSearchRequest createPostDocumentationSearchRequest(DocumentationSearchRequest body) {
    return PostDocumentationSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search documentation
   * 
   * @param request The request object
   * @return DocumentationSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentationSearchResponse postDocumentationSearch(PostDocumentationSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentationSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search documentation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentationSearchResponse> postDocumentationSearch(ApiRequest<DocumentationSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentationSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse postGroupsSearch(GroupSearchRequest body) throws IOException, ApiException {
    return  postGroupsSearch(createPostGroupsSearchRequest(body));
  }

  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearchWithHttpInfo(GroupSearchRequest body) throws IOException {
    return postGroupsSearch(createPostGroupsSearchRequest(body).withHttpInfo());
  }

  private PostGroupsSearchRequest createPostGroupsSearchRequest(GroupSearchRequest body) {
    return PostGroupsSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search groups
   * 
   * @param request The request object
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse postGroupsSearch(PostGroupsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GroupsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearch(ApiRequest<GroupSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GroupsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search Documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (optional)
   * @return KnowledgeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSearchResponse postKnowledgeKnowledgebaseSearch(String knowledgeBaseId, KnowledgeSearchRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSearch(createPostKnowledgeKnowledgebaseSearchRequest(knowledgeBaseId, body));
  }

  /**
   * Search Documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (optional)
   * @return KnowledgeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearchWithHttpInfo(String knowledgeBaseId, KnowledgeSearchRequest body) throws IOException {
    return postKnowledgeKnowledgebaseSearch(createPostKnowledgeKnowledgebaseSearchRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSearchRequest createPostKnowledgeKnowledgebaseSearchRequest(String knowledgeBaseId, KnowledgeSearchRequest body) {
    return PostKnowledgeKnowledgebaseSearchRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Search Documents
   * 
   * @param request The request object
   * @return KnowledgeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSearchResponse postKnowledgeKnowledgebaseSearch(PostKnowledgeKnowledgebaseSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search Documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearch(ApiRequest<KnowledgeSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse postLocationsSearch(LocationSearchRequest body) throws IOException, ApiException {
    return  postLocationsSearch(createPostLocationsSearchRequest(body));
  }

  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearchWithHttpInfo(LocationSearchRequest body) throws IOException {
    return postLocationsSearch(createPostLocationsSearchRequest(body).withHttpInfo());
  }

  private PostLocationsSearchRequest createPostLocationsSearchRequest(LocationSearchRequest body) {
    return PostLocationsSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search locations
   * 
   * @param request The request object
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse postLocationsSearch(PostLocationsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LocationsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search locations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearch(ApiRequest<LocationSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LocationsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearch(SearchRequest body, Boolean profile) throws IOException, ApiException {
    return  postSearch(createPostSearchRequest(body, profile));
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchWithHttpInfo(SearchRequest body, Boolean profile) throws IOException {
    return postSearch(createPostSearchRequest(body, profile).withHttpInfo());
  }

  private PostSearchRequest createPostSearchRequest(SearchRequest body, Boolean profile) {
    return PostSearchRequest.builder()
            .withBody(body)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearch(PostSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearch(ApiRequest<SearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearchSuggest(SuggestSearchRequest body, Boolean profile) throws IOException, ApiException {
    return  postSearchSuggest(createPostSearchSuggestRequest(body, profile));
  }

  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggestWithHttpInfo(SuggestSearchRequest body, Boolean profile) throws IOException {
    return postSearchSuggest(createPostSearchSuggestRequest(body, profile).withHttpInfo());
  }

  private PostSearchSuggestRequest createPostSearchSuggestRequest(SuggestSearchRequest body, Boolean profile) {
    return PostSearchSuggestRequest.builder()
            .withBody(body)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Suggest resources.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearchSuggest(PostSearchSuggestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Suggest resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggest(ApiRequest<SuggestSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return JsonSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSearchResponse postSpeechandtextanalyticsTranscriptsSearch(TranscriptSearchRequest body) throws IOException, ApiException {
    return  postSpeechandtextanalyticsTranscriptsSearch(createPostSpeechandtextanalyticsTranscriptsSearchRequest(body));
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return JsonSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSearchResponse> postSpeechandtextanalyticsTranscriptsSearchWithHttpInfo(TranscriptSearchRequest body) throws IOException {
    return postSpeechandtextanalyticsTranscriptsSearch(createPostSpeechandtextanalyticsTranscriptsSearchRequest(body).withHttpInfo());
  }

  private PostSpeechandtextanalyticsTranscriptsSearchRequest createPostSpeechandtextanalyticsTranscriptsSearchRequest(TranscriptSearchRequest body) {
    return PostSpeechandtextanalyticsTranscriptsSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return JsonSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSearchResponse postSpeechandtextanalyticsTranscriptsSearch(PostSpeechandtextanalyticsTranscriptsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSearchResponse> postSpeechandtextanalyticsTranscriptsSearch(ApiRequest<TranscriptSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse postUsersSearch(UserSearchRequest body) throws IOException, ApiException {
    return  postUsersSearch(createPostUsersSearchRequest(body));
  }

  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> postUsersSearchWithHttpInfo(UserSearchRequest body) throws IOException {
    return postUsersSearch(createPostUsersSearchRequest(body).withHttpInfo());
  }

  private PostUsersSearchRequest createPostUsersSearchRequest(UserSearchRequest body) {
    return PostUsersSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search users
   * 
   * @param request The request object
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse postUsersSearch(PostUsersSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> postUsersSearch(ApiRequest<UserSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse postVoicemailSearch(VoicemailSearchRequest body) throws IOException, ApiException {
    return  postVoicemailSearch(createPostVoicemailSearchRequest(body));
  }

  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearchWithHttpInfo(VoicemailSearchRequest body) throws IOException {
    return postVoicemailSearch(createPostVoicemailSearchRequest(body).withHttpInfo());
  }

  private PostVoicemailSearchRequest createPostVoicemailSearchRequest(VoicemailSearchRequest body) {
    return PostVoicemailSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search voicemails
   * 
   * @param request The request object
   * @return VoicemailsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public VoicemailsSearchResponse postVoicemailSearch(PostVoicemailSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<VoicemailsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search voicemails
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearch(ApiRequest<VoicemailSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<VoicemailsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
