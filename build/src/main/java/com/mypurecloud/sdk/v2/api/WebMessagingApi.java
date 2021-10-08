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
import com.mypurecloud.sdk.v2.model.WebMessagingMessageEntityList;


import com.mypurecloud.sdk.v2.api.request.GetWebmessagingMessagesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WebMessagingApi {
  private final ApiClient pcapiClient;

  public WebMessagingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebMessagingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get the messages for a web messaging session.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return WebMessagingMessageEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebMessagingMessageEntityList getWebmessagingMessages(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getWebmessagingMessages(createGetWebmessagingMessagesRequest(pageSize, pageNumber));
  }

  /**
   * Get the messages for a web messaging session.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return WebMessagingMessageEntityList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebMessagingMessageEntityList> getWebmessagingMessagesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getWebmessagingMessages(createGetWebmessagingMessagesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetWebmessagingMessagesRequest createGetWebmessagingMessagesRequest(Integer pageSize, Integer pageNumber) {
    return GetWebmessagingMessagesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get the messages for a web messaging session.
   * 
   * @param request The request object
   * @return WebMessagingMessageEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebMessagingMessageEntityList getWebmessagingMessages(GetWebmessagingMessagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebMessagingMessageEntityList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebMessagingMessageEntityList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the messages for a web messaging session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebMessagingMessageEntityList> getWebmessagingMessages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebMessagingMessageEntityList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebMessagingMessageEntityList> response = (ApiResponse<WebMessagingMessageEntityList>)(ApiResponse<?>)exception;
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
      ApiResponse<WebMessagingMessageEntityList> response = (ApiResponse<WebMessagingMessageEntityList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
