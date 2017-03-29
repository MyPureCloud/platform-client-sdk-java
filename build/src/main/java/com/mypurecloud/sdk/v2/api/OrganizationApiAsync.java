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
import java.util.concurrent.Future;


public class OrganizationApiAsync {
  private final ApiClient pcapiClient;

  public OrganizationApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FieldConfig> getFieldconfigAsync(GetFieldconfigRequest request, AsyncApiCallback<FieldConfig> callback) throws ApiException {
    return pcapiClient.<FieldConfig>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FieldConfig>() {}, callback);
  }

  /**
   * Fetch field config for an entity type
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FieldConfig>> getFieldconfigAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FieldConfig>> callback) throws ApiException {
    return pcapiClient.<FieldConfig>invokeAPIVerboseAsync(request, new TypeReference<FieldConfig>() {}, callback);
  }

  /**
   * Get organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Organization> getOrganizationsMeAsync(GetOrganizationsMeRequest request, AsyncApiCallback<Organization> callback) throws ApiException {
    return pcapiClient.<Organization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, callback);
  }

  /**
   * Get organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Organization>> getOrganizationsMeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Organization>> callback) throws ApiException {
    return pcapiClient.<Organization>invokeAPIVerboseAsync(request, new TypeReference<Organization>() {}, callback);
  }

  /**
   * Update organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<OrganizationFeatures> patchOrganizationsFeatureAsync(PatchOrganizationsFeatureRequest request, AsyncApiCallback<OrganizationFeatures> callback) throws ApiException {
    return pcapiClient.<OrganizationFeatures>invokeAPIAsync(request.withHttpInfo(), new TypeReference<OrganizationFeatures>() {}, callback);
  }

  /**
   * Update organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<OrganizationFeatures>> patchOrganizationsFeatureAsync(ApiRequest<FeatureState> request, AsyncApiCallback<ApiResponse<OrganizationFeatures>> callback) throws ApiException {
    return pcapiClient.<OrganizationFeatures>invokeAPIVerboseAsync(request, new TypeReference<OrganizationFeatures>() {}, callback);
  }

  /**
   * Update organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Organization> putOrganizationsMeAsync(PutOrganizationsMeRequest request, AsyncApiCallback<Organization> callback) throws ApiException {
    return pcapiClient.<Organization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Organization>() {}, callback);
  }

  /**
   * Update organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Organization>> putOrganizationsMeAsync(ApiRequest<Organization> request, AsyncApiCallback<ApiResponse<Organization>> callback) throws ApiException {
    return pcapiClient.<Organization>invokeAPIVerboseAsync(request, new TypeReference<Organization>() {}, callback);
  }

}
