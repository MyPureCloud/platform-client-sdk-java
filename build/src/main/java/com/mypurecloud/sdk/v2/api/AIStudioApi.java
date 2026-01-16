package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.CreateGuide;
import com.mypurecloud.sdk.v2.model.CreateGuideVersion;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GenerateGuideContentRequest;
import com.mypurecloud.sdk.v2.model.Guide;
import com.mypurecloud.sdk.v2.model.GuideContentGenerationJob;
import com.mypurecloud.sdk.v2.model.GuideEntityListing;
import com.mypurecloud.sdk.v2.model.GuideJob;
import com.mypurecloud.sdk.v2.model.GuideSessionTurnRequest;
import com.mypurecloud.sdk.v2.model.GuideSessionTurnResponse;
import com.mypurecloud.sdk.v2.model.GuideVersion;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJob;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.SummarySetting;
import com.mypurecloud.sdk.v2.model.SummarySettingEntityListing;
import com.mypurecloud.sdk.v2.model.SummarySettingWithTranscript;
import com.mypurecloud.sdk.v2.model.UpdateGuide;
import com.mypurecloud.sdk.v2.model.UpdateGuideVersion;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationsSummariesSettingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteGuideJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsSummariesSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationsSummariesSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideVersionJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuidesRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuidesJobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchGuideRequest;
import com.mypurecloud.sdk.v2.api.request.PatchGuideVersionRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsSummariesPreviewRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsSummariesSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuideSessionTurnsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuideVersionJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuideVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuidesRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuidesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuidesUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationsSummariesSettingRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AIStudioApi {
  private final ApiClient pcapiClient;

  public AIStudioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AIStudioApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a summary setting.
   * 
   * @param summarySettingId Summary setting id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsSummariesSetting(String summarySettingId) throws IOException, ApiException {
     deleteConversationsSummariesSetting(createDeleteConversationsSummariesSettingRequest(summarySettingId));
  }

  /**
   * Delete a summary setting.
   * 
   * @param summarySettingId Summary setting id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsSummariesSettingWithHttpInfo(String summarySettingId) throws IOException {
    return deleteConversationsSummariesSetting(createDeleteConversationsSummariesSettingRequest(summarySettingId).withHttpInfo());
  }

  private DeleteConversationsSummariesSettingRequest createDeleteConversationsSummariesSettingRequest(String summarySettingId) {
    return DeleteConversationsSummariesSettingRequest.builder()
            .withSummarySettingId(summarySettingId)

            .build();
  }

  /**
   * Delete a summary setting.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteConversationsSummariesSetting(DeleteConversationsSummariesSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a summary setting.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteConversationsSummariesSetting(ApiRequest<Void> request) throws IOException {
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
   * Start the deletion of a guide.
   * 
   * @param guideId Guide ID (required)
   * @return GuideJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideJob deleteGuideJobs(String guideId) throws IOException, ApiException {
    return  deleteGuideJobs(createDeleteGuideJobsRequest(guideId));
  }

  /**
   * Start the deletion of a guide.
   * 
   * @param guideId Guide ID (required)
   * @return GuideJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideJob> deleteGuideJobsWithHttpInfo(String guideId) throws IOException {
    return deleteGuideJobs(createDeleteGuideJobsRequest(guideId).withHttpInfo());
  }

  private DeleteGuideJobsRequest createDeleteGuideJobsRequest(String guideId) {
    return DeleteGuideJobsRequest.builder()
            .withGuideId(guideId)

            .build();
  }

  /**
   * Start the deletion of a guide.
   * 
   * @param request The request object
   * @return GuideJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideJob deleteGuideJobs(DeleteGuideJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start the deletion of a guide.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideJob> deleteGuideJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideJob> response = (ApiResponse<GuideJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideJob> response = (ApiResponse<GuideJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Receive a summary setting.
   * 
   * @param summarySettingId Summary setting id (required)
   * @return SummarySetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySetting getConversationsSummariesSetting(String summarySettingId) throws IOException, ApiException {
    return  getConversationsSummariesSetting(createGetConversationsSummariesSettingRequest(summarySettingId));
  }

  /**
   * Receive a summary setting.
   * 
   * @param summarySettingId Summary setting id (required)
   * @return SummarySetting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySetting> getConversationsSummariesSettingWithHttpInfo(String summarySettingId) throws IOException {
    return getConversationsSummariesSetting(createGetConversationsSummariesSettingRequest(summarySettingId).withHttpInfo());
  }

  private GetConversationsSummariesSettingRequest createGetConversationsSummariesSettingRequest(String summarySettingId) {
    return GetConversationsSummariesSettingRequest.builder()
            .withSummarySettingId(summarySettingId)

            .build();
  }

  /**
   * Receive a summary setting.
   * 
   * @param request The request object
   * @return SummarySetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySetting getConversationsSummariesSetting(GetConversationsSummariesSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SummarySetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SummarySetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Receive a summary setting.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySetting> getConversationsSummariesSetting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SummarySetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SummarySetting> response = (ApiResponse<SummarySetting>)(ApiResponse<?>)exception;
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
      ApiResponse<SummarySetting> response = (ApiResponse<SummarySetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all summary settings.
   * 
   * @param language Filter by matching language - case insensitive. (optional)
   * @param name Filter by partially matching name - case insensitive. (optional)
   * @param sortBy Sort by. Default value dateModified. (optional, default to dateModified)
   * @param sortOrder Sort Order. Default value desc. (optional, default to desc)
   * @param pageNumber Page number. (optional, default to 1)
   * @param pageSize Page size. The maximum page size is 100. (optional, default to 25)
   * @return SummarySettingEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySettingEntityListing getConversationsSummariesSettings(String language, String name, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getConversationsSummariesSettings(createGetConversationsSummariesSettingsRequest(language, name, sortBy, sortOrder, pageNumber, pageSize));
  }

  /**
   * Get all summary settings.
   * 
   * @param language Filter by matching language - case insensitive. (optional)
   * @param name Filter by partially matching name - case insensitive. (optional)
   * @param sortBy Sort by. Default value dateModified. (optional, default to dateModified)
   * @param sortOrder Sort Order. Default value desc. (optional, default to desc)
   * @param pageNumber Page number. (optional, default to 1)
   * @param pageSize Page size. The maximum page size is 100. (optional, default to 25)
   * @return SummarySettingEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySettingEntityListing> getConversationsSummariesSettingsWithHttpInfo(String language, String name, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) throws IOException {
    return getConversationsSummariesSettings(createGetConversationsSummariesSettingsRequest(language, name, sortBy, sortOrder, pageNumber, pageSize).withHttpInfo());
  }

  private GetConversationsSummariesSettingsRequest createGetConversationsSummariesSettingsRequest(String language, String name, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) {
    return GetConversationsSummariesSettingsRequest.builder()
            .withLanguage(language)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get all summary settings.
   * 
   * @param request The request object
   * @return SummarySettingEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySettingEntityListing getConversationsSummariesSettings(GetConversationsSummariesSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SummarySettingEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SummarySettingEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all summary settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySettingEntityListing> getConversationsSummariesSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SummarySettingEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SummarySettingEntityListing> response = (ApiResponse<SummarySettingEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SummarySettingEntityListing> response = (ApiResponse<SummarySettingEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get guide.
   * 
   * @param guideId Guide ID (required)
   * @return Guide
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Guide getGuide(String guideId) throws IOException, ApiException {
    return  getGuide(createGetGuideRequest(guideId));
  }

  /**
   * Get guide.
   * 
   * @param guideId Guide ID (required)
   * @return Guide
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Guide> getGuideWithHttpInfo(String guideId) throws IOException {
    return getGuide(createGetGuideRequest(guideId).withHttpInfo());
  }

  private GetGuideRequest createGetGuideRequest(String guideId) {
    return GetGuideRequest.builder()
            .withGuideId(guideId)

            .build();
  }

  /**
   * Get guide.
   * 
   * @param request The request object
   * @return Guide
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Guide getGuide(GetGuideRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Guide> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Guide>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get guide.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Guide> getGuide(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Guide>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Guide> response = (ApiResponse<Guide>)(ApiResponse<?>)exception;
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
      ApiResponse<Guide> response = (ApiResponse<Guide>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the specified guide deletion job.
   * 
   * @param guideId Guide ID (required)
   * @param jobId jobId (required)
   * @return GuideJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideJob getGuideJob(String guideId, String jobId) throws IOException, ApiException {
    return  getGuideJob(createGetGuideJobRequest(guideId, jobId));
  }

  /**
   * Get the specified guide deletion job.
   * 
   * @param guideId Guide ID (required)
   * @param jobId jobId (required)
   * @return GuideJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideJob> getGuideJobWithHttpInfo(String guideId, String jobId) throws IOException {
    return getGuideJob(createGetGuideJobRequest(guideId, jobId).withHttpInfo());
  }

  private GetGuideJobRequest createGetGuideJobRequest(String guideId, String jobId) {
    return GetGuideJobRequest.builder()
            .withGuideId(guideId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get the specified guide deletion job.
   * 
   * @param request The request object
   * @return GuideJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideJob getGuideJob(GetGuideJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the specified guide deletion job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideJob> getGuideJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideJob> response = (ApiResponse<GuideJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideJob> response = (ApiResponse<GuideJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @return GuideVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersion getGuideVersion(String guideId, String versionId) throws IOException, ApiException {
    return  getGuideVersion(createGetGuideVersionRequest(guideId, versionId));
  }

  /**
   * Get a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @return GuideVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersion> getGuideVersionWithHttpInfo(String guideId, String versionId) throws IOException {
    return getGuideVersion(createGetGuideVersionRequest(guideId, versionId).withHttpInfo());
  }

  private GetGuideVersionRequest createGetGuideVersionRequest(String guideId, String versionId) {
    return GetGuideVersionRequest.builder()
            .withGuideId(guideId)

            .withVersionId(versionId)

            .build();
  }

  /**
   * Get a guide version.
   * 
   * @param request The request object
   * @return GuideVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersion getGuideVersion(GetGuideVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a guide version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersion> getGuideVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideVersion> response = (ApiResponse<GuideVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideVersion> response = (ApiResponse<GuideVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the status of the publishing job for this guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @param jobId jobId (required)
   * @return GuideVersionPublishJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersionPublishJob getGuideVersionJob(String guideId, String versionId, String jobId) throws IOException, ApiException {
    return  getGuideVersionJob(createGetGuideVersionJobRequest(guideId, versionId, jobId));
  }

  /**
   * Get the status of the publishing job for this guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @param jobId jobId (required)
   * @return GuideVersionPublishJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersionPublishJob> getGuideVersionJobWithHttpInfo(String guideId, String versionId, String jobId) throws IOException {
    return getGuideVersionJob(createGetGuideVersionJobRequest(guideId, versionId, jobId).withHttpInfo());
  }

  private GetGuideVersionJobRequest createGetGuideVersionJobRequest(String guideId, String versionId, String jobId) {
    return GetGuideVersionJobRequest.builder()
            .withGuideId(guideId)

            .withVersionId(versionId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get the status of the publishing job for this guide version.
   * 
   * @param request The request object
   * @return GuideVersionPublishJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersionPublishJob getGuideVersionJob(GetGuideVersionJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideVersionPublishJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideVersionPublishJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status of the publishing job for this guide version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersionPublishJob> getGuideVersionJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideVersionPublishJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideVersionPublishJob> response = (ApiResponse<GuideVersionPublishJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideVersionPublishJob> response = (ApiResponse<GuideVersionPublishJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all guides.
   * 
   * @param name Filter by matching name - case insensitive. (optional)
   * @param nameContains Filter by name contains - case insensitive. (optional)
   * @param status Filter by status. (optional)
   * @param sortBy Sort by. Default value dateModified. (optional, default to dateModified)
   * @param sortOrder Sort Order. Default value desc. (optional, default to desc)
   * @param pageNumber Page number. (optional, default to 1)
   * @param pageSize Page size. The maximum page size is 100. (optional, default to 25)
   * @return GuideEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideEntityListing getGuides(String name, String nameContains, String status, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getGuides(createGetGuidesRequest(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize));
  }

  /**
   * Get all guides.
   * 
   * @param name Filter by matching name - case insensitive. (optional)
   * @param nameContains Filter by name contains - case insensitive. (optional)
   * @param status Filter by status. (optional)
   * @param sortBy Sort by. Default value dateModified. (optional, default to dateModified)
   * @param sortOrder Sort Order. Default value desc. (optional, default to desc)
   * @param pageNumber Page number. (optional, default to 1)
   * @param pageSize Page size. The maximum page size is 100. (optional, default to 25)
   * @return GuideEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideEntityListing> getGuidesWithHttpInfo(String name, String nameContains, String status, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) throws IOException {
    return getGuides(createGetGuidesRequest(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize).withHttpInfo());
  }

  private GetGuidesRequest createGetGuidesRequest(String name, String nameContains, String status, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) {
    return GetGuidesRequest.builder()
            .withName(name)

            .withNameContains(nameContains)

            .withStatus(status)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get all guides.
   * 
   * @param request The request object
   * @return GuideEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideEntityListing getGuides(GetGuidesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all guides.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideEntityListing> getGuides(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideEntityListing> response = (ApiResponse<GuideEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideEntityListing> response = (ApiResponse<GuideEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the status of the guide content generation job.
   * 
   * @param jobId jobId (required)
   * @return GuideContentGenerationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideContentGenerationJob getGuidesJob(String jobId) throws IOException, ApiException {
    return  getGuidesJob(createGetGuidesJobRequest(jobId));
  }

  /**
   * Get the status of the guide content generation job.
   * 
   * @param jobId jobId (required)
   * @return GuideContentGenerationJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideContentGenerationJob> getGuidesJobWithHttpInfo(String jobId) throws IOException {
    return getGuidesJob(createGetGuidesJobRequest(jobId).withHttpInfo());
  }

  private GetGuidesJobRequest createGetGuidesJobRequest(String jobId) {
    return GetGuidesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get the status of the guide content generation job.
   * 
   * @param request The request object
   * @return GuideContentGenerationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideContentGenerationJob getGuidesJob(GetGuidesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideContentGenerationJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideContentGenerationJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status of the guide content generation job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideContentGenerationJob> getGuidesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideContentGenerationJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideContentGenerationJob> response = (ApiResponse<GuideContentGenerationJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideContentGenerationJob> response = (ApiResponse<GuideContentGenerationJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a guide.
   * 
   * @param guideId Guide ID (required)
   * @param body  (required)
   * @return Guide
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Guide patchGuide(String guideId, UpdateGuide body) throws IOException, ApiException {
    return  patchGuide(createPatchGuideRequest(guideId, body));
  }

  /**
   * Update a guide.
   * 
   * @param guideId Guide ID (required)
   * @param body  (required)
   * @return Guide
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Guide> patchGuideWithHttpInfo(String guideId, UpdateGuide body) throws IOException {
    return patchGuide(createPatchGuideRequest(guideId, body).withHttpInfo());
  }

  private PatchGuideRequest createPatchGuideRequest(String guideId, UpdateGuide body) {
    return PatchGuideRequest.builder()
            .withGuideId(guideId)

            .withBody(body)

            .build();
  }

  /**
   * Update a guide.
   * 
   * @param request The request object
   * @return Guide
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Guide patchGuide(PatchGuideRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Guide> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Guide>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a guide.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Guide> patchGuide(ApiRequest<UpdateGuide> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Guide>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Guide> response = (ApiResponse<Guide>)(ApiResponse<?>)exception;
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
      ApiResponse<Guide> response = (ApiResponse<Guide>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @param body  (required)
   * @return GuideVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersion patchGuideVersion(String guideId, String versionId, UpdateGuideVersion body) throws IOException, ApiException {
    return  patchGuideVersion(createPatchGuideVersionRequest(guideId, versionId, body));
  }

  /**
   * Update a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @param body  (required)
   * @return GuideVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersion> patchGuideVersionWithHttpInfo(String guideId, String versionId, UpdateGuideVersion body) throws IOException {
    return patchGuideVersion(createPatchGuideVersionRequest(guideId, versionId, body).withHttpInfo());
  }

  private PatchGuideVersionRequest createPatchGuideVersionRequest(String guideId, String versionId, UpdateGuideVersion body) {
    return PatchGuideVersionRequest.builder()
            .withGuideId(guideId)

            .withVersionId(versionId)

            .withBody(body)

            .build();
  }

  /**
   * Update a guide version.
   * 
   * @param request The request object
   * @return GuideVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersion patchGuideVersion(PatchGuideVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a guide version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersion> patchGuideVersion(ApiRequest<UpdateGuideVersion> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideVersion> response = (ApiResponse<GuideVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideVersion> response = (ApiResponse<GuideVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Trigger summary preview event generation.
   * 
   * @param body  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsSummariesPreview(SummarySettingWithTranscript body) throws IOException, ApiException {
     postConversationsSummariesPreview(createPostConversationsSummariesPreviewRequest(body));
  }

  /**
   * Trigger summary preview event generation.
   * 
   * @param body  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsSummariesPreviewWithHttpInfo(SummarySettingWithTranscript body) throws IOException {
    return postConversationsSummariesPreview(createPostConversationsSummariesPreviewRequest(body).withHttpInfo());
  }

  private PostConversationsSummariesPreviewRequest createPostConversationsSummariesPreviewRequest(SummarySettingWithTranscript body) {
    return PostConversationsSummariesPreviewRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Trigger summary preview event generation.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postConversationsSummariesPreview(PostConversationsSummariesPreviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Trigger summary preview event generation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postConversationsSummariesPreview(ApiRequest<SummarySettingWithTranscript> request) throws IOException {
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
   * Create a summary setting.
   * 
   * @param body  (required)
   * @return SummarySetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySetting postConversationsSummariesSettings(SummarySetting body) throws IOException, ApiException {
    return  postConversationsSummariesSettings(createPostConversationsSummariesSettingsRequest(body));
  }

  /**
   * Create a summary setting.
   * 
   * @param body  (required)
   * @return SummarySetting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySetting> postConversationsSummariesSettingsWithHttpInfo(SummarySetting body) throws IOException {
    return postConversationsSummariesSettings(createPostConversationsSummariesSettingsRequest(body).withHttpInfo());
  }

  private PostConversationsSummariesSettingsRequest createPostConversationsSummariesSettingsRequest(SummarySetting body) {
    return PostConversationsSummariesSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a summary setting.
   * 
   * @param request The request object
   * @return SummarySetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySetting postConversationsSummariesSettings(PostConversationsSummariesSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SummarySetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SummarySetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a summary setting.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySetting> postConversationsSummariesSettings(ApiRequest<SummarySetting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SummarySetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SummarySetting> response = (ApiResponse<SummarySetting>)(ApiResponse<?>)exception;
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
      ApiResponse<SummarySetting> response = (ApiResponse<SummarySetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add a turn to a guide session.
   * Creates a new turn in the specified guide session with the provided request data. If the session ID doesn't exist, a new session will be created automatically.
   * @param guideId Guide ID (required)
   * @param guideSessionId Guide Session ID (required)
   * @param body  (required)
   * @return GuideSessionTurnResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideSessionTurnResponse postGuideSessionTurns(String guideId, String guideSessionId, GuideSessionTurnRequest body) throws IOException, ApiException {
    return  postGuideSessionTurns(createPostGuideSessionTurnsRequest(guideId, guideSessionId, body));
  }

  /**
   * Add a turn to a guide session.
   * Creates a new turn in the specified guide session with the provided request data. If the session ID doesn't exist, a new session will be created automatically.
   * @param guideId Guide ID (required)
   * @param guideSessionId Guide Session ID (required)
   * @param body  (required)
   * @return GuideSessionTurnResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideSessionTurnResponse> postGuideSessionTurnsWithHttpInfo(String guideId, String guideSessionId, GuideSessionTurnRequest body) throws IOException {
    return postGuideSessionTurns(createPostGuideSessionTurnsRequest(guideId, guideSessionId, body).withHttpInfo());
  }

  private PostGuideSessionTurnsRequest createPostGuideSessionTurnsRequest(String guideId, String guideSessionId, GuideSessionTurnRequest body) {
    return PostGuideSessionTurnsRequest.builder()
            .withGuideId(guideId)

            .withGuideSessionId(guideSessionId)

            .withBody(body)

            .build();
  }

  /**
   * Add a turn to a guide session.
   * Creates a new turn in the specified guide session with the provided request data. If the session ID doesn't exist, a new session will be created automatically.
   * @param request The request object
   * @return GuideSessionTurnResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideSessionTurnResponse postGuideSessionTurns(PostGuideSessionTurnsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideSessionTurnResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideSessionTurnResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a turn to a guide session.
   * Creates a new turn in the specified guide session with the provided request data. If the session ID doesn't exist, a new session will be created automatically.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideSessionTurnResponse> postGuideSessionTurns(ApiRequest<GuideSessionTurnRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideSessionTurnResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideSessionTurnResponse> response = (ApiResponse<GuideSessionTurnResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideSessionTurnResponse> response = (ApiResponse<GuideSessionTurnResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start the publishing of a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @param body  (required)
   * @return GuideVersionPublishJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersionPublishJob postGuideVersionJobs(String guideId, String versionId, GuideVersionPublishJobRequest body) throws IOException, ApiException {
    return  postGuideVersionJobs(createPostGuideVersionJobsRequest(guideId, versionId, body));
  }

  /**
   * Start the publishing of a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param versionId Version ID (required)
   * @param body  (required)
   * @return GuideVersionPublishJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersionPublishJob> postGuideVersionJobsWithHttpInfo(String guideId, String versionId, GuideVersionPublishJobRequest body) throws IOException {
    return postGuideVersionJobs(createPostGuideVersionJobsRequest(guideId, versionId, body).withHttpInfo());
  }

  private PostGuideVersionJobsRequest createPostGuideVersionJobsRequest(String guideId, String versionId, GuideVersionPublishJobRequest body) {
    return PostGuideVersionJobsRequest.builder()
            .withGuideId(guideId)

            .withVersionId(versionId)

            .withBody(body)

            .build();
  }

  /**
   * Start the publishing of a guide version.
   * 
   * @param request The request object
   * @return GuideVersionPublishJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersionPublishJob postGuideVersionJobs(PostGuideVersionJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideVersionPublishJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideVersionPublishJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start the publishing of a guide version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersionPublishJob> postGuideVersionJobs(ApiRequest<GuideVersionPublishJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideVersionPublishJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideVersionPublishJob> response = (ApiResponse<GuideVersionPublishJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideVersionPublishJob> response = (ApiResponse<GuideVersionPublishJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param body  (optional)
   * @return GuideVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersion postGuideVersions(String guideId, CreateGuideVersion body) throws IOException, ApiException {
    return  postGuideVersions(createPostGuideVersionsRequest(guideId, body));
  }

  /**
   * Create a guide version.
   * 
   * @param guideId Guide ID (required)
   * @param body  (optional)
   * @return GuideVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersion> postGuideVersionsWithHttpInfo(String guideId, CreateGuideVersion body) throws IOException {
    return postGuideVersions(createPostGuideVersionsRequest(guideId, body).withHttpInfo());
  }

  private PostGuideVersionsRequest createPostGuideVersionsRequest(String guideId, CreateGuideVersion body) {
    return PostGuideVersionsRequest.builder()
            .withGuideId(guideId)

            .withBody(body)

            .build();
  }

  /**
   * Create a guide version.
   * 
   * @param request The request object
   * @return GuideVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideVersion postGuideVersions(PostGuideVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a guide version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideVersion> postGuideVersions(ApiRequest<CreateGuideVersion> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideVersion> response = (ApiResponse<GuideVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideVersion> response = (ApiResponse<GuideVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a guide.
   * 
   * @param body  (required)
   * @return Guide
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Guide postGuides(CreateGuide body) throws IOException, ApiException {
    return  postGuides(createPostGuidesRequest(body));
  }

  /**
   * Create a guide.
   * 
   * @param body  (required)
   * @return Guide
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Guide> postGuidesWithHttpInfo(CreateGuide body) throws IOException {
    return postGuides(createPostGuidesRequest(body).withHttpInfo());
  }

  private PostGuidesRequest createPostGuidesRequest(CreateGuide body) {
    return PostGuidesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a guide.
   * 
   * @param request The request object
   * @return Guide
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Guide postGuides(PostGuidesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Guide> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Guide>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a guide.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Guide> postGuides(ApiRequest<CreateGuide> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Guide>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Guide> response = (ApiResponse<Guide>)(ApiResponse<?>)exception;
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
      ApiResponse<Guide> response = (ApiResponse<Guide>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start a guide content generation job.
   * 
   * @param body  (required)
   * @return GuideContentGenerationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideContentGenerationJob postGuidesJobs(GenerateGuideContentRequest body) throws IOException, ApiException {
    return  postGuidesJobs(createPostGuidesJobsRequest(body));
  }

  /**
   * Start a guide content generation job.
   * 
   * @param body  (required)
   * @return GuideContentGenerationJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideContentGenerationJob> postGuidesJobsWithHttpInfo(GenerateGuideContentRequest body) throws IOException {
    return postGuidesJobs(createPostGuidesJobsRequest(body).withHttpInfo());
  }

  private PostGuidesJobsRequest createPostGuidesJobsRequest(GenerateGuideContentRequest body) {
    return PostGuidesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Start a guide content generation job.
   * 
   * @param request The request object
   * @return GuideContentGenerationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GuideContentGenerationJob postGuidesJobs(PostGuidesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GuideContentGenerationJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GuideContentGenerationJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start a guide content generation job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GuideContentGenerationJob> postGuidesJobs(ApiRequest<GenerateGuideContentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GuideContentGenerationJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GuideContentGenerationJob> response = (ApiResponse<GuideContentGenerationJob>)(ApiResponse<?>)exception;
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
      ApiResponse<GuideContentGenerationJob> response = (ApiResponse<GuideContentGenerationJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Generate presigned URL for uploading a file content to generate guide
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postGuidesUploads(UploadUrlRequest body) throws IOException, ApiException {
    return  postGuidesUploads(createPostGuidesUploadsRequest(body));
  }

  /**
   * Generate presigned URL for uploading a file content to generate guide
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postGuidesUploadsWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postGuidesUploads(createPostGuidesUploadsRequest(body).withHttpInfo());
  }

  private PostGuidesUploadsRequest createPostGuidesUploadsRequest(UploadUrlRequest body) {
    return PostGuidesUploadsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Generate presigned URL for uploading a file content to generate guide
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postGuidesUploads(PostGuidesUploadsRequest request) throws IOException, ApiException {
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
   * Generate presigned URL for uploading a file content to generate guide
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postGuidesUploads(ApiRequest<UploadUrlRequest> request) throws IOException {
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
   * Update a summary setting.
   * 
   * @param summarySettingId Summary setting id (required)
   * @param body  (required)
   * @return SummarySetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySetting putConversationsSummariesSetting(String summarySettingId, SummarySetting body) throws IOException, ApiException {
    return  putConversationsSummariesSetting(createPutConversationsSummariesSettingRequest(summarySettingId, body));
  }

  /**
   * Update a summary setting.
   * 
   * @param summarySettingId Summary setting id (required)
   * @param body  (required)
   * @return SummarySetting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySetting> putConversationsSummariesSettingWithHttpInfo(String summarySettingId, SummarySetting body) throws IOException {
    return putConversationsSummariesSetting(createPutConversationsSummariesSettingRequest(summarySettingId, body).withHttpInfo());
  }

  private PutConversationsSummariesSettingRequest createPutConversationsSummariesSettingRequest(String summarySettingId, SummarySetting body) {
    return PutConversationsSummariesSettingRequest.builder()
            .withSummarySettingId(summarySettingId)

            .withBody(body)

            .build();
  }

  /**
   * Update a summary setting.
   * 
   * @param request The request object
   * @return SummarySetting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SummarySetting putConversationsSummariesSetting(PutConversationsSummariesSettingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SummarySetting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SummarySetting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a summary setting.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SummarySetting> putConversationsSummariesSetting(ApiRequest<SummarySetting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SummarySetting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SummarySetting> response = (ApiResponse<SummarySetting>)(ApiResponse<?>)exception;
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
      ApiResponse<SummarySetting> response = (ApiResponse<SummarySetting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
