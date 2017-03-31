package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.HeartBeatAlert;
import com.mypurecloud.sdk.v2.model.HeartBeatAlertContainer;
import com.mypurecloud.sdk.v2.model.HeartBeatRule;
import com.mypurecloud.sdk.v2.model.HeartBeatRuleContainer;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlert;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.v2.model.UnreadMetric;
import com.mypurecloud.sdk.v2.model.InteractionStatsRule;
import com.mypurecloud.sdk.v2.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlert;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlertContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusRule;
import com.mypurecloud.sdk.v2.model.RoutingStatusRuleContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceAlert;
import com.mypurecloud.sdk.v2.model.UserPresenceAlertContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceRule;
import com.mypurecloud.sdk.v2.model.UserPresenceRuleContainer;
import com.mypurecloud.sdk.v2.model.UnreadStatus;


import com.mypurecloud.sdk.v2.api.request.DeleteAlertingHeartbeatAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingHeartbeatRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingInteractionstatsAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingInteractionstatsRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingRoutingstatusAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingRoutingstatusRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingUserpresenceAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingUserpresenceRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsAlertsUnreadRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingHeartbeatRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingInteractionstatsRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRoutingstatusRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingUserpresenceRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingHeartbeatRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingInteractionstatsAlertRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingInteractionstatsRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingRoutingstatusRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingUserpresenceRuleRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class AlertingApiAsync {
  private final ApiClient pcapiClient;

  public AlertingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingHeartbeatAlertAsync(DeleteAlertingHeartbeatAlertRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingHeartbeatAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingHeartbeatRuleAsync(DeleteAlertingHeartbeatRuleRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingHeartbeatRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingInteractionstatsAlertAsync(DeleteAlertingInteractionstatsAlertRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingInteractionstatsAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingInteractionstatsRuleAsync(DeleteAlertingInteractionstatsRuleRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingInteractionstatsRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingRoutingstatusAlertAsync(DeleteAlertingRoutingstatusAlertRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingRoutingstatusAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingRoutingstatusRuleAsync(DeleteAlertingRoutingstatusRuleRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingRoutingstatusRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingUserpresenceAlertAsync(DeleteAlertingUserpresenceAlertRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingUserpresenceAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAlertingUserpresenceRuleAsync(DeleteAlertingUserpresenceRuleRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAlertingUserpresenceRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<HeartBeatAlert> getAlertingHeartbeatAlertAsync(GetAlertingHeartbeatAlertRequest request, AsyncApiCallback<HeartBeatAlert> callback) {
    return pcapiClient.<HeartBeatAlert>invokeAPIAsync(request.withHttpInfo(), new TypeReference<HeartBeatAlert>() {}, callback);
  }

  /**
   * Get a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<HeartBeatAlert>> getAlertingHeartbeatAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatAlert>> callback) {
    return pcapiClient.<HeartBeatAlert>invokeAPIVerboseAsync(request, new TypeReference<HeartBeatAlert>() {}, callback);
  }

  /**
   * Get heart beat alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<HeartBeatAlertContainer> getAlertingHeartbeatAlertsAsync(GetAlertingHeartbeatAlertsRequest request, AsyncApiCallback<HeartBeatAlertContainer> callback) {
    return pcapiClient.<HeartBeatAlertContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<HeartBeatAlertContainer>() {}, callback);
  }

  /**
   * Get heart beat alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<HeartBeatAlertContainer>> getAlertingHeartbeatAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatAlertContainer>> callback) {
    return pcapiClient.<HeartBeatAlertContainer>invokeAPIVerboseAsync(request, new TypeReference<HeartBeatAlertContainer>() {}, callback);
  }

  /**
   * Get a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<HeartBeatRule> getAlertingHeartbeatRuleAsync(GetAlertingHeartbeatRuleRequest request, AsyncApiCallback<HeartBeatRule> callback) {
    return pcapiClient.<HeartBeatRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {}, callback);
  }

  /**
   * Get a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<HeartBeatRule>> getAlertingHeartbeatRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatRule>> callback) {
    return pcapiClient.<HeartBeatRule>invokeAPIVerboseAsync(request, new TypeReference<HeartBeatRule>() {}, callback);
  }

  /**
   * Get a heart beat rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<HeartBeatRuleContainer> getAlertingHeartbeatRulesAsync(GetAlertingHeartbeatRulesRequest request, AsyncApiCallback<HeartBeatRuleContainer> callback) {
    return pcapiClient.<HeartBeatRuleContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<HeartBeatRuleContainer>() {}, callback);
  }

  /**
   * Get a heart beat rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<HeartBeatRuleContainer>> getAlertingHeartbeatRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatRuleContainer>> callback) {
    return pcapiClient.<HeartBeatRuleContainer>invokeAPIVerboseAsync(request, new TypeReference<HeartBeatRuleContainer>() {}, callback);
  }

  /**
   * Get an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InteractionStatsAlert> getAlertingInteractionstatsAlertAsync(GetAlertingInteractionstatsAlertRequest request, AsyncApiCallback<InteractionStatsAlert> callback) {
    return pcapiClient.<InteractionStatsAlert>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InteractionStatsAlert>() {}, callback);
  }

  /**
   * Get an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InteractionStatsAlert>> getAlertingInteractionstatsAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsAlert>> callback) {
    return pcapiClient.<InteractionStatsAlert>invokeAPIVerboseAsync(request, new TypeReference<InteractionStatsAlert>() {}, callback);
  }

  /**
   * Get interaction stats alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InteractionStatsAlertContainer> getAlertingInteractionstatsAlertsAsync(GetAlertingInteractionstatsAlertsRequest request, AsyncApiCallback<InteractionStatsAlertContainer> callback) {
    return pcapiClient.<InteractionStatsAlertContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InteractionStatsAlertContainer>() {}, callback);
  }

  /**
   * Get interaction stats alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InteractionStatsAlertContainer>> getAlertingInteractionstatsAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsAlertContainer>> callback) {
    return pcapiClient.<InteractionStatsAlertContainer>invokeAPIVerboseAsync(request, new TypeReference<InteractionStatsAlertContainer>() {}, callback);
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UnreadMetric> getAlertingInteractionstatsAlertsUnreadAsync(GetAlertingInteractionstatsAlertsUnreadRequest request, AsyncApiCallback<UnreadMetric> callback) {
    return pcapiClient.<UnreadMetric>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UnreadMetric>() {}, callback);
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UnreadMetric>> getAlertingInteractionstatsAlertsUnreadAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UnreadMetric>> callback) {
    return pcapiClient.<UnreadMetric>invokeAPIVerboseAsync(request, new TypeReference<UnreadMetric>() {}, callback);
  }

  /**
   * Get an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InteractionStatsRule> getAlertingInteractionstatsRuleAsync(GetAlertingInteractionstatsRuleRequest request, AsyncApiCallback<InteractionStatsRule> callback) {
    return pcapiClient.<InteractionStatsRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {}, callback);
  }

  /**
   * Get an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InteractionStatsRule>> getAlertingInteractionstatsRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsRule>> callback) {
    return pcapiClient.<InteractionStatsRule>invokeAPIVerboseAsync(request, new TypeReference<InteractionStatsRule>() {}, callback);
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InteractionStatsRuleContainer> getAlertingInteractionstatsRulesAsync(GetAlertingInteractionstatsRulesRequest request, AsyncApiCallback<InteractionStatsRuleContainer> callback) {
    return pcapiClient.<InteractionStatsRuleContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRuleContainer>() {}, callback);
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InteractionStatsRuleContainer>> getAlertingInteractionstatsRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsRuleContainer>> callback) {
    return pcapiClient.<InteractionStatsRuleContainer>invokeAPIVerboseAsync(request, new TypeReference<InteractionStatsRuleContainer>() {}, callback);
  }

  /**
   * Get a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatusAlert> getAlertingRoutingstatusAlertAsync(GetAlertingRoutingstatusAlertRequest request, AsyncApiCallback<RoutingStatusAlert> callback) {
    return pcapiClient.<RoutingStatusAlert>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatusAlert>() {}, callback);
  }

  /**
   * Get a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatusAlert>> getAlertingRoutingstatusAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusAlert>> callback) {
    return pcapiClient.<RoutingStatusAlert>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatusAlert>() {}, callback);
  }

  /**
   * Get routing status alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatusAlertContainer> getAlertingRoutingstatusAlertsAsync(GetAlertingRoutingstatusAlertsRequest request, AsyncApiCallback<RoutingStatusAlertContainer> callback) {
    return pcapiClient.<RoutingStatusAlertContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatusAlertContainer>() {}, callback);
  }

  /**
   * Get routing status alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatusAlertContainer>> getAlertingRoutingstatusAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusAlertContainer>> callback) {
    return pcapiClient.<RoutingStatusAlertContainer>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatusAlertContainer>() {}, callback);
  }

  /**
   * Get a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatusRule> getAlertingRoutingstatusRuleAsync(GetAlertingRoutingstatusRuleRequest request, AsyncApiCallback<RoutingStatusRule> callback) {
    return pcapiClient.<RoutingStatusRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {}, callback);
  }

  /**
   * Get a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatusRule>> getAlertingRoutingstatusRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusRule>> callback) {
    return pcapiClient.<RoutingStatusRule>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatusRule>() {}, callback);
  }

  /**
   * Get a routing status rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatusRuleContainer> getAlertingRoutingstatusRulesAsync(GetAlertingRoutingstatusRulesRequest request, AsyncApiCallback<RoutingStatusRuleContainer> callback) {
    return pcapiClient.<RoutingStatusRuleContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRuleContainer>() {}, callback);
  }

  /**
   * Get a routing status rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatusRuleContainer>> getAlertingRoutingstatusRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusRuleContainer>> callback) {
    return pcapiClient.<RoutingStatusRuleContainer>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatusRuleContainer>() {}, callback);
  }

  /**
   * Get a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresenceAlert> getAlertingUserpresenceAlertAsync(GetAlertingUserpresenceAlertRequest request, AsyncApiCallback<UserPresenceAlert> callback) {
    return pcapiClient.<UserPresenceAlert>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresenceAlert>() {}, callback);
  }

  /**
   * Get a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresenceAlert>> getAlertingUserpresenceAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceAlert>> callback) {
    return pcapiClient.<UserPresenceAlert>invokeAPIVerboseAsync(request, new TypeReference<UserPresenceAlert>() {}, callback);
  }

  /**
   * Get user presence alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresenceAlertContainer> getAlertingUserpresenceAlertsAsync(GetAlertingUserpresenceAlertsRequest request, AsyncApiCallback<UserPresenceAlertContainer> callback) {
    return pcapiClient.<UserPresenceAlertContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresenceAlertContainer>() {}, callback);
  }

  /**
   * Get user presence alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresenceAlertContainer>> getAlertingUserpresenceAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceAlertContainer>> callback) {
    return pcapiClient.<UserPresenceAlertContainer>invokeAPIVerboseAsync(request, new TypeReference<UserPresenceAlertContainer>() {}, callback);
  }

  /**
   * Get a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresenceRule> getAlertingUserpresenceRuleAsync(GetAlertingUserpresenceRuleRequest request, AsyncApiCallback<UserPresenceRule> callback) {
    return pcapiClient.<UserPresenceRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {}, callback);
  }

  /**
   * Get a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresenceRule>> getAlertingUserpresenceRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceRule>> callback) {
    return pcapiClient.<UserPresenceRule>invokeAPIVerboseAsync(request, new TypeReference<UserPresenceRule>() {}, callback);
  }

  /**
   * Get a user presence rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresenceRuleContainer> getAlertingUserpresenceRulesAsync(GetAlertingUserpresenceRulesRequest request, AsyncApiCallback<UserPresenceRuleContainer> callback) {
    return pcapiClient.<UserPresenceRuleContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresenceRuleContainer>() {}, callback);
  }

  /**
   * Get a user presence rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresenceRuleContainer>> getAlertingUserpresenceRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceRuleContainer>> callback) {
    return pcapiClient.<UserPresenceRuleContainer>invokeAPIVerboseAsync(request, new TypeReference<UserPresenceRuleContainer>() {}, callback);
  }

  /**
   * Create a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<HeartBeatRule> postAlertingHeartbeatRulesAsync(PostAlertingHeartbeatRulesRequest request, AsyncApiCallback<HeartBeatRule> callback) {
    return pcapiClient.<HeartBeatRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {}, callback);
  }

  /**
   * Create a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<HeartBeatRule>> postAlertingHeartbeatRulesAsync(ApiRequest<HeartBeatRule> request, AsyncApiCallback<ApiResponse<HeartBeatRule>> callback) {
    return pcapiClient.<HeartBeatRule>invokeAPIVerboseAsync(request, new TypeReference<HeartBeatRule>() {}, callback);
  }

  /**
   * Create an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InteractionStatsRule> postAlertingInteractionstatsRulesAsync(PostAlertingInteractionstatsRulesRequest request, AsyncApiCallback<InteractionStatsRule> callback) {
    return pcapiClient.<InteractionStatsRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {}, callback);
  }

  /**
   * Create an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InteractionStatsRule>> postAlertingInteractionstatsRulesAsync(ApiRequest<InteractionStatsRule> request, AsyncApiCallback<ApiResponse<InteractionStatsRule>> callback) {
    return pcapiClient.<InteractionStatsRule>invokeAPIVerboseAsync(request, new TypeReference<InteractionStatsRule>() {}, callback);
  }

  /**
   * Create a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatusRule> postAlertingRoutingstatusRulesAsync(PostAlertingRoutingstatusRulesRequest request, AsyncApiCallback<RoutingStatusRule> callback) {
    return pcapiClient.<RoutingStatusRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {}, callback);
  }

  /**
   * Create a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatusRule>> postAlertingRoutingstatusRulesAsync(ApiRequest<RoutingStatusRule> request, AsyncApiCallback<ApiResponse<RoutingStatusRule>> callback) {
    return pcapiClient.<RoutingStatusRule>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatusRule>() {}, callback);
  }

  /**
   * Create a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresenceRule> postAlertingUserpresenceRulesAsync(PostAlertingUserpresenceRulesRequest request, AsyncApiCallback<UserPresenceRule> callback) {
    return pcapiClient.<UserPresenceRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {}, callback);
  }

  /**
   * Create a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresenceRule>> postAlertingUserpresenceRulesAsync(ApiRequest<UserPresenceRule> request, AsyncApiCallback<ApiResponse<UserPresenceRule>> callback) {
    return pcapiClient.<UserPresenceRule>invokeAPIVerboseAsync(request, new TypeReference<UserPresenceRule>() {}, callback);
  }

  /**
   * Update a heart beat rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<HeartBeatRule> putAlertingHeartbeatRuleAsync(PutAlertingHeartbeatRuleRequest request, AsyncApiCallback<HeartBeatRule> callback) {
    return pcapiClient.<HeartBeatRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {}, callback);
  }

  /**
   * Update a heart beat rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<HeartBeatRule>> putAlertingHeartbeatRuleAsync(ApiRequest<HeartBeatRule> request, AsyncApiCallback<ApiResponse<HeartBeatRule>> callback) {
    return pcapiClient.<HeartBeatRule>invokeAPIVerboseAsync(request, new TypeReference<HeartBeatRule>() {}, callback);
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UnreadStatus> putAlertingInteractionstatsAlertAsync(PutAlertingInteractionstatsAlertRequest request, AsyncApiCallback<UnreadStatus> callback) {
    return pcapiClient.<UnreadStatus>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UnreadStatus>() {}, callback);
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UnreadStatus>> putAlertingInteractionstatsAlertAsync(ApiRequest<UnreadStatus> request, AsyncApiCallback<ApiResponse<UnreadStatus>> callback) {
    return pcapiClient.<UnreadStatus>invokeAPIVerboseAsync(request, new TypeReference<UnreadStatus>() {}, callback);
  }

  /**
   * Update an interaction stats rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InteractionStatsRule> putAlertingInteractionstatsRuleAsync(PutAlertingInteractionstatsRuleRequest request, AsyncApiCallback<InteractionStatsRule> callback) {
    return pcapiClient.<InteractionStatsRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {}, callback);
  }

  /**
   * Update an interaction stats rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InteractionStatsRule>> putAlertingInteractionstatsRuleAsync(ApiRequest<InteractionStatsRule> request, AsyncApiCallback<ApiResponse<InteractionStatsRule>> callback) {
    return pcapiClient.<InteractionStatsRule>invokeAPIVerboseAsync(request, new TypeReference<InteractionStatsRule>() {}, callback);
  }

  /**
   * Update a routing status rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatusRule> putAlertingRoutingstatusRuleAsync(PutAlertingRoutingstatusRuleRequest request, AsyncApiCallback<RoutingStatusRule> callback) {
    return pcapiClient.<RoutingStatusRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {}, callback);
  }

  /**
   * Update a routing status rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatusRule>> putAlertingRoutingstatusRuleAsync(ApiRequest<RoutingStatusRule> request, AsyncApiCallback<ApiResponse<RoutingStatusRule>> callback) {
    return pcapiClient.<RoutingStatusRule>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatusRule>() {}, callback);
  }

  /**
   * Update a user presence rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserPresenceRule> putAlertingUserpresenceRuleAsync(PutAlertingUserpresenceRuleRequest request, AsyncApiCallback<UserPresenceRule> callback) {
    return pcapiClient.<UserPresenceRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {}, callback);
  }

  /**
   * Update a user presence rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserPresenceRule>> putAlertingUserpresenceRuleAsync(ApiRequest<UserPresenceRule> request, AsyncApiCallback<ApiResponse<UserPresenceRule>> callback) {
    return pcapiClient.<UserPresenceRule>invokeAPIVerboseAsync(request, new TypeReference<UserPresenceRule>() {}, callback);
  }

}
