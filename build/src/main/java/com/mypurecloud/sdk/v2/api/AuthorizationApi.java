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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionGrantEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.SubjectDivisionGrantsEntityListing;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.SubjectDivisions;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;


import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionGrantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsHomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsLimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedSubjectIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPermissionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationProductsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleSubjectgrantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectsRolecountsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionObjectRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionRestoreRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkaddRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkremoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkreplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationDivisionRequest;
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
   * Delete a division.
   * 
   * @param divisionId Division ID (required)
   * @param force Force delete this division as well as the grants and objects associated with it (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationDivision(String divisionId, Boolean force) throws IOException, ApiException {
     deleteAuthorizationDivision(createDeleteAuthorizationDivisionRequest(divisionId, force));
  }

  /**
   * Delete a division.
   * 
   * @param divisionId Division ID (required)
   * @param force Force delete this division as well as the grants and objects associated with it (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationDivisionWithHttpInfo(String divisionId, Boolean force) throws IOException {
    return deleteAuthorizationDivision(createDeleteAuthorizationDivisionRequest(divisionId, force).withHttpInfo());
  }

  private DeleteAuthorizationDivisionRequest createDeleteAuthorizationDivisionRequest(String divisionId, Boolean force) {
    return DeleteAuthorizationDivisionRequest.builder()
            .withDivisionId(divisionId)
    
            .withForce(force)
    
            .build();
  }

  /**
   * Delete a division.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationDivision(DeleteAuthorizationDivisionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationDivision(ApiRequest<Void> request) throws IOException {
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
   * Delete a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division of the grant (required)
   * @param roleId the id of the role of the grant (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationSubjectDivisionRole(String subjectId, String divisionId, String roleId) throws IOException, ApiException {
     deleteAuthorizationSubjectDivisionRole(createDeleteAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId));
  }

  /**
   * Delete a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division of the grant (required)
   * @param roleId the id of the role of the grant (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationSubjectDivisionRoleWithHttpInfo(String subjectId, String divisionId, String roleId) throws IOException {
    return deleteAuthorizationSubjectDivisionRole(createDeleteAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId).withHttpInfo());
  }

  private DeleteAuthorizationSubjectDivisionRoleRequest createDeleteAuthorizationSubjectDivisionRoleRequest(String subjectId, String divisionId, String roleId) {
    return DeleteAuthorizationSubjectDivisionRoleRequest.builder()
            .withSubjectId(subjectId)
    
            .withDivisionId(divisionId)
    
            .withRoleId(roleId)
    
            .build();
  }

  /**
   * Delete a grant of a role in a division
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationSubjectDivisionRole(DeleteAuthorizationSubjectDivisionRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a grant of a role in a division
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationSubjectDivisionRole(ApiRequest<Void> request) throws IOException {
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
   * Returns an authorization division.
   * 
   * @param divisionId Division ID (required)
   * @param objectCount Get count of objects in this division, grouped by type (optional, default to false)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivision(String divisionId, Boolean objectCount) throws IOException, ApiException {
    return  getAuthorizationDivision(createGetAuthorizationDivisionRequest(divisionId, objectCount));
  }

  /**
   * Returns an authorization division.
   * 
   * @param divisionId Division ID (required)
   * @param objectCount Get count of objects in this division, grouped by type (optional, default to false)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivisionWithHttpInfo(String divisionId, Boolean objectCount) throws IOException {
    return getAuthorizationDivision(createGetAuthorizationDivisionRequest(divisionId, objectCount).withHttpInfo());
  }

  private GetAuthorizationDivisionRequest createGetAuthorizationDivisionRequest(String divisionId, Boolean objectCount) {
    return GetAuthorizationDivisionRequest.builder()
            .withDivisionId(divisionId)
    
            .withObjectCount(objectCount)
    
            .build();
  }

  /**
   * Returns an authorization division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivision(GetAuthorizationDivisionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns an authorization division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivision(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets all grants for a given division.
   * Returns all grants assigned to a given division. Maximum page size is 500.
   * @param divisionId Division ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AuthzDivisionGrantEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionGrantEntityListing getAuthorizationDivisionGrants(String divisionId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationDivisionGrants(createGetAuthorizationDivisionGrantsRequest(divisionId, pageNumber, pageSize));
  }

  /**
   * Gets all grants for a given division.
   * Returns all grants assigned to a given division. Maximum page size is 500.
   * @param divisionId Division ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AuthzDivisionGrantEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionGrantEntityListing> getAuthorizationDivisionGrantsWithHttpInfo(String divisionId, Integer pageNumber, Integer pageSize) throws IOException {
    return getAuthorizationDivisionGrants(createGetAuthorizationDivisionGrantsRequest(divisionId, pageNumber, pageSize).withHttpInfo());
  }

  private GetAuthorizationDivisionGrantsRequest createGetAuthorizationDivisionGrantsRequest(String divisionId, Integer pageNumber, Integer pageSize) {
    return GetAuthorizationDivisionGrantsRequest.builder()
            .withDivisionId(divisionId)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Gets all grants for a given division.
   * Returns all grants assigned to a given division. Maximum page size is 500.
   * @param request The request object
   * @return AuthzDivisionGrantEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionGrantEntityListing getAuthorizationDivisionGrants(GetAuthorizationDivisionGrantsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivisionGrantEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivisionGrantEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all grants for a given division.
   * Returns all grants assigned to a given division. Maximum page size is 500.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionGrantEntityListing> getAuthorizationDivisionGrants(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivisionGrantEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivisionGrantEntityListing> response = (ApiResponse<AuthzDivisionGrantEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivisionGrantEntityListing> response = (ApiResponse<AuthzDivisionGrantEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param objectCount Include the count of objects contained in the division (optional, default to false)
   * @param id Optionally request specific divisions by their IDs (optional)
   * @param name Search term to filter by division name (optional)
   * @return AuthzDivisionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionEntityListing getAuthorizationDivisions(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean objectCount, List<String> id, String name) throws IOException, ApiException {
    return  getAuthorizationDivisions(createGetAuthorizationDivisionsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name));
  }

  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param objectCount Include the count of objects contained in the division (optional, default to false)
   * @param id Optionally request specific divisions by their IDs (optional)
   * @param name Search term to filter by division name (optional)
   * @return AuthzDivisionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionEntityListing> getAuthorizationDivisionsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean objectCount, List<String> id, String name) throws IOException {
    return getAuthorizationDivisions(createGetAuthorizationDivisionsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name).withHttpInfo());
  }

  private GetAuthorizationDivisionsRequest createGetAuthorizationDivisionsRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean objectCount, List<String> id, String name) {
    return GetAuthorizationDivisionsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withObjectCount(objectCount)
    
            .withId(id)
    
            .withName(name)
    
            .build();
  }

  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param request The request object
   * @return AuthzDivisionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionEntityListing getAuthorizationDivisions(GetAuthorizationDivisionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivisionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivisionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionEntityListing> getAuthorizationDivisions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivisionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivisionEntityListing> response = (ApiResponse<AuthzDivisionEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivisionEntityListing> response = (ApiResponse<AuthzDivisionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivisionsHome() throws IOException, ApiException {
    return  getAuthorizationDivisionsHome(createGetAuthorizationDivisionsHomeRequest());
  }

  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivisionsHomeWithHttpInfo() throws IOException {
    return getAuthorizationDivisionsHome(createGetAuthorizationDivisionsHomeRequest().withHttpInfo());
  }

  private GetAuthorizationDivisionsHomeRequest createGetAuthorizationDivisionsHomeRequest() {
    return GetAuthorizationDivisionsHomeRequest.builder()
            .build();
  }

  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivisionsHome(GetAuthorizationDivisionsHomeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivisionsHome(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @return Integer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integer getAuthorizationDivisionsLimit() throws IOException, ApiException {
    return  getAuthorizationDivisionsLimit(createGetAuthorizationDivisionsLimitRequest());
  }

  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @return Integer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integer> getAuthorizationDivisionsLimitWithHttpInfo() throws IOException {
    return getAuthorizationDivisionsLimit(createGetAuthorizationDivisionsLimitRequest().withHttpInfo());
  }

  private GetAuthorizationDivisionsLimitRequest createGetAuthorizationDivisionsLimitRequest() {
    return GetAuthorizationDivisionsLimitRequest.builder()
            .build();
  }

  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @param request The request object
   * @return Integer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integer getAuthorizationDivisionsLimit(GetAuthorizationDivisionsLimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Integer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Integer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integer> getAuthorizationDivisionsLimit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Integer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Integer> response = (ApiResponse<Integer>)(ApiResponse<?>)exception;
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
      ApiResponse<Integer> response = (ApiResponse<Integer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param name Search term to filter by division name (optional)
   * @return List<AuthzDivision>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AuthzDivision> getAuthorizationDivisionspermittedMe(String permission, String name) throws IOException, ApiException {
    return  getAuthorizationDivisionspermittedMe(createGetAuthorizationDivisionspermittedMeRequest(permission, name));
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param name Search term to filter by division name (optional)
   * @return List<AuthzDivision>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AuthzDivision>> getAuthorizationDivisionspermittedMeWithHttpInfo(String permission, String name) throws IOException {
    return getAuthorizationDivisionspermittedMe(createGetAuthorizationDivisionspermittedMeRequest(permission, name).withHttpInfo());
  }

  private GetAuthorizationDivisionspermittedMeRequest createGetAuthorizationDivisionspermittedMeRequest(String permission, String name) {
    return GetAuthorizationDivisionspermittedMeRequest.builder()
            .withPermission(permission)
    
            .withName(name)
    
            .build();
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return List<AuthzDivision>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AuthzDivision> getAuthorizationDivisionspermittedMe(GetAuthorizationDivisionspermittedMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<AuthzDivision>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<AuthzDivision>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AuthzDivision>> getAuthorizationDivisionspermittedMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<AuthzDivision>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<AuthzDivision>> response = (ApiResponse<List<AuthzDivision>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<AuthzDivision>> response = (ApiResponse<List<AuthzDivision>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedMe(String permission, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationDivisionspermittedPagedMe(createGetAuthorizationDivisionspermittedPagedMeRequest(permission, pageNumber, pageSize));
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedMeWithHttpInfo(String permission, Integer pageNumber, Integer pageSize) throws IOException {
    return getAuthorizationDivisionspermittedPagedMe(createGetAuthorizationDivisionspermittedPagedMeRequest(permission, pageNumber, pageSize).withHttpInfo());
  }

  private GetAuthorizationDivisionspermittedPagedMeRequest createGetAuthorizationDivisionspermittedPagedMeRequest(String permission, Integer pageNumber, Integer pageSize) {
    return GetAuthorizationDivisionspermittedPagedMeRequest.builder()
            .withPermission(permission)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param request The request object
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedMe(GetAuthorizationDivisionspermittedPagedMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DivsPermittedEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DivsPermittedEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns which divisions the current user has the given permission in.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DivsPermittedEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param subjectId Subject ID (user or group) (required)
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedSubjectId(String subjectId, String permission, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationDivisionspermittedPagedSubjectId(createGetAuthorizationDivisionspermittedPagedSubjectIdRequest(subjectId, permission, pageNumber, pageSize));
  }

  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param subjectId Subject ID (user or group) (required)
   * @param permission The permission string, including the object to access, e.g. routing:queue:view (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DivsPermittedEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedSubjectIdWithHttpInfo(String subjectId, String permission, Integer pageNumber, Integer pageSize) throws IOException {
    return getAuthorizationDivisionspermittedPagedSubjectId(createGetAuthorizationDivisionspermittedPagedSubjectIdRequest(subjectId, permission, pageNumber, pageSize).withHttpInfo());
  }

  private GetAuthorizationDivisionspermittedPagedSubjectIdRequest createGetAuthorizationDivisionspermittedPagedSubjectIdRequest(String subjectId, String permission, Integer pageNumber, Integer pageSize) {
    return GetAuthorizationDivisionspermittedPagedSubjectIdRequest.builder()
            .withSubjectId(subjectId)
    
            .withPermission(permission)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return DivsPermittedEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DivsPermittedEntityListing getAuthorizationDivisionspermittedPagedSubjectId(GetAuthorizationDivisionspermittedPagedSubjectIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DivsPermittedEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DivsPermittedEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedSubjectId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DivsPermittedEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param queryType Query filter type (optional)
   * @param query Comma-separated list of permissions or domains to query (optional)
   * @return PermissionCollectionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PermissionCollectionEntityListing getAuthorizationPermissions(Integer pageSize, Integer pageNumber, String queryType, String query) throws IOException, ApiException {
    return  getAuthorizationPermissions(createGetAuthorizationPermissionsRequest(pageSize, pageNumber, queryType, query));
  }

  /**
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param queryType Query filter type (optional)
   * @param query Comma-separated list of permissions or domains to query (optional)
   * @return PermissionCollectionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PermissionCollectionEntityListing> getAuthorizationPermissionsWithHttpInfo(Integer pageSize, Integer pageNumber, String queryType, String query) throws IOException {
    return getAuthorizationPermissions(createGetAuthorizationPermissionsRequest(pageSize, pageNumber, queryType, query).withHttpInfo());
  }

  private GetAuthorizationPermissionsRequest createGetAuthorizationPermissionsRequest(Integer pageSize, Integer pageNumber, String queryType, String query) {
    return GetAuthorizationPermissionsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withQueryType(queryType)
    
            .withQuery(query)
    
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
    return GetAuthorizationProductsRequest.builder()
            .build();
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
   * @param expand Which fields, if any, to expand. \&quot;unusedPermissions\&quot; returns the permissions not used for the role (optional)
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole getAuthorizationRole(String roleId, List<String> expand) throws IOException, ApiException {
    return  getAuthorizationRole(createGetAuthorizationRoleRequest(roleId, expand));
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param roleId Role ID (required)
   * @param expand Which fields, if any, to expand. \&quot;unusedPermissions\&quot; returns the permissions not used for the role (optional)
   * @return DomainOrganizationRole
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> getAuthorizationRoleWithHttpInfo(String roleId, List<String> expand) throws IOException {
    return getAuthorizationRole(createGetAuthorizationRoleRequest(roleId, expand).withHttpInfo());
  }

  private GetAuthorizationRoleRequest createGetAuthorizationRoleRequest(String roleId, List<String> expand) {
    return GetAuthorizationRoleRequest.builder()
            .withRoleId(roleId)
    
            .withExpand(expand)
    
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
   * Get an org role to default role comparison
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
   * Get an org role to default role comparison
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
   * Get an org role to default role comparison
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
   * Get an org role to default role comparison
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
   * Get the subjects&#39; granted divisions in the specified role.
   * Includes the divisions for which the subject has a grant.
   * @param roleId Role ID (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return SubjectDivisionGrantsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SubjectDivisionGrantsEntityListing getAuthorizationRoleSubjectgrants(String roleId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getAuthorizationRoleSubjectgrants(createGetAuthorizationRoleSubjectgrantsRequest(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Get the subjects&#39; granted divisions in the specified role.
   * Includes the divisions for which the subject has a grant.
   * @param roleId Role ID (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return SubjectDivisionGrantsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SubjectDivisionGrantsEntityListing> getAuthorizationRoleSubjectgrantsWithHttpInfo(String roleId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException {
    return getAuthorizationRoleSubjectgrants(createGetAuthorizationRoleSubjectgrantsRequest(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetAuthorizationRoleSubjectgrantsRequest createGetAuthorizationRoleSubjectgrantsRequest(String roleId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) {
    return GetAuthorizationRoleSubjectgrantsRequest.builder()
            .withRoleId(roleId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Get the subjects&#39; granted divisions in the specified role.
   * Includes the divisions for which the subject has a grant.
   * @param request The request object
   * @return SubjectDivisionGrantsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SubjectDivisionGrantsEntityListing getAuthorizationRoleSubjectgrants(GetAuthorizationRoleSubjectgrantsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SubjectDivisionGrantsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SubjectDivisionGrantsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the subjects&#39; granted divisions in the specified role.
   * Includes the divisions for which the subject has a grant.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SubjectDivisionGrantsEntityListing> getAuthorizationRoleSubjectgrants(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SubjectDivisionGrantsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SubjectDivisionGrantsEntityListing> response = (ApiResponse<SubjectDivisionGrantsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SubjectDivisionGrantsEntityListing> response = (ApiResponse<SubjectDivisionGrantsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of the users in a specified role.
   * Get an array of the UUIDs of the users in the specified role.
   * @param roleId Role ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getAuthorizationRoleUsers(String roleId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getAuthorizationRoleUsers(createGetAuthorizationRoleUsersRequest(roleId, pageSize, pageNumber));
  }

  /**
   * Get a list of the users in a specified role.
   * Get an array of the UUIDs of the users in the specified role.
   * @param roleId Role ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return UserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getAuthorizationRoleUsersWithHttpInfo(String roleId, Integer pageSize, Integer pageNumber) throws IOException {
    return getAuthorizationRoleUsers(createGetAuthorizationRoleUsersRequest(roleId, pageSize, pageNumber).withHttpInfo());
  }

  private GetAuthorizationRoleUsersRequest createGetAuthorizationRoleUsersRequest(String roleId, Integer pageSize, Integer pageNumber) {
    return GetAuthorizationRoleUsersRequest.builder()
            .withRoleId(roleId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of the users in a specified role.
   * Get an array of the UUIDs of the users in the specified role.
   * @param request The request object
   * @return UserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserEntityListing getAuthorizationRoleUsers(GetAuthorizationRoleUsersRequest request) throws IOException, ApiException {
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
   * Get a list of the users in a specified role.
   * Get an array of the UUIDs of the users in the specified role.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserEntityListing> getAuthorizationRoleUsers(ApiRequest<Void> request) throws IOException {
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
   * Retrieve a list of all roles defined for the organization
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name  (optional)
   * @param permission  (optional)
   * @param defaultRoleId  (optional)
   * @param userCount  (optional, default to true)
   * @param id id (optional)
   * @return OrganizationRoleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationRoleEntityListing getAuthorizationRoles(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, List<String> permission, List<String> defaultRoleId, Boolean userCount, List<String> id) throws IOException, ApiException {
    return  getAuthorizationRoles(createGetAuthorizationRolesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id));
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
   * @param name  (optional)
   * @param permission  (optional)
   * @param defaultRoleId  (optional)
   * @param userCount  (optional, default to true)
   * @param id id (optional)
   * @return OrganizationRoleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationRoleEntityListing> getAuthorizationRolesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, List<String> permission, List<String> defaultRoleId, Boolean userCount, List<String> id) throws IOException {
    return getAuthorizationRoles(createGetAuthorizationRolesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id).withHttpInfo());
  }

  private GetAuthorizationRolesRequest createGetAuthorizationRolesRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, String name, List<String> permission, List<String> defaultRoleId, Boolean userCount, List<String> id) {
    return GetAuthorizationRolesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withName(name)
    
            .withPermission(permission)
    
            .withDefaultRoleId(defaultRoleId)
    
            .withUserCount(userCount)
    
            .withId(id)
    
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
   * @param subjectId Subject ID (user or group) (required)
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubject(String subjectId) throws IOException, ApiException {
    return  getAuthorizationSubject(createGetAuthorizationSubjectRequest(subjectId));
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @return AuthzSubject
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectWithHttpInfo(String subjectId) throws IOException {
    return getAuthorizationSubject(createGetAuthorizationSubjectRequest(subjectId).withHttpInfo());
  }

  private GetAuthorizationSubjectRequest createGetAuthorizationSubjectRequest(String subjectId) {
    return GetAuthorizationSubjectRequest.builder()
            .withSubjectId(subjectId)
    
            .build();
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request The request object
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubject(GetAuthorizationSubjectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzSubject> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzSubject>() {});
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
  public ApiResponse<AuthzSubject> getAuthorizationSubject(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzSubject>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubjectsMe() throws IOException, ApiException {
    return  getAuthorizationSubjectsMe(createGetAuthorizationSubjectsMeRequest());
  }

  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @return AuthzSubject
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectsMeWithHttpInfo() throws IOException {
    return getAuthorizationSubjectsMe(createGetAuthorizationSubjectsMeRequest().withHttpInfo());
  }

  private GetAuthorizationSubjectsMeRequest createGetAuthorizationSubjectsMeRequest() {
    return GetAuthorizationSubjectsMeRequest.builder()
            .build();
  }

  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @param request The request object
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubjectsMe(GetAuthorizationSubjectsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzSubject> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzSubject>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzSubject>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the count of roles granted to a list of subjects
   * 
   * @param id id (optional)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getAuthorizationSubjectsRolecounts(List<String> id) throws IOException, ApiException {
    return  getAuthorizationSubjectsRolecounts(createGetAuthorizationSubjectsRolecountsRequest(id));
  }

  /**
   * Get the count of roles granted to a list of subjects
   * 
   * @param id id (optional)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getAuthorizationSubjectsRolecountsWithHttpInfo(List<String> id) throws IOException {
    return getAuthorizationSubjectsRolecounts(createGetAuthorizationSubjectsRolecountsRequest(id).withHttpInfo());
  }

  private GetAuthorizationSubjectsRolecountsRequest createGetAuthorizationSubjectsRolecountsRequest(List<String> id) {
    return GetAuthorizationSubjectsRolecountsRequest.builder()
            .withId(id)
    
            .build();
  }

  /**
   * Get the count of roles granted to a list of subjects
   * 
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getAuthorizationSubjectsRolecounts(GetAuthorizationSubjectsRolecountsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Map<String, Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the count of roles granted to a list of subjects
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getAuthorizationSubjectsRolecounts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Map<String, Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
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
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param divisionId Division ID (required)
   * @param objectType The type of the objects. Must be one of the valid object types (required)
   * @param body Object Id List (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationDivisionObject(String divisionId, String objectType, List<String> body) throws IOException, ApiException {
     postAuthorizationDivisionObject(createPostAuthorizationDivisionObjectRequest(divisionId, objectType, body));
  }

  /**
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param divisionId Division ID (required)
   * @param objectType The type of the objects. Must be one of the valid object types (required)
   * @param body Object Id List (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationDivisionObjectWithHttpInfo(String divisionId, String objectType, List<String> body) throws IOException {
    return postAuthorizationDivisionObject(createPostAuthorizationDivisionObjectRequest(divisionId, objectType, body).withHttpInfo());
  }

  private PostAuthorizationDivisionObjectRequest createPostAuthorizationDivisionObjectRequest(String divisionId, String objectType, List<String> body) {
    return PostAuthorizationDivisionObjectRequest.builder()
            .withDivisionId(divisionId)
    
            .withObjectType(objectType)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationDivisionObject(PostAuthorizationDivisionObjectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationDivisionObject(ApiRequest<List<String>> request) throws IOException {
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
   * Recreate a previously deleted division.
   * 
   * @param divisionId Division ID (required)
   * @param body Recreated division data (required)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisionRestore(String divisionId, AuthzDivision body) throws IOException, ApiException {
    return  postAuthorizationDivisionRestore(createPostAuthorizationDivisionRestoreRequest(divisionId, body));
  }

  /**
   * Recreate a previously deleted division.
   * 
   * @param divisionId Division ID (required)
   * @param body Recreated division data (required)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisionRestoreWithHttpInfo(String divisionId, AuthzDivision body) throws IOException {
    return postAuthorizationDivisionRestore(createPostAuthorizationDivisionRestoreRequest(divisionId, body).withHttpInfo());
  }

  private PostAuthorizationDivisionRestoreRequest createPostAuthorizationDivisionRestoreRequest(String divisionId, AuthzDivision body) {
    return PostAuthorizationDivisionRestoreRequest.builder()
            .withDivisionId(divisionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Recreate a previously deleted division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisionRestore(PostAuthorizationDivisionRestoreRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Recreate a previously deleted division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisionRestore(ApiRequest<AuthzDivision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a division.
   * 
   * @param body Division (required)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisions(AuthzDivision body) throws IOException, ApiException {
    return  postAuthorizationDivisions(createPostAuthorizationDivisionsRequest(body));
  }

  /**
   * Create a division.
   * 
   * @param body Division (required)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisionsWithHttpInfo(AuthzDivision body) throws IOException {
    return postAuthorizationDivisions(createPostAuthorizationDivisionsRequest(body).withHttpInfo());
  }

  private PostAuthorizationDivisionsRequest createPostAuthorizationDivisionsRequest(AuthzDivision body) {
    return PostAuthorizationDivisionsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisions(PostAuthorizationDivisionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisions(ApiRequest<AuthzDivision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk-grant subjects and divisions with an organization role.
   * 
   * @param roleId Role ID (required)
   * @param body Subjects and Divisions (required)
   * @param subjectType what the type of the subjects are (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationRole(String roleId, SubjectDivisions body, String subjectType) throws IOException, ApiException {
     postAuthorizationRole(createPostAuthorizationRoleRequest(roleId, body, subjectType));
  }

  /**
   * Bulk-grant subjects and divisions with an organization role.
   * 
   * @param roleId Role ID (required)
   * @param body Subjects and Divisions (required)
   * @param subjectType what the type of the subjects are (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationRoleWithHttpInfo(String roleId, SubjectDivisions body, String subjectType) throws IOException {
    return postAuthorizationRole(createPostAuthorizationRoleRequest(roleId, body, subjectType).withHttpInfo());
  }

  private PostAuthorizationRoleRequest createPostAuthorizationRoleRequest(String roleId, SubjectDivisions body, String subjectType) {
    return PostAuthorizationRoleRequest.builder()
            .withRoleId(roleId)
    
            .withBody(body)
    
            .withSubjectType(subjectType)
    
            .build();
  }

  /**
   * Bulk-grant subjects and divisions with an organization role.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationRole(PostAuthorizationRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Bulk-grant subjects and divisions with an organization role.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationRole(ApiRequest<SubjectDivisions> request) throws IOException {
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
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.
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
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.
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
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.
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
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.
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
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkadd(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException, ApiException {
     postAuthorizationSubjectBulkadd(createPostAuthorizationSubjectBulkaddRequest(subjectId, body, subjectType));
  }

  /**
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkaddWithHttpInfo(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException {
    return postAuthorizationSubjectBulkadd(createPostAuthorizationSubjectBulkaddRequest(subjectId, body, subjectType).withHttpInfo());
  }

  private PostAuthorizationSubjectBulkaddRequest createPostAuthorizationSubjectBulkaddRequest(String subjectId, RoleDivisionGrants body, String subjectType) {
    return PostAuthorizationSubjectBulkaddRequest.builder()
            .withSubjectId(subjectId)
    
            .withBody(body)
    
            .withSubjectType(subjectType)
    
            .build();
  }

  /**
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkadd(PostAuthorizationSubjectBulkaddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkadd(ApiRequest<RoleDivisionGrants> request) throws IOException {
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
   * Bulk-remove grants from a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkremove(String subjectId, RoleDivisionGrants body) throws IOException, ApiException {
     postAuthorizationSubjectBulkremove(createPostAuthorizationSubjectBulkremoveRequest(subjectId, body));
  }

  /**
   * Bulk-remove grants from a subject.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkremoveWithHttpInfo(String subjectId, RoleDivisionGrants body) throws IOException {
    return postAuthorizationSubjectBulkremove(createPostAuthorizationSubjectBulkremoveRequest(subjectId, body).withHttpInfo());
  }

  private PostAuthorizationSubjectBulkremoveRequest createPostAuthorizationSubjectBulkremoveRequest(String subjectId, RoleDivisionGrants body) {
    return PostAuthorizationSubjectBulkremoveRequest.builder()
            .withSubjectId(subjectId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk-remove grants from a subject.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkremove(PostAuthorizationSubjectBulkremoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Bulk-remove grants from a subject.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkremove(ApiRequest<RoleDivisionGrants> request) throws IOException {
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
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkreplace(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException, ApiException {
     postAuthorizationSubjectBulkreplace(createPostAuthorizationSubjectBulkreplaceRequest(subjectId, body, subjectType));
  }

  /**
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param subjectId Subject ID (user or group) (required)
   * @param body Pairs of role and division IDs (required)
   * @param subjectType what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) (optional, default to PC_USER)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkreplaceWithHttpInfo(String subjectId, RoleDivisionGrants body, String subjectType) throws IOException {
    return postAuthorizationSubjectBulkreplace(createPostAuthorizationSubjectBulkreplaceRequest(subjectId, body, subjectType).withHttpInfo());
  }

  private PostAuthorizationSubjectBulkreplaceRequest createPostAuthorizationSubjectBulkreplaceRequest(String subjectId, RoleDivisionGrants body, String subjectType) {
    return PostAuthorizationSubjectBulkreplaceRequest.builder()
            .withSubjectId(subjectId)
    
            .withBody(body)
    
            .withSubjectType(subjectType)
    
            .build();
  }

  /**
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectBulkreplace(PostAuthorizationSubjectBulkreplaceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectBulkreplace(ApiRequest<RoleDivisionGrants> request) throws IOException {
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
   * Make a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division to which to make the grant (required)
   * @param roleId the id of the role to grant (required)
   * @param subjectType what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints) (optional, default to PC_USER)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectDivisionRole(String subjectId, String divisionId, String roleId, String subjectType) throws IOException, ApiException {
     postAuthorizationSubjectDivisionRole(createPostAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId, subjectType));
  }

  /**
   * Make a grant of a role in a division
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param divisionId the id of the division to which to make the grant (required)
   * @param roleId the id of the role to grant (required)
   * @param subjectType what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints) (optional, default to PC_USER)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectDivisionRoleWithHttpInfo(String subjectId, String divisionId, String roleId, String subjectType) throws IOException {
    return postAuthorizationSubjectDivisionRole(createPostAuthorizationSubjectDivisionRoleRequest(subjectId, divisionId, roleId, subjectType).withHttpInfo());
  }

  private PostAuthorizationSubjectDivisionRoleRequest createPostAuthorizationSubjectDivisionRoleRequest(String subjectId, String divisionId, String roleId, String subjectType) {
    return PostAuthorizationSubjectDivisionRoleRequest.builder()
            .withSubjectId(subjectId)
    
            .withDivisionId(divisionId)
    
            .withRoleId(roleId)
    
            .withSubjectType(subjectType)
    
            .build();
  }

  /**
   * Make a grant of a role in a division
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationSubjectDivisionRole(PostAuthorizationSubjectDivisionRoleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Make a grant of a role in a division
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationSubjectDivisionRole(ApiRequest<Void> request) throws IOException {
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
   * Update a division.
   * 
   * @param divisionId Division ID (required)
   * @param body Updated division data (required)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision putAuthorizationDivision(String divisionId, AuthzDivision body) throws IOException, ApiException {
    return  putAuthorizationDivision(createPutAuthorizationDivisionRequest(divisionId, body));
  }

  /**
   * Update a division.
   * 
   * @param divisionId Division ID (required)
   * @param body Updated division data (required)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> putAuthorizationDivisionWithHttpInfo(String divisionId, AuthzDivision body) throws IOException {
    return putAuthorizationDivision(createPutAuthorizationDivisionRequest(divisionId, body).withHttpInfo());
  }

  private PutAuthorizationDivisionRequest createPutAuthorizationDivisionRequest(String divisionId, AuthzDivision body) {
    return PutAuthorizationDivisionRequest.builder()
            .withDivisionId(divisionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision putAuthorizationDivision(PutAuthorizationDivisionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> putAuthorizationDivision(ApiRequest<AuthzDivision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
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
