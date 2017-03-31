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
   * @throws ApiException if fails to make API call
   */
  public String deleteTokensMe() throws IOException, ApiException {
    return deleteTokensMeWithHttpInfo().getBody();
  }

  /**
   * Delete  auth token used to make the request.
   * 
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTokensMeWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/tokens/me".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Delete  auth token used to make the request.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteTokensMe(DeleteTokensMeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete  auth token used to make the request.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteTokensMe(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

}
