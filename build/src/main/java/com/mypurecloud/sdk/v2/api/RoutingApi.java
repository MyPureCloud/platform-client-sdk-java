package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AgentDirectRoutingBackupSettings;
import com.mypurecloud.sdk.v2.model.AgentMaxUtilizationResponse;
import com.mypurecloud.sdk.v2.model.AssessmentJobListing;
import com.mypurecloud.sdk.v2.model.AssessmentListing;
import com.mypurecloud.sdk.v2.model.AssistantQueue;
import com.mypurecloud.sdk.v2.model.AvailableMediaTypeEntityListing;
import com.mypurecloud.sdk.v2.model.BenefitAssessment;
import com.mypurecloud.sdk.v2.model.BenefitAssessmentJob;
import com.mypurecloud.sdk.v2.model.ComparisonPeriod;
import com.mypurecloud.sdk.v2.model.ComparisonPeriodListing;
import com.mypurecloud.sdk.v2.model.ContactCenterSettings;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentJobRequest;
import com.mypurecloud.sdk.v2.model.CreateBenefitAssessmentRequest;
import com.mypurecloud.sdk.v2.model.CreatePredictorRequest;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.CreateUtilizationLabelRequest;
import com.mypurecloud.sdk.v2.model.CreateUtilizationTagRequest;
import com.mypurecloud.sdk.v2.model.EmailOutboundDomainResult;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.IdentityResolutionQueueConfig;
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainPatchRequest;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.KeyPerformanceIndicator;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundDomain;
import com.mypurecloud.sdk.v2.model.OutboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.PatchPredictorRequest;
import com.mypurecloud.sdk.v2.model.Predictor;
import com.mypurecloud.sdk.v2.model.PredictorListing;
import com.mypurecloud.sdk.v2.model.PredictorModelFeatureListing;
import com.mypurecloud.sdk.v2.model.PredictorModels;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListingV1;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueRequest;
import com.mypurecloud.sdk.v2.model.Recipient;
import com.mypurecloud.sdk.v2.model.RecipientListing;
import com.mypurecloud.sdk.v2.model.RecipientRequest;
import com.mypurecloud.sdk.v2.model.RoutingActivityQuery;
import com.mypurecloud.sdk.v2.model.RoutingActivityResponse;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesRequest;
import com.mypurecloud.sdk.v2.model.RoutingConversationAttributesResponse;
import com.mypurecloud.sdk.v2.model.RoutingSettings;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SMSAvailablePhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.SkillGroup;
import com.mypurecloud.sdk.v2.model.SkillGroupEntityListing;
import com.mypurecloud.sdk.v2.model.SkillGroupMemberDivisionList;
import com.mypurecloud.sdk.v2.model.SkillGroupMemberDivisions;
import com.mypurecloud.sdk.v2.model.SkillGroupMemberEntityListing;
import com.mypurecloud.sdk.v2.model.SkillGroupWithMemberDivisions;
import com.mypurecloud.sdk.v2.model.SmsAddress;
import com.mypurecloud.sdk.v2.model.SmsAddressEntityListing;
import com.mypurecloud.sdk.v2.model.SmsAddressProvision;
import com.mypurecloud.sdk.v2.model.SmsAlphanumericProvision;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumber;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberImport;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberPatchRequest;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberProvision;
import com.mypurecloud.sdk.v2.model.TestMessage;
import com.mypurecloud.sdk.v2.model.TranscriptionSettings;
import com.mypurecloud.sdk.v2.model.UpdateUtilizationLabelRequest;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillGroupEntityListing;
import com.mypurecloud.sdk.v2.model.UtilizationLabel;
import com.mypurecloud.sdk.v2.model.UtilizationLabelEntityListing;
import com.mypurecloud.sdk.v2.model.UtilizationRequest;
import com.mypurecloud.sdk.v2.model.UtilizationResponse;
import com.mypurecloud.sdk.v2.model.UtilizationTag;
import com.mypurecloud.sdk.v2.model.UtilizationTagEntityListing;
import com.mypurecloud.sdk.v2.model.WrapUpCodeReference;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeRequest;
import com.mypurecloud.sdk.v2.model.WritableEntity;


