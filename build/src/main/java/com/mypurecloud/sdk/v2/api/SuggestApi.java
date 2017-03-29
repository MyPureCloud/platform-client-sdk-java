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
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearch(String q64, List<String> expand, Boolean profile) throws ApiException {
    return getSearchWithHttpInfo(q64, expand, profile).getBody();
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchWithHttpInfo(String q64, List<String> expand, Boolean profile) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new ApiException(400, "Missing the required parameter 'q64' when calling getSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearch(GetSearchRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search using the q64 value returned from a previous search.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearch(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearchSuggest(String q64, List<String> expand, Boolean profile) throws ApiException {
    return getSearchSuggestWithHttpInfo(q64, expand, profile).getBody();
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param q64 q64 (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggestWithHttpInfo(String q64, List<String> expand, Boolean profile) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new ApiException(400, "Missing the required parameter 'q64' when calling getSearchSuggest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search/suggest".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse getSearchSuggest(GetSearchSuggestRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> getSearchSuggest(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearch(SearchRequest body, Boolean profile) throws ApiException {
    return postSearchWithHttpInfo(body, profile).getBody();
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchWithHttpInfo(SearchRequest body, Boolean profile) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearch(PostSearchRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Search resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearch(ApiRequest<SearchRequest> request) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearchSuggest(SuggestSearchRequest body, Boolean profile) throws ApiException {
    return postSearchSuggestWithHttpInfo(body, profile).getBody();
  }

  /**
   * Suggest resources.
   * 
   * @param body Search request options (required)
   * @param profile profile (optional, default to true)
   * @return JsonNodeSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggestWithHttpInfo(SuggestSearchRequest body, Boolean profile) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postSearchSuggest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/search/suggest".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "profile", profile));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public JsonNodeSearchResponse postSearchSuggest(PostSearchSuggestRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {});
  }

  /**
   * Suggest resources.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonNodeSearchResponse> postSearchSuggest(ApiRequest<SuggestSearchRequest> request) throws ApiException {
    return pcapiClient.<JsonNodeSearchResponse>invokeAPIVerbose(request, new TypeReference<JsonNodeSearchResponse>() {});
  }

}
