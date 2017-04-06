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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Script getScript(String scriptId) throws IOException, ApiException {
    return  getScript(createGetScriptRequest(scriptId));
  }

  /**
   * Get a script
   * 
   * @param scriptId Script ID (required)
   * @return Script
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Script> getScriptWithHttpInfo(String scriptId) throws IOException {
    return getScript(createGetScriptRequest(scriptId).withHttpInfo());
  }

  private GetScriptRequest createGetScriptRequest(String scriptId) {
    return GetScriptRequest.builder()
            .withScriptId(scriptId)
            .build();
  }

  /**
   * Get a script
   * 
   * @param request The request object
   * @return Script
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Script getScript(GetScriptRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Script> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Script>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a script
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Script> getScript(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Script>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Script> response = (ApiResponse<Script>)(ApiResponse<?>)exception;
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
      ApiResponse<Script> response = (ApiResponse<Script>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a page
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Page getScriptPage(String scriptId, String pageId) throws IOException, ApiException {
    return  getScriptPage(createGetScriptPageRequest(scriptId, pageId));
  }

  /**
   * Get a page
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Page> getScriptPageWithHttpInfo(String scriptId, String pageId) throws IOException {
    return getScriptPage(createGetScriptPageRequest(scriptId, pageId).withHttpInfo());
  }

  private GetScriptPageRequest createGetScriptPageRequest(String scriptId, String pageId) {
    return GetScriptPageRequest.builder()
            .withScriptId(scriptId)

            .withPageId(pageId)
            .build();
  }

  /**
   * Get a page
   * 
   * @param request The request object
   * @return Page
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Page getScriptPage(GetScriptPageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Page> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Page>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a page
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Page> getScriptPage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Page>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Page> response = (ApiResponse<Page>)(ApiResponse<?>)exception;
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
      ApiResponse<Page> response = (ApiResponse<Page>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Page> getScriptPages(String scriptId) throws IOException, ApiException {
    return  getScriptPages(createGetScriptPagesRequest(scriptId));
  }

  /**
   * Get the list of pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Page>> getScriptPagesWithHttpInfo(String scriptId) throws IOException {
    return getScriptPages(createGetScriptPagesRequest(scriptId).withHttpInfo());
  }

  private GetScriptPagesRequest createGetScriptPagesRequest(String scriptId) {
    return GetScriptPagesRequest.builder()
            .withScriptId(scriptId)
            .build();
  }

  /**
   * Get the list of pages
   * 
   * @param request The request object
   * @return List<Page>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Page> getScriptPages(GetScriptPagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Page>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Page>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of pages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Page>> getScriptPages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Page>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Page>> response = (ApiResponse<List<Page>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<Page>> response = (ApiResponse<List<Page>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScripts(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getScripts(createGetScriptsRequest(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder));
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder) throws IOException {
    return getScripts(createGetScriptsRequest(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder).withHttpInfo());
  }

  private GetScriptsRequest createGetScriptsRequest(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder) {
    return GetScriptsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withExpand(expand)

            .withName(name)

            .withFeature(feature)

            .withFlowId(flowId)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Get the list of scripts
   * 
   * @param request The request object
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScripts(GetScriptsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScriptEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScriptEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of scripts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScripts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScriptEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScriptEntityListing> response = (ApiResponse<ScriptEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ScriptEntityListing> response = (ApiResponse<ScriptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScriptsPublished(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId) throws IOException, ApiException {
    return  getScriptsPublished(createGetScriptsPublishedRequest(pageSize, pageNumber, expand, name, feature, flowId));
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
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsPublishedWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId) throws IOException {
    return getScriptsPublished(createGetScriptsPublishedRequest(pageSize, pageNumber, expand, name, feature, flowId).withHttpInfo());
  }

  private GetScriptsPublishedRequest createGetScriptsPublishedRequest(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId) {
    return GetScriptsPublishedRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withExpand(expand)

            .withName(name)

            .withFeature(feature)

            .withFlowId(flowId)
            .build();
  }

  /**
   * Get the published scripts.
   * 
   * @param request The request object
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScriptsPublished(GetScriptsPublishedRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScriptEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScriptEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published scripts.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsPublished(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScriptEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScriptEntityListing> response = (ApiResponse<ScriptEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ScriptEntityListing> response = (ApiResponse<ScriptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the published script.
   * 
   * @param scriptId Script ID (required)
   * @return Script
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Script getScriptsPublishedScriptId(String scriptId) throws IOException, ApiException {
    return  getScriptsPublishedScriptId(createGetScriptsPublishedScriptIdRequest(scriptId));
  }

  /**
   * Get the published script.
   * 
   * @param scriptId Script ID (required)
   * @return Script
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Script> getScriptsPublishedScriptIdWithHttpInfo(String scriptId) throws IOException {
    return getScriptsPublishedScriptId(createGetScriptsPublishedScriptIdRequest(scriptId).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdRequest createGetScriptsPublishedScriptIdRequest(String scriptId) {
    return GetScriptsPublishedScriptIdRequest.builder()
            .withScriptId(scriptId)
            .build();
  }

  /**
   * Get the published script.
   * 
   * @param request The request object
   * @return Script
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Script getScriptsPublishedScriptId(GetScriptsPublishedScriptIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Script> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Script>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published script.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Script> getScriptsPublishedScriptId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Script>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Script> response = (ApiResponse<Script>)(ApiResponse<?>)exception;
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
      ApiResponse<Script> response = (ApiResponse<Script>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the published page.
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Page getScriptsPublishedScriptIdPage(String scriptId, String pageId) throws IOException, ApiException {
    return  getScriptsPublishedScriptIdPage(createGetScriptsPublishedScriptIdPageRequest(scriptId, pageId));
  }

  /**
   * Get the published page.
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @return Page
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Page> getScriptsPublishedScriptIdPageWithHttpInfo(String scriptId, String pageId) throws IOException {
    return getScriptsPublishedScriptIdPage(createGetScriptsPublishedScriptIdPageRequest(scriptId, pageId).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdPageRequest createGetScriptsPublishedScriptIdPageRequest(String scriptId, String pageId) {
    return GetScriptsPublishedScriptIdPageRequest.builder()
            .withScriptId(scriptId)

            .withPageId(pageId)
            .build();
  }

  /**
   * Get the published page.
   * 
   * @param request The request object
   * @return Page
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Page getScriptsPublishedScriptIdPage(GetScriptsPublishedScriptIdPageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Page> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Page>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published page.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Page> getScriptsPublishedScriptIdPage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Page>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Page> response = (ApiResponse<Page>)(ApiResponse<?>)exception;
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
      ApiResponse<Page> response = (ApiResponse<Page>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of published pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Page> getScriptsPublishedScriptIdPages(String scriptId) throws IOException, ApiException {
    return  getScriptsPublishedScriptIdPages(createGetScriptsPublishedScriptIdPagesRequest(scriptId));
  }

  /**
   * Get the list of published pages
   * 
   * @param scriptId Script ID (required)
   * @return List<Page>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Page>> getScriptsPublishedScriptIdPagesWithHttpInfo(String scriptId) throws IOException {
    return getScriptsPublishedScriptIdPages(createGetScriptsPublishedScriptIdPagesRequest(scriptId).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdPagesRequest createGetScriptsPublishedScriptIdPagesRequest(String scriptId) {
    return GetScriptsPublishedScriptIdPagesRequest.builder()
            .withScriptId(scriptId)
            .build();
  }

  /**
   * Get the list of published pages
   * 
   * @param request The request object
   * @return List<Page>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Page> getScriptsPublishedScriptIdPages(GetScriptsPublishedScriptIdPagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Page>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Page>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of published pages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Page>> getScriptsPublishedScriptIdPages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Page>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Page>> response = (ApiResponse<List<Page>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<Page>> response = (ApiResponse<List<Page>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the published variables
   * 
   * @param scriptId Script ID (required)
   * @param input input (optional)
   * @param output output (optional)
   * @param type type (optional)
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getScriptsPublishedScriptIdVariables(String scriptId, String input, String output, String type) throws IOException, ApiException {
    return  getScriptsPublishedScriptIdVariables(createGetScriptsPublishedScriptIdVariablesRequest(scriptId, input, output, type));
  }

  /**
   * Get the published variables
   * 
   * @param scriptId Script ID (required)
   * @param input input (optional)
   * @param output output (optional)
   * @param type type (optional)
   * @return Object
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getScriptsPublishedScriptIdVariablesWithHttpInfo(String scriptId, String input, String output, String type) throws IOException {
    return getScriptsPublishedScriptIdVariables(createGetScriptsPublishedScriptIdVariablesRequest(scriptId, input, output, type).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdVariablesRequest createGetScriptsPublishedScriptIdVariablesRequest(String scriptId, String input, String output, String type) {
    return GetScriptsPublishedScriptIdVariablesRequest.builder()
            .withScriptId(scriptId)

            .withInput(input)

            .withOutput(output)

            .withType(type)
            .build();
  }

  /**
   * Get the published variables
   * 
   * @param request The request object
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getScriptsPublishedScriptIdVariables(GetScriptsPublishedScriptIdVariablesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Object> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Object>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published variables
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getScriptsPublishedScriptIdVariables(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Object>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
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
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
