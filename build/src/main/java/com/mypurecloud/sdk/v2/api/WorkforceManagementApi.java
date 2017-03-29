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
   * @throws ApiException if fails to make API call
   */
  public List<UserScheduleAdherence> getWorkforcemanagementAdherence(List<String> userId) throws ApiException {
    return getWorkforcemanagementAdherenceWithHttpInfo(userId).getBody();
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param userId User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request (required)
   * @return List<UserScheduleAdherence>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UserScheduleAdherence>> getWorkforcemanagementAdherenceWithHttpInfo(List<String> userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getWorkforcemanagementAdherence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/adherence".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "userId", userId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<UserScheduleAdherence>>() {});
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<UserScheduleAdherence> getWorkforcemanagementAdherence(GetWorkforcemanagementAdherenceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<UserScheduleAdherence>>() {});
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<UserScheduleAdherence>> getWorkforcemanagementAdherence(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<UserScheduleAdherence>>invokeAPIVerbose(request, new TypeReference<List<UserScheduleAdherence>>() {});
  }

  /**
   * Get activity codes corresponding to a management unit
   * 
   * @param muId The muId of the management unit. (required)
   * @return ActivityCodeContainer
   * @throws ApiException if fails to make API call
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(String muId) throws ApiException {
    return getWorkforcemanagementManagementunitActivitycodesWithHttpInfo(muId).getBody();
  }

  /**
   * Get activity codes corresponding to a management unit
   * 
   * @param muId The muId of the management unit. (required)
   * @return ActivityCodeContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesWithHttpInfo(String muId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'muId' is set
    if (muId == null) {
      throw new ApiException(400, "Missing the required parameter 'muId' when calling getWorkforcemanagementManagementunitActivitycodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/managementunits/{muId}/activitycodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "muId" + "\\}", pcapiClient.escapeString(muId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ActivityCodeContainer>() {});
  }

  /**
   * Get activity codes corresponding to a management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(GetWorkforcemanagementManagementunitActivitycodesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ActivityCodeContainer>() {});
  }

  /**
   * Get activity codes corresponding to a management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodes(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<ActivityCodeContainer>invokeAPIVerbose(request, new TypeReference<ActivityCodeContainer>() {});
  }

  /**
   * Get a time off request by id
   * 
   * @param muId The muId of the management unit. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequest getWorkforcemanagementManagementunitUserTimeoffrequest(String muId, String userId, String timeOffRequestId) throws ApiException {
    return getWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(muId, userId, timeOffRequestId).getBody();
  }

  /**
   * Get a time off request by id
   * 
   * @param muId The muId of the management unit. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String muId, String userId, String timeOffRequestId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'muId' is set
    if (muId == null) {
      throw new ApiException(400, "Missing the required parameter 'muId' when calling getWorkforcemanagementManagementunitUserTimeoffrequest");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getWorkforcemanagementManagementunitUserTimeoffrequest");
    }
    
    // verify the required parameter 'timeOffRequestId' is set
    if (timeOffRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'timeOffRequestId' when calling getWorkforcemanagementManagementunitUserTimeoffrequest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/managementunits/{muId}/users/{userId}/timeoffrequests/{timeOffRequestId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "muId" + "\\}", pcapiClient.escapeString(muId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "timeOffRequestId" + "\\}", pcapiClient.escapeString(timeOffRequestId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TimeOffRequest>() {});
  }

  /**
   * Get a time off request by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequest getWorkforcemanagementManagementunitUserTimeoffrequest(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {});
  }

  /**
   * Get a time off request by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementManagementunitUserTimeoffrequest(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TimeOffRequest>invokeAPIVerbose(request, new TypeReference<TimeOffRequest>() {});
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @param muId The muId of the management unit. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(String muId, String userId, Boolean recentlyReviewed) throws ApiException {
    return getWorkforcemanagementManagementunitUserTimeoffrequestsWithHttpInfo(muId, userId, recentlyReviewed).getBody();
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @param muId The muId of the management unit. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsWithHttpInfo(String muId, String userId, Boolean recentlyReviewed) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'muId' is set
    if (muId == null) {
      throw new ApiException(400, "Missing the required parameter 'muId' when calling getWorkforcemanagementManagementunitUserTimeoffrequests");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getWorkforcemanagementManagementunitUserTimeoffrequests");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/managementunits/{muId}/users/{userId}/timeoffrequests".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "muId" + "\\}", pcapiClient.escapeString(muId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "recentlyReviewed", recentlyReviewed));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TimeOffRequestList>() {});
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {});
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequests(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TimeOffRequestList>invokeAPIVerbose(request, new TypeReference<TimeOffRequestList>() {});
  }

  /**
   * Get agents in the management unit
   * 
   * @param muId The muId of the management unit. (required)
   * @return WfmUserEntityListing
   * @throws ApiException if fails to make API call
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitUsers(String muId) throws ApiException {
    return getWorkforcemanagementManagementunitUsersWithHttpInfo(muId).getBody();
  }

  /**
   * Get agents in the management unit
   * 
   * @param muId The muId of the management unit. (required)
   * @return WfmUserEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersWithHttpInfo(String muId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'muId' is set
    if (muId == null) {
      throw new ApiException(400, "Missing the required parameter 'muId' when calling getWorkforcemanagementManagementunitUsers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/managementunits/{muId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "muId" + "\\}", pcapiClient.escapeString(muId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WfmUserEntityListing>() {});
  }

  /**
   * Get agents in the management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitUsers(GetWorkforcemanagementManagementunitUsersRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {});
  }

  /**
   * Get agents in the management unit
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitUsers(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<WfmUserEntityListing>invokeAPIVerbose(request, new TypeReference<WfmUserEntityListing>() {});
  }

  /**
   * Get management units
   * 
   * @param selector Selector (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return List<ManagementUnit>
   * @throws ApiException if fails to make API call
   */
  public List<ManagementUnit> getWorkforcemanagementManagementunits(String selector, Integer pageSize, Integer pageNumber) throws ApiException {
    return getWorkforcemanagementManagementunitsWithHttpInfo(selector, pageSize, pageNumber).getBody();
  }

  /**
   * Get management units
   * 
   * @param selector Selector (optional)
   * @param pageSize  (optional, default to 25)
   * @param pageNumber  (optional, default to 1)
   * @return List<ManagementUnit>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ManagementUnit>> getWorkforcemanagementManagementunitsWithHttpInfo(String selector, Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/managementunits".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "selector", selector));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<ManagementUnit>>() {});
  }

  /**
   * Get management units
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<ManagementUnit> getWorkforcemanagementManagementunits(GetWorkforcemanagementManagementunitsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<ManagementUnit>>() {});
  }

  /**
   * Get management units
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ManagementUnit>> getWorkforcemanagementManagementunits(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<ManagementUnit>>invokeAPIVerbose(request, new TypeReference<List<ManagementUnit>>() {});
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequest getWorkforcemanagementTimeoffrequest(String timeOffRequestId) throws ApiException {
    return getWorkforcemanagementTimeoffrequestWithHttpInfo(timeOffRequestId).getBody();
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequest
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementTimeoffrequestWithHttpInfo(String timeOffRequestId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'timeOffRequestId' is set
    if (timeOffRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'timeOffRequestId' when calling getWorkforcemanagementTimeoffrequest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "timeOffRequestId" + "\\}", pcapiClient.escapeString(timeOffRequestId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TimeOffRequest>() {});
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequest getWorkforcemanagementTimeoffrequest(GetWorkforcemanagementTimeoffrequestRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {});
  }

  /**
   * Get a time off request for the current user by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequest> getWorkforcemanagementTimeoffrequest(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TimeOffRequest>invokeAPIVerbose(request, new TypeReference<TimeOffRequest>() {});
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequestList getWorkforcemanagementTimeoffrequests(Boolean recentlyReviewed) throws ApiException {
    return getWorkforcemanagementTimeoffrequestsWithHttpInfo(recentlyReviewed).getBody();
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementTimeoffrequestsWithHttpInfo(Boolean recentlyReviewed) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/timeoffrequests".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "recentlyReviewed", recentlyReviewed));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<TimeOffRequestList>() {});
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public TimeOffRequestList getWorkforcemanagementTimeoffrequests(GetWorkforcemanagementTimeoffrequestsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {});
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementTimeoffrequests(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<TimeOffRequestList>invokeAPIVerbose(request, new TypeReference<TimeOffRequestList>() {});
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public void patchWorkforcemanagementTimeoffrequest(String timeOffRequestId, TimeOffRequestPatch body) throws ApiException {
    patchWorkforcemanagementTimeoffrequestWithHttpInfo(timeOffRequestId, body);
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchWorkforcemanagementTimeoffrequestWithHttpInfo(String timeOffRequestId, TimeOffRequestPatch body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'timeOffRequestId' is set
    if (timeOffRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'timeOffRequestId' when calling patchWorkforcemanagementTimeoffrequest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "timeOffRequestId" + "\\}", pcapiClient.escapeString(timeOffRequestId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void patchWorkforcemanagementTimeoffrequest(PatchWorkforcemanagementTimeoffrequestRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Mark a time off request for the current user as read or unread
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> patchWorkforcemanagementTimeoffrequest(ApiRequest<TimeOffRequestPatch> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get user schedules within the given time range
   * 
   * @param muId The muId of the management unit. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if fails to make API call
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(String muId, UserListScheduleRequestBody body) throws ApiException {
    return postWorkforcemanagementManagementunitSchedulesSearchWithHttpInfo(muId, body).getBody();
  }

  /**
   * Get user schedules within the given time range
   * 
   * @param muId The muId of the management unit. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchWithHttpInfo(String muId, UserListScheduleRequestBody body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'muId' is set
    if (muId == null) {
      throw new ApiException(400, "Missing the required parameter 'muId' when calling postWorkforcemanagementManagementunitSchedulesSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/managementunits/{muId}/schedules/search".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "muId" + "\\}", pcapiClient.escapeString(muId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserScheduleContainer>() {});
  }

  /**
   * Get user schedules within the given time range
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(PostWorkforcemanagementManagementunitSchedulesSearchRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {});
  }

  /**
   * Get user schedules within the given time range
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearch(ApiRequest<UserListScheduleRequestBody> request) throws ApiException {
    return pcapiClient.<UserScheduleContainer>invokeAPIVerbose(request, new TypeReference<UserScheduleContainer>() {});
  }

  /**
   * Get a schedule for the current user
   * 
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if fails to make API call
   */
  public UserScheduleContainer postWorkforcemanagementSchedules(CurrentUserScheduleRequestBody body) throws ApiException {
    return postWorkforcemanagementSchedulesWithHttpInfo(body).getBody();
  }

  /**
   * Get a schedule for the current user
   * 
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementSchedulesWithHttpInfo(CurrentUserScheduleRequestBody body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/workforcemanagement/schedules".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserScheduleContainer>() {});
  }

  /**
   * Get a schedule for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserScheduleContainer postWorkforcemanagementSchedules(PostWorkforcemanagementSchedulesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {});
  }

  /**
   * Get a schedule for the current user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementSchedules(ApiRequest<CurrentUserScheduleRequestBody> request) throws ApiException {
    return pcapiClient.<UserScheduleContainer>invokeAPIVerbose(request, new TypeReference<UserScheduleContainer>() {});
  }

}
