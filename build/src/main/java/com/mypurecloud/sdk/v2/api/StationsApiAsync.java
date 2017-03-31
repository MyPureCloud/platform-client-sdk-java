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
import java.util.concurrent.Future;


public class StationsApiAsync {
  private final ApiClient pcapiClient;

  public StationsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public StationsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteStationAssociateduserAsync(DeleteStationAssociateduserRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Unassigns the user assigned to this station
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteStationAssociateduserAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Get station.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Station> getStationAsync(GetStationRequest request, AsyncApiCallback<Station> callback) {
    return pcapiClient.<Station>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Station>() {}, callback);
  }

  /**
   * Get station.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Station>> getStationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Station>> callback) {
    return pcapiClient.<Station>invokeAPIVerboseAsync(request, new TypeReference<Station>() {}, callback);
  }

  /**
   * Get the list of available stations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<StationEntityListing> getStationsAsync(GetStationsRequest request, AsyncApiCallback<StationEntityListing> callback) {
    return pcapiClient.<StationEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<StationEntityListing>() {}, callback);
  }

  /**
   * Get the list of available stations.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<StationEntityListing>> getStationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<StationEntityListing>> callback) {
    return pcapiClient.<StationEntityListing>invokeAPIVerboseAsync(request, new TypeReference<StationEntityListing>() {}, callback);
  }

}
