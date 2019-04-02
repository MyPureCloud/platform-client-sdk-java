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
import com.mypurecloud.sdk.v2.model.WidgetDeployment;
import com.mypurecloud.sdk.v2.model.WidgetDeploymentEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteWidgetsDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWidgetsDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWidgetsDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWidgetsDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PutWidgetsDeploymentRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WidgetsApi {
  private final ApiClient pcapiClient;

  public WidgetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WidgetsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a Widget deployment
   * 
   * @param deploymentId Widget Config Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWidgetsDeployment(String deploymentId) throws IOException, ApiException {
     deleteWidgetsDeployment(createDeleteWidgetsDeploymentRequest(deploymentId));
  }

  /**
   * Delete a Widget deployment
   * 
   * @param deploymentId Widget Config Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWidgetsDeploymentWithHttpInfo(String deploymentId) throws IOException {
    return deleteWidgetsDeployment(createDeleteWidgetsDeploymentRequest(deploymentId).withHttpInfo());
  }

  private DeleteWidgetsDeploymentRequest createDeleteWidgetsDeploymentRequest(String deploymentId) {
    return DeleteWidgetsDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .build();
  }

  /**
   * Delete a Widget deployment
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWidgetsDeployment(DeleteWidgetsDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Widget deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWidgetsDeployment(ApiRequest<Void> request) throws IOException {
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
   * Get a Widget deployment
   * 
   * @param deploymentId Widget Config Id (required)
   * @return WidgetDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeployment getWidgetsDeployment(String deploymentId) throws IOException, ApiException {
    return  getWidgetsDeployment(createGetWidgetsDeploymentRequest(deploymentId));
  }

  /**
   * Get a Widget deployment
   * 
   * @param deploymentId Widget Config Id (required)
   * @return WidgetDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeployment> getWidgetsDeploymentWithHttpInfo(String deploymentId) throws IOException {
    return getWidgetsDeployment(createGetWidgetsDeploymentRequest(deploymentId).withHttpInfo());
  }

  private GetWidgetsDeploymentRequest createGetWidgetsDeploymentRequest(String deploymentId) {
    return GetWidgetsDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .build();
  }

  /**
   * Get a Widget deployment
   * 
   * @param request The request object
   * @return WidgetDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeployment getWidgetsDeployment(GetWidgetsDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WidgetDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WidgetDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Widget deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeployment> getWidgetsDeployment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WidgetDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WidgetDeployment> response = (ApiResponse<WidgetDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WidgetDeployment> response = (ApiResponse<WidgetDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List Widget deployments
   * 
   * @return WidgetDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeploymentEntityListing getWidgetsDeployments() throws IOException, ApiException {
    return  getWidgetsDeployments(createGetWidgetsDeploymentsRequest());
  }

  /**
   * List Widget deployments
   * 
   * @return WidgetDeploymentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeploymentEntityListing> getWidgetsDeploymentsWithHttpInfo() throws IOException {
    return getWidgetsDeployments(createGetWidgetsDeploymentsRequest().withHttpInfo());
  }

  private GetWidgetsDeploymentsRequest createGetWidgetsDeploymentsRequest() {
    return GetWidgetsDeploymentsRequest.builder()
            .build();
  }

  /**
   * List Widget deployments
   * 
   * @param request The request object
   * @return WidgetDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeploymentEntityListing getWidgetsDeployments(GetWidgetsDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WidgetDeploymentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WidgetDeploymentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List Widget deployments
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeploymentEntityListing> getWidgetsDeployments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WidgetDeploymentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WidgetDeploymentEntityListing> response = (ApiResponse<WidgetDeploymentEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WidgetDeploymentEntityListing> response = (ApiResponse<WidgetDeploymentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create Widget deployment
   * 
   * @param body Deployment (required)
   * @return WidgetDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeployment postWidgetsDeployments(WidgetDeployment body) throws IOException, ApiException {
    return  postWidgetsDeployments(createPostWidgetsDeploymentsRequest(body));
  }

  /**
   * Create Widget deployment
   * 
   * @param body Deployment (required)
   * @return WidgetDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeployment> postWidgetsDeploymentsWithHttpInfo(WidgetDeployment body) throws IOException {
    return postWidgetsDeployments(createPostWidgetsDeploymentsRequest(body).withHttpInfo());
  }

  private PostWidgetsDeploymentsRequest createPostWidgetsDeploymentsRequest(WidgetDeployment body) {
    return PostWidgetsDeploymentsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create Widget deployment
   * 
   * @param request The request object
   * @return WidgetDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeployment postWidgetsDeployments(PostWidgetsDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WidgetDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WidgetDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Widget deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeployment> postWidgetsDeployments(ApiRequest<WidgetDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WidgetDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WidgetDeployment> response = (ApiResponse<WidgetDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WidgetDeployment> response = (ApiResponse<WidgetDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a Widget deployment
   * 
   * @param deploymentId Widget Config Id (required)
   * @param body Deployment (required)
   * @return WidgetDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeployment putWidgetsDeployment(String deploymentId, WidgetDeployment body) throws IOException, ApiException {
    return  putWidgetsDeployment(createPutWidgetsDeploymentRequest(deploymentId, body));
  }

  /**
   * Update a Widget deployment
   * 
   * @param deploymentId Widget Config Id (required)
   * @param body Deployment (required)
   * @return WidgetDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeployment> putWidgetsDeploymentWithHttpInfo(String deploymentId, WidgetDeployment body) throws IOException {
    return putWidgetsDeployment(createPutWidgetsDeploymentRequest(deploymentId, body).withHttpInfo());
  }

  private PutWidgetsDeploymentRequest createPutWidgetsDeploymentRequest(String deploymentId, WidgetDeployment body) {
    return PutWidgetsDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a Widget deployment
   * 
   * @param request The request object
   * @return WidgetDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WidgetDeployment putWidgetsDeployment(PutWidgetsDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WidgetDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WidgetDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Widget deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WidgetDeployment> putWidgetsDeployment(ApiRequest<WidgetDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WidgetDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WidgetDeployment> response = (ApiResponse<WidgetDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WidgetDeployment> response = (ApiResponse<WidgetDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
