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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsHomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsLimitRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionObjectRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionRestoreRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationDivisionRequest;

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
   * Delete a division.
   * 
   * @param divisionId Division ID (required)
   * @param force Force delete this division as well as the grants and objects associated with it (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationDivision(String divisionId, Boolean force) throws IOException, ApiException {
     deleteAuthorizationDivision(createDeleteAuthorizationDivisionRequest(divisionId, force));
  }

  /**
   * Delete a division.
   * 
   * @param divisionId Division ID (required)
   * @param force Force delete this division as well as the grants and objects associated with it (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationDivisionWithHttpInfo(String divisionId, Boolean force) throws IOException {
    return deleteAuthorizationDivision(createDeleteAuthorizationDivisionRequest(divisionId, force).withHttpInfo());
  }

  private DeleteAuthorizationDivisionRequest createDeleteAuthorizationDivisionRequest(String divisionId, Boolean force) {
    return DeleteAuthorizationDivisionRequest.builder()
            .withDivisionId(divisionId)
    
            .withForce(force)
    
            .build();
  }

  /**
   * Delete a division.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAuthorizationDivision(DeleteAuthorizationDivisionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAuthorizationDivision(ApiRequest<Void> request) throws IOException {
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
   * Returns an authorization division.
   * 
   * @param divisionId Division ID (required)
   * @param objectCount Get count of objects in this division, grouped by type (optional, default to false)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivision(String divisionId, Boolean objectCount) throws IOException, ApiException {
    return  getAuthorizationDivision(createGetAuthorizationDivisionRequest(divisionId, objectCount));
  }

  /**
   * Returns an authorization division.
   * 
   * @param divisionId Division ID (required)
   * @param objectCount Get count of objects in this division, grouped by type (optional, default to false)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivisionWithHttpInfo(String divisionId, Boolean objectCount) throws IOException {
    return getAuthorizationDivision(createGetAuthorizationDivisionRequest(divisionId, objectCount).withHttpInfo());
  }

  private GetAuthorizationDivisionRequest createGetAuthorizationDivisionRequest(String divisionId, Boolean objectCount) {
    return GetAuthorizationDivisionRequest.builder()
            .withDivisionId(divisionId)
    
            .withObjectCount(objectCount)
    
            .build();
  }

  /**
   * Returns an authorization division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivision(GetAuthorizationDivisionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns an authorization division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivision(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param objectCount Include the count of objects contained in the division (optional, default to false)
   * @param id Optionally request specific divisions by their IDs (optional)
   * @param name Search term to filter by division name (optional)
   * @return AuthzDivisionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionEntityListing getAuthorizationDivisions(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean objectCount, List<String> id, String name) throws IOException, ApiException {
    return  getAuthorizationDivisions(createGetAuthorizationDivisionsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name));
  }

  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param objectCount Include the count of objects contained in the division (optional, default to false)
   * @param id Optionally request specific divisions by their IDs (optional)
   * @param name Search term to filter by division name (optional)
   * @return AuthzDivisionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionEntityListing> getAuthorizationDivisionsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean objectCount, List<String> id, String name) throws IOException {
    return getAuthorizationDivisions(createGetAuthorizationDivisionsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name).withHttpInfo());
  }

  private GetAuthorizationDivisionsRequest createGetAuthorizationDivisionsRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage, Boolean objectCount, List<String> id, String name) {
    return GetAuthorizationDivisionsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withObjectCount(objectCount)
    
            .withId(id)
    
            .withName(name)
    
            .build();
  }

  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param request The request object
   * @return AuthzDivisionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivisionEntityListing getAuthorizationDivisions(GetAuthorizationDivisionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivisionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivisionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivisionEntityListing> getAuthorizationDivisions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivisionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivisionEntityListing> response = (ApiResponse<AuthzDivisionEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivisionEntityListing> response = (ApiResponse<AuthzDivisionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivisionsHome() throws IOException, ApiException {
    return  getAuthorizationDivisionsHome(createGetAuthorizationDivisionsHomeRequest());
  }

  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivisionsHomeWithHttpInfo() throws IOException {
    return getAuthorizationDivisionsHome(createGetAuthorizationDivisionsHomeRequest().withHttpInfo());
  }

  private GetAuthorizationDivisionsHomeRequest createGetAuthorizationDivisionsHomeRequest() {
    return GetAuthorizationDivisionsHomeRequest.builder()
            .build();
  }

  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision getAuthorizationDivisionsHome(GetAuthorizationDivisionsHomeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> getAuthorizationDivisionsHome(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param divisionId Division ID (required)
   * @param objectType The type of the objects. Must be one of the valid object types (required)
   * @param body Object Id List (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationDivisionObject(String divisionId, String objectType, List<String> body) throws IOException, ApiException {
     postAuthorizationDivisionObject(createPostAuthorizationDivisionObjectRequest(divisionId, objectType, body));
  }

  /**
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param divisionId Division ID (required)
   * @param objectType The type of the objects. Must be one of the valid object types (required)
   * @param body Object Id List (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationDivisionObjectWithHttpInfo(String divisionId, String objectType, List<String> body) throws IOException {
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
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postAuthorizationDivisionObject(PostAuthorizationDivisionObjectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postAuthorizationDivisionObject(ApiRequest<List<String>> request) throws IOException {
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
   * Recreate a previously deleted division.
   * 
   * @param divisionId Division ID (required)
   * @param body Recreated division data (required)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisionRestore(String divisionId, AuthzDivision body) throws IOException, ApiException {
    return  postAuthorizationDivisionRestore(createPostAuthorizationDivisionRestoreRequest(divisionId, body));
  }

  /**
   * Recreate a previously deleted division.
   * 
   * @param divisionId Division ID (required)
   * @param body Recreated division data (required)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisionRestoreWithHttpInfo(String divisionId, AuthzDivision body) throws IOException {
    return postAuthorizationDivisionRestore(createPostAuthorizationDivisionRestoreRequest(divisionId, body).withHttpInfo());
  }

  private PostAuthorizationDivisionRestoreRequest createPostAuthorizationDivisionRestoreRequest(String divisionId, AuthzDivision body) {
    return PostAuthorizationDivisionRestoreRequest.builder()
            .withDivisionId(divisionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Recreate a previously deleted division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisionRestore(PostAuthorizationDivisionRestoreRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Recreate a previously deleted division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisionRestore(ApiRequest<AuthzDivision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a division.
   * 
   * @param body Division (required)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisions(AuthzDivision body) throws IOException, ApiException {
    return  postAuthorizationDivisions(createPostAuthorizationDivisionsRequest(body));
  }

  /**
   * Create a division.
   * 
   * @param body Division (required)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisionsWithHttpInfo(AuthzDivision body) throws IOException {
    return postAuthorizationDivisions(createPostAuthorizationDivisionsRequest(body).withHttpInfo());
  }

  private PostAuthorizationDivisionsRequest createPostAuthorizationDivisionsRequest(AuthzDivision body) {
    return PostAuthorizationDivisionsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision postAuthorizationDivisions(PostAuthorizationDivisionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> postAuthorizationDivisions(ApiRequest<AuthzDivision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a division.
   * 
   * @param divisionId Division ID (required)
   * @param body Updated division data (required)
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision putAuthorizationDivision(String divisionId, AuthzDivision body) throws IOException, ApiException {
    return  putAuthorizationDivision(createPutAuthorizationDivisionRequest(divisionId, body));
  }

  /**
   * Update a division.
   * 
   * @param divisionId Division ID (required)
   * @param body Updated division data (required)
   * @return AuthzDivision
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> putAuthorizationDivisionWithHttpInfo(String divisionId, AuthzDivision body) throws IOException {
    return putAuthorizationDivision(createPutAuthorizationDivisionRequest(divisionId, body).withHttpInfo());
  }

  private PutAuthorizationDivisionRequest createPutAuthorizationDivisionRequest(String divisionId, AuthzDivision body) {
    return PutAuthorizationDivisionRequest.builder()
            .withDivisionId(divisionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a division.
   * 
   * @param request The request object
   * @return AuthzDivision
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuthzDivision putAuthorizationDivision(PutAuthorizationDivisionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuthzDivision> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuthzDivision>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a division.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuthzDivision> putAuthorizationDivision(ApiRequest<AuthzDivision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuthzDivision>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
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
      ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
