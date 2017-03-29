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
import java.util.concurrent.Future;


public class UsersApiAsync {
  private final ApiClient pcapiClient;

  public UsersApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteUserAsync(DeleteUserRequest request, AsyncApiCallback<Empty> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Delete user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteUserAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) throws ApiException {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Removes all the roles from the user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteUserRolesAsync(DeleteUserRolesRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Removes all the roles from the user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteUserRolesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteUserRoutingskillAsync(DeleteUserRoutingskillRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteUserRoutingskillAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Clear associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteUserStationAssociatedstationAsync(DeleteUserStationAssociatedstationRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Clear associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteUserStationAssociatedstationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Clear default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteUserStationDefaultstationAsync(DeleteUserStationDefaultstationRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Clear default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteUserStationDefaultstationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FieldConfig> getFieldconfigAsync(GetFieldconfigRequest request, AsyncApiCallback<FieldConfig> callback) throws ApiException {
    return pcapiClient.<FieldConfig>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FieldConfig>() {}, callback);
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FieldConfig>> getFieldconfigAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FieldConfig>> callback) throws ApiException {
    return pcapiClient.<FieldConfig>invokeAPIVerboseAsync(request, new TypeReference<FieldConfig>() {}, callback);
  }

  /**
   * Get user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<User> getUserAsync(GetUserRequest request, AsyncApiCallback<User> callback) throws ApiException {
    return pcapiClient.<User>invokeAPIAsync(request.withHttpInfo(), new TypeReference<User>() {}, callback);
  }

  /**
   * Get user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<User>> getUserAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<User>> callback) throws ApiException {
    return pcapiClient.<User>invokeAPIVerboseAsync(request, new TypeReference<User>() {}, callback);
  }

  /**
   * Get adjacents
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Adjacents> getUserAdjacentsAsync(GetUserAdjacentsRequest request, AsyncApiCallback<Adjacents> callback) throws ApiException {
    return pcapiClient.<Adjacents>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Adjacents>() {}, callback);
  }

  /**
   * Get adjacents
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Adjacents>> getUserAdjacentsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Adjacents>> callback) throws ApiException {
    return pcapiClient.<Adjacents>invokeAPIVerboseAsync(request, new TypeReference<Adjacents>() {}, callback);
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallForwarding> getUserCallforwardingAsync(GetUserCallforwardingRequest request, AsyncApiCallback<CallForwarding> callback) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallForwarding>() {}, callback);
  }

  /**
   * Get a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallForwarding>> getUserCallforwardingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallForwarding>> callback) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIVerboseAsync(request, new TypeReference<CallForwarding>() {}, callback);
  }

  /**
   * Get direct reports
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<User>> getUserDirectreportsAsync(GetUserDirectreportsRequest request, AsyncApiCallback<List<User>> callback) throws ApiException {
    return pcapiClient.<List<User>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<User>>() {}, callback);
  }

  /**
   * Get direct reports
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<User>>> getUserDirectreportsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<User>>> callback) throws ApiException {
    return pcapiClient.<List<User>>invokeAPIVerboseAsync(request, new TypeReference<List<User>>() {}, callback);
  }

  /**
   * Get favorites
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserEntityListing> getUserFavoritesAsync(GetUserFavoritesRequest request, AsyncApiCallback<UserEntityListing> callback) throws ApiException {
    return pcapiClient.<UserEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserEntityListing>() {}, callback);
  }

  /**
   * Get favorites
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserEntityListing>> getUserFavoritesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserEntityListing>> callback) throws ApiException {
    return pcapiClient.<UserEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserEntityListing>() {}, callback);
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Geolocation> getUserGeolocationAsync(GetUserGeolocationRequest request, AsyncApiCallback<Geolocation> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Geolocation>() {}, callback);
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Geolocation>> getUserGeolocationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Geolocation>> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerboseAsync(request, new TypeReference<Geolocation>() {}, callback);
  }

  /**
   * Get a OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutOfOffice> getUserOutofofficeAsync(GetUserOutofofficeRequest request, AsyncApiCallback<OutOfOffice> callback) throws ApiException {
    return pcapiClient.<OutOfOffice>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutOfOffice>() {}, callback);
  }

  /**
   * Get a OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutOfOffice>> getUserOutofofficeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OutOfOffice>> callback) throws ApiException {
    return pcapiClient.<OutOfOffice>invokeAPIVerboseAsync(request, new TypeReference<OutOfOffice>() {}, callback);
  }

  /**
   * List profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<String>> getUserProfileskillsAsync(GetUserProfileskillsRequest request, AsyncApiCallback<List<String>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, callback);
  }

  /**
   * List profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<String>>> getUserProfileskillsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<String>>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerboseAsync(request, new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Get queues for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserQueueEntityListing> getUserQueuesAsync(GetUserQueuesRequest request, AsyncApiCallback<UserQueueEntityListing> callback) throws ApiException {
    return pcapiClient.<UserQueueEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {}, callback);
  }

  /**
   * Get queues for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserQueueEntityListing>> getUserQueuesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserQueueEntityListing>> callback) throws ApiException {
    return pcapiClient.<UserQueueEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserQueueEntityListing>() {}, callback);
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserAuthorization> getUserRolesAsync(GetUserRolesRequest request, AsyncApiCallback<UserAuthorization> callback) throws ApiException {
    return pcapiClient.<UserAuthorization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserAuthorization>() {}, callback);
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserAuthorization>> getUserRolesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserAuthorization>> callback) throws ApiException {
    return pcapiClient.<UserAuthorization>invokeAPIVerboseAsync(request, new TypeReference<UserAuthorization>() {}, callback);
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserSkillEntityListing> getUserRoutingskillsAsync(GetUserRoutingskillsRequest request, AsyncApiCallback<UserSkillEntityListing> callback) throws ApiException {
    return pcapiClient.<UserSkillEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {}, callback);
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserSkillEntityListing>> getUserRoutingskillsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserSkillEntityListing>> callback) throws ApiException {
    return pcapiClient.<UserSkillEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserSkillEntityListing>() {}, callback);
  }

  /**
   * Fetch the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatus> getUserRoutingstatusAsync(GetUserRoutingstatusRequest request, AsyncApiCallback<RoutingStatus> callback) throws ApiException {
    return pcapiClient.<RoutingStatus>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatus>() {}, callback);
  }

  /**
   * Fetch the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatus>> getUserRoutingstatusAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatus>> callback) throws ApiException {
    return pcapiClient.<RoutingStatus>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatus>() {}, callback);
  }

  /**
   * Get station information for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserStations> getUserStationAsync(GetUserStationRequest request, AsyncApiCallback<UserStations> callback) throws ApiException {
    return pcapiClient.<UserStations>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserStations>() {}, callback);
  }

  /**
   * Get station information for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserStations>> getUserStationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserStations>> callback) throws ApiException {
    return pcapiClient.<UserStations>invokeAPIVerboseAsync(request, new TypeReference<UserStations>() {}, callback);
  }

  /**
   * Get superiors
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<User>> getUserSuperiorsAsync(GetUserSuperiorsRequest request, AsyncApiCallback<List<User>> callback) throws ApiException {
    return pcapiClient.<List<User>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<User>>() {}, callback);
  }

  /**
   * Get superiors
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<User>>> getUserSuperiorsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<User>>> callback) throws ApiException {
    return pcapiClient.<List<User>>invokeAPIVerboseAsync(request, new TypeReference<List<User>>() {}, callback);
  }

  /**
   * Get the list of available users.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserEntityListing> getUsersAsync(GetUsersRequest request, AsyncApiCallback<UserEntityListing> callback) throws ApiException {
    return pcapiClient.<UserEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserEntityListing>() {}, callback);
  }

  /**
   * Get the list of available users.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserEntityListing>> getUsersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserEntityListing>> callback) throws ApiException {
    return pcapiClient.<UserEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserEntityListing>() {}, callback);
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserMe> getUsersMeAsync(GetUsersMeRequest request, AsyncApiCallback<UserMe> callback) throws ApiException {
    return pcapiClient.<UserMe>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserMe>() {}, callback);
  }

  /**
   * Get current user details.
   * This request is not valid when using the Client Credentials OAuth grant.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserMe>> getUsersMeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserMe>> callback) throws ApiException {
    return pcapiClient.<UserMe>invokeAPIVerboseAsync(request, new TypeReference<UserMe>() {}, callback);
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UsersSearchResponse> getUsersSearchAsync(GetUsersSearchRequest request, AsyncApiCallback<UsersSearchResponse> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Search users using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UsersSearchResponse>> getUsersSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Update user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<User> patchUserAsync(PatchUserRequest request, AsyncApiCallback<User> callback) throws ApiException {
    return pcapiClient.<User>invokeAPIAsync(request.withHttpInfo(), new TypeReference<User>() {}, callback);
  }

  /**
   * Update user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<User>> patchUserAsync(ApiRequest<User> request, AsyncApiCallback<ApiResponse<User>> callback) throws ApiException {
    return pcapiClient.<User>invokeAPIVerboseAsync(request, new TypeReference<User>() {}, callback);
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallForwarding> patchUserCallforwardingAsync(PatchUserCallforwardingRequest request, AsyncApiCallback<CallForwarding> callback) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallForwarding>() {}, callback);
  }

  /**
   * Patch a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallForwarding>> patchUserCallforwardingAsync(ApiRequest<CallForwarding> request, AsyncApiCallback<ApiResponse<CallForwarding>> callback) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIVerboseAsync(request, new TypeReference<CallForwarding>() {}, callback);
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Geolocation> patchUserGeolocationAsync(PatchUserGeolocationRequest request, AsyncApiCallback<Geolocation> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Geolocation>() {}, callback);
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Geolocation>> patchUserGeolocationAsync(ApiRequest<Geolocation> request, AsyncApiCallback<ApiResponse<Geolocation>> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerboseAsync(request, new TypeReference<Geolocation>() {}, callback);
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserQueue> patchUserQueueAsync(PatchUserQueueRequest request, AsyncApiCallback<UserQueue> callback) throws ApiException {
    return pcapiClient.<UserQueue>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserQueue>() {}, callback);
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserQueue>> patchUserQueueAsync(ApiRequest<UserQueue> request, AsyncApiCallback<ApiResponse<UserQueue>> callback) throws ApiException {
    return pcapiClient.<UserQueue>invokeAPIVerboseAsync(request, new TypeReference<UserQueue>() {}, callback);
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserQueueEntityListing> patchUserQueuesAsync(PatchUserQueuesRequest request, AsyncApiCallback<UserQueueEntityListing> callback) throws ApiException {
    return pcapiClient.<UserQueueEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {}, callback);
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserQueueEntityListing>> patchUserQueuesAsync(ApiRequest<List<UserQueue>> request, AsyncApiCallback<ApiResponse<UserQueueEntityListing>> callback) throws ApiException {
    return pcapiClient.<UserQueueEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserQueueEntityListing>() {}, callback);
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PresenceQueryResponse> postAnalyticsUsersAggregatesQueryAsync(PostAnalyticsUsersAggregatesQueryRequest request, AsyncApiCallback<PresenceQueryResponse> callback) throws ApiException {
    return pcapiClient.<PresenceQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PresenceQueryResponse>() {}, callback);
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PresenceQueryResponse>> postAnalyticsUsersAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<PresenceQueryResponse>> callback) throws ApiException {
    return pcapiClient.<PresenceQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<PresenceQueryResponse>() {}, callback);
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryAsync(PostAnalyticsUsersDetailsQueryRequest request, AsyncApiCallback<AnalyticsUserDetailsQueryResponse> callback) throws ApiException {
    return pcapiClient.<AnalyticsUserDetailsQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, callback);
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AnalyticsUserDetailsQueryResponse>> postAnalyticsUsersDetailsQueryAsync(ApiRequest<UserDetailsQuery> request, AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>> callback) throws ApiException {
    return pcapiClient.<AnalyticsUserDetailsQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, callback);
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ObservationQueryResponse> postAnalyticsUsersObservationsQueryAsync(PostAnalyticsUsersObservationsQueryRequest request, AsyncApiCallback<ObservationQueryResponse> callback) throws ApiException {
    return pcapiClient.<ObservationQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ObservationQueryResponse>() {}, callback);
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ObservationQueryResponse>> postAnalyticsUsersObservationsQueryAsync(ApiRequest<ObservationQuery> request, AsyncApiCallback<ApiResponse<ObservationQueryResponse>> callback) throws ApiException {
    return pcapiClient.<ObservationQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<ObservationQueryResponse>() {}, callback);
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserRoutingSkill> postUserRoutingskillsAsync(PostUserRoutingskillsRequest request, AsyncApiCallback<UserRoutingSkill> callback) throws ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {}, callback);
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserRoutingSkill>> postUserRoutingskillsAsync(ApiRequest<UserRoutingSkillPost> request, AsyncApiCallback<ApiResponse<UserRoutingSkill>> callback) throws ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerboseAsync(request, new TypeReference<UserRoutingSkill>() {}, callback);
  }

  /**
   * Create user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<User> postUsersAsync(PostUsersRequest request, AsyncApiCallback<User> callback) throws ApiException {
    return pcapiClient.<User>invokeAPIAsync(request.withHttpInfo(), new TypeReference<User>() {}, callback);
  }

  /**
   * Create user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<User>> postUsersAsync(ApiRequest<CreateUser> request, AsyncApiCallback<ApiResponse<User>> callback) throws ApiException {
    return pcapiClient.<User>invokeAPIVerboseAsync(request, new TypeReference<User>() {}, callback);
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UsersSearchResponse> postUsersSearchAsync(PostUsersSearchRequest request, AsyncApiCallback<UsersSearchResponse> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Search users
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UsersSearchResponse>> postUsersSearchAsync(ApiRequest<UserSearchRequest> request, AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) throws ApiException {
    return pcapiClient.<UsersSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<UsersSearchResponse>() {}, callback);
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallForwarding> putUserCallforwardingAsync(PutUserCallforwardingRequest request, AsyncApiCallback<CallForwarding> callback) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallForwarding>() {}, callback);
  }

  /**
   * Update a user&#39;s CallForwarding
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallForwarding>> putUserCallforwardingAsync(ApiRequest<CallForwarding> request, AsyncApiCallback<ApiResponse<CallForwarding>> callback) throws ApiException {
    return pcapiClient.<CallForwarding>invokeAPIVerboseAsync(request, new TypeReference<CallForwarding>() {}, callback);
  }

  /**
   * Update an OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OutOfOffice> putUserOutofofficeAsync(PutUserOutofofficeRequest request, AsyncApiCallback<OutOfOffice> callback) throws ApiException {
    return pcapiClient.<OutOfOffice>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OutOfOffice>() {}, callback);
  }

  /**
   * Update an OutOfOffice
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OutOfOffice>> putUserOutofofficeAsync(ApiRequest<OutOfOffice> request, AsyncApiCallback<ApiResponse<OutOfOffice>> callback) throws ApiException {
    return pcapiClient.<OutOfOffice>invokeAPIVerboseAsync(request, new TypeReference<OutOfOffice>() {}, callback);
  }

  /**
   * Update profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<String>> putUserProfileskillsAsync(PutUserProfileskillsRequest request, AsyncApiCallback<List<String>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Update profile skills for a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<String>>> putUserProfileskillsAsync(ApiRequest<List<String>> request, AsyncApiCallback<ApiResponse<List<String>>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerboseAsync(request, new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserAuthorization> putUserRolesAsync(PutUserRolesRequest request, AsyncApiCallback<UserAuthorization> callback) throws ApiException {
    return pcapiClient.<UserAuthorization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserAuthorization>() {}, callback);
  }

  /**
   * Sets the user&#39;s roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserAuthorization>> putUserRolesAsync(ApiRequest<List<String>> request, AsyncApiCallback<ApiResponse<UserAuthorization>> callback) throws ApiException {
    return pcapiClient.<UserAuthorization>invokeAPIVerboseAsync(request, new TypeReference<UserAuthorization>() {}, callback);
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserRoutingSkill> putUserRoutingskillAsync(PutUserRoutingskillRequest request, AsyncApiCallback<UserRoutingSkill> callback) throws ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {}, callback);
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserRoutingSkill>> putUserRoutingskillAsync(ApiRequest<UserRoutingSkill> request, AsyncApiCallback<ApiResponse<UserRoutingSkill>> callback) throws ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerboseAsync(request, new TypeReference<UserRoutingSkill>() {}, callback);
  }

  /**
   * Update the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingStatus> putUserRoutingstatusAsync(PutUserRoutingstatusRequest request, AsyncApiCallback<RoutingStatus> callback) throws ApiException {
    return pcapiClient.<RoutingStatus>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingStatus>() {}, callback);
  }

  /**
   * Update the routing status of a user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingStatus>> putUserRoutingstatusAsync(ApiRequest<RoutingStatus> request, AsyncApiCallback<ApiResponse<RoutingStatus>> callback) throws ApiException {
    return pcapiClient.<RoutingStatus>invokeAPIVerboseAsync(request, new TypeReference<RoutingStatus>() {}, callback);
  }

  /**
   * Set associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> putUserStationAssociatedstationStationIdAsync(PutUserStationAssociatedstationStationIdRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Set associated station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> putUserStationAssociatedstationStationIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Set default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> putUserStationDefaultstationStationIdAsync(PutUserStationDefaultstationStationIdRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Set default station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> putUserStationDefaultstationStationIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

}
