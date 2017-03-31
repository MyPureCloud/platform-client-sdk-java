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
import com.mypurecloud.sdk.v2.model.Attribute;
import com.mypurecloud.sdk.v2.model.AttributeEntityListing;
import com.mypurecloud.sdk.v2.model.AttributeQueryRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteAttributeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAttributeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAttributesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAttributesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutAttributeRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class AttributesApiAsync {
  private final ApiClient pcapiClient;

  public AttributesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AttributesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteAttributeAsync(DeleteAttributeRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an existing Attribute.
   * This will remove attribute.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteAttributeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get details about an existing attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Attribute> getAttributeAsync(GetAttributeRequest request, AsyncApiCallback<Attribute> callback) {
    return pcapiClient.<Attribute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Attribute>() {}, callback);
  }

  /**
   * Get details about an existing attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Attribute>> getAttributeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Attribute>> callback) {
    return pcapiClient.<Attribute>invokeAPIVerboseAsync(request, new TypeReference<Attribute>() {}, callback);
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AttributeEntityListing> getAttributesAsync(GetAttributesRequest request, AsyncApiCallback<AttributeEntityListing> callback) {
    return pcapiClient.<AttributeEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AttributeEntityListing>() {}, callback);
  }

  /**
   * Gets a list of existing attributes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AttributeEntityListing>> getAttributesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AttributeEntityListing>> callback) {
    return pcapiClient.<AttributeEntityListing>invokeAPIVerboseAsync(request, new TypeReference<AttributeEntityListing>() {}, callback);
  }

  /**
   * Create an attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Attribute> postAttributesAsync(PostAttributesRequest request, AsyncApiCallback<Attribute> callback) {
    return pcapiClient.<Attribute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Attribute>() {}, callback);
  }

  /**
   * Create an attribute.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Attribute>> postAttributesAsync(ApiRequest<Attribute> request, AsyncApiCallback<ApiResponse<Attribute>> callback) {
    return pcapiClient.<Attribute>invokeAPIVerboseAsync(request, new TypeReference<Attribute>() {}, callback);
  }

  /**
   * Query attributes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AttributeEntityListing> postAttributesQueryAsync(PostAttributesQueryRequest request, AsyncApiCallback<AttributeEntityListing> callback) {
    return pcapiClient.<AttributeEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AttributeEntityListing>() {}, callback);
  }

  /**
   * Query attributes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AttributeEntityListing>> postAttributesQueryAsync(ApiRequest<AttributeQueryRequest> request, AsyncApiCallback<ApiResponse<AttributeEntityListing>> callback) {
    return pcapiClient.<AttributeEntityListing>invokeAPIVerboseAsync(request, new TypeReference<AttributeEntityListing>() {}, callback);
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Attribute> putAttributeAsync(PutAttributeRequest request, AsyncApiCallback<Attribute> callback) {
    return pcapiClient.<Attribute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Attribute>() {}, callback);
  }

  /**
   * Update an existing attribute.
   * Fields that can be updated: name, description. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Attribute>> putAttributeAsync(ApiRequest<Attribute> request, AsyncApiCallback<ApiResponse<Attribute>> callback) {
    return pcapiClient.<Attribute>invokeAPIVerboseAsync(request, new TypeReference<Attribute>() {}, callback);
  }

}
