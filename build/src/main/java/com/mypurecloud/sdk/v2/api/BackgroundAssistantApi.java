package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.BackgroundAssistantUserAuthenticatedInfo;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.SignedData;


import com.mypurecloud.sdk.v2.api.request.PostBackgroundassistantTokenRequest;
import com.mypurecloud.sdk.v2.api.request.PostScreenrecordingTokenRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackgroundAssistantApi {
  private final ApiClient pcapiClient;

  public BackgroundAssistantApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BackgroundAssistantApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Sign identifying information for Genesys Cloud Background Assistant
   * 
   * postBackgroundassistantToken is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body  (optional)
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postBackgroundassistantToken(BackgroundAssistantUserAuthenticatedInfo body) throws IOException, ApiException {
    return  postBackgroundassistantToken(createPostBackgroundassistantTokenRequest(body));
  }

  /**
   * Sign identifying information for Genesys Cloud Background Assistant
   * 
   * postBackgroundassistantToken is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body  (optional)
   * @return SignedData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postBackgroundassistantTokenWithHttpInfo(BackgroundAssistantUserAuthenticatedInfo body) throws IOException {
    return postBackgroundassistantToken(createPostBackgroundassistantTokenRequest(body).withHttpInfo());
  }

  private PostBackgroundassistantTokenRequest createPostBackgroundassistantTokenRequest(BackgroundAssistantUserAuthenticatedInfo body) {
    return PostBackgroundassistantTokenRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Sign identifying information for Genesys Cloud Background Assistant
   * 
   * postBackgroundassistantToken is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postBackgroundassistantToken(PostBackgroundassistantTokenRequest request) throws IOException, ApiException {
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
   * Sign identifying information for Genesys Cloud Background Assistant
   * 
   * postBackgroundassistantToken is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postBackgroundassistantToken(ApiRequest<BackgroundAssistantUserAuthenticatedInfo> request) throws IOException {
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

  /**
   * Sign identifying information for screen recording
   * 
   * @param body  (optional)
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postScreenrecordingToken(BackgroundAssistantUserAuthenticatedInfo body) throws IOException, ApiException {
    return  postScreenrecordingToken(createPostScreenrecordingTokenRequest(body));
  }

  /**
   * Sign identifying information for screen recording
   * 
   * @param body  (optional)
   * @return SignedData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postScreenrecordingTokenWithHttpInfo(BackgroundAssistantUserAuthenticatedInfo body) throws IOException {
    return postScreenrecordingToken(createPostScreenrecordingTokenRequest(body).withHttpInfo());
  }

  private PostScreenrecordingTokenRequest createPostScreenrecordingTokenRequest(BackgroundAssistantUserAuthenticatedInfo body) {
    return PostScreenrecordingTokenRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Sign identifying information for screen recording
   * 
   * @param request The request object
   * @return SignedData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedData postScreenrecordingToken(PostScreenrecordingTokenRequest request) throws IOException, ApiException {
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
   * Sign identifying information for screen recording
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedData> postScreenrecordingToken(ApiRequest<BackgroundAssistantUserAuthenticatedInfo> request) throws IOException {
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
