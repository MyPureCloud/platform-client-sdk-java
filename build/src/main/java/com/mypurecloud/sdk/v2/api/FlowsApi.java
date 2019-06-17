package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;


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
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsFlowsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body));
  }

  /**
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsFlowsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsAggregatesQueryRequest createPostAnalyticsFlowsAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsFlowsAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for flow aggregates
   * 
   * @param request The request object
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsFlowsAggregatesQuery(PostAnalyticsFlowsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
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
  public ApiResponse<AggregateQueryResponse> postAnalyticsFlowsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for flow observations
   * 
   * @param body query (required)
   * @return QualifierMappingObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualifierMappingObservationQueryResponse postAnalyticsFlowsObservationsQuery(ObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsObservationsQuery(createPostAnalyticsFlowsObservationsQueryRequest(body));
  }

  /**
   * Query for flow observations
   * 
   * @param body query (required)
   * @return QualifierMappingObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualifierMappingObservationQueryResponse> postAnalyticsFlowsObservationsQueryWithHttpInfo(ObservationQuery body) throws IOException {
    return postAnalyticsFlowsObservationsQuery(createPostAnalyticsFlowsObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsObservationsQueryRequest createPostAnalyticsFlowsObservationsQueryRequest(ObservationQuery body) {
    return PostAnalyticsFlowsObservationsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for flow observations
   * 
   * @param request The request object
   * @return QualifierMappingObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualifierMappingObservationQueryResponse postAnalyticsFlowsObservationsQuery(PostAnalyticsFlowsObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QualifierMappingObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QualifierMappingObservationQueryResponse>() {});
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
  public ApiResponse<QualifierMappingObservationQueryResponse> postAnalyticsFlowsObservationsQuery(ApiRequest<ObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QualifierMappingObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
