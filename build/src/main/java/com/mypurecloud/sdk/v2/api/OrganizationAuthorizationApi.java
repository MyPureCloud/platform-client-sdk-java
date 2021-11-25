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
import com.mypurecloud.sdk.v2.model.TrustRequest;
import com.mypurecloud.sdk.v2.model.Trustee;
import com.mypurecloud.sdk.v2.model.ClonedUserEntityListing;
import com.mypurecloud.sdk.v2.model.TrustUser;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.TrustUserEntityListing;
import com.mypurecloud.sdk.v2.model.TrustEntityListing;
import com.mypurecloud.sdk.v2.model.Trustor;
import com.mypurecloud.sdk.v2.model.ClonedUser;
import com.mypurecloud.sdk.v2.model.TrustorEntityListing;
import com.mypurecloud.sdk.v2.model.TrustRequestCreate;
import com.mypurecloud.sdk.v2.model.TrustMemberCreate;
import com.mypurecloud.sdk.v2.model.TrustCreate;
import com.mypurecloud.sdk.v2.model.AuditQueryResponse;
import com.mypurecloud.sdk.v2.model.TrusteeAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.TrustorAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.TrustUpdate;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;


import com.mypurecloud.sdk.v2.api.request.DeleteOrgauthorizationTrusteeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrgauthorizationTrusteeCloneduserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrgauthorizationTrusteeUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrgauthorizationTrusteeUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrgauthorizationTrustorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrgauthorizationTrustorCloneduserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrgauthorizationTrustorUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationPairingRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrusteeRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrusteeClonedusersRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrusteeUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrusteeUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrusteeUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrusteesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrusteesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrustorRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrustorCloneduserRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrustorClonedusersRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrustorUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrustorUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrgauthorizationTrustorsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOrgauthorizationPairingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOrgauthorizationTrusteeUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostOrgauthorizationTrusteesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOrgauthorizationTrusteesAuditsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOrgauthorizationTrusteesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PostOrgauthorizationTrustorAuditsRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrgauthorizationTrusteeRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrgauthorizationTrusteeUserRoledivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrgauthorizationTrusteeUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrgauthorizationTrustorCloneduserRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrgauthorizationTrustorUserRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrganizationAuthorizationApi {
  private final ApiClient pcapiClient;

  public OrganizationAuthorizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationAuthorizationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete Org Trust
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustee(String trusteeOrgId) throws IOException, ApiException {
     deleteOrgauthorizationTrustee(createDeleteOrgauthorizationTrusteeRequest(trusteeOrgId));
  }

  /**
   * Delete Org Trust
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrusteeWithHttpInfo(String trusteeOrgId) throws IOException {
    return deleteOrgauthorizationTrustee(createDeleteOrgauthorizationTrusteeRequest(trusteeOrgId).withHttpInfo());
  }

  private DeleteOrgauthorizationTrusteeRequest createDeleteOrgauthorizationTrusteeRequest(String trusteeOrgId) {
    return DeleteOrgauthorizationTrusteeRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .build();
  }

  /**
   * Delete Org Trust
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustee(DeleteOrgauthorizationTrusteeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Org Trust
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrustee(ApiRequest<Void> request) throws IOException {
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
   * Deletes cloned user
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Id of the cloned user to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrusteeCloneduser(String trusteeOrgId, String trusteeUserId) throws IOException, ApiException {
     deleteOrgauthorizationTrusteeCloneduser(createDeleteOrgauthorizationTrusteeCloneduserRequest(trusteeOrgId, trusteeUserId));
  }

  /**
   * Deletes cloned user
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Id of the cloned user to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrusteeCloneduserWithHttpInfo(String trusteeOrgId, String trusteeUserId) throws IOException {
    return deleteOrgauthorizationTrusteeCloneduser(createDeleteOrgauthorizationTrusteeCloneduserRequest(trusteeOrgId, trusteeUserId).withHttpInfo());
  }

  private DeleteOrgauthorizationTrusteeCloneduserRequest createDeleteOrgauthorizationTrusteeCloneduserRequest(String trusteeOrgId, String trusteeUserId) {
    return DeleteOrgauthorizationTrusteeCloneduserRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Deletes cloned user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrusteeCloneduser(DeleteOrgauthorizationTrusteeCloneduserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes cloned user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrusteeCloneduser(ApiRequest<Void> request) throws IOException {
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
   * Delete Trustee User
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrusteeUser(String trusteeOrgId, String trusteeUserId) throws IOException, ApiException {
     deleteOrgauthorizationTrusteeUser(createDeleteOrgauthorizationTrusteeUserRequest(trusteeOrgId, trusteeUserId));
  }

  /**
   * Delete Trustee User
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrusteeUserWithHttpInfo(String trusteeOrgId, String trusteeUserId) throws IOException {
    return deleteOrgauthorizationTrusteeUser(createDeleteOrgauthorizationTrusteeUserRequest(trusteeOrgId, trusteeUserId).withHttpInfo());
  }

  private DeleteOrgauthorizationTrusteeUserRequest createDeleteOrgauthorizationTrusteeUserRequest(String trusteeOrgId, String trusteeUserId) {
    return DeleteOrgauthorizationTrusteeUserRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Delete Trustee User
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrusteeUser(DeleteOrgauthorizationTrusteeUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Trustee User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrusteeUser(ApiRequest<Void> request) throws IOException {
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
   * Delete Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrusteeUserRoles(String trusteeOrgId, String trusteeUserId) throws IOException, ApiException {
     deleteOrgauthorizationTrusteeUserRoles(createDeleteOrgauthorizationTrusteeUserRolesRequest(trusteeOrgId, trusteeUserId));
  }

  /**
   * Delete Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrusteeUserRolesWithHttpInfo(String trusteeOrgId, String trusteeUserId) throws IOException {
    return deleteOrgauthorizationTrusteeUserRoles(createDeleteOrgauthorizationTrusteeUserRolesRequest(trusteeOrgId, trusteeUserId).withHttpInfo());
  }

  private DeleteOrgauthorizationTrusteeUserRolesRequest createDeleteOrgauthorizationTrusteeUserRolesRequest(String trusteeOrgId, String trusteeUserId) {
    return DeleteOrgauthorizationTrusteeUserRolesRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Delete Trustee User Roles
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrusteeUserRoles(DeleteOrgauthorizationTrusteeUserRolesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Trustee User Roles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrusteeUserRoles(ApiRequest<Void> request) throws IOException {
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
   * Delete Org Trust
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustor(String trustorOrgId) throws IOException, ApiException {
     deleteOrgauthorizationTrustor(createDeleteOrgauthorizationTrustorRequest(trustorOrgId));
  }

  /**
   * Delete Org Trust
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrustorWithHttpInfo(String trustorOrgId) throws IOException {
    return deleteOrgauthorizationTrustor(createDeleteOrgauthorizationTrustorRequest(trustorOrgId).withHttpInfo());
  }

  private DeleteOrgauthorizationTrustorRequest createDeleteOrgauthorizationTrustorRequest(String trustorOrgId) {
    return DeleteOrgauthorizationTrustorRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .build();
  }

  /**
   * Delete Org Trust
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustor(DeleteOrgauthorizationTrustorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Org Trust
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrustor(ApiRequest<Void> request) throws IOException {
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
   * Delete Cloned User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustorCloneduser(String trustorOrgId, String trusteeUserId) throws IOException, ApiException {
     deleteOrgauthorizationTrustorCloneduser(createDeleteOrgauthorizationTrustorCloneduserRequest(trustorOrgId, trusteeUserId));
  }

  /**
   * Delete Cloned User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrustorCloneduserWithHttpInfo(String trustorOrgId, String trusteeUserId) throws IOException {
    return deleteOrgauthorizationTrustorCloneduser(createDeleteOrgauthorizationTrustorCloneduserRequest(trustorOrgId, trusteeUserId).withHttpInfo());
  }

  private DeleteOrgauthorizationTrustorCloneduserRequest createDeleteOrgauthorizationTrustorCloneduserRequest(String trustorOrgId, String trusteeUserId) {
    return DeleteOrgauthorizationTrustorCloneduserRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Delete Cloned User
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustorCloneduser(DeleteOrgauthorizationTrustorCloneduserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Cloned User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrustorCloneduser(ApiRequest<Void> request) throws IOException {
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
   * Delete Trustee User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustorUser(String trustorOrgId, String trusteeUserId) throws IOException, ApiException {
     deleteOrgauthorizationTrustorUser(createDeleteOrgauthorizationTrustorUserRequest(trustorOrgId, trusteeUserId));
  }

  /**
   * Delete Trustee User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrustorUserWithHttpInfo(String trustorOrgId, String trusteeUserId) throws IOException {
    return deleteOrgauthorizationTrustorUser(createDeleteOrgauthorizationTrustorUserRequest(trustorOrgId, trusteeUserId).withHttpInfo());
  }

  private DeleteOrgauthorizationTrustorUserRequest createDeleteOrgauthorizationTrustorUserRequest(String trustorOrgId, String trusteeUserId) {
    return DeleteOrgauthorizationTrustorUserRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Delete Trustee User
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOrgauthorizationTrustorUser(DeleteOrgauthorizationTrustorUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Trustee User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOrgauthorizationTrustorUser(ApiRequest<Void> request) throws IOException {
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
   * Get Pairing Info
   * 
   * @param pairingId Pairing Id (required)
   * @return TrustRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustRequest getOrgauthorizationPairing(String pairingId) throws IOException, ApiException {
    return  getOrgauthorizationPairing(createGetOrgauthorizationPairingRequest(pairingId));
  }

  /**
   * Get Pairing Info
   * 
   * @param pairingId Pairing Id (required)
   * @return TrustRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustRequest> getOrgauthorizationPairingWithHttpInfo(String pairingId) throws IOException {
    return getOrgauthorizationPairing(createGetOrgauthorizationPairingRequest(pairingId).withHttpInfo());
  }

  private GetOrgauthorizationPairingRequest createGetOrgauthorizationPairingRequest(String pairingId) {
    return GetOrgauthorizationPairingRequest.builder()
            .withPairingId(pairingId)
    
            .build();
  }

  /**
   * Get Pairing Info
   * 
   * @param request The request object
   * @return TrustRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustRequest getOrgauthorizationPairing(GetOrgauthorizationPairingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Pairing Info
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustRequest> getOrgauthorizationPairing(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustRequest> response = (ApiResponse<TrustRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustRequest> response = (ApiResponse<TrustRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Org Trust
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee getOrgauthorizationTrustee(String trusteeOrgId) throws IOException, ApiException {
    return  getOrgauthorizationTrustee(createGetOrgauthorizationTrusteeRequest(trusteeOrgId));
  }

  /**
   * Get Org Trust
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @return Trustee
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> getOrgauthorizationTrusteeWithHttpInfo(String trusteeOrgId) throws IOException {
    return getOrgauthorizationTrustee(createGetOrgauthorizationTrusteeRequest(trusteeOrgId).withHttpInfo());
  }

  private GetOrgauthorizationTrusteeRequest createGetOrgauthorizationTrusteeRequest(String trusteeOrgId) {
    return GetOrgauthorizationTrusteeRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .build();
  }

  /**
   * Get Org Trust
   * 
   * @param request The request object
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee getOrgauthorizationTrustee(GetOrgauthorizationTrusteeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trustee> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trustee>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Org Trust
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> getOrgauthorizationTrustee(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trustee>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)exception;
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
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of cloned users from the trustee organization (i.e. users with a native user record).
   * There can be no more than 5 cloned users per organization, so results are represented as simple list and not paged
   * @param trusteeOrgId Trustee Organization Id (required)
   * @return ClonedUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUserEntityListing getOrgauthorizationTrusteeClonedusers(String trusteeOrgId) throws IOException, ApiException {
    return  getOrgauthorizationTrusteeClonedusers(createGetOrgauthorizationTrusteeClonedusersRequest(trusteeOrgId));
  }

  /**
   * The list of cloned users from the trustee organization (i.e. users with a native user record).
   * There can be no more than 5 cloned users per organization, so results are represented as simple list and not paged
   * @param trusteeOrgId Trustee Organization Id (required)
   * @return ClonedUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUserEntityListing> getOrgauthorizationTrusteeClonedusersWithHttpInfo(String trusteeOrgId) throws IOException {
    return getOrgauthorizationTrusteeClonedusers(createGetOrgauthorizationTrusteeClonedusersRequest(trusteeOrgId).withHttpInfo());
  }

  private GetOrgauthorizationTrusteeClonedusersRequest createGetOrgauthorizationTrusteeClonedusersRequest(String trusteeOrgId) {
    return GetOrgauthorizationTrusteeClonedusersRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .build();
  }

  /**
   * The list of cloned users from the trustee organization (i.e. users with a native user record).
   * There can be no more than 5 cloned users per organization, so results are represented as simple list and not paged
   * @param request The request object
   * @return ClonedUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUserEntityListing getOrgauthorizationTrusteeClonedusers(GetOrgauthorizationTrusteeClonedusersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ClonedUserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ClonedUserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of cloned users from the trustee organization (i.e. users with a native user record).
   * There can be no more than 5 cloned users per organization, so results are represented as simple list and not paged
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUserEntityListing> getOrgauthorizationTrusteeClonedusers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ClonedUserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ClonedUserEntityListing> response = (ApiResponse<ClonedUserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ClonedUserEntityListing> response = (ApiResponse<ClonedUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Trustee User
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser getOrgauthorizationTrusteeUser(String trusteeOrgId, String trusteeUserId) throws IOException, ApiException {
    return  getOrgauthorizationTrusteeUser(createGetOrgauthorizationTrusteeUserRequest(trusteeOrgId, trusteeUserId));
  }

  /**
   * Get Trustee User
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return TrustUser
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> getOrgauthorizationTrusteeUserWithHttpInfo(String trusteeOrgId, String trusteeUserId) throws IOException {
    return getOrgauthorizationTrusteeUser(createGetOrgauthorizationTrusteeUserRequest(trusteeOrgId, trusteeUserId).withHttpInfo());
  }

  private GetOrgauthorizationTrusteeUserRequest createGetOrgauthorizationTrusteeUserRequest(String trusteeOrgId, String trusteeUserId) {
    return GetOrgauthorizationTrusteeUserRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Get Trustee User
   * 
   * @param request The request object
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser getOrgauthorizationTrusteeUser(GetOrgauthorizationTrusteeUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustUser> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustUser>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Trustee User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> getOrgauthorizationTrusteeUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustUser>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization getOrgauthorizationTrusteeUserRoles(String trusteeOrgId, String trusteeUserId) throws IOException, ApiException {
    return  getOrgauthorizationTrusteeUserRoles(createGetOrgauthorizationTrusteeUserRolesRequest(trusteeOrgId, trusteeUserId));
  }

  /**
   * Get Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> getOrgauthorizationTrusteeUserRolesWithHttpInfo(String trusteeOrgId, String trusteeUserId) throws IOException {
    return getOrgauthorizationTrusteeUserRoles(createGetOrgauthorizationTrusteeUserRolesRequest(trusteeOrgId, trusteeUserId).withHttpInfo());
  }

  private GetOrgauthorizationTrusteeUserRolesRequest createGetOrgauthorizationTrusteeUserRolesRequest(String trusteeOrgId, String trusteeUserId) {
    return GetOrgauthorizationTrusteeUserRolesRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Get Trustee User Roles
   * 
   * @param request The request object
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization getOrgauthorizationTrusteeUserRoles(GetOrgauthorizationTrusteeUserRolesRequest request) throws IOException, ApiException {
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
   * Get Trustee User Roles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> getOrgauthorizationTrusteeUserRoles(ApiRequest<Void> request) throws IOException {
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
   * The list of trustee users for this organization (i.e. users granted access to this organization).
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUserEntityListing getOrgauthorizationTrusteeUsers(String trusteeOrgId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getOrgauthorizationTrusteeUsers(createGetOrgauthorizationTrusteeUsersRequest(trusteeOrgId, pageSize, pageNumber));
  }

  /**
   * The list of trustee users for this organization (i.e. users granted access to this organization).
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUserEntityListing> getOrgauthorizationTrusteeUsersWithHttpInfo(String trusteeOrgId, Integer pageSize, Integer pageNumber) throws IOException {
    return getOrgauthorizationTrusteeUsers(createGetOrgauthorizationTrusteeUsersRequest(trusteeOrgId, pageSize, pageNumber).withHttpInfo());
  }

  private GetOrgauthorizationTrusteeUsersRequest createGetOrgauthorizationTrusteeUsersRequest(String trusteeOrgId, Integer pageSize, Integer pageNumber) {
    return GetOrgauthorizationTrusteeUsersRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * The list of trustee users for this organization (i.e. users granted access to this organization).
   * 
   * @param request The request object
   * @return TrustUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUserEntityListing getOrgauthorizationTrusteeUsers(GetOrgauthorizationTrusteeUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustUserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustUserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of trustee users for this organization (i.e. users granted access to this organization).
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUserEntityListing> getOrgauthorizationTrusteeUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustUserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustUserEntityListing> response = (ApiResponse<TrustUserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustUserEntityListing> response = (ApiResponse<TrustUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of trustees for this organization (i.e. organizations granted access to this organization).
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustEntityListing getOrgauthorizationTrustees(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getOrgauthorizationTrustees(createGetOrgauthorizationTrusteesRequest(pageSize, pageNumber));
  }

  /**
   * The list of trustees for this organization (i.e. organizations granted access to this organization).
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustEntityListing> getOrgauthorizationTrusteesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getOrgauthorizationTrustees(createGetOrgauthorizationTrusteesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetOrgauthorizationTrusteesRequest createGetOrgauthorizationTrusteesRequest(Integer pageSize, Integer pageNumber) {
    return GetOrgauthorizationTrusteesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * The list of trustees for this organization (i.e. organizations granted access to this organization).
   * 
   * @param request The request object
   * @return TrustEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustEntityListing getOrgauthorizationTrustees(GetOrgauthorizationTrusteesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of trustees for this organization (i.e. organizations granted access to this organization).
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustEntityListing> getOrgauthorizationTrustees(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustEntityListing> response = (ApiResponse<TrustEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustEntityListing> response = (ApiResponse<TrustEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get organization authorization trust with Customer Care, if one exists.
   * 
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee getOrgauthorizationTrusteesDefault() throws IOException, ApiException {
    return  getOrgauthorizationTrusteesDefault(createGetOrgauthorizationTrusteesDefaultRequest());
  }

  /**
   * Get organization authorization trust with Customer Care, if one exists.
   * 
   * @return Trustee
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> getOrgauthorizationTrusteesDefaultWithHttpInfo() throws IOException {
    return getOrgauthorizationTrusteesDefault(createGetOrgauthorizationTrusteesDefaultRequest().withHttpInfo());
  }

  private GetOrgauthorizationTrusteesDefaultRequest createGetOrgauthorizationTrusteesDefaultRequest() {
    return GetOrgauthorizationTrusteesDefaultRequest.builder()
            .build();
  }

  /**
   * Get organization authorization trust with Customer Care, if one exists.
   * 
   * @param request The request object
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee getOrgauthorizationTrusteesDefault(GetOrgauthorizationTrusteesDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trustee> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trustee>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get organization authorization trust with Customer Care, if one exists.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> getOrgauthorizationTrusteesDefault(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trustee>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)exception;
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
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Org Trust
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @return Trustor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustor getOrgauthorizationTrustor(String trustorOrgId) throws IOException, ApiException {
    return  getOrgauthorizationTrustor(createGetOrgauthorizationTrustorRequest(trustorOrgId));
  }

  /**
   * Get Org Trust
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @return Trustor
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustor> getOrgauthorizationTrustorWithHttpInfo(String trustorOrgId) throws IOException {
    return getOrgauthorizationTrustor(createGetOrgauthorizationTrustorRequest(trustorOrgId).withHttpInfo());
  }

  private GetOrgauthorizationTrustorRequest createGetOrgauthorizationTrustorRequest(String trustorOrgId) {
    return GetOrgauthorizationTrustorRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .build();
  }

  /**
   * Get Org Trust
   * 
   * @param request The request object
   * @return Trustor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustor getOrgauthorizationTrustor(GetOrgauthorizationTrustorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trustor> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trustor>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Org Trust
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustor> getOrgauthorizationTrustor(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trustor>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trustor> response = (ApiResponse<Trustor>)(ApiResponse<?>)exception;
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
      ApiResponse<Trustor> response = (ApiResponse<Trustor>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Cloned User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return ClonedUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUser getOrgauthorizationTrustorCloneduser(String trustorOrgId, String trusteeUserId) throws IOException, ApiException {
    return  getOrgauthorizationTrustorCloneduser(createGetOrgauthorizationTrustorCloneduserRequest(trustorOrgId, trusteeUserId));
  }

  /**
   * Get Cloned User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return ClonedUser
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUser> getOrgauthorizationTrustorCloneduserWithHttpInfo(String trustorOrgId, String trusteeUserId) throws IOException {
    return getOrgauthorizationTrustorCloneduser(createGetOrgauthorizationTrustorCloneduserRequest(trustorOrgId, trusteeUserId).withHttpInfo());
  }

  private GetOrgauthorizationTrustorCloneduserRequest createGetOrgauthorizationTrustorCloneduserRequest(String trustorOrgId, String trusteeUserId) {
    return GetOrgauthorizationTrustorCloneduserRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Get Cloned User
   * 
   * @param request The request object
   * @return ClonedUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUser getOrgauthorizationTrustorCloneduser(GetOrgauthorizationTrustorCloneduserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ClonedUser> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ClonedUser>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Cloned User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUser> getOrgauthorizationTrustorCloneduser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ClonedUser>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ClonedUser> response = (ApiResponse<ClonedUser>)(ApiResponse<?>)exception;
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
      ApiResponse<ClonedUser> response = (ApiResponse<ClonedUser>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of cloned users in the trustor organization (i.e. users with a native user record).
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @return ClonedUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUserEntityListing getOrgauthorizationTrustorClonedusers(String trustorOrgId) throws IOException, ApiException {
    return  getOrgauthorizationTrustorClonedusers(createGetOrgauthorizationTrustorClonedusersRequest(trustorOrgId));
  }

  /**
   * The list of cloned users in the trustor organization (i.e. users with a native user record).
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @return ClonedUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUserEntityListing> getOrgauthorizationTrustorClonedusersWithHttpInfo(String trustorOrgId) throws IOException {
    return getOrgauthorizationTrustorClonedusers(createGetOrgauthorizationTrustorClonedusersRequest(trustorOrgId).withHttpInfo());
  }

  private GetOrgauthorizationTrustorClonedusersRequest createGetOrgauthorizationTrustorClonedusersRequest(String trustorOrgId) {
    return GetOrgauthorizationTrustorClonedusersRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .build();
  }

  /**
   * The list of cloned users in the trustor organization (i.e. users with a native user record).
   * 
   * @param request The request object
   * @return ClonedUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUserEntityListing getOrgauthorizationTrustorClonedusers(GetOrgauthorizationTrustorClonedusersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ClonedUserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ClonedUserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of cloned users in the trustor organization (i.e. users with a native user record).
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUserEntityListing> getOrgauthorizationTrustorClonedusers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ClonedUserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ClonedUserEntityListing> response = (ApiResponse<ClonedUserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ClonedUserEntityListing> response = (ApiResponse<ClonedUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Trustee User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser getOrgauthorizationTrustorUser(String trustorOrgId, String trusteeUserId) throws IOException, ApiException {
    return  getOrgauthorizationTrustorUser(createGetOrgauthorizationTrustorUserRequest(trustorOrgId, trusteeUserId));
  }

  /**
   * Get Trustee User
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return TrustUser
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> getOrgauthorizationTrustorUserWithHttpInfo(String trustorOrgId, String trusteeUserId) throws IOException {
    return getOrgauthorizationTrustorUser(createGetOrgauthorizationTrustorUserRequest(trustorOrgId, trusteeUserId).withHttpInfo());
  }

  private GetOrgauthorizationTrustorUserRequest createGetOrgauthorizationTrustorUserRequest(String trustorOrgId, String trusteeUserId) {
    return GetOrgauthorizationTrustorUserRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Get Trustee User
   * 
   * @param request The request object
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser getOrgauthorizationTrustorUser(GetOrgauthorizationTrustorUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustUser> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustUser>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Trustee User
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> getOrgauthorizationTrustorUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustUser>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of users in the trustor organization (i.e. users granted access).
   * 
   * @param trustorOrgId Trustee Organization Id (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUserEntityListing getOrgauthorizationTrustorUsers(String trustorOrgId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getOrgauthorizationTrustorUsers(createGetOrgauthorizationTrustorUsersRequest(trustorOrgId, pageSize, pageNumber));
  }

  /**
   * The list of users in the trustor organization (i.e. users granted access).
   * 
   * @param trustorOrgId Trustee Organization Id (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUserEntityListing> getOrgauthorizationTrustorUsersWithHttpInfo(String trustorOrgId, Integer pageSize, Integer pageNumber) throws IOException {
    return getOrgauthorizationTrustorUsers(createGetOrgauthorizationTrustorUsersRequest(trustorOrgId, pageSize, pageNumber).withHttpInfo());
  }

  private GetOrgauthorizationTrustorUsersRequest createGetOrgauthorizationTrustorUsersRequest(String trustorOrgId, Integer pageSize, Integer pageNumber) {
    return GetOrgauthorizationTrustorUsersRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * The list of users in the trustor organization (i.e. users granted access).
   * 
   * @param request The request object
   * @return TrustUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUserEntityListing getOrgauthorizationTrustorUsers(GetOrgauthorizationTrustorUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustUserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustUserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of users in the trustor organization (i.e. users granted access).
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUserEntityListing> getOrgauthorizationTrustorUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustUserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustUserEntityListing> response = (ApiResponse<TrustUserEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustUserEntityListing> response = (ApiResponse<TrustUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of organizations that have authorized/trusted your organization.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustorEntityListing getOrgauthorizationTrustors(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getOrgauthorizationTrustors(createGetOrgauthorizationTrustorsRequest(pageSize, pageNumber));
  }

  /**
   * The list of organizations that have authorized/trusted your organization.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TrustorEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustorEntityListing> getOrgauthorizationTrustorsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getOrgauthorizationTrustors(createGetOrgauthorizationTrustorsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetOrgauthorizationTrustorsRequest createGetOrgauthorizationTrustorsRequest(Integer pageSize, Integer pageNumber) {
    return GetOrgauthorizationTrustorsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * The list of organizations that have authorized/trusted your organization.
   * 
   * @param request The request object
   * @return TrustorEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustorEntityListing getOrgauthorizationTrustors(GetOrgauthorizationTrustorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustorEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustorEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of organizations that have authorized/trusted your organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustorEntityListing> getOrgauthorizationTrustors(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustorEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustorEntityListing> response = (ApiResponse<TrustorEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustorEntityListing> response = (ApiResponse<TrustorEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * A pairing id is created by the trustee and given to the trustor to create a trust.
   * 
   * @param body Pairing Info (required)
   * @return TrustRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustRequest postOrgauthorizationPairings(TrustRequestCreate body) throws IOException, ApiException {
    return  postOrgauthorizationPairings(createPostOrgauthorizationPairingsRequest(body));
  }

  /**
   * A pairing id is created by the trustee and given to the trustor to create a trust.
   * 
   * @param body Pairing Info (required)
   * @return TrustRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustRequest> postOrgauthorizationPairingsWithHttpInfo(TrustRequestCreate body) throws IOException {
    return postOrgauthorizationPairings(createPostOrgauthorizationPairingsRequest(body).withHttpInfo());
  }

  private PostOrgauthorizationPairingsRequest createPostOrgauthorizationPairingsRequest(TrustRequestCreate body) {
    return PostOrgauthorizationPairingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * A pairing id is created by the trustee and given to the trustor to create a trust.
   * 
   * @param request The request object
   * @return TrustRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustRequest postOrgauthorizationPairings(PostOrgauthorizationPairingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * A pairing id is created by the trustee and given to the trustor to create a trust.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustRequest> postOrgauthorizationPairings(ApiRequest<TrustRequestCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustRequest> response = (ApiResponse<TrustRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustRequest> response = (ApiResponse<TrustRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a user to the trust.
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param body Trust (required)
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser postOrgauthorizationTrusteeUsers(String trusteeOrgId, TrustMemberCreate body) throws IOException, ApiException {
    return  postOrgauthorizationTrusteeUsers(createPostOrgauthorizationTrusteeUsersRequest(trusteeOrgId, body));
  }

  /**
   * Add a user to the trust.
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param body Trust (required)
   * @return TrustUser
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> postOrgauthorizationTrusteeUsersWithHttpInfo(String trusteeOrgId, TrustMemberCreate body) throws IOException {
    return postOrgauthorizationTrusteeUsers(createPostOrgauthorizationTrusteeUsersRequest(trusteeOrgId, body).withHttpInfo());
  }

  private PostOrgauthorizationTrusteeUsersRequest createPostOrgauthorizationTrusteeUsersRequest(String trusteeOrgId, TrustMemberCreate body) {
    return PostOrgauthorizationTrusteeUsersRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add a user to the trust.
   * 
   * @param request The request object
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser postOrgauthorizationTrusteeUsers(PostOrgauthorizationTrusteeUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustUser> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustUser>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a user to the trust.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> postOrgauthorizationTrusteeUsers(ApiRequest<TrustMemberCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustUser>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new organization authorization trust. This is required to grant other organizations access to your organization.
   * 
   * @param body Trust (required)
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee postOrgauthorizationTrustees(TrustCreate body) throws IOException, ApiException {
    return  postOrgauthorizationTrustees(createPostOrgauthorizationTrusteesRequest(body));
  }

  /**
   * Create a new organization authorization trust. This is required to grant other organizations access to your organization.
   * 
   * @param body Trust (required)
   * @return Trustee
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> postOrgauthorizationTrusteesWithHttpInfo(TrustCreate body) throws IOException {
    return postOrgauthorizationTrustees(createPostOrgauthorizationTrusteesRequest(body).withHttpInfo());
  }

  private PostOrgauthorizationTrusteesRequest createPostOrgauthorizationTrusteesRequest(TrustCreate body) {
    return PostOrgauthorizationTrusteesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new organization authorization trust. This is required to grant other organizations access to your organization.
   * 
   * @param request The request object
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee postOrgauthorizationTrustees(PostOrgauthorizationTrusteesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trustee> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trustee>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new organization authorization trust. This is required to grant other organizations access to your organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> postOrgauthorizationTrustees(ApiRequest<TrustCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trustee>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)exception;
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
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Org Trustee Audits
   * 
   * @param body Values to scope the request. (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param sortOrder Sort order (optional, default to descending)
   * @return AuditQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryResponse postOrgauthorizationTrusteesAudits(TrusteeAuditQueryRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    return  postOrgauthorizationTrusteesAudits(createPostOrgauthorizationTrusteesAuditsRequest(body, pageSize, pageNumber, sortBy, sortOrder));
  }

  /**
   * Get Org Trustee Audits
   * 
   * @param body Values to scope the request. (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param sortOrder Sort order (optional, default to descending)
   * @return AuditQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryResponse> postOrgauthorizationTrusteesAuditsWithHttpInfo(TrusteeAuditQueryRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException {
    return postOrgauthorizationTrusteesAudits(createPostOrgauthorizationTrusteesAuditsRequest(body, pageSize, pageNumber, sortBy, sortOrder).withHttpInfo());
  }

  private PostOrgauthorizationTrusteesAuditsRequest createPostOrgauthorizationTrusteesAuditsRequest(TrusteeAuditQueryRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) {
    return PostOrgauthorizationTrusteesAuditsRequest.builder()
            .withBody(body)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get Org Trustee Audits
   * 
   * @param request The request object
   * @return AuditQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryResponse postOrgauthorizationTrusteesAudits(PostOrgauthorizationTrusteesAuditsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Org Trustee Audits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryResponse> postOrgauthorizationTrusteesAudits(ApiRequest<TrusteeAuditQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditQueryResponse> response = (ApiResponse<AuditQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditQueryResponse> response = (ApiResponse<AuditQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization.
   * 
   * @param assignDefaultRole Assign Admin role to default pairing with Customer Care (optional)
   * @param autoExpire Automatically expire pairing after 30 days (optional)
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee postOrgauthorizationTrusteesDefault(Boolean assignDefaultRole, Boolean autoExpire) throws IOException, ApiException {
    return  postOrgauthorizationTrusteesDefault(createPostOrgauthorizationTrusteesDefaultRequest(assignDefaultRole, autoExpire));
  }

  /**
   * Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization.
   * 
   * @param assignDefaultRole Assign Admin role to default pairing with Customer Care (optional)
   * @param autoExpire Automatically expire pairing after 30 days (optional)
   * @return Trustee
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> postOrgauthorizationTrusteesDefaultWithHttpInfo(Boolean assignDefaultRole, Boolean autoExpire) throws IOException {
    return postOrgauthorizationTrusteesDefault(createPostOrgauthorizationTrusteesDefaultRequest(assignDefaultRole, autoExpire).withHttpInfo());
  }

  private PostOrgauthorizationTrusteesDefaultRequest createPostOrgauthorizationTrusteesDefaultRequest(Boolean assignDefaultRole, Boolean autoExpire) {
    return PostOrgauthorizationTrusteesDefaultRequest.builder()
            .withAssignDefaultRole(assignDefaultRole)
    
            .withAutoExpire(autoExpire)
    
            .build();
  }

  /**
   * Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization.
   * 
   * @param request The request object
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee postOrgauthorizationTrusteesDefault(PostOrgauthorizationTrusteesDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trustee> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trustee>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new organization authorization trust with Customer Care. This is required to grant your regional Customer Care organization access to your organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> postOrgauthorizationTrusteesDefault(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trustee>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)exception;
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
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Org Trustor Audits
   * 
   * @param body Values to scope the request. (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param sortOrder Sort order (optional, default to descending)
   * @return AuditQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryResponse postOrgauthorizationTrustorAudits(TrustorAuditQueryRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException, ApiException {
    return  postOrgauthorizationTrustorAudits(createPostOrgauthorizationTrustorAuditsRequest(body, pageSize, pageNumber, sortBy, sortOrder));
  }

  /**
   * Get Org Trustor Audits
   * 
   * @param body Values to scope the request. (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param sortOrder Sort order (optional, default to descending)
   * @return AuditQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryResponse> postOrgauthorizationTrustorAuditsWithHttpInfo(TrustorAuditQueryRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) throws IOException {
    return postOrgauthorizationTrustorAudits(createPostOrgauthorizationTrustorAuditsRequest(body, pageSize, pageNumber, sortBy, sortOrder).withHttpInfo());
  }

  private PostOrgauthorizationTrustorAuditsRequest createPostOrgauthorizationTrustorAuditsRequest(TrustorAuditQueryRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder) {
    return PostOrgauthorizationTrustorAuditsRequest.builder()
            .withBody(body)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get Org Trustor Audits
   * 
   * @param request The request object
   * @return AuditQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditQueryResponse postOrgauthorizationTrustorAudits(PostOrgauthorizationTrustorAuditsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Org Trustor Audits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditQueryResponse> postOrgauthorizationTrustorAudits(ApiRequest<TrustorAuditQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditQueryResponse> response = (ApiResponse<AuditQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditQueryResponse> response = (ApiResponse<AuditQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update Org Trust
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param body Client (required)
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee putOrgauthorizationTrustee(String trusteeOrgId, TrustUpdate body) throws IOException, ApiException {
    return  putOrgauthorizationTrustee(createPutOrgauthorizationTrusteeRequest(trusteeOrgId, body));
  }

  /**
   * Update Org Trust
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param body Client (required)
   * @return Trustee
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> putOrgauthorizationTrusteeWithHttpInfo(String trusteeOrgId, TrustUpdate body) throws IOException {
    return putOrgauthorizationTrustee(createPutOrgauthorizationTrusteeRequest(trusteeOrgId, body).withHttpInfo());
  }

  private PutOrgauthorizationTrusteeRequest createPutOrgauthorizationTrusteeRequest(String trusteeOrgId, TrustUpdate body) {
    return PutOrgauthorizationTrusteeRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update Org Trust
   * 
   * @param request The request object
   * @return Trustee
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Trustee putOrgauthorizationTrustee(PutOrgauthorizationTrusteeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Trustee> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Trustee>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Org Trust
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Trustee> putOrgauthorizationTrustee(ApiRequest<TrustUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Trustee>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)exception;
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
      ApiResponse<Trustee> response = (ApiResponse<Trustee>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @param body Set of roles with corresponding divisions to apply (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putOrgauthorizationTrusteeUserRoledivisions(String trusteeOrgId, String trusteeUserId, RoleDivisionGrants body) throws IOException, ApiException {
    return  putOrgauthorizationTrusteeUserRoledivisions(createPutOrgauthorizationTrusteeUserRoledivisionsRequest(trusteeOrgId, trusteeUserId, body));
  }

  /**
   * Update Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @param body Set of roles with corresponding divisions to apply (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putOrgauthorizationTrusteeUserRoledivisionsWithHttpInfo(String trusteeOrgId, String trusteeUserId, RoleDivisionGrants body) throws IOException {
    return putOrgauthorizationTrusteeUserRoledivisions(createPutOrgauthorizationTrusteeUserRoledivisionsRequest(trusteeOrgId, trusteeUserId, body).withHttpInfo());
  }

  private PutOrgauthorizationTrusteeUserRoledivisionsRequest createPutOrgauthorizationTrusteeUserRoledivisionsRequest(String trusteeOrgId, String trusteeUserId, RoleDivisionGrants body) {
    return PutOrgauthorizationTrusteeUserRoledivisionsRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update Trustee User Roles
   * 
   * @param request The request object
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putOrgauthorizationTrusteeUserRoledivisions(PutOrgauthorizationTrusteeUserRoledivisionsRequest request) throws IOException, ApiException {
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
   * Update Trustee User Roles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putOrgauthorizationTrusteeUserRoledivisions(ApiRequest<RoleDivisionGrants> request) throws IOException {
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
   * Update Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putOrgauthorizationTrusteeUserRoles(String trusteeOrgId, String trusteeUserId, List<String> body) throws IOException, ApiException {
    return  putOrgauthorizationTrusteeUserRoles(createPutOrgauthorizationTrusteeUserRolesRequest(trusteeOrgId, trusteeUserId, body));
  }

  /**
   * Update Trustee User Roles
   * 
   * @param trusteeOrgId Trustee Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @param body List of roles (required)
   * @return UserAuthorization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putOrgauthorizationTrusteeUserRolesWithHttpInfo(String trusteeOrgId, String trusteeUserId, List<String> body) throws IOException {
    return putOrgauthorizationTrusteeUserRoles(createPutOrgauthorizationTrusteeUserRolesRequest(trusteeOrgId, trusteeUserId, body).withHttpInfo());
  }

  private PutOrgauthorizationTrusteeUserRolesRequest createPutOrgauthorizationTrusteeUserRolesRequest(String trusteeOrgId, String trusteeUserId, List<String> body) {
    return PutOrgauthorizationTrusteeUserRolesRequest.builder()
            .withTrusteeOrgId(trusteeOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update Trustee User Roles
   * 
   * @param request The request object
   * @return UserAuthorization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAuthorization putOrgauthorizationTrusteeUserRoles(PutOrgauthorizationTrusteeUserRolesRequest request) throws IOException, ApiException {
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
   * Update Trustee User Roles
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAuthorization> putOrgauthorizationTrusteeUserRoles(ApiRequest<List<String>> request) throws IOException {
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
   * Creates a clone of the trustee user in the trustor org.
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return ClonedUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUser putOrgauthorizationTrustorCloneduser(String trustorOrgId, String trusteeUserId) throws IOException, ApiException {
    return  putOrgauthorizationTrustorCloneduser(createPutOrgauthorizationTrustorCloneduserRequest(trustorOrgId, trusteeUserId));
  }

  /**
   * Creates a clone of the trustee user in the trustor org.
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return ClonedUser
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUser> putOrgauthorizationTrustorCloneduserWithHttpInfo(String trustorOrgId, String trusteeUserId) throws IOException {
    return putOrgauthorizationTrustorCloneduser(createPutOrgauthorizationTrustorCloneduserRequest(trustorOrgId, trusteeUserId).withHttpInfo());
  }

  private PutOrgauthorizationTrustorCloneduserRequest createPutOrgauthorizationTrustorCloneduserRequest(String trustorOrgId, String trusteeUserId) {
    return PutOrgauthorizationTrustorCloneduserRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Creates a clone of the trustee user in the trustor org.
   * 
   * @param request The request object
   * @return ClonedUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClonedUser putOrgauthorizationTrustorCloneduser(PutOrgauthorizationTrustorCloneduserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ClonedUser> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ClonedUser>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a clone of the trustee user in the trustor org.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClonedUser> putOrgauthorizationTrustorCloneduser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ClonedUser>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ClonedUser> response = (ApiResponse<ClonedUser>)(ApiResponse<?>)exception;
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
      ApiResponse<ClonedUser> response = (ApiResponse<ClonedUser>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a Trustee user to the trust.
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser putOrgauthorizationTrustorUser(String trustorOrgId, String trusteeUserId) throws IOException, ApiException {
    return  putOrgauthorizationTrustorUser(createPutOrgauthorizationTrustorUserRequest(trustorOrgId, trusteeUserId));
  }

  /**
   * Add a Trustee user to the trust.
   * 
   * @param trustorOrgId Trustor Organization Id (required)
   * @param trusteeUserId Trustee User Id (required)
   * @return TrustUser
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> putOrgauthorizationTrustorUserWithHttpInfo(String trustorOrgId, String trusteeUserId) throws IOException {
    return putOrgauthorizationTrustorUser(createPutOrgauthorizationTrustorUserRequest(trustorOrgId, trusteeUserId).withHttpInfo());
  }

  private PutOrgauthorizationTrustorUserRequest createPutOrgauthorizationTrustorUserRequest(String trustorOrgId, String trusteeUserId) {
    return PutOrgauthorizationTrustorUserRequest.builder()
            .withTrustorOrgId(trustorOrgId)
    
            .withTrusteeUserId(trusteeUserId)
    
            .build();
  }

  /**
   * Add a Trustee user to the trust.
   * 
   * @param request The request object
   * @return TrustUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrustUser putOrgauthorizationTrustorUser(PutOrgauthorizationTrustorUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrustUser> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrustUser>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a Trustee user to the trust.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrustUser> putOrgauthorizationTrustorUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrustUser>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)exception;
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
      ApiResponse<TrustUser> response = (ApiResponse<TrustUser>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
