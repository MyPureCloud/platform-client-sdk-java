package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.EmergencyLocation;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ErrorInfo;


import com.mypurecloud.sdk.v2.api.request.GetCarrierservicesIntegrationsEmergencylocationsMeRequest;
import com.mypurecloud.sdk.v2.api.request.PostCarrierservicesIntegrationsEmergencylocationsMeRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrierServicesApi {
  private final ApiClient pcapiClient;

  public CarrierServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CarrierServicesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get location for the logged in user
   * 
   * @param phoneNumber Phone number in E164 format (required)
   * @return EmergencyLocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyLocation getCarrierservicesIntegrationsEmergencylocationsMe(String phoneNumber) throws IOException, ApiException {
    return  getCarrierservicesIntegrationsEmergencylocationsMe(createGetCarrierservicesIntegrationsEmergencylocationsMeRequest(phoneNumber));
  }

  /**
   * Get location for the logged in user
   * 
   * @param phoneNumber Phone number in E164 format (required)
   * @return EmergencyLocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyLocation> getCarrierservicesIntegrationsEmergencylocationsMeWithHttpInfo(String phoneNumber) throws IOException {
    return getCarrierservicesIntegrationsEmergencylocationsMe(createGetCarrierservicesIntegrationsEmergencylocationsMeRequest(phoneNumber).withHttpInfo());
  }

  private GetCarrierservicesIntegrationsEmergencylocationsMeRequest createGetCarrierservicesIntegrationsEmergencylocationsMeRequest(String phoneNumber) {
    return GetCarrierservicesIntegrationsEmergencylocationsMeRequest.builder()
            .withPhoneNumber(phoneNumber)

            .build();
  }

  /**
   * Get location for the logged in user
   * 
   * @param request The request object
   * @return EmergencyLocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyLocation getCarrierservicesIntegrationsEmergencylocationsMe(GetCarrierservicesIntegrationsEmergencylocationsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmergencyLocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmergencyLocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get location for the logged in user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyLocation> getCarrierservicesIntegrationsEmergencylocationsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmergencyLocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)exception;
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
      ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Set current location for the logged in user
   * 
   * @param body  (optional)
   * @return EmergencyLocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyLocation postCarrierservicesIntegrationsEmergencylocationsMe(EmergencyLocation body) throws IOException, ApiException {
    return  postCarrierservicesIntegrationsEmergencylocationsMe(createPostCarrierservicesIntegrationsEmergencylocationsMeRequest(body));
  }

  /**
   * Set current location for the logged in user
   * 
   * @param body  (optional)
   * @return EmergencyLocation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyLocation> postCarrierservicesIntegrationsEmergencylocationsMeWithHttpInfo(EmergencyLocation body) throws IOException {
    return postCarrierservicesIntegrationsEmergencylocationsMe(createPostCarrierservicesIntegrationsEmergencylocationsMeRequest(body).withHttpInfo());
  }

  private PostCarrierservicesIntegrationsEmergencylocationsMeRequest createPostCarrierservicesIntegrationsEmergencylocationsMeRequest(EmergencyLocation body) {
    return PostCarrierservicesIntegrationsEmergencylocationsMeRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Set current location for the logged in user
   * 
   * @param request The request object
   * @return EmergencyLocation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyLocation postCarrierservicesIntegrationsEmergencylocationsMe(PostCarrierservicesIntegrationsEmergencylocationsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmergencyLocation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmergencyLocation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Set current location for the logged in user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyLocation> postCarrierservicesIntegrationsEmergencylocationsMe(ApiRequest<EmergencyLocation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmergencyLocation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)exception;
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
      ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
