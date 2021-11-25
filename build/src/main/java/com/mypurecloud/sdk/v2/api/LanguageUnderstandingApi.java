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
import com.mypurecloud.sdk.v2.model.NluDomain;
import com.mypurecloud.sdk.v2.model.NluFeedbackListing;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.NluFeedbackResponse;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import com.mypurecloud.sdk.v2.model.NluDomainVersionQualityReport;
import com.mypurecloud.sdk.v2.model.NluDomainVersionListing;
import com.mypurecloud.sdk.v2.model.NluDomainListing;
import com.mypurecloud.sdk.v2.model.Miner;
import com.mypurecloud.sdk.v2.model.Draft;
import com.mypurecloud.sdk.v2.model.DraftListing;
import com.mypurecloud.sdk.v2.model.MinerIntent;
import com.mypurecloud.sdk.v2.model.MinedIntentsListing;
import com.mypurecloud.sdk.v2.model.MinerListing;
import com.mypurecloud.sdk.v2.model.DraftRequest;
import com.mypurecloud.sdk.v2.model.NluFeedbackRequest;
import com.mypurecloud.sdk.v2.model.NluDetectionResponse;
import com.mypurecloud.sdk.v2.model.NluDetectionRequest;
import com.mypurecloud.sdk.v2.model.NluDomainVersionTrainingResponse;
import com.mypurecloud.sdk.v2.model.MinerExecuteRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteLanguageunderstandingDomainRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLanguageunderstandingDomainVersionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLanguageunderstandingMinerRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLanguageunderstandingMinerDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainFeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainFeedbackFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainVersionReportRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingMinerRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingMinerDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingMinerDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingMinerIntentRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingMinerIntentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingMinersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLanguageunderstandingDomainRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLanguageunderstandingMinerDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainFeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainVersionDetectRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainVersionPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainVersionTrainRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingMinerDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingMinerExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingMinersRequest;
import com.mypurecloud.sdk.v2.api.request.PutLanguageunderstandingDomainVersionRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LanguageUnderstandingApi {
  private final ApiClient pcapiClient;

  public LanguageUnderstandingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LanguageUnderstandingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an NLU Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingDomain(String domainId) throws IOException, ApiException {
     deleteLanguageunderstandingDomain(createDeleteLanguageunderstandingDomainRequest(domainId));
  }

  /**
   * Delete an NLU Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingDomainWithHttpInfo(String domainId) throws IOException {
    return deleteLanguageunderstandingDomain(createDeleteLanguageunderstandingDomainRequest(domainId).withHttpInfo());
  }

  private DeleteLanguageunderstandingDomainRequest createDeleteLanguageunderstandingDomainRequest(String domainId) {
    return DeleteLanguageunderstandingDomainRequest.builder()
            .withDomainId(domainId)
    
            .build();
  }

  /**
   * Delete an NLU Domain.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingDomain(DeleteLanguageunderstandingDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an NLU Domain.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingDomain(ApiRequest<Void> request) throws IOException {
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
   * Delete the feedback on the NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param feedbackId ID of the Feedback (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingDomainFeedbackFeedbackId(String domainId, String feedbackId) throws IOException, ApiException {
     deleteLanguageunderstandingDomainFeedbackFeedbackId(createDeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest(domainId, feedbackId));
  }

  /**
   * Delete the feedback on the NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param feedbackId ID of the Feedback (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingDomainFeedbackFeedbackIdWithHttpInfo(String domainId, String feedbackId) throws IOException {
    return deleteLanguageunderstandingDomainFeedbackFeedbackId(createDeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest(domainId, feedbackId).withHttpInfo());
  }

  private DeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest createDeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest(String domainId, String feedbackId) {
    return DeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest.builder()
            .withDomainId(domainId)
    
            .withFeedbackId(feedbackId)
    
            .build();
  }

  /**
   * Delete the feedback on the NLU Domain Version.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingDomainFeedbackFeedbackId(DeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the feedback on the NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingDomainFeedbackFeedbackId(ApiRequest<Void> request) throws IOException {
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
   * Delete an NLU Domain Version
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingDomainVersion(String domainId, String domainVersionId) throws IOException, ApiException {
     deleteLanguageunderstandingDomainVersion(createDeleteLanguageunderstandingDomainVersionRequest(domainId, domainVersionId));
  }

  /**
   * Delete an NLU Domain Version
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingDomainVersionWithHttpInfo(String domainId, String domainVersionId) throws IOException {
    return deleteLanguageunderstandingDomainVersion(createDeleteLanguageunderstandingDomainVersionRequest(domainId, domainVersionId).withHttpInfo());
  }

  private DeleteLanguageunderstandingDomainVersionRequest createDeleteLanguageunderstandingDomainVersionRequest(String domainId, String domainVersionId) {
    return DeleteLanguageunderstandingDomainVersionRequest.builder()
            .withDomainId(domainId)
    
            .withDomainVersionId(domainVersionId)
    
            .build();
  }

  /**
   * Delete an NLU Domain Version
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingDomainVersion(DeleteLanguageunderstandingDomainVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an NLU Domain Version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingDomainVersion(ApiRequest<Void> request) throws IOException {
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
   * Delete a miner.
   * 
   * @param minerId Miner ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingMiner(String minerId) throws IOException, ApiException {
     deleteLanguageunderstandingMiner(createDeleteLanguageunderstandingMinerRequest(minerId));
  }

  /**
   * Delete a miner.
   * 
   * @param minerId Miner ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingMinerWithHttpInfo(String minerId) throws IOException {
    return deleteLanguageunderstandingMiner(createDeleteLanguageunderstandingMinerRequest(minerId).withHttpInfo());
  }

  private DeleteLanguageunderstandingMinerRequest createDeleteLanguageunderstandingMinerRequest(String minerId) {
    return DeleteLanguageunderstandingMinerRequest.builder()
            .withMinerId(minerId)
    
            .build();
  }

  /**
   * Delete a miner.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingMiner(DeleteLanguageunderstandingMinerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a miner.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingMiner(ApiRequest<Void> request) throws IOException {
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
   * Delete a draft
   * 
   * @param minerId Miner ID (required)
   * @param draftId Draft ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingMinerDraft(String minerId, String draftId) throws IOException, ApiException {
     deleteLanguageunderstandingMinerDraft(createDeleteLanguageunderstandingMinerDraftRequest(minerId, draftId));
  }

  /**
   * Delete a draft
   * 
   * @param minerId Miner ID (required)
   * @param draftId Draft ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingMinerDraftWithHttpInfo(String minerId, String draftId) throws IOException {
    return deleteLanguageunderstandingMinerDraft(createDeleteLanguageunderstandingMinerDraftRequest(minerId, draftId).withHttpInfo());
  }

  private DeleteLanguageunderstandingMinerDraftRequest createDeleteLanguageunderstandingMinerDraftRequest(String minerId, String draftId) {
    return DeleteLanguageunderstandingMinerDraftRequest.builder()
            .withMinerId(minerId)
    
            .withDraftId(draftId)
    
            .build();
  }

  /**
   * Delete a draft
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteLanguageunderstandingMinerDraft(DeleteLanguageunderstandingMinerDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteLanguageunderstandingMinerDraft(ApiRequest<Void> request) throws IOException {
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
   * Find an NLU Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @return NluDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomain getLanguageunderstandingDomain(String domainId) throws IOException, ApiException {
    return  getLanguageunderstandingDomain(createGetLanguageunderstandingDomainRequest(domainId));
  }

  /**
   * Find an NLU Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @return NluDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomain> getLanguageunderstandingDomainWithHttpInfo(String domainId) throws IOException {
    return getLanguageunderstandingDomain(createGetLanguageunderstandingDomainRequest(domainId).withHttpInfo());
  }

  private GetLanguageunderstandingDomainRequest createGetLanguageunderstandingDomainRequest(String domainId) {
    return GetLanguageunderstandingDomainRequest.builder()
            .withDomainId(domainId)
    
            .build();
  }

  /**
   * Find an NLU Domain.
   * 
   * @param request The request object
   * @return NluDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomain getLanguageunderstandingDomain(GetLanguageunderstandingDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Find an NLU Domain.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomain> getLanguageunderstandingDomain(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all feedback in the given NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param intentName The top intent name to retrieve feedback for. (optional)
   * @param assessment The top assessment to retrieve feedback for. (optional)
   * @param dateStart Begin of time window as ISO-8601 date. (optional)
   * @param dateEnd End of time window as ISO-8601 date. (optional)
   * @param includeDeleted Whether to include soft-deleted items in the result. (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param enableCursorPagination Enable Cursor Pagination (optional, default to false)
   * @param after The cursor that points to the end of the set of entities that has been returned. This is considered only when enableCursorPagination=true (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return NluFeedbackListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluFeedbackListing getLanguageunderstandingDomainFeedback(String domainId, String intentName, String assessment, LocalDate dateStart, LocalDate dateEnd, Boolean includeDeleted, Integer pageNumber, Integer pageSize, Boolean enableCursorPagination, String after, List<String> fields) throws IOException, ApiException {
    return  getLanguageunderstandingDomainFeedback(createGetLanguageunderstandingDomainFeedbackRequest(domainId, intentName, assessment, dateStart, dateEnd, includeDeleted, pageNumber, pageSize, enableCursorPagination, after, fields));
  }

  /**
   * Get all feedback in the given NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param intentName The top intent name to retrieve feedback for. (optional)
   * @param assessment The top assessment to retrieve feedback for. (optional)
   * @param dateStart Begin of time window as ISO-8601 date. (optional)
   * @param dateEnd End of time window as ISO-8601 date. (optional)
   * @param includeDeleted Whether to include soft-deleted items in the result. (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param enableCursorPagination Enable Cursor Pagination (optional, default to false)
   * @param after The cursor that points to the end of the set of entities that has been returned. This is considered only when enableCursorPagination=true (optional)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return NluFeedbackListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluFeedbackListing> getLanguageunderstandingDomainFeedbackWithHttpInfo(String domainId, String intentName, String assessment, LocalDate dateStart, LocalDate dateEnd, Boolean includeDeleted, Integer pageNumber, Integer pageSize, Boolean enableCursorPagination, String after, List<String> fields) throws IOException {
    return getLanguageunderstandingDomainFeedback(createGetLanguageunderstandingDomainFeedbackRequest(domainId, intentName, assessment, dateStart, dateEnd, includeDeleted, pageNumber, pageSize, enableCursorPagination, after, fields).withHttpInfo());
  }

  private GetLanguageunderstandingDomainFeedbackRequest createGetLanguageunderstandingDomainFeedbackRequest(String domainId, String intentName, String assessment, LocalDate dateStart, LocalDate dateEnd, Boolean includeDeleted, Integer pageNumber, Integer pageSize, Boolean enableCursorPagination, String after, List<String> fields) {
    return GetLanguageunderstandingDomainFeedbackRequest.builder()
            .withDomainId(domainId)
    
            .withIntentName(intentName)
    
            .withAssessment(assessment)
    
            .withDateStart(dateStart)
    
            .withDateEnd(dateEnd)
    
            .withIncludeDeleted(includeDeleted)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withEnableCursorPagination(enableCursorPagination)
    
            .withAfter(after)
    
            .withFields(fields)
    
            .build();
  }

  /**
   * Get all feedback in the given NLU Domain Version.
   * 
   * @param request The request object
   * @return NluFeedbackListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluFeedbackListing getLanguageunderstandingDomainFeedback(GetLanguageunderstandingDomainFeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluFeedbackListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluFeedbackListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all feedback in the given NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluFeedbackListing> getLanguageunderstandingDomainFeedback(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluFeedbackListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluFeedbackListing> response = (ApiResponse<NluFeedbackListing>)(ApiResponse<?>)exception;
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
      ApiResponse<NluFeedbackListing> response = (ApiResponse<NluFeedbackListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Find a Feedback
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param feedbackId ID of the Feedback (required)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return NluFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluFeedbackResponse getLanguageunderstandingDomainFeedbackFeedbackId(String domainId, String feedbackId, List<String> fields) throws IOException, ApiException {
    return  getLanguageunderstandingDomainFeedbackFeedbackId(createGetLanguageunderstandingDomainFeedbackFeedbackIdRequest(domainId, feedbackId, fields));
  }

  /**
   * Find a Feedback
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param feedbackId ID of the Feedback (required)
   * @param fields Fields and properties to get, comma-separated (optional)
   * @return NluFeedbackResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluFeedbackResponse> getLanguageunderstandingDomainFeedbackFeedbackIdWithHttpInfo(String domainId, String feedbackId, List<String> fields) throws IOException {
    return getLanguageunderstandingDomainFeedbackFeedbackId(createGetLanguageunderstandingDomainFeedbackFeedbackIdRequest(domainId, feedbackId, fields).withHttpInfo());
  }

  private GetLanguageunderstandingDomainFeedbackFeedbackIdRequest createGetLanguageunderstandingDomainFeedbackFeedbackIdRequest(String domainId, String feedbackId, List<String> fields) {
    return GetLanguageunderstandingDomainFeedbackFeedbackIdRequest.builder()
            .withDomainId(domainId)
    
            .withFeedbackId(feedbackId)
    
            .withFields(fields)
    
            .build();
  }

  /**
   * Find a Feedback
   * 
   * @param request The request object
   * @return NluFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluFeedbackResponse getLanguageunderstandingDomainFeedbackFeedbackId(GetLanguageunderstandingDomainFeedbackFeedbackIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluFeedbackResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluFeedbackResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Find a Feedback
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluFeedbackResponse> getLanguageunderstandingDomainFeedbackFeedbackId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluFeedbackResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Find an NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @param includeUtterances Whether utterances for intent definition should be included when marshalling response. (optional)
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion getLanguageunderstandingDomainVersion(String domainId, String domainVersionId, Boolean includeUtterances) throws IOException, ApiException {
    return  getLanguageunderstandingDomainVersion(createGetLanguageunderstandingDomainVersionRequest(domainId, domainVersionId, includeUtterances));
  }

  /**
   * Find an NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @param includeUtterances Whether utterances for intent definition should be included when marshalling response. (optional)
   * @return NluDomainVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> getLanguageunderstandingDomainVersionWithHttpInfo(String domainId, String domainVersionId, Boolean includeUtterances) throws IOException {
    return getLanguageunderstandingDomainVersion(createGetLanguageunderstandingDomainVersionRequest(domainId, domainVersionId, includeUtterances).withHttpInfo());
  }

  private GetLanguageunderstandingDomainVersionRequest createGetLanguageunderstandingDomainVersionRequest(String domainId, String domainVersionId, Boolean includeUtterances) {
    return GetLanguageunderstandingDomainVersionRequest.builder()
            .withDomainId(domainId)
    
            .withDomainVersionId(domainVersionId)
    
            .withIncludeUtterances(includeUtterances)
    
            .build();
  }

  /**
   * Find an NLU Domain Version.
   * 
   * @param request The request object
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion getLanguageunderstandingDomainVersion(GetLanguageunderstandingDomainVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Find an NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> getLanguageunderstandingDomainVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieved quality report for the specified NLU Domain Version
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @return NluDomainVersionQualityReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersionQualityReport getLanguageunderstandingDomainVersionReport(String domainId, String domainVersionId) throws IOException, ApiException {
    return  getLanguageunderstandingDomainVersionReport(createGetLanguageunderstandingDomainVersionReportRequest(domainId, domainVersionId));
  }

  /**
   * Retrieved quality report for the specified NLU Domain Version
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @return NluDomainVersionQualityReport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersionQualityReport> getLanguageunderstandingDomainVersionReportWithHttpInfo(String domainId, String domainVersionId) throws IOException {
    return getLanguageunderstandingDomainVersionReport(createGetLanguageunderstandingDomainVersionReportRequest(domainId, domainVersionId).withHttpInfo());
  }

  private GetLanguageunderstandingDomainVersionReportRequest createGetLanguageunderstandingDomainVersionReportRequest(String domainId, String domainVersionId) {
    return GetLanguageunderstandingDomainVersionReportRequest.builder()
            .withDomainId(domainId)
    
            .withDomainVersionId(domainVersionId)
    
            .build();
  }

  /**
   * Retrieved quality report for the specified NLU Domain Version
   * 
   * @param request The request object
   * @return NluDomainVersionQualityReport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersionQualityReport getLanguageunderstandingDomainVersionReport(GetLanguageunderstandingDomainVersionReportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainVersionQualityReport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainVersionQualityReport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieved quality report for the specified NLU Domain Version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersionQualityReport> getLanguageunderstandingDomainVersionReport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainVersionQualityReport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainVersionQualityReport> response = (ApiResponse<NluDomainVersionQualityReport>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainVersionQualityReport> response = (ApiResponse<NluDomainVersionQualityReport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all NLU Domain Versions for a given Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param includeUtterances Whether utterances for intent definition should be included when marshalling response. (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return NluDomainVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersionListing getLanguageunderstandingDomainVersions(String domainId, Boolean includeUtterances, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getLanguageunderstandingDomainVersions(createGetLanguageunderstandingDomainVersionsRequest(domainId, includeUtterances, pageNumber, pageSize));
  }

  /**
   * Get all NLU Domain Versions for a given Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param includeUtterances Whether utterances for intent definition should be included when marshalling response. (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return NluDomainVersionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersionListing> getLanguageunderstandingDomainVersionsWithHttpInfo(String domainId, Boolean includeUtterances, Integer pageNumber, Integer pageSize) throws IOException {
    return getLanguageunderstandingDomainVersions(createGetLanguageunderstandingDomainVersionsRequest(domainId, includeUtterances, pageNumber, pageSize).withHttpInfo());
  }

  private GetLanguageunderstandingDomainVersionsRequest createGetLanguageunderstandingDomainVersionsRequest(String domainId, Boolean includeUtterances, Integer pageNumber, Integer pageSize) {
    return GetLanguageunderstandingDomainVersionsRequest.builder()
            .withDomainId(domainId)
    
            .withIncludeUtterances(includeUtterances)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get all NLU Domain Versions for a given Domain.
   * 
   * @param request The request object
   * @return NluDomainVersionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersionListing getLanguageunderstandingDomainVersions(GetLanguageunderstandingDomainVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainVersionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainVersionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all NLU Domain Versions for a given Domain.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersionListing> getLanguageunderstandingDomainVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainVersionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainVersionListing> response = (ApiResponse<NluDomainVersionListing>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainVersionListing> response = (ApiResponse<NluDomainVersionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all NLU Domains.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return NluDomainListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainListing getLanguageunderstandingDomains(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getLanguageunderstandingDomains(createGetLanguageunderstandingDomainsRequest(pageNumber, pageSize));
  }

  /**
   * Get all NLU Domains.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return NluDomainListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainListing> getLanguageunderstandingDomainsWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getLanguageunderstandingDomains(createGetLanguageunderstandingDomainsRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetLanguageunderstandingDomainsRequest createGetLanguageunderstandingDomainsRequest(Integer pageNumber, Integer pageSize) {
    return GetLanguageunderstandingDomainsRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get all NLU Domains.
   * 
   * @param request The request object
   * @return NluDomainListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainListing getLanguageunderstandingDomains(GetLanguageunderstandingDomainsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all NLU Domains.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainListing> getLanguageunderstandingDomains(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainListing> response = (ApiResponse<NluDomainListing>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainListing> response = (ApiResponse<NluDomainListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get information about a miner.
   * 
   * @param minerId Miner ID (required)
   * @return Miner
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Miner getLanguageunderstandingMiner(String minerId) throws IOException, ApiException {
    return  getLanguageunderstandingMiner(createGetLanguageunderstandingMinerRequest(minerId));
  }

  /**
   * Get information about a miner.
   * 
   * @param minerId Miner ID (required)
   * @return Miner
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Miner> getLanguageunderstandingMinerWithHttpInfo(String minerId) throws IOException {
    return getLanguageunderstandingMiner(createGetLanguageunderstandingMinerRequest(minerId).withHttpInfo());
  }

  private GetLanguageunderstandingMinerRequest createGetLanguageunderstandingMinerRequest(String minerId) {
    return GetLanguageunderstandingMinerRequest.builder()
            .withMinerId(minerId)
    
            .build();
  }

  /**
   * Get information about a miner.
   * 
   * @param request The request object
   * @return Miner
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Miner getLanguageunderstandingMiner(GetLanguageunderstandingMinerRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Miner> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Miner>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get information about a miner.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Miner> getLanguageunderstandingMiner(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Miner>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Miner> response = (ApiResponse<Miner>)(ApiResponse<?>)exception;
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
      ApiResponse<Miner> response = (ApiResponse<Miner>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get information about a draft.
   * 
   * @param minerId Miner ID (required)
   * @param draftId Draft ID (required)
   * @return Draft
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Draft getLanguageunderstandingMinerDraft(String minerId, String draftId) throws IOException, ApiException {
    return  getLanguageunderstandingMinerDraft(createGetLanguageunderstandingMinerDraftRequest(minerId, draftId));
  }

  /**
   * Get information about a draft.
   * 
   * @param minerId Miner ID (required)
   * @param draftId Draft ID (required)
   * @return Draft
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Draft> getLanguageunderstandingMinerDraftWithHttpInfo(String minerId, String draftId) throws IOException {
    return getLanguageunderstandingMinerDraft(createGetLanguageunderstandingMinerDraftRequest(minerId, draftId).withHttpInfo());
  }

  private GetLanguageunderstandingMinerDraftRequest createGetLanguageunderstandingMinerDraftRequest(String minerId, String draftId) {
    return GetLanguageunderstandingMinerDraftRequest.builder()
            .withMinerId(minerId)
    
            .withDraftId(draftId)
    
            .build();
  }

  /**
   * Get information about a draft.
   * 
   * @param request The request object
   * @return Draft
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Draft getLanguageunderstandingMinerDraft(GetLanguageunderstandingMinerDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Draft> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Draft>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get information about a draft.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Draft> getLanguageunderstandingMinerDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Draft>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Draft> response = (ApiResponse<Draft>)(ApiResponse<?>)exception;
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
      ApiResponse<Draft> response = (ApiResponse<Draft>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve the list of drafts created.
   * 
   * @param minerId Miner ID (required)
   * @return DraftListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DraftListing getLanguageunderstandingMinerDrafts(String minerId) throws IOException, ApiException {
    return  getLanguageunderstandingMinerDrafts(createGetLanguageunderstandingMinerDraftsRequest(minerId));
  }

  /**
   * Retrieve the list of drafts created.
   * 
   * @param minerId Miner ID (required)
   * @return DraftListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DraftListing> getLanguageunderstandingMinerDraftsWithHttpInfo(String minerId) throws IOException {
    return getLanguageunderstandingMinerDrafts(createGetLanguageunderstandingMinerDraftsRequest(minerId).withHttpInfo());
  }

  private GetLanguageunderstandingMinerDraftsRequest createGetLanguageunderstandingMinerDraftsRequest(String minerId) {
    return GetLanguageunderstandingMinerDraftsRequest.builder()
            .withMinerId(minerId)
    
            .build();
  }

  /**
   * Retrieve the list of drafts created.
   * 
   * @param request The request object
   * @return DraftListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DraftListing getLanguageunderstandingMinerDrafts(GetLanguageunderstandingMinerDraftsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DraftListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DraftListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the list of drafts created.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DraftListing> getLanguageunderstandingMinerDrafts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DraftListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DraftListing> response = (ApiResponse<DraftListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DraftListing> response = (ApiResponse<DraftListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get information about a mined intent
   * 
   * @param minerId Miner ID (required)
   * @param intentId The ID of the intent to be retrieved. (required)
   * @param expand Option to fetch utterances (optional)
   * @return MinerIntent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MinerIntent getLanguageunderstandingMinerIntent(String minerId, String intentId, String expand) throws IOException, ApiException {
    return  getLanguageunderstandingMinerIntent(createGetLanguageunderstandingMinerIntentRequest(minerId, intentId, expand));
  }

  /**
   * Get information about a mined intent
   * 
   * @param minerId Miner ID (required)
   * @param intentId The ID of the intent to be retrieved. (required)
   * @param expand Option to fetch utterances (optional)
   * @return MinerIntent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MinerIntent> getLanguageunderstandingMinerIntentWithHttpInfo(String minerId, String intentId, String expand) throws IOException {
    return getLanguageunderstandingMinerIntent(createGetLanguageunderstandingMinerIntentRequest(minerId, intentId, expand).withHttpInfo());
  }

  private GetLanguageunderstandingMinerIntentRequest createGetLanguageunderstandingMinerIntentRequest(String minerId, String intentId, String expand) {
    return GetLanguageunderstandingMinerIntentRequest.builder()
            .withMinerId(minerId)
    
            .withIntentId(intentId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get information about a mined intent
   * 
   * @param request The request object
   * @return MinerIntent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MinerIntent getLanguageunderstandingMinerIntent(GetLanguageunderstandingMinerIntentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MinerIntent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MinerIntent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get information about a mined intent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MinerIntent> getLanguageunderstandingMinerIntent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MinerIntent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MinerIntent> response = (ApiResponse<MinerIntent>)(ApiResponse<?>)exception;
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
      ApiResponse<MinerIntent> response = (ApiResponse<MinerIntent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a list of mined intents.
   * 
   * @param minerId Miner ID (required)
   * @param expand Option to fetch utterances. (optional)
   * @return MinedIntentsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MinedIntentsListing getLanguageunderstandingMinerIntents(String minerId, String expand) throws IOException, ApiException {
    return  getLanguageunderstandingMinerIntents(createGetLanguageunderstandingMinerIntentsRequest(minerId, expand));
  }

  /**
   * Retrieve a list of mined intents.
   * 
   * @param minerId Miner ID (required)
   * @param expand Option to fetch utterances. (optional)
   * @return MinedIntentsListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MinedIntentsListing> getLanguageunderstandingMinerIntentsWithHttpInfo(String minerId, String expand) throws IOException {
    return getLanguageunderstandingMinerIntents(createGetLanguageunderstandingMinerIntentsRequest(minerId, expand).withHttpInfo());
  }

  private GetLanguageunderstandingMinerIntentsRequest createGetLanguageunderstandingMinerIntentsRequest(String minerId, String expand) {
    return GetLanguageunderstandingMinerIntentsRequest.builder()
            .withMinerId(minerId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Retrieve a list of mined intents.
   * 
   * @param request The request object
   * @return MinedIntentsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MinedIntentsListing getLanguageunderstandingMinerIntents(GetLanguageunderstandingMinerIntentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MinedIntentsListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MinedIntentsListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of mined intents.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MinedIntentsListing> getLanguageunderstandingMinerIntents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MinedIntentsListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MinedIntentsListing> response = (ApiResponse<MinedIntentsListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MinedIntentsListing> response = (ApiResponse<MinedIntentsListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve the list of miners created.
   * 
   * @return MinerListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MinerListing getLanguageunderstandingMiners() throws IOException, ApiException {
    return  getLanguageunderstandingMiners(createGetLanguageunderstandingMinersRequest());
  }

  /**
   * Retrieve the list of miners created.
   * 
   * @return MinerListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MinerListing> getLanguageunderstandingMinersWithHttpInfo() throws IOException {
    return getLanguageunderstandingMiners(createGetLanguageunderstandingMinersRequest().withHttpInfo());
  }

  private GetLanguageunderstandingMinersRequest createGetLanguageunderstandingMinersRequest() {
    return GetLanguageunderstandingMinersRequest.builder()
            .build();
  }

  /**
   * Retrieve the list of miners created.
   * 
   * @param request The request object
   * @return MinerListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MinerListing getLanguageunderstandingMiners(GetLanguageunderstandingMinersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MinerListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MinerListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the list of miners created.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MinerListing> getLanguageunderstandingMiners(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MinerListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MinerListing> response = (ApiResponse<MinerListing>)(ApiResponse<?>)exception;
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
      ApiResponse<MinerListing> response = (ApiResponse<MinerListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an NLU Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param body The updated NLU Domain. (required)
   * @return NluDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomain patchLanguageunderstandingDomain(String domainId, NluDomain body) throws IOException, ApiException {
    return  patchLanguageunderstandingDomain(createPatchLanguageunderstandingDomainRequest(domainId, body));
  }

  /**
   * Update an NLU Domain.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param body The updated NLU Domain. (required)
   * @return NluDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomain> patchLanguageunderstandingDomainWithHttpInfo(String domainId, NluDomain body) throws IOException {
    return patchLanguageunderstandingDomain(createPatchLanguageunderstandingDomainRequest(domainId, body).withHttpInfo());
  }

  private PatchLanguageunderstandingDomainRequest createPatchLanguageunderstandingDomainRequest(String domainId, NluDomain body) {
    return PatchLanguageunderstandingDomainRequest.builder()
            .withDomainId(domainId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an NLU Domain.
   * 
   * @param request The request object
   * @return NluDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomain patchLanguageunderstandingDomain(PatchLanguageunderstandingDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an NLU Domain.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomain> patchLanguageunderstandingDomain(ApiRequest<NluDomain> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Save information for the draft. Either topic draft or intent draft should be sent.
   * 
   * @param minerId Miner ID (required)
   * @param draftId Draft ID (required)
   * @param body  (optional)
   * @return Draft
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Draft patchLanguageunderstandingMinerDraft(String minerId, String draftId, DraftRequest body) throws IOException, ApiException {
    return  patchLanguageunderstandingMinerDraft(createPatchLanguageunderstandingMinerDraftRequest(minerId, draftId, body));
  }

  /**
   * Save information for the draft. Either topic draft or intent draft should be sent.
   * 
   * @param minerId Miner ID (required)
   * @param draftId Draft ID (required)
   * @param body  (optional)
   * @return Draft
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Draft> patchLanguageunderstandingMinerDraftWithHttpInfo(String minerId, String draftId, DraftRequest body) throws IOException {
    return patchLanguageunderstandingMinerDraft(createPatchLanguageunderstandingMinerDraftRequest(minerId, draftId, body).withHttpInfo());
  }

  private PatchLanguageunderstandingMinerDraftRequest createPatchLanguageunderstandingMinerDraftRequest(String minerId, String draftId, DraftRequest body) {
    return PatchLanguageunderstandingMinerDraftRequest.builder()
            .withMinerId(minerId)
    
            .withDraftId(draftId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Save information for the draft. Either topic draft or intent draft should be sent.
   * 
   * @param request The request object
   * @return Draft
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Draft patchLanguageunderstandingMinerDraft(PatchLanguageunderstandingMinerDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Draft> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Draft>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Save information for the draft. Either topic draft or intent draft should be sent.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Draft> patchLanguageunderstandingMinerDraft(ApiRequest<DraftRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Draft>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Draft> response = (ApiResponse<Draft>)(ApiResponse<?>)exception;
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
      ApiResponse<Draft> response = (ApiResponse<Draft>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create feedback for the NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param body The Feedback to create. (required)
   * @return NluFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluFeedbackResponse postLanguageunderstandingDomainFeedback(String domainId, NluFeedbackRequest body) throws IOException, ApiException {
    return  postLanguageunderstandingDomainFeedback(createPostLanguageunderstandingDomainFeedbackRequest(domainId, body));
  }

  /**
   * Create feedback for the NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param body The Feedback to create. (required)
   * @return NluFeedbackResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluFeedbackResponse> postLanguageunderstandingDomainFeedbackWithHttpInfo(String domainId, NluFeedbackRequest body) throws IOException {
    return postLanguageunderstandingDomainFeedback(createPostLanguageunderstandingDomainFeedbackRequest(domainId, body).withHttpInfo());
  }

  private PostLanguageunderstandingDomainFeedbackRequest createPostLanguageunderstandingDomainFeedbackRequest(String domainId, NluFeedbackRequest body) {
    return PostLanguageunderstandingDomainFeedbackRequest.builder()
            .withDomainId(domainId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create feedback for the NLU Domain Version.
   * 
   * @param request The request object
   * @return NluFeedbackResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluFeedbackResponse postLanguageunderstandingDomainFeedback(PostLanguageunderstandingDomainFeedbackRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluFeedbackResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluFeedbackResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create feedback for the NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluFeedbackResponse> postLanguageunderstandingDomainFeedback(ApiRequest<NluFeedbackRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluFeedbackResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Detect intent, entities, etc. in the submitted text using the specified NLU domain version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @param body The input data to perform detection on. (required)
   * @return NluDetectionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDetectionResponse postLanguageunderstandingDomainVersionDetect(String domainId, String domainVersionId, NluDetectionRequest body) throws IOException, ApiException {
    return  postLanguageunderstandingDomainVersionDetect(createPostLanguageunderstandingDomainVersionDetectRequest(domainId, domainVersionId, body));
  }

  /**
   * Detect intent, entities, etc. in the submitted text using the specified NLU domain version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @param body The input data to perform detection on. (required)
   * @return NluDetectionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDetectionResponse> postLanguageunderstandingDomainVersionDetectWithHttpInfo(String domainId, String domainVersionId, NluDetectionRequest body) throws IOException {
    return postLanguageunderstandingDomainVersionDetect(createPostLanguageunderstandingDomainVersionDetectRequest(domainId, domainVersionId, body).withHttpInfo());
  }

  private PostLanguageunderstandingDomainVersionDetectRequest createPostLanguageunderstandingDomainVersionDetectRequest(String domainId, String domainVersionId, NluDetectionRequest body) {
    return PostLanguageunderstandingDomainVersionDetectRequest.builder()
            .withDomainId(domainId)
    
            .withDomainVersionId(domainVersionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Detect intent, entities, etc. in the submitted text using the specified NLU domain version.
   * 
   * @param request The request object
   * @return NluDetectionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDetectionResponse postLanguageunderstandingDomainVersionDetect(PostLanguageunderstandingDomainVersionDetectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDetectionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDetectionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Detect intent, entities, etc. in the submitted text using the specified NLU domain version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDetectionResponse> postLanguageunderstandingDomainVersionDetect(ApiRequest<NluDetectionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDetectionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDetectionResponse> response = (ApiResponse<NluDetectionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDetectionResponse> response = (ApiResponse<NluDetectionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Publish the draft NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion postLanguageunderstandingDomainVersionPublish(String domainId, String domainVersionId) throws IOException, ApiException {
    return  postLanguageunderstandingDomainVersionPublish(createPostLanguageunderstandingDomainVersionPublishRequest(domainId, domainVersionId));
  }

  /**
   * Publish the draft NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @return NluDomainVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> postLanguageunderstandingDomainVersionPublishWithHttpInfo(String domainId, String domainVersionId) throws IOException {
    return postLanguageunderstandingDomainVersionPublish(createPostLanguageunderstandingDomainVersionPublishRequest(domainId, domainVersionId).withHttpInfo());
  }

  private PostLanguageunderstandingDomainVersionPublishRequest createPostLanguageunderstandingDomainVersionPublishRequest(String domainId, String domainVersionId) {
    return PostLanguageunderstandingDomainVersionPublishRequest.builder()
            .withDomainId(domainId)
    
            .withDomainVersionId(domainVersionId)
    
            .build();
  }

  /**
   * Publish the draft NLU Domain Version.
   * 
   * @param request The request object
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion postLanguageunderstandingDomainVersionPublish(PostLanguageunderstandingDomainVersionPublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish the draft NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> postLanguageunderstandingDomainVersionPublish(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Train the draft NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @return NluDomainVersionTrainingResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersionTrainingResponse postLanguageunderstandingDomainVersionTrain(String domainId, String domainVersionId) throws IOException, ApiException {
    return  postLanguageunderstandingDomainVersionTrain(createPostLanguageunderstandingDomainVersionTrainRequest(domainId, domainVersionId));
  }

  /**
   * Train the draft NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @return NluDomainVersionTrainingResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersionTrainingResponse> postLanguageunderstandingDomainVersionTrainWithHttpInfo(String domainId, String domainVersionId) throws IOException {
    return postLanguageunderstandingDomainVersionTrain(createPostLanguageunderstandingDomainVersionTrainRequest(domainId, domainVersionId).withHttpInfo());
  }

  private PostLanguageunderstandingDomainVersionTrainRequest createPostLanguageunderstandingDomainVersionTrainRequest(String domainId, String domainVersionId) {
    return PostLanguageunderstandingDomainVersionTrainRequest.builder()
            .withDomainId(domainId)
    
            .withDomainVersionId(domainVersionId)
    
            .build();
  }

  /**
   * Train the draft NLU Domain Version.
   * 
   * @param request The request object
   * @return NluDomainVersionTrainingResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersionTrainingResponse postLanguageunderstandingDomainVersionTrain(PostLanguageunderstandingDomainVersionTrainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainVersionTrainingResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainVersionTrainingResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Train the draft NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersionTrainingResponse> postLanguageunderstandingDomainVersionTrain(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainVersionTrainingResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainVersionTrainingResponse> response = (ApiResponse<NluDomainVersionTrainingResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainVersionTrainingResponse> response = (ApiResponse<NluDomainVersionTrainingResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param body The NLU Domain Version to create. (required)
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion postLanguageunderstandingDomainVersions(String domainId, NluDomainVersion body) throws IOException, ApiException {
    return  postLanguageunderstandingDomainVersions(createPostLanguageunderstandingDomainVersionsRequest(domainId, body));
  }

  /**
   * Create an NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param body The NLU Domain Version to create. (required)
   * @return NluDomainVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> postLanguageunderstandingDomainVersionsWithHttpInfo(String domainId, NluDomainVersion body) throws IOException {
    return postLanguageunderstandingDomainVersions(createPostLanguageunderstandingDomainVersionsRequest(domainId, body).withHttpInfo());
  }

  private PostLanguageunderstandingDomainVersionsRequest createPostLanguageunderstandingDomainVersionsRequest(String domainId, NluDomainVersion body) {
    return PostLanguageunderstandingDomainVersionsRequest.builder()
            .withDomainId(domainId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create an NLU Domain Version.
   * 
   * @param request The request object
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion postLanguageunderstandingDomainVersions(PostLanguageunderstandingDomainVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> postLanguageunderstandingDomainVersions(ApiRequest<NluDomainVersion> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an NLU Domain.
   * 
   * @param body The NLU Domain to create. (required)
   * @return NluDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomain postLanguageunderstandingDomains(NluDomain body) throws IOException, ApiException {
    return  postLanguageunderstandingDomains(createPostLanguageunderstandingDomainsRequest(body));
  }

  /**
   * Create an NLU Domain.
   * 
   * @param body The NLU Domain to create. (required)
   * @return NluDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomain> postLanguageunderstandingDomainsWithHttpInfo(NluDomain body) throws IOException {
    return postLanguageunderstandingDomains(createPostLanguageunderstandingDomainsRequest(body).withHttpInfo());
  }

  private PostLanguageunderstandingDomainsRequest createPostLanguageunderstandingDomainsRequest(NluDomain body) {
    return PostLanguageunderstandingDomainsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an NLU Domain.
   * 
   * @param request The request object
   * @return NluDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomain postLanguageunderstandingDomains(PostLanguageunderstandingDomainsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an NLU Domain.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomain> postLanguageunderstandingDomains(ApiRequest<NluDomain> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new draft resource.
   * 
   * @param minerId Miner ID (required)
   * @param body Details for creating draft resource (required)
   * @return Draft
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Draft postLanguageunderstandingMinerDrafts(String minerId, Draft body) throws IOException, ApiException {
    return  postLanguageunderstandingMinerDrafts(createPostLanguageunderstandingMinerDraftsRequest(minerId, body));
  }

  /**
   * Create a new draft resource.
   * 
   * @param minerId Miner ID (required)
   * @param body Details for creating draft resource (required)
   * @return Draft
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Draft> postLanguageunderstandingMinerDraftsWithHttpInfo(String minerId, Draft body) throws IOException {
    return postLanguageunderstandingMinerDrafts(createPostLanguageunderstandingMinerDraftsRequest(minerId, body).withHttpInfo());
  }

  private PostLanguageunderstandingMinerDraftsRequest createPostLanguageunderstandingMinerDraftsRequest(String minerId, Draft body) {
    return PostLanguageunderstandingMinerDraftsRequest.builder()
            .withMinerId(minerId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new draft resource.
   * 
   * @param request The request object
   * @return Draft
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Draft postLanguageunderstandingMinerDrafts(PostLanguageunderstandingMinerDraftsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Draft> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Draft>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new draft resource.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Draft> postLanguageunderstandingMinerDrafts(ApiRequest<Draft> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Draft>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Draft> response = (ApiResponse<Draft>)(ApiResponse<?>)exception;
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
      ApiResponse<Draft> response = (ApiResponse<Draft>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Start the mining process. Specify date range pair with mediaType, queueIds, participantType for mining data from Genesys Cloud. Specify only uploadKey for mining through an external file.
   * 
   * @param minerId Miner ID (required)
   * @param body  (optional)
   * @return Miner
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Miner postLanguageunderstandingMinerExecute(String minerId, MinerExecuteRequest body) throws IOException, ApiException {
    return  postLanguageunderstandingMinerExecute(createPostLanguageunderstandingMinerExecuteRequest(minerId, body));
  }

  /**
   * Start the mining process. Specify date range pair with mediaType, queueIds, participantType for mining data from Genesys Cloud. Specify only uploadKey for mining through an external file.
   * 
   * @param minerId Miner ID (required)
   * @param body  (optional)
   * @return Miner
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Miner> postLanguageunderstandingMinerExecuteWithHttpInfo(String minerId, MinerExecuteRequest body) throws IOException {
    return postLanguageunderstandingMinerExecute(createPostLanguageunderstandingMinerExecuteRequest(minerId, body).withHttpInfo());
  }

  private PostLanguageunderstandingMinerExecuteRequest createPostLanguageunderstandingMinerExecuteRequest(String minerId, MinerExecuteRequest body) {
    return PostLanguageunderstandingMinerExecuteRequest.builder()
            .withMinerId(minerId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Start the mining process. Specify date range pair with mediaType, queueIds, participantType for mining data from Genesys Cloud. Specify only uploadKey for mining through an external file.
   * 
   * @param request The request object
   * @return Miner
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Miner postLanguageunderstandingMinerExecute(PostLanguageunderstandingMinerExecuteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Miner> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Miner>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start the mining process. Specify date range pair with mediaType, queueIds, participantType for mining data from Genesys Cloud. Specify only uploadKey for mining through an external file.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Miner> postLanguageunderstandingMinerExecute(ApiRequest<MinerExecuteRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Miner>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Miner> response = (ApiResponse<Miner>)(ApiResponse<?>)exception;
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
      ApiResponse<Miner> response = (ApiResponse<Miner>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a unique miner.
   * 
   * @param body Details for creating a new miner resource. (required)
   * @return Miner
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Miner postLanguageunderstandingMiners(Miner body) throws IOException, ApiException {
    return  postLanguageunderstandingMiners(createPostLanguageunderstandingMinersRequest(body));
  }

  /**
   * Create a unique miner.
   * 
   * @param body Details for creating a new miner resource. (required)
   * @return Miner
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Miner> postLanguageunderstandingMinersWithHttpInfo(Miner body) throws IOException {
    return postLanguageunderstandingMiners(createPostLanguageunderstandingMinersRequest(body).withHttpInfo());
  }

  private PostLanguageunderstandingMinersRequest createPostLanguageunderstandingMinersRequest(Miner body) {
    return PostLanguageunderstandingMinersRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a unique miner.
   * 
   * @param request The request object
   * @return Miner
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Miner postLanguageunderstandingMiners(PostLanguageunderstandingMinersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Miner> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Miner>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a unique miner.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Miner> postLanguageunderstandingMiners(ApiRequest<Miner> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Miner>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Miner> response = (ApiResponse<Miner>)(ApiResponse<?>)exception;
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
      ApiResponse<Miner> response = (ApiResponse<Miner>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @param body The updated NLU Domain Version. (required)
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion putLanguageunderstandingDomainVersion(String domainId, String domainVersionId, NluDomainVersion body) throws IOException, ApiException {
    return  putLanguageunderstandingDomainVersion(createPutLanguageunderstandingDomainVersionRequest(domainId, domainVersionId, body));
  }

  /**
   * Update an NLU Domain Version.
   * 
   * @param domainId ID of the NLU domain. (required)
   * @param domainVersionId ID of the NLU domain version. (required)
   * @param body The updated NLU Domain Version. (required)
   * @return NluDomainVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> putLanguageunderstandingDomainVersionWithHttpInfo(String domainId, String domainVersionId, NluDomainVersion body) throws IOException {
    return putLanguageunderstandingDomainVersion(createPutLanguageunderstandingDomainVersionRequest(domainId, domainVersionId, body).withHttpInfo());
  }

  private PutLanguageunderstandingDomainVersionRequest createPutLanguageunderstandingDomainVersionRequest(String domainId, String domainVersionId, NluDomainVersion body) {
    return PutLanguageunderstandingDomainVersionRequest.builder()
            .withDomainId(domainId)
    
            .withDomainVersionId(domainVersionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an NLU Domain Version.
   * 
   * @param request The request object
   * @return NluDomainVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NluDomainVersion putLanguageunderstandingDomainVersion(PutLanguageunderstandingDomainVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NluDomainVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NluDomainVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an NLU Domain Version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NluDomainVersion> putLanguageunderstandingDomainVersion(ApiRequest<NluDomainVersion> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NluDomainVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)exception;
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
      ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
