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
import com.mypurecloud.sdk.v2.model.GuideVersion;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJob;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.UpdateGuideVersion;


import com.mypurecloud.sdk.v2.api.request.DeleteGuideJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuideVersionJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuidesRequest;
import com.mypurecloud.sdk.v2.api.request.GetGuidesJobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchGuideVersionRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuideVersionJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuideVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuidesRequest;
import com.mypurecloud.sdk.v2.api.request.PostGuidesJobsRequest;

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
   * Start the deletion of a guide.
   * 
   * deleteGuideJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteGuideJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteGuideJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * deleteGuideJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Get guide.
   * 
   * getGuide is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuide is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuide is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuide is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersionJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersionJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersionJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuideVersionJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuidesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuidesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuidesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * getGuidesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Update a guide version.
   * 
   * patchGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * patchGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * Start the publishing of a guide version.
   * 
   * postGuideVersionJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuideVersionJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuideVersionJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuideVersionJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuideVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuideVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuideVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuideVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuidesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuidesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuidesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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
   * postGuidesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
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

}
