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
import com.mypurecloud.sdk.v2.model.LicenseDefinition;
import com.mypurecloud.sdk.v2.model.LicenseOrgToggle;
import com.mypurecloud.sdk.v2.model.LicenseUser;
import com.mypurecloud.sdk.v2.model.UserLicensesEntityListing;
import com.mypurecloud.sdk.v2.model.LicenseBatchAssignmentRequest;
import com.mypurecloud.sdk.v2.model.LicenseUpdateStatus;


import com.mypurecloud.sdk.v2.api.request.GetLicenseDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseDefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseToggleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseInferRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseToggleRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseUsersRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LicenseApi {
  private final ApiClient pcapiClient;

  public LicenseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LicenseApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get PureCloud license definition.
   * 
   * @param licenseId ID (required)
   * @return LicenseDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseDefinition getLicenseDefinition(String licenseId) throws IOException, ApiException {
    return  getLicenseDefinition(createGetLicenseDefinitionRequest(licenseId));
  }

  /**
   * Get PureCloud license definition.
   * 
   * @param licenseId ID (required)
   * @return LicenseDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseDefinition> getLicenseDefinitionWithHttpInfo(String licenseId) throws IOException {
    return getLicenseDefinition(createGetLicenseDefinitionRequest(licenseId).withHttpInfo());
  }

  private GetLicenseDefinitionRequest createGetLicenseDefinitionRequest(String licenseId) {
    return GetLicenseDefinitionRequest.builder()
            .withLicenseId(licenseId)
    
            .build();
  }

  /**
   * Get PureCloud license definition.
   * 
   * @param request The request object
   * @return LicenseDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseDefinition getLicenseDefinition(GetLicenseDefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LicenseDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LicenseDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get PureCloud license definition.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseDefinition> getLicenseDefinition(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LicenseDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LicenseDefinition> response = (ApiResponse<LicenseDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<LicenseDefinition> response = (ApiResponse<LicenseDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @return List<LicenseDefinition>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<LicenseDefinition> getLicenseDefinitions() throws IOException, ApiException {
    return  getLicenseDefinitions(createGetLicenseDefinitionsRequest());
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @return List<LicenseDefinition>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<LicenseDefinition>> getLicenseDefinitionsWithHttpInfo() throws IOException {
    return getLicenseDefinitions(createGetLicenseDefinitionsRequest().withHttpInfo());
  }

  private GetLicenseDefinitionsRequest createGetLicenseDefinitionsRequest() {
    return GetLicenseDefinitionsRequest.builder()
            .build();
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @param request The request object
   * @return List<LicenseDefinition>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<LicenseDefinition> getLicenseDefinitions(GetLicenseDefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<LicenseDefinition>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<LicenseDefinition>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<LicenseDefinition>> getLicenseDefinitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<LicenseDefinition>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<LicenseDefinition>> response = (ApiResponse<List<LicenseDefinition>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<LicenseDefinition>> response = (ApiResponse<List<LicenseDefinition>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get PureCloud license feature toggle value.
   * 
   * @param featureName featureName (required)
   * @return LicenseOrgToggle
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseOrgToggle getLicenseToggle(String featureName) throws IOException, ApiException {
    return  getLicenseToggle(createGetLicenseToggleRequest(featureName));
  }

  /**
   * Get PureCloud license feature toggle value.
   * 
   * @param featureName featureName (required)
   * @return LicenseOrgToggle
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseOrgToggle> getLicenseToggleWithHttpInfo(String featureName) throws IOException {
    return getLicenseToggle(createGetLicenseToggleRequest(featureName).withHttpInfo());
  }

  private GetLicenseToggleRequest createGetLicenseToggleRequest(String featureName) {
    return GetLicenseToggleRequest.builder()
            .withFeatureName(featureName)
    
            .build();
  }

  /**
   * Get PureCloud license feature toggle value.
   * 
   * @param request The request object
   * @return LicenseOrgToggle
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseOrgToggle getLicenseToggle(GetLicenseToggleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LicenseOrgToggle> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LicenseOrgToggle>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get PureCloud license feature toggle value.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseOrgToggle> getLicenseToggle(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LicenseOrgToggle>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)exception;
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
      ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get licenses for specified user.
   * 
   * @param userId ID (required)
   * @return LicenseUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseUser getLicenseUser(String userId) throws IOException, ApiException {
    return  getLicenseUser(createGetLicenseUserRequest(userId));
  }

  /**
   * Get licenses for specified user.
   * 
   * @param userId ID (required)
   * @return LicenseUser
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseUser> getLicenseUserWithHttpInfo(String userId) throws IOException {
    return getLicenseUser(createGetLicenseUserRequest(userId).withHttpInfo());
  }

  private GetLicenseUserRequest createGetLicenseUserRequest(String userId) {
    return GetLicenseUserRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get licenses for specified user.
   * 
   * @param request The request object
   * @return LicenseUser
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseUser getLicenseUser(GetLicenseUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LicenseUser> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LicenseUser>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get licenses for specified user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseUser> getLicenseUser(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LicenseUser>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LicenseUser> response = (ApiResponse<LicenseUser>)(ApiResponse<?>)exception;
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
      ApiResponse<LicenseUser> response = (ApiResponse<LicenseUser>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a page of users and their licenses
   * Retrieve a page of users in an organization along with the licenses they possess.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return UserLicensesEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLicensesEntityListing getLicenseUsers(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getLicenseUsers(createGetLicenseUsersRequest(pageSize, pageNumber));
  }

  /**
   * Get a page of users and their licenses
   * Retrieve a page of users in an organization along with the licenses they possess.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return UserLicensesEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLicensesEntityListing> getLicenseUsersWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getLicenseUsers(createGetLicenseUsersRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetLicenseUsersRequest createGetLicenseUsersRequest(Integer pageSize, Integer pageNumber) {
    return GetLicenseUsersRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a page of users and their licenses
   * Retrieve a page of users in an organization along with the licenses they possess.
   * @param request The request object
   * @return UserLicensesEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLicensesEntityListing getLicenseUsers(GetLicenseUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserLicensesEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserLicensesEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a page of users and their licenses
   * Retrieve a page of users in an organization along with the licenses they possess.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLicensesEntityListing> getLicenseUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserLicensesEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserLicensesEntityListing> response = (ApiResponse<UserLicensesEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserLicensesEntityListing> response = (ApiResponse<UserLicensesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of licenses inferred based on a list of roleIds
   * 
   * @param body The roleIds to use while inferring licenses (optional)
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> postLicenseInfer(List<String> body) throws IOException, ApiException {
    return  postLicenseInfer(createPostLicenseInferRequest(body));
  }

  /**
   * Get a list of licenses inferred based on a list of roleIds
   * 
   * @param body The roleIds to use while inferring licenses (optional)
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> postLicenseInferWithHttpInfo(List<String> body) throws IOException {
    return postLicenseInfer(createPostLicenseInferRequest(body).withHttpInfo());
  }

  private PostLicenseInferRequest createPostLicenseInferRequest(List<String> body) {
    return PostLicenseInferRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Get a list of licenses inferred based on a list of roleIds
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> postLicenseInfer(PostLicenseInferRequest request) throws IOException, ApiException {
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
   * Get a list of licenses inferred based on a list of roleIds
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> postLicenseInfer(ApiRequest<List<String>> request) throws IOException {
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
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param body The license assignments to update. (optional)
   * @return List<LicenseUpdateStatus>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<LicenseUpdateStatus> postLicenseOrganization(LicenseBatchAssignmentRequest body) throws IOException, ApiException {
    return  postLicenseOrganization(createPostLicenseOrganizationRequest(body));
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param body The license assignments to update. (optional)
   * @return List<LicenseUpdateStatus>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<LicenseUpdateStatus>> postLicenseOrganizationWithHttpInfo(LicenseBatchAssignmentRequest body) throws IOException {
    return postLicenseOrganization(createPostLicenseOrganizationRequest(body).withHttpInfo());
  }

  private PostLicenseOrganizationRequest createPostLicenseOrganizationRequest(LicenseBatchAssignmentRequest body) {
    return PostLicenseOrganizationRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param request The request object
   * @return List<LicenseUpdateStatus>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<LicenseUpdateStatus> postLicenseOrganization(PostLicenseOrganizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<LicenseUpdateStatus>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<LicenseUpdateStatus>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<LicenseUpdateStatus>> postLicenseOrganization(ApiRequest<LicenseBatchAssignmentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<LicenseUpdateStatus>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<LicenseUpdateStatus>> response = (ApiResponse<List<LicenseUpdateStatus>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<LicenseUpdateStatus>> response = (ApiResponse<List<LicenseUpdateStatus>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Switch PureCloud license feature toggle value.
   * 
   * @param featureName featureName (required)
   * @return LicenseOrgToggle
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseOrgToggle postLicenseToggle(String featureName) throws IOException, ApiException {
    return  postLicenseToggle(createPostLicenseToggleRequest(featureName));
  }

  /**
   * Switch PureCloud license feature toggle value.
   * 
   * @param featureName featureName (required)
   * @return LicenseOrgToggle
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseOrgToggle> postLicenseToggleWithHttpInfo(String featureName) throws IOException {
    return postLicenseToggle(createPostLicenseToggleRequest(featureName).withHttpInfo());
  }

  private PostLicenseToggleRequest createPostLicenseToggleRequest(String featureName) {
    return PostLicenseToggleRequest.builder()
            .withFeatureName(featureName)
    
            .build();
  }

  /**
   * Switch PureCloud license feature toggle value.
   * 
   * @param request The request object
   * @return LicenseOrgToggle
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseOrgToggle postLicenseToggle(PostLicenseToggleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LicenseOrgToggle> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LicenseOrgToggle>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Switch PureCloud license feature toggle value.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseOrgToggle> postLicenseToggle(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LicenseOrgToggle>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)exception;
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
      ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetch user licenses in a batch.
   * 
   * @param body The user IDs to fetch. (optional)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> postLicenseUsers(List<String> body) throws IOException, ApiException {
    return  postLicenseUsers(createPostLicenseUsersRequest(body));
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @param body The user IDs to fetch. (optional)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> postLicenseUsersWithHttpInfo(List<String> body) throws IOException {
    return postLicenseUsers(createPostLicenseUsersRequest(body).withHttpInfo());
  }

  private PostLicenseUsersRequest createPostLicenseUsersRequest(List<String> body) {
    return PostLicenseUsersRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> postLicenseUsers(PostLicenseUsersRequest request) throws IOException, ApiException {
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
   * Fetch user licenses in a batch.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> postLicenseUsers(ApiRequest<List<String>> request) throws IOException {
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

  
}
