package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ApiUsageClientQuery;
import com.mypurecloud.sdk.v2.model.ApiUsageOrganizationQuery;
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.ApiUsageSimpleSearch;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;


import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageQueryResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageQueryExecutionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageSimplesearchExecutionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientUsageQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageSimplesearchRequest;

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
   * @param clientId Client ID (required)
   * @return ApiUsageQueryResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ApiUsageQueryResult getOauthClientUsageQueryResult(String executionId, String clientId) throws IOException, ApiException {
    return  getOauthClientUsageQueryResult(createGetOauthClientUsageQueryResultRequest(executionId, clientId));
  }

  /**
   * Get the results of a usage query
   * 
   * @param executionId ID of the query execution (required)
   * @param clientId Client ID (required)
   * @return ApiUsageQueryResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ApiUsageQueryResult> getOauthClientUsageQueryResultWithHttpInfo(String executionId, String clientId) throws IOException {
    return getOauthClientUsageQueryResult(createGetOauthClientUsageQueryResultRequest(executionId, clientId).withHttpInfo());
  }

  private GetOauthClientUsageQueryResultRequest createGetOauthClientUsageQueryResultRequest(String executionId, String clientId) {
    return GetOauthClientUsageQueryResultRequest.builder()
            .withExecutionId(executionId)

            .withClientId(clientId)

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
  public ApiUsageQueryResult getOauthClientUsageQueryResult(GetOauthClientUsageQueryResultRequest request) throws IOException, ApiException {
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
  public ApiResponse<ApiUsageQueryResult> getOauthClientUsageQueryResult(ApiRequest<Void> request) throws IOException {
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
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param days Previous number of days to query (optional, default to 7)
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult getOauthClientUsageSummary(String clientId, String days) throws IOException, ApiException {
    return  getOauthClientUsageSummary(createGetOauthClientUsageSummaryRequest(clientId, days));
  }

  /**
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param days Previous number of days to query (optional, default to 7)
   * @return UsageExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> getOauthClientUsageSummaryWithHttpInfo(String clientId, String days) throws IOException {
    return getOauthClientUsageSummary(createGetOauthClientUsageSummaryRequest(clientId, days).withHttpInfo());
  }

  private GetOauthClientUsageSummaryRequest createGetOauthClientUsageSummaryRequest(String clientId, String days) {
    return GetOauthClientUsageSummaryRequest.builder()
            .withClientId(clientId)

            .withDays(days)

            .build();
  }

  /**
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult getOauthClientUsageSummary(GetOauthClientUsageSummaryRequest request) throws IOException, ApiException {
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
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> getOauthClientUsageSummary(ApiRequest<Void> request) throws IOException {
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
   * Get the results of a usage search. Number of records to be returned is limited to 20,000 results.
   * 
   * @param executionId ID of the search execution (required)
   * @param after The cursor that points to the end of the set of entities that has been returned (optional)
   * @param pageSize The max number of entities to be returned per request. Maximum page size of 1000 (optional)
   * @return ApiUsageQueryResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ApiUsageQueryResult getUsageSimplesearchExecutionIdResults(String executionId, String after, Integer pageSize) throws IOException, ApiException {
    return  getUsageSimplesearchExecutionIdResults(createGetUsageSimplesearchExecutionIdResultsRequest(executionId, after, pageSize));
  }

  /**
   * Get the results of a usage search. Number of records to be returned is limited to 20,000 results.
   * 
   * @param executionId ID of the search execution (required)
   * @param after The cursor that points to the end of the set of entities that has been returned (optional)
   * @param pageSize The max number of entities to be returned per request. Maximum page size of 1000 (optional)
   * @return ApiUsageQueryResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ApiUsageQueryResult> getUsageSimplesearchExecutionIdResultsWithHttpInfo(String executionId, String after, Integer pageSize) throws IOException {
    return getUsageSimplesearchExecutionIdResults(createGetUsageSimplesearchExecutionIdResultsRequest(executionId, after, pageSize).withHttpInfo());
  }

  private GetUsageSimplesearchExecutionIdResultsRequest createGetUsageSimplesearchExecutionIdResultsRequest(String executionId, String after, Integer pageSize) {
    return GetUsageSimplesearchExecutionIdResultsRequest.builder()
            .withExecutionId(executionId)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get the results of a usage search. Number of records to be returned is limited to 20,000 results.
   * 
   * @param request The request object
   * @return ApiUsageQueryResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ApiUsageQueryResult getUsageSimplesearchExecutionIdResults(GetUsageSimplesearchExecutionIdResultsRequest request) throws IOException, ApiException {
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
   * Get the results of a usage search. Number of records to be returned is limited to 20,000 results.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ApiUsageQueryResult> getUsageSimplesearchExecutionIdResults(ApiRequest<Void> request) throws IOException {
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
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postOauthClientUsageQuery(String clientId, ApiUsageClientQuery body) throws IOException, ApiException {
    return  postOauthClientUsageQuery(createPostOauthClientUsageQueryRequest(clientId, body));
  }

  /**
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param clientId Client ID (required)
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postOauthClientUsageQueryWithHttpInfo(String clientId, ApiUsageClientQuery body) throws IOException {
    return postOauthClientUsageQuery(createPostOauthClientUsageQueryRequest(clientId, body).withHttpInfo());
  }

  private PostOauthClientUsageQueryRequest createPostOauthClientUsageQueryRequest(String clientId, ApiUsageClientQuery body) {
    return PostOauthClientUsageQueryRequest.builder()
            .withClientId(clientId)

            .withBody(body)

            .build();
  }

  /**
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postOauthClientUsageQuery(PostOauthClientUsageQueryRequest request) throws IOException, ApiException {
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
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postOauthClientUsageQuery(ApiRequest<ApiUsageClientQuery> request) throws IOException {
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

  /**
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postUsageQuery(ApiUsageOrganizationQuery body) throws IOException, ApiException {
    return  postUsageQuery(createPostUsageQueryRequest(body));
  }

  /**
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param body Query (required)
   * @return UsageExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postUsageQueryWithHttpInfo(ApiUsageOrganizationQuery body) throws IOException {
    return postUsageQuery(createPostUsageQueryRequest(body).withHttpInfo());
  }

  private PostUsageQueryRequest createPostUsageQueryRequest(ApiUsageOrganizationQuery body) {
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
  public ApiResponse<UsageExecutionResult> postUsageQuery(ApiRequest<ApiUsageOrganizationQuery> request) throws IOException {
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

  /**
   * Search organization API Usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id. The number of records is limited to 20,000 results
   * @param body SimpleSearch (required)
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postUsageSimplesearch(ApiUsageSimpleSearch body) throws IOException, ApiException {
    return  postUsageSimplesearch(createPostUsageSimplesearchRequest(body));
  }

  /**
   * Search organization API Usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id. The number of records is limited to 20,000 results
   * @param body SimpleSearch (required)
   * @return UsageExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postUsageSimplesearchWithHttpInfo(ApiUsageSimpleSearch body) throws IOException {
    return postUsageSimplesearch(createPostUsageSimplesearchRequest(body).withHttpInfo());
  }

  private PostUsageSimplesearchRequest createPostUsageSimplesearchRequest(ApiUsageSimpleSearch body) {
    return PostUsageSimplesearchRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Search organization API Usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id. The number of records is limited to 20,000 results
   * @param request The request object
   * @return UsageExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsageExecutionResult postUsageSimplesearch(PostUsageSimplesearchRequest request) throws IOException, ApiException {
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
   * Search organization API Usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id. The number of records is limited to 20,000 results
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsageExecutionResult> postUsageSimplesearch(ApiRequest<ApiUsageSimpleSearch> request) throws IOException {
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
