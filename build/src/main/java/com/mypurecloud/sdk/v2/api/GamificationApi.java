package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AllTimePoints;
import com.mypurecloud.sdk.v2.model.AssignUsers;
import com.mypurecloud.sdk.v2.model.Assignment;
import com.mypurecloud.sdk.v2.model.AssignmentValidation;
import com.mypurecloud.sdk.v2.model.AttendanceStatusListing;
import com.mypurecloud.sdk.v2.model.ContestScoresAgentTrendList;
import com.mypurecloud.sdk.v2.model.ContestScoresAgentsPagedList;
import com.mypurecloud.sdk.v2.model.ContestScoresGroupTrendList;
import com.mypurecloud.sdk.v2.model.ContestsCreateRequest;
import com.mypurecloud.sdk.v2.model.ContestsFinalizeRequest;
import com.mypurecloud.sdk.v2.model.ContestsResponse;
import com.mypurecloud.sdk.v2.model.CreateMetric;
import com.mypurecloud.sdk.v2.model.CreatePerformanceProfile;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalMetricDataWriteRequest;
import com.mypurecloud.sdk.v2.model.ExternalMetricDataWriteResponse;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinition;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionCreateRequest;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionListing;
import com.mypurecloud.sdk.v2.model.ExternalMetricDefinitionUpdateRequest;
import com.mypurecloud.sdk.v2.model.GamificationContestPrizeImageUploadUrlRequest;
import com.mypurecloud.sdk.v2.model.GamificationStatus;
import com.mypurecloud.sdk.v2.model.GetContestsEssentialsListing;
import com.mypurecloud.sdk.v2.model.GetMetricDefinitionsResponse;
import com.mypurecloud.sdk.v2.model.GetMetricResponse;
import com.mypurecloud.sdk.v2.model.GetMetricsResponse;
import com.mypurecloud.sdk.v2.model.GetProfilesResponse;
import com.mypurecloud.sdk.v2.model.GetTemplatesResponse;
import com.mypurecloud.sdk.v2.model.InsightsAgents;
import com.mypurecloud.sdk.v2.model.InsightsDetails;
import com.mypurecloud.sdk.v2.model.InsightsRankings;
import com.mypurecloud.sdk.v2.model.InsightsSummary;
import com.mypurecloud.sdk.v2.model.InsightsTrend;
import com.mypurecloud.sdk.v2.model.Leaderboard;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.MemberListing;
import com.mypurecloud.sdk.v2.model.Metric;
import com.mypurecloud.sdk.v2.model.MetricDefinition;
import com.mypurecloud.sdk.v2.model.MetricValueTrendAverage;
import com.mypurecloud.sdk.v2.model.ObjectiveTemplate;
import com.mypurecloud.sdk.v2.model.OverallBestPoints;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import com.mypurecloud.sdk.v2.model.PrizeImages;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAveragePoints;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAverageValues;
import com.mypurecloud.sdk.v2.model.TargetPerformanceProfile;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.UserBestPoints;
import com.mypurecloud.sdk.v2.model.UserInsightsTrend;
import com.mypurecloud.sdk.v2.model.UserProfilesInDateRange;
import com.mypurecloud.sdk.v2.model.UserProfilesInDateRangeRequest;
import com.mypurecloud.sdk.v2.model.ValidateAssignUsers;
import com.mypurecloud.sdk.v2.model.WorkdayMetricListing;
import com.mypurecloud.sdk.v2.model.WorkdayPointsTrend;
import com.mypurecloud.sdk.v2.model.WorkdayValuesTrend;


