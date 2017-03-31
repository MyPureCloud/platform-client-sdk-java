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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;


import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectSystempromptResourceRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class ArchitectApiAsync {
  private final ApiClient pcapiClient;

  public ArchitectApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ArchitectApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteArchitectPromptAsync(DeleteArchitectPromptRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteArchitectPromptAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteArchitectPromptResourceAsync(DeleteArchitectPromptResourceRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteArchitectPromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Operation> deleteArchitectPromptsAsync(DeleteArchitectPromptsRequest request, AsyncApiCallback<Operation> callback) {
    return pcapiClient.<Operation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, callback);
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Operation>> deleteArchitectPromptsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Operation>> callback) {
    return pcapiClient.<Operation>invokeAPIVerboseAsync(request, new TypeReference<Operation>() {}, callback);
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteArchitectSystempromptResourceAsync(DeleteArchitectSystempromptResourceRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteArchitectSystempromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Get specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Prompt> getArchitectPromptAsync(GetArchitectPromptRequest request, AsyncApiCallback<Prompt> callback) {
    return pcapiClient.<Prompt>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, callback);
  }

  /**
   * Get specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Prompt>> getArchitectPromptAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Prompt>> callback) {
    return pcapiClient.<Prompt>invokeAPIVerboseAsync(request, new TypeReference<Prompt>() {}, callback);
  }

  /**
   * Get specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PromptAsset> getArchitectPromptResourceAsync(GetArchitectPromptResourceRequest request, AsyncApiCallback<PromptAsset> callback) {
    return pcapiClient.<PromptAsset>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, callback);
  }

  /**
   * Get specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PromptAsset>> getArchitectPromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    return pcapiClient.<PromptAsset>invokeAPIVerboseAsync(request, new TypeReference<PromptAsset>() {}, callback);
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PromptAssetEntityListing> getArchitectPromptResourcesAsync(GetArchitectPromptResourcesRequest request, AsyncApiCallback<PromptAssetEntityListing> callback) {
    return pcapiClient.<PromptAssetEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PromptAssetEntityListing>() {}, callback);
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PromptAssetEntityListing>> getArchitectPromptResourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PromptAssetEntityListing>> callback) {
    return pcapiClient.<PromptAssetEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PromptAssetEntityListing>() {}, callback);
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PromptEntityListing> getArchitectPromptsAsync(GetArchitectPromptsRequest request, AsyncApiCallback<PromptEntityListing> callback) {
    return pcapiClient.<PromptEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PromptEntityListing>() {}, callback);
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PromptEntityListing>> getArchitectPromptsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PromptEntityListing>> callback) {
    return pcapiClient.<PromptEntityListing>invokeAPIVerboseAsync(request, new TypeReference<PromptEntityListing>() {}, callback);
  }

  /**
   * Get a system prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SystemPrompt> getArchitectSystempromptAsync(GetArchitectSystempromptRequest request, AsyncApiCallback<SystemPrompt> callback) {
    return pcapiClient.<SystemPrompt>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SystemPrompt>() {}, callback);
  }

  /**
   * Get a system prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SystemPrompt>> getArchitectSystempromptAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPrompt>> callback) {
    return pcapiClient.<SystemPrompt>invokeAPIVerboseAsync(request, new TypeReference<SystemPrompt>() {}, callback);
  }

  /**
   * Get a system prompt resource.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SystemPromptAsset> getArchitectSystempromptResourceAsync(GetArchitectSystempromptResourceRequest request, AsyncApiCallback<SystemPromptAsset> callback) {
    return pcapiClient.<SystemPromptAsset>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, callback);
  }

  /**
   * Get a system prompt resource.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SystemPromptAsset>> getArchitectSystempromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerboseAsync(request, new TypeReference<SystemPromptAsset>() {}, callback);
  }

  /**
   * Get IVR System Prompt resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SystemPromptAssetEntityListing> getArchitectSystempromptResourcesAsync(GetArchitectSystempromptResourcesRequest request, AsyncApiCallback<SystemPromptAssetEntityListing> callback) {
    return pcapiClient.<SystemPromptAssetEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SystemPromptAssetEntityListing>() {}, callback);
  }

  /**
   * Get IVR System Prompt resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SystemPromptAssetEntityListing>> getArchitectSystempromptResourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPromptAssetEntityListing>> callback) {
    return pcapiClient.<SystemPromptAssetEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SystemPromptAssetEntityListing>() {}, callback);
  }

  /**
   * Get System Prompts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SystemPromptEntityListing> getArchitectSystempromptsAsync(GetArchitectSystempromptsRequest request, AsyncApiCallback<SystemPromptEntityListing> callback) {
    return pcapiClient.<SystemPromptEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SystemPromptEntityListing>() {}, callback);
  }

  /**
   * Get System Prompts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SystemPromptEntityListing>> getArchitectSystempromptsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPromptEntityListing>> callback) {
    return pcapiClient.<SystemPromptEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SystemPromptEntityListing>() {}, callback);
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FlowEntityListing> getFlowsAsync(GetFlowsRequest request, AsyncApiCallback<FlowEntityListing> callback) {
    return pcapiClient.<FlowEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FlowEntityListing>() {}, callback);
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FlowEntityListing>> getFlowsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FlowEntityListing>> callback) {
    return pcapiClient.<FlowEntityListing>invokeAPIVerboseAsync(request, new TypeReference<FlowEntityListing>() {}, callback);
  }

  /**
   * Create a new user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PromptAsset> postArchitectPromptResourcesAsync(PostArchitectPromptResourcesRequest request, AsyncApiCallback<PromptAsset> callback) {
    return pcapiClient.<PromptAsset>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, callback);
  }

  /**
   * Create a new user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PromptAsset>> postArchitectPromptResourcesAsync(ApiRequest<PromptAssetCreate> request, AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    return pcapiClient.<PromptAsset>invokeAPIVerboseAsync(request, new TypeReference<PromptAsset>() {}, callback);
  }

  /**
   * Create a new user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Prompt> postArchitectPromptsAsync(PostArchitectPromptsRequest request, AsyncApiCallback<Prompt> callback) {
    return pcapiClient.<Prompt>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, callback);
  }

  /**
   * Create a new user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Prompt>> postArchitectPromptsAsync(ApiRequest<Prompt> request, AsyncApiCallback<ApiResponse<Prompt>> callback) {
    return pcapiClient.<Prompt>invokeAPIVerboseAsync(request, new TypeReference<Prompt>() {}, callback);
  }

  /**
   * Create system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SystemPromptAsset> postArchitectSystempromptResourcesAsync(PostArchitectSystempromptResourcesRequest request, AsyncApiCallback<SystemPromptAsset> callback) {
    return pcapiClient.<SystemPromptAsset>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, callback);
  }

  /**
   * Create system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SystemPromptAsset>> postArchitectSystempromptResourcesAsync(ApiRequest<SystemPromptAsset> request, AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerboseAsync(request, new TypeReference<SystemPromptAsset>() {}, callback);
  }

  /**
   * Update specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Prompt> putArchitectPromptAsync(PutArchitectPromptRequest request, AsyncApiCallback<Prompt> callback) {
    return pcapiClient.<Prompt>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, callback);
  }

  /**
   * Update specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Prompt>> putArchitectPromptAsync(ApiRequest<Prompt> request, AsyncApiCallback<ApiResponse<Prompt>> callback) {
    return pcapiClient.<Prompt>invokeAPIVerboseAsync(request, new TypeReference<Prompt>() {}, callback);
  }

  /**
   * Update specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PromptAsset> putArchitectPromptResourceAsync(PutArchitectPromptResourceRequest request, AsyncApiCallback<PromptAsset> callback) {
    return pcapiClient.<PromptAsset>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, callback);
  }

  /**
   * Update specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PromptAsset>> putArchitectPromptResourceAsync(ApiRequest<PromptAsset> request, AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    return pcapiClient.<PromptAsset>invokeAPIVerboseAsync(request, new TypeReference<PromptAsset>() {}, callback);
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SystemPromptAsset> putArchitectSystempromptResourceAsync(PutArchitectSystempromptResourceRequest request, AsyncApiCallback<SystemPromptAsset> callback) {
    return pcapiClient.<SystemPromptAsset>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, callback);
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SystemPromptAsset>> putArchitectSystempromptResourceAsync(ApiRequest<SystemPromptAsset> request, AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerboseAsync(request, new TypeReference<SystemPromptAsset>() {}, callback);
  }

}
