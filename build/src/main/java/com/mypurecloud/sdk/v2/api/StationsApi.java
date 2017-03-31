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


import com.mypurecloud.sdk.v2.api.request.DeleteStationAssociateduserRequest;
import com.mypurecloud.sdk.v2.api.request.GetStationRequest;
import com.mypurecloud.sdk.v2.api.request.GetStationsRequest;

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
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteStationAssociateduser(String stationId) throws IOException, ApiException {
    return deleteStationAssociateduserWithHttpInfo(stationId).getBody();
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @param stationId Station ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteStationAssociateduserWithHttpInfo(String stationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'stationId' is set
    if (stationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'stationId' when calling deleteStationAssociateduser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/stations/{stationId}/associateduser".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "stationId" + "\\}", pcapiClient.escapeString(stationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteStationAssociateduser(DeleteStationAssociateduserRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteStationAssociateduser(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Get station.
   * 
   * @param stationId Station ID (required)
   * @return Station
   * @throws ApiException if fails to make API call
   */
  public Station getStation(String stationId) throws IOException, ApiException {
    return getStationWithHttpInfo(stationId).getBody();
  }

  /**
   * Get station.
   * 
   * @param stationId Station ID (required)
   * @return Station
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Station> getStationWithHttpInfo(String stationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'stationId' is set
    if (stationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'stationId' when calling getStation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/stations/{stationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "stationId" + "\\}", pcapiClient.escapeString(stationId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Station>() {});
  }

  /**
   * Get station.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Station getStation(GetStationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Station>() {});
  }

  /**
   * Get station.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Station> getStation(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Station>invokeAPIVerbose(request, new TypeReference<Station>() {});
  }

  /**
   * Get the list of available stations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param id Comma separated list of stationIds (optional)
   * @param lineAppearanceId lineAppearanceId (optional)
   * @return StationEntityListing
   * @throws ApiException if fails to make API call
   */
  public StationEntityListing getStations(Integer pageSize, Integer pageNumber, String sortBy, String name, String id, String lineAppearanceId) throws IOException, ApiException {
    return getStationsWithHttpInfo(pageSize, pageNumber, sortBy, name, id, lineAppearanceId).getBody();
  }

  /**
   * Get the list of available stations.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param id Comma separated list of stationIds (optional)
   * @param lineAppearanceId lineAppearanceId (optional)
   * @return StationEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StationEntityListing> getStationsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String name, String id, String lineAppearanceId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/stations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "id", id));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "lineAppearanceId", lineAppearanceId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<StationEntityListing>() {});
  }

  /**
   * Get the list of available stations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public StationEntityListing getStations(GetStationsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<StationEntityListing>() {});
  }

  /**
   * Get the list of available stations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StationEntityListing> getStations(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<StationEntityListing>invokeAPIVerbose(request, new TypeReference<StationEntityListing>() {});
  }

}
