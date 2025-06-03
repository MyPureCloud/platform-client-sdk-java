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
import com.mypurecloud.sdk.v2.model.LogCaptureDownloadExecutionResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryRequest;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfiguration;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationListing;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteDiagnosticsLogcaptureBrowserUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetDiagnosticsLogcaptureBrowserUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetDiagnosticsLogcaptureBrowserUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostDiagnosticsLogcaptureBrowserEntriesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostDiagnosticsLogcaptureBrowserUserRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogCaptureApi {
  private final ApiClient pcapiClient;

  public LogCaptureApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogCaptureApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Disable browser log capture for the user
   * 
   * @param userId The id of the user to disable browser log capture (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteDiagnosticsLogcaptureBrowserUser(String userId) throws IOException, ApiException {
     deleteDiagnosticsLogcaptureBrowserUser(createDeleteDiagnosticsLogcaptureBrowserUserRequest(userId));
  }

  /**
   * Disable browser log capture for the user
   * 
   * @param userId The id of the user to disable browser log capture (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteDiagnosticsLogcaptureBrowserUserWithHttpInfo(String userId) throws IOException {
    return deleteDiagnosticsLogcaptureBrowserUser(createDeleteDiagnosticsLogcaptureBrowserUserRequest(userId).withHttpInfo());
  }

  private DeleteDiagnosticsLogcaptureBrowserUserRequest createDeleteDiagnosticsLogcaptureBrowserUserRequest(String userId) {
    return DeleteDiagnosticsLogcaptureBrowserUserRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Disable browser log capture for the user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteDiagnosticsLogcaptureBrowserUser(DeleteDiagnosticsLogcaptureBrowserUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Disable browser log capture for the user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteDiagnosticsLogcaptureBrowserUser(ApiRequest<Void> request) throws IOException {
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
   * Gets status of async download execution
   * 
   * @param jobId Job ID (required)
   * @return LogCaptureDownloadExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureDownloadExecutionResponse getDiagnosticsLogcaptureBrowserEntriesDownloadJob(String jobId) throws IOException, ApiException {
    return  getDiagnosticsLogcaptureBrowserEntriesDownloadJob(createGetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest(jobId));
  }

  /**
   * Gets status of async download execution
   * 
   * @param jobId Job ID (required)
   * @return LogCaptureDownloadExecutionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureDownloadExecutionResponse> getDiagnosticsLogcaptureBrowserEntriesDownloadJobWithHttpInfo(String jobId) throws IOException {
    return getDiagnosticsLogcaptureBrowserEntriesDownloadJob(createGetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest(jobId).withHttpInfo());
  }

  private GetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest createGetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest(String jobId) {
    return GetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Gets status of async download execution
   * 
   * @param request The request object
   * @return LogCaptureDownloadExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureDownloadExecutionResponse getDiagnosticsLogcaptureBrowserEntriesDownloadJob(GetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogCaptureDownloadExecutionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogCaptureDownloadExecutionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets status of async download execution
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureDownloadExecutionResponse> getDiagnosticsLogcaptureBrowserEntriesDownloadJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogCaptureDownloadExecutionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get log capture configuration for the user
   * 
   * @param userId The id of the user to get browser log capture configuration (required)
   * @return LogCaptureUserConfigurationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureUserConfigurationResponse getDiagnosticsLogcaptureBrowserUser(String userId) throws IOException, ApiException {
    return  getDiagnosticsLogcaptureBrowserUser(createGetDiagnosticsLogcaptureBrowserUserRequest(userId));
  }

  /**
   * Get log capture configuration for the user
   * 
   * @param userId The id of the user to get browser log capture configuration (required)
   * @return LogCaptureUserConfigurationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureUserConfigurationResponse> getDiagnosticsLogcaptureBrowserUserWithHttpInfo(String userId) throws IOException {
    return getDiagnosticsLogcaptureBrowserUser(createGetDiagnosticsLogcaptureBrowserUserRequest(userId).withHttpInfo());
  }

  private GetDiagnosticsLogcaptureBrowserUserRequest createGetDiagnosticsLogcaptureBrowserUserRequest(String userId) {
    return GetDiagnosticsLogcaptureBrowserUserRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get log capture configuration for the user
   * 
   * @param request The request object
   * @return LogCaptureUserConfigurationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureUserConfigurationResponse getDiagnosticsLogcaptureBrowserUser(GetDiagnosticsLogcaptureBrowserUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogCaptureUserConfigurationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogCaptureUserConfigurationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get log capture configuration for the user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureUserConfigurationResponse> getDiagnosticsLogcaptureBrowserUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogCaptureUserConfigurationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogCaptureUserConfigurationResponse> response = (ApiResponse<LogCaptureUserConfigurationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LogCaptureUserConfigurationResponse> response = (ApiResponse<LogCaptureUserConfigurationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all log capture enabled users for an org
   * 
   * @param includeExpired Include expired users with log captures still available for search or download (optional, default to false)
   * @return LogCaptureUserConfigurationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureUserConfigurationListing getDiagnosticsLogcaptureBrowserUsers(Boolean includeExpired) throws IOException, ApiException {
    return  getDiagnosticsLogcaptureBrowserUsers(createGetDiagnosticsLogcaptureBrowserUsersRequest(includeExpired));
  }

  /**
   * Get all log capture enabled users for an org
   * 
   * @param includeExpired Include expired users with log captures still available for search or download (optional, default to false)
   * @return LogCaptureUserConfigurationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureUserConfigurationListing> getDiagnosticsLogcaptureBrowserUsersWithHttpInfo(Boolean includeExpired) throws IOException {
    return getDiagnosticsLogcaptureBrowserUsers(createGetDiagnosticsLogcaptureBrowserUsersRequest(includeExpired).withHttpInfo());
  }

  private GetDiagnosticsLogcaptureBrowserUsersRequest createGetDiagnosticsLogcaptureBrowserUsersRequest(Boolean includeExpired) {
    return GetDiagnosticsLogcaptureBrowserUsersRequest.builder()
            .withIncludeExpired(includeExpired)

            .build();
  }

  /**
   * Get all log capture enabled users for an org
   * 
   * @param request The request object
   * @return LogCaptureUserConfigurationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureUserConfigurationListing getDiagnosticsLogcaptureBrowserUsers(GetDiagnosticsLogcaptureBrowserUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogCaptureUserConfigurationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogCaptureUserConfigurationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all log capture enabled users for an org
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureUserConfigurationListing> getDiagnosticsLogcaptureBrowserUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogCaptureUserConfigurationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogCaptureUserConfigurationListing> response = (ApiResponse<LogCaptureUserConfigurationListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LogCaptureUserConfigurationListing> response = (ApiResponse<LogCaptureUserConfigurationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates an async download execution
   * 
   * @param body  (optional)
   * @return LogCaptureDownloadExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureDownloadExecutionResponse postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(LogCaptureQueryRequest body) throws IOException, ApiException {
    return  postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(createPostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest(body));
  }

  /**
   * Creates an async download execution
   * 
   * @param body  (optional)
   * @return LogCaptureDownloadExecutionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureDownloadExecutionResponse> postDiagnosticsLogcaptureBrowserEntriesDownloadJobsWithHttpInfo(LogCaptureQueryRequest body) throws IOException {
    return postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(createPostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest(body).withHttpInfo());
  }

  private PostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest createPostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest(LogCaptureQueryRequest body) {
    return PostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates an async download execution
   * 
   * @param request The request object
   * @return LogCaptureDownloadExecutionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureDownloadExecutionResponse postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(PostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogCaptureDownloadExecutionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogCaptureDownloadExecutionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates an async download execution
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureDownloadExecutionResponse> postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(ApiRequest<LogCaptureQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogCaptureDownloadExecutionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query collected log entries. It returns a limited amount of records, to get all records use download endpoint.
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param body  (optional)
   * @return LogCaptureQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureQueryResponse postDiagnosticsLogcaptureBrowserEntriesQuery(String after, String pageSize, LogCaptureQueryRequest body) throws IOException, ApiException {
    return  postDiagnosticsLogcaptureBrowserEntriesQuery(createPostDiagnosticsLogcaptureBrowserEntriesQueryRequest(after, pageSize, body));
  }

  /**
   * Query collected log entries. It returns a limited amount of records, to get all records use download endpoint.
   * 
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param body  (optional)
   * @return LogCaptureQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureQueryResponse> postDiagnosticsLogcaptureBrowserEntriesQueryWithHttpInfo(String after, String pageSize, LogCaptureQueryRequest body) throws IOException {
    return postDiagnosticsLogcaptureBrowserEntriesQuery(createPostDiagnosticsLogcaptureBrowserEntriesQueryRequest(after, pageSize, body).withHttpInfo());
  }

  private PostDiagnosticsLogcaptureBrowserEntriesQueryRequest createPostDiagnosticsLogcaptureBrowserEntriesQueryRequest(String after, String pageSize, LogCaptureQueryRequest body) {
    return PostDiagnosticsLogcaptureBrowserEntriesQueryRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .withBody(body)

            .build();
  }

  /**
   * Query collected log entries. It returns a limited amount of records, to get all records use download endpoint.
   * 
   * @param request The request object
   * @return LogCaptureQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureQueryResponse postDiagnosticsLogcaptureBrowserEntriesQuery(PostDiagnosticsLogcaptureBrowserEntriesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogCaptureQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogCaptureQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query collected log entries. It returns a limited amount of records, to get all records use download endpoint.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureQueryResponse> postDiagnosticsLogcaptureBrowserEntriesQuery(ApiRequest<LogCaptureQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogCaptureQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogCaptureQueryResponse> response = (ApiResponse<LogCaptureQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LogCaptureQueryResponse> response = (ApiResponse<LogCaptureQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Enable log capture for a user or update expiration
   * 
   * @param userId The id of the user to enable browser log capture (required)
   * @param body  (optional)
   * @return LogCaptureUserConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureUserConfiguration postDiagnosticsLogcaptureBrowserUser(String userId, LogCaptureUserConfiguration body) throws IOException, ApiException {
    return  postDiagnosticsLogcaptureBrowserUser(createPostDiagnosticsLogcaptureBrowserUserRequest(userId, body));
  }

  /**
   * Enable log capture for a user or update expiration
   * 
   * @param userId The id of the user to enable browser log capture (required)
   * @param body  (optional)
   * @return LogCaptureUserConfiguration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureUserConfiguration> postDiagnosticsLogcaptureBrowserUserWithHttpInfo(String userId, LogCaptureUserConfiguration body) throws IOException {
    return postDiagnosticsLogcaptureBrowserUser(createPostDiagnosticsLogcaptureBrowserUserRequest(userId, body).withHttpInfo());
  }

  private PostDiagnosticsLogcaptureBrowserUserRequest createPostDiagnosticsLogcaptureBrowserUserRequest(String userId, LogCaptureUserConfiguration body) {
    return PostDiagnosticsLogcaptureBrowserUserRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Enable log capture for a user or update expiration
   * 
   * @param request The request object
   * @return LogCaptureUserConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LogCaptureUserConfiguration postDiagnosticsLogcaptureBrowserUser(PostDiagnosticsLogcaptureBrowserUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LogCaptureUserConfiguration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LogCaptureUserConfiguration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Enable log capture for a user or update expiration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LogCaptureUserConfiguration> postDiagnosticsLogcaptureBrowserUser(ApiRequest<LogCaptureUserConfiguration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LogCaptureUserConfiguration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LogCaptureUserConfiguration> response = (ApiResponse<LogCaptureUserConfiguration>)(ApiResponse<?>)exception;
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
      ApiResponse<LogCaptureUserConfiguration> response = (ApiResponse<LogCaptureUserConfiguration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
