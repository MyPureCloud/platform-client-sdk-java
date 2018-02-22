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
import com.mypurecloud.sdk.v2.model.WebChatDeployment;
import com.mypurecloud.sdk.v2.model.WebChatDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.WebChatSettings;


import com.mypurecloud.sdk.v2.api.request.DeleteWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WebChatApi {
  private final ApiClient pcapiClient;

  public WebChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebChatApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatDeployment(String deploymentId) throws IOException, ApiException {
     deleteWebchatDeployment(createDeleteWebchatDeploymentRequest(deploymentId));
  }

  /**
   * Delete a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatDeploymentWithHttpInfo(String deploymentId) throws IOException {
    return deleteWebchatDeployment(createDeleteWebchatDeploymentRequest(deploymentId).withHttpInfo());
  }

  private DeleteWebchatDeploymentRequest createDeleteWebchatDeploymentRequest(String deploymentId) {
    return DeleteWebchatDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .build();
  }

  /**
   * Delete a WebChat deployment
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatDeployment(DeleteWebchatDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatDeployment(ApiRequest<Void> request) throws IOException {
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
   * Remove WebChat deployment settings
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatSettings() throws IOException, ApiException {
     deleteWebchatSettings(createDeleteWebchatSettingsRequest());
  }

  /**
   * Remove WebChat deployment settings
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatSettingsWithHttpInfo() throws IOException {
    return deleteWebchatSettings(createDeleteWebchatSettingsRequest().withHttpInfo());
  }

  private DeleteWebchatSettingsRequest createDeleteWebchatSettingsRequest() {
    return DeleteWebchatSettingsRequest.builder()
            .build();
  }

  /**
   * Remove WebChat deployment settings
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebchatSettings(DeleteWebchatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove WebChat deployment settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebchatSettings(ApiRequest<Void> request) throws IOException {
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
   * Get a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment getWebchatDeployment(String deploymentId) throws IOException, ApiException {
    return  getWebchatDeployment(createGetWebchatDeploymentRequest(deploymentId));
  }

  /**
   * Get a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @return WebChatDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> getWebchatDeploymentWithHttpInfo(String deploymentId) throws IOException {
    return getWebchatDeployment(createGetWebchatDeploymentRequest(deploymentId).withHttpInfo());
  }

  private GetWebchatDeploymentRequest createGetWebchatDeploymentRequest(String deploymentId) {
    return GetWebchatDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .build();
  }

  /**
   * Get a WebChat deployment
   * 
   * @param request The request object
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment getWebchatDeployment(GetWebchatDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> getWebchatDeployment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List WebChat deployments
   * 
   * @return WebChatDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeploymentEntityListing getWebchatDeployments() throws IOException, ApiException {
    return  getWebchatDeployments(createGetWebchatDeploymentsRequest());
  }

  /**
   * List WebChat deployments
   * 
   * @return WebChatDeploymentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeploymentEntityListing> getWebchatDeploymentsWithHttpInfo() throws IOException {
    return getWebchatDeployments(createGetWebchatDeploymentsRequest().withHttpInfo());
  }

  private GetWebchatDeploymentsRequest createGetWebchatDeploymentsRequest() {
    return GetWebchatDeploymentsRequest.builder()
            .build();
  }

  /**
   * List WebChat deployments
   * 
   * @param request The request object
   * @return WebChatDeploymentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeploymentEntityListing getWebchatDeployments(GetWebchatDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeploymentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeploymentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List WebChat deployments
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeploymentEntityListing> getWebchatDeployments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeploymentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get WebChat deployment settings
   * 
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings getWebchatSettings() throws IOException, ApiException {
    return  getWebchatSettings(createGetWebchatSettingsRequest());
  }

  /**
   * Get WebChat deployment settings
   * 
   * @return WebChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> getWebchatSettingsWithHttpInfo() throws IOException {
    return getWebchatSettings(createGetWebchatSettingsRequest().withHttpInfo());
  }

  private GetWebchatSettingsRequest createGetWebchatSettingsRequest() {
    return GetWebchatSettingsRequest.builder()
            .build();
  }

  /**
   * Get WebChat deployment settings
   * 
   * @param request The request object
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings getWebchatSettings(GetWebchatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get WebChat deployment settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> getWebchatSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create WebChat deployment
   * 
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment postWebchatDeployments(WebChatDeployment body) throws IOException, ApiException {
    return  postWebchatDeployments(createPostWebchatDeploymentsRequest(body));
  }

  /**
   * Create WebChat deployment
   * 
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> postWebchatDeploymentsWithHttpInfo(WebChatDeployment body) throws IOException {
    return postWebchatDeployments(createPostWebchatDeploymentsRequest(body).withHttpInfo());
  }

  private PostWebchatDeploymentsRequest createPostWebchatDeploymentsRequest(WebChatDeployment body) {
    return PostWebchatDeploymentsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create WebChat deployment
   * 
   * @param request The request object
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment postWebchatDeployments(PostWebchatDeploymentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> postWebchatDeployments(ApiRequest<WebChatDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create WebChat deployment settings
   * 
   * @param body webChatSettings (required)
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings postWebchatSettings(WebChatSettings body) throws IOException, ApiException {
    return  postWebchatSettings(createPostWebchatSettingsRequest(body));
  }

  /**
   * Create WebChat deployment settings
   * 
   * @param body webChatSettings (required)
   * @return WebChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> postWebchatSettingsWithHttpInfo(WebChatSettings body) throws IOException {
    return postWebchatSettings(createPostWebchatSettingsRequest(body).withHttpInfo());
  }

  private PostWebchatSettingsRequest createPostWebchatSettingsRequest(WebChatSettings body) {
    return PostWebchatSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create WebChat deployment settings
   * 
   * @param request The request object
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings postWebchatSettings(PostWebchatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create WebChat deployment settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> postWebchatSettings(ApiRequest<WebChatSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment putWebchatDeployment(String deploymentId, WebChatDeployment body) throws IOException, ApiException {
    return  putWebchatDeployment(createPutWebchatDeploymentRequest(deploymentId, body));
  }

  /**
   * Update a WebChat deployment
   * 
   * @param deploymentId Deployment Id (required)
   * @param body Deployment (required)
   * @return WebChatDeployment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> putWebchatDeploymentWithHttpInfo(String deploymentId, WebChatDeployment body) throws IOException {
    return putWebchatDeployment(createPutWebchatDeploymentRequest(deploymentId, body).withHttpInfo());
  }

  private PutWebchatDeploymentRequest createPutWebchatDeploymentRequest(String deploymentId, WebChatDeployment body) {
    return PutWebchatDeploymentRequest.builder()
            .withDeploymentId(deploymentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a WebChat deployment
   * 
   * @param request The request object
   * @return WebChatDeployment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatDeployment putWebchatDeployment(PutWebchatDeploymentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatDeployment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a WebChat deployment
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatDeployment> putWebchatDeployment(ApiRequest<WebChatDeployment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatDeployment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
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
      ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update WebChat deployment settings
   * 
   * @param body webChatSettings (required)
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings putWebchatSettings(WebChatSettings body) throws IOException, ApiException {
    return  putWebchatSettings(createPutWebchatSettingsRequest(body));
  }

  /**
   * Update WebChat deployment settings
   * 
   * @param body webChatSettings (required)
   * @return WebChatSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> putWebchatSettingsWithHttpInfo(WebChatSettings body) throws IOException {
    return putWebchatSettings(createPutWebchatSettingsRequest(body).withHttpInfo());
  }

  private PutWebchatSettingsRequest createPutWebchatSettingsRequest(WebChatSettings body) {
    return PutWebchatSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update WebChat deployment settings
   * 
   * @param request The request object
   * @return WebChatSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebChatSettings putWebchatSettings(PutWebchatSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebChatSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebChatSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update WebChat deployment settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebChatSettings> putWebchatSettings(ApiRequest<WebChatSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebChatSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
