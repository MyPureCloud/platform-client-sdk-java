package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AuditQueryServiceMapping;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryResultsResponse;


import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryRealtimeServicemappingRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryServicemappingRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryTransactionIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryTransactionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuditsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuditsQueryRealtimeRequest;

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
   * Get service mapping information used in realtime audits.
   * 
   * @return AuditQueryServiceMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryServiceMapping getAuditsQueryRealtimeServicemapping() throws IOException, ApiException {
    return  getAuditsQueryRealtimeServicemapping(createGetAuditsQueryRealtimeServicemappingRequest());
  }

  /**
   * Get service mapping information used in realtime audits.
   * 
   * @return AuditQueryServiceMapping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryServiceMapping> getAuditsQueryRealtimeServicemappingWithHttpInfo() throws IOException {
    return getAuditsQueryRealtimeServicemapping(createGetAuditsQueryRealtimeServicemappingRequest().withHttpInfo());
  }

  private GetAuditsQueryRealtimeServicemappingRequest createGetAuditsQueryRealtimeServicemappingRequest() {
    return GetAuditsQueryRealtimeServicemappingRequest.builder()
            .build();
  }

  /**
   * Get service mapping information used in realtime audits.
   * 
   * @param request The request object
   * @return AuditQueryServiceMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryServiceMapping getAuditsQueryRealtimeServicemapping(GetAuditsQueryRealtimeServicemappingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditQueryServiceMapping> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditQueryServiceMapping>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get service mapping information used in realtime audits.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryServiceMapping> getAuditsQueryRealtimeServicemapping(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditQueryServiceMapping>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditQueryServiceMapping> response = (ApiResponse<AuditQueryServiceMapping>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditQueryServiceMapping> response = (ApiResponse<AuditQueryServiceMapping>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get service mapping information used in audits.
   * 
   * @return AuditQueryServiceMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryServiceMapping getAuditsQueryServicemapping() throws IOException, ApiException {
    return  getAuditsQueryServicemapping(createGetAuditsQueryServicemappingRequest());
  }

  /**
   * Get service mapping information used in audits.
   * 
   * @return AuditQueryServiceMapping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryServiceMapping> getAuditsQueryServicemappingWithHttpInfo() throws IOException {
    return getAuditsQueryServicemapping(createGetAuditsQueryServicemappingRequest().withHttpInfo());
  }

  private GetAuditsQueryServicemappingRequest createGetAuditsQueryServicemappingRequest() {
    return GetAuditsQueryServicemappingRequest.builder()
            .build();
  }

  /**
   * Get service mapping information used in audits.
   * 
   * @param request The request object
   * @return AuditQueryServiceMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryServiceMapping getAuditsQueryServicemapping(GetAuditsQueryServicemappingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditQueryServiceMapping> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditQueryServiceMapping>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get service mapping information used in audits.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryServiceMapping> getAuditsQueryServicemapping(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditQueryServiceMapping>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditQueryServiceMapping> response = (ApiResponse<AuditQueryServiceMapping>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditQueryServiceMapping> response = (ApiResponse<AuditQueryServiceMapping>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @param expand Which fields, if any, to expand (optional)
   * @return AuditQueryExecutionResultsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryExecutionResultsResponse getAuditsQueryTransactionIdResults(String transactionId, String cursor, Integer pageSize, List<String> expand) throws IOException, ApiException {
    return  getAuditsQueryTransactionIdResults(createGetAuditsQueryTransactionIdResultsRequest(transactionId, cursor, pageSize, expand));
  }

  /**
   * Get results of audit query
   * 
   * @param transactionId Transaction ID (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Which fields, if any, to expand (optional)
   * @return AuditQueryExecutionResultsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryExecutionResultsResponse> getAuditsQueryTransactionIdResultsWithHttpInfo(String transactionId, String cursor, Integer pageSize, List<String> expand) throws IOException {
    return getAuditsQueryTransactionIdResults(createGetAuditsQueryTransactionIdResultsRequest(transactionId, cursor, pageSize, expand).withHttpInfo());
  }

  private GetAuditsQueryTransactionIdResultsRequest createGetAuditsQueryTransactionIdResultsRequest(String transactionId, String cursor, Integer pageSize, List<String> expand) {
    return GetAuditsQueryTransactionIdResultsRequest.builder()
            .withTransactionId(transactionId)
    
            .withCursor(cursor)
    
            .withPageSize(pageSize)
    
            .withExpand(expand)
    
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

  
  /**
   * This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits.
   * 
   * @param body query (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return AuditRealtimeQueryResultsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditRealtimeQueryResultsResponse postAuditsQueryRealtime(AuditRealtimeQueryRequest body, List<String> expand) throws IOException, ApiException {
    return  postAuditsQueryRealtime(createPostAuditsQueryRealtimeRequest(body, expand));
  }

  /**
   * This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits.
   * 
   * @param body query (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return AuditRealtimeQueryResultsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditRealtimeQueryResultsResponse> postAuditsQueryRealtimeWithHttpInfo(AuditRealtimeQueryRequest body, List<String> expand) throws IOException {
    return postAuditsQueryRealtime(createPostAuditsQueryRealtimeRequest(body, expand).withHttpInfo());
  }

  private PostAuditsQueryRealtimeRequest createPostAuditsQueryRealtimeRequest(AuditRealtimeQueryRequest body, List<String> expand) {
    return PostAuditsQueryRealtimeRequest.builder()
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits.
   * 
   * @param request The request object
   * @return AuditRealtimeQueryResultsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditRealtimeQueryResultsResponse postAuditsQueryRealtime(PostAuditsQueryRealtimeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditRealtimeQueryResultsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditRealtimeQueryResultsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditRealtimeQueryResultsResponse> postAuditsQueryRealtime(ApiRequest<AuditRealtimeQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditRealtimeQueryResultsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditRealtimeQueryResultsResponse> response = (ApiResponse<AuditRealtimeQueryResultsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditRealtimeQueryResultsResponse> response = (ApiResponse<AuditRealtimeQueryResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
