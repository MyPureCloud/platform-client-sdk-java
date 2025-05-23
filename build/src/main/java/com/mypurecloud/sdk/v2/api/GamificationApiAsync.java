package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
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
import java.util.concurrent.Future;

public class GamificationApiAsync {
  private final ApiClient pcapiClient;

  public GamificationApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public GamificationApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteEmployeeperformanceExternalmetricsDefinitionAsync(DeleteEmployeeperformanceExternalmetricsDefinitionRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteEmployeeperformanceExternalmetricsDefinitionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteGamificationContestAsync(DeleteGamificationContestRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteGamificationContestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalMetricDefinition> getEmployeeperformanceExternalmetricsDefinitionAsync(GetEmployeeperformanceExternalmetricsDefinitionRequest request, final AsyncApiCallback<ExternalMetricDefinition> callback) {
    try {
      final SettableFuture<ExternalMetricDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalMetricDefinition>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinition> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalMetricDefinition>> getEmployeeperformanceExternalmetricsDefinitionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalMetricDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalMetricDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalMetricDefinition>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of External Metric Definitions of an organization, sorted by name in ascending order
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalMetricDefinitionListing> getEmployeeperformanceExternalmetricsDefinitionsAsync(GetEmployeeperformanceExternalmetricsDefinitionsRequest request, final AsyncApiCallback<ExternalMetricDefinitionListing> callback) {
    try {
      final SettableFuture<ExternalMetricDefinitionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalMetricDefinitionListing>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinitionListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinitionListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of External Metric Definitions of an organization, sorted by name in ascending order
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalMetricDefinitionListing>> getEmployeeperformanceExternalmetricsDefinitionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalMetricDefinitionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalMetricDefinitionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalMetricDefinitionListing>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinitionListing>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinitionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinitionListing> response = (ApiResponse<ExternalMetricDefinitionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinitionListing> response = (ApiResponse<ExternalMetricDefinitionListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestsResponse> getGamificationContestAsync(GetGamificationContestRequest request, final AsyncApiCallback<ContestsResponse> callback) {
    try {
      final SettableFuture<ContestsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestsResponse>> getGamificationContestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContestsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contest Scores (Admin)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestScoresAgentsPagedList> getGamificationContestAgentsScoresAsync(GetGamificationContestAgentsScoresRequest request, final AsyncApiCallback<ContestScoresAgentsPagedList> callback) {
    try {
      final SettableFuture<ContestScoresAgentsPagedList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestScoresAgentsPagedList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresAgentsPagedList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresAgentsPagedList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contest Scores (Admin)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestScoresAgentsPagedList>> getGamificationContestAgentsScoresAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContestScoresAgentsPagedList>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestScoresAgentsPagedList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestScoresAgentsPagedList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresAgentsPagedList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresAgentsPagedList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contest Scores for the requesting Agent/Supervisor
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestScoresAgentsPagedList> getGamificationContestAgentsScoresMeAsync(GetGamificationContestAgentsScoresMeRequest request, final AsyncApiCallback<ContestScoresAgentsPagedList> callback) {
    try {
      final SettableFuture<ContestScoresAgentsPagedList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestScoresAgentsPagedList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresAgentsPagedList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresAgentsPagedList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contest Scores for the requesting Agent/Supervisor
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestScoresAgentsPagedList>> getGamificationContestAgentsScoresMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContestScoresAgentsPagedList>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestScoresAgentsPagedList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestScoresAgentsPagedList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresAgentsPagedList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresAgentsPagedList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresAgentsPagedList> response = (ApiResponse<ContestScoresAgentsPagedList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest Score Trend (Average Trend)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestScoresGroupTrendList> getGamificationContestAgentsScoresTrendsAsync(GetGamificationContestAgentsScoresTrendsRequest request, final AsyncApiCallback<ContestScoresGroupTrendList> callback) {
    try {
      final SettableFuture<ContestScoresGroupTrendList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestScoresGroupTrendList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresGroupTrendList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresGroupTrendList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest Score Trend (Average Trend)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestScoresGroupTrendList>> getGamificationContestAgentsScoresTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContestScoresGroupTrendList>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestScoresGroupTrendList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestScoresGroupTrendList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresGroupTrendList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresGroupTrendList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresGroupTrendList> response = (ApiResponse<ContestScoresGroupTrendList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresGroupTrendList> response = (ApiResponse<ContestScoresGroupTrendList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest Score Trend for the requesting Agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestScoresAgentTrendList> getGamificationContestAgentsScoresTrendsMeAsync(GetGamificationContestAgentsScoresTrendsMeRequest request, final AsyncApiCallback<ContestScoresAgentTrendList> callback) {
    try {
      final SettableFuture<ContestScoresAgentTrendList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestScoresAgentTrendList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresAgentTrendList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresAgentTrendList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest Score Trend for the requesting Agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestScoresAgentTrendList>> getGamificationContestAgentsScoresTrendsMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContestScoresAgentTrendList>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestScoresAgentTrendList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestScoresAgentTrendList>() {}, new AsyncApiCallback<ApiResponse<ContestScoresAgentTrendList>>() {
        @Override
        public void onCompleted(ApiResponse<ContestScoresAgentTrendList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresAgentTrendList> response = (ApiResponse<ContestScoresAgentTrendList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestScoresAgentTrendList> response = (ApiResponse<ContestScoresAgentTrendList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest Prize Image by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PrizeImages> getGamificationContestPrizeimageAsync(GetGamificationContestPrizeimageRequest request, final AsyncApiCallback<PrizeImages> callback) {
    try {
      final SettableFuture<PrizeImages> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PrizeImages>() {}, new AsyncApiCallback<ApiResponse<PrizeImages>>() {
        @Override
        public void onCompleted(ApiResponse<PrizeImages> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Contest Prize Image by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PrizeImages>> getGamificationContestPrizeimageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PrizeImages>> callback) {
    try {
      final SettableFuture<ApiResponse<PrizeImages>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PrizeImages>() {}, new AsyncApiCallback<ApiResponse<PrizeImages>>() {
        @Override
        public void onCompleted(ApiResponse<PrizeImages> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PrizeImages> response = (ApiResponse<PrizeImages>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PrizeImages> response = (ApiResponse<PrizeImages>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a List of Contests (Admin)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetContestsEssentialsListing> getGamificationContestsAsync(GetGamificationContestsRequest request, final AsyncApiCallback<GetContestsEssentialsListing> callback) {
    try {
      final SettableFuture<GetContestsEssentialsListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetContestsEssentialsListing>() {}, new AsyncApiCallback<ApiResponse<GetContestsEssentialsListing>>() {
        @Override
        public void onCompleted(ApiResponse<GetContestsEssentialsListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a List of Contests (Admin)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetContestsEssentialsListing>> getGamificationContestsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetContestsEssentialsListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GetContestsEssentialsListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetContestsEssentialsListing>() {}, new AsyncApiCallback<ApiResponse<GetContestsEssentialsListing>>() {
        @Override
        public void onCompleted(ApiResponse<GetContestsEssentialsListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a List of Contests (Agent/Supervisor)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetContestsEssentialsListing> getGamificationContestsMeAsync(GetGamificationContestsMeRequest request, final AsyncApiCallback<GetContestsEssentialsListing> callback) {
    try {
      final SettableFuture<GetContestsEssentialsListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetContestsEssentialsListing>() {}, new AsyncApiCallback<ApiResponse<GetContestsEssentialsListing>>() {
        @Override
        public void onCompleted(ApiResponse<GetContestsEssentialsListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a List of Contests (Agent/Supervisor)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetContestsEssentialsListing>> getGamificationContestsMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetContestsEssentialsListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GetContestsEssentialsListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetContestsEssentialsListing>() {}, new AsyncApiCallback<ApiResponse<GetContestsEssentialsListing>>() {
        @Override
        public void onCompleted(ApiResponse<GetContestsEssentialsListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetContestsEssentialsListing> response = (ApiResponse<GetContestsEssentialsListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights summary
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InsightsSummary> getGamificationInsightsAsync(GetGamificationInsightsRequest request, final AsyncApiCallback<InsightsSummary> callback) {
    try {
      final SettableFuture<InsightsSummary> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InsightsSummary>() {}, new AsyncApiCallback<ApiResponse<InsightsSummary>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsSummary> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights summary
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InsightsSummary>> getGamificationInsightsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InsightsSummary>> callback) {
    try {
      final SettableFuture<ApiResponse<InsightsSummary>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InsightsSummary>() {}, new AsyncApiCallback<ApiResponse<InsightsSummary>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsSummary> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsSummary> response = (ApiResponse<InsightsSummary>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsSummary> response = (ApiResponse<InsightsSummary>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights details for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InsightsDetails> getGamificationInsightsDetailsAsync(GetGamificationInsightsDetailsRequest request, final AsyncApiCallback<InsightsDetails> callback) {
    try {
      final SettableFuture<InsightsDetails> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InsightsDetails>() {}, new AsyncApiCallback<ApiResponse<InsightsDetails>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsDetails> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights details for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InsightsDetails>> getGamificationInsightsDetailsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InsightsDetails>> callback) {
    try {
      final SettableFuture<ApiResponse<InsightsDetails>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InsightsDetails>() {}, new AsyncApiCallback<ApiResponse<InsightsDetails>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsDetails> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights overall trend for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InsightsTrend> getGamificationInsightsGroupsTrendsAsync(GetGamificationInsightsGroupsTrendsRequest request, final AsyncApiCallback<InsightsTrend> callback) {
    try {
      final SettableFuture<InsightsTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InsightsTrend>() {}, new AsyncApiCallback<ApiResponse<InsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights overall trend for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InsightsTrend>> getGamificationInsightsGroupsTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InsightsTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<InsightsTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InsightsTrend>() {}, new AsyncApiCallback<ApiResponse<InsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights overall trend
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InsightsTrend> getGamificationInsightsGroupsTrendsAllAsync(GetGamificationInsightsGroupsTrendsAllRequest request, final AsyncApiCallback<InsightsTrend> callback) {
    try {
      final SettableFuture<InsightsTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InsightsTrend>() {}, new AsyncApiCallback<ApiResponse<InsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights overall trend
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InsightsTrend>> getGamificationInsightsGroupsTrendsAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InsightsTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<InsightsTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InsightsTrend>() {}, new AsyncApiCallback<ApiResponse<InsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsTrend> response = (ApiResponse<InsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query users in a profile during a period of time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InsightsAgents> getGamificationInsightsMembersAsync(GetGamificationInsightsMembersRequest request, final AsyncApiCallback<InsightsAgents> callback) {
    try {
      final SettableFuture<InsightsAgents> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InsightsAgents>() {}, new AsyncApiCallback<ApiResponse<InsightsAgents>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsAgents> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query users in a profile during a period of time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InsightsAgents>> getGamificationInsightsMembersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InsightsAgents>> callback) {
    try {
      final SettableFuture<ApiResponse<InsightsAgents>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InsightsAgents>() {}, new AsyncApiCallback<ApiResponse<InsightsAgents>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsAgents> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsAgents> response = (ApiResponse<InsightsAgents>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsAgents> response = (ApiResponse<InsightsAgents>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights rankings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InsightsRankings> getGamificationInsightsRankingsAsync(GetGamificationInsightsRankingsRequest request, final AsyncApiCallback<InsightsRankings> callback) {
    try {
      final SettableFuture<InsightsRankings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InsightsRankings>() {}, new AsyncApiCallback<ApiResponse<InsightsRankings>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsRankings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights rankings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InsightsRankings>> getGamificationInsightsRankingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InsightsRankings>> callback) {
    try {
      final SettableFuture<ApiResponse<InsightsRankings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InsightsRankings>() {}, new AsyncApiCallback<ApiResponse<InsightsRankings>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsRankings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsRankings> response = (ApiResponse<InsightsRankings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsRankings> response = (ApiResponse<InsightsRankings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights user trend for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserInsightsTrend> getGamificationInsightsTrendsAsync(GetGamificationInsightsTrendsRequest request, final AsyncApiCallback<UserInsightsTrend> callback) {
    try {
      final SettableFuture<UserInsightsTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserInsightsTrend>() {}, new AsyncApiCallback<ApiResponse<UserInsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<UserInsightsTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights user trend for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserInsightsTrend>> getGamificationInsightsTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserInsightsTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<UserInsightsTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserInsightsTrend>() {}, new AsyncApiCallback<ApiResponse<UserInsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<UserInsightsTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights details for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InsightsDetails> getGamificationInsightsUserDetailsAsync(GetGamificationInsightsUserDetailsRequest request, final AsyncApiCallback<InsightsDetails> callback) {
    try {
      final SettableFuture<InsightsDetails> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InsightsDetails>() {}, new AsyncApiCallback<ApiResponse<InsightsDetails>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsDetails> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights details for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InsightsDetails>> getGamificationInsightsUserDetailsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InsightsDetails>> callback) {
    try {
      final SettableFuture<ApiResponse<InsightsDetails>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InsightsDetails>() {}, new AsyncApiCallback<ApiResponse<InsightsDetails>>() {
        @Override
        public void onCompleted(ApiResponse<InsightsDetails> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InsightsDetails> response = (ApiResponse<InsightsDetails>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights user trend for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserInsightsTrend> getGamificationInsightsUserTrendsAsync(GetGamificationInsightsUserTrendsRequest request, final AsyncApiCallback<UserInsightsTrend> callback) {
    try {
      final SettableFuture<UserInsightsTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserInsightsTrend>() {}, new AsyncApiCallback<ApiResponse<UserInsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<UserInsightsTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get insights user trend for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserInsightsTrend>> getGamificationInsightsUserTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserInsightsTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<UserInsightsTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserInsightsTrend>() {}, new AsyncApiCallback<ApiResponse<UserInsightsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<UserInsightsTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserInsightsTrend> response = (ApiResponse<UserInsightsTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Leaderboard of the requesting user's division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Leaderboard> getGamificationLeaderboardAsync(GetGamificationLeaderboardRequest request, final AsyncApiCallback<Leaderboard> callback) {
    try {
      final SettableFuture<Leaderboard> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Leaderboard>() {}, new AsyncApiCallback<ApiResponse<Leaderboard>>() {
        @Override
        public void onCompleted(ApiResponse<Leaderboard> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Leaderboard of the requesting user's division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Leaderboard>> getGamificationLeaderboardAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Leaderboard>> callback) {
    try {
      final SettableFuture<ApiResponse<Leaderboard>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Leaderboard>() {}, new AsyncApiCallback<ApiResponse<Leaderboard>>() {
        @Override
        public void onCompleted(ApiResponse<Leaderboard> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Leaderboard by filter type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Leaderboard> getGamificationLeaderboardAllAsync(GetGamificationLeaderboardAllRequest request, final AsyncApiCallback<Leaderboard> callback) {
    try {
      final SettableFuture<Leaderboard> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Leaderboard>() {}, new AsyncApiCallback<ApiResponse<Leaderboard>>() {
        @Override
        public void onCompleted(ApiResponse<Leaderboard> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Leaderboard by filter type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Leaderboard>> getGamificationLeaderboardAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Leaderboard>> callback) {
    try {
      final SettableFuture<ApiResponse<Leaderboard>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Leaderboard>() {}, new AsyncApiCallback<ApiResponse<Leaderboard>>() {
        @Override
        public void onCompleted(ApiResponse<Leaderboard> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Leaderboard> response = (ApiResponse<Leaderboard>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best Points by division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OverallBestPoints> getGamificationLeaderboardAllBestpointsAsync(GetGamificationLeaderboardAllBestpointsRequest request, final AsyncApiCallback<OverallBestPoints> callback) {
    try {
      final SettableFuture<OverallBestPoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OverallBestPoints>() {}, new AsyncApiCallback<ApiResponse<OverallBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<OverallBestPoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best Points by division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OverallBestPoints>> getGamificationLeaderboardAllBestpointsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OverallBestPoints>> callback) {
    try {
      final SettableFuture<ApiResponse<OverallBestPoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OverallBestPoints>() {}, new AsyncApiCallback<ApiResponse<OverallBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<OverallBestPoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best Points of the requesting user's current performance profile or division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OverallBestPoints> getGamificationLeaderboardBestpointsAsync(GetGamificationLeaderboardBestpointsRequest request, final AsyncApiCallback<OverallBestPoints> callback) {
    try {
      final SettableFuture<OverallBestPoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OverallBestPoints>() {}, new AsyncApiCallback<ApiResponse<OverallBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<OverallBestPoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best Points of the requesting user's current performance profile or division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OverallBestPoints>> getGamificationLeaderboardBestpointsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OverallBestPoints>> callback) {
    try {
      final SettableFuture<ApiResponse<OverallBestPoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OverallBestPoints>() {}, new AsyncApiCallback<ApiResponse<OverallBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<OverallBestPoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OverallBestPoints> response = (ApiResponse<OverallBestPoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Metric definition by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MetricDefinition> getGamificationMetricdefinitionAsync(GetGamificationMetricdefinitionRequest request, final AsyncApiCallback<MetricDefinition> callback) {
    try {
      final SettableFuture<MetricDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MetricDefinition>() {}, new AsyncApiCallback<ApiResponse<MetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<MetricDefinition> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Metric definition by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MetricDefinition>> getGamificationMetricdefinitionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MetricDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<MetricDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MetricDefinition>() {}, new AsyncApiCallback<ApiResponse<MetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<MetricDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricDefinition> response = (ApiResponse<MetricDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricDefinition> response = (ApiResponse<MetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All metric definitions
   * Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetMetricDefinitionsResponse> getGamificationMetricdefinitionsAsync(GetGamificationMetricdefinitionsRequest request, final AsyncApiCallback<GetMetricDefinitionsResponse> callback) {
    try {
      final SettableFuture<GetMetricDefinitionsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetMetricDefinitionsResponse>() {}, new AsyncApiCallback<ApiResponse<GetMetricDefinitionsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetMetricDefinitionsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All metric definitions
   * Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetMetricDefinitionsResponse>> getGamificationMetricdefinitionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetMetricDefinitionsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GetMetricDefinitionsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetMetricDefinitionsResponse>() {}, new AsyncApiCallback<ApiResponse<GetMetricDefinitionsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetMetricDefinitionsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetMetricDefinitionsResponse> response = (ApiResponse<GetMetricDefinitionsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetMetricDefinitionsResponse> response = (ApiResponse<GetMetricDefinitionsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PerformanceProfile> getGamificationProfileAsync(GetGamificationProfileRequest request, final AsyncApiCallback<PerformanceProfile> callback) {
    try {
      final SettableFuture<PerformanceProfile> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PerformanceProfile>> getGamificationProfileAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PerformanceProfile>> callback) {
    try {
      final SettableFuture<ApiResponse<PerformanceProfile>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Members of a given performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MemberListing> getGamificationProfileMembersAsync(GetGamificationProfileMembersRequest request, final AsyncApiCallback<MemberListing> callback) {
    try {
      final SettableFuture<MemberListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MemberListing>() {}, new AsyncApiCallback<ApiResponse<MemberListing>>() {
        @Override
        public void onCompleted(ApiResponse<MemberListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Members of a given performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MemberListing>> getGamificationProfileMembersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MemberListing>> callback) {
    try {
      final SettableFuture<ApiResponse<MemberListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MemberListing>() {}, new AsyncApiCallback<ApiResponse<MemberListing>>() {
        @Override
        public void onCompleted(ApiResponse<MemberListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MemberListing> response = (ApiResponse<MemberListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MemberListing> response = (ApiResponse<MemberListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile gamified metric by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Metric> getGamificationProfileMetricAsync(GetGamificationProfileMetricRequest request, final AsyncApiCallback<Metric> callback) {
    try {
      final SettableFuture<Metric> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile gamified metric by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Metric>> getGamificationProfileMetricAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
    try {
      final SettableFuture<ApiResponse<Metric>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All gamified metrics for a given performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetMetricResponse> getGamificationProfileMetricsAsync(GetGamificationProfileMetricsRequest request, final AsyncApiCallback<GetMetricResponse> callback) {
    try {
      final SettableFuture<GetMetricResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetMetricResponse>() {}, new AsyncApiCallback<ApiResponse<GetMetricResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetMetricResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All gamified metrics for a given performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetMetricResponse>> getGamificationProfileMetricsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetMetricResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GetMetricResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetMetricResponse>() {}, new AsyncApiCallback<ApiResponse<GetMetricResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetMetricResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetMetricResponse> response = (ApiResponse<GetMetricResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetMetricResponse> response = (ApiResponse<GetMetricResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All metrics for a given performance profile with objective details such as order and maxPoints
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetMetricsResponse> getGamificationProfileMetricsObjectivedetailsAsync(GetGamificationProfileMetricsObjectivedetailsRequest request, final AsyncApiCallback<GetMetricsResponse> callback) {
    try {
      final SettableFuture<GetMetricsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetMetricsResponse>() {}, new AsyncApiCallback<ApiResponse<GetMetricsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetMetricsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All metrics for a given performance profile with objective details such as order and maxPoints
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetMetricsResponse>> getGamificationProfileMetricsObjectivedetailsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetMetricsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GetMetricsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetMetricsResponse>() {}, new AsyncApiCallback<ApiResponse<GetMetricsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetMetricsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetMetricsResponse> response = (ApiResponse<GetMetricsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetMetricsResponse> response = (ApiResponse<GetMetricsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All performance profiles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetProfilesResponse> getGamificationProfilesAsync(GetGamificationProfilesRequest request, final AsyncApiCallback<GetProfilesResponse> callback) {
    try {
      final SettableFuture<GetProfilesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetProfilesResponse>() {}, new AsyncApiCallback<ApiResponse<GetProfilesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetProfilesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All performance profiles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetProfilesResponse>> getGamificationProfilesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetProfilesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GetProfilesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetProfilesResponse>() {}, new AsyncApiCallback<ApiResponse<GetProfilesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetProfilesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetProfilesResponse> response = (ApiResponse<GetProfilesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetProfilesResponse> response = (ApiResponse<GetProfilesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PerformanceProfile> getGamificationProfilesUserAsync(GetGamificationProfilesUserRequest request, final AsyncApiCallback<PerformanceProfile> callback) {
    try {
      final SettableFuture<PerformanceProfile> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PerformanceProfile>> getGamificationProfilesUserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PerformanceProfile>> callback) {
    try {
      final SettableFuture<ApiResponse<PerformanceProfile>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PerformanceProfile> getGamificationProfilesUsersMeAsync(GetGamificationProfilesUsersMeRequest request, final AsyncApiCallback<PerformanceProfile> callback) {
    try {
      final SettableFuture<PerformanceProfile> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Performance profile of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PerformanceProfile>> getGamificationProfilesUsersMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PerformanceProfile>> callback) {
    try {
      final SettableFuture<ApiResponse<PerformanceProfile>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday performance metrics of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkdayMetricListing> getGamificationScorecardsAsync(GetGamificationScorecardsRequest request, final AsyncApiCallback<WorkdayMetricListing> callback) {
    try {
      final SettableFuture<WorkdayMetricListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkdayMetricListing>() {}, new AsyncApiCallback<ApiResponse<WorkdayMetricListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayMetricListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday performance metrics of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkdayMetricListing>> getGamificationScorecardsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkdayMetricListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkdayMetricListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkdayMetricListing>() {}, new AsyncApiCallback<ApiResponse<WorkdayMetricListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayMetricListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Attendance status metrics of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AttendanceStatusListing> getGamificationScorecardsAttendanceAsync(GetGamificationScorecardsAttendanceRequest request, final AsyncApiCallback<AttendanceStatusListing> callback) {
    try {
      final SettableFuture<AttendanceStatusListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AttendanceStatusListing>() {}, new AsyncApiCallback<ApiResponse<AttendanceStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<AttendanceStatusListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Attendance status metrics of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AttendanceStatusListing>> getGamificationScorecardsAttendanceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AttendanceStatusListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AttendanceStatusListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AttendanceStatusListing>() {}, new AsyncApiCallback<ApiResponse<AttendanceStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<AttendanceStatusListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best points of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserBestPoints> getGamificationScorecardsBestpointsAsync(GetGamificationScorecardsBestpointsRequest request, final AsyncApiCallback<UserBestPoints> callback) {
    try {
      final SettableFuture<UserBestPoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserBestPoints>() {}, new AsyncApiCallback<ApiResponse<UserBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<UserBestPoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best points of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserBestPoints>> getGamificationScorecardsBestpointsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserBestPoints>> callback) {
    try {
      final SettableFuture<ApiResponse<UserBestPoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserBestPoints>() {}, new AsyncApiCallback<ApiResponse<UserBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<UserBestPoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All-time points of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AllTimePoints> getGamificationScorecardsPointsAlltimeAsync(GetGamificationScorecardsPointsAlltimeRequest request, final AsyncApiCallback<AllTimePoints> callback) {
    try {
      final SettableFuture<AllTimePoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AllTimePoints>() {}, new AsyncApiCallback<ApiResponse<AllTimePoints>>() {
        @Override
        public void onCompleted(ApiResponse<AllTimePoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All-time points of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AllTimePoints>> getGamificationScorecardsPointsAlltimeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AllTimePoints>> callback) {
    try {
      final SettableFuture<ApiResponse<AllTimePoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AllTimePoints>() {}, new AsyncApiCallback<ApiResponse<AllTimePoints>>() {
        @Override
        public void onCompleted(ApiResponse<AllTimePoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average points of the requesting user's division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SingleWorkdayAveragePoints> getGamificationScorecardsPointsAverageAsync(GetGamificationScorecardsPointsAverageRequest request, final AsyncApiCallback<SingleWorkdayAveragePoints> callback) {
    try {
      final SettableFuture<SingleWorkdayAveragePoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SingleWorkdayAveragePoints>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAveragePoints>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAveragePoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average points of the requesting user's division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SingleWorkdayAveragePoints>> getGamificationScorecardsPointsAverageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SingleWorkdayAveragePoints>> callback) {
    try {
      final SettableFuture<ApiResponse<SingleWorkdayAveragePoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SingleWorkdayAveragePoints>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAveragePoints>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAveragePoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Points trends of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkdayPointsTrend> getGamificationScorecardsPointsTrendsAsync(GetGamificationScorecardsPointsTrendsRequest request, final AsyncApiCallback<WorkdayPointsTrend> callback) {
    try {
      final SettableFuture<WorkdayPointsTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkdayPointsTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayPointsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayPointsTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Points trends of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkdayPointsTrend>> getGamificationScorecardsPointsTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkdayPointsTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkdayPointsTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkdayPointsTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayPointsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayPointsTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average performance values trends by metric of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MetricValueTrendAverage> getGamificationScorecardsProfileMetricUserValuesTrendsAsync(GetGamificationScorecardsProfileMetricUserValuesTrendsRequest request, final AsyncApiCallback<MetricValueTrendAverage> callback) {
    try {
      final SettableFuture<MetricValueTrendAverage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MetricValueTrendAverage>() {}, new AsyncApiCallback<ApiResponse<MetricValueTrendAverage>>() {
        @Override
        public void onCompleted(ApiResponse<MetricValueTrendAverage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average performance values trends by metric of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MetricValueTrendAverage>> getGamificationScorecardsProfileMetricUserValuesTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MetricValueTrendAverage>> callback) {
    try {
      final SettableFuture<ApiResponse<MetricValueTrendAverage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MetricValueTrendAverage>() {}, new AsyncApiCallback<ApiResponse<MetricValueTrendAverage>>() {
        @Override
        public void onCompleted(ApiResponse<MetricValueTrendAverage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average performance values trends by metric of a division or a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MetricValueTrendAverage> getGamificationScorecardsProfileMetricUsersValuesTrendsAsync(GetGamificationScorecardsProfileMetricUsersValuesTrendsRequest request, final AsyncApiCallback<MetricValueTrendAverage> callback) {
    try {
      final SettableFuture<MetricValueTrendAverage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MetricValueTrendAverage>() {}, new AsyncApiCallback<ApiResponse<MetricValueTrendAverage>>() {
        @Override
        public void onCompleted(ApiResponse<MetricValueTrendAverage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average performance values trends by metric of a division or a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MetricValueTrendAverage>> getGamificationScorecardsProfileMetricUsersValuesTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MetricValueTrendAverage>> callback) {
    try {
      final SettableFuture<ApiResponse<MetricValueTrendAverage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MetricValueTrendAverage>() {}, new AsyncApiCallback<ApiResponse<MetricValueTrendAverage>>() {
        @Override
        public void onCompleted(ApiResponse<MetricValueTrendAverage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average performance values trends by metric of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MetricValueTrendAverage> getGamificationScorecardsProfileMetricValuesTrendsAsync(GetGamificationScorecardsProfileMetricValuesTrendsRequest request, final AsyncApiCallback<MetricValueTrendAverage> callback) {
    try {
      final SettableFuture<MetricValueTrendAverage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MetricValueTrendAverage>() {}, new AsyncApiCallback<ApiResponse<MetricValueTrendAverage>>() {
        @Override
        public void onCompleted(ApiResponse<MetricValueTrendAverage> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average performance values trends by metric of the requesting user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MetricValueTrendAverage>> getGamificationScorecardsProfileMetricValuesTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MetricValueTrendAverage>> callback) {
    try {
      final SettableFuture<ApiResponse<MetricValueTrendAverage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MetricValueTrendAverage>() {}, new AsyncApiCallback<ApiResponse<MetricValueTrendAverage>>() {
        @Override
        public void onCompleted(ApiResponse<MetricValueTrendAverage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MetricValueTrendAverage> response = (ApiResponse<MetricValueTrendAverage>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday performance metrics for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkdayMetricListing> getGamificationScorecardsUserAsync(GetGamificationScorecardsUserRequest request, final AsyncApiCallback<WorkdayMetricListing> callback) {
    try {
      final SettableFuture<WorkdayMetricListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkdayMetricListing>() {}, new AsyncApiCallback<ApiResponse<WorkdayMetricListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayMetricListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday performance metrics for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkdayMetricListing>> getGamificationScorecardsUserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkdayMetricListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkdayMetricListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkdayMetricListing>() {}, new AsyncApiCallback<ApiResponse<WorkdayMetricListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayMetricListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayMetricListing> response = (ApiResponse<WorkdayMetricListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Attendance status metrics for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AttendanceStatusListing> getGamificationScorecardsUserAttendanceAsync(GetGamificationScorecardsUserAttendanceRequest request, final AsyncApiCallback<AttendanceStatusListing> callback) {
    try {
      final SettableFuture<AttendanceStatusListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AttendanceStatusListing>() {}, new AsyncApiCallback<ApiResponse<AttendanceStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<AttendanceStatusListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Attendance status metrics for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AttendanceStatusListing>> getGamificationScorecardsUserAttendanceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AttendanceStatusListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AttendanceStatusListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AttendanceStatusListing>() {}, new AsyncApiCallback<ApiResponse<AttendanceStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<AttendanceStatusListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AttendanceStatusListing> response = (ApiResponse<AttendanceStatusListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best points of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserBestPoints> getGamificationScorecardsUserBestpointsAsync(GetGamificationScorecardsUserBestpointsRequest request, final AsyncApiCallback<UserBestPoints> callback) {
    try {
      final SettableFuture<UserBestPoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserBestPoints>() {}, new AsyncApiCallback<ApiResponse<UserBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<UserBestPoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Best points of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserBestPoints>> getGamificationScorecardsUserBestpointsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserBestPoints>> callback) {
    try {
      final SettableFuture<ApiResponse<UserBestPoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserBestPoints>() {}, new AsyncApiCallback<ApiResponse<UserBestPoints>>() {
        @Override
        public void onCompleted(ApiResponse<UserBestPoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserBestPoints> response = (ApiResponse<UserBestPoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All-time points for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AllTimePoints> getGamificationScorecardsUserPointsAlltimeAsync(GetGamificationScorecardsUserPointsAlltimeRequest request, final AsyncApiCallback<AllTimePoints> callback) {
    try {
      final SettableFuture<AllTimePoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AllTimePoints>() {}, new AsyncApiCallback<ApiResponse<AllTimePoints>>() {
        @Override
        public void onCompleted(ApiResponse<AllTimePoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All-time points for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AllTimePoints>> getGamificationScorecardsUserPointsAlltimeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AllTimePoints>> callback) {
    try {
      final SettableFuture<ApiResponse<AllTimePoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AllTimePoints>() {}, new AsyncApiCallback<ApiResponse<AllTimePoints>>() {
        @Override
        public void onCompleted(ApiResponse<AllTimePoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AllTimePoints> response = (ApiResponse<AllTimePoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Points trend for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkdayPointsTrend> getGamificationScorecardsUserPointsTrendsAsync(GetGamificationScorecardsUserPointsTrendsRequest request, final AsyncApiCallback<WorkdayPointsTrend> callback) {
    try {
      final SettableFuture<WorkdayPointsTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkdayPointsTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayPointsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayPointsTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Points trend for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkdayPointsTrend>> getGamificationScorecardsUserPointsTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkdayPointsTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkdayPointsTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkdayPointsTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayPointsTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayPointsTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayPointsTrend> response = (ApiResponse<WorkdayPointsTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Values trends of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkdayValuesTrend> getGamificationScorecardsUserValuesTrendsAsync(GetGamificationScorecardsUserValuesTrendsRequest request, final AsyncApiCallback<WorkdayValuesTrend> callback) {
    try {
      final SettableFuture<WorkdayValuesTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkdayValuesTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayValuesTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayValuesTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Values trends of a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkdayValuesTrend>> getGamificationScorecardsUserValuesTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkdayValuesTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkdayValuesTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkdayValuesTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayValuesTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayValuesTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday average points by target group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SingleWorkdayAveragePoints> getGamificationScorecardsUsersPointsAverageAsync(GetGamificationScorecardsUsersPointsAverageRequest request, final AsyncApiCallback<SingleWorkdayAveragePoints> callback) {
    try {
      final SettableFuture<SingleWorkdayAveragePoints> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SingleWorkdayAveragePoints>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAveragePoints>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAveragePoints> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday average points by target group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SingleWorkdayAveragePoints>> getGamificationScorecardsUsersPointsAverageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SingleWorkdayAveragePoints>> callback) {
    try {
      final SettableFuture<ApiResponse<SingleWorkdayAveragePoints>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SingleWorkdayAveragePoints>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAveragePoints>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAveragePoints> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAveragePoints> response = (ApiResponse<SingleWorkdayAveragePoints>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday average values by target group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SingleWorkdayAverageValues> getGamificationScorecardsUsersValuesAverageAsync(GetGamificationScorecardsUsersValuesAverageRequest request, final AsyncApiCallback<SingleWorkdayAverageValues> callback) {
    try {
      final SettableFuture<SingleWorkdayAverageValues> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SingleWorkdayAverageValues>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAverageValues>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAverageValues> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Workday average values by target group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SingleWorkdayAverageValues>> getGamificationScorecardsUsersValuesAverageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SingleWorkdayAverageValues>> callback) {
    try {
      final SettableFuture<ApiResponse<SingleWorkdayAverageValues>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SingleWorkdayAverageValues>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAverageValues>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAverageValues> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Values trend by target group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkdayValuesTrend> getGamificationScorecardsUsersValuesTrendsAsync(GetGamificationScorecardsUsersValuesTrendsRequest request, final AsyncApiCallback<WorkdayValuesTrend> callback) {
    try {
      final SettableFuture<WorkdayValuesTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkdayValuesTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayValuesTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayValuesTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Values trend by target group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkdayValuesTrend>> getGamificationScorecardsUsersValuesTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkdayValuesTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkdayValuesTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkdayValuesTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayValuesTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayValuesTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average values of the requesting user's division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SingleWorkdayAverageValues> getGamificationScorecardsValuesAverageAsync(GetGamificationScorecardsValuesAverageRequest request, final AsyncApiCallback<SingleWorkdayAverageValues> callback) {
    try {
      final SettableFuture<SingleWorkdayAverageValues> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SingleWorkdayAverageValues>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAverageValues>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAverageValues> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Average values of the requesting user's division or performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SingleWorkdayAverageValues>> getGamificationScorecardsValuesAverageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SingleWorkdayAverageValues>> callback) {
    try {
      final SettableFuture<ApiResponse<SingleWorkdayAverageValues>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SingleWorkdayAverageValues>() {}, new AsyncApiCallback<ApiResponse<SingleWorkdayAverageValues>>() {
        @Override
        public void onCompleted(ApiResponse<SingleWorkdayAverageValues> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SingleWorkdayAverageValues> response = (ApiResponse<SingleWorkdayAverageValues>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Values trends of the requesting user or group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkdayValuesTrend> getGamificationScorecardsValuesTrendsAsync(GetGamificationScorecardsValuesTrendsRequest request, final AsyncApiCallback<WorkdayValuesTrend> callback) {
    try {
      final SettableFuture<WorkdayValuesTrend> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkdayValuesTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayValuesTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayValuesTrend> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Values trends of the requesting user or group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkdayValuesTrend>> getGamificationScorecardsValuesTrendsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkdayValuesTrend>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkdayValuesTrend>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkdayValuesTrend>() {}, new AsyncApiCallback<ApiResponse<WorkdayValuesTrend>>() {
        @Override
        public void onCompleted(ApiResponse<WorkdayValuesTrend> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkdayValuesTrend> response = (ApiResponse<WorkdayValuesTrend>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gamification activation status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GamificationStatus> getGamificationStatusAsync(GetGamificationStatusRequest request, final AsyncApiCallback<GamificationStatus> callback) {
    try {
      final SettableFuture<GamificationStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GamificationStatus>() {}, new AsyncApiCallback<ApiResponse<GamificationStatus>>() {
        @Override
        public void onCompleted(ApiResponse<GamificationStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gamification activation status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GamificationStatus>> getGamificationStatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GamificationStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<GamificationStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GamificationStatus>() {}, new AsyncApiCallback<ApiResponse<GamificationStatus>>() {
        @Override
        public void onCompleted(ApiResponse<GamificationStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Objective template by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ObjectiveTemplate> getGamificationTemplateAsync(GetGamificationTemplateRequest request, final AsyncApiCallback<ObjectiveTemplate> callback) {
    try {
      final SettableFuture<ObjectiveTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ObjectiveTemplate>() {}, new AsyncApiCallback<ApiResponse<ObjectiveTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ObjectiveTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Objective template by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ObjectiveTemplate>> getGamificationTemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ObjectiveTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ObjectiveTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ObjectiveTemplate>() {}, new AsyncApiCallback<ApiResponse<ObjectiveTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ObjectiveTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ObjectiveTemplate> response = (ApiResponse<ObjectiveTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ObjectiveTemplate> response = (ApiResponse<ObjectiveTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All objective templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetTemplatesResponse> getGamificationTemplatesAsync(GetGamificationTemplatesRequest request, final AsyncApiCallback<GetTemplatesResponse> callback) {
    try {
      final SettableFuture<GetTemplatesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetTemplatesResponse>() {}, new AsyncApiCallback<ApiResponse<GetTemplatesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetTemplatesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * All objective templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetTemplatesResponse>> getGamificationTemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetTemplatesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GetTemplatesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetTemplatesResponse>() {}, new AsyncApiCallback<ApiResponse<GetTemplatesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GetTemplatesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetTemplatesResponse> response = (ApiResponse<GetTemplatesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetTemplatesResponse> response = (ApiResponse<GetTemplatesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalMetricDefinition> patchEmployeeperformanceExternalmetricsDefinitionAsync(PatchEmployeeperformanceExternalmetricsDefinitionRequest request, final AsyncApiCallback<ExternalMetricDefinition> callback) {
    try {
      final SettableFuture<ExternalMetricDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalMetricDefinition>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinition> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalMetricDefinition>> patchEmployeeperformanceExternalmetricsDefinitionAsync(ApiRequest<ExternalMetricDefinitionUpdateRequest> request, final AsyncApiCallback<ApiResponse<ExternalMetricDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalMetricDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalMetricDefinition>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Finalize a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestsResponse> patchGamificationContestAsync(PatchGamificationContestRequest request, final AsyncApiCallback<ContestsResponse> callback) {
    try {
      final SettableFuture<ContestsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Finalize a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestsResponse>> patchGamificationContestAsync(ApiRequest<ContestsFinalizeRequest> request, final AsyncApiCallback<ApiResponse<ContestsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Write External Metric Data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalMetricDataWriteResponse> postEmployeeperformanceExternalmetricsDataAsync(PostEmployeeperformanceExternalmetricsDataRequest request, final AsyncApiCallback<ExternalMetricDataWriteResponse> callback) {
    try {
      final SettableFuture<ExternalMetricDataWriteResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalMetricDataWriteResponse>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDataWriteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDataWriteResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Write External Metric Data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalMetricDataWriteResponse>> postEmployeeperformanceExternalmetricsDataAsync(ApiRequest<ExternalMetricDataWriteRequest> request, final AsyncApiCallback<ApiResponse<ExternalMetricDataWriteResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalMetricDataWriteResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalMetricDataWriteResponse>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDataWriteResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDataWriteResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDataWriteResponse> response = (ApiResponse<ExternalMetricDataWriteResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDataWriteResponse> response = (ApiResponse<ExternalMetricDataWriteResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalMetricDefinition> postEmployeeperformanceExternalmetricsDefinitionsAsync(PostEmployeeperformanceExternalmetricsDefinitionsRequest request, final AsyncApiCallback<ExternalMetricDefinition> callback) {
    try {
      final SettableFuture<ExternalMetricDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalMetricDefinition>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinition> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create External Metric Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalMetricDefinition>> postEmployeeperformanceExternalmetricsDefinitionsAsync(ApiRequest<ExternalMetricDefinitionCreateRequest> request, final AsyncApiCallback<ApiResponse<ExternalMetricDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalMetricDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalMetricDefinition>() {}, new AsyncApiCallback<ApiResponse<ExternalMetricDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalMetricDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalMetricDefinition> response = (ApiResponse<ExternalMetricDefinition>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a Contest
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestsResponse> postGamificationContestsAsync(PostGamificationContestsRequest request, final AsyncApiCallback<ContestsResponse> callback) {
    try {
      final SettableFuture<ContestsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a Contest
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestsResponse>> postGamificationContestsAsync(ApiRequest<ContestsCreateRequest> request, final AsyncApiCallback<ApiResponse<ContestsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UploadUrlResponse> postGamificationContestsUploadsPrizeimagesAsync(PostGamificationContestsUploadsPrizeimagesRequest request, final AsyncApiCallback<UploadUrlResponse> callback) {
    try {
      final SettableFuture<UploadUrlResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {}, new AsyncApiCallback<ApiResponse<UploadUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UploadUrlResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UploadUrlResponse>> postGamificationContestsUploadsPrizeimagesAsync(ApiRequest<GamificationContestPrizeImageUploadUrlRequest> request, final AsyncApiCallback<ApiResponse<UploadUrlResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UploadUrlResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UploadUrlResponse>() {}, new AsyncApiCallback<ApiResponse<UploadUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UploadUrlResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Activate a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PerformanceProfile> postGamificationProfileActivateAsync(PostGamificationProfileActivateRequest request, final AsyncApiCallback<PerformanceProfile> callback) {
    try {
      final SettableFuture<PerformanceProfile> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Activate a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PerformanceProfile>> postGamificationProfileActivateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PerformanceProfile>> callback) {
    try {
      final SettableFuture<ApiResponse<PerformanceProfile>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deactivate a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PerformanceProfile> postGamificationProfileDeactivateAsync(PostGamificationProfileDeactivateRequest request, final AsyncApiCallback<PerformanceProfile> callback) {
    try {
      final SettableFuture<PerformanceProfile> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deactivate a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PerformanceProfile>> postGamificationProfileDeactivateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PerformanceProfile>> callback) {
    try {
      final SettableFuture<ApiResponse<PerformanceProfile>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Assign members to a given performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Assignment> postGamificationProfileMembersAsync(PostGamificationProfileMembersRequest request, final AsyncApiCallback<Assignment> callback) {
    try {
      final SettableFuture<Assignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Assignment>() {}, new AsyncApiCallback<ApiResponse<Assignment>>() {
        @Override
        public void onCompleted(ApiResponse<Assignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Assign members to a given performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Assignment>> postGamificationProfileMembersAsync(ApiRequest<AssignUsers> request, final AsyncApiCallback<ApiResponse<Assignment>> callback) {
    try {
      final SettableFuture<ApiResponse<Assignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Assignment>() {}, new AsyncApiCallback<ApiResponse<Assignment>>() {
        @Override
        public void onCompleted(ApiResponse<Assignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Assignment> response = (ApiResponse<Assignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Assignment> response = (ApiResponse<Assignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Validate member assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AssignmentValidation> postGamificationProfileMembersValidateAsync(PostGamificationProfileMembersValidateRequest request, final AsyncApiCallback<AssignmentValidation> callback) {
    try {
      final SettableFuture<AssignmentValidation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AssignmentValidation>() {}, new AsyncApiCallback<ApiResponse<AssignmentValidation>>() {
        @Override
        public void onCompleted(ApiResponse<AssignmentValidation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Validate member assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AssignmentValidation>> postGamificationProfileMembersValidateAsync(ApiRequest<ValidateAssignUsers> request, final AsyncApiCallback<ApiResponse<AssignmentValidation>> callback) {
    try {
      final SettableFuture<ApiResponse<AssignmentValidation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AssignmentValidation>() {}, new AsyncApiCallback<ApiResponse<AssignmentValidation>>() {
        @Override
        public void onCompleted(ApiResponse<AssignmentValidation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AssignmentValidation> response = (ApiResponse<AssignmentValidation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AssignmentValidation> response = (ApiResponse<AssignmentValidation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a linked metric
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Metric> postGamificationProfileMetricLinkAsync(PostGamificationProfileMetricLinkRequest request, final AsyncApiCallback<Metric> callback) {
    try {
      final SettableFuture<Metric> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a linked metric
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Metric>> postGamificationProfileMetricLinkAsync(ApiRequest<TargetPerformanceProfile> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
    try {
      final SettableFuture<ApiResponse<Metric>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective under in a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Metric> postGamificationProfileMetricsAsync(PostGamificationProfileMetricsRequest request, final AsyncApiCallback<Metric> callback) {
    try {
      final SettableFuture<Metric> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a gamified metric with a given metric definition and metric objective under in a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Metric>> postGamificationProfileMetricsAsync(ApiRequest<CreateMetric> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
    try {
      final SettableFuture<ApiResponse<Metric>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new custom performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PerformanceProfile> postGamificationProfilesAsync(PostGamificationProfilesRequest request, final AsyncApiCallback<PerformanceProfile> callback) {
    try {
      final SettableFuture<PerformanceProfile> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new custom performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PerformanceProfile>> postGamificationProfilesAsync(ApiRequest<CreatePerformanceProfile> request, final AsyncApiCallback<ApiResponse<PerformanceProfile>> callback) {
    try {
      final SettableFuture<ApiResponse<PerformanceProfile>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query performance profiles in date range for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserProfilesInDateRange> postGamificationProfilesUserQueryAsync(PostGamificationProfilesUserQueryRequest request, final AsyncApiCallback<UserProfilesInDateRange> callback) {
    try {
      final SettableFuture<UserProfilesInDateRange> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserProfilesInDateRange>() {}, new AsyncApiCallback<ApiResponse<UserProfilesInDateRange>>() {
        @Override
        public void onCompleted(ApiResponse<UserProfilesInDateRange> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query performance profiles in date range for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserProfilesInDateRange>> postGamificationProfilesUserQueryAsync(ApiRequest<UserProfilesInDateRangeRequest> request, final AsyncApiCallback<ApiResponse<UserProfilesInDateRange>> callback) {
    try {
      final SettableFuture<ApiResponse<UserProfilesInDateRange>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserProfilesInDateRange>() {}, new AsyncApiCallback<ApiResponse<UserProfilesInDateRange>>() {
        @Override
        public void onCompleted(ApiResponse<UserProfilesInDateRange> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query performance profiles in date range for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserProfilesInDateRange> postGamificationProfilesUsersMeQueryAsync(PostGamificationProfilesUsersMeQueryRequest request, final AsyncApiCallback<UserProfilesInDateRange> callback) {
    try {
      final SettableFuture<UserProfilesInDateRange> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserProfilesInDateRange>() {}, new AsyncApiCallback<ApiResponse<UserProfilesInDateRange>>() {
        @Override
        public void onCompleted(ApiResponse<UserProfilesInDateRange> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query performance profiles in date range for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserProfilesInDateRange>> postGamificationProfilesUsersMeQueryAsync(ApiRequest<UserProfilesInDateRangeRequest> request, final AsyncApiCallback<ApiResponse<UserProfilesInDateRange>> callback) {
    try {
      final SettableFuture<ApiResponse<UserProfilesInDateRange>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserProfilesInDateRange>() {}, new AsyncApiCallback<ApiResponse<UserProfilesInDateRange>>() {
        @Override
        public void onCompleted(ApiResponse<UserProfilesInDateRange> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserProfilesInDateRange> response = (ApiResponse<UserProfilesInDateRange>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContestsResponse> putGamificationContestAsync(PutGamificationContestRequest request, final AsyncApiCallback<ContestsResponse> callback) {
    try {
      final SettableFuture<ContestsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Contest by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContestsResponse>> putGamificationContestAsync(ApiRequest<ContestsCreateRequest> request, final AsyncApiCallback<ApiResponse<ContestsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContestsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContestsResponse>() {}, new AsyncApiCallback<ApiResponse<ContestsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContestsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContestsResponse> response = (ApiResponse<ContestsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PerformanceProfile> putGamificationProfileAsync(PutGamificationProfileRequest request, final AsyncApiCallback<PerformanceProfile> callback) {
    try {
      final SettableFuture<PerformanceProfile> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PerformanceProfile>> putGamificationProfileAsync(ApiRequest<PerformanceProfile> request, final AsyncApiCallback<ApiResponse<PerformanceProfile>> callback) {
    try {
      final SettableFuture<ApiResponse<PerformanceProfile>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PerformanceProfile>() {}, new AsyncApiCallback<ApiResponse<PerformanceProfile>>() {
        @Override
        public void onCompleted(ApiResponse<PerformanceProfile> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PerformanceProfile> response = (ApiResponse<PerformanceProfile>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a metric in performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Metric> putGamificationProfileMetricAsync(PutGamificationProfileMetricRequest request, final AsyncApiCallback<Metric> callback) {
    try {
      final SettableFuture<Metric> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a metric in performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Metric>> putGamificationProfileMetricAsync(ApiRequest<CreateMetric> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
    try {
      final SettableFuture<ApiResponse<Metric>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Metric>() {}, new AsyncApiCallback<ApiResponse<Metric>>() {
        @Override
        public void onCompleted(ApiResponse<Metric> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Metric> response = (ApiResponse<Metric>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update gamification activation status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GamificationStatus> putGamificationStatusAsync(PutGamificationStatusRequest request, final AsyncApiCallback<GamificationStatus> callback) {
    try {
      final SettableFuture<GamificationStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GamificationStatus>() {}, new AsyncApiCallback<ApiResponse<GamificationStatus>>() {
        @Override
        public void onCompleted(ApiResponse<GamificationStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update gamification activation status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GamificationStatus>> putGamificationStatusAsync(ApiRequest<GamificationStatus> request, final AsyncApiCallback<ApiResponse<GamificationStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<GamificationStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GamificationStatus>() {}, new AsyncApiCallback<ApiResponse<GamificationStatus>>() {
        @Override
        public void onCompleted(ApiResponse<GamificationStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GamificationStatus> response = (ApiResponse<GamificationStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }


  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
