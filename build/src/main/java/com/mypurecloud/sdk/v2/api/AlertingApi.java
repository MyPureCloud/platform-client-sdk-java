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
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingHeartbeatAlert(String alertId) throws ApiException {
    deleteAlertingHeartbeatAlertWithHttpInfo(alertId);
  }

  /**
   * Delete a heart beat alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingHeartbeatAlertWithHttpInfo(String alertId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling deleteAlertingHeartbeatAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingHeartbeatAlert(DeleteAlertingHeartbeatAlertRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingHeartbeatAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingHeartbeatRule(String ruleId) throws ApiException {
    deleteAlertingHeartbeatRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingHeartbeatRuleWithHttpInfo(String ruleId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteAlertingHeartbeatRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingHeartbeatRule(DeleteAlertingHeartbeatRuleRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingHeartbeatRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingInteractionstatsAlert(String alertId) throws ApiException {
    deleteAlertingInteractionstatsAlertWithHttpInfo(alertId);
  }

  /**
   * Delete an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsAlertWithHttpInfo(String alertId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling deleteAlertingInteractionstatsAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingInteractionstatsAlert(DeleteAlertingInteractionstatsAlertRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingInteractionstatsRule(String ruleId) throws ApiException {
    deleteAlertingInteractionstatsRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsRuleWithHttpInfo(String ruleId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteAlertingInteractionstatsRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingInteractionstatsRule(DeleteAlertingInteractionstatsRuleRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingInteractionstatsRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingRoutingstatusAlert(String alertId) throws ApiException {
    deleteAlertingRoutingstatusAlertWithHttpInfo(alertId);
  }

  /**
   * Delete a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusAlertWithHttpInfo(String alertId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling deleteAlertingRoutingstatusAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingRoutingstatusAlert(DeleteAlertingRoutingstatusAlertRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingRoutingstatusRule(String ruleId) throws ApiException {
    deleteAlertingRoutingstatusRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusRuleWithHttpInfo(String ruleId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteAlertingRoutingstatusRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingRoutingstatusRule(DeleteAlertingRoutingstatusRuleRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingRoutingstatusRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingUserpresenceAlert(String alertId) throws ApiException {
    deleteAlertingUserpresenceAlertWithHttpInfo(alertId);
  }

  /**
   * Delete a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingUserpresenceAlertWithHttpInfo(String alertId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling deleteAlertingUserpresenceAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingUserpresenceAlert(DeleteAlertingUserpresenceAlertRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingUserpresenceAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingUserpresenceRule(String ruleId) throws ApiException {
    deleteAlertingUserpresenceRuleWithHttpInfo(ruleId);
  }

  /**
   * Delete a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingUserpresenceRuleWithHttpInfo(String ruleId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteAlertingUserpresenceRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertingUserpresenceRule(DeleteAlertingUserpresenceRuleRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertingUserpresenceRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get a heart beat alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlert
   * @throws ApiException if fails to make API call
   */
  public HeartBeatAlert getAlertingHeartbeatAlert(String alertId, List<String> expand) throws ApiException {
    return getAlertingHeartbeatAlertWithHttpInfo(alertId, expand).getBody();
  }

  /**
   * Get a heart beat alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlert
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatAlert> getAlertingHeartbeatAlertWithHttpInfo(String alertId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling getAlertingHeartbeatAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<HeartBeatAlert>() {});
  }

  /**
   * Get a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public HeartBeatAlert getAlertingHeartbeatAlert(GetAlertingHeartbeatAlertRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<HeartBeatAlert>() {});
  }

  /**
   * Get a heart beat alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatAlert> getAlertingHeartbeatAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<HeartBeatAlert>invokeAPIVerbose(request, new TypeReference<HeartBeatAlert>() {});
  }

  /**
   * Get heart beat alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlertContainer
   * @throws ApiException if fails to make API call
   */
  public HeartBeatAlertContainer getAlertingHeartbeatAlerts(List<String> expand) throws ApiException {
    return getAlertingHeartbeatAlertsWithHttpInfo(expand).getBody();
  }

  /**
   * Get heart beat alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatAlertContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatAlertContainer> getAlertingHeartbeatAlertsWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/alerts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<HeartBeatAlertContainer>() {});
  }

  /**
   * Get heart beat alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public HeartBeatAlertContainer getAlertingHeartbeatAlerts(GetAlertingHeartbeatAlertsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<HeartBeatAlertContainer>() {});
  }

  /**
   * Get heart beat alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatAlertContainer> getAlertingHeartbeatAlerts(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<HeartBeatAlertContainer>invokeAPIVerbose(request, new TypeReference<HeartBeatAlertContainer>() {});
  }

  /**
   * Get a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRule getAlertingHeartbeatRule(String ruleId, List<String> expand) throws ApiException {
    return getAlertingHeartbeatRuleWithHttpInfo(ruleId, expand).getBody();
  }

  /**
   * Get a heart beat rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRule> getAlertingHeartbeatRuleWithHttpInfo(String ruleId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling getAlertingHeartbeatRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Get a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRule getAlertingHeartbeatRule(GetAlertingHeartbeatRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Get a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRule> getAlertingHeartbeatRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<HeartBeatRule>invokeAPIVerbose(request, new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Get a heart beat rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRuleContainer
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRuleContainer getAlertingHeartbeatRules(List<String> expand) throws ApiException {
    return getAlertingHeartbeatRulesWithHttpInfo(expand).getBody();
  }

  /**
   * Get a heart beat rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRuleContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRuleContainer> getAlertingHeartbeatRulesWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<HeartBeatRuleContainer>() {});
  }

  /**
   * Get a heart beat rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRuleContainer getAlertingHeartbeatRules(GetAlertingHeartbeatRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<HeartBeatRuleContainer>() {});
  }

  /**
   * Get a heart beat rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRuleContainer> getAlertingHeartbeatRules(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<HeartBeatRuleContainer>invokeAPIVerbose(request, new TypeReference<HeartBeatRuleContainer>() {});
  }

  /**
   * Get an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlert
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsAlert getAlertingInteractionstatsAlert(String alertId, List<String> expand) throws ApiException {
    return getAlertingInteractionstatsAlertWithHttpInfo(alertId, expand).getBody();
  }

  /**
   * Get an interaction stats alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlert
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsAlert> getAlertingInteractionstatsAlertWithHttpInfo(String alertId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling getAlertingInteractionstatsAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InteractionStatsAlert>() {});
  }

  /**
   * Get an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsAlert getAlertingInteractionstatsAlert(GetAlertingInteractionstatsAlertRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InteractionStatsAlert>() {});
  }

  /**
   * Get an interaction stats alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsAlert> getAlertingInteractionstatsAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<InteractionStatsAlert>invokeAPIVerbose(request, new TypeReference<InteractionStatsAlert>() {});
  }

  /**
   * Get interaction stats alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlertContainer
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsAlertContainer getAlertingInteractionstatsAlerts(List<String> expand) throws ApiException {
    return getAlertingInteractionstatsAlertsWithHttpInfo(expand).getBody();
  }

  /**
   * Get interaction stats alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsAlertContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsAlertContainer> getAlertingInteractionstatsAlertsWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/alerts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InteractionStatsAlertContainer>() {});
  }

  /**
   * Get interaction stats alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsAlertContainer getAlertingInteractionstatsAlerts(GetAlertingInteractionstatsAlertsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InteractionStatsAlertContainer>() {});
  }

  /**
   * Get interaction stats alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsAlertContainer> getAlertingInteractionstatsAlerts(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<InteractionStatsAlertContainer>invokeAPIVerbose(request, new TypeReference<InteractionStatsAlertContainer>() {});
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @return UnreadMetric
   * @throws ApiException if fails to make API call
   */
  public UnreadMetric getAlertingInteractionstatsAlertsUnread() throws ApiException {
    return getAlertingInteractionstatsAlertsUnreadWithHttpInfo().getBody();
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @return UnreadMetric
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UnreadMetric> getAlertingInteractionstatsAlertsUnreadWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/alerts/unread".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UnreadMetric>() {});
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UnreadMetric getAlertingInteractionstatsAlertsUnread(GetAlertingInteractionstatsAlertsUnreadRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UnreadMetric>() {});
  }

  /**
   * Gets user unread count of interaction stats alerts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UnreadMetric> getAlertingInteractionstatsAlertsUnread(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UnreadMetric>invokeAPIVerbose(request, new TypeReference<UnreadMetric>() {});
  }

  /**
   * Get an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRule getAlertingInteractionstatsRule(String ruleId, List<String> expand) throws ApiException {
    return getAlertingInteractionstatsRuleWithHttpInfo(ruleId, expand).getBody();
  }

  /**
   * Get an interaction stats rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRule> getAlertingInteractionstatsRuleWithHttpInfo(String ruleId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling getAlertingInteractionstatsRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Get an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRule getAlertingInteractionstatsRule(GetAlertingInteractionstatsRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Get an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRule> getAlertingInteractionstatsRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<InteractionStatsRule>invokeAPIVerbose(request, new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRuleContainer
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRuleContainer getAlertingInteractionstatsRules(List<String> expand) throws ApiException {
    return getAlertingInteractionstatsRulesWithHttpInfo(expand).getBody();
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRuleContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRuleContainer> getAlertingInteractionstatsRulesWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InteractionStatsRuleContainer>() {});
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRuleContainer getAlertingInteractionstatsRules(GetAlertingInteractionstatsRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InteractionStatsRuleContainer>() {});
  }

  /**
   * Get an interaction stats rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRuleContainer> getAlertingInteractionstatsRules(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<InteractionStatsRuleContainer>invokeAPIVerbose(request, new TypeReference<InteractionStatsRuleContainer>() {});
  }

  /**
   * Get a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlert
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusAlert getAlertingRoutingstatusAlert(String alertId, List<String> expand) throws ApiException {
    return getAlertingRoutingstatusAlertWithHttpInfo(alertId, expand).getBody();
  }

  /**
   * Get a routing status alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlert
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusAlert> getAlertingRoutingstatusAlertWithHttpInfo(String alertId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling getAlertingRoutingstatusAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatusAlert>() {});
  }

  /**
   * Get a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusAlert getAlertingRoutingstatusAlert(GetAlertingRoutingstatusAlertRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatusAlert>() {});
  }

  /**
   * Get a routing status alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusAlert> getAlertingRoutingstatusAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<RoutingStatusAlert>invokeAPIVerbose(request, new TypeReference<RoutingStatusAlert>() {});
  }

  /**
   * Get routing status alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlertContainer
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusAlertContainer getAlertingRoutingstatusAlerts(List<String> expand) throws ApiException {
    return getAlertingRoutingstatusAlertsWithHttpInfo(expand).getBody();
  }

  /**
   * Get routing status alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusAlertContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusAlertContainer> getAlertingRoutingstatusAlertsWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/alerts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatusAlertContainer>() {});
  }

  /**
   * Get routing status alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusAlertContainer getAlertingRoutingstatusAlerts(GetAlertingRoutingstatusAlertsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatusAlertContainer>() {});
  }

  /**
   * Get routing status alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusAlertContainer> getAlertingRoutingstatusAlerts(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<RoutingStatusAlertContainer>invokeAPIVerbose(request, new TypeReference<RoutingStatusAlertContainer>() {});
  }

  /**
   * Get a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRule getAlertingRoutingstatusRule(String ruleId, List<String> expand) throws ApiException {
    return getAlertingRoutingstatusRuleWithHttpInfo(ruleId, expand).getBody();
  }

  /**
   * Get a routing status rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRule> getAlertingRoutingstatusRuleWithHttpInfo(String ruleId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling getAlertingRoutingstatusRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Get a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRule getAlertingRoutingstatusRule(GetAlertingRoutingstatusRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Get a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRule> getAlertingRoutingstatusRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<RoutingStatusRule>invokeAPIVerbose(request, new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Get a routing status rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRuleContainer
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRuleContainer getAlertingRoutingstatusRules(List<String> expand) throws ApiException {
    return getAlertingRoutingstatusRulesWithHttpInfo(expand).getBody();
  }

  /**
   * Get a routing status rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRuleContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRuleContainer> getAlertingRoutingstatusRulesWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatusRuleContainer>() {});
  }

  /**
   * Get a routing status rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRuleContainer getAlertingRoutingstatusRules(GetAlertingRoutingstatusRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatusRuleContainer>() {});
  }

  /**
   * Get a routing status rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRuleContainer> getAlertingRoutingstatusRules(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<RoutingStatusRuleContainer>invokeAPIVerbose(request, new TypeReference<RoutingStatusRuleContainer>() {});
  }

  /**
   * Get a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlert
   * @throws ApiException if fails to make API call
   */
  public UserPresenceAlert getAlertingUserpresenceAlert(String alertId, List<String> expand) throws ApiException {
    return getAlertingUserpresenceAlertWithHttpInfo(alertId, expand).getBody();
  }

  /**
   * Get a user presence alert
   * 
   * @param alertId Alert ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlert
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceAlert> getAlertingUserpresenceAlertWithHttpInfo(String alertId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling getAlertingUserpresenceAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresenceAlert>() {});
  }

  /**
   * Get a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresenceAlert getAlertingUserpresenceAlert(GetAlertingUserpresenceAlertRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresenceAlert>() {});
  }

  /**
   * Get a user presence alert
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceAlert> getAlertingUserpresenceAlert(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserPresenceAlert>invokeAPIVerbose(request, new TypeReference<UserPresenceAlert>() {});
  }

  /**
   * Get user presence alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlertContainer
   * @throws ApiException if fails to make API call
   */
  public UserPresenceAlertContainer getAlertingUserpresenceAlerts(List<String> expand) throws ApiException {
    return getAlertingUserpresenceAlertsWithHttpInfo(expand).getBody();
  }

  /**
   * Get user presence alert list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceAlertContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceAlertContainer> getAlertingUserpresenceAlertsWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/alerts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresenceAlertContainer>() {});
  }

  /**
   * Get user presence alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresenceAlertContainer getAlertingUserpresenceAlerts(GetAlertingUserpresenceAlertsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresenceAlertContainer>() {});
  }

  /**
   * Get user presence alert list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceAlertContainer> getAlertingUserpresenceAlerts(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserPresenceAlertContainer>invokeAPIVerbose(request, new TypeReference<UserPresenceAlertContainer>() {});
  }

  /**
   * Get a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRule getAlertingUserpresenceRule(String ruleId, List<String> expand) throws ApiException {
    return getAlertingUserpresenceRuleWithHttpInfo(ruleId, expand).getBody();
  }

  /**
   * Get a user presence rule.
   * 
   * @param ruleId Rule ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRule> getAlertingUserpresenceRuleWithHttpInfo(String ruleId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling getAlertingUserpresenceRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Get a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRule getAlertingUserpresenceRule(GetAlertingUserpresenceRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Get a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRule> getAlertingUserpresenceRule(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserPresenceRule>invokeAPIVerbose(request, new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Get a user presence rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRuleContainer
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRuleContainer getAlertingUserpresenceRules(List<String> expand) throws ApiException {
    return getAlertingUserpresenceRulesWithHttpInfo(expand).getBody();
  }

  /**
   * Get a user presence rule list.
   * 
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRuleContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRuleContainer> getAlertingUserpresenceRulesWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresenceRuleContainer>() {});
  }

  /**
   * Get a user presence rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRuleContainer getAlertingUserpresenceRules(GetAlertingUserpresenceRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresenceRuleContainer>() {});
  }

  /**
   * Get a user presence rule list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRuleContainer> getAlertingUserpresenceRules(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserPresenceRuleContainer>invokeAPIVerbose(request, new TypeReference<UserPresenceRuleContainer>() {});
  }

  /**
   * Create a heart beat rule.
   * 
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRule postAlertingHeartbeatRules(HeartBeatRule body, List<String> expand) throws ApiException {
    return postAlertingHeartbeatRulesWithHttpInfo(body, expand).getBody();
  }

  /**
   * Create a heart beat rule.
   * 
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRule> postAlertingHeartbeatRulesWithHttpInfo(HeartBeatRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAlertingHeartbeatRules");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Create a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRule postAlertingHeartbeatRules(PostAlertingHeartbeatRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Create a heart beat rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRule> postAlertingHeartbeatRules(ApiRequest<HeartBeatRule> request) throws ApiException {
    return pcapiClient.<HeartBeatRule>invokeAPIVerbose(request, new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Create an interaction stats rule.
   * 
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRule postAlertingInteractionstatsRules(InteractionStatsRule body, List<String> expand) throws ApiException {
    return postAlertingInteractionstatsRulesWithHttpInfo(body, expand).getBody();
  }

  /**
   * Create an interaction stats rule.
   * 
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRule> postAlertingInteractionstatsRulesWithHttpInfo(InteractionStatsRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAlertingInteractionstatsRules");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Create an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRule postAlertingInteractionstatsRules(PostAlertingInteractionstatsRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Create an interaction stats rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRule> postAlertingInteractionstatsRules(ApiRequest<InteractionStatsRule> request) throws ApiException {
    return pcapiClient.<InteractionStatsRule>invokeAPIVerbose(request, new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Create a routing status rule.
   * 
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRule postAlertingRoutingstatusRules(RoutingStatusRule body, List<String> expand) throws ApiException {
    return postAlertingRoutingstatusRulesWithHttpInfo(body, expand).getBody();
  }

  /**
   * Create a routing status rule.
   * 
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRule> postAlertingRoutingstatusRulesWithHttpInfo(RoutingStatusRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAlertingRoutingstatusRules");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Create a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRule postAlertingRoutingstatusRules(PostAlertingRoutingstatusRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Create a routing status rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRule> postAlertingRoutingstatusRules(ApiRequest<RoutingStatusRule> request) throws ApiException {
    return pcapiClient.<RoutingStatusRule>invokeAPIVerbose(request, new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Create a user presence rule.
   * 
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRule postAlertingUserpresenceRules(UserPresenceRule body, List<String> expand) throws ApiException {
    return postAlertingUserpresenceRulesWithHttpInfo(body, expand).getBody();
  }

  /**
   * Create a user presence rule.
   * 
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRule> postAlertingUserpresenceRulesWithHttpInfo(UserPresenceRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAlertingUserpresenceRules");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/rules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Create a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRule postAlertingUserpresenceRules(PostAlertingUserpresenceRulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Create a user presence rule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRule> postAlertingUserpresenceRules(ApiRequest<UserPresenceRule> request) throws ApiException {
    return pcapiClient.<UserPresenceRule>invokeAPIVerbose(request, new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Update a heart beat rule
   * 
   * @param ruleId Rule ID (required)
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRule putAlertingHeartbeatRule(String ruleId, HeartBeatRule body, List<String> expand) throws ApiException {
    return putAlertingHeartbeatRuleWithHttpInfo(ruleId, body, expand).getBody();
  }

  /**
   * Update a heart beat rule
   * 
   * @param ruleId Rule ID (required)
   * @param body HeartBeatRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return HeartBeatRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRule> putAlertingHeartbeatRuleWithHttpInfo(String ruleId, HeartBeatRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling putAlertingHeartbeatRule");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAlertingHeartbeatRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/heartbeat/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Update a heart beat rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public HeartBeatRule putAlertingHeartbeatRule(PutAlertingHeartbeatRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Update a heart beat rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HeartBeatRule> putAlertingHeartbeatRule(ApiRequest<HeartBeatRule> request) throws ApiException {
    return pcapiClient.<HeartBeatRule>invokeAPIVerbose(request, new TypeReference<HeartBeatRule>() {});
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body InteractionStatsAlert (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UnreadStatus
   * @throws ApiException if fails to make API call
   */
  public UnreadStatus putAlertingInteractionstatsAlert(String alertId, UnreadStatus body, List<String> expand) throws ApiException {
    return putAlertingInteractionstatsAlertWithHttpInfo(alertId, body, expand).getBody();
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body InteractionStatsAlert (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UnreadStatus
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UnreadStatus> putAlertingInteractionstatsAlertWithHttpInfo(String alertId, UnreadStatus body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'alertId' is set
    if (alertId == null) {
      throw new ApiException(400, "Missing the required parameter 'alertId' when calling putAlertingInteractionstatsAlert");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAlertingInteractionstatsAlert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/alerts/{alertId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertId" + "\\}", pcapiClient.escapeString(alertId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UnreadStatus>() {});
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UnreadStatus putAlertingInteractionstatsAlert(PutAlertingInteractionstatsAlertRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UnreadStatus>() {});
  }

  /**
   * Update an interaction stats alert read status
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UnreadStatus> putAlertingInteractionstatsAlert(ApiRequest<UnreadStatus> request) throws ApiException {
    return pcapiClient.<UnreadStatus>invokeAPIVerbose(request, new TypeReference<UnreadStatus>() {});
  }

  /**
   * Update an interaction stats rule
   * 
   * @param ruleId Rule ID (required)
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRule putAlertingInteractionstatsRule(String ruleId, InteractionStatsRule body, List<String> expand) throws ApiException {
    return putAlertingInteractionstatsRuleWithHttpInfo(ruleId, body, expand).getBody();
  }

  /**
   * Update an interaction stats rule
   * 
   * @param ruleId Rule ID (required)
   * @param body AlertingRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InteractionStatsRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRule> putAlertingInteractionstatsRuleWithHttpInfo(String ruleId, InteractionStatsRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling putAlertingInteractionstatsRule");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAlertingInteractionstatsRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/interactionstats/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Update an interaction stats rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InteractionStatsRule putAlertingInteractionstatsRule(PutAlertingInteractionstatsRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Update an interaction stats rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InteractionStatsRule> putAlertingInteractionstatsRule(ApiRequest<InteractionStatsRule> request) throws ApiException {
    return pcapiClient.<InteractionStatsRule>invokeAPIVerbose(request, new TypeReference<InteractionStatsRule>() {});
  }

  /**
   * Update a routing status rule
   * 
   * @param ruleId Rule ID (required)
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRule putAlertingRoutingstatusRule(String ruleId, RoutingStatusRule body, List<String> expand) throws ApiException {
    return putAlertingRoutingstatusRuleWithHttpInfo(ruleId, body, expand).getBody();
  }

  /**
   * Update a routing status rule
   * 
   * @param ruleId Rule ID (required)
   * @param body RoutingStatusRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return RoutingStatusRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRule> putAlertingRoutingstatusRuleWithHttpInfo(String ruleId, RoutingStatusRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling putAlertingRoutingstatusRule");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAlertingRoutingstatusRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/routingstatus/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Update a routing status rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatusRule putAlertingRoutingstatusRule(PutAlertingRoutingstatusRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Update a routing status rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatusRule> putAlertingRoutingstatusRule(ApiRequest<RoutingStatusRule> request) throws ApiException {
    return pcapiClient.<RoutingStatusRule>invokeAPIVerbose(request, new TypeReference<RoutingStatusRule>() {});
  }

  /**
   * Update a user presence rule
   * 
   * @param ruleId Rule ID (required)
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRule putAlertingUserpresenceRule(String ruleId, UserPresenceRule body, List<String> expand) throws ApiException {
    return putAlertingUserpresenceRuleWithHttpInfo(ruleId, body, expand).getBody();
  }

  /**
   * Update a user presence rule
   * 
   * @param ruleId Rule ID (required)
   * @param body UserPresenceRule (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserPresenceRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRule> putAlertingUserpresenceRuleWithHttpInfo(String ruleId, UserPresenceRule body, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling putAlertingUserpresenceRule");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAlertingUserpresenceRule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/alerting/userpresence/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", pcapiClient.escapeString(ruleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Update a user presence rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserPresenceRule putAlertingUserpresenceRule(PutAlertingUserpresenceRuleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {});
  }

  /**
   * Update a user presence rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserPresenceRule> putAlertingUserpresenceRule(ApiRequest<UserPresenceRule> request) throws ApiException {
    return pcapiClient.<UserPresenceRule>invokeAPIVerbose(request, new TypeReference<UserPresenceRule>() {});
  }

}
