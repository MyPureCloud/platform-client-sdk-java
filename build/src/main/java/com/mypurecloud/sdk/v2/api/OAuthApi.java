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
import com.mypurecloud.sdk.v2.model.OAuthClient;
import com.mypurecloud.sdk.v2.model.OAuthClientEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientSecretRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.PutOauthClientRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OAuthApi {
  private final ApiClient pcapiClient;

  public OAuthApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete OAuth Client
   * 
   * @param clientId Client ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOauthClient(String clientId) throws IOException, ApiException {
     deleteOauthClient(createDeleteOauthClientRequest(clientId));
  }

  /**
   * Delete OAuth Client
   * 
   * @param clientId Client ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOauthClientWithHttpInfo(String clientId) throws IOException {
    return deleteOauthClient(createDeleteOauthClientRequest(clientId).withHttpInfo());
  }

  private DeleteOauthClientRequest createDeleteOauthClientRequest(String clientId) {
    return DeleteOauthClientRequest.builder()
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Delete OAuth Client
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOauthClient(DeleteOauthClientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete OAuth Client
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOauthClient(ApiRequest<Void> request) throws IOException {
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
   * Get OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient getOauthClient(String clientId) throws IOException, ApiException {
    return  getOauthClient(createGetOauthClientRequest(clientId));
  }

  /**
   * Get OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> getOauthClientWithHttpInfo(String clientId) throws IOException {
    return getOauthClient(createGetOauthClientRequest(clientId).withHttpInfo());
  }

  private GetOauthClientRequest createGetOauthClientRequest(String clientId) {
    return GetOauthClientRequest.builder()
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Get OAuth Client
   * 
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient getOauthClient(GetOauthClientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get OAuth Client
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> getOauthClient(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * The list of OAuth clients
   * 
   * @return OAuthClientEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClientEntityListing getOauthClients() throws IOException, ApiException {
    return  getOauthClients(createGetOauthClientsRequest());
  }

  /**
   * The list of OAuth clients
   * 
   * @return OAuthClientEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClientEntityListing> getOauthClientsWithHttpInfo() throws IOException {
    return getOauthClients(createGetOauthClientsRequest().withHttpInfo());
  }

  private GetOauthClientsRequest createGetOauthClientsRequest() {
    return GetOauthClientsRequest.builder()
            .build();
  }

  /**
   * The list of OAuth clients
   * 
   * @param request The request object
   * @return OAuthClientEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClientEntityListing getOauthClients(GetOauthClientsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClientEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClientEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * The list of OAuth clients
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClientEntityListing> getOauthClients(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClientEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClientEntityListing> response = (ApiResponse<OAuthClientEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClientEntityListing> response = (ApiResponse<OAuthClientEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClientSecret(String clientId) throws IOException, ApiException {
    return  postOauthClientSecret(createPostOauthClientSecretRequest(clientId));
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClientSecretWithHttpInfo(String clientId) throws IOException {
    return postOauthClientSecret(createPostOauthClientSecretRequest(clientId).withHttpInfo());
  }

  private PostOauthClientSecretRequest createPostOauthClientSecretRequest(String clientId) {
    return PostOauthClientSecretRequest.builder()
            .withClientId(clientId)
    
            .build();
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClientSecret(PostOauthClientSecretRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClientSecret(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClients(OAuthClient body) throws IOException, ApiException {
    return  postOauthClients(createPostOauthClientsRequest(body));
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param body Client (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClientsWithHttpInfo(OAuthClient body) throws IOException {
    return postOauthClients(createPostOauthClientsRequest(body).withHttpInfo());
  }

  private PostOauthClientsRequest createPostOauthClientsRequest(OAuthClient body) {
    return PostOauthClientsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient postOauthClients(PostOauthClientsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> postOauthClients(ApiRequest<OAuthClient> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update OAuth Client
   * 
   * @param clientId Client ID (required)
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient putOauthClient(String clientId, OAuthClient body) throws IOException, ApiException {
    return  putOauthClient(createPutOauthClientRequest(clientId, body));
  }

  /**
   * Update OAuth Client
   * 
   * @param clientId Client ID (required)
   * @param body Client (required)
   * @return OAuthClient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> putOauthClientWithHttpInfo(String clientId, OAuthClient body) throws IOException {
    return putOauthClient(createPutOauthClientRequest(clientId, body).withHttpInfo());
  }

  private PutOauthClientRequest createPutOauthClientRequest(String clientId, OAuthClient body) {
    return PutOauthClientRequest.builder()
            .withClientId(clientId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update OAuth Client
   * 
   * @param request The request object
   * @return OAuthClient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OAuthClient putOauthClient(PutOauthClientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OAuthClient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update OAuth Client
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OAuthClient> putOauthClient(ApiRequest<OAuthClient> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OAuthClient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
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
      ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
