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
import com.mypurecloud.sdk.v2.model.GDPRRequest;
import com.mypurecloud.sdk.v2.model.GDPRRequestEntityListing;
import com.mypurecloud.sdk.v2.model.GDPRSubjectEntityListing;


import com.mypurecloud.sdk.v2.api.request.GetGdprRequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetGdprRequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGdprSubjectsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGdprRequestsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GeneralDataProtectionRegulationApi {
  private final ApiClient pcapiClient;

  public GeneralDataProtectionRegulationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GeneralDataProtectionRegulationApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get an existing GDPR request
   * 
   * @param requestId Request id (required)
   * @return GDPRRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRRequest getGdprRequest(String requestId) throws IOException, ApiException {
    return  getGdprRequest(createGetGdprRequestRequest(requestId));
  }

  /**
   * Get an existing GDPR request
   * 
   * @param requestId Request id (required)
   * @return GDPRRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRRequest> getGdprRequestWithHttpInfo(String requestId) throws IOException {
    return getGdprRequest(createGetGdprRequestRequest(requestId).withHttpInfo());
  }

  private GetGdprRequestRequest createGetGdprRequestRequest(String requestId) {
    return GetGdprRequestRequest.builder()
            .withRequestId(requestId)
    
            .build();
  }

  /**
   * Get an existing GDPR request
   * 
   * @param request The request object
   * @return GDPRRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRRequest getGdprRequest(GetGdprRequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GDPRRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GDPRRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an existing GDPR request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRRequest> getGdprRequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GDPRRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all GDPR requests
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return GDPRRequestEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRRequestEntityListing getGdprRequests(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getGdprRequests(createGetGdprRequestsRequest(pageSize, pageNumber));
  }

  /**
   * Get all GDPR requests
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return GDPRRequestEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRRequestEntityListing> getGdprRequestsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getGdprRequests(createGetGdprRequestsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetGdprRequestsRequest createGetGdprRequestsRequest(Integer pageSize, Integer pageNumber) {
    return GetGdprRequestsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get all GDPR requests
   * 
   * @param request The request object
   * @return GDPRRequestEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRRequestEntityListing getGdprRequests(GetGdprRequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GDPRRequestEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GDPRRequestEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all GDPR requests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRRequestEntityListing> getGdprRequests(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GDPRRequestEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GDPRRequestEntityListing> response = (ApiResponse<GDPRRequestEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GDPRRequestEntityListing> response = (ApiResponse<GDPRRequestEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get GDPR subjects
   * 
   * @param searchType Search Type (required)
   * @param searchValue Search Value (required)
   * @return GDPRSubjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRSubjectEntityListing getGdprSubjects(String searchType, String searchValue) throws IOException, ApiException {
    return  getGdprSubjects(createGetGdprSubjectsRequest(searchType, searchValue));
  }

  /**
   * Get GDPR subjects
   * 
   * @param searchType Search Type (required)
   * @param searchValue Search Value (required)
   * @return GDPRSubjectEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRSubjectEntityListing> getGdprSubjectsWithHttpInfo(String searchType, String searchValue) throws IOException {
    return getGdprSubjects(createGetGdprSubjectsRequest(searchType, searchValue).withHttpInfo());
  }

  private GetGdprSubjectsRequest createGetGdprSubjectsRequest(String searchType, String searchValue) {
    return GetGdprSubjectsRequest.builder()
            .withSearchType(searchType)
    
            .withSearchValue(searchValue)
    
            .build();
  }

  /**
   * Get GDPR subjects
   * 
   * @param request The request object
   * @return GDPRSubjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRSubjectEntityListing getGdprSubjects(GetGdprSubjectsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GDPRSubjectEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GDPRSubjectEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get GDPR subjects
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRSubjectEntityListing> getGdprSubjects(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GDPRSubjectEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GDPRSubjectEntityListing> response = (ApiResponse<GDPRSubjectEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GDPRSubjectEntityListing> response = (ApiResponse<GDPRSubjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Submit a new GDPR request
   * 
   * @param body GDPR request (required)
   * @param deleteConfirmed Confirm delete (optional, default to false)
   * @return GDPRRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRRequest postGdprRequests(GDPRRequest body, Boolean deleteConfirmed) throws IOException, ApiException {
    return  postGdprRequests(createPostGdprRequestsRequest(body, deleteConfirmed));
  }

  /**
   * Submit a new GDPR request
   * 
   * @param body GDPR request (required)
   * @param deleteConfirmed Confirm delete (optional, default to false)
   * @return GDPRRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRRequest> postGdprRequestsWithHttpInfo(GDPRRequest body, Boolean deleteConfirmed) throws IOException {
    return postGdprRequests(createPostGdprRequestsRequest(body, deleteConfirmed).withHttpInfo());
  }

  private PostGdprRequestsRequest createPostGdprRequestsRequest(GDPRRequest body, Boolean deleteConfirmed) {
    return PostGdprRequestsRequest.builder()
            .withBody(body)
    
            .withDeleteConfirmed(deleteConfirmed)
    
            .build();
  }

  /**
   * Submit a new GDPR request
   * 
   * @param request The request object
   * @return GDPRRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GDPRRequest postGdprRequests(PostGdprRequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GDPRRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GDPRRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Submit a new GDPR request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GDPRRequest> postGdprRequests(ApiRequest<GDPRRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GDPRRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
