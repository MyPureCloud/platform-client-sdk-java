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
import com.mypurecloud.sdk.v2.model.ExportScriptRequest;
import com.mypurecloud.sdk.v2.model.ExportScriptResponse;
import com.mypurecloud.sdk.v2.model.ImportScriptStatusResponse;
import com.mypurecloud.sdk.v2.model.Page;
import com.mypurecloud.sdk.v2.model.PublishScriptRequestData;
import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.ScriptEntityListing;


import com.mypurecloud.sdk.v2.api.request.GetScriptRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptPageRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptPagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdPageRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdPagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsPublishedScriptIdVariablesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScriptsUploadStatusRequest;
import com.mypurecloud.sdk.v2.api.request.PostScriptExportRequest;
import com.mypurecloud.sdk.v2.api.request.PostScriptsPublishedRequest;

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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Page
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Page getScriptPage(String scriptId, String pageId, String scriptDataVersion) throws IOException, ApiException {
    return  getScriptPage(createGetScriptPageRequest(scriptId, pageId, scriptDataVersion));
  }

  /**
   * Get a page
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Page
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Page> getScriptPageWithHttpInfo(String scriptId, String pageId, String scriptDataVersion) throws IOException {
    return getScriptPage(createGetScriptPageRequest(scriptId, pageId, scriptDataVersion).withHttpInfo());
  }

  private GetScriptPageRequest createGetScriptPageRequest(String scriptId, String pageId, String scriptDataVersion) {
    return GetScriptPageRequest.builder()
            .withScriptId(scriptId)

            .withPageId(pageId)

            .withScriptDataVersion(scriptDataVersion)

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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return List<Page>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Page> getScriptPages(String scriptId, String scriptDataVersion) throws IOException, ApiException {
    return  getScriptPages(createGetScriptPagesRequest(scriptId, scriptDataVersion));
  }

  /**
   * Get the list of pages
   * 
   * @param scriptId Script ID (required)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return List<Page>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Page>> getScriptPagesWithHttpInfo(String scriptId, String scriptDataVersion) throws IOException {
    return getScriptPages(createGetScriptPagesRequest(scriptId, scriptDataVersion).withHttpInfo());
  }

  private GetScriptPagesRequest createGetScriptPagesRequest(String scriptId, String scriptDataVersion) {
    return GetScriptPagesRequest.builder()
            .withScriptId(scriptId)

            .withScriptDataVersion(scriptDataVersion)

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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScripts(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder, String scriptDataVersion, String divisionIds) throws IOException, ApiException {
    return  getScripts(createGetScriptsRequest(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds));
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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder, String scriptDataVersion, String divisionIds) throws IOException {
    return getScripts(createGetScriptsRequest(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds).withHttpInfo());
  }

  private GetScriptsRequest createGetScriptsRequest(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder, String scriptDataVersion, String divisionIds) {
    return GetScriptsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withExpand(expand)

            .withName(name)

            .withFeature(feature)

            .withFlowId(flowId)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withScriptDataVersion(scriptDataVersion)

            .withDivisionIds(divisionIds)

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
   * Get the metadata for a list of scripts
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @param sortBy SortBy (optional)
   * @param sortOrder SortOrder (optional)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScriptsDivisionviews(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder, String scriptDataVersion, String divisionIds) throws IOException, ApiException {
    return  getScriptsDivisionviews(createGetScriptsDivisionviewsRequest(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds));
  }

  /**
   * Get the metadata for a list of scripts
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @param sortBy SortBy (optional)
   * @param sortOrder SortOrder (optional)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsDivisionviewsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder, String scriptDataVersion, String divisionIds) throws IOException {
    return getScriptsDivisionviews(createGetScriptsDivisionviewsRequest(pageSize, pageNumber, expand, name, feature, flowId, sortBy, sortOrder, scriptDataVersion, divisionIds).withHttpInfo());
  }

  private GetScriptsDivisionviewsRequest createGetScriptsDivisionviewsRequest(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String sortBy, String sortOrder, String scriptDataVersion, String divisionIds) {
    return GetScriptsDivisionviewsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withExpand(expand)

            .withName(name)

            .withFeature(feature)

            .withFlowId(flowId)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withScriptDataVersion(scriptDataVersion)

            .withDivisionIds(divisionIds)

            .build();
  }

  /**
   * Get the metadata for a list of scripts
   * 
   * @param request The request object
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScriptsDivisionviews(GetScriptsDivisionviewsRequest request) throws IOException, ApiException {
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
   * Get the metadata for a list of scripts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsDivisionviews(ApiRequest<Void> request) throws IOException {
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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScriptsPublished(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String scriptDataVersion, String divisionIds) throws IOException, ApiException {
    return  getScriptsPublished(createGetScriptsPublishedRequest(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds));
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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsPublishedWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String scriptDataVersion, String divisionIds) throws IOException {
    return getScriptsPublished(createGetScriptsPublishedRequest(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds).withHttpInfo());
  }

  private GetScriptsPublishedRequest createGetScriptsPublishedRequest(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String scriptDataVersion, String divisionIds) {
    return GetScriptsPublishedRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withExpand(expand)

            .withName(name)

            .withFeature(feature)

            .withFlowId(flowId)

            .withScriptDataVersion(scriptDataVersion)

            .withDivisionIds(divisionIds)

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
   * Get the published scripts metadata.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScriptsPublishedDivisionviews(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String scriptDataVersion, String divisionIds) throws IOException, ApiException {
    return  getScriptsPublishedDivisionviews(createGetScriptsPublishedDivisionviewsRequest(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds));
  }

  /**
   * Get the published scripts metadata.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param expand Expand (optional)
   * @param name Name filter (optional)
   * @param feature Feature filter (optional)
   * @param flowId Secure flow id filter (optional)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param divisionIds Filters scripts to requested divisionIds (optional)
   * @return ScriptEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsPublishedDivisionviewsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String scriptDataVersion, String divisionIds) throws IOException {
    return getScriptsPublishedDivisionviews(createGetScriptsPublishedDivisionviewsRequest(pageSize, pageNumber, expand, name, feature, flowId, scriptDataVersion, divisionIds).withHttpInfo());
  }

  private GetScriptsPublishedDivisionviewsRequest createGetScriptsPublishedDivisionviewsRequest(Integer pageSize, Integer pageNumber, String expand, String name, String feature, String flowId, String scriptDataVersion, String divisionIds) {
    return GetScriptsPublishedDivisionviewsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withExpand(expand)

            .withName(name)

            .withFeature(feature)

            .withFlowId(flowId)

            .withScriptDataVersion(scriptDataVersion)

            .withDivisionIds(divisionIds)

            .build();
  }

  /**
   * Get the published scripts metadata.
   * 
   * @param request The request object
   * @return ScriptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScriptEntityListing getScriptsPublishedDivisionviews(GetScriptsPublishedDivisionviewsRequest request) throws IOException, ApiException {
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
   * Get the published scripts metadata.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScriptEntityListing> getScriptsPublishedDivisionviews(ApiRequest<Void> request) throws IOException {
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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Script
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Script getScriptsPublishedScriptId(String scriptId, String scriptDataVersion) throws IOException, ApiException {
    return  getScriptsPublishedScriptId(createGetScriptsPublishedScriptIdRequest(scriptId, scriptDataVersion));
  }

  /**
   * Get the published script.
   * 
   * @param scriptId Script ID (required)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Script
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Script> getScriptsPublishedScriptIdWithHttpInfo(String scriptId, String scriptDataVersion) throws IOException {
    return getScriptsPublishedScriptId(createGetScriptsPublishedScriptIdRequest(scriptId, scriptDataVersion).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdRequest createGetScriptsPublishedScriptIdRequest(String scriptId, String scriptDataVersion) {
    return GetScriptsPublishedScriptIdRequest.builder()
            .withScriptId(scriptId)

            .withScriptDataVersion(scriptDataVersion)

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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Page
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Page getScriptsPublishedScriptIdPage(String scriptId, String pageId, String scriptDataVersion) throws IOException, ApiException {
    return  getScriptsPublishedScriptIdPage(createGetScriptsPublishedScriptIdPageRequest(scriptId, pageId, scriptDataVersion));
  }

  /**
   * Get the published page.
   * 
   * @param scriptId Script ID (required)
   * @param pageId Page ID (required)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Page
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Page> getScriptsPublishedScriptIdPageWithHttpInfo(String scriptId, String pageId, String scriptDataVersion) throws IOException {
    return getScriptsPublishedScriptIdPage(createGetScriptsPublishedScriptIdPageRequest(scriptId, pageId, scriptDataVersion).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdPageRequest createGetScriptsPublishedScriptIdPageRequest(String scriptId, String pageId, String scriptDataVersion) {
    return GetScriptsPublishedScriptIdPageRequest.builder()
            .withScriptId(scriptId)

            .withPageId(pageId)

            .withScriptDataVersion(scriptDataVersion)

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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return List<Page>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Page> getScriptsPublishedScriptIdPages(String scriptId, String scriptDataVersion) throws IOException, ApiException {
    return  getScriptsPublishedScriptIdPages(createGetScriptsPublishedScriptIdPagesRequest(scriptId, scriptDataVersion));
  }

  /**
   * Get the list of published pages
   * 
   * @param scriptId Script ID (required)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return List<Page>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Page>> getScriptsPublishedScriptIdPagesWithHttpInfo(String scriptId, String scriptDataVersion) throws IOException {
    return getScriptsPublishedScriptIdPages(createGetScriptsPublishedScriptIdPagesRequest(scriptId, scriptDataVersion).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdPagesRequest createGetScriptsPublishedScriptIdPagesRequest(String scriptId, String scriptDataVersion) {
    return GetScriptsPublishedScriptIdPagesRequest.builder()
            .withScriptId(scriptId)

            .withScriptDataVersion(scriptDataVersion)

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
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getScriptsPublishedScriptIdVariables(String scriptId, String input, String output, String type, String scriptDataVersion) throws IOException, ApiException {
    return  getScriptsPublishedScriptIdVariables(createGetScriptsPublishedScriptIdVariablesRequest(scriptId, input, output, type, scriptDataVersion));
  }

  /**
   * Get the published variables
   * 
   * @param scriptId Script ID (required)
   * @param input input (optional)
   * @param output output (optional)
   * @param type type (optional)
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @return Object
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getScriptsPublishedScriptIdVariablesWithHttpInfo(String scriptId, String input, String output, String type, String scriptDataVersion) throws IOException {
    return getScriptsPublishedScriptIdVariables(createGetScriptsPublishedScriptIdVariablesRequest(scriptId, input, output, type, scriptDataVersion).withHttpInfo());
  }

  private GetScriptsPublishedScriptIdVariablesRequest createGetScriptsPublishedScriptIdVariablesRequest(String scriptId, String input, String output, String type, String scriptDataVersion) {
    return GetScriptsPublishedScriptIdVariablesRequest.builder()
            .withScriptId(scriptId)

            .withInput(input)

            .withOutput(output)

            .withType(type)

            .withScriptDataVersion(scriptDataVersion)

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

  /**
   * Get the upload status of an imported script
   * 
   * @param uploadId Upload ID (required)
   * @param longPoll Enable longPolling endpoint (optional, default to false)
   * @return ImportScriptStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportScriptStatusResponse getScriptsUploadStatus(String uploadId, Boolean longPoll) throws IOException, ApiException {
    return  getScriptsUploadStatus(createGetScriptsUploadStatusRequest(uploadId, longPoll));
  }

  /**
   * Get the upload status of an imported script
   * 
   * @param uploadId Upload ID (required)
   * @param longPoll Enable longPolling endpoint (optional, default to false)
   * @return ImportScriptStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportScriptStatusResponse> getScriptsUploadStatusWithHttpInfo(String uploadId, Boolean longPoll) throws IOException {
    return getScriptsUploadStatus(createGetScriptsUploadStatusRequest(uploadId, longPoll).withHttpInfo());
  }

  private GetScriptsUploadStatusRequest createGetScriptsUploadStatusRequest(String uploadId, Boolean longPoll) {
    return GetScriptsUploadStatusRequest.builder()
            .withUploadId(uploadId)

            .withLongPoll(longPoll)

            .build();
  }

  /**
   * Get the upload status of an imported script
   * 
   * @param request The request object
   * @return ImportScriptStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportScriptStatusResponse getScriptsUploadStatus(GetScriptsUploadStatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportScriptStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportScriptStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the upload status of an imported script
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportScriptStatusResponse> getScriptsUploadStatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportScriptStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportScriptStatusResponse> response = (ApiResponse<ImportScriptStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ImportScriptStatusResponse> response = (ApiResponse<ImportScriptStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Export a script via download service.
   * 
   * @param scriptId Script ID (required)
   * @param body  (optional)
   * @return ExportScriptResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportScriptResponse postScriptExport(String scriptId, ExportScriptRequest body) throws IOException, ApiException {
    return  postScriptExport(createPostScriptExportRequest(scriptId, body));
  }

  /**
   * Export a script via download service.
   * 
   * @param scriptId Script ID (required)
   * @param body  (optional)
   * @return ExportScriptResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportScriptResponse> postScriptExportWithHttpInfo(String scriptId, ExportScriptRequest body) throws IOException {
    return postScriptExport(createPostScriptExportRequest(scriptId, body).withHttpInfo());
  }

  private PostScriptExportRequest createPostScriptExportRequest(String scriptId, ExportScriptRequest body) {
    return PostScriptExportRequest.builder()
            .withScriptId(scriptId)

            .withBody(body)

            .build();
  }

  /**
   * Export a script via download service.
   * 
   * @param request The request object
   * @return ExportScriptResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportScriptResponse postScriptExport(PostScriptExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExportScriptResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExportScriptResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Export a script via download service.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportScriptResponse> postScriptExport(ApiRequest<ExportScriptRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExportScriptResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExportScriptResponse> response = (ApiResponse<ExportScriptResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ExportScriptResponse> response = (ApiResponse<ExportScriptResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish a script.
   * 
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param body body (optional)
   * @return Script
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Script postScriptsPublished(String scriptDataVersion, PublishScriptRequestData body) throws IOException, ApiException {
    return  postScriptsPublished(createPostScriptsPublishedRequest(scriptDataVersion, body));
  }

  /**
   * Publish a script.
   * 
   * @param scriptDataVersion Advanced usage - controls the data version of the script (optional)
   * @param body body (optional)
   * @return Script
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Script> postScriptsPublishedWithHttpInfo(String scriptDataVersion, PublishScriptRequestData body) throws IOException {
    return postScriptsPublished(createPostScriptsPublishedRequest(scriptDataVersion, body).withHttpInfo());
  }

  private PostScriptsPublishedRequest createPostScriptsPublishedRequest(String scriptDataVersion, PublishScriptRequestData body) {
    return PostScriptsPublishedRequest.builder()
            .withScriptDataVersion(scriptDataVersion)

            .withBody(body)

            .build();
  }

  /**
   * Publish a script.
   * 
   * @param request The request object
   * @return Script
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Script postScriptsPublished(PostScriptsPublishedRequest request) throws IOException, ApiException {
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
   * Publish a script.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Script> postScriptsPublished(ApiRequest<PublishScriptRequestData> request) throws IOException {
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

}
