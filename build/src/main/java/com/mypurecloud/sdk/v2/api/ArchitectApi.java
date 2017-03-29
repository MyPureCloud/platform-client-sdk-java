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
  public void deleteArchitectPrompt(String promptId, Boolean allResources) throws ApiException {
    deleteArchitectPromptWithHttpInfo(promptId, allResources);
  }

  /**
   * Delete specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param allResources Whether or not to delete all the prompt resources (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPromptWithHttpInfo(String promptId, Boolean allResources) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling deleteArchitectPrompt");
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
  public void deleteArchitectPrompt(DeleteArchitectPromptRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPrompt(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteArchitectPromptResource(String promptId, String languageCode) throws ApiException {
    deleteArchitectPromptResourceWithHttpInfo(promptId, languageCode);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPromptResourceWithHttpInfo(String promptId, String languageCode) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling deleteArchitectPromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new ApiException(400, "Missing the required parameter 'languageCode' when calling deleteArchitectPromptResource");
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
  public void deleteArchitectPromptResource(DeleteArchitectPromptResourceRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteArchitectPromptResource(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @param id List of Prompt IDs (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteArchitectPrompts(List<String> id) throws ApiException {
    return deleteArchitectPromptsWithHttpInfo(id).getBody();
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @param id List of Prompt IDs (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteArchitectPromptsWithHttpInfo(List<String> id) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteArchitectPrompts");
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
  public Operation deleteArchitectPrompts(DeleteArchitectPromptsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Operation>() {});
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteArchitectPrompts(ApiRequest<Void> request) throws ApiException {
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
  public String deleteArchitectSystempromptResource(String promptId, String languageCode) throws ApiException {
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
  public ApiResponse<String> deleteArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling deleteArchitectSystempromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new ApiException(400, "Missing the required parameter 'languageCode' when calling deleteArchitectSystempromptResource");
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
  public String deleteArchitectSystempromptResource(DeleteArchitectSystempromptResourceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteArchitectSystempromptResource(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Get specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public Prompt getArchitectPrompt(String promptId) throws ApiException {
    return getArchitectPromptWithHttpInfo(promptId).getBody();
  }

  /**
   * Get specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> getArchitectPromptWithHttpInfo(String promptId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling getArchitectPrompt");
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
  public Prompt getArchitectPrompt(GetArchitectPromptRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Prompt>() {});
  }

  /**
   * Get specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> getArchitectPrompt(ApiRequest<Void> request) throws ApiException {
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
  public PromptAsset getArchitectPromptResource(String promptId, String languageCode) throws ApiException {
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
  public ApiResponse<PromptAsset> getArchitectPromptResourceWithHttpInfo(String promptId, String languageCode) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling getArchitectPromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new ApiException(400, "Missing the required parameter 'languageCode' when calling getArchitectPromptResource");
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
  public PromptAsset getArchitectPromptResource(GetArchitectPromptResourceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
  }

  /**
   * Get specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> getArchitectPromptResource(ApiRequest<Void> request) throws ApiException {
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
  public PromptAssetEntityListing getArchitectPromptResources(String promptId, Integer pageNumber, Integer pageSize) throws ApiException {
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
  public ApiResponse<PromptAssetEntityListing> getArchitectPromptResourcesWithHttpInfo(String promptId, Integer pageNumber, Integer pageSize) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling getArchitectPromptResources");
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
  public PromptAssetEntityListing getArchitectPromptResources(GetArchitectPromptResourcesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAssetEntityListing>() {});
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAssetEntityListing> getArchitectPromptResources(ApiRequest<Void> request) throws ApiException {
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
  public PromptEntityListing getArchitectPrompts(Integer pageNumber, Integer pageSize, String name, String description, String nameOrDescription) throws ApiException {
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
  public ApiResponse<PromptEntityListing> getArchitectPromptsWithHttpInfo(Integer pageNumber, Integer pageSize, String name, String description, String nameOrDescription) throws ApiException {
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
  public PromptEntityListing getArchitectPrompts(GetArchitectPromptsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptEntityListing>() {});
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptEntityListing> getArchitectPrompts(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<PromptEntityListing>invokeAPIVerbose(request, new TypeReference<PromptEntityListing>() {});
  }

  /**
   * Get a system prompt
   * 
   * @param promptId promptId (required)
   * @return SystemPrompt
   * @throws ApiException if fails to make API call
   */
  public SystemPrompt getArchitectSystemprompt(String promptId) throws ApiException {
    return getArchitectSystempromptWithHttpInfo(promptId).getBody();
  }

  /**
   * Get a system prompt
   * 
   * @param promptId promptId (required)
   * @return SystemPrompt
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPrompt> getArchitectSystempromptWithHttpInfo(String promptId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling getArchitectSystemprompt");
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
  public SystemPrompt getArchitectSystemprompt(GetArchitectSystempromptRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPrompt>() {});
  }

  /**
   * Get a system prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPrompt> getArchitectSystemprompt(ApiRequest<Void> request) throws ApiException {
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
  public SystemPromptAsset getArchitectSystempromptResource(String promptId, String languageCode) throws ApiException {
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
  public ApiResponse<SystemPromptAsset> getArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling getArchitectSystempromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new ApiException(400, "Missing the required parameter 'languageCode' when calling getArchitectSystempromptResource");
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
  public SystemPromptAsset getArchitectSystempromptResource(GetArchitectSystempromptResourceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Get a system prompt resource.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> getArchitectSystempromptResource(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerbose(request, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Get IVR System Prompt resources.
   * 
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return SystemPromptAssetEntityListing
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAssetEntityListing getArchitectSystempromptResources(String promptId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws ApiException {
    return getArchitectSystempromptResourcesWithHttpInfo(promptId, pageNumber, pageSize, sortBy, sortOrder).getBody();
  }

  /**
   * Get IVR System Prompt resources.
   * 
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return SystemPromptAssetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAssetEntityListing> getArchitectSystempromptResourcesWithHttpInfo(String promptId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling getArchitectSystempromptResources");
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
   * Get IVR System Prompt resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SystemPromptAssetEntityListing getArchitectSystempromptResources(GetArchitectSystempromptResourcesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAssetEntityListing>() {});
  }

  /**
   * Get IVR System Prompt resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAssetEntityListing> getArchitectSystempromptResources(ApiRequest<Void> request) throws ApiException {
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
  public SystemPromptEntityListing getArchitectSystemprompts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String description, String nameOrDescription) throws ApiException {
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
  public ApiResponse<SystemPromptEntityListing> getArchitectSystempromptsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String description, String nameOrDescription) throws ApiException {
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
  public SystemPromptEntityListing getArchitectSystemprompts(GetArchitectSystempromptsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptEntityListing>() {});
  }

  /**
   * Get System Prompts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptEntityListing> getArchitectSystemprompts(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<SystemPromptEntityListing>invokeAPIVerbose(request, new TypeReference<SystemPromptEntityListing>() {});
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
  public FlowEntityListing getFlows(String type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, String publishVersionId, String editableBy, String lockedBy, String secure, Boolean deleted, Boolean includeSchemas) throws ApiException {
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
  public ApiResponse<FlowEntityListing> getFlowsWithHttpInfo(String type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, String publishVersionId, String editableBy, String lockedBy, String secure, Boolean deleted, Boolean includeSchemas) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getFlows");
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
  public FlowEntityListing getFlows(GetFlowsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FlowEntityListing>() {});
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FlowEntityListing> getFlows(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<FlowEntityListing>invokeAPIVerbose(request, new TypeReference<FlowEntityListing>() {});
  }

  /**
   * Create a new user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return PromptAsset
   * @throws ApiException if fails to make API call
   */
  public PromptAsset postArchitectPromptResources(String promptId, PromptAssetCreate body) throws ApiException {
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
  public ApiResponse<PromptAsset> postArchitectPromptResourcesWithHttpInfo(String promptId, PromptAssetCreate body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling postArchitectPromptResources");
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
  public PromptAsset postArchitectPromptResources(PostArchitectPromptResourcesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
  }

  /**
   * Create a new user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> postArchitectPromptResources(ApiRequest<PromptAssetCreate> request) throws ApiException {
    return pcapiClient.<PromptAsset>invokeAPIVerbose(request, new TypeReference<PromptAsset>() {});
  }

  /**
   * Create a new user prompt
   * 
   * @param body  (optional)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public Prompt postArchitectPrompts(Prompt body) throws ApiException {
    return postArchitectPromptsWithHttpInfo(body).getBody();
  }

  /**
   * Create a new user prompt
   * 
   * @param body  (optional)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> postArchitectPromptsWithHttpInfo(Prompt body) throws ApiException {
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
  public Prompt postArchitectPrompts(PostArchitectPromptsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Prompt>() {});
  }

  /**
   * Create a new user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> postArchitectPrompts(ApiRequest<Prompt> request) throws ApiException {
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
  public SystemPromptAsset postArchitectSystempromptResources(String promptId, SystemPromptAsset body) throws ApiException {
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
  public ApiResponse<SystemPromptAsset> postArchitectSystempromptResourcesWithHttpInfo(String promptId, SystemPromptAsset body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling postArchitectSystempromptResources");
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
  public SystemPromptAsset postArchitectSystempromptResources(PostArchitectSystempromptResourcesRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Create system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> postArchitectSystempromptResources(ApiRequest<SystemPromptAsset> request) throws ApiException {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerbose(request, new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Update specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param body  (optional)
   * @return Prompt
   * @throws ApiException if fails to make API call
   */
  public Prompt putArchitectPrompt(String promptId, Prompt body) throws ApiException {
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
  public ApiResponse<Prompt> putArchitectPromptWithHttpInfo(String promptId, Prompt body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling putArchitectPrompt");
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
  public Prompt putArchitectPrompt(PutArchitectPromptRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Prompt>() {});
  }

  /**
   * Update specified user prompt
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Prompt> putArchitectPrompt(ApiRequest<Prompt> request) throws ApiException {
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
  public PromptAsset putArchitectPromptResource(String promptId, String languageCode, PromptAsset body) throws ApiException {
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
  public ApiResponse<PromptAsset> putArchitectPromptResourceWithHttpInfo(String promptId, String languageCode, PromptAsset body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling putArchitectPromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new ApiException(400, "Missing the required parameter 'languageCode' when calling putArchitectPromptResource");
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
  public PromptAsset putArchitectPromptResource(PutArchitectPromptResourceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
  }

  /**
   * Update specified user prompt resource
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PromptAsset> putArchitectPromptResource(ApiRequest<PromptAsset> request) throws ApiException {
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
  public SystemPromptAsset putArchitectSystempromptResource(String promptId, String languageCode, SystemPromptAsset body) throws ApiException {
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
  public ApiResponse<SystemPromptAsset> putArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode, SystemPromptAsset body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'promptId' is set
    if (promptId == null) {
      throw new ApiException(400, "Missing the required parameter 'promptId' when calling putArchitectSystempromptResource");
    }
    
    // verify the required parameter 'languageCode' is set
    if (languageCode == null) {
      throw new ApiException(400, "Missing the required parameter 'languageCode' when calling putArchitectSystempromptResource");
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
  public SystemPromptAsset putArchitectSystempromptResource(PutArchitectSystempromptResourceRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SystemPromptAsset> putArchitectSystempromptResource(ApiRequest<SystemPromptAsset> request) throws ApiException {
    return pcapiClient.<SystemPromptAsset>invokeAPIVerbose(request, new TypeReference<SystemPromptAsset>() {});
  }

}
