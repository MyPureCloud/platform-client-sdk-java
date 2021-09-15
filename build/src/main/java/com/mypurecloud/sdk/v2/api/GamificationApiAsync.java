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
   * Leaderboard of the requesting user&#39;s division or performance profile
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
   * Leaderboard of the requesting user&#39;s division or performance profile
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
   * Best Points of the requesting user&#39;s current performance profile or division
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
   * Best Points of the requesting user&#39;s current performance profile or division
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
   * Gamified metric by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Metric> getGamificationMetricAsync(GetGamificationMetricRequest request, final AsyncApiCallback<Metric> callback) {
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
   * Gamified metric by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Metric>> getGamificationMetricAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
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
   * All gamified metrics for a given profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetMetricsResponse> getGamificationMetricsAsync(GetGamificationMetricsRequest request, final AsyncApiCallback<GetMetricsResponse> callback) {
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
   * All gamified metrics for a given profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetMetricsResponse>> getGamificationMetricsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetMetricsResponse>> callback) {
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
   * Average points of the requesting user&#39;s division or performance profile
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
   * Average points of the requesting user&#39;s division or performance profile
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
   * Average values of the requesting user&#39;s division or performance profile
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
   * Average values of the requesting user&#39;s division or performance profile
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
   * Creates a gamified metric with a given metric definition and metric objective
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Metric> postGamificationMetricsAsync(PostGamificationMetricsRequest request, final AsyncApiCallback<Metric> callback) {
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
   * Creates a gamified metric with a given metric definition and metric objective
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Metric>> postGamificationMetricsAsync(ApiRequest<Metric> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
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
  public Future<ApiResponse<Metric>> postGamificationProfileMetricsAsync(ApiRequest<Metric> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
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
  public Future<GetProfilesResponse> postGamificationProfilesAsync(PostGamificationProfilesRequest request, final AsyncApiCallback<GetProfilesResponse> callback) {
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
   * Create a new custom performance profile
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetProfilesResponse>> postGamificationProfilesAsync(ApiRequest<CreatePerformanceProfile> request, final AsyncApiCallback<ApiResponse<GetProfilesResponse>> callback) {
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
   * Updates a metric
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Metric> putGamificationMetricAsync(PutGamificationMetricRequest request, final AsyncApiCallback<Metric> callback) {
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
   * Updates a metric
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Metric>> putGamificationMetricAsync(ApiRequest<Metric> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
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
  public Future<ApiResponse<Metric>> putGamificationProfileMetricAsync(ApiRequest<Metric> request, final AsyncApiCallback<ApiResponse<Metric>> callback) {
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
