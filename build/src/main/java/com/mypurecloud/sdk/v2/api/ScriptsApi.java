package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Page;
import com.mypurecloud.sdk.v2.model.ScriptEntityListing;


import com.mypurecloud.sdk.v2.api.request.GetScriptRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptPageRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptPagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdPageRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdPagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdVariablesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ScriptsApi {
  private final ApiClient pcapiClient;

  public ScriptsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScriptsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get a script
   * 
   * @param scriptId Script ID (required)
   * @return Script
   * @throws ApiException if fails to make API call
   */
  public Script getScript(String scriptId) throws IOException, ApiException {
    return getScriptWithHttpInfo(scriptId).getBody();
  }

  /**
   * Get a script
   * 
   * @param scriptId Script ID (required)
   * @return Script
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Script> getScriptWithHttpInfo(String scriptId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scriptId' is set
    if (scriptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scriptId' when calling getScript");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/{scriptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scriptId" + "\\}", pcapiClient.escapeString(scriptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Script>() {});
  }

  /**
   * Get a script
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Script getScript(GetScriptRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Script>() {});
  }

  /**
   * Get a script
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Script> getScript(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Script>invokeAPIVerbose(request, new TypeReference<Script>() {});
  }

  /**
   * Get a page
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws ApiException if fails to make API call
   */
  public Page getScriptPage(String scriptId, String pageId) throws IOException, ApiException {
    return getScriptPageWithHttpInfo(scriptId, pageId).getBody();
  }

  /**
   * Get a page
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Page> getScriptPageWithHttpInfo(String scriptId, String pageId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scriptId' is set
    if (scriptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scriptId' when calling getScriptPage");
    }
    
    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'pageId' when calling getScriptPage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/{scriptId}/pages/{pageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scriptId" + "\\}", pcapiClient.escapeString(scriptId.toString()))
      .replaceAll("\\{" + "pageId" + "\\}", pcapiClient.escapeString(pageId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Page>() {});
  }

  /**
   * Get a page
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Page getScriptPage(GetScriptPageRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Page>() {});
  }

  /**
   * Get a page
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Page> getScriptPage(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Page>invokeAPIVerbose(request, new TypeReference<Page>() {});
  }

  /**
   * Get the list of pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws ApiException if fails to make API call
   */
  public List<Page> getScriptPages(String scriptId) throws IOException, ApiException {
    return getScriptPagesWithHttpInfo(scriptId).getBody();
  }

  /**
   * Get the list of pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Page>> getScriptPagesWithHttpInfo(String scriptId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scriptId' is set
    if (scriptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scriptId' when calling getScriptPages");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/{scriptId}/pages".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scriptId" + "\\}", pcapiClient.escapeString(scriptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<Page>>() {});
  }

  /**
   * Get the list of pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<Page> getScriptPages(GetScriptPagesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<Page>>() {});
  }

  /**
   * Get the list of pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Page>> getScriptPages(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<Page>>invokeAPIVerbose(request, new TypeReference<List<Page>>() {});
  }

  /**
   * Get the list of scripts
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @param sortBy SortBy (optional)
   * @param sortOrder SortOrder (optional)
   * @return ScriptEntityListing
   * @throws ApiException if fails to make API call
   */
  public ScriptEntityListing getScripts(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder) throws IOException, ApiException {
    return getScriptsWithHttpInfo(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder).getBody();
  }

  /**
   * Get the list of scripts
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @param sortBy SortBy (optional)
   * @param sortOrder SortOrder (optional)
   * @return ScriptEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScriptEntityListing> getScriptsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "feature", feature));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flowId", flowId));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ScriptEntityListing>() {});
  }

  /**
   * Get the list of scripts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ScriptEntityListing getScripts(GetScriptsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ScriptEntityListing>() {});
  }

  /**
   * Get the list of scripts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScriptEntityListing> getScripts(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ScriptEntityListing>invokeAPIVerbose(request, new TypeReference<ScriptEntityListing>() {});
  }

  /**
   * Get the published scripts.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @return ScriptEntityListing
   * @throws ApiException if fails to make API call
   */
  public ScriptEntityListing getScriptsPublished(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId) throws IOException, ApiException {
    return getScriptsPublishedWithHttpInfo(pageSize, pageNumber, expand, name, feature, flowId).getBody();
  }

  /**
   * Get the published scripts.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @return ScriptEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScriptEntityListing> getScriptsPublishedWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/published".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "feature", feature));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "flowId", flowId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ScriptEntityListing>() {});
  }

  /**
   * Get the published scripts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ScriptEntityListing getScriptsPublished(GetScriptsPublishedRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ScriptEntityListing>() {});
  }

  /**
   * Get the published scripts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScriptEntityListing> getScriptsPublished(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ScriptEntityListing>invokeAPIVerbose(request, new TypeReference<ScriptEntityListing>() {});
  }

  /**
   * Get the published script.
   * 
   * @param scriptId Script ID (required)
   * @return Script
   * @throws ApiException if fails to make API call
   */
  public Script getScriptsPublishedScriptId(String scriptId) throws IOException, ApiException {
    return getScriptsPublishedScriptIdWithHttpInfo(scriptId).getBody();
  }

  /**
   * Get the published script.
   * 
   * @param scriptId Script ID (required)
   * @return Script
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Script> getScriptsPublishedScriptIdWithHttpInfo(String scriptId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scriptId' is set
    if (scriptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scriptId' when calling getScriptsPublishedScriptId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/published/{scriptId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scriptId" + "\\}", pcapiClient.escapeString(scriptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Script>() {});
  }

  /**
   * Get the published script.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Script getScriptsPublishedScriptId(GetScriptsPublishedScriptIdRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Script>() {});
  }

  /**
   * Get the published script.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Script> getScriptsPublishedScriptId(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Script>invokeAPIVerbose(request, new TypeReference<Script>() {});
  }

  /**
   * Get the published page.
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws ApiException if fails to make API call
   */
  public Page getScriptsPublishedScriptIdPage(String scriptId, String pageId) throws IOException, ApiException {
    return getScriptsPublishedScriptIdPageWithHttpInfo(scriptId, pageId).getBody();
  }

  /**
   * Get the published page.
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Page> getScriptsPublishedScriptIdPageWithHttpInfo(String scriptId, String pageId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scriptId' is set
    if (scriptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scriptId' when calling getScriptsPublishedScriptIdPage");
    }
    
    // verify the required parameter 'pageId' is set
    if (pageId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'pageId' when calling getScriptsPublishedScriptIdPage");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/published/{scriptId}/pages/{pageId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scriptId" + "\\}", pcapiClient.escapeString(scriptId.toString()))
      .replaceAll("\\{" + "pageId" + "\\}", pcapiClient.escapeString(pageId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Page>() {});
  }

  /**
   * Get the published page.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Page getScriptsPublishedScriptIdPage(GetScriptsPublishedScriptIdPageRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Page>() {});
  }

  /**
   * Get the published page.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Page> getScriptsPublishedScriptIdPage(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Page>invokeAPIVerbose(request, new TypeReference<Page>() {});
  }

  /**
   * Get the list of published pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws ApiException if fails to make API call
   */
  public List<Page> getScriptsPublishedScriptIdPages(String scriptId) throws IOException, ApiException {
    return getScriptsPublishedScriptIdPagesWithHttpInfo(scriptId).getBody();
  }

  /**
   * Get the list of published pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Page>> getScriptsPublishedScriptIdPagesWithHttpInfo(String scriptId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scriptId' is set
    if (scriptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scriptId' when calling getScriptsPublishedScriptIdPages");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/published/{scriptId}/pages".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scriptId" + "\\}", pcapiClient.escapeString(scriptId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<Page>>() {});
  }

  /**
   * Get the list of published pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<Page> getScriptsPublishedScriptIdPages(GetScriptsPublishedScriptIdPagesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<Page>>() {});
  }

  /**
   * Get the list of published pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<Page>> getScriptsPublishedScriptIdPages(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<Page>>invokeAPIVerbose(request, new TypeReference<List<Page>>() {});
  }

  /**
   * Get the published variables
   * 
   * @param scriptId Script ID (required)
   * @param input input (optional)
   * @param output output (optional)
   * @param type type (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getScriptsPublishedScriptIdVariables(String scriptId, String input, String output, String type) throws IOException, ApiException {
    return getScriptsPublishedScriptIdVariablesWithHttpInfo(scriptId, input, output, type).getBody();
  }

  /**
   * Get the published variables
   * 
   * @param scriptId Script ID (required)
   * @param input input (optional)
   * @param output output (optional)
   * @param type type (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getScriptsPublishedScriptIdVariablesWithHttpInfo(String scriptId, String input, String output, String type) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scriptId' is set
    if (scriptId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scriptId' when calling getScriptsPublishedScriptIdVariables");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/scripts/published/{scriptId}/variables".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scriptId" + "\\}", pcapiClient.escapeString(scriptId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "input", input));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "output", output));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Object>() {});
  }

  /**
   * Get the published variables
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Object getScriptsPublishedScriptIdVariables(GetScriptsPublishedScriptIdVariablesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Object>() {});
  }

  /**
   * Get the published variables
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> getScriptsPublishedScriptIdVariables(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Object>invokeAPIVerbose(request, new TypeReference<Object>() {});
  }

}
