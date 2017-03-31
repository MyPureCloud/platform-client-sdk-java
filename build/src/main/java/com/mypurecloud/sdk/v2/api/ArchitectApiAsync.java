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
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;


import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingBuildRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingConsumedresourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingConsumingresourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingDeletedresourceconsumersRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingObjectRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingTypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingUpdatedresourceconsumersRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowLatestconfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionConfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectDependencytrackingBuildRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsCheckinRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsCheckoutRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsDeactivateRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsRevertRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsUnlockRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowRequest;

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
   * Delete flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteFlowAsync(DeleteFlowRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteFlowAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Operation> deleteFlowsAsync(DeleteFlowsRequest request, AsyncApiCallback<Operation> callback) {
    return pcapiClient.<Operation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, callback);
  }

  /**
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Operation>> deleteFlowsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Operation>> callback) {
    return pcapiClient.<Operation>invokeAPIVerboseAsync(request, new TypeReference<Operation>() {}, callback);
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingAsync(GetArchitectDependencytrackingRequest request, AsyncApiCallback<DependencyObjectEntityListing> callback) {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, callback);
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, callback);
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DependencyStatus> getArchitectDependencytrackingBuildAsync(GetArchitectDependencytrackingBuildRequest request, AsyncApiCallback<DependencyStatus> callback) {
    return pcapiClient.<DependencyStatus>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DependencyStatus>() {}, callback);
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DependencyStatus>> getArchitectDependencytrackingBuildAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyStatus>> callback) {
    return pcapiClient.<DependencyStatus>invokeAPIVerboseAsync(request, new TypeReference<DependencyStatus>() {}, callback);
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ConsumedResourcesEntityListing> getArchitectDependencytrackingConsumedresourcesAsync(GetArchitectDependencytrackingConsumedresourcesRequest request, AsyncApiCallback<ConsumedResourcesEntityListing> callback) {
    return pcapiClient.<ConsumedResourcesEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ConsumedResourcesEntityListing>() {}, callback);
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ConsumedResourcesEntityListing>> getArchitectDependencytrackingConsumedresourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ConsumedResourcesEntityListing>> callback) {
    return pcapiClient.<ConsumedResourcesEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ConsumedResourcesEntityListing>() {}, callback);
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ConsumingResourcesEntityListing> getArchitectDependencytrackingConsumingresourcesAsync(GetArchitectDependencytrackingConsumingresourcesRequest request, AsyncApiCallback<ConsumingResourcesEntityListing> callback) {
    return pcapiClient.<ConsumingResourcesEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ConsumingResourcesEntityListing>() {}, callback);
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ConsumingResourcesEntityListing>> getArchitectDependencytrackingConsumingresourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ConsumingResourcesEntityListing>> callback) {
    return pcapiClient.<ConsumingResourcesEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ConsumingResourcesEntityListing>() {}, callback);
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingDeletedresourceconsumersAsync(GetArchitectDependencytrackingDeletedresourceconsumersRequest request, AsyncApiCallback<DependencyObjectEntityListing> callback) {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, callback);
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingDeletedresourceconsumersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, callback);
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DependencyObject> getArchitectDependencytrackingObjectAsync(GetArchitectDependencytrackingObjectRequest request, AsyncApiCallback<DependencyObject> callback) {
    return pcapiClient.<DependencyObject>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DependencyObject>() {}, callback);
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DependencyObject>> getArchitectDependencytrackingObjectAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObject>> callback) {
    return pcapiClient.<DependencyObject>invokeAPIVerboseAsync(request, new TypeReference<DependencyObject>() {}, callback);
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DependencyType> getArchitectDependencytrackingTypeAsync(GetArchitectDependencytrackingTypeRequest request, AsyncApiCallback<DependencyType> callback) {
    return pcapiClient.<DependencyType>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DependencyType>() {}, callback);
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DependencyType>> getArchitectDependencytrackingTypeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyType>> callback) {
    return pcapiClient.<DependencyType>invokeAPIVerboseAsync(request, new TypeReference<DependencyType>() {}, callback);
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DependencyTypeEntityListing> getArchitectDependencytrackingTypesAsync(GetArchitectDependencytrackingTypesRequest request, AsyncApiCallback<DependencyTypeEntityListing> callback) {
    return pcapiClient.<DependencyTypeEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DependencyTypeEntityListing>() {}, callback);
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DependencyTypeEntityListing>> getArchitectDependencytrackingTypesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyTypeEntityListing>> callback) {
    return pcapiClient.<DependencyTypeEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DependencyTypeEntityListing>() {}, callback);
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingUpdatedresourceconsumersAsync(GetArchitectDependencytrackingUpdatedresourceconsumersRequest request, AsyncApiCallback<DependencyObjectEntityListing> callback) {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, callback);
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingUpdatedresourceconsumersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, callback);
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
   * Get system prompt resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SystemPromptAssetEntityListing> getArchitectSystempromptResourcesAsync(GetArchitectSystempromptResourcesRequest request, AsyncApiCallback<SystemPromptAssetEntityListing> callback) {
    return pcapiClient.<SystemPromptAssetEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SystemPromptAssetEntityListing>() {}, callback);
  }

  /**
   * Get system prompt resources.
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
   * Get flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> getFlowAsync(GetFlowRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Get flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> getFlowAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
  }

  /**
   * Get the latest configuration for flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Object> getFlowLatestconfigurationAsync(GetFlowLatestconfigurationRequest request, AsyncApiCallback<Object> callback) {
    return pcapiClient.<Object>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Object>() {}, callback);
  }

  /**
   * Get the latest configuration for flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Object>> getFlowLatestconfigurationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Object>> callback) {
    return pcapiClient.<Object>invokeAPIVerboseAsync(request, new TypeReference<Object>() {}, callback);
  }

  /**
   * Get flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FlowVersion> getFlowVersionAsync(GetFlowVersionRequest request, AsyncApiCallback<FlowVersion> callback) {
    return pcapiClient.<FlowVersion>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FlowVersion>() {}, callback);
  }

  /**
   * Get flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FlowVersion>> getFlowVersionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FlowVersion>> callback) {
    return pcapiClient.<FlowVersion>invokeAPIVerboseAsync(request, new TypeReference<FlowVersion>() {}, callback);
  }

  /**
   * Create flow version configuration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Object> getFlowVersionConfigurationAsync(GetFlowVersionConfigurationRequest request, AsyncApiCallback<Object> callback) {
    return pcapiClient.<Object>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Object>() {}, callback);
  }

  /**
   * Create flow version configuration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Object>> getFlowVersionConfigurationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Object>> callback) {
    return pcapiClient.<Object>invokeAPIVerboseAsync(request, new TypeReference<Object>() {}, callback);
  }

  /**
   * Get flow version list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FlowVersionEntityListing> getFlowVersionsAsync(GetFlowVersionsRequest request, AsyncApiCallback<FlowVersionEntityListing> callback) {
    return pcapiClient.<FlowVersionEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FlowVersionEntityListing>() {}, callback);
  }

  /**
   * Get flow version list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FlowVersionEntityListing>> getFlowVersionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FlowVersionEntityListing>> callback) {
    return pcapiClient.<FlowVersionEntityListing>invokeAPIVerboseAsync(request, new TypeReference<FlowVersionEntityListing>() {}, callback);
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
   * Rebuild Dependency Tracking data for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postArchitectDependencytrackingBuildAsync(PostArchitectDependencytrackingBuildRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postArchitectDependencytrackingBuildAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
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
   * Create flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FlowVersion> postFlowVersionsAsync(PostFlowVersionsRequest request, AsyncApiCallback<FlowVersion> callback) {
    return pcapiClient.<FlowVersion>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FlowVersion>() {}, callback);
  }

  /**
   * Create flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FlowVersion>> postFlowVersionsAsync(ApiRequest<Object> request, AsyncApiCallback<ApiResponse<FlowVersion>> callback) {
    return pcapiClient.<FlowVersion>invokeAPIVerboseAsync(request, new TypeReference<FlowVersion>() {}, callback);
  }

  /**
   * Create flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> postFlowsAsync(PostFlowsRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Create flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> postFlowsAsync(ApiRequest<Flow> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
  }

  /**
   * Check-in flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> postFlowsActionsCheckinAsync(PostFlowsActionsCheckinRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Check-in flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> postFlowsActionsCheckinAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
  }

  /**
   * Check-out flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> postFlowsActionsCheckoutAsync(PostFlowsActionsCheckoutRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Check-out flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> postFlowsActionsCheckoutAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
  }

  /**
   * Deactivate flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> postFlowsActionsDeactivateAsync(PostFlowsActionsDeactivateRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Deactivate flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> postFlowsActionsDeactivateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
  }

  /**
   * Publish flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Operation> postFlowsActionsPublishAsync(PostFlowsActionsPublishRequest request, AsyncApiCallback<Operation> callback) {
    return pcapiClient.<Operation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, callback);
  }

  /**
   * Publish flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Operation>> postFlowsActionsPublishAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Operation>> callback) {
    return pcapiClient.<Operation>invokeAPIVerboseAsync(request, new TypeReference<Operation>() {}, callback);
  }

  /**
   * Revert flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> postFlowsActionsRevertAsync(PostFlowsActionsRevertRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Revert flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> postFlowsActionsRevertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> postFlowsActionsUnlockAsync(PostFlowsActionsUnlockRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> postFlowsActionsUnlockAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
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

  /**
   * Update flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Flow> putFlowAsync(PutFlowRequest request, AsyncApiCallback<Flow> callback) {
    return pcapiClient.<Flow>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, callback);
  }

  /**
   * Update flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Flow>> putFlowAsync(ApiRequest<Flow> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    return pcapiClient.<Flow>invokeAPIVerboseAsync(request, new TypeReference<Flow>() {}, callback);
  }

}
