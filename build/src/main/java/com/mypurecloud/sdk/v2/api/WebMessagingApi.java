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
import com.mypurecloud.sdk.v2.model.PushDeviceInsertRequest;
import com.mypurecloud.sdk.v2.model.PushDeviceUpdateRequest;
import com.mypurecloud.sdk.v2.model.WebMessagingMessageEntityList;


import com.mypurecloud.sdk.v2.api.request.DeleteWebmessagingDeploymentPushdeviceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebmessagingMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWebmessagingDeploymentPushdeviceRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebmessagingDeploymentPushdeviceRequest;

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
   * Delete device information
   * 
   * @param deploymentId WebMessaging deployment id (required)
   * @param tokenId Device token id or cookie id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebmessagingDeploymentPushdevice(String deploymentId, String tokenId) throws IOException, ApiException {
     deleteWebmessagingDeploymentPushdevice(createDeleteWebmessagingDeploymentPushdeviceRequest(deploymentId, tokenId));
  }

  /**
   * Delete device information
   * 
   * @param deploymentId WebMessaging deployment id (required)
   * @param tokenId Device token id or cookie id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebmessagingDeploymentPushdeviceWithHttpInfo(String deploymentId, String tokenId) throws IOException {
    return deleteWebmessagingDeploymentPushdevice(createDeleteWebmessagingDeploymentPushdeviceRequest(deploymentId, tokenId).withHttpInfo());
  }

  private DeleteWebmessagingDeploymentPushdeviceRequest createDeleteWebmessagingDeploymentPushdeviceRequest(String deploymentId, String tokenId) {
    return DeleteWebmessagingDeploymentPushdeviceRequest.builder()
            .withDeploymentId(deploymentId)

            .withTokenId(tokenId)

            .build();
  }

  /**
   * Delete device information
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWebmessagingDeploymentPushdevice(DeleteWebmessagingDeploymentPushdeviceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete device information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWebmessagingDeploymentPushdevice(ApiRequest<Void> request) throws IOException {
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

  /**
   * Edit device information
   * 
   * @param deploymentId WebMessaging deployment id (required)
   * @param tokenId Device token id or cookie id (required)
   * @param body Request body (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWebmessagingDeploymentPushdevice(String deploymentId, String tokenId, PushDeviceUpdateRequest body) throws IOException, ApiException {
     patchWebmessagingDeploymentPushdevice(createPatchWebmessagingDeploymentPushdeviceRequest(deploymentId, tokenId, body));
  }

  /**
   * Edit device information
   * 
   * @param deploymentId WebMessaging deployment id (required)
   * @param tokenId Device token id or cookie id (required)
   * @param body Request body (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWebmessagingDeploymentPushdeviceWithHttpInfo(String deploymentId, String tokenId, PushDeviceUpdateRequest body) throws IOException {
    return patchWebmessagingDeploymentPushdevice(createPatchWebmessagingDeploymentPushdeviceRequest(deploymentId, tokenId, body).withHttpInfo());
  }

  private PatchWebmessagingDeploymentPushdeviceRequest createPatchWebmessagingDeploymentPushdeviceRequest(String deploymentId, String tokenId, PushDeviceUpdateRequest body) {
    return PatchWebmessagingDeploymentPushdeviceRequest.builder()
            .withDeploymentId(deploymentId)

            .withTokenId(tokenId)

            .withBody(body)

            .build();
  }

  /**
   * Edit device information
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWebmessagingDeploymentPushdevice(PatchWebmessagingDeploymentPushdeviceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Edit device information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWebmessagingDeploymentPushdevice(ApiRequest<PushDeviceUpdateRequest> request) throws IOException {
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
   * Add a new device information
   * 
   * @param deploymentId WebMessaging deployment id (required)
   * @param tokenId Device token id or cookie id (required)
   * @param body Request body (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postWebmessagingDeploymentPushdevice(String deploymentId, String tokenId, PushDeviceInsertRequest body) throws IOException, ApiException {
     postWebmessagingDeploymentPushdevice(createPostWebmessagingDeploymentPushdeviceRequest(deploymentId, tokenId, body));
  }

  /**
   * Add a new device information
   * 
   * @param deploymentId WebMessaging deployment id (required)
   * @param tokenId Device token id or cookie id (required)
   * @param body Request body (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postWebmessagingDeploymentPushdeviceWithHttpInfo(String deploymentId, String tokenId, PushDeviceInsertRequest body) throws IOException {
    return postWebmessagingDeploymentPushdevice(createPostWebmessagingDeploymentPushdeviceRequest(deploymentId, tokenId, body).withHttpInfo());
  }

  private PostWebmessagingDeploymentPushdeviceRequest createPostWebmessagingDeploymentPushdeviceRequest(String deploymentId, String tokenId, PushDeviceInsertRequest body) {
    return PostWebmessagingDeploymentPushdeviceRequest.builder()
            .withDeploymentId(deploymentId)

            .withTokenId(tokenId)

            .withBody(body)

            .build();
  }

  /**
   * Add a new device information
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postWebmessagingDeploymentPushdevice(PostWebmessagingDeploymentPushdeviceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add a new device information
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postWebmessagingDeploymentPushdevice(ApiRequest<PushDeviceInsertRequest> request) throws IOException {
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

}
