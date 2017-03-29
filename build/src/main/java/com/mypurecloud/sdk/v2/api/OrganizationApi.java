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
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;
import com.mypurecloud.sdk.v2.model.FeatureState;


import com.mypurecloud.sdk.v2.api.request.GetFieldconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrganizationsMeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOrganizationsFeatureRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrganizationsMeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrganizationApi {
  private final ApiClient pcapiClient;

  public OrganizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if fails to make API call
   */
  public FieldConfig getFieldconfig(String type) throws ApiException {
    return getFieldconfigWithHttpInfo(type).getBody();
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldConfig> getFieldconfigWithHttpInfo(String type) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getFieldconfig");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fieldconfig".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "type", type));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FieldConfig>() {});
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FieldConfig getFieldconfig(GetFieldconfigRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FieldConfig>() {});
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FieldConfig> getFieldconfig(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<FieldConfig>invokeAPIVerbose(request, new TypeReference<FieldConfig>() {});
  }

  /**
   * Get organization.
   * 
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public Organization getOrganizationsMe() throws ApiException {
    return getOrganizationsMeWithHttpInfo().getBody();
  }

  /**
   * Get organization.
   * 
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> getOrganizationsMeWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/organizations/me".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Organization>() {});
  }

  /**
   * Get organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Organization getOrganizationsMe(GetOrganizationsMeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Organization>() {});
  }

  /**
   * Get organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> getOrganizationsMe(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Organization>invokeAPIVerbose(request, new TypeReference<Organization>() {});
  }

  /**
   * Update organization
   * 
   * @param featureName Organization feature (required)
   * @param enabled New state of feature (required)
   * @return OrganizationFeatures
   * @throws ApiException if fails to make API call
   */
  public OrganizationFeatures patchOrganizationsFeature(String featureName, FeatureState enabled) throws ApiException {
    return patchOrganizationsFeatureWithHttpInfo(featureName, enabled).getBody();
  }

  /**
   * Update organization
   * 
   * @param featureName Organization feature (required)
   * @param enabled New state of feature (required)
   * @return OrganizationFeatures
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationFeatures> patchOrganizationsFeatureWithHttpInfo(String featureName, FeatureState enabled) throws ApiException {
    Object pclocalVarPostBody = enabled;
    
    // verify the required parameter 'featureName' is set
    if (featureName == null) {
      throw new ApiException(400, "Missing the required parameter 'featureName' when calling patchOrganizationsFeature");
    }
    
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new ApiException(400, "Missing the required parameter 'enabled' when calling patchOrganizationsFeature");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/organizations/features/{featureName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "featureName" + "\\}", pcapiClient.escapeString(featureName.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OrganizationFeatures>() {});
  }

  /**
   * Update organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OrganizationFeatures patchOrganizationsFeature(PatchOrganizationsFeatureRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OrganizationFeatures>() {});
  }

  /**
   * Update organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationFeatures> patchOrganizationsFeature(ApiRequest<FeatureState> request) throws ApiException {
    return pcapiClient.<OrganizationFeatures>invokeAPIVerbose(request, new TypeReference<OrganizationFeatures>() {});
  }

  /**
   * Update organization.
   * 
   * @param body Organization (optional)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public Organization putOrganizationsMe(Organization body) throws ApiException {
    return putOrganizationsMeWithHttpInfo(body).getBody();
  }

  /**
   * Update organization.
   * 
   * @param body Organization (optional)
   * @return Organization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> putOrganizationsMeWithHttpInfo(Organization body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/organizations/me".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Organization>() {});
  }

  /**
   * Update organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Organization putOrganizationsMe(PutOrganizationsMeRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Organization>() {});
  }

  /**
   * Update organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Organization> putOrganizationsMe(ApiRequest<Organization> request) throws ApiException {
    return pcapiClient.<Organization>invokeAPIVerbose(request, new TypeReference<Organization>() {});
  }

}
