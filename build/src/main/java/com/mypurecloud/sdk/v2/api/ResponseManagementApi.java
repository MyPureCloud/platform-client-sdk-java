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
import com.mypurecloud.sdk.v2.model.LibraryEntityListing;
import com.mypurecloud.sdk.v2.model.Library;
import com.mypurecloud.sdk.v2.model.Response;
import com.mypurecloud.sdk.v2.model.ResponseAsset;
import com.mypurecloud.sdk.v2.model.ResponseAssetStatus;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseAssetSearchRequest;
import com.mypurecloud.sdk.v2.model.ResponseAssetSearchResults;
import com.mypurecloud.sdk.v2.model.CreateResponseAssetResponse;
import com.mypurecloud.sdk.v2.model.CreateResponseAssetRequest;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;
import com.mypurecloud.sdk.v2.model.ResponseAssetRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteResponsemanagementResponseRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteResponsemanagementResponseassetRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementLibrariesRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponseRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponseassetRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponseassetsStatusStatusIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponsesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementLibrariesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponseassetsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponseassetsUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponsesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponsesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.PutResponsemanagementResponseRequest;
import com.mypurecloud.sdk.v2.api.request.PutResponsemanagementResponseassetRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ResponseManagementApi {
  private final ApiClient pcapiClient;

  public ResponseManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ResponseManagementApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @param libraryId Library ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteResponsemanagementLibrary(String libraryId) throws IOException, ApiException {
     deleteResponsemanagementLibrary(createDeleteResponsemanagementLibraryRequest(libraryId));
  }

  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @param libraryId Library ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteResponsemanagementLibraryWithHttpInfo(String libraryId) throws IOException {
    return deleteResponsemanagementLibrary(createDeleteResponsemanagementLibraryRequest(libraryId).withHttpInfo());
  }

  private DeleteResponsemanagementLibraryRequest createDeleteResponsemanagementLibraryRequest(String libraryId) {
    return DeleteResponsemanagementLibraryRequest.builder()
            .withLibraryId(libraryId)
    
            .build();
  }

  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteResponsemanagementLibrary(DeleteResponsemanagementLibraryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteResponsemanagementLibrary(ApiRequest<Void> request) throws IOException {
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
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @param responseId Response ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteResponsemanagementResponse(String responseId) throws IOException, ApiException {
     deleteResponsemanagementResponse(createDeleteResponsemanagementResponseRequest(responseId));
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @param responseId Response ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteResponsemanagementResponseWithHttpInfo(String responseId) throws IOException {
    return deleteResponsemanagementResponse(createDeleteResponsemanagementResponseRequest(responseId).withHttpInfo());
  }

  private DeleteResponsemanagementResponseRequest createDeleteResponsemanagementResponseRequest(String responseId) {
    return DeleteResponsemanagementResponseRequest.builder()
            .withResponseId(responseId)
    
            .build();
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteResponsemanagementResponse(DeleteResponsemanagementResponseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteResponsemanagementResponse(ApiRequest<Void> request) throws IOException {
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
   * Delete response asset
   * 
   * @param responseAssetId Asset Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteResponsemanagementResponseasset(String responseAssetId) throws IOException, ApiException {
     deleteResponsemanagementResponseasset(createDeleteResponsemanagementResponseassetRequest(responseAssetId));
  }

  /**
   * Delete response asset
   * 
   * @param responseAssetId Asset Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteResponsemanagementResponseassetWithHttpInfo(String responseAssetId) throws IOException {
    return deleteResponsemanagementResponseasset(createDeleteResponsemanagementResponseassetRequest(responseAssetId).withHttpInfo());
  }

  private DeleteResponsemanagementResponseassetRequest createDeleteResponsemanagementResponseassetRequest(String responseAssetId) {
    return DeleteResponsemanagementResponseassetRequest.builder()
            .withResponseAssetId(responseAssetId)
    
            .build();
  }

  /**
   * Delete response asset
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteResponsemanagementResponseasset(DeleteResponsemanagementResponseassetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete response asset
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteResponsemanagementResponseasset(ApiRequest<Void> request) throws IOException {
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
   * Gets a list of existing response libraries.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param messagingTemplateFilter Returns a list of libraries that contain responses with at least one messaging template defined for a specific message channel (optional)
   * @return LibraryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LibraryEntityListing getResponsemanagementLibraries(Integer pageNumber, Integer pageSize, String messagingTemplateFilter) throws IOException, ApiException {
    return  getResponsemanagementLibraries(createGetResponsemanagementLibrariesRequest(pageNumber, pageSize, messagingTemplateFilter));
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param messagingTemplateFilter Returns a list of libraries that contain responses with at least one messaging template defined for a specific message channel (optional)
   * @return LibraryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LibraryEntityListing> getResponsemanagementLibrariesWithHttpInfo(Integer pageNumber, Integer pageSize, String messagingTemplateFilter) throws IOException {
    return getResponsemanagementLibraries(createGetResponsemanagementLibrariesRequest(pageNumber, pageSize, messagingTemplateFilter).withHttpInfo());
  }

  private GetResponsemanagementLibrariesRequest createGetResponsemanagementLibrariesRequest(Integer pageNumber, Integer pageSize, String messagingTemplateFilter) {
    return GetResponsemanagementLibrariesRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withMessagingTemplateFilter(messagingTemplateFilter)
    
            .build();
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @param request The request object
   * @return LibraryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LibraryEntityListing getResponsemanagementLibraries(GetResponsemanagementLibrariesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LibraryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LibraryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LibraryEntityListing> getResponsemanagementLibraries(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LibraryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LibraryEntityListing> response = (ApiResponse<LibraryEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LibraryEntityListing> response = (ApiResponse<LibraryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get details about an existing response library.
   * 
   * @param libraryId Library ID (required)
   * @return Library
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Library getResponsemanagementLibrary(String libraryId) throws IOException, ApiException {
    return  getResponsemanagementLibrary(createGetResponsemanagementLibraryRequest(libraryId));
  }

  /**
   * Get details about an existing response library.
   * 
   * @param libraryId Library ID (required)
   * @return Library
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Library> getResponsemanagementLibraryWithHttpInfo(String libraryId) throws IOException {
    return getResponsemanagementLibrary(createGetResponsemanagementLibraryRequest(libraryId).withHttpInfo());
  }

  private GetResponsemanagementLibraryRequest createGetResponsemanagementLibraryRequest(String libraryId) {
    return GetResponsemanagementLibraryRequest.builder()
            .withLibraryId(libraryId)
    
            .build();
  }

  /**
   * Get details about an existing response library.
   * 
   * @param request The request object
   * @return Library
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Library getResponsemanagementLibrary(GetResponsemanagementLibraryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Library> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Library>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details about an existing response library.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Library> getResponsemanagementLibrary(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Library>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Library> response = (ApiResponse<Library>)(ApiResponse<?>)exception;
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
      ApiResponse<Library> response = (ApiResponse<Library>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get details about an existing response.
   * 
   * @param responseId Response ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Response getResponsemanagementResponse(String responseId, String expand) throws IOException, ApiException {
    return  getResponsemanagementResponse(createGetResponsemanagementResponseRequest(responseId, expand));
  }

  /**
   * Get details about an existing response.
   * 
   * @param responseId Response ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Response> getResponsemanagementResponseWithHttpInfo(String responseId, String expand) throws IOException {
    return getResponsemanagementResponse(createGetResponsemanagementResponseRequest(responseId, expand).withHttpInfo());
  }

  private GetResponsemanagementResponseRequest createGetResponsemanagementResponseRequest(String responseId, String expand) {
    return GetResponsemanagementResponseRequest.builder()
            .withResponseId(responseId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get details about an existing response.
   * 
   * @param request The request object
   * @return Response
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Response getResponsemanagementResponse(GetResponsemanagementResponseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Response> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Response>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details about an existing response.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Response> getResponsemanagementResponse(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Response>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Response> response = (ApiResponse<Response>)(ApiResponse<?>)exception;
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
      ApiResponse<Response> response = (ApiResponse<Response>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get response asset information
   * 
   * @param responseAssetId Asset Id (required)
   * @return ResponseAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAsset getResponsemanagementResponseasset(String responseAssetId) throws IOException, ApiException {
    return  getResponsemanagementResponseasset(createGetResponsemanagementResponseassetRequest(responseAssetId));
  }

  /**
   * Get response asset information
   * 
   * @param responseAssetId Asset Id (required)
   * @return ResponseAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAsset> getResponsemanagementResponseassetWithHttpInfo(String responseAssetId) throws IOException {
    return getResponsemanagementResponseasset(createGetResponsemanagementResponseassetRequest(responseAssetId).withHttpInfo());
  }

  private GetResponsemanagementResponseassetRequest createGetResponsemanagementResponseassetRequest(String responseAssetId) {
    return GetResponsemanagementResponseassetRequest.builder()
            .withResponseAssetId(responseAssetId)
    
            .build();
  }

  /**
   * Get response asset information
   * 
   * @param request The request object
   * @return ResponseAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAsset getResponsemanagementResponseasset(GetResponsemanagementResponseassetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get response asset information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAsset> getResponsemanagementResponseasset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseAsset> response = (ApiResponse<ResponseAsset>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseAsset> response = (ApiResponse<ResponseAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get response asset upload status
   * 
   * @param statusId Status Id (required)
   * @return ResponseAssetStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAssetStatus getResponsemanagementResponseassetsStatusStatusId(String statusId) throws IOException, ApiException {
    return  getResponsemanagementResponseassetsStatusStatusId(createGetResponsemanagementResponseassetsStatusStatusIdRequest(statusId));
  }

  /**
   * Get response asset upload status
   * 
   * @param statusId Status Id (required)
   * @return ResponseAssetStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAssetStatus> getResponsemanagementResponseassetsStatusStatusIdWithHttpInfo(String statusId) throws IOException {
    return getResponsemanagementResponseassetsStatusStatusId(createGetResponsemanagementResponseassetsStatusStatusIdRequest(statusId).withHttpInfo());
  }

  private GetResponsemanagementResponseassetsStatusStatusIdRequest createGetResponsemanagementResponseassetsStatusStatusIdRequest(String statusId) {
    return GetResponsemanagementResponseassetsStatusStatusIdRequest.builder()
            .withStatusId(statusId)
    
            .build();
  }

  /**
   * Get response asset upload status
   * 
   * @param request The request object
   * @return ResponseAssetStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAssetStatus getResponsemanagementResponseassetsStatusStatusId(GetResponsemanagementResponseassetsStatusStatusIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseAssetStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseAssetStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get response asset upload status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAssetStatus> getResponsemanagementResponseassetsStatusStatusId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseAssetStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseAssetStatus> response = (ApiResponse<ResponseAssetStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseAssetStatus> response = (ApiResponse<ResponseAssetStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a list of existing responses.
   * 
   * @param libraryId Library ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Expand instructions for the return value. (optional)
   * @return ResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseEntityListing getResponsemanagementResponses(String libraryId, Integer pageNumber, Integer pageSize, String expand) throws IOException, ApiException {
    return  getResponsemanagementResponses(createGetResponsemanagementResponsesRequest(libraryId, pageNumber, pageSize, expand));
  }

  /**
   * Gets a list of existing responses.
   * 
   * @param libraryId Library ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Expand instructions for the return value. (optional)
   * @return ResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseEntityListing> getResponsemanagementResponsesWithHttpInfo(String libraryId, Integer pageNumber, Integer pageSize, String expand) throws IOException {
    return getResponsemanagementResponses(createGetResponsemanagementResponsesRequest(libraryId, pageNumber, pageSize, expand).withHttpInfo());
  }

  private GetResponsemanagementResponsesRequest createGetResponsemanagementResponsesRequest(String libraryId, Integer pageNumber, Integer pageSize, String expand) {
    return GetResponsemanagementResponsesRequest.builder()
            .withLibraryId(libraryId)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Gets a list of existing responses.
   * 
   * @param request The request object
   * @return ResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseEntityListing getResponsemanagementResponses(GetResponsemanagementResponsesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of existing responses.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseEntityListing> getResponsemanagementResponses(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseEntityListing> response = (ApiResponse<ResponseEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseEntityListing> response = (ApiResponse<ResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a response library.
   * 
   * @param body Library (required)
   * @return Library
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Library postResponsemanagementLibraries(Library body) throws IOException, ApiException {
    return  postResponsemanagementLibraries(createPostResponsemanagementLibrariesRequest(body));
  }

  /**
   * Create a response library.
   * 
   * @param body Library (required)
   * @return Library
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Library> postResponsemanagementLibrariesWithHttpInfo(Library body) throws IOException {
    return postResponsemanagementLibraries(createPostResponsemanagementLibrariesRequest(body).withHttpInfo());
  }

  private PostResponsemanagementLibrariesRequest createPostResponsemanagementLibrariesRequest(Library body) {
    return PostResponsemanagementLibrariesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a response library.
   * 
   * @param request The request object
   * @return Library
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Library postResponsemanagementLibraries(PostResponsemanagementLibrariesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Library> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Library>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a response library.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Library> postResponsemanagementLibraries(ApiRequest<Library> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Library>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Library> response = (ApiResponse<Library>)(ApiResponse<?>)exception;
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
      ApiResponse<Library> response = (ApiResponse<Library>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search response assets
   * 
   * @param body request (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return ResponseAssetSearchResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAssetSearchResults postResponsemanagementResponseassetsSearch(ResponseAssetSearchRequest body, List<String> expand) throws IOException, ApiException {
    return  postResponsemanagementResponseassetsSearch(createPostResponsemanagementResponseassetsSearchRequest(body, expand));
  }

  /**
   * Search response assets
   * 
   * @param body request (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return ResponseAssetSearchResults
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAssetSearchResults> postResponsemanagementResponseassetsSearchWithHttpInfo(ResponseAssetSearchRequest body, List<String> expand) throws IOException {
    return postResponsemanagementResponseassetsSearch(createPostResponsemanagementResponseassetsSearchRequest(body, expand).withHttpInfo());
  }

  private PostResponsemanagementResponseassetsSearchRequest createPostResponsemanagementResponseassetsSearchRequest(ResponseAssetSearchRequest body, List<String> expand) {
    return PostResponsemanagementResponseassetsSearchRequest.builder()
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Search response assets
   * 
   * @param request The request object
   * @return ResponseAssetSearchResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAssetSearchResults postResponsemanagementResponseassetsSearch(PostResponsemanagementResponseassetsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseAssetSearchResults> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseAssetSearchResults>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search response assets
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAssetSearchResults> postResponsemanagementResponseassetsSearch(ApiRequest<ResponseAssetSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseAssetSearchResults>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseAssetSearchResults> response = (ApiResponse<ResponseAssetSearchResults>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseAssetSearchResults> response = (ApiResponse<ResponseAssetSearchResults>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates pre-signed url for uploading response asset
   * 
   * @param body request (required)
   * @return CreateResponseAssetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateResponseAssetResponse postResponsemanagementResponseassetsUploads(CreateResponseAssetRequest body) throws IOException, ApiException {
    return  postResponsemanagementResponseassetsUploads(createPostResponsemanagementResponseassetsUploadsRequest(body));
  }

  /**
   * Creates pre-signed url for uploading response asset
   * 
   * @param body request (required)
   * @return CreateResponseAssetResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateResponseAssetResponse> postResponsemanagementResponseassetsUploadsWithHttpInfo(CreateResponseAssetRequest body) throws IOException {
    return postResponsemanagementResponseassetsUploads(createPostResponsemanagementResponseassetsUploadsRequest(body).withHttpInfo());
  }

  private PostResponsemanagementResponseassetsUploadsRequest createPostResponsemanagementResponseassetsUploadsRequest(CreateResponseAssetRequest body) {
    return PostResponsemanagementResponseassetsUploadsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates pre-signed url for uploading response asset
   * 
   * @param request The request object
   * @return CreateResponseAssetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateResponseAssetResponse postResponsemanagementResponseassetsUploads(PostResponsemanagementResponseassetsUploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateResponseAssetResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateResponseAssetResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates pre-signed url for uploading response asset
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateResponseAssetResponse> postResponsemanagementResponseassetsUploads(ApiRequest<CreateResponseAssetRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateResponseAssetResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateResponseAssetResponse> response = (ApiResponse<CreateResponseAssetResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CreateResponseAssetResponse> response = (ApiResponse<CreateResponseAssetResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a response.
   * 
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Response postResponsemanagementResponses(Response body, String expand) throws IOException, ApiException {
    return  postResponsemanagementResponses(createPostResponsemanagementResponsesRequest(body, expand));
  }

  /**
   * Create a response.
   * 
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Response> postResponsemanagementResponsesWithHttpInfo(Response body, String expand) throws IOException {
    return postResponsemanagementResponses(createPostResponsemanagementResponsesRequest(body, expand).withHttpInfo());
  }

  private PostResponsemanagementResponsesRequest createPostResponsemanagementResponsesRequest(Response body, String expand) {
    return PostResponsemanagementResponsesRequest.builder()
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Create a response.
   * 
   * @param request The request object
   * @return Response
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Response postResponsemanagementResponses(PostResponsemanagementResponsesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Response> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Response>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a response.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Response> postResponsemanagementResponses(ApiRequest<Response> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Response>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Response> response = (ApiResponse<Response>)(ApiResponse<?>)exception;
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
      ApiResponse<Response> response = (ApiResponse<Response>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query responses
   * 
   * @param body Response (required)
   * @return ResponseQueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseQueryResults postResponsemanagementResponsesQuery(ResponseQueryRequest body) throws IOException, ApiException {
    return  postResponsemanagementResponsesQuery(createPostResponsemanagementResponsesQueryRequest(body));
  }

  /**
   * Query responses
   * 
   * @param body Response (required)
   * @return ResponseQueryResults
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseQueryResults> postResponsemanagementResponsesQueryWithHttpInfo(ResponseQueryRequest body) throws IOException {
    return postResponsemanagementResponsesQuery(createPostResponsemanagementResponsesQueryRequest(body).withHttpInfo());
  }

  private PostResponsemanagementResponsesQueryRequest createPostResponsemanagementResponsesQueryRequest(ResponseQueryRequest body) {
    return PostResponsemanagementResponsesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query responses
   * 
   * @param request The request object
   * @return ResponseQueryResults
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseQueryResults postResponsemanagementResponsesQuery(PostResponsemanagementResponsesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseQueryResults> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseQueryResults>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query responses
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseQueryResults> postResponsemanagementResponsesQuery(ApiRequest<ResponseQueryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseQueryResults>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseQueryResults> response = (ApiResponse<ResponseQueryResults>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseQueryResults> response = (ApiResponse<ResponseQueryResults>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @param libraryId Library ID (required)
   * @param body Library (required)
   * @return Library
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Library putResponsemanagementLibrary(String libraryId, Library body) throws IOException, ApiException {
    return  putResponsemanagementLibrary(createPutResponsemanagementLibraryRequest(libraryId, body));
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @param libraryId Library ID (required)
   * @param body Library (required)
   * @return Library
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Library> putResponsemanagementLibraryWithHttpInfo(String libraryId, Library body) throws IOException {
    return putResponsemanagementLibrary(createPutResponsemanagementLibraryRequest(libraryId, body).withHttpInfo());
  }

  private PutResponsemanagementLibraryRequest createPutResponsemanagementLibraryRequest(String libraryId, Library body) {
    return PutResponsemanagementLibraryRequest.builder()
            .withLibraryId(libraryId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @param request The request object
   * @return Library
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Library putResponsemanagementLibrary(PutResponsemanagementLibraryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Library> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Library>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Library> putResponsemanagementLibrary(ApiRequest<Library> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Library>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Library> response = (ApiResponse<Library>)(ApiResponse<?>)exception;
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
      ApiResponse<Library> response = (ApiResponse<Library>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @param responseId Response ID (required)
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Response putResponsemanagementResponse(String responseId, Response body, String expand) throws IOException, ApiException {
    return  putResponsemanagementResponse(createPutResponsemanagementResponseRequest(responseId, body, expand));
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @param responseId Response ID (required)
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Response> putResponsemanagementResponseWithHttpInfo(String responseId, Response body, String expand) throws IOException {
    return putResponsemanagementResponse(createPutResponsemanagementResponseRequest(responseId, body, expand).withHttpInfo());
  }

  private PutResponsemanagementResponseRequest createPutResponsemanagementResponseRequest(String responseId, Response body, String expand) {
    return PutResponsemanagementResponseRequest.builder()
            .withResponseId(responseId)
    
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @param request The request object
   * @return Response
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Response putResponsemanagementResponse(PutResponsemanagementResponseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Response> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Response>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Response> putResponsemanagementResponse(ApiRequest<Response> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Response>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Response> response = (ApiResponse<Response>)(ApiResponse<?>)exception;
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
      ApiResponse<Response> response = (ApiResponse<Response>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update response asset
   * 
   * @param responseAssetId Asset Id (required)
   * @param body request (required)
   * @return ResponseAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAsset putResponsemanagementResponseasset(String responseAssetId, ResponseAssetRequest body) throws IOException, ApiException {
    return  putResponsemanagementResponseasset(createPutResponsemanagementResponseassetRequest(responseAssetId, body));
  }

  /**
   * Update response asset
   * 
   * @param responseAssetId Asset Id (required)
   * @param body request (required)
   * @return ResponseAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAsset> putResponsemanagementResponseassetWithHttpInfo(String responseAssetId, ResponseAssetRequest body) throws IOException {
    return putResponsemanagementResponseasset(createPutResponsemanagementResponseassetRequest(responseAssetId, body).withHttpInfo());
  }

  private PutResponsemanagementResponseassetRequest createPutResponsemanagementResponseassetRequest(String responseAssetId, ResponseAssetRequest body) {
    return PutResponsemanagementResponseassetRequest.builder()
            .withResponseAssetId(responseAssetId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update response asset
   * 
   * @param request The request object
   * @return ResponseAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseAsset putResponsemanagementResponseasset(PutResponsemanagementResponseassetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update response asset
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseAsset> putResponsemanagementResponseasset(ApiRequest<ResponseAssetRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseAsset> response = (ApiResponse<ResponseAsset>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseAsset> response = (ApiResponse<ResponseAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
