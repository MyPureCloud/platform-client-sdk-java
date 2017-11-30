package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.SignedData;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.PostSigneddataRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SignedDataApi {
  private final ApiClient pcapiClient;

  public SignedDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SignedDataApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Sign identifying information
   * 
   * @param body  (optional)
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postSigneddata(Object body) throws IOException, ApiException {
    return  postSigneddata(createPostSigneddataRequest(body));
  }

  /**
   * Sign identifying information
   * 
   * @param body  (optional)
   * @return SignedData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postSigneddataWithHttpInfo(Object body) throws IOException {
    return postSigneddata(createPostSigneddataRequest(body).withHttpInfo());
  }

  private PostSigneddataRequest createPostSigneddataRequest(Object body) {
    return PostSigneddataRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Sign identifying information
   * 
   * @param request The request object
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postSigneddata(PostSigneddataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SignedData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SignedData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Sign identifying information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postSigneddata(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SignedData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SignedData> response = (ApiResponse<SignedData>)(ApiResponse<?>)exception;
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
      ApiResponse<SignedData> response = (ApiResponse<SignedData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
