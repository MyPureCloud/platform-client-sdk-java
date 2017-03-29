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
   * @throws ApiException if fails to make API call
   */
  public void deleteOauthClient(String clientId) throws ApiException {
    deleteOauthClientWithHttpInfo(clientId);
  }

  /**
   * Delete OAuth Client
   * 
   * @param clientId Client ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteOauthClientWithHttpInfo(String clientId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling deleteOauthClient");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/oauth/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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
   * Delete OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteOauthClient(DeleteOauthClientRequest request) throws ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Delete OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteOauthClient(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Get OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public OAuthClient getOauthClient(String clientId) throws ApiException {
    return getOauthClientWithHttpInfo(clientId).getBody();
  }

  /**
   * Get OAuth Client
   * 
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> getOauthClientWithHttpInfo(String clientId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getOauthClient");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/oauth/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthClient>() {});
  }

  /**
   * Get OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthClient getOauthClient(GetOauthClientRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
  }

  /**
   * Get OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> getOauthClient(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerbose(request, new TypeReference<OAuthClient>() {});
  }

  /**
   * The list of OAuth clients
   * 
   * @return OAuthClientEntityListing
   * @throws ApiException if fails to make API call
   */
  public OAuthClientEntityListing getOauthClients() throws ApiException {
    return getOauthClientsWithHttpInfo().getBody();
  }

  /**
   * The list of OAuth clients
   * 
   * @return OAuthClientEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClientEntityListing> getOauthClientsWithHttpInfo() throws ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/oauth/clients".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthClientEntityListing>() {});
  }

  /**
   * The list of OAuth clients
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthClientEntityListing getOauthClients(GetOauthClientsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthClientEntityListing>() {});
  }

  /**
   * The list of OAuth clients
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClientEntityListing> getOauthClients(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OAuthClientEntityListing>invokeAPIVerbose(request, new TypeReference<OAuthClientEntityListing>() {});
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public OAuthClient postOauthClientSecret(String clientId) throws ApiException {
    return postOauthClientSecretWithHttpInfo(clientId).getBody();
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param clientId Client ID (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> postOauthClientSecretWithHttpInfo(String clientId) throws ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling postOauthClientSecret");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/oauth/clients/{clientId}/secret".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthClient>() {});
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthClient postOauthClientSecret(PostOauthClientSecretRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
  }

  /**
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> postOauthClientSecret(ApiRequest<Void> request) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerbose(request, new TypeReference<OAuthClient>() {});
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public OAuthClient postOauthClients(OAuthClient body) throws ApiException {
    return postOauthClientsWithHttpInfo(body).getBody();
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> postOauthClientsWithHttpInfo(OAuthClient body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postOauthClients");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/oauth/clients".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthClient>() {});
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthClient postOauthClients(PostOauthClientsRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
  }

  /**
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> postOauthClients(ApiRequest<OAuthClient> request) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerbose(request, new TypeReference<OAuthClient>() {});
  }

  /**
   * Update OAuth Client
   * 
   * @param clientId Client ID (required)
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public OAuthClient putOauthClient(String clientId, OAuthClient body) throws ApiException {
    return putOauthClientWithHttpInfo(clientId, body).getBody();
  }

  /**
   * Update OAuth Client
   * 
   * @param clientId Client ID (required)
   * @param body Client (required)
   * @return OAuthClient
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> putOauthClientWithHttpInfo(String clientId, OAuthClient body) throws ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling putOauthClient");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putOauthClient");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/oauth/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "clientId" + "\\}", pcapiClient.escapeString(clientId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<OAuthClient>() {});
  }

  /**
   * Update OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public OAuthClient putOauthClient(PutOauthClientRequest request) throws ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<OAuthClient>() {});
  }

  /**
   * Update OAuth Client
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthClient> putOauthClient(ApiRequest<OAuthClient> request) throws ApiException {
    return pcapiClient.<OAuthClient>invokeAPIVerbose(request, new TypeReference<OAuthClient>() {});
  }

}
