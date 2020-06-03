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
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.SchemaQuantityLimits;


import com.mypurecloud.sdk.v2.api.request.GetDataextensionsCoretypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetDataextensionsCoretypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetDataextensionsLimitsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DataExtensionsApi {
  private final ApiClient pcapiClient;

  public DataExtensionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataExtensionsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get a specific named core type.
   * 
   * @param coretypeName The core type&#39;s name (required)
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getDataextensionsCoretype(String coretypeName) throws IOException, ApiException {
    return  getDataextensionsCoretype(createGetDataextensionsCoretypeRequest(coretypeName));
  }

  /**
   * Get a specific named core type.
   * 
   * @param coretypeName The core type&#39;s name (required)
   * @return Coretype
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getDataextensionsCoretypeWithHttpInfo(String coretypeName) throws IOException {
    return getDataextensionsCoretype(createGetDataextensionsCoretypeRequest(coretypeName).withHttpInfo());
  }

  private GetDataextensionsCoretypeRequest createGetDataextensionsCoretypeRequest(String coretypeName) {
    return GetDataextensionsCoretypeRequest.builder()
            .withCoretypeName(coretypeName)
    
            .build();
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return Coretype
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Coretype getDataextensionsCoretype(GetDataextensionsCoretypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Coretype> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Coretype>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a specific named core type.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Coretype> getDataextensionsCoretype(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Coretype>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)exception;
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
      ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getDataextensionsCoretypes() throws IOException, ApiException {
    return  getDataextensionsCoretypes(createGetDataextensionsCoretypesRequest());
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @return CoretypeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getDataextensionsCoretypesWithHttpInfo() throws IOException {
    return getDataextensionsCoretypes(createGetDataextensionsCoretypesRequest().withHttpInfo());
  }

  private GetDataextensionsCoretypesRequest createGetDataextensionsCoretypesRequest() {
    return GetDataextensionsCoretypesRequest.builder()
            .build();
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return CoretypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CoretypeListing getDataextensionsCoretypes(GetDataextensionsCoretypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CoretypeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CoretypeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the core types from which all schemas are built.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CoretypeListing> getDataextensionsCoretypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CoretypeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get quantitative limits on schemas
   * 
   * @return SchemaQuantityLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchemaQuantityLimits getDataextensionsLimits() throws IOException, ApiException {
    return  getDataextensionsLimits(createGetDataextensionsLimitsRequest());
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @return SchemaQuantityLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchemaQuantityLimits> getDataextensionsLimitsWithHttpInfo() throws IOException {
    return getDataextensionsLimits(createGetDataextensionsLimitsRequest().withHttpInfo());
  }

  private GetDataextensionsLimitsRequest createGetDataextensionsLimitsRequest() {
    return GetDataextensionsLimitsRequest.builder()
            .build();
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request The request object
   * @return SchemaQuantityLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchemaQuantityLimits getDataextensionsLimits(GetDataextensionsLimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SchemaQuantityLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SchemaQuantityLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get quantitative limits on schemas
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchemaQuantityLimits> getDataextensionsLimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SchemaQuantityLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)exception;
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
      ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
