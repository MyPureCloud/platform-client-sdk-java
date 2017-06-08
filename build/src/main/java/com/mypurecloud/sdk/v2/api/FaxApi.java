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
import com.mypurecloud.sdk.v2.model.FaxDocument;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.FaxDocumentEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSummary;


import com.mypurecloud.sdk.v2.api.request.DeleteFaxDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxDocumentContentRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFaxSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.PutFaxDocumentRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FaxApi {
  private final ApiClient pcapiClient;

  public FaxApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FaxApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a fax document.
   * 
   * @param documentId Document ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFaxDocument(String documentId) throws IOException, ApiException {
     deleteFaxDocument(createDeleteFaxDocumentRequest(documentId));
  }

  /**
   * Delete a fax document.
   * 
   * @param documentId Document ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFaxDocumentWithHttpInfo(String documentId) throws IOException {
    return deleteFaxDocument(createDeleteFaxDocumentRequest(documentId).withHttpInfo());
  }

  private DeleteFaxDocumentRequest createDeleteFaxDocumentRequest(String documentId) {
    return DeleteFaxDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .build();
  }

  /**
   * Delete a fax document.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFaxDocument(DeleteFaxDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a fax document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFaxDocument(ApiRequest<Void> request) throws IOException {
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
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @return FaxDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxDocument getFaxDocument(String documentId) throws IOException, ApiException {
    return  getFaxDocument(createGetFaxDocumentRequest(documentId));
  }

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @return FaxDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxDocument> getFaxDocumentWithHttpInfo(String documentId) throws IOException {
    return getFaxDocument(createGetFaxDocumentRequest(documentId).withHttpInfo());
  }

  private GetFaxDocumentRequest createGetFaxDocumentRequest(String documentId) {
    return GetFaxDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .build();
  }

  /**
   * Get a document.
   * 
   * @param request The request object
   * @return FaxDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxDocument getFaxDocument(GetFaxDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FaxDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FaxDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxDocument> getFaxDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FaxDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FaxDocument> response = (ApiResponse<FaxDocument>)(ApiResponse<?>)exception;
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
      ApiResponse<FaxDocument> response = (ApiResponse<FaxDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Download a fax document.
   * 
   * @param documentId Document ID (required)
   * @return DownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DownloadResponse getFaxDocumentContent(String documentId) throws IOException, ApiException {
    return  getFaxDocumentContent(createGetFaxDocumentContentRequest(documentId));
  }

  /**
   * Download a fax document.
   * 
   * @param documentId Document ID (required)
   * @return DownloadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DownloadResponse> getFaxDocumentContentWithHttpInfo(String documentId) throws IOException {
    return getFaxDocumentContent(createGetFaxDocumentContentRequest(documentId).withHttpInfo());
  }

  private GetFaxDocumentContentRequest createGetFaxDocumentContentRequest(String documentId) {
    return GetFaxDocumentContentRequest.builder()
            .withDocumentId(documentId)
    
            .build();
  }

  /**
   * Download a fax document.
   * 
   * @param request The request object
   * @return DownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DownloadResponse getFaxDocumentContent(GetFaxDocumentContentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DownloadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DownloadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Download a fax document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DownloadResponse> getFaxDocumentContent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DownloadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<DownloadResponse> response = (ApiResponse<DownloadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of fax documents.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FaxDocumentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxDocumentEntityListing getFaxDocuments(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getFaxDocuments(createGetFaxDocumentsRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of fax documents.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FaxDocumentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxDocumentEntityListing> getFaxDocumentsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getFaxDocuments(createGetFaxDocumentsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetFaxDocumentsRequest createGetFaxDocumentsRequest(Integer pageSize, Integer pageNumber) {
    return GetFaxDocumentsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of fax documents.
   * 
   * @param request The request object
   * @return FaxDocumentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxDocumentEntityListing getFaxDocuments(GetFaxDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FaxDocumentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FaxDocumentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of fax documents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxDocumentEntityListing> getFaxDocuments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FaxDocumentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FaxDocumentEntityListing> response = (ApiResponse<FaxDocumentEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<FaxDocumentEntityListing> response = (ApiResponse<FaxDocumentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get fax summary
   * 
   * @return FaxSummary
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxSummary getFaxSummary() throws IOException, ApiException {
    return  getFaxSummary(createGetFaxSummaryRequest());
  }

  /**
   * Get fax summary
   * 
   * @return FaxSummary
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxSummary> getFaxSummaryWithHttpInfo() throws IOException {
    return getFaxSummary(createGetFaxSummaryRequest().withHttpInfo());
  }

  private GetFaxSummaryRequest createGetFaxSummaryRequest() {
    return GetFaxSummaryRequest.builder()
            .build();
  }

  /**
   * Get fax summary
   * 
   * @param request The request object
   * @return FaxSummary
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxSummary getFaxSummary(GetFaxSummaryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FaxSummary> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FaxSummary>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get fax summary
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxSummary> getFaxSummary(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FaxSummary>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FaxSummary> response = (ApiResponse<FaxSummary>)(ApiResponse<?>)exception;
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
      ApiResponse<FaxSummary> response = (ApiResponse<FaxSummary>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a fax document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @return FaxDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxDocument putFaxDocument(String documentId, FaxDocument body) throws IOException, ApiException {
    return  putFaxDocument(createPutFaxDocumentRequest(documentId, body));
  }

  /**
   * Update a fax document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @return FaxDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxDocument> putFaxDocumentWithHttpInfo(String documentId, FaxDocument body) throws IOException {
    return putFaxDocument(createPutFaxDocumentRequest(documentId, body).withHttpInfo());
  }

  private PutFaxDocumentRequest createPutFaxDocumentRequest(String documentId, FaxDocument body) {
    return PutFaxDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a fax document.
   * 
   * @param request The request object
   * @return FaxDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FaxDocument putFaxDocument(PutFaxDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FaxDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FaxDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a fax document.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FaxDocument> putFaxDocument(ApiRequest<FaxDocument> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FaxDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FaxDocument> response = (ApiResponse<FaxDocument>)(ApiResponse<?>)exception;
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
      ApiResponse<FaxDocument> response = (ApiResponse<FaxDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
