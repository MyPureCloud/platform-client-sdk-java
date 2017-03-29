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
import com.mypurecloud.sdk.v2.model.UserRecording;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.UserRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSummary;


import com.mypurecloud.sdk.v2.api.request.DeleteUserrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserrecordingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserrecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserrecordingsSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserrecordingRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserRecordingsApi {
  private final ApiClient pcapiClient;

  public UserRecordingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserRecordingsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserrecording(String recordingId) throws ApiException {
    deleteUserrecordingWithHttpInfo(recordingId);
  }

  /**
   * Delete a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserrecordingWithHttpInfo(String recordingId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingId' when calling deleteUserrecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/userrecordings/{recordingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

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
   * Delete a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteUserrecording(DeleteUserrecordingRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserrecording(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws ApiException if fails to make API call
   */
  public UserRecording getUserrecording(String recordingId, List<String> expand) throws ApiException {
    return getUserrecordingWithHttpInfo(recordingId, expand).getBody();
  }

  /**
   * Get a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRecording> getUserrecordingWithHttpInfo(String recordingId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingId' when calling getUserrecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/userrecordings/{recordingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserRecording>() {});
  }

  /**
   * Get a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserRecording getUserrecording(GetUserrecordingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserRecording>() {});
  }

  /**
   * Get a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRecording> getUserrecording(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserRecording>invokeAPIVerbose(request, new TypeReference<UserRecording>() {});
  }

  /**
   * Download a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return DownloadResponse
   * @throws ApiException if fails to make API call
   */
  public DownloadResponse getUserrecordingMedia(String recordingId, String formatId) throws ApiException {
    return getUserrecordingMediaWithHttpInfo(recordingId, formatId).getBody();
  }

  /**
   * Download a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return DownloadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DownloadResponse> getUserrecordingMediaWithHttpInfo(String recordingId, String formatId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingId' when calling getUserrecordingMedia");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/userrecordings/{recordingId}/media".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DownloadResponse>() {});
  }

  /**
   * Download a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DownloadResponse getUserrecordingMedia(GetUserrecordingMediaRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DownloadResponse>() {});
  }

  /**
   * Download a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DownloadResponse> getUserrecordingMedia(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DownloadResponse>invokeAPIVerbose(request, new TypeReference<DownloadResponse>() {});
  }

  /**
   * Get a list of user recordings.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecordingEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserRecordingEntityListing getUserrecordings(Integer pageSize, Integer pageNumber, List<String> expand) throws ApiException {
    return getUserrecordingsWithHttpInfo(pageSize, pageNumber, expand).getBody();
  }

  /**
   * Get a list of user recordings.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecordingEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRecordingEntityListing> getUserrecordingsWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/userrecordings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserRecordingEntityListing>() {});
  }

  /**
   * Get a list of user recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserRecordingEntityListing getUserrecordings(GetUserrecordingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserRecordingEntityListing>() {});
  }

  /**
   * Get a list of user recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRecordingEntityListing> getUserrecordings(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserRecordingEntityListing>invokeAPIVerbose(request, new TypeReference<UserRecordingEntityListing>() {});
  }

  /**
   * Get user recording summary
   * 
   * @return FaxSummary
   * @throws ApiException if fails to make API call
   */
  public FaxSummary getUserrecordingsSummary() throws ApiException {
    return getUserrecordingsSummaryWithHttpInfo().getBody();
  }

  /**
   * Get user recording summary
   * 
   * @return FaxSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxSummary> getUserrecordingsSummaryWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/userrecordings/summary".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FaxSummary>() {});
  }

  /**
   * Get user recording summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FaxSummary getUserrecordingsSummary(GetUserrecordingsSummaryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FaxSummary>() {});
  }

  /**
   * Get user recording summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxSummary> getUserrecordingsSummary(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<FaxSummary>invokeAPIVerbose(request, new TypeReference<FaxSummary>() {});
  }

  /**
   * Update a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param body UserRecording (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws ApiException if fails to make API call
   */
  public UserRecording putUserrecording(String recordingId, UserRecording body, List<String> expand) throws ApiException {
    return putUserrecordingWithHttpInfo(recordingId, body, expand).getBody();
  }

  /**
   * Update a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param body UserRecording (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRecording> putUserrecordingWithHttpInfo(String recordingId, UserRecording body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingId' when calling putUserrecording");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putUserrecording");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/userrecordings/{recordingId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "recordingId" + "\\}", pcapiClient.escapeString(recordingId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserRecording>() {});
  }

  /**
   * Update a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserRecording putUserrecording(PutUserrecordingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserRecording>() {});
  }

  /**
   * Update a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRecording> putUserrecording(ApiRequest<UserRecording> request) throws ApiException {
    return pcapiClient.<UserRecording>invokeAPIVerbose(request, new TypeReference<UserRecording>() {});
  }

}
