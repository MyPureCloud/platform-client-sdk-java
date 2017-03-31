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
import com.mypurecloud.sdk.v2.model.FaxDocument;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.FaxDocumentEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSummary;


import com.mypurecloud.sdk.v2.api.request.DeleteFaxDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxDocumentContentRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.PutFaxDocumentRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class FaxApiAsync {
  private final ApiClient pcapiClient;

  public FaxApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public FaxApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteFaxDocumentAsync(DeleteFaxDocumentRequest request, AsyncApiCallback<Void> callback) {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Delete a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteFaxDocumentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FaxDocument> getFaxDocumentAsync(GetFaxDocumentRequest request, AsyncApiCallback<FaxDocument> callback) {
    return pcapiClient.<FaxDocument>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FaxDocument>() {}, callback);
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FaxDocument>> getFaxDocumentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FaxDocument>> callback) {
    return pcapiClient.<FaxDocument>invokeAPIVerboseAsync(request, new TypeReference<FaxDocument>() {}, callback);
  }

  /**
   * Download a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DownloadResponse> getFaxDocumentContentAsync(GetFaxDocumentContentRequest request, AsyncApiCallback<DownloadResponse> callback) {
    return pcapiClient.<DownloadResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DownloadResponse>() {}, callback);
  }

  /**
   * Download a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DownloadResponse>> getFaxDocumentContentAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DownloadResponse>> callback) {
    return pcapiClient.<DownloadResponse>invokeAPIVerboseAsync(request, new TypeReference<DownloadResponse>() {}, callback);
  }

  /**
   * Get a list of fax documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FaxDocumentEntityListing> getFaxDocumentsAsync(GetFaxDocumentsRequest request, AsyncApiCallback<FaxDocumentEntityListing> callback) {
    return pcapiClient.<FaxDocumentEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FaxDocumentEntityListing>() {}, callback);
  }

  /**
   * Get a list of fax documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FaxDocumentEntityListing>> getFaxDocumentsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FaxDocumentEntityListing>> callback) {
    return pcapiClient.<FaxDocumentEntityListing>invokeAPIVerboseAsync(request, new TypeReference<FaxDocumentEntityListing>() {}, callback);
  }

  /**
   * Get fax summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FaxSummary> getFaxSummaryAsync(GetFaxSummaryRequest request, AsyncApiCallback<FaxSummary> callback) {
    return pcapiClient.<FaxSummary>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FaxSummary>() {}, callback);
  }

  /**
   * Get fax summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FaxSummary>> getFaxSummaryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FaxSummary>> callback) {
    return pcapiClient.<FaxSummary>invokeAPIVerboseAsync(request, new TypeReference<FaxSummary>() {}, callback);
  }

  /**
   * Update a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<FaxDocument> putFaxDocumentAsync(PutFaxDocumentRequest request, AsyncApiCallback<FaxDocument> callback) {
    return pcapiClient.<FaxDocument>invokeAPIAsync(request.withHttpInfo(), new TypeReference<FaxDocument>() {}, callback);
  }

  /**
   * Update a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<FaxDocument>> putFaxDocumentAsync(ApiRequest<FaxDocument> request, AsyncApiCallback<ApiResponse<FaxDocument>> callback) {
    return pcapiClient.<FaxDocument>invokeAPIVerboseAsync(request, new TypeReference<FaxDocument>() {}, callback);
  }

}
