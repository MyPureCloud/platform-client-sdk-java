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

import java.io.IOException;
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserrecording(String recordingId) throws IOException, ApiException {
     deleteUserrecording(createDeleteUserrecordingRequest(recordingId));
  }

  /**
   * Delete a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserrecordingWithHttpInfo(String recordingId) throws IOException {
    return deleteUserrecording(createDeleteUserrecordingRequest(recordingId).withHttpInfo());
  }

  private DeleteUserrecordingRequest createDeleteUserrecordingRequest(String recordingId) {
    return DeleteUserrecordingRequest.builder()
            .withRecordingId(recordingId)
    
            .build();
  }

  /**
   * Delete a user recording.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserrecording(DeleteUserrecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a user recording.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserrecording(ApiRequest<Void> request) throws IOException {
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
   * Get a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRecording getUserrecording(String recordingId, List<String> expand) throws IOException, ApiException {
    return  getUserrecording(createGetUserrecordingRequest(recordingId, expand));
  }

  /**
   * Get a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRecording> getUserrecordingWithHttpInfo(String recordingId, List<String> expand) throws IOException {
    return getUserrecording(createGetUserrecordingRequest(recordingId, expand).withHttpInfo());
  }

  private GetUserrecordingRequest createGetUserrecordingRequest(String recordingId, List<String> expand) {
    return GetUserrecordingRequest.builder()
            .withRecordingId(recordingId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a user recording.
   * 
   * @param request The request object
   * @return UserRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRecording getUserrecording(GetUserrecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRecording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRecording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user recording.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRecording> getUserrecording(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRecording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRecording> response = (ApiResponse<UserRecording>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRecording> response = (ApiResponse<UserRecording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Download a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return DownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DownloadResponse getUserrecordingMedia(String recordingId, String formatId) throws IOException, ApiException {
    return  getUserrecordingMedia(createGetUserrecordingMediaRequest(recordingId, formatId));
  }

  /**
   * Download a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param formatId The desired media format. (optional, default to WEBM)
   * @return DownloadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DownloadResponse> getUserrecordingMediaWithHttpInfo(String recordingId, String formatId) throws IOException {
    return getUserrecordingMedia(createGetUserrecordingMediaRequest(recordingId, formatId).withHttpInfo());
  }

  private GetUserrecordingMediaRequest createGetUserrecordingMediaRequest(String recordingId, String formatId) {
    return GetUserrecordingMediaRequest.builder()
            .withRecordingId(recordingId)
    
            .withFormatId(formatId)
    
            .build();
  }

  /**
   * Download a user recording.
   * 
   * @param request The request object
   * @return DownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DownloadResponse getUserrecordingMedia(GetUserrecordingMediaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DownloadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DownloadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Download a user recording.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DownloadResponse> getUserrecordingMedia(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DownloadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of user recordings.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecordingEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRecordingEntityListing getUserrecordings(Integer pageSize, Integer pageNumber, List<String> expand) throws IOException, ApiException {
    return  getUserrecordings(createGetUserrecordingsRequest(pageSize, pageNumber, expand));
  }

  /**
   * Get a list of user recordings.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecordingEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRecordingEntityListing> getUserrecordingsWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> expand) throws IOException {
    return getUserrecordings(createGetUserrecordingsRequest(pageSize, pageNumber, expand).withHttpInfo());
  }

  private GetUserrecordingsRequest createGetUserrecordingsRequest(Integer pageSize, Integer pageNumber, List<String> expand) {
    return GetUserrecordingsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a list of user recordings.
   * 
   * @param request The request object
   * @return UserRecordingEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRecordingEntityListing getUserrecordings(GetUserrecordingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRecordingEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRecordingEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of user recordings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRecordingEntityListing> getUserrecordings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRecordingEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRecordingEntityListing> response = (ApiResponse<UserRecordingEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRecordingEntityListing> response = (ApiResponse<UserRecordingEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get user recording summary
   * 
   * @return FaxSummary
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxSummary getUserrecordingsSummary() throws IOException, ApiException {
    return  getUserrecordingsSummary(createGetUserrecordingsSummaryRequest());
  }

  /**
   * Get user recording summary
   * 
   * @return FaxSummary
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxSummary> getUserrecordingsSummaryWithHttpInfo() throws IOException {
    return getUserrecordingsSummary(createGetUserrecordingsSummaryRequest().withHttpInfo());
  }

  private GetUserrecordingsSummaryRequest createGetUserrecordingsSummaryRequest() {
    return GetUserrecordingsSummaryRequest.builder()
            .build();
  }

  /**
   * Get user recording summary
   * 
   * @param request The request object
   * @return FaxSummary
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxSummary getUserrecordingsSummary(GetUserrecordingsSummaryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FaxSummary> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FaxSummary>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get user recording summary
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxSummary> getUserrecordingsSummary(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FaxSummary>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FaxSummary> response = (ApiResponse<FaxSummary>)(ApiResponse<?>)exception;
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
      ApiResponse<FaxSummary> response = (ApiResponse<FaxSummary>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param body UserRecording (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRecording putUserrecording(String recordingId, UserRecording body, List<String> expand) throws IOException, ApiException {
    return  putUserrecording(createPutUserrecordingRequest(recordingId, body, expand));
  }

  /**
   * Update a user recording.
   * 
   * @param recordingId User Recording ID (required)
   * @param body UserRecording (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserRecording
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRecording> putUserrecordingWithHttpInfo(String recordingId, UserRecording body, List<String> expand) throws IOException {
    return putUserrecording(createPutUserrecordingRequest(recordingId, body, expand).withHttpInfo());
  }

  private PutUserrecordingRequest createPutUserrecordingRequest(String recordingId, UserRecording body, List<String> expand) {
    return PutUserrecordingRequest.builder()
            .withRecordingId(recordingId)
    
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Update a user recording.
   * 
   * @param request The request object
   * @return UserRecording
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRecording putUserrecording(PutUserrecordingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRecording> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRecording>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user recording.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRecording> putUserrecording(ApiRequest<UserRecording> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRecording>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRecording> response = (ApiResponse<UserRecording>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRecording> response = (ApiResponse<UserRecording>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
