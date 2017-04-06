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


public class AlertingApi {
  private final ApiClient pcapiClient;

  public AlertingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a heart beat alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingHeartbeatAlert(String alertId) throws IOException, ApiException {
     deleteAlertingHeartbeatAlert(createDeleteAlertingHeartbeatAlertRequest(alertId));
  }

  /**
   * Delete a heart beat alert
   * 
   * @param alertId Alert ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingHeartbeatAlertWithHttpInfo(String alertId) throws IOException {
    return deleteAlertingHeartbeatAlert(createDeleteAlertingHeartbeatAlertRequest(alertId).withHttpInfo());
  }

  private DeleteAlertingHeartbeatAlertRequest createDeleteAlertingHeartbeatAlertRequest(String alertId) {
    return DeleteAlertingHeartbeatAlertRequest.builder()
            .withAlertId(alertId)
            .build();
  }

  /**
   * Delete a heart beat alert
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingHeartbeatAlert(DeleteAlertingHeartbeatAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a heart beat alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingHeartbeatAlert(ApiRequest<Void> request) throws IOException {
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
   * Delete a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingHeartbeatRule(String ruleId) throws IOException, ApiException {
     deleteAlertingHeartbeatRule(createDeleteAlertingHeartbeatRuleRequest(ruleId));
  }

  /**
   * Delete a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingHeartbeatRuleWithHttpInfo(String ruleId) throws IOException {
    return deleteAlertingHeartbeatRule(createDeleteAlertingHeartbeatRuleRequest(ruleId).withHttpInfo());
  }

  private DeleteAlertingHeartbeatRuleRequest createDeleteAlertingHeartbeatRuleRequest(String ruleId) {
    return DeleteAlertingHeartbeatRuleRequest.builder()
            .withRuleId(ruleId)
            .build();
  }

  /**
   * Delete a heart beat rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingHeartbeatRule(DeleteAlertingHeartbeatRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a heart beat rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingHeartbeatRule(ApiRequest<Void> request) throws IOException {
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
   * Delete an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingInteractionstatsAlert(String alertId) throws IOException, ApiException {
     deleteAlertingInteractionstatsAlert(createDeleteAlertingInteractionstatsAlertRequest(alertId));
  }

  /**
   * Delete an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsAlertWithHttpInfo(String alertId) throws IOException {
    return deleteAlertingInteractionstatsAlert(createDeleteAlertingInteractionstatsAlertRequest(alertId).withHttpInfo());
  }

  private DeleteAlertingInteractionstatsAlertRequest createDeleteAlertingInteractionstatsAlertRequest(String alertId) {
    return DeleteAlertingInteractionstatsAlertRequest.builder()
            .withAlertId(alertId)
            .build();
  }

  /**
   * Delete an interaction stats alert
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingInteractionstatsAlert(DeleteAlertingInteractionstatsAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an interaction stats alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsAlert(ApiRequest<Void> request) throws IOException {
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
   * Delete an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingInteractionstatsRule(String ruleId) throws IOException, ApiException {
     deleteAlertingInteractionstatsRule(createDeleteAlertingInteractionstatsRuleRequest(ruleId));
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsRuleWithHttpInfo(String ruleId) throws IOException {
    return deleteAlertingInteractionstatsRule(createDeleteAlertingInteractionstatsRuleRequest(ruleId).withHttpInfo());
  }

  private DeleteAlertingInteractionstatsRuleRequest createDeleteAlertingInteractionstatsRuleRequest(String ruleId) {
    return DeleteAlertingInteractionstatsRuleRequest.builder()
            .withRuleId(ruleId)
            .build();
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingInteractionstatsRule(DeleteAlertingInteractionstatsRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsRule(ApiRequest<Void> request) throws IOException {
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
   * Delete a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingRoutingstatusAlert(String alertId) throws IOException, ApiException {
     deleteAlertingRoutingstatusAlert(createDeleteAlertingRoutingstatusAlertRequest(alertId));
  }

  /**
   * Delete a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusAlertWithHttpInfo(String alertId) throws IOException {
    return deleteAlertingRoutingstatusAlert(createDeleteAlertingRoutingstatusAlertRequest(alertId).withHttpInfo());
  }

  private DeleteAlertingRoutingstatusAlertRequest createDeleteAlertingRoutingstatusAlertRequest(String alertId) {
    return DeleteAlertingRoutingstatusAlertRequest.builder()
            .withAlertId(alertId)
            .build();
  }

  /**
   * Delete a routing status alert
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingRoutingstatusAlert(DeleteAlertingRoutingstatusAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a routing status alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusAlert(ApiRequest<Void> request) throws IOException {
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
   * Delete a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingRoutingstatusRule(String ruleId) throws IOException, ApiException {
     deleteAlertingRoutingstatusRule(createDeleteAlertingRoutingstatusRuleRequest(ruleId));
  }

  /**
   * Delete a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusRuleWithHttpInfo(String ruleId) throws IOException {
    return deleteAlertingRoutingstatusRule(createDeleteAlertingRoutingstatusRuleRequest(ruleId).withHttpInfo());
  }

  private DeleteAlertingRoutingstatusRuleRequest createDeleteAlertingRoutingstatusRuleRequest(String ruleId) {
    return DeleteAlertingRoutingstatusRuleRequest.builder()
            .withRuleId(ruleId)
            .build();
  }

  /**
   * Delete a routing status rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingRoutingstatusRule(DeleteAlertingRoutingstatusRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a routing status rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusRule(ApiRequest<Void> request) throws IOException {
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
   * Delete a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingUserpresenceAlert(String alertId) throws IOException, ApiException {
     deleteAlertingUserpresenceAlert(createDeleteAlertingUserpresenceAlertRequest(alertId));
  }

  /**
   * Delete a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingUserpresenceAlertWithHttpInfo(String alertId) throws IOException {
    return deleteAlertingUserpresenceAlert(createDeleteAlertingUserpresenceAlertRequest(alertId).withHttpInfo());
  }

  private DeleteAlertingUserpresenceAlertRequest createDeleteAlertingUserpresenceAlertRequest(String alertId) {
    return DeleteAlertingUserpresenceAlertRequest.builder()
            .withAlertId(alertId)
            .build();
  }

  /**
   * Delete a user presence alert
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingUserpresenceAlert(DeleteAlertingUserpresenceAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a user presence alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingUserpresenceAlert(ApiRequest<Void> request) throws IOException {
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
   * Delete a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingUserpresenceRule(String ruleId) throws IOException, ApiException {
     deleteAlertingUserpresenceRule(createDeleteAlertingUserpresenceRuleRequest(ruleId));
  }

  /**
   * Delete a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingUserpresenceRuleWithHttpInfo(String ruleId) throws IOException {
    return deleteAlertingUserpresenceRule(createDeleteAlertingUserpresenceRuleRequest(ruleId).withHttpInfo());
  }

  private DeleteAlertingUserpresenceRuleRequest createDeleteAlertingUserpresenceRuleRequest(String ruleId) {
    return DeleteAlertingUserpresenceRuleRequest.builder()
            .withRuleId(ruleId)
            .build();
  }

  /**
   * Delete a user presence rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingUserpresenceRule(DeleteAlertingUserpresenceRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a user presence rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingUserpresenceRule(ApiRequest<Void> request) throws IOException {
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
   * Get a heart beat alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatAlert getAlertingHeartbeatAlert(String alertId, List<String> expand) throws IOException, ApiException {
    return  getAlertingHeartbeatAlert(createGetAlertingHeartbeatAlertRequest(alertId, expand));
  }

  /**
   * Get a heart beat alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlert
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatAlert> getAlertingHeartbeatAlertWithHttpInfo(String alertId, List<String> expand) throws IOException {
    return getAlertingHeartbeatAlert(createGetAlertingHeartbeatAlertRequest(alertId, expand).withHttpInfo());
  }

  private GetAlertingHeartbeatAlertRequest createGetAlertingHeartbeatAlertRequest(String alertId, List<String> expand) {
    return GetAlertingHeartbeatAlertRequest.builder()
            .withAlertId(alertId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get a heart beat alert
   * 
   * @param request The request object
   * @return HeartBeatAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatAlert getAlertingHeartbeatAlert(GetAlertingHeartbeatAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HeartBeatAlert> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HeartBeatAlert>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a heart beat alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatAlert> getAlertingHeartbeatAlert(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HeartBeatAlert>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HeartBeatAlert> response = (ApiResponse<HeartBeatAlert>)(ApiResponse<?>)exception;
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
      ApiResponse<HeartBeatAlert> response = (ApiResponse<HeartBeatAlert>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get heart beat alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatAlertContainer getAlertingHeartbeatAlerts(List<String> expand) throws IOException, ApiException {
    return  getAlertingHeartbeatAlerts(createGetAlertingHeartbeatAlertsRequest(expand));
  }

  /**
   * Get heart beat alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlertContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatAlertContainer> getAlertingHeartbeatAlertsWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingHeartbeatAlerts(createGetAlertingHeartbeatAlertsRequest(expand).withHttpInfo());
  }

  private GetAlertingHeartbeatAlertsRequest createGetAlertingHeartbeatAlertsRequest(List<String> expand) {
    return GetAlertingHeartbeatAlertsRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get heart beat alert list.
   * 
   * @param request The request object
   * @return HeartBeatAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatAlertContainer getAlertingHeartbeatAlerts(GetAlertingHeartbeatAlertsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HeartBeatAlertContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HeartBeatAlertContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get heart beat alert list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatAlertContainer> getAlertingHeartbeatAlerts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HeartBeatAlertContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HeartBeatAlertContainer> response = (ApiResponse<HeartBeatAlertContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<HeartBeatAlertContainer> response = (ApiResponse<HeartBeatAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRule getAlertingHeartbeatRule(String ruleId, List<String> expand) throws IOException, ApiException {
    return  getAlertingHeartbeatRule(createGetAlertingHeartbeatRuleRequest(ruleId, expand));
  }

  /**
   * Get a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRule> getAlertingHeartbeatRuleWithHttpInfo(String ruleId, List<String> expand) throws IOException {
    return getAlertingHeartbeatRule(createGetAlertingHeartbeatRuleRequest(ruleId, expand).withHttpInfo());
  }

  private GetAlertingHeartbeatRuleRequest createGetAlertingHeartbeatRuleRequest(String ruleId, List<String> expand) {
    return GetAlertingHeartbeatRuleRequest.builder()
            .withRuleId(ruleId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get a heart beat rule.
   * 
   * @param request The request object
   * @return HeartBeatRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRule getAlertingHeartbeatRule(GetAlertingHeartbeatRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HeartBeatRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a heart beat rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRule> getAlertingHeartbeatRule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HeartBeatRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)exception;
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
      ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a heart beat rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRuleContainer getAlertingHeartbeatRules(List<String> expand) throws IOException, ApiException {
    return  getAlertingHeartbeatRules(createGetAlertingHeartbeatRulesRequest(expand));
  }

  /**
   * Get a heart beat rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRuleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRuleContainer> getAlertingHeartbeatRulesWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingHeartbeatRules(createGetAlertingHeartbeatRulesRequest(expand).withHttpInfo());
  }

  private GetAlertingHeartbeatRulesRequest createGetAlertingHeartbeatRulesRequest(List<String> expand) {
    return GetAlertingHeartbeatRulesRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get a heart beat rule list.
   * 
   * @param request The request object
   * @return HeartBeatRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRuleContainer getAlertingHeartbeatRules(GetAlertingHeartbeatRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HeartBeatRuleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HeartBeatRuleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a heart beat rule list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRuleContainer> getAlertingHeartbeatRules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HeartBeatRuleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HeartBeatRuleContainer> response = (ApiResponse<HeartBeatRuleContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<HeartBeatRuleContainer> response = (ApiResponse<HeartBeatRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsAlert getAlertingInteractionstatsAlert(String alertId, List<String> expand) throws IOException, ApiException {
    return  getAlertingInteractionstatsAlert(createGetAlertingInteractionstatsAlertRequest(alertId, expand));
  }

  /**
   * Get an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlert
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsAlert> getAlertingInteractionstatsAlertWithHttpInfo(String alertId, List<String> expand) throws IOException {
    return getAlertingInteractionstatsAlert(createGetAlertingInteractionstatsAlertRequest(alertId, expand).withHttpInfo());
  }

  private GetAlertingInteractionstatsAlertRequest createGetAlertingInteractionstatsAlertRequest(String alertId, List<String> expand) {
    return GetAlertingInteractionstatsAlertRequest.builder()
            .withAlertId(alertId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get an interaction stats alert
   * 
   * @param request The request object
   * @return InteractionStatsAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsAlert getAlertingInteractionstatsAlert(GetAlertingInteractionstatsAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InteractionStatsAlert> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InteractionStatsAlert>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an interaction stats alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsAlert> getAlertingInteractionstatsAlert(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InteractionStatsAlert>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InteractionStatsAlert> response = (ApiResponse<InteractionStatsAlert>)(ApiResponse<?>)exception;
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
      ApiResponse<InteractionStatsAlert> response = (ApiResponse<InteractionStatsAlert>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get interaction stats alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsAlertContainer getAlertingInteractionstatsAlerts(List<String> expand) throws IOException, ApiException {
    return  getAlertingInteractionstatsAlerts(createGetAlertingInteractionstatsAlertsRequest(expand));
  }

  /**
   * Get interaction stats alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlertContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsAlertContainer> getAlertingInteractionstatsAlertsWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingInteractionstatsAlerts(createGetAlertingInteractionstatsAlertsRequest(expand).withHttpInfo());
  }

  private GetAlertingInteractionstatsAlertsRequest createGetAlertingInteractionstatsAlertsRequest(List<String> expand) {
    return GetAlertingInteractionstatsAlertsRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get interaction stats alert list.
   * 
   * @param request The request object
   * @return InteractionStatsAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsAlertContainer getAlertingInteractionstatsAlerts(GetAlertingInteractionstatsAlertsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InteractionStatsAlertContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InteractionStatsAlertContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get interaction stats alert list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsAlertContainer> getAlertingInteractionstatsAlerts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InteractionStatsAlertContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InteractionStatsAlertContainer> response = (ApiResponse<InteractionStatsAlertContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<InteractionStatsAlertContainer> response = (ApiResponse<InteractionStatsAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @return UnreadMetric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnreadMetric getAlertingInteractionstatsAlertsUnread() throws IOException, ApiException {
    return  getAlertingInteractionstatsAlertsUnread(createGetAlertingInteractionstatsAlertsUnreadRequest());
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @return UnreadMetric
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnreadMetric> getAlertingInteractionstatsAlertsUnreadWithHttpInfo() throws IOException {
    return getAlertingInteractionstatsAlertsUnread(createGetAlertingInteractionstatsAlertsUnreadRequest().withHttpInfo());
  }

  private GetAlertingInteractionstatsAlertsUnreadRequest createGetAlertingInteractionstatsAlertsUnreadRequest() {
    return GetAlertingInteractionstatsAlertsUnreadRequest.builder()            .build();
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @param request The request object
   * @return UnreadMetric
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnreadMetric getAlertingInteractionstatsAlertsUnread(GetAlertingInteractionstatsAlertsUnreadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UnreadMetric> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UnreadMetric>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnreadMetric> getAlertingInteractionstatsAlertsUnread(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UnreadMetric>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UnreadMetric> response = (ApiResponse<UnreadMetric>)(ApiResponse<?>)exception;
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
      ApiResponse<UnreadMetric> response = (ApiResponse<UnreadMetric>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRule getAlertingInteractionstatsRule(String ruleId, List<String> expand) throws IOException, ApiException {
    return  getAlertingInteractionstatsRule(createGetAlertingInteractionstatsRuleRequest(ruleId, expand));
  }

  /**
   * Get an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRule> getAlertingInteractionstatsRuleWithHttpInfo(String ruleId, List<String> expand) throws IOException {
    return getAlertingInteractionstatsRule(createGetAlertingInteractionstatsRuleRequest(ruleId, expand).withHttpInfo());
  }

  private GetAlertingInteractionstatsRuleRequest createGetAlertingInteractionstatsRuleRequest(String ruleId, List<String> expand) {
    return GetAlertingInteractionstatsRuleRequest.builder()
            .withRuleId(ruleId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get an interaction stats rule.
   * 
   * @param request The request object
   * @return InteractionStatsRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRule getAlertingInteractionstatsRule(GetAlertingInteractionstatsRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InteractionStatsRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an interaction stats rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRule> getAlertingInteractionstatsRule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InteractionStatsRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)exception;
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
      ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRuleContainer getAlertingInteractionstatsRules(List<String> expand) throws IOException, ApiException {
    return  getAlertingInteractionstatsRules(createGetAlertingInteractionstatsRulesRequest(expand));
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRuleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRuleContainer> getAlertingInteractionstatsRulesWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingInteractionstatsRules(createGetAlertingInteractionstatsRulesRequest(expand).withHttpInfo());
  }

  private GetAlertingInteractionstatsRulesRequest createGetAlertingInteractionstatsRulesRequest(List<String> expand) {
    return GetAlertingInteractionstatsRulesRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @param request The request object
   * @return InteractionStatsRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRuleContainer getAlertingInteractionstatsRules(GetAlertingInteractionstatsRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InteractionStatsRuleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InteractionStatsRuleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRuleContainer> getAlertingInteractionstatsRules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InteractionStatsRuleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InteractionStatsRuleContainer> response = (ApiResponse<InteractionStatsRuleContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<InteractionStatsRuleContainer> response = (ApiResponse<InteractionStatsRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusAlert getAlertingRoutingstatusAlert(String alertId, List<String> expand) throws IOException, ApiException {
    return  getAlertingRoutingstatusAlert(createGetAlertingRoutingstatusAlertRequest(alertId, expand));
  }

  /**
   * Get a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlert
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusAlert> getAlertingRoutingstatusAlertWithHttpInfo(String alertId, List<String> expand) throws IOException {
    return getAlertingRoutingstatusAlert(createGetAlertingRoutingstatusAlertRequest(alertId, expand).withHttpInfo());
  }

  private GetAlertingRoutingstatusAlertRequest createGetAlertingRoutingstatusAlertRequest(String alertId, List<String> expand) {
    return GetAlertingRoutingstatusAlertRequest.builder()
            .withAlertId(alertId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get a routing status alert
   * 
   * @param request The request object
   * @return RoutingStatusAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusAlert getAlertingRoutingstatusAlert(GetAlertingRoutingstatusAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatusAlert> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatusAlert>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a routing status alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusAlert> getAlertingRoutingstatusAlert(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatusAlert>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatusAlert> response = (ApiResponse<RoutingStatusAlert>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatusAlert> response = (ApiResponse<RoutingStatusAlert>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get routing status alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusAlertContainer getAlertingRoutingstatusAlerts(List<String> expand) throws IOException, ApiException {
    return  getAlertingRoutingstatusAlerts(createGetAlertingRoutingstatusAlertsRequest(expand));
  }

  /**
   * Get routing status alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlertContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusAlertContainer> getAlertingRoutingstatusAlertsWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingRoutingstatusAlerts(createGetAlertingRoutingstatusAlertsRequest(expand).withHttpInfo());
  }

  private GetAlertingRoutingstatusAlertsRequest createGetAlertingRoutingstatusAlertsRequest(List<String> expand) {
    return GetAlertingRoutingstatusAlertsRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get routing status alert list.
   * 
   * @param request The request object
   * @return RoutingStatusAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusAlertContainer getAlertingRoutingstatusAlerts(GetAlertingRoutingstatusAlertsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatusAlertContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatusAlertContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get routing status alert list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusAlertContainer> getAlertingRoutingstatusAlerts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatusAlertContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatusAlertContainer> response = (ApiResponse<RoutingStatusAlertContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatusAlertContainer> response = (ApiResponse<RoutingStatusAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRule getAlertingRoutingstatusRule(String ruleId, List<String> expand) throws IOException, ApiException {
    return  getAlertingRoutingstatusRule(createGetAlertingRoutingstatusRuleRequest(ruleId, expand));
  }

  /**
   * Get a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRule> getAlertingRoutingstatusRuleWithHttpInfo(String ruleId, List<String> expand) throws IOException {
    return getAlertingRoutingstatusRule(createGetAlertingRoutingstatusRuleRequest(ruleId, expand).withHttpInfo());
  }

  private GetAlertingRoutingstatusRuleRequest createGetAlertingRoutingstatusRuleRequest(String ruleId, List<String> expand) {
    return GetAlertingRoutingstatusRuleRequest.builder()
            .withRuleId(ruleId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get a routing status rule.
   * 
   * @param request The request object
   * @return RoutingStatusRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRule getAlertingRoutingstatusRule(GetAlertingRoutingstatusRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatusRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a routing status rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRule> getAlertingRoutingstatusRule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatusRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a routing status rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRuleContainer getAlertingRoutingstatusRules(List<String> expand) throws IOException, ApiException {
    return  getAlertingRoutingstatusRules(createGetAlertingRoutingstatusRulesRequest(expand));
  }

  /**
   * Get a routing status rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRuleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRuleContainer> getAlertingRoutingstatusRulesWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingRoutingstatusRules(createGetAlertingRoutingstatusRulesRequest(expand).withHttpInfo());
  }

  private GetAlertingRoutingstatusRulesRequest createGetAlertingRoutingstatusRulesRequest(List<String> expand) {
    return GetAlertingRoutingstatusRulesRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get a routing status rule list.
   * 
   * @param request The request object
   * @return RoutingStatusRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRuleContainer getAlertingRoutingstatusRules(GetAlertingRoutingstatusRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatusRuleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatusRuleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a routing status rule list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRuleContainer> getAlertingRoutingstatusRules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatusRuleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatusRuleContainer> response = (ApiResponse<RoutingStatusRuleContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatusRuleContainer> response = (ApiResponse<RoutingStatusRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceAlert getAlertingUserpresenceAlert(String alertId, List<String> expand) throws IOException, ApiException {
    return  getAlertingUserpresenceAlert(createGetAlertingUserpresenceAlertRequest(alertId, expand));
  }

  /**
   * Get a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlert
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceAlert> getAlertingUserpresenceAlertWithHttpInfo(String alertId, List<String> expand) throws IOException {
    return getAlertingUserpresenceAlert(createGetAlertingUserpresenceAlertRequest(alertId, expand).withHttpInfo());
  }

  private GetAlertingUserpresenceAlertRequest createGetAlertingUserpresenceAlertRequest(String alertId, List<String> expand) {
    return GetAlertingUserpresenceAlertRequest.builder()
            .withAlertId(alertId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get a user presence alert
   * 
   * @param request The request object
   * @return UserPresenceAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceAlert getAlertingUserpresenceAlert(GetAlertingUserpresenceAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresenceAlert> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresenceAlert>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user presence alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceAlert> getAlertingUserpresenceAlert(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresenceAlert>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresenceAlert> response = (ApiResponse<UserPresenceAlert>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresenceAlert> response = (ApiResponse<UserPresenceAlert>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get user presence alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceAlertContainer getAlertingUserpresenceAlerts(List<String> expand) throws IOException, ApiException {
    return  getAlertingUserpresenceAlerts(createGetAlertingUserpresenceAlertsRequest(expand));
  }

  /**
   * Get user presence alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlertContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceAlertContainer> getAlertingUserpresenceAlertsWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingUserpresenceAlerts(createGetAlertingUserpresenceAlertsRequest(expand).withHttpInfo());
  }

  private GetAlertingUserpresenceAlertsRequest createGetAlertingUserpresenceAlertsRequest(List<String> expand) {
    return GetAlertingUserpresenceAlertsRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get user presence alert list.
   * 
   * @param request The request object
   * @return UserPresenceAlertContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceAlertContainer getAlertingUserpresenceAlerts(GetAlertingUserpresenceAlertsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresenceAlertContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresenceAlertContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get user presence alert list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceAlertContainer> getAlertingUserpresenceAlerts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresenceAlertContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresenceAlertContainer> response = (ApiResponse<UserPresenceAlertContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresenceAlertContainer> response = (ApiResponse<UserPresenceAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRule getAlertingUserpresenceRule(String ruleId, List<String> expand) throws IOException, ApiException {
    return  getAlertingUserpresenceRule(createGetAlertingUserpresenceRuleRequest(ruleId, expand));
  }

  /**
   * Get a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRule> getAlertingUserpresenceRuleWithHttpInfo(String ruleId, List<String> expand) throws IOException {
    return getAlertingUserpresenceRule(createGetAlertingUserpresenceRuleRequest(ruleId, expand).withHttpInfo());
  }

  private GetAlertingUserpresenceRuleRequest createGetAlertingUserpresenceRuleRequest(String ruleId, List<String> expand) {
    return GetAlertingUserpresenceRuleRequest.builder()
            .withRuleId(ruleId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get a user presence rule.
   * 
   * @param request The request object
   * @return UserPresenceRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRule getAlertingUserpresenceRule(GetAlertingUserpresenceRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresenceRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user presence rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRule> getAlertingUserpresenceRule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresenceRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a user presence rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRuleContainer getAlertingUserpresenceRules(List<String> expand) throws IOException, ApiException {
    return  getAlertingUserpresenceRules(createGetAlertingUserpresenceRulesRequest(expand));
  }

  /**
   * Get a user presence rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRuleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRuleContainer> getAlertingUserpresenceRulesWithHttpInfo(List<String> expand) throws IOException {
    return getAlertingUserpresenceRules(createGetAlertingUserpresenceRulesRequest(expand).withHttpInfo());
  }

  private GetAlertingUserpresenceRulesRequest createGetAlertingUserpresenceRulesRequest(List<String> expand) {
    return GetAlertingUserpresenceRulesRequest.builder()
            .withExpand(expand)
            .build();
  }

  /**
   * Get a user presence rule list.
   * 
   * @param request The request object
   * @return UserPresenceRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRuleContainer getAlertingUserpresenceRules(GetAlertingUserpresenceRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresenceRuleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresenceRuleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user presence rule list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRuleContainer> getAlertingUserpresenceRules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresenceRuleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresenceRuleContainer> response = (ApiResponse<UserPresenceRuleContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresenceRuleContainer> response = (ApiResponse<UserPresenceRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a heart beat rule.
   * 
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRule postAlertingHeartbeatRules(HeartBeatRule body, List<String> expand) throws IOException, ApiException {
    return  postAlertingHeartbeatRules(createPostAlertingHeartbeatRulesRequest(body, expand));
  }

  /**
   * Create a heart beat rule.
   * 
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRule> postAlertingHeartbeatRulesWithHttpInfo(HeartBeatRule body, List<String> expand) throws IOException {
    return postAlertingHeartbeatRules(createPostAlertingHeartbeatRulesRequest(body, expand).withHttpInfo());
  }

  private PostAlertingHeartbeatRulesRequest createPostAlertingHeartbeatRulesRequest(HeartBeatRule body, List<String> expand) {
    return PostAlertingHeartbeatRulesRequest.builder()
            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Create a heart beat rule.
   * 
   * @param request The request object
   * @return HeartBeatRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRule postAlertingHeartbeatRules(PostAlertingHeartbeatRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HeartBeatRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a heart beat rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRule> postAlertingHeartbeatRules(ApiRequest<HeartBeatRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HeartBeatRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)exception;
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
      ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an interaction stats rule.
   * 
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRule postAlertingInteractionstatsRules(InteractionStatsRule body, List<String> expand) throws IOException, ApiException {
    return  postAlertingInteractionstatsRules(createPostAlertingInteractionstatsRulesRequest(body, expand));
  }

  /**
   * Create an interaction stats rule.
   * 
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRule> postAlertingInteractionstatsRulesWithHttpInfo(InteractionStatsRule body, List<String> expand) throws IOException {
    return postAlertingInteractionstatsRules(createPostAlertingInteractionstatsRulesRequest(body, expand).withHttpInfo());
  }

  private PostAlertingInteractionstatsRulesRequest createPostAlertingInteractionstatsRulesRequest(InteractionStatsRule body, List<String> expand) {
    return PostAlertingInteractionstatsRulesRequest.builder()
            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Create an interaction stats rule.
   * 
   * @param request The request object
   * @return InteractionStatsRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRule postAlertingInteractionstatsRules(PostAlertingInteractionstatsRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InteractionStatsRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an interaction stats rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRule> postAlertingInteractionstatsRules(ApiRequest<InteractionStatsRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InteractionStatsRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)exception;
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
      ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a routing status rule.
   * 
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRule postAlertingRoutingstatusRules(RoutingStatusRule body, List<String> expand) throws IOException, ApiException {
    return  postAlertingRoutingstatusRules(createPostAlertingRoutingstatusRulesRequest(body, expand));
  }

  /**
   * Create a routing status rule.
   * 
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRule> postAlertingRoutingstatusRulesWithHttpInfo(RoutingStatusRule body, List<String> expand) throws IOException {
    return postAlertingRoutingstatusRules(createPostAlertingRoutingstatusRulesRequest(body, expand).withHttpInfo());
  }

  private PostAlertingRoutingstatusRulesRequest createPostAlertingRoutingstatusRulesRequest(RoutingStatusRule body, List<String> expand) {
    return PostAlertingRoutingstatusRulesRequest.builder()
            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Create a routing status rule.
   * 
   * @param request The request object
   * @return RoutingStatusRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRule postAlertingRoutingstatusRules(PostAlertingRoutingstatusRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatusRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a routing status rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRule> postAlertingRoutingstatusRules(ApiRequest<RoutingStatusRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatusRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a user presence rule.
   * 
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRule postAlertingUserpresenceRules(UserPresenceRule body, List<String> expand) throws IOException, ApiException {
    return  postAlertingUserpresenceRules(createPostAlertingUserpresenceRulesRequest(body, expand));
  }

  /**
   * Create a user presence rule.
   * 
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRule> postAlertingUserpresenceRulesWithHttpInfo(UserPresenceRule body, List<String> expand) throws IOException {
    return postAlertingUserpresenceRules(createPostAlertingUserpresenceRulesRequest(body, expand).withHttpInfo());
  }

  private PostAlertingUserpresenceRulesRequest createPostAlertingUserpresenceRulesRequest(UserPresenceRule body, List<String> expand) {
    return PostAlertingUserpresenceRulesRequest.builder()
            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Create a user presence rule.
   * 
   * @param request The request object
   * @return UserPresenceRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRule postAlertingUserpresenceRules(PostAlertingUserpresenceRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresenceRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a user presence rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRule> postAlertingUserpresenceRules(ApiRequest<UserPresenceRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresenceRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a heart beat rule
   * 
   * @param ruleId Rule ID (required)
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRule putAlertingHeartbeatRule(String ruleId, HeartBeatRule body, List<String> expand) throws IOException, ApiException {
    return  putAlertingHeartbeatRule(createPutAlertingHeartbeatRuleRequest(ruleId, body, expand));
  }

  /**
   * Update a heart beat rule
   * 
   * @param ruleId Rule ID (required)
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRule> putAlertingHeartbeatRuleWithHttpInfo(String ruleId, HeartBeatRule body, List<String> expand) throws IOException {
    return putAlertingHeartbeatRule(createPutAlertingHeartbeatRuleRequest(ruleId, body, expand).withHttpInfo());
  }

  private PutAlertingHeartbeatRuleRequest createPutAlertingHeartbeatRuleRequest(String ruleId, HeartBeatRule body, List<String> expand) {
    return PutAlertingHeartbeatRuleRequest.builder()
            .withRuleId(ruleId)

            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Update a heart beat rule
   * 
   * @param request The request object
   * @return HeartBeatRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HeartBeatRule putAlertingHeartbeatRule(PutAlertingHeartbeatRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HeartBeatRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a heart beat rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HeartBeatRule> putAlertingHeartbeatRule(ApiRequest<HeartBeatRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HeartBeatRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)exception;
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
      ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body InteractionStatsAlert (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UnreadStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnreadStatus putAlertingInteractionstatsAlert(String alertId, UnreadStatus body, List<String> expand) throws IOException, ApiException {
    return  putAlertingInteractionstatsAlert(createPutAlertingInteractionstatsAlertRequest(alertId, body, expand));
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body InteractionStatsAlert (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UnreadStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnreadStatus> putAlertingInteractionstatsAlertWithHttpInfo(String alertId, UnreadStatus body, List<String> expand) throws IOException {
    return putAlertingInteractionstatsAlert(createPutAlertingInteractionstatsAlertRequest(alertId, body, expand).withHttpInfo());
  }

  private PutAlertingInteractionstatsAlertRequest createPutAlertingInteractionstatsAlertRequest(String alertId, UnreadStatus body, List<String> expand) {
    return PutAlertingInteractionstatsAlertRequest.builder()
            .withAlertId(alertId)

            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @param request The request object
   * @return UnreadStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UnreadStatus putAlertingInteractionstatsAlert(PutAlertingInteractionstatsAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UnreadStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UnreadStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UnreadStatus> putAlertingInteractionstatsAlert(ApiRequest<UnreadStatus> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UnreadStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UnreadStatus> response = (ApiResponse<UnreadStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<UnreadStatus> response = (ApiResponse<UnreadStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an interaction stats rule
   * 
   * @param ruleId Rule ID (required)
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRule putAlertingInteractionstatsRule(String ruleId, InteractionStatsRule body, List<String> expand) throws IOException, ApiException {
    return  putAlertingInteractionstatsRule(createPutAlertingInteractionstatsRuleRequest(ruleId, body, expand));
  }

  /**
   * Update an interaction stats rule
   * 
   * @param ruleId Rule ID (required)
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRule> putAlertingInteractionstatsRuleWithHttpInfo(String ruleId, InteractionStatsRule body, List<String> expand) throws IOException {
    return putAlertingInteractionstatsRule(createPutAlertingInteractionstatsRuleRequest(ruleId, body, expand).withHttpInfo());
  }

  private PutAlertingInteractionstatsRuleRequest createPutAlertingInteractionstatsRuleRequest(String ruleId, InteractionStatsRule body, List<String> expand) {
    return PutAlertingInteractionstatsRuleRequest.builder()
            .withRuleId(ruleId)

            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Update an interaction stats rule
   * 
   * @param request The request object
   * @return InteractionStatsRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InteractionStatsRule putAlertingInteractionstatsRule(PutAlertingInteractionstatsRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InteractionStatsRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an interaction stats rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InteractionStatsRule> putAlertingInteractionstatsRule(ApiRequest<InteractionStatsRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InteractionStatsRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)exception;
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
      ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a routing status rule
   * 
   * @param ruleId Rule ID (required)
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRule putAlertingRoutingstatusRule(String ruleId, RoutingStatusRule body, List<String> expand) throws IOException, ApiException {
    return  putAlertingRoutingstatusRule(createPutAlertingRoutingstatusRuleRequest(ruleId, body, expand));
  }

  /**
   * Update a routing status rule
   * 
   * @param ruleId Rule ID (required)
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRule> putAlertingRoutingstatusRuleWithHttpInfo(String ruleId, RoutingStatusRule body, List<String> expand) throws IOException {
    return putAlertingRoutingstatusRule(createPutAlertingRoutingstatusRuleRequest(ruleId, body, expand).withHttpInfo());
  }

  private PutAlertingRoutingstatusRuleRequest createPutAlertingRoutingstatusRuleRequest(String ruleId, RoutingStatusRule body, List<String> expand) {
    return PutAlertingRoutingstatusRuleRequest.builder()
            .withRuleId(ruleId)

            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Update a routing status rule
   * 
   * @param request The request object
   * @return RoutingStatusRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatusRule putAlertingRoutingstatusRule(PutAlertingRoutingstatusRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatusRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a routing status rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatusRule> putAlertingRoutingstatusRule(ApiRequest<RoutingStatusRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatusRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a user presence rule
   * 
   * @param ruleId Rule ID (required)
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRule putAlertingUserpresenceRule(String ruleId, UserPresenceRule body, List<String> expand) throws IOException, ApiException {
    return  putAlertingUserpresenceRule(createPutAlertingUserpresenceRuleRequest(ruleId, body, expand));
  }

  /**
   * Update a user presence rule
   * 
   * @param ruleId Rule ID (required)
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRule> putAlertingUserpresenceRuleWithHttpInfo(String ruleId, UserPresenceRule body, List<String> expand) throws IOException {
    return putAlertingUserpresenceRule(createPutAlertingUserpresenceRuleRequest(ruleId, body, expand).withHttpInfo());
  }

  private PutAlertingUserpresenceRuleRequest createPutAlertingUserpresenceRuleRequest(String ruleId, UserPresenceRule body, List<String> expand) {
    return PutAlertingUserpresenceRuleRequest.builder()
            .withRuleId(ruleId)

            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Update a user presence rule
   * 
   * @param request The request object
   * @return UserPresenceRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserPresenceRule putAlertingUserpresenceRule(PutAlertingUserpresenceRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserPresenceRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user presence rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserPresenceRule> putAlertingUserpresenceRule(ApiRequest<UserPresenceRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserPresenceRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)exception;
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
      ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
