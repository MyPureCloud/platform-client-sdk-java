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
   * @throws ApiException if fails to make API call
   */
  public GeolocationSettings getGeolocationsSettings() throws ApiException {
    return getGeolocationsSettingsWithHttpInfo().getBody();
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @return GeolocationSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GeolocationSettings> getGeolocationsSettingsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/geolocations/settings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GeolocationSettings>() {});
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GeolocationSettings getGeolocationsSettings(GetGeolocationsSettingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GeolocationSettings>() {});
  }

  /**
   * Get a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GeolocationSettings> getGeolocationsSettings(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<GeolocationSettings>invokeAPIVerbose(request, new TypeReference<GeolocationSettings>() {});
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public Geolocation getUserGeolocation(String userId, String clientId) throws ApiException {
    return getUserGeolocationWithHttpInfo(userId, clientId).getBody();
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> getUserGeolocationWithHttpInfo(String userId, String clientId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserGeolocation");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getUserGeolocation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/geolocations/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Geolocation>() {});
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Geolocation getUserGeolocation(GetUserGeolocationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Geolocation>() {});
  }

  /**
   * Get a user&#39;s Geolocation
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> getUserGeolocation(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerbose(request, new TypeReference<Geolocation>() {});
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @param body Geolocation settings (required)
   * @return GeolocationSettings
   * @throws ApiException if fails to make API call
   */
  public GeolocationSettings patchGeolocationsSettings(GeolocationSettings body) throws ApiException {
    return patchGeolocationsSettingsWithHttpInfo(body).getBody();
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @param body Geolocation settings (required)
   * @return GeolocationSettings
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GeolocationSettings> patchGeolocationsSettingsWithHttpInfo(GeolocationSettings body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchGeolocationsSettings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/geolocations/settings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<GeolocationSettings>() {});
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public GeolocationSettings patchGeolocationsSettings(PatchGeolocationsSettingsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<GeolocationSettings>() {});
  }

  /**
   * Patch a organization&#39;s GeolocationSettings
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GeolocationSettings> patchGeolocationsSettings(ApiRequest<GeolocationSettings> request) throws ApiException {
    return pcapiClient.<GeolocationSettings>invokeAPIVerbose(request, new TypeReference<GeolocationSettings>() {});
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public Geolocation patchUserGeolocation(String userId, String clientId, Geolocation body) throws ApiException {
    return patchUserGeolocationWithHttpInfo(userId, clientId, body).getBody();
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @param userId user Id (required)
   * @param clientId client Id (required)
   * @param body Geolocation (required)
   * @return Geolocation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> patchUserGeolocationWithHttpInfo(String userId, String clientId, Geolocation body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling patchUserGeolocation");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling patchUserGeolocation");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchUserGeolocation");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/geolocations/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Geolocation>() {});
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Geolocation patchUserGeolocation(PatchUserGeolocationRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Geolocation>() {});
  }

  /**
   * Patch a user&#39;s Geolocation
   * The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Geolocation> patchUserGeolocation(ApiRequest<Geolocation> request) throws ApiException {
    return pcapiClient.<Geolocation>invokeAPIVerbose(request, new TypeReference<Geolocation>() {});
  }

}
