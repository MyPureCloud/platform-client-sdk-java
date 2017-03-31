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
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @return DocumentationSearchResponse
   * @throws ApiException if fails to make API call
   */
  public DocumentationSearchResponse getDocumentationSearch(String q64) throws IOException, ApiException {
    return getDocumentationSearchWithHttpInfo(q64).getBody();
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @return DocumentationSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentationSearchResponse> getDocumentationSearchWithHttpInfo(String q64) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getDocumentationSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/documentation/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DocumentationSearchResponse>() {});
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DocumentationSearchResponse getDocumentationSearch(GetDocumentationSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {});
  }

  /**
   * Search documentation using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentationSearchResponse> getDocumentationSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DocumentationSearchResponse>invokeAPIVerbose(request, new TypeReference<DocumentationSearchResponse>() {});
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse getGroupsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return getGroupsSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearchWithHttpInfo(String q64, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getGroupsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse getGroupsSearch(GetGroupsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerbose(request, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse getLocationsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return getLocationsSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearchWithHttpInfo(String q64, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getLocationsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/locations/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse getLocationsSearch(GetLocationsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerbose(request, new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearch(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    return getSearchWithHttpInfo(q64, expand, profile).getBody();
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchWithHttpInfo(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearch(GetSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearchSuggest(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    return getSearchSuggestWithHttpInfo(q64, expand, profile).getBody();
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggestWithHttpInfo(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getSearchSuggest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search/suggest".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearchSuggest(GetSearchSuggestRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggest(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse getUsersSearch(String q64, List<String> expand) throws IOException, ApiException {
    return getUsersSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> getUsersSearchWithHttpInfo(String q64, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getUsersSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse getUsersSearch(GetUsersSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> getUsersSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerbose(request, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse getVoicemailSearch(String q64, List<String> expand) throws IOException, ApiException {
    return getVoicemailSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearchWithHttpInfo(String q64, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getVoicemailSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse getVoicemailSearch(GetVoicemailSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> getVoicemailSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerbose(request, new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search documentation
   * 
   * @param body Search request options (required)
   * @return DocumentationSearchResponse
   * @throws ApiException if fails to make API call
   */
  public DocumentationSearchResponse postDocumentationSearch(DocumentationSearchRequest body) throws IOException, ApiException {
    return postDocumentationSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search documentation
   * 
   * @param body Search request options (required)
   * @return DocumentationSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentationSearchResponse> postDocumentationSearchWithHttpInfo(DocumentationSearchRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postDocumentationSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/documentation/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DocumentationSearchResponse>() {});
  }

  /**
   * Search documentation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DocumentationSearchResponse postDocumentationSearch(PostDocumentationSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {});
  }

  /**
   * Search documentation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DocumentationSearchResponse> postDocumentationSearch(ApiRequest<DocumentationSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<DocumentationSearchResponse>invokeAPIVerbose(request, new TypeReference<DocumentationSearchResponse>() {});
  }

  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse postGroupsSearch(GroupSearchRequest body) throws IOException, ApiException {
    return postGroupsSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearchWithHttpInfo(GroupSearchRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postGroupsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse postGroupsSearch(PostGroupsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearch(ApiRequest<GroupSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerbose(request, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse postLocationsSearch(LocationSearchRequest body) throws IOException, ApiException {
    return postLocationsSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearchWithHttpInfo(LocationSearchRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postLocationsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/locations/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse postLocationsSearch(PostLocationsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearch(ApiRequest<LocationSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerbose(request, new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearch(SearchRequest body, Boolean profile) throws IOException, ApiException {
    return postSearchWithHttpInfo(body, profile).getBody();
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchWithHttpInfo(SearchRequest body, Boolean profile) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearch(PostSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearch(ApiRequest<SearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearchSuggest(SuggestSearchRequest body, Boolean profile) throws IOException, ApiException {
    return postSearchSuggestWithHttpInfo(body, profile).getBody();
  }

  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggestWithHttpInfo(SuggestSearchRequest body, Boolean profile) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postSearchSuggest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search/suggest".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearchSuggest(PostSearchSuggestRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggest(ApiRequest<SuggestSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse postUsersSearch(UserSearchRequest body) throws IOException, ApiException {
    return postUsersSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> postUsersSearchWithHttpInfo(UserSearchRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postUsersSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse postUsersSearch(PostUsersSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> postUsersSearch(ApiRequest<UserSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerbose(request, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse postVoicemailSearch(VoicemailSearchRequest body) throws IOException, ApiException {
    return postVoicemailSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search voicemails
   * 
   * @param body Search request options (required)
   * @return VoicemailsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearchWithHttpInfo(VoicemailSearchRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postVoicemailSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/voicemail/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public VoicemailsSearchResponse postVoicemailSearch(PostVoicemailSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {});
  }

  /**
   * Search voicemails
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoicemailsSearchResponse> postVoicemailSearch(ApiRequest<VoicemailSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<VoicemailsSearchResponse>invokeAPIVerbose(request, new TypeReference<VoicemailsSearchResponse>() {});
  }

}
