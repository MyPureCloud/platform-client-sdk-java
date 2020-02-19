package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.MessagingStickerEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.GetMessagingStickerRequest;

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

  
}
