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
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;


import com.mypurecloud.sdk.v2.api.request.GetLocationRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostLocationsSearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LocationsApi {
  private final ApiClient pcapiClient;

  public LocationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get Location by ID.
   * 
   * @param locationId Location ID (required)
   * @return LocationDefinition
   * @throws ApiException if fails to make API call
   */
  public LocationDefinition getLocation(String locationId) throws IOException, ApiException {
    return getLocationWithHttpInfo(locationId).getBody();
  }

  /**
   * Get Location by ID.
   * 
   * @param locationId Location ID (required)
   * @return LocationDefinition
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationDefinition> getLocationWithHttpInfo(String locationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'locationId' when calling getLocation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/locations/{locationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "locationId" + "\\}", pcapiClient.escapeString(locationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocationDefinition>() {});
  }

  /**
   * Get Location by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocationDefinition getLocation(GetLocationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocationDefinition>() {});
  }

  /**
   * Get Location by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationDefinition> getLocation(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LocationDefinition>invokeAPIVerbose(request, new TypeReference<LocationDefinition>() {});
  }

  /**
   * Get a list of all locations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @return List<LocationDefinition>
   * @throws ApiException if fails to make API call
   */
  public List<LocationDefinition> getLocations(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return getLocationsWithHttpInfo(pageSize, pageNumber, sortOrder).getBody();
  }

  /**
   * Get a list of all locations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @return List<LocationDefinition>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<LocationDefinition>> getLocationsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/locations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<LocationDefinition>>() {});
  }

  /**
   * Get a list of all locations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<LocationDefinition> getLocations(GetLocationsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<LocationDefinition>>() {});
  }

  /**
   * Get a list of all locations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<LocationDefinition>> getLocations(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<LocationDefinition>>invokeAPIVerbose(request, new TypeReference<List<LocationDefinition>>() {});
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse getLocationsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return getLocationsSearchWithHttpInfo(q64, expand).getBody();
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearchWithHttpInfo(String q64, List<String> expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'q64' is set
    if (q64 == null) {
      throw new IllegalArgumentException("Missing the required parameter 'q64' when calling getLocationsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/locations/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "q64", q64));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse getLocationsSearch(GetLocationsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearch(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerbose(request, new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse postLocationsSearch(LocationSearchRequest body) throws IOException, ApiException {
    return postLocationsSearchWithHttpInfo(body).getBody();
  }

  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearchWithHttpInfo(LocationSearchRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postLocationsSearch");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/locations/search".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LocationsSearchResponse postLocationsSearch(PostLocationsSearchRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearch(ApiRequest<LocationSearchRequest> request) throws IOException, ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerbose(request, new TypeReference<LocationsSearchResponse>() {});
  }

}
