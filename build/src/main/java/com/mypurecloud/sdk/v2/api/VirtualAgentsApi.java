package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AgenticVirtualAgent;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentEntityListing;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentJob;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentVersionPublishJob;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.CreateAgenticVirtualAgent;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UpdateAgenticVirtualAgent;


import com.mypurecloud.sdk.v2.api.request.DeleteAgenticVirtualagentJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAgenticVirtualagentRequest;
import com.mypurecloud.sdk.v2.api.request.GetAgenticVirtualagentJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAgenticVirtualagentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAgenticVirtualagentRequest;
import com.mypurecloud.sdk.v2.api.request.PostAgenticVirtualagentVersionJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAgenticVirtualagentsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualAgentsApi {
  private final ApiClient pcapiClient;

  public VirtualAgentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VirtualAgentsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Start the deletion of a virtualAgent.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @return AgenticVirtualAgentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentJob deleteAgenticVirtualagentJobs(String virtualAgentId) throws IOException, ApiException {
    return  deleteAgenticVirtualagentJobs(createDeleteAgenticVirtualagentJobsRequest(virtualAgentId));
  }

  /**
   * Start the deletion of a virtualAgent.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @return AgenticVirtualAgentJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentJob> deleteAgenticVirtualagentJobsWithHttpInfo(String virtualAgentId) throws IOException {
    return deleteAgenticVirtualagentJobs(createDeleteAgenticVirtualagentJobsRequest(virtualAgentId).withHttpInfo());
  }

  private DeleteAgenticVirtualagentJobsRequest createDeleteAgenticVirtualagentJobsRequest(String virtualAgentId) {
    return DeleteAgenticVirtualagentJobsRequest.builder()
            .withVirtualAgentId(virtualAgentId)

            .build();
  }

  /**
   * Start the deletion of a virtualAgent.
   * 
   * @param request The request object
   * @return AgenticVirtualAgentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentJob deleteAgenticVirtualagentJobs(DeleteAgenticVirtualagentJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgenticVirtualAgentJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start the deletion of a virtualAgent.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentJob> deleteAgenticVirtualagentJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgenticVirtualAgentJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)exception;
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
      ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get virtual agent.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @return AgenticVirtualAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgent getAgenticVirtualagent(String virtualAgentId) throws IOException, ApiException {
    return  getAgenticVirtualagent(createGetAgenticVirtualagentRequest(virtualAgentId));
  }

  /**
   * Get virtual agent.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @return AgenticVirtualAgent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgent> getAgenticVirtualagentWithHttpInfo(String virtualAgentId) throws IOException {
    return getAgenticVirtualagent(createGetAgenticVirtualagentRequest(virtualAgentId).withHttpInfo());
  }

  private GetAgenticVirtualagentRequest createGetAgenticVirtualagentRequest(String virtualAgentId) {
    return GetAgenticVirtualagentRequest.builder()
            .withVirtualAgentId(virtualAgentId)

            .build();
  }

  /**
   * Get virtual agent.
   * 
   * @param request The request object
   * @return AgenticVirtualAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgent getAgenticVirtualagent(GetAgenticVirtualagentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgenticVirtualAgent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgenticVirtualAgent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get virtual agent.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgent> getAgenticVirtualagent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgenticVirtualAgent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)exception;
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
      ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a virtualAgent job.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @param jobId jobId (required)
   * @return AgenticVirtualAgentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentJob getAgenticVirtualagentJob(String virtualAgentId, String jobId) throws IOException, ApiException {
    return  getAgenticVirtualagentJob(createGetAgenticVirtualagentJobRequest(virtualAgentId, jobId));
  }

  /**
   * Get a virtualAgent job.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @param jobId jobId (required)
   * @return AgenticVirtualAgentJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentJob> getAgenticVirtualagentJobWithHttpInfo(String virtualAgentId, String jobId) throws IOException {
    return getAgenticVirtualagentJob(createGetAgenticVirtualagentJobRequest(virtualAgentId, jobId).withHttpInfo());
  }

  private GetAgenticVirtualagentJobRequest createGetAgenticVirtualagentJobRequest(String virtualAgentId, String jobId) {
    return GetAgenticVirtualagentJobRequest.builder()
            .withVirtualAgentId(virtualAgentId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get a virtualAgent job.
   * 
   * @param request The request object
   * @return AgenticVirtualAgentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentJob getAgenticVirtualagentJob(GetAgenticVirtualagentJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgenticVirtualAgentJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a virtualAgent job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentJob> getAgenticVirtualagentJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgenticVirtualAgentJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)exception;
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
      ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all virtual agents.
   * 
   * @param name Filter by matching name - case insensitive. (optional)
   * @param nameContains Filter by name contains - case insensitive. (optional)
   * @param status Filter by status. (optional)
   * @param sortBy Sort by. Default value dateModified. (optional, default to dateModified)
   * @param sortOrder Sort Order. Default value desc. (optional, default to desc)
   * @param pageNumber Page number. (optional, default to 1)
   * @param pageSize Page size. The maximum page size is 100. (optional, default to 25)
   * @return AgenticVirtualAgentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentEntityListing getAgenticVirtualagents(String name, String nameContains, String status, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAgenticVirtualagents(createGetAgenticVirtualagentsRequest(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize));
  }

  /**
   * Get all virtual agents.
   * 
   * @param name Filter by matching name - case insensitive. (optional)
   * @param nameContains Filter by name contains - case insensitive. (optional)
   * @param status Filter by status. (optional)
   * @param sortBy Sort by. Default value dateModified. (optional, default to dateModified)
   * @param sortOrder Sort Order. Default value desc. (optional, default to desc)
   * @param pageNumber Page number. (optional, default to 1)
   * @param pageSize Page size. The maximum page size is 100. (optional, default to 25)
   * @return AgenticVirtualAgentEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentEntityListing> getAgenticVirtualagentsWithHttpInfo(String name, String nameContains, String status, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) throws IOException {
    return getAgenticVirtualagents(createGetAgenticVirtualagentsRequest(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize).withHttpInfo());
  }

  private GetAgenticVirtualagentsRequest createGetAgenticVirtualagentsRequest(String name, String nameContains, String status, String sortBy, String sortOrder, Integer pageNumber, Integer pageSize) {
    return GetAgenticVirtualagentsRequest.builder()
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
   * Get all virtual agents.
   * 
   * @param request The request object
   * @return AgenticVirtualAgentEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentEntityListing getAgenticVirtualagents(GetAgenticVirtualagentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgenticVirtualAgentEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all virtual agents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentEntityListing> getAgenticVirtualagents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgenticVirtualAgentEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgenticVirtualAgentEntityListing> response = (ApiResponse<AgenticVirtualAgentEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AgenticVirtualAgentEntityListing> response = (ApiResponse<AgenticVirtualAgentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a virtual agent.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @param body  (required)
   * @return AgenticVirtualAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgent patchAgenticVirtualagent(String virtualAgentId, UpdateAgenticVirtualAgent body) throws IOException, ApiException {
    return  patchAgenticVirtualagent(createPatchAgenticVirtualagentRequest(virtualAgentId, body));
  }

  /**
   * Update a virtual agent.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @param body  (required)
   * @return AgenticVirtualAgent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgent> patchAgenticVirtualagentWithHttpInfo(String virtualAgentId, UpdateAgenticVirtualAgent body) throws IOException {
    return patchAgenticVirtualagent(createPatchAgenticVirtualagentRequest(virtualAgentId, body).withHttpInfo());
  }

  private PatchAgenticVirtualagentRequest createPatchAgenticVirtualagentRequest(String virtualAgentId, UpdateAgenticVirtualAgent body) {
    return PatchAgenticVirtualagentRequest.builder()
            .withVirtualAgentId(virtualAgentId)

            .withBody(body)

            .build();
  }

  /**
   * Update a virtual agent.
   * 
   * @param request The request object
   * @return AgenticVirtualAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgent patchAgenticVirtualagent(PatchAgenticVirtualagentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgenticVirtualAgent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgenticVirtualAgent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a virtual agent.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgent> patchAgenticVirtualagent(ApiRequest<UpdateAgenticVirtualAgent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgenticVirtualAgent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)exception;
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
      ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start the publishing of a virtual agent version.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @param versionId Version ID (required)
   * @param body  (required)
   * @return AgenticVirtualAgentVersionPublishJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentVersionPublishJob postAgenticVirtualagentVersionJobs(String virtualAgentId, String versionId, AgenticVirtualAgentVersionPublishJobRequest body) throws IOException, ApiException {
    return  postAgenticVirtualagentVersionJobs(createPostAgenticVirtualagentVersionJobsRequest(virtualAgentId, versionId, body));
  }

  /**
   * Start the publishing of a virtual agent version.
   * 
   * @param virtualAgentId Virtual Agent ID (required)
   * @param versionId Version ID (required)
   * @param body  (required)
   * @return AgenticVirtualAgentVersionPublishJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentVersionPublishJob> postAgenticVirtualagentVersionJobsWithHttpInfo(String virtualAgentId, String versionId, AgenticVirtualAgentVersionPublishJobRequest body) throws IOException {
    return postAgenticVirtualagentVersionJobs(createPostAgenticVirtualagentVersionJobsRequest(virtualAgentId, versionId, body).withHttpInfo());
  }

  private PostAgenticVirtualagentVersionJobsRequest createPostAgenticVirtualagentVersionJobsRequest(String virtualAgentId, String versionId, AgenticVirtualAgentVersionPublishJobRequest body) {
    return PostAgenticVirtualagentVersionJobsRequest.builder()
            .withVirtualAgentId(virtualAgentId)

            .withVersionId(versionId)

            .withBody(body)

            .build();
  }

  /**
   * Start the publishing of a virtual agent version.
   * 
   * @param request The request object
   * @return AgenticVirtualAgentVersionPublishJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgentVersionPublishJob postAgenticVirtualagentVersionJobs(PostAgenticVirtualagentVersionJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgenticVirtualAgentVersionPublishJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentVersionPublishJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start the publishing of a virtual agent version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgentVersionPublishJob> postAgenticVirtualagentVersionJobs(ApiRequest<AgenticVirtualAgentVersionPublishJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgenticVirtualAgentVersionPublishJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgenticVirtualAgentVersionPublishJob> response = (ApiResponse<AgenticVirtualAgentVersionPublishJob>)(ApiResponse<?>)exception;
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
      ApiResponse<AgenticVirtualAgentVersionPublishJob> response = (ApiResponse<AgenticVirtualAgentVersionPublishJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a virtual agent.
   * 
   * @param body  (required)
   * @return AgenticVirtualAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgent postAgenticVirtualagents(CreateAgenticVirtualAgent body) throws IOException, ApiException {
    return  postAgenticVirtualagents(createPostAgenticVirtualagentsRequest(body));
  }

  /**
   * Create a virtual agent.
   * 
   * @param body  (required)
   * @return AgenticVirtualAgent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgent> postAgenticVirtualagentsWithHttpInfo(CreateAgenticVirtualAgent body) throws IOException {
    return postAgenticVirtualagents(createPostAgenticVirtualagentsRequest(body).withHttpInfo());
  }

  private PostAgenticVirtualagentsRequest createPostAgenticVirtualagentsRequest(CreateAgenticVirtualAgent body) {
    return PostAgenticVirtualagentsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a virtual agent.
   * 
   * @param request The request object
   * @return AgenticVirtualAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgenticVirtualAgent postAgenticVirtualagents(PostAgenticVirtualagentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgenticVirtualAgent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgenticVirtualAgent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a virtual agent.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgenticVirtualAgent> postAgenticVirtualagents(ApiRequest<CreateAgenticVirtualAgent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgenticVirtualAgent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)exception;
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
      ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
