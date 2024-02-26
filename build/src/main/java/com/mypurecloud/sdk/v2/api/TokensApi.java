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
import com.mypurecloud.sdk.v2.model.IdleTokenTimeout;
import com.mypurecloud.sdk.v2.model.TokenInfo;


import com.mypurecloud.sdk.v2.api.request.DeleteTokenRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTokensMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTokensMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTokensTimeoutRequest;
import com.mypurecloud.sdk.v2.api.request.HeadTokensMeRequest;
import com.mypurecloud.sdk.v2.api.request.PutTokensTimeoutRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokensApi {
  private final ApiClient pcapiClient;

  public TokensApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TokensApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete all auth tokens for the specified user.
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteToken(String userId) throws IOException, ApiException {
     deleteToken(createDeleteTokenRequest(userId));
  }

  /**
   * Delete all auth tokens for the specified user.
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTokenWithHttpInfo(String userId) throws IOException {
    return deleteToken(createDeleteTokenRequest(userId).withHttpInfo());
  }

  private DeleteTokenRequest createDeleteTokenRequest(String userId) {
    return DeleteTokenRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Delete all auth tokens for the specified user.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteToken(DeleteTokenRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete all auth tokens for the specified user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteToken(ApiRequest<Void> request) throws IOException {
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
   * Delete auth token used to make the request.
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTokensMe() throws IOException, ApiException {
     deleteTokensMe(createDeleteTokensMeRequest());
  }

  /**
   * Delete auth token used to make the request.
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTokensMeWithHttpInfo() throws IOException {
    return deleteTokensMe(createDeleteTokensMeRequest().withHttpInfo());
  }

  private DeleteTokensMeRequest createDeleteTokensMeRequest() {
    return DeleteTokensMeRequest.builder()
            .build();
  }

  /**
   * Delete auth token used to make the request.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTokensMe(DeleteTokensMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete auth token used to make the request.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTokensMe(ApiRequest<Void> request) throws IOException {
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
   * Fetch information about the current token
   * 
   * @param preserveIdleTTL preserveIdleTTL indicates whether the idle token timeout should be reset or preserved. If preserveIdleTTL is true, then TTL value is not reset. If unset or false, the value is reset. (optional)
   * @return TokenInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TokenInfo getTokensMe(Boolean preserveIdleTTL) throws IOException, ApiException {
    return  getTokensMe(createGetTokensMeRequest(preserveIdleTTL));
  }

  /**
   * Fetch information about the current token
   * 
   * @param preserveIdleTTL preserveIdleTTL indicates whether the idle token timeout should be reset or preserved. If preserveIdleTTL is true, then TTL value is not reset. If unset or false, the value is reset. (optional)
   * @return TokenInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TokenInfo> getTokensMeWithHttpInfo(Boolean preserveIdleTTL) throws IOException {
    return getTokensMe(createGetTokensMeRequest(preserveIdleTTL).withHttpInfo());
  }

  private GetTokensMeRequest createGetTokensMeRequest(Boolean preserveIdleTTL) {
    return GetTokensMeRequest.builder()
            .withPreserveIdleTTL(preserveIdleTTL)

            .build();
  }

  /**
   * Fetch information about the current token
   * 
   * @param request The request object
   * @return TokenInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TokenInfo getTokensMe(GetTokensMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TokenInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TokenInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch information about the current token
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TokenInfo> getTokensMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TokenInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TokenInfo> response = (ApiResponse<TokenInfo>)(ApiResponse<?>)exception;
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
      ApiResponse<TokenInfo> response = (ApiResponse<TokenInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the current Idle Token Timeout Value
   * 
   * @return IdleTokenTimeout
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdleTokenTimeout getTokensTimeout() throws IOException, ApiException {
    return  getTokensTimeout(createGetTokensTimeoutRequest());
  }

  /**
   * Get the current Idle Token Timeout Value
   * 
   * @return IdleTokenTimeout
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdleTokenTimeout> getTokensTimeoutWithHttpInfo() throws IOException {
    return getTokensTimeout(createGetTokensTimeoutRequest().withHttpInfo());
  }

  private GetTokensTimeoutRequest createGetTokensTimeoutRequest() {
    return GetTokensTimeoutRequest.builder()
            .build();
  }

  /**
   * Get the current Idle Token Timeout Value
   * 
   * @param request The request object
   * @return IdleTokenTimeout
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdleTokenTimeout getTokensTimeout(GetTokensTimeoutRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdleTokenTimeout> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdleTokenTimeout>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the current Idle Token Timeout Value
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdleTokenTimeout> getTokensTimeout(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdleTokenTimeout>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdleTokenTimeout> response = (ApiResponse<IdleTokenTimeout>)(ApiResponse<?>)exception;
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
      ApiResponse<IdleTokenTimeout> response = (ApiResponse<IdleTokenTimeout>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Verify user token
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void headTokensMe() throws IOException, ApiException {
     headTokensMe(createHeadTokensMeRequest());
  }

  /**
   * Verify user token
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> headTokensMeWithHttpInfo() throws IOException {
    return headTokensMe(createHeadTokensMeRequest().withHttpInfo());
  }

  private HeadTokensMeRequest createHeadTokensMeRequest() {
    return HeadTokensMeRequest.builder()
            .build();
  }

  /**
   * Verify user token
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void headTokensMe(HeadTokensMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Verify user token
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> headTokensMe(ApiRequest<Void> request) throws IOException {
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
   * Update or Enable/Disable the Idle Token Timeout
   * 
   * @param body  (optional)
   * @return IdleTokenTimeout
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdleTokenTimeout putTokensTimeout(IdleTokenTimeout body) throws IOException, ApiException {
    return  putTokensTimeout(createPutTokensTimeoutRequest(body));
  }

  /**
   * Update or Enable/Disable the Idle Token Timeout
   * 
   * @param body  (optional)
   * @return IdleTokenTimeout
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdleTokenTimeout> putTokensTimeoutWithHttpInfo(IdleTokenTimeout body) throws IOException {
    return putTokensTimeout(createPutTokensTimeoutRequest(body).withHttpInfo());
  }

  private PutTokensTimeoutRequest createPutTokensTimeoutRequest(IdleTokenTimeout body) {
    return PutTokensTimeoutRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update or Enable/Disable the Idle Token Timeout
   * 
   * @param request The request object
   * @return IdleTokenTimeout
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdleTokenTimeout putTokensTimeout(PutTokensTimeoutRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdleTokenTimeout> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdleTokenTimeout>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update or Enable/Disable the Idle Token Timeout
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdleTokenTimeout> putTokensTimeout(ApiRequest<IdleTokenTimeout> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdleTokenTimeout>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdleTokenTimeout> response = (ApiResponse<IdleTokenTimeout>)(ApiResponse<?>)exception;
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
      ApiResponse<IdleTokenTimeout> response = (ApiResponse<IdleTokenTimeout>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
