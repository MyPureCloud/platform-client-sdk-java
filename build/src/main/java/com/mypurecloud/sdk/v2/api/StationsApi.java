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
import com.mypurecloud.sdk.v2.model.Station;
import com.mypurecloud.sdk.v2.model.StationEntityListing;
import com.mypurecloud.sdk.v2.model.StationSettings;


import com.mypurecloud.sdk.v2.api.request.DeleteStationAssociateduserRequest;
import com.mypurecloud.sdk.v2.api.request.GetStationRequest;
import com.mypurecloud.sdk.v2.api.request.GetStationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetStationsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchStationsSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StationsApi {
  private final ApiClient pcapiClient;

  public StationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StationsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Unassigns the user assigned to this station
   * 
   * @param stationId Station ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteStationAssociateduser(String stationId) throws IOException, ApiException {
     deleteStationAssociateduser(createDeleteStationAssociateduserRequest(stationId));
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @param stationId Station ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteStationAssociateduserWithHttpInfo(String stationId) throws IOException {
    return deleteStationAssociateduser(createDeleteStationAssociateduserRequest(stationId).withHttpInfo());
  }

  private DeleteStationAssociateduserRequest createDeleteStationAssociateduserRequest(String stationId) {
    return DeleteStationAssociateduserRequest.builder()
            .withStationId(stationId)
    
            .build();
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteStationAssociateduser(DeleteStationAssociateduserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteStationAssociateduser(ApiRequest<Void> request) throws IOException {
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
   * Get station.
   * 
   * @param stationId Station ID (required)
   * @return Station
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Station getStation(String stationId) throws IOException, ApiException {
    return  getStation(createGetStationRequest(stationId));
  }

  /**
   * Get station.
   * 
   * @param stationId Station ID (required)
   * @return Station
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Station> getStationWithHttpInfo(String stationId) throws IOException {
    return getStation(createGetStationRequest(stationId).withHttpInfo());
  }

  private GetStationRequest createGetStationRequest(String stationId) {
    return GetStationRequest.builder()
            .withStationId(stationId)
    
            .build();
  }

  /**
   * Get station.
   * 
   * @param request The request object
   * @return Station
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Station getStation(GetStationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Station> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Station>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get station.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Station> getStation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Station>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Station> response = (ApiResponse<Station>)(ApiResponse<?>)exception;
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
      ApiResponse<Station> response = (ApiResponse<Station>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of available stations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param userSelectable True for stations that the user can select otherwise false (optional)
   * @param webRtcUserId Filter for the webRtc station of the webRtcUserId (optional)
   * @param id Comma separated list of stationIds (optional)
   * @param lineAppearanceId lineAppearanceId (optional)
   * @return StationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StationEntityListing getStations(Integer pageSize, Integer pageNumber, String sortBy, String name, String userSelectable, String webRtcUserId, String id, String lineAppearanceId) throws IOException, ApiException {
    return  getStations(createGetStationsRequest(pageSize, pageNumber, sortBy, name, userSelectable, webRtcUserId, id, lineAppearanceId));
  }

  /**
   * Get the list of available stations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param userSelectable True for stations that the user can select otherwise false (optional)
   * @param webRtcUserId Filter for the webRtc station of the webRtcUserId (optional)
   * @param id Comma separated list of stationIds (optional)
   * @param lineAppearanceId lineAppearanceId (optional)
   * @return StationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StationEntityListing> getStationsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String name, String userSelectable, String webRtcUserId, String id, String lineAppearanceId) throws IOException {
    return getStations(createGetStationsRequest(pageSize, pageNumber, sortBy, name, userSelectable, webRtcUserId, id, lineAppearanceId).withHttpInfo());
  }

  private GetStationsRequest createGetStationsRequest(Integer pageSize, Integer pageNumber, String sortBy, String name, String userSelectable, String webRtcUserId, String id, String lineAppearanceId) {
    return GetStationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withName(name)
    
            .withUserSelectable(userSelectable)
    
            .withWebRtcUserId(webRtcUserId)
    
            .withId(id)
    
            .withLineAppearanceId(lineAppearanceId)
    
            .build();
  }

  /**
   * Get the list of available stations.
   * 
   * @param request The request object
   * @return StationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StationEntityListing getStations(GetStationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of available stations.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StationEntityListing> getStations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StationEntityListing> response = (ApiResponse<StationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<StationEntityListing> response = (ApiResponse<StationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an organization&#39;s StationSettings
   * 
   * @return StationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StationSettings getStationsSettings() throws IOException, ApiException {
    return  getStationsSettings(createGetStationsSettingsRequest());
  }

  /**
   * Get an organization&#39;s StationSettings
   * 
   * @return StationSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StationSettings> getStationsSettingsWithHttpInfo() throws IOException {
    return getStationsSettings(createGetStationsSettingsRequest().withHttpInfo());
  }

  private GetStationsSettingsRequest createGetStationsSettingsRequest() {
    return GetStationsSettingsRequest.builder()
            .build();
  }

  /**
   * Get an organization&#39;s StationSettings
   * 
   * @param request The request object
   * @return StationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StationSettings getStationsSettings(GetStationsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StationSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StationSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an organization&#39;s StationSettings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StationSettings> getStationsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StationSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StationSettings> response = (ApiResponse<StationSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<StationSettings> response = (ApiResponse<StationSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch an organization&#39;s StationSettings
   * 
   * @param body Station settings (required)
   * @return StationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StationSettings patchStationsSettings(StationSettings body) throws IOException, ApiException {
    return  patchStationsSettings(createPatchStationsSettingsRequest(body));
  }

  /**
   * Patch an organization&#39;s StationSettings
   * 
   * @param body Station settings (required)
   * @return StationSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StationSettings> patchStationsSettingsWithHttpInfo(StationSettings body) throws IOException {
    return patchStationsSettings(createPatchStationsSettingsRequest(body).withHttpInfo());
  }

  private PatchStationsSettingsRequest createPatchStationsSettingsRequest(StationSettings body) {
    return PatchStationsSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Patch an organization&#39;s StationSettings
   * 
   * @param request The request object
   * @return StationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StationSettings patchStationsSettings(PatchStationsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StationSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StationSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch an organization&#39;s StationSettings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StationSettings> patchStationsSettings(ApiRequest<StationSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StationSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StationSettings> response = (ApiResponse<StationSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<StationSettings> response = (ApiResponse<StationSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
