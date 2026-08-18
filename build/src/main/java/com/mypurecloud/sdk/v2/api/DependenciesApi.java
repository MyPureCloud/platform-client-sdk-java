package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.DependencyCount;
import com.mypurecloud.sdk.v2.model.DependencyEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest;
import com.mypurecloud.sdk.v2.api.request.GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest;
import com.mypurecloud.sdk.v2.api.request.GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DependenciesApi {
  private final ApiClient pcapiClient;

  public DependenciesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DependenciesApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get entities that require the given entity
   * 
   * @param entityType Entity type (required)
   * @param entityId Entity ID (required)
   * @param pageSize Page size (max 100) (optional, default to 25)
   * @param beforeSourceType Cursor for previous page (optional)
   * @param beforeSourceId Cursor for previous page (optional)
   * @param afterSourceType Cursor for next page (optional)
   * @param afterSourceId Cursor for next page (optional)
   * @return DependencyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyEntityListing getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby(String entityType, String entityId, String pageSize, String beforeSourceType, String beforeSourceId, String afterSourceType, String afterSourceId) throws IOException, ApiException {
    return  getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby(createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId));
  }

  /**
   * Get entities that require the given entity
   * 
   * @param entityType Entity type (required)
   * @param entityId Entity ID (required)
   * @param pageSize Page size (max 100) (optional, default to 25)
   * @param beforeSourceType Cursor for previous page (optional)
   * @param beforeSourceId Cursor for previous page (optional)
   * @param afterSourceType Cursor for next page (optional)
   * @param afterSourceId Cursor for next page (optional)
   * @return DependencyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyEntityListing> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyWithHttpInfo(String entityType, String entityId, String pageSize, String beforeSourceType, String beforeSourceId, String afterSourceType, String afterSourceId) throws IOException {
    return getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby(createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId).withHttpInfo());
  }

  private GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest(String entityType, String entityId, String pageSize, String beforeSourceType, String beforeSourceId, String afterSourceType, String afterSourceId) {
    return GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest.builder()
            .withEntityType(entityType)

            .withEntityId(entityId)

            .withPageSize(pageSize)

            .withBeforeSourceType(beforeSourceType)

            .withBeforeSourceId(beforeSourceId)

            .withAfterSourceType(afterSourceType)

            .withAfterSourceId(afterSourceId)

            .build();
  }

  /**
   * Get entities that require the given entity
   * 
   * @param request The request object
   * @return DependencyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyEntityListing getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby(GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get entities that require the given entity
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyEntityListing> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredby(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * An estimated count of entities that depend on this entity, including indirect dependencies.
   * 
   * @param entityType Entity type (required)
   * @param entityId Entity ID (required)
   * @return DependencyCount
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyCount getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts(String entityType, String entityId) throws IOException, ApiException {
    return  getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts(createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest(entityType, entityId));
  }

  /**
   * An estimated count of entities that depend on this entity, including indirect dependencies.
   * 
   * @param entityType Entity type (required)
   * @param entityId Entity ID (required)
   * @return DependencyCount
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyCount> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsWithHttpInfo(String entityType, String entityId) throws IOException {
    return getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts(createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest(entityType, entityId).withHttpInfo());
  }

  private GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest(String entityType, String entityId) {
    return GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest.builder()
            .withEntityType(entityType)

            .withEntityId(entityId)

            .build();
  }

  /**
   * An estimated count of entities that depend on this entity, including indirect dependencies.
   * 
   * @param request The request object
   * @return DependencyCount
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyCount getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts(GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyCount> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyCount>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * An estimated count of entities that depend on this entity, including indirect dependencies.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyCount> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycounts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyCount>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyCount> response = (ApiResponse<DependencyCount>)(ApiResponse<?>)exception;
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
      ApiResponse<DependencyCount> response = (ApiResponse<DependencyCount>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get entities that the given entity requires
   * 
   * @param entityType Entity type (required)
   * @param entityId Entity ID (required)
   * @param pageSize Page size (max 100) (optional, default to 25)
   * @param beforeSourceType Cursor for previous page (optional)
   * @param beforeSourceId Cursor for previous page (optional)
   * @param afterSourceType Cursor for next page (optional)
   * @param afterSourceId Cursor for next page (optional)
   * @return DependencyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyEntityListing getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires(String entityType, String entityId, String pageSize, String beforeSourceType, String beforeSourceId, String afterSourceType, String afterSourceId) throws IOException, ApiException {
    return  getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires(createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId));
  }

  /**
   * Get entities that the given entity requires
   * 
   * @param entityType Entity type (required)
   * @param entityId Entity ID (required)
   * @param pageSize Page size (max 100) (optional, default to 25)
   * @param beforeSourceType Cursor for previous page (optional)
   * @param beforeSourceId Cursor for previous page (optional)
   * @param afterSourceType Cursor for next page (optional)
   * @param afterSourceId Cursor for next page (optional)
   * @return DependencyEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyEntityListing> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresWithHttpInfo(String entityType, String entityId, String pageSize, String beforeSourceType, String beforeSourceId, String afterSourceType, String afterSourceId) throws IOException {
    return getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires(createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest(entityType, entityId, pageSize, beforeSourceType, beforeSourceId, afterSourceType, afterSourceId).withHttpInfo());
  }

  private GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest createGetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest(String entityType, String entityId, String pageSize, String beforeSourceType, String beforeSourceId, String afterSourceType, String afterSourceId) {
    return GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest.builder()
            .withEntityType(entityType)

            .withEntityId(entityId)

            .withPageSize(pageSize)

            .withBeforeSourceType(beforeSourceType)

            .withBeforeSourceId(beforeSourceId)

            .withAfterSourceType(afterSourceType)

            .withAfterSourceId(afterSourceId)

            .build();
  }

  /**
   * Get entities that the given entity requires
   * 
   * @param request The request object
   * @return DependencyEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyEntityListing getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires(GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get entities that the given entity requires
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyEntityListing> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequires(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
