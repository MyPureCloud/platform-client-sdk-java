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
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryRequest;


import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryTransactionIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryTransactionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuditsQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AuditApi {
  private final ApiClient pcapiClient;

  public AuditApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuditApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get status of audit query execution
   * 
   * @param transactionId Transaction ID (required)
   * @return AuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryExecutionStatusResponse getAuditsQueryTransactionId(String transactionId) throws IOException, ApiException {
    return  getAuditsQueryTransactionId(createGetAuditsQueryTransactionIdRequest(transactionId));
  }

  /**
   * Get status of audit query execution
   * 
   * @param transactionId Transaction ID (required)
   * @return AuditQueryExecutionStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryExecutionStatusResponse> getAuditsQueryTransactionIdWithHttpInfo(String transactionId) throws IOException {
    return getAuditsQueryTransactionId(createGetAuditsQueryTransactionIdRequest(transactionId).withHttpInfo());
  }

  private GetAuditsQueryTransactionIdRequest createGetAuditsQueryTransactionIdRequest(String transactionId) {
    return GetAuditsQueryTransactionIdRequest.builder()
            .withTransactionId(transactionId)
    
            .build();
  }

  /**
   * Get status of audit query execution
   * 
   * @param request The request object
   * @return AuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryExecutionStatusResponse getAuditsQueryTransactionId(GetAuditsQueryTransactionIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditQueryExecutionStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditQueryExecutionStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status of audit query execution
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryExecutionStatusResponse> getAuditsQueryTransactionId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditQueryExecutionStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get results of audit query
   * 
   * @param transactionId Transaction ID (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize Page size (optional, default to 25)
   * @return AuditQueryExecutionResultsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryExecutionResultsResponse getAuditsQueryTransactionIdResults(String transactionId, String cursor, Integer pageSize) throws IOException, ApiException {
    return  getAuditsQueryTransactionIdResults(createGetAuditsQueryTransactionIdResultsRequest(transactionId, cursor, pageSize));
  }

  /**
   * Get results of audit query
   * 
   * @param transactionId Transaction ID (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize Page size (optional, default to 25)
   * @return AuditQueryExecutionResultsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryExecutionResultsResponse> getAuditsQueryTransactionIdResultsWithHttpInfo(String transactionId, String cursor, Integer pageSize) throws IOException {
    return getAuditsQueryTransactionIdResults(createGetAuditsQueryTransactionIdResultsRequest(transactionId, cursor, pageSize).withHttpInfo());
  }

  private GetAuditsQueryTransactionIdResultsRequest createGetAuditsQueryTransactionIdResultsRequest(String transactionId, String cursor, Integer pageSize) {
    return GetAuditsQueryTransactionIdResultsRequest.builder()
            .withTransactionId(transactionId)
    
            .withCursor(cursor)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get results of audit query
   * 
   * @param request The request object
   * @return AuditQueryExecutionResultsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryExecutionResultsResponse getAuditsQueryTransactionIdResults(GetAuditsQueryTransactionIdResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditQueryExecutionResultsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditQueryExecutionResultsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get results of audit query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryExecutionResultsResponse> getAuditsQueryTransactionIdResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditQueryExecutionResultsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditQueryExecutionResultsResponse> response = (ApiResponse<AuditQueryExecutionResultsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditQueryExecutionResultsResponse> response = (ApiResponse<AuditQueryExecutionResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create audit query execution
   * 
   * @param body query (required)
   * @return AuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryExecutionStatusResponse postAuditsQuery(AuditQueryRequest body) throws IOException, ApiException {
    return  postAuditsQuery(createPostAuditsQueryRequest(body));
  }

  /**
   * Create audit query execution
   * 
   * @param body query (required)
   * @return AuditQueryExecutionStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryExecutionStatusResponse> postAuditsQueryWithHttpInfo(AuditQueryRequest body) throws IOException {
    return postAuditsQuery(createPostAuditsQueryRequest(body).withHttpInfo());
  }

  private PostAuditsQueryRequest createPostAuditsQueryRequest(AuditQueryRequest body) {
    return PostAuditsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create audit query execution
   * 
   * @param request The request object
   * @return AuditQueryExecutionStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryExecutionStatusResponse postAuditsQuery(PostAuditsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditQueryExecutionStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditQueryExecutionStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create audit query execution
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryExecutionStatusResponse> postAuditsQuery(ApiRequest<AuditQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditQueryExecutionStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
