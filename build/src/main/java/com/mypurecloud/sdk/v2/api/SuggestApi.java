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


public class SuggestApi {
  private final ApiClient pcapiClient;

  public SuggestApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SuggestApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearch(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    return  getSearch(createGetSearchRequest(q64, expand, profile));
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchWithHttpInfo(String q64, List<String> expand, Boolean profile) throws IOException {
    return getSearch(createGetSearchRequest(q64, expand, profile).withHttpInfo());
  }

  private GetSearchRequest createGetSearchRequest(String q64, List<String> expand, Boolean profile) {
    return GetSearchRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearch(GetSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearchSuggest(String q64, List<String> expand, Boolean profile) throws IOException, ApiException {
    return  getSearchSuggest(createGetSearchSuggestRequest(q64, expand, profile));
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggestWithHttpInfo(String q64, List<String> expand, Boolean profile) throws IOException {
    return getSearchSuggest(createGetSearchSuggestRequest(q64, expand, profile).withHttpInfo());
  }

  private GetSearchSuggestRequest createGetSearchSuggestRequest(String q64, List<String> expand, Boolean profile) {
    return GetSearchSuggestRequest.builder()
            .withQ64(q64)
    
            .withExpand(expand)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse getSearchSuggest(GetSearchSuggestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearch(SearchRequest body, Boolean profile) throws IOException, ApiException {
    return  postSearch(createPostSearchRequest(body, profile));
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchWithHttpInfo(SearchRequest body, Boolean profile) throws IOException {
    return postSearch(createPostSearchRequest(body, profile).withHttpInfo());
  }

  private PostSearchRequest createPostSearchRequest(SearchRequest body, Boolean profile) {
    return PostSearchRequest.builder()
            .withBody(body)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearch(PostSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearch(ApiRequest<SearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearchSuggest(SuggestSearchRequest body, Boolean profile) throws IOException, ApiException {
    return  postSearchSuggest(createPostSearchSuggestRequest(body, profile));
  }

  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggestWithHttpInfo(SuggestSearchRequest body, Boolean profile) throws IOException {
    return postSearchSuggest(createPostSearchSuggestRequest(body, profile).withHttpInfo());
  }

  private PostSearchSuggestRequest createPostSearchSuggestRequest(SuggestSearchRequest body, Boolean profile) {
    return PostSearchSuggestRequest.builder()
            .withBody(body)
    
            .withProfile(profile)
    
            .build();
  }

  /**
   * Suggest resources.
   * 
   * @param request The request object
   * @return JsonNodeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonNodeSearchResponse postSearchSuggest(PostSearchSuggestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonNodeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Suggest resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggest(ApiRequest<SuggestSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonNodeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