import com.mypurecloud.sdk.v2.api.request.DeleteRoutingAssessmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingDirectroutingbackupSettingsMeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailOutboundDomainRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueMemberRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSkillRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSkillgroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSmsAddressRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSmsPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUserDirectroutingbackupSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUtilizationLabelRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUtilizationTagRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutinglanguageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAssessmentsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingAvailablemediatypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingDirectroutingbackupSettingsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRouteIdentityresolutionRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailOutboundDomainRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailOutboundDomainActivationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailOutboundDomainSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailOutboundDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailSetupRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingMessageRecipientRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingMessageRecipientsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorModelFeaturesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorModelsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingPredictorsKeyperformanceindicatorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueAssistantRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueComparisonperiodRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueComparisonperiodsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueEstimatedwaittimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueIdentityresolutionRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillgroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillgroupMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillgroupMembersDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillgroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsAddressRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsAddressesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsAvailablephonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsIdentityresolutionPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSmsPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUserDirectroutingbackupSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationLabelRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationLabelAgentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationLabelsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationTagRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationTagAgentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationTagsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodesDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodesDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutinglanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserSkillgroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingConversationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingEmailDomainValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueMemberRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueMembersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingSettingsContactcenterRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingSettingsTranscriptionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingSkillgroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingSmsPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutinglanguageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutinglanguagesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserRoutingskillsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsRoutingActivityQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingAssessmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingAssessmentsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainTestconnectionRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailOutboundDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailOutboundDomainsSimulatedRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueMembersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSkillgroupMembersDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSkillgroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSmsAddressesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSmsPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSmsPhonenumbersAlphanumericRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSmsPhonenumbersImportRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingUtilizationLabelsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingUtilizationTagsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutinglanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingDirectroutingbackupSettingsMeRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingEmailDomainRouteIdentityresolutionRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingEmailOutboundDomainActivationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingMessageRecipientRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingQueueIdentityresolutionRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingSettingsTranscriptionRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingSmsIdentityresolutionPhonenumberRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUserDirectroutingbackupSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUserUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUtilizationLabelRequest;
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
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingDirectroutingbackupSettingsMe() throws IOException, ApiException {
     deleteRoutingDirectroutingbackupSettingsMe(createDeleteRoutingDirectroutingbackupSettingsMeRequest());
  }

  /**
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingDirectroutingbackupSettingsMeWithHttpInfo() throws IOException {
    return deleteRoutingDirectroutingbackupSettingsMe(createDeleteRoutingDirectroutingbackupSettingsMeRequest().withHttpInfo());
  }

  private DeleteRoutingDirectroutingbackupSettingsMeRequest createDeleteRoutingDirectroutingbackupSettingsMeRequest() {
    return DeleteRoutingDirectroutingbackupSettingsMeRequest.builder()
            .build();
  }

  /**
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingDirectroutingbackupSettingsMe(DeleteRoutingDirectroutingbackupSettingsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingDirectroutingbackupSettingsMe(ApiRequest<Void> request) throws IOException {
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
   * Delete an outbound domain
   * 
   * @param domainId domain ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingEmailOutboundDomain(String domainId) throws IOException, ApiException {
     deleteRoutingEmailOutboundDomain(createDeleteRoutingEmailOutboundDomainRequest(domainId));
  }

  /**
   * Delete an outbound domain
   * 
   * @param domainId domain ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingEmailOutboundDomainWithHttpInfo(String domainId) throws IOException {
    return deleteRoutingEmailOutboundDomain(createDeleteRoutingEmailOutboundDomainRequest(domainId).withHttpInfo());
  }

  private DeleteRoutingEmailOutboundDomainRequest createDeleteRoutingEmailOutboundDomainRequest(String domainId) {
    return DeleteRoutingEmailOutboundDomainRequest.builder()
            .withDomainId(domainId)

            .build();
  }

  /**
   * Delete an outbound domain
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingEmailOutboundDomain(DeleteRoutingEmailOutboundDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an outbound domain
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingEmailOutboundDomain(ApiRequest<Void> request) throws IOException {
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
   * Delete a routing language
   * 
   * @param languageId Language ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingLanguage(String languageId) throws IOException, ApiException {
     deleteRoutingLanguage(createDeleteRoutingLanguageRequest(languageId));
  }

  /**
   * Delete a routing language
   * 
   * @param languageId Language ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingLanguageWithHttpInfo(String languageId) throws IOException {
    return deleteRoutingLanguage(createDeleteRoutingLanguageRequest(languageId).withHttpInfo());
  }

  private DeleteRoutingLanguageRequest createDeleteRoutingLanguageRequest(String languageId) {
    return DeleteRoutingLanguageRequest.builder()
            .withLanguageId(languageId)

            .build();
  }

  /**
   * Delete a routing language
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingLanguage(DeleteRoutingLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a routing language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingLanguage(ApiRequest<Void> request) throws IOException {
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * Delete an organization's routing settings
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSettings() throws IOException, ApiException {
     deleteRoutingSettings(createDeleteRoutingSettingsRequest());
  }

  /**
   * Delete an organization's routing settings
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
   * Delete an organization's routing settings
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
   * Delete an organization's routing settings
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
   * Remove skill group definition
   * 
   * @param skillGroupId Skill Group ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSkillgroup(String skillGroupId) throws IOException, ApiException {
     deleteRoutingSkillgroup(createDeleteRoutingSkillgroupRequest(skillGroupId));
  }

  /**
   * Remove skill group definition
   * 
   * @param skillGroupId Skill Group ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSkillgroupWithHttpInfo(String skillGroupId) throws IOException {
    return deleteRoutingSkillgroup(createDeleteRoutingSkillgroupRequest(skillGroupId).withHttpInfo());
  }

  private DeleteRoutingSkillgroupRequest createDeleteRoutingSkillgroupRequest(String skillGroupId) {
    return DeleteRoutingSkillgroupRequest.builder()
            .withSkillGroupId(skillGroupId)

            .build();
  }

  /**
   * Remove skill group definition
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSkillgroup(DeleteRoutingSkillgroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Remove skill group definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSkillgroup(ApiRequest<Void> request) throws IOException {
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
   * @param phoneNumberId phone number (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingSmsPhonenumber(String phoneNumberId) throws IOException, ApiException {
     deleteRoutingSmsPhonenumber(createDeleteRoutingSmsPhonenumberRequest(phoneNumberId));
  }

  /**
   * Delete a phone number provisioned for SMS.
   * 
   * @param phoneNumberId phone number (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingSmsPhonenumberWithHttpInfo(String phoneNumberId) throws IOException {
    return deleteRoutingSmsPhonenumber(createDeleteRoutingSmsPhonenumberRequest(phoneNumberId).withHttpInfo());
  }

  private DeleteRoutingSmsPhonenumberRequest createDeleteRoutingSmsPhonenumberRequest(String phoneNumberId) {
    return DeleteRoutingSmsPhonenumberRequest.builder()
            .withPhoneNumberId(phoneNumberId)

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
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUserDirectroutingbackupSettings(String userId) throws IOException, ApiException {
     deleteRoutingUserDirectroutingbackupSettings(createDeleteRoutingUserDirectroutingbackupSettingsRequest(userId));
  }

  /**
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @param userId User ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUserDirectroutingbackupSettingsWithHttpInfo(String userId) throws IOException {
    return deleteRoutingUserDirectroutingbackupSettings(createDeleteRoutingUserDirectroutingbackupSettingsRequest(userId).withHttpInfo());
  }

  private DeleteRoutingUserDirectroutingbackupSettingsRequest createDeleteRoutingUserDirectroutingbackupSettingsRequest(String userId) {
    return DeleteRoutingUserDirectroutingbackupSettingsRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUserDirectroutingbackupSettings(DeleteRoutingUserDirectroutingbackupSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete the user's Direct Routing Backup settings and revert to the Direct Routing Queue default.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUserDirectroutingbackupSettings(ApiRequest<Void> request) throws IOException {
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
   * Delete the user's max utilization settings and revert to the organization-wide default.
   * 
   * @param userId User ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUserUtilization(String userId) throws IOException, ApiException {
     deleteRoutingUserUtilization(createDeleteRoutingUserUtilizationRequest(userId));
  }

  /**
   * Delete the user's max utilization settings and revert to the organization-wide default.
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
   * Delete the user's max utilization settings and revert to the organization-wide default.
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
   * Delete the user's max utilization settings and revert to the organization-wide default.
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
   * Delete a utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @param forceDelete Remove all label usages (if found) without warning (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUtilizationLabel(String labelId, Boolean forceDelete) throws IOException, ApiException {
     deleteRoutingUtilizationLabel(createDeleteRoutingUtilizationLabelRequest(labelId, forceDelete));
  }

  /**
   * Delete a utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @param forceDelete Remove all label usages (if found) without warning (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUtilizationLabelWithHttpInfo(String labelId, Boolean forceDelete) throws IOException {
    return deleteRoutingUtilizationLabel(createDeleteRoutingUtilizationLabelRequest(labelId, forceDelete).withHttpInfo());
  }

  private DeleteRoutingUtilizationLabelRequest createDeleteRoutingUtilizationLabelRequest(String labelId, Boolean forceDelete) {
    return DeleteRoutingUtilizationLabelRequest.builder()
            .withLabelId(labelId)

            .withForceDelete(forceDelete)

            .build();
  }

  /**
   * Delete a utilization label
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUtilizationLabel(DeleteRoutingUtilizationLabelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a utilization label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUtilizationLabel(ApiRequest<Void> request) throws IOException {
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
   * Delete an utilization tag
   * 
   * deleteRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tagId Utilization Tag ID (required)
   * @param forceDelete Remove all tag usages (if found) without warning (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUtilizationTag(String tagId, Boolean forceDelete) throws IOException, ApiException {
     deleteRoutingUtilizationTag(createDeleteRoutingUtilizationTagRequest(tagId, forceDelete));
  }

  /**
   * Delete an utilization tag
   * 
   * deleteRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tagId Utilization Tag ID (required)
   * @param forceDelete Remove all tag usages (if found) without warning (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUtilizationTagWithHttpInfo(String tagId, Boolean forceDelete) throws IOException {
    return deleteRoutingUtilizationTag(createDeleteRoutingUtilizationTagRequest(tagId, forceDelete).withHttpInfo());
  }

  private DeleteRoutingUtilizationTagRequest createDeleteRoutingUtilizationTagRequest(String tagId, Boolean forceDelete) {
    return DeleteRoutingUtilizationTagRequest.builder()
            .withTagId(tagId)

            .withForceDelete(forceDelete)

            .build();
  }

  /**
   * Delete an utilization tag
   * 
   * deleteRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteRoutingUtilizationTag(DeleteRoutingUtilizationTagRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an utilization tag
   * 
   * deleteRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteRoutingUtilizationTag(ApiRequest<Void> request) throws IOException {
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
   * Remove a routing language from a user
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
   * Remove a routing language from a user
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
   * Remove a routing language from a user
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
   * Remove a routing language from a user
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
   * Remove a routing skill from a user
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
   * Remove a routing skill from a user
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
   * Remove a routing skill from a user
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
   * Remove a routing skill from a user
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
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
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
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
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
   * Get available media types
   * 
   * @return AvailableMediaTypeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableMediaTypeEntityListing getRoutingAvailablemediatypes() throws IOException, ApiException {
    return  getRoutingAvailablemediatypes(createGetRoutingAvailablemediatypesRequest());
  }

  /**
   * Get available media types
   * 
   * @return AvailableMediaTypeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableMediaTypeEntityListing> getRoutingAvailablemediatypesWithHttpInfo() throws IOException {
    return getRoutingAvailablemediatypes(createGetRoutingAvailablemediatypesRequest().withHttpInfo());
  }

  private GetRoutingAvailablemediatypesRequest createGetRoutingAvailablemediatypesRequest() {
    return GetRoutingAvailablemediatypesRequest.builder()
            .build();
  }

  /**
   * Get available media types
   * 
   * @param request The request object
   * @return AvailableMediaTypeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableMediaTypeEntityListing getRoutingAvailablemediatypes(GetRoutingAvailablemediatypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AvailableMediaTypeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AvailableMediaTypeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get available media types
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableMediaTypeEntityListing> getRoutingAvailablemediatypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AvailableMediaTypeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AvailableMediaTypeEntityListing> response = (ApiResponse<AvailableMediaTypeEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AvailableMediaTypeEntityListing> response = (ApiResponse<AvailableMediaTypeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the user's Direct Routing Backup settings.
   * 
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings getRoutingDirectroutingbackupSettingsMe() throws IOException, ApiException {
    return  getRoutingDirectroutingbackupSettingsMe(createGetRoutingDirectroutingbackupSettingsMeRequest());
  }

  /**
   * Get the user's Direct Routing Backup settings.
   * 
   * @return AgentDirectRoutingBackupSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> getRoutingDirectroutingbackupSettingsMeWithHttpInfo() throws IOException {
    return getRoutingDirectroutingbackupSettingsMe(createGetRoutingDirectroutingbackupSettingsMeRequest().withHttpInfo());
  }

  private GetRoutingDirectroutingbackupSettingsMeRequest createGetRoutingDirectroutingbackupSettingsMeRequest() {
    return GetRoutingDirectroutingbackupSettingsMeRequest.builder()
            .build();
  }

  /**
   * Get the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings getRoutingDirectroutingbackupSettingsMe(GetRoutingDirectroutingbackupSettingsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentDirectRoutingBackupSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentDirectRoutingBackupSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> getRoutingDirectroutingbackupSettingsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentDirectRoutingBackupSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param expand Which fields, if any, to expand (optional)
   * @return InboundRoute
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRoute getRoutingEmailDomainRoute(String domainName, String routeId, List<String> expand) throws IOException, ApiException {
    return  getRoutingEmailDomainRoute(createGetRoutingEmailDomainRouteRequest(domainName, routeId, expand));
  }

  /**
   * Get a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return InboundRoute
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRoute> getRoutingEmailDomainRouteWithHttpInfo(String domainName, String routeId, List<String> expand) throws IOException {
    return getRoutingEmailDomainRoute(createGetRoutingEmailDomainRouteRequest(domainName, routeId, expand).withHttpInfo());
  }

  private GetRoutingEmailDomainRouteRequest createGetRoutingEmailDomainRouteRequest(String domainName, String routeId, List<String> expand) {
    return GetRoutingEmailDomainRouteRequest.builder()
            .withDomainName(domainName)

            .withRouteId(routeId)

            .withExpand(expand)

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
   * Get a route identity resolution setting.
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getRoutingEmailDomainRouteIdentityresolution(String domainName, String routeId) throws IOException, ApiException {
    return  getRoutingEmailDomainRouteIdentityresolution(createGetRoutingEmailDomainRouteIdentityresolutionRequest(domainName, routeId));
  }

  /**
   * Get a route identity resolution setting.
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getRoutingEmailDomainRouteIdentityresolutionWithHttpInfo(String domainName, String routeId) throws IOException {
    return getRoutingEmailDomainRouteIdentityresolution(createGetRoutingEmailDomainRouteIdentityresolutionRequest(domainName, routeId).withHttpInfo());
  }

  private GetRoutingEmailDomainRouteIdentityresolutionRequest createGetRoutingEmailDomainRouteIdentityresolutionRequest(String domainName, String routeId) {
    return GetRoutingEmailDomainRouteIdentityresolutionRequest.builder()
            .withDomainName(domainName)

            .withRouteId(routeId)

            .build();
  }

  /**
   * Get a route identity resolution setting.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getRoutingEmailDomainRouteIdentityresolution(GetRoutingEmailDomainRouteIdentityresolutionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a route identity resolution setting.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getRoutingEmailDomainRouteIdentityresolution(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pattern Filter routes by the route's pattern property (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return InboundRouteEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundRouteEntityListing getRoutingEmailDomainRoutes(String domainName, Integer pageSize, Integer pageNumber, String pattern, List<String> expand) throws IOException, ApiException {
    return  getRoutingEmailDomainRoutes(createGetRoutingEmailDomainRoutesRequest(domainName, pageSize, pageNumber, pattern, expand));
  }

  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pattern Filter routes by the route's pattern property (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return InboundRouteEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundRouteEntityListing> getRoutingEmailDomainRoutesWithHttpInfo(String domainName, Integer pageSize, Integer pageNumber, String pattern, List<String> expand) throws IOException {
    return getRoutingEmailDomainRoutes(createGetRoutingEmailDomainRoutesRequest(domainName, pageSize, pageNumber, pattern, expand).withHttpInfo());
  }

  private GetRoutingEmailDomainRoutesRequest createGetRoutingEmailDomainRoutesRequest(String domainName, Integer pageSize, Integer pageNumber, String pattern, List<String> expand) {
    return GetRoutingEmailDomainRoutesRequest.builder()
            .withDomainName(domainName)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withPattern(pattern)

            .withExpand(expand)

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
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param excludeStatus Exclude MX record data (optional, default to false)
   * @param filter Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter. (optional)
   * @return InboundDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public InboundDomainEntityListing getRoutingEmailDomains(Integer pageSize, Integer pageNumber, Boolean excludeStatus, String filter) throws IOException, ApiException {
    return  getRoutingEmailDomains(createGetRoutingEmailDomainsRequest(pageSize, pageNumber, excludeStatus, filter));
  }

  /**
   * Get domains
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param excludeStatus Exclude MX record data (optional, default to false)
   * @param filter Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter. (optional)
   * @return InboundDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<InboundDomainEntityListing> getRoutingEmailDomainsWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean excludeStatus, String filter) throws IOException {
    return getRoutingEmailDomains(createGetRoutingEmailDomainsRequest(pageSize, pageNumber, excludeStatus, filter).withHttpInfo());
  }

  private GetRoutingEmailDomainsRequest createGetRoutingEmailDomainsRequest(Integer pageSize, Integer pageNumber, Boolean excludeStatus, String filter) {
    return GetRoutingEmailDomainsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withExcludeStatus(excludeStatus)

            .withFilter(filter)

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
   * Get domain
   * 
   * @param domainId domain ID (required)
   * @return OutboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundDomain getRoutingEmailOutboundDomain(String domainId) throws IOException, ApiException {
    return  getRoutingEmailOutboundDomain(createGetRoutingEmailOutboundDomainRequest(domainId));
  }

  /**
   * Get domain
   * 
   * @param domainId domain ID (required)
   * @return OutboundDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundDomain> getRoutingEmailOutboundDomainWithHttpInfo(String domainId) throws IOException {
    return getRoutingEmailOutboundDomain(createGetRoutingEmailOutboundDomainRequest(domainId).withHttpInfo());
  }

  private GetRoutingEmailOutboundDomainRequest createGetRoutingEmailOutboundDomainRequest(String domainId) {
    return GetRoutingEmailOutboundDomainRequest.builder()
            .withDomainId(domainId)

            .build();
  }

  /**
   * Get domain
   * 
   * @param request The request object
   * @return OutboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundDomain getRoutingEmailOutboundDomain(GetRoutingEmailOutboundDomainRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundDomain>() {});
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
  public ApiResponse<OutboundDomain> getRoutingEmailOutboundDomain(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundDomain> response = (ApiResponse<OutboundDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundDomain> response = (ApiResponse<OutboundDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get activation status (cname + dkim) of an outbound domain
   * 
   * @param domainId domain ID (required)
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult getRoutingEmailOutboundDomainActivation(String domainId) throws IOException, ApiException {
    return  getRoutingEmailOutboundDomainActivation(createGetRoutingEmailOutboundDomainActivationRequest(domainId));
  }

  /**
   * Get activation status (cname + dkim) of an outbound domain
   * 
   * @param domainId domain ID (required)
   * @return EmailOutboundDomainResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailOutboundDomainResult> getRoutingEmailOutboundDomainActivationWithHttpInfo(String domainId) throws IOException {
    return getRoutingEmailOutboundDomainActivation(createGetRoutingEmailOutboundDomainActivationRequest(domainId).withHttpInfo());
  }

  private GetRoutingEmailOutboundDomainActivationRequest createGetRoutingEmailOutboundDomainActivationRequest(String domainId) {
    return GetRoutingEmailOutboundDomainActivationRequest.builder()
            .withDomainId(domainId)

            .build();
  }

  /**
   * Get activation status (cname + dkim) of an outbound domain
   * 
   * @param request The request object
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult getRoutingEmailOutboundDomainActivation(GetRoutingEmailOutboundDomainActivationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailOutboundDomainResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailOutboundDomainResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get activation status (cname + dkim) of an outbound domain
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailOutboundDomainResult> getRoutingEmailOutboundDomainActivation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailOutboundDomainResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search a domain across organizations
   * 
   * @param domainId domain ID (required)
   * @return OutboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundDomain getRoutingEmailOutboundDomainSearch(String domainId) throws IOException, ApiException {
    return  getRoutingEmailOutboundDomainSearch(createGetRoutingEmailOutboundDomainSearchRequest(domainId));
  }

  /**
   * Search a domain across organizations
   * 
   * @param domainId domain ID (required)
   * @return OutboundDomain
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundDomain> getRoutingEmailOutboundDomainSearchWithHttpInfo(String domainId) throws IOException {
    return getRoutingEmailOutboundDomainSearch(createGetRoutingEmailOutboundDomainSearchRequest(domainId).withHttpInfo());
  }

  private GetRoutingEmailOutboundDomainSearchRequest createGetRoutingEmailOutboundDomainSearchRequest(String domainId) {
    return GetRoutingEmailOutboundDomainSearchRequest.builder()
            .withDomainId(domainId)

            .build();
  }

  /**
   * Search a domain across organizations
   * 
   * @param request The request object
   * @return OutboundDomain
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundDomain getRoutingEmailOutboundDomainSearch(GetRoutingEmailOutboundDomainSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundDomain> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundDomain>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search a domain across organizations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundDomain> getRoutingEmailOutboundDomainSearch(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundDomain>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundDomain> response = (ApiResponse<OutboundDomain>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundDomain> response = (ApiResponse<OutboundDomain>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get outbound domains
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filter Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter. (optional)
   * @return OutboundDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundDomainEntityListing getRoutingEmailOutboundDomains(Integer pageSize, Integer pageNumber, String filter) throws IOException, ApiException {
    return  getRoutingEmailOutboundDomains(createGetRoutingEmailOutboundDomainsRequest(pageSize, pageNumber, filter));
  }

  /**
   * Get outbound domains
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filter Optional search filter that, if defined, use the **filter** syntax, eg: **mySearchedPattern**. Note that **** is considered no filter. (optional)
   * @return OutboundDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundDomainEntityListing> getRoutingEmailOutboundDomainsWithHttpInfo(Integer pageSize, Integer pageNumber, String filter) throws IOException {
    return getRoutingEmailOutboundDomains(createGetRoutingEmailOutboundDomainsRequest(pageSize, pageNumber, filter).withHttpInfo());
  }

  private GetRoutingEmailOutboundDomainsRequest createGetRoutingEmailOutboundDomainsRequest(Integer pageSize, Integer pageNumber, String filter) {
    return GetRoutingEmailOutboundDomainsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilter(filter)

            .build();
  }

  /**
   * Get outbound domains
   * 
   * @param request The request object
   * @return OutboundDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundDomainEntityListing getRoutingEmailOutboundDomains(GetRoutingEmailOutboundDomainsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundDomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundDomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get outbound domains
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundDomainEntityListing> getRoutingEmailOutboundDomains(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundDomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundDomainEntityListing> response = (ApiResponse<OutboundDomainEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OutboundDomainEntityListing> response = (ApiResponse<OutboundDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a routing language
   * 
   * @param languageId Language ID (required)
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language getRoutingLanguage(String languageId) throws IOException, ApiException {
    return  getRoutingLanguage(createGetRoutingLanguageRequest(languageId));
  }

  /**
   * Get a routing language
   * 
   * @param languageId Language ID (required)
   * @return Language
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> getRoutingLanguageWithHttpInfo(String languageId) throws IOException {
    return getRoutingLanguage(createGetRoutingLanguageRequest(languageId).withHttpInfo());
  }

  private GetRoutingLanguageRequest createGetRoutingLanguageRequest(String languageId) {
    return GetRoutingLanguageRequest.builder()
            .withLanguageId(languageId)

            .build();
  }

  /**
   * Get a routing language
   * 
   * @param request The request object
   * @return Language
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Language getRoutingLanguage(GetRoutingLanguageRequest request) throws IOException, ApiException {
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
   * Get a routing language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Language> getRoutingLanguage(ApiRequest<Void> request) throws IOException {
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
   * @param name Recipient Name (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return RecipientListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RecipientListing getRoutingMessageRecipients(String messengerType, String name, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getRoutingMessageRecipients(createGetRoutingMessageRecipientsRequest(messengerType, name, pageSize, pageNumber));
  }

  /**
   * Get recipients
   * 
   * @param messengerType Messenger Type (optional)
   * @param name Recipient Name (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return RecipientListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RecipientListing> getRoutingMessageRecipientsWithHttpInfo(String messengerType, String name, Integer pageSize, Integer pageNumber) throws IOException {
    return getRoutingMessageRecipients(createGetRoutingMessageRecipientsRequest(messengerType, name, pageSize, pageNumber).withHttpInfo());
  }

  private GetRoutingMessageRecipientsRequest createGetRoutingMessageRecipientsRequest(String messengerType, String name, Integer pageSize, Integer pageNumber) {
    return GetRoutingMessageRecipientsRequest.builder()
            .withMessengerType(messengerType)

            .withName(name)

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
   * Retrieve Predictor Model Features.
   * 
   * @param predictorId Predictor ID (required)
   * @param modelId Model ID (required)
   * @return PredictorModelFeatureListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PredictorModelFeatureListing getRoutingPredictorModelFeatures(String predictorId, String modelId) throws IOException, ApiException {
    return  getRoutingPredictorModelFeatures(createGetRoutingPredictorModelFeaturesRequest(predictorId, modelId));
  }

  /**
   * Retrieve Predictor Model Features.
   * 
   * @param predictorId Predictor ID (required)
   * @param modelId Model ID (required)
   * @return PredictorModelFeatureListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PredictorModelFeatureListing> getRoutingPredictorModelFeaturesWithHttpInfo(String predictorId, String modelId) throws IOException {
    return getRoutingPredictorModelFeatures(createGetRoutingPredictorModelFeaturesRequest(predictorId, modelId).withHttpInfo());
  }

  private GetRoutingPredictorModelFeaturesRequest createGetRoutingPredictorModelFeaturesRequest(String predictorId, String modelId) {
    return GetRoutingPredictorModelFeaturesRequest.builder()
            .withPredictorId(predictorId)

            .withModelId(modelId)

            .build();
  }

  /**
   * Retrieve Predictor Model Features.
   * 
   * @param request The request object
   * @return PredictorModelFeatureListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PredictorModelFeatureListing getRoutingPredictorModelFeatures(GetRoutingPredictorModelFeaturesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PredictorModelFeatureListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PredictorModelFeatureListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve Predictor Model Features.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PredictorModelFeatureListing> getRoutingPredictorModelFeatures(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PredictorModelFeatureListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PredictorModelFeatureListing> response = (ApiResponse<PredictorModelFeatureListing>)(ApiResponse<?>)exception;
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
      ApiResponse<PredictorModelFeatureListing> response = (ApiResponse<PredictorModelFeatureListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve Predictor Models and Top Features.
   * 
   * @param predictorId Predictor ID (required)
   * @return PredictorModels
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PredictorModels getRoutingPredictorModels(String predictorId) throws IOException, ApiException {
    return  getRoutingPredictorModels(createGetRoutingPredictorModelsRequest(predictorId));
  }

  /**
   * Retrieve Predictor Models and Top Features.
   * 
   * @param predictorId Predictor ID (required)
   * @return PredictorModels
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PredictorModels> getRoutingPredictorModelsWithHttpInfo(String predictorId) throws IOException {
    return getRoutingPredictorModels(createGetRoutingPredictorModelsRequest(predictorId).withHttpInfo());
  }

  private GetRoutingPredictorModelsRequest createGetRoutingPredictorModelsRequest(String predictorId) {
    return GetRoutingPredictorModelsRequest.builder()
            .withPredictorId(predictorId)

            .build();
  }

  /**
   * Retrieve Predictor Models and Top Features.
   * 
   * @param request The request object
   * @return PredictorModels
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PredictorModels getRoutingPredictorModels(GetRoutingPredictorModelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PredictorModels> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PredictorModels>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve Predictor Models and Top Features.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PredictorModels> getRoutingPredictorModels(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PredictorModels>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PredictorModels> response = (ApiResponse<PredictorModels>)(ApiResponse<?>)exception;
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
      ApiResponse<PredictorModels> response = (ApiResponse<PredictorModels>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve all predictors.
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
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
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize (optional)
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
   * Get a list of Key Performance Indicators
   * 
   * @param kpiGroup The Group of Key Performance Indicators to return (optional)
   * @param expand Parameter to request additional data to return in KPI payload (optional)
   * @return List<KeyPerformanceIndicator>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<KeyPerformanceIndicator> getRoutingPredictorsKeyperformanceindicators(String kpiGroup, List<String> expand) throws IOException, ApiException {
    return  getRoutingPredictorsKeyperformanceindicators(createGetRoutingPredictorsKeyperformanceindicatorsRequest(kpiGroup, expand));
  }

  /**
   * Get a list of Key Performance Indicators
   * 
   * @param kpiGroup The Group of Key Performance Indicators to return (optional)
   * @param expand Parameter to request additional data to return in KPI payload (optional)
   * @return List<KeyPerformanceIndicator>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<KeyPerformanceIndicator>> getRoutingPredictorsKeyperformanceindicatorsWithHttpInfo(String kpiGroup, List<String> expand) throws IOException {
    return getRoutingPredictorsKeyperformanceindicators(createGetRoutingPredictorsKeyperformanceindicatorsRequest(kpiGroup, expand).withHttpInfo());
  }

  private GetRoutingPredictorsKeyperformanceindicatorsRequest createGetRoutingPredictorsKeyperformanceindicatorsRequest(String kpiGroup, List<String> expand) {
    return GetRoutingPredictorsKeyperformanceindicatorsRequest.builder()
            .withKpiGroup(kpiGroup)

            .withExpand(expand)

            .build();
  }

  /**
   * Get a list of Key Performance Indicators
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
   * Get a list of Key Performance Indicators
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
   * @param expand Which fields, if any, to expand (optional)
   * @return Queue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Queue getRoutingQueue(String queueId, List<String> expand) throws IOException, ApiException {
    return  getRoutingQueue(createGetRoutingQueueRequest(queueId, expand));
  }

  /**
   * Get details about this queue.
   * 
   * @param queueId Queue ID (required)
   * @param expand Which fields, if any, to expand (optional)
   * @return Queue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Queue> getRoutingQueueWithHttpInfo(String queueId, List<String> expand) throws IOException {
    return getRoutingQueue(createGetRoutingQueueRequest(queueId, expand).withHttpInfo());
  }

  private GetRoutingQueueRequest createGetRoutingQueueRequest(String queueId, List<String> expand) {
    return GetRoutingQueueRequest.builder()
            .withQueueId(queueId)

            .withExpand(expand)

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
   * Get an assistant associated with a queue.
   * 
   * @param queueId Queue ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueue getRoutingQueueAssistant(String queueId, String expand) throws IOException, ApiException {
    return  getRoutingQueueAssistant(createGetRoutingQueueAssistantRequest(queueId, expand));
  }

  /**
   * Get an assistant associated with a queue.
   * 
   * @param queueId Queue ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return AssistantQueue
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueue> getRoutingQueueAssistantWithHttpInfo(String queueId, String expand) throws IOException {
    return getRoutingQueueAssistant(createGetRoutingQueueAssistantRequest(queueId, expand).withHttpInfo());
  }

  private GetRoutingQueueAssistantRequest createGetRoutingQueueAssistantRequest(String queueId, String expand) {
    return GetRoutingQueueAssistantRequest.builder()
            .withQueueId(queueId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get an assistant associated with a queue.
   * 
   * @param request The request object
   * @return AssistantQueue
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AssistantQueue getRoutingQueueAssistant(GetRoutingQueueAssistantRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AssistantQueue> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AssistantQueue>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an assistant associated with a queue.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AssistantQueue> getRoutingQueueAssistant(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AssistantQueue>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AssistantQueue> response = (ApiResponse<AssistantQueue>)(ApiResponse<?>)exception;
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
      ApiResponse<AssistantQueue> response = (ApiResponse<AssistantQueue>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Queue IdentityResolution Settings.
   * 
   * @param queueId Queue ID (required)
   * @return IdentityResolutionQueueConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionQueueConfig getRoutingQueueIdentityresolution(String queueId) throws IOException, ApiException {
    return  getRoutingQueueIdentityresolution(createGetRoutingQueueIdentityresolutionRequest(queueId));
  }

  /**
   * Get Queue IdentityResolution Settings.
   * 
   * @param queueId Queue ID (required)
   * @return IdentityResolutionQueueConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionQueueConfig> getRoutingQueueIdentityresolutionWithHttpInfo(String queueId) throws IOException {
    return getRoutingQueueIdentityresolution(createGetRoutingQueueIdentityresolutionRequest(queueId).withHttpInfo());
  }

  private GetRoutingQueueIdentityresolutionRequest createGetRoutingQueueIdentityresolutionRequest(String queueId) {
    return GetRoutingQueueIdentityresolutionRequest.builder()
            .withQueueId(queueId)

            .build();
  }

  /**
   * Get Queue IdentityResolution Settings.
   * 
   * @param request The request object
   * @return IdentityResolutionQueueConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionQueueConfig getRoutingQueueIdentityresolution(GetRoutingQueueIdentityresolutionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionQueueConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionQueueConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Queue IdentityResolution Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionQueueConfig> getRoutingQueueIdentityresolution(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionQueueConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionQueueConfig> response = (ApiResponse<IdentityResolutionQueueConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionQueueConfig> response = (ApiResponse<IdentityResolutionQueueConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param mediaType mediaType (required)
   * @param labelId Unique id that represents the interaction label used with media type for EWT calculation (optional)
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimatedWaitTimePredictions getRoutingQueueMediatypeEstimatedwaittime(String queueId, String mediaType, String labelId) throws IOException, ApiException {
    return  getRoutingQueueMediatypeEstimatedwaittime(createGetRoutingQueueMediatypeEstimatedwaittimeRequest(queueId, mediaType, labelId));
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param mediaType mediaType (required)
   * @param labelId Unique id that represents the interaction label used with media type for EWT calculation (optional)
   * @return EstimatedWaitTimePredictions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueMediatypeEstimatedwaittimeWithHttpInfo(String queueId, String mediaType, String labelId) throws IOException {
    return getRoutingQueueMediatypeEstimatedwaittime(createGetRoutingQueueMediatypeEstimatedwaittimeRequest(queueId, mediaType, labelId).withHttpInfo());
  }

  private GetRoutingQueueMediatypeEstimatedwaittimeRequest createGetRoutingQueueMediatypeEstimatedwaittimeRequest(String queueId, String mediaType, String labelId) {
    return GetRoutingQueueMediatypeEstimatedwaittimeRequest.builder()
            .withQueueId(queueId)

            .withMediaType(mediaType)

            .withLabelId(labelId)

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
   * @param name Filter by queue member name (contains-style search) (optional)
   * @param profileSkills Filter by profile skill (contains-style search) (optional)
   * @param skills Filter by skill (contains-style search) (optional)
   * @param languages Filter by language (contains-style search) (optional)
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
   * @param name Filter by queue member name (contains-style search) (optional)
   * @param profileSkills Filter by profile skill (contains-style search) (optional)
   * @param skills Filter by skill (contains-style search) (optional)
   * @param languages Filter by language (contains-style search) (optional)
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
   * @return QueueMemberEntityListingV1
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public QueueMemberEntityListingV1 getRoutingQueueUsers(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, Boolean joined, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence) throws IOException, ApiException {
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
   * @return QueueMemberEntityListingV1
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<QueueMemberEntityListingV1> getRoutingQueueUsersWithHttpInfo(String queueId, Integer pageNumber, Integer pageSize, String sortOrder, List<String> expand, Boolean joined, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence) throws IOException {
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
   * @return QueueMemberEntityListingV1
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public QueueMemberEntityListingV1 getRoutingQueueUsers(GetRoutingQueueUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueMemberEntityListingV1> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueMemberEntityListingV1>() {});
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
   * @deprecated
   */
  public ApiResponse<QueueMemberEntityListingV1> getRoutingQueueUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueMemberEntityListingV1>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueMemberEntityListingV1> response = (ApiResponse<QueueMemberEntityListingV1>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueMemberEntityListingV1> response = (ApiResponse<QueueMemberEntityListingV1>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Wrapup code's name (trailing asterisks allowed) (optional)
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingQueueWrapupcodes(String queueId, Integer pageSize, Integer pageNumber, String name) throws IOException, ApiException {
    return  getRoutingQueueWrapupcodes(createGetRoutingQueueWrapupcodesRequest(queueId, pageSize, pageNumber, name));
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Wrapup code's name (trailing asterisks allowed) (optional)
   * @return WrapupCodeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingQueueWrapupcodesWithHttpInfo(String queueId, Integer pageSize, Integer pageNumber, String name) throws IOException {
    return getRoutingQueueWrapupcodes(createGetRoutingQueueWrapupcodesRequest(queueId, pageSize, pageNumber, name).withHttpInfo());
  }

  private GetRoutingQueueWrapupcodesRequest createGetRoutingQueueWrapupcodesRequest(String queueId, Integer pageSize, Integer pageNumber, String name) {
    return GetRoutingQueueWrapupcodesRequest.builder()
            .withQueueId(queueId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)

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
   * @param name Include only queues with the given name (leading and trailing asterisks allowed) (optional)
   * @param id Include only queues with the specified ID(s) (optional)
   * @param divisionId Include only queues in the specified division ID(s) (optional)
   * @param peerId Include only queues with the specified peer ID(s) (optional)
   * @param cannedResponseLibraryId Include only queues explicitly associated with the specified canned response library ID (optional)
   * @param hasPeer Include only queues with a peer ID (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return QueueEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueEntityListing getRoutingQueues(Integer pageNumber, Integer pageSize, String sortOrder, String name, List<String> id, List<String> divisionId, List<String> peerId, String cannedResponseLibraryId, Boolean hasPeer, List<String> expand) throws IOException, ApiException {
    return  getRoutingQueues(createGetRoutingQueuesRequest(pageNumber, pageSize, sortOrder, name, id, divisionId, peerId, cannedResponseLibraryId, hasPeer, expand));
  }

  /**
   * Get list of queues.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Note: results are sorted by name. (optional, default to asc)
   * @param name Include only queues with the given name (leading and trailing asterisks allowed) (optional)
   * @param id Include only queues with the specified ID(s) (optional)
   * @param divisionId Include only queues in the specified division ID(s) (optional)
   * @param peerId Include only queues with the specified peer ID(s) (optional)
   * @param cannedResponseLibraryId Include only queues explicitly associated with the specified canned response library ID (optional)
   * @param hasPeer Include only queues with a peer ID (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return QueueEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueEntityListing> getRoutingQueuesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortOrder, String name, List<String> id, List<String> divisionId, List<String> peerId, String cannedResponseLibraryId, Boolean hasPeer, List<String> expand) throws IOException {
    return getRoutingQueues(createGetRoutingQueuesRequest(pageNumber, pageSize, sortOrder, name, id, divisionId, peerId, cannedResponseLibraryId, hasPeer, expand).withHttpInfo());
  }

  private GetRoutingQueuesRequest createGetRoutingQueuesRequest(Integer pageNumber, Integer pageSize, String sortOrder, String name, List<String> id, List<String> divisionId, List<String> peerId, String cannedResponseLibraryId, Boolean hasPeer, List<String> expand) {
    return GetRoutingQueuesRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .withName(name)

            .withId(id)

            .withDivisionId(divisionId)

            .withPeerId(peerId)

            .withCannedResponseLibraryId(cannedResponseLibraryId)

            .withHasPeer(hasPeer)

            .withExpand(expand)

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
   * Get an organization's routing settings
   * 
   * @return RoutingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingSettings getRoutingSettings() throws IOException, ApiException {
    return  getRoutingSettings(createGetRoutingSettingsRequest());
  }

  /**
   * Get an organization's routing settings
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
   * Get an organization's routing settings
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
   * Get an organization's routing settings
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
   * Get skill group
   * 
   * @param skillGroupId Skill Group ID (required)
   * @return SkillGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroup getRoutingSkillgroup(String skillGroupId) throws IOException, ApiException {
    return  getRoutingSkillgroup(createGetRoutingSkillgroupRequest(skillGroupId));
  }

  /**
   * Get skill group
   * 
   * @param skillGroupId Skill Group ID (required)
   * @return SkillGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroup> getRoutingSkillgroupWithHttpInfo(String skillGroupId) throws IOException {
    return getRoutingSkillgroup(createGetRoutingSkillgroupRequest(skillGroupId).withHttpInfo());
  }

  private GetRoutingSkillgroupRequest createGetRoutingSkillgroupRequest(String skillGroupId) {
    return GetRoutingSkillgroupRequest.builder()
            .withSkillGroupId(skillGroupId)

            .build();
  }

  /**
   * Get skill group
   * 
   * @param request The request object
   * @return SkillGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroup getRoutingSkillgroup(GetRoutingSkillgroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SkillGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SkillGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get skill group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroup> getRoutingSkillgroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SkillGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SkillGroup> response = (ApiResponse<SkillGroup>)(ApiResponse<?>)exception;
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
      ApiResponse<SkillGroup> response = (ApiResponse<SkillGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get skill group members
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param after The cursor that points to the next item (optional)
   * @param before The cursor that points to the previous item (optional)
   * @param expand Expand the name on each user (optional)
   * @return SkillGroupMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupMemberEntityListing getRoutingSkillgroupMembers(String skillGroupId, Integer pageSize, String after, String before, String expand) throws IOException, ApiException {
    return  getRoutingSkillgroupMembers(createGetRoutingSkillgroupMembersRequest(skillGroupId, pageSize, after, before, expand));
  }

  /**
   * Get skill group members
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param after The cursor that points to the next item (optional)
   * @param before The cursor that points to the previous item (optional)
   * @param expand Expand the name on each user (optional)
   * @return SkillGroupMemberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupMemberEntityListing> getRoutingSkillgroupMembersWithHttpInfo(String skillGroupId, Integer pageSize, String after, String before, String expand) throws IOException {
    return getRoutingSkillgroupMembers(createGetRoutingSkillgroupMembersRequest(skillGroupId, pageSize, after, before, expand).withHttpInfo());
  }

  private GetRoutingSkillgroupMembersRequest createGetRoutingSkillgroupMembersRequest(String skillGroupId, Integer pageSize, String after, String before, String expand) {
    return GetRoutingSkillgroupMembersRequest.builder()
            .withSkillGroupId(skillGroupId)

            .withPageSize(pageSize)

            .withAfter(after)

            .withBefore(before)

            .withExpand(expand)

            .build();
  }

  /**
   * Get skill group members
   * 
   * @param request The request object
   * @return SkillGroupMemberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupMemberEntityListing getRoutingSkillgroupMembers(GetRoutingSkillgroupMembersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SkillGroupMemberEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SkillGroupMemberEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get skill group members
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupMemberEntityListing> getRoutingSkillgroupMembers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SkillGroupMemberEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SkillGroupMemberEntityListing> response = (ApiResponse<SkillGroupMemberEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SkillGroupMemberEntityListing> response = (ApiResponse<SkillGroupMemberEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of member divisions for this skill group.
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param expand Expand the name on each user (optional)
   * @return SkillGroupMemberDivisionList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupMemberDivisionList getRoutingSkillgroupMembersDivisions(String skillGroupId, String expand) throws IOException, ApiException {
    return  getRoutingSkillgroupMembersDivisions(createGetRoutingSkillgroupMembersDivisionsRequest(skillGroupId, expand));
  }

  /**
   * Get list of member divisions for this skill group.
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param expand Expand the name on each user (optional)
   * @return SkillGroupMemberDivisionList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupMemberDivisionList> getRoutingSkillgroupMembersDivisionsWithHttpInfo(String skillGroupId, String expand) throws IOException {
    return getRoutingSkillgroupMembersDivisions(createGetRoutingSkillgroupMembersDivisionsRequest(skillGroupId, expand).withHttpInfo());
  }

  private GetRoutingSkillgroupMembersDivisionsRequest createGetRoutingSkillgroupMembersDivisionsRequest(String skillGroupId, String expand) {
    return GetRoutingSkillgroupMembersDivisionsRequest.builder()
            .withSkillGroupId(skillGroupId)

            .withExpand(expand)

            .build();
  }

  /**
   * Get list of member divisions for this skill group.
   * 
   * @param request The request object
   * @return SkillGroupMemberDivisionList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupMemberDivisionList getRoutingSkillgroupMembersDivisions(GetRoutingSkillgroupMembersDivisionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SkillGroupMemberDivisionList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SkillGroupMemberDivisionList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of member divisions for this skill group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupMemberDivisionList> getRoutingSkillgroupMembersDivisions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SkillGroupMemberDivisionList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SkillGroupMemberDivisionList> response = (ApiResponse<SkillGroupMemberDivisionList>)(ApiResponse<?>)exception;
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
      ApiResponse<SkillGroupMemberDivisionList> response = (ApiResponse<SkillGroupMemberDivisionList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get skill group listing
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param name Return only skill group names whose names start with this value (case-insensitive matching) (optional)
   * @param after The cursor that points to the next item (optional)
   * @param before The cursor that points to the previous item (optional)
   * @return SkillGroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupEntityListing getRoutingSkillgroups(Integer pageSize, String name, String after, String before) throws IOException, ApiException {
    return  getRoutingSkillgroups(createGetRoutingSkillgroupsRequest(pageSize, name, after, before));
  }

  /**
   * Get skill group listing
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param name Return only skill group names whose names start with this value (case-insensitive matching) (optional)
   * @param after The cursor that points to the next item (optional)
   * @param before The cursor that points to the previous item (optional)
   * @return SkillGroupEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupEntityListing> getRoutingSkillgroupsWithHttpInfo(Integer pageSize, String name, String after, String before) throws IOException {
    return getRoutingSkillgroups(createGetRoutingSkillgroupsRequest(pageSize, name, after, before).withHttpInfo());
  }

  private GetRoutingSkillgroupsRequest createGetRoutingSkillgroupsRequest(Integer pageSize, String name, String after, String before) {
    return GetRoutingSkillgroupsRequest.builder()
            .withPageSize(pageSize)

            .withName(name)

            .withAfter(after)

            .withBefore(before)

            .build();
  }

  /**
   * Get skill group listing
   * 
   * @param request The request object
   * @return SkillGroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupEntityListing getRoutingSkillgroups(GetRoutingSkillgroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SkillGroupEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SkillGroupEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get skill group listing
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupEntityListing> getRoutingSkillgroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SkillGroupEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SkillGroupEntityListing> response = (ApiResponse<SkillGroupEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SkillGroupEntityListing> response = (ApiResponse<SkillGroupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param pattern A pattern to match phone numbers. Valid characters are '*' and [0-9a-zA-Z]. The '*' character will match any single digit. (optional)
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
   * @param pattern A pattern to match phone numbers. Valid characters are '*' and [0-9a-zA-Z]. The '*' character will match any single digit. (optional)
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
   * Get a SMS identity resolution settings.
   * 
   * @param addressId Address ID (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getRoutingSmsIdentityresolutionPhonenumber(String addressId) throws IOException, ApiException {
    return  getRoutingSmsIdentityresolutionPhonenumber(createGetRoutingSmsIdentityresolutionPhonenumberRequest(addressId));
  }

  /**
   * Get a SMS identity resolution settings.
   * 
   * @param addressId Address ID (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getRoutingSmsIdentityresolutionPhonenumberWithHttpInfo(String addressId) throws IOException {
    return getRoutingSmsIdentityresolutionPhonenumber(createGetRoutingSmsIdentityresolutionPhonenumberRequest(addressId).withHttpInfo());
  }

  private GetRoutingSmsIdentityresolutionPhonenumberRequest createGetRoutingSmsIdentityresolutionPhonenumberRequest(String addressId) {
    return GetRoutingSmsIdentityresolutionPhonenumberRequest.builder()
            .withAddressId(addressId)

            .build();
  }

  /**
   * Get a SMS identity resolution settings.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getRoutingSmsIdentityresolutionPhonenumber(GetRoutingSmsIdentityresolutionPhonenumberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a SMS identity resolution settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getRoutingSmsIdentityresolutionPhonenumber(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a phone number provisioned for SMS.
   * 
   * @param phoneNumberId phone number (required)
   * @param expand Expand response with additional information (optional)
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber getRoutingSmsPhonenumber(String phoneNumberId, String expand) throws IOException, ApiException {
    return  getRoutingSmsPhonenumber(createGetRoutingSmsPhonenumberRequest(phoneNumberId, expand));
  }

  /**
   * Get a phone number provisioned for SMS.
   * 
   * @param phoneNumberId phone number (required)
   * @param expand Expand response with additional information (optional)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> getRoutingSmsPhonenumberWithHttpInfo(String phoneNumberId, String expand) throws IOException {
    return getRoutingSmsPhonenumber(createGetRoutingSmsPhonenumberRequest(phoneNumberId, expand).withHttpInfo());
  }

  private GetRoutingSmsPhonenumberRequest createGetRoutingSmsPhonenumberRequest(String phoneNumberId, String expand) {
    return GetRoutingSmsPhonenumberRequest.builder()
            .withPhoneNumberId(phoneNumberId)

            .withExpand(expand)

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
   * @param phoneNumber Filter on phone number address. Allowable characters are the digits '0-9' and the wild card character '\\*'. If just digits are present, a contains search is done on the address pattern. For example, '317' could be matched anywhere in the address. An '\\*' will match multiple digits. For example, to match a specific area code within the US a pattern like '1317*' could be used. (optional)
   * @param phoneNumberType Filter on phone number type (optional)
   * @param phoneNumberStatus Filter on phone number status (optional)
   * @param countryCode Filter on country code (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Optional field to sort results (optional)
   * @param sortOrder Sort order (optional)
   * @param language A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize country field and sort operations (optional, default to "en-US")
   * @param integrationId Filter on the Genesys Cloud integration id to which the phone number belongs to (optional)
   * @param supportedContentId Filter based on the supported content ID (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return SmsPhoneNumberEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumberEntityListing getRoutingSmsPhonenumbers(String phoneNumber, List<String> phoneNumberType, List<String> phoneNumberStatus, List<String> countryCode, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String language, String integrationId, String supportedContentId, List<String> expand) throws IOException, ApiException {
    return  getRoutingSmsPhonenumbers(createGetRoutingSmsPhonenumbersRequest(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language, integrationId, supportedContentId, expand));
  }

  /**
   * Get a list of provisioned phone numbers.
   * 
   * @param phoneNumber Filter on phone number address. Allowable characters are the digits '0-9' and the wild card character '\\*'. If just digits are present, a contains search is done on the address pattern. For example, '317' could be matched anywhere in the address. An '\\*' will match multiple digits. For example, to match a specific area code within the US a pattern like '1317*' could be used. (optional)
   * @param phoneNumberType Filter on phone number type (optional)
   * @param phoneNumberStatus Filter on phone number status (optional)
   * @param countryCode Filter on country code (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Optional field to sort results (optional)
   * @param sortOrder Sort order (optional)
   * @param language A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize country field and sort operations (optional, default to "en-US")
   * @param integrationId Filter on the Genesys Cloud integration id to which the phone number belongs to (optional)
   * @param supportedContentId Filter based on the supported content ID (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return SmsPhoneNumberEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumberEntityListing> getRoutingSmsPhonenumbersWithHttpInfo(String phoneNumber, List<String> phoneNumberType, List<String> phoneNumberStatus, List<String> countryCode, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String language, String integrationId, String supportedContentId, List<String> expand) throws IOException {
    return getRoutingSmsPhonenumbers(createGetRoutingSmsPhonenumbersRequest(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language, integrationId, supportedContentId, expand).withHttpInfo());
  }

  private GetRoutingSmsPhonenumbersRequest createGetRoutingSmsPhonenumbersRequest(String phoneNumber, List<String> phoneNumberType, List<String> phoneNumberStatus, List<String> countryCode, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String language, String integrationId, String supportedContentId, List<String> expand) {
    return GetRoutingSmsPhonenumbersRequest.builder()
            .withPhoneNumber(phoneNumber)

            .withPhoneNumberType(phoneNumberType)

            .withPhoneNumberStatus(phoneNumberStatus)

            .withCountryCode(countryCode)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withLanguage(language)

            .withIntegrationId(integrationId)

            .withSupportedContentId(supportedContentId)

            .withExpand(expand)

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
   * Get the user's Direct Routing Backup settings.
   * 
   * @param userId User ID (required)
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings getRoutingUserDirectroutingbackupSettings(String userId) throws IOException, ApiException {
    return  getRoutingUserDirectroutingbackupSettings(createGetRoutingUserDirectroutingbackupSettingsRequest(userId));
  }

  /**
   * Get the user's Direct Routing Backup settings.
   * 
   * @param userId User ID (required)
   * @return AgentDirectRoutingBackupSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> getRoutingUserDirectroutingbackupSettingsWithHttpInfo(String userId) throws IOException {
    return getRoutingUserDirectroutingbackupSettings(createGetRoutingUserDirectroutingbackupSettingsRequest(userId).withHttpInfo());
  }

  private GetRoutingUserDirectroutingbackupSettingsRequest createGetRoutingUserDirectroutingbackupSettingsRequest(String userId) {
    return GetRoutingUserDirectroutingbackupSettingsRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings getRoutingUserDirectroutingbackupSettings(GetRoutingUserDirectroutingbackupSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentDirectRoutingBackupSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentDirectRoutingBackupSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> getRoutingUserDirectroutingbackupSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentDirectRoutingBackupSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the user's max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param userId User ID (required)
   * @return AgentMaxUtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilizationResponse getRoutingUserUtilization(String userId) throws IOException, ApiException {
    return  getRoutingUserUtilization(createGetRoutingUserUtilizationRequest(userId));
  }

  /**
   * Get the user's max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param userId User ID (required)
   * @return AgentMaxUtilizationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilizationResponse> getRoutingUserUtilizationWithHttpInfo(String userId) throws IOException {
    return getRoutingUserUtilization(createGetRoutingUserUtilizationRequest(userId).withHttpInfo());
  }

  private GetRoutingUserUtilizationRequest createGetRoutingUserUtilizationRequest(String userId) {
    return GetRoutingUserUtilizationRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get the user's max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param request The request object
   * @return AgentMaxUtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilizationResponse getRoutingUserUtilization(GetRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentMaxUtilizationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentMaxUtilizationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the user's max utilization settings.  If not configured, the organization-wide default is returned.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilizationResponse> getRoutingUserUtilization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentMaxUtilizationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentMaxUtilizationResponse> response = (ApiResponse<AgentMaxUtilizationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentMaxUtilizationResponse> response = (ApiResponse<AgentMaxUtilizationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the organization-wide max utilization settings.
   * 
   * @return UtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationResponse getRoutingUtilization() throws IOException, ApiException {
    return  getRoutingUtilization(createGetRoutingUtilizationRequest());
  }

  /**
   * Get the organization-wide max utilization settings.
   * 
   * @return UtilizationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationResponse> getRoutingUtilizationWithHttpInfo() throws IOException {
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
   * @return UtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationResponse getRoutingUtilization(GetRoutingUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationResponse>() {});
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
  public ApiResponse<UtilizationResponse> getRoutingUtilization(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationResponse> response = (ApiResponse<UtilizationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationResponse> response = (ApiResponse<UtilizationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get details about this utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @return UtilizationLabel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabel getRoutingUtilizationLabel(String labelId) throws IOException, ApiException {
    return  getRoutingUtilizationLabel(createGetRoutingUtilizationLabelRequest(labelId));
  }

  /**
   * Get details about this utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @return UtilizationLabel
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabel> getRoutingUtilizationLabelWithHttpInfo(String labelId) throws IOException {
    return getRoutingUtilizationLabel(createGetRoutingUtilizationLabelRequest(labelId).withHttpInfo());
  }

  private GetRoutingUtilizationLabelRequest createGetRoutingUtilizationLabelRequest(String labelId) {
    return GetRoutingUtilizationLabelRequest.builder()
            .withLabelId(labelId)

            .build();
  }

  /**
   * Get details about this utilization label
   * 
   * @param request The request object
   * @return UtilizationLabel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabel getRoutingUtilizationLabel(GetRoutingUtilizationLabelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationLabel> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationLabel>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details about this utilization label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabel> getRoutingUtilizationLabel(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationLabel>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationLabel> response = (ApiResponse<UtilizationLabel>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationLabel> response = (ApiResponse<UtilizationLabel>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of agent ids associated with a utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @return List<Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Object> getRoutingUtilizationLabelAgents(String labelId) throws IOException, ApiException {
    return  getRoutingUtilizationLabelAgents(createGetRoutingUtilizationLabelAgentsRequest(labelId));
  }

  /**
   * Get list of agent ids associated with a utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @return List<Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Object>> getRoutingUtilizationLabelAgentsWithHttpInfo(String labelId) throws IOException {
    return getRoutingUtilizationLabelAgents(createGetRoutingUtilizationLabelAgentsRequest(labelId).withHttpInfo());
  }

  private GetRoutingUtilizationLabelAgentsRequest createGetRoutingUtilizationLabelAgentsRequest(String labelId) {
    return GetRoutingUtilizationLabelAgentsRequest.builder()
            .withLabelId(labelId)

            .build();
  }

  /**
   * Get list of agent ids associated with a utilization label
   * 
   * @param request The request object
   * @return List<Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Object> getRoutingUtilizationLabelAgents(GetRoutingUtilizationLabelAgentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of agent ids associated with a utilization label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Object>> getRoutingUtilizationLabelAgents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Object>> response = (ApiResponse<List<Object>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<Object>> response = (ApiResponse<List<Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of utilization labels
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order by name (optional, default to ascending)
   * @param name Utilization label's name (Wildcard is supported, e.g., 'label1*', '*label*' (optional)
   * @return UtilizationLabelEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabelEntityListing getRoutingUtilizationLabels(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException, ApiException {
    return  getRoutingUtilizationLabels(createGetRoutingUtilizationLabelsRequest(pageSize, pageNumber, sortOrder, name));
  }

  /**
   * Get list of utilization labels
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order by name (optional, default to ascending)
   * @param name Utilization label's name (Wildcard is supported, e.g., 'label1*', '*label*' (optional)
   * @return UtilizationLabelEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabelEntityListing> getRoutingUtilizationLabelsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException {
    return getRoutingUtilizationLabels(createGetRoutingUtilizationLabelsRequest(pageSize, pageNumber, sortOrder, name).withHttpInfo());
  }

  private GetRoutingUtilizationLabelsRequest createGetRoutingUtilizationLabelsRequest(Integer pageSize, Integer pageNumber, String sortOrder, String name) {
    return GetRoutingUtilizationLabelsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)

            .withName(name)

            .build();
  }

  /**
   * Get list of utilization labels
   * 
   * @param request The request object
   * @return UtilizationLabelEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabelEntityListing getRoutingUtilizationLabels(GetRoutingUtilizationLabelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationLabelEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationLabelEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of utilization labels
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabelEntityListing> getRoutingUtilizationLabels(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationLabelEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationLabelEntityListing> response = (ApiResponse<UtilizationLabelEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationLabelEntityListing> response = (ApiResponse<UtilizationLabelEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get details about this utilization tag
   * 
   * getRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tagId Utilization Tag ID (required)
   * @return UtilizationTag
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationTag getRoutingUtilizationTag(String tagId) throws IOException, ApiException {
    return  getRoutingUtilizationTag(createGetRoutingUtilizationTagRequest(tagId));
  }

  /**
   * Get details about this utilization tag
   * 
   * getRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tagId Utilization Tag ID (required)
   * @return UtilizationTag
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationTag> getRoutingUtilizationTagWithHttpInfo(String tagId) throws IOException {
    return getRoutingUtilizationTag(createGetRoutingUtilizationTagRequest(tagId).withHttpInfo());
  }

  private GetRoutingUtilizationTagRequest createGetRoutingUtilizationTagRequest(String tagId) {
    return GetRoutingUtilizationTagRequest.builder()
            .withTagId(tagId)

            .build();
  }

  /**
   * Get details about this utilization tag
   * 
   * getRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UtilizationTag
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationTag getRoutingUtilizationTag(GetRoutingUtilizationTagRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationTag> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationTag>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get details about this utilization tag
   * 
   * getRoutingUtilizationTag is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationTag> getRoutingUtilizationTag(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationTag>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationTag> response = (ApiResponse<UtilizationTag>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationTag> response = (ApiResponse<UtilizationTag>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of agent ids associated with a utilization tag
   * 
   * getRoutingUtilizationTagAgents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tagId Utilization Tag ID (required)
   * @return List<Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Object> getRoutingUtilizationTagAgents(String tagId) throws IOException, ApiException {
    return  getRoutingUtilizationTagAgents(createGetRoutingUtilizationTagAgentsRequest(tagId));
  }

  /**
   * Get list of agent ids associated with a utilization tag
   * 
   * getRoutingUtilizationTagAgents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param tagId Utilization Tag ID (required)
   * @return List<Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Object>> getRoutingUtilizationTagAgentsWithHttpInfo(String tagId) throws IOException {
    return getRoutingUtilizationTagAgents(createGetRoutingUtilizationTagAgentsRequest(tagId).withHttpInfo());
  }

  private GetRoutingUtilizationTagAgentsRequest createGetRoutingUtilizationTagAgentsRequest(String tagId) {
    return GetRoutingUtilizationTagAgentsRequest.builder()
            .withTagId(tagId)

            .build();
  }

  /**
   * Get list of agent ids associated with a utilization tag
   * 
   * getRoutingUtilizationTagAgents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return List<Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<Object> getRoutingUtilizationTagAgents(GetRoutingUtilizationTagAgentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of agent ids associated with a utilization tag
   * 
   * getRoutingUtilizationTagAgents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<Object>> getRoutingUtilizationTagAgents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<Object>> response = (ApiResponse<List<Object>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<Object>> response = (ApiResponse<List<Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of utilization tags
   * 
   * getRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order by name (optional, default to ascending)
   * @param name Utilization tag's name (Wildcard is supported, e.g., 'tag1*') (optional)
   * @return UtilizationTagEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationTagEntityListing getRoutingUtilizationTags(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException, ApiException {
    return  getRoutingUtilizationTags(createGetRoutingUtilizationTagsRequest(pageSize, pageNumber, sortOrder, name));
  }

  /**
   * Get list of utilization tags
   * 
   * getRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Sort order by name (optional, default to ascending)
   * @param name Utilization tag's name (Wildcard is supported, e.g., 'tag1*') (optional)
   * @return UtilizationTagEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationTagEntityListing> getRoutingUtilizationTagsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException {
    return getRoutingUtilizationTags(createGetRoutingUtilizationTagsRequest(pageSize, pageNumber, sortOrder, name).withHttpInfo());
  }

  private GetRoutingUtilizationTagsRequest createGetRoutingUtilizationTagsRequest(Integer pageSize, Integer pageNumber, String sortOrder, String name) {
    return GetRoutingUtilizationTagsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)

            .withName(name)

            .build();
  }

  /**
   * Get list of utilization tags
   * 
   * getRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UtilizationTagEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationTagEntityListing getRoutingUtilizationTags(GetRoutingUtilizationTagsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationTagEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationTagEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of utilization tags
   * 
   * getRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationTagEntityListing> getRoutingUtilizationTags(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationTagEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationTagEntityListing> response = (ApiResponse<UtilizationTagEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationTagEntityListing> response = (ApiResponse<UtilizationTagEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param name Wrapup code's name ('Sort by' param is ignored unless this field is provided) (optional)
   * @param id Filter by wrapup code ID(s) (optional)
   * @param divisionId Filter by division ID(s) (optional)
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingWrapupcodes(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id, List<String> divisionId) throws IOException, ApiException {
    return  getRoutingWrapupcodes(createGetRoutingWrapupcodesRequest(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId));
  }

  /**
   * Get list of wrapup codes.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param name Wrapup code's name ('Sort by' param is ignored unless this field is provided) (optional)
   * @param id Filter by wrapup code ID(s) (optional)
   * @param divisionId Filter by division ID(s) (optional)
   * @return WrapupCodeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingWrapupcodesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id, List<String> divisionId) throws IOException {
    return getRoutingWrapupcodes(createGetRoutingWrapupcodesRequest(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId).withHttpInfo());
  }

  private GetRoutingWrapupcodesRequest createGetRoutingWrapupcodesRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id, List<String> divisionId) {
    return GetRoutingWrapupcodesRequest.builder()
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
   * Get a simplified wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode getRoutingWrapupcodesDivisionview(String codeId) throws IOException, ApiException {
    return  getRoutingWrapupcodesDivisionview(createGetRoutingWrapupcodesDivisionviewRequest(codeId));
  }

  /**
   * Get a simplified wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return WrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> getRoutingWrapupcodesDivisionviewWithHttpInfo(String codeId) throws IOException {
    return getRoutingWrapupcodesDivisionview(createGetRoutingWrapupcodesDivisionviewRequest(codeId).withHttpInfo());
  }

  private GetRoutingWrapupcodesDivisionviewRequest createGetRoutingWrapupcodesDivisionviewRequest(String codeId) {
    return GetRoutingWrapupcodesDivisionviewRequest.builder()
            .withCodeId(codeId)

            .build();
  }

  /**
   * Get a simplified wrap-up code.
   * 
   * @param request The request object
   * @return WrapupCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCode getRoutingWrapupcodesDivisionview(GetRoutingWrapupcodesDivisionviewRequest request) throws IOException, ApiException {
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
   * Get a simplified wrap-up code.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> getRoutingWrapupcodesDivisionview(ApiRequest<Void> request) throws IOException {
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
   * Get a paged listing of simplified wrapup code objects, filterable by name, wrapup code ID(s), or division ID(s).
   * Specifying both name and ID parameters is not supported.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (trailing asterisks allowed) (optional)
   * @param id Wrapup code ID(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @param includeState Wrapup code state(s) to include (optional)
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingWrapupcodesDivisionviews(Integer pageSize, Integer pageNumber, String name, List<String> id, List<String> divisionId, String includeState) throws IOException, ApiException {
    return  getRoutingWrapupcodesDivisionviews(createGetRoutingWrapupcodesDivisionviewsRequest(pageSize, pageNumber, name, id, divisionId, includeState));
  }

  /**
   * Get a paged listing of simplified wrapup code objects, filterable by name, wrapup code ID(s), or division ID(s).
   * Specifying both name and ID parameters is not supported.
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (trailing asterisks allowed) (optional)
   * @param id Wrapup code ID(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @param includeState Wrapup code state(s) to include (optional)
   * @return WrapupCodeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingWrapupcodesDivisionviewsWithHttpInfo(Integer pageSize, Integer pageNumber, String name, List<String> id, List<String> divisionId, String includeState) throws IOException {
    return getRoutingWrapupcodesDivisionviews(createGetRoutingWrapupcodesDivisionviewsRequest(pageSize, pageNumber, name, id, divisionId, includeState).withHttpInfo());
  }

  private GetRoutingWrapupcodesDivisionviewsRequest createGetRoutingWrapupcodesDivisionviewsRequest(Integer pageSize, Integer pageNumber, String name, List<String> id, List<String> divisionId, String includeState) {
    return GetRoutingWrapupcodesDivisionviewsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)

            .withId(id)

            .withDivisionId(divisionId)

            .withIncludeState(includeState)

            .build();
  }

  /**
   * Get a paged listing of simplified wrapup code objects, filterable by name, wrapup code ID(s), or division ID(s).
   * Specifying both name and ID parameters is not supported.
   * @param request The request object
   * @return WrapupCodeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapupCodeEntityListing getRoutingWrapupcodesDivisionviews(GetRoutingWrapupcodesDivisionviewsRequest request) throws IOException, ApiException {
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
   * Get a paged listing of simplified wrapup code objects, filterable by name, wrapup code ID(s), or division ID(s).
   * Specifying both name and ID parameters is not supported.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingWrapupcodesDivisionviews(ApiRequest<Void> request) throws IOException {
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
   * List routing languages assigned to a user
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
   * List routing languages assigned to a user
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
   * List routing languages assigned to a user
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
   * List routing languages assigned to a user
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
   * List routing skills assigned to a user
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
   * List routing skills assigned to a user
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
   * List routing skills assigned to a user
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
   * List routing skills assigned to a user
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
   * Get skill groups for a user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param after The cursor that points to the next page (optional)
   * @param before The cursor that points to the previous page (optional)
   * @return UserSkillGroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillGroupEntityListing getUserSkillgroups(String userId, Integer pageSize, String after, String before) throws IOException, ApiException {
    return  getUserSkillgroups(createGetUserSkillgroupsRequest(userId, pageSize, after, before));
  }

  /**
   * Get skill groups for a user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param after The cursor that points to the next page (optional)
   * @param before The cursor that points to the previous page (optional)
   * @return UserSkillGroupEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillGroupEntityListing> getUserSkillgroupsWithHttpInfo(String userId, Integer pageSize, String after, String before) throws IOException {
    return getUserSkillgroups(createGetUserSkillgroupsRequest(userId, pageSize, after, before).withHttpInfo());
  }

  private GetUserSkillgroupsRequest createGetUserSkillgroupsRequest(String userId, Integer pageSize, String after, String before) {
    return GetUserSkillgroupsRequest.builder()
            .withUserId(userId)

            .withPageSize(pageSize)

            .withAfter(after)

            .withBefore(before)

            .build();
  }

  /**
   * Get skill groups for a user
   * 
   * @param request The request object
   * @return UserSkillGroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserSkillGroupEntityListing getUserSkillgroups(GetUserSkillgroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserSkillGroupEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserSkillGroupEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get skill groups for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserSkillGroupEntityListing> getUserSkillgroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserSkillGroupEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserSkillGroupEntityListing> response = (ApiResponse<UserSkillGroupEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserSkillGroupEntityListing> response = (ApiResponse<UserSkillGroupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Join or unjoin a set of up to 100 users for a queue
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
   * Join or unjoin a set of up to 100 users for a queue
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
   * Join or unjoin a set of up to 100 users for a queue
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
   * Join or unjoin a set of up to 100 users for a queue
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @return QueueMemberEntityListingV1
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public QueueMemberEntityListingV1 patchRoutingQueueUsers(String queueId, List<QueueMember> body) throws IOException, ApiException {
    return  patchRoutingQueueUsers(createPatchRoutingQueueUsersRequest(queueId, body));
  }

  /**
   * DEPRECATED: use PATCH /routing/queues/{queueId}/members.  Join or unjoin a set of users for a queue.
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return QueueMemberEntityListingV1
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<QueueMemberEntityListingV1> patchRoutingQueueUsersWithHttpInfo(String queueId, List<QueueMember> body) throws IOException {
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
   * @return QueueMemberEntityListingV1
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public QueueMemberEntityListingV1 patchRoutingQueueUsers(PatchRoutingQueueUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueMemberEntityListingV1> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueMemberEntityListingV1>() {});
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
   * @deprecated
   */
  public ApiResponse<QueueMemberEntityListingV1> patchRoutingQueueUsers(ApiRequest<List<QueueMember>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueMemberEntityListingV1>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueMemberEntityListingV1> response = (ApiResponse<QueueMemberEntityListingV1>)(ApiResponse<?>)exception;
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
      ApiResponse<QueueMemberEntityListingV1> response = (ApiResponse<QueueMemberEntityListingV1>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch Transcription Settings
   * 
   * @param body Organization Settings (required)
   * @return TranscriptionSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptionSettings patchRoutingSettingsTranscription(TranscriptionSettings body) throws IOException, ApiException {
    return  patchRoutingSettingsTranscription(createPatchRoutingSettingsTranscriptionRequest(body));
  }

  /**
   * Patch Transcription Settings
   * 
   * @param body Organization Settings (required)
   * @return TranscriptionSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptionSettings> patchRoutingSettingsTranscriptionWithHttpInfo(TranscriptionSettings body) throws IOException {
    return patchRoutingSettingsTranscription(createPatchRoutingSettingsTranscriptionRequest(body).withHttpInfo());
  }

  private PatchRoutingSettingsTranscriptionRequest createPatchRoutingSettingsTranscriptionRequest(TranscriptionSettings body) {
    return PatchRoutingSettingsTranscriptionRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Patch Transcription Settings
   * 
   * @param request The request object
   * @return TranscriptionSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptionSettings patchRoutingSettingsTranscription(PatchRoutingSettingsTranscriptionRequest request) throws IOException, ApiException {
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
   * Patch Transcription Settings
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptionSettings> patchRoutingSettingsTranscription(ApiRequest<TranscriptionSettings> request) throws IOException {
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
   * Update skill group definition
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param body Update skill groups (required)
   * @return SkillGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroup patchRoutingSkillgroup(String skillGroupId, SkillGroup body) throws IOException, ApiException {
    return  patchRoutingSkillgroup(createPatchRoutingSkillgroupRequest(skillGroupId, body));
  }

  /**
   * Update skill group definition
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param body Update skill groups (required)
   * @return SkillGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroup> patchRoutingSkillgroupWithHttpInfo(String skillGroupId, SkillGroup body) throws IOException {
    return patchRoutingSkillgroup(createPatchRoutingSkillgroupRequest(skillGroupId, body).withHttpInfo());
  }

  private PatchRoutingSkillgroupRequest createPatchRoutingSkillgroupRequest(String skillGroupId, SkillGroup body) {
    return PatchRoutingSkillgroupRequest.builder()
            .withSkillGroupId(skillGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Update skill group definition
   * 
   * @param request The request object
   * @return SkillGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroup patchRoutingSkillgroup(PatchRoutingSkillgroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SkillGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SkillGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update skill group definition
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroup> patchRoutingSkillgroup(ApiRequest<SkillGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SkillGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SkillGroup> response = (ApiResponse<SkillGroup>)(ApiResponse<?>)exception;
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
      ApiResponse<SkillGroup> response = (ApiResponse<SkillGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a phone number provisioned for SMS.
   * 
   * @param phoneNumberId phone number (required)
   * @param body SmsPhoneNumberPatchRequest (required)
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber patchRoutingSmsPhonenumber(String phoneNumberId, SmsPhoneNumberPatchRequest body) throws IOException, ApiException {
    return  patchRoutingSmsPhonenumber(createPatchRoutingSmsPhonenumberRequest(phoneNumberId, body));
  }

  /**
   * Update a phone number provisioned for SMS.
   * 
   * @param phoneNumberId phone number (required)
   * @param body SmsPhoneNumberPatchRequest (required)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> patchRoutingSmsPhonenumberWithHttpInfo(String phoneNumberId, SmsPhoneNumberPatchRequest body) throws IOException {
    return patchRoutingSmsPhonenumber(createPatchRoutingSmsPhonenumberRequest(phoneNumberId, body).withHttpInfo());
  }

  private PatchRoutingSmsPhonenumberRequest createPatchRoutingSmsPhonenumberRequest(String phoneNumberId, SmsPhoneNumberPatchRequest body) {
    return PatchRoutingSmsPhonenumberRequest.builder()
            .withPhoneNumberId(phoneNumberId)

            .withBody(body)

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
  public SmsPhoneNumber patchRoutingSmsPhonenumber(PatchRoutingSmsPhonenumberRequest request) throws IOException, ApiException {
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
  public ApiResponse<SmsPhoneNumber> patchRoutingSmsPhonenumber(ApiRequest<SmsPhoneNumberPatchRequest> request) throws IOException {
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
   * Update an assigned routing language's proficiency
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
   * Update an assigned routing language's proficiency
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
   * Update an assigned routing language's proficiency
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
   * Update an assigned routing language's proficiency
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
   * Assign multiple routing languages to a user. Max 50 routing languages in request body
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
   * Assign multiple routing languages to a user. Max 50 routing languages in request body
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
   * Assign multiple routing languages to a user. Max 50 routing languages in request body
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
   * Assign multiple routing languages to a user. Max 50 routing languages in request body
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
   * Assign multiple routing skills to a user
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
   * Assign multiple routing skills to a user
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
   * Assign multiple routing skills to a user
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
   * Assign multiple routing skills to a user
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
   * Query for user activity observations
   * 
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return RoutingActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingActivityResponse postAnalyticsRoutingActivityQuery(RoutingActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  postAnalyticsRoutingActivityQuery(createPostAnalyticsRoutingActivityQueryRequest(body, pageSize, pageNumber));
  }

  /**
   * Query for user activity observations
   * 
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return RoutingActivityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingActivityResponse> postAnalyticsRoutingActivityQueryWithHttpInfo(RoutingActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException {
    return postAnalyticsRoutingActivityQuery(createPostAnalyticsRoutingActivityQueryRequest(body, pageSize, pageNumber).withHttpInfo());
  }

  private PostAnalyticsRoutingActivityQueryRequest createPostAnalyticsRoutingActivityQueryRequest(RoutingActivityQuery body, Integer pageSize, Integer pageNumber) {
    return PostAnalyticsRoutingActivityQueryRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Query for user activity observations
   * 
   * @param request The request object
   * @return RoutingActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingActivityResponse postAnalyticsRoutingActivityQuery(PostAnalyticsRoutingActivityQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingActivityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingActivityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user activity observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingActivityResponse> postAnalyticsRoutingActivityQuery(ApiRequest<RoutingActivityQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingActivityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingActivityResponse> response = (ApiResponse<RoutingActivityResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<RoutingActivityResponse> response = (ApiResponse<RoutingActivityResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a domain
   * 
   * @param body Domain (required)
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult postRoutingEmailOutboundDomains(OutboundDomain body) throws IOException, ApiException {
    return  postRoutingEmailOutboundDomains(createPostRoutingEmailOutboundDomainsRequest(body));
  }

  /**
   * Create a domain
   * 
   * @param body Domain (required)
   * @return EmailOutboundDomainResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailOutboundDomainResult> postRoutingEmailOutboundDomainsWithHttpInfo(OutboundDomain body) throws IOException {
    return postRoutingEmailOutboundDomains(createPostRoutingEmailOutboundDomainsRequest(body).withHttpInfo());
  }

  private PostRoutingEmailOutboundDomainsRequest createPostRoutingEmailOutboundDomainsRequest(OutboundDomain body) {
    return PostRoutingEmailOutboundDomainsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a domain
   * 
   * @param request The request object
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult postRoutingEmailOutboundDomains(PostRoutingEmailOutboundDomainsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailOutboundDomainResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailOutboundDomainResult>() {});
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
  public ApiResponse<EmailOutboundDomainResult> postRoutingEmailOutboundDomains(ApiRequest<OutboundDomain> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailOutboundDomainResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a simulated domain
   * 
   * @param body Domain (required)
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult postRoutingEmailOutboundDomainsSimulated(OutboundDomain body) throws IOException, ApiException {
    return  postRoutingEmailOutboundDomainsSimulated(createPostRoutingEmailOutboundDomainsSimulatedRequest(body));
  }

  /**
   * Create a simulated domain
   * 
   * @param body Domain (required)
   * @return EmailOutboundDomainResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailOutboundDomainResult> postRoutingEmailOutboundDomainsSimulatedWithHttpInfo(OutboundDomain body) throws IOException {
    return postRoutingEmailOutboundDomainsSimulated(createPostRoutingEmailOutboundDomainsSimulatedRequest(body).withHttpInfo());
  }

  private PostRoutingEmailOutboundDomainsSimulatedRequest createPostRoutingEmailOutboundDomainsSimulatedRequest(OutboundDomain body) {
    return PostRoutingEmailOutboundDomainsSimulatedRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a simulated domain
   * 
   * @param request The request object
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult postRoutingEmailOutboundDomainsSimulated(PostRoutingEmailOutboundDomainsSimulatedRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailOutboundDomainResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailOutboundDomainResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a simulated domain
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailOutboundDomainResult> postRoutingEmailOutboundDomainsSimulated(ApiRequest<OutboundDomain> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailOutboundDomainResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * Add or remove member divisions for this skill group.
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRoutingSkillgroupMembersDivisions(String skillGroupId, SkillGroupMemberDivisions body) throws IOException, ApiException {
     postRoutingSkillgroupMembersDivisions(createPostRoutingSkillgroupMembersDivisionsRequest(skillGroupId, body));
  }

  /**
   * Add or remove member divisions for this skill group.
   * 
   * @param skillGroupId Skill Group ID (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRoutingSkillgroupMembersDivisionsWithHttpInfo(String skillGroupId, SkillGroupMemberDivisions body) throws IOException {
    return postRoutingSkillgroupMembersDivisions(createPostRoutingSkillgroupMembersDivisionsRequest(skillGroupId, body).withHttpInfo());
  }

  private PostRoutingSkillgroupMembersDivisionsRequest createPostRoutingSkillgroupMembersDivisionsRequest(String skillGroupId, SkillGroupMemberDivisions body) {
    return PostRoutingSkillgroupMembersDivisionsRequest.builder()
            .withSkillGroupId(skillGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Add or remove member divisions for this skill group.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postRoutingSkillgroupMembersDivisions(PostRoutingSkillgroupMembersDivisionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add or remove member divisions for this skill group.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postRoutingSkillgroupMembersDivisions(ApiRequest<SkillGroupMemberDivisions> request) throws IOException {
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
   * Create a skill group
   * 
   * @param body Create skill group (required)
   * @return SkillGroupWithMemberDivisions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupWithMemberDivisions postRoutingSkillgroups(SkillGroupWithMemberDivisions body) throws IOException, ApiException {
    return  postRoutingSkillgroups(createPostRoutingSkillgroupsRequest(body));
  }

  /**
   * Create a skill group
   * 
   * @param body Create skill group (required)
   * @return SkillGroupWithMemberDivisions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupWithMemberDivisions> postRoutingSkillgroupsWithHttpInfo(SkillGroupWithMemberDivisions body) throws IOException {
    return postRoutingSkillgroups(createPostRoutingSkillgroupsRequest(body).withHttpInfo());
  }

  private PostRoutingSkillgroupsRequest createPostRoutingSkillgroupsRequest(SkillGroupWithMemberDivisions body) {
    return PostRoutingSkillgroupsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a skill group
   * 
   * @param request The request object
   * @return SkillGroupWithMemberDivisions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SkillGroupWithMemberDivisions postRoutingSkillgroups(PostRoutingSkillgroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SkillGroupWithMemberDivisions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SkillGroupWithMemberDivisions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a skill group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SkillGroupWithMemberDivisions> postRoutingSkillgroups(ApiRequest<SkillGroupWithMemberDivisions> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SkillGroupWithMemberDivisions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SkillGroupWithMemberDivisions> response = (ApiResponse<SkillGroupWithMemberDivisions>)(ApiResponse<?>)exception;
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
      ApiResponse<SkillGroupWithMemberDivisions> response = (ApiResponse<SkillGroupWithMemberDivisions>)(ApiResponse<?>)(new ApiException(exception));
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
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber postRoutingSmsPhonenumbers(SmsPhoneNumberProvision body) throws IOException, ApiException {
    return  postRoutingSmsPhonenumbers(createPostRoutingSmsPhonenumbersRequest(body));
  }

  /**
   * Provision a phone number for SMS
   * 
   * @param body SmsPhoneNumber (required)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> postRoutingSmsPhonenumbersWithHttpInfo(SmsPhoneNumberProvision body) throws IOException {
    return postRoutingSmsPhonenumbers(createPostRoutingSmsPhonenumbersRequest(body).withHttpInfo());
  }

  private PostRoutingSmsPhonenumbersRequest createPostRoutingSmsPhonenumbersRequest(SmsPhoneNumberProvision body) {
    return PostRoutingSmsPhonenumbersRequest.builder()
            .withBody(body)

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
   * Provision an alphanumeric number for SMS
   * 
   * postRoutingSmsPhonenumbersAlphanumeric is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body SmsPhoneNumber (required)
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber postRoutingSmsPhonenumbersAlphanumeric(SmsAlphanumericProvision body) throws IOException, ApiException {
    return  postRoutingSmsPhonenumbersAlphanumeric(createPostRoutingSmsPhonenumbersAlphanumericRequest(body));
  }

  /**
   * Provision an alphanumeric number for SMS
   * 
   * postRoutingSmsPhonenumbersAlphanumeric is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body SmsPhoneNumber (required)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> postRoutingSmsPhonenumbersAlphanumericWithHttpInfo(SmsAlphanumericProvision body) throws IOException {
    return postRoutingSmsPhonenumbersAlphanumeric(createPostRoutingSmsPhonenumbersAlphanumericRequest(body).withHttpInfo());
  }

  private PostRoutingSmsPhonenumbersAlphanumericRequest createPostRoutingSmsPhonenumbersAlphanumericRequest(SmsAlphanumericProvision body) {
    return PostRoutingSmsPhonenumbersAlphanumericRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Provision an alphanumeric number for SMS
   * 
   * postRoutingSmsPhonenumbersAlphanumeric is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber postRoutingSmsPhonenumbersAlphanumeric(PostRoutingSmsPhonenumbersAlphanumericRequest request) throws IOException, ApiException {
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
   * Provision an alphanumeric number for SMS
   * 
   * postRoutingSmsPhonenumbersAlphanumeric is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> postRoutingSmsPhonenumbersAlphanumeric(ApiRequest<SmsAlphanumericProvision> request) throws IOException {
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
   * Imports a phone number for SMS
   * 
   * @param body SmsPhoneNumber (required)
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber postRoutingSmsPhonenumbersImport(SmsPhoneNumberImport body) throws IOException, ApiException {
    return  postRoutingSmsPhonenumbersImport(createPostRoutingSmsPhonenumbersImportRequest(body));
  }

  /**
   * Imports a phone number for SMS
   * 
   * @param body SmsPhoneNumber (required)
   * @return SmsPhoneNumber
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> postRoutingSmsPhonenumbersImportWithHttpInfo(SmsPhoneNumberImport body) throws IOException {
    return postRoutingSmsPhonenumbersImport(createPostRoutingSmsPhonenumbersImportRequest(body).withHttpInfo());
  }

  private PostRoutingSmsPhonenumbersImportRequest createPostRoutingSmsPhonenumbersImportRequest(SmsPhoneNumberImport body) {
    return PostRoutingSmsPhonenumbersImportRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Imports a phone number for SMS
   * 
   * @param request The request object
   * @return SmsPhoneNumber
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SmsPhoneNumber postRoutingSmsPhonenumbersImport(PostRoutingSmsPhonenumbersImportRequest request) throws IOException, ApiException {
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
   * Imports a phone number for SMS
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SmsPhoneNumber> postRoutingSmsPhonenumbersImport(ApiRequest<SmsPhoneNumberImport> request) throws IOException {
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
   * Create a utilization label
   * 
   * @param body UtilizationLabel (required)
   * @return UtilizationLabel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabel postRoutingUtilizationLabels(CreateUtilizationLabelRequest body) throws IOException, ApiException {
    return  postRoutingUtilizationLabels(createPostRoutingUtilizationLabelsRequest(body));
  }

  /**
   * Create a utilization label
   * 
   * @param body UtilizationLabel (required)
   * @return UtilizationLabel
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabel> postRoutingUtilizationLabelsWithHttpInfo(CreateUtilizationLabelRequest body) throws IOException {
    return postRoutingUtilizationLabels(createPostRoutingUtilizationLabelsRequest(body).withHttpInfo());
  }

  private PostRoutingUtilizationLabelsRequest createPostRoutingUtilizationLabelsRequest(CreateUtilizationLabelRequest body) {
    return PostRoutingUtilizationLabelsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a utilization label
   * 
   * @param request The request object
   * @return UtilizationLabel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabel postRoutingUtilizationLabels(PostRoutingUtilizationLabelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationLabel> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationLabel>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a utilization label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabel> postRoutingUtilizationLabels(ApiRequest<CreateUtilizationLabelRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationLabel>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationLabel> response = (ApiResponse<UtilizationLabel>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationLabel> response = (ApiResponse<UtilizationLabel>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an utilization tag
   * 
   * postRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body UtilizationTag (required)
   * @return UtilizationTag
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationTag postRoutingUtilizationTags(CreateUtilizationTagRequest body) throws IOException, ApiException {
    return  postRoutingUtilizationTags(createPostRoutingUtilizationTagsRequest(body));
  }

  /**
   * Create an utilization tag
   * 
   * postRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body UtilizationTag (required)
   * @return UtilizationTag
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationTag> postRoutingUtilizationTagsWithHttpInfo(CreateUtilizationTagRequest body) throws IOException {
    return postRoutingUtilizationTags(createPostRoutingUtilizationTagsRequest(body).withHttpInfo());
  }

  private PostRoutingUtilizationTagsRequest createPostRoutingUtilizationTagsRequest(CreateUtilizationTagRequest body) {
    return PostRoutingUtilizationTagsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an utilization tag
   * 
   * postRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UtilizationTag
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationTag postRoutingUtilizationTags(PostRoutingUtilizationTagsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationTag> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationTag>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an utilization tag
   * 
   * postRoutingUtilizationTags is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationTag> postRoutingUtilizationTags(ApiRequest<CreateUtilizationTagRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationTag>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationTag> response = (ApiResponse<UtilizationTag>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationTag> response = (ApiResponse<UtilizationTag>)(ApiResponse<?>)(new ApiException(exception));
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
  public WrapupCode postRoutingWrapupcodes(WrapupCodeRequest body) throws IOException, ApiException {
    return  postRoutingWrapupcodes(createPostRoutingWrapupcodesRequest(body));
  }

  /**
   * Create a wrap-up code
   * 
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapupCode> postRoutingWrapupcodesWithHttpInfo(WrapupCodeRequest body) throws IOException {
    return postRoutingWrapupcodes(createPostRoutingWrapupcodesRequest(body).withHttpInfo());
  }

  private PostRoutingWrapupcodesRequest createPostRoutingWrapupcodesRequest(WrapupCodeRequest body) {
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
  public ApiResponse<WrapupCode> postRoutingWrapupcodes(ApiRequest<WrapupCodeRequest> request) throws IOException {
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
   * Assign a routing language to a user
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
   * Assign a routing language to a user
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
   * Assign a routing language to a user
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
   * Assign a routing language to a user
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
   * Assign a routing skill to a user
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
   * Assign a routing skill to a user
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
   * Assign a routing skill to a user
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
   * Assign a routing skill to a user
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
   * Update the user's Direct Routing Backup settings.
   * 
   * @param body directRoutingBackup (required)
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings putRoutingDirectroutingbackupSettingsMe(AgentDirectRoutingBackupSettings body) throws IOException, ApiException {
    return  putRoutingDirectroutingbackupSettingsMe(createPutRoutingDirectroutingbackupSettingsMeRequest(body));
  }

  /**
   * Update the user's Direct Routing Backup settings.
   * 
   * @param body directRoutingBackup (required)
   * @return AgentDirectRoutingBackupSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> putRoutingDirectroutingbackupSettingsMeWithHttpInfo(AgentDirectRoutingBackupSettings body) throws IOException {
    return putRoutingDirectroutingbackupSettingsMe(createPutRoutingDirectroutingbackupSettingsMeRequest(body).withHttpInfo());
  }

  private PutRoutingDirectroutingbackupSettingsMeRequest createPutRoutingDirectroutingbackupSettingsMeRequest(AgentDirectRoutingBackupSettings body) {
    return PutRoutingDirectroutingbackupSettingsMeRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings putRoutingDirectroutingbackupSettingsMe(PutRoutingDirectroutingbackupSettingsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentDirectRoutingBackupSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentDirectRoutingBackupSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> putRoutingDirectroutingbackupSettingsMe(ApiRequest<AgentDirectRoutingBackupSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentDirectRoutingBackupSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update identity resolution settings for a route.
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putRoutingEmailDomainRouteIdentityresolution(String domainName, String routeId, IdentityResolutionConfig body) throws IOException, ApiException {
    return  putRoutingEmailDomainRouteIdentityresolution(createPutRoutingEmailDomainRouteIdentityresolutionRequest(domainName, routeId, body));
  }

  /**
   * Update identity resolution settings for a route.
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putRoutingEmailDomainRouteIdentityresolutionWithHttpInfo(String domainName, String routeId, IdentityResolutionConfig body) throws IOException {
    return putRoutingEmailDomainRouteIdentityresolution(createPutRoutingEmailDomainRouteIdentityresolutionRequest(domainName, routeId, body).withHttpInfo());
  }

  private PutRoutingEmailDomainRouteIdentityresolutionRequest createPutRoutingEmailDomainRouteIdentityresolutionRequest(String domainName, String routeId, IdentityResolutionConfig body) {
    return PutRoutingEmailDomainRouteIdentityresolutionRequest.builder()
            .withDomainName(domainName)

            .withRouteId(routeId)

            .withBody(body)

            .build();
  }

  /**
   * Update identity resolution settings for a route.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putRoutingEmailDomainRouteIdentityresolution(PutRoutingEmailDomainRouteIdentityresolutionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update identity resolution settings for a route.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putRoutingEmailDomainRouteIdentityresolution(ApiRequest<IdentityResolutionConfig> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Request an activation status (cname + dkim) update of an outbound domain
   * 
   * @param domainId domain ID (required)
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult putRoutingEmailOutboundDomainActivation(String domainId) throws IOException, ApiException {
    return  putRoutingEmailOutboundDomainActivation(createPutRoutingEmailOutboundDomainActivationRequest(domainId));
  }

  /**
   * Request an activation status (cname + dkim) update of an outbound domain
   * 
   * @param domainId domain ID (required)
   * @return EmailOutboundDomainResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailOutboundDomainResult> putRoutingEmailOutboundDomainActivationWithHttpInfo(String domainId) throws IOException {
    return putRoutingEmailOutboundDomainActivation(createPutRoutingEmailOutboundDomainActivationRequest(domainId).withHttpInfo());
  }

  private PutRoutingEmailOutboundDomainActivationRequest createPutRoutingEmailOutboundDomainActivationRequest(String domainId) {
    return PutRoutingEmailOutboundDomainActivationRequest.builder()
            .withDomainId(domainId)

            .build();
  }

  /**
   * Request an activation status (cname + dkim) update of an outbound domain
   * 
   * @param request The request object
   * @return EmailOutboundDomainResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailOutboundDomainResult putRoutingEmailOutboundDomainActivation(PutRoutingEmailOutboundDomainActivationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailOutboundDomainResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailOutboundDomainResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request an activation status (cname + dkim) update of an outbound domain
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailOutboundDomainResult> putRoutingEmailOutboundDomainActivation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailOutboundDomainResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)exception;
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
      ApiResponse<EmailOutboundDomainResult> response = (ApiResponse<EmailOutboundDomainResult>)(ApiResponse<?>)(new ApiException(exception));
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
  public Recipient putRoutingMessageRecipient(String recipientId, RecipientRequest body) throws IOException, ApiException {
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
  public ApiResponse<Recipient> putRoutingMessageRecipientWithHttpInfo(String recipientId, RecipientRequest body) throws IOException {
    return putRoutingMessageRecipient(createPutRoutingMessageRecipientRequest(recipientId, body).withHttpInfo());
  }

  private PutRoutingMessageRecipientRequest createPutRoutingMessageRecipientRequest(String recipientId, RecipientRequest body) {
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
  public ApiResponse<Recipient> putRoutingMessageRecipient(ApiRequest<RecipientRequest> request) throws IOException {
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
   * Update Queue IdentityResolution Settings.
   * 
   * @param queueId Queue ID (required)
   * @param body  (required)
   * @return IdentityResolutionQueueConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionQueueConfig putRoutingQueueIdentityresolution(String queueId, IdentityResolutionQueueConfig body) throws IOException, ApiException {
    return  putRoutingQueueIdentityresolution(createPutRoutingQueueIdentityresolutionRequest(queueId, body));
  }

  /**
   * Update Queue IdentityResolution Settings.
   * 
   * @param queueId Queue ID (required)
   * @param body  (required)
   * @return IdentityResolutionQueueConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionQueueConfig> putRoutingQueueIdentityresolutionWithHttpInfo(String queueId, IdentityResolutionQueueConfig body) throws IOException {
    return putRoutingQueueIdentityresolution(createPutRoutingQueueIdentityresolutionRequest(queueId, body).withHttpInfo());
  }

  private PutRoutingQueueIdentityresolutionRequest createPutRoutingQueueIdentityresolutionRequest(String queueId, IdentityResolutionQueueConfig body) {
    return PutRoutingQueueIdentityresolutionRequest.builder()
            .withQueueId(queueId)

            .withBody(body)

            .build();
  }

  /**
   * Update Queue IdentityResolution Settings.
   * 
   * @param request The request object
   * @return IdentityResolutionQueueConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionQueueConfig putRoutingQueueIdentityresolution(PutRoutingQueueIdentityresolutionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionQueueConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionQueueConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Queue IdentityResolution Settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionQueueConfig> putRoutingQueueIdentityresolution(ApiRequest<IdentityResolutionQueueConfig> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionQueueConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionQueueConfig> response = (ApiResponse<IdentityResolutionQueueConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionQueueConfig> response = (ApiResponse<IdentityResolutionQueueConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an organization's routing settings
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
   * Update an organization's routing settings
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
   * Update an organization's routing settings
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
   * Update an organization's routing settings
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
   * Update an SMS identity resolution settings.
   * 
   * @param addressId Address ID (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putRoutingSmsIdentityresolutionPhonenumber(String addressId, IdentityResolutionConfig body) throws IOException, ApiException {
    return  putRoutingSmsIdentityresolutionPhonenumber(createPutRoutingSmsIdentityresolutionPhonenumberRequest(addressId, body));
  }

  /**
   * Update an SMS identity resolution settings.
   * 
   * @param addressId Address ID (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putRoutingSmsIdentityresolutionPhonenumberWithHttpInfo(String addressId, IdentityResolutionConfig body) throws IOException {
    return putRoutingSmsIdentityresolutionPhonenumber(createPutRoutingSmsIdentityresolutionPhonenumberRequest(addressId, body).withHttpInfo());
  }

  private PutRoutingSmsIdentityresolutionPhonenumberRequest createPutRoutingSmsIdentityresolutionPhonenumberRequest(String addressId, IdentityResolutionConfig body) {
    return PutRoutingSmsIdentityresolutionPhonenumberRequest.builder()
            .withAddressId(addressId)

            .withBody(body)

            .build();
  }

  /**
   * Update an SMS identity resolution settings.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putRoutingSmsIdentityresolutionPhonenumber(PutRoutingSmsIdentityresolutionPhonenumberRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IdentityResolutionConfig> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an SMS identity resolution settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putRoutingSmsIdentityresolutionPhonenumber(ApiRequest<IdentityResolutionConfig> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IdentityResolutionConfig>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
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
      ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the user's Direct Routing Backup settings.
   * 
   * @param userId User ID (required)
   * @param body directRoutingBackup (required)
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings putRoutingUserDirectroutingbackupSettings(String userId, AgentDirectRoutingBackupSettings body) throws IOException, ApiException {
    return  putRoutingUserDirectroutingbackupSettings(createPutRoutingUserDirectroutingbackupSettingsRequest(userId, body));
  }

  /**
   * Update the user's Direct Routing Backup settings.
   * 
   * @param userId User ID (required)
   * @param body directRoutingBackup (required)
   * @return AgentDirectRoutingBackupSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> putRoutingUserDirectroutingbackupSettingsWithHttpInfo(String userId, AgentDirectRoutingBackupSettings body) throws IOException {
    return putRoutingUserDirectroutingbackupSettings(createPutRoutingUserDirectroutingbackupSettingsRequest(userId, body).withHttpInfo());
  }

  private PutRoutingUserDirectroutingbackupSettingsRequest createPutRoutingUserDirectroutingbackupSettingsRequest(String userId, AgentDirectRoutingBackupSettings body) {
    return PutRoutingUserDirectroutingbackupSettingsRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Update the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return AgentDirectRoutingBackupSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentDirectRoutingBackupSettings putRoutingUserDirectroutingbackupSettings(PutRoutingUserDirectroutingbackupSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentDirectRoutingBackupSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentDirectRoutingBackupSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the user's Direct Routing Backup settings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentDirectRoutingBackupSettings> putRoutingUserDirectroutingbackupSettings(ApiRequest<AgentDirectRoutingBackupSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentDirectRoutingBackupSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentDirectRoutingBackupSettings> response = (ApiResponse<AgentDirectRoutingBackupSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the user's max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param userId User ID (required)
   * @param body utilization (required)
   * @return AgentMaxUtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilizationResponse putRoutingUserUtilization(String userId, UtilizationRequest body) throws IOException, ApiException {
    return  putRoutingUserUtilization(createPutRoutingUserUtilizationRequest(userId, body));
  }

  /**
   * Update the user's max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param userId User ID (required)
   * @param body utilization (required)
   * @return AgentMaxUtilizationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilizationResponse> putRoutingUserUtilizationWithHttpInfo(String userId, UtilizationRequest body) throws IOException {
    return putRoutingUserUtilization(createPutRoutingUserUtilizationRequest(userId, body).withHttpInfo());
  }

  private PutRoutingUserUtilizationRequest createPutRoutingUserUtilizationRequest(String userId, UtilizationRequest body) {
    return PutRoutingUserUtilizationRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Update the user's max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return AgentMaxUtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentMaxUtilizationResponse putRoutingUserUtilization(PutRoutingUserUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentMaxUtilizationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentMaxUtilizationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the user's max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentMaxUtilizationResponse> putRoutingUserUtilization(ApiRequest<UtilizationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentMaxUtilizationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentMaxUtilizationResponse> response = (ApiResponse<AgentMaxUtilizationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentMaxUtilizationResponse> response = (ApiResponse<AgentMaxUtilizationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param body utilization (required)
   * @return UtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationResponse putRoutingUtilization(UtilizationRequest body) throws IOException, ApiException {
    return  putRoutingUtilization(createPutRoutingUtilizationRequest(body));
  }

  /**
   * Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param body utilization (required)
   * @return UtilizationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationResponse> putRoutingUtilizationWithHttpInfo(UtilizationRequest body) throws IOException {
    return putRoutingUtilization(createPutRoutingUtilizationRequest(body).withHttpInfo());
  }

  private PutRoutingUtilizationRequest createPutRoutingUtilizationRequest(UtilizationRequest body) {
    return PutRoutingUtilizationRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the organization-wide max utilization settings.  Include only those media types requiring custom configuration.
   * 
   * @param request The request object
   * @return UtilizationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationResponse putRoutingUtilization(PutRoutingUtilizationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationResponse>() {});
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
  public ApiResponse<UtilizationResponse> putRoutingUtilization(ApiRequest<UtilizationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationResponse> response = (ApiResponse<UtilizationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationResponse> response = (ApiResponse<UtilizationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @param body UtilizationLabel (required)
   * @return UtilizationLabel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabel putRoutingUtilizationLabel(String labelId, UpdateUtilizationLabelRequest body) throws IOException, ApiException {
    return  putRoutingUtilizationLabel(createPutRoutingUtilizationLabelRequest(labelId, body));
  }

  /**
   * Update a utilization label
   * 
   * @param labelId Utilization Label ID (required)
   * @param body UtilizationLabel (required)
   * @return UtilizationLabel
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabel> putRoutingUtilizationLabelWithHttpInfo(String labelId, UpdateUtilizationLabelRequest body) throws IOException {
    return putRoutingUtilizationLabel(createPutRoutingUtilizationLabelRequest(labelId, body).withHttpInfo());
  }

  private PutRoutingUtilizationLabelRequest createPutRoutingUtilizationLabelRequest(String labelId, UpdateUtilizationLabelRequest body) {
    return PutRoutingUtilizationLabelRequest.builder()
            .withLabelId(labelId)

            .withBody(body)

            .build();
  }

  /**
   * Update a utilization label
   * 
   * @param request The request object
   * @return UtilizationLabel
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UtilizationLabel putRoutingUtilizationLabel(PutRoutingUtilizationLabelRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UtilizationLabel> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UtilizationLabel>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a utilization label
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UtilizationLabel> putRoutingUtilizationLabel(ApiRequest<UpdateUtilizationLabelRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UtilizationLabel>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UtilizationLabel> response = (ApiResponse<UtilizationLabel>)(ApiResponse<?>)exception;
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
      ApiResponse<UtilizationLabel> response = (ApiResponse<UtilizationLabel>)(ApiResponse<?>)(new ApiException(exception));
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
  public WrapupCode putRoutingWrapupcode(String codeId, WrapupCodeRequest body) throws IOException, ApiException {
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
  public ApiResponse<WrapupCode> putRoutingWrapupcodeWithHttpInfo(String codeId, WrapupCodeRequest body) throws IOException {
    return putRoutingWrapupcode(createPutRoutingWrapupcodeRequest(codeId, body).withHttpInfo());
  }

  private PutRoutingWrapupcodeRequest createPutRoutingWrapupcodeRequest(String codeId, WrapupCodeRequest body) {
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
  public ApiResponse<WrapupCode> putRoutingWrapupcode(ApiRequest<WrapupCodeRequest> request) throws IOException {
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
   * Update an assigned routing skill's proficiency
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
   * Update an assigned routing skill's proficiency
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
   * Update an assigned routing skill's proficiency
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
   * Update an assigned routing skill's proficiency
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
   * Assign multiple routing skills to a user, replacing any current assignments
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
   * Assign multiple routing skills to a user, replacing any current assignments
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
   * Assign multiple routing skills to a user, replacing any current assignments
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
   * Assign multiple routing skills to a user, replacing any current assignments
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
