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
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.GroupEntityListing;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupMembersUpdate;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupUpdate;


import com.mypurecloud.sdk.v2.api.request.DeleteGroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteGroupMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetFieldconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupMembersRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutGroupRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class GroupsApiAsync {
  private final ApiClient pcapiClient;

  public GroupsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteGroupAsync(DeleteGroupRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteGroupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Remove members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> deleteGroupMembersAsync(DeleteGroupMembersRequest request, AsyncApiCallback<Empty> callback) {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Remove members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> deleteGroupMembersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FieldConfig> getFieldconfigAsync(GetFieldconfigRequest request, AsyncApiCallback<FieldConfig> callback) {
    return pcapiClient.<FieldConfig>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FieldConfig>() {}, callback);
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FieldConfig>> getFieldconfigAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FieldConfig>> callback) {
    return pcapiClient.<FieldConfig>invokeAPIVerboseAsync(request, new TypeReference<FieldConfig>() {}, callback);
  }

  /**
   * Get group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Group> getGroupAsync(GetGroupRequest request, AsyncApiCallback<Group> callback) {
    return pcapiClient.<Group>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Group>() {}, callback);
  }

  /**
   * Get group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Group>> getGroupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Group>> callback) {
    return pcapiClient.<Group>invokeAPIVerboseAsync(request, new TypeReference<Group>() {}, callback);
  }

  /**
   * Get group members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserEntityListing> getGroupMembersAsync(GetGroupMembersRequest request, AsyncApiCallback<UserEntityListing> callback) {
    return pcapiClient.<UserEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserEntityListing>() {}, callback);
  }

  /**
   * Get group members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserEntityListing>> getGroupMembersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserEntityListing>> callback) {
    return pcapiClient.<UserEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserEntityListing>() {}, callback);
  }

  /**
   * Get a group list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GroupEntityListing> getGroupsAsync(GetGroupsRequest request, AsyncApiCallback<GroupEntityListing> callback) {
    return pcapiClient.<GroupEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GroupEntityListing>() {}, callback);
  }

  /**
   * Get a group list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GroupEntityListing>> getGroupsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<GroupEntityListing>> callback) {
    return pcapiClient.<GroupEntityListing>invokeAPIVerboseAsync(request, new TypeReference<GroupEntityListing>() {}, callback);
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GroupsSearchResponse> getGroupsSearchAsync(GetGroupsSearchRequest request, AsyncApiCallback<GroupsSearchResponse> callback) {
    return pcapiClient.<GroupsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GroupsSearchResponse>> getGroupsSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<GroupsSearchResponse>> callback) {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Add members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Empty> postGroupMembersAsync(PostGroupMembersRequest request, AsyncApiCallback<Empty> callback) {
    return pcapiClient.<Empty>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, callback);
  }

  /**
   * Add members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Empty>> postGroupMembersAsync(ApiRequest<GroupMembersUpdate> request, AsyncApiCallback<ApiResponse<Empty>> callback) {
    return pcapiClient.<Empty>invokeAPIVerboseAsync(request, new TypeReference<Empty>() {}, callback);
  }

  /**
   * Create a group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Group> postGroupsAsync(PostGroupsRequest request, AsyncApiCallback<Group> callback) {
    return pcapiClient.<Group>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Group>() {}, callback);
  }

  /**
   * Create a group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Group>> postGroupsAsync(ApiRequest<Group> request, AsyncApiCallback<ApiResponse<Group>> callback) {
    return pcapiClient.<Group>invokeAPIVerboseAsync(request, new TypeReference<Group>() {}, callback);
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GroupsSearchResponse> postGroupsSearchAsync(PostGroupsSearchRequest request, AsyncApiCallback<GroupsSearchResponse> callback) {
    return pcapiClient.<GroupsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GroupsSearchResponse>> postGroupsSearchAsync(ApiRequest<GroupSearchRequest> request, AsyncApiCallback<ApiResponse<GroupsSearchResponse>> callback) {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<GroupsSearchResponse>() {}, callback);
  }

  /**
   * Update group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Group> putGroupAsync(PutGroupRequest request, AsyncApiCallback<Group> callback) {
    return pcapiClient.<Group>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Group>() {}, callback);
  }

  /**
   * Update group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Group>> putGroupAsync(ApiRequest<GroupUpdate> request, AsyncApiCallback<ApiResponse<Group>> callback) {
    return pcapiClient.<Group>invokeAPIVerboseAsync(request, new TypeReference<Group>() {}, callback);
  }

}
