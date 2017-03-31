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
import com.mypurecloud.sdk.v2.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.v2.model.SearchRequest;
import com.mypurecloud.sdk.v2.model.SuggestSearchRequest;


import com.mypurecloud.sdk.v2.api.request.GetSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetSearchSuggestRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchSuggestRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class SuggestApiAsync {
  private final ApiClient pcapiClient;

  public SuggestApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public SuggestApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> getSearchAsync(GetSearchRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> getSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> getSearchSuggestAsync(GetSearchSuggestRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> getSearchSuggestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> postSearchAsync(PostSearchRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> postSearchAsync(ApiRequest<SearchRequest> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<JsonNodeSearchResponse> postSearchSuggestAsync(PostSearchSuggestRequest request, AsyncApiCallback<JsonNodeSearchResponse> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> postSearchSuggestAsync(ApiRequest<SuggestSearchRequest> request, AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, callback);
  }

}
