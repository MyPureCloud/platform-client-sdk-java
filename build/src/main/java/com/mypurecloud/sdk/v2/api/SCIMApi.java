package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ScimError;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypesListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaDefinition;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;


import com.mypurecloud.sdk.v2.api.request.DeleteScimGroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteScimV2GroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteScimV2UserRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimGroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimResourcetypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimResourcetypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimServiceproviderconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2GroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2GroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2ResourcetypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2ResourcetypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2SchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2SchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2ServiceproviderconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2UserRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2UsersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimGroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimV2GroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimV2UserRequest;
import com.mypurecloud.sdk.v2.api.request.PostScimGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostScimUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostScimV2GroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostScimV2UsersRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimGroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimV2GroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimV2UserRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SCIMApi {
  private final ApiClient pcapiClient;

  public SCIMApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SCIMApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a group.
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteScimGroup(String groupId, String ifMatch) throws IOException, ApiException {
     deleteScimGroup(createDeleteScimGroupRequest(groupId, ifMatch));
  }

  /**
   * Delete a group.
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteScimGroupWithHttpInfo(String groupId, String ifMatch) throws IOException {
    return deleteScimGroup(createDeleteScimGroupRequest(groupId, ifMatch).withHttpInfo());
  }

  private DeleteScimGroupRequest createDeleteScimGroupRequest(String groupId, String ifMatch) {
    return DeleteScimGroupRequest.builder()
            .withGroupId(groupId)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Delete a group.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteScimGroup(DeleteScimGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteScimGroup(ApiRequest<Void> request) throws IOException {
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
   * Delete a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteScimUser(String userId, String ifMatch) throws IOException, ApiException {
    return  deleteScimUser(createDeleteScimUserRequest(userId, ifMatch));
  }

  /**
   * Delete a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteScimUserWithHttpInfo(String userId, String ifMatch) throws IOException {
    return deleteScimUser(createDeleteScimUserRequest(userId, ifMatch).withHttpInfo());
  }

  private DeleteScimUserRequest createDeleteScimUserRequest(String userId, String ifMatch) {
    return DeleteScimUserRequest.builder()
            .withUserId(userId)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Delete a user
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteScimUser(DeleteScimUserRequest request) throws IOException, ApiException {
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
   * Delete a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteScimUser(ApiRequest<Void> request) throws IOException {
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
   * Delete a group.
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteScimV2Group(String groupId, String ifMatch) throws IOException, ApiException {
     deleteScimV2Group(createDeleteScimV2GroupRequest(groupId, ifMatch));
  }

  /**
   * Delete a group.
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteScimV2GroupWithHttpInfo(String groupId, String ifMatch) throws IOException {
    return deleteScimV2Group(createDeleteScimV2GroupRequest(groupId, ifMatch).withHttpInfo());
  }

  private DeleteScimV2GroupRequest createDeleteScimV2GroupRequest(String groupId, String ifMatch) {
    return DeleteScimV2GroupRequest.builder()
            .withGroupId(groupId)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Delete a group.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteScimV2Group(DeleteScimV2GroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteScimV2Group(ApiRequest<Void> request) throws IOException {
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
   * Delete a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteScimV2User(String userId, String ifMatch) throws IOException, ApiException {
    return  deleteScimV2User(createDeleteScimV2UserRequest(userId, ifMatch));
  }

  /**
   * Delete a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteScimV2UserWithHttpInfo(String userId, String ifMatch) throws IOException {
    return deleteScimV2User(createDeleteScimV2UserRequest(userId, ifMatch).withHttpInfo());
  }

  private DeleteScimV2UserRequest createDeleteScimV2UserRequest(String userId, String ifMatch) {
    return DeleteScimV2UserRequest.builder()
            .withUserId(userId)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Delete a user
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteScimV2User(DeleteScimV2UserRequest request) throws IOException, ApiException {
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
   * Delete a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteScimV2User(ApiRequest<Void> request) throws IOException {
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
   * Get a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/groups. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. (optional)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group getScimGroup(String groupId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException, ApiException {
    return  getScimGroup(createGetScimGroupRequest(groupId, attributes, excludedAttributes, ifNoneMatch));
  }

  /**
   * Get a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/groups. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. (optional)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> getScimGroupWithHttpInfo(String groupId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException {
    return getScimGroup(createGetScimGroupRequest(groupId, attributes, excludedAttributes, ifNoneMatch).withHttpInfo());
  }

  private GetScimGroupRequest createGetScimGroupRequest(String groupId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) {
    return GetScimGroupRequest.builder()
            .withGroupId(groupId)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .withIfNoneMatch(ifNoneMatch)
    
            .build();
  }

  /**
   * Get a group
   * 
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group getScimGroup(GetScimGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> getScimGroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of groups
   * 
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @param filter Filters results. (optional)
   * @return ScimGroupListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimGroupListResponse getScimGroups(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) throws IOException, ApiException {
    return  getScimGroups(createGetScimGroupsRequest(startIndex, count, attributes, excludedAttributes, filter));
  }

  /**
   * Get a list of groups
   * 
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @param filter Filters results. (optional)
   * @return ScimGroupListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimGroupListResponse> getScimGroupsWithHttpInfo(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) throws IOException {
    return getScimGroups(createGetScimGroupsRequest(startIndex, count, attributes, excludedAttributes, filter).withHttpInfo());
  }

  private GetScimGroupsRequest createGetScimGroupsRequest(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) {
    return GetScimGroupsRequest.builder()
            .withStartIndex(startIndex)
    
            .withCount(count)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .withFilter(filter)
    
            .build();
  }

  /**
   * Get a list of groups
   * 
   * @param request The request object
   * @return ScimGroupListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimGroupListResponse getScimGroups(GetScimGroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimGroupListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimGroupListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimGroupListResponse> getScimGroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimGroupListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a resource type
   * 
   * @param resourceType The type of resource. Returned with GET /api/v2/scim/resourcetypes. (required)
   * @return ScimConfigResourceType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceType getScimResourcetype(String resourceType) throws IOException, ApiException {
    return  getScimResourcetype(createGetScimResourcetypeRequest(resourceType));
  }

  /**
   * Get a resource type
   * 
   * @param resourceType The type of resource. Returned with GET /api/v2/scim/resourcetypes. (required)
   * @return ScimConfigResourceType
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceType> getScimResourcetypeWithHttpInfo(String resourceType) throws IOException {
    return getScimResourcetype(createGetScimResourcetypeRequest(resourceType).withHttpInfo());
  }

  private GetScimResourcetypeRequest createGetScimResourcetypeRequest(String resourceType) {
    return GetScimResourcetypeRequest.builder()
            .withResourceType(resourceType)
    
            .build();
  }

  /**
   * Get a resource type
   * 
   * @param request The request object
   * @return ScimConfigResourceType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceType getScimResourcetype(GetScimResourcetypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimConfigResourceType> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimConfigResourceType>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a resource type
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceType> getScimResourcetype(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimConfigResourceType>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of resource types
   * 
   * @return ScimConfigResourceTypesListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceTypesListResponse getScimResourcetypes() throws IOException, ApiException {
    return  getScimResourcetypes(createGetScimResourcetypesRequest());
  }

  /**
   * Get a list of resource types
   * 
   * @return ScimConfigResourceTypesListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceTypesListResponse> getScimResourcetypesWithHttpInfo() throws IOException {
    return getScimResourcetypes(createGetScimResourcetypesRequest().withHttpInfo());
  }

  private GetScimResourcetypesRequest createGetScimResourcetypesRequest() {
    return GetScimResourcetypesRequest.builder()
            .build();
  }

  /**
   * Get a list of resource types
   * 
   * @param request The request object
   * @return ScimConfigResourceTypesListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceTypesListResponse getScimResourcetypes(GetScimResourcetypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimConfigResourceTypesListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimConfigResourceTypesListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of resource types
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceTypesListResponse> getScimResourcetypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimConfigResourceTypesListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the SCIM schema by id
   * 
   * @param schemaId The ID of a schema. (required)
   * @return ScimConfigResourceType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceType getScimSchema(String schemaId) throws IOException, ApiException {
    return  getScimSchema(createGetScimSchemaRequest(schemaId));
  }

  /**
   * Get the SCIM schema by id
   * 
   * @param schemaId The ID of a schema. (required)
   * @return ScimConfigResourceType
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceType> getScimSchemaWithHttpInfo(String schemaId) throws IOException {
    return getScimSchema(createGetScimSchemaRequest(schemaId).withHttpInfo());
  }

  private GetScimSchemaRequest createGetScimSchemaRequest(String schemaId) {
    return GetScimSchemaRequest.builder()
            .withSchemaId(schemaId)
    
            .build();
  }

  /**
   * Get the SCIM schema by id
   * 
   * @param request The request object
   * @return ScimConfigResourceType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceType getScimSchema(GetScimSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimConfigResourceType> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimConfigResourceType>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the SCIM schema by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceType> getScimSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimConfigResourceType>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the SCIM schemas
   * 
   * @param filter Filtered results are invalid and will result in a 403 (Unauthorized) return. (optional)
   * @return ScimConfigResourceTypesListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceTypesListResponse getScimSchemas(String filter) throws IOException, ApiException {
    return  getScimSchemas(createGetScimSchemasRequest(filter));
  }

  /**
   * Get the SCIM schemas
   * 
   * @param filter Filtered results are invalid and will result in a 403 (Unauthorized) return. (optional)
   * @return ScimConfigResourceTypesListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceTypesListResponse> getScimSchemasWithHttpInfo(String filter) throws IOException {
    return getScimSchemas(createGetScimSchemasRequest(filter).withHttpInfo());
  }

  private GetScimSchemasRequest createGetScimSchemasRequest(String filter) {
    return GetScimSchemasRequest.builder()
            .withFilter(filter)
    
            .build();
  }

  /**
   * Get the SCIM schemas
   * 
   * @param request The request object
   * @return ScimConfigResourceTypesListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceTypesListResponse getScimSchemas(GetScimSchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimConfigResourceTypesListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimConfigResourceTypesListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the SCIM schemas
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceTypesListResponse> getScimSchemas(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimConfigResourceTypesListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a service provider&#39;s configuration
   * 
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  (optional)
   * @return ScimServiceProviderConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimServiceProviderConfig getScimServiceproviderconfig(String ifNoneMatch) throws IOException, ApiException {
    return  getScimServiceproviderconfig(createGetScimServiceproviderconfigRequest(ifNoneMatch));
  }

  /**
   * Get a service provider&#39;s configuration
   * 
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  (optional)
   * @return ScimServiceProviderConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimServiceProviderConfig> getScimServiceproviderconfigWithHttpInfo(String ifNoneMatch) throws IOException {
    return getScimServiceproviderconfig(createGetScimServiceproviderconfigRequest(ifNoneMatch).withHttpInfo());
  }

  private GetScimServiceproviderconfigRequest createGetScimServiceproviderconfigRequest(String ifNoneMatch) {
    return GetScimServiceproviderconfigRequest.builder()
            .withIfNoneMatch(ifNoneMatch)
    
            .build();
  }

  /**
   * Get a service provider&#39;s configuration
   * 
   * @param request The request object
   * @return ScimServiceProviderConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimServiceProviderConfig getScimServiceproviderconfig(GetScimServiceproviderconfigRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimServiceProviderConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimServiceProviderConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a service provider&#39;s configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimServiceProviderConfig> getScimServiceproviderconfig(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimServiceProviderConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param ifNoneMatch TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. (optional)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User getScimUser(String userId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException, ApiException {
    return  getScimUser(createGetScimUserRequest(userId, attributes, excludedAttributes, ifNoneMatch));
  }

  /**
   * Get a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param ifNoneMatch TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. (optional)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> getScimUserWithHttpInfo(String userId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException {
    return getScimUser(createGetScimUserRequest(userId, attributes, excludedAttributes, ifNoneMatch).withHttpInfo());
  }

  private GetScimUserRequest createGetScimUserRequest(String userId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) {
    return GetScimUserRequest.builder()
            .withUserId(userId)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .withIfNoneMatch(ifNoneMatch)
    
            .build();
  }

  /**
   * Get a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User getScimUser(GetScimUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> getScimUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param filter Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;. (optional)
   * @return ScimUserListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimUserListResponse getScimUsers(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) throws IOException, ApiException {
    return  getScimUsers(createGetScimUsersRequest(startIndex, count, attributes, excludedAttributes, filter));
  }

  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param filter Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;. (optional)
   * @return ScimUserListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimUserListResponse> getScimUsersWithHttpInfo(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) throws IOException {
    return getScimUsers(createGetScimUsersRequest(startIndex, count, attributes, excludedAttributes, filter).withHttpInfo());
  }

  private GetScimUsersRequest createGetScimUsersRequest(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) {
    return GetScimUsersRequest.builder()
            .withStartIndex(startIndex)
    
            .withCount(count)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .withFilter(filter)
    
            .build();
  }

  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request The request object
   * @return ScimUserListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimUserListResponse getScimUsers(GetScimUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimUserListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimUserListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimUserListResponse> getScimUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimUserListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @param ifNoneMatch TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  (optional)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group getScimV2Group(String groupId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException, ApiException {
    return  getScimV2Group(createGetScimV2GroupRequest(groupId, attributes, excludedAttributes, ifNoneMatch));
  }

  /**
   * Get a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @param ifNoneMatch TThe ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  (optional)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> getScimV2GroupWithHttpInfo(String groupId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException {
    return getScimV2Group(createGetScimV2GroupRequest(groupId, attributes, excludedAttributes, ifNoneMatch).withHttpInfo());
  }

  private GetScimV2GroupRequest createGetScimV2GroupRequest(String groupId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) {
    return GetScimV2GroupRequest.builder()
            .withGroupId(groupId)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .withIfNoneMatch(ifNoneMatch)
    
            .build();
  }

  /**
   * Get a group
   * 
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group getScimV2Group(GetScimV2GroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> getScimV2Group(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of groups
   * 
   * @param filter Filters results. (required)
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @return ScimGroupListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimGroupListResponse getScimV2Groups(String filter, Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes) throws IOException, ApiException {
    return  getScimV2Groups(createGetScimV2GroupsRequest(filter, startIndex, count, attributes, excludedAttributes));
  }

  /**
   * Get a list of groups
   * 
   * @param filter Filters results. (required)
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;active&#39;, and &#39;meta attributes . Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The&#39;id&#39;, &#39;active&#39;, and &#39;meta&#39;  attributes will always be present in the output. (optional)
   * @return ScimGroupListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimGroupListResponse> getScimV2GroupsWithHttpInfo(String filter, Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes) throws IOException {
    return getScimV2Groups(createGetScimV2GroupsRequest(filter, startIndex, count, attributes, excludedAttributes).withHttpInfo());
  }

  private GetScimV2GroupsRequest createGetScimV2GroupsRequest(String filter, Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes) {
    return GetScimV2GroupsRequest.builder()
            .withFilter(filter)
    
            .withStartIndex(startIndex)
    
            .withCount(count)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .build();
  }

  /**
   * Get a list of groups
   * 
   * @param request The request object
   * @return ScimGroupListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimGroupListResponse getScimV2Groups(GetScimV2GroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimGroupListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimGroupListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimGroupListResponse> getScimV2Groups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimGroupListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a resource type
   * 
   * @param resourceType The type of resource. Returned with GET /api/v2/scim/v2/resourcetypes. (required)
   * @return ScimConfigResourceType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceType getScimV2Resourcetype(String resourceType) throws IOException, ApiException {
    return  getScimV2Resourcetype(createGetScimV2ResourcetypeRequest(resourceType));
  }

  /**
   * Get a resource type
   * 
   * @param resourceType The type of resource. Returned with GET /api/v2/scim/v2/resourcetypes. (required)
   * @return ScimConfigResourceType
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceType> getScimV2ResourcetypeWithHttpInfo(String resourceType) throws IOException {
    return getScimV2Resourcetype(createGetScimV2ResourcetypeRequest(resourceType).withHttpInfo());
  }

  private GetScimV2ResourcetypeRequest createGetScimV2ResourcetypeRequest(String resourceType) {
    return GetScimV2ResourcetypeRequest.builder()
            .withResourceType(resourceType)
    
            .build();
  }

  /**
   * Get a resource type
   * 
   * @param request The request object
   * @return ScimConfigResourceType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceType getScimV2Resourcetype(GetScimV2ResourcetypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimConfigResourceType> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimConfigResourceType>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a resource type
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceType> getScimV2Resourcetype(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimConfigResourceType>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of resource types
   * 
   * @return ScimConfigResourceTypesListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceTypesListResponse getScimV2Resourcetypes() throws IOException, ApiException {
    return  getScimV2Resourcetypes(createGetScimV2ResourcetypesRequest());
  }

  /**
   * Get a list of resource types
   * 
   * @return ScimConfigResourceTypesListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceTypesListResponse> getScimV2ResourcetypesWithHttpInfo() throws IOException {
    return getScimV2Resourcetypes(createGetScimV2ResourcetypesRequest().withHttpInfo());
  }

  private GetScimV2ResourcetypesRequest createGetScimV2ResourcetypesRequest() {
    return GetScimV2ResourcetypesRequest.builder()
            .build();
  }

  /**
   * Get a list of resource types
   * 
   * @param request The request object
   * @return ScimConfigResourceTypesListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimConfigResourceTypesListResponse getScimV2Resourcetypes(GetScimV2ResourcetypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimConfigResourceTypesListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimConfigResourceTypesListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of resource types
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimConfigResourceTypesListResponse> getScimV2Resourcetypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimConfigResourceTypesListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the SCIM schema by id
   * 
   * @param schemaId The ID of a schema. (required)
   * @return ScimV2SchemaDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2SchemaDefinition getScimV2Schema(String schemaId) throws IOException, ApiException {
    return  getScimV2Schema(createGetScimV2SchemaRequest(schemaId));
  }

  /**
   * Get the SCIM schema by id
   * 
   * @param schemaId The ID of a schema. (required)
   * @return ScimV2SchemaDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2SchemaDefinition> getScimV2SchemaWithHttpInfo(String schemaId) throws IOException {
    return getScimV2Schema(createGetScimV2SchemaRequest(schemaId).withHttpInfo());
  }

  private GetScimV2SchemaRequest createGetScimV2SchemaRequest(String schemaId) {
    return GetScimV2SchemaRequest.builder()
            .withSchemaId(schemaId)
    
            .build();
  }

  /**
   * Get the SCIM schema by id
   * 
   * @param request The request object
   * @return ScimV2SchemaDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2SchemaDefinition getScimV2Schema(GetScimV2SchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2SchemaDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2SchemaDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the SCIM schema by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2SchemaDefinition> getScimV2Schema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2SchemaDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2SchemaDefinition> response = (ApiResponse<ScimV2SchemaDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2SchemaDefinition> response = (ApiResponse<ScimV2SchemaDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the SCIM schemas
   * 
   * @param filter Filtered results are invalid and will result in a 403 (Unauthorized) return. (optional)
   * @return ScimV2SchemaListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2SchemaListResponse getScimV2Schemas(String filter) throws IOException, ApiException {
    return  getScimV2Schemas(createGetScimV2SchemasRequest(filter));
  }

  /**
   * Get the SCIM schemas
   * 
   * @param filter Filtered results are invalid and will result in a 403 (Unauthorized) return. (optional)
   * @return ScimV2SchemaListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2SchemaListResponse> getScimV2SchemasWithHttpInfo(String filter) throws IOException {
    return getScimV2Schemas(createGetScimV2SchemasRequest(filter).withHttpInfo());
  }

  private GetScimV2SchemasRequest createGetScimV2SchemasRequest(String filter) {
    return GetScimV2SchemasRequest.builder()
            .withFilter(filter)
    
            .build();
  }

  /**
   * Get the SCIM schemas
   * 
   * @param request The request object
   * @return ScimV2SchemaListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2SchemaListResponse getScimV2Schemas(GetScimV2SchemasRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2SchemaListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2SchemaListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the SCIM schemas
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2SchemaListResponse> getScimV2Schemas(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2SchemaListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2SchemaListResponse> response = (ApiResponse<ScimV2SchemaListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2SchemaListResponse> response = (ApiResponse<ScimV2SchemaListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a service provider&#39;s configuration
   * 
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  (optional)
   * @return ScimServiceProviderConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimServiceProviderConfig getScimV2Serviceproviderconfig(String ifNoneMatch) throws IOException, ApiException {
    return  getScimV2Serviceproviderconfig(createGetScimV2ServiceproviderconfigRequest(ifNoneMatch));
  }

  /**
   * Get a service provider&#39;s configuration
   * 
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/serviceproviderconfig. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified.  (optional)
   * @return ScimServiceProviderConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimServiceProviderConfig> getScimV2ServiceproviderconfigWithHttpInfo(String ifNoneMatch) throws IOException {
    return getScimV2Serviceproviderconfig(createGetScimV2ServiceproviderconfigRequest(ifNoneMatch).withHttpInfo());
  }

  private GetScimV2ServiceproviderconfigRequest createGetScimV2ServiceproviderconfigRequest(String ifNoneMatch) {
    return GetScimV2ServiceproviderconfigRequest.builder()
            .withIfNoneMatch(ifNoneMatch)
    
            .build();
  }

  /**
   * Get a service provider&#39;s configuration
   * 
   * @param request The request object
   * @return ScimServiceProviderConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimServiceProviderConfig getScimV2Serviceproviderconfig(GetScimV2ServiceproviderconfigRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimServiceProviderConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimServiceProviderConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a service provider&#39;s configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimServiceProviderConfig> getScimV2Serviceproviderconfig(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimServiceProviderConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. (optional)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User getScimV2User(String userId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException, ApiException {
    return  getScimV2User(createGetScimV2UserRequest(userId, attributes, excludedAttributes, ifNoneMatch));
  }

  /**
   * Get a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param ifNoneMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns the current configuration of the resource. If the ETag is current, returns 304 Not Modified. (optional)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> getScimV2UserWithHttpInfo(String userId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) throws IOException {
    return getScimV2User(createGetScimV2UserRequest(userId, attributes, excludedAttributes, ifNoneMatch).withHttpInfo());
  }

  private GetScimV2UserRequest createGetScimV2UserRequest(String userId, List<String> attributes, List<String> excludedAttributes, String ifNoneMatch) {
    return GetScimV2UserRequest.builder()
            .withUserId(userId)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .withIfNoneMatch(ifNoneMatch)
    
            .build();
  }

  /**
   * Get a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User getScimV2User(GetScimV2UserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> getScimV2User(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param filter Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;. (optional)
   * @return ScimUserListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimUserListResponse getScimV2Users(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) throws IOException, ApiException {
    return  getScimV2Users(createGetScimV2UsersRequest(startIndex, count, attributes, excludedAttributes, filter));
  }

  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param startIndex The 1-based index of the first query result. (optional, default to 1)
   * @param count The requested number of items per page. A value of 0 returns \&quot;totalResults\&quot;. Note that page size over 25 will likely cause a 429 error by exceeding the internal resource limits. Page sizes over 25 will require using excludedAttributes and includeAttributes query parameters to exclude secondary lookup values -- (i.e. for Users externalId, roles, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingLanguages, urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:routingSkills, and for Groups externalId, members). (optional, default to 25)
   * @param attributes Indicates which attributes to include. Returns these attributes and the &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, and &#39;meta&#39; attributes. Use \&quot;attributes\&quot; to avoid expensive secondary calls for the default attributes. (optional)
   * @param excludedAttributes Indicates which attributes to exclude. Returns the default attributes minus \&quot;excludedAttributes\&quot;. Use \&quot;excludedAttributes\&quot; to avoid expensive secondary calls for the default attributes. The &#39;id&#39;, &#39;userName&#39;, &#39;active&#39;, &#39;meta&#39; attributes  will always be present in output. (optional)
   * @param filter Filters results. If nothing is specified, returns all active users. Examples of valid values: \&quot;id eq 857449b0-d9e7-4cd0-acbf-a6adfb9ef1e9\&quot;, \&quot;userName eq search@sample.org\&quot;, \&quot;manager eq 16e10e2f-1136-43fe-bb84-eac073168a49\&quot;, \&quot;email eq search@sample.org\&quot;, \&quot;division eq divisionName\&quot;, \&quot;externalId eq 167844\&quot;, \&quot;active eq false\&quot;. (optional)
   * @return ScimUserListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimUserListResponse> getScimV2UsersWithHttpInfo(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) throws IOException {
    return getScimV2Users(createGetScimV2UsersRequest(startIndex, count, attributes, excludedAttributes, filter).withHttpInfo());
  }

  private GetScimV2UsersRequest createGetScimV2UsersRequest(Integer startIndex, Integer count, List<String> attributes, List<String> excludedAttributes, String filter) {
    return GetScimV2UsersRequest.builder()
            .withStartIndex(startIndex)
    
            .withCount(count)
    
            .withAttributes(attributes)
    
            .withExcludedAttributes(excludedAttributes)
    
            .withFilter(filter)
    
            .build();
  }

  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request The request object
   * @return ScimUserListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimUserListResponse getScimV2Users(GetScimV2UsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimUserListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimUserListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of users
   * To return all active users, do not use a filter parameter. To return inactive users, set \&quot;filter\&quot; to \&quot;active eq false\&quot;. By default, returns SCIM attributes externalId, enterprise-user:manager, and roles. To exclude these attributes, set \&quot;attributes\&quot; to \&quot;id,active\&quot; or \&quot;excludeAttributes\&quot; to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimUserListResponse> getScimV2Users(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimUserListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Modify a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/groups. (required)
   * @param body The information used to modify a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group patchScimGroup(String groupId, ScimV2PatchRequest body, String ifMatch) throws IOException, ApiException {
    return  patchScimGroup(createPatchScimGroupRequest(groupId, body, ifMatch));
  }

  /**
   * Modify a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/groups. (required)
   * @param body The information used to modify a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> patchScimGroupWithHttpInfo(String groupId, ScimV2PatchRequest body, String ifMatch) throws IOException {
    return patchScimGroup(createPatchScimGroupRequest(groupId, body, ifMatch).withHttpInfo());
  }

  private PatchScimGroupRequest createPatchScimGroupRequest(String groupId, ScimV2PatchRequest body, String ifMatch) {
    return PatchScimGroupRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Modify a group
   * 
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group patchScimGroup(PatchScimGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Modify a group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> patchScimGroup(ApiRequest<ScimV2PatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Modify a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param body The information used to modify a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User patchScimUser(String userId, ScimV2PatchRequest body, String ifMatch) throws IOException, ApiException {
    return  patchScimUser(createPatchScimUserRequest(userId, body, ifMatch));
  }

  /**
   * Modify a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param body The information used to modify a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> patchScimUserWithHttpInfo(String userId, ScimV2PatchRequest body, String ifMatch) throws IOException {
    return patchScimUser(createPatchScimUserRequest(userId, body, ifMatch).withHttpInfo());
  }

  private PatchScimUserRequest createPatchScimUserRequest(String userId, ScimV2PatchRequest body, String ifMatch) {
    return PatchScimUserRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Modify a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User patchScimUser(PatchScimUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Modify a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> patchScimUser(ApiRequest<ScimV2PatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Modify a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param body The information used to modify a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group patchScimV2Group(String groupId, ScimV2PatchRequest body, String ifMatch) throws IOException, ApiException {
    return  patchScimV2Group(createPatchScimV2GroupRequest(groupId, body, ifMatch));
  }

  /**
   * Modify a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param body The information used to modify a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> patchScimV2GroupWithHttpInfo(String groupId, ScimV2PatchRequest body, String ifMatch) throws IOException {
    return patchScimV2Group(createPatchScimV2GroupRequest(groupId, body, ifMatch).withHttpInfo());
  }

  private PatchScimV2GroupRequest createPatchScimV2GroupRequest(String groupId, ScimV2PatchRequest body, String ifMatch) {
    return PatchScimV2GroupRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Modify a group
   * 
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group patchScimV2Group(PatchScimV2GroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Modify a group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> patchScimV2Group(ApiRequest<ScimV2PatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Modify a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param body The information used to modify a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User patchScimV2User(String userId, ScimV2PatchRequest body, String ifMatch) throws IOException, ApiException {
    return  patchScimV2User(createPatchScimV2UserRequest(userId, body, ifMatch));
  }

  /**
   * Modify a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param body The information used to modify a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> patchScimV2UserWithHttpInfo(String userId, ScimV2PatchRequest body, String ifMatch) throws IOException {
    return patchScimV2User(createPatchScimV2UserRequest(userId, body, ifMatch).withHttpInfo());
  }

  private PatchScimV2UserRequest createPatchScimV2UserRequest(String userId, ScimV2PatchRequest body, String ifMatch) {
    return PatchScimV2UserRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Modify a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User patchScimV2User(PatchScimV2UserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Modify a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> patchScimV2User(ApiRequest<ScimV2PatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param body The information used to create a group. (required)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group postScimGroups(ScimV2Group body) throws IOException, ApiException {
    return  postScimGroups(createPostScimGroupsRequest(body));
  }

  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param body The information used to create a group. (required)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> postScimGroupsWithHttpInfo(ScimV2Group body) throws IOException {
    return postScimGroups(createPostScimGroupsRequest(body).withHttpInfo());
  }

  private PostScimGroupsRequest createPostScimGroupsRequest(ScimV2Group body) {
    return PostScimGroupsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group postScimGroups(PostScimGroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> postScimGroups(ApiRequest<ScimV2Group> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a user
   * 
   * @param body The information used to create a user. (required)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User postScimUsers(ScimV2CreateUser body) throws IOException, ApiException {
    return  postScimUsers(createPostScimUsersRequest(body));
  }

  /**
   * Create a user
   * 
   * @param body The information used to create a user. (required)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> postScimUsersWithHttpInfo(ScimV2CreateUser body) throws IOException {
    return postScimUsers(createPostScimUsersRequest(body).withHttpInfo());
  }

  private PostScimUsersRequest createPostScimUsersRequest(ScimV2CreateUser body) {
    return PostScimUsersRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User postScimUsers(PostScimUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> postScimUsers(ApiRequest<ScimV2CreateUser> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param body The information used to create a group. (required)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group postScimV2Groups(ScimV2Group body) throws IOException, ApiException {
    return  postScimV2Groups(createPostScimV2GroupsRequest(body));
  }

  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param body The information used to create a group. (required)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> postScimV2GroupsWithHttpInfo(ScimV2Group body) throws IOException {
    return postScimV2Groups(createPostScimV2GroupsRequest(body).withHttpInfo());
  }

  private PostScimV2GroupsRequest createPostScimV2GroupsRequest(ScimV2Group body) {
    return PostScimV2GroupsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group postScimV2Groups(PostScimV2GroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The information used to create a group.
   * PureCloud group will be created as \&quot;Official\&quot; group with visibility set \&quot;Public\&quot;, and rules visibility True. Will auto-create an external ID if one is not provided on create. External ID is used to determine if delete should be allowed.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> postScimV2Groups(ApiRequest<ScimV2Group> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a user
   * 
   * @param body The information used to create a user. (required)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User postScimV2Users(ScimV2CreateUser body) throws IOException, ApiException {
    return  postScimV2Users(createPostScimV2UsersRequest(body));
  }

  /**
   * Create a user
   * 
   * @param body The information used to create a user. (required)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> postScimV2UsersWithHttpInfo(ScimV2CreateUser body) throws IOException {
    return postScimV2Users(createPostScimV2UsersRequest(body).withHttpInfo());
  }

  private PostScimV2UsersRequest createPostScimV2UsersRequest(ScimV2CreateUser body) {
    return PostScimV2UsersRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User postScimV2Users(PostScimV2UsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> postScimV2Users(ApiRequest<ScimV2CreateUser> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/groups. (required)
   * @param body The information used to replace a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group putScimGroup(String groupId, ScimV2Group body, String ifMatch) throws IOException, ApiException {
    return  putScimGroup(createPutScimGroupRequest(groupId, body, ifMatch));
  }

  /**
   * Replace a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/groups. (required)
   * @param body The information used to replace a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> putScimGroupWithHttpInfo(String groupId, ScimV2Group body, String ifMatch) throws IOException {
    return putScimGroup(createPutScimGroupRequest(groupId, body, ifMatch).withHttpInfo());
  }

  private PutScimGroupRequest createPutScimGroupRequest(String groupId, ScimV2Group body, String ifMatch) {
    return PutScimGroupRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Replace a group
   * 
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group putScimGroup(PutScimGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace a group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> putScimGroup(ApiRequest<ScimV2Group> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param body The information used to replace a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User putScimUser(String userId, ScimV2User body, String ifMatch) throws IOException, ApiException {
    return  putScimUser(createPutScimUserRequest(userId, body, ifMatch));
  }

  /**
   * Replace a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/users. (required)
   * @param body The information used to replace a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> putScimUserWithHttpInfo(String userId, ScimV2User body, String ifMatch) throws IOException {
    return putScimUser(createPutScimUserRequest(userId, body, ifMatch).withHttpInfo());
  }

  private PutScimUserRequest createPutScimUserRequest(String userId, ScimV2User body, String ifMatch) {
    return PutScimUserRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Replace a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User putScimUser(PutScimUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> putScimUser(ApiRequest<ScimV2User> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param body The information used to replace a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group putScimV2Group(String groupId, ScimV2Group body, String ifMatch) throws IOException, ApiException {
    return  putScimV2Group(createPutScimV2GroupRequest(groupId, body, ifMatch));
  }

  /**
   * Replace a group
   * 
   * @param groupId The ID of a group. Returned with GET /api/v2/scim/v2/groups. (required)
   * @param body The information used to replace a group. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/groups/{groupId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2Group
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> putScimV2GroupWithHttpInfo(String groupId, ScimV2Group body, String ifMatch) throws IOException {
    return putScimV2Group(createPutScimV2GroupRequest(groupId, body, ifMatch).withHttpInfo());
  }

  private PutScimV2GroupRequest createPutScimV2GroupRequest(String groupId, ScimV2Group body, String ifMatch) {
    return PutScimV2GroupRequest.builder()
            .withGroupId(groupId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Replace a group
   * 
   * @param request The request object
   * @return ScimV2Group
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2Group putScimV2Group(PutScimV2GroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2Group> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2Group>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace a group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2Group> putScimV2Group(ApiRequest<ScimV2Group> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2Group>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param body The information used to replace a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User putScimV2User(String userId, ScimV2User body, String ifMatch) throws IOException, ApiException {
    return  putScimV2User(createPutScimV2UserRequest(userId, body, ifMatch));
  }

  /**
   * Replace a user
   * 
   * @param userId The ID of a user. Returned with GET /api/v2/scim/v2/users. (required)
   * @param body The information used to replace a user. (required)
   * @param ifMatch The ETag of a resource in double quotes. Returned as header and meta.version with initial call to GET /api/v2/scim/v2/users/{userId}. Example: \&quot;42\&quot;. If the ETag is different from the version on the server, returns 400 with a \&quot;scimType\&quot; of \&quot;invalidVers\&quot;. (optional)
   * @return ScimV2User
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> putScimV2UserWithHttpInfo(String userId, ScimV2User body, String ifMatch) throws IOException {
    return putScimV2User(createPutScimV2UserRequest(userId, body, ifMatch).withHttpInfo());
  }

  private PutScimV2UserRequest createPutScimV2UserRequest(String userId, ScimV2User body, String ifMatch) {
    return PutScimV2UserRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .withIfMatch(ifMatch)
    
            .build();
  }

  /**
   * Replace a user
   * 
   * @param request The request object
   * @return ScimV2User
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScimV2User putScimV2User(PutScimV2UserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScimV2User> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScimV2User>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScimV2User> putScimV2User(ApiRequest<ScimV2User> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScimV2User>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
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
      ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
