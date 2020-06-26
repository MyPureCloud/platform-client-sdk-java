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
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.GroupProfile;
import com.mypurecloud.sdk.v2.model.GroupEntityListing;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupProfileEntityListing;
import com.mypurecloud.sdk.v2.model.GroupMembersUpdate;
import com.mypurecloud.sdk.v2.model.GroupCreate;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupUpdate;


import com.mypurecloud.sdk.v2.api.request.DeleteGroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteGroupMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetFieldconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupIndividualsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupProfileRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetProfilesGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupMembersRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutGroupRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupsApi {
  private final ApiClient pcapiClient;

  public GroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete group
   * 
   * @param groupId Group ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteGroup(String groupId) throws IOException, ApiException {
     deleteGroup(createDeleteGroupRequest(groupId));
  }

  /**
   * Delete group
   * 
   * @param groupId Group ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteGroupWithHttpInfo(String groupId) throws IOException {
    return deleteGroup(createDeleteGroupRequest(groupId).withHttpInfo());
  }

  private DeleteGroupRequest createDeleteGroupRequest(String groupId) {
    return DeleteGroupRequest.builder()
            .withGroupId(groupId)
    
            .build();
  }

  /**
   * Delete group
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteGroup(DeleteGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteGroup(ApiRequest<Void> request) throws IOException {
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
   * Remove members
   * 
   * @param groupId Group ID (required)
   * @param ids Comma separated list of userIds to remove (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteGroupMembers(String groupId, String ids) throws IOException, ApiException {
    return  deleteGroupMembers(createDeleteGroupMembersRequest(groupId, ids));
  }

  /**
   * Remove members
   * 
   * @param groupId Group ID (required)
   * @param ids Comma separated list of userIds to remove (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteGroupMembersWithHttpInfo(String groupId, String ids) throws IOException {
    return deleteGroupMembers(createDeleteGroupMembersRequest(groupId, ids).withHttpInfo());
  }

  private DeleteGroupMembersRequest createDeleteGroupMembersRequest(String groupId, String ids) {
    return DeleteGroupMembersRequest.builder()
            .withGroupId(groupId)
    
            .withIds(ids)
    
            .build();
  }

  /**
   * Remove members
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteGroupMembers(DeleteGroupMembersRequest request) throws IOException, ApiException {
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
   * Remove members
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteGroupMembers(ApiRequest<Void> request) throws IOException {
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
   * Get group
   * 
   * @param groupId Group ID (required)
   * @return Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Group getGroup(String groupId) throws IOException, ApiException {
    return  getGroup(createGetGroupRequest(groupId));
  }

  /**
   * Get group
   * 
   * @param groupId Group ID (required)
   * @return Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Group> getGroupWithHttpInfo(String groupId) throws IOException {
    return getGroup(createGetGroupRequest(groupId).withHttpInfo());
  }

  private GetGroupRequest createGetGroupRequest(String groupId) {
    return GetGroupRequest.builder()
            .withGroupId(groupId)
    
            .build();
  }

  /**
   * Get group
   * 
   * @param request The request object
   * @return Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Group getGroup(GetGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Group> getGroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Group> response = (ApiResponse<Group>)(ApiResponse<?>)exception;
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
      ApiResponse<Group> response = (ApiResponse<Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all individuals associated with the group
   * 
   * @param groupId Group ID (required)
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getGroupIndividuals(String groupId) throws IOException, ApiException {
    return  getGroupIndividuals(createGetGroupIndividualsRequest(groupId));
  }

  /**
   * Get all individuals associated with the group
   * 
   * @param groupId Group ID (required)
   * @return UserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getGroupIndividualsWithHttpInfo(String groupId) throws IOException {
    return getGroupIndividuals(createGetGroupIndividualsRequest(groupId).withHttpInfo());
  }

  private GetGroupIndividualsRequest createGetGroupIndividualsRequest(String groupId) {
    return GetGroupIndividualsRequest.builder()
            .withGroupId(groupId)
    
            .build();
  }

  /**
   * Get all individuals associated with the group
   * 
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getGroupIndividuals(GetGroupIndividualsRequest request) throws IOException, ApiException {
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
   * Get all individuals associated with the group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getGroupIndividuals(ApiRequest<Void> request) throws IOException {
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
   * Get group members, includes individuals, owners, and dynamically included people
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getGroupMembers(String groupId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return  getGroupMembers(createGetGroupMembersRequest(groupId, pageSize, pageNumber, sortOrder, expand));
  }

  /**
   * Get group members, includes individuals, owners, and dynamically included people
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getGroupMembersWithHttpInfo(String groupId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException {
    return getGroupMembers(createGetGroupMembersRequest(groupId, pageSize, pageNumber, sortOrder, expand).withHttpInfo());
  }

  private GetGroupMembersRequest createGetGroupMembersRequest(String groupId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) {
    return GetGroupMembersRequest.builder()
            .withGroupId(groupId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get group members, includes individuals, owners, and dynamically included people
   * 
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getGroupMembers(GetGroupMembersRequest request) throws IOException, ApiException {
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
   * Get group members, includes individuals, owners, and dynamically included people
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getGroupMembers(ApiRequest<Void> request) throws IOException {
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
   * Get group profile
   * This api is deprecated. Use /api/v2/groups instead
   * @param groupId groupId (required)
   * @param fields Comma separated fields to return.  Allowable values can be found by querying /api/v2/fieldconfig?type=group and using the key for the elements returned by the fieldList (optional)
   * @return GroupProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupProfile getGroupProfile(String groupId, String fields) throws IOException, ApiException {
    return  getGroupProfile(createGetGroupProfileRequest(groupId, fields));
  }

  /**
   * Get group profile
   * This api is deprecated. Use /api/v2/groups instead
   * @param groupId groupId (required)
   * @param fields Comma separated fields to return.  Allowable values can be found by querying /api/v2/fieldconfig?type=group and using the key for the elements returned by the fieldList (optional)
   * @return GroupProfile
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupProfile> getGroupProfileWithHttpInfo(String groupId, String fields) throws IOException {
    return getGroupProfile(createGetGroupProfileRequest(groupId, fields).withHttpInfo());
  }

  private GetGroupProfileRequest createGetGroupProfileRequest(String groupId, String fields) {
    return GetGroupProfileRequest.builder()
            .withGroupId(groupId)
    
            .withFields(fields)
    
            .build();
  }

  /**
   * Get group profile
   * This api is deprecated. Use /api/v2/groups instead
   * @param request The request object
   * @return GroupProfile
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupProfile getGroupProfile(GetGroupProfileRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GroupProfile> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GroupProfile>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get group profile
   * This api is deprecated. Use /api/v2/groups instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupProfile> getGroupProfile(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GroupProfile>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GroupProfile> response = (ApiResponse<GroupProfile>)(ApiResponse<?>)exception;
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
      ApiResponse<GroupProfile> response = (ApiResponse<GroupProfile>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a group list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param jabberId A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return GroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupEntityListing getGroups(Integer pageSize, Integer pageNumber, List<String> id, List<String> jabberId, String sortOrder) throws IOException, ApiException {
    return  getGroups(createGetGroupsRequest(pageSize, pageNumber, id, jabberId, sortOrder));
  }

  /**
   * Get a group list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param jabberId A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter) (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return GroupEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupEntityListing> getGroupsWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, List<String> jabberId, String sortOrder) throws IOException {
    return getGroups(createGetGroupsRequest(pageSize, pageNumber, id, jabberId, sortOrder).withHttpInfo());
  }

  private GetGroupsRequest createGetGroupsRequest(Integer pageSize, Integer pageNumber, List<String> id, List<String> jabberId, String sortOrder) {
    return GetGroupsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withId(id)
    
            .withJabberId(jabberId)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get a group list
   * 
   * @param request The request object
   * @return GroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupEntityListing getGroups(GetGroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GroupEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GroupEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a group list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupEntityListing> getGroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GroupEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GroupEntityListing> response = (ApiResponse<GroupEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GroupEntityListing> response = (ApiResponse<GroupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse getGroupsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getGroupsSearch(createGetGroupsSearchRequest(q64, expand));
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getGroupsSearch(createGetGroupsSearchRequest(q64, expand).withHttpInfo());
  }

  private GetGroupsSearchRequest createGetGroupsSearchRequest(String q64, List<String> expand) {
    return GetGroupsSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse getGroupsSearch(GetGroupsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GroupsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GroupsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get group profile listing
   * This api is deprecated. Use /api/v2/groups instead.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return GroupProfileEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupProfileEntityListing getProfilesGroups(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder) throws IOException, ApiException {
    return  getProfilesGroups(createGetProfilesGroupsRequest(pageSize, pageNumber, id, sortOrder));
  }

  /**
   * Get group profile listing
   * This api is deprecated. Use /api/v2/groups instead.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return GroupProfileEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupProfileEntityListing> getProfilesGroupsWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder) throws IOException {
    return getProfilesGroups(createGetProfilesGroupsRequest(pageSize, pageNumber, id, sortOrder).withHttpInfo());
  }

  private GetProfilesGroupsRequest createGetProfilesGroupsRequest(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder) {
    return GetProfilesGroupsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withId(id)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get group profile listing
   * This api is deprecated. Use /api/v2/groups instead.
   * @param request The request object
   * @return GroupProfileEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupProfileEntityListing getProfilesGroups(GetProfilesGroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GroupProfileEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GroupProfileEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get group profile listing
   * This api is deprecated. Use /api/v2/groups instead.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupProfileEntityListing> getProfilesGroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GroupProfileEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GroupProfileEntityListing> response = (ApiResponse<GroupProfileEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GroupProfileEntityListing> response = (ApiResponse<GroupProfileEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add members
   * 
   * @param groupId Group ID (required)
   * @param body Add members (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty postGroupMembers(String groupId, GroupMembersUpdate body) throws IOException, ApiException {
    return  postGroupMembers(createPostGroupMembersRequest(groupId, body));
  }

  /**
   * Add members
   * 
   * @param groupId Group ID (required)
   * @param body Add members (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> postGroupMembersWithHttpInfo(String groupId, GroupMembersUpdate body) throws IOException {
    return postGroupMembers(createPostGroupMembersRequest(groupId, body).withHttpInfo());
  }

  private PostGroupMembersRequest createPostGroupMembersRequest(String groupId, GroupMembersUpdate body) {
    return PostGroupMembersRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add members
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty postGroupMembers(PostGroupMembersRequest request) throws IOException, ApiException {
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
   * Add members
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> postGroupMembers(ApiRequest<GroupMembersUpdate> request) throws IOException {
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
   * Create a group
   * 
   * @param body Group (required)
   * @return Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Group postGroups(GroupCreate body) throws IOException, ApiException {
    return  postGroups(createPostGroupsRequest(body));
  }

  /**
   * Create a group
   * 
   * @param body Group (required)
   * @return Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Group> postGroupsWithHttpInfo(GroupCreate body) throws IOException {
    return postGroups(createPostGroupsRequest(body).withHttpInfo());
  }

  private PostGroupsRequest createPostGroupsRequest(GroupCreate body) {
    return PostGroupsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a group
   * 
   * @param request The request object
   * @return Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Group postGroups(PostGroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Group> postGroups(ApiRequest<GroupCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Group> response = (ApiResponse<Group>)(ApiResponse<?>)exception;
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
      ApiResponse<Group> response = (ApiResponse<Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse postGroupsSearch(GroupSearchRequest body) throws IOException, ApiException {
    return  postGroupsSearch(createPostGroupsSearchRequest(body));
  }

  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearchWithHttpInfo(GroupSearchRequest body) throws IOException {
    return postGroupsSearch(createPostGroupsSearchRequest(body).withHttpInfo());
  }

  private PostGroupsSearchRequest createPostGroupsSearchRequest(GroupSearchRequest body) {
    return PostGroupsSearchRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Search groups
   * 
   * @param request The request object
   * @return GroupsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GroupsSearchResponse postGroupsSearch(PostGroupsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GroupsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearch(ApiRequest<GroupSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GroupsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update group
   * 
   * @param groupId Group ID (required)
   * @param body Group (optional)
   * @return Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Group putGroup(String groupId, GroupUpdate body) throws IOException, ApiException {
    return  putGroup(createPutGroupRequest(groupId, body));
  }

  /**
   * Update group
   * 
   * @param groupId Group ID (required)
   * @param body Group (optional)
   * @return Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Group> putGroupWithHttpInfo(String groupId, GroupUpdate body) throws IOException {
    return putGroup(createPutGroupRequest(groupId, body).withHttpInfo());
  }

  private PutGroupRequest createPutGroupRequest(String groupId, GroupUpdate body) {
    return PutGroupRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update group
   * 
   * @param request The request object
   * @return Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Group putGroup(PutGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Group> putGroup(ApiRequest<GroupUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Group> response = (ApiResponse<Group>)(ApiResponse<?>)exception;
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
      ApiResponse<Group> response = (ApiResponse<Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
