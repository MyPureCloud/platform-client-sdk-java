package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;


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
