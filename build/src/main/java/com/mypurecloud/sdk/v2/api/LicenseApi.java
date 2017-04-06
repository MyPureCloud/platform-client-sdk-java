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
import com.mypurecloud.sdk.v2.model.LicenseDefinitionListing;
import com.mypurecloud.sdk.v2.model.LicenseOrganization;
import com.mypurecloud.sdk.v2.model.LicenseUser;
import com.mypurecloud.sdk.v2.model.LicenseBatchAssignmentRequest;
import com.mypurecloud.sdk.v2.model.LicenseUpdateResponse;


import com.mypurecloud.sdk.v2.api.request.GetLicenseDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseDefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseUserRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseOrganizationRequest;
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
   * @return LicenseDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseDefinitionListing getLicenseDefinitions() throws IOException, ApiException {
    return  getLicenseDefinitions(createGetLicenseDefinitionsRequest());
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @return LicenseDefinitionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseDefinitionListing> getLicenseDefinitionsWithHttpInfo() throws IOException {
    return getLicenseDefinitions(createGetLicenseDefinitionsRequest().withHttpInfo());
  }

  private GetLicenseDefinitionsRequest createGetLicenseDefinitionsRequest() {
    return GetLicenseDefinitionsRequest.builder()            .build();
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @param request The request object
   * @return LicenseDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseDefinitionListing getLicenseDefinitions(GetLicenseDefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LicenseDefinitionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LicenseDefinitionListing>() {});
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
  public ApiResponse<LicenseDefinitionListing> getLicenseDefinitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LicenseDefinitionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LicenseDefinitionListing> response = (ApiResponse<LicenseDefinitionListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LicenseDefinitionListing> response = (ApiResponse<LicenseDefinitionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get license assignments for the organization.
   * 
   * @return LicenseOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseOrganization getLicenseOrganization() throws IOException, ApiException {
    return  getLicenseOrganization(createGetLicenseOrganizationRequest());
  }

  /**
   * Get license assignments for the organization.
   * 
   * @return LicenseOrganization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseOrganization> getLicenseOrganizationWithHttpInfo() throws IOException {
    return getLicenseOrganization(createGetLicenseOrganizationRequest().withHttpInfo());
  }

  private GetLicenseOrganizationRequest createGetLicenseOrganizationRequest() {
    return GetLicenseOrganizationRequest.builder()            .build();
  }

  /**
   * Get license assignments for the organization.
   * 
   * @param request The request object
   * @return LicenseOrganization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseOrganization getLicenseOrganization(GetLicenseOrganizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LicenseOrganization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LicenseOrganization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get license assignments for the organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseOrganization> getLicenseOrganization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LicenseOrganization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LicenseOrganization> response = (ApiResponse<LicenseOrganization>)(ApiResponse<?>)exception;
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
      ApiResponse<LicenseOrganization> response = (ApiResponse<LicenseOrganization>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param body The license assignments to update. (optional)
   * @return LicenseUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseUpdateResponse postLicenseOrganization(LicenseBatchAssignmentRequest body) throws IOException, ApiException {
    return  postLicenseOrganization(createPostLicenseOrganizationRequest(body));
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param body The license assignments to update. (optional)
   * @return LicenseUpdateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LicenseUpdateResponse> postLicenseOrganizationWithHttpInfo(LicenseBatchAssignmentRequest body) throws IOException {
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
   * @return LicenseUpdateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LicenseUpdateResponse postLicenseOrganization(PostLicenseOrganizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LicenseUpdateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LicenseUpdateResponse>() {});
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
  public ApiResponse<LicenseUpdateResponse> postLicenseOrganization(ApiRequest<LicenseBatchAssignmentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LicenseUpdateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LicenseUpdateResponse> response = (ApiResponse<LicenseUpdateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LicenseUpdateResponse> response = (ApiResponse<LicenseUpdateResponse>)(ApiResponse<?>)(new ApiException(exception));
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