import com.mypurecloud.sdk.v2.api.request.DeleteEmployeeperformanceExternalmetricsDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteGamificationContestRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmployeeperformanceExternalmetricsDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmployeeperformanceExternalmetricsDefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestAgentsScoresRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestAgentsScoresMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestAgentsScoresTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestAgentsScoresTrendsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestPrizeimageRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationContestsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsGroupsTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsGroupsTrendsAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsRankingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsUserDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationInsightsUserTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardAllBestpointsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationLeaderboardBestpointsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationMetricdefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationMetricdefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfileRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationProfileMembersRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsProfileMetricUserValuesTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsProfileMetricUsersValuesTrendsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGamificationScorecardsProfileMetricValuesTrendsRequest;
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
import com.mypurecloud.sdk.v2.api.request.PatchEmployeeperformanceExternalmetricsDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchGamificationContestRequest;
import com.mypurecloud.sdk.v2.api.request.PostEmployeeperformanceExternalmetricsDataRequest;
import com.mypurecloud.sdk.v2.api.request.PostEmployeeperformanceExternalmetricsDefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationContestsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationContestsUploadsPrizeimagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileActivateRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileDeactivateRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileMembersRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileMembersValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileMetricLinkRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfileMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfilesRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfilesUserQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationProfilesUsersMeQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutGamificationContestRequest;
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
   * Delete an External Metric Definition
   * 
   * @param metricId Specifies the External Metric Definition ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteEmployeeperformanceExternalmetricsDefinition(String metricId) throws IOException, ApiException {
     deleteEmployeeperformanceExternalmetricsDefinition(createDeleteEmployeeperformanceExternalmetricsDefinitionRequest(metricId));
  }

  /**
   * Delete an External Metric Definition
   * 
   * @param metricId Specifies the External Metric Definition ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteEmployeeperformanceExternalmetricsDefinitionWithHttpInfo(String metricId) throws IOException {
    return deleteEmployeeperformanceExternalmetricsDefinition(createDeleteEmployeeperformanceExternalmetricsDefinitionRequest(metricId).withHttpInfo());
  }

  private DeleteEmployeeperformanceExternalmetricsDefinitionRequest createDeleteEmployeeperformanceExternalmetricsDefinitionRequest(String metricId) {
    return DeleteEmployeeperformanceExternalmetricsDefinitionRequest.builder()
            .withMetricId(metricId)

            .build();
  }

  /**
   * Delete an External Metric Definition
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteEmployeeperformanceExternalmetricsDefinition(DeleteEmployeeperformanceExternalmetricsDefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an External Metric Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteEmployeeperformanceExternalmetricsDefinition(ApiRequest<Void> request) throws IOException {
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
   * Delete a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteGamificationContest(String contestId) throws IOException, ApiException {
     deleteGamificationContest(createDeleteGamificationContestRequest(contestId));
  }

  /**
   * Delete a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteGamificationContestWithHttpInfo(String contestId) throws IOException {
    return deleteGamificationContest(createDeleteGamificationContestRequest(contestId).withHttpInfo());
  }

  private DeleteGamificationContestRequest createDeleteGamificationContestRequest(String contestId) {
    return DeleteGamificationContestRequest.builder()
            .withContestId(contestId)

            .build();
  }

  /**
   * Delete a Contest by Id
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteGamificationContest(DeleteGamificationContestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Contest by Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteGamificationContest(ApiRequest<Void> request) throws IOException {
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
   * Get an External Metric Definition
   * 
   * @param metricId Specifies the External Metric Definition ID (required)
   * @return ExternalMetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinition getEmployeeperformanceExternalmetricsDefinition(String metricId) throws IOException, ApiException {
    return  getEmployeeperformanceExternalmetricsDefinition(createGetEmployeeperformanceExternalmetricsDefinitionRequest(metricId));
  }

  /**
   * Get an External Metric Definition
   * 
   * @param metricId Specifies the External Metric Definition ID (required)
   * @return ExternalMetricDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinition> getEmployeeperformanceExternalmetricsDefinitionWithHttpInfo(String metricId) throws IOException {
    return getEmployeeperformanceExternalmetricsDefinition(createGetEmployeeperformanceExternalmetricsDefinitionRequest(metricId).withHttpInfo());
  }

  private GetEmployeeperformanceExternalmetricsDefinitionRequest createGetEmployeeperformanceExternalmetricsDefinitionRequest(String metricId) {
    return GetEmployeeperformanceExternalmetricsDefinitionRequest.builder()
            .withMetricId(metricId)

            .build();
  }

  /**
   * Get an External Metric Definition
   * 
   * @param request The request object
   * @return ExternalMetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinition getEmployeeperformanceExternalmetricsDefinition(GetEmployeeperformanceExternalmetricsDefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalMetricDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalMetricDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an External Metric Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinition> getEmployeeperformanceExternalmetricsDefinition(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalMetricDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of External Metric Definitions of an organization, sorted by name in ascending order
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ExternalMetricDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinitionListing getEmployeeperformanceExternalmetricsDefinitions(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getEmployeeperformanceExternalmetricsDefinitions(createGetEmployeeperformanceExternalmetricsDefinitionsRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of External Metric Definitions of an organization, sorted by name in ascending order
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return ExternalMetricDefinitionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinitionListing> getEmployeeperformanceExternalmetricsDefinitionsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getEmployeeperformanceExternalmetricsDefinitions(createGetEmployeeperformanceExternalmetricsDefinitionsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetEmployeeperformanceExternalmetricsDefinitionsRequest createGetEmployeeperformanceExternalmetricsDefinitionsRequest(Integer pageSize, Integer pageNumber) {
    return GetEmployeeperformanceExternalmetricsDefinitionsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Get a list of External Metric Definitions of an organization, sorted by name in ascending order
   * 
   * @param request The request object
   * @return ExternalMetricDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinitionListing getEmployeeperformanceExternalmetricsDefinitions(GetEmployeeperformanceExternalmetricsDefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalMetricDefinitionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalMetricDefinitionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of External Metric Definitions of an organization, sorted by name in ascending order
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinitionListing> getEmployeeperformanceExternalmetricsDefinitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalMetricDefinitionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalMetricDefinitionListing> response = (ApiResponse<ExternalMetricDefinitionListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalMetricDefinitionListing> response = (ApiResponse<ExternalMetricDefinitionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse getGamificationContest(String contestId) throws IOException, ApiException {
    return  getGamificationContest(createGetGamificationContestRequest(contestId));
  }

  /**
   * Get a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @return ContestsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> getGamificationContestWithHttpInfo(String contestId) throws IOException {
    return getGamificationContest(createGetGamificationContestRequest(contestId).withHttpInfo());
  }

  private GetGamificationContestRequest createGetGamificationContestRequest(String contestId) {
    return GetGamificationContestRequest.builder()
            .withContestId(contestId)

            .build();
  }

  /**
   * Get a Contest by Id
   * 
   * @param request The request object
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse getGamificationContest(GetGamificationContestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Contest by Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> getGamificationContest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Contest Scores (Admin)
   * 
   * @param contestId The ID of the contest (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param returnsView Desired response results (optional, default to All)
   * @return ContestScoresAgentsPagedList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresAgentsPagedList getGamificationContestAgentsScores(String contestId, Integer pageNumber, Integer pageSize, LocalDate workday, String returnsView) throws IOException, ApiException {
    return  getGamificationContestAgentsScores(createGetGamificationContestAgentsScoresRequest(contestId, pageNumber, pageSize, workday, returnsView));
  }

  /**
   * Get Contest Scores (Admin)
   * 
   * @param contestId The ID of the contest (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param returnsView Desired response results (optional, default to All)
   * @return ContestScoresAgentsPagedList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresAgentsPagedList> getGamificationContestAgentsScoresWithHttpInfo(String contestId, Integer pageNumber, Integer pageSize, LocalDate workday, String returnsView) throws IOException {
    return getGamificationContestAgentsScores(createGetGamificationContestAgentsScoresRequest(contestId, pageNumber, pageSize, workday, returnsView).withHttpInfo());
  }

  private GetGamificationContestAgentsScoresRequest createGetGamificationContestAgentsScoresRequest(String contestId, Integer pageNumber, Integer pageSize, LocalDate workday, String returnsView) {
    return GetGamificationContestAgentsScoresRequest.builder()
            .withContestId(contestId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withWorkday(workday)

            .withReturnsView(returnsView)

            .build();
  }

  /**
   * Get Contest Scores (Admin)
   * 
   * @param request The request object
   * @return ContestScoresAgentsPagedList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresAgentsPagedList getGamificationContestAgentsScores(GetGamificationContestAgentsScoresRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestScoresAgentsPagedList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestScoresAgentsPagedList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Contest Scores (Admin)
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresAgentsPagedList> getGamificationContestAgentsScores(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestScoresAgentsPagedList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Contest Scores for the requesting Agent/Supervisor
   * 
   * @param contestId The ID of the contest (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param returnsView Desired response results (Supervisor Only) (optional, default to All)
   * @return ContestScoresAgentsPagedList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresAgentsPagedList getGamificationContestAgentsScoresMe(String contestId, Integer pageNumber, Integer pageSize, LocalDate workday, String returnsView) throws IOException, ApiException {
    return  getGamificationContestAgentsScoresMe(createGetGamificationContestAgentsScoresMeRequest(contestId, pageNumber, pageSize, workday, returnsView));
  }

  /**
   * Get Contest Scores for the requesting Agent/Supervisor
   * 
   * @param contestId The ID of the contest (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param workday Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param returnsView Desired response results (Supervisor Only) (optional, default to All)
   * @return ContestScoresAgentsPagedList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresAgentsPagedList> getGamificationContestAgentsScoresMeWithHttpInfo(String contestId, Integer pageNumber, Integer pageSize, LocalDate workday, String returnsView) throws IOException {
    return getGamificationContestAgentsScoresMe(createGetGamificationContestAgentsScoresMeRequest(contestId, pageNumber, pageSize, workday, returnsView).withHttpInfo());
  }

  private GetGamificationContestAgentsScoresMeRequest createGetGamificationContestAgentsScoresMeRequest(String contestId, Integer pageNumber, Integer pageSize, LocalDate workday, String returnsView) {
    return GetGamificationContestAgentsScoresMeRequest.builder()
            .withContestId(contestId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withWorkday(workday)

            .withReturnsView(returnsView)

            .build();
  }

  /**
   * Get Contest Scores for the requesting Agent/Supervisor
   * 
   * @param request The request object
   * @return ContestScoresAgentsPagedList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresAgentsPagedList getGamificationContestAgentsScoresMe(GetGamificationContestAgentsScoresMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestScoresAgentsPagedList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestScoresAgentsPagedList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Contest Scores for the requesting Agent/Supervisor
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresAgentsPagedList> getGamificationContestAgentsScoresMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestScoresAgentsPagedList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Contest Score Trend (Average Trend)
   * 
   * @param contestId The ID of the contest (required)
   * @return ContestScoresGroupTrendList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresGroupTrendList getGamificationContestAgentsScoresTrends(String contestId) throws IOException, ApiException {
    return  getGamificationContestAgentsScoresTrends(createGetGamificationContestAgentsScoresTrendsRequest(contestId));
  }

  /**
   * Get a Contest Score Trend (Average Trend)
   * 
   * @param contestId The ID of the contest (required)
   * @return ContestScoresGroupTrendList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresGroupTrendList> getGamificationContestAgentsScoresTrendsWithHttpInfo(String contestId) throws IOException {
    return getGamificationContestAgentsScoresTrends(createGetGamificationContestAgentsScoresTrendsRequest(contestId).withHttpInfo());
  }

  private GetGamificationContestAgentsScoresTrendsRequest createGetGamificationContestAgentsScoresTrendsRequest(String contestId) {
    return GetGamificationContestAgentsScoresTrendsRequest.builder()
            .withContestId(contestId)

            .build();
  }

  /**
   * Get a Contest Score Trend (Average Trend)
   * 
   * @param request The request object
   * @return ContestScoresGroupTrendList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresGroupTrendList getGamificationContestAgentsScoresTrends(GetGamificationContestAgentsScoresTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestScoresGroupTrendList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestScoresGroupTrendList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Contest Score Trend (Average Trend)
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresGroupTrendList> getGamificationContestAgentsScoresTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestScoresGroupTrendList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestScoresGroupTrendList> response = (ApiResponse<ContestScoresGroupTrendList>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestScoresGroupTrendList> response = (ApiResponse<ContestScoresGroupTrendList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Contest Score Trend for the requesting Agent
   * 
   * @param contestId The ID of the contest (required)
   * @return ContestScoresAgentTrendList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresAgentTrendList getGamificationContestAgentsScoresTrendsMe(String contestId) throws IOException, ApiException {
    return  getGamificationContestAgentsScoresTrendsMe(createGetGamificationContestAgentsScoresTrendsMeRequest(contestId));
  }

  /**
   * Get a Contest Score Trend for the requesting Agent
   * 
   * @param contestId The ID of the contest (required)
   * @return ContestScoresAgentTrendList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresAgentTrendList> getGamificationContestAgentsScoresTrendsMeWithHttpInfo(String contestId) throws IOException {
    return getGamificationContestAgentsScoresTrendsMe(createGetGamificationContestAgentsScoresTrendsMeRequest(contestId).withHttpInfo());
  }

  private GetGamificationContestAgentsScoresTrendsMeRequest createGetGamificationContestAgentsScoresTrendsMeRequest(String contestId) {
    return GetGamificationContestAgentsScoresTrendsMeRequest.builder()
            .withContestId(contestId)

            .build();
  }

  /**
   * Get a Contest Score Trend for the requesting Agent
   * 
   * @param request The request object
   * @return ContestScoresAgentTrendList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestScoresAgentTrendList getGamificationContestAgentsScoresTrendsMe(GetGamificationContestAgentsScoresTrendsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestScoresAgentTrendList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestScoresAgentTrendList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Contest Score Trend for the requesting Agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestScoresAgentTrendList> getGamificationContestAgentsScoresTrendsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestScoresAgentTrendList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestScoresAgentTrendList> response = (ApiResponse<ContestScoresAgentTrendList>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestScoresAgentTrendList> response = (ApiResponse<ContestScoresAgentTrendList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Contest Prize Image by Id
   * 
   * @param contestId The ID of the contest (required)
   * @param prizeImageId The ID of the prize image (required)
   * @return PrizeImages
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PrizeImages getGamificationContestPrizeimage(String contestId, String prizeImageId) throws IOException, ApiException {
    return  getGamificationContestPrizeimage(createGetGamificationContestPrizeimageRequest(contestId, prizeImageId));
  }

  /**
   * Get a Contest Prize Image by Id
   * 
   * @param contestId The ID of the contest (required)
   * @param prizeImageId The ID of the prize image (required)
   * @return PrizeImages
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PrizeImages> getGamificationContestPrizeimageWithHttpInfo(String contestId, String prizeImageId) throws IOException {
    return getGamificationContestPrizeimage(createGetGamificationContestPrizeimageRequest(contestId, prizeImageId).withHttpInfo());
  }

  private GetGamificationContestPrizeimageRequest createGetGamificationContestPrizeimageRequest(String contestId, String prizeImageId) {
    return GetGamificationContestPrizeimageRequest.builder()
            .withContestId(contestId)

            .withPrizeImageId(prizeImageId)

            .build();
  }

  /**
   * Get a Contest Prize Image by Id
   * 
   * @param request The request object
   * @return PrizeImages
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PrizeImages getGamificationContestPrizeimage(GetGamificationContestPrizeimageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PrizeImages> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PrizeImages>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Contest Prize Image by Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PrizeImages> getGamificationContestPrizeimage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PrizeImages>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PrizeImages> response = (ApiResponse<PrizeImages>)(ApiResponse<?>)exception;
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
      ApiResponse<PrizeImages> response = (ApiResponse<PrizeImages>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a List of Contests (Admin)
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param status  (optional)
   * @param sortBy  (optional, default to dateStart)
   * @param sortOrder  (optional, default to desc)
   * @return GetContestsEssentialsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetContestsEssentialsListing getGamificationContests(Integer pageNumber, Integer pageSize, LocalDate dateStart, LocalDate dateEnd, List<String> status, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getGamificationContests(createGetGamificationContestsRequest(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder));
  }

  /**
   * Get a List of Contests (Admin)
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param status  (optional)
   * @param sortBy  (optional, default to dateStart)
   * @param sortOrder  (optional, default to desc)
   * @return GetContestsEssentialsListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetContestsEssentialsListing> getGamificationContestsWithHttpInfo(Integer pageNumber, Integer pageSize, LocalDate dateStart, LocalDate dateEnd, List<String> status, String sortBy, String sortOrder) throws IOException {
    return getGamificationContests(createGetGamificationContestsRequest(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder).withHttpInfo());
  }

  private GetGamificationContestsRequest createGetGamificationContestsRequest(Integer pageNumber, Integer pageSize, LocalDate dateStart, LocalDate dateEnd, List<String> status, String sortBy, String sortOrder) {
    return GetGamificationContestsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .withStatus(status)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get a List of Contests (Admin)
   * 
   * @param request The request object
   * @return GetContestsEssentialsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetContestsEssentialsListing getGamificationContests(GetGamificationContestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetContestsEssentialsListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetContestsEssentialsListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a List of Contests (Admin)
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetContestsEssentialsListing> getGamificationContests(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetContestsEssentialsListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a List of Contests (Agent/Supervisor)
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param status  (optional)
   * @param sortBy  (optional, default to dateStart)
   * @param sortOrder  (optional, default to desc)
   * @param view  (optional, default to participant)
   * @return GetContestsEssentialsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetContestsEssentialsListing getGamificationContestsMe(Integer pageNumber, Integer pageSize, LocalDate dateStart, LocalDate dateEnd, List<String> status, String sortBy, String sortOrder, String view) throws IOException, ApiException {
    return  getGamificationContestsMe(createGetGamificationContestsMeRequest(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder, view));
  }

  /**
   * Get a List of Contests (Agent/Supervisor)
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @param dateStart Start date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param dateEnd End date for the query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param status  (optional)
   * @param sortBy  (optional, default to dateStart)
   * @param sortOrder  (optional, default to desc)
   * @param view  (optional, default to participant)
   * @return GetContestsEssentialsListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetContestsEssentialsListing> getGamificationContestsMeWithHttpInfo(Integer pageNumber, Integer pageSize, LocalDate dateStart, LocalDate dateEnd, List<String> status, String sortBy, String sortOrder, String view) throws IOException {
    return getGamificationContestsMe(createGetGamificationContestsMeRequest(pageNumber, pageSize, dateStart, dateEnd, status, sortBy, sortOrder, view).withHttpInfo());
  }

  private GetGamificationContestsMeRequest createGetGamificationContestsMeRequest(Integer pageNumber, Integer pageSize, LocalDate dateStart, LocalDate dateEnd, List<String> status, String sortBy, String sortOrder, String view) {
    return GetGamificationContestsMeRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .withStatus(status)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withView(view)

            .build();
  }

  /**
   * Get a List of Contests (Agent/Supervisor)
   * 
   * @param request The request object
   * @return GetContestsEssentialsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetContestsEssentialsListing getGamificationContestsMe(GetGamificationContestsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetContestsEssentialsListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetContestsEssentialsListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a List of Contests (Agent/Supervisor)
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetContestsEssentialsListing> getGamificationContestsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetContestsEssentialsListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights summary
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortKey Sort key (optional)
   * @param sortMetricId Sort Metric Id (optional)
   * @param sortOrder Sort order (optional, default to asc)
   * @param userIds A list of up to 100 comma-separated user Ids (optional)
   * @return InsightsSummary
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsSummary getGamificationInsights(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday, Integer pageSize, Integer pageNumber, String sortKey, String sortMetricId, String sortOrder, String userIds) throws IOException, ApiException {
    return  getGamificationInsights(createGetGamificationInsightsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, pageSize, pageNumber, sortKey, sortMetricId, sortOrder, userIds));
  }

  /**
   * Get insights summary
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortKey Sort key (optional)
   * @param sortMetricId Sort Metric Id (optional)
   * @param sortOrder Sort order (optional, default to asc)
   * @param userIds A list of up to 100 comma-separated user Ids (optional)
   * @return InsightsSummary
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsSummary> getGamificationInsightsWithHttpInfo(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday, Integer pageSize, Integer pageNumber, String sortKey, String sortMetricId, String sortOrder, String userIds) throws IOException {
    return getGamificationInsights(createGetGamificationInsightsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, pageSize, pageNumber, sortKey, sortMetricId, sortOrder, userIds).withHttpInfo());
  }

  private GetGamificationInsightsRequest createGetGamificationInsightsRequest(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday, Integer pageSize, Integer pageNumber, String sortKey, String sortMetricId, String sortOrder, String userIds) {
    return GetGamificationInsightsRequest.builder()
            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortKey(sortKey)

            .withSortMetricId(sortMetricId)

            .withSortOrder(sortOrder)

            .withUserIds(userIds)

            .build();
  }

  /**
   * Get insights summary
   * 
   * @param request The request object
   * @return InsightsSummary
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsSummary getGamificationInsights(GetGamificationInsightsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InsightsSummary> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InsightsSummary>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights summary
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsSummary> getGamificationInsights(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InsightsSummary>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InsightsSummary> response = (ApiResponse<InsightsSummary>)(ApiResponse<?>)exception;
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
      ApiResponse<InsightsSummary> response = (ApiResponse<InsightsSummary>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights details for the current user
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsDetails getGamificationInsightsDetails(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) throws IOException, ApiException {
    return  getGamificationInsightsDetails(createGetGamificationInsightsDetailsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday));
  }

  /**
   * Get insights details for the current user
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsDetails
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsDetails> getGamificationInsightsDetailsWithHttpInfo(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) throws IOException {
    return getGamificationInsightsDetails(createGetGamificationInsightsDetailsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday).withHttpInfo());
  }

  private GetGamificationInsightsDetailsRequest createGetGamificationInsightsDetailsRequest(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) {
    return GetGamificationInsightsDetailsRequest.builder()
            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .build();
  }

  /**
   * Get insights details for the current user
   * 
   * @param request The request object
   * @return InsightsDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsDetails getGamificationInsightsDetails(GetGamificationInsightsDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InsightsDetails> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InsightsDetails>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights details for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsDetails> getGamificationInsightsDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InsightsDetails>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)exception;
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
      ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights overall trend for the current user
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsTrend getGamificationInsightsGroupsTrends(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException, ApiException {
    return  getGamificationInsightsGroupsTrends(createGetGamificationInsightsGroupsTrendsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday));
  }

  /**
   * Get insights overall trend for the current user
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsTrend> getGamificationInsightsGroupsTrendsWithHttpInfo(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException {
    return getGamificationInsightsGroupsTrends(createGetGamificationInsightsGroupsTrendsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday).withHttpInfo());
  }

  private GetGamificationInsightsGroupsTrendsRequest createGetGamificationInsightsGroupsTrendsRequest(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) {
    return GetGamificationInsightsGroupsTrendsRequest.builder()
            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withComparativePeriodEndWorkday(comparativePeriodEndWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .withPrimaryPeriodEndWorkday(primaryPeriodEndWorkday)

            .build();
  }

  /**
   * Get insights overall trend for the current user
   * 
   * @param request The request object
   * @return InsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsTrend getGamificationInsightsGroupsTrends(GetGamificationInsightsGroupsTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InsightsTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InsightsTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights overall trend for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsTrend> getGamificationInsightsGroupsTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InsightsTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights overall trend
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsTrend getGamificationInsightsGroupsTrendsAll(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException, ApiException {
    return  getGamificationInsightsGroupsTrendsAll(createGetGamificationInsightsGroupsTrendsAllRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday));
  }

  /**
   * Get insights overall trend
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsTrend> getGamificationInsightsGroupsTrendsAllWithHttpInfo(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException {
    return getGamificationInsightsGroupsTrendsAll(createGetGamificationInsightsGroupsTrendsAllRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday).withHttpInfo());
  }

  private GetGamificationInsightsGroupsTrendsAllRequest createGetGamificationInsightsGroupsTrendsAllRequest(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) {
    return GetGamificationInsightsGroupsTrendsAllRequest.builder()
            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withComparativePeriodEndWorkday(comparativePeriodEndWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .withPrimaryPeriodEndWorkday(primaryPeriodEndWorkday)

            .build();
  }

  /**
   * Get insights overall trend
   * 
   * @param request The request object
   * @return InsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsTrend getGamificationInsightsGroupsTrendsAll(GetGamificationInsightsGroupsTrendsAllRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InsightsTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InsightsTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights overall trend
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsTrend> getGamificationInsightsGroupsTrendsAll(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InsightsTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query users in a profile during a period of time
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param startWorkday The start work day. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsAgents
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsAgents getGamificationInsightsMembers(String filterType, String filterId, String granularity, LocalDate startWorkday) throws IOException, ApiException {
    return  getGamificationInsightsMembers(createGetGamificationInsightsMembersRequest(filterType, filterId, granularity, startWorkday));
  }

  /**
   * Query users in a profile during a period of time
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param startWorkday The start work day. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsAgents
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsAgents> getGamificationInsightsMembersWithHttpInfo(String filterType, String filterId, String granularity, LocalDate startWorkday) throws IOException {
    return getGamificationInsightsMembers(createGetGamificationInsightsMembersRequest(filterType, filterId, granularity, startWorkday).withHttpInfo());
  }

  private GetGamificationInsightsMembersRequest createGetGamificationInsightsMembersRequest(String filterType, String filterId, String granularity, LocalDate startWorkday) {
    return GetGamificationInsightsMembersRequest.builder()
            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withStartWorkday(startWorkday)

            .build();
  }

  /**
   * Query users in a profile during a period of time
   * 
   * @param request The request object
   * @return InsightsAgents
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsAgents getGamificationInsightsMembers(GetGamificationInsightsMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InsightsAgents> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InsightsAgents>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query users in a profile during a period of time
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsAgents> getGamificationInsightsMembers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InsightsAgents>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InsightsAgents> response = (ApiResponse<InsightsAgents>)(ApiResponse<?>)exception;
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
      ApiResponse<InsightsAgents> response = (ApiResponse<InsightsAgents>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights rankings
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param sortKey Sort key (required)
   * @param sortMetricId Sort Metric Id (optional)
   * @param sectionSize The number of top and bottom users to return before ties (optional)
   * @param userIds A list of up to 100 comma-separated user Ids (optional)
   * @return InsightsRankings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsRankings getGamificationInsightsRankings(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday, String sortKey, String sortMetricId, Integer sectionSize, String userIds) throws IOException, ApiException {
    return  getGamificationInsightsRankings(createGetGamificationInsightsRankingsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, sortKey, sortMetricId, sectionSize, userIds));
  }

  /**
   * Get insights rankings
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param sortKey Sort key (required)
   * @param sortMetricId Sort Metric Id (optional)
   * @param sectionSize The number of top and bottom users to return before ties (optional)
   * @param userIds A list of up to 100 comma-separated user Ids (optional)
   * @return InsightsRankings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsRankings> getGamificationInsightsRankingsWithHttpInfo(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday, String sortKey, String sortMetricId, Integer sectionSize, String userIds) throws IOException {
    return getGamificationInsightsRankings(createGetGamificationInsightsRankingsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday, sortKey, sortMetricId, sectionSize, userIds).withHttpInfo());
  }

  private GetGamificationInsightsRankingsRequest createGetGamificationInsightsRankingsRequest(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday, String sortKey, String sortMetricId, Integer sectionSize, String userIds) {
    return GetGamificationInsightsRankingsRequest.builder()
            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .withSortKey(sortKey)

            .withSortMetricId(sortMetricId)

            .withSectionSize(sectionSize)

            .withUserIds(userIds)

            .build();
  }

  /**
   * Get insights rankings
   * 
   * @param request The request object
   * @return InsightsRankings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsRankings getGamificationInsightsRankings(GetGamificationInsightsRankingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InsightsRankings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InsightsRankings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights rankings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsRankings> getGamificationInsightsRankings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InsightsRankings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InsightsRankings> response = (ApiResponse<InsightsRankings>)(ApiResponse<?>)exception;
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
      ApiResponse<InsightsRankings> response = (ApiResponse<InsightsRankings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights user trend for the current user
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return UserInsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserInsightsTrend getGamificationInsightsTrends(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException, ApiException {
    return  getGamificationInsightsTrends(createGetGamificationInsightsTrendsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday));
  }

  /**
   * Get insights user trend for the current user
   * 
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return UserInsightsTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserInsightsTrend> getGamificationInsightsTrendsWithHttpInfo(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException {
    return getGamificationInsightsTrends(createGetGamificationInsightsTrendsRequest(filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday).withHttpInfo());
  }

  private GetGamificationInsightsTrendsRequest createGetGamificationInsightsTrendsRequest(String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) {
    return GetGamificationInsightsTrendsRequest.builder()
            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withComparativePeriodEndWorkday(comparativePeriodEndWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .withPrimaryPeriodEndWorkday(primaryPeriodEndWorkday)

            .build();
  }

  /**
   * Get insights user trend for the current user
   * 
   * @param request The request object
   * @return UserInsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserInsightsTrend getGamificationInsightsTrends(GetGamificationInsightsTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserInsightsTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserInsightsTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights user trend for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserInsightsTrend> getGamificationInsightsTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserInsightsTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights details for the user
   * 
   * @param userId The ID of a user. (required)
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsDetails getGamificationInsightsUserDetails(String userId, String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) throws IOException, ApiException {
    return  getGamificationInsightsUserDetails(createGetGamificationInsightsUserDetailsRequest(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday));
  }

  /**
   * Get insights details for the user
   * 
   * @param userId The ID of a user. (required)
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return InsightsDetails
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsDetails> getGamificationInsightsUserDetailsWithHttpInfo(String userId, String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) throws IOException {
    return getGamificationInsightsUserDetails(createGetGamificationInsightsUserDetailsRequest(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, primaryPeriodStartWorkday).withHttpInfo());
  }

  private GetGamificationInsightsUserDetailsRequest createGetGamificationInsightsUserDetailsRequest(String userId, String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate primaryPeriodStartWorkday) {
    return GetGamificationInsightsUserDetailsRequest.builder()
            .withUserId(userId)

            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .build();
  }

  /**
   * Get insights details for the user
   * 
   * @param request The request object
   * @return InsightsDetails
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InsightsDetails getGamificationInsightsUserDetails(GetGamificationInsightsUserDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InsightsDetails> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InsightsDetails>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights details for the user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InsightsDetails> getGamificationInsightsUserDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InsightsDetails>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)exception;
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
      ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get insights user trend for the user
   * 
   * @param userId The ID of a user. (required)
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return UserInsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserInsightsTrend getGamificationInsightsUserTrends(String userId, String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException, ApiException {
    return  getGamificationInsightsUserTrends(createGetGamificationInsightsUserTrendsRequest(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday));
  }

  /**
   * Get insights user trend for the user
   * 
   * @param userId The ID of a user. (required)
   * @param filterType Filter type for the query request. (required)
   * @param filterId ID for the filter type. (required)
   * @param granularity Granularity (required)
   * @param comparativePeriodStartWorkday The start work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param comparativePeriodEndWorkday The end work day of comparative period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodStartWorkday The start work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param primaryPeriodEndWorkday The end work day of primary period. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return UserInsightsTrend
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserInsightsTrend> getGamificationInsightsUserTrendsWithHttpInfo(String userId, String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) throws IOException {
    return getGamificationInsightsUserTrends(createGetGamificationInsightsUserTrendsRequest(userId, filterType, filterId, granularity, comparativePeriodStartWorkday, comparativePeriodEndWorkday, primaryPeriodStartWorkday, primaryPeriodEndWorkday).withHttpInfo());
  }

  private GetGamificationInsightsUserTrendsRequest createGetGamificationInsightsUserTrendsRequest(String userId, String filterType, String filterId, String granularity, LocalDate comparativePeriodStartWorkday, LocalDate comparativePeriodEndWorkday, LocalDate primaryPeriodStartWorkday, LocalDate primaryPeriodEndWorkday) {
    return GetGamificationInsightsUserTrendsRequest.builder()
            .withUserId(userId)

            .withFilterType(filterType)

            .withFilterId(filterId)

            .withGranularity(granularity)

            .withComparativePeriodStartWorkday(comparativePeriodStartWorkday)

            .withComparativePeriodEndWorkday(comparativePeriodEndWorkday)

            .withPrimaryPeriodStartWorkday(primaryPeriodStartWorkday)

            .withPrimaryPeriodEndWorkday(primaryPeriodEndWorkday)

            .build();
  }

  /**
   * Get insights user trend for the user
   * 
   * @param request The request object
   * @return UserInsightsTrend
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserInsightsTrend getGamificationInsightsUserTrends(GetGamificationInsightsUserTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserInsightsTrend> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserInsightsTrend>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get insights user trend for the user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserInsightsTrend> getGamificationInsightsUserTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserInsightsTrend>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)exception;
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
      ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Leaderboard of the requesting user's division or performance profile
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
   * Leaderboard of the requesting user's division or performance profile
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
   * Leaderboard of the requesting user's division or performance profile
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
   * Leaderboard of the requesting user's division or performance profile
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
   * Best Points of the requesting user's current performance profile or division
   * 
   * @return OverallBestPoints
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OverallBestPoints getGamificationLeaderboardBestpoints() throws IOException, ApiException {
    return  getGamificationLeaderboardBestpoints(createGetGamificationLeaderboardBestpointsRequest());
  }

  /**
   * Best Points of the requesting user's current performance profile or division
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
   * Best Points of the requesting user's current performance profile or division
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
   * Best Points of the requesting user's current performance profile or division
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
   * Performance profile by id
   * 
   * @param profileId performanceProfileId (required)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile getGamificationProfile(String profileId) throws IOException, ApiException {
    return  getGamificationProfile(createGetGamificationProfileRequest(profileId));
  }

  /**
   * Performance profile by id
   * 
   * @param profileId performanceProfileId (required)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> getGamificationProfileWithHttpInfo(String profileId) throws IOException {
    return getGamificationProfile(createGetGamificationProfileRequest(profileId).withHttpInfo());
  }

  private GetGamificationProfileRequest createGetGamificationProfileRequest(String profileId) {
    return GetGamificationProfileRequest.builder()
            .withProfileId(profileId)

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
   * Members of a given performance profile
   * 
   * @param profileId Profile Id (required)
   * @return MemberListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MemberListing getGamificationProfileMembers(String profileId) throws IOException, ApiException {
    return  getGamificationProfileMembers(createGetGamificationProfileMembersRequest(profileId));
  }

  /**
   * Members of a given performance profile
   * 
   * @param profileId Profile Id (required)
   * @return MemberListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MemberListing> getGamificationProfileMembersWithHttpInfo(String profileId) throws IOException {
    return getGamificationProfileMembers(createGetGamificationProfileMembersRequest(profileId).withHttpInfo());
  }

  private GetGamificationProfileMembersRequest createGetGamificationProfileMembersRequest(String profileId) {
    return GetGamificationProfileMembersRequest.builder()
            .withProfileId(profileId)

            .build();
  }

  /**
   * Members of a given performance profile
   * 
   * @param request The request object
   * @return MemberListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MemberListing getGamificationProfileMembers(GetGamificationProfileMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MemberListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MemberListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Members of a given performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MemberListing> getGamificationProfileMembers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MemberListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MemberListing> response = (ApiResponse<MemberListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MemberListing> response = (ApiResponse<MemberListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param metricIds List of metric ids to filter the response (Optional, comma-separated). (optional)
   * @return GetMetricResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetMetricResponse getGamificationProfileMetrics(String profileId, List<String> expand, LocalDate workday, String metricIds) throws IOException, ApiException {
    return  getGamificationProfileMetrics(createGetGamificationProfileMetricsRequest(profileId, expand, workday, metricIds));
  }

  /**
   * All gamified metrics for a given performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @param workday The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param metricIds List of metric ids to filter the response (Optional, comma-separated). (optional)
   * @return GetMetricResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetMetricResponse> getGamificationProfileMetricsWithHttpInfo(String profileId, List<String> expand, LocalDate workday, String metricIds) throws IOException {
    return getGamificationProfileMetrics(createGetGamificationProfileMetricsRequest(profileId, expand, workday, metricIds).withHttpInfo());
  }

  private GetGamificationProfileMetricsRequest createGetGamificationProfileMetricsRequest(String profileId, List<String> expand, LocalDate workday, String metricIds) {
    return GetGamificationProfileMetricsRequest.builder()
            .withProfileId(profileId)

            .withExpand(expand)

            .withWorkday(workday)

            .withMetricIds(metricIds)

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
   * Average points of the requesting user's division or performance profile
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
   * Average points of the requesting user's division or performance profile
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
   * Average points of the requesting user's division or performance profile
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
   * Average points of the requesting user's division or performance profile
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
   * Average performance values trends by metric of a user
   * 
   * @param profileId performanceProfileId (required)
   * @param metricId metricId (required)
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param referenceWorkday Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return MetricValueTrendAverage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricValueTrendAverage getGamificationScorecardsProfileMetricUserValuesTrends(String profileId, String metricId, String userId, LocalDate startWorkday, LocalDate endWorkday, LocalDate referenceWorkday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsProfileMetricUserValuesTrends(createGetGamificationScorecardsProfileMetricUserValuesTrendsRequest(profileId, metricId, userId, startWorkday, endWorkday, referenceWorkday, timeZone));
  }

  /**
   * Average performance values trends by metric of a user
   * 
   * @param profileId performanceProfileId (required)
   * @param metricId metricId (required)
   * @param userId  (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param referenceWorkday Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return MetricValueTrendAverage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricValueTrendAverage> getGamificationScorecardsProfileMetricUserValuesTrendsWithHttpInfo(String profileId, String metricId, String userId, LocalDate startWorkday, LocalDate endWorkday, LocalDate referenceWorkday, String timeZone) throws IOException {
    return getGamificationScorecardsProfileMetricUserValuesTrends(createGetGamificationScorecardsProfileMetricUserValuesTrendsRequest(profileId, metricId, userId, startWorkday, endWorkday, referenceWorkday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsProfileMetricUserValuesTrendsRequest createGetGamificationScorecardsProfileMetricUserValuesTrendsRequest(String profileId, String metricId, String userId, LocalDate startWorkday, LocalDate endWorkday, LocalDate referenceWorkday, String timeZone) {
    return GetGamificationScorecardsProfileMetricUserValuesTrendsRequest.builder()
            .withProfileId(profileId)

            .withMetricId(metricId)

            .withUserId(userId)

            .withStartWorkday(startWorkday)

            .withEndWorkday(endWorkday)

            .withReferenceWorkday(referenceWorkday)

            .withTimeZone(timeZone)

            .build();
  }

  /**
   * Average performance values trends by metric of a user
   * 
   * @param request The request object
   * @return MetricValueTrendAverage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricValueTrendAverage getGamificationScorecardsProfileMetricUserValuesTrends(GetGamificationScorecardsProfileMetricUserValuesTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MetricValueTrendAverage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MetricValueTrendAverage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Average performance values trends by metric of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricValueTrendAverage> getGamificationScorecardsProfileMetricUserValuesTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MetricValueTrendAverage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)exception;
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
      ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Average performance values trends by metric of a division or a performance profile
   * 
   * @param profileId performanceProfileId (required)
   * @param metricId metricId (required)
   * @param filterType Filter type for the query request. (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param filterId ID for the filter type. Only required when filterType is Division. (optional)
   * @param referenceWorkday Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return MetricValueTrendAverage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricValueTrendAverage getGamificationScorecardsProfileMetricUsersValuesTrends(String profileId, String metricId, String filterType, LocalDate startWorkday, LocalDate endWorkday, String filterId, LocalDate referenceWorkday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsProfileMetricUsersValuesTrends(createGetGamificationScorecardsProfileMetricUsersValuesTrendsRequest(profileId, metricId, filterType, startWorkday, endWorkday, filterId, referenceWorkday, timeZone));
  }

  /**
   * Average performance values trends by metric of a division or a performance profile
   * 
   * @param profileId performanceProfileId (required)
   * @param metricId metricId (required)
   * @param filterType Filter type for the query request. (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param filterId ID for the filter type. Only required when filterType is Division. (optional)
   * @param referenceWorkday Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return MetricValueTrendAverage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricValueTrendAverage> getGamificationScorecardsProfileMetricUsersValuesTrendsWithHttpInfo(String profileId, String metricId, String filterType, LocalDate startWorkday, LocalDate endWorkday, String filterId, LocalDate referenceWorkday, String timeZone) throws IOException {
    return getGamificationScorecardsProfileMetricUsersValuesTrends(createGetGamificationScorecardsProfileMetricUsersValuesTrendsRequest(profileId, metricId, filterType, startWorkday, endWorkday, filterId, referenceWorkday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsProfileMetricUsersValuesTrendsRequest createGetGamificationScorecardsProfileMetricUsersValuesTrendsRequest(String profileId, String metricId, String filterType, LocalDate startWorkday, LocalDate endWorkday, String filterId, LocalDate referenceWorkday, String timeZone) {
    return GetGamificationScorecardsProfileMetricUsersValuesTrendsRequest.builder()
            .withProfileId(profileId)

            .withMetricId(metricId)

            .withFilterType(filterType)

            .withStartWorkday(startWorkday)

            .withEndWorkday(endWorkday)

            .withFilterId(filterId)

            .withReferenceWorkday(referenceWorkday)

            .withTimeZone(timeZone)

            .build();
  }

  /**
   * Average performance values trends by metric of a division or a performance profile
   * 
   * @param request The request object
   * @return MetricValueTrendAverage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricValueTrendAverage getGamificationScorecardsProfileMetricUsersValuesTrends(GetGamificationScorecardsProfileMetricUsersValuesTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MetricValueTrendAverage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MetricValueTrendAverage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Average performance values trends by metric of a division or a performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricValueTrendAverage> getGamificationScorecardsProfileMetricUsersValuesTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MetricValueTrendAverage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)exception;
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
      ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Average performance values trends by metric of the requesting user
   * 
   * @param profileId performanceProfileId (required)
   * @param metricId metricId (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param filterType Filter type for the query request. If not set, returns the values trends of the requesting user (optional)
   * @param referenceWorkday Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return MetricValueTrendAverage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricValueTrendAverage getGamificationScorecardsProfileMetricValuesTrends(String profileId, String metricId, LocalDate startWorkday, LocalDate endWorkday, String filterType, LocalDate referenceWorkday, String timeZone) throws IOException, ApiException {
    return  getGamificationScorecardsProfileMetricValuesTrends(createGetGamificationScorecardsProfileMetricValuesTrendsRequest(profileId, metricId, startWorkday, endWorkday, filterType, referenceWorkday, timeZone));
  }

  /**
   * Average performance values trends by metric of the requesting user
   * 
   * @param profileId performanceProfileId (required)
   * @param metricId metricId (required)
   * @param startWorkday Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param endWorkday End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param filterType Filter type for the query request. If not set, returns the values trends of the requesting user (optional)
   * @param referenceWorkday Reference workday for the trend. Used to determine the associated metric definition. If not set, then the value of endWorkday is used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
   * @param timeZone Timezone for the workday. Defaults to UTC (optional, default to UTC)
   * @return MetricValueTrendAverage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricValueTrendAverage> getGamificationScorecardsProfileMetricValuesTrendsWithHttpInfo(String profileId, String metricId, LocalDate startWorkday, LocalDate endWorkday, String filterType, LocalDate referenceWorkday, String timeZone) throws IOException {
    return getGamificationScorecardsProfileMetricValuesTrends(createGetGamificationScorecardsProfileMetricValuesTrendsRequest(profileId, metricId, startWorkday, endWorkday, filterType, referenceWorkday, timeZone).withHttpInfo());
  }

  private GetGamificationScorecardsProfileMetricValuesTrendsRequest createGetGamificationScorecardsProfileMetricValuesTrendsRequest(String profileId, String metricId, LocalDate startWorkday, LocalDate endWorkday, String filterType, LocalDate referenceWorkday, String timeZone) {
    return GetGamificationScorecardsProfileMetricValuesTrendsRequest.builder()
            .withProfileId(profileId)

            .withMetricId(metricId)

            .withStartWorkday(startWorkday)

            .withEndWorkday(endWorkday)

            .withFilterType(filterType)

            .withReferenceWorkday(referenceWorkday)

            .withTimeZone(timeZone)

            .build();
  }

  /**
   * Average performance values trends by metric of the requesting user
   * 
   * @param request The request object
   * @return MetricValueTrendAverage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MetricValueTrendAverage getGamificationScorecardsProfileMetricValuesTrends(GetGamificationScorecardsProfileMetricValuesTrendsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MetricValueTrendAverage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MetricValueTrendAverage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Average performance values trends by metric of the requesting user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MetricValueTrendAverage> getGamificationScorecardsProfileMetricValuesTrends(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MetricValueTrendAverage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)exception;
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
      ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Average values of the requesting user's division or performance profile
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
   * Average values of the requesting user's division or performance profile
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
   * Average values of the requesting user's division or performance profile
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
   * Average values of the requesting user's division or performance profile
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
   * @param referenceWorkday Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user's current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
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
   * @param referenceWorkday Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user's current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (optional)
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
   * Update External Metric Definition
   * 
   * @param metricId Specifies the metric definition ID (required)
   * @param body The External Metric Definition parameters to be updated (required)
   * @return ExternalMetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinition patchEmployeeperformanceExternalmetricsDefinition(String metricId, ExternalMetricDefinitionUpdateRequest body) throws IOException, ApiException {
    return  patchEmployeeperformanceExternalmetricsDefinition(createPatchEmployeeperformanceExternalmetricsDefinitionRequest(metricId, body));
  }

  /**
   * Update External Metric Definition
   * 
   * @param metricId Specifies the metric definition ID (required)
   * @param body The External Metric Definition parameters to be updated (required)
   * @return ExternalMetricDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinition> patchEmployeeperformanceExternalmetricsDefinitionWithHttpInfo(String metricId, ExternalMetricDefinitionUpdateRequest body) throws IOException {
    return patchEmployeeperformanceExternalmetricsDefinition(createPatchEmployeeperformanceExternalmetricsDefinitionRequest(metricId, body).withHttpInfo());
  }

  private PatchEmployeeperformanceExternalmetricsDefinitionRequest createPatchEmployeeperformanceExternalmetricsDefinitionRequest(String metricId, ExternalMetricDefinitionUpdateRequest body) {
    return PatchEmployeeperformanceExternalmetricsDefinitionRequest.builder()
            .withMetricId(metricId)

            .withBody(body)

            .build();
  }

  /**
   * Update External Metric Definition
   * 
   * @param request The request object
   * @return ExternalMetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinition patchEmployeeperformanceExternalmetricsDefinition(PatchEmployeeperformanceExternalmetricsDefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalMetricDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalMetricDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update External Metric Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinition> patchEmployeeperformanceExternalmetricsDefinition(ApiRequest<ExternalMetricDefinitionUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalMetricDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Finalize a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @param body Finalize Contest (required)
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse patchGamificationContest(String contestId, ContestsFinalizeRequest body) throws IOException, ApiException {
    return  patchGamificationContest(createPatchGamificationContestRequest(contestId, body));
  }

  /**
   * Finalize a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @param body Finalize Contest (required)
   * @return ContestsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> patchGamificationContestWithHttpInfo(String contestId, ContestsFinalizeRequest body) throws IOException {
    return patchGamificationContest(createPatchGamificationContestRequest(contestId, body).withHttpInfo());
  }

  private PatchGamificationContestRequest createPatchGamificationContestRequest(String contestId, ContestsFinalizeRequest body) {
    return PatchGamificationContestRequest.builder()
            .withContestId(contestId)

            .withBody(body)

            .build();
  }

  /**
   * Finalize a Contest by Id
   * 
   * @param request The request object
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse patchGamificationContest(PatchGamificationContestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Finalize a Contest by Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> patchGamificationContest(ApiRequest<ContestsFinalizeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Write External Metric Data
   * 
   * @param body The External Metric Data to be added (optional)
   * @return ExternalMetricDataWriteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDataWriteResponse postEmployeeperformanceExternalmetricsData(ExternalMetricDataWriteRequest body) throws IOException, ApiException {
    return  postEmployeeperformanceExternalmetricsData(createPostEmployeeperformanceExternalmetricsDataRequest(body));
  }

  /**
   * Write External Metric Data
   * 
   * @param body The External Metric Data to be added (optional)
   * @return ExternalMetricDataWriteResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDataWriteResponse> postEmployeeperformanceExternalmetricsDataWithHttpInfo(ExternalMetricDataWriteRequest body) throws IOException {
    return postEmployeeperformanceExternalmetricsData(createPostEmployeeperformanceExternalmetricsDataRequest(body).withHttpInfo());
  }

  private PostEmployeeperformanceExternalmetricsDataRequest createPostEmployeeperformanceExternalmetricsDataRequest(ExternalMetricDataWriteRequest body) {
    return PostEmployeeperformanceExternalmetricsDataRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Write External Metric Data
   * 
   * @param request The request object
   * @return ExternalMetricDataWriteResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDataWriteResponse postEmployeeperformanceExternalmetricsData(PostEmployeeperformanceExternalmetricsDataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalMetricDataWriteResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalMetricDataWriteResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Write External Metric Data
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDataWriteResponse> postEmployeeperformanceExternalmetricsData(ApiRequest<ExternalMetricDataWriteRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalMetricDataWriteResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalMetricDataWriteResponse> response = (ApiResponse<ExternalMetricDataWriteResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalMetricDataWriteResponse> response = (ApiResponse<ExternalMetricDataWriteResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create External Metric Definition
   * 
   * @param body The External Metric Definition to be created (optional)
   * @return ExternalMetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinition postEmployeeperformanceExternalmetricsDefinitions(ExternalMetricDefinitionCreateRequest body) throws IOException, ApiException {
    return  postEmployeeperformanceExternalmetricsDefinitions(createPostEmployeeperformanceExternalmetricsDefinitionsRequest(body));
  }

  /**
   * Create External Metric Definition
   * 
   * @param body The External Metric Definition to be created (optional)
   * @return ExternalMetricDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinition> postEmployeeperformanceExternalmetricsDefinitionsWithHttpInfo(ExternalMetricDefinitionCreateRequest body) throws IOException {
    return postEmployeeperformanceExternalmetricsDefinitions(createPostEmployeeperformanceExternalmetricsDefinitionsRequest(body).withHttpInfo());
  }

  private PostEmployeeperformanceExternalmetricsDefinitionsRequest createPostEmployeeperformanceExternalmetricsDefinitionsRequest(ExternalMetricDefinitionCreateRequest body) {
    return PostEmployeeperformanceExternalmetricsDefinitionsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create External Metric Definition
   * 
   * @param request The request object
   * @return ExternalMetricDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExternalMetricDefinition postEmployeeperformanceExternalmetricsDefinitions(PostEmployeeperformanceExternalmetricsDefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExternalMetricDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExternalMetricDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create External Metric Definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExternalMetricDefinition> postEmployeeperformanceExternalmetricsDefinitions(ApiRequest<ExternalMetricDefinitionCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExternalMetricDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a Contest
   * 
   * @param body Create Contest (required)
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse postGamificationContests(ContestsCreateRequest body) throws IOException, ApiException {
    return  postGamificationContests(createPostGamificationContestsRequest(body));
  }

  /**
   * Creates a Contest
   * 
   * @param body Create Contest (required)
   * @return ContestsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> postGamificationContestsWithHttpInfo(ContestsCreateRequest body) throws IOException {
    return postGamificationContests(createPostGamificationContestsRequest(body).withHttpInfo());
  }

  private PostGamificationContestsRequest createPostGamificationContestsRequest(ContestsCreateRequest body) {
    return PostGamificationContestsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates a Contest
   * 
   * @param request The request object
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse postGamificationContests(PostGamificationContestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a Contest
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> postGamificationContests(ApiRequest<ContestsCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postGamificationContestsUploadsPrizeimages(GamificationContestPrizeImageUploadUrlRequest body) throws IOException, ApiException {
    return  postGamificationContestsUploadsPrizeimages(createPostGamificationContestsUploadsPrizeimagesRequest(body));
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postGamificationContestsUploadsPrizeimagesWithHttpInfo(GamificationContestPrizeImageUploadUrlRequest body) throws IOException {
    return postGamificationContestsUploadsPrizeimages(createPostGamificationContestsUploadsPrizeimagesRequest(body).withHttpInfo());
  }

  private PostGamificationContestsUploadsPrizeimagesRequest createPostGamificationContestsUploadsPrizeimagesRequest(GamificationContestPrizeImageUploadUrlRequest body) {
    return PostGamificationContestsUploadsPrizeimagesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postGamificationContestsUploadsPrizeimages(PostGamificationContestsUploadsPrizeimagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postGamificationContestsUploadsPrizeimages(ApiRequest<GamificationContestPrizeImageUploadUrlRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Activate a performance profile
   * 
   * @param profileId performanceProfileId (required)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfileActivate(String profileId) throws IOException, ApiException {
    return  postGamificationProfileActivate(createPostGamificationProfileActivateRequest(profileId));
  }

  /**
   * Activate a performance profile
   * 
   * @param profileId performanceProfileId (required)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfileActivateWithHttpInfo(String profileId) throws IOException {
    return postGamificationProfileActivate(createPostGamificationProfileActivateRequest(profileId).withHttpInfo());
  }

  private PostGamificationProfileActivateRequest createPostGamificationProfileActivateRequest(String profileId) {
    return PostGamificationProfileActivateRequest.builder()
            .withProfileId(profileId)

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
   * @param profileId performanceProfileId (required)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfileDeactivate(String profileId) throws IOException, ApiException {
    return  postGamificationProfileDeactivate(createPostGamificationProfileDeactivateRequest(profileId));
  }

  /**
   * Deactivate a performance profile
   * 
   * @param profileId performanceProfileId (required)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfileDeactivateWithHttpInfo(String profileId) throws IOException {
    return postGamificationProfileDeactivate(createPostGamificationProfileDeactivateRequest(profileId).withHttpInfo());
  }

  private PostGamificationProfileDeactivateRequest createPostGamificationProfileDeactivateRequest(String profileId) {
    return PostGamificationProfileDeactivateRequest.builder()
            .withProfileId(profileId)

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
   * Assign members to a given performance profile
   * 
   * @param profileId Profile Id (required)
   * @param body assignUsers (required)
   * @return Assignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assignment postGamificationProfileMembers(String profileId, AssignUsers body) throws IOException, ApiException {
    return  postGamificationProfileMembers(createPostGamificationProfileMembersRequest(profileId, body));
  }

  /**
   * Assign members to a given performance profile
   * 
   * @param profileId Profile Id (required)
   * @param body assignUsers (required)
   * @return Assignment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assignment> postGamificationProfileMembersWithHttpInfo(String profileId, AssignUsers body) throws IOException {
    return postGamificationProfileMembers(createPostGamificationProfileMembersRequest(profileId, body).withHttpInfo());
  }

  private PostGamificationProfileMembersRequest createPostGamificationProfileMembersRequest(String profileId, AssignUsers body) {
    return PostGamificationProfileMembersRequest.builder()
            .withProfileId(profileId)

            .withBody(body)

            .build();
  }

  /**
   * Assign members to a given performance profile
   * 
   * @param request The request object
   * @return Assignment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Assignment postGamificationProfileMembers(PostGamificationProfileMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Assignment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Assignment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Assign members to a given performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Assignment> postGamificationProfileMembers(ApiRequest<AssignUsers> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Assignment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Assignment> response = (ApiResponse<Assignment>)(ApiResponse<?>)exception;
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
      ApiResponse<Assignment> response = (ApiResponse<Assignment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Validate member assignment
   * 
   * @param profileId Profile Id (required)
   * @param body memberAssignments (required)
   * @return AssignmentValidation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignmentValidation postGamificationProfileMembersValidate(String profileId, ValidateAssignUsers body) throws IOException, ApiException {
    return  postGamificationProfileMembersValidate(createPostGamificationProfileMembersValidateRequest(profileId, body));
  }

  /**
   * Validate member assignment
   * 
   * @param profileId Profile Id (required)
   * @param body memberAssignments (required)
   * @return AssignmentValidation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignmentValidation> postGamificationProfileMembersValidateWithHttpInfo(String profileId, ValidateAssignUsers body) throws IOException {
    return postGamificationProfileMembersValidate(createPostGamificationProfileMembersValidateRequest(profileId, body).withHttpInfo());
  }

  private PostGamificationProfileMembersValidateRequest createPostGamificationProfileMembersValidateRequest(String profileId, ValidateAssignUsers body) {
    return PostGamificationProfileMembersValidateRequest.builder()
            .withProfileId(profileId)

            .withBody(body)

            .build();
  }

  /**
   * Validate member assignment
   * 
   * @param request The request object
   * @return AssignmentValidation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssignmentValidation postGamificationProfileMembersValidate(PostGamificationProfileMembersValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssignmentValidation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssignmentValidation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate member assignment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssignmentValidation> postGamificationProfileMembersValidate(ApiRequest<ValidateAssignUsers> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssignmentValidation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssignmentValidation> response = (ApiResponse<AssignmentValidation>)(ApiResponse<?>)exception;
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
      ApiResponse<AssignmentValidation> response = (ApiResponse<AssignmentValidation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a linked metric
   * 
   * @param sourceProfileId Source Performance Profile Id (required)
   * @param sourceMetricId Source Metric Id (required)
   * @param body linkedMetric (required)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric postGamificationProfileMetricLink(String sourceProfileId, String sourceMetricId, TargetPerformanceProfile body) throws IOException, ApiException {
    return  postGamificationProfileMetricLink(createPostGamificationProfileMetricLinkRequest(sourceProfileId, sourceMetricId, body));
  }

  /**
   * Creates a linked metric
   * 
   * @param sourceProfileId Source Performance Profile Id (required)
   * @param sourceMetricId Source Metric Id (required)
   * @param body linkedMetric (required)
   * @return Metric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> postGamificationProfileMetricLinkWithHttpInfo(String sourceProfileId, String sourceMetricId, TargetPerformanceProfile body) throws IOException {
    return postGamificationProfileMetricLink(createPostGamificationProfileMetricLinkRequest(sourceProfileId, sourceMetricId, body).withHttpInfo());
  }

  private PostGamificationProfileMetricLinkRequest createPostGamificationProfileMetricLinkRequest(String sourceProfileId, String sourceMetricId, TargetPerformanceProfile body) {
    return PostGamificationProfileMetricLinkRequest.builder()
            .withSourceProfileId(sourceProfileId)

            .withSourceMetricId(sourceMetricId)

            .withBody(body)

            .build();
  }

  /**
   * Creates a linked metric
   * 
   * @param request The request object
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric postGamificationProfileMetricLink(PostGamificationProfileMetricLinkRequest request) throws IOException, ApiException {
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
   * Creates a linked metric
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Metric> postGamificationProfileMetricLink(ApiRequest<TargetPerformanceProfile> request) throws IOException {
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
   * Creates a gamified metric with a given metric definition and metric objective under in a performance profile
   * 
   * @param profileId Performance Profile Id (required)
   * @param body Metric (required)
   * @return Metric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Metric postGamificationProfileMetrics(String profileId, CreateMetric body) throws IOException, ApiException {
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
  public ApiResponse<Metric> postGamificationProfileMetricsWithHttpInfo(String profileId, CreateMetric body) throws IOException {
    return postGamificationProfileMetrics(createPostGamificationProfileMetricsRequest(profileId, body).withHttpInfo());
  }

  private PostGamificationProfileMetricsRequest createPostGamificationProfileMetricsRequest(String profileId, CreateMetric body) {
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
  public ApiResponse<Metric> postGamificationProfileMetrics(ApiRequest<CreateMetric> request) throws IOException {
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
   * @param copyMetrics Flag to copy metrics. If set to false, there will be no metrics associated with the new profile. If set to true or is absent (the default behavior), all metrics from the default profile will be copied over into the new profile. (optional, default to true)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfiles(CreatePerformanceProfile body, Boolean copyMetrics) throws IOException, ApiException {
    return  postGamificationProfiles(createPostGamificationProfilesRequest(body, copyMetrics));
  }

  /**
   * Create a new custom performance profile
   * 
   * @param body performanceProfile (required)
   * @param copyMetrics Flag to copy metrics. If set to false, there will be no metrics associated with the new profile. If set to true or is absent (the default behavior), all metrics from the default profile will be copied over into the new profile. (optional, default to true)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfilesWithHttpInfo(CreatePerformanceProfile body, Boolean copyMetrics) throws IOException {
    return postGamificationProfiles(createPostGamificationProfilesRequest(body, copyMetrics).withHttpInfo());
  }

  private PostGamificationProfilesRequest createPostGamificationProfilesRequest(CreatePerformanceProfile body, Boolean copyMetrics) {
    return PostGamificationProfilesRequest.builder()
            .withBody(body)

            .withCopyMetrics(copyMetrics)

            .build();
  }

  /**
   * Create a new custom performance profile
   * 
   * @param request The request object
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile postGamificationProfiles(PostGamificationProfilesRequest request) throws IOException, ApiException {
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
   * Create a new custom performance profile
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> postGamificationProfiles(ApiRequest<CreatePerformanceProfile> request) throws IOException {
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
   * Query performance profiles in date range for a user
   * 
   * @param userId The ID of a user. (required)
   * @param body The date range of work day. (required)
   * @return UserProfilesInDateRange
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfilesInDateRange postGamificationProfilesUserQuery(String userId, UserProfilesInDateRangeRequest body) throws IOException, ApiException {
    return  postGamificationProfilesUserQuery(createPostGamificationProfilesUserQueryRequest(userId, body));
  }

  /**
   * Query performance profiles in date range for a user
   * 
   * @param userId The ID of a user. (required)
   * @param body The date range of work day. (required)
   * @return UserProfilesInDateRange
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfilesInDateRange> postGamificationProfilesUserQueryWithHttpInfo(String userId, UserProfilesInDateRangeRequest body) throws IOException {
    return postGamificationProfilesUserQuery(createPostGamificationProfilesUserQueryRequest(userId, body).withHttpInfo());
  }

  private PostGamificationProfilesUserQueryRequest createPostGamificationProfilesUserQueryRequest(String userId, UserProfilesInDateRangeRequest body) {
    return PostGamificationProfilesUserQueryRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Query performance profiles in date range for a user
   * 
   * @param request The request object
   * @return UserProfilesInDateRange
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfilesInDateRange postGamificationProfilesUserQuery(PostGamificationProfilesUserQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserProfilesInDateRange> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserProfilesInDateRange>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query performance profiles in date range for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfilesInDateRange> postGamificationProfilesUserQuery(ApiRequest<UserProfilesInDateRangeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserProfilesInDateRange>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)exception;
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
      ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query performance profiles in date range for the current user
   * 
   * @param body The date range of work day. (required)
   * @return UserProfilesInDateRange
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfilesInDateRange postGamificationProfilesUsersMeQuery(UserProfilesInDateRangeRequest body) throws IOException, ApiException {
    return  postGamificationProfilesUsersMeQuery(createPostGamificationProfilesUsersMeQueryRequest(body));
  }

  /**
   * Query performance profiles in date range for the current user
   * 
   * @param body The date range of work day. (required)
   * @return UserProfilesInDateRange
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfilesInDateRange> postGamificationProfilesUsersMeQueryWithHttpInfo(UserProfilesInDateRangeRequest body) throws IOException {
    return postGamificationProfilesUsersMeQuery(createPostGamificationProfilesUsersMeQueryRequest(body).withHttpInfo());
  }

  private PostGamificationProfilesUsersMeQueryRequest createPostGamificationProfilesUsersMeQueryRequest(UserProfilesInDateRangeRequest body) {
    return PostGamificationProfilesUsersMeQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query performance profiles in date range for the current user
   * 
   * @param request The request object
   * @return UserProfilesInDateRange
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserProfilesInDateRange postGamificationProfilesUsersMeQuery(PostGamificationProfilesUsersMeQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserProfilesInDateRange> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserProfilesInDateRange>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query performance profiles in date range for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserProfilesInDateRange> postGamificationProfilesUsersMeQuery(ApiRequest<UserProfilesInDateRangeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserProfilesInDateRange>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)exception;
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
      ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @param body Contest (required)
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse putGamificationContest(String contestId, ContestsCreateRequest body) throws IOException, ApiException {
    return  putGamificationContest(createPutGamificationContestRequest(contestId, body));
  }

  /**
   * Update a Contest by Id
   * 
   * @param contestId The ID of the contest (required)
   * @param body Contest (required)
   * @return ContestsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> putGamificationContestWithHttpInfo(String contestId, ContestsCreateRequest body) throws IOException {
    return putGamificationContest(createPutGamificationContestRequest(contestId, body).withHttpInfo());
  }

  private PutGamificationContestRequest createPutGamificationContestRequest(String contestId, ContestsCreateRequest body) {
    return PutGamificationContestRequest.builder()
            .withContestId(contestId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Contest by Id
   * 
   * @param request The request object
   * @return ContestsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContestsResponse putGamificationContest(PutGamificationContestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContestsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContestsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Contest by Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContestsResponse> putGamificationContest(ApiRequest<ContestsCreateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContestsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a performance profile
   * 
   * @param profileId performanceProfileId (required)
   * @param body performanceProfile (optional)
   * @return PerformanceProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformanceProfile putGamificationProfile(String profileId, PerformanceProfile body) throws IOException, ApiException {
    return  putGamificationProfile(createPutGamificationProfileRequest(profileId, body));
  }

  /**
   * Updates a performance profile
   * 
   * @param profileId performanceProfileId (required)
   * @param body performanceProfile (optional)
   * @return PerformanceProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformanceProfile> putGamificationProfileWithHttpInfo(String profileId, PerformanceProfile body) throws IOException {
    return putGamificationProfile(createPutGamificationProfileRequest(profileId, body).withHttpInfo());
  }

  private PutGamificationProfileRequest createPutGamificationProfileRequest(String profileId, PerformanceProfile body) {
    return PutGamificationProfileRequest.builder()
            .withProfileId(profileId)

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
  public Metric putGamificationProfileMetric(String profileId, String metricId, CreateMetric body) throws IOException, ApiException {
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
  public ApiResponse<Metric> putGamificationProfileMetricWithHttpInfo(String profileId, String metricId, CreateMetric body) throws IOException {
    return putGamificationProfileMetric(createPutGamificationProfileMetricRequest(profileId, metricId, body).withHttpInfo());
  }

  private PutGamificationProfileMetricRequest createPutGamificationProfileMetricRequest(String profileId, String metricId, CreateMetric body) {
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
  public ApiResponse<Metric> putGamificationProfileMetric(ApiRequest<CreateMetric> request) throws IOException {
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
