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


import com.mypurecloud.sdk.v2.api.request.DeleteTokensMeRequest;

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
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String deleteTokensMe() throws IOException, ApiException {
    return  deleteTokensMe(createDeleteTokensMeRequest());
  }

  /**
   * Delete  auth token used to make the request.
   * 
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> deleteTokensMeWithHttpInfo() throws IOException {
    return deleteTokensMe(createDeleteTokensMeRequest().withHttpInfo());
  }

  private DeleteTokensMeRequest createDeleteTokensMeRequest() {
    return DeleteTokensMeRequest.builder()            .build();
  }

  /**
   * Delete  auth token used to make the request.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String deleteTokensMe(DeleteTokensMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete  auth token used to make the request.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> deleteTokensMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
