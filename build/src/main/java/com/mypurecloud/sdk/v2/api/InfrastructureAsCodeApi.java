package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AcceleratorInput;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InfrastructureascodeJob;


import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostInfrastructureascodeJobsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfrastructureAsCodeApi {
  private final ApiClient pcapiClient;

  public InfrastructureAsCodeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InfrastructureAsCodeApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get job status and results
   * Get the execution status of a submitted job, optionally including results and error details.
   * @param jobId Job ID (required)
   * @param details Include details of execution, including job results or error information (optional, default to false)
   * @return InfrastructureascodeJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InfrastructureascodeJob getInfrastructureascodeJob(String jobId, Boolean details) throws IOException, ApiException {
    return  getInfrastructureascodeJob(createGetInfrastructureascodeJobRequest(jobId, details));
  }

  /**
   * Get job status and results
   * Get the execution status of a submitted job, optionally including results and error details.
   * @param jobId Job ID (required)
   * @param details Include details of execution, including job results or error information (optional, default to false)
   * @return InfrastructureascodeJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InfrastructureascodeJob> getInfrastructureascodeJobWithHttpInfo(String jobId, Boolean details) throws IOException {
    return getInfrastructureascodeJob(createGetInfrastructureascodeJobRequest(jobId, details).withHttpInfo());
  }

  private GetInfrastructureascodeJobRequest createGetInfrastructureascodeJobRequest(String jobId, Boolean details) {
    return GetInfrastructureascodeJobRequest.builder()
            .withJobId(jobId)

            .withDetails(details)

            .build();
  }

  /**
   * Get job status and results
   * Get the execution status of a submitted job, optionally including results and error details.
   * @param request The request object
   * @return InfrastructureascodeJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InfrastructureascodeJob getInfrastructureascodeJob(GetInfrastructureascodeJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InfrastructureascodeJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InfrastructureascodeJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get job status and results
   * Get the execution status of a submitted job, optionally including results and error details.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InfrastructureascodeJob> getInfrastructureascodeJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InfrastructureascodeJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)exception;
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
      ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get job history
   * Get a history of submitted jobs, optionally including error messages.
   * @param maxResults Number of jobs to show (optional, default to 1)
   * @param includeErrors Include error messages (optional, default to false)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return InfrastructureascodeJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InfrastructureascodeJob getInfrastructureascodeJobs(Integer maxResults, Boolean includeErrors, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getInfrastructureascodeJobs(createGetInfrastructureascodeJobsRequest(maxResults, includeErrors, sortBy, sortOrder));
  }

  /**
   * Get job history
   * Get a history of submitted jobs, optionally including error messages.
   * @param maxResults Number of jobs to show (optional, default to 1)
   * @param includeErrors Include error messages (optional, default to false)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return InfrastructureascodeJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InfrastructureascodeJob> getInfrastructureascodeJobsWithHttpInfo(Integer maxResults, Boolean includeErrors, String sortBy, String sortOrder) throws IOException {
    return getInfrastructureascodeJobs(createGetInfrastructureascodeJobsRequest(maxResults, includeErrors, sortBy, sortOrder).withHttpInfo());
  }

  private GetInfrastructureascodeJobsRequest createGetInfrastructureascodeJobsRequest(Integer maxResults, Boolean includeErrors, String sortBy, String sortOrder) {
    return GetInfrastructureascodeJobsRequest.builder()
            .withMaxResults(maxResults)

            .withIncludeErrors(includeErrors)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get job history
   * Get a history of submitted jobs, optionally including error messages.
   * @param request The request object
   * @return InfrastructureascodeJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InfrastructureascodeJob getInfrastructureascodeJobs(GetInfrastructureascodeJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InfrastructureascodeJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InfrastructureascodeJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get job history
   * Get a history of submitted jobs, optionally including error messages.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InfrastructureascodeJob> getInfrastructureascodeJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InfrastructureascodeJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)exception;
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
      ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Job
   * Create and submit a job for remote execution or see job planning results.
   * @param body  (required)
   * @return InfrastructureascodeJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InfrastructureascodeJob postInfrastructureascodeJobs(AcceleratorInput body) throws IOException, ApiException {
    return  postInfrastructureascodeJobs(createPostInfrastructureascodeJobsRequest(body));
  }

  /**
   * Create a Job
   * Create and submit a job for remote execution or see job planning results.
   * @param body  (required)
   * @return InfrastructureascodeJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InfrastructureascodeJob> postInfrastructureascodeJobsWithHttpInfo(AcceleratorInput body) throws IOException {
    return postInfrastructureascodeJobs(createPostInfrastructureascodeJobsRequest(body).withHttpInfo());
  }

  private PostInfrastructureascodeJobsRequest createPostInfrastructureascodeJobsRequest(AcceleratorInput body) {
    return PostInfrastructureascodeJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Job
   * Create and submit a job for remote execution or see job planning results.
   * @param request The request object
   * @return InfrastructureascodeJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InfrastructureascodeJob postInfrastructureascodeJobs(PostInfrastructureascodeJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InfrastructureascodeJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InfrastructureascodeJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Job
   * Create and submit a job for remote execution or see job planning results.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InfrastructureascodeJob> postInfrastructureascodeJobs(ApiRequest<AcceleratorInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InfrastructureascodeJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)exception;
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
      ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
