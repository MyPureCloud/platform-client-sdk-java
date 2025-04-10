package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AuthorizationPolicy;
import com.mypurecloud.sdk.v2.model.AuthorizationPolicyEntityListing;
import com.mypurecloud.sdk.v2.model.AuthorizationSettings;
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionCursorListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionGrantEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.v2.model.PolicyAttributeSet;
import com.mypurecloud.sdk.v2.model.PolicyTestPayload;
import com.mypurecloud.sdk.v2.model.PolicyTestResult;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.RoleSettings;
import com.mypurecloud.sdk.v2.model.SubjectDivisionGrantsEntityListing;
import com.mypurecloud.sdk.v2.model.SubjectDivisions;
import com.mypurecloud.sdk.v2.model.TargetAttributes;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserReferenceEntityListing;
import com.mypurecloud.sdk.v2.model.ValidationErrorListing;


import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionGrantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsDeletedRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsHomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsLimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedSubjectIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPermissionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPoliciesSubjectSubjectIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPoliciesTargetRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPoliciesTargetSubjectSubjectIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPoliciesTargetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPolicyAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationProductsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleSubjectgrantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRolesSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectsRolecountsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAuthorizationSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionObjectRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionRestoreRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationPoliciesTargetRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationPoliciesTargetValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationPolicySimulateRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkaddRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkremoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkreplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationPoliciesTargetRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleUsersAddRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleUsersRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRolesSettingsRequest;
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
   * @param force DEPRECATED -  Force delete this division. Warning: This option may cause any remaining objects in this division to be inaccessible. (optional, default to false)
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
   * @param force DEPRECATED -  Force delete this division. Warning: This option may cause any remaining objects in this division to be inaccessible. (optional, default to false)
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
   * Delete an access control policy
   * 
   * deleteAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy is applied (required)
   * @param subjectId The ID of the subject to which the policy is applied (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationPoliciesTargetSubjectSubjectId(String targetName, String subjectId) throws IOException, ApiException {
     deleteAuthorizationPoliciesTargetSubjectSubjectId(createDeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest(targetName, subjectId));
  }

  /**
   * Delete an access control policy
   * 
   * deleteAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy is applied (required)
   * @param subjectId The ID of the subject to which the policy is applied (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationPoliciesTargetSubjectSubjectIdWithHttpInfo(String targetName, String subjectId) throws IOException {
    return deleteAuthorizationPoliciesTargetSubjectSubjectId(createDeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest(targetName, subjectId).withHttpInfo());
  }

  private DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest createDeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest(String targetName, String subjectId) {
    return DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest.builder()
            .withTargetName(targetName)

            .withSubjectId(subjectId)

            .build();
  }

  /**
   * Delete an access control policy
   * 
   * deleteAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationPoliciesTargetSubjectSubjectId(DeleteAuthorizationPoliciesTargetSubjectSubjectIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an access control policy
   * 
   * deleteAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationPoliciesTargetSubjectSubjectId(ApiRequest<Void> request) throws IOException {
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
   * Request specific divisions by id using a query param \"id\", e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&id=72e9fb25-c484-488d-9312-7acba82435b3
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
   * Request specific divisions by id using a query param \"id\", e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&id=72e9fb25-c484-488d-9312-7acba82435b3
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
   * Request specific divisions by id using a query param \"id\", e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&id=72e9fb25-c484-488d-9312-7acba82435b3
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
   * Request specific divisions by id using a query param \"id\", e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&id=72e9fb25-c484-488d-9312-7acba82435b3
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
   * Get a list of soft deleted divisions for the org
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AuthzDivisionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionEntityListing getAuthorizationDivisionsDeleted(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationDivisionsDeleted(createGetAuthorizationDivisionsDeletedRequest(pageNumber, pageSize));
  }

  /**
   * Get a list of soft deleted divisions for the org
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return AuthzDivisionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionEntityListing> getAuthorizationDivisionsDeletedWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getAuthorizationDivisionsDeleted(createGetAuthorizationDivisionsDeletedRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetAuthorizationDivisionsDeletedRequest createGetAuthorizationDivisionsDeletedRequest(Integer pageNumber, Integer pageSize) {
    return GetAuthorizationDivisionsDeletedRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a list of soft deleted divisions for the org
   * 
   * @param request The request object
   * @return AuthzDivisionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionEntityListing getAuthorizationDivisionsDeleted(GetAuthorizationDivisionsDeletedRequest request) throws IOException, ApiException {
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
   * Get a list of soft deleted divisions for the org
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionEntityListing> getAuthorizationDivisionsDeleted(ApiRequest<Void> request) throws IOException {
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
   * Retrieve a list of all divisions defined for the organization with cursor
   * Use \"after\" and \"before\" param to fetch next/previous page}
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param id Optionally request specific divisions by their IDs (optional)
   * @param name Optionally request specific divisions by division name (optional)
   * @return AuthzDivisionCursorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionCursorListing getAuthorizationDivisionsQuery(String before, String after, String pageSize, List<String> id, String name) throws IOException, ApiException {
    return  getAuthorizationDivisionsQuery(createGetAuthorizationDivisionsQueryRequest(before, after, pageSize, id, name));
  }

  /**
   * Retrieve a list of all divisions defined for the organization with cursor
   * Use \"after\" and \"before\" param to fetch next/previous page}
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param id Optionally request specific divisions by their IDs (optional)
   * @param name Optionally request specific divisions by division name (optional)
   * @return AuthzDivisionCursorListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionCursorListing> getAuthorizationDivisionsQueryWithHttpInfo(String before, String after, String pageSize, List<String> id, String name) throws IOException {
    return getAuthorizationDivisionsQuery(createGetAuthorizationDivisionsQueryRequest(before, after, pageSize, id, name).withHttpInfo());
  }

  private GetAuthorizationDivisionsQueryRequest createGetAuthorizationDivisionsQueryRequest(String before, String after, String pageSize, List<String> id, String name) {
    return GetAuthorizationDivisionsQueryRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withId(id)

            .withName(name)

            .build();
  }

  /**
   * Retrieve a list of all divisions defined for the organization with cursor
   * Use \"after\" and \"before\" param to fetch next/previous page}
   * @param request The request object
   * @return AuthzDivisionCursorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionCursorListing getAuthorizationDivisionsQuery(GetAuthorizationDivisionsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivisionCursorListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivisionCursorListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of all divisions defined for the organization with cursor
   * Use \"after\" and \"before\" param to fetch next/previous page}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionCursorListing> getAuthorizationDivisionsQuery(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivisionCursorListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivisionCursorListing> response = (ApiResponse<AuthzDivisionCursorListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivisionCursorListing> response = (ApiResponse<AuthzDivisionCursorListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * Get a page of access policies for an organization
   * 
   * getAuthorizationPolicies is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return AuthorizationPolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicyEntityListing getAuthorizationPolicies(String after, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationPolicies(createGetAuthorizationPoliciesRequest(after, pageSize));
  }

  /**
   * Get a page of access policies for an organization
   * 
   * getAuthorizationPolicies is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return AuthorizationPolicyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicyEntityListing> getAuthorizationPoliciesWithHttpInfo(String after, Integer pageSize) throws IOException {
    return getAuthorizationPolicies(createGetAuthorizationPoliciesRequest(after, pageSize).withHttpInfo());
  }

  private GetAuthorizationPoliciesRequest createGetAuthorizationPoliciesRequest(String after, Integer pageSize) {
    return GetAuthorizationPoliciesRequest.builder()
            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a page of access policies for an organization
   * 
   * getAuthorizationPolicies is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicyEntityListing getAuthorizationPolicies(GetAuthorizationPoliciesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a page of access policies for an organization
   * 
   * getAuthorizationPolicies is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicyEntityListing> getAuthorizationPolicies(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicyEntityListing> response = (ApiResponse<AuthorizationPolicyEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicyEntityListing> response = (ApiResponse<AuthorizationPolicyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a page of access policies for a given subject
   * 
   * getAuthorizationPoliciesSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param subjectId The ID of the subject to which policies are applied (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return AuthorizationPolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicyEntityListing getAuthorizationPoliciesSubjectSubjectId(String subjectId, String after, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationPoliciesSubjectSubjectId(createGetAuthorizationPoliciesSubjectSubjectIdRequest(subjectId, after, pageSize));
  }

  /**
   * Get a page of access policies for a given subject
   * 
   * getAuthorizationPoliciesSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param subjectId The ID of the subject to which policies are applied (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return AuthorizationPolicyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicyEntityListing> getAuthorizationPoliciesSubjectSubjectIdWithHttpInfo(String subjectId, String after, Integer pageSize) throws IOException {
    return getAuthorizationPoliciesSubjectSubjectId(createGetAuthorizationPoliciesSubjectSubjectIdRequest(subjectId, after, pageSize).withHttpInfo());
  }

  private GetAuthorizationPoliciesSubjectSubjectIdRequest createGetAuthorizationPoliciesSubjectSubjectIdRequest(String subjectId, String after, Integer pageSize) {
    return GetAuthorizationPoliciesSubjectSubjectIdRequest.builder()
            .withSubjectId(subjectId)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a page of access policies for a given subject
   * 
   * getAuthorizationPoliciesSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicyEntityListing getAuthorizationPoliciesSubjectSubjectId(GetAuthorizationPoliciesSubjectSubjectIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a page of access policies for a given subject
   * 
   * getAuthorizationPoliciesSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicyEntityListing> getAuthorizationPoliciesSubjectSubjectId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicyEntityListing> response = (ApiResponse<AuthorizationPolicyEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicyEntityListing> response = (ApiResponse<AuthorizationPolicyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a page of access policies for a given policy target
   * 
   * getAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action resource target to which policies are applied (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return AuthorizationPolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicyEntityListing getAuthorizationPoliciesTarget(String targetName, String after, Integer pageSize) throws IOException, ApiException {
    return  getAuthorizationPoliciesTarget(createGetAuthorizationPoliciesTargetRequest(targetName, after, pageSize));
  }

  /**
   * Get a page of access policies for a given policy target
   * 
   * getAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action resource target to which policies are applied (required)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return AuthorizationPolicyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicyEntityListing> getAuthorizationPoliciesTargetWithHttpInfo(String targetName, String after, Integer pageSize) throws IOException {
    return getAuthorizationPoliciesTarget(createGetAuthorizationPoliciesTargetRequest(targetName, after, pageSize).withHttpInfo());
  }

  private GetAuthorizationPoliciesTargetRequest createGetAuthorizationPoliciesTargetRequest(String targetName, String after, Integer pageSize) {
    return GetAuthorizationPoliciesTargetRequest.builder()
            .withTargetName(targetName)

            .withAfter(after)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a page of access policies for a given policy target
   * 
   * getAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicyEntityListing getAuthorizationPoliciesTarget(GetAuthorizationPoliciesTargetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a page of access policies for a given policy target
   * 
   * getAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicyEntityListing> getAuthorizationPoliciesTarget(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicyEntityListing> response = (ApiResponse<AuthorizationPolicyEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicyEntityListing> response = (ApiResponse<AuthorizationPolicyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an access control policy for a specified resource target and subject
   * 
   * getAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action resource target to which the policy is applied (required)
   * @param subjectId The ID of the subject to which the policy is applied (required)
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy getAuthorizationPoliciesTargetSubjectSubjectId(String targetName, String subjectId) throws IOException, ApiException {
    return  getAuthorizationPoliciesTargetSubjectSubjectId(createGetAuthorizationPoliciesTargetSubjectSubjectIdRequest(targetName, subjectId));
  }

  /**
   * Get an access control policy for a specified resource target and subject
   * 
   * getAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action resource target to which the policy is applied (required)
   * @param subjectId The ID of the subject to which the policy is applied (required)
   * @return AuthorizationPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> getAuthorizationPoliciesTargetSubjectSubjectIdWithHttpInfo(String targetName, String subjectId) throws IOException {
    return getAuthorizationPoliciesTargetSubjectSubjectId(createGetAuthorizationPoliciesTargetSubjectSubjectIdRequest(targetName, subjectId).withHttpInfo());
  }

  private GetAuthorizationPoliciesTargetSubjectSubjectIdRequest createGetAuthorizationPoliciesTargetSubjectSubjectIdRequest(String targetName, String subjectId) {
    return GetAuthorizationPoliciesTargetSubjectSubjectIdRequest.builder()
            .withTargetName(targetName)

            .withSubjectId(subjectId)

            .build();
  }

  /**
   * Get an access control policy for a specified resource target and subject
   * 
   * getAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy getAuthorizationPoliciesTargetSubjectSubjectId(GetAuthorizationPoliciesTargetSubjectSubjectIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an access control policy for a specified resource target and subject
   * 
   * getAuthorizationPoliciesTargetSubjectSubjectId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> getAuthorizationPoliciesTargetSubjectSubjectId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a map of policy targets to valid attributes for those targets
   * 
   * getAuthorizationPoliciesTargets is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return TargetAttributes
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TargetAttributes getAuthorizationPoliciesTargets() throws IOException, ApiException {
    return  getAuthorizationPoliciesTargets(createGetAuthorizationPoliciesTargetsRequest());
  }

  /**
   * Get a map of policy targets to valid attributes for those targets
   * 
   * getAuthorizationPoliciesTargets is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return TargetAttributes
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TargetAttributes> getAuthorizationPoliciesTargetsWithHttpInfo() throws IOException {
    return getAuthorizationPoliciesTargets(createGetAuthorizationPoliciesTargetsRequest().withHttpInfo());
  }

  private GetAuthorizationPoliciesTargetsRequest createGetAuthorizationPoliciesTargetsRequest() {
    return GetAuthorizationPoliciesTargetsRequest.builder()
            .build();
  }

  /**
   * Get a map of policy targets to valid attributes for those targets
   * 
   * getAuthorizationPoliciesTargets is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return TargetAttributes
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TargetAttributes getAuthorizationPoliciesTargets(GetAuthorizationPoliciesTargetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TargetAttributes> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TargetAttributes>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a map of policy targets to valid attributes for those targets
   * 
   * getAuthorizationPoliciesTargets is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TargetAttributes> getAuthorizationPoliciesTargets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TargetAttributes>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TargetAttributes> response = (ApiResponse<TargetAttributes>)(ApiResponse<?>)exception;
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
      ApiResponse<TargetAttributes> response = (ApiResponse<TargetAttributes>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to retrieve (required)
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy getAuthorizationPolicy(String policyId) throws IOException, ApiException {
    return  getAuthorizationPolicy(createGetAuthorizationPolicyRequest(policyId));
  }

  /**
   * Get an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to retrieve (required)
   * @return AuthorizationPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> getAuthorizationPolicyWithHttpInfo(String policyId) throws IOException {
    return getAuthorizationPolicy(createGetAuthorizationPolicyRequest(policyId).withHttpInfo());
  }

  private GetAuthorizationPolicyRequest createGetAuthorizationPolicyRequest(String policyId) {
    return GetAuthorizationPolicyRequest.builder()
            .withPolicyId(policyId)

            .build();
  }

  /**
   * Get an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy getAuthorizationPolicy(GetAuthorizationPolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> getAuthorizationPolicy(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of attributes used to evaluate an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicyAttributes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to retrieve attributes (required)
   * @return PolicyAttributeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyAttributeSet getAuthorizationPolicyAttributes(String policyId) throws IOException, ApiException {
    return  getAuthorizationPolicyAttributes(createGetAuthorizationPolicyAttributesRequest(policyId));
  }

  /**
   * Get the list of attributes used to evaluate an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicyAttributes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to retrieve attributes (required)
   * @return PolicyAttributeSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyAttributeSet> getAuthorizationPolicyAttributesWithHttpInfo(String policyId) throws IOException {
    return getAuthorizationPolicyAttributes(createGetAuthorizationPolicyAttributesRequest(policyId).withHttpInfo());
  }

  private GetAuthorizationPolicyAttributesRequest createGetAuthorizationPolicyAttributesRequest(String policyId) {
    return GetAuthorizationPolicyAttributesRequest.builder()
            .withPolicyId(policyId)

            .build();
  }

  /**
   * Get the list of attributes used to evaluate an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicyAttributes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return PolicyAttributeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyAttributeSet getAuthorizationPolicyAttributes(GetAuthorizationPolicyAttributesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PolicyAttributeSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PolicyAttributeSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of attributes used to evaluate an access control policy with the specified policy ID
   * 
   * getAuthorizationPolicyAttributes is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyAttributeSet> getAuthorizationPolicyAttributes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PolicyAttributeSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PolicyAttributeSet> response = (ApiResponse<PolicyAttributeSet>)(ApiResponse<?>)exception;
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
      ApiResponse<PolicyAttributeSet> response = (ApiResponse<PolicyAttributeSet>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param userCount Fetch the count of users who have this role granted in at least one division. Setting this value or defaulting to 'true' can lead to slower load times or timeouts for role queries with large member counts. (optional, default to true)
   * @param expand Which fields, if any, to expand. \"unusedPermissions\" returns the permissions not used for the role (optional)
   * @return DomainOrganizationRole
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainOrganizationRole getAuthorizationRole(String roleId, Boolean userCount, List<String> expand) throws IOException, ApiException {
    return  getAuthorizationRole(createGetAuthorizationRoleRequest(roleId, userCount, expand));
  }

  /**
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param roleId Role ID (required)
   * @param userCount Fetch the count of users who have this role granted in at least one division. Setting this value or defaulting to 'true' can lead to slower load times or timeouts for role queries with large member counts. (optional, default to true)
   * @param expand Which fields, if any, to expand. \"unusedPermissions\" returns the permissions not used for the role (optional)
   * @return DomainOrganizationRole
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainOrganizationRole> getAuthorizationRoleWithHttpInfo(String roleId, Boolean userCount, List<String> expand) throws IOException {
    return getAuthorizationRole(createGetAuthorizationRoleRequest(roleId, userCount, expand).withHttpInfo());
  }

  private GetAuthorizationRoleRequest createGetAuthorizationRoleRequest(String roleId, Boolean userCount, List<String> expand) {
    return GetAuthorizationRoleRequest.builder()
            .withRoleId(roleId)

            .withUserCount(userCount)

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
   * Get the subjects' granted divisions in the specified role.
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
   * Get the subjects' granted divisions in the specified role.
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
   * Get the subjects' granted divisions in the specified role.
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
   * Get the subjects' granted divisions in the specified role.
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
   * @return UserReferenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserReferenceEntityListing getAuthorizationRoleUsers(String roleId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getAuthorizationRoleUsers(createGetAuthorizationRoleUsersRequest(roleId, pageSize, pageNumber));
  }

  /**
   * Get a list of the users in a specified role.
   * Get an array of the UUIDs of the users in the specified role.
   * @param roleId Role ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return UserReferenceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserReferenceEntityListing> getAuthorizationRoleUsersWithHttpInfo(String roleId, Integer pageSize, Integer pageNumber) throws IOException {
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
   * @return UserReferenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserReferenceEntityListing getAuthorizationRoleUsers(GetAuthorizationRoleUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserReferenceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserReferenceEntityListing>() {});
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
  public ApiResponse<UserReferenceEntityListing> getAuthorizationRoleUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserReferenceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserReferenceEntityListing> response = (ApiResponse<UserReferenceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserReferenceEntityListing> response = (ApiResponse<UserReferenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get authorization role settings
   * 
   * @return RoleSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoleSettings getAuthorizationRolesSettings() throws IOException, ApiException {
    return  getAuthorizationRolesSettings(createGetAuthorizationRolesSettingsRequest());
  }

  /**
   * Get authorization role settings
   * 
   * @return RoleSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoleSettings> getAuthorizationRolesSettingsWithHttpInfo() throws IOException {
    return getAuthorizationRolesSettings(createGetAuthorizationRolesSettingsRequest().withHttpInfo());
  }

  private GetAuthorizationRolesSettingsRequest createGetAuthorizationRolesSettingsRequest() {
    return GetAuthorizationRolesSettingsRequest.builder()
            .build();
  }

  /**
   * Get authorization role settings
   * 
   * @param request The request object
   * @return RoleSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoleSettings getAuthorizationRolesSettings(GetAuthorizationRolesSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoleSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoleSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get authorization role settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoleSettings> getAuthorizationRolesSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoleSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoleSettings> response = (ApiResponse<RoleSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<RoleSettings> response = (ApiResponse<RoleSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get authorization settings
   * 
   * @return AuthorizationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationSettings getAuthorizationSettings() throws IOException, ApiException {
    return  getAuthorizationSettings(createGetAuthorizationSettingsRequest());
  }

  /**
   * Get authorization settings
   * 
   * @return AuthorizationSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationSettings> getAuthorizationSettingsWithHttpInfo() throws IOException {
    return getAuthorizationSettings(createGetAuthorizationSettingsRequest().withHttpInfo());
  }

  private GetAuthorizationSettingsRequest createGetAuthorizationSettingsRequest() {
    return GetAuthorizationSettingsRequest.builder()
            .build();
  }

  /**
   * Get authorization settings
   * 
   * @param request The request object
   * @return AuthorizationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationSettings getAuthorizationSettings(GetAuthorizationSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get authorization settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationSettings> getAuthorizationSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationSettings> response = (ApiResponse<AuthorizationSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationSettings> response = (ApiResponse<AuthorizationSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param includeDuplicates Include multiple entries with the same role and division but different subjects (optional, default to false)
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubject(String subjectId, Boolean includeDuplicates) throws IOException, ApiException {
    return  getAuthorizationSubject(createGetAuthorizationSubjectRequest(subjectId, includeDuplicates));
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param subjectId Subject ID (user or group) (required)
   * @param includeDuplicates Include multiple entries with the same role and division but different subjects (optional, default to false)
   * @return AuthzSubject
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectWithHttpInfo(String subjectId, Boolean includeDuplicates) throws IOException {
    return getAuthorizationSubject(createGetAuthorizationSubjectRequest(subjectId, includeDuplicates).withHttpInfo());
  }

  private GetAuthorizationSubjectRequest createGetAuthorizationSubjectRequest(String subjectId, Boolean includeDuplicates) {
    return GetAuthorizationSubjectRequest.builder()
            .withSubjectId(subjectId)

            .withIncludeDuplicates(includeDuplicates)

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
   * @param includeDuplicates Include multiple entries with the same role and division but different subjects (optional, default to false)
   * @return AuthzSubject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzSubject getAuthorizationSubjectsMe(Boolean includeDuplicates) throws IOException, ApiException {
    return  getAuthorizationSubjectsMe(createGetAuthorizationSubjectsMeRequest(includeDuplicates));
  }

  /**
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @param includeDuplicates Include multiple entries with the same role and division but different subjects (optional, default to false)
   * @return AuthzSubject
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzSubject> getAuthorizationSubjectsMeWithHttpInfo(Boolean includeDuplicates) throws IOException {
    return getAuthorizationSubjectsMe(createGetAuthorizationSubjectsMeRequest(includeDuplicates).withHttpInfo());
  }

  private GetAuthorizationSubjectsMeRequest createGetAuthorizationSubjectsMeRequest(Boolean includeDuplicates) {
    return GetAuthorizationSubjectsMeRequest.builder()
            .withIncludeDuplicates(includeDuplicates)

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
   * @param subjectId User ID (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization getUserRoles(String subjectId) throws IOException, ApiException {
    return  getUserRoles(createGetUserRolesRequest(subjectId));
  }

  /**
   * Returns a listing of roles and permissions for a user.
   * 
   * @param subjectId User ID (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> getUserRolesWithHttpInfo(String subjectId) throws IOException {
    return getUserRoles(createGetUserRolesRequest(subjectId).withHttpInfo());
  }

  private GetUserRolesRequest createGetUserRolesRequest(String subjectId) {
    return GetUserRolesRequest.builder()
            .withSubjectId(subjectId)

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
   * Change authorization settings
   * Change authorization settings
   * @param body Authorization Settings (required)
   * @return AuthorizationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationSettings patchAuthorizationSettings(AuthorizationSettings body) throws IOException, ApiException {
    return  patchAuthorizationSettings(createPatchAuthorizationSettingsRequest(body));
  }

  /**
   * Change authorization settings
   * Change authorization settings
   * @param body Authorization Settings (required)
   * @return AuthorizationSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationSettings> patchAuthorizationSettingsWithHttpInfo(AuthorizationSettings body) throws IOException {
    return patchAuthorizationSettings(createPatchAuthorizationSettingsRequest(body).withHttpInfo());
  }

  private PatchAuthorizationSettingsRequest createPatchAuthorizationSettingsRequest(AuthorizationSettings body) {
    return PatchAuthorizationSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Change authorization settings
   * Change authorization settings
   * @param request The request object
   * @return AuthorizationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationSettings patchAuthorizationSettings(PatchAuthorizationSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Change authorization settings
   * Change authorization settings
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationSettings> patchAuthorizationSettings(ApiRequest<AuthorizationSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationSettings> response = (ApiResponse<AuthorizationSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationSettings> response = (ApiResponse<AuthorizationSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\"206ce31f-61ec-40ed-a8b1-be6f06303998\",\"250a754e-f5e4-4f51-800f-a92f09d3bf8c\"]
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
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\"206ce31f-61ec-40ed-a8b1-be6f06303998\",\"250a754e-f5e4-4f51-800f-a92f09d3bf8c\"]
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
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\"206ce31f-61ec-40ed-a8b1-be6f06303998\",\"250a754e-f5e4-4f51-800f-a92f09d3bf8c\"]
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
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\"206ce31f-61ec-40ed-a8b1-be6f06303998\",\"250a754e-f5e4-4f51-800f-a92f09d3bf8c\"]
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
   * Add an access control policy for a specified resource target and subject
   * 
   * postAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy will be applied (required)
   * @param body Access control policy (required)
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy postAuthorizationPoliciesTarget(String targetName, AuthorizationPolicy body) throws IOException, ApiException {
    return  postAuthorizationPoliciesTarget(createPostAuthorizationPoliciesTargetRequest(targetName, body));
  }

  /**
   * Add an access control policy for a specified resource target and subject
   * 
   * postAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy will be applied (required)
   * @param body Access control policy (required)
   * @return AuthorizationPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> postAuthorizationPoliciesTargetWithHttpInfo(String targetName, AuthorizationPolicy body) throws IOException {
    return postAuthorizationPoliciesTarget(createPostAuthorizationPoliciesTargetRequest(targetName, body).withHttpInfo());
  }

  private PostAuthorizationPoliciesTargetRequest createPostAuthorizationPoliciesTargetRequest(String targetName, AuthorizationPolicy body) {
    return PostAuthorizationPoliciesTargetRequest.builder()
            .withTargetName(targetName)

            .withBody(body)

            .build();
  }

  /**
   * Add an access control policy for a specified resource target and subject
   * 
   * postAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy postAuthorizationPoliciesTarget(PostAuthorizationPoliciesTargetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add an access control policy for a specified resource target and subject
   * 
   * postAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> postAuthorizationPoliciesTarget(ApiRequest<AuthorizationPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Validate the conditions and attributes of an access control policy for a specified resource target
   * 
   * postAuthorizationPoliciesTargetValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy will be applied (required)
   * @param body Access control policy (required)
   * @return ValidationErrorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidationErrorListing postAuthorizationPoliciesTargetValidate(String targetName, AuthorizationPolicy body) throws IOException, ApiException {
    return  postAuthorizationPoliciesTargetValidate(createPostAuthorizationPoliciesTargetValidateRequest(targetName, body));
  }

  /**
   * Validate the conditions and attributes of an access control policy for a specified resource target
   * 
   * postAuthorizationPoliciesTargetValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy will be applied (required)
   * @param body Access control policy (required)
   * @return ValidationErrorListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidationErrorListing> postAuthorizationPoliciesTargetValidateWithHttpInfo(String targetName, AuthorizationPolicy body) throws IOException {
    return postAuthorizationPoliciesTargetValidate(createPostAuthorizationPoliciesTargetValidateRequest(targetName, body).withHttpInfo());
  }

  private PostAuthorizationPoliciesTargetValidateRequest createPostAuthorizationPoliciesTargetValidateRequest(String targetName, AuthorizationPolicy body) {
    return PostAuthorizationPoliciesTargetValidateRequest.builder()
            .withTargetName(targetName)

            .withBody(body)

            .build();
  }

  /**
   * Validate the conditions and attributes of an access control policy for a specified resource target
   * 
   * postAuthorizationPoliciesTargetValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ValidationErrorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidationErrorListing postAuthorizationPoliciesTargetValidate(PostAuthorizationPoliciesTargetValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ValidationErrorListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ValidationErrorListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate the conditions and attributes of an access control policy for a specified resource target
   * 
   * postAuthorizationPoliciesTargetValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidationErrorListing> postAuthorizationPoliciesTargetValidate(ApiRequest<AuthorizationPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ValidationErrorListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ValidationErrorListing> response = (ApiResponse<ValidationErrorListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ValidationErrorListing> response = (ApiResponse<ValidationErrorListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Simulate a request and evaluate the specified policy ID against the provided values
   * 
   * postAuthorizationPolicySimulate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to test the simulated data against (required)
   * @param body A map of attribute names to type and simulated data value (required)
   * @return PolicyTestResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyTestResult postAuthorizationPolicySimulate(String policyId, PolicyTestPayload body) throws IOException, ApiException {
    return  postAuthorizationPolicySimulate(createPostAuthorizationPolicySimulateRequest(policyId, body));
  }

  /**
   * Simulate a request and evaluate the specified policy ID against the provided values
   * 
   * postAuthorizationPolicySimulate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to test the simulated data against (required)
   * @param body A map of attribute names to type and simulated data value (required)
   * @return PolicyTestResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyTestResult> postAuthorizationPolicySimulateWithHttpInfo(String policyId, PolicyTestPayload body) throws IOException {
    return postAuthorizationPolicySimulate(createPostAuthorizationPolicySimulateRequest(policyId, body).withHttpInfo());
  }

  private PostAuthorizationPolicySimulateRequest createPostAuthorizationPolicySimulateRequest(String policyId, PolicyTestPayload body) {
    return PostAuthorizationPolicySimulateRequest.builder()
            .withPolicyId(policyId)

            .withBody(body)

            .build();
  }

  /**
   * Simulate a request and evaluate the specified policy ID against the provided values
   * 
   * postAuthorizationPolicySimulate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return PolicyTestResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PolicyTestResult postAuthorizationPolicySimulate(PostAuthorizationPolicySimulateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PolicyTestResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PolicyTestResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Simulate a request and evaluate the specified policy ID against the provided values
   * 
   * postAuthorizationPolicySimulate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PolicyTestResult> postAuthorizationPolicySimulate(ApiRequest<PolicyTestPayload> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PolicyTestResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PolicyTestResult> response = (ApiResponse<PolicyTestResult>)(ApiResponse<?>)exception;
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
      ApiResponse<PolicyTestResult> response = (ApiResponse<PolicyTestResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Replace subject's roles and divisions with the exact list supplied in the request.
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
   * Replace subject's roles and divisions with the exact list supplied in the request.
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
   * Replace subject's roles and divisions with the exact list supplied in the request.
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
   * Replace subject's roles and divisions with the exact list supplied in the request.
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
   * Add an access control policy for a specified resource target and subject, overwriting any existing policy
   * 
   * putAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy will be applied (required)
   * @param body Access control policy (required)
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy putAuthorizationPoliciesTarget(String targetName, AuthorizationPolicy body) throws IOException, ApiException {
    return  putAuthorizationPoliciesTarget(createPutAuthorizationPoliciesTargetRequest(targetName, body));
  }

  /**
   * Add an access control policy for a specified resource target and subject, overwriting any existing policy
   * 
   * putAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param targetName The domain:entity:action target to which the policy will be applied (required)
   * @param body Access control policy (required)
   * @return AuthorizationPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> putAuthorizationPoliciesTargetWithHttpInfo(String targetName, AuthorizationPolicy body) throws IOException {
    return putAuthorizationPoliciesTarget(createPutAuthorizationPoliciesTargetRequest(targetName, body).withHttpInfo());
  }

  private PutAuthorizationPoliciesTargetRequest createPutAuthorizationPoliciesTargetRequest(String targetName, AuthorizationPolicy body) {
    return PutAuthorizationPoliciesTargetRequest.builder()
            .withTargetName(targetName)

            .withBody(body)

            .build();
  }

  /**
   * Add an access control policy for a specified resource target and subject, overwriting any existing policy
   * 
   * putAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy putAuthorizationPoliciesTarget(PutAuthorizationPoliciesTargetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add an access control policy for a specified resource target and subject, overwriting any existing policy
   * 
   * putAuthorizationPoliciesTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> putAuthorizationPoliciesTarget(ApiRequest<AuthorizationPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an access control policy with a given ID
   * 
   * putAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to update (required)
   * @param body Access control policy (required)
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy putAuthorizationPolicy(String policyId, AuthorizationPolicy body) throws IOException, ApiException {
    return  putAuthorizationPolicy(createPutAuthorizationPolicyRequest(policyId, body));
  }

  /**
   * Update an access control policy with a given ID
   * 
   * putAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param policyId The ID of the policy to update (required)
   * @param body Access control policy (required)
   * @return AuthorizationPolicy
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> putAuthorizationPolicyWithHttpInfo(String policyId, AuthorizationPolicy body) throws IOException {
    return putAuthorizationPolicy(createPutAuthorizationPolicyRequest(policyId, body).withHttpInfo());
  }

  private PutAuthorizationPolicyRequest createPutAuthorizationPolicyRequest(String policyId, AuthorizationPolicy body) {
    return PutAuthorizationPolicyRequest.builder()
            .withPolicyId(policyId)

            .withBody(body)

            .build();
  }

  /**
   * Update an access control policy with a given ID
   * 
   * putAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AuthorizationPolicy
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthorizationPolicy putAuthorizationPolicy(PutAuthorizationPolicyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthorizationPolicy> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthorizationPolicy>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an access control policy with a given ID
   * 
   * putAuthorizationPolicy is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthorizationPolicy> putAuthorizationPolicy(ApiRequest<AuthorizationPolicy> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthorizationPolicy>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthorizationPolicy> response = (ApiResponse<AuthorizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Change authorization role settings
   * Change role settings
   * @param body Authorization Role Settings (required)
   * @return RoleSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoleSettings putAuthorizationRolesSettings(RoleSettings body) throws IOException, ApiException {
    return  putAuthorizationRolesSettings(createPutAuthorizationRolesSettingsRequest(body));
  }

  /**
   * Change authorization role settings
   * Change role settings
   * @param body Authorization Role Settings (required)
   * @return RoleSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoleSettings> putAuthorizationRolesSettingsWithHttpInfo(RoleSettings body) throws IOException {
    return putAuthorizationRolesSettings(createPutAuthorizationRolesSettingsRequest(body).withHttpInfo());
  }

  private PutAuthorizationRolesSettingsRequest createPutAuthorizationRolesSettingsRequest(RoleSettings body) {
    return PutAuthorizationRolesSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Change authorization role settings
   * Change role settings
   * @param request The request object
   * @return RoleSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoleSettings putAuthorizationRolesSettings(PutAuthorizationRolesSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoleSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoleSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Change authorization role settings
   * Change role settings
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoleSettings> putAuthorizationRolesSettings(ApiRequest<RoleSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoleSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoleSettings> response = (ApiResponse<RoleSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<RoleSettings> response = (ApiResponse<RoleSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Sets the user's roles
   * 
   * @param subjectId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putUserRoles(String subjectId, List<String> body) throws IOException, ApiException {
    return  putUserRoles(createPutUserRolesRequest(subjectId, body));
  }

  /**
   * Sets the user's roles
   * 
   * @param subjectId User ID (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putUserRolesWithHttpInfo(String subjectId, List<String> body) throws IOException {
    return putUserRoles(createPutUserRolesRequest(subjectId, body).withHttpInfo());
  }

  private PutUserRolesRequest createPutUserRolesRequest(String subjectId, List<String> body) {
    return PutUserRolesRequest.builder()
            .withSubjectId(subjectId)

            .withBody(body)

            .build();
  }

  /**
   * Sets the user's roles
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
   * Sets the user's roles
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
