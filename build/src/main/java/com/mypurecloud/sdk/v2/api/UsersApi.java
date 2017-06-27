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
import com.mypurecloud.sdk.v2.model.UpdateUser;
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
import com.mypurecloud.sdk.v2.api.request.PostUserInviteRequest;
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

import java.io.IOException;
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteUser(String userId) throws IOException, ApiException {
    return  deleteUser(createDeleteUserRequest(userId));
  }

  /**
   * Delete user
   * 
   * @param userId User ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteUserWithHttpInfo(String userId) throws IOException {
    return deleteUser(createDeleteUserRequest(userId).withHttpInfo());
  }

  private DeleteUserRequest createDeleteUserRequest(String userId) {
    return DeleteUserRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Delete user
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteUser(DeleteUserRequest request) throws IOException, ApiException {
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
   * Delete user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteUser(ApiRequest<Void> request) throws IOException {
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
   * Removes all the roles from the user.
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoles(String userId) throws IOException, ApiException {
     deleteUserRoles(createDeleteUserRolesRequest(userId));
  }

  /**
   * Removes all the roles from the user.
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRolesWithHttpInfo(String userId) throws IOException {
    return deleteUserRoles(createDeleteUserRolesRequest(userId).withHttpInfo());
  }

  private DeleteUserRolesRequest createDeleteUserRolesRequest(String userId) {
    return DeleteUserRolesRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Removes all the roles from the user.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoles(DeleteUserRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Removes all the roles from the user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoles(ApiRequest<Void> request) throws IOException {
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
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutingskill(String userId, String skillId) throws IOException, ApiException {
     deleteUserRoutingskill(createDeleteUserRoutingskillRequest(userId, skillId));
  }

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutingskillWithHttpInfo(String userId, String skillId) throws IOException {
    return deleteUserRoutingskill(createDeleteUserRoutingskillRequest(userId, skillId).withHttpInfo());
  }

  private DeleteUserRoutingskillRequest createDeleteUserRoutingskillRequest(String userId, String skillId) {
    return DeleteUserRoutingskillRequest.builder()
            .withUserId(userId)
    
            .withSkillId(skillId)
    
            .build();
  }

  /**
   * Remove routing skill from user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutingskill(DeleteUserRoutingskillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove routing skill from user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutingskill(ApiRequest<Void> request) throws IOException {
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
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationAssociatedstation(String userId) throws IOException, ApiException {
     deleteUserStationAssociatedstation(createDeleteUserStationAssociatedstationRequest(userId));
  }

  /**
   * Clear associated station
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationAssociatedstationWithHttpInfo(String userId) throws IOException {
    return deleteUserStationAssociatedstation(createDeleteUserStationAssociatedstationRequest(userId).withHttpInfo());
  }

  private DeleteUserStationAssociatedstationRequest createDeleteUserStationAssociatedstationRequest(String userId) {
    return DeleteUserStationAssociatedstationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Clear associated station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationAssociatedstation(DeleteUserStationAssociatedstationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Clear associated station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationAssociatedstation(ApiRequest<Void> request) throws IOException {
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
   * Clear default station
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationDefaultstation(String userId) throws IOException, ApiException {
     deleteUserStationDefaultstation(createDeleteUserStationDefaultstationRequest(userId));
  }

  /**
   * Clear default station
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationDefaultstationWithHttpInfo(String userId) throws IOException {
    return deleteUserStationDefaultstation(createDeleteUserStationDefaultstationRequest(userId).withHttpInfo());
  }

  private DeleteUserStationDefaultstationRequest createDeleteUserStationDefaultstationRequest(String userId) {
    return DeleteUserStationDefaultstationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Clear default station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserStationDefaultstation(DeleteUserStationDefaultstationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Clear default station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserStationDefaultstation(ApiRequest<Void> request) throws IOException {
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
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FieldConfig getFieldconfig(String type) throws IOException, ApiException {
    return  getFieldconfig(createGetFieldconfigRequest(type));
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FieldConfig> getFieldconfigWithHttpInfo(String type) throws IOException {
    return getFieldconfig(createGetFieldconfigRequest(type).withHttpInfo());
  }

  private GetFieldconfigRequest createGetFieldconfigRequest(String type) {
    return GetFieldconfigRequest.builder()
            .withType(type)
    
            .build();
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return FieldConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FieldConfig getFieldconfig(GetFieldconfigRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FieldConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FieldConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FieldConfig> getFieldconfig(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FieldConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get user.
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param state Search for a user with this state (optional, default to active)
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User getUser(String userId, List<String> expand, String state) throws IOException, ApiException {
    return  getUser(createGetUserRequest(userId, expand, state));
  }

  /**
   * Get user.
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param state Search for a user with this state (optional, default to active)
   * @return User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> getUserWithHttpInfo(String userId, List<String> expand, String state) throws IOException {
    return getUser(createGetUserRequest(userId, expand, state).withHttpInfo());
  }

  private GetUserRequest createGetUserRequest(String userId, List<String> expand, String state) {
    return GetUserRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .withState(state)
    
            .build();
  }

  /**
   * Get user.
   * 
   * @param request The request object
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User getUser(GetUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> getUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)exception;
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
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get adjacents
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Adjacents
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Adjacents getUserAdjacents(String userId, List<String> expand) throws IOException, ApiException {
    return  getUserAdjacents(createGetUserAdjacentsRequest(userId, expand));
  }

  /**
   * Get adjacents
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Adjacents
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Adjacents> getUserAdjacentsWithHttpInfo(String userId, List<String> expand) throws IOException {
    return getUserAdjacents(createGetUserAdjacentsRequest(userId, expand).withHttpInfo());
  }

  private GetUserAdjacentsRequest createGetUserAdjacentsRequest(String userId, List<String> expand) {
    return GetUserAdjacentsRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get adjacents
   * 
   * @param request The request object
   * @return Adjacents
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Adjacents getUserAdjacents(GetUserAdjacentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Adjacents> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Adjacents>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get adjacents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Adjacents> getUserAdjacents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Adjacents>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Adjacents> response = (ApiResponse<Adjacents>)(ApiResponse<?>)exception;
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
      ApiResponse<Adjacents> response = (ApiResponse<Adjacents>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding getUserCallforwarding(String userId) throws IOException, ApiException {
    return  getUserCallforwarding(createGetUserCallforwardingRequest(userId));
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @return CallForwarding
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> getUserCallforwardingWithHttpInfo(String userId) throws IOException {
    return getUserCallforwarding(createGetUserCallforwardingRequest(userId).withHttpInfo());
  }

  private GetUserCallforwardingRequest createGetUserCallforwardingRequest(String userId) {
    return GetUserCallforwardingRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding getUserCallforwarding(GetUserCallforwardingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallForwarding> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> getUserCallforwarding(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallForwarding>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)exception;
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
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get direct reports
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserDirectreports(String userId, List<String> expand) throws IOException, ApiException {
    return  getUserDirectreports(createGetUserDirectreportsRequest(userId, expand));
  }

  /**
   * Get direct reports
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserDirectreportsWithHttpInfo(String userId, List<String> expand) throws IOException {
    return getUserDirectreports(createGetUserDirectreportsRequest(userId, expand).withHttpInfo());
  }

  private GetUserDirectreportsRequest createGetUserDirectreportsRequest(String userId, List<String> expand) {
    return GetUserDirectreportsRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get direct reports
   * 
   * @param request The request object
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserDirectreports(GetUserDirectreportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<User>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<User>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get direct reports
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserDirectreports(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<User>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUserFavorites(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getUserFavorites(createGetUserFavoritesRequest(userId, pageSize, pageNumber, sortOrder, expand));
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUserFavoritesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException {
    return getUserFavorites(createGetUserFavoritesRequest(userId, pageSize, pageNumber, sortOrder, expand).withHttpInfo());
  }

  private GetUserFavoritesRequest createGetUserFavoritesRequest(String userId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) {
    return GetUserFavoritesRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get favorites
   * 
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUserFavorites(GetUserFavoritesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get favorites
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUserFavorites(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation getUserGeolocation(String userId, String clientId) throws IOException, ApiException {
    return  getUserGeolocation(createGetUserGeolocationRequest(userId, clientId));
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> getUserGeolocationWithHttpInfo(String userId, String clientId) throws IOException {
    return getUserGeolocation(createGetUserGeolocationRequest(userId, clientId).withHttpInfo());
  }

  private GetUserGeolocationRequest createGetUserGeolocationRequest(String userId, String clientId) {
    return GetUserGeolocationRequest.builder()
            .withUserId(userId)
    
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param request The request object
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation getUserGeolocation(GetUserGeolocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Geolocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Geolocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> getUserGeolocation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Geolocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)exception;
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
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice getUserOutofoffice(String userId) throws IOException, ApiException {
    return  getUserOutofoffice(createGetUserOutofofficeRequest(userId));
  }

  /**
   * Get a OutOfOffice
   * 
   * @param userId User ID (required)
   * @return OutOfOffice
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> getUserOutofofficeWithHttpInfo(String userId) throws IOException {
    return getUserOutofoffice(createGetUserOutofofficeRequest(userId).withHttpInfo());
  }

  private GetUserOutofofficeRequest createGetUserOutofofficeRequest(String userId) {
    return GetUserOutofofficeRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a OutOfOffice
   * 
   * @param request The request object
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice getUserOutofoffice(GetUserOutofofficeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutOfOffice> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutOfOffice>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a OutOfOffice
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> getUserOutofoffice(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutOfOffice>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)exception;
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
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List profile skills for a user
   * 
   * @param userId User ID (required)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getUserProfileskills(String userId) throws IOException, ApiException {
    return  getUserProfileskills(createGetUserProfileskillsRequest(userId));
  }

  /**
   * List profile skills for a user
   * 
   * @param userId User ID (required)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getUserProfileskillsWithHttpInfo(String userId) throws IOException {
    return getUserProfileskills(createGetUserProfileskillsRequest(userId).withHttpInfo());
  }

  private GetUserProfileskillsRequest createGetUserProfileskillsRequest(String userId) {
    return GetUserProfileskillsRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * List profile skills for a user
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getUserProfileskills(GetUserProfileskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List profile skills for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getUserProfileskills(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getUserQueues(String userId, Integer pageSize, Integer pageNumber, Boolean joined) throws IOException, ApiException {
    return  getUserQueues(createGetUserQueuesRequest(userId, pageSize, pageNumber, joined));
  }

  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @return UserQueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getUserQueuesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, Boolean joined) throws IOException {
    return getUserQueues(createGetUserQueuesRequest(userId, pageSize, pageNumber, joined).withHttpInfo());
  }

  private GetUserQueuesRequest createGetUserQueuesRequest(String userId, Integer pageSize, Integer pageNumber, Boolean joined) {
    return GetUserQueuesRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withJoined(joined)
    
            .build();
  }

  /**
   * Get queues for user
   * 
   * @param request The request object
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getUserQueues(GetUserQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get queues for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getUserQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization getUserRoles(String userId) throws IOException, ApiException {
    return  getUserRoles(createGetUserRolesRequest(userId));
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param userId User ID (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> getUserRolesWithHttpInfo(String userId) throws IOException {
    return getUserRoles(createGetUserRolesRequest(userId).withHttpInfo());
  }

  private GetUserRolesRequest createGetUserRolesRequest(String userId) {
    return GetUserRolesRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request The request object
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization getUserRoles(GetUserRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserAuthorization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserAuthorization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> getUserRoles(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserAuthorization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)exception;
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
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing getUserRoutingskills(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getUserRoutingskills(createGetUserRoutingskillsRequest(userId, pageSize, pageNumber, sortOrder));
  }

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskillsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getUserRoutingskills(createGetUserRoutingskillsRequest(userId, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetUserRoutingskillsRequest createGetUserRoutingskillsRequest(String userId, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetUserRoutingskillsRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * List routing skills for user
   * 
   * @param request The request object
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing getUserRoutingskills(GetUserRoutingskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List routing skills for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskills(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus getUserRoutingstatus(String userId) throws IOException, ApiException {
    return  getUserRoutingstatus(createGetUserRoutingstatusRequest(userId));
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param userId User ID (required)
   * @return RoutingStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> getUserRoutingstatusWithHttpInfo(String userId) throws IOException {
    return getUserRoutingstatus(createGetUserRoutingstatusRequest(userId).withHttpInfo());
  }

  private GetUserRoutingstatusRequest createGetUserRoutingstatusRequest(String userId) {
    return GetUserRoutingstatusRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param request The request object
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus getUserRoutingstatus(GetUserRoutingstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch the routing status of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> getUserRoutingstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return UserStations
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserStations getUserStation(String userId) throws IOException, ApiException {
    return  getUserStation(createGetUserStationRequest(userId));
  }

  /**
   * Get station information for user
   * 
   * @param userId User ID (required)
   * @return UserStations
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserStations> getUserStationWithHttpInfo(String userId) throws IOException {
    return getUserStation(createGetUserStationRequest(userId).withHttpInfo());
  }

  private GetUserStationRequest createGetUserStationRequest(String userId) {
    return GetUserStationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get station information for user
   * 
   * @param request The request object
   * @return UserStations
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserStations getUserStation(GetUserStationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserStations> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserStations>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get station information for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserStations> getUserStation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserStations>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserStations> response = (ApiResponse<UserStations>)(ApiResponse<?>)exception;
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
      ApiResponse<UserStations> response = (ApiResponse<UserStations>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get superiors
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserSuperiors(String userId, List<String> expand) throws IOException, ApiException {
    return  getUserSuperiors(createGetUserSuperiorsRequest(userId, expand));
  }

  /**
   * Get superiors
   * 
   * @param userId User ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return List<User>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserSuperiorsWithHttpInfo(String userId, List<String> expand) throws IOException {
    return getUserSuperiors(createGetUserSuperiorsRequest(userId, expand).withHttpInfo());
  }

  private GetUserSuperiorsRequest createGetUserSuperiorsRequest(String userId, List<String> expand) {
    return GetUserSuperiorsRequest.builder()
            .withUserId(userId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get superiors
   * 
   * @param request The request object
   * @return List<User>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<User> getUserSuperiors(GetUserSuperiorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<User>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<User>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get superiors
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<User>> getUserSuperiors(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<User>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<User>> response = (ApiResponse<List<User>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @param state Only list users of this state (optional, default to active)
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUsers(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder, List<String> expand, String state) throws IOException, ApiException {
    return  getUsers(createGetUsersRequest(pageSize, pageNumber, id, sortOrder, expand, state));
  }

  /**
   * Get the list of available users.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @param state Only list users of this state (optional, default to active)
   * @return UserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUsersWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder, List<String> expand, String state) throws IOException {
    return getUsers(createGetUsersRequest(pageSize, pageNumber, id, sortOrder, expand, state).withHttpInfo());
  }

  private GetUsersRequest createGetUsersRequest(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder, List<String> expand, String state) {
    return GetUsersRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withId(id)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .withState(state)
    
            .build();
  }

  /**
   * Get the list of available users.
   * 
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getUsers(GetUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of available users.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserMe
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserMe getUsersMe(List<String> expand) throws IOException, ApiException {
    return  getUsersMe(createGetUsersMeRequest(expand));
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param expand Which fields, if any, to expand. (optional)
   * @return UserMe
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserMe> getUsersMeWithHttpInfo(List<String> expand) throws IOException {
    return getUsersMe(createGetUsersMeRequest(expand).withHttpInfo());
  }

  private GetUsersMeRequest createGetUsersMeRequest(List<String> expand) {
    return GetUsersMeRequest.builder()
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param request The request object
   * @return UserMe
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserMe getUsersMe(GetUsersMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserMe> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserMe>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserMe> getUsersMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserMe>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserMe> response = (ApiResponse<UserMe>)(ApiResponse<?>)exception;
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
      ApiResponse<UserMe> response = (ApiResponse<UserMe>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse getUsersSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getUsersSearch(createGetUsersSearchRequest(q64, expand));
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return UsersSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> getUsersSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getUsersSearch(createGetUsersSearchRequest(q64, expand).withHttpInfo());
  }

  private GetUsersSearchRequest createGetUsersSearchRequest(String q64, List<String> expand) {
    return GetUsersSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse getUsersSearch(GetUsersSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> getUsersSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User patchUser(String userId, UpdateUser body) throws IOException, ApiException {
    return  patchUser(createPatchUserRequest(userId, body));
  }

  /**
   * Update user
   * 
   * @param userId User ID (required)
   * @param body User (required)
   * @return User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> patchUserWithHttpInfo(String userId, UpdateUser body) throws IOException {
    return patchUser(createPatchUserRequest(userId, body).withHttpInfo());
  }

  private PatchUserRequest createPatchUserRequest(String userId, UpdateUser body) {
    return PatchUserRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update user
   * 
   * @param request The request object
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User patchUser(PatchUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> patchUser(ApiRequest<UpdateUser> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)exception;
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
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding patchUserCallforwarding(String userId, CallForwarding body) throws IOException, ApiException {
    return  patchUserCallforwarding(createPatchUserCallforwardingRequest(userId, body));
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> patchUserCallforwardingWithHttpInfo(String userId, CallForwarding body) throws IOException {
    return patchUserCallforwarding(createPatchUserCallforwardingRequest(userId, body).withHttpInfo());
  }

  private PatchUserCallforwardingRequest createPatchUserCallforwardingRequest(String userId, CallForwarding body) {
    return PatchUserCallforwardingRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding patchUserCallforwarding(PatchUserCallforwardingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallForwarding> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> patchUserCallforwarding(ApiRequest<CallForwarding> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallForwarding>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)exception;
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
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation patchUserGeolocation(String userId, String clientId, Geolocation body) throws IOException, ApiException {
    return  patchUserGeolocation(createPatchUserGeolocationRequest(userId, clientId, body));
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> patchUserGeolocationWithHttpInfo(String userId, String clientId, Geolocation body) throws IOException {
    return patchUserGeolocation(createPatchUserGeolocationRequest(userId, clientId, body).withHttpInfo());
  }

  private PatchUserGeolocationRequest createPatchUserGeolocationRequest(String userId, String clientId, Geolocation body) {
    return PatchUserGeolocationRequest.builder()
            .withUserId(userId)
    
            .withClientId(clientId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param request The request object
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation patchUserGeolocation(PatchUserGeolocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Geolocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Geolocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> patchUserGeolocation(ApiRequest<Geolocation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Geolocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)exception;
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
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueue patchUserQueue(String queueId, String userId, UserQueue body) throws IOException, ApiException {
    return  patchUserQueue(createPatchUserQueueRequest(queueId, userId, body));
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueue> patchUserQueueWithHttpInfo(String queueId, String userId, UserQueue body) throws IOException {
    return patchUserQueue(createPatchUserQueueRequest(queueId, userId, body).withHttpInfo());
  }

  private PatchUserQueueRequest createPatchUserQueueRequest(String queueId, String userId, UserQueue body) {
    return PatchUserQueueRequest.builder()
            .withQueueId(queueId)
    
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param request The request object
   * @return UserQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueue patchUserQueue(PatchUserQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueue> patchUserQueue(ApiRequest<UserQueue> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueue> response = (ApiResponse<UserQueue>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueue> response = (ApiResponse<UserQueue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing patchUserQueues(String userId, List<UserQueue> body) throws IOException, ApiException {
    return  patchUserQueues(createPatchUserQueuesRequest(userId, body));
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @return UserQueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueuesWithHttpInfo(String userId, List<UserQueue> body) throws IOException {
    return patchUserQueues(createPatchUserQueuesRequest(userId, body).withHttpInfo());
  }

  private PatchUserQueuesRequest createPatchUserQueuesRequest(String userId, List<UserQueue> body) {
    return PatchUserQueuesRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param request The request object
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing patchUserQueues(PatchUserQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueues(ApiRequest<List<UserQueue>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body));
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersAggregatesQueryRequest createPostAnalyticsUsersAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsUsersAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return PresenceQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(PostAnalyticsUsersAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PresenceQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PresenceQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PresenceQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PresenceQueryResponse> response = (ApiResponse<PresenceQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<PresenceQueryResponse> response = (ApiResponse<PresenceQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(UserDetailsQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body));
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryWithHttpInfo(UserDetailsQuery body) throws IOException {
    return postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersDetailsQueryRequest createPostAnalyticsUsersDetailsQueryRequest(UserDetailsQuery body) {
    return PostAnalyticsUsersDetailsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(PostAnalyticsUsersDetailsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQuery(ApiRequest<UserDetailsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(ObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body));
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQueryWithHttpInfo(ObservationQuery body) throws IOException {
    return postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersObservationsQueryRequest createPostAnalyticsUsersObservationsQueryRequest(ObservationQuery body) {
    return PostAnalyticsUsersObservationsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return ObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(PostAnalyticsUsersObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQuery(ApiRequest<ObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ObservationQueryResponse> response = (ApiResponse<ObservationQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ObservationQueryResponse> response = (ApiResponse<ObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Send an activation email to the user
   * 
   * @param userId User ID (required)
   * @param force Resend the invitation even if one is already outstanding (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUserInvite(String userId, Boolean force) throws IOException, ApiException {
     postUserInvite(createPostUserInviteRequest(userId, force));
  }

  /**
   * Send an activation email to the user
   * 
   * @param userId User ID (required)
   * @param force Resend the invitation even if one is already outstanding (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUserInviteWithHttpInfo(String userId, Boolean force) throws IOException {
    return postUserInvite(createPostUserInviteRequest(userId, force).withHttpInfo());
  }

  private PostUserInviteRequest createPostUserInviteRequest(String userId, Boolean force) {
    return PostUserInviteRequest.builder()
            .withUserId(userId)
    
            .withForce(force)
    
            .build();
  }

  /**
   * Send an activation email to the user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postUserInvite(PostUserInviteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Send an activation email to the user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postUserInvite(ApiRequest<Void> request) throws IOException {
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
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill postUserRoutingskills(String userId, UserRoutingSkillPost body) throws IOException, ApiException {
    return  postUserRoutingskills(createPostUserRoutingskillsRequest(userId, body));
  }

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskillsWithHttpInfo(String userId, UserRoutingSkillPost body) throws IOException {
    return postUserRoutingskills(createPostUserRoutingskillsRequest(userId, body).withHttpInfo());
  }

  private PostUserRoutingskillsRequest createPostUserRoutingskillsRequest(String userId, UserRoutingSkillPost body) {
    return PostUserRoutingskillsRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add routing skill to user
   * 
   * @param request The request object
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill postUserRoutingskills(PostUserRoutingskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add routing skill to user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskills(ApiRequest<UserRoutingSkillPost> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create user
   * 
   * @param body User (required)
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User postUsers(CreateUser body) throws IOException, ApiException {
    return  postUsers(createPostUsersRequest(body));
  }

  /**
   * Create user
   * 
   * @param body User (required)
   * @return User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> postUsersWithHttpInfo(CreateUser body) throws IOException {
    return postUsers(createPostUsersRequest(body).withHttpInfo());
  }

  private PostUsersRequest createPostUsersRequest(CreateUser body) {
    return PostUsersRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create user
   * 
   * @param request The request object
   * @return User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public User postUsers(PostUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<User> postUsers(ApiRequest<CreateUser> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)exception;
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
      ApiResponse<User> response = (ApiResponse<User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse postUsersSearch(UserSearchRequest body) throws IOException, ApiException {
    return  postUsersSearch(createPostUsersSearchRequest(body));
  }

  /**
   * Search users
   * 
   * @param body Search request options (required)
   * @return UsersSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> postUsersSearchWithHttpInfo(UserSearchRequest body) throws IOException {
    return postUsersSearch(createPostUsersSearchRequest(body).withHttpInfo());
  }

  private PostUsersSearchRequest createPostUsersSearchRequest(UserSearchRequest body) {
    return PostUsersSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search users
   * 
   * @param request The request object
   * @return UsersSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UsersSearchResponse postUsersSearch(PostUsersSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UsersSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UsersSearchResponse> postUsersSearch(ApiRequest<UserSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UsersSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding putUserCallforwarding(String userId, CallForwarding body) throws IOException, ApiException {
    return  putUserCallforwarding(createPutUserCallforwardingRequest(userId, body));
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param userId User ID (required)
   * @param body Call forwarding (required)
   * @return CallForwarding
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> putUserCallforwardingWithHttpInfo(String userId, CallForwarding body) throws IOException {
    return putUserCallforwarding(createPutUserCallforwardingRequest(userId, body).withHttpInfo());
  }

  private PutUserCallforwardingRequest createPutUserCallforwardingRequest(String userId, CallForwarding body) {
    return PutUserCallforwardingRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return CallForwarding
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallForwarding putUserCallforwarding(PutUserCallforwardingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallForwarding> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallForwarding>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallForwarding> putUserCallforwarding(ApiRequest<CallForwarding> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallForwarding>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)exception;
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
      ApiResponse<CallForwarding> response = (ApiResponse<CallForwarding>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an OutOfOffice
   * 
   * @param userId User ID (required)
   * @param body The updated UserPresence (required)
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice putUserOutofoffice(String userId, OutOfOffice body) throws IOException, ApiException {
    return  putUserOutofoffice(createPutUserOutofofficeRequest(userId, body));
  }

  /**
   * Update an OutOfOffice
   * 
   * @param userId User ID (required)
   * @param body The updated UserPresence (required)
   * @return OutOfOffice
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> putUserOutofofficeWithHttpInfo(String userId, OutOfOffice body) throws IOException {
    return putUserOutofoffice(createPutUserOutofofficeRequest(userId, body).withHttpInfo());
  }

  private PutUserOutofofficeRequest createPutUserOutofofficeRequest(String userId, OutOfOffice body) {
    return PutUserOutofofficeRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an OutOfOffice
   * 
   * @param request The request object
   * @return OutOfOffice
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutOfOffice putUserOutofoffice(PutUserOutofofficeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutOfOffice> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutOfOffice>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an OutOfOffice
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutOfOffice> putUserOutofoffice(ApiRequest<OutOfOffice> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutOfOffice>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)exception;
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
      ApiResponse<OutOfOffice> response = (ApiResponse<OutOfOffice>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update profile skills for a user
   * 
   * @param userId User ID (required)
   * @param body Skills (optional)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putUserProfileskills(String userId, List<String> body) throws IOException, ApiException {
    return  putUserProfileskills(createPutUserProfileskillsRequest(userId, body));
  }

  /**
   * Update profile skills for a user
   * 
   * @param userId User ID (required)
   * @param body Skills (optional)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putUserProfileskillsWithHttpInfo(String userId, List<String> body) throws IOException {
    return putUserProfileskills(createPutUserProfileskillsRequest(userId, body).withHttpInfo());
  }

  private PutUserProfileskillsRequest createPutUserProfileskillsRequest(String userId, List<String> body) {
    return PutUserProfileskillsRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update profile skills for a user
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putUserProfileskills(PutUserProfileskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update profile skills for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putUserProfileskills(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putUserRoles(String userId, List<String> body) throws IOException, ApiException {
    return  putUserRoles(createPutUserRolesRequest(userId, body));
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param userId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putUserRolesWithHttpInfo(String userId, List<String> body) throws IOException {
    return putUserRoles(createPutUserRolesRequest(userId, body).withHttpInfo());
  }

  private PutUserRolesRequest createPutUserRolesRequest(String userId, List<String> body) {
    return PutUserRolesRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param request The request object
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putUserRoles(PutUserRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserAuthorization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserAuthorization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putUserRoles(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserAuthorization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)exception;
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
      ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill putUserRoutingskill(String userId, String skillId, UserRoutingSkill body) throws IOException, ApiException {
    return  putUserRoutingskill(createPutUserRoutingskillRequest(userId, skillId, body));
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskillWithHttpInfo(String userId, String skillId, UserRoutingSkill body) throws IOException {
    return putUserRoutingskill(createPutUserRoutingskillRequest(userId, skillId, body).withHttpInfo());
  }

  private PutUserRoutingskillRequest createPutUserRoutingskillRequest(String userId, String skillId, UserRoutingSkill body) {
    return PutUserRoutingskillRequest.builder()
            .withUserId(userId)
    
            .withSkillId(skillId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param request The request object
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill putUserRoutingskill(PutUserRoutingskillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskill(ApiRequest<UserRoutingSkill> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (required)
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus putUserRoutingstatus(String userId, RoutingStatus body) throws IOException, ApiException {
    return  putUserRoutingstatus(createPutUserRoutingstatusRequest(userId, body));
  }

  /**
   * Update the routing status of a user
   * 
   * @param userId User ID (required)
   * @param body Routing Status (required)
   * @return RoutingStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> putUserRoutingstatusWithHttpInfo(String userId, RoutingStatus body) throws IOException {
    return putUserRoutingstatus(createPutUserRoutingstatusRequest(userId, body).withHttpInfo());
  }

  private PutUserRoutingstatusRequest createPutUserRoutingstatusRequest(String userId, RoutingStatus body) {
    return PutUserRoutingstatusRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the routing status of a user
   * 
   * @param request The request object
   * @return RoutingStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingStatus putUserRoutingstatus(PutUserRoutingstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the routing status of a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingStatus> putUserRoutingstatus(ApiRequest<RoutingStatus> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingStatus> response = (ApiResponse<RoutingStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationAssociatedstationStationId(String userId, String stationId) throws IOException, ApiException {
     putUserStationAssociatedstationStationId(createPutUserStationAssociatedstationStationIdRequest(userId, stationId));
  }

  /**
   * Set associated station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationAssociatedstationStationIdWithHttpInfo(String userId, String stationId) throws IOException {
    return putUserStationAssociatedstationStationId(createPutUserStationAssociatedstationStationIdRequest(userId, stationId).withHttpInfo());
  }

  private PutUserStationAssociatedstationStationIdRequest createPutUserStationAssociatedstationStationIdRequest(String userId, String stationId) {
    return PutUserStationAssociatedstationStationIdRequest.builder()
            .withUserId(userId)
    
            .withStationId(stationId)
    
            .build();
  }

  /**
   * Set associated station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationAssociatedstationStationId(PutUserStationAssociatedstationStationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Set associated station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationAssociatedstationStationId(ApiRequest<Void> request) throws IOException {
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
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationDefaultstationStationId(String userId, String stationId) throws IOException, ApiException {
     putUserStationDefaultstationStationId(createPutUserStationDefaultstationStationIdRequest(userId, stationId));
  }

  /**
   * Set default station
   * 
   * @param userId User ID (required)
   * @param stationId stationId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationDefaultstationStationIdWithHttpInfo(String userId, String stationId) throws IOException {
    return putUserStationDefaultstationStationId(createPutUserStationDefaultstationStationIdRequest(userId, stationId).withHttpInfo());
  }

  private PutUserStationDefaultstationStationIdRequest createPutUserStationDefaultstationStationIdRequest(String userId, String stationId) {
    return PutUserStationDefaultstationStationIdRequest.builder()
            .withUserId(userId)
    
            .withStationId(stationId)
    
            .build();
  }

  /**
   * Set default station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void putUserStationDefaultstationStationId(PutUserStationDefaultstationStationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Set default station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> putUserStationDefaultstationStationId(ApiRequest<Void> request) throws IOException {
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

  
}
