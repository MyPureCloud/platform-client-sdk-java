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
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;


import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPermissionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationProductsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleUsersAddRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleUsersRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRolesRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AuthorizationApi {
  private final ApiClient pcapiClient;

  public AuthorizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorizationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an organization role.
   * 
   * @param roleId Role ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAuthorizationRole(String roleId) throws ApiException {
    deleteAuthorizationRoleWithHttpInfo(roleId);
  }

  /**
   * Delete an organization role.
   * 
   * @param roleId Role ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAuthorizationRoleWithHttpInfo(String roleId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling deleteAuthorizationRole");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{roleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "roleId" + "\\}", pcapiClient.escapeString(roleId.toString()));

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
   * Delete an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteAuthorizationRole(DeleteAuthorizationRoleRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAuthorizationRole(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
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
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PermissionCollectionEntityListing
   * @throws ApiException if fails to make API call
   */
  public PermissionCollectionEntityListing getAuthorizationPermissions(Integer pageSize, Integer pageNumber) throws ApiException {
    return getAuthorizationPermissionsWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PermissionCollectionEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PermissionCollectionEntityListing> getAuthorizationPermissionsWithHttpInfo(Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/permissions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PermissionCollectionEntityListing>() {});
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PermissionCollectionEntityListing getAuthorizationPermissions(GetAuthorizationPermissionsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PermissionCollectionEntityListing>() {});
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PermissionCollectionEntityListing> getAuthorizationPermissions(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PermissionCollectionEntityListing>invokeAPIVerbose(request, new TypeReference<PermissionCollectionEntityListing>() {});
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @return OrganizationProductEntityListing
   * @throws ApiException if fails to make API call
   */
  public OrganizationProductEntityListing getAuthorizationProducts() throws ApiException {
    return getAuthorizationProductsWithHttpInfo().getBody();
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @return OrganizationProductEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationProductEntityListing> getAuthorizationProductsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/products".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationProductEntityListing>() {});
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationProductEntityListing getAuthorizationProducts(GetAuthorizationProductsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationProductEntityListing>() {});
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationProductEntityListing> getAuthorizationProducts(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OrganizationProductEntityListing>invokeAPIVerbose(request, new TypeReference<OrganizationProductEntityListing>() {});
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param roleId Role ID (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole getAuthorizationRole(String roleId) throws ApiException {
    return getAuthorizationRoleWithHttpInfo(roleId).getBody();
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param roleId Role ID (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> getAuthorizationRoleWithHttpInfo(String roleId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling getAuthorizationRole");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{roleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "roleId" + "\\}", pcapiClient.escapeString(roleId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole getAuthorizationRole(GetAuthorizationRoleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> getAuthorizationRole(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerbose(request, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @return DomainOrgRoleDifference
   * @throws ApiException if fails to make API call
   */
  public DomainOrgRoleDifference getAuthorizationRoleComparedefaultRightRoleId(String leftRoleId, String rightRoleId) throws ApiException {
    return getAuthorizationRoleComparedefaultRightRoleIdWithHttpInfo(leftRoleId, rightRoleId).getBody();
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @return DomainOrgRoleDifference
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrgRoleDifference> getAuthorizationRoleComparedefaultRightRoleIdWithHttpInfo(String leftRoleId, String rightRoleId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'leftRoleId' is set
    if (leftRoleId == null) {
      throw new ApiException(400, "Missing the required parameter 'leftRoleId' when calling getAuthorizationRoleComparedefaultRightRoleId");
    }
    
    // verify the required parameter 'rightRoleId' is set
    if (rightRoleId == null) {
      throw new ApiException(400, "Missing the required parameter 'rightRoleId' when calling getAuthorizationRoleComparedefaultRightRoleId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "leftRoleId" + "\\}", pcapiClient.escapeString(leftRoleId.toString()))
      .replaceAll("\\{" + "rightRoleId" + "\\}", pcapiClient.escapeString(rightRoleId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainOrgRoleDifference>() {});
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainOrgRoleDifference getAuthorizationRoleComparedefaultRightRoleId(GetAuthorizationRoleComparedefaultRightRoleIdRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {});
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrgRoleDifference> getAuthorizationRoleComparedefaultRightRoleId(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DomainOrgRoleDifference>invokeAPIVerbose(request, new TypeReference<DomainOrgRoleDifference>() {});
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param permission  (optional)
   * @param userCount  (optional, default to true)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if fails to make API call
   */
  public OrganizationRoleEntityListing getAuthorizationRoles(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, List<Object> permission, Boolean userCount) throws ApiException {
    return getAuthorizationRolesWithHttpInfo(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, userCount).getBody();
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param permission  (optional)
   * @param userCount  (optional, default to true)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationRoleEntityListing> getAuthorizationRolesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, List<Object> permission, Boolean userCount) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nextPage", nextPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "previousPage", previousPage));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "permission", permission));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "userCount", userCount));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationRoleEntityListing>() {});
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationRoleEntityListing getAuthorizationRoles(GetAuthorizationRolesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {});
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationRoleEntityListing> getAuthorizationRoles(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIVerbose(request, new TypeReference<OrganizationRoleEntityListing>() {});
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
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole patchAuthorizationRole(String roleId, DomainOrganizationRole body) throws ApiException {
    return patchAuthorizationRoleWithHttpInfo(roleId, body).getBody();
  }

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> patchAuthorizationRoleWithHttpInfo(String roleId, DomainOrganizationRole body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling patchAuthorizationRole");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchAuthorizationRole");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{roleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "roleId" + "\\}", pcapiClient.escapeString(roleId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole patchAuthorizationRole(PatchAuthorizationRoleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> patchAuthorizationRole(ApiRequest<DomainOrganizationRole> request) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerbose(request, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @param body Organization role (required)
   * @return DomainOrgRoleDifference
   * @throws ApiException if fails to make API call
   */
  public DomainOrgRoleDifference postAuthorizationRoleComparedefaultRightRoleId(String leftRoleId, String rightRoleId, DomainOrganizationRole body) throws ApiException {
    return postAuthorizationRoleComparedefaultRightRoleIdWithHttpInfo(leftRoleId, rightRoleId, body).getBody();
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @param body Organization role (required)
   * @return DomainOrgRoleDifference
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrgRoleDifference> postAuthorizationRoleComparedefaultRightRoleIdWithHttpInfo(String leftRoleId, String rightRoleId, DomainOrganizationRole body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'leftRoleId' is set
    if (leftRoleId == null) {
      throw new ApiException(400, "Missing the required parameter 'leftRoleId' when calling postAuthorizationRoleComparedefaultRightRoleId");
    }
    
    // verify the required parameter 'rightRoleId' is set
    if (rightRoleId == null) {
      throw new ApiException(400, "Missing the required parameter 'rightRoleId' when calling postAuthorizationRoleComparedefaultRightRoleId");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAuthorizationRoleComparedefaultRightRoleId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "leftRoleId" + "\\}", pcapiClient.escapeString(leftRoleId.toString()))
      .replaceAll("\\{" + "rightRoleId" + "\\}", pcapiClient.escapeString(rightRoleId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainOrgRoleDifference>() {});
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainOrgRoleDifference postAuthorizationRoleComparedefaultRightRoleId(PostAuthorizationRoleComparedefaultRightRoleIdRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {});
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrgRoleDifference> postAuthorizationRoleComparedefaultRightRoleId(ApiRequest<DomainOrganizationRole> request) throws ApiException {
    return pcapiClient.<DomainOrgRoleDifference>invokeAPIVerbose(request, new TypeReference<DomainOrgRoleDifference>() {});
  }

  /**
   * Create an organization role.
   * 
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole postAuthorizationRoles(DomainOrganizationRoleCreate body) throws ApiException {
    return postAuthorizationRolesWithHttpInfo(body).getBody();
  }

  /**
   * Create an organization role.
   * 
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> postAuthorizationRolesWithHttpInfo(DomainOrganizationRoleCreate body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postAuthorizationRoles");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Create an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole postAuthorizationRoles(PostAuthorizationRolesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Create an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> postAuthorizationRoles(ApiRequest<DomainOrganizationRoleCreate> request) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerbose(request, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param force Restore default roles (optional, default to false)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if fails to make API call
   */
  public OrganizationRoleEntityListing postAuthorizationRolesDefault(Boolean force) throws ApiException {
    return postAuthorizationRolesDefaultWithHttpInfo(force).getBody();
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param force Restore default roles (optional, default to false)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationRoleEntityListing> postAuthorizationRolesDefaultWithHttpInfo(Boolean force) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/default".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "force", force));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationRoleEntityListing>() {});
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationRoleEntityListing postAuthorizationRolesDefault(PostAuthorizationRolesDefaultRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {});
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationRoleEntityListing> postAuthorizationRolesDefault(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIVerbose(request, new TypeReference<OrganizationRoleEntityListing>() {});
  }

  /**
   * Update an organization role.
   * Update
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole putAuthorizationRole(String roleId, DomainOrganizationRoleUpdate body) throws ApiException {
    return putAuthorizationRoleWithHttpInfo(roleId, body).getBody();
  }

  /**
   * Update an organization role.
   * Update
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> putAuthorizationRoleWithHttpInfo(String roleId, DomainOrganizationRoleUpdate body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling putAuthorizationRole");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAuthorizationRole");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{roleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "roleId" + "\\}", pcapiClient.escapeString(roleId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Update an organization role.
   * Update
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DomainOrganizationRole putAuthorizationRole(PutAuthorizationRoleRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Update an organization role.
   * Update
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DomainOrganizationRole> putAuthorizationRole(ApiRequest<DomainOrganizationRoleUpdate> request) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerbose(request, new TypeReference<DomainOrganizationRole>() {});
  }

  /**
   * Sets the users for the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> putAuthorizationRoleUsersAdd(String roleId, List<String> body) throws ApiException {
    return putAuthorizationRoleUsersAddWithHttpInfo(roleId, body).getBody();
  }

  /**
   * Sets the users for the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersAddWithHttpInfo(String roleId, List<String> body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling putAuthorizationRoleUsersAdd");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAuthorizationRoleUsersAdd");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{roleId}/users/add".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "roleId" + "\\}", pcapiClient.escapeString(roleId.toString()));

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
   * Sets the users for the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<String> putAuthorizationRoleUsersAdd(PutAuthorizationRoleUsersAddRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<String>>() {});
  }

  /**
   * Sets the users for the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersAdd(ApiRequest<List<String>> request) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerbose(request, new TypeReference<List<String>>() {});
  }

  /**
   * Removes the users from the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> putAuthorizationRoleUsersRemove(String roleId, List<String> body) throws ApiException {
    return putAuthorizationRoleUsersRemoveWithHttpInfo(roleId, body).getBody();
  }

  /**
   * Removes the users from the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersRemoveWithHttpInfo(String roleId, List<String> body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling putAuthorizationRoleUsersRemove");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAuthorizationRoleUsersRemove");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/{roleId}/users/remove".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "roleId" + "\\}", pcapiClient.escapeString(roleId.toString()));

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
   * Removes the users from the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<String> putAuthorizationRoleUsersRemove(PutAuthorizationRoleUsersRemoveRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<String>>() {});
  }

  /**
   * Removes the users from the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersRemove(ApiRequest<List<String>> request) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerbose(request, new TypeReference<List<String>>() {});
  }

  /**
   * Restore specified default roles
   * 
   * @param body Organization roles list (required)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if fails to make API call
   */
  public OrganizationRoleEntityListing putAuthorizationRolesDefault(List<DomainOrganizationRole> body) throws ApiException {
    return putAuthorizationRolesDefaultWithHttpInfo(body).getBody();
  }

  /**
   * Restore specified default roles
   * 
   * @param body Organization roles list (required)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationRoleEntityListing> putAuthorizationRolesDefaultWithHttpInfo(List<DomainOrganizationRole> body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putAuthorizationRolesDefault");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/authorization/roles/default".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationRoleEntityListing>() {});
  }

  /**
   * Restore specified default roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationRoleEntityListing putAuthorizationRolesDefault(PutAuthorizationRolesDefaultRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {});
  }

  /**
   * Restore specified default roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationRoleEntityListing> putAuthorizationRolesDefault(ApiRequest<List<DomainOrganizationRole>> request) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIVerbose(request, new TypeReference<OrganizationRoleEntityListing>() {});
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

}
