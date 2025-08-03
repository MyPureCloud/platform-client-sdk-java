package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FlowActivityQuery;
import com.mypurecloud.sdk.v2.model.FlowActivityResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsFlowsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsFlowsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsFlowsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsActivityQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsObservationsQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowsApi {
  private final ApiClient pcapiClient;

  public FlowsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FlowsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete/cancel an async request for flow aggregates
   * 
   * deleteAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsFlowsAggregatesJob(String jobId) throws IOException, ApiException {
     deleteAnalyticsFlowsAggregatesJob(createDeleteAnalyticsFlowsAggregatesJobRequest(jobId));
  }

  /**
   * Delete/cancel an async request for flow aggregates
   * 
   * deleteAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsFlowsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return deleteAnalyticsFlowsAggregatesJob(createDeleteAnalyticsFlowsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private DeleteAnalyticsFlowsAggregatesJobRequest createDeleteAnalyticsFlowsAggregatesJobRequest(String jobId) {
    return DeleteAnalyticsFlowsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Delete/cancel an async request for flow aggregates
   * 
   * deleteAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsFlowsAggregatesJob(DeleteAnalyticsFlowsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete/cancel an async request for flow aggregates
   * 
   * deleteAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsFlowsAggregatesJob(ApiRequest<Void> request) throws IOException {
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
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsFlowsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsFlowsAggregatesJob(createGetAnalyticsFlowsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsFlowsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsFlowsAggregatesJob(createGetAnalyticsFlowsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsFlowsAggregatesJobRequest createGetAnalyticsFlowsAggregatesJobRequest(String jobId) {
    return GetAnalyticsFlowsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsFlowsAggregatesJob(GetAnalyticsFlowsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsFlowsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return FlowAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAsyncAggregateQueryResponse getAnalyticsFlowsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsFlowsAggregatesJobResults(createGetAnalyticsFlowsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return FlowAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAsyncAggregateQueryResponse> getAnalyticsFlowsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsFlowsAggregatesJobResults(createGetAnalyticsFlowsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsFlowsAggregatesJobResultsRequest createGetAnalyticsFlowsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsFlowsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return FlowAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAsyncAggregateQueryResponse getAnalyticsFlowsAggregatesJobResults(GetAnalyticsFlowsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAsyncAggregateQueryResponse> getAnalyticsFlowsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowAsyncAggregateQueryResponse> response = (ApiResponse<FlowAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FlowAsyncAggregateQueryResponse> response = (ApiResponse<FlowAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow activity observations
   * 
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return FlowActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowActivityResponse postAnalyticsFlowsActivityQuery(FlowActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  postAnalyticsFlowsActivityQuery(createPostAnalyticsFlowsActivityQueryRequest(body, pageSize, pageNumber));
  }

  /**
   * Query for flow activity observations
   * 
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return FlowActivityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowActivityResponse> postAnalyticsFlowsActivityQueryWithHttpInfo(FlowActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException {
    return postAnalyticsFlowsActivityQuery(createPostAnalyticsFlowsActivityQueryRequest(body, pageSize, pageNumber).withHttpInfo());
  }

  private PostAnalyticsFlowsActivityQueryRequest createPostAnalyticsFlowsActivityQueryRequest(FlowActivityQuery body, Integer pageSize, Integer pageNumber) {
    return PostAnalyticsFlowsActivityQueryRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Query for flow activity observations
   * 
   * @param request The request object
   * @return FlowActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowActivityResponse postAnalyticsFlowsActivityQuery(PostAnalyticsFlowsActivityQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowActivityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowActivityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow activity observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowActivityResponse> postAnalyticsFlowsActivityQuery(ApiRequest<FlowActivityQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowActivityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowActivityResponse> response = (ApiResponse<FlowActivityResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FlowActivityResponse> response = (ApiResponse<FlowActivityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsFlowsAggregatesJobs(FlowAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsAggregatesJobs(createPostAnalyticsFlowsAggregatesJobsRequest(body));
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsFlowsAggregatesJobsWithHttpInfo(FlowAsyncAggregationQuery body) throws IOException {
    return postAnalyticsFlowsAggregatesJobs(createPostAnalyticsFlowsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsAggregatesJobsRequest createPostAnalyticsFlowsAggregatesJobsRequest(FlowAsyncAggregationQuery body) {
    return PostAnalyticsFlowsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsFlowsAggregatesJobs(PostAnalyticsFlowsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsFlowsAggregatesJobs(ApiRequest<FlowAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return FlowAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAggregateQueryResponse postAnalyticsFlowsAggregatesQuery(FlowAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body));
  }

  /**
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return FlowAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAggregateQueryResponse> postAnalyticsFlowsAggregatesQueryWithHttpInfo(FlowAggregationQuery body) throws IOException {
    return postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsAggregatesQueryRequest createPostAnalyticsFlowsAggregatesQueryRequest(FlowAggregationQuery body) {
    return PostAnalyticsFlowsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow aggregates
   * 
   * @param request The request object
   * @return FlowAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAggregateQueryResponse postAnalyticsFlowsAggregatesQuery(PostAnalyticsFlowsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAggregateQueryResponse> postAnalyticsFlowsAggregatesQuery(ApiRequest<FlowAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow observations
   * 
   * @param body query (required)
   * @return FlowObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowObservationQueryResponse postAnalyticsFlowsObservationsQuery(FlowObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsObservationsQuery(createPostAnalyticsFlowsObservationsQueryRequest(body));
  }

  /**
   * Query for flow observations
   * 
   * @param body query (required)
   * @return FlowObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowObservationQueryResponse> postAnalyticsFlowsObservationsQueryWithHttpInfo(FlowObservationQuery body) throws IOException {
    return postAnalyticsFlowsObservationsQuery(createPostAnalyticsFlowsObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsObservationsQueryRequest createPostAnalyticsFlowsObservationsQueryRequest(FlowObservationQuery body) {
    return PostAnalyticsFlowsObservationsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow observations
   * 
   * @param request The request object
   * @return FlowObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowObservationQueryResponse postAnalyticsFlowsObservationsQuery(PostAnalyticsFlowsObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowObservationQueryResponse> postAnalyticsFlowsObservationsQuery(ApiRequest<FlowObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
