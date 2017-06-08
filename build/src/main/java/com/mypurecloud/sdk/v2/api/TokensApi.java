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
import com.mypurecloud.sdk.v2.model.TokenInfo;


import com.mypurecloud.sdk.v2.api.request.DeleteTokensMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTokensMeRequest;

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
   * Delete  auth token used to make the request.
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTokensMe() throws IOException, ApiException {
     deleteTokensMe(createDeleteTokensMeRequest());
  }

  /**
   * Delete  auth token used to make the request.
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
   * Delete  auth token used to make the request.
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
   * Delete  auth token used to make the request.
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
   * @return TokenInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TokenInfo getTokensMe() throws IOException, ApiException {
    return  getTokensMe(createGetTokensMeRequest());
  }

  /**
   * Fetch information about the current token
   * 
   * @return TokenInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TokenInfo> getTokensMeWithHttpInfo() throws IOException {
    return getTokensMe(createGetTokensMeRequest().withHttpInfo());
  }

  private GetTokensMeRequest createGetTokensMeRequest() {
    return GetTokensMeRequest.builder()
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

  
}
