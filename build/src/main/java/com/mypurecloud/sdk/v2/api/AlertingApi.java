package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AlertListing;
import com.mypurecloud.sdk.v2.model.AlertRequest;
import com.mypurecloud.sdk.v2.model.AlertingUnreadStatus;
import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.CommonAlert;
import com.mypurecloud.sdk.v2.model.CommonAlertBulkUpdateRequest;
import com.mypurecloud.sdk.v2.model.CommonAllAlertUpdateRequest;
import com.mypurecloud.sdk.v2.model.CommonRule;
import com.mypurecloud.sdk.v2.model.CommonRuleBulkDeleteRequest;
import com.mypurecloud.sdk.v2.model.CommonRuleBulkUpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.CommonRuleContainer;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetAlertQuery;
import com.mypurecloud.sdk.v2.model.GetRulesQuery;
import com.mypurecloud.sdk.v2.model.ModifiableRuleProperties;


import com.mypurecloud.sdk.v2.api.request.DeleteAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingAlertsAllRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingAlertsAllRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingAlertsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingRulesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingAlertsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRulesBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRulesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingRuleRequest;

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
   * Delete an alert
   * 
   * @param alertId Alert ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingAlert(String alertId) throws IOException, ApiException {
     deleteAlertingAlert(createDeleteAlertingAlertRequest(alertId));
  }

  /**
   * Delete an alert
   * 
   * @param alertId Alert ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingAlertWithHttpInfo(String alertId) throws IOException {
    return deleteAlertingAlert(createDeleteAlertingAlertRequest(alertId).withHttpInfo());
  }

  private DeleteAlertingAlertRequest createDeleteAlertingAlertRequest(String alertId) {
    return DeleteAlertingAlertRequest.builder()
            .withAlertId(alertId)

            .build();
  }

  /**
   * Delete an alert
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingAlert(DeleteAlertingAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingAlert(ApiRequest<Void> request) throws IOException {
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
   * Delete all alerts for the user
   * 
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteAlertingAlertsAll() throws IOException, ApiException {
    return  deleteAlertingAlertsAll(createDeleteAlertingAlertsAllRequest());
  }

  /**
   * Delete all alerts for the user
   * 
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteAlertingAlertsAllWithHttpInfo() throws IOException {
    return deleteAlertingAlertsAll(createDeleteAlertingAlertsAllRequest().withHttpInfo());
  }

  private DeleteAlertingAlertsAllRequest createDeleteAlertingAlertsAllRequest() {
    return DeleteAlertingAlertsAllRequest.builder()
            .build();
  }

  /**
   * Delete all alerts for the user
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteAlertingAlertsAll(DeleteAlertingAlertsAllRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete all alerts for the user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteAlertingAlertsAll(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete a rule.
   * 
   * @param ruleId Rule Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingRule(String ruleId) throws IOException, ApiException {
     deleteAlertingRule(createDeleteAlertingRuleRequest(ruleId));
  }

  /**
   * Delete a rule.
   * 
   * @param ruleId Rule Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingRuleWithHttpInfo(String ruleId) throws IOException {
    return deleteAlertingRule(createDeleteAlertingRuleRequest(ruleId).withHttpInfo());
  }

  private DeleteAlertingRuleRequest createDeleteAlertingRuleRequest(String ruleId) {
    return DeleteAlertingRuleRequest.builder()
            .withRuleId(ruleId)

            .build();
  }

  /**
   * Delete a rule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAlertingRule(DeleteAlertingRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAlertingRule(ApiRequest<Void> request) throws IOException {
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
   * Get an alert
   * 
   * @param alertId Alert ID (required)
   * @return CommonAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonAlert getAlertingAlert(String alertId) throws IOException, ApiException {
    return  getAlertingAlert(createGetAlertingAlertRequest(alertId));
  }

  /**
   * Get an alert
   * 
   * @param alertId Alert ID (required)
   * @return CommonAlert
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonAlert> getAlertingAlertWithHttpInfo(String alertId) throws IOException {
    return getAlertingAlert(createGetAlertingAlertRequest(alertId).withHttpInfo());
  }

  private GetAlertingAlertRequest createGetAlertingAlertRequest(String alertId) {
    return GetAlertingAlertRequest.builder()
            .withAlertId(alertId)

            .build();
  }

  /**
   * Get an alert
   * 
   * @param request The request object
   * @return CommonAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonAlert getAlertingAlert(GetAlertingAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonAlert> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonAlert>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an alert
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonAlert> getAlertingAlert(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonAlert>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)exception;
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
      ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a rule.
   * 
   * @param ruleId Rule Id (required)
   * @return CommonRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRule getAlertingRule(String ruleId) throws IOException, ApiException {
    return  getAlertingRule(createGetAlertingRuleRequest(ruleId));
  }

  /**
   * Get a rule.
   * 
   * @param ruleId Rule Id (required)
   * @return CommonRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRule> getAlertingRuleWithHttpInfo(String ruleId) throws IOException {
    return getAlertingRule(createGetAlertingRuleRequest(ruleId).withHttpInfo());
  }

  private GetAlertingRuleRequest createGetAlertingRuleRequest(String ruleId) {
    return GetAlertingRuleRequest.builder()
            .withRuleId(ruleId)

            .build();
  }

  /**
   * Get a rule.
   * 
   * @param request The request object
   * @return CommonRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRule getAlertingRule(GetAlertingRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRule> getAlertingRule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)exception;
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
      ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Allows an entity to mute/snooze an alert or update the unread status of the alert.
   * Snoozing an alert temporarily stop it from resending notifications to individualsas well as other services within Genesys Cloud for a given period.  Muting an alert will only block the notifications to individuals.
   * @param alertId Alert ID (required)
   * @param body  (optional)
   * @return CommonAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonAlert patchAlertingAlert(String alertId, AlertRequest body) throws IOException, ApiException {
    return  patchAlertingAlert(createPatchAlertingAlertRequest(alertId, body));
  }

  /**
   * Allows an entity to mute/snooze an alert or update the unread status of the alert.
   * Snoozing an alert temporarily stop it from resending notifications to individualsas well as other services within Genesys Cloud for a given period.  Muting an alert will only block the notifications to individuals.
   * @param alertId Alert ID (required)
   * @param body  (optional)
   * @return CommonAlert
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonAlert> patchAlertingAlertWithHttpInfo(String alertId, AlertRequest body) throws IOException {
    return patchAlertingAlert(createPatchAlertingAlertRequest(alertId, body).withHttpInfo());
  }

  private PatchAlertingAlertRequest createPatchAlertingAlertRequest(String alertId, AlertRequest body) {
    return PatchAlertingAlertRequest.builder()
            .withAlertId(alertId)

            .withBody(body)

            .build();
  }

  /**
   * Allows an entity to mute/snooze an alert or update the unread status of the alert.
   * Snoozing an alert temporarily stop it from resending notifications to individualsas well as other services within Genesys Cloud for a given period.  Muting an alert will only block the notifications to individuals.
   * @param request The request object
   * @return CommonAlert
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonAlert patchAlertingAlert(PatchAlertingAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonAlert> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonAlert>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Allows an entity to mute/snooze an alert or update the unread status of the alert.
   * Snoozing an alert temporarily stop it from resending notifications to individualsas well as other services within Genesys Cloud for a given period.  Muting an alert will only block the notifications to individuals.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonAlert> patchAlertingAlert(ApiRequest<AlertRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonAlert>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)exception;
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
      ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates all alerts
   * 
   * @param body  (optional)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchAlertingAlertsAll(CommonAllAlertUpdateRequest body) throws IOException, ApiException {
    return  patchAlertingAlertsAll(createPatchAlertingAlertsAllRequest(body));
  }

  /**
   * Updates all alerts
   * 
   * @param body  (optional)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchAlertingAlertsAllWithHttpInfo(CommonAllAlertUpdateRequest body) throws IOException {
    return patchAlertingAlertsAll(createPatchAlertingAlertsAllRequest(body).withHttpInfo());
  }

  private PatchAlertingAlertsAllRequest createPatchAlertingAlertsAllRequest(CommonAllAlertUpdateRequest body) {
    return PatchAlertingAlertsAllRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Updates all alerts
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty patchAlertingAlertsAll(PatchAlertingAlertsAllRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates all alerts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> patchAlertingAlertsAll(ApiRequest<CommonAllAlertUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
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
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk alert updates
   * 
   * @param body  (required)
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse patchAlertingAlertsBulk(CommonAlertBulkUpdateRequest body) throws IOException, ApiException {
    return  patchAlertingAlertsBulk(createPatchAlertingAlertsBulkRequest(body));
  }

  /**
   * Bulk alert updates
   * 
   * @param body  (required)
   * @return BulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> patchAlertingAlertsBulkWithHttpInfo(CommonAlertBulkUpdateRequest body) throws IOException {
    return patchAlertingAlertsBulk(createPatchAlertingAlertsBulkRequest(body).withHttpInfo());
  }

  private PatchAlertingAlertsBulkRequest createPatchAlertingAlertsBulkRequest(CommonAlertBulkUpdateRequest body) {
    return PatchAlertingAlertsBulkRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Bulk alert updates
   * 
   * @param request The request object
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse patchAlertingAlertsBulk(PatchAlertingAlertsBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk alert updates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> patchAlertingAlertsBulk(ApiRequest<CommonAlertBulkUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk update of notification lists
   * 
   * @param body  (required)
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse patchAlertingRulesBulk(CommonRuleBulkUpdateNotificationsRequest body) throws IOException, ApiException {
    return  patchAlertingRulesBulk(createPatchAlertingRulesBulkRequest(body));
  }

  /**
   * Bulk update of notification lists
   * 
   * @param body  (required)
   * @return BulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> patchAlertingRulesBulkWithHttpInfo(CommonRuleBulkUpdateNotificationsRequest body) throws IOException {
    return patchAlertingRulesBulk(createPatchAlertingRulesBulkRequest(body).withHttpInfo());
  }

  private PatchAlertingRulesBulkRequest createPatchAlertingRulesBulkRequest(CommonRuleBulkUpdateNotificationsRequest body) {
    return PatchAlertingRulesBulkRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Bulk update of notification lists
   * 
   * @param request The request object
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse patchAlertingRulesBulk(PatchAlertingRulesBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update of notification lists
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> patchAlertingRulesBulk(ApiRequest<CommonRuleBulkUpdateNotificationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a paged list of alerts. The max page size is 50
   * 
   * @param body  (optional)
   * @return AlertListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlertListing postAlertingAlertsQuery(GetAlertQuery body) throws IOException, ApiException {
    return  postAlertingAlertsQuery(createPostAlertingAlertsQueryRequest(body));
  }

  /**
   * Gets a paged list of alerts. The max page size is 50
   * 
   * @param body  (optional)
   * @return AlertListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlertListing> postAlertingAlertsQueryWithHttpInfo(GetAlertQuery body) throws IOException {
    return postAlertingAlertsQuery(createPostAlertingAlertsQueryRequest(body).withHttpInfo());
  }

  private PostAlertingAlertsQueryRequest createPostAlertingAlertsQueryRequest(GetAlertQuery body) {
    return PostAlertingAlertsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Gets a paged list of alerts. The max page size is 50
   * 
   * @param request The request object
   * @return AlertListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlertListing postAlertingAlertsQuery(PostAlertingAlertsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlertListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlertListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a paged list of alerts. The max page size is 50
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlertListing> postAlertingAlertsQuery(ApiRequest<GetAlertQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlertListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlertListing> response = (ApiResponse<AlertListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AlertListing> response = (ApiResponse<AlertListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Rule.
   * 
   * @param body rule to be created (required)
   * @return CommonRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRule postAlertingRules(CommonRule body) throws IOException, ApiException {
    return  postAlertingRules(createPostAlertingRulesRequest(body));
  }

  /**
   * Create a Rule.
   * 
   * @param body rule to be created (required)
   * @return CommonRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRule> postAlertingRulesWithHttpInfo(CommonRule body) throws IOException {
    return postAlertingRules(createPostAlertingRulesRequest(body).withHttpInfo());
  }

  private PostAlertingRulesRequest createPostAlertingRulesRequest(CommonRule body) {
    return PostAlertingRulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Rule.
   * 
   * @param request The request object
   * @return CommonRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRule postAlertingRules(PostAlertingRulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Rule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRule> postAlertingRules(ApiRequest<CommonRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)exception;
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
      ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk remove rules
   * 
   * @param body  (required)
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postAlertingRulesBulkRemove(CommonRuleBulkDeleteRequest body) throws IOException, ApiException {
    return  postAlertingRulesBulkRemove(createPostAlertingRulesBulkRemoveRequest(body));
  }

  /**
   * Bulk remove rules
   * 
   * @param body  (required)
   * @return BulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postAlertingRulesBulkRemoveWithHttpInfo(CommonRuleBulkDeleteRequest body) throws IOException {
    return postAlertingRulesBulkRemove(createPostAlertingRulesBulkRemoveRequest(body).withHttpInfo());
  }

  private PostAlertingRulesBulkRemoveRequest createPostAlertingRulesBulkRemoveRequest(CommonRuleBulkDeleteRequest body) {
    return PostAlertingRulesBulkRemoveRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Bulk remove rules
   * 
   * @param request The request object
   * @return BulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkResponse postAlertingRulesBulkRemove(PostAlertingRulesBulkRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk remove rules
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkResponse> postAlertingRulesBulkRemove(ApiRequest<CommonRuleBulkDeleteRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a paged list of rules.  The max size of the page is 50 items.
   * 
   * @param body  (optional)
   * @return CommonRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRuleContainer postAlertingRulesQuery(GetRulesQuery body) throws IOException, ApiException {
    return  postAlertingRulesQuery(createPostAlertingRulesQueryRequest(body));
  }

  /**
   * Get a paged list of rules.  The max size of the page is 50 items.
   * 
   * @param body  (optional)
   * @return CommonRuleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRuleContainer> postAlertingRulesQueryWithHttpInfo(GetRulesQuery body) throws IOException {
    return postAlertingRulesQuery(createPostAlertingRulesQueryRequest(body).withHttpInfo());
  }

  private PostAlertingRulesQueryRequest createPostAlertingRulesQueryRequest(GetRulesQuery body) {
    return PostAlertingRulesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get a paged list of rules.  The max size of the page is 50 items.
   * 
   * @param request The request object
   * @return CommonRuleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRuleContainer postAlertingRulesQuery(PostAlertingRulesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonRuleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonRuleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a paged list of rules.  The max size of the page is 50 items.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRuleContainer> postAlertingRulesQuery(ApiRequest<GetRulesQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonRuleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonRuleContainer> response = (ApiResponse<CommonRuleContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<CommonRuleContainer> response = (ApiResponse<CommonRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body  (optional)
   * @return AlertingUnreadStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlertingUnreadStatus putAlertingAlert(String alertId, AlertingUnreadStatus body) throws IOException, ApiException {
    return  putAlertingAlert(createPutAlertingAlertRequest(alertId, body));
  }

  /**
   * Update an alert read status
   * 
   * @param alertId Alert ID (required)
   * @param body  (optional)
   * @return AlertingUnreadStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlertingUnreadStatus> putAlertingAlertWithHttpInfo(String alertId, AlertingUnreadStatus body) throws IOException {
    return putAlertingAlert(createPutAlertingAlertRequest(alertId, body).withHttpInfo());
  }

  private PutAlertingAlertRequest createPutAlertingAlertRequest(String alertId, AlertingUnreadStatus body) {
    return PutAlertingAlertRequest.builder()
            .withAlertId(alertId)

            .withBody(body)

            .build();
  }

  /**
   * Update an alert read status
   * 
   * @param request The request object
   * @return AlertingUnreadStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlertingUnreadStatus putAlertingAlert(PutAlertingAlertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlertingUnreadStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlertingUnreadStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an alert read status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlertingUnreadStatus> putAlertingAlert(ApiRequest<AlertingUnreadStatus> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlertingUnreadStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlertingUnreadStatus> response = (ApiResponse<AlertingUnreadStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<AlertingUnreadStatus> response = (ApiResponse<AlertingUnreadStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a rule
   * 
   * @param ruleId Rule Id (required)
   * @param body rule to be updated (required)
   * @return CommonRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRule putAlertingRule(String ruleId, ModifiableRuleProperties body) throws IOException, ApiException {
    return  putAlertingRule(createPutAlertingRuleRequest(ruleId, body));
  }

  /**
   * Update a rule
   * 
   * @param ruleId Rule Id (required)
   * @param body rule to be updated (required)
   * @return CommonRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRule> putAlertingRuleWithHttpInfo(String ruleId, ModifiableRuleProperties body) throws IOException {
    return putAlertingRule(createPutAlertingRuleRequest(ruleId, body).withHttpInfo());
  }

  private PutAlertingRuleRequest createPutAlertingRuleRequest(String ruleId, ModifiableRuleProperties body) {
    return PutAlertingRuleRequest.builder()
            .withRuleId(ruleId)

            .withBody(body)

            .build();
  }

  /**
   * Update a rule
   * 
   * @param request The request object
   * @return CommonRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonRule putAlertingRule(PutAlertingRuleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonRule> putAlertingRule(ApiRequest<ModifiableRuleProperties> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)exception;
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
      ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
