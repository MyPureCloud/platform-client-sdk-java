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
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.TimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.TimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;


import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitSchedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementSchedulesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class WorkforceManagementApiAsync {
  private final ApiClient pcapiClient;

  public WorkforceManagementApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkforceManagementApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<UserScheduleAdherence>> getWorkforcemanagementAdherenceAsync(GetWorkforcemanagementAdherenceRequest request, AsyncApiCallback<List<UserScheduleAdherence>> callback) {
    return pcapiClient.<List<UserScheduleAdherence>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<UserScheduleAdherence>>() {}, callback);
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<UserScheduleAdherence>>> getWorkforcemanagementAdherenceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>> callback) {
    return pcapiClient.<List<UserScheduleAdherence>>invokeAPIVerboseAsync(request, new TypeReference<List<UserScheduleAdherence>>() {}, callback);
  }

  /**
   * Get activity codes corresponding to a management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesAsync(GetWorkforcemanagementManagementunitActivitycodesRequest request, AsyncApiCallback<ActivityCodeContainer> callback) {
    return pcapiClient.<ActivityCodeContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ActivityCodeContainer>() {}, callback);
  }

  /**
   * Get activity codes corresponding to a management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ActivityCodeContainer>> getWorkforcemanagementManagementunitActivitycodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ActivityCodeContainer>> callback) {
    return pcapiClient.<ActivityCodeContainer>invokeAPIVerboseAsync(request, new TypeReference<ActivityCodeContainer>() {}, callback);
  }

  /**
   * Get a time off request by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TimeOffRequest> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request, AsyncApiCallback<TimeOffRequest> callback) {
    return pcapiClient.<TimeOffRequest>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {}, callback);
  }

  /**
   * Get a time off request by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TimeOffRequest>> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequest>> callback) {
    return pcapiClient.<TimeOffRequest>invokeAPIVerboseAsync(request, new TypeReference<TimeOffRequest>() {}, callback);
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest request, AsyncApiCallback<TimeOffRequestList> callback) {
    return pcapiClient.<TimeOffRequestList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, callback);
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TimeOffRequestList>> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    return pcapiClient.<TimeOffRequestList>invokeAPIVerboseAsync(request, new TypeReference<TimeOffRequestList>() {}, callback);
  }

  /**
   * Get agents in the management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersAsync(GetWorkforcemanagementManagementunitUsersRequest request, AsyncApiCallback<WfmUserEntityListing> callback) {
    return pcapiClient.<WfmUserEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {}, callback);
  }

  /**
   * Get agents in the management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WfmUserEntityListing>> getWorkforcemanagementManagementunitUsersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WfmUserEntityListing>> callback) {
    return pcapiClient.<WfmUserEntityListing>invokeAPIVerboseAsync(request, new TypeReference<WfmUserEntityListing>() {}, callback);
  }

  /**
   * Get management units
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<ManagementUnit>> getWorkforcemanagementManagementunitsAsync(GetWorkforcemanagementManagementunitsRequest request, AsyncApiCallback<List<ManagementUnit>> callback) {
    return pcapiClient.<List<ManagementUnit>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<ManagementUnit>>() {}, callback);
  }

  /**
   * Get management units
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<ManagementUnit>>> getWorkforcemanagementManagementunitsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<ManagementUnit>>> callback) {
    return pcapiClient.<List<ManagementUnit>>invokeAPIVerboseAsync(request, new TypeReference<List<ManagementUnit>>() {}, callback);
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TimeOffRequest> getWorkforcemanagementTimeoffrequestAsync(GetWorkforcemanagementTimeoffrequestRequest request, AsyncApiCallback<TimeOffRequest> callback) {
    return pcapiClient.<TimeOffRequest>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {}, callback);
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TimeOffRequest>> getWorkforcemanagementTimeoffrequestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequest>> callback) {
    return pcapiClient.<TimeOffRequest>invokeAPIVerboseAsync(request, new TypeReference<TimeOffRequest>() {}, callback);
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<TimeOffRequestList> getWorkforcemanagementTimeoffrequestsAsync(GetWorkforcemanagementTimeoffrequestsRequest request, AsyncApiCallback<TimeOffRequestList> callback) {
    return pcapiClient.<TimeOffRequestList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, callback);
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<TimeOffRequestList>> getWorkforcemanagementTimeoffrequestsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    return pcapiClient.<TimeOffRequestList>invokeAPIVerboseAsync(request, new TypeReference<TimeOffRequestList>() {}, callback);
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> patchWorkforcemanagementTimeoffrequestAsync(PatchWorkforcemanagementTimeoffrequestRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> patchWorkforcemanagementTimeoffrequestAsync(ApiRequest<TimeOffRequestPatch> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get user schedules within the given time range
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchAsync(PostWorkforcemanagementManagementunitSchedulesSearchRequest request, AsyncApiCallback<UserScheduleContainer> callback) {
    return pcapiClient.<UserScheduleContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {}, callback);
  }

  /**
   * Get user schedules within the given time range
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserScheduleContainer>> postWorkforcemanagementManagementunitSchedulesSearchAsync(ApiRequest<UserListScheduleRequestBody> request, AsyncApiCallback<ApiResponse<UserScheduleContainer>> callback) {
    return pcapiClient.<UserScheduleContainer>invokeAPIVerboseAsync(request, new TypeReference<UserScheduleContainer>() {}, callback);
  }

  /**
   * Get a schedule for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserScheduleContainer> postWorkforcemanagementSchedulesAsync(PostWorkforcemanagementSchedulesRequest request, AsyncApiCallback<UserScheduleContainer> callback) {
    return pcapiClient.<UserScheduleContainer>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {}, callback);
  }

  /**
   * Get a schedule for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserScheduleContainer>> postWorkforcemanagementSchedulesAsync(ApiRequest<CurrentUserScheduleRequestBody> request, AsyncApiCallback<ApiResponse<UserScheduleContainer>> callback) {
    return pcapiClient.<UserScheduleContainer>invokeAPIVerboseAsync(request, new TypeReference<UserScheduleContainer>() {}, callback);
  }

}
