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
import com.mypurecloud.sdk.v2.model.GeolocationSettings;
import com.mypurecloud.sdk.v2.model.Geolocation;


import com.mypurecloud.sdk.v2.api.request.GetGeolocationsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGeolocationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchGeolocationsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserGeolocationRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GeolocationApi {
  private final ApiClient pcapiClient;

  public GeolocationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GeolocationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @return GeolocationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeolocationSettings getGeolocationsSettings() throws IOException, ApiException {
    return  getGeolocationsSettings(createGetGeolocationsSettingsRequest());
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @return GeolocationSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeolocationSettings> getGeolocationsSettingsWithHttpInfo() throws IOException {
    return getGeolocationsSettings(createGetGeolocationsSettingsRequest().withHttpInfo());
  }

  private GetGeolocationsSettingsRequest createGetGeolocationsSettingsRequest() {
    return GetGeolocationsSettingsRequest.builder()
            .build();
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @param request The request object
   * @return GeolocationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeolocationSettings getGeolocationsSettings(GetGeolocationsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GeolocationSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GeolocationSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeolocationSettings> getGeolocationsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GeolocationSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GeolocationSettings> response = (ApiResponse<GeolocationSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<GeolocationSettings> response = (ApiResponse<GeolocationSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation getUserGeolocation(String userId, String clientId) throws IOException, ApiException {
    return  getUserGeolocation(createGetUserGeolocationRequest(userId, clientId));
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> getUserGeolocationWithHttpInfo(String userId, String clientId) throws IOException {
    return getUserGeolocation(createGetUserGeolocationRequest(userId, clientId).withHttpInfo());
  }

  private GetUserGeolocationRequest createGetUserGeolocationRequest(String userId, String clientId) {
    return GetUserGeolocationRequest.builder()
            .withUserId(userId)
    
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param request The request object
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation getUserGeolocation(GetUserGeolocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Geolocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Geolocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> getUserGeolocation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Geolocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)exception;
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
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @param body Geolocation settings (required)
   * @return GeolocationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeolocationSettings patchGeolocationsSettings(GeolocationSettings body) throws IOException, ApiException {
    return  patchGeolocationsSettings(createPatchGeolocationsSettingsRequest(body));
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @param body Geolocation settings (required)
   * @return GeolocationSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeolocationSettings> patchGeolocationsSettingsWithHttpInfo(GeolocationSettings body) throws IOException {
    return patchGeolocationsSettings(createPatchGeolocationsSettingsRequest(body).withHttpInfo());
  }

  private PatchGeolocationsSettingsRequest createPatchGeolocationsSettingsRequest(GeolocationSettings body) {
    return PatchGeolocationsSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @param request The request object
   * @return GeolocationSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GeolocationSettings patchGeolocationsSettings(PatchGeolocationsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GeolocationSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GeolocationSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GeolocationSettings> patchGeolocationsSettings(ApiRequest<GeolocationSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GeolocationSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GeolocationSettings> response = (ApiResponse<GeolocationSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<GeolocationSettings> response = (ApiResponse<GeolocationSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation patchUserGeolocation(String userId, String clientId, Geolocation body) throws IOException, ApiException {
    return  patchUserGeolocation(createPatchUserGeolocationRequest(userId, clientId, body));
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> patchUserGeolocationWithHttpInfo(String userId, String clientId, Geolocation body) throws IOException {
    return patchUserGeolocation(createPatchUserGeolocationRequest(userId, clientId, body).withHttpInfo());
  }

  private PatchUserGeolocationRequest createPatchUserGeolocationRequest(String userId, String clientId, Geolocation body) {
    return PatchUserGeolocationRequest.builder()
            .withUserId(userId)
    
            .withClientId(clientId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param request The request object
   * @return Geolocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Geolocation patchUserGeolocation(PatchUserGeolocationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Geolocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Geolocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Geolocation> patchUserGeolocation(ApiRequest<Geolocation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Geolocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)exception;
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
      ApiResponse<Geolocation> response = (ApiResponse<Geolocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
