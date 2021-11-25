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
import com.mypurecloud.sdk.v2.model.BenefitAssessment;
import com.mypurecloud.sdk.v2.model.AssessmentListing;
import com.mypurecloud.sdk.v2.model.BenefitAssessmentJob;
import com.mypurecloud.sdk.v2.model.AssessmentJobListing;
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Recipient;
import com.mypurecloud.sdk.v2.model.RecipientListing;
import com.mypurecloud.sdk.v2.model.Predictor;
import com.mypurecloud.sdk.v2.model.PredictorListing;
import com.mypurecloud.sdk.v2.model.KeyPerformanceIndicator;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.ComparisonPeriod;
import com.mypurecloud.sdk.v2.model.ComparisonPeriodListing;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSettings;
import com.mypurecloud.sdk.v2.model.ContactCenterSettings;
import com.mypurecloud.sdk.v2.model.TranscriptionSettings;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.SmsAddress;
import com.mypurecloud.sdk.v2.model.SmsAddressEntityListing;
import com.mypurecloud.sdk.v2.model.SMSAvailablePhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumber;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.AgentMaxUtilization;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesRequest;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesResponse;
import com.mypurecloud.sdk.v2.model.InboundDomainPatchRequest;
import com.mypurecloud.sdk.v2.model.PatchPredictorRequest;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentRequest;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentJobRequest;
import com.mypurecloud.sdk.v2.model.TestMessage;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.CreatePredictorRequest;
import com.mypurecloud.sdk.v2.model.WritableEntity;
import com.mypurecloud.sdk.v2.model.WrapUpCodeReference;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.SmsAddressProvision;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberProvision;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.QueueRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteRoutingAssessmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueMemberRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSkillRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSmsAddressRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSmsPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutinglanguageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailSetupRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingMessageRecipientRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingMessageRecipientsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorsKeyperformanceindicatorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueComparisonperiodRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueComparisonperiodsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueEstimatedwaittimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueMediatypeEstimatedwaittimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueuesDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueuesDivisionviewsAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueuesMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSettingsContactcenterRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSettingsTranscriptionRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsAddressRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsAddressesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsAvailablephonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutinglanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingConversationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingEmailDomainValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueMemberRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueMembersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingSettingsContactcenterRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutinglanguageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutinglanguagesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutingskillsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingAssessmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingAssessmentsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainTestconnectionRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueMembersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSmsAddressesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSmsPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutinglanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingMessageRecipientRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingSettingsTranscriptionRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingSmsPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingskillsBulkRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RoutingApi {
  private final ApiClient pcapiClient;

  public RoutingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoutingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete single benefit assessment.
   * 
   * @param assessmentId Benefit Assessment ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingAssessment(String assessmentId) throws IOException, ApiException {
     deleteRoutingAssessment(createDeleteRoutingAssessmentRequest(assessmentId));
  }

  /**
   * Delete single benefit assessment.
   * 
   * @param assessmentId Benefit Assessment ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingAssessmentWithHttpInfo(String assessmentId) throws IOException {
    return deleteRoutingAssessment(createDeleteRoutingAssessmentRequest(assessmentId).withHttpInfo());
  }

  private DeleteRoutingAssessmentRequest createDeleteRoutingAssessmentRequest(String assessmentId) {
    return DeleteRoutingAssessmentRequest.builder()
            .withAssessmentId(assessmentId)
    
            .build();
  }

  /**
   * Delete single benefit assessment.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingAssessment(DeleteRoutingAssessmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete single benefit assessment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingAssessment(ApiRequest<Void> request) throws IOException {
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
   * Delete a domain
   * 
   * @param domainId domain ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingEmailDomain(String domainId) throws IOException, ApiException {
     deleteRoutingEmailDomain(createDeleteRoutingEmailDomainRequest(domainId));
  }

  /**
   * Delete a domain
   * 
   * @param domainId domain ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingEmailDomainWithHttpInfo(String domainId) throws IOException {
    return deleteRoutingEmailDomain(createDeleteRoutingEmailDomainRequest(domainId).withHttpInfo());
  }

  private DeleteRoutingEmailDomainRequest createDeleteRoutingEmailDomainRequest(String domainId) {
    return DeleteRoutingEmailDomainRequest.builder()
            .withDomainId(domainId)
    
            .build();
  }

  /**
   * Delete a domain
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingEmailDomain(DeleteRoutingEmailDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a domain
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingEmailDomain(ApiRequest<Void> request) throws IOException {
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
   * Delete a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingEmailDomainRoute(String domainName, String routeId) throws IOException, ApiException {
     deleteRoutingEmailDomainRoute(createDeleteRoutingEmailDomainRouteRequest(domainName, routeId));
  }

  /**
   * Delete a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingEmailDomainRouteWithHttpInfo(String domainName, String routeId) throws IOException {
    return deleteRoutingEmailDomainRoute(createDeleteRoutingEmailDomainRouteRequest(domainName, routeId).withHttpInfo());
  }

  private DeleteRoutingEmailDomainRouteRequest createDeleteRoutingEmailDomainRouteRequest(String domainName, String routeId) {
    return DeleteRoutingEmailDomainRouteRequest.builder()
            .withDomainName(domainName)
    
            .withRouteId(routeId)
    
            .build();
  }

  /**
   * Delete a route
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingEmailDomainRoute(DeleteRoutingEmailDomainRouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingEmailDomainRoute(ApiRequest<Void> request) throws IOException {
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
   * Delete single predictor.
   * 
   * @param predictorId Predictor ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingPredictor(String predictorId) throws IOException, ApiException {
     deleteRoutingPredictor(createDeleteRoutingPredictorRequest(predictorId));
  }

  /**
   * Delete single predictor.
   * 
   * @param predictorId Predictor ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingPredictorWithHttpInfo(String predictorId) throws IOException {
    return deleteRoutingPredictor(createDeleteRoutingPredictorRequest(predictorId).withHttpInfo());
  }

  private DeleteRoutingPredictorRequest createDeleteRoutingPredictorRequest(String predictorId) {
    return DeleteRoutingPredictorRequest.builder()
            .withPredictorId(predictorId)
    
            .build();
  }

  /**
   * Delete single predictor.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingPredictor(DeleteRoutingPredictorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete single predictor.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingPredictor(ApiRequest<Void> request) throws IOException {
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
   * Delete a queue
   * 
   * @param queueId Queue ID (required)
   * @param forceDelete forceDelete (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueue(String queueId, Boolean forceDelete) throws IOException, ApiException {
     deleteRoutingQueue(createDeleteRoutingQueueRequest(queueId, forceDelete));
  }

  /**
   * Delete a queue
   * 
   * @param queueId Queue ID (required)
   * @param forceDelete forceDelete (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueueWithHttpInfo(String queueId, Boolean forceDelete) throws IOException {
    return deleteRoutingQueue(createDeleteRoutingQueueRequest(queueId, forceDelete).withHttpInfo());
  }

  private DeleteRoutingQueueRequest createDeleteRoutingQueueRequest(String queueId, Boolean forceDelete) {
    return DeleteRoutingQueueRequest.builder()
            .withQueueId(queueId)
    
            .withForceDelete(forceDelete)
    
            .build();
  }

  /**
   * Delete a queue
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueue(DeleteRoutingQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueue(ApiRequest<Void> request) throws IOException {
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
   * Delete a queue member.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueueMember(String queueId, String memberId) throws IOException, ApiException {
     deleteRoutingQueueMember(createDeleteRoutingQueueMemberRequest(queueId, memberId));
  }

  /**
   * Delete a queue member.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueueMemberWithHttpInfo(String queueId, String memberId) throws IOException {
    return deleteRoutingQueueMember(createDeleteRoutingQueueMemberRequest(queueId, memberId).withHttpInfo());
  }

  private DeleteRoutingQueueMemberRequest createDeleteRoutingQueueMemberRequest(String queueId, String memberId) {
    return DeleteRoutingQueueMemberRequest.builder()
            .withQueueId(queueId)
    
            .withMemberId(memberId)
    
            .build();
  }

  /**
   * Delete a queue member.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueueMember(DeleteRoutingQueueMemberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a queue member.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueueMember(ApiRequest<Void> request) throws IOException {
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
   * DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}.  Delete queue member.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueueUser(String queueId, String memberId) throws IOException, ApiException {
     deleteRoutingQueueUser(createDeleteRoutingQueueUserRequest(queueId, memberId));
  }

  /**
   * DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}.  Delete queue member.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueueUserWithHttpInfo(String queueId, String memberId) throws IOException {
    return deleteRoutingQueueUser(createDeleteRoutingQueueUserRequest(queueId, memberId).withHttpInfo());
  }

  private DeleteRoutingQueueUserRequest createDeleteRoutingQueueUserRequest(String queueId, String memberId) {
    return DeleteRoutingQueueUserRequest.builder()
            .withQueueId(queueId)
    
            .withMemberId(memberId)
    
            .build();
  }

  /**
   * DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}.  Delete queue member.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueueUser(DeleteRoutingQueueUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}.  Delete queue member.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueueUser(ApiRequest<Void> request) throws IOException {
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
   * Delete a wrap-up code from a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueueWrapupcode(String queueId, String codeId) throws IOException, ApiException {
     deleteRoutingQueueWrapupcode(createDeleteRoutingQueueWrapupcodeRequest(queueId, codeId));
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueueWrapupcodeWithHttpInfo(String queueId, String codeId) throws IOException {
    return deleteRoutingQueueWrapupcode(createDeleteRoutingQueueWrapupcodeRequest(queueId, codeId).withHttpInfo());
  }

  private DeleteRoutingQueueWrapupcodeRequest createDeleteRoutingQueueWrapupcodeRequest(String queueId, String codeId) {
    return DeleteRoutingQueueWrapupcodeRequest.builder()
            .withQueueId(queueId)
    
            .withCodeId(codeId)
    
            .build();
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingQueueWrapupcode(DeleteRoutingQueueWrapupcodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingQueueWrapupcode(ApiRequest<Void> request) throws IOException {
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
   * Delete an organization&#39;s routing settings
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSettings() throws IOException, ApiException {
     deleteRoutingSettings(createDeleteRoutingSettingsRequest());
  }

  /**
   * Delete an organization&#39;s routing settings
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSettingsWithHttpInfo() throws IOException {
    return deleteRoutingSettings(createDeleteRoutingSettingsRequest().withHttpInfo());
  }

  private DeleteRoutingSettingsRequest createDeleteRoutingSettingsRequest() {
    return DeleteRoutingSettingsRequest.builder()
            .build();
  }

  /**
   * Delete an organization&#39;s routing settings
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSettings(DeleteRoutingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an organization&#39;s routing settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSettings(ApiRequest<Void> request) throws IOException {
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
   * Delete Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSkill(String skillId) throws IOException, ApiException {
     deleteRoutingSkill(createDeleteRoutingSkillRequest(skillId));
  }

  /**
   * Delete Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSkillWithHttpInfo(String skillId) throws IOException {
    return deleteRoutingSkill(createDeleteRoutingSkillRequest(skillId).withHttpInfo());
  }

  private DeleteRoutingSkillRequest createDeleteRoutingSkillRequest(String skillId) {
    return DeleteRoutingSkillRequest.builder()
            .withSkillId(skillId)
    
            .build();
  }

  /**
   * Delete Routing Skill
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSkill(DeleteRoutingSkillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Routing Skill
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSkill(ApiRequest<Void> request) throws IOException {
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
   * Delete an Address by Id for SMS
   * 
   * @param addressId Address ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSmsAddress(String addressId) throws IOException, ApiException {
     deleteRoutingSmsAddress(createDeleteRoutingSmsAddressRequest(addressId));
  }

  /**
   * Delete an Address by Id for SMS
   * 
   * @param addressId Address ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSmsAddressWithHttpInfo(String addressId) throws IOException {
    return deleteRoutingSmsAddress(createDeleteRoutingSmsAddressRequest(addressId).withHttpInfo());
  }

  private DeleteRoutingSmsAddressRequest createDeleteRoutingSmsAddressRequest(String addressId) {
    return DeleteRoutingSmsAddressRequest.builder()
            .withAddressId(addressId)
    
            .build();
  }

  /**
   * Delete an Address by Id for SMS
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSmsAddress(DeleteRoutingSmsAddressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an Address by Id for SMS
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSmsAddress(ApiRequest<Void> request) throws IOException {
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
   * Delete a phone number provisioned for SMS.
   * 
   * @param addressId Address ID (required)
   * @param async Delete a phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the deletion of a provisioned phone number.  (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSmsPhonenumber(String addressId, Boolean async) throws IOException, ApiException {
     deleteRoutingSmsPhonenumber(createDeleteRoutingSmsPhonenumberRequest(addressId, async));
  }

  /**
   * Delete a phone number provisioned for SMS.
   * 
   * @param addressId Address ID (required)
   * @param async Delete a phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the deletion of a provisioned phone number.  (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSmsPhonenumberWithHttpInfo(String addressId, Boolean async) throws IOException {
    return deleteRoutingSmsPhonenumber(createDeleteRoutingSmsPhonenumberRequest(addressId, async).withHttpInfo());
  }

  private DeleteRoutingSmsPhonenumberRequest createDeleteRoutingSmsPhonenumberRequest(String addressId, Boolean async) {
    return DeleteRoutingSmsPhonenumberRequest.builder()
            .withAddressId(addressId)
    
            .withAsync(async)
    
            .build();
  }

  /**
   * Delete a phone number provisioned for SMS.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSmsPhonenumber(DeleteRoutingSmsPhonenumberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a phone number provisioned for SMS.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSmsPhonenumber(ApiRequest<Void> request) throws IOException {
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
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUserUtilization(String userId) throws IOException, ApiException {
     deleteRoutingUserUtilization(createDeleteRoutingUserUtilizationRequest(userId));
  }

  /**
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUserUtilizationWithHttpInfo(String userId) throws IOException {
    return deleteRoutingUserUtilization(createDeleteRoutingUserUtilizationRequest(userId).withHttpInfo());
  }

  private DeleteRoutingUserUtilizationRequest createDeleteRoutingUserUtilizationRequest(String userId) {
    return DeleteRoutingUserUtilizationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUserUtilization(DeleteRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the user&#39;s max utilization settings and revert to the organization-wide default.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUserUtilization(ApiRequest<Void> request) throws IOException {
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
   * Delete the organization-wide max utilization settings and revert to the system default.
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUtilization() throws IOException, ApiException {
     deleteRoutingUtilization(createDeleteRoutingUtilizationRequest());
  }

  /**
   * Delete the organization-wide max utilization settings and revert to the system default.
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUtilizationWithHttpInfo() throws IOException {
    return deleteRoutingUtilization(createDeleteRoutingUtilizationRequest().withHttpInfo());
  }

  private DeleteRoutingUtilizationRequest createDeleteRoutingUtilizationRequest() {
    return DeleteRoutingUtilizationRequest.builder()
            .build();
  }

  /**
   * Delete the organization-wide max utilization settings and revert to the system default.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUtilization(DeleteRoutingUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the organization-wide max utilization settings and revert to the system default.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUtilization(ApiRequest<Void> request) throws IOException {
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
   * Delete wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingWrapupcode(String codeId) throws IOException, ApiException {
     deleteRoutingWrapupcode(createDeleteRoutingWrapupcodeRequest(codeId));
  }

  /**
   * Delete wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingWrapupcodeWithHttpInfo(String codeId) throws IOException {
    return deleteRoutingWrapupcode(createDeleteRoutingWrapupcodeRequest(codeId).withHttpInfo());
  }

  private DeleteRoutingWrapupcodeRequest createDeleteRoutingWrapupcodeRequest(String codeId) {
    return DeleteRoutingWrapupcodeRequest.builder()
            .withCodeId(codeId)
    
            .build();
  }

  /**
   * Delete wrap-up code
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingWrapupcode(DeleteRoutingWrapupcodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete wrap-up code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingWrapupcode(ApiRequest<Void> request) throws IOException {
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
   * Remove routing language from user
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutinglanguage(String userId, String languageId) throws IOException, ApiException {
     deleteUserRoutinglanguage(createDeleteUserRoutinglanguageRequest(userId, languageId));
  }

  /**
   * Remove routing language from user
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutinglanguageWithHttpInfo(String userId, String languageId) throws IOException {
    return deleteUserRoutinglanguage(createDeleteUserRoutinglanguageRequest(userId, languageId).withHttpInfo());
  }

  private DeleteUserRoutinglanguageRequest createDeleteUserRoutinglanguageRequest(String userId, String languageId) {
    return DeleteUserRoutinglanguageRequest.builder()
            .withUserId(userId)
    
            .withLanguageId(languageId)
    
            .build();
  }

  /**
   * Remove routing language from user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutinglanguage(DeleteUserRoutinglanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove routing language from user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutinglanguage(ApiRequest<Void> request) throws IOException {
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
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutingskill(String userId, String skillId) throws IOException, ApiException {
     deleteUserRoutingskill(createDeleteUserRoutingskillRequest(userId, skillId));
  }

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutingskillWithHttpInfo(String userId, String skillId) throws IOException {
    return deleteUserRoutingskill(createDeleteUserRoutingskillRequest(userId, skillId).withHttpInfo());
  }

  private DeleteUserRoutingskillRequest createDeleteUserRoutingskillRequest(String userId, String skillId) {
    return DeleteUserRoutingskillRequest.builder()
            .withUserId(userId)
    
            .withSkillId(skillId)
    
            .build();
  }

  /**
   * Remove routing skill from user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteUserRoutingskill(DeleteUserRoutingskillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove routing skill from user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteUserRoutingskill(ApiRequest<Void> request) throws IOException {
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
   * Retrieve a single benefit assessment.
   * 
   * @param assessmentId Benefit Assessment ID (required)
   * @return BenefitAssessment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessment getRoutingAssessment(String assessmentId) throws IOException, ApiException {
    return  getRoutingAssessment(createGetRoutingAssessmentRequest(assessmentId));
  }

  /**
   * Retrieve a single benefit assessment.
   * 
   * @param assessmentId Benefit Assessment ID (required)
   * @return BenefitAssessment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessment> getRoutingAssessmentWithHttpInfo(String assessmentId) throws IOException {
    return getRoutingAssessment(createGetRoutingAssessmentRequest(assessmentId).withHttpInfo());
  }

  private GetRoutingAssessmentRequest createGetRoutingAssessmentRequest(String assessmentId) {
    return GetRoutingAssessmentRequest.builder()
            .withAssessmentId(assessmentId)
    
            .build();
  }

  /**
   * Retrieve a single benefit assessment.
   * 
   * @param request The request object
   * @return BenefitAssessment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessment getRoutingAssessment(GetRoutingAssessmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BenefitAssessment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BenefitAssessment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single benefit assessment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessment> getRoutingAssessment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BenefitAssessment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BenefitAssessment> response = (ApiResponse<BenefitAssessment>)(ApiResponse<?>)exception;
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
      ApiResponse<BenefitAssessment> response = (ApiResponse<BenefitAssessment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all benefit assessments.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param queueId Queue ID(s) to filter assessments by. (optional)
   * @return AssessmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssessmentListing getRoutingAssessments(String before, String after, String limit, String pageSize, List<String> queueId) throws IOException, ApiException {
    return  getRoutingAssessments(createGetRoutingAssessmentsRequest(before, after, limit, pageSize, queueId));
  }

  /**
   * Retrieve all benefit assessments.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param queueId Queue ID(s) to filter assessments by. (optional)
   * @return AssessmentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssessmentListing> getRoutingAssessmentsWithHttpInfo(String before, String after, String limit, String pageSize, List<String> queueId) throws IOException {
    return getRoutingAssessments(createGetRoutingAssessmentsRequest(before, after, limit, pageSize, queueId).withHttpInfo());
  }

  private GetRoutingAssessmentsRequest createGetRoutingAssessmentsRequest(String before, String after, String limit, String pageSize, List<String> queueId) {
    return GetRoutingAssessmentsRequest.builder()
            .withBefore(before)
    
            .withAfter(after)
    
            .withLimit(limit)
    
            .withPageSize(pageSize)
    
            .withQueueId(queueId)
    
            .build();
  }

  /**
   * Retrieve all benefit assessments.
   * 
   * @param request The request object
   * @return AssessmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssessmentListing getRoutingAssessments(GetRoutingAssessmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssessmentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssessmentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all benefit assessments.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssessmentListing> getRoutingAssessments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssessmentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssessmentListing> response = (ApiResponse<AssessmentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AssessmentListing> response = (ApiResponse<AssessmentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a single benefit assessments job.
   * 
   * @param jobId Benefit Assessment Job ID (required)
   * @return BenefitAssessmentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessmentJob getRoutingAssessmentsJob(String jobId) throws IOException, ApiException {
    return  getRoutingAssessmentsJob(createGetRoutingAssessmentsJobRequest(jobId));
  }

  /**
   * Retrieve a single benefit assessments job.
   * 
   * @param jobId Benefit Assessment Job ID (required)
   * @return BenefitAssessmentJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessmentJob> getRoutingAssessmentsJobWithHttpInfo(String jobId) throws IOException {
    return getRoutingAssessmentsJob(createGetRoutingAssessmentsJobRequest(jobId).withHttpInfo());
  }

  private GetRoutingAssessmentsJobRequest createGetRoutingAssessmentsJobRequest(String jobId) {
    return GetRoutingAssessmentsJobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Retrieve a single benefit assessments job.
   * 
   * @param request The request object
   * @return BenefitAssessmentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessmentJob getRoutingAssessmentsJob(GetRoutingAssessmentsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BenefitAssessmentJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BenefitAssessmentJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single benefit assessments job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessmentJob> getRoutingAssessmentsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BenefitAssessmentJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BenefitAssessmentJob> response = (ApiResponse<BenefitAssessmentJob>)(ApiResponse<?>)exception;
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
      ApiResponse<BenefitAssessmentJob> response = (ApiResponse<BenefitAssessmentJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all benefit assessment jobs.
   * 
   * @param divisionId Division ID(s) to filter assessment jobs by. (optional)
   * @return AssessmentJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssessmentJobListing getRoutingAssessmentsJobs(List<String> divisionId) throws IOException, ApiException {
    return  getRoutingAssessmentsJobs(createGetRoutingAssessmentsJobsRequest(divisionId));
  }

  /**
   * Retrieve all benefit assessment jobs.
   * 
   * @param divisionId Division ID(s) to filter assessment jobs by. (optional)
   * @return AssessmentJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssessmentJobListing> getRoutingAssessmentsJobsWithHttpInfo(List<String> divisionId) throws IOException {
    return getRoutingAssessmentsJobs(createGetRoutingAssessmentsJobsRequest(divisionId).withHttpInfo());
  }

  private GetRoutingAssessmentsJobsRequest createGetRoutingAssessmentsJobsRequest(List<String> divisionId) {
    return GetRoutingAssessmentsJobsRequest.builder()
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Retrieve all benefit assessment jobs.
   * 
   * @param request The request object
   * @return AssessmentJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssessmentJobListing getRoutingAssessmentsJobs(GetRoutingAssessmentsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssessmentJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssessmentJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all benefit assessment jobs.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssessmentJobListing> getRoutingAssessmentsJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssessmentJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssessmentJobListing> response = (ApiResponse<AssessmentJobListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AssessmentJobListing> response = (ApiResponse<AssessmentJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get domain
   * 
   * @param domainId domain ID (required)
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain getRoutingEmailDomain(String domainId) throws IOException, ApiException {
    return  getRoutingEmailDomain(createGetRoutingEmailDomainRequest(domainId));
  }

  /**
   * Get domain
   * 
   * @param domainId domain ID (required)
   * @return InboundDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> getRoutingEmailDomainWithHttpInfo(String domainId) throws IOException {
    return getRoutingEmailDomain(createGetRoutingEmailDomainRequest(domainId).withHttpInfo());
  }

  private GetRoutingEmailDomainRequest createGetRoutingEmailDomainRequest(String domainId) {
    return GetRoutingEmailDomainRequest.builder()
            .withDomainId(domainId)
    
            .build();
  }

  /**
   * Get domain
   * 
   * @param request The request object
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain getRoutingEmailDomain(GetRoutingEmailDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get domain
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> getRoutingEmailDomain(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return InboundRoute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRoute getRoutingEmailDomainRoute(String domainName, String routeId) throws IOException, ApiException {
    return  getRoutingEmailDomainRoute(createGetRoutingEmailDomainRouteRequest(domainName, routeId));
  }

  /**
   * Get a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return InboundRoute
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRoute> getRoutingEmailDomainRouteWithHttpInfo(String domainName, String routeId) throws IOException {
    return getRoutingEmailDomainRoute(createGetRoutingEmailDomainRouteRequest(domainName, routeId).withHttpInfo());
  }

  private GetRoutingEmailDomainRouteRequest createGetRoutingEmailDomainRouteRequest(String domainName, String routeId) {
    return GetRoutingEmailDomainRouteRequest.builder()
            .withDomainName(domainName)
    
            .withRouteId(routeId)
    
            .build();
  }

  /**
   * Get a route
   * 
   * @param request The request object
   * @return InboundRoute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRoute getRoutingEmailDomainRoute(GetRoutingEmailDomainRouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundRoute> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundRoute>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRoute> getRoutingEmailDomainRoute(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundRoute>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pattern Filter routes by the route&#39;s pattern property (optional)
   * @return InboundRouteEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRouteEntityListing getRoutingEmailDomainRoutes(String domainName, Integer pageSize, Integer pageNumber, String pattern) throws IOException, ApiException {
    return  getRoutingEmailDomainRoutes(createGetRoutingEmailDomainRoutesRequest(domainName, pageSize, pageNumber, pattern));
  }

  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pattern Filter routes by the route&#39;s pattern property (optional)
   * @return InboundRouteEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRouteEntityListing> getRoutingEmailDomainRoutesWithHttpInfo(String domainName, Integer pageSize, Integer pageNumber, String pattern) throws IOException {
    return getRoutingEmailDomainRoutes(createGetRoutingEmailDomainRoutesRequest(domainName, pageSize, pageNumber, pattern).withHttpInfo());
  }

  private GetRoutingEmailDomainRoutesRequest createGetRoutingEmailDomainRoutesRequest(String domainName, Integer pageSize, Integer pageNumber, String pattern) {
    return GetRoutingEmailDomainRoutesRequest.builder()
            .withDomainName(domainName)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withPattern(pattern)
    
            .build();
  }

  /**
   * Get routes
   * 
   * @param request The request object
   * @return InboundRouteEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRouteEntityListing getRoutingEmailDomainRoutes(GetRoutingEmailDomainRoutesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundRouteEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundRouteEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get routes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRouteEntityListing> getRoutingEmailDomainRoutes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundRouteEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundRouteEntityListing> response = (ApiResponse<InboundRouteEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundRouteEntityListing> response = (ApiResponse<InboundRouteEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get domains
   * 
   * @return InboundDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomainEntityListing getRoutingEmailDomains() throws IOException, ApiException {
    return  getRoutingEmailDomains(createGetRoutingEmailDomainsRequest());
  }

  /**
   * Get domains
   * 
   * @return InboundDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomainEntityListing> getRoutingEmailDomainsWithHttpInfo() throws IOException {
    return getRoutingEmailDomains(createGetRoutingEmailDomainsRequest().withHttpInfo());
  }

  private GetRoutingEmailDomainsRequest createGetRoutingEmailDomainsRequest() {
    return GetRoutingEmailDomainsRequest.builder()
            .build();
  }

  /**
   * Get domains
   * 
   * @param request The request object
   * @return InboundDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomainEntityListing getRoutingEmailDomains(GetRoutingEmailDomainsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundDomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundDomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get domains
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomainEntityListing> getRoutingEmailDomains(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundDomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundDomainEntityListing> response = (ApiResponse<InboundDomainEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundDomainEntityListing> response = (ApiResponse<InboundDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get email setup
   * 
   * @return EmailSetup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailSetup getRoutingEmailSetup() throws IOException, ApiException {
    return  getRoutingEmailSetup(createGetRoutingEmailSetupRequest());
  }

  /**
   * Get email setup
   * 
   * @return EmailSetup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailSetup> getRoutingEmailSetupWithHttpInfo() throws IOException {
    return getRoutingEmailSetup(createGetRoutingEmailSetupRequest().withHttpInfo());
  }

  private GetRoutingEmailSetupRequest createGetRoutingEmailSetupRequest() {
    return GetRoutingEmailSetupRequest.builder()
            .build();
  }

  /**
   * Get email setup
   * 
   * @param request The request object
   * @return EmailSetup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailSetup getRoutingEmailSetup(GetRoutingEmailSetupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailSetup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailSetup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get email setup
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailSetup> getRoutingEmailSetup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailSetup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailSetup> response = (ApiResponse<EmailSetup>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailSetup> response = (ApiResponse<EmailSetup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of supported languages.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @param id id (optional)
   * @return LanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LanguageEntityListing getRoutingLanguages(Integer pageSize, Integer pageNumber, String sortOrder, String name, List<String> id) throws IOException, ApiException {
    return  getRoutingLanguages(createGetRoutingLanguagesRequest(pageSize, pageNumber, sortOrder, name, id));
  }

  /**
   * Get the list of supported languages.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @param id id (optional)
   * @return LanguageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LanguageEntityListing> getRoutingLanguagesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder, String name, List<String> id) throws IOException {
    return getRoutingLanguages(createGetRoutingLanguagesRequest(pageSize, pageNumber, sortOrder, name, id).withHttpInfo());
  }

  private GetRoutingLanguagesRequest createGetRoutingLanguagesRequest(Integer pageSize, Integer pageNumber, String sortOrder, String name, List<String> id) {
    return GetRoutingLanguagesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .withName(name)
    
            .withId(id)
    
            .build();
  }

  /**
   * Get the list of supported languages.
   * 
   * @param request The request object
   * @return LanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LanguageEntityListing getRoutingLanguages(GetRoutingLanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LanguageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LanguageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of supported languages.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LanguageEntityListing> getRoutingLanguages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LanguageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LanguageEntityListing> response = (ApiResponse<LanguageEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<LanguageEntityListing> response = (ApiResponse<LanguageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a recipient
   * 
   * @param recipientId Recipient ID (required)
   * @return Recipient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recipient getRoutingMessageRecipient(String recipientId) throws IOException, ApiException {
    return  getRoutingMessageRecipient(createGetRoutingMessageRecipientRequest(recipientId));
  }

  /**
   * Get a recipient
   * 
   * @param recipientId Recipient ID (required)
   * @return Recipient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recipient> getRoutingMessageRecipientWithHttpInfo(String recipientId) throws IOException {
    return getRoutingMessageRecipient(createGetRoutingMessageRecipientRequest(recipientId).withHttpInfo());
  }

  private GetRoutingMessageRecipientRequest createGetRoutingMessageRecipientRequest(String recipientId) {
    return GetRoutingMessageRecipientRequest.builder()
            .withRecipientId(recipientId)
    
            .build();
  }

  /**
   * Get a recipient
   * 
   * @param request The request object
   * @return Recipient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recipient getRoutingMessageRecipient(GetRoutingMessageRecipientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recipient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recipient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a recipient
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recipient> getRoutingMessageRecipient(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recipient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recipient> response = (ApiResponse<Recipient>)(ApiResponse<?>)exception;
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
      ApiResponse<Recipient> response = (ApiResponse<Recipient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get recipients
   * 
   * @param messengerType Messenger Type (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return RecipientListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecipientListing getRoutingMessageRecipients(String messengerType, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getRoutingMessageRecipients(createGetRoutingMessageRecipientsRequest(messengerType, pageSize, pageNumber));
  }

  /**
   * Get recipients
   * 
   * @param messengerType Messenger Type (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return RecipientListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecipientListing> getRoutingMessageRecipientsWithHttpInfo(String messengerType, Integer pageSize, Integer pageNumber) throws IOException {
    return getRoutingMessageRecipients(createGetRoutingMessageRecipientsRequest(messengerType, pageSize, pageNumber).withHttpInfo());
  }

  private GetRoutingMessageRecipientsRequest createGetRoutingMessageRecipientsRequest(String messengerType, Integer pageSize, Integer pageNumber) {
    return GetRoutingMessageRecipientsRequest.builder()
            .withMessengerType(messengerType)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get recipients
   * 
   * @param request The request object
   * @return RecipientListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecipientListing getRoutingMessageRecipients(GetRoutingMessageRecipientsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RecipientListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RecipientListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get recipients
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecipientListing> getRoutingMessageRecipients(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RecipientListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RecipientListing> response = (ApiResponse<RecipientListing>)(ApiResponse<?>)exception;
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
      ApiResponse<RecipientListing> response = (ApiResponse<RecipientListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a single predictor.
   * 
   * @param predictorId Predictor ID (required)
   * @return Predictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Predictor getRoutingPredictor(String predictorId) throws IOException, ApiException {
    return  getRoutingPredictor(createGetRoutingPredictorRequest(predictorId));
  }

  /**
   * Retrieve a single predictor.
   * 
   * @param predictorId Predictor ID (required)
   * @return Predictor
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Predictor> getRoutingPredictorWithHttpInfo(String predictorId) throws IOException {
    return getRoutingPredictor(createGetRoutingPredictorRequest(predictorId).withHttpInfo());
  }

  private GetRoutingPredictorRequest createGetRoutingPredictorRequest(String predictorId) {
    return GetRoutingPredictorRequest.builder()
            .withPredictorId(predictorId)
    
            .build();
  }

  /**
   * Retrieve a single predictor.
   * 
   * @param request The request object
   * @return Predictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Predictor getRoutingPredictor(GetRoutingPredictorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Predictor> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Predictor>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single predictor.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Predictor> getRoutingPredictor(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Predictor>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Predictor> response = (ApiResponse<Predictor>)(ApiResponse<?>)exception;
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
      ApiResponse<Predictor> response = (ApiResponse<Predictor>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all predictors.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param queueId Comma-separated list of queue Ids to filter by. (optional)
   * @return PredictorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PredictorListing getRoutingPredictors(String before, String after, String limit, String pageSize, List<String> queueId) throws IOException, ApiException {
    return  getRoutingPredictors(createGetRoutingPredictorsRequest(before, after, limit, pageSize, queueId));
  }

  /**
   * Retrieve all predictors.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param queueId Comma-separated list of queue Ids to filter by. (optional)
   * @return PredictorListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PredictorListing> getRoutingPredictorsWithHttpInfo(String before, String after, String limit, String pageSize, List<String> queueId) throws IOException {
    return getRoutingPredictors(createGetRoutingPredictorsRequest(before, after, limit, pageSize, queueId).withHttpInfo());
  }

  private GetRoutingPredictorsRequest createGetRoutingPredictorsRequest(String before, String after, String limit, String pageSize, List<String> queueId) {
    return GetRoutingPredictorsRequest.builder()
            .withBefore(before)
    
            .withAfter(after)
    
            .withLimit(limit)
    
            .withPageSize(pageSize)
    
            .withQueueId(queueId)
    
            .build();
  }

  /**
   * Retrieve all predictors.
   * 
   * @param request The request object
   * @return PredictorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PredictorListing getRoutingPredictors(GetRoutingPredictorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PredictorListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PredictorListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all predictors.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PredictorListing> getRoutingPredictors(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PredictorListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PredictorListing> response = (ApiResponse<PredictorListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PredictorListing> response = (ApiResponse<PredictorListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Key Performance Indicators available for the predictors.
   * 
   * @return List<KeyPerformanceIndicator>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<KeyPerformanceIndicator> getRoutingPredictorsKeyperformanceindicators() throws IOException, ApiException {
    return  getRoutingPredictorsKeyperformanceindicators(createGetRoutingPredictorsKeyperformanceindicatorsRequest());
  }

  /**
   * Get a list of Key Performance Indicators available for the predictors.
   * 
   * @return List<KeyPerformanceIndicator>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<KeyPerformanceIndicator>> getRoutingPredictorsKeyperformanceindicatorsWithHttpInfo() throws IOException {
    return getRoutingPredictorsKeyperformanceindicators(createGetRoutingPredictorsKeyperformanceindicatorsRequest().withHttpInfo());
  }

  private GetRoutingPredictorsKeyperformanceindicatorsRequest createGetRoutingPredictorsKeyperformanceindicatorsRequest() {
    return GetRoutingPredictorsKeyperformanceindicatorsRequest.builder()
            .build();
  }

  /**
   * Get a list of Key Performance Indicators available for the predictors.
   * 
   * @param request The request object
   * @return List<KeyPerformanceIndicator>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<KeyPerformanceIndicator> getRoutingPredictorsKeyperformanceindicators(GetRoutingPredictorsKeyperformanceindicatorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<KeyPerformanceIndicator>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<KeyPerformanceIndicator>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Key Performance Indicators available for the predictors.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<KeyPerformanceIndicator>> getRoutingPredictorsKeyperformanceindicators(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<KeyPerformanceIndicator>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<KeyPerformanceIndicator>> response = (ApiResponse<List<KeyPerformanceIndicator>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<KeyPerformanceIndicator>> response = (ApiResponse<List<KeyPerformanceIndicator>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get details about this queue.
   * 
   * @param queueId Queue ID (required)
   * @return Queue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Queue getRoutingQueue(String queueId) throws IOException, ApiException {
    return  getRoutingQueue(createGetRoutingQueueRequest(queueId));
  }

  /**
   * Get details about this queue.
   * 
   * @param queueId Queue ID (required)
   * @return Queue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Queue> getRoutingQueueWithHttpInfo(String queueId) throws IOException {
    return getRoutingQueue(createGetRoutingQueueRequest(queueId).withHttpInfo());
  }

  private GetRoutingQueueRequest createGetRoutingQueueRequest(String queueId) {
    return GetRoutingQueueRequest.builder()
            .withQueueId(queueId)
    
            .build();
  }

  /**
   * Get details about this queue.
   * 
   * @param request The request object
   * @return Queue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Queue getRoutingQueue(GetRoutingQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Queue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Queue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details about this queue.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Queue> getRoutingQueue(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Queue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)exception;
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
      ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a Comparison Period.
   * 
   * @param queueId Queue id (required)
   * @param comparisonPeriodId ComparisonPeriod id (required)
   * @return ComparisonPeriod
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ComparisonPeriod getRoutingQueueComparisonperiod(String queueId, String comparisonPeriodId) throws IOException, ApiException {
    return  getRoutingQueueComparisonperiod(createGetRoutingQueueComparisonperiodRequest(queueId, comparisonPeriodId));
  }

  /**
   * Get a Comparison Period.
   * 
   * @param queueId Queue id (required)
   * @param comparisonPeriodId ComparisonPeriod id (required)
   * @return ComparisonPeriod
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ComparisonPeriod> getRoutingQueueComparisonperiodWithHttpInfo(String queueId, String comparisonPeriodId) throws IOException {
    return getRoutingQueueComparisonperiod(createGetRoutingQueueComparisonperiodRequest(queueId, comparisonPeriodId).withHttpInfo());
  }

  private GetRoutingQueueComparisonperiodRequest createGetRoutingQueueComparisonperiodRequest(String queueId, String comparisonPeriodId) {
    return GetRoutingQueueComparisonperiodRequest.builder()
            .withQueueId(queueId)
    
            .withComparisonPeriodId(comparisonPeriodId)
    
            .build();
  }

  /**
   * Get a Comparison Period.
   * 
   * @param request The request object
   * @return ComparisonPeriod
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ComparisonPeriod getRoutingQueueComparisonperiod(GetRoutingQueueComparisonperiodRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ComparisonPeriod> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ComparisonPeriod>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Comparison Period.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ComparisonPeriod> getRoutingQueueComparisonperiod(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ComparisonPeriod>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ComparisonPeriod> response = (ApiResponse<ComparisonPeriod>)(ApiResponse<?>)exception;
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
      ApiResponse<ComparisonPeriod> response = (ApiResponse<ComparisonPeriod>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of comparison periods
   * 
   * @param queueId Queue id (required)
   * @return ComparisonPeriodListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ComparisonPeriodListing getRoutingQueueComparisonperiods(String queueId) throws IOException, ApiException {
    return  getRoutingQueueComparisonperiods(createGetRoutingQueueComparisonperiodsRequest(queueId));
  }

  /**
   * Get list of comparison periods
   * 
   * @param queueId Queue id (required)
   * @return ComparisonPeriodListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ComparisonPeriodListing> getRoutingQueueComparisonperiodsWithHttpInfo(String queueId) throws IOException {
    return getRoutingQueueComparisonperiods(createGetRoutingQueueComparisonperiodsRequest(queueId).withHttpInfo());
  }

  private GetRoutingQueueComparisonperiodsRequest createGetRoutingQueueComparisonperiodsRequest(String queueId) {
    return GetRoutingQueueComparisonperiodsRequest.builder()
            .withQueueId(queueId)
    
            .build();
  }

  /**
   * Get list of comparison periods
   * 
   * @param request The request object
   * @return ComparisonPeriodListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ComparisonPeriodListing getRoutingQueueComparisonperiods(GetRoutingQueueComparisonperiodsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ComparisonPeriodListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ComparisonPeriodListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of comparison periods
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ComparisonPeriodListing> getRoutingQueueComparisonperiods(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ComparisonPeriodListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ComparisonPeriodListing> response = (ApiResponse<ComparisonPeriodListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ComparisonPeriodListing> response = (ApiResponse<ComparisonPeriodListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param conversationId conversationId (optional)
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimatedWaitTimePredictions getRoutingQueueEstimatedwaittime(String queueId, String conversationId) throws IOException, ApiException {
    return  getRoutingQueueEstimatedwaittime(createGetRoutingQueueEstimatedwaittimeRequest(queueId, conversationId));
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param conversationId conversationId (optional)
   * @return EstimatedWaitTimePredictions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueEstimatedwaittimeWithHttpInfo(String queueId, String conversationId) throws IOException {
    return getRoutingQueueEstimatedwaittime(createGetRoutingQueueEstimatedwaittimeRequest(queueId, conversationId).withHttpInfo());
  }

  private GetRoutingQueueEstimatedwaittimeRequest createGetRoutingQueueEstimatedwaittimeRequest(String queueId, String conversationId) {
    return GetRoutingQueueEstimatedwaittimeRequest.builder()
            .withQueueId(queueId)
    
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param request The request object
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimatedWaitTimePredictions getRoutingQueueEstimatedwaittime(GetRoutingQueueEstimatedwaittimeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EstimatedWaitTimePredictions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueEstimatedwaittime(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EstimatedWaitTimePredictions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)exception;
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
      ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param mediaType mediaType (required)
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimatedWaitTimePredictions getRoutingQueueMediatypeEstimatedwaittime(String queueId, String mediaType) throws IOException, ApiException {
    return  getRoutingQueueMediatypeEstimatedwaittime(createGetRoutingQueueMediatypeEstimatedwaittimeRequest(queueId, mediaType));
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param mediaType mediaType (required)
   * @return EstimatedWaitTimePredictions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueMediatypeEstimatedwaittimeWithHttpInfo(String queueId, String mediaType) throws IOException {
    return getRoutingQueueMediatypeEstimatedwaittime(createGetRoutingQueueMediatypeEstimatedwaittimeRequest(queueId, mediaType).withHttpInfo());
  }

  private GetRoutingQueueMediatypeEstimatedwaittimeRequest createGetRoutingQueueMediatypeEstimatedwaittimeRequest(String queueId, String mediaType) {
    return GetRoutingQueueMediatypeEstimatedwaittimeRequest.builder()
            .withQueueId(queueId)
    
            .withMediaType(mediaType)
    
            .build();
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param request The request object
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimatedWaitTimePredictions getRoutingQueueMediatypeEstimatedwaittime(GetRoutingQueueMediatypeEstimatedwaittimeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EstimatedWaitTimePredictions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueMediatypeEstimatedwaittime(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EstimatedWaitTimePredictions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)exception;
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
      ApiResponse<EstimatedWaitTimePredictions> response = (ApiResponse<EstimatedWaitTimePredictions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the members of this queue.
   * 
   * @param queueId Queue ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize Max value is 100 (optional, default to 25)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @param expand Which fields, if any, to expand. (optional)
   * @param name Filter by queue member name (optional)
   * @param profileSkills Filter by profile skill (optional)
   * @param skills Filter by skill (optional)
   * @param languages Filter by language (optional)
   * @param routingStatus Filter by routing status (optional)
   * @param presence Filter by presence (optional)
   * @param memberBy Filter by member type (optional)
   * @param joined Filter by joined status (optional)
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing getRoutingQueueMembers(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence, String memberBy, Boolean joined) throws IOException, ApiException {
    return  getRoutingQueueMembers(createGetRoutingQueueMembersRequest(queueId, pageNumber, pageSize, sortOrder, expand, name, profileSkills, skills, languages, routingStatus, presence, memberBy, joined));
  }

  /**
   * Get the members of this queue.
   * 
   * @param queueId Queue ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize Max value is 100 (optional, default to 25)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @param expand Which fields, if any, to expand. (optional)
   * @param name Filter by queue member name (optional)
   * @param profileSkills Filter by profile skill (optional)
   * @param skills Filter by skill (optional)
   * @param languages Filter by language (optional)
   * @param routingStatus Filter by routing status (optional)
   * @param presence Filter by presence (optional)
   * @param memberBy Filter by member type (optional)
   * @param joined Filter by joined status (optional)
   * @return QueueMemberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> getRoutingQueueMembersWithHttpInfo(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence, String memberBy, Boolean joined) throws IOException {
    return getRoutingQueueMembers(createGetRoutingQueueMembersRequest(queueId, pageNumber, pageSize, sortOrder, expand, name, profileSkills, skills, languages, routingStatus, presence, memberBy, joined).withHttpInfo());
  }

  private GetRoutingQueueMembersRequest createGetRoutingQueueMembersRequest(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence, String memberBy, Boolean joined) {
    return GetRoutingQueueMembersRequest.builder()
            .withQueueId(queueId)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .withName(name)
    
            .withProfileSkills(profileSkills)
    
            .withSkills(skills)
    
            .withLanguages(languages)
    
            .withRoutingStatus(routingStatus)
    
            .withPresence(presence)
    
            .withMemberBy(memberBy)
    
            .withJoined(joined)
    
            .build();
  }

  /**
   * Get the members of this queue.
   * 
   * @param request The request object
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing getRoutingQueueMembers(GetRoutingQueueMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueMemberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the members of this queue.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> getRoutingQueueMembers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueMemberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * DEPRECATED: use GET /routing/queues/{queueId}/members.  Get the members of this queue.
   * 
   * @param queueId Queue ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize Max value is 100 (optional, default to 25)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @param expand Which fields, if any, to expand. (optional)
   * @param joined Filter by joined status (optional)
   * @param name Filter by queue member name (optional)
   * @param profileSkills Filter by profile skill (optional)
   * @param skills Filter by skill (optional)
   * @param languages Filter by language (optional)
   * @param routingStatus Filter by routing status (optional)
   * @param presence Filter by presence (optional)
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing getRoutingQueueUsers(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, Boolean joined, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence) throws IOException, ApiException {
    return  getRoutingQueueUsers(createGetRoutingQueueUsersRequest(queueId, pageNumber, pageSize, sortOrder, expand, joined, name, profileSkills, skills, languages, routingStatus, presence));
  }

  /**
   * DEPRECATED: use GET /routing/queues/{queueId}/members.  Get the members of this queue.
   * 
   * @param queueId Queue ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize Max value is 100 (optional, default to 25)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @param expand Which fields, if any, to expand. (optional)
   * @param joined Filter by joined status (optional)
   * @param name Filter by queue member name (optional)
   * @param profileSkills Filter by profile skill (optional)
   * @param skills Filter by skill (optional)
   * @param languages Filter by language (optional)
   * @param routingStatus Filter by routing status (optional)
   * @param presence Filter by presence (optional)
   * @return QueueMemberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> getRoutingQueueUsersWithHttpInfo(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, Boolean joined, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence) throws IOException {
    return getRoutingQueueUsers(createGetRoutingQueueUsersRequest(queueId, pageNumber, pageSize, sortOrder, expand, joined, name, profileSkills, skills, languages, routingStatus, presence).withHttpInfo());
  }

  private GetRoutingQueueUsersRequest createGetRoutingQueueUsersRequest(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, Boolean joined, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence) {
    return GetRoutingQueueUsersRequest.builder()
            .withQueueId(queueId)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withSortOrder(sortOrder)
    
            .withExpand(expand)
    
            .withJoined(joined)
    
            .withName(name)
    
            .withProfileSkills(profileSkills)
    
            .withSkills(skills)
    
            .withLanguages(languages)
    
            .withRoutingStatus(routingStatus)
    
            .withPresence(presence)
    
            .build();
  }

  /**
   * DEPRECATED: use GET /routing/queues/{queueId}/members.  Get the members of this queue.
   * 
   * @param request The request object
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing getRoutingQueueUsers(GetRoutingQueueUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueMemberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * DEPRECATED: use GET /routing/queues/{queueId}/members.  Get the members of this queue.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> getRoutingQueueUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueMemberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingQueueWrapupcodes(String queueId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getRoutingQueueWrapupcodes(createGetRoutingQueueWrapupcodesRequest(queueId, pageSize, pageNumber));
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return WrapupCodeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingQueueWrapupcodesWithHttpInfo(String queueId, Integer pageSize, Integer pageNumber) throws IOException {
    return getRoutingQueueWrapupcodes(createGetRoutingQueueWrapupcodesRequest(queueId, pageSize, pageNumber).withHttpInfo());
  }

  private GetRoutingQueueWrapupcodesRequest createGetRoutingQueueWrapupcodesRequest(String queueId, Integer pageSize, Integer pageNumber) {
    return GetRoutingQueueWrapupcodesRequest.builder()
            .withQueueId(queueId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param request The request object
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingQueueWrapupcodes(GetRoutingQueueWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapupCodeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingQueueWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapupCodeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of queues.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @param name Filter by queue name (optional)
   * @param id Filter by queue ID(s) (optional)
   * @param divisionId Filter by queue division ID(s) (optional)
   * @return QueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueEntityListing getRoutingQueues(Integer pageNumber, Integer pageSize, String sortOrder, String name, List<String> id, List<String> divisionId) throws IOException, ApiException {
    return  getRoutingQueues(createGetRoutingQueuesRequest(pageNumber, pageSize, sortOrder, name, id, divisionId));
  }

  /**
   * Get list of queues.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @param name Filter by queue name (optional)
   * @param id Filter by queue ID(s) (optional)
   * @param divisionId Filter by queue division ID(s) (optional)
   * @return QueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueEntityListing> getRoutingQueuesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortOrder, String name, List<String> id, List<String> divisionId) throws IOException {
    return getRoutingQueues(createGetRoutingQueuesRequest(pageNumber, pageSize, sortOrder, name, id, divisionId).withHttpInfo());
  }

  private GetRoutingQueuesRequest createGetRoutingQueuesRequest(Integer pageNumber, Integer pageSize, String sortOrder, String name, List<String> id, List<String> divisionId) {
    return GetRoutingQueuesRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withSortOrder(sortOrder)
    
            .withName(name)
    
            .withId(id)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get list of queues.
   * 
   * @param request The request object
   * @return QueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueEntityListing getRoutingQueues(GetRoutingQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of queues.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueEntityListing> getRoutingQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).
   * 
   * @param pageSize Page size [max value is 100] (optional, default to 25)
   * @param pageNumber Page number [max value is 5] (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name (optional)
   * @param id Queue ID(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @return QueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueEntityListing getRoutingQueuesDivisionviews(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id, List<String> divisionId) throws IOException, ApiException {
    return  getRoutingQueuesDivisionviews(createGetRoutingQueuesDivisionviewsRequest(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId));
  }

  /**
   * Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).
   * 
   * @param pageSize Page size [max value is 100] (optional, default to 25)
   * @param pageNumber Page number [max value is 5] (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name (optional)
   * @param id Queue ID(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @return QueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueEntityListing> getRoutingQueuesDivisionviewsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id, List<String> divisionId) throws IOException {
    return getRoutingQueuesDivisionviews(createGetRoutingQueuesDivisionviewsRequest(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId).withHttpInfo());
  }

  private GetRoutingQueuesDivisionviewsRequest createGetRoutingQueuesDivisionviewsRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id, List<String> divisionId) {
    return GetRoutingQueuesDivisionviewsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withName(name)
    
            .withId(id)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).
   * 
   * @param request The request object
   * @return QueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueEntityListing getRoutingQueuesDivisionviews(GetRoutingQueuesDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueEntityListing> getRoutingQueuesDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a paged listing of simplified queue objects, sorted by name.  Can be used to get a digest of all queues in an organization.
   * 
   * @param pageSize Page size [max value is 500] (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to asc)
   * @return QueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueEntityListing getRoutingQueuesDivisionviewsAll(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getRoutingQueuesDivisionviewsAll(createGetRoutingQueuesDivisionviewsAllRequest(pageSize, pageNumber, sortOrder));
  }

  /**
   * Get a paged listing of simplified queue objects, sorted by name.  Can be used to get a digest of all queues in an organization.
   * 
   * @param pageSize Page size [max value is 500] (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order (optional, default to asc)
   * @return QueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueEntityListing> getRoutingQueuesDivisionviewsAllWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getRoutingQueuesDivisionviewsAll(createGetRoutingQueuesDivisionviewsAllRequest(pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetRoutingQueuesDivisionviewsAllRequest createGetRoutingQueuesDivisionviewsAllRequest(Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetRoutingQueuesDivisionviewsAllRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get a paged listing of simplified queue objects, sorted by name.  Can be used to get a digest of all queues in an organization.
   * 
   * @param request The request object
   * @return QueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueEntityListing getRoutingQueuesDivisionviewsAll(GetRoutingQueuesDivisionviewsAllRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a paged listing of simplified queue objects, sorted by name.  Can be used to get a digest of all queues in an organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueEntityListing> getRoutingQueuesDivisionviewsAll(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueEntityListing> response = (ApiResponse<QueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a paged listing of queues the user is a member of.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param joined Filter by joined status. (optional)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getRoutingQueuesMe(Integer pageNumber, Integer pageSize, Boolean joined, String sortOrder) throws IOException, ApiException {
    return  getRoutingQueuesMe(createGetRoutingQueuesMeRequest(pageNumber, pageSize, joined, sortOrder));
  }

  /**
   * Get a paged listing of queues the user is a member of.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param joined Filter by joined status. (optional)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @return UserQueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getRoutingQueuesMeWithHttpInfo(Integer pageNumber, Integer pageSize, Boolean joined, String sortOrder) throws IOException {
    return getRoutingQueuesMe(createGetRoutingQueuesMeRequest(pageNumber, pageSize, joined, sortOrder).withHttpInfo());
  }

  private GetRoutingQueuesMeRequest createGetRoutingQueuesMeRequest(Integer pageNumber, Integer pageSize, Boolean joined, String sortOrder) {
    return GetRoutingQueuesMeRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withJoined(joined)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get a paged listing of queues the user is a member of.
   * 
   * @param request The request object
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getRoutingQueuesMe(GetRoutingQueuesMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a paged listing of queues the user is a member of.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getRoutingQueuesMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an organization&#39;s routing settings
   * 
   * @return RoutingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSettings getRoutingSettings() throws IOException, ApiException {
    return  getRoutingSettings(createGetRoutingSettingsRequest());
  }

  /**
   * Get an organization&#39;s routing settings
   * 
   * @return RoutingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSettings> getRoutingSettingsWithHttpInfo() throws IOException {
    return getRoutingSettings(createGetRoutingSettingsRequest().withHttpInfo());
  }

  private GetRoutingSettingsRequest createGetRoutingSettingsRequest() {
    return GetRoutingSettingsRequest.builder()
            .build();
  }

  /**
   * Get an organization&#39;s routing settings
   * 
   * @param request The request object
   * @return RoutingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSettings getRoutingSettings(GetRoutingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an organization&#39;s routing settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSettings> getRoutingSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingSettings> response = (ApiResponse<RoutingSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingSettings> response = (ApiResponse<RoutingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Contact Center Settings
   * 
   * @return ContactCenterSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactCenterSettings getRoutingSettingsContactcenter() throws IOException, ApiException {
    return  getRoutingSettingsContactcenter(createGetRoutingSettingsContactcenterRequest());
  }

  /**
   * Get Contact Center Settings
   * 
   * @return ContactCenterSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactCenterSettings> getRoutingSettingsContactcenterWithHttpInfo() throws IOException {
    return getRoutingSettingsContactcenter(createGetRoutingSettingsContactcenterRequest().withHttpInfo());
  }

  private GetRoutingSettingsContactcenterRequest createGetRoutingSettingsContactcenterRequest() {
    return GetRoutingSettingsContactcenterRequest.builder()
            .build();
  }

  /**
   * Get Contact Center Settings
   * 
   * @param request The request object
   * @return ContactCenterSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactCenterSettings getRoutingSettingsContactcenter(GetRoutingSettingsContactcenterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactCenterSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactCenterSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Contact Center Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactCenterSettings> getRoutingSettingsContactcenter(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactCenterSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactCenterSettings> response = (ApiResponse<ContactCenterSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactCenterSettings> response = (ApiResponse<ContactCenterSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Transcription Settings
   * 
   * @return TranscriptionSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptionSettings getRoutingSettingsTranscription() throws IOException, ApiException {
    return  getRoutingSettingsTranscription(createGetRoutingSettingsTranscriptionRequest());
  }

  /**
   * Get Transcription Settings
   * 
   * @return TranscriptionSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptionSettings> getRoutingSettingsTranscriptionWithHttpInfo() throws IOException {
    return getRoutingSettingsTranscription(createGetRoutingSettingsTranscriptionRequest().withHttpInfo());
  }

  private GetRoutingSettingsTranscriptionRequest createGetRoutingSettingsTranscriptionRequest() {
    return GetRoutingSettingsTranscriptionRequest.builder()
            .build();
  }

  /**
   * Get Transcription Settings
   * 
   * @param request The request object
   * @return TranscriptionSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptionSettings getRoutingSettingsTranscription(GetRoutingSettingsTranscriptionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TranscriptionSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TranscriptionSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Transcription Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptionSettings> getRoutingSettingsTranscription(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TranscriptionSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptionSettings> response = (ApiResponse<TranscriptionSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<TranscriptionSettings> response = (ApiResponse<TranscriptionSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return RoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSkill getRoutingSkill(String skillId) throws IOException, ApiException {
    return  getRoutingSkill(createGetRoutingSkillRequest(skillId));
  }

  /**
   * Get Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return RoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSkill> getRoutingSkillWithHttpInfo(String skillId) throws IOException {
    return getRoutingSkill(createGetRoutingSkillRequest(skillId).withHttpInfo());
  }

  private GetRoutingSkillRequest createGetRoutingSkillRequest(String skillId) {
    return GetRoutingSkillRequest.builder()
            .withSkillId(skillId)
    
            .build();
  }

  /**
   * Get Routing Skill
   * 
   * @param request The request object
   * @return RoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSkill getRoutingSkill(GetRoutingSkillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Routing Skill
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSkill> getRoutingSkill(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of routing skills.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Filter for results that start with this value (optional)
   * @param id id (optional)
   * @return SkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillEntityListing getRoutingSkills(Integer pageSize, Integer pageNumber, String name, List<String> id) throws IOException, ApiException {
    return  getRoutingSkills(createGetRoutingSkillsRequest(pageSize, pageNumber, name, id));
  }

  /**
   * Get the list of routing skills.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Filter for results that start with this value (optional)
   * @param id id (optional)
   * @return SkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillEntityListing> getRoutingSkillsWithHttpInfo(Integer pageSize, Integer pageNumber, String name, List<String> id) throws IOException {
    return getRoutingSkills(createGetRoutingSkillsRequest(pageSize, pageNumber, name, id).withHttpInfo());
  }

  private GetRoutingSkillsRequest createGetRoutingSkillsRequest(Integer pageSize, Integer pageNumber, String name, List<String> id) {
    return GetRoutingSkillsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withName(name)
    
            .withId(id)
    
            .build();
  }

  /**
   * Get the list of routing skills.
   * 
   * @param request The request object
   * @return SkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillEntityListing getRoutingSkills(GetRoutingSkillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of routing skills.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillEntityListing> getRoutingSkills(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SkillEntityListing> response = (ApiResponse<SkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SkillEntityListing> response = (ApiResponse<SkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an Address by Id for SMS
   * 
   * @param addressId Address ID (required)
   * @return SmsAddress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsAddress getRoutingSmsAddress(String addressId) throws IOException, ApiException {
    return  getRoutingSmsAddress(createGetRoutingSmsAddressRequest(addressId));
  }

  /**
   * Get an Address by Id for SMS
   * 
   * @param addressId Address ID (required)
   * @return SmsAddress
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsAddress> getRoutingSmsAddressWithHttpInfo(String addressId) throws IOException {
    return getRoutingSmsAddress(createGetRoutingSmsAddressRequest(addressId).withHttpInfo());
  }

  private GetRoutingSmsAddressRequest createGetRoutingSmsAddressRequest(String addressId) {
    return GetRoutingSmsAddressRequest.builder()
            .withAddressId(addressId)
    
            .build();
  }

  /**
   * Get an Address by Id for SMS
   * 
   * @param request The request object
   * @return SmsAddress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsAddress getRoutingSmsAddress(GetRoutingSmsAddressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SmsAddress> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SmsAddress>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Address by Id for SMS
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsAddress> getRoutingSmsAddress(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SmsAddress>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SmsAddress> response = (ApiResponse<SmsAddress>)(ApiResponse<?>)exception;
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
      ApiResponse<SmsAddress> response = (ApiResponse<SmsAddress>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of Addresses for SMS
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SmsAddressEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsAddressEntityListing getRoutingSmsAddresses(Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getRoutingSmsAddresses(createGetRoutingSmsAddressesRequest(pageSize, pageNumber));
  }

  /**
   * Get a list of Addresses for SMS
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SmsAddressEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsAddressEntityListing> getRoutingSmsAddressesWithHttpInfo(Integer pageSize, Integer pageNumber) throws IOException {
    return getRoutingSmsAddresses(createGetRoutingSmsAddressesRequest(pageSize, pageNumber).withHttpInfo());
  }

  private GetRoutingSmsAddressesRequest createGetRoutingSmsAddressesRequest(Integer pageSize, Integer pageNumber) {
    return GetRoutingSmsAddressesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of Addresses for SMS
   * 
   * @param request The request object
   * @return SmsAddressEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsAddressEntityListing getRoutingSmsAddresses(GetRoutingSmsAddressesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SmsAddressEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SmsAddressEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Addresses for SMS
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsAddressEntityListing> getRoutingSmsAddresses(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SmsAddressEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SmsAddressEntityListing> response = (ApiResponse<SmsAddressEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SmsAddressEntityListing> response = (ApiResponse<SmsAddressEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of available phone numbers for SMS provisioning.
   * This request will return up to 30 random phone numbers matching the criteria specified.  To get additional phone numbers repeat the request.
   * @param countryCode The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned (required)
   * @param phoneNumberType Type of available phone numbers searched (required)
   * @param region Region/province/state that can be used to restrict the numbers returned (optional)
   * @param city City that can be used to restrict the numbers returned (optional)
   * @param areaCode Area code that can be used to restrict the numbers returned (optional)
   * @param pattern A pattern to match phone numbers. Valid characters are &#39;*&#39; and [0-9a-zA-Z]. The &#39;*&#39; character will match any single digit. (optional)
   * @param addressRequirement This indicates whether the phone number requires to have an Address registered. (optional)
   * @return SMSAvailablePhoneNumberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SMSAvailablePhoneNumberEntityListing getRoutingSmsAvailablephonenumbers(String countryCode, String phoneNumberType, String region, String city, String areaCode, String pattern, String addressRequirement) throws IOException, ApiException {
    return  getRoutingSmsAvailablephonenumbers(createGetRoutingSmsAvailablephonenumbersRequest(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement));
  }

  /**
   * Get a list of available phone numbers for SMS provisioning.
   * This request will return up to 30 random phone numbers matching the criteria specified.  To get additional phone numbers repeat the request.
   * @param countryCode The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned (required)
   * @param phoneNumberType Type of available phone numbers searched (required)
   * @param region Region/province/state that can be used to restrict the numbers returned (optional)
   * @param city City that can be used to restrict the numbers returned (optional)
   * @param areaCode Area code that can be used to restrict the numbers returned (optional)
   * @param pattern A pattern to match phone numbers. Valid characters are &#39;*&#39; and [0-9a-zA-Z]. The &#39;*&#39; character will match any single digit. (optional)
   * @param addressRequirement This indicates whether the phone number requires to have an Address registered. (optional)
   * @return SMSAvailablePhoneNumberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SMSAvailablePhoneNumberEntityListing> getRoutingSmsAvailablephonenumbersWithHttpInfo(String countryCode, String phoneNumberType, String region, String city, String areaCode, String pattern, String addressRequirement) throws IOException {
    return getRoutingSmsAvailablephonenumbers(createGetRoutingSmsAvailablephonenumbersRequest(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement).withHttpInfo());
  }

  private GetRoutingSmsAvailablephonenumbersRequest createGetRoutingSmsAvailablephonenumbersRequest(String countryCode, String phoneNumberType, String region, String city, String areaCode, String pattern, String addressRequirement) {
    return GetRoutingSmsAvailablephonenumbersRequest.builder()
            .withCountryCode(countryCode)
    
            .withPhoneNumberType(phoneNumberType)
    
            .withRegion(region)
    
            .withCity(city)
    
            .withAreaCode(areaCode)
    
            .withPattern(pattern)
    
            .withAddressRequirement(addressRequirement)
    
            .build();
  }

  /**
   * Get a list of available phone numbers for SMS provisioning.
   * This request will return up to 30 random phone numbers matching the criteria specified.  To get additional phone numbers repeat the request.
   * @param request The request object
   * @return SMSAvailablePhoneNumberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SMSAvailablePhoneNumberEntityListing getRoutingSmsAvailablephonenumbers(GetRoutingSmsAvailablephonenumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SMSAvailablePhoneNumberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SMSAvailablePhoneNumberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of available phone numbers for SMS provisioning.
   * This request will return up to 30 random phone numbers matching the criteria specified.  To get additional phone numbers repeat the request.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SMSAvailablePhoneNumberEntityListing> getRoutingSmsAvailablephonenumbers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SMSAvailablePhoneNumberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SMSAvailablePhoneNumberEntityListing> response = (ApiResponse<SMSAvailablePhoneNumberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SMSAvailablePhoneNumberEntityListing> response = (ApiResponse<SMSAvailablePhoneNumberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a phone number provisioned for SMS.
   * 
   * @param addressId Address ID (required)
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber getRoutingSmsPhonenumber(String addressId) throws IOException, ApiException {
    return  getRoutingSmsPhonenumber(createGetRoutingSmsPhonenumberRequest(addressId));
  }

  /**
   * Get a phone number provisioned for SMS.
   * 
   * @param addressId Address ID (required)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> getRoutingSmsPhonenumberWithHttpInfo(String addressId) throws IOException {
    return getRoutingSmsPhonenumber(createGetRoutingSmsPhonenumberRequest(addressId).withHttpInfo());
  }

  private GetRoutingSmsPhonenumberRequest createGetRoutingSmsPhonenumberRequest(String addressId) {
    return GetRoutingSmsPhonenumberRequest.builder()
            .withAddressId(addressId)
    
            .build();
  }

  /**
   * Get a phone number provisioned for SMS.
   * 
   * @param request The request object
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber getRoutingSmsPhonenumber(GetRoutingSmsPhonenumberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SmsPhoneNumber> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SmsPhoneNumber>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a phone number provisioned for SMS.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> getRoutingSmsPhonenumber(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SmsPhoneNumber>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SmsPhoneNumber> response = (ApiResponse<SmsPhoneNumber>)(ApiResponse<?>)exception;
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
      ApiResponse<SmsPhoneNumber> response = (ApiResponse<SmsPhoneNumber>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of provisioned phone numbers.
   * 
   * @param phoneNumber Filter on phone number address. Allowable characters are the digits &#39;0-9&#39; and the wild card character &#39;\\*&#39;. If just digits are present, a contains search is done on the address pattern. For example, &#39;317&#39; could be matched anywhere in the address. An &#39;\\*&#39; will match multiple digits. For example, to match a specific area code within the US a pattern like &#39;1317*&#39; could be used. (optional)
   * @param phoneNumberType Filter on phone number type (optional)
   * @param phoneNumberStatus Filter on phone number status (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SmsPhoneNumberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumberEntityListing getRoutingSmsPhonenumbers(String phoneNumber, String phoneNumberType, String phoneNumberStatus, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getRoutingSmsPhonenumbers(createGetRoutingSmsPhonenumbersRequest(phoneNumber, phoneNumberType, phoneNumberStatus, pageSize, pageNumber));
  }

  /**
   * Get a list of provisioned phone numbers.
   * 
   * @param phoneNumber Filter on phone number address. Allowable characters are the digits &#39;0-9&#39; and the wild card character &#39;\\*&#39;. If just digits are present, a contains search is done on the address pattern. For example, &#39;317&#39; could be matched anywhere in the address. An &#39;\\*&#39; will match multiple digits. For example, to match a specific area code within the US a pattern like &#39;1317*&#39; could be used. (optional)
   * @param phoneNumberType Filter on phone number type (optional)
   * @param phoneNumberStatus Filter on phone number status (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return SmsPhoneNumberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumberEntityListing> getRoutingSmsPhonenumbersWithHttpInfo(String phoneNumber, String phoneNumberType, String phoneNumberStatus, Integer pageSize, Integer pageNumber) throws IOException {
    return getRoutingSmsPhonenumbers(createGetRoutingSmsPhonenumbersRequest(phoneNumber, phoneNumberType, phoneNumberStatus, pageSize, pageNumber).withHttpInfo());
  }

  private GetRoutingSmsPhonenumbersRequest createGetRoutingSmsPhonenumbersRequest(String phoneNumber, String phoneNumberType, String phoneNumberStatus, Integer pageSize, Integer pageNumber) {
    return GetRoutingSmsPhonenumbersRequest.builder()
            .withPhoneNumber(phoneNumber)
    
            .withPhoneNumberType(phoneNumberType)
    
            .withPhoneNumberStatus(phoneNumberStatus)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .build();
  }

  /**
   * Get a list of provisioned phone numbers.
   * 
   * @param request The request object
   * @return SmsPhoneNumberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumberEntityListing getRoutingSmsPhonenumbers(GetRoutingSmsPhonenumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SmsPhoneNumberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SmsPhoneNumberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of provisioned phone numbers.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumberEntityListing> getRoutingSmsPhonenumbers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SmsPhoneNumberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SmsPhoneNumberEntityListing> response = (ApiResponse<SmsPhoneNumberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SmsPhoneNumberEntityListing> response = (ApiResponse<SmsPhoneNumberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param userId User ID (required)
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization getRoutingUserUtilization(String userId) throws IOException, ApiException {
    return  getRoutingUserUtilization(createGetRoutingUserUtilizationRequest(userId));
  }

  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param userId User ID (required)
   * @return AgentMaxUtilization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> getRoutingUserUtilizationWithHttpInfo(String userId) throws IOException {
    return getRoutingUserUtilization(createGetRoutingUserUtilizationRequest(userId).withHttpInfo());
  }

  private GetRoutingUserUtilizationRequest createGetRoutingUserUtilizationRequest(String userId) {
    return GetRoutingUserUtilizationRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param request The request object
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization getRoutingUserUtilization(GetRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentMaxUtilization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentMaxUtilization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the user&#39;s max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> getRoutingUserUtilization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentMaxUtilization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the organization-wide max utilization settings.
   * 
   * @return Utilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Utilization getRoutingUtilization() throws IOException, ApiException {
    return  getRoutingUtilization(createGetRoutingUtilizationRequest());
  }

  /**
   * Get the organization-wide max utilization settings.
   * 
   * @return Utilization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Utilization> getRoutingUtilizationWithHttpInfo() throws IOException {
    return getRoutingUtilization(createGetRoutingUtilizationRequest().withHttpInfo());
  }

  private GetRoutingUtilizationRequest createGetRoutingUtilizationRequest() {
    return GetRoutingUtilizationRequest.builder()
            .build();
  }

  /**
   * Get the organization-wide max utilization settings.
   * 
   * @param request The request object
   * @return Utilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Utilization getRoutingUtilization(GetRoutingUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Utilization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Utilization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the organization-wide max utilization settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Utilization> getRoutingUtilization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Utilization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)exception;
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
      ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get details about this wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode getRoutingWrapupcode(String codeId) throws IOException, ApiException {
    return  getRoutingWrapupcode(createGetRoutingWrapupcodeRequest(codeId));
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return WrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> getRoutingWrapupcodeWithHttpInfo(String codeId) throws IOException {
    return getRoutingWrapupcode(createGetRoutingWrapupcodeRequest(codeId).withHttpInfo());
  }

  private GetRoutingWrapupcodeRequest createGetRoutingWrapupcodeRequest(String codeId) {
    return GetRoutingWrapupcodeRequest.builder()
            .withCodeId(codeId)
    
            .build();
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @param request The request object
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode getRoutingWrapupcode(GetRoutingWrapupcodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> getRoutingWrapupcode(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of wrapup codes.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param name Wrapup code&#39;s name (&#39;Sort by&#39; param is ignored unless this field is provided) (optional)
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingWrapupcodes(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name) throws IOException, ApiException {
    return  getRoutingWrapupcodes(createGetRoutingWrapupcodesRequest(pageSize, pageNumber, sortBy, sortOrder, name));
  }

  /**
   * Get list of wrapup codes.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param name Wrapup code&#39;s name (&#39;Sort by&#39; param is ignored unless this field is provided) (optional)
   * @return WrapupCodeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingWrapupcodesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name) throws IOException {
    return getRoutingWrapupcodes(createGetRoutingWrapupcodesRequest(pageSize, pageNumber, sortBy, sortOrder, name).withHttpInfo());
  }

  private GetRoutingWrapupcodesRequest createGetRoutingWrapupcodesRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name) {
    return GetRoutingWrapupcodesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withName(name)
    
            .build();
  }

  /**
   * Get list of wrapup codes.
   * 
   * @param request The request object
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingWrapupcodes(GetRoutingWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapupCodeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of wrapup codes.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingWrapupcodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapupCodeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapupCodeEntityListing> response = (ApiResponse<WrapupCodeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getUserQueues(String userId, Integer pageSize, Integer pageNumber, Boolean joined, List<String> divisionId) throws IOException, ApiException {
    return  getUserQueues(createGetUserQueuesRequest(userId, pageSize, pageNumber, joined, divisionId));
  }

  /**
   * Get queues for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param joined Is joined to the queue (optional, default to true)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getUserQueuesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, Boolean joined, List<String> divisionId) throws IOException {
    return getUserQueues(createGetUserQueuesRequest(userId, pageSize, pageNumber, joined, divisionId).withHttpInfo());
  }

  private GetUserQueuesRequest createGetUserQueuesRequest(String userId, Integer pageSize, Integer pageNumber, Boolean joined, List<String> divisionId) {
    return GetUserQueuesRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withJoined(joined)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get queues for user
   * 
   * @param request The request object
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing getUserQueues(GetUserQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get queues for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> getUserQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List routing language for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing getUserRoutinglanguages(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getUserRoutinglanguages(createGetUserRoutinglanguagesRequest(userId, pageSize, pageNumber, sortOrder));
  }

  /**
   * List routing language for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserLanguageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> getUserRoutinglanguagesWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getUserRoutinglanguages(createGetUserRoutinglanguagesRequest(userId, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetUserRoutinglanguagesRequest createGetUserRoutinglanguagesRequest(String userId, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetUserRoutinglanguagesRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * List routing language for user
   * 
   * @param request The request object
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing getUserRoutinglanguages(GetUserRoutinglanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserLanguageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserLanguageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List routing language for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> getUserRoutinglanguages(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserLanguageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing getUserRoutingskills(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return  getUserRoutingskills(createGetUserRoutingskillsRequest(userId, pageSize, pageNumber, sortOrder));
  }

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskillsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException {
    return getUserRoutingskills(createGetUserRoutingskillsRequest(userId, pageSize, pageNumber, sortOrder).withHttpInfo());
  }

  private GetUserRoutingskillsRequest createGetUserRoutingskillsRequest(String userId, Integer pageSize, Integer pageNumber, String sortOrder) {
    return GetUserRoutingskillsRequest.builder()
            .withUserId(userId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * List routing skills for user
   * 
   * @param request The request object
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing getUserRoutingskills(GetUserRoutingskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List routing skills for user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskills(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update attributes of an in-queue conversation
   * Returns an object indicating the updated values of all settable attributes. Supported attributes: skillIds, languageId, and priority.
   * @param conversationId Conversation ID (required)
   * @param body Conversation Attributes (required)
   * @return RoutingConversationAttributesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingConversationAttributesResponse patchRoutingConversation(String conversationId, RoutingConversationAttributesRequest body) throws IOException, ApiException {
    return  patchRoutingConversation(createPatchRoutingConversationRequest(conversationId, body));
  }

  /**
   * Update attributes of an in-queue conversation
   * Returns an object indicating the updated values of all settable attributes. Supported attributes: skillIds, languageId, and priority.
   * @param conversationId Conversation ID (required)
   * @param body Conversation Attributes (required)
   * @return RoutingConversationAttributesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingConversationAttributesResponse> patchRoutingConversationWithHttpInfo(String conversationId, RoutingConversationAttributesRequest body) throws IOException {
    return patchRoutingConversation(createPatchRoutingConversationRequest(conversationId, body).withHttpInfo());
  }

  private PatchRoutingConversationRequest createPatchRoutingConversationRequest(String conversationId, RoutingConversationAttributesRequest body) {
    return PatchRoutingConversationRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update attributes of an in-queue conversation
   * Returns an object indicating the updated values of all settable attributes. Supported attributes: skillIds, languageId, and priority.
   * @param request The request object
   * @return RoutingConversationAttributesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingConversationAttributesResponse patchRoutingConversation(PatchRoutingConversationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingConversationAttributesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingConversationAttributesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update attributes of an in-queue conversation
   * Returns an object indicating the updated values of all settable attributes. Supported attributes: skillIds, languageId, and priority.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingConversationAttributesResponse> patchRoutingConversation(ApiRequest<RoutingConversationAttributesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingConversationAttributesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingConversationAttributesResponse> response = (ApiResponse<RoutingConversationAttributesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingConversationAttributesResponse> response = (ApiResponse<RoutingConversationAttributesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update domain settings
   * 
   * @param domainId domain ID (required)
   * @param body Domain settings (required)
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain patchRoutingEmailDomain(String domainId, InboundDomainPatchRequest body) throws IOException, ApiException {
    return  patchRoutingEmailDomain(createPatchRoutingEmailDomainRequest(domainId, body));
  }

  /**
   * Update domain settings
   * 
   * @param domainId domain ID (required)
   * @param body Domain settings (required)
   * @return InboundDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> patchRoutingEmailDomainWithHttpInfo(String domainId, InboundDomainPatchRequest body) throws IOException {
    return patchRoutingEmailDomain(createPatchRoutingEmailDomainRequest(domainId, body).withHttpInfo());
  }

  private PatchRoutingEmailDomainRequest createPatchRoutingEmailDomainRequest(String domainId, InboundDomainPatchRequest body) {
    return PatchRoutingEmailDomainRequest.builder()
            .withDomainId(domainId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update domain settings
   * 
   * @param request The request object
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain patchRoutingEmailDomain(PatchRoutingEmailDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update domain settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> patchRoutingEmailDomain(ApiRequest<InboundDomainPatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Validate domain settings
   * 
   * @param domainId domain ID (required)
   * @param body Domain settings (required)
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain patchRoutingEmailDomainValidate(String domainId, InboundDomainPatchRequest body) throws IOException, ApiException {
    return  patchRoutingEmailDomainValidate(createPatchRoutingEmailDomainValidateRequest(domainId, body));
  }

  /**
   * Validate domain settings
   * 
   * @param domainId domain ID (required)
   * @param body Domain settings (required)
   * @return InboundDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> patchRoutingEmailDomainValidateWithHttpInfo(String domainId, InboundDomainPatchRequest body) throws IOException {
    return patchRoutingEmailDomainValidate(createPatchRoutingEmailDomainValidateRequest(domainId, body).withHttpInfo());
  }

  private PatchRoutingEmailDomainValidateRequest createPatchRoutingEmailDomainValidateRequest(String domainId, InboundDomainPatchRequest body) {
    return PatchRoutingEmailDomainValidateRequest.builder()
            .withDomainId(domainId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Validate domain settings
   * 
   * @param request The request object
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain patchRoutingEmailDomainValidate(PatchRoutingEmailDomainValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate domain settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> patchRoutingEmailDomainValidate(ApiRequest<InboundDomainPatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update single predictor.
   * 
   * @param predictorId Predictor ID (required)
   * @param body  (optional)
   * @return Predictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Predictor patchRoutingPredictor(String predictorId, PatchPredictorRequest body) throws IOException, ApiException {
    return  patchRoutingPredictor(createPatchRoutingPredictorRequest(predictorId, body));
  }

  /**
   * Update single predictor.
   * 
   * @param predictorId Predictor ID (required)
   * @param body  (optional)
   * @return Predictor
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Predictor> patchRoutingPredictorWithHttpInfo(String predictorId, PatchPredictorRequest body) throws IOException {
    return patchRoutingPredictor(createPatchRoutingPredictorRequest(predictorId, body).withHttpInfo());
  }

  private PatchRoutingPredictorRequest createPatchRoutingPredictorRequest(String predictorId, PatchPredictorRequest body) {
    return PatchRoutingPredictorRequest.builder()
            .withPredictorId(predictorId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update single predictor.
   * 
   * @param request The request object
   * @return Predictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Predictor patchRoutingPredictor(PatchRoutingPredictorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Predictor> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Predictor>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update single predictor.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Predictor> patchRoutingPredictor(ApiRequest<PatchPredictorRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Predictor>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Predictor> response = (ApiResponse<Predictor>)(ApiResponse<?>)exception;
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
      ApiResponse<Predictor> response = (ApiResponse<Predictor>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the ring number OR joined status for a queue member.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchRoutingQueueMember(String queueId, String memberId, QueueMember body) throws IOException, ApiException {
     patchRoutingQueueMember(createPatchRoutingQueueMemberRequest(queueId, memberId, body));
  }

  /**
   * Update the ring number OR joined status for a queue member.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchRoutingQueueMemberWithHttpInfo(String queueId, String memberId, QueueMember body) throws IOException {
    return patchRoutingQueueMember(createPatchRoutingQueueMemberRequest(queueId, memberId, body).withHttpInfo());
  }

  private PatchRoutingQueueMemberRequest createPatchRoutingQueueMemberRequest(String queueId, String memberId, QueueMember body) {
    return PatchRoutingQueueMemberRequest.builder()
            .withQueueId(queueId)
    
            .withMemberId(memberId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the ring number OR joined status for a queue member.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchRoutingQueueMember(PatchRoutingQueueMemberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the ring number OR joined status for a queue member.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchRoutingQueueMember(ApiRequest<QueueMember> request) throws IOException {
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
   * Join or unjoin a set of users for a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing patchRoutingQueueMembers(String queueId, List<QueueMember> body) throws IOException, ApiException {
    return  patchRoutingQueueMembers(createPatchRoutingQueueMembersRequest(queueId, body));
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return QueueMemberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> patchRoutingQueueMembersWithHttpInfo(String queueId, List<QueueMember> body) throws IOException {
    return patchRoutingQueueMembers(createPatchRoutingQueueMembersRequest(queueId, body).withHttpInfo());
  }

  private PatchRoutingQueueMembersRequest createPatchRoutingQueueMembersRequest(String queueId, List<QueueMember> body) {
    return PatchRoutingQueueMembersRequest.builder()
            .withQueueId(queueId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @param request The request object
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing patchRoutingQueueMembers(PatchRoutingQueueMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueMemberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> patchRoutingQueueMembers(ApiRequest<List<QueueMember>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueMemberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}.  Update the ring number OR joined status for a User in a Queue.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchRoutingQueueUser(String queueId, String memberId, QueueMember body) throws IOException, ApiException {
     patchRoutingQueueUser(createPatchRoutingQueueUserRequest(queueId, memberId, body));
  }

  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}.  Update the ring number OR joined status for a User in a Queue.
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchRoutingQueueUserWithHttpInfo(String queueId, String memberId, QueueMember body) throws IOException {
    return patchRoutingQueueUser(createPatchRoutingQueueUserRequest(queueId, memberId, body).withHttpInfo());
  }

  private PatchRoutingQueueUserRequest createPatchRoutingQueueUserRequest(String queueId, String memberId, QueueMember body) {
    return PatchRoutingQueueUserRequest.builder()
            .withQueueId(queueId)
    
            .withMemberId(memberId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}.  Update the ring number OR joined status for a User in a Queue.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchRoutingQueueUser(PatchRoutingQueueUserRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}.  Update the ring number OR joined status for a User in a Queue.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchRoutingQueueUser(ApiRequest<QueueMember> request) throws IOException {
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
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue.
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing patchRoutingQueueUsers(String queueId, List<QueueMember> body) throws IOException, ApiException {
    return  patchRoutingQueueUsers(createPatchRoutingQueueUsersRequest(queueId, body));
  }

  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue.
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return QueueMemberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> patchRoutingQueueUsersWithHttpInfo(String queueId, List<QueueMember> body) throws IOException {
    return patchRoutingQueueUsers(createPatchRoutingQueueUsersRequest(queueId, body).withHttpInfo());
  }

  private PatchRoutingQueueUsersRequest createPatchRoutingQueueUsersRequest(String queueId, List<QueueMember> body) {
    return PatchRoutingQueueUsersRequest.builder()
            .withQueueId(queueId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue.
   * 
   * @param request The request object
   * @return QueueMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueMemberEntityListing patchRoutingQueueUsers(PatchRoutingQueueUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueMemberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueMemberEntityListing> patchRoutingQueueUsers(ApiRequest<List<QueueMember>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueMemberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueMemberEntityListing> response = (ApiResponse<QueueMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update Contact Center Settings
   * 
   * @param body Contact Center Settings (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchRoutingSettingsContactcenter(ContactCenterSettings body) throws IOException, ApiException {
     patchRoutingSettingsContactcenter(createPatchRoutingSettingsContactcenterRequest(body));
  }

  /**
   * Update Contact Center Settings
   * 
   * @param body Contact Center Settings (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchRoutingSettingsContactcenterWithHttpInfo(ContactCenterSettings body) throws IOException {
    return patchRoutingSettingsContactcenter(createPatchRoutingSettingsContactcenterRequest(body).withHttpInfo());
  }

  private PatchRoutingSettingsContactcenterRequest createPatchRoutingSettingsContactcenterRequest(ContactCenterSettings body) {
    return PatchRoutingSettingsContactcenterRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update Contact Center Settings
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchRoutingSettingsContactcenter(PatchRoutingSettingsContactcenterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update Contact Center Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchRoutingSettingsContactcenter(ApiRequest<ContactCenterSettings> request) throws IOException {
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
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueue patchUserQueue(String queueId, String userId, UserQueue body) throws IOException, ApiException {
    return  patchUserQueue(createPatchUserQueueRequest(queueId, userId, body));
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param queueId Queue ID (required)
   * @param userId User ID (required)
   * @param body Queue Member (required)
   * @return UserQueue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueue> patchUserQueueWithHttpInfo(String queueId, String userId, UserQueue body) throws IOException {
    return patchUserQueue(createPatchUserQueueRequest(queueId, userId, body).withHttpInfo());
  }

  private PatchUserQueueRequest createPatchUserQueueRequest(String queueId, String userId, UserQueue body) {
    return PatchUserQueueRequest.builder()
            .withQueueId(queueId)
    
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param request The request object
   * @return UserQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueue patchUserQueue(PatchUserQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Join or unjoin a queue for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueue> patchUserQueue(ApiRequest<UserQueue> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueue> response = (ApiResponse<UserQueue>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueue> response = (ApiResponse<UserQueue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing patchUserQueues(String userId, List<UserQueue> body, List<String> divisionId) throws IOException, ApiException {
    return  patchUserQueues(createPatchUserQueuesRequest(userId, body, divisionId));
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param userId User ID (required)
   * @param body User Queues (required)
   * @param divisionId Division ID(s) (optional)
   * @return UserQueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueuesWithHttpInfo(String userId, List<UserQueue> body, List<String> divisionId) throws IOException {
    return patchUserQueues(createPatchUserQueuesRequest(userId, body, divisionId).withHttpInfo());
  }

  private PatchUserQueuesRequest createPatchUserQueuesRequest(String userId, List<UserQueue> body, List<String> divisionId) {
    return PatchUserQueuesRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param request The request object
   * @return UserQueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserQueueEntityListing patchUserQueues(PatchUserQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserQueueEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserQueueEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Join or unjoin a set of queues for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserQueueEntityListing> patchUserQueues(ApiRequest<List<UserQueue>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserQueueEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserQueueEntityListing> response = (ApiResponse<UserQueueEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update routing language proficiency or state.
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage patchUserRoutinglanguage(String userId, String languageId, UserRoutingLanguage body) throws IOException, ApiException {
    return  patchUserRoutinglanguage(createPatchUserRoutinglanguageRequest(userId, languageId, body));
  }

  /**
   * Update routing language proficiency or state.
   * 
   * @param userId User ID (required)
   * @param languageId languageId (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> patchUserRoutinglanguageWithHttpInfo(String userId, String languageId, UserRoutingLanguage body) throws IOException {
    return patchUserRoutinglanguage(createPatchUserRoutinglanguageRequest(userId, languageId, body).withHttpInfo());
  }

  private PatchUserRoutinglanguageRequest createPatchUserRoutinglanguageRequest(String userId, String languageId, UserRoutingLanguage body) {
    return PatchUserRoutinglanguageRequest.builder()
            .withUserId(userId)
    
            .withLanguageId(languageId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update routing language proficiency or state.
   * 
   * @param request The request object
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage patchUserRoutinglanguage(PatchUserRoutinglanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingLanguage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingLanguage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update routing language proficiency or state.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> patchUserRoutinglanguage(ApiRequest<UserRoutingLanguage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingLanguage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing patchUserRoutinglanguagesBulk(String userId, List<UserRoutingLanguagePost> body) throws IOException, ApiException {
    return  patchUserRoutinglanguagesBulk(createPatchUserRoutinglanguagesBulkRequest(userId, body));
  }

  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserLanguageEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> patchUserRoutinglanguagesBulkWithHttpInfo(String userId, List<UserRoutingLanguagePost> body) throws IOException {
    return patchUserRoutinglanguagesBulk(createPatchUserRoutinglanguagesBulkRequest(userId, body).withHttpInfo());
  }

  private PatchUserRoutinglanguagesBulkRequest createPatchUserRoutinglanguagesBulkRequest(String userId, List<UserRoutingLanguagePost> body) {
    return PatchUserRoutinglanguagesBulkRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param request The request object
   * @return UserLanguageEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserLanguageEntityListing patchUserRoutinglanguagesBulk(PatchUserRoutinglanguagesBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserLanguageEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserLanguageEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add bulk routing language to user. Max limit 50 languages
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserLanguageEntityListing> patchUserRoutinglanguagesBulk(ApiRequest<List<UserRoutingLanguagePost>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserLanguageEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserLanguageEntityListing> response = (ApiResponse<UserLanguageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk add routing skills to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing patchUserRoutingskillsBulk(String userId, List<UserRoutingSkillPost> body) throws IOException, ApiException {
    return  patchUserRoutingskillsBulk(createPatchUserRoutingskillsBulkRequest(userId, body));
  }

  /**
   * Bulk add routing skills to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> patchUserRoutingskillsBulkWithHttpInfo(String userId, List<UserRoutingSkillPost> body) throws IOException {
    return patchUserRoutingskillsBulk(createPatchUserRoutingskillsBulkRequest(userId, body).withHttpInfo());
  }

  private PatchUserRoutingskillsBulkRequest createPatchUserRoutingskillsBulkRequest(String userId, List<UserRoutingSkillPost> body) {
    return PatchUserRoutingskillsBulkRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Bulk add routing skills to user
   * 
   * @param request The request object
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing patchUserRoutingskillsBulk(PatchUserRoutingskillsBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk add routing skills to user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> patchUserRoutingskillsBulk(ApiRequest<List<UserRoutingSkillPost>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QueueObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueObservationQueryResponse postAnalyticsQueuesObservationsQuery(QueueObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsQueuesObservationsQuery(createPostAnalyticsQueuesObservationsQueryRequest(body));
  }

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QueueObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueObservationQueryResponse> postAnalyticsQueuesObservationsQueryWithHttpInfo(QueueObservationQuery body) throws IOException {
    return postAnalyticsQueuesObservationsQuery(createPostAnalyticsQueuesObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsQueuesObservationsQueryRequest createPostAnalyticsQueuesObservationsQueryRequest(QueueObservationQuery body) {
    return PostAnalyticsQueuesObservationsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for queue observations
   * 
   * @param request The request object
   * @return QueueObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueObservationQueryResponse postAnalyticsQueuesObservationsQuery(PostAnalyticsQueuesObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for queue observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueObservationQueryResponse> postAnalyticsQueuesObservationsQuery(ApiRequest<QueueObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueObservationQueryResponse> response = (ApiResponse<QueueObservationQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueObservationQueryResponse> response = (ApiResponse<QueueObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a benefit assessment.
   * 
   * @param body  (optional)
   * @return BenefitAssessment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessment postRoutingAssessments(CreateBenefitAssessmentRequest body) throws IOException, ApiException {
    return  postRoutingAssessments(createPostRoutingAssessmentsRequest(body));
  }

  /**
   * Create a benefit assessment.
   * 
   * @param body  (optional)
   * @return BenefitAssessment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessment> postRoutingAssessmentsWithHttpInfo(CreateBenefitAssessmentRequest body) throws IOException {
    return postRoutingAssessments(createPostRoutingAssessmentsRequest(body).withHttpInfo());
  }

  private PostRoutingAssessmentsRequest createPostRoutingAssessmentsRequest(CreateBenefitAssessmentRequest body) {
    return PostRoutingAssessmentsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a benefit assessment.
   * 
   * @param request The request object
   * @return BenefitAssessment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessment postRoutingAssessments(PostRoutingAssessmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BenefitAssessment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BenefitAssessment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a benefit assessment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessment> postRoutingAssessments(ApiRequest<CreateBenefitAssessmentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BenefitAssessment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BenefitAssessment> response = (ApiResponse<BenefitAssessment>)(ApiResponse<?>)exception;
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
      ApiResponse<BenefitAssessment> response = (ApiResponse<BenefitAssessment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a benefit assessment job.
   * 
   * @param body  (optional)
   * @return BenefitAssessmentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessmentJob postRoutingAssessmentsJobs(CreateBenefitAssessmentJobRequest body) throws IOException, ApiException {
    return  postRoutingAssessmentsJobs(createPostRoutingAssessmentsJobsRequest(body));
  }

  /**
   * Create a benefit assessment job.
   * 
   * @param body  (optional)
   * @return BenefitAssessmentJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessmentJob> postRoutingAssessmentsJobsWithHttpInfo(CreateBenefitAssessmentJobRequest body) throws IOException {
    return postRoutingAssessmentsJobs(createPostRoutingAssessmentsJobsRequest(body).withHttpInfo());
  }

  private PostRoutingAssessmentsJobsRequest createPostRoutingAssessmentsJobsRequest(CreateBenefitAssessmentJobRequest body) {
    return PostRoutingAssessmentsJobsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a benefit assessment job.
   * 
   * @param request The request object
   * @return BenefitAssessmentJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BenefitAssessmentJob postRoutingAssessmentsJobs(PostRoutingAssessmentsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BenefitAssessmentJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BenefitAssessmentJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a benefit assessment job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BenefitAssessmentJob> postRoutingAssessmentsJobs(ApiRequest<CreateBenefitAssessmentJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BenefitAssessmentJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BenefitAssessmentJob> response = (ApiResponse<BenefitAssessmentJob>)(ApiResponse<?>)exception;
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
      ApiResponse<BenefitAssessmentJob> response = (ApiResponse<BenefitAssessmentJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a route
   * 
   * @param domainName email domain (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRoute postRoutingEmailDomainRoutes(String domainName, InboundRoute body) throws IOException, ApiException {
    return  postRoutingEmailDomainRoutes(createPostRoutingEmailDomainRoutesRequest(domainName, body));
  }

  /**
   * Create a route
   * 
   * @param domainName email domain (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRoute> postRoutingEmailDomainRoutesWithHttpInfo(String domainName, InboundRoute body) throws IOException {
    return postRoutingEmailDomainRoutes(createPostRoutingEmailDomainRoutesRequest(domainName, body).withHttpInfo());
  }

  private PostRoutingEmailDomainRoutesRequest createPostRoutingEmailDomainRoutesRequest(String domainName, InboundRoute body) {
    return PostRoutingEmailDomainRoutesRequest.builder()
            .withDomainName(domainName)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a route
   * 
   * @param request The request object
   * @return InboundRoute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRoute postRoutingEmailDomainRoutes(PostRoutingEmailDomainRoutesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundRoute> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundRoute>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRoute> postRoutingEmailDomainRoutes(ApiRequest<InboundRoute> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundRoute>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Tests the custom SMTP server integration connection set on this domain
   * The request body is optional. If omitted, this endpoint will just test the connection of the Custom SMTP Server. If the body is specified, there will be an attempt to send an email message to the server.
   * @param domainId domain ID (required)
   * @param body TestMessage (optional)
   * @return TestMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestMessage postRoutingEmailDomainTestconnection(String domainId, TestMessage body) throws IOException, ApiException {
    return  postRoutingEmailDomainTestconnection(createPostRoutingEmailDomainTestconnectionRequest(domainId, body));
  }

  /**
   * Tests the custom SMTP server integration connection set on this domain
   * The request body is optional. If omitted, this endpoint will just test the connection of the Custom SMTP Server. If the body is specified, there will be an attempt to send an email message to the server.
   * @param domainId domain ID (required)
   * @param body TestMessage (optional)
   * @return TestMessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestMessage> postRoutingEmailDomainTestconnectionWithHttpInfo(String domainId, TestMessage body) throws IOException {
    return postRoutingEmailDomainTestconnection(createPostRoutingEmailDomainTestconnectionRequest(domainId, body).withHttpInfo());
  }

  private PostRoutingEmailDomainTestconnectionRequest createPostRoutingEmailDomainTestconnectionRequest(String domainId, TestMessage body) {
    return PostRoutingEmailDomainTestconnectionRequest.builder()
            .withDomainId(domainId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Tests the custom SMTP server integration connection set on this domain
   * The request body is optional. If omitted, this endpoint will just test the connection of the Custom SMTP Server. If the body is specified, there will be an attempt to send an email message to the server.
   * @param request The request object
   * @return TestMessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestMessage postRoutingEmailDomainTestconnection(PostRoutingEmailDomainTestconnectionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TestMessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TestMessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Tests the custom SMTP server integration connection set on this domain
   * The request body is optional. If omitted, this endpoint will just test the connection of the Custom SMTP Server. If the body is specified, there will be an attempt to send an email message to the server.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestMessage> postRoutingEmailDomainTestconnection(ApiRequest<TestMessage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TestMessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TestMessage> response = (ApiResponse<TestMessage>)(ApiResponse<?>)exception;
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
      ApiResponse<TestMessage> response = (ApiResponse<TestMessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a domain
   * 
   * @param body Domain (required)
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain postRoutingEmailDomains(InboundDomain body) throws IOException, ApiException {
    return  postRoutingEmailDomains(createPostRoutingEmailDomainsRequest(body));
  }

  /**
   * Create a domain
   * 
   * @param body Domain (required)
   * @return InboundDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> postRoutingEmailDomainsWithHttpInfo(InboundDomain body) throws IOException {
    return postRoutingEmailDomains(createPostRoutingEmailDomainsRequest(body).withHttpInfo());
  }

  private PostRoutingEmailDomainsRequest createPostRoutingEmailDomainsRequest(InboundDomain body) {
    return PostRoutingEmailDomainsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a domain
   * 
   * @param request The request object
   * @return InboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomain postRoutingEmailDomains(PostRoutingEmailDomainsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a domain
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomain> postRoutingEmailDomains(ApiRequest<InboundDomain> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundDomain> response = (ApiResponse<InboundDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create Language
   * 
   * @param body Language (required)
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language postRoutingLanguages(Language body) throws IOException, ApiException {
    return  postRoutingLanguages(createPostRoutingLanguagesRequest(body));
  }

  /**
   * Create Language
   * 
   * @param body Language (required)
   * @return Language
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> postRoutingLanguagesWithHttpInfo(Language body) throws IOException {
    return postRoutingLanguages(createPostRoutingLanguagesRequest(body).withHttpInfo());
  }

  private PostRoutingLanguagesRequest createPostRoutingLanguagesRequest(Language body) {
    return PostRoutingLanguagesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create Language
   * 
   * @param request The request object
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language postRoutingLanguages(PostRoutingLanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Language> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Language>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> postRoutingLanguages(ApiRequest<Language> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Language>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)exception;
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
      ApiResponse<Language> response = (ApiResponse<Language>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a predictor.
   * 
   * @param body  (optional)
   * @return Predictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Predictor postRoutingPredictors(CreatePredictorRequest body) throws IOException, ApiException {
    return  postRoutingPredictors(createPostRoutingPredictorsRequest(body));
  }

  /**
   * Create a predictor.
   * 
   * @param body  (optional)
   * @return Predictor
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Predictor> postRoutingPredictorsWithHttpInfo(CreatePredictorRequest body) throws IOException {
    return postRoutingPredictors(createPostRoutingPredictorsRequest(body).withHttpInfo());
  }

  private PostRoutingPredictorsRequest createPostRoutingPredictorsRequest(CreatePredictorRequest body) {
    return PostRoutingPredictorsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a predictor.
   * 
   * @param request The request object
   * @return Predictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Predictor postRoutingPredictors(PostRoutingPredictorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Predictor> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Predictor>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a predictor.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Predictor> postRoutingPredictors(ApiRequest<CreatePredictorRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Predictor>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Predictor> response = (ApiResponse<Predictor>)(ApiResponse<?>)exception;
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
      ApiResponse<Predictor> response = (ApiResponse<Predictor>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @param delete True to delete queue members (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRoutingQueueMembers(String queueId, List<WritableEntity> body, Boolean delete) throws IOException, ApiException {
     postRoutingQueueMembers(createPostRoutingQueueMembersRequest(queueId, body, delete));
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @param delete True to delete queue members (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRoutingQueueMembersWithHttpInfo(String queueId, List<WritableEntity> body, Boolean delete) throws IOException {
    return postRoutingQueueMembers(createPostRoutingQueueMembersRequest(queueId, body, delete).withHttpInfo());
  }

  private PostRoutingQueueMembersRequest createPostRoutingQueueMembersRequest(String queueId, List<WritableEntity> body, Boolean delete) {
    return PostRoutingQueueMembersRequest.builder()
            .withQueueId(queueId)
    
            .withBody(body)
    
            .withDelete(delete)
    
            .build();
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRoutingQueueMembers(PostRoutingQueueMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRoutingQueueMembers(ApiRequest<List<WritableEntity>> request) throws IOException {
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
   * DEPRECATED: use POST /routing/queues/{queueId}/members.  Bulk add or delete up to 100 queue members.
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @param delete True to delete queue members (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRoutingQueueUsers(String queueId, List<WritableEntity> body, Boolean delete) throws IOException, ApiException {
     postRoutingQueueUsers(createPostRoutingQueueUsersRequest(queueId, body, delete));
  }

  /**
   * DEPRECATED: use POST /routing/queues/{queueId}/members.  Bulk add or delete up to 100 queue members.
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @param delete True to delete queue members (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRoutingQueueUsersWithHttpInfo(String queueId, List<WritableEntity> body, Boolean delete) throws IOException {
    return postRoutingQueueUsers(createPostRoutingQueueUsersRequest(queueId, body, delete).withHttpInfo());
  }

  private PostRoutingQueueUsersRequest createPostRoutingQueueUsersRequest(String queueId, List<WritableEntity> body, Boolean delete) {
    return PostRoutingQueueUsersRequest.builder()
            .withQueueId(queueId)
    
            .withBody(body)
    
            .withDelete(delete)
    
            .build();
  }

  /**
   * DEPRECATED: use POST /routing/queues/{queueId}/members.  Bulk add or delete up to 100 queue members.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRoutingQueueUsers(PostRoutingQueueUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * DEPRECATED: use POST /routing/queues/{queueId}/members.  Bulk add or delete up to 100 queue members.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRoutingQueueUsers(ApiRequest<List<WritableEntity>> request) throws IOException {
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
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param queueId Queue ID (required)
   * @param body List of wrapup codes (required)
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> postRoutingQueueWrapupcodes(String queueId, List<WrapUpCodeReference> body) throws IOException, ApiException {
    return  postRoutingQueueWrapupcodes(createPostRoutingQueueWrapupcodesRequest(queueId, body));
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param queueId Queue ID (required)
   * @param body List of wrapup codes (required)
   * @return List<WrapupCode>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> postRoutingQueueWrapupcodesWithHttpInfo(String queueId, List<WrapUpCodeReference> body) throws IOException {
    return postRoutingQueueWrapupcodes(createPostRoutingQueueWrapupcodesRequest(queueId, body).withHttpInfo());
  }

  private PostRoutingQueueWrapupcodesRequest createPostRoutingQueueWrapupcodesRequest(String queueId, List<WrapUpCodeReference> body) {
    return PostRoutingQueueWrapupcodesRequest.builder()
            .withQueueId(queueId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param request The request object
   * @return List<WrapupCode>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<WrapupCode> postRoutingQueueWrapupcodes(PostRoutingQueueWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<WrapupCode>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<WrapupCode>> postRoutingQueueWrapupcodes(ApiRequest<List<WrapUpCodeReference>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<WrapupCode>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<WrapupCode>> response = (ApiResponse<List<WrapupCode>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a queue
   * 
   * @param body Queue (required)
   * @return Queue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Queue postRoutingQueues(CreateQueueRequest body) throws IOException, ApiException {
    return  postRoutingQueues(createPostRoutingQueuesRequest(body));
  }

  /**
   * Create a queue
   * 
   * @param body Queue (required)
   * @return Queue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Queue> postRoutingQueuesWithHttpInfo(CreateQueueRequest body) throws IOException {
    return postRoutingQueues(createPostRoutingQueuesRequest(body).withHttpInfo());
  }

  private PostRoutingQueuesRequest createPostRoutingQueuesRequest(CreateQueueRequest body) {
    return PostRoutingQueuesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a queue
   * 
   * @param request The request object
   * @return Queue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Queue postRoutingQueues(PostRoutingQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Queue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Queue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Queue> postRoutingQueues(ApiRequest<CreateQueueRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Queue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)exception;
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
      ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create Skill
   * 
   * @param body Skill (required)
   * @return RoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSkill postRoutingSkills(RoutingSkill body) throws IOException, ApiException {
    return  postRoutingSkills(createPostRoutingSkillsRequest(body));
  }

  /**
   * Create Skill
   * 
   * @param body Skill (required)
   * @return RoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSkill> postRoutingSkillsWithHttpInfo(RoutingSkill body) throws IOException {
    return postRoutingSkills(createPostRoutingSkillsRequest(body).withHttpInfo());
  }

  private PostRoutingSkillsRequest createPostRoutingSkillsRequest(RoutingSkill body) {
    return PostRoutingSkillsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create Skill
   * 
   * @param request The request object
   * @return RoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSkill postRoutingSkills(PostRoutingSkillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Skill
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSkill> postRoutingSkills(ApiRequest<RoutingSkill> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingSkill> response = (ApiResponse<RoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Provision an Address for SMS
   * 
   * @param body SmsAddress (required)
   * @return SmsAddress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsAddress postRoutingSmsAddresses(SmsAddressProvision body) throws IOException, ApiException {
    return  postRoutingSmsAddresses(createPostRoutingSmsAddressesRequest(body));
  }

  /**
   * Provision an Address for SMS
   * 
   * @param body SmsAddress (required)
   * @return SmsAddress
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsAddress> postRoutingSmsAddressesWithHttpInfo(SmsAddressProvision body) throws IOException {
    return postRoutingSmsAddresses(createPostRoutingSmsAddressesRequest(body).withHttpInfo());
  }

  private PostRoutingSmsAddressesRequest createPostRoutingSmsAddressesRequest(SmsAddressProvision body) {
    return PostRoutingSmsAddressesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Provision an Address for SMS
   * 
   * @param request The request object
   * @return SmsAddress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsAddress postRoutingSmsAddresses(PostRoutingSmsAddressesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SmsAddress> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SmsAddress>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Provision an Address for SMS
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsAddress> postRoutingSmsAddresses(ApiRequest<SmsAddressProvision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SmsAddress>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SmsAddress> response = (ApiResponse<SmsAddress>)(ApiResponse<?>)exception;
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
      ApiResponse<SmsAddress> response = (ApiResponse<SmsAddress>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Provision a phone number for SMS
   * 
   * @param body SmsPhoneNumber (required)
   * @param async Provision a new phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the provisioning of a new phone number. Check the phoneNumber&#39;s provisioningStatus for completion of this request. (optional, default to false)
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber postRoutingSmsPhonenumbers(SmsPhoneNumberProvision body, Boolean async) throws IOException, ApiException {
    return  postRoutingSmsPhonenumbers(createPostRoutingSmsPhonenumbersRequest(body, async));
  }

  /**
   * Provision a phone number for SMS
   * 
   * @param body SmsPhoneNumber (required)
   * @param async Provision a new phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the provisioning of a new phone number. Check the phoneNumber&#39;s provisioningStatus for completion of this request. (optional, default to false)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> postRoutingSmsPhonenumbersWithHttpInfo(SmsPhoneNumberProvision body, Boolean async) throws IOException {
    return postRoutingSmsPhonenumbers(createPostRoutingSmsPhonenumbersRequest(body, async).withHttpInfo());
  }

  private PostRoutingSmsPhonenumbersRequest createPostRoutingSmsPhonenumbersRequest(SmsPhoneNumberProvision body, Boolean async) {
    return PostRoutingSmsPhonenumbersRequest.builder()
            .withBody(body)
    
            .withAsync(async)
    
            .build();
  }

  /**
   * Provision a phone number for SMS
   * 
   * @param request The request object
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber postRoutingSmsPhonenumbers(PostRoutingSmsPhonenumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SmsPhoneNumber> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SmsPhoneNumber>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Provision a phone number for SMS
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> postRoutingSmsPhonenumbers(ApiRequest<SmsPhoneNumberProvision> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SmsPhoneNumber>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SmsPhoneNumber> response = (ApiResponse<SmsPhoneNumber>)(ApiResponse<?>)exception;
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
      ApiResponse<SmsPhoneNumber> response = (ApiResponse<SmsPhoneNumber>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a wrap-up code
   * 
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode postRoutingWrapupcodes(WrapupCode body) throws IOException, ApiException {
    return  postRoutingWrapupcodes(createPostRoutingWrapupcodesRequest(body));
  }

  /**
   * Create a wrap-up code
   * 
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> postRoutingWrapupcodesWithHttpInfo(WrapupCode body) throws IOException {
    return postRoutingWrapupcodes(createPostRoutingWrapupcodesRequest(body).withHttpInfo());
  }

  private PostRoutingWrapupcodesRequest createPostRoutingWrapupcodesRequest(WrapupCode body) {
    return PostRoutingWrapupcodesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a wrap-up code
   * 
   * @param request The request object
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode postRoutingWrapupcodes(PostRoutingWrapupcodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a wrap-up code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> postRoutingWrapupcodes(ApiRequest<WrapupCode> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add routing language to user
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage postUserRoutinglanguages(String userId, UserRoutingLanguagePost body) throws IOException, ApiException {
    return  postUserRoutinglanguages(createPostUserRoutinglanguagesRequest(userId, body));
  }

  /**
   * Add routing language to user
   * 
   * @param userId User ID (required)
   * @param body Language (required)
   * @return UserRoutingLanguage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> postUserRoutinglanguagesWithHttpInfo(String userId, UserRoutingLanguagePost body) throws IOException {
    return postUserRoutinglanguages(createPostUserRoutinglanguagesRequest(userId, body).withHttpInfo());
  }

  private PostUserRoutinglanguagesRequest createPostUserRoutinglanguagesRequest(String userId, UserRoutingLanguagePost body) {
    return PostUserRoutinglanguagesRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add routing language to user
   * 
   * @param request The request object
   * @return UserRoutingLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingLanguage postUserRoutinglanguages(PostUserRoutinglanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingLanguage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingLanguage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add routing language to user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingLanguage> postUserRoutinglanguages(ApiRequest<UserRoutingLanguagePost> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingLanguage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingLanguage> response = (ApiResponse<UserRoutingLanguage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill postUserRoutingskills(String userId, UserRoutingSkillPost body) throws IOException, ApiException {
    return  postUserRoutingskills(createPostUserRoutingskillsRequest(userId, body));
  }

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskillsWithHttpInfo(String userId, UserRoutingSkillPost body) throws IOException {
    return postUserRoutingskills(createPostUserRoutingskillsRequest(userId, body).withHttpInfo());
  }

  private PostUserRoutingskillsRequest createPostUserRoutingskillsRequest(String userId, UserRoutingSkillPost body) {
    return PostUserRoutingskillsRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add routing skill to user
   * 
   * @param request The request object
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill postUserRoutingskills(PostUserRoutingskillsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add routing skill to user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskills(ApiRequest<UserRoutingSkillPost> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRoute putRoutingEmailDomainRoute(String domainName, String routeId, InboundRoute body) throws IOException, ApiException {
    return  putRoutingEmailDomainRoute(createPutRoutingEmailDomainRouteRequest(domainName, routeId, body));
  }

  /**
   * Update a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRoute> putRoutingEmailDomainRouteWithHttpInfo(String domainName, String routeId, InboundRoute body) throws IOException {
    return putRoutingEmailDomainRoute(createPutRoutingEmailDomainRouteRequest(domainName, routeId, body).withHttpInfo());
  }

  private PutRoutingEmailDomainRouteRequest createPutRoutingEmailDomainRouteRequest(String domainName, String routeId, InboundRoute body) {
    return PutRoutingEmailDomainRouteRequest.builder()
            .withDomainName(domainName)
    
            .withRouteId(routeId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a route
   * 
   * @param request The request object
   * @return InboundRoute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRoute putRoutingEmailDomainRoute(PutRoutingEmailDomainRouteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<InboundRoute> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<InboundRoute>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRoute> putRoutingEmailDomainRoute(ApiRequest<InboundRoute> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<InboundRoute>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)exception;
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
      ApiResponse<InboundRoute> response = (ApiResponse<InboundRoute>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a recipient
   * 
   * @param recipientId Recipient ID (required)
   * @param body Recipient (required)
   * @return Recipient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recipient putRoutingMessageRecipient(String recipientId, Recipient body) throws IOException, ApiException {
    return  putRoutingMessageRecipient(createPutRoutingMessageRecipientRequest(recipientId, body));
  }

  /**
   * Update a recipient
   * 
   * @param recipientId Recipient ID (required)
   * @param body Recipient (required)
   * @return Recipient
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recipient> putRoutingMessageRecipientWithHttpInfo(String recipientId, Recipient body) throws IOException {
    return putRoutingMessageRecipient(createPutRoutingMessageRecipientRequest(recipientId, body).withHttpInfo());
  }

  private PutRoutingMessageRecipientRequest createPutRoutingMessageRecipientRequest(String recipientId, Recipient body) {
    return PutRoutingMessageRecipientRequest.builder()
            .withRecipientId(recipientId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a recipient
   * 
   * @param request The request object
   * @return Recipient
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Recipient putRoutingMessageRecipient(PutRoutingMessageRecipientRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Recipient> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Recipient>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a recipient
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Recipient> putRoutingMessageRecipient(ApiRequest<Recipient> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Recipient>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Recipient> response = (ApiResponse<Recipient>)(ApiResponse<?>)exception;
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
      ApiResponse<Recipient> response = (ApiResponse<Recipient>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue (required)
   * @return Queue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Queue putRoutingQueue(String queueId, QueueRequest body) throws IOException, ApiException {
    return  putRoutingQueue(createPutRoutingQueueRequest(queueId, body));
  }

  /**
   * Update a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue (required)
   * @return Queue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Queue> putRoutingQueueWithHttpInfo(String queueId, QueueRequest body) throws IOException {
    return putRoutingQueue(createPutRoutingQueueRequest(queueId, body).withHttpInfo());
  }

  private PutRoutingQueueRequest createPutRoutingQueueRequest(String queueId, QueueRequest body) {
    return PutRoutingQueueRequest.builder()
            .withQueueId(queueId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a queue
   * 
   * @param request The request object
   * @return Queue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Queue putRoutingQueue(PutRoutingQueueRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Queue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Queue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Queue> putRoutingQueue(ApiRequest<QueueRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Queue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)exception;
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
      ApiResponse<Queue> response = (ApiResponse<Queue>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an organization&#39;s routing settings
   * 
   * @param body Organization Settings (required)
   * @return RoutingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSettings putRoutingSettings(RoutingSettings body) throws IOException, ApiException {
    return  putRoutingSettings(createPutRoutingSettingsRequest(body));
  }

  /**
   * Update an organization&#39;s routing settings
   * 
   * @param body Organization Settings (required)
   * @return RoutingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSettings> putRoutingSettingsWithHttpInfo(RoutingSettings body) throws IOException {
    return putRoutingSettings(createPutRoutingSettingsRequest(body).withHttpInfo());
  }

  private PutRoutingSettingsRequest createPutRoutingSettingsRequest(RoutingSettings body) {
    return PutRoutingSettingsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update an organization&#39;s routing settings
   * 
   * @param request The request object
   * @return RoutingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSettings putRoutingSettings(PutRoutingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an organization&#39;s routing settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingSettings> putRoutingSettings(ApiRequest<RoutingSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingSettings> response = (ApiResponse<RoutingSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingSettings> response = (ApiResponse<RoutingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update Transcription Settings
   * 
   * @param body Organization Settings (required)
   * @return TranscriptionSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptionSettings putRoutingSettingsTranscription(TranscriptionSettings body) throws IOException, ApiException {
    return  putRoutingSettingsTranscription(createPutRoutingSettingsTranscriptionRequest(body));
  }

  /**
   * Update Transcription Settings
   * 
   * @param body Organization Settings (required)
   * @return TranscriptionSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptionSettings> putRoutingSettingsTranscriptionWithHttpInfo(TranscriptionSettings body) throws IOException {
    return putRoutingSettingsTranscription(createPutRoutingSettingsTranscriptionRequest(body).withHttpInfo());
  }

  private PutRoutingSettingsTranscriptionRequest createPutRoutingSettingsTranscriptionRequest(TranscriptionSettings body) {
    return PutRoutingSettingsTranscriptionRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update Transcription Settings
   * 
   * @param request The request object
   * @return TranscriptionSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptionSettings putRoutingSettingsTranscription(PutRoutingSettingsTranscriptionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TranscriptionSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TranscriptionSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Transcription Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptionSettings> putRoutingSettingsTranscription(ApiRequest<TranscriptionSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TranscriptionSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptionSettings> response = (ApiResponse<TranscriptionSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<TranscriptionSettings> response = (ApiResponse<TranscriptionSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a phone number provisioned for SMS.
   * 
   * @param addressId Address ID (required)
   * @param body SmsPhoneNumber (required)
   * @param async Update an existing phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the update of a provisioned phone number. Check the phoneNumber&#39;s provisioningStatus for the progress of this request. (optional, default to false)
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber putRoutingSmsPhonenumber(String addressId, SmsPhoneNumber body, Boolean async) throws IOException, ApiException {
    return  putRoutingSmsPhonenumber(createPutRoutingSmsPhonenumberRequest(addressId, body, async));
  }

  /**
   * Update a phone number provisioned for SMS.
   * 
   * @param addressId Address ID (required)
   * @param body SmsPhoneNumber (required)
   * @param async Update an existing phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the update of a provisioned phone number. Check the phoneNumber&#39;s provisioningStatus for the progress of this request. (optional, default to false)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> putRoutingSmsPhonenumberWithHttpInfo(String addressId, SmsPhoneNumber body, Boolean async) throws IOException {
    return putRoutingSmsPhonenumber(createPutRoutingSmsPhonenumberRequest(addressId, body, async).withHttpInfo());
  }

  private PutRoutingSmsPhonenumberRequest createPutRoutingSmsPhonenumberRequest(String addressId, SmsPhoneNumber body, Boolean async) {
    return PutRoutingSmsPhonenumberRequest.builder()
            .withAddressId(addressId)
    
            .withBody(body)
    
            .withAsync(async)
    
            .build();
  }

  /**
   * Update a phone number provisioned for SMS.
   * 
   * @param request The request object
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber putRoutingSmsPhonenumber(PutRoutingSmsPhonenumberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SmsPhoneNumber> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SmsPhoneNumber>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a phone number provisioned for SMS.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> putRoutingSmsPhonenumber(ApiRequest<SmsPhoneNumber> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SmsPhoneNumber>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SmsPhoneNumber> response = (ApiResponse<SmsPhoneNumber>)(ApiResponse<?>)exception;
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
      ApiResponse<SmsPhoneNumber> response = (ApiResponse<SmsPhoneNumber>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param userId User ID (required)
   * @param body utilization (required)
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization putRoutingUserUtilization(String userId, Utilization body) throws IOException, ApiException {
    return  putRoutingUserUtilization(createPutRoutingUserUtilizationRequest(userId, body));
  }

  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param userId User ID (required)
   * @param body utilization (required)
   * @return AgentMaxUtilization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> putRoutingUserUtilizationWithHttpInfo(String userId, Utilization body) throws IOException {
    return putRoutingUserUtilization(createPutRoutingUserUtilizationRequest(userId, body).withHttpInfo());
  }

  private PutRoutingUserUtilizationRequest createPutRoutingUserUtilizationRequest(String userId, Utilization body) {
    return PutRoutingUserUtilizationRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return AgentMaxUtilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilization putRoutingUserUtilization(PutRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentMaxUtilization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentMaxUtilization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the user&#39;s max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilization> putRoutingUserUtilization(ApiRequest<Utilization> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentMaxUtilization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentMaxUtilization> response = (ApiResponse<AgentMaxUtilization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param body utilization (required)
   * @return Utilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Utilization putRoutingUtilization(Utilization body) throws IOException, ApiException {
    return  putRoutingUtilization(createPutRoutingUtilizationRequest(body));
  }

  /**
   * Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param body utilization (required)
   * @return Utilization
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Utilization> putRoutingUtilizationWithHttpInfo(Utilization body) throws IOException {
    return putRoutingUtilization(createPutRoutingUtilizationRequest(body).withHttpInfo());
  }

  private PutRoutingUtilizationRequest createPutRoutingUtilizationRequest(Utilization body) {
    return PutRoutingUtilizationRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return Utilization
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Utilization putRoutingUtilization(PutRoutingUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Utilization> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Utilization>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Utilization> putRoutingUtilization(ApiRequest<Utilization> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Utilization>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)exception;
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
      ApiResponse<Utilization> response = (ApiResponse<Utilization>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode putRoutingWrapupcode(String codeId, WrapupCode body) throws IOException, ApiException {
    return  putRoutingWrapupcode(createPutRoutingWrapupcodeRequest(codeId, body));
  }

  /**
   * Update wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> putRoutingWrapupcodeWithHttpInfo(String codeId, WrapupCode body) throws IOException {
    return putRoutingWrapupcode(createPutRoutingWrapupcodeRequest(codeId, body).withHttpInfo());
  }

  private PutRoutingWrapupcodeRequest createPutRoutingWrapupcodeRequest(String codeId, WrapupCode body) {
    return PutRoutingWrapupcodeRequest.builder()
            .withCodeId(codeId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update wrap-up code
   * 
   * @param request The request object
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode putRoutingWrapupcode(PutRoutingWrapupcodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapupCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update wrap-up code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> putRoutingWrapupcode(ApiRequest<WrapupCode> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapupCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapupCode> response = (ApiResponse<WrapupCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill putUserRoutingskill(String userId, String skillId, UserRoutingSkill body) throws IOException, ApiException {
    return  putUserRoutingskill(createPutUserRoutingskillRequest(userId, skillId, body));
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskillWithHttpInfo(String userId, String skillId, UserRoutingSkill body) throws IOException {
    return putUserRoutingskill(createPutUserRoutingskillRequest(userId, skillId, body).withHttpInfo());
  }

  private PutUserRoutingskillRequest createPutUserRoutingskillRequest(String userId, String skillId, UserRoutingSkill body) {
    return PutUserRoutingskillRequest.builder()
            .withUserId(userId)
    
            .withSkillId(skillId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param request The request object
   * @return UserRoutingSkill
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserRoutingSkill putUserRoutingskill(PutUserRoutingskillRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserRoutingSkill> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskill(ApiRequest<UserRoutingSkill> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserRoutingSkill>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)exception;
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
      ApiResponse<UserRoutingSkill> response = (ApiResponse<UserRoutingSkill>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Replace all routing skills assigned to a user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing putUserRoutingskillsBulk(String userId, List<UserRoutingSkillPost> body) throws IOException, ApiException {
    return  putUserRoutingskillsBulk(createPutUserRoutingskillsBulkRequest(userId, body));
  }

  /**
   * Replace all routing skills assigned to a user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserSkillEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> putUserRoutingskillsBulkWithHttpInfo(String userId, List<UserRoutingSkillPost> body) throws IOException {
    return putUserRoutingskillsBulk(createPutUserRoutingskillsBulkRequest(userId, body).withHttpInfo());
  }

  private PutUserRoutingskillsBulkRequest createPutUserRoutingskillsBulkRequest(String userId, List<UserRoutingSkillPost> body) {
    return PutUserRoutingskillsBulkRequest.builder()
            .withUserId(userId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Replace all routing skills assigned to a user
   * 
   * @param request The request object
   * @return UserSkillEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillEntityListing putUserRoutingskillsBulk(PutUserRoutingskillsBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Replace all routing skills assigned to a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillEntityListing> putUserRoutingskillsBulk(ApiRequest<List<UserRoutingSkillPost>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillEntityListing> response = (ApiResponse<UserSkillEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
