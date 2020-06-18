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
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;
import com.mypurecloud.sdk.v2.model.ApiUsageQuery;


import com.mypurecloud.sdk.v2.api.request.GetUsageQueryExecutionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsageApi {
  private final ApiClient pcapiClient;

  public UsageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsageApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get the results of a usage query
   * 
   * @param executionId ID of the query execution (required)
   * @return ApiUsageQueryResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ApiUsageQueryResult getUsageQueryExecutionIdResults(String executionId) throws IOException, ApiException {
    return  getUsageQueryExecutionIdResults(createGetUsageQueryExecutionIdResultsRequest(executionId));
  }

  /**
   * Get the results of a usage query
   * 
   * @param executionId ID of the query execution (required)
   * @return ApiUsageQueryResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ApiUsageQueryResult> getUsageQueryExecutionIdResultsWithHttpInfo(String executionId) throws IOException {
    return getUsageQueryExecutionIdResults(createGetUsageQueryExecutionIdResultsRequest(executionId).withHttpInfo());
  }

  private GetUsageQueryExecutionIdResultsRequest createGetUsageQueryExecutionIdResultsRequest(String executionId) {
    return GetUsageQueryExecutionIdResultsRequest.builder()
            .withExecutionId(executionId)
    
            .build();
  }

  /**
   * Get the results of a usage query
   * 
   * @param request The request object
   * @return ApiUsageQueryResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ApiUsageQueryResult getUsageQueryExecutionIdResults(GetUsageQueryExecutionIdResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ApiUsageQueryResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ApiUsageQueryResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the results of a usage query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ApiUsageQueryResult> getUsageQueryExecutionIdResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ApiUsageQueryResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ApiUsageQueryResult> response = (ApiResponse<ApiUsageQueryResult>)(ApiResponse<?>)exception;
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
      ApiResponse<ApiUsageQueryResult> response = (ApiResponse<ApiUsageQueryResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postUsageQuery(ApiUsageQuery body) throws IOException, ApiException {
    return  postUsageQuery(createPostUsageQueryRequest(body));
  }

  /**
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postUsageQueryWithHttpInfo(ApiUsageQuery body) throws IOException {
    return postUsageQuery(createPostUsageQueryRequest(body).withHttpInfo());
  }

  private PostUsageQueryRequest createPostUsageQueryRequest(ApiUsageQuery body) {
    return PostUsageQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postUsageQuery(PostUsageQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsageExecutionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsageExecutionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postUsageQuery(ApiRequest<ApiUsageQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsageExecutionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)exception;
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
      ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
