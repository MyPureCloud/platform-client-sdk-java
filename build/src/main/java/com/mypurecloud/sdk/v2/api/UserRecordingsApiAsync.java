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
import java.util.concurrent.Future;


public class UserRecordingsApiAsync {
  private final ApiClient pcapiClient;

  public UserRecordingsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public UserRecordingsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteUserrecordingAsync(DeleteUserrecordingRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteUserrecordingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserRecording> getUserrecordingAsync(GetUserrecordingRequest request, AsyncApiCallback<UserRecording> callback) throws ApiException {
    return pcapiClient.<UserRecording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserRecording>() {}, callback);
  }

  /**
   * Get a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserRecording>> getUserrecordingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserRecording>> callback) throws ApiException {
    return pcapiClient.<UserRecording>invokeAPIVerboseAsync(request, new TypeReference<UserRecording>() {}, callback);
  }

  /**
   * Download a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DownloadResponse> getUserrecordingMediaAsync(GetUserrecordingMediaRequest request, AsyncApiCallback<DownloadResponse> callback) throws ApiException {
    return pcapiClient.<DownloadResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DownloadResponse>() {}, callback);
  }

  /**
   * Download a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DownloadResponse>> getUserrecordingMediaAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DownloadResponse>> callback) throws ApiException {
    return pcapiClient.<DownloadResponse>invokeAPIVerboseAsync(request, new TypeReference<DownloadResponse>() {}, callback);
  }

  /**
   * Get a list of user recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserRecordingEntityListing> getUserrecordingsAsync(GetUserrecordingsRequest request, AsyncApiCallback<UserRecordingEntityListing> callback) throws ApiException {
    return pcapiClient.<UserRecordingEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserRecordingEntityListing>() {}, callback);
  }

  /**
   * Get a list of user recordings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserRecordingEntityListing>> getUserrecordingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserRecordingEntityListing>> callback) throws ApiException {
    return pcapiClient.<UserRecordingEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserRecordingEntityListing>() {}, callback);
  }

  /**
   * Get user recording summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FaxSummary> getUserrecordingsSummaryAsync(GetUserrecordingsSummaryRequest request, AsyncApiCallback<FaxSummary> callback) throws ApiException {
    return pcapiClient.<FaxSummary>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FaxSummary>() {}, callback);
  }

  /**
   * Get user recording summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FaxSummary>> getUserrecordingsSummaryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FaxSummary>> callback) throws ApiException {
    return pcapiClient.<FaxSummary>invokeAPIVerboseAsync(request, new TypeReference<FaxSummary>() {}, callback);
  }

  /**
   * Update a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserRecording> putUserrecordingAsync(PutUserrecordingRequest request, AsyncApiCallback<UserRecording> callback) throws ApiException {
    return pcapiClient.<UserRecording>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserRecording>() {}, callback);
  }

  /**
   * Update a user recording.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserRecording>> putUserrecordingAsync(ApiRequest<UserRecording> request, AsyncApiCallback<ApiResponse<UserRecording>> callback) throws ApiException {
    return pcapiClient.<UserRecording>invokeAPIVerboseAsync(request, new TypeReference<UserRecording>() {}, callback);
  }

}
