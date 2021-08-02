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
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.Empty;


import com.mypurecloud.sdk.v2.api.request.PostKnowledgeDocumentuploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingMinerUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsPublicassetsImagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsRecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsWorkforcemanagementHistoricaldataCsvRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsWorkforcemanagementHistoricaldataJsonRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UploadsApi {
  private final ApiClient pcapiClient;

  public UploadsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UploadsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postKnowledgeDocumentuploads(UploadUrlRequest body) throws IOException, ApiException {
    return  postKnowledgeDocumentuploads(createPostKnowledgeDocumentuploadsRequest(body));
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postKnowledgeDocumentuploadsWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postKnowledgeDocumentuploads(createPostKnowledgeDocumentuploadsRequest(body).withHttpInfo());
  }

  private PostKnowledgeDocumentuploadsRequest createPostKnowledgeDocumentuploadsRequest(UploadUrlRequest body) {
    return PostKnowledgeDocumentuploadsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postKnowledgeDocumentuploads(PostKnowledgeDocumentuploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postKnowledgeDocumentuploads(ApiRequest<UploadUrlRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a presigned URL for uploading a chat corpus which will be used for mining by intent miner
   * 
   * @param minerId Miner ID (required)
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postLanguageunderstandingMinerUploads(String minerId, Empty body) throws IOException, ApiException {
    return  postLanguageunderstandingMinerUploads(createPostLanguageunderstandingMinerUploadsRequest(minerId, body));
  }

  /**
   * Creates a presigned URL for uploading a chat corpus which will be used for mining by intent miner
   * 
   * @param minerId Miner ID (required)
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postLanguageunderstandingMinerUploadsWithHttpInfo(String minerId, Empty body) throws IOException {
    return postLanguageunderstandingMinerUploads(createPostLanguageunderstandingMinerUploadsRequest(minerId, body).withHttpInfo());
  }

  private PostLanguageunderstandingMinerUploadsRequest createPostLanguageunderstandingMinerUploadsRequest(String minerId, Empty body) {
    return PostLanguageunderstandingMinerUploadsRequest.builder()
            .withMinerId(minerId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a presigned URL for uploading a chat corpus which will be used for mining by intent miner
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postLanguageunderstandingMinerUploads(PostLanguageunderstandingMinerUploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a presigned URL for uploading a chat corpus which will be used for mining by intent miner
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postLanguageunderstandingMinerUploads(ApiRequest<Empty> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates presigned url for uploading a public asset image
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsPublicassetsImages(UploadUrlRequest body) throws IOException, ApiException {
    return  postUploadsPublicassetsImages(createPostUploadsPublicassetsImagesRequest(body));
  }

  /**
   * Creates presigned url for uploading a public asset image
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsPublicassetsImagesWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postUploadsPublicassetsImages(createPostUploadsPublicassetsImagesRequest(body).withHttpInfo());
  }

  private PostUploadsPublicassetsImagesRequest createPostUploadsPublicassetsImagesRequest(UploadUrlRequest body) {
    return PostUploadsPublicassetsImagesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates presigned url for uploading a public asset image
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsPublicassetsImages(PostUploadsPublicassetsImagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates presigned url for uploading a public asset image
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsPublicassetsImages(ApiRequest<UploadUrlRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates presigned url for uploading a recording file
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsRecordings(UploadUrlRequest body) throws IOException, ApiException {
    return  postUploadsRecordings(createPostUploadsRecordingsRequest(body));
  }

  /**
   * Creates presigned url for uploading a recording file
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsRecordingsWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postUploadsRecordings(createPostUploadsRecordingsRequest(body).withHttpInfo());
  }

  private PostUploadsRecordingsRequest createPostUploadsRecordingsRequest(UploadUrlRequest body) {
    return PostUploadsRecordingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates presigned url for uploading a recording file
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsRecordings(PostUploadsRecordingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates presigned url for uploading a recording file
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsRecordings(ApiRequest<UploadUrlRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in csv format.
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsWorkforcemanagementHistoricaldataCsv(UploadUrlRequest body) throws IOException, ApiException {
    return  postUploadsWorkforcemanagementHistoricaldataCsv(createPostUploadsWorkforcemanagementHistoricaldataCsvRequest(body));
  }

  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in csv format.
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsWorkforcemanagementHistoricaldataCsvWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postUploadsWorkforcemanagementHistoricaldataCsv(createPostUploadsWorkforcemanagementHistoricaldataCsvRequest(body).withHttpInfo());
  }

  private PostUploadsWorkforcemanagementHistoricaldataCsvRequest createPostUploadsWorkforcemanagementHistoricaldataCsvRequest(UploadUrlRequest body) {
    return PostUploadsWorkforcemanagementHistoricaldataCsvRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in csv format.
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsWorkforcemanagementHistoricaldataCsv(PostUploadsWorkforcemanagementHistoricaldataCsvRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in csv format.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsWorkforcemanagementHistoricaldataCsv(ApiRequest<UploadUrlRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in json format.
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsWorkforcemanagementHistoricaldataJson(UploadUrlRequest body) throws IOException, ApiException {
    return  postUploadsWorkforcemanagementHistoricaldataJson(createPostUploadsWorkforcemanagementHistoricaldataJsonRequest(body));
  }

  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in json format.
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsWorkforcemanagementHistoricaldataJsonWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postUploadsWorkforcemanagementHistoricaldataJson(createPostUploadsWorkforcemanagementHistoricaldataJsonRequest(body).withHttpInfo());
  }

  private PostUploadsWorkforcemanagementHistoricaldataJsonRequest createPostUploadsWorkforcemanagementHistoricaldataJsonRequest(UploadUrlRequest body) {
    return PostUploadsWorkforcemanagementHistoricaldataJsonRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in json format.
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsWorkforcemanagementHistoricaldataJson(PostUploadsWorkforcemanagementHistoricaldataJsonRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates presigned url for uploading WFM historical data file. Requires data in json format.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsWorkforcemanagementHistoricaldataJson(ApiRequest<UploadUrlRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
