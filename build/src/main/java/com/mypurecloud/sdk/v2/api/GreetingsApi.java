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
import com.mypurecloud.sdk.v2.model.Greeting;
import com.mypurecloud.sdk.v2.model.GreetingMediaInfo;
import com.mypurecloud.sdk.v2.model.DomainEntityListing;
import com.mypurecloud.sdk.v2.model.DefaultGreetingList;
import com.mypurecloud.sdk.v2.model.GreetingListing;


import com.mypurecloud.sdk.v2.api.request.DeleteGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.PutGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PutGroupGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserGreetingsDefaultsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GreetingsApi {
  private final ApiClient pcapiClient;

  public GreetingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GreetingsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGreeting(String greetingId) throws IOException, ApiException {
    deleteGreetingWithHttpInfo(greetingId);
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteGreetingWithHttpInfo(String greetingId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'greetingId' is set
    if (greetingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'greetingId' when calling deleteGreeting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings/{greetingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "greetingId" + "\\}", pcapiClient.escapeString(greetingId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteGreeting(DeleteGreetingRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteGreeting(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public Greeting getGreeting(String greetingId) throws IOException, ApiException {
    return getGreetingWithHttpInfo(greetingId).getBody();
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> getGreetingWithHttpInfo(String greetingId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'greetingId' is set
    if (greetingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'greetingId' when calling getGreeting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings/{greetingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "greetingId" + "\\}", pcapiClient.escapeString(greetingId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Greeting>() {});
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Greeting getGreeting(GetGreetingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Greeting>() {});
  }

  /**
   * Get a Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> getGreeting(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Greeting>invokeAPIVerbose(request, new TypeReference<Greeting>() {});
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @param greetingId Greeting ID (required)
   * @param formatId The desired media format. (optional, default to WAV)
   * @return GreetingMediaInfo
   * @throws ApiException if fails to make API call
   */
  public GreetingMediaInfo getGreetingMedia(String greetingId, String formatId) throws IOException, ApiException {
    return getGreetingMediaWithHttpInfo(greetingId, formatId).getBody();
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @param greetingId Greeting ID (required)
   * @param formatId The desired media format. (optional, default to WAV)
   * @return GreetingMediaInfo
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GreetingMediaInfo> getGreetingMediaWithHttpInfo(String greetingId, String formatId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'greetingId' is set
    if (greetingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'greetingId' when calling getGreetingMedia");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings/{greetingId}/media".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "greetingId" + "\\}", pcapiClient.escapeString(greetingId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "formatId", formatId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GreetingMediaInfo>() {});
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GreetingMediaInfo getGreetingMedia(GetGreetingMediaRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GreetingMediaInfo>() {});
  }

  /**
   * Get media playback URI for this greeting
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GreetingMediaInfo> getGreetingMedia(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<GreetingMediaInfo>invokeAPIVerbose(request, new TypeReference<GreetingMediaInfo>() {});
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws ApiException if fails to make API call
   */
  public DomainEntityListing getGreetings(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getGreetingsWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEntityListing> getGreetingsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainEntityListing>() {});
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainEntityListing getGreetings(GetGreetingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {});
  }

  /**
   * Gets an Organization&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEntityListing> getGreetings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DomainEntityListing>invokeAPIVerbose(request, new TypeReference<DomainEntityListing>() {});
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList getGreetingsDefaults() throws IOException, ApiException {
    return getGreetingsDefaultsWithHttpInfo().getBody();
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> getGreetingsDefaultsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings/defaults".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList getGreetingsDefaults(GetGreetingsDefaultsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> getGreetingsDefaults(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerbose(request, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return GreetingListing
   * @throws ApiException if fails to make API call
   */
  public GreetingListing getGroupGreetings(String groupId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getGroupGreetingsWithHttpInfo(groupId, pageSize, pageNumber).getBody();
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return GreetingListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GreetingListing> getGroupGreetingsWithHttpInfo(String groupId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling getGroupGreetings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}/greetings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GreetingListing>() {});
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GreetingListing getGroupGreetings(GetGroupGreetingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GreetingListing>() {});
  }

  /**
   * Get a list of the Group&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GreetingListing> getGroupGreetings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<GreetingListing>invokeAPIVerbose(request, new TypeReference<GreetingListing>() {});
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param groupId Group ID (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList getGroupGreetingsDefaults(String groupId) throws IOException, ApiException {
    return getGroupGreetingsDefaultsWithHttpInfo(groupId).getBody();
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param groupId Group ID (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> getGroupGreetingsDefaultsWithHttpInfo(String groupId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling getGroupGreetingsDefaults");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}/greetings/defaults".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList getGroupGreetingsDefaults(GetGroupGreetingsDefaultsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> getGroupGreetingsDefaults(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerbose(request, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws ApiException if fails to make API call
   */
  public DomainEntityListing getUserGreetings(String userId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return getUserGreetingsWithHttpInfo(userId, pageSize, pageNumber).getBody();
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return DomainEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEntityListing> getUserGreetingsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling getUserGreetings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/greetings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainEntityListing>() {});
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainEntityListing getUserGreetings(GetUserGreetingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {});
  }

  /**
   * Get a list of the User&#39;s Greetings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainEntityListing> getUserGreetings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DomainEntityListing>invokeAPIVerbose(request, new TypeReference<DomainEntityListing>() {});
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param userId User ID (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList getUserGreetingsDefaults(String userId) throws IOException, ApiException {
    return getUserGreetingsDefaultsWithHttpInfo(userId).getBody();
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param userId User ID (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> getUserGreetingsDefaultsWithHttpInfo(String userId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling getUserGreetingsDefaults");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/greetings/defaults".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList getUserGreetingsDefaults(GetUserGreetingsDefaultsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> getUserGreetingsDefaults(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerbose(request, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @param body The Greeting to create (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList postGreetings(Greeting body) throws IOException, ApiException {
    return postGreetingsWithHttpInfo(body).getBody();
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @param body The Greeting to create (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> postGreetingsWithHttpInfo(Greeting body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postGreetings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList postGreetings(PostGreetingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Create a Greeting for an Organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> postGreetings(ApiRequest<Greeting> request) throws IOException, ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerbose(request, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @param groupId Group ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public Greeting postGroupGreetings(String groupId, Greeting body) throws IOException, ApiException {
    return postGroupGreetingsWithHttpInfo(groupId, body).getBody();
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @param groupId Group ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> postGroupGreetingsWithHttpInfo(String groupId, Greeting body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling postGroupGreetings");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postGroupGreetings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}/greetings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Greeting>() {});
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Greeting postGroupGreetings(PostGroupGreetingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Greeting>() {});
  }

  /**
   * Creates a Greeting for a Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> postGroupGreetings(ApiRequest<Greeting> request) throws IOException, ApiException {
    return pcapiClient.<Greeting>invokeAPIVerbose(request, new TypeReference<Greeting>() {});
  }

  /**
   * Creates a Greeting for a User
   * 
   * @param userId User ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public Greeting postUserGreetings(String userId, Greeting body) throws IOException, ApiException {
    return postUserGreetingsWithHttpInfo(userId, body).getBody();
  }

  /**
   * Creates a Greeting for a User
   * 
   * @param userId User ID (required)
   * @param body The Greeting to create (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> postUserGreetingsWithHttpInfo(String userId, Greeting body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling postUserGreetings");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postUserGreetings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/greetings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Greeting>() {});
  }

  /**
   * Creates a Greeting for a User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Greeting postUserGreetings(PostUserGreetingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Greeting>() {});
  }

  /**
   * Creates a Greeting for a User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> postUserGreetings(ApiRequest<Greeting> request) throws IOException, ApiException {
    return pcapiClient.<Greeting>invokeAPIVerbose(request, new TypeReference<Greeting>() {});
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @param body The updated Greeting (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public Greeting putGreeting(String greetingId, Greeting body) throws IOException, ApiException {
    return putGreetingWithHttpInfo(greetingId, body).getBody();
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @param greetingId Greeting ID (required)
   * @param body The updated Greeting (required)
   * @return Greeting
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> putGreetingWithHttpInfo(String greetingId, Greeting body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'greetingId' is set
    if (greetingId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'greetingId' when calling putGreeting");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putGreeting");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings/{greetingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "greetingId" + "\\}", pcapiClient.escapeString(greetingId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Greeting>() {});
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Greeting putGreeting(PutGreetingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Greeting>() {});
  }

  /**
   * Updates the Greeting with the given GreetingId
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Greeting> putGreeting(ApiRequest<Greeting> request) throws IOException, ApiException {
    return pcapiClient.<Greeting>invokeAPIVerbose(request, new TypeReference<Greeting>() {});
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList putGreetingsDefaults(DefaultGreetingList body) throws IOException, ApiException {
    return putGreetingsDefaultsWithHttpInfo(body).getBody();
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> putGreetingsDefaultsWithHttpInfo(DefaultGreetingList body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putGreetingsDefaults");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/greetings/defaults".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList putGreetingsDefaults(PutGreetingsDefaultsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> putGreetingsDefaults(ApiRequest<DefaultGreetingList> request) throws IOException, ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerbose(request, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param groupId Group ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList putGroupGreetingsDefaults(String groupId, DefaultGreetingList body) throws IOException, ApiException {
    return putGroupGreetingsDefaultsWithHttpInfo(groupId, body).getBody();
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param groupId Group ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> putGroupGreetingsDefaultsWithHttpInfo(String groupId, DefaultGreetingList body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling putGroupGreetingsDefaults");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putGroupGreetingsDefaults");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}/greetings/defaults".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList putGroupGreetingsDefaults(PutGroupGreetingsDefaultsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> putGroupGreetingsDefaults(ApiRequest<DefaultGreetingList> request) throws IOException, ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerbose(request, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param userId User ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList putUserGreetingsDefaults(String userId, DefaultGreetingList body) throws IOException, ApiException {
    return putUserGreetingsDefaultsWithHttpInfo(userId, body).getBody();
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param userId User ID (required)
   * @param body The updated defaultGreetingList (required)
   * @return DefaultGreetingList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> putUserGreetingsDefaultsWithHttpInfo(String userId, DefaultGreetingList body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling putUserGreetingsDefaults");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putUserGreetingsDefaults");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/greetings/defaults".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DefaultGreetingList putUserGreetingsDefaults(PutUserGreetingsDefaultsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {});
  }

  /**
   * Updates the DefaultGreetingList of the specified User
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DefaultGreetingList> putUserGreetingsDefaults(ApiRequest<DefaultGreetingList> request) throws IOException, ApiException {
    return pcapiClient.<DefaultGreetingList>invokeAPIVerbose(request, new TypeReference<DefaultGreetingList>() {});
  }

}
