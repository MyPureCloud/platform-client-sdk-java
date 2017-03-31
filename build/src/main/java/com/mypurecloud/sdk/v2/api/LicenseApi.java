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
   * @throws ApiException if fails to make API call
   */
  public LicenseDefinition getLicenseDefinition(String licenseId) throws IOException, ApiException {
    return getLicenseDefinitionWithHttpInfo(licenseId).getBody();
  }

  /**
   * Get PureCloud license definition.
   * 
   * @param licenseId ID (required)
   * @return LicenseDefinition
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseDefinition> getLicenseDefinitionWithHttpInfo(String licenseId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'licenseId' is set
    if (licenseId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'licenseId' when calling getLicenseDefinition");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/license/definitions/{licenseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "licenseId" + "\\}", pcapiClient.escapeString(licenseId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LicenseDefinition>() {});
  }

  /**
   * Get PureCloud license definition.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LicenseDefinition getLicenseDefinition(GetLicenseDefinitionRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LicenseDefinition>() {});
  }

  /**
   * Get PureCloud license definition.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseDefinition> getLicenseDefinition(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LicenseDefinition>invokeAPIVerbose(request, new TypeReference<LicenseDefinition>() {});
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @return LicenseDefinitionListing
   * @throws ApiException if fails to make API call
   */
  public LicenseDefinitionListing getLicenseDefinitions() throws IOException, ApiException {
    return getLicenseDefinitionsWithHttpInfo().getBody();
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @return LicenseDefinitionListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseDefinitionListing> getLicenseDefinitionsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/license/definitions".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LicenseDefinitionListing>() {});
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LicenseDefinitionListing getLicenseDefinitions(GetLicenseDefinitionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LicenseDefinitionListing>() {});
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseDefinitionListing> getLicenseDefinitions(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LicenseDefinitionListing>invokeAPIVerbose(request, new TypeReference<LicenseDefinitionListing>() {});
  }

  /**
   * Get license assignments for the organization.
   * 
   * @return LicenseOrganization
   * @throws ApiException if fails to make API call
   */
  public LicenseOrganization getLicenseOrganization() throws IOException, ApiException {
    return getLicenseOrganizationWithHttpInfo().getBody();
  }

  /**
   * Get license assignments for the organization.
   * 
   * @return LicenseOrganization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseOrganization> getLicenseOrganizationWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/license/organization".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LicenseOrganization>() {});
  }

  /**
   * Get license assignments for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LicenseOrganization getLicenseOrganization(GetLicenseOrganizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LicenseOrganization>() {});
  }

  /**
   * Get license assignments for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseOrganization> getLicenseOrganization(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LicenseOrganization>invokeAPIVerbose(request, new TypeReference<LicenseOrganization>() {});
  }

  /**
   * Get licenses for specified user.
   * 
   * @param userId ID (required)
   * @return LicenseUser
   * @throws ApiException if fails to make API call
   */
  public LicenseUser getLicenseUser(String userId) throws IOException, ApiException {
    return getLicenseUserWithHttpInfo(userId).getBody();
  }

  /**
   * Get licenses for specified user.
   * 
   * @param userId ID (required)
   * @return LicenseUser
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseUser> getLicenseUserWithHttpInfo(String userId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling getLicenseUser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/license/users/{userId}".replaceAll("\\{format\\}","json")
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LicenseUser>() {});
  }

  /**
   * Get licenses for specified user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LicenseUser getLicenseUser(GetLicenseUserRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LicenseUser>() {});
  }

  /**
   * Get licenses for specified user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseUser> getLicenseUser(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LicenseUser>invokeAPIVerbose(request, new TypeReference<LicenseUser>() {});
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param body The license assignments to update. (optional)
   * @return LicenseUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public LicenseUpdateResponse postLicenseOrganization(LicenseBatchAssignmentRequest body) throws IOException, ApiException {
    return postLicenseOrganizationWithHttpInfo(body).getBody();
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param body The license assignments to update. (optional)
   * @return LicenseUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseUpdateResponse> postLicenseOrganizationWithHttpInfo(LicenseBatchAssignmentRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/license/organization".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LicenseUpdateResponse>() {});
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LicenseUpdateResponse postLicenseOrganization(PostLicenseOrganizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LicenseUpdateResponse>() {});
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LicenseUpdateResponse> postLicenseOrganization(ApiRequest<LicenseBatchAssignmentRequest> request) throws IOException, ApiException {
    return pcapiClient.<LicenseUpdateResponse>invokeAPIVerbose(request, new TypeReference<LicenseUpdateResponse>() {});
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @param body The user IDs to fetch. (optional)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> postLicenseUsers(List<String> body) throws IOException, ApiException {
    return postLicenseUsersWithHttpInfo(body).getBody();
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @param body The user IDs to fetch. (optional)
   * @return Map<String, Object>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> postLicenseUsersWithHttpInfo(List<String> body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/license/users".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> postLicenseUsers(PostLicenseUsersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> postLicenseUsers(ApiRequest<List<String>> request) throws IOException, ApiException {
    return pcapiClient.<Map<String, Object>>invokeAPIVerbose(request, new TypeReference<Map<String, Object>>() {});
  }

}
