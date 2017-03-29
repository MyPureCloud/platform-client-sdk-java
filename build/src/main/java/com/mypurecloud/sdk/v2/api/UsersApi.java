package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.CallForwarding;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.UserStations;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.CreateUser;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserStationAssociatedstationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserStationDefaultstationRequest;
import com.mypurecloud.sdk.v2.api.request.GetFieldconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserAdjacentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserCallforwardingRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserDirectreportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserFavoritesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGeolocationRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserOutofofficeRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserProfileskillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserStationRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserSuperiorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserCallforwardingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserGeolocationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserCallforwardingRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserOutofofficeRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserProfileskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingstatusRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserStationAssociatedstationStationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserStationDefaultstationStationIdRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsersApi {
  private final ApiClient pcapiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete user
   * 
   * @param userId User ID (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteUser(String userId) throws ApiException {
    return deleteUserWithHttpInfo(userId).getBody();
  }

  /**
   * Delete user
   * 
   * @param userId User ID (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteUserWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Delete user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteUser(DeleteUserRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Delete user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteUser(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Removes all the roles from the user.
   * 
   * @param userId User ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserRoles(String userId) throws ApiException {
    deleteUserRolesWithHttpInfo(userId);
  }

  /**
   * Removes all the roles from the user.
   * 
   * @param userId User ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserRolesWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserRoles");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/roles".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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
   * Removes all the roles from the user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteUserRoles(DeleteUserRolesRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Removes all the roles from the user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserRoles(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteUserRoutingskill(String userId, String skillId) throws ApiException {
    return deleteUserRoutingskillWithHttpInfo(userId, skillId).getBody();
  }

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteUserRoutingskillWithHttpInfo(String userId, String skillId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserRoutingskill");
    }
    
    // verify the required parameter 'skillId' is set
    if (skillId == null) {
      throw new ApiException(400, "Missing the required parameter 'skillId' when calling deleteUserRoutingskill");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills/{skillId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "skillId" + "\\}", pcapiClient.escapeString(skillId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteUserRoutingskill(DeleteUserRoutingskillRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteUserRoutingskill(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserStationAssociatedstation(String userId) throws ApiException {
    deleteUserStationAssociatedstationWithHttpInfo(userId);
  }

  /**
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserStationAssociatedstationWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserStationAssociatedstation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/station/associatedstation".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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
   * Clear associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteUserStationAssociatedstation(DeleteUserStationAssociatedstationRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Clear associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserStationAssociatedstation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Clear default station
   * 
   * @param userId User ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserStationDefaultstation(String userId) throws ApiException {
    deleteUserStationDefaultstationWithHttpInfo(userId);
  }

  /**
   * Clear default station
   * 
   * @param userId User ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserStationDefaultstationWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserStationDefaultstation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/station/defaultstation".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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
   * Clear default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteUserStationDefaultstation(DeleteUserStationDefaultstationRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Clear default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteUserStationDefaultstation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if fails to make API call
   */
  public FieldConfig getFieldconfig(String type) throws ApiException {
    return getFieldconfigWithHttpInfo(type).getBody();
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldConfig> getFieldconfigWithHttpInfo(String type) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getFieldconfig");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fieldconfig".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "type", type));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FieldConfig>() {});
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FieldConfig getFieldconfig(GetFieldconfigRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FieldConfig>() {});
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldConfig> getFieldconfig(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<FieldConfig>invokeAPIVerbose(request, new TypeReference<FieldConfig>() {});
  }

  /**
   * Get user.
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUser(String userId, List<String> expand) throws ApiException {
    return getUserWithHttpInfo(userId, expand).getBody();
  }

  /**
   * Get user.
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUserWithHttpInfo(String userId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<User>() {});
  }

  /**
   * Get user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public User getUser(GetUserRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<User>() {});
  }

  /**
   * Get user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> getUser(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<User>invokeAPIVerbose(request, new TypeReference<User>() {});
  }

  /**
   * Get adjacents
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Adjacents
   * @throws ApiException if fails to make API call
   */
  public Adjacents getUserAdjacents(String userId, List<String> expand) throws ApiException {
    return getUserAdjacentsWithHttpInfo(userId, expand).getBody();
  }

  /**
   * Get adjacents
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Adjacents
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Adjacents> getUserAdjacentsWithHttpInfo(String userId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserAdjacents");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/adjacents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Adjacents>() {});
  }

  /**
   * Get adjacents
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Adjacents getUserAdjacents(GetUserAdjacentsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Adjacents>() {});
  }

  /**
   * Get adjacents
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Adjacents> getUserAdjacents(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Adjacents>invokeAPIVerbose(request, new TypeReference<Adjacents>() {});
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return CallForwarding
   * @throws ApiException if fails to make API call
   */
  public CallForwarding getUserCallforwarding(String userId) throws ApiException {
    return getUserCallforwardingWithHttpInfo(userId).getBody();
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return CallForwarding
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallForwarding> getUserCallforwardingWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserCallforwarding");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/callforwarding".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallForwarding>() {});
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallForwarding getUserCallforwarding(GetUserCallforwardingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallForwarding> getUserCallforwarding(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIVerbose(request, new TypeReference<CallForwarding>() {});
  }

  /**
   * Get direct reports
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if fails to make API call
   */
  public List<User> getUserDirectreports(String userId, List<String> expand) throws ApiException {
    return getUserDirectreportsWithHttpInfo(userId, expand).getBody();
  }

  /**
   * Get direct reports
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<User>> getUserDirectreportsWithHttpInfo(String userId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserDirectreports");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/directreports".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<User>>() {});
  }

  /**
   * Get direct reports
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<User> getUserDirectreports(GetUserDirectreportsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<User>>() {});
  }

  /**
   * Get direct reports
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<User>> getUserDirectreports(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<User>>invokeAPIVerbose(request, new TypeReference<List<User>>() {});
  }

  /**
   * Get favorites
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserEntityListing getUserFavorites(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws ApiException {
    return getUserFavoritesWithHttpInfo(userId, pageSize, pageNumber, sortOrder, expand).getBody();
  }

  /**
   * Get favorites
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserEntityListing> getUserFavoritesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserFavorites");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/favorites".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get favorites
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserEntityListing getUserFavorites(GetUserFavoritesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get favorites
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserEntityListing> getUserFavorites(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserEntityListing>invokeAPIVerbose(request, new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public Geolocation getUserGeolocation(String userId, String clientId) throws ApiException {
    return getUserGeolocationWithHttpInfo(userId, clientId).getBody();
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> getUserGeolocationWithHttpInfo(String userId, String clientId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserGeolocation");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getUserGeolocation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/geolocations/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Geolocation>() {});
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Geolocation getUserGeolocation(GetUserGeolocationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Geolocation>() {});
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> getUserGeolocation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerbose(request, new TypeReference<Geolocation>() {});
  }

  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return OutOfOffice
   * @throws ApiException if fails to make API call
   */
  public OutOfOffice getUserOutofoffice(String userId) throws ApiException {
    return getUserOutofofficeWithHttpInfo(userId).getBody();
  }

  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return OutOfOffice
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutOfOffice> getUserOutofofficeWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserOutofoffice");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/outofoffice".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutOfOffice>() {});
  }

  /**
   * Get a OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutOfOffice getUserOutofoffice(GetUserOutofofficeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutOfOffice>() {});
  }

  /**
   * Get a OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutOfOffice> getUserOutofoffice(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OutOfOffice>invokeAPIVerbose(request, new TypeReference<OutOfOffice>() {});
  }

  /**
   * List profile skills for a user
   * 
   * @param userId User ID (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getUserProfileskills(String userId) throws ApiException {
    return getUserProfileskillsWithHttpInfo(userId).getBody();
  }

  /**
   * List profile skills for a user
   * 
   * @param userId User ID (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getUserProfileskillsWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserProfileskills");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/profileskills".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<String>>() {});
  }

  /**
   * List profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<String> getUserProfileskills(GetUserProfileskillsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<String>>() {});
  }

  /**
   * List profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getUserProfileskills(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerbose(request, new TypeReference<List<String>>() {});
  }

  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @return UserQueueEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserQueueEntityListing getUserQueues(String userId, Integer pageSize, Integer pageNumber, Boolean joined) throws ApiException {
    return getUserQueuesWithHttpInfo(userId, pageSize, pageNumber, joined).getBody();
  }

  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @return UserQueueEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserQueueEntityListing> getUserQueuesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, Boolean joined) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserQueues");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/queues".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "joined", joined));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserQueueEntityListing>() {});
  }

  /**
   * Get queues for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserQueueEntityListing getUserQueues(GetUserQueuesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
  }

  /**
   * Get queues for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserQueueEntityListing> getUserQueues(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserQueueEntityListing>invokeAPIVerbose(request, new TypeReference<UserQueueEntityListing>() {});
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return UserAuthorization
   * @throws ApiException if fails to make API call
   */
  public UserAuthorization getUserRoles(String userId) throws ApiException {
    return getUserRolesWithHttpInfo(userId).getBody();
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return UserAuthorization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAuthorization> getUserRolesWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserRoles");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/roles".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserAuthorization>() {});
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserAuthorization getUserRoles(GetUserRolesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserAuthorization>() {});
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAuthorization> getUserRoles(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserAuthorization>invokeAPIVerbose(request, new TypeReference<UserAuthorization>() {});
  }

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserSkillEntityListing getUserRoutingskills(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws ApiException {
    return getUserRoutingskillsWithHttpInfo(userId, pageSize, pageNumber, sortOrder).getBody();
  }

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskillsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserRoutingskills");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserSkillEntityListing>() {});
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserSkillEntityListing getUserRoutingskills(GetUserRoutingskillsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskills(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserSkillEntityListing>invokeAPIVerbose(request, new TypeReference<UserSkillEntityListing>() {});
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return RoutingStatus
   * @throws ApiException if fails to make API call
   */
  public RoutingStatus getUserRoutingstatus(String userId) throws ApiException {
    return getUserRoutingstatusWithHttpInfo(userId).getBody();
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return RoutingStatus
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatus> getUserRoutingstatusWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserRoutingstatus");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingstatus".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatus>() {});
  }

  /**
   * Fetch the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatus getUserRoutingstatus(GetUserRoutingstatusRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatus>() {});
  }

  /**
   * Fetch the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatus> getUserRoutingstatus(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<RoutingStatus>invokeAPIVerbose(request, new TypeReference<RoutingStatus>() {});
  }

  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return UserStations
   * @throws ApiException if fails to make API call
   */
  public UserStations getUserStation(String userId) throws ApiException {
    return getUserStationWithHttpInfo(userId).getBody();
  }

  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return UserStations
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserStations> getUserStationWithHttpInfo(String userId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserStation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/station".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserStations>() {});
  }

  /**
   * Get station information for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserStations getUserStation(GetUserStationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserStations>() {});
  }

  /**
   * Get station information for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserStations> getUserStation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserStations>invokeAPIVerbose(request, new TypeReference<UserStations>() {});
  }

  /**
   * Get superiors
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if fails to make API call
   */
  public List<User> getUserSuperiors(String userId, List<String> expand) throws ApiException {
    return getUserSuperiorsWithHttpInfo(userId, expand).getBody();
  }

  /**
   * Get superiors
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<User>> getUserSuperiorsWithHttpInfo(String userId, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserSuperiors");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/superiors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<User>>() {});
  }

  /**
   * Get superiors
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<User> getUserSuperiors(GetUserSuperiorsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<User>>() {});
  }

  /**
   * Get superiors
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<User>> getUserSuperiors(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<List<User>>invokeAPIVerbose(request, new TypeReference<List<User>>() {});
  }

  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserEntityListing getUsers(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder, List<String> expand) throws ApiException {
    return getUsersWithHttpInfo(pageSize, pageNumber, id, sortOrder, expand).getBody();
  }

  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserEntityListing> getUsersWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "id", id));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get the list of available users.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserEntityListing getUsers(GetUsersRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get the list of available users.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserEntityListing> getUsers(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserEntityListing>invokeAPIVerbose(request, new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserMe
   * @throws ApiException if fails to make API call
   */
  public UserMe getUsersMe(List<String> expand) throws ApiException {
    return getUsersMeWithHttpInfo(expand).getBody();
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserMe
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserMe> getUsersMeWithHttpInfo(List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/me".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserMe>() {});
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserMe getUsersMe(GetUsersMeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserMe>() {});
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserMe> getUsersMe(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UserMe>invokeAPIVerbose(request, new TypeReference<UserMe>() {});
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse getUsersSearch(String q64, List<String> expand) throws ApiException {
    return getUsersSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> getUsersSearchWithHttpInfo(String q64, List<String> expand) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new ApiException(400, "Missing the required parameter 'q64' when calling getUsersSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse getUsersSearch(GetUsersSearchRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> getUsersSearch(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerbose(request, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User patchUser(String userId, User body) throws ApiException {
    return patchUserWithHttpInfo(userId, body).getBody();
  }

  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> patchUserWithHttpInfo(String userId, User body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUser");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchUser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<User>() {});
  }

  /**
   * Update user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public User patchUser(PatchUserRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<User>() {});
  }

  /**
   * Update user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> patchUser(ApiRequest<User> request) throws ApiException {
    return pcapiClient.<User>invokeAPIVerbose(request, new TypeReference<User>() {});
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if fails to make API call
   */
  public CallForwarding patchUserCallforwarding(String userId, CallForwarding body) throws ApiException {
    return patchUserCallforwardingWithHttpInfo(userId, body).getBody();
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallForwarding> patchUserCallforwardingWithHttpInfo(String userId, CallForwarding body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUserCallforwarding");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchUserCallforwarding");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/callforwarding".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallForwarding>() {});
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallForwarding patchUserCallforwarding(PatchUserCallforwardingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallForwarding> patchUserCallforwarding(ApiRequest<CallForwarding> request) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIVerbose(request, new TypeReference<CallForwarding>() {});
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public Geolocation patchUserGeolocation(String userId, String clientId, Geolocation body) throws ApiException {
    return patchUserGeolocationWithHttpInfo(userId, clientId, body).getBody();
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> patchUserGeolocationWithHttpInfo(String userId, String clientId, Geolocation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUserGeolocation");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling patchUserGeolocation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchUserGeolocation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/geolocations/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Geolocation>() {});
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Geolocation patchUserGeolocation(PatchUserGeolocationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Geolocation>() {});
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> patchUserGeolocation(ApiRequest<Geolocation> request) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerbose(request, new TypeReference<Geolocation>() {});
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws ApiException if fails to make API call
   */
  public UserQueue patchUserQueue(String queueId, String userId, UserQueue body) throws ApiException {
    return patchUserQueueWithHttpInfo(queueId, userId, body).getBody();
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserQueue> patchUserQueueWithHttpInfo(String queueId, String userId, UserQueue body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new ApiException(400, "Missing the required parameter 'queueId' when calling patchUserQueue");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUserQueue");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchUserQueue");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/queues/{queueId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserQueue>() {});
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserQueue patchUserQueue(PatchUserQueueRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserQueue>() {});
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserQueue> patchUserQueue(ApiRequest<UserQueue> request) throws ApiException {
    return pcapiClient.<UserQueue>invokeAPIVerbose(request, new TypeReference<UserQueue>() {});
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @return UserQueueEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserQueueEntityListing patchUserQueues(String userId, List<UserQueue> body) throws ApiException {
    return patchUserQueuesWithHttpInfo(userId, body).getBody();
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @return UserQueueEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueuesWithHttpInfo(String userId, List<UserQueue> body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUserQueues");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchUserQueues");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/queues".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserQueueEntityListing>() {});
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserQueueEntityListing patchUserQueues(PatchUserQueuesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueues(ApiRequest<List<UserQueue>> request) throws ApiException {
    return pcapiClient.<UserQueueEntityListing>invokeAPIVerbose(request, new TypeReference<UserQueueEntityListing>() {});
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws ApiException if fails to make API call
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(AggregationQuery body) throws ApiException {
    return postAnalyticsUsersAggregatesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQueryWithHttpInfo(AggregationQuery body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAnalyticsUsersAggregatesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/users/aggregates/query".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PresenceQueryResponse>() {});
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(PostAnalyticsUsersAggregatesQueryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PresenceQueryResponse>() {});
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQuery(ApiRequest<AggregationQuery> request) throws ApiException {
    return pcapiClient.<PresenceQueryResponse>invokeAPIVerbose(request, new TypeReference<PresenceQueryResponse>() {});
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(UserDetailsQuery body) throws ApiException {
    return postAnalyticsUsersDetailsQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryWithHttpInfo(UserDetailsQuery body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAnalyticsUsersDetailsQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/users/details/query".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(PostAnalyticsUsersDetailsQueryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQuery(ApiRequest<UserDetailsQuery> request) throws ApiException {
    return pcapiClient.<AnalyticsUserDetailsQueryResponse>invokeAPIVerbose(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(ObservationQuery body) throws ApiException {
    return postAnalyticsUsersObservationsQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQueryWithHttpInfo(ObservationQuery body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAnalyticsUsersObservationsQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/users/observations/query".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ObservationQueryResponse>() {});
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(PostAnalyticsUsersObservationsQueryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ObservationQueryResponse>() {});
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQuery(ApiRequest<ObservationQuery> request) throws ApiException {
    return pcapiClient.<ObservationQueryResponse>invokeAPIVerbose(request, new TypeReference<ObservationQueryResponse>() {});
  }

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill postUserRoutingskills(String userId, UserRoutingSkillPost body) throws ApiException {
    return postUserRoutingskillsWithHttpInfo(userId, body).getBody();
  }

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskillsWithHttpInfo(String userId, UserRoutingSkillPost body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling postUserRoutingskills");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postUserRoutingskills");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill postUserRoutingskills(PostUserRoutingskillsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskills(ApiRequest<UserRoutingSkillPost> request) throws ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerbose(request, new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Create user
   * 
   * @param body User (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User postUsers(CreateUser body) throws ApiException {
    return postUsersWithHttpInfo(body).getBody();
  }

  /**
   * Create user
   * 
   * @param body User (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> postUsersWithHttpInfo(CreateUser body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postUsers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<User>() {});
  }

  /**
   * Create user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public User postUsers(PostUsersRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<User>() {});
  }

  /**
   * Create user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<User> postUsers(ApiRequest<CreateUser> request) throws ApiException {
    return pcapiClient.<User>invokeAPIVerbose(request, new TypeReference<User>() {});
  }

  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse postUsersSearch(UserSearchRequest body) throws ApiException {
    return postUsersSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> postUsersSearchWithHttpInfo(UserSearchRequest body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postUsersSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/search".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UsersSearchResponse postUsersSearch(PostUsersSearchRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UsersSearchResponse> postUsersSearch(ApiRequest<UserSearchRequest> request) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerbose(request, new TypeReference<UsersSearchResponse>() {});
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if fails to make API call
   */
  public CallForwarding putUserCallforwarding(String userId, CallForwarding body) throws ApiException {
    return putUserCallforwardingWithHttpInfo(userId, body).getBody();
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallForwarding> putUserCallforwardingWithHttpInfo(String userId, CallForwarding body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserCallforwarding");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putUserCallforwarding");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/callforwarding".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallForwarding>() {});
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallForwarding putUserCallforwarding(PutUserCallforwardingRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallForwarding> putUserCallforwarding(ApiRequest<CallForwarding> request) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIVerbose(request, new TypeReference<CallForwarding>() {});
  }

  /**
   * Update an OutOfOffice
   * 
   * @param userId User ID (required)
   * @param body The updated UserPresence (required)
   * @return OutOfOffice
   * @throws ApiException if fails to make API call
   */
  public OutOfOffice putUserOutofoffice(String userId, OutOfOffice body) throws ApiException {
    return putUserOutofofficeWithHttpInfo(userId, body).getBody();
  }

  /**
   * Update an OutOfOffice
   * 
   * @param userId User ID (required)
   * @param body The updated UserPresence (required)
   * @return OutOfOffice
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutOfOffice> putUserOutofofficeWithHttpInfo(String userId, OutOfOffice body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserOutofoffice");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putUserOutofoffice");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/outofoffice".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OutOfOffice>() {});
  }

  /**
   * Update an OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OutOfOffice putUserOutofoffice(PutUserOutofofficeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OutOfOffice>() {});
  }

  /**
   * Update an OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OutOfOffice> putUserOutofoffice(ApiRequest<OutOfOffice> request) throws ApiException {
    return pcapiClient.<OutOfOffice>invokeAPIVerbose(request, new TypeReference<OutOfOffice>() {});
  }

  /**
   * Update profile skills for a user
   * 
   * @param userId User ID (required)
   * @param body Skills (optional)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> putUserProfileskills(String userId, List<String> body) throws ApiException {
    return putUserProfileskillsWithHttpInfo(userId, body).getBody();
  }

  /**
   * Update profile skills for a user
   * 
   * @param userId User ID (required)
   * @param body Skills (optional)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> putUserProfileskillsWithHttpInfo(String userId, List<String> body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserProfileskills");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/profileskills".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<String>>() {});
  }

  /**
   * Update profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<String> putUserProfileskills(PutUserProfileskillsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<String>>() {});
  }

  /**
   * Update profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> putUserProfileskills(ApiRequest<List<String>> request) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerbose(request, new TypeReference<List<String>>() {});
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws ApiException if fails to make API call
   */
  public UserAuthorization putUserRoles(String userId, List<String> body) throws ApiException {
    return putUserRolesWithHttpInfo(userId, body).getBody();
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAuthorization> putUserRolesWithHttpInfo(String userId, List<String> body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserRoles");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putUserRoles");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/roles".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserAuthorization>() {});
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserAuthorization putUserRoles(PutUserRolesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserAuthorization>() {});
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAuthorization> putUserRoles(ApiRequest<List<String>> request) throws ApiException {
    return pcapiClient.<UserAuthorization>invokeAPIVerbose(request, new TypeReference<UserAuthorization>() {});
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill putUserRoutingskill(String userId, String skillId, UserRoutingSkill body) throws ApiException {
    return putUserRoutingskillWithHttpInfo(userId, skillId, body).getBody();
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskillWithHttpInfo(String userId, String skillId, UserRoutingSkill body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserRoutingskill");
    }
    
    // verify the required parameter 'skillId' is set
    if (skillId == null) {
      throw new ApiException(400, "Missing the required parameter 'skillId' when calling putUserRoutingskill");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putUserRoutingskill");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills/{skillId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "skillId" + "\\}", pcapiClient.escapeString(skillId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill putUserRoutingskill(PutUserRoutingskillRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskill(ApiRequest<UserRoutingSkill> request) throws ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerbose(request, new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (required)
   * @return RoutingStatus
   * @throws ApiException if fails to make API call
   */
  public RoutingStatus putUserRoutingstatus(String userId, RoutingStatus body) throws ApiException {
    return putUserRoutingstatusWithHttpInfo(userId, body).getBody();
  }

  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (required)
   * @return RoutingStatus
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatus> putUserRoutingstatusWithHttpInfo(String userId, RoutingStatus body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserRoutingstatus");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putUserRoutingstatus");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingstatus".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingStatus>() {});
  }

  /**
   * Update the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingStatus putUserRoutingstatus(PutUserRoutingstatusRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingStatus>() {});
  }

  /**
   * Update the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingStatus> putUserRoutingstatus(ApiRequest<RoutingStatus> request) throws ApiException {
    return pcapiClient.<RoutingStatus>invokeAPIVerbose(request, new TypeReference<RoutingStatus>() {});
  }

  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if fails to make API call
   */
  public void putUserStationAssociatedstationStationId(String userId, String stationId) throws ApiException {
    putUserStationAssociatedstationStationIdWithHttpInfo(userId, stationId);
  }

  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putUserStationAssociatedstationStationIdWithHttpInfo(String userId, String stationId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserStationAssociatedstationStationId");
    }
    
    // verify the required parameter 'stationId' is set
    if (stationId == null) {
      throw new ApiException(400, "Missing the required parameter 'stationId' when calling putUserStationAssociatedstationStationId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/station/associatedstation/{stationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "stationId" + "\\}", pcapiClient.escapeString(stationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Set associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void putUserStationAssociatedstationStationId(PutUserStationAssociatedstationStationIdRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Set associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putUserStationAssociatedstationStationId(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if fails to make API call
   */
  public void putUserStationDefaultstationStationId(String userId, String stationId) throws ApiException {
    putUserStationDefaultstationStationIdWithHttpInfo(userId, stationId);
  }

  /**
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putUserStationDefaultstationStationIdWithHttpInfo(String userId, String stationId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling putUserStationDefaultstationStationId");
    }
    
    // verify the required parameter 'stationId' is set
    if (stationId == null) {
      throw new ApiException(400, "Missing the required parameter 'stationId' when calling putUserStationDefaultstationStationId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/station/defaultstation/{stationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "stationId" + "\\}", pcapiClient.escapeString(stationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Set default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void putUserStationDefaultstationStationId(PutUserStationDefaultstationStationIdRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Set default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> putUserStationDefaultstationStationId(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

}
