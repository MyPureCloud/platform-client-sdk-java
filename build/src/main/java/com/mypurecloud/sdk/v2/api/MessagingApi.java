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
import com.mypurecloud.sdk.v2.model.MessagingIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegration;
import com.mypurecloud.sdk.v2.model.LineIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.LineIntegration;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterIntegration;
import com.mypurecloud.sdk.v2.model.MessagingStickerEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationRequest;
import com.mypurecloud.sdk.v2.model.LineIntegrationRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteMessagingIntegrationsFacebookIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteMessagingIntegrationsTwitterIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsLineRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsMessagingStickerRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingIntegrationsFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingIntegrationsFacebookIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingIntegrationsLineRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingIntegrationsTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingIntegrationsTwitterIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingStickerRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsLineRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsMessagingIntegrationsTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingIntegrationsFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingIntegrationsLineRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingIntegrationsTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationsMessagingIntegrationsLineIntegrationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutMessagingIntegrationsLineIntegrationIdRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MessagingApi {
  private final ApiClient pcapiClient;

  public MessagingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsFacebookIntegrationId(String integrationId) throws IOException, ApiException {
     deleteConversationsMessagingIntegrationsFacebookIntegrationId(createDeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsFacebookIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsFacebookIntegrationId(createDeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest createDeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsFacebookIntegrationId(DeleteConversationsMessagingIntegrationsFacebookIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsFacebookIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsLineIntegrationId(String integrationId) throws IOException, ApiException {
     deleteConversationsMessagingIntegrationsLineIntegrationId(createDeleteConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsLineIntegrationId(createDeleteConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest createDeleteConversationsMessagingIntegrationsLineIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsLineIntegrationId(DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsLineIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsTwitterIntegrationId(String integrationId) throws IOException, ApiException {
     deleteConversationsMessagingIntegrationsTwitterIntegrationId(createDeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsTwitterIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteConversationsMessagingIntegrationsTwitterIntegrationId(createDeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest createDeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest(String integrationId) {
    return DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsMessagingIntegrationsTwitterIntegrationId(DeleteConversationsMessagingIntegrationsTwitterIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsMessagingIntegrationsTwitterIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingIntegrationsFacebookIntegrationId(String integrationId) throws IOException, ApiException {
     deleteMessagingIntegrationsFacebookIntegrationId(createDeleteMessagingIntegrationsFacebookIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingIntegrationsFacebookIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteMessagingIntegrationsFacebookIntegrationId(createDeleteMessagingIntegrationsFacebookIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteMessagingIntegrationsFacebookIntegrationIdRequest createDeleteMessagingIntegrationsFacebookIntegrationIdRequest(String integrationId) {
    return DeleteMessagingIntegrationsFacebookIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingIntegrationsFacebookIntegrationId(DeleteMessagingIntegrationsFacebookIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Facebook messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingIntegrationsFacebookIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingIntegrationsLineIntegrationId(String integrationId) throws IOException, ApiException {
     deleteMessagingIntegrationsLineIntegrationId(createDeleteMessagingIntegrationsLineIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteMessagingIntegrationsLineIntegrationId(createDeleteMessagingIntegrationsLineIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteMessagingIntegrationsLineIntegrationIdRequest createDeleteMessagingIntegrationsLineIntegrationIdRequest(String integrationId) {
    return DeleteMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingIntegrationsLineIntegrationId(DeleteMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingIntegrationsLineIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Delete a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingIntegrationsTwitterIntegrationId(String integrationId) throws IOException, ApiException {
     deleteMessagingIntegrationsTwitterIntegrationId(createDeleteMessagingIntegrationsTwitterIntegrationIdRequest(integrationId));
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingIntegrationsTwitterIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return deleteMessagingIntegrationsTwitterIntegrationId(createDeleteMessagingIntegrationsTwitterIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private DeleteMessagingIntegrationsTwitterIntegrationIdRequest createDeleteMessagingIntegrationsTwitterIntegrationIdRequest(String integrationId) {
    return DeleteMessagingIntegrationsTwitterIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteMessagingIntegrationsTwitterIntegrationId(DeleteMessagingIntegrationsTwitterIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Twitter messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteMessagingIntegrationsTwitterIntegrationId(ApiRequest<Void> request) throws IOException {
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
   * Get a list of Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingIntegrationEntityListing getConversationsMessagingIntegrations(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getConversationsMessagingIntegrations(createGetConversationsMessagingIntegrationsRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingIntegrationEntityListing> getConversationsMessagingIntegrationsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getConversationsMessagingIntegrations(createGetConversationsMessagingIntegrationsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsRequest createGetConversationsMessagingIntegrationsRequest(Integer pageSize, Integer pageNumber) {
    return GetConversationsMessagingIntegrationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Integrations
   * 
   * @param request The request object
   * @return MessagingIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingIntegrationEntityListing getConversationsMessagingIntegrations(GetConversationsMessagingIntegrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingIntegrationEntityListing> getConversationsMessagingIntegrations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingIntegrationEntityListing> response = (ApiResponse<MessagingIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingIntegrationEntityListing> response = (ApiResponse<MessagingIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Facebook Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FacebookIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegrationEntityListing getConversationsMessagingIntegrationsFacebook(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsFacebook(createGetConversationsMessagingIntegrationsFacebookRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FacebookIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegrationEntityListing> getConversationsMessagingIntegrationsFacebookWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getConversationsMessagingIntegrationsFacebook(createGetConversationsMessagingIntegrationsFacebookRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsFacebookRequest createGetConversationsMessagingIntegrationsFacebookRequest(Integer pageSize, Integer pageNumber) {
    return GetConversationsMessagingIntegrationsFacebookRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param request The request object
   * @return FacebookIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegrationEntityListing getConversationsMessagingIntegrationsFacebook(GetConversationsMessagingIntegrationsFacebookRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegrationEntityListing> getConversationsMessagingIntegrationsFacebook(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegrationEntityListing> response = (ApiResponse<FacebookIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookIntegrationEntityListing> response = (ApiResponse<FacebookIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration getConversationsMessagingIntegrationsFacebookIntegrationId(String integrationId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsFacebookIntegrationId(createGetConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId));
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return FacebookIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> getConversationsMessagingIntegrationsFacebookIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return getConversationsMessagingIntegrationsFacebookIntegrationId(createGetConversationsMessagingIntegrationsFacebookIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest createGetConversationsMessagingIntegrationsFacebookIntegrationIdRequest(String integrationId) {
    return GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param request The request object
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration getConversationsMessagingIntegrationsFacebookIntegrationId(GetConversationsMessagingIntegrationsFacebookIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> getConversationsMessagingIntegrationsFacebookIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return LineIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegrationEntityListing getConversationsMessagingIntegrationsLine(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsLine(createGetConversationsMessagingIntegrationsLineRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return LineIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegrationEntityListing> getConversationsMessagingIntegrationsLineWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getConversationsMessagingIntegrationsLine(createGetConversationsMessagingIntegrationsLineRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsLineRequest createGetConversationsMessagingIntegrationsLineRequest(Integer pageSize, Integer pageNumber) {
    return GetConversationsMessagingIntegrationsLineRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param request The request object
   * @return LineIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegrationEntityListing getConversationsMessagingIntegrationsLine(GetConversationsMessagingIntegrationsLineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegrationEntityListing> getConversationsMessagingIntegrationsLine(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegrationEntityListing> response = (ApiResponse<LineIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegrationEntityListing> response = (ApiResponse<LineIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration getConversationsMessagingIntegrationsLineIntegrationId(String integrationId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsLineIntegrationId(createGetConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId));
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> getConversationsMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return getConversationsMessagingIntegrationsLineIntegrationId(createGetConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsLineIntegrationIdRequest createGetConversationsMessagingIntegrationsLineIntegrationIdRequest(String integrationId) {
    return GetConversationsMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration getConversationsMessagingIntegrationsLineIntegrationId(GetConversationsMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> getConversationsMessagingIntegrationsLineIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Twitter Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TwitterIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegrationEntityListing getConversationsMessagingIntegrationsTwitter(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsTwitter(createGetConversationsMessagingIntegrationsTwitterRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TwitterIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegrationEntityListing> getConversationsMessagingIntegrationsTwitterWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getConversationsMessagingIntegrationsTwitter(createGetConversationsMessagingIntegrationsTwitterRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsTwitterRequest createGetConversationsMessagingIntegrationsTwitterRequest(Integer pageSize, Integer pageNumber) {
    return GetConversationsMessagingIntegrationsTwitterRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param request The request object
   * @return TwitterIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegrationEntityListing getConversationsMessagingIntegrationsTwitter(GetConversationsMessagingIntegrationsTwitterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegrationEntityListing> getConversationsMessagingIntegrationsTwitter(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegrationEntityListing> response = (ApiResponse<TwitterIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterIntegrationEntityListing> response = (ApiResponse<TwitterIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration getConversationsMessagingIntegrationsTwitterIntegrationId(String integrationId) throws IOException, ApiException {
    return  getConversationsMessagingIntegrationsTwitterIntegrationId(createGetConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId));
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return TwitterIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> getConversationsMessagingIntegrationsTwitterIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return getConversationsMessagingIntegrationsTwitterIntegrationId(createGetConversationsMessagingIntegrationsTwitterIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest createGetConversationsMessagingIntegrationsTwitterIntegrationIdRequest(String integrationId) {
    return GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param request The request object
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration getConversationsMessagingIntegrationsTwitterIntegrationId(GetConversationsMessagingIntegrationsTwitterIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> getConversationsMessagingIntegrationsTwitterIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Messaging Stickers
   * 
   * @param messengerType Messenger Type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingStickerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingStickerEntityListing getConversationsMessagingSticker(String messengerType, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getConversationsMessagingSticker(createGetConversationsMessagingStickerRequest(messengerType, pageSize, pageNumber));
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param messengerType Messenger Type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingStickerEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingStickerEntityListing> getConversationsMessagingStickerWithHttpInfo(String messengerType, Integer pageSize, Integer pageNumber) throws IOException {
    return getConversationsMessagingSticker(createGetConversationsMessagingStickerRequest(messengerType, pageSize, pageNumber).withHttpInfo());
  }

  private GetConversationsMessagingStickerRequest createGetConversationsMessagingStickerRequest(String messengerType, Integer pageSize, Integer pageNumber) {
    return GetConversationsMessagingStickerRequest.builder()
            .withMessengerType(messengerType)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param request The request object
   * @return MessagingStickerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingStickerEntityListing getConversationsMessagingSticker(GetConversationsMessagingStickerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingStickerEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingStickerEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingStickerEntityListing> getConversationsMessagingSticker(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingStickerEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingStickerEntityListing> response = (ApiResponse<MessagingStickerEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingStickerEntityListing> response = (ApiResponse<MessagingStickerEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingIntegrationEntityListing getMessagingIntegrations(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingIntegrations(createGetMessagingIntegrationsRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingIntegrationEntityListing> getMessagingIntegrationsWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingIntegrations(createGetMessagingIntegrationsRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingIntegrationsRequest createGetMessagingIntegrationsRequest(Integer pageSize, Integer pageNumber) {
    return GetMessagingIntegrationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Integrations
   * 
   * @param request The request object
   * @return MessagingIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingIntegrationEntityListing getMessagingIntegrations(GetMessagingIntegrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingIntegrationEntityListing> getMessagingIntegrations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingIntegrationEntityListing> response = (ApiResponse<MessagingIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingIntegrationEntityListing> response = (ApiResponse<MessagingIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Facebook Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FacebookIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegrationEntityListing getMessagingIntegrationsFacebook(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingIntegrationsFacebook(createGetMessagingIntegrationsFacebookRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return FacebookIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegrationEntityListing> getMessagingIntegrationsFacebookWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingIntegrationsFacebook(createGetMessagingIntegrationsFacebookRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingIntegrationsFacebookRequest createGetMessagingIntegrationsFacebookRequest(Integer pageSize, Integer pageNumber) {
    return GetMessagingIntegrationsFacebookRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param request The request object
   * @return FacebookIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegrationEntityListing getMessagingIntegrationsFacebook(GetMessagingIntegrationsFacebookRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Facebook Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegrationEntityListing> getMessagingIntegrationsFacebook(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegrationEntityListing> response = (ApiResponse<FacebookIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookIntegrationEntityListing> response = (ApiResponse<FacebookIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration getMessagingIntegrationsFacebookIntegrationId(String integrationId) throws IOException, ApiException {
    return  getMessagingIntegrationsFacebookIntegrationId(createGetMessagingIntegrationsFacebookIntegrationIdRequest(integrationId));
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return FacebookIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> getMessagingIntegrationsFacebookIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return getMessagingIntegrationsFacebookIntegrationId(createGetMessagingIntegrationsFacebookIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private GetMessagingIntegrationsFacebookIntegrationIdRequest createGetMessagingIntegrationsFacebookIntegrationIdRequest(String integrationId) {
    return GetMessagingIntegrationsFacebookIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param request The request object
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration getMessagingIntegrationsFacebookIntegrationId(GetMessagingIntegrationsFacebookIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Facebook messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> getMessagingIntegrationsFacebookIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return LineIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegrationEntityListing getMessagingIntegrationsLine(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingIntegrationsLine(createGetMessagingIntegrationsLineRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return LineIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegrationEntityListing> getMessagingIntegrationsLineWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingIntegrationsLine(createGetMessagingIntegrationsLineRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingIntegrationsLineRequest createGetMessagingIntegrationsLineRequest(Integer pageSize, Integer pageNumber) {
    return GetMessagingIntegrationsLineRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param request The request object
   * @return LineIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegrationEntityListing getMessagingIntegrationsLine(GetMessagingIntegrationsLineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of LINE messenger Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegrationEntityListing> getMessagingIntegrationsLine(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegrationEntityListing> response = (ApiResponse<LineIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegrationEntityListing> response = (ApiResponse<LineIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration getMessagingIntegrationsLineIntegrationId(String integrationId) throws IOException, ApiException {
    return  getMessagingIntegrationsLineIntegrationId(createGetMessagingIntegrationsLineIntegrationIdRequest(integrationId));
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> getMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return getMessagingIntegrationsLineIntegrationId(createGetMessagingIntegrationsLineIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private GetMessagingIntegrationsLineIntegrationIdRequest createGetMessagingIntegrationsLineIntegrationIdRequest(String integrationId) {
    return GetMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration getMessagingIntegrationsLineIntegrationId(GetMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> getMessagingIntegrationsLineIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Twitter Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TwitterIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegrationEntityListing getMessagingIntegrationsTwitter(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingIntegrationsTwitter(createGetMessagingIntegrationsTwitterRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return TwitterIntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegrationEntityListing> getMessagingIntegrationsTwitterWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingIntegrationsTwitter(createGetMessagingIntegrationsTwitterRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingIntegrationsTwitterRequest createGetMessagingIntegrationsTwitterRequest(Integer pageSize, Integer pageNumber) {
    return GetMessagingIntegrationsTwitterRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param request The request object
   * @return TwitterIntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegrationEntityListing getMessagingIntegrationsTwitter(GetMessagingIntegrationsTwitterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Twitter Integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegrationEntityListing> getMessagingIntegrationsTwitter(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegrationEntityListing> response = (ApiResponse<TwitterIntegrationEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterIntegrationEntityListing> response = (ApiResponse<TwitterIntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration getMessagingIntegrationsTwitterIntegrationId(String integrationId) throws IOException, ApiException {
    return  getMessagingIntegrationsTwitterIntegrationId(createGetMessagingIntegrationsTwitterIntegrationIdRequest(integrationId));
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param integrationId Integration ID (required)
   * @return TwitterIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> getMessagingIntegrationsTwitterIntegrationIdWithHttpInfo(String integrationId) throws IOException {
    return getMessagingIntegrationsTwitterIntegrationId(createGetMessagingIntegrationsTwitterIntegrationIdRequest(integrationId).withHttpInfo());
  }

  private GetMessagingIntegrationsTwitterIntegrationIdRequest createGetMessagingIntegrationsTwitterIntegrationIdRequest(String integrationId) {
    return GetMessagingIntegrationsTwitterIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param request The request object
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration getMessagingIntegrationsTwitterIntegrationId(GetMessagingIntegrationsTwitterIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Twitter messaging integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> getMessagingIntegrationsTwitterIntegrationId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Messaging Stickers
   * 
   * @param messengerType Messenger Type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingStickerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingStickerEntityListing getMessagingSticker(String messengerType, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getMessagingSticker(createGetMessagingStickerRequest(messengerType, pageSize, pageNumber));
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param messengerType Messenger Type (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return MessagingStickerEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingStickerEntityListing> getMessagingStickerWithHttpInfo(String messengerType, Integer pageSize, Integer pageNumber) throws IOException {
    return getMessagingSticker(createGetMessagingStickerRequest(messengerType, pageSize, pageNumber).withHttpInfo());
  }

  private GetMessagingStickerRequest createGetMessagingStickerRequest(String messengerType, Integer pageSize, Integer pageNumber) {
    return GetMessagingStickerRequest.builder()
            .withMessengerType(messengerType)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param request The request object
   * @return MessagingStickerEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingStickerEntityListing getMessagingSticker(GetMessagingStickerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingStickerEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingStickerEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Messaging Stickers
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingStickerEntityListing> getMessagingSticker(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingStickerEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingStickerEntityListing> response = (ApiResponse<MessagingStickerEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MessagingStickerEntityListing> response = (ApiResponse<MessagingStickerEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Facebook Integration
   * 
   * @param body FacebookIntegrationRequest (required)
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration postConversationsMessagingIntegrationsFacebook(FacebookIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsFacebook(createPostConversationsMessagingIntegrationsFacebookRequest(body));
  }

  /**
   * Create a Facebook Integration
   * 
   * @param body FacebookIntegrationRequest (required)
   * @return FacebookIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> postConversationsMessagingIntegrationsFacebookWithHttpInfo(FacebookIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsFacebook(createPostConversationsMessagingIntegrationsFacebookRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsFacebookRequest createPostConversationsMessagingIntegrationsFacebookRequest(FacebookIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsFacebookRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Facebook Integration
   * 
   * @param request The request object
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration postConversationsMessagingIntegrationsFacebook(PostConversationsMessagingIntegrationsFacebookRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Facebook Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> postConversationsMessagingIntegrationsFacebook(ApiRequest<FacebookIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a LINE messenger Integration
   * 
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration postConversationsMessagingIntegrationsLine(LineIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsLine(createPostConversationsMessagingIntegrationsLineRequest(body));
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> postConversationsMessagingIntegrationsLineWithHttpInfo(LineIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsLine(createPostConversationsMessagingIntegrationsLineRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsLineRequest createPostConversationsMessagingIntegrationsLineRequest(LineIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsLineRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration postConversationsMessagingIntegrationsLine(PostConversationsMessagingIntegrationsLineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> postConversationsMessagingIntegrationsLine(ApiRequest<LineIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Twitter Integration
   * 
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration postConversationsMessagingIntegrationsTwitter(TwitterIntegrationRequest body) throws IOException, ApiException {
    return  postConversationsMessagingIntegrationsTwitter(createPostConversationsMessagingIntegrationsTwitterRequest(body));
  }

  /**
   * Create a Twitter Integration
   * 
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> postConversationsMessagingIntegrationsTwitterWithHttpInfo(TwitterIntegrationRequest body) throws IOException {
    return postConversationsMessagingIntegrationsTwitter(createPostConversationsMessagingIntegrationsTwitterRequest(body).withHttpInfo());
  }

  private PostConversationsMessagingIntegrationsTwitterRequest createPostConversationsMessagingIntegrationsTwitterRequest(TwitterIntegrationRequest body) {
    return PostConversationsMessagingIntegrationsTwitterRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Twitter Integration
   * 
   * @param request The request object
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration postConversationsMessagingIntegrationsTwitter(PostConversationsMessagingIntegrationsTwitterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Twitter Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> postConversationsMessagingIntegrationsTwitter(ApiRequest<TwitterIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Facebook Integration
   * 
   * @param body FacebookIntegrationRequest (required)
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration postMessagingIntegrationsFacebook(FacebookIntegrationRequest body) throws IOException, ApiException {
    return  postMessagingIntegrationsFacebook(createPostMessagingIntegrationsFacebookRequest(body));
  }

  /**
   * Create a Facebook Integration
   * 
   * @param body FacebookIntegrationRequest (required)
   * @return FacebookIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> postMessagingIntegrationsFacebookWithHttpInfo(FacebookIntegrationRequest body) throws IOException {
    return postMessagingIntegrationsFacebook(createPostMessagingIntegrationsFacebookRequest(body).withHttpInfo());
  }

  private PostMessagingIntegrationsFacebookRequest createPostMessagingIntegrationsFacebookRequest(FacebookIntegrationRequest body) {
    return PostMessagingIntegrationsFacebookRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Facebook Integration
   * 
   * @param request The request object
   * @return FacebookIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FacebookIntegration postMessagingIntegrationsFacebook(PostMessagingIntegrationsFacebookRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FacebookIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FacebookIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Facebook Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FacebookIntegration> postMessagingIntegrationsFacebook(ApiRequest<FacebookIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FacebookIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<FacebookIntegration> response = (ApiResponse<FacebookIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a LINE messenger Integration
   * 
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration postMessagingIntegrationsLine(LineIntegrationRequest body) throws IOException, ApiException {
    return  postMessagingIntegrationsLine(createPostMessagingIntegrationsLineRequest(body));
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> postMessagingIntegrationsLineWithHttpInfo(LineIntegrationRequest body) throws IOException {
    return postMessagingIntegrationsLine(createPostMessagingIntegrationsLineRequest(body).withHttpInfo());
  }

  private PostMessagingIntegrationsLineRequest createPostMessagingIntegrationsLineRequest(LineIntegrationRequest body) {
    return PostMessagingIntegrationsLineRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration postMessagingIntegrationsLine(PostMessagingIntegrationsLineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a LINE messenger Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> postMessagingIntegrationsLine(ApiRequest<LineIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a Twitter Integration
   * 
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration postMessagingIntegrationsTwitter(TwitterIntegrationRequest body) throws IOException, ApiException {
    return  postMessagingIntegrationsTwitter(createPostMessagingIntegrationsTwitterRequest(body));
  }

  /**
   * Create a Twitter Integration
   * 
   * @param body TwitterIntegrationRequest (required)
   * @return TwitterIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> postMessagingIntegrationsTwitterWithHttpInfo(TwitterIntegrationRequest body) throws IOException {
    return postMessagingIntegrationsTwitter(createPostMessagingIntegrationsTwitterRequest(body).withHttpInfo());
  }

  private PostMessagingIntegrationsTwitterRequest createPostMessagingIntegrationsTwitterRequest(TwitterIntegrationRequest body) {
    return PostMessagingIntegrationsTwitterRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a Twitter Integration
   * 
   * @param request The request object
   * @return TwitterIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TwitterIntegration postMessagingIntegrationsTwitter(PostMessagingIntegrationsTwitterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TwitterIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TwitterIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Twitter Integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TwitterIntegration> postMessagingIntegrationsTwitter(ApiRequest<TwitterIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TwitterIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<TwitterIntegration> response = (ApiResponse<TwitterIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration putConversationsMessagingIntegrationsLineIntegrationId(String integrationId, LineIntegrationRequest body) throws IOException, ApiException {
    return  putConversationsMessagingIntegrationsLineIntegrationId(createPutConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId, body));
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> putConversationsMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId, LineIntegrationRequest body) throws IOException {
    return putConversationsMessagingIntegrationsLineIntegrationId(createPutConversationsMessagingIntegrationsLineIntegrationIdRequest(integrationId, body).withHttpInfo());
  }

  private PutConversationsMessagingIntegrationsLineIntegrationIdRequest createPutConversationsMessagingIntegrationsLineIntegrationIdRequest(String integrationId, LineIntegrationRequest body) {
    return PutConversationsMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration putConversationsMessagingIntegrationsLineIntegrationId(PutConversationsMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> putConversationsMessagingIntegrationsLineIntegrationId(ApiRequest<LineIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration putMessagingIntegrationsLineIntegrationId(String integrationId, LineIntegrationRequest body) throws IOException, ApiException {
    return  putMessagingIntegrationsLineIntegrationId(createPutMessagingIntegrationsLineIntegrationIdRequest(integrationId, body));
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param integrationId Integration ID (required)
   * @param body LineIntegrationRequest (required)
   * @return LineIntegration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> putMessagingIntegrationsLineIntegrationIdWithHttpInfo(String integrationId, LineIntegrationRequest body) throws IOException {
    return putMessagingIntegrationsLineIntegrationId(createPutMessagingIntegrationsLineIntegrationIdRequest(integrationId, body).withHttpInfo());
  }

  private PutMessagingIntegrationsLineIntegrationIdRequest createPutMessagingIntegrationsLineIntegrationIdRequest(String integrationId, LineIntegrationRequest body) {
    return PutMessagingIntegrationsLineIntegrationIdRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param request The request object
   * @return LineIntegration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LineIntegration putMessagingIntegrationsLineIntegrationId(PutMessagingIntegrationsLineIntegrationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LineIntegration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LineIntegration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a LINE messenger integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LineIntegration> putMessagingIntegrationsLineIntegrationId(ApiRequest<LineIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LineIntegration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)exception;
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
      ApiResponse<LineIntegration> response = (ApiResponse<LineIntegration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
