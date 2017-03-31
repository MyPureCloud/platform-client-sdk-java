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
import java.util.concurrent.Future;


public class LicenseApiAsync {
  private final ApiClient pcapiClient;

  public LicenseApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LicenseApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get PureCloud license definition.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LicenseDefinition> getLicenseDefinitionAsync(GetLicenseDefinitionRequest request, AsyncApiCallback<LicenseDefinition> callback) {
    return pcapiClient.<LicenseDefinition>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LicenseDefinition>() {}, callback);
  }

  /**
   * Get PureCloud license definition.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LicenseDefinition>> getLicenseDefinitionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LicenseDefinition>> callback) {
    return pcapiClient.<LicenseDefinition>invokeAPIVerboseAsync(request, new TypeReference<LicenseDefinition>() {}, callback);
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LicenseDefinitionListing> getLicenseDefinitionsAsync(GetLicenseDefinitionsRequest request, AsyncApiCallback<LicenseDefinitionListing> callback) {
    return pcapiClient.<LicenseDefinitionListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LicenseDefinitionListing>() {}, callback);
  }

  /**
   * Get all PureCloud license definitions available for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LicenseDefinitionListing>> getLicenseDefinitionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LicenseDefinitionListing>> callback) {
    return pcapiClient.<LicenseDefinitionListing>invokeAPIVerboseAsync(request, new TypeReference<LicenseDefinitionListing>() {}, callback);
  }

  /**
   * Get license assignments for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LicenseOrganization> getLicenseOrganizationAsync(GetLicenseOrganizationRequest request, AsyncApiCallback<LicenseOrganization> callback) {
    return pcapiClient.<LicenseOrganization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LicenseOrganization>() {}, callback);
  }

  /**
   * Get license assignments for the organization.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LicenseOrganization>> getLicenseOrganizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LicenseOrganization>> callback) {
    return pcapiClient.<LicenseOrganization>invokeAPIVerboseAsync(request, new TypeReference<LicenseOrganization>() {}, callback);
  }

  /**
   * Get licenses for specified user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LicenseUser> getLicenseUserAsync(GetLicenseUserRequest request, AsyncApiCallback<LicenseUser> callback) {
    return pcapiClient.<LicenseUser>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LicenseUser>() {}, callback);
  }

  /**
   * Get licenses for specified user.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LicenseUser>> getLicenseUserAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LicenseUser>> callback) {
    return pcapiClient.<LicenseUser>invokeAPIVerboseAsync(request, new TypeReference<LicenseUser>() {}, callback);
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LicenseUpdateResponse> postLicenseOrganizationAsync(PostLicenseOrganizationRequest request, AsyncApiCallback<LicenseUpdateResponse> callback) {
    return pcapiClient.<LicenseUpdateResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LicenseUpdateResponse>() {}, callback);
  }

  /**
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LicenseUpdateResponse>> postLicenseOrganizationAsync(ApiRequest<LicenseBatchAssignmentRequest> request, AsyncApiCallback<ApiResponse<LicenseUpdateResponse>> callback) {
    return pcapiClient.<LicenseUpdateResponse>invokeAPIVerboseAsync(request, new TypeReference<LicenseUpdateResponse>() {}, callback);
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Map<String, Object>> postLicenseUsersAsync(PostLicenseUsersRequest request, AsyncApiCallback<Map<String, Object>> callback) {
    return pcapiClient.<Map<String, Object>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, callback);
  }

  /**
   * Fetch user licenses in a batch.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Map<String, Object>>> postLicenseUsersAsync(ApiRequest<List<String>> request, AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) {
    return pcapiClient.<Map<String, Object>>invokeAPIVerboseAsync(request, new TypeReference<Map<String, Object>>() {}, callback);
  }

}
