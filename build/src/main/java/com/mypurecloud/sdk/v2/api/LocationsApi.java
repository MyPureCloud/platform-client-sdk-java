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
import com.mypurecloud.sdk.v2.model.LocationEntityListing;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationUpdateDefinition;
import com.mypurecloud.sdk.v2.model.LocationCreateDefinition;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteLocationRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationSublocationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLocationRequest;
import com.mypurecloud.sdk.v2.api.request.PostLocationsRequest;
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
   * Delete a location
   * 
   * @param locationId Location ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLocation(String locationId) throws IOException, ApiException {
     deleteLocation(createDeleteLocationRequest(locationId));
  }

  /**
   * Delete a location
   * 
   * @param locationId Location ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLocationWithHttpInfo(String locationId) throws IOException {
    return deleteLocation(createDeleteLocationRequest(locationId).withHttpInfo());
  }

  private DeleteLocationRequest createDeleteLocationRequest(String locationId) {
    return DeleteLocationRequest.builder()
            .withLocationId(locationId)
    
            .build();
  }

  /**
   * Delete a location
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLocation(DeleteLocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a location
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLocation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
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
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Location by ID.
   * 
   * @param locationId Location ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return LocationDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationDefinition getLocation(String locationId, List<String> expand) throws IOException, ApiException {
    return  getLocation(createGetLocationRequest(locationId, expand));
  }

  /**
   * Get Location by ID.
   * 
   * @param locationId Location ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return LocationDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationDefinition> getLocationWithHttpInfo(String locationId, List<String> expand) throws IOException {
    return getLocation(createGetLocationRequest(locationId, expand).withHttpInfo());
  }

  private GetLocationRequest createGetLocationRequest(String locationId, List<String> expand) {
    return GetLocationRequest.builder()
            .withLocationId(locationId)
    
            .withExpand(expand)
    
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
   * Get sublocations for location ID.
   * 
   * @param locationId Location ID (required)
   * @return LocationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationEntityListing getLocationSublocations(String locationId) throws IOException, ApiException {
    return  getLocationSublocations(createGetLocationSublocationsRequest(locationId));
  }

  /**
   * Get sublocations for location ID.
   * 
   * @param locationId Location ID (required)
   * @return LocationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationEntityListing> getLocationSublocationsWithHttpInfo(String locationId) throws IOException {
    return getLocationSublocations(createGetLocationSublocationsRequest(locationId).withHttpInfo());
  }

  private GetLocationSublocationsRequest createGetLocationSublocationsRequest(String locationId) {
    return GetLocationSublocationsRequest.builder()
            .withLocationId(locationId)
    
            .build();
  }

  /**
   * Get sublocations for location ID.
   * 
   * @param request The request object
   * @return LocationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationEntityListing getLocationSublocations(GetLocationSublocationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LocationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LocationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get sublocations for location ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationEntityListing> getLocationSublocations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LocationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LocationEntityListing> response = (ApiResponse<LocationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LocationEntityListing> response = (ApiResponse<LocationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of all locations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Sort order (optional)
   * @return LocationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationEntityListing getLocations(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder) throws IOException, ApiException {
    return  getLocations(createGetLocationsRequest(pageSize, pageNumber, id, sortOrder));
  }

  /**
   * Get a list of all locations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id id (optional)
   * @param sortOrder Sort order (optional)
   * @return LocationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationEntityListing> getLocationsWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder) throws IOException {
    return getLocations(createGetLocationsRequest(pageSize, pageNumber, id, sortOrder).withHttpInfo());
  }

  private GetLocationsRequest createGetLocationsRequest(Integer pageSize, Integer pageNumber, List<String> id, String sortOrder) {
    return GetLocationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withId(id)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get a list of all locations.
   * 
   * @param request The request object
   * @return LocationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationEntityListing getLocations(GetLocationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LocationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LocationEntityListing>() {});
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
  public ApiResponse<LocationEntityListing> getLocations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LocationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LocationEntityListing> response = (ApiResponse<LocationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LocationEntityListing> response = (ApiResponse<LocationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search locations using the q64 value returned from a previous search
   * 
   * @param q64 q64 (required)
   * @param expand Provides more details about a specified resource (optional)
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
   * @param expand Provides more details about a specified resource (optional)
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
   * Update a location
   * 
   * @param locationId Location ID (required)
   * @param body Location (required)
   * @return LocationDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationDefinition patchLocation(String locationId, LocationUpdateDefinition body) throws IOException, ApiException {
    return  patchLocation(createPatchLocationRequest(locationId, body));
  }

  /**
   * Update a location
   * 
   * @param locationId Location ID (required)
   * @param body Location (required)
   * @return LocationDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationDefinition> patchLocationWithHttpInfo(String locationId, LocationUpdateDefinition body) throws IOException {
    return patchLocation(createPatchLocationRequest(locationId, body).withHttpInfo());
  }

  private PatchLocationRequest createPatchLocationRequest(String locationId, LocationUpdateDefinition body) {
    return PatchLocationRequest.builder()
            .withLocationId(locationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a location
   * 
   * @param request The request object
   * @return LocationDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationDefinition patchLocation(PatchLocationRequest request) throws IOException, ApiException {
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
   * Update a location
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationDefinition> patchLocation(ApiRequest<LocationUpdateDefinition> request) throws IOException {
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
   * Create a location
   * 
   * @param body Location (required)
   * @return LocationDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationDefinition postLocations(LocationCreateDefinition body) throws IOException, ApiException {
    return  postLocations(createPostLocationsRequest(body));
  }

  /**
   * Create a location
   * 
   * @param body Location (required)
   * @return LocationDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationDefinition> postLocationsWithHttpInfo(LocationCreateDefinition body) throws IOException {
    return postLocations(createPostLocationsRequest(body).withHttpInfo());
  }

  private PostLocationsRequest createPostLocationsRequest(LocationCreateDefinition body) {
    return PostLocationsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a location
   * 
   * @param request The request object
   * @return LocationDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LocationDefinition postLocations(PostLocationsRequest request) throws IOException, ApiException {
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
   * Create a location
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LocationDefinition> postLocations(ApiRequest<LocationCreateDefinition> request) throws IOException {
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
