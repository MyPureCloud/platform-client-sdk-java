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
import com.mypurecloud.sdk.v2.model.GeolocationSettings;
import com.mypurecloud.sdk.v2.model.Geolocation;


import com.mypurecloud.sdk.v2.api.request.GetGeolocationsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGeolocationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchGeolocationsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserGeolocationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class GeolocationApiAsync {
  private final ApiClient pcapiClient;

  public GeolocationApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public GeolocationApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GeolocationSettings> getGeolocationsSettingsAsync(GetGeolocationsSettingsRequest request, AsyncApiCallback<GeolocationSettings> callback) throws ApiException {
    return pcapiClient.<GeolocationSettings>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GeolocationSettings>() {}, callback);
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GeolocationSettings>> getGeolocationsSettingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<GeolocationSettings>> callback) throws ApiException {
    return pcapiClient.<GeolocationSettings>invokeAPIVerboseAsync(request, new TypeReference<GeolocationSettings>() {}, callback);
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Geolocation> getUserGeolocationAsync(GetUserGeolocationRequest request, AsyncApiCallback<Geolocation> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Geolocation>() {}, callback);
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Geolocation>> getUserGeolocationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Geolocation>> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerboseAsync(request, new TypeReference<Geolocation>() {}, callback);
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<GeolocationSettings> patchGeolocationsSettingsAsync(PatchGeolocationsSettingsRequest request, AsyncApiCallback<GeolocationSettings> callback) throws ApiException {
    return pcapiClient.<GeolocationSettings>invokeAPIAsync(request.withHttpInfo(), new TypeReference<GeolocationSettings>() {}, callback);
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<GeolocationSettings>> patchGeolocationsSettingsAsync(ApiRequest<GeolocationSettings> request, AsyncApiCallback<ApiResponse<GeolocationSettings>> callback) throws ApiException {
    return pcapiClient.<GeolocationSettings>invokeAPIVerboseAsync(request, new TypeReference<GeolocationSettings>() {}, callback);
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Geolocation> patchUserGeolocationAsync(PatchUserGeolocationRequest request, AsyncApiCallback<Geolocation> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Geolocation>() {}, callback);
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Geolocation>> patchUserGeolocationAsync(ApiRequest<Geolocation> request, AsyncApiCallback<ApiResponse<Geolocation>> callback) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerboseAsync(request, new TypeReference<Geolocation>() {}, callback);
  }

}
