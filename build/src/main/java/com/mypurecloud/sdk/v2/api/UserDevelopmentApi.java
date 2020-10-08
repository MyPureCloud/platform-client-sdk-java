package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.DevelopmentActivityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.DevelopmentActivity;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateResponse;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateParam;


import com.mypurecloud.sdk.v2.api.request.GetUsersDevelopmentActivitiesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersDevelopmentActivitiesMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersDevelopmentActivityRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersDevelopmentActivitiesAggregatesQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDevelopmentApi {
  private final ApiClient pcapiClient;

  public UserDevelopmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserDevelopmentApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId. (optional)
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned. (optional)
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivities(List<String> userId, String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException, ApiException {
    return  getUsersDevelopmentActivities(createGetUsersDevelopmentActivitiesRequest(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship));
  }

  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param userId Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId. (optional)
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned. (optional)
   * @return DevelopmentActivityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivitiesWithHttpInfo(List<String> userId, String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException {
    return getUsersDevelopmentActivities(createGetUsersDevelopmentActivitiesRequest(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship).withHttpInfo());
  }

  private GetUsersDevelopmentActivitiesRequest createGetUsersDevelopmentActivitiesRequest(List<String> userId, String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) {
    return GetUsersDevelopmentActivitiesRequest.builder()
            .withUserId(userId)
    
            .withModuleId(moduleId)
    
            .withInterval(interval)
    
            .withCompletionInterval(completionInterval)
    
            .withOverdue(overdue)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withTypes(types)
    
            .withStatuses(statuses)
    
            .withRelationship(relationship)
    
            .build();
  }

  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivities(GetUsersDevelopmentActivitiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of Development Activities
   * Either moduleId or userId is required. Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivities(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned. (optional)
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivitiesMe(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException, ApiException {
    return  getUsersDevelopmentActivitiesMe(createGetUsersDevelopmentActivitiesMeRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship));
  }

  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param moduleId Specifies the ID of the learning module. (optional)
   * @param interval Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param completionInterval Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional)
   * @param overdue Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned (optional, default to Any)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc) (optional, default to Desc)
   * @param types Specifies the activity types. (optional)
   * @param statuses Specifies the activity statuses to filter by (optional)
   * @param relationship Specifies how the current user relation should be interpreted, and filters the activities returned to only those that have the specified relationship. If not specified, all relationships are returned. (optional)
   * @return DevelopmentActivityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivitiesMeWithHttpInfo(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) throws IOException {
    return getUsersDevelopmentActivitiesMe(createGetUsersDevelopmentActivitiesMeRequest(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship).withHttpInfo());
  }

  private GetUsersDevelopmentActivitiesMeRequest createGetUsersDevelopmentActivitiesMeRequest(String moduleId, String interval, String completionInterval, String overdue, Integer pageSize, Integer pageNumber, String sortOrder, List<String> types, List<String> statuses, List<String> relationship) {
    return GetUsersDevelopmentActivitiesMeRequest.builder()
            .withModuleId(moduleId)
    
            .withInterval(interval)
    
            .withCompletionInterval(completionInterval)
    
            .withOverdue(overdue)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withTypes(types)
    
            .withStatuses(statuses)
    
            .withRelationship(relationship)
    
            .build();
  }

  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return DevelopmentActivityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityListing getUsersDevelopmentActivitiesMe(GetUsersDevelopmentActivitiesMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of Development Activities for current user
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityListing> getUsersDevelopmentActivitiesMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivityListing> response = (ApiResponse<DevelopmentActivityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Development Activity
   * 
   * @param activityId Specifies the activity ID, maps to either assignment or appointment ID (required)
   * @param type Specifies the activity type. (required)
   * @return DevelopmentActivity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivity getUsersDevelopmentActivity(String activityId, String type) throws IOException, ApiException {
    return  getUsersDevelopmentActivity(createGetUsersDevelopmentActivityRequest(activityId, type));
  }

  /**
   * Get a Development Activity
   * 
   * @param activityId Specifies the activity ID, maps to either assignment or appointment ID (required)
   * @param type Specifies the activity type. (required)
   * @return DevelopmentActivity
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivity> getUsersDevelopmentActivityWithHttpInfo(String activityId, String type) throws IOException {
    return getUsersDevelopmentActivity(createGetUsersDevelopmentActivityRequest(activityId, type).withHttpInfo());
  }

  private GetUsersDevelopmentActivityRequest createGetUsersDevelopmentActivityRequest(String activityId, String type) {
    return GetUsersDevelopmentActivityRequest.builder()
            .withActivityId(activityId)
    
            .withType(type)
    
            .build();
  }

  /**
   * Get a Development Activity
   * 
   * @param request The request object
   * @return DevelopmentActivity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivity getUsersDevelopmentActivity(GetUsersDevelopmentActivityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivity> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivity>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Development Activity
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivity> getUsersDevelopmentActivity(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivity>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivity> response = (ApiResponse<DevelopmentActivity>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivity> response = (ApiResponse<DevelopmentActivity>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param body Aggregate Request (required)
   * @return DevelopmentActivityAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityAggregateResponse postUsersDevelopmentActivitiesAggregatesQuery(DevelopmentActivityAggregateParam body) throws IOException, ApiException {
    return  postUsersDevelopmentActivitiesAggregatesQuery(createPostUsersDevelopmentActivitiesAggregatesQueryRequest(body));
  }

  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param body Aggregate Request (required)
   * @return DevelopmentActivityAggregateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityAggregateResponse> postUsersDevelopmentActivitiesAggregatesQueryWithHttpInfo(DevelopmentActivityAggregateParam body) throws IOException {
    return postUsersDevelopmentActivitiesAggregatesQuery(createPostUsersDevelopmentActivitiesAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostUsersDevelopmentActivitiesAggregatesQueryRequest createPostUsersDevelopmentActivitiesAggregatesQueryRequest(DevelopmentActivityAggregateParam body) {
    return PostUsersDevelopmentActivitiesAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return DevelopmentActivityAggregateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DevelopmentActivityAggregateResponse postUsersDevelopmentActivitiesAggregatesQuery(PostUsersDevelopmentActivitiesAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DevelopmentActivityAggregateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DevelopmentActivityAggregateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve aggregated development activity data
   * Results are filtered based on the applicable permissions.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DevelopmentActivityAggregateResponse> postUsersDevelopmentActivitiesAggregatesQuery(ApiRequest<DevelopmentActivityAggregateParam> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DevelopmentActivityAggregateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DevelopmentActivityAggregateResponse> response = (ApiResponse<DevelopmentActivityAggregateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<DevelopmentActivityAggregateResponse> response = (ApiResponse<DevelopmentActivityAggregateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
