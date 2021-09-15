package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Leaderboard;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.OverallBestPoints;
import com.mypurecloud.sdk.v2.model.Metric;
import com.mypurecloud.sdk.v2.model.MetricDefinition;
import com.mypurecloud.sdk.v2.model.GetMetricDefinitionsResponse;
import com.mypurecloud.sdk.v2.model.GetMetricsResponse;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import com.mypurecloud.sdk.v2.model.GetMetricResponse;
import com.mypurecloud.sdk.v2.model.GetProfilesResponse;
import com.mypurecloud.sdk.v2.model.WorkdayMetricListing;
import com.mypurecloud.sdk.v2.model.AttendanceStatusListing;
import com.mypurecloud.sdk.v2.model.UserBestPoints;
import com.mypurecloud.sdk.v2.model.AllTimePoints;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAveragePoints;
import com.mypurecloud.sdk.v2.model.WorkdayPointsTrend;
import com.mypurecloud.sdk.v2.model.WorkdayValuesTrend;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAverageValues;
import com.mypurecloud.sdk.v2.model.GamificationStatus;
import com.mypurecloud.sdk.v2.model.ObjectiveTemplate;
import com.mypurecloud.sdk.v2.model.GetTemplatesResponse;
import com.mypurecloud.sdk.v2.model.CreatePerformanceProfile;


