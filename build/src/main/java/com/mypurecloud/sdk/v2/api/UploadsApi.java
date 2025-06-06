package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FunctionUploadRequest;
import com.mypurecloud.sdk.v2.model.FunctionUploadResponse;
import com.mypurecloud.sdk.v2.model.GamificationContestPrizeImageUploadUrlRequest;
import com.mypurecloud.sdk.v2.model.GetUploadSourceUrlJobStatusResponse;
import com.mypurecloud.sdk.v2.model.LearningCoverArtUploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;


import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseUploadsUrlsJobRequest;
import com.mypurecloud.sdk.v2.api.request.PostGamificationContestsUploadsPrizeimagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftFunctionUploadRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeDocumentuploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingMinerUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsLearningCoverartRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsPublicassetsImagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsRecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUploadsWorkforcemanagementHistoricaldataCsvRequest;

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
   * Get content upload from URL job status
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param jobId Upload job ID (required)
   * @return GetUploadSourceUrlJobStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetUploadSourceUrlJobStatusResponse getKnowledgeKnowledgebaseUploadsUrlsJob(String knowledgeBaseId, String jobId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseUploadsUrlsJob(createGetKnowledgeKnowledgebaseUploadsUrlsJobRequest(knowledgeBaseId, jobId));
  }

  /**
   * Get content upload from URL job status
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param jobId Upload job ID (required)
   * @return GetUploadSourceUrlJobStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetUploadSourceUrlJobStatusResponse> getKnowledgeKnowledgebaseUploadsUrlsJobWithHttpInfo(String knowledgeBaseId, String jobId) throws IOException {
    return getKnowledgeKnowledgebaseUploadsUrlsJob(createGetKnowledgeKnowledgebaseUploadsUrlsJobRequest(knowledgeBaseId, jobId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseUploadsUrlsJobRequest createGetKnowledgeKnowledgebaseUploadsUrlsJobRequest(String knowledgeBaseId, String jobId) {
    return GetKnowledgeKnowledgebaseUploadsUrlsJobRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get content upload from URL job status
   * 
   * @param request The request object
   * @return GetUploadSourceUrlJobStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetUploadSourceUrlJobStatusResponse getKnowledgeKnowledgebaseUploadsUrlsJob(GetKnowledgeKnowledgebaseUploadsUrlsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetUploadSourceUrlJobStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetUploadSourceUrlJobStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get content upload from URL job status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetUploadSourceUrlJobStatusResponse> getKnowledgeKnowledgebaseUploadsUrlsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetUploadSourceUrlJobStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetUploadSourceUrlJobStatusResponse> response = (ApiResponse<GetUploadSourceUrlJobStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GetUploadSourceUrlJobStatusResponse> response = (ApiResponse<GetUploadSourceUrlJobStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postGamificationContestsUploadsPrizeimages(GamificationContestPrizeImageUploadUrlRequest body) throws IOException, ApiException {
    return  postGamificationContestsUploadsPrizeimages(createPostGamificationContestsUploadsPrizeimagesRequest(body));
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postGamificationContestsUploadsPrizeimagesWithHttpInfo(GamificationContestPrizeImageUploadUrlRequest body) throws IOException {
    return postGamificationContestsUploadsPrizeimages(createPostGamificationContestsUploadsPrizeimagesRequest(body).withHttpInfo());
  }

  private PostGamificationContestsUploadsPrizeimagesRequest createPostGamificationContestsUploadsPrizeimagesRequest(GamificationContestPrizeImageUploadUrlRequest body) {
    return PostGamificationContestsUploadsPrizeimagesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postGamificationContestsUploadsPrizeimages(PostGamificationContestsUploadsPrizeimagesRequest request) throws IOException, ApiException {
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
   * Generates pre-signed URL to upload a prize image for gamification contests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postGamificationContestsUploadsPrizeimages(ApiRequest<GamificationContestPrizeImageUploadUrlRequest> request) throws IOException {
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
   * Create upload presigned URL for draft function package file.
   * 
   * @param actionId actionId (required)
   * @param body Input used to request URL upload. (required)
   * @return FunctionUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FunctionUploadResponse postIntegrationsActionDraftFunctionUpload(String actionId, FunctionUploadRequest body) throws IOException, ApiException {
    return  postIntegrationsActionDraftFunctionUpload(createPostIntegrationsActionDraftFunctionUploadRequest(actionId, body));
  }

  /**
   * Create upload presigned URL for draft function package file.
   * 
   * @param actionId actionId (required)
   * @param body Input used to request URL upload. (required)
   * @return FunctionUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FunctionUploadResponse> postIntegrationsActionDraftFunctionUploadWithHttpInfo(String actionId, FunctionUploadRequest body) throws IOException {
    return postIntegrationsActionDraftFunctionUpload(createPostIntegrationsActionDraftFunctionUploadRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionDraftFunctionUploadRequest createPostIntegrationsActionDraftFunctionUploadRequest(String actionId, FunctionUploadRequest body) {
    return PostIntegrationsActionDraftFunctionUploadRequest.builder()
            .withActionId(actionId)

            .withBody(body)

            .build();
  }

  /**
   * Create upload presigned URL for draft function package file.
   * 
   * @param request The request object
   * @return FunctionUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FunctionUploadResponse postIntegrationsActionDraftFunctionUpload(PostIntegrationsActionDraftFunctionUploadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FunctionUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FunctionUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create upload presigned URL for draft function package file.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FunctionUploadResponse> postIntegrationsActionDraftFunctionUpload(ApiRequest<FunctionUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FunctionUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FunctionUploadResponse> response = (ApiResponse<FunctionUploadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<FunctionUploadResponse> response = (ApiResponse<FunctionUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * Create content upload from URL job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body uploadRequest (required)
   * @return CreateUploadSourceUrlJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateUploadSourceUrlJobResponse postKnowledgeKnowledgebaseUploadsUrlsJobs(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseUploadsUrlsJobs(createPostKnowledgeKnowledgebaseUploadsUrlsJobsRequest(knowledgeBaseId, body));
  }

  /**
   * Create content upload from URL job
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body uploadRequest (required)
   * @return CreateUploadSourceUrlJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateUploadSourceUrlJobResponse> postKnowledgeKnowledgebaseUploadsUrlsJobsWithHttpInfo(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) throws IOException {
    return postKnowledgeKnowledgebaseUploadsUrlsJobs(createPostKnowledgeKnowledgebaseUploadsUrlsJobsRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest createPostKnowledgeKnowledgebaseUploadsUrlsJobsRequest(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) {
    return PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)

            .withBody(body)

            .build();
  }

  /**
   * Create content upload from URL job
   * 
   * @param request The request object
   * @return CreateUploadSourceUrlJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CreateUploadSourceUrlJobResponse postKnowledgeKnowledgebaseUploadsUrlsJobs(PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CreateUploadSourceUrlJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CreateUploadSourceUrlJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create content upload from URL job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CreateUploadSourceUrlJobResponse> postKnowledgeKnowledgebaseUploadsUrlsJobs(ApiRequest<CreateUploadSourceUrlJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CreateUploadSourceUrlJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CreateUploadSourceUrlJobResponse> response = (ApiResponse<CreateUploadSourceUrlJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<CreateUploadSourceUrlJobResponse> response = (ApiResponse<CreateUploadSourceUrlJobResponse>)(ApiResponse<?>)(new ApiException(exception));
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
  public UploadUrlResponse postLanguageunderstandingMinerUploads(String minerId, Object body) throws IOException, ApiException {
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
  public ApiResponse<UploadUrlResponse> postLanguageunderstandingMinerUploadsWithHttpInfo(String minerId, Object body) throws IOException {
    return postLanguageunderstandingMinerUploads(createPostLanguageunderstandingMinerUploadsRequest(minerId, body).withHttpInfo());
  }

  private PostLanguageunderstandingMinerUploadsRequest createPostLanguageunderstandingMinerUploadsRequest(String minerId, Object body) {
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
  public ApiResponse<UploadUrlResponse> postLanguageunderstandingMinerUploads(ApiRequest<Object> request) throws IOException {
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
   * Generates pre-signed URL to upload cover art for learning modules
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsLearningCoverart(LearningCoverArtUploadUrlRequest body) throws IOException, ApiException {
    return  postUploadsLearningCoverart(createPostUploadsLearningCoverartRequest(body));
  }

  /**
   * Generates pre-signed URL to upload cover art for learning modules
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsLearningCoverartWithHttpInfo(LearningCoverArtUploadUrlRequest body) throws IOException {
    return postUploadsLearningCoverart(createPostUploadsLearningCoverartRequest(body).withHttpInfo());
  }

  private PostUploadsLearningCoverartRequest createPostUploadsLearningCoverartRequest(LearningCoverArtUploadUrlRequest body) {
    return PostUploadsLearningCoverartRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Generates pre-signed URL to upload cover art for learning modules
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postUploadsLearningCoverart(PostUploadsLearningCoverartRequest request) throws IOException, ApiException {
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
   * Generates pre-signed URL to upload cover art for learning modules
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postUploadsLearningCoverart(ApiRequest<LearningCoverArtUploadUrlRequest> request) throws IOException {
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

}
