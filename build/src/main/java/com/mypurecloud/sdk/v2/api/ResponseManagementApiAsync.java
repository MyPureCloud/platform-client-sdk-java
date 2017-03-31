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
import com.mypurecloud.sdk.v2.model.LibraryEntityListing;
import com.mypurecloud.sdk.v2.model.Library;
import com.mypurecloud.sdk.v2.model.Response;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteResponsemanagementResponseRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementLibrariesRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponseRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponsesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementLibrariesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponsesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponsesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.PutResponsemanagementResponseRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class ResponseManagementApiAsync {
  private final ApiClient pcapiClient;

  public ResponseManagementApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ResponseManagementApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteResponsemanagementLibraryAsync(DeleteResponsemanagementLibraryRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteResponsemanagementLibraryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteResponsemanagementResponseAsync(DeleteResponsemanagementResponseRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteResponsemanagementResponseAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LibraryEntityListing> getResponsemanagementLibrariesAsync(GetResponsemanagementLibrariesRequest request, AsyncApiCallback<LibraryEntityListing> callback) {
    return pcapiClient.<LibraryEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LibraryEntityListing>() {}, callback);
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LibraryEntityListing>> getResponsemanagementLibrariesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LibraryEntityListing>> callback) {
    return pcapiClient.<LibraryEntityListing>invokeAPIVerboseAsync(request, new TypeReference<LibraryEntityListing>() {}, callback);
  }

  /**
   * Get details about an existing response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Library> getResponsemanagementLibraryAsync(GetResponsemanagementLibraryRequest request, AsyncApiCallback<Library> callback) {
    return pcapiClient.<Library>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Library>() {}, callback);
  }

  /**
   * Get details about an existing response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Library>> getResponsemanagementLibraryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Library>> callback) {
    return pcapiClient.<Library>invokeAPIVerboseAsync(request, new TypeReference<Library>() {}, callback);
  }

  /**
   * Get details about an existing response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Response> getResponsemanagementResponseAsync(GetResponsemanagementResponseRequest request, AsyncApiCallback<Response> callback) {
    return pcapiClient.<Response>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Response>() {}, callback);
  }

  /**
   * Get details about an existing response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Response>> getResponsemanagementResponseAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Response>> callback) {
    return pcapiClient.<Response>invokeAPIVerboseAsync(request, new TypeReference<Response>() {}, callback);
  }

  /**
   * Gets a list of existing responses.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ResponseEntityListing> getResponsemanagementResponsesAsync(GetResponsemanagementResponsesRequest request, AsyncApiCallback<ResponseEntityListing> callback) {
    return pcapiClient.<ResponseEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ResponseEntityListing>() {}, callback);
  }

  /**
   * Gets a list of existing responses.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ResponseEntityListing>> getResponsemanagementResponsesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ResponseEntityListing>> callback) {
    return pcapiClient.<ResponseEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ResponseEntityListing>() {}, callback);
  }

  /**
   * Create a response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Library> postResponsemanagementLibrariesAsync(PostResponsemanagementLibrariesRequest request, AsyncApiCallback<Library> callback) {
    return pcapiClient.<Library>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Library>() {}, callback);
  }

  /**
   * Create a response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Library>> postResponsemanagementLibrariesAsync(ApiRequest<Library> request, AsyncApiCallback<ApiResponse<Library>> callback) {
    return pcapiClient.<Library>invokeAPIVerboseAsync(request, new TypeReference<Library>() {}, callback);
  }

  /**
   * Create a response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Response> postResponsemanagementResponsesAsync(PostResponsemanagementResponsesRequest request, AsyncApiCallback<Response> callback) {
    return pcapiClient.<Response>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Response>() {}, callback);
  }

  /**
   * Create a response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Response>> postResponsemanagementResponsesAsync(ApiRequest<Response> request, AsyncApiCallback<ApiResponse<Response>> callback) {
    return pcapiClient.<Response>invokeAPIVerboseAsync(request, new TypeReference<Response>() {}, callback);
  }

  /**
   * Query responses
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ResponseQueryResults> postResponsemanagementResponsesQueryAsync(PostResponsemanagementResponsesQueryRequest request, AsyncApiCallback<ResponseQueryResults> callback) {
    return pcapiClient.<ResponseQueryResults>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ResponseQueryResults>() {}, callback);
  }

  /**
   * Query responses
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ResponseQueryResults>> postResponsemanagementResponsesQueryAsync(ApiRequest<ResponseQueryRequest> request, AsyncApiCallback<ApiResponse<ResponseQueryResults>> callback) {
    return pcapiClient.<ResponseQueryResults>invokeAPIVerboseAsync(request, new TypeReference<ResponseQueryResults>() {}, callback);
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Library> putResponsemanagementLibraryAsync(PutResponsemanagementLibraryRequest request, AsyncApiCallback<Library> callback) {
    return pcapiClient.<Library>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Library>() {}, callback);
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Library>> putResponsemanagementLibraryAsync(ApiRequest<Library> request, AsyncApiCallback<ApiResponse<Library>> callback) {
    return pcapiClient.<Library>invokeAPIVerboseAsync(request, new TypeReference<Library>() {}, callback);
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Response> putResponsemanagementResponseAsync(PutResponsemanagementResponseRequest request, AsyncApiCallback<Response> callback) {
    return pcapiClient.<Response>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Response>() {}, callback);
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Response>> putResponsemanagementResponseAsync(ApiRequest<Response> request, AsyncApiCallback<ApiResponse<Response>> callback) {
    return pcapiClient.<Response>invokeAPIVerboseAsync(request, new TypeReference<Response>() {}, callback);
  }

}
