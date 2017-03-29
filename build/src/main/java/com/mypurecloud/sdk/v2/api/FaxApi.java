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
   * @throws ApiException if fails to make API call
   */
  public void deleteFaxDocument(String documentId) throws ApiException {
    deleteFaxDocumentWithHttpInfo(documentId);
  }

  /**
   * Delete a fax document.
   * 
   * @param documentId Document ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteFaxDocumentWithHttpInfo(String documentId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteFaxDocument");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fax/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Delete a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteFaxDocument(DeleteFaxDocumentRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteFaxDocument(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @return FaxDocument
   * @throws ApiException if fails to make API call
   */
  public FaxDocument getFaxDocument(String documentId) throws ApiException {
    return getFaxDocumentWithHttpInfo(documentId).getBody();
  }

  /**
   * Get a document.
   * 
   * @param documentId Document ID (required)
   * @return FaxDocument
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxDocument> getFaxDocumentWithHttpInfo(String documentId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getFaxDocument");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fax/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FaxDocument>() {});
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FaxDocument getFaxDocument(GetFaxDocumentRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FaxDocument>() {});
  }

  /**
   * Get a document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxDocument> getFaxDocument(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<FaxDocument>invokeAPIVerbose(request, new TypeReference<FaxDocument>() {});
  }

  /**
   * Download a fax document.
   * 
   * @param documentId Document ID (required)
   * @return DownloadResponse
   * @throws ApiException if fails to make API call
   */
  public DownloadResponse getFaxDocumentContent(String documentId) throws ApiException {
    return getFaxDocumentContentWithHttpInfo(documentId).getBody();
  }

  /**
   * Download a fax document.
   * 
   * @param documentId Document ID (required)
   * @return DownloadResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DownloadResponse> getFaxDocumentContentWithHttpInfo(String documentId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getFaxDocumentContent");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fax/documents/{documentId}/content".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DownloadResponse>() {});
  }

  /**
   * Download a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DownloadResponse getFaxDocumentContent(GetFaxDocumentContentRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DownloadResponse>() {});
  }

  /**
   * Download a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DownloadResponse> getFaxDocumentContent(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<DownloadResponse>invokeAPIVerbose(request, new TypeReference<DownloadResponse>() {});
  }

  /**
   * Get a list of fax documents.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FaxDocumentEntityListing
   * @throws ApiException if fails to make API call
   */
  public FaxDocumentEntityListing getFaxDocuments(Integer pageSize, Integer pageNumber) throws ApiException {
    return getFaxDocumentsWithHttpInfo(pageSize, pageNumber).getBody();
  }

  /**
   * Get a list of fax documents.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FaxDocumentEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxDocumentEntityListing> getFaxDocumentsWithHttpInfo(Integer pageSize, Integer pageNumber) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fax/documents".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FaxDocumentEntityListing>() {});
  }

  /**
   * Get a list of fax documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FaxDocumentEntityListing getFaxDocuments(GetFaxDocumentsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FaxDocumentEntityListing>() {});
  }

  /**
   * Get a list of fax documents.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxDocumentEntityListing> getFaxDocuments(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<FaxDocumentEntityListing>invokeAPIVerbose(request, new TypeReference<FaxDocumentEntityListing>() {});
  }

  /**
   * Get fax summary
   * 
   * @return FaxSummary
   * @throws ApiException if fails to make API call
   */
  public FaxSummary getFaxSummary() throws ApiException {
    return getFaxSummaryWithHttpInfo().getBody();
  }

  /**
   * Get fax summary
   * 
   * @return FaxSummary
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxSummary> getFaxSummaryWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fax/summary".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FaxSummary>() {});
  }

  /**
   * Get fax summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FaxSummary getFaxSummary(GetFaxSummaryRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FaxSummary>() {});
  }

  /**
   * Get fax summary
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxSummary> getFaxSummary(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<FaxSummary>invokeAPIVerbose(request, new TypeReference<FaxSummary>() {});
  }

  /**
   * Update a fax document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @return FaxDocument
   * @throws ApiException if fails to make API call
   */
  public FaxDocument putFaxDocument(String documentId, FaxDocument body) throws ApiException {
    return putFaxDocumentWithHttpInfo(documentId, body).getBody();
  }

  /**
   * Update a fax document.
   * 
   * @param documentId Document ID (required)
   * @param body Document (required)
   * @return FaxDocument
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxDocument> putFaxDocumentWithHttpInfo(String documentId, FaxDocument body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling putFaxDocument");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putFaxDocument");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/fax/documents/{documentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", pcapiClient.escapeString(documentId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<FaxDocument>() {});
  }

  /**
   * Update a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public FaxDocument putFaxDocument(PutFaxDocumentRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<FaxDocument>() {});
  }

  /**
   * Update a fax document.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FaxDocument> putFaxDocument(ApiRequest<FaxDocument> request) throws ApiException {
    return pcapiClient.<FaxDocument>invokeAPIVerbose(request, new TypeReference<FaxDocument>() {});
  }

}
