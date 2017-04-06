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
   * Get activity codes corresponding to a management unit
   * 
   * @param muId The muId of the management unit. (required)
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(String muId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(muId));
  }

  /**
   * Get activity codes corresponding to a management unit
   * 
   * @param muId The muId of the management unit. (required)
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
   * Get activity codes corresponding to a management unit
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
   * Get activity codes corresponding to a management unit
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
   * Get a time off request by id
   * 
   * @param muId The muId of the management unit. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequest getWorkforcemanagementManagementunitUserTimeoffrequest(String muId, String userId, String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequest(createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId));
  }

  /**
   * Get a time off request by id
   * 
   * @param muId The muId of the management unit. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String muId, String userId, String timeOffRequestId) throws IOException {
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
   * Get a time off request by id
   * 
   * @param request The request object
   * @return TimeOffRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequest getWorkforcemanagementManagementunitUserTimeoffrequest(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a time off request by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementManagementunitUserTimeoffrequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @param muId The muId of the management unit. (required)
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
   * Get a list of time off requests for any user
   * 
   * @param muId The muId of the management unit. (required)
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
   * Get a list of time off requests for any user
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
   * Get a list of time off requests for any user
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
   * @param muId The muId of the management unit. (required)
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
   * @param muId The muId of the management unit. (required)
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
   * @param selector Selector (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return List<ManagementUnit>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<ManagementUnit> getWorkforcemanagementManagementunits(String selector, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunits(createGetWorkforcemanagementManagementunitsRequest(selector, pageSize, pageNumber));
  }

  /**
   * Get management units
   * 
   * @param selector Selector (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return List<ManagementUnit>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<ManagementUnit>> getWorkforcemanagementManagementunitsWithHttpInfo(String selector, Integer pageSize, Integer pageNumber) throws IOException {
    return getWorkforcemanagementManagementunits(createGetWorkforcemanagementManagementunitsRequest(selector, pageSize, pageNumber).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitsRequest createGetWorkforcemanagementManagementunitsRequest(String selector, Integer pageSize, Integer pageNumber) {
    return GetWorkforcemanagementManagementunitsRequest.builder()
            .withSelector(selector)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)
            .build();
  }

  /**
   * Get management units
   * 
   * @param request The request object
   * @return List<ManagementUnit>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<ManagementUnit> getWorkforcemanagementManagementunits(GetWorkforcemanagementManagementunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<ManagementUnit>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<ManagementUnit>>() {});
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
  public ApiResponse<List<ManagementUnit>> getWorkforcemanagementManagementunits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<ManagementUnit>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<ManagementUnit>> response = (ApiResponse<List<ManagementUnit>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<ManagementUnit>> response = (ApiResponse<List<ManagementUnit>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequest getWorkforcemanagementTimeoffrequest(String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementTimeoffrequest(createGetWorkforcemanagementTimeoffrequestRequest(timeOffRequestId));
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementTimeoffrequestWithHttpInfo(String timeOffRequestId) throws IOException {
    return getWorkforcemanagementTimeoffrequest(createGetWorkforcemanagementTimeoffrequestRequest(timeOffRequestId).withHttpInfo());
  }

  private GetWorkforcemanagementTimeoffrequestRequest createGetWorkforcemanagementTimeoffrequestRequest(String timeOffRequestId) {
    return GetWorkforcemanagementTimeoffrequestRequest.builder()
            .withTimeOffRequestId(timeOffRequestId)
            .build();
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @param request The request object
   * @return TimeOffRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequest getWorkforcemanagementTimeoffrequest(GetWorkforcemanagementTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementTimeoffrequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementTimeoffrequests(Boolean recentlyReviewed) throws IOException, ApiException {
    return  getWorkforcemanagementTimeoffrequests(createGetWorkforcemanagementTimeoffrequestsRequest(recentlyReviewed));
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementTimeoffrequestsWithHttpInfo(Boolean recentlyReviewed) throws IOException {
    return getWorkforcemanagementTimeoffrequests(createGetWorkforcemanagementTimeoffrequestsRequest(recentlyReviewed).withHttpInfo());
  }

  private GetWorkforcemanagementTimeoffrequestsRequest createGetWorkforcemanagementTimeoffrequestsRequest(Boolean recentlyReviewed) {
    return GetWorkforcemanagementTimeoffrequestsRequest.builder()
            .withRecentlyReviewed(recentlyReviewed)
            .build();
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param request The request object
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementTimeoffrequests(GetWorkforcemanagementTimeoffrequestsRequest request) throws IOException, ApiException {
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
   * Get a list of time off requests for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementTimeoffrequests(ApiRequest<Void> request) throws IOException {
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
   * Mark a time off request for the current user as read or unread
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWorkforcemanagementTimeoffrequest(String timeOffRequestId, TimeOffRequestPatch body) throws IOException, ApiException {
     patchWorkforcemanagementTimeoffrequest(createPatchWorkforcemanagementTimeoffrequestRequest(timeOffRequestId, body));
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWorkforcemanagementTimeoffrequestWithHttpInfo(String timeOffRequestId, TimeOffRequestPatch body) throws IOException {
    return patchWorkforcemanagementTimeoffrequest(createPatchWorkforcemanagementTimeoffrequestRequest(timeOffRequestId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementTimeoffrequestRequest createPatchWorkforcemanagementTimeoffrequestRequest(String timeOffRequestId, TimeOffRequestPatch body) {
    return PatchWorkforcemanagementTimeoffrequestRequest.builder()
            .withTimeOffRequestId(timeOffRequestId)

            .withBody(body)
            .build();
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWorkforcemanagementTimeoffrequest(PatchWorkforcemanagementTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWorkforcemanagementTimeoffrequest(ApiRequest<TimeOffRequestPatch> request) throws IOException {
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
   * Get user schedules within the given time range
   * 
   * @param muId The muId of the management unit. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(String muId, UserListScheduleRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(muId, body));
  }

  /**
   * Get user schedules within the given time range
   * 
   * @param muId The muId of the management unit. (required)
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
   * Get user schedules within the given time range
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
   * Get user schedules within the given time range
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

  /**
   * Get a schedule for the current user
   * 
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementSchedules(CurrentUserScheduleRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementSchedules(createPostWorkforcemanagementSchedulesRequest(body));
  }

  /**
   * Get a schedule for the current user
   * 
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementSchedulesWithHttpInfo(CurrentUserScheduleRequestBody body) throws IOException {
    return postWorkforcemanagementSchedules(createPostWorkforcemanagementSchedulesRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementSchedulesRequest createPostWorkforcemanagementSchedulesRequest(CurrentUserScheduleRequestBody body) {
    return PostWorkforcemanagementSchedulesRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Get a schedule for the current user
   * 
   * @param request The request object
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementSchedules(PostWorkforcemanagementSchedulesRequest request) throws IOException, ApiException {
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
   * Get a schedule for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementSchedules(ApiRequest<CurrentUserScheduleRequestBody> request) throws IOException {
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
