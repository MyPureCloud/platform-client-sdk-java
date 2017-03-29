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
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;


import com.mypurecloud.sdk.v2.api.request.GetLocationRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostLocationsSearchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class LocationsApiAsync {
  private final ApiClient pcapiClient;

  public LocationsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get Location by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocationDefinition> getLocationAsync(GetLocationRequest request, AsyncApiCallback<LocationDefinition> callback) throws ApiException {
    return pcapiClient.<LocationDefinition>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocationDefinition>() {}, callback);
  }

  /**
   * Get Location by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocationDefinition>> getLocationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LocationDefinition>> callback) throws ApiException {
    return pcapiClient.<LocationDefinition>invokeAPIVerboseAsync(request, new TypeReference<LocationDefinition>() {}, callback);
  }

  /**
   * Get a list of all locations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<LocationDefinition>> getLocationsAsync(GetLocationsRequest request, AsyncApiCallback<List<LocationDefinition>> callback) throws ApiException {
    return pcapiClient.<List<LocationDefinition>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<LocationDefinition>>() {}, callback);
  }

  /**
   * Get a list of all locations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<LocationDefinition>>> getLocationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<LocationDefinition>>> callback) throws ApiException {
    return pcapiClient.<List<LocationDefinition>>invokeAPIVerboseAsync(request, new TypeReference<List<LocationDefinition>>() {}, callback);
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocationsSearchResponse> getLocationsSearchAsync(GetLocationsSearchRequest request, AsyncApiCallback<LocationsSearchResponse> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, callback);
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocationsSearchResponse>> getLocationsSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<LocationsSearchResponse>() {}, callback);
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LocationsSearchResponse> postLocationsSearchAsync(PostLocationsSearchRequest request, AsyncApiCallback<LocationsSearchResponse> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, callback);
  }

  /**
   * Search locations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LocationsSearchResponse>> postLocationsSearchAsync(ApiRequest<LocationSearchRequest> request, AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) throws ApiException {
    return pcapiClient.<LocationsSearchResponse>invokeAPIVerboseAsync(request, new TypeReference<LocationsSearchResponse>() {}, callback);
  }

}
