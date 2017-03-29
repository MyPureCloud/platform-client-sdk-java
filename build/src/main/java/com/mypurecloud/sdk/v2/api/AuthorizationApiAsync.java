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
import java.util.concurrent.Future;


public class AuthorizationApiAsync {
  private final ApiClient pcapiClient;

  public AuthorizationApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorizationApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAuthorizationRoleAsync(DeleteAuthorizationRoleRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAuthorizationRoleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
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
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PermissionCollectionEntityListing> getAuthorizationPermissionsAsync(GetAuthorizationPermissionsRequest request, AsyncApiCallback<PermissionCollectionEntityListing> callback) throws ApiException {
    return pcapiClient.<PermissionCollectionEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PermissionCollectionEntityListing>() {}, callback);
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PermissionCollectionEntityListing>> getAuthorizationPermissionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PermissionCollectionEntityListing>> callback) throws ApiException {
    return pcapiClient.<PermissionCollectionEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PermissionCollectionEntityListing>() {}, callback);
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationProductEntityListing> getAuthorizationProductsAsync(GetAuthorizationProductsRequest request, AsyncApiCallback<OrganizationProductEntityListing> callback) throws ApiException {
    return pcapiClient.<OrganizationProductEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationProductEntityListing>() {}, callback);
  }

  /**
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationProductEntityListing>> getAuthorizationProductsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrganizationProductEntityListing>> callback) throws ApiException {
    return pcapiClient.<OrganizationProductEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OrganizationProductEntityListing>() {}, callback);
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainOrganizationRole> getAuthorizationRoleAsync(GetAuthorizationRoleRequest request, AsyncApiCallback<DomainOrganizationRole> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainOrganizationRole>> getAuthorizationRoleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerboseAsync(request, new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainOrgRoleDifference> getAuthorizationRoleComparedefaultRightRoleIdAsync(GetAuthorizationRoleComparedefaultRightRoleIdRequest request, AsyncApiCallback<DomainOrgRoleDifference> callback) throws ApiException {
    return pcapiClient.<DomainOrgRoleDifference>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {}, callback);
  }

  /**
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainOrgRoleDifference>> getAuthorizationRoleComparedefaultRightRoleIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>> callback) throws ApiException {
    return pcapiClient.<DomainOrgRoleDifference>invokeAPIVerboseAsync(request, new TypeReference<DomainOrgRoleDifference>() {}, callback);
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationRoleEntityListing> getAuthorizationRolesAsync(GetAuthorizationRolesRequest request, AsyncApiCallback<OrganizationRoleEntityListing> callback) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {}, callback);
  }

  /**
   * Retrieve a list of all roles defined for the organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationRoleEntityListing>> getAuthorizationRolesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>> callback) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OrganizationRoleEntityListing>() {}, callback);
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
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainOrganizationRole> patchAuthorizationRoleAsync(PatchAuthorizationRoleRequest request, AsyncApiCallback<DomainOrganizationRole> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainOrganizationRole>> patchAuthorizationRoleAsync(ApiRequest<DomainOrganizationRole> request, AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerboseAsync(request, new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainOrgRoleDifference> postAuthorizationRoleComparedefaultRightRoleIdAsync(PostAuthorizationRoleComparedefaultRightRoleIdRequest request, AsyncApiCallback<DomainOrgRoleDifference> callback) throws ApiException {
    return pcapiClient.<DomainOrgRoleDifference>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {}, callback);
  }

  /**
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainOrgRoleDifference>> postAuthorizationRoleComparedefaultRightRoleIdAsync(ApiRequest<DomainOrganizationRole> request, AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>> callback) throws ApiException {
    return pcapiClient.<DomainOrgRoleDifference>invokeAPIVerboseAsync(request, new TypeReference<DomainOrgRoleDifference>() {}, callback);
  }

  /**
   * Create an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainOrganizationRole> postAuthorizationRolesAsync(PostAuthorizationRolesRequest request, AsyncApiCallback<DomainOrganizationRole> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Create an organization role.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainOrganizationRole>> postAuthorizationRolesAsync(ApiRequest<DomainOrganizationRoleCreate> request, AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerboseAsync(request, new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationRoleEntityListing> postAuthorizationRolesDefaultAsync(PostAuthorizationRolesDefaultRequest request, AsyncApiCallback<OrganizationRoleEntityListing> callback) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {}, callback);
  }

  /**
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force&#x3D;true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force&#x3D;true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationRoleEntityListing>> postAuthorizationRolesDefaultAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>> callback) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OrganizationRoleEntityListing>() {}, callback);
  }

  /**
   * Update an organization role.
   * Update
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DomainOrganizationRole> putAuthorizationRoleAsync(PutAuthorizationRoleRequest request, AsyncApiCallback<DomainOrganizationRole> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Update an organization role.
   * Update
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DomainOrganizationRole>> putAuthorizationRoleAsync(ApiRequest<DomainOrganizationRoleUpdate> request, AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) throws ApiException {
    return pcapiClient.<DomainOrganizationRole>invokeAPIVerboseAsync(request, new TypeReference<DomainOrganizationRole>() {}, callback);
  }

  /**
   * Sets the users for the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<String>> putAuthorizationRoleUsersAddAsync(PutAuthorizationRoleUsersAddRequest request, AsyncApiCallback<List<String>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Sets the users for the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<String>>> putAuthorizationRoleUsersAddAsync(ApiRequest<List<String>> request, AsyncApiCallback<ApiResponse<List<String>>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerboseAsync(request, new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Removes the users from the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<String>> putAuthorizationRoleUsersRemoveAsync(PutAuthorizationRoleUsersRemoveRequest request, AsyncApiCallback<List<String>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Removes the users from the role
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<String>>> putAuthorizationRoleUsersRemoveAsync(ApiRequest<List<String>> request, AsyncApiCallback<ApiResponse<List<String>>> callback) throws ApiException {
    return pcapiClient.<List<String>>invokeAPIVerboseAsync(request, new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Restore specified default roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationRoleEntityListing> putAuthorizationRolesDefaultAsync(PutAuthorizationRolesDefaultRequest request, AsyncApiCallback<OrganizationRoleEntityListing> callback) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {}, callback);
  }

  /**
   * Restore specified default roles
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationRoleEntityListing>> putAuthorizationRolesDefaultAsync(ApiRequest<List<DomainOrganizationRole>> request, AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>> callback) throws ApiException {
    return pcapiClient.<OrganizationRoleEntityListing>invokeAPIVerboseAsync(request, new TypeReference<OrganizationRoleEntityListing>() {}, callback);
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

}
