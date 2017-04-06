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

import java.io.IOException;
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FieldConfig getFieldconfig(String type) throws IOException, ApiException {
    return  getFieldconfig(createGetFieldconfigRequest(type));
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param type Field type (required)
   * @return FieldConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FieldConfig> getFieldconfigWithHttpInfo(String type) throws IOException {
    return getFieldconfig(createGetFieldconfigRequest(type).withHttpInfo());
  }

  private GetFieldconfigRequest createGetFieldconfigRequest(String type) {
    return GetFieldconfigRequest.builder()
            .withType(type)
            .build();
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return FieldConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FieldConfig getFieldconfig(GetFieldconfigRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FieldConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FieldConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch field config for an entity type
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FieldConfig> getFieldconfig(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FieldConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<FieldConfig> response = (ApiResponse<FieldConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get organization.
   * 
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization getOrganizationsMe() throws IOException, ApiException {
    return  getOrganizationsMe(createGetOrganizationsMeRequest());
  }

  /**
   * Get organization.
   * 
   * @return Organization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> getOrganizationsMeWithHttpInfo() throws IOException {
    return getOrganizationsMe(createGetOrganizationsMeRequest().withHttpInfo());
  }

  private GetOrganizationsMeRequest createGetOrganizationsMeRequest() {
    return GetOrganizationsMeRequest.builder()            .build();
  }

  /**
   * Get organization.
   * 
   * @param request The request object
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization getOrganizationsMe(GetOrganizationsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Organization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Organization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> getOrganizationsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Organization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
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
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update organization
   * 
   * @param featureName Organization feature (required)
   * @param enabled New state of feature (required)
   * @return OrganizationFeatures
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationFeatures patchOrganizationsFeature(String featureName, FeatureState enabled) throws IOException, ApiException {
    return  patchOrganizationsFeature(createPatchOrganizationsFeatureRequest(featureName, enabled));
  }

  /**
   * Update organization
   * 
   * @param featureName Organization feature (required)
   * @param enabled New state of feature (required)
   * @return OrganizationFeatures
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationFeatures> patchOrganizationsFeatureWithHttpInfo(String featureName, FeatureState enabled) throws IOException {
    return patchOrganizationsFeature(createPatchOrganizationsFeatureRequest(featureName, enabled).withHttpInfo());
  }

  private PatchOrganizationsFeatureRequest createPatchOrganizationsFeatureRequest(String featureName, FeatureState enabled) {
    return PatchOrganizationsFeatureRequest.builder()
            .withFeatureName(featureName)

            .withEnabled(enabled)
            .build();
  }

  /**
   * Update organization
   * 
   * @param request The request object
   * @return OrganizationFeatures
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationFeatures patchOrganizationsFeature(PatchOrganizationsFeatureRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationFeatures> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationFeatures>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationFeatures> patchOrganizationsFeature(ApiRequest<FeatureState> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationFeatures>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationFeatures> response = (ApiResponse<OrganizationFeatures>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationFeatures> response = (ApiResponse<OrganizationFeatures>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update organization.
   * 
   * @param body Organization (optional)
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization putOrganizationsMe(Organization body) throws IOException, ApiException {
    return  putOrganizationsMe(createPutOrganizationsMeRequest(body));
  }

  /**
   * Update organization.
   * 
   * @param body Organization (optional)
   * @return Organization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> putOrganizationsMeWithHttpInfo(Organization body) throws IOException {
    return putOrganizationsMe(createPutOrganizationsMeRequest(body).withHttpInfo());
  }

  private PutOrganizationsMeRequest createPutOrganizationsMeRequest(Organization body) {
    return PutOrganizationsMeRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Update organization.
   * 
   * @param request The request object
   * @return Organization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Organization putOrganizationsMe(PutOrganizationsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Organization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Organization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Organization> putOrganizationsMe(ApiRequest<Organization> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Organization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)exception;
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
      ApiResponse<Organization> response = (ApiResponse<Organization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
