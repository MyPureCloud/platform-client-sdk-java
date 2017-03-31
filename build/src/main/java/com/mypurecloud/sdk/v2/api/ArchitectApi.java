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


public class ArchitectApi {
  private final ApiClient pcapiClient;

  public ArchitectApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ArchitectApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param allResources Whether or not to delete all the prompt resources (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteArchitectPrompt(String promptId, Boolean allResources) throws IOException, ApiException {
    deleteArchitectPromptWithHttpInfo(promptId, allResources);
  }

  /**
   * Delete specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param allResources Whether or not to delete all the prompt resources (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPromptWithHttpInfo(String promptId, Boolean allResources) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling deleteArchitectPrompt");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "allResources", allResources));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteArchitectPrompt(DeleteArchitectPromptRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPrompt(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteArchitectPromptResource(String promptId, String languageCode) throws IOException, ApiException {
    deleteArchitectPromptResourceWithHttpInfo(promptId, languageCode);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling deleteArchitectPromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling deleteArchitectPromptResource");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}/resources/{languageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()))
      .replaceAll("\\{" + "languageCode" + "\\}", pcapiClient.escapeString(languageCode.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteArchitectPromptResource(DeleteArchitectPromptResourceRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPromptResource(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @param id List of Prompt IDs (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteArchitectPrompts(List<String> id) throws IOException, ApiException {
    return deleteArchitectPromptsWithHttpInfo(id).getBody();
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @param id List of Prompt IDs (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteArchitectPromptsWithHttpInfo(List<String> id) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling deleteArchitectPrompts");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "id", id));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Operation>() {});
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Operation deleteArchitectPrompts(DeleteArchitectPromptsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Operation>() {});
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteArchitectPrompts(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Operation>invokeAPIVerbose(request, new TypeReference<Operation>() {});
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteArchitectSystempromptResource(String promptId, String languageCode) throws IOException, ApiException {
    return deleteArchitectSystempromptResourceWithHttpInfo(promptId, languageCode).getBody();
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling deleteArchitectSystempromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling deleteArchitectSystempromptResource");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/systemprompts/{promptId}/resources/{languageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()))
      .replaceAll("\\{" + "languageCode" + "\\}", pcapiClient.escapeString(languageCode.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteArchitectSystempromptResource(DeleteArchitectSystempromptResourceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteArchitectSystempromptResource(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete flow
   * 
   * @param flowId Flow ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFlow(String flowId) throws IOException, ApiException {
    deleteFlowWithHttpInfo(flowId);
  }

  /**
   * Delete flow
   * 
   * @param flowId Flow ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteFlowWithHttpInfo(String flowId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling deleteFlow");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteFlow(DeleteFlowRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteFlow(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @param id List of Flow IDs (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteFlows(List<String> id) throws IOException, ApiException {
    return deleteFlowsWithHttpInfo(id).getBody();
  }

  /**
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @param id List of Flow IDs (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteFlowsWithHttpInfo(List<String> id) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling deleteFlows");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "id", id));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Operation>() {});
  }

  /**
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Operation deleteFlows(DeleteFlowsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Operation>() {});
  }

  /**
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteFlows(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Operation>invokeAPIVerbose(request, new TypeReference<Operation>() {});
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param name Object name to search for (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Include resources each result item consumes (optional)
   * @param consumingResources Include resources that consume each result item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @return DependencyObjectEntityListing
   * @throws ApiException if fails to make API call
   */
  public DependencyObjectEntityListing getArchitectDependencytracking(String name, Integer pageNumber, Integer pageSize, List<String> objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType) throws IOException, ApiException {
    return getArchitectDependencytrackingWithHttpInfo(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType).getBody();
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param name Object name to search for (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Include resources each result item consumes (optional)
   * @param consumingResources Include resources that consume each result item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @return DependencyObjectEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingWithHttpInfo(String name, Integer pageNumber, Integer pageSize, List<String> objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new IllegalArgumentException("Missing the required parameter 'name' when calling getArchitectDependencytracking");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "objectType", objectType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "consumedResources", consumedResources));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "consumingResources", consumingResources));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "consumedResourceType", consumedResourceType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "consumingResourceType", consumingResourceType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DependencyObjectEntityListing getArchitectDependencytracking(GetArchitectDependencytrackingRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytracking(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIVerbose(request, new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @return DependencyStatus
   * @throws ApiException if fails to make API call
   */
  public DependencyStatus getArchitectDependencytrackingBuild() throws IOException, ApiException {
    return getArchitectDependencytrackingBuildWithHttpInfo().getBody();
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @return DependencyStatus
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyStatus> getArchitectDependencytrackingBuildWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/build".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DependencyStatus>() {});
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DependencyStatus getArchitectDependencytrackingBuild(GetArchitectDependencytrackingBuildRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DependencyStatus>() {});
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyStatus> getArchitectDependencytrackingBuild(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DependencyStatus>invokeAPIVerbose(request, new TypeReference<DependencyStatus>() {});
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param id Consuming object ID (required)
   * @param version Consuming object version (required)
   * @param objectType Consuming object type (required)
   * @param resourceType Types of consumed resources to show (optional)
   * @return ConsumedResourcesEntityListing
   * @throws ApiException if fails to make API call
   */
  public ConsumedResourcesEntityListing getArchitectDependencytrackingConsumedresources(String id, String version, String objectType, List<String> resourceType) throws IOException, ApiException {
    return getArchitectDependencytrackingConsumedresourcesWithHttpInfo(id, version, objectType, resourceType).getBody();
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param id Consuming object ID (required)
   * @param version Consuming object version (required)
   * @param objectType Consuming object type (required)
   * @param resourceType Types of consumed resources to show (optional)
   * @return ConsumedResourcesEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumedResourcesEntityListing> getArchitectDependencytrackingConsumedresourcesWithHttpInfo(String id, String version, String objectType, List<String> resourceType) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling getArchitectDependencytrackingConsumedresources");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new IllegalArgumentException("Missing the required parameter 'version' when calling getArchitectDependencytrackingConsumedresources");
    }
    
    // verify the required parameter 'objectType' is set
    if (objectType == null) {
      throw new IllegalArgumentException("Missing the required parameter 'objectType' when calling getArchitectDependencytrackingConsumedresources");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/consumedresources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "id", id));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "version", version));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "objectType", objectType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "resourceType", resourceType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ConsumedResourcesEntityListing>() {});
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ConsumedResourcesEntityListing getArchitectDependencytrackingConsumedresources(GetArchitectDependencytrackingConsumedresourcesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ConsumedResourcesEntityListing>() {});
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumedResourcesEntityListing> getArchitectDependencytrackingConsumedresources(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ConsumedResourcesEntityListing>invokeAPIVerbose(request, new TypeReference<ConsumedResourcesEntityListing>() {});
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param id Consumed object ID (required)
   * @param objectType Consumed object type (only versioned object types are valid) (required)
   * @param resourceType Types of consuming resources to show (optional)
   * @return ConsumingResourcesEntityListing
   * @throws ApiException if fails to make API call
   */
  public ConsumingResourcesEntityListing getArchitectDependencytrackingConsumingresources(String id, String objectType, List<String> resourceType) throws IOException, ApiException {
    return getArchitectDependencytrackingConsumingresourcesWithHttpInfo(id, objectType, resourceType).getBody();
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param id Consumed object ID (required)
   * @param objectType Consumed object type (only versioned object types are valid) (required)
   * @param resourceType Types of consuming resources to show (optional)
   * @return ConsumingResourcesEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumingResourcesEntityListing> getArchitectDependencytrackingConsumingresourcesWithHttpInfo(String id, String objectType, List<String> resourceType) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling getArchitectDependencytrackingConsumingresources");
    }
    
    // verify the required parameter 'objectType' is set
    if (objectType == null) {
      throw new IllegalArgumentException("Missing the required parameter 'objectType' when calling getArchitectDependencytrackingConsumingresources");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/consumingresources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "id", id));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "objectType", objectType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "resourceType", resourceType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ConsumingResourcesEntityListing>() {});
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ConsumingResourcesEntityListing getArchitectDependencytrackingConsumingresources(GetArchitectDependencytrackingConsumingresourcesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ConsumingResourcesEntityListing>() {});
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConsumingResourcesEntityListing> getArchitectDependencytrackingConsumingresources(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ConsumingResourcesEntityListing>invokeAPIVerbose(request, new TypeReference<ConsumingResourcesEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param flowFilter Show only checkedIn or published flows (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws ApiException if fails to make API call
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingDeletedresourceconsumers(String name, List<String> objectType, String flowFilter, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getArchitectDependencytrackingDeletedresourceconsumersWithHttpInfo(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize).getBody();
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param flowFilter Show only checkedIn or published flows (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingDeletedresourceconsumersWithHttpInfo(String name, List<String> objectType, String flowFilter, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/deletedresourceconsumers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "objectType", objectType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flowFilter", flowFilter));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "consumedResources", consumedResources));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "consumedResourceType", consumedResourceType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingDeletedresourceconsumers(GetArchitectDependencytrackingDeletedresourceconsumersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingDeletedresourceconsumers(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIVerbose(request, new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param id Object ID (required)
   * @param version Object version (optional)
   * @param objectType Object type (optional)
   * @param consumedResources Include resources this item consumes (optional)
   * @param consumingResources Include resources that consume this item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @return DependencyObject
   * @throws ApiException if fails to make API call
   */
  public DependencyObject getArchitectDependencytrackingObject(String id, String version, String objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType) throws IOException, ApiException {
    return getArchitectDependencytrackingObjectWithHttpInfo(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType).getBody();
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param id Object ID (required)
   * @param version Object version (optional)
   * @param objectType Object type (optional)
   * @param consumedResources Include resources this item consumes (optional)
   * @param consumingResources Include resources that consume this item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @return DependencyObject
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObject> getArchitectDependencytrackingObjectWithHttpInfo(String id, String version, String objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new IllegalArgumentException("Missing the required parameter 'id' when calling getArchitectDependencytrackingObject");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/object".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "id", id));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "version", version));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "objectType", objectType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "consumedResources", consumedResources));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "consumingResources", consumingResources));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "consumedResourceType", consumedResourceType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "consumingResourceType", consumingResourceType));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DependencyObject>() {});
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DependencyObject getArchitectDependencytrackingObject(GetArchitectDependencytrackingObjectRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DependencyObject>() {});
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObject> getArchitectDependencytrackingObject(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DependencyObject>invokeAPIVerbose(request, new TypeReference<DependencyObject>() {});
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param typeId Type ID (required)
   * @return DependencyType
   * @throws ApiException if fails to make API call
   */
  public DependencyType getArchitectDependencytrackingType(String typeId) throws IOException, ApiException {
    return getArchitectDependencytrackingTypeWithHttpInfo(typeId).getBody();
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param typeId Type ID (required)
   * @return DependencyType
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyType> getArchitectDependencytrackingTypeWithHttpInfo(String typeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'typeId' is set
    if (typeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'typeId' when calling getArchitectDependencytrackingType");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/types/{typeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "typeId" + "\\}", pcapiClient.escapeString(typeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DependencyType>() {});
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DependencyType getArchitectDependencytrackingType(GetArchitectDependencytrackingTypeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DependencyType>() {});
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyType> getArchitectDependencytrackingType(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DependencyType>invokeAPIVerbose(request, new TypeReference<DependencyType>() {});
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyTypeEntityListing
   * @throws ApiException if fails to make API call
   */
  public DependencyTypeEntityListing getArchitectDependencytrackingTypes(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getArchitectDependencytrackingTypesWithHttpInfo(pageNumber, pageSize).getBody();
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyTypeEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyTypeEntityListing> getArchitectDependencytrackingTypesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/types".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DependencyTypeEntityListing>() {});
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DependencyTypeEntityListing getArchitectDependencytrackingTypes(GetArchitectDependencytrackingTypesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DependencyTypeEntityListing>() {});
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyTypeEntityListing> getArchitectDependencytrackingTypes(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DependencyTypeEntityListing>invokeAPIVerbose(request, new TypeReference<DependencyTypeEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws ApiException if fails to make API call
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingUpdatedresourceconsumers(String name, List<String> objectType, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getArchitectDependencytrackingUpdatedresourceconsumersWithHttpInfo(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize).getBody();
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingUpdatedresourceconsumersWithHttpInfo(String name, List<String> objectType, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/updatedresourceconsumers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "objectType", objectType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "consumedResources", consumedResources));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "consumedResourceType", consumedResourceType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingUpdatedresourceconsumers(GetArchitectDependencytrackingUpdatedresourceconsumersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingUpdatedresourceconsumers(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DependencyObjectEntityListing>invokeAPIVerbose(request, new TypeReference<DependencyObjectEntityListing>() {});
  }

  /**
   * Get specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public Prompt getArchitectPrompt(String promptId) throws IOException, ApiException {
    return getArchitectPromptWithHttpInfo(promptId).getBody();
  }

  /**
   * Get specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> getArchitectPromptWithHttpInfo(String promptId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling getArchitectPrompt");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Prompt>() {});
  }

  /**
   * Get specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Prompt getArchitectPrompt(GetArchitectPromptRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Prompt>() {});
  }

  /**
   * Get specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> getArchitectPrompt(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Prompt>invokeAPIVerbose(request, new TypeReference<Prompt>() {});
  }

  /**
   * Get specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAsset
   * @throws ApiException if fails to make API call
   */
  public PromptAsset getArchitectPromptResource(String promptId, String languageCode) throws IOException, ApiException {
    return getArchitectPromptResourceWithHttpInfo(promptId, languageCode).getBody();
  }

  /**
   * Get specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAsset
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> getArchitectPromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling getArchitectPromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling getArchitectPromptResource");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}/resources/{languageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()))
      .replaceAll("\\{" + "languageCode" + "\\}", pcapiClient.escapeString(languageCode.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PromptAsset>() {});
  }

  /**
   * Get specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PromptAsset getArchitectPromptResource(GetArchitectPromptResourceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
  }

  /**
   * Get specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> getArchitectPromptResource(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<PromptAsset>invokeAPIVerbose(request, new TypeReference<PromptAsset>() {});
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return PromptAssetEntityListing
   * @throws ApiException if fails to make API call
   */
  public PromptAssetEntityListing getArchitectPromptResources(String promptId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getArchitectPromptResourcesWithHttpInfo(promptId, pageNumber, pageSize).getBody();
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return PromptAssetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAssetEntityListing> getArchitectPromptResourcesWithHttpInfo(String promptId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling getArchitectPromptResources");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}/resources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PromptAssetEntityListing>() {});
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PromptAssetEntityListing getArchitectPromptResources(GetArchitectPromptResourcesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAssetEntityListing>() {});
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAssetEntityListing> getArchitectPromptResources(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<PromptAssetEntityListing>invokeAPIVerbose(request, new TypeReference<PromptAssetEntityListing>() {});
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @return PromptEntityListing
   * @throws ApiException if fails to make API call
   */
  public PromptEntityListing getArchitectPrompts(Integer pageNumber, Integer pageSize, String name, String description, String nameOrDescription) throws IOException, ApiException {
    return getArchitectPromptsWithHttpInfo(pageNumber, pageSize, name, description, nameOrDescription).getBody();
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @return PromptEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptEntityListing> getArchitectPromptsWithHttpInfo(Integer pageNumber, Integer pageSize, String name, String description, String nameOrDescription) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "description", description));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nameOrDescription", nameOrDescription));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PromptEntityListing>() {});
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PromptEntityListing getArchitectPrompts(GetArchitectPromptsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptEntityListing>() {});
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptEntityListing> getArchitectPrompts(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<PromptEntityListing>invokeAPIVerbose(request, new TypeReference<PromptEntityListing>() {});
  }

  /**
   * Get a system prompt
   * 
   * @param promptId promptId (required)
   * @return SystemPrompt
   * @throws ApiException if fails to make API call
   */
  public SystemPrompt getArchitectSystemprompt(String promptId) throws IOException, ApiException {
    return getArchitectSystempromptWithHttpInfo(promptId).getBody();
  }

  /**
   * Get a system prompt
   * 
   * @param promptId promptId (required)
   * @return SystemPrompt
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPrompt> getArchitectSystempromptWithHttpInfo(String promptId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling getArchitectSystemprompt");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/systemprompts/{promptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SystemPrompt>() {});
  }

  /**
   * Get a system prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SystemPrompt getArchitectSystemprompt(GetArchitectSystempromptRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPrompt>() {});
  }

  /**
   * Get a system prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPrompt> getArchitectSystemprompt(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SystemPrompt>invokeAPIVerbose(request, new TypeReference<SystemPrompt>() {});
  }

  /**
   * Get a system prompt resource.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return SystemPromptAsset
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAsset getArchitectSystempromptResource(String promptId, String languageCode) throws IOException, ApiException {
    return getArchitectSystempromptResourceWithHttpInfo(promptId, languageCode).getBody();
  }

  /**
   * Get a system prompt resource.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return SystemPromptAsset
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> getArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling getArchitectSystempromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling getArchitectSystempromptResource");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/systemprompts/{promptId}/resources/{languageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()))
      .replaceAll("\\{" + "languageCode" + "\\}", pcapiClient.escapeString(languageCode.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Get a system prompt resource.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAsset getArchitectSystempromptResource(GetArchitectSystempromptResourceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Get a system prompt resource.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> getArchitectSystempromptResource(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerbose(request, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Get system prompt resources.
   * 
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return SystemPromptAssetEntityListing
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAssetEntityListing getArchitectSystempromptResources(String promptId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws IOException, ApiException {
    return getArchitectSystempromptResourcesWithHttpInfo(promptId, pageNumber, pageSize, sortBy, sortOrder).getBody();
  }

  /**
   * Get system prompt resources.
   * 
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return SystemPromptAssetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAssetEntityListing> getArchitectSystempromptResourcesWithHttpInfo(String promptId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling getArchitectSystempromptResources");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/systemprompts/{promptId}/resources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SystemPromptAssetEntityListing>() {});
  }

  /**
   * Get system prompt resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAssetEntityListing getArchitectSystempromptResources(GetArchitectSystempromptResourcesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAssetEntityListing>() {});
  }

  /**
   * Get system prompt resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAssetEntityListing> getArchitectSystempromptResources(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SystemPromptAssetEntityListing>invokeAPIVerbose(request, new TypeReference<SystemPromptAssetEntityListing>() {});
  }

  /**
   * Get System Prompts
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @return SystemPromptEntityListing
   * @throws ApiException if fails to make API call
   */
  public SystemPromptEntityListing getArchitectSystemprompts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String description, String nameOrDescription) throws IOException, ApiException {
    return getArchitectSystempromptsWithHttpInfo(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription).getBody();
  }

  /**
   * Get System Prompts
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @return SystemPromptEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptEntityListing> getArchitectSystempromptsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String description, String nameOrDescription) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/systemprompts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "description", description));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nameOrDescription", nameOrDescription));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SystemPromptEntityListing>() {});
  }

  /**
   * Get System Prompts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SystemPromptEntityListing getArchitectSystemprompts(GetArchitectSystempromptsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptEntityListing>() {});
  }

  /**
   * Get System Prompts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptEntityListing> getArchitectSystemprompts(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SystemPromptEntityListing>invokeAPIVerbose(request, new TypeReference<SystemPromptEntityListing>() {});
  }

  /**
   * Get flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Include deleted flows (optional, default to false)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow getFlow(String flowId, Boolean deleted) throws IOException, ApiException {
    return getFlowWithHttpInfo(flowId, deleted).getBody();
  }

  /**
   * Get flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Include deleted flows (optional, default to false)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> getFlowWithHttpInfo(String flowId, Boolean deleted) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling getFlow");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "deleted", deleted));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Get flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow getFlow(GetFlowRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Get flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> getFlow(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Include deleted flows (optional, default to false)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getFlowLatestconfiguration(String flowId, Boolean deleted) throws IOException, ApiException {
    return getFlowLatestconfigurationWithHttpInfo(flowId, deleted).getBody();
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Include deleted flows (optional, default to false)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getFlowLatestconfigurationWithHttpInfo(String flowId, Boolean deleted) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling getFlowLatestconfiguration");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}/latestconfiguration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "deleted", deleted));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Object>() {});
  }

  /**
   * Get the latest configuration for flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Object getFlowLatestconfiguration(GetFlowLatestconfigurationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Object>() {});
  }

  /**
   * Get the latest configuration for flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getFlowLatestconfiguration(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Object>invokeAPIVerbose(request, new TypeReference<Object>() {});
  }

  /**
   * Get flow version
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Include deleted flows (optional)
   * @return FlowVersion
   * @throws ApiException if fails to make API call
   */
  public FlowVersion getFlowVersion(String flowId, String versionId, String deleted) throws IOException, ApiException {
    return getFlowVersionWithHttpInfo(flowId, versionId, deleted).getBody();
  }

  /**
   * Get flow version
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Include deleted flows (optional)
   * @return FlowVersion
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowVersion> getFlowVersionWithHttpInfo(String flowId, String versionId, String deleted) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling getFlowVersion");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'versionId' when calling getFlowVersion");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}/versions/{versionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", pcapiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "deleted", deleted));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FlowVersion>() {});
  }

  /**
   * Get flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FlowVersion getFlowVersion(GetFlowVersionRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FlowVersion>() {});
  }

  /**
   * Get flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowVersion> getFlowVersion(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<FlowVersion>invokeAPIVerbose(request, new TypeReference<FlowVersion>() {});
  }

  /**
   * Create flow version configuration
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Include deleted flows (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getFlowVersionConfiguration(String flowId, String versionId, String deleted) throws IOException, ApiException {
    return getFlowVersionConfigurationWithHttpInfo(flowId, versionId, deleted).getBody();
  }

  /**
   * Create flow version configuration
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Include deleted flows (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getFlowVersionConfigurationWithHttpInfo(String flowId, String versionId, String deleted) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling getFlowVersionConfiguration");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'versionId' when calling getFlowVersionConfiguration");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}/versions/{versionId}/configuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", pcapiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "deleted", deleted));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Object>() {});
  }

  /**
   * Create flow version configuration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Object getFlowVersionConfiguration(GetFlowVersionConfigurationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Object>() {});
  }

  /**
   * Create flow version configuration
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getFlowVersionConfiguration(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Object>invokeAPIVerbose(request, new TypeReference<Object>() {});
  }

  /**
   * Get flow version list
   * 
   * @param flowId Flow ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Include deleted flows (optional)
   * @return FlowVersionEntityListing
   * @throws ApiException if fails to make API call
   */
  public FlowVersionEntityListing getFlowVersions(String flowId, Integer pageNumber, Integer pageSize, Boolean deleted) throws IOException, ApiException {
    return getFlowVersionsWithHttpInfo(flowId, pageNumber, pageSize, deleted).getBody();
  }

  /**
   * Get flow version list
   * 
   * @param flowId Flow ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Include deleted flows (optional)
   * @return FlowVersionEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowVersionEntityListing> getFlowVersionsWithHttpInfo(String flowId, Integer pageNumber, Integer pageSize, Boolean deleted) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling getFlowVersions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "deleted", deleted));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FlowVersionEntityListing>() {});
  }

  /**
   * Get flow version list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FlowVersionEntityListing getFlowVersions(GetFlowVersionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FlowVersionEntityListing>() {});
  }

  /**
   * Get flow version list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowVersionEntityListing> getFlowVersions(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<FlowVersionEntityListing>invokeAPIVerbose(request, new TypeReference<FlowVersionEntityListing>() {});
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @param type Type (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param publishVersionId Publish version ID (optional)
   * @param editableBy Editable by (optional)
   * @param lockedBy Locked by (optional)
   * @param secure Secure (optional)
   * @param deleted Include deleted (optional, default to false)
   * @param includeSchemas Include variable schemas (optional, default to false)
   * @return FlowEntityListing
   * @throws ApiException if fails to make API call
   */
  public FlowEntityListing getFlows(String type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, String publishVersionId, String editableBy, String lockedBy, String secure, Boolean deleted, Boolean includeSchemas) throws IOException, ApiException {
    return getFlowsWithHttpInfo(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, secure, deleted, includeSchemas).getBody();
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @param type Type (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param publishVersionId Publish version ID (optional)
   * @param editableBy Editable by (optional)
   * @param lockedBy Locked by (optional)
   * @param secure Secure (optional)
   * @param deleted Include deleted (optional, default to false)
   * @param includeSchemas Include variable schemas (optional, default to false)
   * @return FlowEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowEntityListing> getFlowsWithHttpInfo(String type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, String publishVersionId, String editableBy, String lockedBy, String secure, Boolean deleted, Boolean includeSchemas) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new IllegalArgumentException("Missing the required parameter 'type' when calling getFlows");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "type", type));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "id", id));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "description", description));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "nameOrDescription", nameOrDescription));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "publishVersionId", publishVersionId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "editableBy", editableBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lockedBy", lockedBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "secure", secure));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "deleted", deleted));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeSchemas", includeSchemas));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FlowEntityListing>() {});
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FlowEntityListing getFlows(GetFlowsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FlowEntityListing>() {});
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowEntityListing> getFlows(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<FlowEntityListing>invokeAPIVerbose(request, new TypeReference<FlowEntityListing>() {});
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * 
   * @throws ApiException if fails to make API call
   */
  public void postArchitectDependencytrackingBuild() throws IOException, ApiException {
    postArchitectDependencytrackingBuildWithHttpInfo();
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * 
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postArchitectDependencytrackingBuildWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/dependencytracking/build".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postArchitectDependencytrackingBuild(PostArchitectDependencytrackingBuildRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postArchitectDependencytrackingBuild(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create a new user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return PromptAsset
   * @throws ApiException if fails to make API call
   */
  public PromptAsset postArchitectPromptResources(String promptId, PromptAssetCreate body) throws IOException, ApiException {
    return postArchitectPromptResourcesWithHttpInfo(promptId, body).getBody();
  }

  /**
   * Create a new user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return PromptAsset
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> postArchitectPromptResourcesWithHttpInfo(String promptId, PromptAssetCreate body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling postArchitectPromptResources");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}/resources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PromptAsset>() {});
  }

  /**
   * Create a new user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PromptAsset postArchitectPromptResources(PostArchitectPromptResourcesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
  }

  /**
   * Create a new user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> postArchitectPromptResources(ApiRequest<PromptAssetCreate> request) throws IOException, ApiException {
    return pcapiClient.<PromptAsset>invokeAPIVerbose(request, new TypeReference<PromptAsset>() {});
  }

  /**
   * Create a new user prompt
   * 
   * @param body  (optional)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public Prompt postArchitectPrompts(Prompt body) throws IOException, ApiException {
    return postArchitectPromptsWithHttpInfo(body).getBody();
  }

  /**
   * Create a new user prompt
   * 
   * @param body  (optional)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> postArchitectPromptsWithHttpInfo(Prompt body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Prompt>() {});
  }

  /**
   * Create a new user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Prompt postArchitectPrompts(PostArchitectPromptsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Prompt>() {});
  }

  /**
   * Create a new user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> postArchitectPrompts(ApiRequest<Prompt> request) throws IOException, ApiException {
    return pcapiClient.<Prompt>invokeAPIVerbose(request, new TypeReference<Prompt>() {});
  }

  /**
   * Create system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return SystemPromptAsset
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAsset postArchitectSystempromptResources(String promptId, SystemPromptAsset body) throws IOException, ApiException {
    return postArchitectSystempromptResourcesWithHttpInfo(promptId, body).getBody();
  }

  /**
   * Create system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return SystemPromptAsset
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> postArchitectSystempromptResourcesWithHttpInfo(String promptId, SystemPromptAsset body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling postArchitectSystempromptResources");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/systemprompts/{promptId}/resources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Create system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAsset postArchitectSystempromptResources(PostArchitectSystempromptResourcesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Create system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> postArchitectSystempromptResources(ApiRequest<SystemPromptAsset> request) throws IOException, ApiException {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerbose(request, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Create flow version
   * 
   * @param flowId Flow ID (required)
   * @param body  (optional)
   * @return FlowVersion
   * @throws ApiException if fails to make API call
   */
  public FlowVersion postFlowVersions(String flowId, Object body) throws IOException, ApiException {
    return postFlowVersionsWithHttpInfo(flowId, body).getBody();
  }

  /**
   * Create flow version
   * 
   * @param flowId Flow ID (required)
   * @param body  (optional)
   * @return FlowVersion
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowVersion> postFlowVersionsWithHttpInfo(String flowId, Object body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling postFlowVersions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FlowVersion>() {});
  }

  /**
   * Create flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FlowVersion postFlowVersions(PostFlowVersionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FlowVersion>() {});
  }

  /**
   * Create flow version
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowVersion> postFlowVersions(ApiRequest<Object> request) throws IOException, ApiException {
    return pcapiClient.<FlowVersion>invokeAPIVerbose(request, new TypeReference<FlowVersion>() {});
  }

  /**
   * Create flow
   * 
   * @param body  (optional)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow postFlows(Flow body) throws IOException, ApiException {
    return postFlowsWithHttpInfo(body).getBody();
  }

  /**
   * Create flow
   * 
   * @param body  (optional)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsWithHttpInfo(Flow body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Create flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow postFlows(PostFlowsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Create flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlows(ApiRequest<Flow> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

  /**
   * Check-in flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsCheckin(String flow) throws IOException, ApiException {
    return postFlowsActionsCheckinWithHttpInfo(flow).getBody();
  }

  /**
   * Check-in flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsCheckinWithHttpInfo(String flow) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flow' is set
    if (flow == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flow' when calling postFlowsActionsCheckin");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/actions/checkin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flow", flow));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Check-in flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsCheckin(PostFlowsActionsCheckinRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Check-in flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsCheckin(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

  /**
   * Check-out flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsCheckout(String flow) throws IOException, ApiException {
    return postFlowsActionsCheckoutWithHttpInfo(flow).getBody();
  }

  /**
   * Check-out flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsCheckoutWithHttpInfo(String flow) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flow' is set
    if (flow == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flow' when calling postFlowsActionsCheckout");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/actions/checkout".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flow", flow));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Check-out flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsCheckout(PostFlowsActionsCheckoutRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Check-out flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsCheckout(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

  /**
   * Deactivate flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsDeactivate(String flow) throws IOException, ApiException {
    return postFlowsActionsDeactivateWithHttpInfo(flow).getBody();
  }

  /**
   * Deactivate flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsDeactivateWithHttpInfo(String flow) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flow' is set
    if (flow == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flow' when calling postFlowsActionsDeactivate");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/actions/deactivate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flow", flow));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Deactivate flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsDeactivate(PostFlowsActionsDeactivateRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Deactivate flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsDeactivate(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

  /**
   * Publish flow
   * 
   * @param flow Flow ID (required)
   * @param version version (optional)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation postFlowsActionsPublish(String flow, String version) throws IOException, ApiException {
    return postFlowsActionsPublishWithHttpInfo(flow, version).getBody();
  }

  /**
   * Publish flow
   * 
   * @param flow Flow ID (required)
   * @param version version (optional)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> postFlowsActionsPublishWithHttpInfo(String flow, String version) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flow' is set
    if (flow == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flow' when calling postFlowsActionsPublish");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/actions/publish".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flow", flow));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "version", version));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Operation>() {});
  }

  /**
   * Publish flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Operation postFlowsActionsPublish(PostFlowsActionsPublishRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Operation>() {});
  }

  /**
   * Publish flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> postFlowsActionsPublish(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Operation>invokeAPIVerbose(request, new TypeReference<Operation>() {});
  }

  /**
   * Revert flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsRevert(String flow) throws IOException, ApiException {
    return postFlowsActionsRevertWithHttpInfo(flow).getBody();
  }

  /**
   * Revert flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsRevertWithHttpInfo(String flow) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flow' is set
    if (flow == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flow' when calling postFlowsActionsRevert");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/actions/revert".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flow", flow));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Revert flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsRevert(PostFlowsActionsRevertRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Revert flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsRevert(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsUnlock(String flow) throws IOException, ApiException {
    return postFlowsActionsUnlockWithHttpInfo(flow).getBody();
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsUnlockWithHttpInfo(String flow) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'flow' is set
    if (flow == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flow' when calling postFlowsActionsUnlock");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/actions/unlock".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flow", flow));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow postFlowsActionsUnlock(PostFlowsActionsUnlockRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> postFlowsActionsUnlock(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

  /**
   * Update specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public Prompt putArchitectPrompt(String promptId, Prompt body) throws IOException, ApiException {
    return putArchitectPromptWithHttpInfo(promptId, body).getBody();
  }

  /**
   * Update specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> putArchitectPromptWithHttpInfo(String promptId, Prompt body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling putArchitectPrompt");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Prompt>() {});
  }

  /**
   * Update specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Prompt putArchitectPrompt(PutArchitectPromptRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Prompt>() {});
  }

  /**
   * Update specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> putArchitectPrompt(ApiRequest<Prompt> request) throws IOException, ApiException {
    return pcapiClient.<Prompt>invokeAPIVerbose(request, new TypeReference<Prompt>() {});
  }

  /**
   * Update specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (optional)
   * @return PromptAsset
   * @throws ApiException if fails to make API call
   */
  public PromptAsset putArchitectPromptResource(String promptId, String languageCode, PromptAsset body) throws IOException, ApiException {
    return putArchitectPromptResourceWithHttpInfo(promptId, languageCode, body).getBody();
  }

  /**
   * Update specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (optional)
   * @return PromptAsset
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> putArchitectPromptResourceWithHttpInfo(String promptId, String languageCode, PromptAsset body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling putArchitectPromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling putArchitectPromptResource");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/prompts/{promptId}/resources/{languageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()))
      .replaceAll("\\{" + "languageCode" + "\\}", pcapiClient.escapeString(languageCode.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PromptAsset>() {});
  }

  /**
   * Update specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PromptAsset putArchitectPromptResource(PutArchitectPromptResourceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
  }

  /**
   * Update specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> putArchitectPromptResource(ApiRequest<PromptAsset> request) throws IOException, ApiException {
    return pcapiClient.<PromptAsset>invokeAPIVerbose(request, new TypeReference<PromptAsset>() {});
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (optional)
   * @return SystemPromptAsset
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAsset putArchitectSystempromptResource(String promptId, String languageCode, SystemPromptAsset body) throws IOException, ApiException {
    return putArchitectSystempromptResourceWithHttpInfo(promptId, languageCode, body).getBody();
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (optional)
   * @return SystemPromptAsset
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> putArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode, SystemPromptAsset body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'promptId' when calling putArchitectSystempromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling putArchitectSystempromptResource");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/architect/systemprompts/{promptId}/resources/{languageCode}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "promptId" + "\\}", pcapiClient.escapeString(promptId.toString()))
      .replaceAll("\\{" + "languageCode" + "\\}", pcapiClient.escapeString(languageCode.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAsset putArchitectSystempromptResource(PutArchitectSystempromptResourceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> putArchitectSystempromptResource(ApiRequest<SystemPromptAsset> request) throws IOException, ApiException {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerbose(request, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Update flow
   * 
   * @param flowId Flow ID (required)
   * @param body  (optional)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public Flow putFlow(String flowId, Flow body) throws IOException, ApiException {
    return putFlowWithHttpInfo(flowId, body).getBody();
  }

  /**
   * Update flow
   * 
   * @param flowId Flow ID (required)
   * @param body  (optional)
   * @return Flow
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> putFlowWithHttpInfo(String flowId, Flow body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'flowId' is set
    if (flowId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'flowId' when calling putFlow");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/flows/{flowId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "flowId" + "\\}", pcapiClient.escapeString(flowId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Flow>() {});
  }

  /**
   * Update flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Flow putFlow(PutFlowRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Flow>() {});
  }

  /**
   * Update flow
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Flow> putFlow(ApiRequest<Flow> request) throws IOException, ApiException {
    return pcapiClient.<Flow>invokeAPIVerbose(request, new TypeReference<Flow>() {});
  }

}
