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

import java.io.IOException;
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationRole(String roleId) throws IOException, ApiException {
     deleteAuthorizationRole(createDeleteAuthorizationRoleRequest(roleId));
  }

  /**
   * Delete an organization role.
   * 
   * @param roleId Role ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationRoleWithHttpInfo(String roleId) throws IOException {
    return deleteAuthorizationRole(createDeleteAuthorizationRoleRequest(roleId).withHttpInfo());
  }

  private DeleteAuthorizationRoleRequest createDeleteAuthorizationRoleRequest(String roleId) {
    return DeleteAuthorizationRoleRequest.builder()
            .withRoleId(roleId)
            .build();
  }

  /**
   * Delete an organization role.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationRole(DeleteAuthorizationRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an organization role.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationRole(ApiRequest<Void> request) throws IOException {
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
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PermissionCollectionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PermissionCollectionEntityListing getAuthorizationPermissions(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getAuthorizationPermissions(createGetAuthorizationPermissionsRequest(pageSize, pageNumber));
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return PermissionCollectionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PermissionCollectionEntityListing> getAuthorizationPermissionsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getAuthorizationPermissions(createGetAuthorizationPermissionsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetAuthorizationPermissionsRequest createGetAuthorizationPermissionsRequest(Integer pageSize, Integer pageNumber) {
    return GetAuthorizationPermissionsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)
            .build();
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param request The request object
   * @return PermissionCollectionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PermissionCollectionEntityListing getAuthorizationPermissions(GetAuthorizationPermissionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PermissionCollectionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PermissionCollectionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PermissionCollectionEntityListing> getAuthorizationPermissions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PermissionCollectionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PermissionCollectionEntityListing> response = (ApiResponse<PermissionCollectionEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PermissionCollectionEntityListing> response = (ApiResponse<PermissionCollectionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @return OrganizationProductEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationProductEntityListing getAuthorizationProducts() throws IOException, ApiException {
    return  getAuthorizationProducts(createGetAuthorizationProductsRequest());
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @return OrganizationProductEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationProductEntityListing> getAuthorizationProductsWithHttpInfo() throws IOException {
    return getAuthorizationProducts(createGetAuthorizationProductsRequest().withHttpInfo());
  }

  private GetAuthorizationProductsRequest createGetAuthorizationProductsRequest() {
    return GetAuthorizationProductsRequest.builder()            .build();
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @param request The request object
   * @return OrganizationProductEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationProductEntityListing getAuthorizationProducts(GetAuthorizationProductsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationProductEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationProductEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationProductEntityListing> getAuthorizationProducts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationProductEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationProductEntityListing> response = (ApiResponse<OrganizationProductEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationProductEntityListing> response = (ApiResponse<OrganizationProductEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param roleId Role ID (required)
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole getAuthorizationRole(String roleId) throws IOException, ApiException {
    return  getAuthorizationRole(createGetAuthorizationRoleRequest(roleId));
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param roleId Role ID (required)
   * @return DomainOrganizationRole
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> getAuthorizationRoleWithHttpInfo(String roleId) throws IOException {
    return getAuthorizationRole(createGetAuthorizationRoleRequest(roleId).withHttpInfo());
  }

  private GetAuthorizationRoleRequest createGetAuthorizationRoleRequest(String roleId) {
    return GetAuthorizationRoleRequest.builder()
            .withRoleId(roleId)
            .build();
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param request The request object
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole getAuthorizationRole(GetAuthorizationRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainOrganizationRole> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> getAuthorizationRole(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainOrganizationRole>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @return DomainOrgRoleDifference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrgRoleDifference getAuthorizationRoleComparedefaultRightRoleId(String leftRoleId, String rightRoleId) throws IOException, ApiException {
    return  getAuthorizationRoleComparedefaultRightRoleId(createGetAuthorizationRoleComparedefaultRightRoleIdRequest(leftRoleId, rightRoleId));
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @return DomainOrgRoleDifference
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrgRoleDifference> getAuthorizationRoleComparedefaultRightRoleIdWithHttpInfo(String leftRoleId, String rightRoleId) throws IOException {
    return getAuthorizationRoleComparedefaultRightRoleId(createGetAuthorizationRoleComparedefaultRightRoleIdRequest(leftRoleId, rightRoleId).withHttpInfo());
  }

  private GetAuthorizationRoleComparedefaultRightRoleIdRequest createGetAuthorizationRoleComparedefaultRightRoleIdRequest(String leftRoleId, String rightRoleId) {
    return GetAuthorizationRoleComparedefaultRightRoleIdRequest.builder()
            .withLeftRoleId(leftRoleId)

            .withRightRoleId(rightRoleId)
            .build();
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param request The request object
   * @return DomainOrgRoleDifference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrgRoleDifference getAuthorizationRoleComparedefaultRightRoleId(GetAuthorizationRoleComparedefaultRightRoleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainOrgRoleDifference> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrgRoleDifference> getAuthorizationRoleComparedefaultRightRoleId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainOrgRoleDifference>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationRoleEntityListing getAuthorizationRoles(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, List<Object> permission, Boolean userCount) throws IOException, ApiException {
    return  getAuthorizationRoles(createGetAuthorizationRolesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, userCount));
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationRoleEntityListing> getAuthorizationRolesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, List<Object> permission, Boolean userCount) throws IOException {
    return getAuthorizationRoles(createGetAuthorizationRolesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, permission, userCount).withHttpInfo());
  }

  private GetAuthorizationRolesRequest createGetAuthorizationRolesRequest(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, List<Object> permission, Boolean userCount) {
    return GetAuthorizationRolesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withPermission(permission)

            .withUserCount(userCount)
            .build();
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @param request The request object
   * @return OrganizationRoleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationRoleEntityListing getAuthorizationRoles(GetAuthorizationRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationRoleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationRoleEntityListing> getAuthorizationRoles(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationRoleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole patchAuthorizationRole(String roleId, DomainOrganizationRole body) throws IOException, ApiException {
    return  patchAuthorizationRole(createPatchAuthorizationRoleRequest(roleId, body));
  }

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> patchAuthorizationRoleWithHttpInfo(String roleId, DomainOrganizationRole body) throws IOException {
    return patchAuthorizationRole(createPatchAuthorizationRoleRequest(roleId, body).withHttpInfo());
  }

  private PatchAuthorizationRoleRequest createPatchAuthorizationRoleRequest(String roleId, DomainOrganizationRole body) {
    return PatchAuthorizationRoleRequest.builder()
            .withRoleId(roleId)

            .withBody(body)
            .build();
  }

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param request The request object
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole patchAuthorizationRole(PatchAuthorizationRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainOrganizationRole> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> patchAuthorizationRole(ApiRequest<DomainOrganizationRole> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainOrganizationRole>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @param body Organization role (required)
   * @return DomainOrgRoleDifference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrgRoleDifference postAuthorizationRoleComparedefaultRightRoleId(String leftRoleId, String rightRoleId, DomainOrganizationRole body) throws IOException, ApiException {
    return  postAuthorizationRoleComparedefaultRightRoleId(createPostAuthorizationRoleComparedefaultRightRoleIdRequest(leftRoleId, rightRoleId, body));
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param leftRoleId Left Role ID (required)
   * @param rightRoleId Right Role id (required)
   * @param body Organization role (required)
   * @return DomainOrgRoleDifference
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrgRoleDifference> postAuthorizationRoleComparedefaultRightRoleIdWithHttpInfo(String leftRoleId, String rightRoleId, DomainOrganizationRole body) throws IOException {
    return postAuthorizationRoleComparedefaultRightRoleId(createPostAuthorizationRoleComparedefaultRightRoleIdRequest(leftRoleId, rightRoleId, body).withHttpInfo());
  }

  private PostAuthorizationRoleComparedefaultRightRoleIdRequest createPostAuthorizationRoleComparedefaultRightRoleIdRequest(String leftRoleId, String rightRoleId, DomainOrganizationRole body) {
    return PostAuthorizationRoleComparedefaultRightRoleIdRequest.builder()
            .withLeftRoleId(leftRoleId)

            .withRightRoleId(rightRoleId)

            .withBody(body)
            .build();
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param request The request object
   * @return DomainOrgRoleDifference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrgRoleDifference postAuthorizationRoleComparedefaultRightRoleId(PostAuthorizationRoleComparedefaultRightRoleIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainOrgRoleDifference> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrgRoleDifference> postAuthorizationRoleComparedefaultRightRoleId(ApiRequest<DomainOrganizationRole> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainOrgRoleDifference>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an organization role.
   * 
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole postAuthorizationRoles(DomainOrganizationRoleCreate body) throws IOException, ApiException {
    return  postAuthorizationRoles(createPostAuthorizationRolesRequest(body));
  }

  /**
   * Create an organization role.
   * 
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> postAuthorizationRolesWithHttpInfo(DomainOrganizationRoleCreate body) throws IOException {
    return postAuthorizationRoles(createPostAuthorizationRolesRequest(body).withHttpInfo());
  }

  private PostAuthorizationRolesRequest createPostAuthorizationRolesRequest(DomainOrganizationRoleCreate body) {
    return PostAuthorizationRolesRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create an organization role.
   * 
   * @param request The request object
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole postAuthorizationRoles(PostAuthorizationRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainOrganizationRole> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an organization role.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> postAuthorizationRoles(ApiRequest<DomainOrganizationRoleCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainOrganizationRole>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param force Restore default roles (optional, default to false)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationRoleEntityListing postAuthorizationRolesDefault(Boolean force) throws IOException, ApiException {
    return  postAuthorizationRolesDefault(createPostAuthorizationRolesDefaultRequest(force));
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param force Restore default roles (optional, default to false)
   * @return OrganizationRoleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationRoleEntityListing> postAuthorizationRolesDefaultWithHttpInfo(Boolean force) throws IOException {
    return postAuthorizationRolesDefault(createPostAuthorizationRolesDefaultRequest(force).withHttpInfo());
  }

  private PostAuthorizationRolesDefaultRequest createPostAuthorizationRolesDefaultRequest(Boolean force) {
    return PostAuthorizationRolesDefaultRequest.builder()
            .withForce(force)
            .build();
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param request The request object
   * @return OrganizationRoleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationRoleEntityListing postAuthorizationRolesDefault(PostAuthorizationRolesDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationRoleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationRoleEntityListing> postAuthorizationRolesDefault(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationRoleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an organization role.
   * Update
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole putAuthorizationRole(String roleId, DomainOrganizationRoleUpdate body) throws IOException, ApiException {
    return  putAuthorizationRole(createPutAuthorizationRoleRequest(roleId, body));
  }

  /**
   * Update an organization role.
   * Update
   * @param roleId Role ID (required)
   * @param body Organization role (required)
   * @return DomainOrganizationRole
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> putAuthorizationRoleWithHttpInfo(String roleId, DomainOrganizationRoleUpdate body) throws IOException {
    return putAuthorizationRole(createPutAuthorizationRoleRequest(roleId, body).withHttpInfo());
  }

  private PutAuthorizationRoleRequest createPutAuthorizationRoleRequest(String roleId, DomainOrganizationRoleUpdate body) {
    return PutAuthorizationRoleRequest.builder()
            .withRoleId(roleId)

            .withBody(body)
            .build();
  }

  /**
   * Update an organization role.
   * Update
   * @param request The request object
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole putAuthorizationRole(PutAuthorizationRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainOrganizationRole> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an organization role.
   * Update
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> putAuthorizationRole(ApiRequest<DomainOrganizationRoleUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainOrganizationRole>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
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
      ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Sets the users for the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putAuthorizationRoleUsersAdd(String roleId, List<String> body) throws IOException, ApiException {
    return  putAuthorizationRoleUsersAdd(createPutAuthorizationRoleUsersAddRequest(roleId, body));
  }

  /**
   * Sets the users for the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersAddWithHttpInfo(String roleId, List<String> body) throws IOException {
    return putAuthorizationRoleUsersAdd(createPutAuthorizationRoleUsersAddRequest(roleId, body).withHttpInfo());
  }

  private PutAuthorizationRoleUsersAddRequest createPutAuthorizationRoleUsersAddRequest(String roleId, List<String> body) {
    return PutAuthorizationRoleUsersAddRequest.builder()
            .withRoleId(roleId)

            .withBody(body)
            .build();
  }

  /**
   * Sets the users for the role
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putAuthorizationRoleUsersAdd(PutAuthorizationRoleUsersAddRequest request) throws IOException, ApiException {
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
   * Sets the users for the role
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersAdd(ApiRequest<List<String>> request) throws IOException {
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
   * Removes the users from the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putAuthorizationRoleUsersRemove(String roleId, List<String> body) throws IOException, ApiException {
    return  putAuthorizationRoleUsersRemove(createPutAuthorizationRoleUsersRemoveRequest(roleId, body));
  }

  /**
   * Removes the users from the role
   * 
   * @param roleId Role ID (required)
   * @param body List of user IDs (required)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersRemoveWithHttpInfo(String roleId, List<String> body) throws IOException {
    return putAuthorizationRoleUsersRemove(createPutAuthorizationRoleUsersRemoveRequest(roleId, body).withHttpInfo());
  }

  private PutAuthorizationRoleUsersRemoveRequest createPutAuthorizationRoleUsersRemoveRequest(String roleId, List<String> body) {
    return PutAuthorizationRoleUsersRemoveRequest.builder()
            .withRoleId(roleId)

            .withBody(body)
            .build();
  }

  /**
   * Removes the users from the role
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> putAuthorizationRoleUsersRemove(PutAuthorizationRoleUsersRemoveRequest request) throws IOException, ApiException {
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
   * Removes the users from the role
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> putAuthorizationRoleUsersRemove(ApiRequest<List<String>> request) throws IOException {
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
   * Restore specified default roles
   * 
   * @param body Organization roles list (required)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationRoleEntityListing putAuthorizationRolesDefault(List<DomainOrganizationRole> body) throws IOException, ApiException {
    return  putAuthorizationRolesDefault(createPutAuthorizationRolesDefaultRequest(body));
  }

  /**
   * Restore specified default roles
   * 
   * @param body Organization roles list (required)
   * @return OrganizationRoleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationRoleEntityListing> putAuthorizationRolesDefaultWithHttpInfo(List<DomainOrganizationRole> body) throws IOException {
    return putAuthorizationRolesDefault(createPutAuthorizationRolesDefaultRequest(body).withHttpInfo());
  }

  private PutAuthorizationRolesDefaultRequest createPutAuthorizationRolesDefaultRequest(List<DomainOrganizationRole> body) {
    return PutAuthorizationRolesDefaultRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Restore specified default roles
   * 
   * @param request The request object
   * @return OrganizationRoleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationRoleEntityListing putAuthorizationRolesDefault(PutAuthorizationRolesDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationRoleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Restore specified default roles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationRoleEntityListing> putAuthorizationRolesDefault(ApiRequest<List<DomainOrganizationRole>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationRoleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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

}
