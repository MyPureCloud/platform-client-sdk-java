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
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;


import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitIntradayQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitIntradayRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitSchedulesSearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WorkforceManagementApi {
  private final ApiClient pcapiClient;

  public WorkforceManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkforceManagementApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param userId User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request (required)
   * @return List<UserScheduleAdherence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<UserScheduleAdherence> getWorkforcemanagementAdherence(List<String> userId) throws IOException, ApiException {
    return  getWorkforcemanagementAdherence(createGetWorkforcemanagementAdherenceRequest(userId));
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param userId User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request (required)
   * @return List<UserScheduleAdherence>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<UserScheduleAdherence>> getWorkforcemanagementAdherenceWithHttpInfo(List<String> userId) throws IOException {
    return getWorkforcemanagementAdherence(createGetWorkforcemanagementAdherenceRequest(userId).withHttpInfo());
  }

  private GetWorkforcemanagementAdherenceRequest createGetWorkforcemanagementAdherenceRequest(List<String> userId) {
    return GetWorkforcemanagementAdherenceRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request The request object
   * @return List<UserScheduleAdherence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<UserScheduleAdherence> getWorkforcemanagementAdherence(GetWorkforcemanagementAdherenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<UserScheduleAdherence>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<UserScheduleAdherence>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<UserScheduleAdherence>> getWorkforcemanagementAdherence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<UserScheduleAdherence>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get activity codes
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(String muId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(muId));
  }

  /**
   * Get activity codes
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesWithHttpInfo(String muId) throws IOException {
    return getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(muId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitActivitycodesRequest createGetWorkforcemanagementManagementunitActivitycodesRequest(String muId) {
    return GetWorkforcemanagementManagementunitActivitycodesRequest.builder()
            .withMuId(muId)
    
            .build();
  }

  /**
   * Get activity codes
   * 
   * @param request The request object
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(GetWorkforcemanagementManagementunitActivitycodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityCodeContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityCodeContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get activity codes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityCodeContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get intraday queues for the given date
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param date ISO-8601 date string with no time or timezone component, interpreted in the configured management unit time zone, e.g. 2017-01-23 (required)
   * @return WfmIntradayQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntradayQueueListing getWorkforcemanagementManagementunitIntradayQueues(String muId, String date) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitIntradayQueues(createGetWorkforcemanagementManagementunitIntradayQueuesRequest(muId, date));
  }

  /**
   * Get intraday queues for the given date
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param date ISO-8601 date string with no time or timezone component, interpreted in the configured management unit time zone, e.g. 2017-01-23 (required)
   * @return WfmIntradayQueueListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntradayQueueListing> getWorkforcemanagementManagementunitIntradayQueuesWithHttpInfo(String muId, String date) throws IOException {
    return getWorkforcemanagementManagementunitIntradayQueues(createGetWorkforcemanagementManagementunitIntradayQueuesRequest(muId, date).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitIntradayQueuesRequest createGetWorkforcemanagementManagementunitIntradayQueuesRequest(String muId, String date) {
    return GetWorkforcemanagementManagementunitIntradayQueuesRequest.builder()
            .withMuId(muId)
    
            .withDate(date)
    
            .build();
  }

  /**
   * Get intraday queues for the given date
   * 
   * @param request The request object
   * @return WfmIntradayQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntradayQueueListing getWorkforcemanagementManagementunitIntradayQueues(GetWorkforcemanagementManagementunitIntradayQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmIntradayQueueListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmIntradayQueueListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get intraday queues for the given date
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntradayQueueListing> getWorkforcemanagementManagementunitIntradayQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmIntradayQueueListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse getWorkforcemanagementManagementunitUserTimeoffrequest(String muId, String userId, String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequest(createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId));
  }

  /**
   * Get a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> getWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String muId, String userId, String timeOffRequestId) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequest(createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(String muId, String userId, String timeOffRequestId) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestRequest.builder()
            .withMuId(muId)
    
            .withUserId(userId)
    
            .withTimeOffRequestId(timeOffRequestId)
    
            .build();
  }

  /**
   * Get a time off request
   * 
   * @param request The request object
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse getWorkforcemanagementManagementunitUserTimeoffrequest(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a time off request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> getWorkforcemanagementManagementunitUserTimeoffrequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of time off requests for a given user
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(String muId, String userId, Boolean recentlyReviewed) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(muId, userId, recentlyReviewed));
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsWithHttpInfo(String muId, String userId, Boolean recentlyReviewed) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(muId, userId, recentlyReviewed).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(String muId, String userId, Boolean recentlyReviewed) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest.builder()
            .withMuId(muId)
    
            .withUserId(userId)
    
            .withRecentlyReviewed(recentlyReviewed)
    
            .build();
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param request The request object
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequests(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get agents in the management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitUsers(String muId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUsers(createGetWorkforcemanagementManagementunitUsersRequest(muId));
  }

  /**
   * Get agents in the management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersWithHttpInfo(String muId) throws IOException {
    return getWorkforcemanagementManagementunitUsers(createGetWorkforcemanagementManagementunitUsersRequest(muId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUsersRequest createGetWorkforcemanagementManagementunitUsersRequest(String muId) {
    return GetWorkforcemanagementManagementunitUsersRequest.builder()
            .withMuId(muId)
    
            .build();
  }

  /**
   * Get agents in the management unit
   * 
   * @param request The request object
   * @return WfmUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitUsers(GetWorkforcemanagementManagementunitUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmUserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get agents in the management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmUserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get management units
   * 
   * @param pageSize  (optional)
   * @param pageNumber  (optional, default to 1)
   * @param expand  (optional)
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementManagementunits(Integer pageSize, Integer pageNumber, String expand) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunits(createGetWorkforcemanagementManagementunitsRequest(pageSize, pageNumber, expand));
  }

  /**
   * Get management units
   * 
   * @param pageSize  (optional)
   * @param pageNumber  (optional, default to 1)
   * @param expand  (optional)
   * @return ManagementUnitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementManagementunitsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand) throws IOException {
    return getWorkforcemanagementManagementunits(createGetWorkforcemanagementManagementunitsRequest(pageSize, pageNumber, expand).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitsRequest createGetWorkforcemanagementManagementunitsRequest(Integer pageSize, Integer pageNumber, String expand) {
    return GetWorkforcemanagementManagementunitsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get management units
   * 
   * @param request The request object
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementManagementunits(GetWorkforcemanagementManagementunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get management units
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementManagementunits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse patchWorkforcemanagementManagementunitUserTimeoffrequest(String muId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitUserTimeoffrequest(createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId, body));
  }

  /**
   * Update a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> patchWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String muId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) throws IOException {
    return patchWorkforcemanagementManagementunitUserTimeoffrequest(createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(String muId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) {
    return PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.builder()
            .withMuId(muId)
    
            .withUserId(userId)
    
            .withTimeOffRequestId(timeOffRequestId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a time off request
   * 
   * @param request The request object
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse patchWorkforcemanagementManagementunitUserTimeoffrequest(PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a time off request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> patchWorkforcemanagementManagementunitUserTimeoffrequest(ApiRequest<AdminTimeOffRequestPatch> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode postWorkforcemanagementManagementunitActivitycodes(String muId, CreateActivityCodeRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitActivitycodes(createPostWorkforcemanagementManagementunitActivitycodesRequest(muId, body));
  }

  /**
   * Create a new activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ActivityCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCode> postWorkforcemanagementManagementunitActivitycodesWithHttpInfo(String muId, CreateActivityCodeRequest body) throws IOException {
    return postWorkforcemanagementManagementunitActivitycodes(createPostWorkforcemanagementManagementunitActivitycodesRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitActivitycodesRequest createPostWorkforcemanagementManagementunitActivitycodesRequest(String muId, CreateActivityCodeRequest body) {
    return PostWorkforcemanagementManagementunitActivitycodesRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new activity code
   * 
   * @param request The request object
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode postWorkforcemanagementManagementunitActivitycodes(PostWorkforcemanagementManagementunitActivitycodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new activity code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCode> postWorkforcemanagementManagementunitActivitycodes(ApiRequest<CreateActivityCodeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Request a historical adherence report
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementManagementunitHistoricaladherencequery(String muId, WfmHistoricalAdherenceQuery body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitHistoricaladherencequery(createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(muId, body));
  }

  /**
   * Request a historical adherence report
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementManagementunitHistoricaladherencequeryWithHttpInfo(String muId, WfmHistoricalAdherenceQuery body) throws IOException {
    return postWorkforcemanagementManagementunitHistoricaladherencequery(createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(String muId, WfmHistoricalAdherenceQuery body) {
    return PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Request a historical adherence report
   * 
   * @param request The request object
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementManagementunitHistoricaladherencequery(PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalAdherenceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a historical adherence report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementManagementunitHistoricaladherencequery(ApiRequest<WfmHistoricalAdherenceQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalAdherenceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return IntradayResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntradayResponse postWorkforcemanagementManagementunitIntraday(String muId, IntradayQueryDataCommand body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitIntraday(createPostWorkforcemanagementManagementunitIntradayRequest(muId, body));
  }

  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return IntradayResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntradayResponse> postWorkforcemanagementManagementunitIntradayWithHttpInfo(String muId, IntradayQueryDataCommand body) throws IOException {
    return postWorkforcemanagementManagementunitIntraday(createPostWorkforcemanagementManagementunitIntradayRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitIntradayRequest createPostWorkforcemanagementManagementunitIntradayRequest(String muId, IntradayQueryDataCommand body) {
    return PostWorkforcemanagementManagementunitIntradayRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request The request object
   * @return IntradayResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntradayResponse postWorkforcemanagementManagementunitIntraday(PostWorkforcemanagementManagementunitIntradayRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntradayResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntradayResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntradayResponse> postWorkforcemanagementManagementunitIntraday(ApiRequest<IntradayQueryDataCommand> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntradayResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(String muId, UserListScheduleRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(muId, body));
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchWithHttpInfo(String muId, UserListScheduleRequestBody body) throws IOException {
    return postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitSchedulesSearchRequest createPostWorkforcemanagementManagementunitSchedulesSearchRequest(String muId, UserListScheduleRequestBody body) {
    return PostWorkforcemanagementManagementunitSchedulesSearchRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request The request object
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(PostWorkforcemanagementManagementunitSchedulesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserScheduleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearch(ApiRequest<UserListScheduleRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserScheduleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
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
      ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
