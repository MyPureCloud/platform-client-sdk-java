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
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationDefinition getLocation(String locationId) throws IOException, ApiException {
    return  getLocation(createGetLocationRequest(locationId));
  }

  /**
   * Get Location by ID.
   * 
   * @param locationId Location ID (required)
   * @return LocationDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationDefinition> getLocationWithHttpInfo(String locationId) throws IOException {
    return getLocation(createGetLocationRequest(locationId).withHttpInfo());
  }

  private GetLocationRequest createGetLocationRequest(String locationId) {
    return GetLocationRequest.builder()
            .withLocationId(locationId)
            .build();
  }

  /**
   * Get Location by ID.
   * 
   * @param request The request object
   * @return LocationDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationDefinition getLocation(GetLocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LocationDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LocationDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Location by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationDefinition> getLocation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LocationDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LocationDefinition> response = (ApiResponse<LocationDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<LocationDefinition> response = (ApiResponse<LocationDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of all locations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @return List<LocationDefinition>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<LocationDefinition> getLocations(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getLocations(createGetLocationsRequest(pageSize, pageNumber, sortOrder));
  }

  /**
   * Get a list of all locations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional)
   * @return List<LocationDefinition>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<LocationDefinition>> getLocationsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getLocations(createGetLocationsRequest(pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetLocationsRequest createGetLocationsRequest(Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetLocationsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Get a list of all locations.
   * 
   * @param request The request object
   * @return List<LocationDefinition>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<LocationDefinition> getLocations(GetLocationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<LocationDefinition>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<LocationDefinition>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of all locations.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<LocationDefinition>> getLocations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<LocationDefinition>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<LocationDefinition>> response = (ApiResponse<List<LocationDefinition>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<LocationDefinition>> response = (ApiResponse<List<LocationDefinition>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse getLocationsSearch(String q64, List<String> expand) throws IOException, ApiException {
    return  getLocationsSearch(createGetLocationsSearchRequest(q64, expand));
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand expand (optional)
   * @return LocationsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearchWithHttpInfo(String q64, List<String> expand) throws IOException {
    return getLocationsSearch(createGetLocationsSearchRequest(q64, expand).withHttpInfo());
  }

  private GetLocationsSearchRequest createGetLocationsSearchRequest(String q64, List<String> expand) {
    return GetLocationsSearchRequest.builder()
            .withQ64(q64)

            .withExpand(expand)
            .build();
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse getLocationsSearch(GetLocationsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LocationsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> getLocationsSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LocationsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse postLocationsSearch(LocationSearchRequest body) throws IOException, ApiException {
    return  postLocationsSearch(createPostLocationsSearchRequest(body));
  }

  /**
   * Search locations
   * 
   * @param body Search request options (required)
   * @return LocationsSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearchWithHttpInfo(LocationSearchRequest body) throws IOException {
    return postLocationsSearch(createPostLocationsSearchRequest(body).withHttpInfo());
  }

  private PostLocationsSearchRequest createPostLocationsSearchRequest(LocationSearchRequest body) {
    return PostLocationsSearchRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Search locations
   * 
   * @param request The request object
   * @return LocationsSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationsSearchResponse postLocationsSearch(PostLocationsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LocationsSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search locations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationsSearchResponse> postLocationsSearch(ApiRequest<LocationSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LocationsSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
