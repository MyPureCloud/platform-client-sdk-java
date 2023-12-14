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


import com.mypurecloud.sdk.v2.api.request.GetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest;
import com.mypurecloud.sdk.v2.api.request.PostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest;

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

}
