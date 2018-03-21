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
import com.mypurecloud.sdk.v2.model.AuthzTypedObject;


import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsLimitRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionObjectRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ObjectsApi {
  private final ApiClient pcapiClient;

  public ObjectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ObjectsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @return Integer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integer getAuthorizationDivisionsLimit() throws IOException, ApiException {
    return  getAuthorizationDivisionsLimit(createGetAuthorizationDivisionsLimitRequest());
  }

  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @return Integer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integer> getAuthorizationDivisionsLimitWithHttpInfo() throws IOException {
    return getAuthorizationDivisionsLimit(createGetAuthorizationDivisionsLimitRequest().withHttpInfo());
  }

  private GetAuthorizationDivisionsLimitRequest createGetAuthorizationDivisionsLimitRequest() {
    return GetAuthorizationDivisionsLimitRequest.builder()
            .build();
  }

  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @param request The request object
   * @return Integer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integer getAuthorizationDivisionsLimit(GetAuthorizationDivisionsLimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Integer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Integer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns the maximum allowed number of divisions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integer> getAuthorizationDivisionsLimit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Integer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Integer> response = (ApiResponse<Integer>)(ApiResponse<?>)exception;
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
      ApiResponse<Integer> response = (ApiResponse<Integer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Set the division of a list of objects. The objects must all be of the same type: CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, QUEUE, USER
   * 
   * @param divisionId Division ID (required)
   * @param objectType The type of the objects. Must be one of the valid object types (required)
   * @param body Object Id List (required)
   * @return List<AuthzTypedObject>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AuthzTypedObject> postAuthorizationDivisionObject(String divisionId, String objectType, List<String> body) throws IOException, ApiException {
    return  postAuthorizationDivisionObject(createPostAuthorizationDivisionObjectRequest(divisionId, objectType, body));
  }

  /**
   * Set the division of a list of objects. The objects must all be of the same type: CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, QUEUE, USER
   * 
   * @param divisionId Division ID (required)
   * @param objectType The type of the objects. Must be one of the valid object types (required)
   * @param body Object Id List (required)
   * @return List<AuthzTypedObject>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AuthzTypedObject>> postAuthorizationDivisionObjectWithHttpInfo(String divisionId, String objectType, List<String> body) throws IOException {
    return postAuthorizationDivisionObject(createPostAuthorizationDivisionObjectRequest(divisionId, objectType, body).withHttpInfo());
  }

  private PostAuthorizationDivisionObjectRequest createPostAuthorizationDivisionObjectRequest(String divisionId, String objectType, List<String> body) {
    return PostAuthorizationDivisionObjectRequest.builder()
            .withDivisionId(divisionId)
    
            .withObjectType(objectType)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Set the division of a list of objects. The objects must all be of the same type: CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, QUEUE, USER
   * 
   * @param request The request object
   * @return List<AuthzTypedObject>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AuthzTypedObject> postAuthorizationDivisionObject(PostAuthorizationDivisionObjectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<AuthzTypedObject>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<AuthzTypedObject>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Set the division of a list of objects. The objects must all be of the same type: CAMPAIGN, CONTACTLIST, DNCLIST, MANAGEMENTUNIT, FLOW, QUEUE, USER
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AuthzTypedObject>> postAuthorizationDivisionObject(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<AuthzTypedObject>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<AuthzTypedObject>> response = (ApiResponse<List<AuthzTypedObject>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<AuthzTypedObject>> response = (ApiResponse<List<AuthzTypedObject>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