import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardAllBestpointsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardBestpointsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationMetricRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationMetricdefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationMetricdefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfileRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfileMetricRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfileMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfileMetricsObjectivedetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfilesRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfilesUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfilesUsersMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsAttendanceRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsBestpointsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsPointsAlltimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsPointsAverageRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsPointsTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUserAttendanceRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUserBestpointsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUserPointsAlltimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUserPointsTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUserValuesTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUsersPointsAverageRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUsersValuesAverageRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsUsersValuesTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsValuesAverageRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsValuesTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationStatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationTemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileActivateRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileDeactivateRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfilesRequest;
import com.mypurecloud.sdk.v2.api.request.PutGamificationMetricRequest;
import com.mypurecloud.sdk.v2.api.request.PutGamificationProfileRequest;
import com.mypurecloud.sdk.v2.api.request.PutGamificationProfileMetricRequest;
import com.mypurecloud.sdk.v2.api.request.PutGamificationStatusRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GamificationApi {
  private final ApiClient pcapiClient;

  public GamificationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GamificationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Leaderboard of the requesting user&#39;s division or performance profile
   * 
   * @param startWorkday Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param metricId Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given. (optional)
   * @return Leaderboard
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Leaderboard getGamificationLeaderboard(LocalDate startWorkday, LocalDate endWorkday, String metricId) throws IOException, ApiException {
    return  getGamificationLeaderboard(createGetGamificationLeaderboardRequest(startWorkday, endWorkday, metricId));
  }

  /**
   * Leaderboard of the requesting user&#39;s division or performance profile
   * 
   * @param startWorkday Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param metricId Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given. (optional)
   * @return Leaderboard
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Leaderboard> getGamificationLeaderboardWithHttpInfo(LocalDate startWorkday, LocalDate endWorkday, String metricId) throws IOException {
    return getGamificationLeaderboard(createGetGamificationLeaderboardRequest(startWorkday, endWorkday, metricId).withHttpInfo());
  }

  private GetGamificationLeaderboardRequest createGetGamificationLeaderboardRequest(LocalDate startWorkday, LocalDate endWorkday, String metricId) {
    return GetGamificationLeaderboardRequest.builder()
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .withMetricId(metricId)
    
            .build();
  }

  /**
   * Leaderboard of the requesting user&#39;s division or performance profile
   * 
   * @param request The request object
   * @return Leaderboard
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Leaderboard getGamificationLeaderboard(GetGamificationLeaderboardRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Leaderboard> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Leaderboard>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Leaderboard of the requesting user&#39;s division or performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Leaderboard> getGamificationLeaderboard(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Leaderboard>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)exception;
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
      ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Leaderboard by filter type
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. For example, division or performance profile Id (required)
   * @param startWorkday Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param metricId Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given. (optional)
   * @return Leaderboard
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Leaderboard getGamificationLeaderboardAll(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday, String metricId) throws IOException, ApiException {
    return  getGamificationLeaderboardAll(createGetGamificationLeaderboardAllRequest(filterType, filterId, startWorkday, endWorkday, metricId));
  }

  /**
   * Leaderboard by filter type
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. For example, division or performance profile Id (required)
   * @param startWorkday Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param metricId Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given. (optional)
   * @return Leaderboard
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Leaderboard> getGamificationLeaderboardAllWithHttpInfo(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday, String metricId) throws IOException {
    return getGamificationLeaderboardAll(createGetGamificationLeaderboardAllRequest(filterType, filterId, startWorkday, endWorkday, metricId).withHttpInfo());
  }

  private GetGamificationLeaderboardAllRequest createGetGamificationLeaderboardAllRequest(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday, String metricId) {
    return GetGamificationLeaderboardAllRequest.builder()
            .withFilterType(filterType)
    
            .withFilterId(filterId)
    
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .withMetricId(metricId)
    
            .build();
  }

  /**
   * Leaderboard by filter type
   * 
   * @param request The request object
   * @return Leaderboard
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Leaderboard getGamificationLeaderboardAll(GetGamificationLeaderboardAllRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Leaderboard> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Leaderboard>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Leaderboard by filter type
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Leaderboard> getGamificationLeaderboardAll(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Leaderboard>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)exception;
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
      ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Best Points by division or performance profile
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. For example, division or performance profile Id (required)
   * @return OverallBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OverallBestPoints getGamificationLeaderboardAllBestpoints(String filterType, String filterId) throws IOException, ApiException {
    return  getGamificationLeaderboardAllBestpoints(createGetGamificationLeaderboardAllBestpointsRequest(filterType, filterId));
  }

  /**
   * Best Points by division or performance profile
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. For example, division or performance profile Id (required)
   * @return OverallBestPoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OverallBestPoints> getGamificationLeaderboardAllBestpointsWithHttpInfo(String filterType, String filterId) throws IOException {
    return getGamificationLeaderboardAllBestpoints(createGetGamificationLeaderboardAllBestpointsRequest(filterType, filterId).withHttpInfo());
  }

  private GetGamificationLeaderboardAllBestpointsRequest createGetGamificationLeaderboardAllBestpointsRequest(String filterType, String filterId) {
    return GetGamificationLeaderboardAllBestpointsRequest.builder()
            .withFilterType(filterType)
    
            .withFilterId(filterId)
    
            .build();
  }

  /**
   * Best Points by division or performance profile
   * 
   * @param request The request object
   * @return OverallBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OverallBestPoints getGamificationLeaderboardAllBestpoints(GetGamificationLeaderboardAllBestpointsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OverallBestPoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OverallBestPoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Best Points by division or performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OverallBestPoints> getGamificationLeaderboardAllBestpoints(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OverallBestPoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)exception;
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
      ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Best Points of the requesting user&#39;s current performance profile or division
   * 
   * @return OverallBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OverallBestPoints getGamificationLeaderboardBestpoints() throws IOException, ApiException {
    return  getGamificationLeaderboardBestpoints(createGetGamificationLeaderboardBestpointsRequest());
  }

  /**
   * Best Points of the requesting user&#39;s current performance profile or division
   * 
   * @return OverallBestPoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OverallBestPoints> getGamificationLeaderboardBestpointsWithHttpInfo() throws IOException {
    return getGamificationLeaderboardBestpoints(createGetGamificationLeaderboardBestpointsRequest().withHttpInfo());
  }

  private GetGamificationLeaderboardBestpointsRequest createGetGamificationLeaderboardBestpointsRequest() {
    return GetGamificationLeaderboardBestpointsRequest.builder()
            .build();
  }

  /**
   * Best Points of the requesting user&#39;s current performance profile or division
   * 
   * @param request The request object
   * @return OverallBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OverallBestPoints getGamificationLeaderboardBestpoints(GetGamificationLeaderboardBestpointsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OverallBestPoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OverallBestPoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Best Points of the requesting user&#39;s current performance profile or division
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OverallBestPoints> getGamificationLeaderboardBestpoints(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OverallBestPoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)exception;
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
      ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gamified metric by id
   * 
   * @param metricId metric Id (required)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param performanceProfileId The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. (optional)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric getGamificationMetric(String metricId, LocalDate workday, String performanceProfileId) throws IOException, ApiException {
    return  getGamificationMetric(createGetGamificationMetricRequest(metricId, workday, performanceProfileId));
  }

  /**
   * Gamified metric by id
   * 
   * @param metricId metric Id (required)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param performanceProfileId The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. (optional)
   * @return Metric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> getGamificationMetricWithHttpInfo(String metricId, LocalDate workday, String performanceProfileId) throws IOException {
    return getGamificationMetric(createGetGamificationMetricRequest(metricId, workday, performanceProfileId).withHttpInfo());
  }

  private GetGamificationMetricRequest createGetGamificationMetricRequest(String metricId, LocalDate workday, String performanceProfileId) {
    return GetGamificationMetricRequest.builder()
            .withMetricId(metricId)
    
            .withWorkday(workday)
    
            .withPerformanceProfileId(performanceProfileId)
    
            .build();
  }

  /**
   * Gamified metric by id
   * 
   * @param request The request object
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric getGamificationMetric(GetGamificationMetricRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Metric> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Metric>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gamified metric by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> getGamificationMetric(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Metric>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
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
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Metric definition by id
   * 
   * @param metricDefinitionId metric definition id (required)
   * @return MetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricDefinition getGamificationMetricdefinition(String metricDefinitionId) throws IOException, ApiException {
    return  getGamificationMetricdefinition(createGetGamificationMetricdefinitionRequest(metricDefinitionId));
  }

  /**
   * Metric definition by id
   * 
   * @param metricDefinitionId metric definition id (required)
   * @return MetricDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricDefinition> getGamificationMetricdefinitionWithHttpInfo(String metricDefinitionId) throws IOException {
    return getGamificationMetricdefinition(createGetGamificationMetricdefinitionRequest(metricDefinitionId).withHttpInfo());
  }

  private GetGamificationMetricdefinitionRequest createGetGamificationMetricdefinitionRequest(String metricDefinitionId) {
    return GetGamificationMetricdefinitionRequest.builder()
            .withMetricDefinitionId(metricDefinitionId)
    
            .build();
  }

  /**
   * Metric definition by id
   * 
   * @param request The request object
   * @return MetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricDefinition getGamificationMetricdefinition(GetGamificationMetricdefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MetricDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MetricDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Metric definition by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricDefinition> getGamificationMetricdefinition(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MetricDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MetricDefinition> response = (ApiResponse<MetricDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<MetricDefinition> response = (ApiResponse<MetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All metric definitions
   * Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric
   * @return GetMetricDefinitionsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricDefinitionsResponse getGamificationMetricdefinitions() throws IOException, ApiException {
    return  getGamificationMetricdefinitions(createGetGamificationMetricdefinitionsRequest());
  }

  /**
   * All metric definitions
   * Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric
   * @return GetMetricDefinitionsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricDefinitionsResponse> getGamificationMetricdefinitionsWithHttpInfo() throws IOException {
    return getGamificationMetricdefinitions(createGetGamificationMetricdefinitionsRequest().withHttpInfo());
  }

  private GetGamificationMetricdefinitionsRequest createGetGamificationMetricdefinitionsRequest() {
    return GetGamificationMetricdefinitionsRequest.builder()
            .build();
  }

  /**
   * All metric definitions
   * Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric
   * @param request The request object
   * @return GetMetricDefinitionsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricDefinitionsResponse getGamificationMetricdefinitions(GetGamificationMetricdefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetMetricDefinitionsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetMetricDefinitionsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All metric definitions
   * Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricDefinitionsResponse> getGamificationMetricdefinitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetMetricDefinitionsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetMetricDefinitionsResponse> response = (ApiResponse<GetMetricDefinitionsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetMetricDefinitionsResponse> response = (ApiResponse<GetMetricDefinitionsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All gamified metrics for a given profile
   * 
   * @param performanceProfileId The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. (optional)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return GetMetricsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricsResponse getGamificationMetrics(String performanceProfileId, LocalDate workday) throws IOException, ApiException {
    return  getGamificationMetrics(createGetGamificationMetricsRequest(performanceProfileId, workday));
  }

  /**
   * All gamified metrics for a given profile
   * 
   * @param performanceProfileId The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. (optional)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return GetMetricsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricsResponse> getGamificationMetricsWithHttpInfo(String performanceProfileId, LocalDate workday) throws IOException {
    return getGamificationMetrics(createGetGamificationMetricsRequest(performanceProfileId, workday).withHttpInfo());
  }

  private GetGamificationMetricsRequest createGetGamificationMetricsRequest(String performanceProfileId, LocalDate workday) {
    return GetGamificationMetricsRequest.builder()
            .withPerformanceProfileId(performanceProfileId)
    
            .withWorkday(workday)
    
            .build();
  }

  /**
   * All gamified metrics for a given profile
   * 
   * @param request The request object
   * @return GetMetricsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricsResponse getGamificationMetrics(GetGamificationMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetMetricsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetMetricsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All gamified metrics for a given profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricsResponse> getGamificationMetrics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetMetricsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetMetricsResponse> response = (ApiResponse<GetMetricsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetMetricsResponse> response = (ApiResponse<GetMetricsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Performance profile by id
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile getGamificationProfile(String performanceProfileId) throws IOException, ApiException {
    return  getGamificationProfile(createGetGamificationProfileRequest(performanceProfileId));
  }

  /**
   * Performance profile by id
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> getGamificationProfileWithHttpInfo(String performanceProfileId) throws IOException {
    return getGamificationProfile(createGetGamificationProfileRequest(performanceProfileId).withHttpInfo());
  }

  private GetGamificationProfileRequest createGetGamificationProfileRequest(String performanceProfileId) {
    return GetGamificationProfileRequest.builder()
            .withPerformanceProfileId(performanceProfileId)
    
            .build();
  }

  /**
   * Performance profile by id
   * 
   * @param request The request object
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile getGamificationProfile(GetGamificationProfileRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformanceProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Performance profile by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> getGamificationProfile(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformanceProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Performance profile gamified metric by id
   * 
   * @param profileId Performance Profile Id (required)
   * @param metricId Metric Id (required)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric getGamificationProfileMetric(String profileId, String metricId, LocalDate workday) throws IOException, ApiException {
    return  getGamificationProfileMetric(createGetGamificationProfileMetricRequest(profileId, metricId, workday));
  }

  /**
   * Performance profile gamified metric by id
   * 
   * @param profileId Performance Profile Id (required)
   * @param metricId Metric Id (required)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return Metric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> getGamificationProfileMetricWithHttpInfo(String profileId, String metricId, LocalDate workday) throws IOException {
    return getGamificationProfileMetric(createGetGamificationProfileMetricRequest(profileId, metricId, workday).withHttpInfo());
  }

  private GetGamificationProfileMetricRequest createGetGamificationProfileMetricRequest(String profileId, String metricId, LocalDate workday) {
    return GetGamificationProfileMetricRequest.builder()
            .withProfileId(profileId)
    
            .withMetricId(metricId)
    
            .withWorkday(workday)
    
            .build();
  }

  /**
   * Performance profile gamified metric by id
   * 
   * @param request The request object
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric getGamificationProfileMetric(GetGamificationProfileMetricRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Metric> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Metric>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Performance profile gamified metric by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> getGamificationProfileMetric(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Metric>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
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
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All gamified metrics for a given performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return GetMetricResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricResponse getGamificationProfileMetrics(String profileId, List<String> expand, LocalDate workday) throws IOException, ApiException {
    return  getGamificationProfileMetrics(createGetGamificationProfileMetricsRequest(profileId, expand, workday));
  }

  /**
   * All gamified metrics for a given performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return GetMetricResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricResponse> getGamificationProfileMetricsWithHttpInfo(String profileId, List<String> expand, LocalDate workday) throws IOException {
    return getGamificationProfileMetrics(createGetGamificationProfileMetricsRequest(profileId, expand, workday).withHttpInfo());
  }

  private GetGamificationProfileMetricsRequest createGetGamificationProfileMetricsRequest(String profileId, List<String> expand, LocalDate workday) {
    return GetGamificationProfileMetricsRequest.builder()
            .withProfileId(profileId)
    
            .withExpand(expand)
    
            .withWorkday(workday)
    
            .build();
  }

  /**
   * All gamified metrics for a given performance profile
   * 
   * @param request The request object
   * @return GetMetricResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricResponse getGamificationProfileMetrics(GetGamificationProfileMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetMetricResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetMetricResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All gamified metrics for a given performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricResponse> getGamificationProfileMetrics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetMetricResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetMetricResponse> response = (ApiResponse<GetMetricResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetMetricResponse> response = (ApiResponse<GetMetricResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All metrics for a given performance profile with objective details such as order and maxPoints
   * 
   * @param profileId Performance Profile Id (required)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return GetMetricsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricsResponse getGamificationProfileMetricsObjectivedetails(String profileId, LocalDate workday) throws IOException, ApiException {
    return  getGamificationProfileMetricsObjectivedetails(createGetGamificationProfileMetricsObjectivedetailsRequest(profileId, workday));
  }

  /**
   * All metrics for a given performance profile with objective details such as order and maxPoints
   * 
   * @param profileId Performance Profile Id (required)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return GetMetricsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricsResponse> getGamificationProfileMetricsObjectivedetailsWithHttpInfo(String profileId, LocalDate workday) throws IOException {
    return getGamificationProfileMetricsObjectivedetails(createGetGamificationProfileMetricsObjectivedetailsRequest(profileId, workday).withHttpInfo());
  }

  private GetGamificationProfileMetricsObjectivedetailsRequest createGetGamificationProfileMetricsObjectivedetailsRequest(String profileId, LocalDate workday) {
    return GetGamificationProfileMetricsObjectivedetailsRequest.builder()
            .withProfileId(profileId)
    
            .withWorkday(workday)
    
            .build();
  }

  /**
   * All metrics for a given performance profile with objective details such as order and maxPoints
   * 
   * @param request The request object
   * @return GetMetricsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricsResponse getGamificationProfileMetricsObjectivedetails(GetGamificationProfileMetricsObjectivedetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetMetricsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetMetricsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All metrics for a given performance profile with objective details such as order and maxPoints
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricsResponse> getGamificationProfileMetricsObjectivedetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetMetricsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetMetricsResponse> response = (ApiResponse<GetMetricsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetMetricsResponse> response = (ApiResponse<GetMetricsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All performance profiles
   * 
   * @return GetProfilesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetProfilesResponse getGamificationProfiles() throws IOException, ApiException {
    return  getGamificationProfiles(createGetGamificationProfilesRequest());
  }

  /**
   * All performance profiles
   * 
   * @return GetProfilesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetProfilesResponse> getGamificationProfilesWithHttpInfo() throws IOException {
    return getGamificationProfiles(createGetGamificationProfilesRequest().withHttpInfo());
  }

  private GetGamificationProfilesRequest createGetGamificationProfilesRequest() {
    return GetGamificationProfilesRequest.builder()
            .build();
  }

  /**
   * All performance profiles
   * 
   * @param request The request object
   * @return GetProfilesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetProfilesResponse getGamificationProfiles(GetGamificationProfilesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetProfilesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetProfilesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All performance profiles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetProfilesResponse> getGamificationProfiles(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetProfilesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetProfilesResponse> response = (ApiResponse<GetProfilesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetProfilesResponse> response = (ApiResponse<GetProfilesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Performance profile of a user
   * 
   * @param userId  (required)
   * @param workday Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile getGamificationProfilesUser(String userId, LocalDate workday) throws IOException, ApiException {
    return  getGamificationProfilesUser(createGetGamificationProfilesUserRequest(userId, workday));
  }

  /**
   * Performance profile of a user
   * 
   * @param userId  (required)
   * @param workday Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> getGamificationProfilesUserWithHttpInfo(String userId, LocalDate workday) throws IOException {
    return getGamificationProfilesUser(createGetGamificationProfilesUserRequest(userId, workday).withHttpInfo());
  }

  private GetGamificationProfilesUserRequest createGetGamificationProfilesUserRequest(String userId, LocalDate workday) {
    return GetGamificationProfilesUserRequest.builder()
            .withUserId(userId)
    
            .withWorkday(workday)
    
            .build();
  }

  /**
   * Performance profile of a user
   * 
   * @param request The request object
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile getGamificationProfilesUser(GetGamificationProfilesUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformanceProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Performance profile of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> getGamificationProfilesUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformanceProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Performance profile of the requesting user
   * 
   * @param workday Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile getGamificationProfilesUsersMe(LocalDate workday) throws IOException, ApiException {
    return  getGamificationProfilesUsersMe(createGetGamificationProfilesUsersMeRequest(workday));
  }

  /**
   * Performance profile of the requesting user
   * 
   * @param workday Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> getGamificationProfilesUsersMeWithHttpInfo(LocalDate workday) throws IOException {
    return getGamificationProfilesUsersMe(createGetGamificationProfilesUsersMeRequest(workday).withHttpInfo());
  }

  private GetGamificationProfilesUsersMeRequest createGetGamificationProfilesUsersMeRequest(LocalDate workday) {
    return GetGamificationProfilesUsersMeRequest.builder()
            .withWorkday(workday)
    
            .build();
  }

  /**
   * Performance profile of the requesting user
   * 
   * @param request The request object
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile getGamificationProfilesUsersMe(GetGamificationProfilesUsersMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformanceProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Performance profile of the requesting user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> getGamificationProfilesUsersMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformanceProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Workday performance metrics of the requesting user
   * 
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkdayMetricListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayMetricListing getGamificationScorecards(LocalDate workday, List<String> expand) throws IOException, ApiException {
    return  getGamificationScorecards(createGetGamificationScorecardsRequest(workday, expand));
  }

  /**
   * Workday performance metrics of the requesting user
   * 
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkdayMetricListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayMetricListing> getGamificationScorecardsWithHttpInfo(LocalDate workday, List<String> expand) throws IOException {
    return getGamificationScorecards(createGetGamificationScorecardsRequest(workday, expand).withHttpInfo());
  }

  private GetGamificationScorecardsRequest createGetGamificationScorecardsRequest(LocalDate workday, List<String> expand) {
    return GetGamificationScorecardsRequest.builder()
            .withWorkday(workday)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Workday performance metrics of the requesting user
   * 
   * @param request The request object
   * @return WorkdayMetricListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayMetricListing getGamificationScorecards(GetGamificationScorecardsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkdayMetricListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkdayMetricListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Workday performance metrics of the requesting user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayMetricListing> getGamificationScorecards(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkdayMetricListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Attendance status metrics of the requesting user
   * 
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AttendanceStatusListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttendanceStatusListing getGamificationScorecardsAttendance(LocalDate startWorkday, LocalDate endWorkday) throws IOException, ApiException {
    return  getGamificationScorecardsAttendance(createGetGamificationScorecardsAttendanceRequest(startWorkday, endWorkday));
  }

  /**
   * Attendance status metrics of the requesting user
   * 
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AttendanceStatusListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttendanceStatusListing> getGamificationScorecardsAttendanceWithHttpInfo(LocalDate startWorkday, LocalDate endWorkday) throws IOException {
    return getGamificationScorecardsAttendance(createGetGamificationScorecardsAttendanceRequest(startWorkday, endWorkday).withHttpInfo());
  }

  private GetGamificationScorecardsAttendanceRequest createGetGamificationScorecardsAttendanceRequest(LocalDate startWorkday, LocalDate endWorkday) {
    return GetGamificationScorecardsAttendanceRequest.builder()
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .build();
  }

  /**
   * Attendance status metrics of the requesting user
   * 
   * @param request The request object
   * @return AttendanceStatusListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttendanceStatusListing getGamificationScorecardsAttendance(GetGamificationScorecardsAttendanceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttendanceStatusListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttendanceStatusListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Attendance status metrics of the requesting user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttendanceStatusListing> getGamificationScorecardsAttendance(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttendanceStatusListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Best points of the requesting user
   * 
   * @return UserBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserBestPoints getGamificationScorecardsBestpoints() throws IOException, ApiException {
    return  getGamificationScorecardsBestpoints(createGetGamificationScorecardsBestpointsRequest());
  }

  /**
   * Best points of the requesting user
   * 
   * @return UserBestPoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserBestPoints> getGamificationScorecardsBestpointsWithHttpInfo() throws IOException {
    return getGamificationScorecardsBestpoints(createGetGamificationScorecardsBestpointsRequest().withHttpInfo());
  }

  private GetGamificationScorecardsBestpointsRequest createGetGamificationScorecardsBestpointsRequest() {
    return GetGamificationScorecardsBestpointsRequest.builder()
            .build();
  }

  /**
   * Best points of the requesting user
   * 
   * @param request The request object
   * @return UserBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserBestPoints getGamificationScorecardsBestpoints(GetGamificationScorecardsBestpointsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserBestPoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserBestPoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Best points of the requesting user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserBestPoints> getGamificationScorecardsBestpoints(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserBestPoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)exception;
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
      ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All-time points of the requesting user
   * 
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AllTimePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AllTimePoints getGamificationScorecardsPointsAlltime(LocalDate endWorkday) throws IOException, ApiException {
    return  getGamificationScorecardsPointsAlltime(createGetGamificationScorecardsPointsAlltimeRequest(endWorkday));
  }

  /**
   * All-time points of the requesting user
   * 
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AllTimePoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AllTimePoints> getGamificationScorecardsPointsAlltimeWithHttpInfo(LocalDate endWorkday) throws IOException {
    return getGamificationScorecardsPointsAlltime(createGetGamificationScorecardsPointsAlltimeRequest(endWorkday).withHttpInfo());
  }

  private GetGamificationScorecardsPointsAlltimeRequest createGetGamificationScorecardsPointsAlltimeRequest(LocalDate endWorkday) {
    return GetGamificationScorecardsPointsAlltimeRequest.builder()
            .withEndWorkday(endWorkday)
    
            .build();
  }

  /**
   * All-time points of the requesting user
   * 
   * @param request The request object
   * @return AllTimePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AllTimePoints getGamificationScorecardsPointsAlltime(GetGamificationScorecardsPointsAlltimeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AllTimePoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AllTimePoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All-time points of the requesting user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AllTimePoints> getGamificationScorecardsPointsAlltime(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AllTimePoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)exception;
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
      ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Average points of the requesting user&#39;s division or performance profile
   * 
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return SingleWorkdayAveragePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAveragePoints getGamificationScorecardsPointsAverage(LocalDate workday) throws IOException, ApiException {
    return  getGamificationScorecardsPointsAverage(createGetGamificationScorecardsPointsAverageRequest(workday));
  }

  /**
   * Average points of the requesting user&#39;s division or performance profile
   * 
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return SingleWorkdayAveragePoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAveragePoints> getGamificationScorecardsPointsAverageWithHttpInfo(LocalDate workday) throws IOException {
    return getGamificationScorecardsPointsAverage(createGetGamificationScorecardsPointsAverageRequest(workday).withHttpInfo());
  }

  private GetGamificationScorecardsPointsAverageRequest createGetGamificationScorecardsPointsAverageRequest(LocalDate workday) {
    return GetGamificationScorecardsPointsAverageRequest.builder()
            .withWorkday(workday)
    
            .build();
  }

  /**
   * Average points of the requesting user&#39;s division or performance profile
   * 
   * @param request The request object
   * @return SingleWorkdayAveragePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAveragePoints getGamificationScorecardsPointsAverage(GetGamificationScorecardsPointsAverageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SingleWorkdayAveragePoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SingleWorkdayAveragePoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Average points of the requesting user&#39;s division or performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAveragePoints> getGamificationScorecardsPointsAverage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SingleWorkdayAveragePoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)exception;
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
      ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Points trends of the requesting user
   * 
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param dayOfWeek Optional filter to specify which day of weeks to be included in the response (optional)
   * @return WorkdayPointsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayPointsTrend getGamificationScorecardsPointsTrends(LocalDate startWorkday, LocalDate endWorkday, String dayOfWeek) throws IOException, ApiException {
    return  getGamificationScorecardsPointsTrends(createGetGamificationScorecardsPointsTrendsRequest(startWorkday, endWorkday, dayOfWeek));
  }

  /**
   * Points trends of the requesting user
   * 
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param dayOfWeek Optional filter to specify which day of weeks to be included in the response (optional)
   * @return WorkdayPointsTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayPointsTrend> getGamificationScorecardsPointsTrendsWithHttpInfo(LocalDate startWorkday, LocalDate endWorkday, String dayOfWeek) throws IOException {
    return getGamificationScorecardsPointsTrends(createGetGamificationScorecardsPointsTrendsRequest(startWorkday, endWorkday, dayOfWeek).withHttpInfo());
  }

  private GetGamificationScorecardsPointsTrendsRequest createGetGamificationScorecardsPointsTrendsRequest(LocalDate startWorkday, LocalDate endWorkday, String dayOfWeek) {
    return GetGamificationScorecardsPointsTrendsRequest.builder()
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .withDayOfWeek(dayOfWeek)
    
            .build();
  }

  /**
   * Points trends of the requesting user
   * 
   * @param request The request object
   * @return WorkdayPointsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayPointsTrend getGamificationScorecardsPointsTrends(GetGamificationScorecardsPointsTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkdayPointsTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkdayPointsTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Points trends of the requesting user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayPointsTrend> getGamificationScorecardsPointsTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkdayPointsTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Workday performance metrics for a user
   * 
   * @param userId  (required)
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkdayMetricListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayMetricListing getGamificationScorecardsUser(String userId, LocalDate workday, List<String> expand) throws IOException, ApiException {
    return  getGamificationScorecardsUser(createGetGamificationScorecardsUserRequest(userId, workday, expand));
  }

  /**
   * Workday performance metrics for a user
   * 
   * @param userId  (required)
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return WorkdayMetricListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayMetricListing> getGamificationScorecardsUserWithHttpInfo(String userId, LocalDate workday, List<String> expand) throws IOException {
    return getGamificationScorecardsUser(createGetGamificationScorecardsUserRequest(userId, workday, expand).withHttpInfo());
  }

  private GetGamificationScorecardsUserRequest createGetGamificationScorecardsUserRequest(String userId, LocalDate workday, List<String> expand) {
    return GetGamificationScorecardsUserRequest.builder()
            .withUserId(userId)
    
            .withWorkday(workday)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Workday performance metrics for a user
   * 
   * @param request The request object
   * @return WorkdayMetricListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayMetricListing getGamificationScorecardsUser(GetGamificationScorecardsUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkdayMetricListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkdayMetricListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Workday performance metrics for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayMetricListing> getGamificationScorecardsUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkdayMetricListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Attendance status metrics for a user
   * 
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AttendanceStatusListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttendanceStatusListing getGamificationScorecardsUserAttendance(String userId, LocalDate startWorkday, LocalDate endWorkday) throws IOException, ApiException {
    return  getGamificationScorecardsUserAttendance(createGetGamificationScorecardsUserAttendanceRequest(userId, startWorkday, endWorkday));
  }

  /**
   * Attendance status metrics for a user
   * 
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AttendanceStatusListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttendanceStatusListing> getGamificationScorecardsUserAttendanceWithHttpInfo(String userId, LocalDate startWorkday, LocalDate endWorkday) throws IOException {
    return getGamificationScorecardsUserAttendance(createGetGamificationScorecardsUserAttendanceRequest(userId, startWorkday, endWorkday).withHttpInfo());
  }

  private GetGamificationScorecardsUserAttendanceRequest createGetGamificationScorecardsUserAttendanceRequest(String userId, LocalDate startWorkday, LocalDate endWorkday) {
    return GetGamificationScorecardsUserAttendanceRequest.builder()
            .withUserId(userId)
    
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .build();
  }

  /**
   * Attendance status metrics for a user
   * 
   * @param request The request object
   * @return AttendanceStatusListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttendanceStatusListing getGamificationScorecardsUserAttendance(GetGamificationScorecardsUserAttendanceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttendanceStatusListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttendanceStatusListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Attendance status metrics for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttendanceStatusListing> getGamificationScorecardsUserAttendance(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttendanceStatusListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Best points of a user
   * 
   * @param userId  (required)
   * @return UserBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserBestPoints getGamificationScorecardsUserBestpoints(String userId) throws IOException, ApiException {
    return  getGamificationScorecardsUserBestpoints(createGetGamificationScorecardsUserBestpointsRequest(userId));
  }

  /**
   * Best points of a user
   * 
   * @param userId  (required)
   * @return UserBestPoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserBestPoints> getGamificationScorecardsUserBestpointsWithHttpInfo(String userId) throws IOException {
    return getGamificationScorecardsUserBestpoints(createGetGamificationScorecardsUserBestpointsRequest(userId).withHttpInfo());
  }

  private GetGamificationScorecardsUserBestpointsRequest createGetGamificationScorecardsUserBestpointsRequest(String userId) {
    return GetGamificationScorecardsUserBestpointsRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Best points of a user
   * 
   * @param request The request object
   * @return UserBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserBestPoints getGamificationScorecardsUserBestpoints(GetGamificationScorecardsUserBestpointsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserBestPoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserBestPoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Best points of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserBestPoints> getGamificationScorecardsUserBestpoints(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserBestPoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)exception;
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
      ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All-time points for a user
   * 
   * @param userId  (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AllTimePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AllTimePoints getGamificationScorecardsUserPointsAlltime(String userId, LocalDate endWorkday) throws IOException, ApiException {
    return  getGamificationScorecardsUserPointsAlltime(createGetGamificationScorecardsUserPointsAlltimeRequest(userId, endWorkday));
  }

  /**
   * All-time points for a user
   * 
   * @param userId  (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return AllTimePoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AllTimePoints> getGamificationScorecardsUserPointsAlltimeWithHttpInfo(String userId, LocalDate endWorkday) throws IOException {
    return getGamificationScorecardsUserPointsAlltime(createGetGamificationScorecardsUserPointsAlltimeRequest(userId, endWorkday).withHttpInfo());
  }

  private GetGamificationScorecardsUserPointsAlltimeRequest createGetGamificationScorecardsUserPointsAlltimeRequest(String userId, LocalDate endWorkday) {
    return GetGamificationScorecardsUserPointsAlltimeRequest.builder()
            .withUserId(userId)
    
            .withEndWorkday(endWorkday)
    
            .build();
  }

  /**
   * All-time points for a user
   * 
   * @param request The request object
   * @return AllTimePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AllTimePoints getGamificationScorecardsUserPointsAlltime(GetGamificationScorecardsUserPointsAlltimeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AllTimePoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AllTimePoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All-time points for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AllTimePoints> getGamificationScorecardsUserPointsAlltime(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AllTimePoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)exception;
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
      ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Points trend for a user
   * 
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param dayOfWeek Optional filter to specify which day of weeks to be included in the response (optional)
   * @return WorkdayPointsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayPointsTrend getGamificationScorecardsUserPointsTrends(String userId, LocalDate startWorkday, LocalDate endWorkday, String dayOfWeek) throws IOException, ApiException {
    return  getGamificationScorecardsUserPointsTrends(createGetGamificationScorecardsUserPointsTrendsRequest(userId, startWorkday, endWorkday, dayOfWeek));
  }

  /**
   * Points trend for a user
   * 
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param dayOfWeek Optional filter to specify which day of weeks to be included in the response (optional)
   * @return WorkdayPointsTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayPointsTrend> getGamificationScorecardsUserPointsTrendsWithHttpInfo(String userId, LocalDate startWorkday, LocalDate endWorkday, String dayOfWeek) throws IOException {
    return getGamificationScorecardsUserPointsTrends(createGetGamificationScorecardsUserPointsTrendsRequest(userId, startWorkday, endWorkday, dayOfWeek).withHttpInfo());
  }

  private GetGamificationScorecardsUserPointsTrendsRequest createGetGamificationScorecardsUserPointsTrendsRequest(String userId, LocalDate startWorkday, LocalDate endWorkday, String dayOfWeek) {
    return GetGamificationScorecardsUserPointsTrendsRequest.builder()
            .withUserId(userId)
    
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .withDayOfWeek(dayOfWeek)
    
            .build();
  }

  /**
   * Points trend for a user
   * 
   * @param request The request object
   * @return WorkdayPointsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayPointsTrend getGamificationScorecardsUserPointsTrends(GetGamificationScorecardsUserPointsTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkdayPointsTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkdayPointsTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Points trend for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayPointsTrend> getGamificationScorecardsUserPointsTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkdayPointsTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Values trends of a user
   * 
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return WorkdayValuesTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayValuesTrend getGamificationScorecardsUserValuesTrends(String userId, LocalDate startWorkday, LocalDate endWorkday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsUserValuesTrends(createGetGamificationScorecardsUserValuesTrendsRequest(userId, startWorkday, endWorkday, timeZone));
  }

  /**
   * Values trends of a user
   * 
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return WorkdayValuesTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayValuesTrend> getGamificationScorecardsUserValuesTrendsWithHttpInfo(String userId, LocalDate startWorkday, LocalDate endWorkday, String timeZone) throws IOException {
    return getGamificationScorecardsUserValuesTrends(createGetGamificationScorecardsUserValuesTrendsRequest(userId, startWorkday, endWorkday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsUserValuesTrendsRequest createGetGamificationScorecardsUserValuesTrendsRequest(String userId, LocalDate startWorkday, LocalDate endWorkday, String timeZone) {
    return GetGamificationScorecardsUserValuesTrendsRequest.builder()
            .withUserId(userId)
    
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .withTimeZone(timeZone)
    
            .build();
  }

  /**
   * Values trends of a user
   * 
   * @param request The request object
   * @return WorkdayValuesTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayValuesTrend getGamificationScorecardsUserValuesTrends(GetGamificationScorecardsUserValuesTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkdayValuesTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkdayValuesTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Values trends of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayValuesTrend> getGamificationScorecardsUserValuesTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkdayValuesTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Workday average points by target group
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return SingleWorkdayAveragePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAveragePoints getGamificationScorecardsUsersPointsAverage(String filterType, String filterId, LocalDate workday) throws IOException, ApiException {
    return  getGamificationScorecardsUsersPointsAverage(createGetGamificationScorecardsUsersPointsAverageRequest(filterType, filterId, workday));
  }

  /**
   * Workday average points by target group
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return SingleWorkdayAveragePoints
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAveragePoints> getGamificationScorecardsUsersPointsAverageWithHttpInfo(String filterType, String filterId, LocalDate workday) throws IOException {
    return getGamificationScorecardsUsersPointsAverage(createGetGamificationScorecardsUsersPointsAverageRequest(filterType, filterId, workday).withHttpInfo());
  }

  private GetGamificationScorecardsUsersPointsAverageRequest createGetGamificationScorecardsUsersPointsAverageRequest(String filterType, String filterId, LocalDate workday) {
    return GetGamificationScorecardsUsersPointsAverageRequest.builder()
            .withFilterType(filterType)
    
            .withFilterId(filterId)
    
            .withWorkday(workday)
    
            .build();
  }

  /**
   * Workday average points by target group
   * 
   * @param request The request object
   * @return SingleWorkdayAveragePoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAveragePoints getGamificationScorecardsUsersPointsAverage(GetGamificationScorecardsUsersPointsAverageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SingleWorkdayAveragePoints> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SingleWorkdayAveragePoints>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Workday average points by target group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAveragePoints> getGamificationScorecardsUsersPointsAverage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SingleWorkdayAveragePoints>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)exception;
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
      ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Workday average values by target group
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. For example, division Id (required)
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return SingleWorkdayAverageValues
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAverageValues getGamificationScorecardsUsersValuesAverage(String filterType, String filterId, LocalDate workday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsUsersValuesAverage(createGetGamificationScorecardsUsersValuesAverageRequest(filterType, filterId, workday, timeZone));
  }

  /**
   * Workday average values by target group
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. For example, division Id (required)
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return SingleWorkdayAverageValues
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAverageValues> getGamificationScorecardsUsersValuesAverageWithHttpInfo(String filterType, String filterId, LocalDate workday, String timeZone) throws IOException {
    return getGamificationScorecardsUsersValuesAverage(createGetGamificationScorecardsUsersValuesAverageRequest(filterType, filterId, workday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsUsersValuesAverageRequest createGetGamificationScorecardsUsersValuesAverageRequest(String filterType, String filterId, LocalDate workday, String timeZone) {
    return GetGamificationScorecardsUsersValuesAverageRequest.builder()
            .withFilterType(filterType)
    
            .withFilterId(filterId)
    
            .withWorkday(workday)
    
            .withTimeZone(timeZone)
    
            .build();
  }

  /**
   * Workday average values by target group
   * 
   * @param request The request object
   * @return SingleWorkdayAverageValues
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAverageValues getGamificationScorecardsUsersValuesAverage(GetGamificationScorecardsUsersValuesAverageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SingleWorkdayAverageValues> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SingleWorkdayAverageValues>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Workday average values by target group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAverageValues> getGamificationScorecardsUsersValuesAverage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SingleWorkdayAverageValues>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)exception;
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
      ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Values trend by target group
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return WorkdayValuesTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayValuesTrend getGamificationScorecardsUsersValuesTrends(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsUsersValuesTrends(createGetGamificationScorecardsUsersValuesTrendsRequest(filterType, filterId, startWorkday, endWorkday, timeZone));
  }

  /**
   * Values trend by target group
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return WorkdayValuesTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayValuesTrend> getGamificationScorecardsUsersValuesTrendsWithHttpInfo(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday, String timeZone) throws IOException {
    return getGamificationScorecardsUsersValuesTrends(createGetGamificationScorecardsUsersValuesTrendsRequest(filterType, filterId, startWorkday, endWorkday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsUsersValuesTrendsRequest createGetGamificationScorecardsUsersValuesTrendsRequest(String filterType, String filterId, LocalDate startWorkday, LocalDate endWorkday, String timeZone) {
    return GetGamificationScorecardsUsersValuesTrendsRequest.builder()
            .withFilterType(filterType)
    
            .withFilterId(filterId)
    
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .withTimeZone(timeZone)
    
            .build();
  }

  /**
   * Values trend by target group
   * 
   * @param request The request object
   * @return WorkdayValuesTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayValuesTrend getGamificationScorecardsUsersValuesTrends(GetGamificationScorecardsUsersValuesTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkdayValuesTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkdayValuesTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Values trend by target group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayValuesTrend> getGamificationScorecardsUsersValuesTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkdayValuesTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Average values of the requesting user&#39;s division or performance profile
   * 
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return SingleWorkdayAverageValues
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAverageValues getGamificationScorecardsValuesAverage(LocalDate workday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsValuesAverage(createGetGamificationScorecardsValuesAverageRequest(workday, timeZone));
  }

  /**
   * Average values of the requesting user&#39;s division or performance profile
   * 
   * @param workday The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return SingleWorkdayAverageValues
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAverageValues> getGamificationScorecardsValuesAverageWithHttpInfo(LocalDate workday, String timeZone) throws IOException {
    return getGamificationScorecardsValuesAverage(createGetGamificationScorecardsValuesAverageRequest(workday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsValuesAverageRequest createGetGamificationScorecardsValuesAverageRequest(LocalDate workday, String timeZone) {
    return GetGamificationScorecardsValuesAverageRequest.builder()
            .withWorkday(workday)
    
            .withTimeZone(timeZone)
    
            .build();
  }

  /**
   * Average values of the requesting user&#39;s division or performance profile
   * 
   * @param request The request object
   * @return SingleWorkdayAverageValues
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SingleWorkdayAverageValues getGamificationScorecardsValuesAverage(GetGamificationScorecardsValuesAverageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SingleWorkdayAverageValues> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SingleWorkdayAverageValues>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Average values of the requesting user&#39;s division or performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SingleWorkdayAverageValues> getGamificationScorecardsValuesAverage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SingleWorkdayAverageValues>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)exception;
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
      ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Values trends of the requesting user or group
   * 
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param filterType Filter type for the query request. If not set, then the request is for the requesting user. (optional)
   * @param referenceWorkday Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user&#39;s current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return WorkdayValuesTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayValuesTrend getGamificationScorecardsValuesTrends(LocalDate startWorkday, LocalDate endWorkday, String filterType, LocalDate referenceWorkday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsValuesTrends(createGetGamificationScorecardsValuesTrendsRequest(startWorkday, endWorkday, filterType, referenceWorkday, timeZone));
  }

  /**
   * Values trends of the requesting user or group
   * 
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param filterType Filter type for the query request. If not set, then the request is for the requesting user. (optional)
   * @param referenceWorkday Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user&#39;s current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return WorkdayValuesTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayValuesTrend> getGamificationScorecardsValuesTrendsWithHttpInfo(LocalDate startWorkday, LocalDate endWorkday, String filterType, LocalDate referenceWorkday, String timeZone) throws IOException {
    return getGamificationScorecardsValuesTrends(createGetGamificationScorecardsValuesTrendsRequest(startWorkday, endWorkday, filterType, referenceWorkday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsValuesTrendsRequest createGetGamificationScorecardsValuesTrendsRequest(LocalDate startWorkday, LocalDate endWorkday, String filterType, LocalDate referenceWorkday, String timeZone) {
    return GetGamificationScorecardsValuesTrendsRequest.builder()
            .withStartWorkday(startWorkday)
    
            .withEndWorkday(endWorkday)
    
            .withFilterType(filterType)
    
            .withReferenceWorkday(referenceWorkday)
    
            .withTimeZone(timeZone)
    
            .build();
  }

  /**
   * Values trends of the requesting user or group
   * 
   * @param request The request object
   * @return WorkdayValuesTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkdayValuesTrend getGamificationScorecardsValuesTrends(GetGamificationScorecardsValuesTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkdayValuesTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkdayValuesTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Values trends of the requesting user or group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkdayValuesTrend> getGamificationScorecardsValuesTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkdayValuesTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gamification activation status
   * 
   * @return GamificationStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GamificationStatus getGamificationStatus() throws IOException, ApiException {
    return  getGamificationStatus(createGetGamificationStatusRequest());
  }

  /**
   * Gamification activation status
   * 
   * @return GamificationStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GamificationStatus> getGamificationStatusWithHttpInfo() throws IOException {
    return getGamificationStatus(createGetGamificationStatusRequest().withHttpInfo());
  }

  private GetGamificationStatusRequest createGetGamificationStatusRequest() {
    return GetGamificationStatusRequest.builder()
            .build();
  }

  /**
   * Gamification activation status
   * 
   * @param request The request object
   * @return GamificationStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GamificationStatus getGamificationStatus(GetGamificationStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GamificationStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GamificationStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gamification activation status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GamificationStatus> getGamificationStatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GamificationStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Objective template by id
   * 
   * @param templateId template id (required)
   * @return ObjectiveTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ObjectiveTemplate getGamificationTemplate(String templateId) throws IOException, ApiException {
    return  getGamificationTemplate(createGetGamificationTemplateRequest(templateId));
  }

  /**
   * Objective template by id
   * 
   * @param templateId template id (required)
   * @return ObjectiveTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ObjectiveTemplate> getGamificationTemplateWithHttpInfo(String templateId) throws IOException {
    return getGamificationTemplate(createGetGamificationTemplateRequest(templateId).withHttpInfo());
  }

  private GetGamificationTemplateRequest createGetGamificationTemplateRequest(String templateId) {
    return GetGamificationTemplateRequest.builder()
            .withTemplateId(templateId)
    
            .build();
  }

  /**
   * Objective template by id
   * 
   * @param request The request object
   * @return ObjectiveTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ObjectiveTemplate getGamificationTemplate(GetGamificationTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ObjectiveTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ObjectiveTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Objective template by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ObjectiveTemplate> getGamificationTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ObjectiveTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ObjectiveTemplate> response = (ApiResponse<ObjectiveTemplate>)(ApiResponse<?>)exception;
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
      ApiResponse<ObjectiveTemplate> response = (ApiResponse<ObjectiveTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * All objective templates
   * 
   * @return GetTemplatesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetTemplatesResponse getGamificationTemplates() throws IOException, ApiException {
    return  getGamificationTemplates(createGetGamificationTemplatesRequest());
  }

  /**
   * All objective templates
   * 
   * @return GetTemplatesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetTemplatesResponse> getGamificationTemplatesWithHttpInfo() throws IOException {
    return getGamificationTemplates(createGetGamificationTemplatesRequest().withHttpInfo());
  }

  private GetGamificationTemplatesRequest createGetGamificationTemplatesRequest() {
    return GetGamificationTemplatesRequest.builder()
            .build();
  }

  /**
   * All objective templates
   * 
   * @param request The request object
   * @return GetTemplatesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetTemplatesResponse getGamificationTemplates(GetGamificationTemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetTemplatesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetTemplatesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * All objective templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetTemplatesResponse> getGamificationTemplates(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetTemplatesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetTemplatesResponse> response = (ApiResponse<GetTemplatesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetTemplatesResponse> response = (ApiResponse<GetTemplatesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a gamified metric with a given metric definition and metric objective
   * 
   * @param body Metric (required)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric postGamificationMetrics(Metric body) throws IOException, ApiException {
    return  postGamificationMetrics(createPostGamificationMetricsRequest(body));
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective
   * 
   * @param body Metric (required)
   * @return Metric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> postGamificationMetricsWithHttpInfo(Metric body) throws IOException {
    return postGamificationMetrics(createPostGamificationMetricsRequest(body).withHttpInfo());
  }

  private PostGamificationMetricsRequest createPostGamificationMetricsRequest(Metric body) {
    return PostGamificationMetricsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective
   * 
   * @param request The request object
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric postGamificationMetrics(PostGamificationMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Metric> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Metric>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> postGamificationMetrics(ApiRequest<Metric> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Metric>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
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
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Activate a performance profile
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfileActivate(String performanceProfileId) throws IOException, ApiException {
    return  postGamificationProfileActivate(createPostGamificationProfileActivateRequest(performanceProfileId));
  }

  /**
   * Activate a performance profile
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfileActivateWithHttpInfo(String performanceProfileId) throws IOException {
    return postGamificationProfileActivate(createPostGamificationProfileActivateRequest(performanceProfileId).withHttpInfo());
  }

  private PostGamificationProfileActivateRequest createPostGamificationProfileActivateRequest(String performanceProfileId) {
    return PostGamificationProfileActivateRequest.builder()
            .withPerformanceProfileId(performanceProfileId)
    
            .build();
  }

  /**
   * Activate a performance profile
   * 
   * @param request The request object
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfileActivate(PostGamificationProfileActivateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformanceProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Activate a performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfileActivate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformanceProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deactivate a performance profile
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfileDeactivate(String performanceProfileId) throws IOException, ApiException {
    return  postGamificationProfileDeactivate(createPostGamificationProfileDeactivateRequest(performanceProfileId));
  }

  /**
   * Deactivate a performance profile
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfileDeactivateWithHttpInfo(String performanceProfileId) throws IOException {
    return postGamificationProfileDeactivate(createPostGamificationProfileDeactivateRequest(performanceProfileId).withHttpInfo());
  }

  private PostGamificationProfileDeactivateRequest createPostGamificationProfileDeactivateRequest(String performanceProfileId) {
    return PostGamificationProfileDeactivateRequest.builder()
            .withPerformanceProfileId(performanceProfileId)
    
            .build();
  }

  /**
   * Deactivate a performance profile
   * 
   * @param request The request object
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfileDeactivate(PostGamificationProfileDeactivateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformanceProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Deactivate a performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfileDeactivate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformanceProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a gamified metric with a given metric definition and metric objective under in a performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param body Metric (required)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric postGamificationProfileMetrics(String profileId, Metric body) throws IOException, ApiException {
    return  postGamificationProfileMetrics(createPostGamificationProfileMetricsRequest(profileId, body));
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective under in a performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param body Metric (required)
   * @return Metric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> postGamificationProfileMetricsWithHttpInfo(String profileId, Metric body) throws IOException {
    return postGamificationProfileMetrics(createPostGamificationProfileMetricsRequest(profileId, body).withHttpInfo());
  }

  private PostGamificationProfileMetricsRequest createPostGamificationProfileMetricsRequest(String profileId, Metric body) {
    return PostGamificationProfileMetricsRequest.builder()
            .withProfileId(profileId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective under in a performance profile
   * 
   * @param request The request object
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric postGamificationProfileMetrics(PostGamificationProfileMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Metric> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Metric>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective under in a performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> postGamificationProfileMetrics(ApiRequest<Metric> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Metric>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
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
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new custom performance profile
   * 
   * @param body performanceProfile (required)
   * @return GetProfilesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetProfilesResponse postGamificationProfiles(CreatePerformanceProfile body) throws IOException, ApiException {
    return  postGamificationProfiles(createPostGamificationProfilesRequest(body));
  }

  /**
   * Create a new custom performance profile
   * 
   * @param body performanceProfile (required)
   * @return GetProfilesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetProfilesResponse> postGamificationProfilesWithHttpInfo(CreatePerformanceProfile body) throws IOException {
    return postGamificationProfiles(createPostGamificationProfilesRequest(body).withHttpInfo());
  }

  private PostGamificationProfilesRequest createPostGamificationProfilesRequest(CreatePerformanceProfile body) {
    return PostGamificationProfilesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new custom performance profile
   * 
   * @param request The request object
   * @return GetProfilesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetProfilesResponse postGamificationProfiles(PostGamificationProfilesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetProfilesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetProfilesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new custom performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetProfilesResponse> postGamificationProfiles(ApiRequest<CreatePerformanceProfile> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetProfilesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetProfilesResponse> response = (ApiResponse<GetProfilesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetProfilesResponse> response = (ApiResponse<GetProfilesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates a metric
   * 
   * @param metricId metric Id (required)
   * @param body Metric (required)
   * @param performanceProfileId The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. (optional)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric putGamificationMetric(String metricId, Metric body, String performanceProfileId) throws IOException, ApiException {
    return  putGamificationMetric(createPutGamificationMetricRequest(metricId, body, performanceProfileId));
  }

  /**
   * Updates a metric
   * 
   * @param metricId metric Id (required)
   * @param body Metric (required)
   * @param performanceProfileId The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. (optional)
   * @return Metric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> putGamificationMetricWithHttpInfo(String metricId, Metric body, String performanceProfileId) throws IOException {
    return putGamificationMetric(createPutGamificationMetricRequest(metricId, body, performanceProfileId).withHttpInfo());
  }

  private PutGamificationMetricRequest createPutGamificationMetricRequest(String metricId, Metric body, String performanceProfileId) {
    return PutGamificationMetricRequest.builder()
            .withMetricId(metricId)
    
            .withBody(body)
    
            .withPerformanceProfileId(performanceProfileId)
    
            .build();
  }

  /**
   * Updates a metric
   * 
   * @param request The request object
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric putGamificationMetric(PutGamificationMetricRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Metric> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Metric>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a metric
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> putGamificationMetric(ApiRequest<Metric> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Metric>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
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
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates a performance profile
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @param body performanceProfile (optional)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile putGamificationProfile(String performanceProfileId, PerformanceProfile body) throws IOException, ApiException {
    return  putGamificationProfile(createPutGamificationProfileRequest(performanceProfileId, body));
  }

  /**
   * Updates a performance profile
   * 
   * @param performanceProfileId Performance Profile Id (required)
   * @param body performanceProfile (optional)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> putGamificationProfileWithHttpInfo(String performanceProfileId, PerformanceProfile body) throws IOException {
    return putGamificationProfile(createPutGamificationProfileRequest(performanceProfileId, body).withHttpInfo());
  }

  private PutGamificationProfileRequest createPutGamificationProfileRequest(String performanceProfileId, PerformanceProfile body) {
    return PutGamificationProfileRequest.builder()
            .withPerformanceProfileId(performanceProfileId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates a performance profile
   * 
   * @param request The request object
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile putGamificationProfile(PutGamificationProfileRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformanceProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> putGamificationProfile(ApiRequest<PerformanceProfile> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformanceProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates a metric in performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param metricId Metric Id (required)
   * @param body Metric (required)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric putGamificationProfileMetric(String profileId, String metricId, Metric body) throws IOException, ApiException {
    return  putGamificationProfileMetric(createPutGamificationProfileMetricRequest(profileId, metricId, body));
  }

  /**
   * Updates a metric in performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param metricId Metric Id (required)
   * @param body Metric (required)
   * @return Metric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> putGamificationProfileMetricWithHttpInfo(String profileId, String metricId, Metric body) throws IOException {
    return putGamificationProfileMetric(createPutGamificationProfileMetricRequest(profileId, metricId, body).withHttpInfo());
  }

  private PutGamificationProfileMetricRequest createPutGamificationProfileMetricRequest(String profileId, String metricId, Metric body) {
    return PutGamificationProfileMetricRequest.builder()
            .withProfileId(profileId)
    
            .withMetricId(metricId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates a metric in performance profile
   * 
   * @param request The request object
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric putGamificationProfileMetric(PutGamificationProfileMetricRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Metric> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Metric>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a metric in performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> putGamificationProfileMetric(ApiRequest<Metric> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Metric>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
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
      ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update gamification activation status
   * 
   * @param status Gamification status (required)
   * @return GamificationStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GamificationStatus putGamificationStatus(GamificationStatus status) throws IOException, ApiException {
    return  putGamificationStatus(createPutGamificationStatusRequest(status));
  }

  /**
   * Update gamification activation status
   * 
   * @param status Gamification status (required)
   * @return GamificationStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GamificationStatus> putGamificationStatusWithHttpInfo(GamificationStatus status) throws IOException {
    return putGamificationStatus(createPutGamificationStatusRequest(status).withHttpInfo());
  }

  private PutGamificationStatusRequest createPutGamificationStatusRequest(GamificationStatus status) {
    return PutGamificationStatusRequest.builder()
            .withStatus(status)
    
            .build();
  }

  /**
   * Update gamification activation status
   * 
   * @param request The request object
   * @return GamificationStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GamificationStatus putGamificationStatus(PutGamificationStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GamificationStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GamificationStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update gamification activation status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GamificationStatus> putGamificationStatus(ApiRequest<GamificationStatus> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GamificationStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
