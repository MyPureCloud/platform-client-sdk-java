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
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteResponsemanagementResponseRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementLibrariesRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponseRequest;
import com.mypurecloud.sdk.v2.api.request.GetResponsemanagementResponsesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementLibrariesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponsesRequest;
import com.mypurecloud.sdk.v2.api.request.PostResponsemanagementResponsesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutResponsemanagementLibraryRequest;
import com.mypurecloud.sdk.v2.api.request.PutResponsemanagementResponseRequest;

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
   * @throws ApiException if fails to make API call
   */
  public void deleteResponsemanagementLibrary(String libraryId) throws IOException, ApiException {
    deleteResponsemanagementLibraryWithHttpInfo(libraryId);
  }

  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @param libraryId Library ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteResponsemanagementLibraryWithHttpInfo(String libraryId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'libraryId' is set
    if (libraryId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'libraryId' when calling deleteResponsemanagementLibrary");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/libraries/{libraryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryId" + "\\}", pcapiClient.escapeString(libraryId.toString()));

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
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteResponsemanagementLibrary(DeleteResponsemanagementLibraryRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an existing response library.
   * This will remove any responses associated with the library.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteResponsemanagementLibrary(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @param responseId Response ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteResponsemanagementResponse(String responseId) throws IOException, ApiException {
    deleteResponsemanagementResponseWithHttpInfo(responseId);
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @param responseId Response ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteResponsemanagementResponseWithHttpInfo(String responseId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'responseId' is set
    if (responseId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'responseId' when calling deleteResponsemanagementResponse");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/responses/{responseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "responseId" + "\\}", pcapiClient.escapeString(responseId.toString()));

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
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteResponsemanagementResponse(DeleteResponsemanagementResponseRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete an existing response.
   * This will remove the response from any libraries associated with it.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteResponsemanagementResponse(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return LibraryEntityListing
   * @throws ApiException if fails to make API call
   */
  public LibraryEntityListing getResponsemanagementLibraries(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getResponsemanagementLibrariesWithHttpInfo(pageNumber, pageSize).getBody();
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return LibraryEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LibraryEntityListing> getResponsemanagementLibrariesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/libraries".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LibraryEntityListing>() {});
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LibraryEntityListing getResponsemanagementLibraries(GetResponsemanagementLibrariesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LibraryEntityListing>() {});
  }

  /**
   * Gets a list of existing response libraries.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LibraryEntityListing> getResponsemanagementLibraries(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LibraryEntityListing>invokeAPIVerbose(request, new TypeReference<LibraryEntityListing>() {});
  }

  /**
   * Get details about an existing response library.
   * 
   * @param libraryId Library ID (required)
   * @return Library
   * @throws ApiException if fails to make API call
   */
  public Library getResponsemanagementLibrary(String libraryId) throws IOException, ApiException {
    return getResponsemanagementLibraryWithHttpInfo(libraryId).getBody();
  }

  /**
   * Get details about an existing response library.
   * 
   * @param libraryId Library ID (required)
   * @return Library
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Library> getResponsemanagementLibraryWithHttpInfo(String libraryId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'libraryId' is set
    if (libraryId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'libraryId' when calling getResponsemanagementLibrary");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/libraries/{libraryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryId" + "\\}", pcapiClient.escapeString(libraryId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Library>() {});
  }

  /**
   * Get details about an existing response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Library getResponsemanagementLibrary(GetResponsemanagementLibraryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Library>() {});
  }

  /**
   * Get details about an existing response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Library> getResponsemanagementLibrary(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Library>invokeAPIVerbose(request, new TypeReference<Library>() {});
  }

  /**
   * Get details about an existing response.
   * 
   * @param responseId Response ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public Response getResponsemanagementResponse(String responseId, String expand) throws IOException, ApiException {
    return getResponsemanagementResponseWithHttpInfo(responseId, expand).getBody();
  }

  /**
   * Get details about an existing response.
   * 
   * @param responseId Response ID (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Response> getResponsemanagementResponseWithHttpInfo(String responseId, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'responseId' is set
    if (responseId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'responseId' when calling getResponsemanagementResponse");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/responses/{responseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "responseId" + "\\}", pcapiClient.escapeString(responseId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Response>() {});
  }

  /**
   * Get details about an existing response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Response getResponsemanagementResponse(GetResponsemanagementResponseRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Response>() {});
  }

  /**
   * Get details about an existing response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Response> getResponsemanagementResponse(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Response>invokeAPIVerbose(request, new TypeReference<Response>() {});
  }

  /**
   * Gets a list of existing responses.
   * 
   * @param libraryId Library ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Expand instructions for the return value. (optional)
   * @return ResponseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ResponseEntityListing getResponsemanagementResponses(String libraryId, Integer pageNumber, Integer pageSize, String expand) throws IOException, ApiException {
    return getResponsemanagementResponsesWithHttpInfo(libraryId, pageNumber, pageSize, expand).getBody();
  }

  /**
   * Gets a list of existing responses.
   * 
   * @param libraryId Library ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param expand Expand instructions for the return value. (optional)
   * @return ResponseEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseEntityListing> getResponsemanagementResponsesWithHttpInfo(String libraryId, Integer pageNumber, Integer pageSize, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'libraryId' is set
    if (libraryId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'libraryId' when calling getResponsemanagementResponses");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/responses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "libraryId", libraryId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ResponseEntityListing>() {});
  }

  /**
   * Gets a list of existing responses.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ResponseEntityListing getResponsemanagementResponses(GetResponsemanagementResponsesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ResponseEntityListing>() {});
  }

  /**
   * Gets a list of existing responses.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseEntityListing> getResponsemanagementResponses(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ResponseEntityListing>invokeAPIVerbose(request, new TypeReference<ResponseEntityListing>() {});
  }

  /**
   * Create a response library.
   * 
   * @param body Library (required)
   * @return Library
   * @throws ApiException if fails to make API call
   */
  public Library postResponsemanagementLibraries(Library body) throws IOException, ApiException {
    return postResponsemanagementLibrariesWithHttpInfo(body).getBody();
  }

  /**
   * Create a response library.
   * 
   * @param body Library (required)
   * @return Library
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Library> postResponsemanagementLibrariesWithHttpInfo(Library body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postResponsemanagementLibraries");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/libraries".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Library>() {});
  }

  /**
   * Create a response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Library postResponsemanagementLibraries(PostResponsemanagementLibrariesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Library>() {});
  }

  /**
   * Create a response library.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Library> postResponsemanagementLibraries(ApiRequest<Library> request) throws IOException, ApiException {
    return pcapiClient.<Library>invokeAPIVerbose(request, new TypeReference<Library>() {});
  }

  /**
   * Create a response.
   * 
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public Response postResponsemanagementResponses(Response body, String expand) throws IOException, ApiException {
    return postResponsemanagementResponsesWithHttpInfo(body, expand).getBody();
  }

  /**
   * Create a response.
   * 
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Response> postResponsemanagementResponsesWithHttpInfo(Response body, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postResponsemanagementResponses");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/responses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Response>() {});
  }

  /**
   * Create a response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Response postResponsemanagementResponses(PostResponsemanagementResponsesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Response>() {});
  }

  /**
   * Create a response.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Response> postResponsemanagementResponses(ApiRequest<Response> request) throws IOException, ApiException {
    return pcapiClient.<Response>invokeAPIVerbose(request, new TypeReference<Response>() {});
  }

  /**
   * Query responses
   * 
   * @param body Response (required)
   * @return ResponseQueryResults
   * @throws ApiException if fails to make API call
   */
  public ResponseQueryResults postResponsemanagementResponsesQuery(ResponseQueryRequest body) throws IOException, ApiException {
    return postResponsemanagementResponsesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query responses
   * 
   * @param body Response (required)
   * @return ResponseQueryResults
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseQueryResults> postResponsemanagementResponsesQueryWithHttpInfo(ResponseQueryRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postResponsemanagementResponsesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/responses/query".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ResponseQueryResults>() {});
  }

  /**
   * Query responses
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ResponseQueryResults postResponsemanagementResponsesQuery(PostResponsemanagementResponsesQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ResponseQueryResults>() {});
  }

  /**
   * Query responses
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseQueryResults> postResponsemanagementResponsesQuery(ApiRequest<ResponseQueryRequest> request) throws IOException, ApiException {
    return pcapiClient.<ResponseQueryResults>invokeAPIVerbose(request, new TypeReference<ResponseQueryResults>() {});
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @param libraryId Library ID (required)
   * @param body Library (required)
   * @return Library
   * @throws ApiException if fails to make API call
   */
  public Library putResponsemanagementLibrary(String libraryId, Library body) throws IOException, ApiException {
    return putResponsemanagementLibraryWithHttpInfo(libraryId, body).getBody();
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @param libraryId Library ID (required)
   * @param body Library (required)
   * @return Library
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Library> putResponsemanagementLibraryWithHttpInfo(String libraryId, Library body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'libraryId' is set
    if (libraryId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'libraryId' when calling putResponsemanagementLibrary");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putResponsemanagementLibrary");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/libraries/{libraryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "libraryId" + "\\}", pcapiClient.escapeString(libraryId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Library>() {});
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Library putResponsemanagementLibrary(PutResponsemanagementLibraryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Library>() {});
  }

  /**
   * Update an existing response library.
   * Fields that can be updated: name. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Library> putResponsemanagementLibrary(ApiRequest<Library> request) throws IOException, ApiException {
    return pcapiClient.<Library>invokeAPIVerbose(request, new TypeReference<Library>() {});
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @param responseId Response ID (required)
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public Response putResponsemanagementResponse(String responseId, Response body, String expand) throws IOException, ApiException {
    return putResponsemanagementResponseWithHttpInfo(responseId, body, expand).getBody();
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @param responseId Response ID (required)
   * @param body Response (required)
   * @param expand Expand instructions for the return value. (optional)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Response> putResponsemanagementResponseWithHttpInfo(String responseId, Response body, String expand) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'responseId' is set
    if (responseId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'responseId' when calling putResponsemanagementResponse");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putResponsemanagementResponse");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/responsemanagement/responses/{responseId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "responseId" + "\\}", pcapiClient.escapeString(responseId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "expand", expand));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Response>() {});
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Response putResponsemanagementResponse(PutResponsemanagementResponseRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Response>() {});
  }

  /**
   * Update an existing response.
   * Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Response> putResponsemanagementResponse(ApiRequest<Response> request) throws IOException, ApiException {
    return pcapiClient.<Response>invokeAPIVerbose(request, new TypeReference<Response>() {});
  }

}
