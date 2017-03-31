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
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(String groupId) throws IOException, ApiException {
    deleteGroupWithHttpInfo(groupId);
  }

  /**
   * Delete group
   * 
   * @param groupId Group ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteGroupWithHttpInfo(String groupId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling deleteGroup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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
   * Delete group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(DeleteGroupRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteGroup(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Remove members
   * 
   * @param groupId Group ID (required)
   * @param ids Comma separated list of userIds to remove (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty deleteGroupMembers(String groupId, String ids) throws IOException, ApiException {
    return deleteGroupMembersWithHttpInfo(groupId, ids).getBody();
  }

  /**
   * Remove members
   * 
   * @param groupId Group ID (required)
   * @param ids Comma separated list of userIds to remove (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteGroupMembersWithHttpInfo(String groupId, String ids) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling deleteGroupMembers");
    }
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new IllegalArgumentException("Missing the required parameter 'ids' when calling deleteGroupMembers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "ids", ids));

    
    
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
   * Remove members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty deleteGroupMembers(DeleteGroupMembersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Remove members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> deleteGroupMembers(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if fails to make API call
   */
  public FieldConfig getFieldconfig(String type) throws IOException, ApiException {
    return getFieldconfigWithHttpInfo(type).getBody();
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldConfig> getFieldconfigWithHttpInfo(String type) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new IllegalArgumentException("Missing the required parameter 'type' when calling getFieldconfig");
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
  public FieldConfig getFieldconfig(GetFieldconfigRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FieldConfig>() {});
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldConfig> getFieldconfig(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<FieldConfig>invokeAPIVerbose(request, new TypeReference<FieldConfig>() {});
  }

  /**
   * Get group
   * 
   * @param groupId Group ID (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group getGroup(String groupId) throws IOException, ApiException {
    return getGroupWithHttpInfo(groupId).getBody();
  }

  /**
   * Get group
   * 
   * @param groupId Group ID (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Group> getGroupWithHttpInfo(String groupId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling getGroup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Group>() {});
  }

  /**
   * Get group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Group getGroup(GetGroupRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Group>() {});
  }

  /**
   * Get group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Group> getGroup(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Group>invokeAPIVerbose(request, new TypeReference<Group>() {});
  }

  /**
   * Get group members
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserEntityListing getGroupMembers(String groupId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    return getGroupMembersWithHttpInfo(groupId, pageSize, pageNumber, sortOrder, expand).getBody();
  }

  /**
   * Get group members
   * 
   * @param groupId Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param expand Which fields, if any, to expand (optional)
   * @return UserEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserEntityListing> getGroupMembersWithHttpInfo(String groupId, Integer pageSize, Integer pageNumber, String sortOrder, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling getGroupMembers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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
   * Get group members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserEntityListing getGroupMembers(GetGroupMembersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get group members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserEntityListing> getGroupMembers(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<UserEntityListing>invokeAPIVerbose(request, new TypeReference<UserEntityListing>() {});
  }

  /**
   * Get a group list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return GroupEntityListing
   * @throws ApiException if fails to make API call
   */
  public GroupEntityListing getGroups(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return getGroupsWithHttpInfo(pageSize, pageNumber, sortOrder).getBody();
  }

  /**
   * Get a group list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return GroupEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupEntityListing> getGroupsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GroupEntityListing>() {});
  }

  /**
   * Get a group list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GroupEntityListing getGroups(GetGroupsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GroupEntityListing>() {});
  }

  /**
   * Get a group list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupEntityListing> getGroups(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<GroupEntityListing>invokeAPIVerbose(request, new TypeReference<GroupEntityListing>() {});
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse getGroupsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return getGroupsSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearchWithHttpInfo(String q64, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getGroupsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/search".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse getGroupsSearch(GetGroupsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> getGroupsSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerbose(request, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Add members
   * 
   * @param groupId Group ID (required)
   * @param body Add members (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public Empty postGroupMembers(String groupId, GroupMembersUpdate body) throws IOException, ApiException {
    return postGroupMembersWithHttpInfo(groupId, body).getBody();
  }

  /**
   * Add members
   * 
   * @param groupId Group ID (required)
   * @param body Add members (required)
   * @return Empty
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> postGroupMembersWithHttpInfo(String groupId, GroupMembersUpdate body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling postGroupMembers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postGroupMembers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}/members".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Empty>() {});
  }

  /**
   * Add members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Empty postGroupMembers(PostGroupMembersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Empty>() {});
  }

  /**
   * Add members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Empty> postGroupMembers(ApiRequest<GroupMembersUpdate> request) throws IOException, ApiException {
    return pcapiClient.<Empty>invokeAPIVerbose(request, new TypeReference<Empty>() {});
  }

  /**
   * Create a group
   * 
   * @param body Group (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group postGroups(Group body) throws IOException, ApiException {
    return postGroupsWithHttpInfo(body).getBody();
  }

  /**
   * Create a group
   * 
   * @param body Group (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Group> postGroupsWithHttpInfo(Group body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postGroups");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Group>() {});
  }

  /**
   * Create a group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Group postGroups(PostGroupsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Group>() {});
  }

  /**
   * Create a group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Group> postGroups(ApiRequest<Group> request) throws IOException, ApiException {
    return pcapiClient.<Group>invokeAPIVerbose(request, new TypeReference<Group>() {});
  }

  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse postGroupsSearch(GroupSearchRequest body) throws IOException, ApiException {
    return postGroupsSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search groups
   * 
   * @param body Search request options (required)
   * @return GroupsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearchWithHttpInfo(GroupSearchRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postGroupsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/search".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GroupsSearchResponse postGroupsSearch(PostGroupsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Search groups
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GroupsSearchResponse> postGroupsSearch(ApiRequest<GroupSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<GroupsSearchResponse>invokeAPIVerbose(request, new TypeReference<GroupsSearchResponse>() {});
  }

  /**
   * Update group
   * 
   * @param groupId Group ID (required)
   * @param body Group (optional)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group putGroup(String groupId, GroupUpdate body) throws IOException, ApiException {
    return putGroupWithHttpInfo(groupId, body).getBody();
  }

  /**
   * Update group
   * 
   * @param groupId Group ID (required)
   * @param body Group (optional)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Group> putGroupWithHttpInfo(String groupId, GroupUpdate body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'groupId' when calling putGroup");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", pcapiClient.escapeString(groupId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Group>() {});
  }

  /**
   * Update group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Group putGroup(PutGroupRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Group>() {});
  }

  /**
   * Update group
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Group> putGroup(ApiRequest<GroupUpdate> request) throws IOException, ApiException {
    return pcapiClient.<Group>invokeAPIVerbose(request, new TypeReference<Group>() {});
  }

}
