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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class ScriptsApiAsync {
  private final ApiClient pcapiClient;

  public ScriptsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ScriptsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get a script
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Script> getScriptAsync(GetScriptRequest request, AsyncApiCallback<Script> callback) throws ApiException {
    return pcapiClient.<Script>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Script>() {}, callback);
  }

  /**
   * Get a script
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Script>> getScriptAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Script>> callback) throws ApiException {
    return pcapiClient.<Script>invokeAPIVerboseAsync(request, new TypeReference<Script>() {}, callback);
  }

  /**
   * Get a page
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Page> getScriptPageAsync(GetScriptPageRequest request, AsyncApiCallback<Page> callback) throws ApiException {
    return pcapiClient.<Page>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Page>() {}, callback);
  }

  /**
   * Get a page
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Page>> getScriptPageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Page>> callback) throws ApiException {
    return pcapiClient.<Page>invokeAPIVerboseAsync(request, new TypeReference<Page>() {}, callback);
  }

  /**
   * Get the list of pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<Page>> getScriptPagesAsync(GetScriptPagesRequest request, AsyncApiCallback<List<Page>> callback) throws ApiException {
    return pcapiClient.<List<Page>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<Page>>() {}, callback);
  }

  /**
   * Get the list of pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<Page>>> getScriptPagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<Page>>> callback) throws ApiException {
    return pcapiClient.<List<Page>>invokeAPIVerboseAsync(request, new TypeReference<List<Page>>() {}, callback);
  }

  /**
   * Get the list of scripts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ScriptEntityListing> getScriptsAsync(GetScriptsRequest request, AsyncApiCallback<ScriptEntityListing> callback) throws ApiException {
    return pcapiClient.<ScriptEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ScriptEntityListing>() {}, callback);
  }

  /**
   * Get the list of scripts
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ScriptEntityListing>> getScriptsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ScriptEntityListing>> callback) throws ApiException {
    return pcapiClient.<ScriptEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ScriptEntityListing>() {}, callback);
  }

  /**
   * Get the published scripts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ScriptEntityListing> getScriptsPublishedAsync(GetScriptsPublishedRequest request, AsyncApiCallback<ScriptEntityListing> callback) throws ApiException {
    return pcapiClient.<ScriptEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ScriptEntityListing>() {}, callback);
  }

  /**
   * Get the published scripts.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ScriptEntityListing>> getScriptsPublishedAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ScriptEntityListing>> callback) throws ApiException {
    return pcapiClient.<ScriptEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ScriptEntityListing>() {}, callback);
  }

  /**
   * Get the published script.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Script> getScriptsPublishedScriptIdAsync(GetScriptsPublishedScriptIdRequest request, AsyncApiCallback<Script> callback) throws ApiException {
    return pcapiClient.<Script>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Script>() {}, callback);
  }

  /**
   * Get the published script.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Script>> getScriptsPublishedScriptIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Script>> callback) throws ApiException {
    return pcapiClient.<Script>invokeAPIVerboseAsync(request, new TypeReference<Script>() {}, callback);
  }

  /**
   * Get the published page.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Page> getScriptsPublishedScriptIdPageAsync(GetScriptsPublishedScriptIdPageRequest request, AsyncApiCallback<Page> callback) throws ApiException {
    return pcapiClient.<Page>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Page>() {}, callback);
  }

  /**
   * Get the published page.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Page>> getScriptsPublishedScriptIdPageAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Page>> callback) throws ApiException {
    return pcapiClient.<Page>invokeAPIVerboseAsync(request, new TypeReference<Page>() {}, callback);
  }

  /**
   * Get the list of published pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<Page>> getScriptsPublishedScriptIdPagesAsync(GetScriptsPublishedScriptIdPagesRequest request, AsyncApiCallback<List<Page>> callback) throws ApiException {
    return pcapiClient.<List<Page>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<Page>>() {}, callback);
  }

  /**
   * Get the list of published pages
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<Page>>> getScriptsPublishedScriptIdPagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<Page>>> callback) throws ApiException {
    return pcapiClient.<List<Page>>invokeAPIVerboseAsync(request, new TypeReference<List<Page>>() {}, callback);
  }

  /**
   * Get the published variables
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Object> getScriptsPublishedScriptIdVariablesAsync(GetScriptsPublishedScriptIdVariablesRequest request, AsyncApiCallback<Object> callback) throws ApiException {
    return pcapiClient.<Object>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Object>() {}, callback);
  }

  /**
   * Get the published variables
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Object>> getScriptsPublishedScriptIdVariablesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Object>> callback) throws ApiException {
    return pcapiClient.<Object>invokeAPIVerboseAsync(request, new TypeReference<Object>() {}, callback);
  }

}
