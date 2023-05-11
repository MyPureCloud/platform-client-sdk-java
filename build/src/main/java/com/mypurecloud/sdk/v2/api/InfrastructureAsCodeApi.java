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
import com.mypurecloud.sdk.v2.model.AcceleratorList;
import com.mypurecloud.sdk.v2.model.AcceleratorSpecification;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InfrastructureascodeJob;


import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeAcceleratorRequest;
import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeAcceleratorsRequest;
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
   * Get information about an accelerator
   * Get the complete metadata specification for an accelerator, including requirements and parameters.
   * @param acceleratorId Accelerator ID (required)
   * @param preferredLanguage Preferred Language (optional, default to en-US)
   * @return AcceleratorSpecification
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AcceleratorSpecification getInfrastructureascodeAccelerator(String acceleratorId, String preferredLanguage) throws IOException, ApiException {
    return  getInfrastructureascodeAccelerator(createGetInfrastructureascodeAcceleratorRequest(acceleratorId, preferredLanguage));
  }

  /**
   * Get information about an accelerator
   * Get the complete metadata specification for an accelerator, including requirements and parameters.
   * @param acceleratorId Accelerator ID (required)
   * @param preferredLanguage Preferred Language (optional, default to en-US)
   * @return AcceleratorSpecification
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AcceleratorSpecification> getInfrastructureascodeAcceleratorWithHttpInfo(String acceleratorId, String preferredLanguage) throws IOException {
    return getInfrastructureascodeAccelerator(createGetInfrastructureascodeAcceleratorRequest(acceleratorId, preferredLanguage).withHttpInfo());
  }

  private GetInfrastructureascodeAcceleratorRequest createGetInfrastructureascodeAcceleratorRequest(String acceleratorId, String preferredLanguage) {
    return GetInfrastructureascodeAcceleratorRequest.builder()
            .withAcceleratorId(acceleratorId)

            .withPreferredLanguage(preferredLanguage)

            .build();
  }

  /**
   * Get information about an accelerator
   * Get the complete metadata specification for an accelerator, including requirements and parameters.
   * @param request The request object
   * @return AcceleratorSpecification
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AcceleratorSpecification getInfrastructureascodeAccelerator(GetInfrastructureascodeAcceleratorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AcceleratorSpecification> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AcceleratorSpecification>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get information about an accelerator
   * Get the complete metadata specification for an accelerator, including requirements and parameters.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AcceleratorSpecification> getInfrastructureascodeAccelerator(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AcceleratorSpecification>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AcceleratorSpecification> response = (ApiResponse<AcceleratorSpecification>)(ApiResponse<?>)exception;
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
      ApiResponse<AcceleratorSpecification> response = (ApiResponse<AcceleratorSpecification>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of available accelerators
   * Search for accelerators that can be run.
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Filter by name (optional)
   * @param description Filter by description (optional)
   * @param origin Filter by origin (optional)
   * @param type Filter by type (optional)
   * @param classification Filter by classification (optional)
   * @param tags Filter by tags (optional)
   * @return AcceleratorList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AcceleratorList getInfrastructureascodeAccelerators(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String description, String origin, String type, String classification, String tags) throws IOException, ApiException {
    return  getInfrastructureascodeAccelerators(createGetInfrastructureascodeAcceleratorsRequest(pageSize, pageNumber, sortBy, sortOrder, name, description, origin, type, classification, tags));
  }

  /**
   * Get a list of available accelerators
   * Search for accelerators that can be run.
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Filter by name (optional)
   * @param description Filter by description (optional)
   * @param origin Filter by origin (optional)
   * @param type Filter by type (optional)
   * @param classification Filter by classification (optional)
   * @param tags Filter by tags (optional)
   * @return AcceleratorList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AcceleratorList> getInfrastructureascodeAcceleratorsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String description, String origin, String type, String classification, String tags) throws IOException {
    return getInfrastructureascodeAccelerators(createGetInfrastructureascodeAcceleratorsRequest(pageSize, pageNumber, sortBy, sortOrder, name, description, origin, type, classification, tags).withHttpInfo());
  }

  private GetInfrastructureascodeAcceleratorsRequest createGetInfrastructureascodeAcceleratorsRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String description, String origin, String type, String classification, String tags) {
    return GetInfrastructureascodeAcceleratorsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withDescription(description)

            .withOrigin(origin)

            .withType(type)

            .withClassification(classification)

            .withTags(tags)

            .build();
  }

  /**
   * Get a list of available accelerators
   * Search for accelerators that can be run.
   * @param request The request object
   * @return AcceleratorList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AcceleratorList getInfrastructureascodeAccelerators(GetInfrastructureascodeAcceleratorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AcceleratorList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AcceleratorList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of available accelerators
   * Search for accelerators that can be run.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AcceleratorList> getInfrastructureascodeAccelerators(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AcceleratorList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AcceleratorList> response = (ApiResponse<AcceleratorList>)(ApiResponse<?>)exception;
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
      ApiResponse<AcceleratorList> response = (ApiResponse<AcceleratorList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * @param sortBy Sort by (optional, default to dateSubmitted)
   * @param sortOrder Sort order (optional, default to desc)
   * @param acceleratorId Find only jobs associated with this accelerator (optional)
   * @param submittedBy Find only jobs submitted by this user (optional)
   * @param status Find only jobs in this state (optional)
   * @return InfrastructureascodeJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InfrastructureascodeJob getInfrastructureascodeJobs(Integer maxResults, Boolean includeErrors, String sortBy, String sortOrder, String acceleratorId, String submittedBy, String status) throws IOException, ApiException {
    return  getInfrastructureascodeJobs(createGetInfrastructureascodeJobsRequest(maxResults, includeErrors, sortBy, sortOrder, acceleratorId, submittedBy, status));
  }

  /**
   * Get job history
   * Get a history of submitted jobs, optionally including error messages.
   * @param maxResults Number of jobs to show (optional, default to 1)
   * @param includeErrors Include error messages (optional, default to false)
   * @param sortBy Sort by (optional, default to dateSubmitted)
   * @param sortOrder Sort order (optional, default to desc)
   * @param acceleratorId Find only jobs associated with this accelerator (optional)
   * @param submittedBy Find only jobs submitted by this user (optional)
   * @param status Find only jobs in this state (optional)
   * @return InfrastructureascodeJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InfrastructureascodeJob> getInfrastructureascodeJobsWithHttpInfo(Integer maxResults, Boolean includeErrors, String sortBy, String sortOrder, String acceleratorId, String submittedBy, String status) throws IOException {
    return getInfrastructureascodeJobs(createGetInfrastructureascodeJobsRequest(maxResults, includeErrors, sortBy, sortOrder, acceleratorId, submittedBy, status).withHttpInfo());
  }

  private GetInfrastructureascodeJobsRequest createGetInfrastructureascodeJobsRequest(Integer maxResults, Boolean includeErrors, String sortBy, String sortOrder, String acceleratorId, String submittedBy, String status) {
    return GetInfrastructureascodeJobsRequest.builder()
            .withMaxResults(maxResults)

            .withIncludeErrors(includeErrors)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withAcceleratorId(acceleratorId)

            .withSubmittedBy(submittedBy)

            .withStatus(status)

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
