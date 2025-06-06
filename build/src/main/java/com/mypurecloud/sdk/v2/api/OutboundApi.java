package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Agent;
import com.mypurecloud.sdk.v2.model.AgentOwnedMappingPreviewListing;
import com.mypurecloud.sdk.v2.model.AttemptLimits;
import com.mypurecloud.sdk.v2.model.AttemptLimitsEntityListing;
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignDivisionView;
import com.mypurecloud.sdk.v2.model.CampaignDivisionViewListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignOutboundLinesDistribution;
import com.mypurecloud.sdk.v2.model.CampaignPatchRequest;
import com.mypurecloud.sdk.v2.model.CampaignProgress;
import com.mypurecloud.sdk.v2.model.CampaignRule;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignStats;
import com.mypurecloud.sdk.v2.model.CommonCampaignDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.CommonCampaignEntityListing;
import com.mypurecloud.sdk.v2.model.ContactBulkEditRequest;
import com.mypurecloud.sdk.v2.model.ContactBulkSearchParameters;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.ContactListDivisionView;
import com.mypurecloud.sdk.v2.model.ContactListDivisionViewListing;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListFilter;
import com.mypurecloud.sdk.v2.model.ContactListFilterBulkRetrieveBody;
import com.mypurecloud.sdk.v2.model.ContactListFilterEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListTemplate;
import com.mypurecloud.sdk.v2.model.ContactListTemplateBulkRetrieveBody;
import com.mypurecloud.sdk.v2.model.ContactListTemplateEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListingRequest;
import com.mypurecloud.sdk.v2.model.ContactListingResponse;
import com.mypurecloud.sdk.v2.model.ContactsBulkOperationJob;
import com.mypurecloud.sdk.v2.model.ContactsBulkOperationJobListing;
import com.mypurecloud.sdk.v2.model.ContactsExportRequest;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.DialerEventEntityListing;
import com.mypurecloud.sdk.v2.model.DigitalRuleSet;
import com.mypurecloud.sdk.v2.model.DigitalRuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.DncListDivisionView;
import com.mypurecloud.sdk.v2.model.DncListDivisionViewListing;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.DncPatchCustomExclusionColumnsRequest;
import com.mypurecloud.sdk.v2.model.DncPatchEmailsRequest;
import com.mypurecloud.sdk.v2.model.DncPatchPhoneNumbersRequest;
import com.mypurecloud.sdk.v2.model.DncPatchWhatsAppNumbersRequest;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EmailCampaignSchedule;
import com.mypurecloud.sdk.v2.model.EmailCampaignScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EventLog;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.FileSpecificationTemplate;
import com.mypurecloud.sdk.v2.model.FileSpecificationTemplateEntityListing;
import com.mypurecloud.sdk.v2.model.FilterPreviewResponse;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.ImportTemplate;
import com.mypurecloud.sdk.v2.model.ImportTemplateEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingCampaign;
import com.mypurecloud.sdk.v2.model.MessagingCampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.MessagingCampaignDivisionView;
import com.mypurecloud.sdk.v2.model.MessagingCampaignDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingCampaignEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingCampaignSchedule;
import com.mypurecloud.sdk.v2.model.MessagingCampaignScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundSettings;
import com.mypurecloud.sdk.v2.model.PagedSkillCombinationListing;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.TimeZoneMappingPreview;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.WritableDialerContact;


import com.mypurecloud.sdk.v2.api.request.DeleteOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistContactsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistfilterRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlisttemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlisttemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDigitalrulesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDnclistCustomexclusioncolumnsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDnclistEmailaddressesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDnclistPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDnclistWhatsappnumbersRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundFilespecificationtemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundFilespecificationtemplatesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundImporttemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundImporttemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundMessagingcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundMessagingcampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesEmailcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesMessagingcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundAttemptlimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallabletimesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallanalysisresponsesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignAgentownedmappingpreviewResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignDiagnosticsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignInteractionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignLinedistributionRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignSkillcombinationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignStatsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignrulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignsAllRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignsAllDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignsDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistContactsBulkJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistContactsBulkJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistTimezonemappingpreviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistfilterRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistfiltersRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistsDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlisttemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlisttemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDigitalrulesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDigitalrulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistsDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundEventRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundEventsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundFilespecificationtemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundFilespecificationtemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundImporttemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundImporttemplateImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundImporttemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundMessagingcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundMessagingcampaignDiagnosticsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundMessagingcampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundMessagingcampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundMessagingcampaignsDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundMessagingcampaignsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundRulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesEmailcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesEmailcampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesMessagingcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesMessagingcampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundWrapupcodemappingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOutboundDnclistCustomexclusioncolumnsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOutboundDnclistEmailaddressesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOutboundDnclistPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOutboundDnclistWhatsappnumbersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchOutboundSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundAttemptlimitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCallabletimesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCallanalysisresponsesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignAgentownedmappingpreviewRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignCallbackScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignStartRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignStopRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignrulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignsProgressRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistClearRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistContactsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistContactsBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistContactsBulkUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistContactsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistExportRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistfiltersRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistfiltersBulkRetrieveRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistfiltersPreviewRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlisttemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlisttemplatesBulkAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlisttemplatesBulkRetrieveRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundConversationDncRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDigitalrulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistEmailaddressesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistExportRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundFilespecificationtemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundImporttemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundImporttemplatesBulkAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundMessagingcampaignStartRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundMessagingcampaignStopRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundMessagingcampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundMessagingcampaignsProgressRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundRulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignAgentRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlistfilterRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlisttemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundDigitalrulesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundFilespecificationtemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundImporttemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundMessagingcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesEmailcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesMessagingcampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundWrapupcodemappingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutboundApi {
  private final ApiClient pcapiClient;

  public OutboundApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OutboundApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundAttemptlimit(String attemptLimitsId) throws IOException, ApiException {
     deleteOutboundAttemptlimit(createDeleteOutboundAttemptlimitRequest(attemptLimitsId));
  }

  /**
   * Delete attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundAttemptlimitWithHttpInfo(String attemptLimitsId) throws IOException {
    return deleteOutboundAttemptlimit(createDeleteOutboundAttemptlimitRequest(attemptLimitsId).withHttpInfo());
  }

  private DeleteOutboundAttemptlimitRequest createDeleteOutboundAttemptlimitRequest(String attemptLimitsId) {
    return DeleteOutboundAttemptlimitRequest.builder()
            .withAttemptLimitsId(attemptLimitsId)

            .build();
  }

  /**
   * Delete attempt limits
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundAttemptlimit(DeleteOutboundAttemptlimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundAttemptlimit(ApiRequest<Void> request) throws IOException {
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
   * Delete callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallabletimeset(String callableTimeSetId) throws IOException, ApiException {
     deleteOutboundCallabletimeset(createDeleteOutboundCallabletimesetRequest(callableTimeSetId));
  }

  /**
   * Delete callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallabletimesetWithHttpInfo(String callableTimeSetId) throws IOException {
    return deleteOutboundCallabletimeset(createDeleteOutboundCallabletimesetRequest(callableTimeSetId).withHttpInfo());
  }

  private DeleteOutboundCallabletimesetRequest createDeleteOutboundCallabletimesetRequest(String callableTimeSetId) {
    return DeleteOutboundCallabletimesetRequest.builder()
            .withCallableTimeSetId(callableTimeSetId)

            .build();
  }

  /**
   * Delete callable time set
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallabletimeset(DeleteOutboundCallabletimesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallabletimeset(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallanalysisresponseset(String callAnalysisSetId) throws IOException, ApiException {
     deleteOutboundCallanalysisresponseset(createDeleteOutboundCallanalysisresponsesetRequest(callAnalysisSetId));
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId) throws IOException {
    return deleteOutboundCallanalysisresponseset(createDeleteOutboundCallanalysisresponsesetRequest(callAnalysisSetId).withHttpInfo());
  }

  private DeleteOutboundCallanalysisresponsesetRequest createDeleteOutboundCallanalysisresponsesetRequest(String callAnalysisSetId) {
    return DeleteOutboundCallanalysisresponsesetRequest.builder()
            .withCallAnalysisSetId(callAnalysisSetId)

            .build();
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallanalysisresponseset(DeleteOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallanalysisresponseset(ApiRequest<Void> request) throws IOException {
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
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign deleteOutboundCampaign(String campaignId) throws IOException, ApiException {
    return  deleteOutboundCampaign(createDeleteOutboundCampaignRequest(campaignId));
  }

  /**
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> deleteOutboundCampaignWithHttpInfo(String campaignId) throws IOException {
    return deleteOutboundCampaign(createDeleteOutboundCampaignRequest(campaignId).withHttpInfo());
  }

  private DeleteOutboundCampaignRequest createDeleteOutboundCampaignRequest(String campaignId) {
    return DeleteOutboundCampaignRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Delete a campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign deleteOutboundCampaign(DeleteOutboundCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> deleteOutboundCampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignProgress(String campaignId) throws IOException, ApiException {
     deleteOutboundCampaignProgress(createDeleteOutboundCampaignProgressRequest(campaignId));
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignProgressWithHttpInfo(String campaignId) throws IOException {
    return deleteOutboundCampaignProgress(createDeleteOutboundCampaignProgressRequest(campaignId).withHttpInfo());
  }

  private DeleteOutboundCampaignProgressRequest createDeleteOutboundCampaignProgressRequest(String campaignId) {
    return DeleteOutboundCampaignProgressRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignProgress(DeleteOutboundCampaignProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignProgress(ApiRequest<Void> request) throws IOException {
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
   * Delete Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignrule(String campaignRuleId) throws IOException, ApiException {
     deleteOutboundCampaignrule(createDeleteOutboundCampaignruleRequest(campaignRuleId));
  }

  /**
   * Delete Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignruleWithHttpInfo(String campaignRuleId) throws IOException {
    return deleteOutboundCampaignrule(createDeleteOutboundCampaignruleRequest(campaignRuleId).withHttpInfo());
  }

  private DeleteOutboundCampaignruleRequest createDeleteOutboundCampaignruleRequest(String campaignRuleId) {
    return DeleteOutboundCampaignruleRequest.builder()
            .withCampaignRuleId(campaignRuleId)

            .build();
  }

  /**
   * Delete Campaign Rule
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignrule(DeleteOutboundCampaignruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignrule(ApiRequest<Void> request) throws IOException {
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
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlist(String contactListId) throws IOException, ApiException {
     deleteOutboundContactlist(createDeleteOutboundContactlistRequest(contactListId));
  }

  /**
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistWithHttpInfo(String contactListId) throws IOException {
    return deleteOutboundContactlist(createDeleteOutboundContactlistRequest(contactListId).withHttpInfo());
  }

  private DeleteOutboundContactlistRequest createDeleteOutboundContactlistRequest(String contactListId) {
    return DeleteOutboundContactlistRequest.builder()
            .withContactListId(contactListId)

            .build();
  }

  /**
   * Delete a contact list.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlist(DeleteOutboundContactlistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlist(ApiRequest<Void> request) throws IOException {
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
   * Delete a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistContact(String contactListId, String contactId) throws IOException, ApiException {
     deleteOutboundContactlistContact(createDeleteOutboundContactlistContactRequest(contactListId, contactId));
  }

  /**
   * Delete a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistContactWithHttpInfo(String contactListId, String contactId) throws IOException {
    return deleteOutboundContactlistContact(createDeleteOutboundContactlistContactRequest(contactListId, contactId).withHttpInfo());
  }

  private DeleteOutboundContactlistContactRequest createDeleteOutboundContactlistContactRequest(String contactListId, String contactId) {
    return DeleteOutboundContactlistContactRequest.builder()
            .withContactListId(contactListId)

            .withContactId(contactId)

            .build();
  }

  /**
   * Delete a contact.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistContact(DeleteOutboundContactlistContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistContact(ApiRequest<Void> request) throws IOException {
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
   * Delete contacts from a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactIds ContactIds to delete. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistContacts(String contactListId, List<String> contactIds) throws IOException, ApiException {
     deleteOutboundContactlistContacts(createDeleteOutboundContactlistContactsRequest(contactListId, contactIds));
  }

  /**
   * Delete contacts from a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactIds ContactIds to delete. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistContactsWithHttpInfo(String contactListId, List<String> contactIds) throws IOException {
    return deleteOutboundContactlistContacts(createDeleteOutboundContactlistContactsRequest(contactListId, contactIds).withHttpInfo());
  }

  private DeleteOutboundContactlistContactsRequest createDeleteOutboundContactlistContactsRequest(String contactListId, List<String> contactIds) {
    return DeleteOutboundContactlistContactsRequest.builder()
            .withContactListId(contactListId)

            .withContactIds(contactIds)

            .build();
  }

  /**
   * Delete contacts from a contact list.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistContacts(DeleteOutboundContactlistContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete contacts from a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistContacts(ApiRequest<Void> request) throws IOException {
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
   * Delete Contact List Filter
   * 
   * @param contactListFilterId Contact List Filter ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistfilter(String contactListFilterId) throws IOException, ApiException {
     deleteOutboundContactlistfilter(createDeleteOutboundContactlistfilterRequest(contactListFilterId));
  }

  /**
   * Delete Contact List Filter
   * 
   * @param contactListFilterId Contact List Filter ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistfilterWithHttpInfo(String contactListFilterId) throws IOException {
    return deleteOutboundContactlistfilter(createDeleteOutboundContactlistfilterRequest(contactListFilterId).withHttpInfo());
  }

  private DeleteOutboundContactlistfilterRequest createDeleteOutboundContactlistfilterRequest(String contactListFilterId) {
    return DeleteOutboundContactlistfilterRequest.builder()
            .withContactListFilterId(contactListFilterId)

            .build();
  }

  /**
   * Delete Contact List Filter
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistfilter(DeleteOutboundContactlistfilterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Contact List Filter
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistfilter(ApiRequest<Void> request) throws IOException {
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
   * Delete multiple contact lists.
   * 
   * @param id contact list id(s) to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlists(List<String> id) throws IOException, ApiException {
     deleteOutboundContactlists(createDeleteOutboundContactlistsRequest(id));
  }

  /**
   * Delete multiple contact lists.
   * 
   * @param id contact list id(s) to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistsWithHttpInfo(List<String> id) throws IOException {
    return deleteOutboundContactlists(createDeleteOutboundContactlistsRequest(id).withHttpInfo());
  }

  private DeleteOutboundContactlistsRequest createDeleteOutboundContactlistsRequest(List<String> id) {
    return DeleteOutboundContactlistsRequest.builder()
            .withId(id)

            .build();
  }

  /**
   * Delete multiple contact lists.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlists(DeleteOutboundContactlistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete multiple contact lists.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlists(ApiRequest<Void> request) throws IOException {
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
   * Delete Contact List Template
   * 
   * @param contactListTemplateId ContactListTemplate ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlisttemplate(String contactListTemplateId) throws IOException, ApiException {
     deleteOutboundContactlisttemplate(createDeleteOutboundContactlisttemplateRequest(contactListTemplateId));
  }

  /**
   * Delete Contact List Template
   * 
   * @param contactListTemplateId ContactListTemplate ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlisttemplateWithHttpInfo(String contactListTemplateId) throws IOException {
    return deleteOutboundContactlisttemplate(createDeleteOutboundContactlisttemplateRequest(contactListTemplateId).withHttpInfo());
  }

  private DeleteOutboundContactlisttemplateRequest createDeleteOutboundContactlisttemplateRequest(String contactListTemplateId) {
    return DeleteOutboundContactlisttemplateRequest.builder()
            .withContactListTemplateId(contactListTemplateId)

            .build();
  }

  /**
   * Delete Contact List Template
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlisttemplate(DeleteOutboundContactlisttemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Contact List Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlisttemplate(ApiRequest<Void> request) throws IOException {
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
   * Delete multiple contact list templates.
   * 
   * @param id contact list template id(s) to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlisttemplates(List<String> id) throws IOException, ApiException {
     deleteOutboundContactlisttemplates(createDeleteOutboundContactlisttemplatesRequest(id));
  }

  /**
   * Delete multiple contact list templates.
   * 
   * @param id contact list template id(s) to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlisttemplatesWithHttpInfo(List<String> id) throws IOException {
    return deleteOutboundContactlisttemplates(createDeleteOutboundContactlisttemplatesRequest(id).withHttpInfo());
  }

  private DeleteOutboundContactlisttemplatesRequest createDeleteOutboundContactlisttemplatesRequest(List<String> id) {
    return DeleteOutboundContactlisttemplatesRequest.builder()
            .withId(id)

            .build();
  }

  /**
   * Delete multiple contact list templates.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlisttemplates(DeleteOutboundContactlisttemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete multiple contact list templates.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlisttemplates(ApiRequest<Void> request) throws IOException {
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
   * Delete an Outbound Digital Rule Set
   * 
   * @param digitalRuleSetId The Digital Rule Set ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDigitalruleset(String digitalRuleSetId) throws IOException, ApiException {
     deleteOutboundDigitalruleset(createDeleteOutboundDigitalrulesetRequest(digitalRuleSetId));
  }

  /**
   * Delete an Outbound Digital Rule Set
   * 
   * @param digitalRuleSetId The Digital Rule Set ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDigitalrulesetWithHttpInfo(String digitalRuleSetId) throws IOException {
    return deleteOutboundDigitalruleset(createDeleteOutboundDigitalrulesetRequest(digitalRuleSetId).withHttpInfo());
  }

  private DeleteOutboundDigitalrulesetRequest createDeleteOutboundDigitalrulesetRequest(String digitalRuleSetId) {
    return DeleteOutboundDigitalrulesetRequest.builder()
            .withDigitalRuleSetId(digitalRuleSetId)

            .build();
  }

  /**
   * Delete an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDigitalruleset(DeleteOutboundDigitalrulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDigitalruleset(ApiRequest<Void> request) throws IOException {
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
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclist(String dncListId) throws IOException, ApiException {
     deleteOutboundDnclist(createDeleteOutboundDnclistRequest(dncListId));
  }

  /**
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistWithHttpInfo(String dncListId) throws IOException {
    return deleteOutboundDnclist(createDeleteOutboundDnclistRequest(dncListId).withHttpInfo());
  }

  private DeleteOutboundDnclistRequest createDeleteOutboundDnclistRequest(String dncListId) {
    return DeleteOutboundDnclistRequest.builder()
            .withDncListId(dncListId)

            .build();
  }

  /**
   * Delete dialer DNC list
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclist(DeleteOutboundDnclistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclist(ApiRequest<Void> request) throws IOException {
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
   * Deletes all or expired custom exclusion column entries from a DNC list.
   * This operation is only for Internal DNC lists of custom exclusion column entries
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC entries that are expired (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistCustomexclusioncolumns(String dncListId, Boolean expiredOnly) throws IOException, ApiException {
     deleteOutboundDnclistCustomexclusioncolumns(createDeleteOutboundDnclistCustomexclusioncolumnsRequest(dncListId, expiredOnly));
  }

  /**
   * Deletes all or expired custom exclusion column entries from a DNC list.
   * This operation is only for Internal DNC lists of custom exclusion column entries
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC entries that are expired (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistCustomexclusioncolumnsWithHttpInfo(String dncListId, Boolean expiredOnly) throws IOException {
    return deleteOutboundDnclistCustomexclusioncolumns(createDeleteOutboundDnclistCustomexclusioncolumnsRequest(dncListId, expiredOnly).withHttpInfo());
  }

  private DeleteOutboundDnclistCustomexclusioncolumnsRequest createDeleteOutboundDnclistCustomexclusioncolumnsRequest(String dncListId, Boolean expiredOnly) {
    return DeleteOutboundDnclistCustomexclusioncolumnsRequest.builder()
            .withDncListId(dncListId)

            .withExpiredOnly(expiredOnly)

            .build();
  }

  /**
   * Deletes all or expired custom exclusion column entries from a DNC list.
   * This operation is only for Internal DNC lists of custom exclusion column entries
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistCustomexclusioncolumns(DeleteOutboundDnclistCustomexclusioncolumnsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes all or expired custom exclusion column entries from a DNC list.
   * This operation is only for Internal DNC lists of custom exclusion column entries
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistCustomexclusioncolumns(ApiRequest<Void> request) throws IOException {
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
   * Deletes all or expired email addresses from a DNC list.
   * This operation is Only for Internal DNC lists of email addresses
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC entries that are expired (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistEmailaddresses(String dncListId, Boolean expiredOnly) throws IOException, ApiException {
     deleteOutboundDnclistEmailaddresses(createDeleteOutboundDnclistEmailaddressesRequest(dncListId, expiredOnly));
  }

  /**
   * Deletes all or expired email addresses from a DNC list.
   * This operation is Only for Internal DNC lists of email addresses
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC entries that are expired (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistEmailaddressesWithHttpInfo(String dncListId, Boolean expiredOnly) throws IOException {
    return deleteOutboundDnclistEmailaddresses(createDeleteOutboundDnclistEmailaddressesRequest(dncListId, expiredOnly).withHttpInfo());
  }

  private DeleteOutboundDnclistEmailaddressesRequest createDeleteOutboundDnclistEmailaddressesRequest(String dncListId, Boolean expiredOnly) {
    return DeleteOutboundDnclistEmailaddressesRequest.builder()
            .withDncListId(dncListId)

            .withExpiredOnly(expiredOnly)

            .build();
  }

  /**
   * Deletes all or expired email addresses from a DNC list.
   * This operation is Only for Internal DNC lists of email addresses
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistEmailaddresses(DeleteOutboundDnclistEmailaddressesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes all or expired email addresses from a DNC list.
   * This operation is Only for Internal DNC lists of email addresses
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistEmailaddresses(ApiRequest<Void> request) throws IOException {
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
   * Deletes all or expired phone numbers from a DNC list.
   * This operation is Only for Internal DNC lists of phone numbers
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC entries that are expired (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistPhonenumbers(String dncListId, Boolean expiredOnly) throws IOException, ApiException {
     deleteOutboundDnclistPhonenumbers(createDeleteOutboundDnclistPhonenumbersRequest(dncListId, expiredOnly));
  }

  /**
   * Deletes all or expired phone numbers from a DNC list.
   * This operation is Only for Internal DNC lists of phone numbers
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC entries that are expired (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistPhonenumbersWithHttpInfo(String dncListId, Boolean expiredOnly) throws IOException {
    return deleteOutboundDnclistPhonenumbers(createDeleteOutboundDnclistPhonenumbersRequest(dncListId, expiredOnly).withHttpInfo());
  }

  private DeleteOutboundDnclistPhonenumbersRequest createDeleteOutboundDnclistPhonenumbersRequest(String dncListId, Boolean expiredOnly) {
    return DeleteOutboundDnclistPhonenumbersRequest.builder()
            .withDncListId(dncListId)

            .withExpiredOnly(expiredOnly)

            .build();
  }

  /**
   * Deletes all or expired phone numbers from a DNC list.
   * This operation is Only for Internal DNC lists of phone numbers
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistPhonenumbers(DeleteOutboundDnclistPhonenumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes all or expired phone numbers from a DNC list.
   * This operation is Only for Internal DNC lists of phone numbers
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistPhonenumbers(ApiRequest<Void> request) throws IOException {
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
   * Deletes all or expired whatsApp numbers from a DNC list.
   * This operation is only for Internal DNC lists of whatsApp numbers
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC whatsApp numbers that are expired (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistWhatsappnumbers(String dncListId, Boolean expiredOnly) throws IOException, ApiException {
     deleteOutboundDnclistWhatsappnumbers(createDeleteOutboundDnclistWhatsappnumbersRequest(dncListId, expiredOnly));
  }

  /**
   * Deletes all or expired whatsApp numbers from a DNC list.
   * This operation is only for Internal DNC lists of whatsApp numbers
   * @param dncListId DncList ID (required)
   * @param expiredOnly Set to true to only remove DNC whatsApp numbers that are expired (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistWhatsappnumbersWithHttpInfo(String dncListId, Boolean expiredOnly) throws IOException {
    return deleteOutboundDnclistWhatsappnumbers(createDeleteOutboundDnclistWhatsappnumbersRequest(dncListId, expiredOnly).withHttpInfo());
  }

  private DeleteOutboundDnclistWhatsappnumbersRequest createDeleteOutboundDnclistWhatsappnumbersRequest(String dncListId, Boolean expiredOnly) {
    return DeleteOutboundDnclistWhatsappnumbersRequest.builder()
            .withDncListId(dncListId)

            .withExpiredOnly(expiredOnly)

            .build();
  }

  /**
   * Deletes all or expired whatsApp numbers from a DNC list.
   * This operation is only for Internal DNC lists of whatsApp numbers
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclistWhatsappnumbers(DeleteOutboundDnclistWhatsappnumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes all or expired whatsApp numbers from a DNC list.
   * This operation is only for Internal DNC lists of whatsApp numbers
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistWhatsappnumbers(ApiRequest<Void> request) throws IOException {
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
   * Delete File Specification Template
   * 
   * @param fileSpecificationTemplateId File Specification Template ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundFilespecificationtemplate(String fileSpecificationTemplateId) throws IOException, ApiException {
     deleteOutboundFilespecificationtemplate(createDeleteOutboundFilespecificationtemplateRequest(fileSpecificationTemplateId));
  }

  /**
   * Delete File Specification Template
   * 
   * @param fileSpecificationTemplateId File Specification Template ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundFilespecificationtemplateWithHttpInfo(String fileSpecificationTemplateId) throws IOException {
    return deleteOutboundFilespecificationtemplate(createDeleteOutboundFilespecificationtemplateRequest(fileSpecificationTemplateId).withHttpInfo());
  }

  private DeleteOutboundFilespecificationtemplateRequest createDeleteOutboundFilespecificationtemplateRequest(String fileSpecificationTemplateId) {
    return DeleteOutboundFilespecificationtemplateRequest.builder()
            .withFileSpecificationTemplateId(fileSpecificationTemplateId)

            .build();
  }

  /**
   * Delete File Specification Template
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundFilespecificationtemplate(DeleteOutboundFilespecificationtemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete File Specification Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundFilespecificationtemplate(ApiRequest<Void> request) throws IOException {
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
   * Delete multiple file specification templates.
   * 
   * @param id File Specification template id(s) to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundFilespecificationtemplatesBulk(List<String> id) throws IOException, ApiException {
     deleteOutboundFilespecificationtemplatesBulk(createDeleteOutboundFilespecificationtemplatesBulkRequest(id));
  }

  /**
   * Delete multiple file specification templates.
   * 
   * @param id File Specification template id(s) to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundFilespecificationtemplatesBulkWithHttpInfo(List<String> id) throws IOException {
    return deleteOutboundFilespecificationtemplatesBulk(createDeleteOutboundFilespecificationtemplatesBulkRequest(id).withHttpInfo());
  }

  private DeleteOutboundFilespecificationtemplatesBulkRequest createDeleteOutboundFilespecificationtemplatesBulkRequest(List<String> id) {
    return DeleteOutboundFilespecificationtemplatesBulkRequest.builder()
            .withId(id)

            .build();
  }

  /**
   * Delete multiple file specification templates.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundFilespecificationtemplatesBulk(DeleteOutboundFilespecificationtemplatesBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete multiple file specification templates.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundFilespecificationtemplatesBulk(ApiRequest<Void> request) throws IOException {
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
   * Delete Import Template
   * 
   * @param importTemplateId Import Template ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundImporttemplate(String importTemplateId) throws IOException, ApiException {
     deleteOutboundImporttemplate(createDeleteOutboundImporttemplateRequest(importTemplateId));
  }

  /**
   * Delete Import Template
   * 
   * @param importTemplateId Import Template ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundImporttemplateWithHttpInfo(String importTemplateId) throws IOException {
    return deleteOutboundImporttemplate(createDeleteOutboundImporttemplateRequest(importTemplateId).withHttpInfo());
  }

  private DeleteOutboundImporttemplateRequest createDeleteOutboundImporttemplateRequest(String importTemplateId) {
    return DeleteOutboundImporttemplateRequest.builder()
            .withImportTemplateId(importTemplateId)

            .build();
  }

  /**
   * Delete Import Template
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundImporttemplate(DeleteOutboundImporttemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Import Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundImporttemplate(ApiRequest<Void> request) throws IOException {
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
   * Delete multiple import templates.
   * 
   * @param id import template id(s) to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundImporttemplates(List<String> id) throws IOException, ApiException {
     deleteOutboundImporttemplates(createDeleteOutboundImporttemplatesRequest(id));
  }

  /**
   * Delete multiple import templates.
   * 
   * @param id import template id(s) to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundImporttemplatesWithHttpInfo(List<String> id) throws IOException {
    return deleteOutboundImporttemplates(createDeleteOutboundImporttemplatesRequest(id).withHttpInfo());
  }

  private DeleteOutboundImporttemplatesRequest createDeleteOutboundImporttemplatesRequest(List<String> id) {
    return DeleteOutboundImporttemplatesRequest.builder()
            .withId(id)

            .build();
  }

  /**
   * Delete multiple import templates.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundImporttemplates(DeleteOutboundImporttemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete multiple import templates.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundImporttemplates(ApiRequest<Void> request) throws IOException {
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
   * Delete an Outbound Messaging Campaign
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign deleteOutboundMessagingcampaign(String messagingCampaignId) throws IOException, ApiException {
    return  deleteOutboundMessagingcampaign(createDeleteOutboundMessagingcampaignRequest(messagingCampaignId));
  }

  /**
   * Delete an Outbound Messaging Campaign
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> deleteOutboundMessagingcampaignWithHttpInfo(String messagingCampaignId) throws IOException {
    return deleteOutboundMessagingcampaign(createDeleteOutboundMessagingcampaignRequest(messagingCampaignId).withHttpInfo());
  }

  private DeleteOutboundMessagingcampaignRequest createDeleteOutboundMessagingcampaignRequest(String messagingCampaignId) {
    return DeleteOutboundMessagingcampaignRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Delete an Outbound Messaging Campaign
   * 
   * @param request The request object
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign deleteOutboundMessagingcampaign(DeleteOutboundMessagingcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete an Outbound Messaging Campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> deleteOutboundMessagingcampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reset messaging campaign progress and recycle the messaging campaign
   * Documented permissions are applicable based on campaign type.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundMessagingcampaignProgress(String messagingCampaignId) throws IOException, ApiException {
     deleteOutboundMessagingcampaignProgress(createDeleteOutboundMessagingcampaignProgressRequest(messagingCampaignId));
  }

  /**
   * Reset messaging campaign progress and recycle the messaging campaign
   * Documented permissions are applicable based on campaign type.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundMessagingcampaignProgressWithHttpInfo(String messagingCampaignId) throws IOException {
    return deleteOutboundMessagingcampaignProgress(createDeleteOutboundMessagingcampaignProgressRequest(messagingCampaignId).withHttpInfo());
  }

  private DeleteOutboundMessagingcampaignProgressRequest createDeleteOutboundMessagingcampaignProgressRequest(String messagingCampaignId) {
    return DeleteOutboundMessagingcampaignProgressRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Reset messaging campaign progress and recycle the messaging campaign
   * Documented permissions are applicable based on campaign type.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundMessagingcampaignProgress(DeleteOutboundMessagingcampaignProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Reset messaging campaign progress and recycle the messaging campaign
   * Documented permissions are applicable based on campaign type.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundMessagingcampaignProgress(ApiRequest<Void> request) throws IOException {
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
   * Delete a Rule Set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundRuleset(String ruleSetId) throws IOException, ApiException {
     deleteOutboundRuleset(createDeleteOutboundRulesetRequest(ruleSetId));
  }

  /**
   * Delete a Rule Set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundRulesetWithHttpInfo(String ruleSetId) throws IOException {
    return deleteOutboundRuleset(createDeleteOutboundRulesetRequest(ruleSetId).withHttpInfo());
  }

  private DeleteOutboundRulesetRequest createDeleteOutboundRulesetRequest(String ruleSetId) {
    return DeleteOutboundRulesetRequest.builder()
            .withRuleSetId(ruleSetId)

            .build();
  }

  /**
   * Delete a Rule Set.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundRuleset(DeleteOutboundRulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Rule Set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundRuleset(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesCampaign(String campaignId) throws IOException, ApiException {
     deleteOutboundSchedulesCampaign(createDeleteOutboundSchedulesCampaignRequest(campaignId));
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesCampaignWithHttpInfo(String campaignId) throws IOException {
    return deleteOutboundSchedulesCampaign(createDeleteOutboundSchedulesCampaignRequest(campaignId).withHttpInfo());
  }

  private DeleteOutboundSchedulesCampaignRequest createDeleteOutboundSchedulesCampaignRequest(String campaignId) {
    return DeleteOutboundSchedulesCampaignRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesCampaign(DeleteOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesCampaign(ApiRequest<Void> request) throws IOException {
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
   * Delete an email campaign schedule.
   * 
   * @param emailCampaignId Email Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesEmailcampaign(String emailCampaignId) throws IOException, ApiException {
     deleteOutboundSchedulesEmailcampaign(createDeleteOutboundSchedulesEmailcampaignRequest(emailCampaignId));
  }

  /**
   * Delete an email campaign schedule.
   * 
   * @param emailCampaignId Email Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesEmailcampaignWithHttpInfo(String emailCampaignId) throws IOException {
    return deleteOutboundSchedulesEmailcampaign(createDeleteOutboundSchedulesEmailcampaignRequest(emailCampaignId).withHttpInfo());
  }

  private DeleteOutboundSchedulesEmailcampaignRequest createDeleteOutboundSchedulesEmailcampaignRequest(String emailCampaignId) {
    return DeleteOutboundSchedulesEmailcampaignRequest.builder()
            .withEmailCampaignId(emailCampaignId)

            .build();
  }

  /**
   * Delete an email campaign schedule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesEmailcampaign(DeleteOutboundSchedulesEmailcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an email campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesEmailcampaign(ApiRequest<Void> request) throws IOException {
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
   * Delete a messaging campaign schedule.
   * 
   * @param messagingCampaignId Messaging Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesMessagingcampaign(String messagingCampaignId) throws IOException, ApiException {
     deleteOutboundSchedulesMessagingcampaign(createDeleteOutboundSchedulesMessagingcampaignRequest(messagingCampaignId));
  }

  /**
   * Delete a messaging campaign schedule.
   * 
   * @param messagingCampaignId Messaging Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesMessagingcampaignWithHttpInfo(String messagingCampaignId) throws IOException {
    return deleteOutboundSchedulesMessagingcampaign(createDeleteOutboundSchedulesMessagingcampaignRequest(messagingCampaignId).withHttpInfo());
  }

  private DeleteOutboundSchedulesMessagingcampaignRequest createDeleteOutboundSchedulesMessagingcampaignRequest(String messagingCampaignId) {
    return DeleteOutboundSchedulesMessagingcampaignRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Delete a messaging campaign schedule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesMessagingcampaign(DeleteOutboundSchedulesMessagingcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a messaging campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesMessagingcampaign(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesSequence(String sequenceId) throws IOException, ApiException {
     deleteOutboundSchedulesSequence(createDeleteOutboundSchedulesSequenceRequest(sequenceId));
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesSequenceWithHttpInfo(String sequenceId) throws IOException {
    return deleteOutboundSchedulesSequence(createDeleteOutboundSchedulesSequenceRequest(sequenceId).withHttpInfo());
  }

  private DeleteOutboundSchedulesSequenceRequest createDeleteOutboundSchedulesSequenceRequest(String sequenceId) {
    return DeleteOutboundSchedulesSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .build();
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesSequence(DeleteOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesSequence(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSequence(String sequenceId) throws IOException, ApiException {
     deleteOutboundSequence(createDeleteOutboundSequenceRequest(sequenceId));
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSequenceWithHttpInfo(String sequenceId) throws IOException {
    return deleteOutboundSequence(createDeleteOutboundSequenceRequest(sequenceId).withHttpInfo());
  }

  private DeleteOutboundSequenceRequest createDeleteOutboundSequenceRequest(String sequenceId) {
    return DeleteOutboundSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .build();
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSequence(DeleteOutboundSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSequence(ApiRequest<Void> request) throws IOException {
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
   * Get attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits getOutboundAttemptlimit(String attemptLimitsId) throws IOException, ApiException {
    return  getOutboundAttemptlimit(createGetOutboundAttemptlimitRequest(attemptLimitsId));
  }

  /**
   * Get attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return AttemptLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> getOutboundAttemptlimitWithHttpInfo(String attemptLimitsId) throws IOException {
    return getOutboundAttemptlimit(createGetOutboundAttemptlimitRequest(attemptLimitsId).withHttpInfo());
  }

  private GetOutboundAttemptlimitRequest createGetOutboundAttemptlimitRequest(String attemptLimitsId) {
    return GetOutboundAttemptlimitRequest.builder()
            .withAttemptLimitsId(attemptLimitsId)

            .build();
  }

  /**
   * Get attempt limits
   * 
   * @param request The request object
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits getOutboundAttemptlimit(GetOutboundAttemptlimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> getOutboundAttemptlimit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query attempt limits list
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return AttemptLimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimitsEntityListing getOutboundAttemptlimits(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundAttemptlimits(createGetOutboundAttemptlimitsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query attempt limits list
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return AttemptLimitsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimitsEntityListing> getOutboundAttemptlimitsWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundAttemptlimits(createGetOutboundAttemptlimitsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundAttemptlimitsRequest createGetOutboundAttemptlimitsRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundAttemptlimitsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query attempt limits list
   * 
   * @param request The request object
   * @return AttemptLimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimitsEntityListing getOutboundAttemptlimits(GetOutboundAttemptlimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimitsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimitsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query attempt limits list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimitsEntityListing> getOutboundAttemptlimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimitsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimitsEntityListing> response = (ApiResponse<AttemptLimitsEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimitsEntityListing> response = (ApiResponse<AttemptLimitsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet getOutboundCallabletimeset(String callableTimeSetId) throws IOException, ApiException {
    return  getOutboundCallabletimeset(createGetOutboundCallabletimesetRequest(callableTimeSetId));
  }

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return CallableTimeSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> getOutboundCallabletimesetWithHttpInfo(String callableTimeSetId) throws IOException {
    return getOutboundCallabletimeset(createGetOutboundCallabletimesetRequest(callableTimeSetId).withHttpInfo());
  }

  private GetOutboundCallabletimesetRequest createGetOutboundCallabletimesetRequest(String callableTimeSetId) {
    return GetOutboundCallabletimesetRequest.builder()
            .withCallableTimeSetId(callableTimeSetId)

            .build();
  }

  /**
   * Get callable time set
   * 
   * @param request The request object
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet getOutboundCallabletimeset(GetOutboundCallabletimesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> getOutboundCallabletimeset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query callable time set list
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CallableTimeSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSetEntityListing getOutboundCallabletimesets(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCallabletimesets(createGetOutboundCallabletimesetsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query callable time set list
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CallableTimeSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSetEntityListing> getOutboundCallabletimesetsWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundCallabletimesets(createGetOutboundCallabletimesetsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCallabletimesetsRequest createGetOutboundCallabletimesetsRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundCallabletimesetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query callable time set list
   * 
   * @param request The request object
   * @return CallableTimeSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSetEntityListing getOutboundCallabletimesets(GetOutboundCallabletimesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query callable time set list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSetEntityListing> getOutboundCallabletimesets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSetEntityListing> response = (ApiResponse<CallableTimeSetEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSetEntityListing> response = (ApiResponse<CallableTimeSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet getOutboundCallanalysisresponseset(String callAnalysisSetId) throws IOException, ApiException {
    return  getOutboundCallanalysisresponseset(createGetOutboundCallanalysisresponsesetRequest(callAnalysisSetId));
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return ResponseSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> getOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId) throws IOException {
    return getOutboundCallanalysisresponseset(createGetOutboundCallanalysisresponsesetRequest(callAnalysisSetId).withHttpInfo());
  }

  private GetOutboundCallanalysisresponsesetRequest createGetOutboundCallanalysisresponsesetRequest(String callAnalysisSetId) {
    return GetOutboundCallanalysisresponsesetRequest.builder()
            .withCallAnalysisSetId(callAnalysisSetId)

            .build();
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param request The request object
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet getOutboundCallanalysisresponseset(GetOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> getOutboundCallanalysisresponseset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ResponseSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSetEntityListing getOutboundCallanalysisresponsesets(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCallanalysisresponsesets(createGetOutboundCallanalysisresponsesetsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ResponseSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSetEntityListing> getOutboundCallanalysisresponsesetsWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundCallanalysisresponsesets(createGetOutboundCallanalysisresponsesetsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCallanalysisresponsesetsRequest createGetOutboundCallanalysisresponsesetsRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundCallanalysisresponsesetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param request The request object
   * @return ResponseSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSetEntityListing getOutboundCallanalysisresponsesets(GetOutboundCallanalysisresponsesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSetEntityListing> getOutboundCallanalysisresponsesets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSetEntityListing> response = (ApiResponse<ResponseSetEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSetEntityListing> response = (ApiResponse<ResponseSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign getOutboundCampaign(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaign(createGetOutboundCampaignRequest(campaignId));
  }

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> getOutboundCampaignWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaign(createGetOutboundCampaignRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignRequest createGetOutboundCampaignRequest(String campaignId) {
    return GetOutboundCampaignRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get dialer campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign getOutboundCampaign(GetOutboundCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> getOutboundCampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param campaignId Campaign ID (required)
   * @return AgentOwnedMappingPreviewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentOwnedMappingPreviewListing getOutboundCampaignAgentownedmappingpreviewResults(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignAgentownedmappingpreviewResults(createGetOutboundCampaignAgentownedmappingpreviewResultsRequest(campaignId));
  }

  /**
   * Get a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param campaignId Campaign ID (required)
   * @return AgentOwnedMappingPreviewListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentOwnedMappingPreviewListing> getOutboundCampaignAgentownedmappingpreviewResultsWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignAgentownedmappingpreviewResults(createGetOutboundCampaignAgentownedmappingpreviewResultsRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignAgentownedmappingpreviewResultsRequest createGetOutboundCampaignAgentownedmappingpreviewResultsRequest(String campaignId) {
    return GetOutboundCampaignAgentownedmappingpreviewResultsRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request The request object
   * @return AgentOwnedMappingPreviewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentOwnedMappingPreviewListing getOutboundCampaignAgentownedmappingpreviewResults(GetOutboundCampaignAgentownedmappingpreviewResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentOwnedMappingPreviewListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentOwnedMappingPreviewListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentOwnedMappingPreviewListing> getOutboundCampaignAgentownedmappingpreviewResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentOwnedMappingPreviewListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentOwnedMappingPreviewListing> response = (ApiResponse<AgentOwnedMappingPreviewListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AgentOwnedMappingPreviewListing> response = (ApiResponse<AgentOwnedMappingPreviewListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignDiagnostics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDiagnostics getOutboundCampaignDiagnostics(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignDiagnostics(createGetOutboundCampaignDiagnosticsRequest(campaignId));
  }

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignDiagnostics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDiagnostics> getOutboundCampaignDiagnosticsWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignDiagnostics(createGetOutboundCampaignDiagnosticsRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignDiagnosticsRequest createGetOutboundCampaignDiagnosticsRequest(String campaignId) {
    return GetOutboundCampaignDiagnosticsRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get campaign diagnostics
   * 
   * @param request The request object
   * @return CampaignDiagnostics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDiagnostics getOutboundCampaignDiagnostics(GetOutboundCampaignDiagnosticsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignDiagnostics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignDiagnostics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get campaign diagnostics
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDiagnostics> getOutboundCampaignDiagnostics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignDiagnostics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignDiagnostics> response = (ApiResponse<CampaignDiagnostics>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignDiagnostics> response = (ApiResponse<CampaignDiagnostics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignInteractions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignInteractions getOutboundCampaignInteractions(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignInteractions(createGetOutboundCampaignInteractionsRequest(campaignId));
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignInteractions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignInteractions> getOutboundCampaignInteractionsWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignInteractions(createGetOutboundCampaignInteractionsRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignInteractionsRequest createGetOutboundCampaignInteractionsRequest(String campaignId) {
    return GetOutboundCampaignInteractionsRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param request The request object
   * @return CampaignInteractions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignInteractions getOutboundCampaignInteractions(GetOutboundCampaignInteractionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignInteractions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignInteractions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignInteractions> getOutboundCampaignInteractions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignInteractions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignInteractions> response = (ApiResponse<CampaignInteractions>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignInteractions> response = (ApiResponse<CampaignInteractions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get line distribution information for campaigns using same Edge Group or Site as given campaign
   * 
   * @param campaignId Campaign ID (required)
   * @param includeOnlyActiveCampaigns If true will return only active Campaigns (optional, default to true)
   * @param edgeGroupId Edge group to be used in line distribution calculations instead of current Campaign's Edge Group. Campaign's Site and Edge Group are mutually exclusive. (optional)
   * @param siteId Site to be used in line distribution calculations instead of current Campaign's Site.  Campaign's Site and Edge Group are mutually exclusive. (optional)
   * @param useWeight Enable usage of weight, this value overrides current Campaign's setting in line distribution calculations (optional)
   * @param relativeWeight Relative weight to be used in line distribution calculations instead of current Campaign's relative weight (optional)
   * @param outboundLineCount The number of outbound lines to be used in line distribution calculations, instead of current Campaign's Outbound Lines Count (optional)
   * @return CampaignOutboundLinesDistribution
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignOutboundLinesDistribution getOutboundCampaignLinedistribution(String campaignId, Boolean includeOnlyActiveCampaigns, String edgeGroupId, String siteId, Boolean useWeight, Integer relativeWeight, Integer outboundLineCount) throws IOException, ApiException {
    return  getOutboundCampaignLinedistribution(createGetOutboundCampaignLinedistributionRequest(campaignId, includeOnlyActiveCampaigns, edgeGroupId, siteId, useWeight, relativeWeight, outboundLineCount));
  }

  /**
   * Get line distribution information for campaigns using same Edge Group or Site as given campaign
   * 
   * @param campaignId Campaign ID (required)
   * @param includeOnlyActiveCampaigns If true will return only active Campaigns (optional, default to true)
   * @param edgeGroupId Edge group to be used in line distribution calculations instead of current Campaign's Edge Group. Campaign's Site and Edge Group are mutually exclusive. (optional)
   * @param siteId Site to be used in line distribution calculations instead of current Campaign's Site.  Campaign's Site and Edge Group are mutually exclusive. (optional)
   * @param useWeight Enable usage of weight, this value overrides current Campaign's setting in line distribution calculations (optional)
   * @param relativeWeight Relative weight to be used in line distribution calculations instead of current Campaign's relative weight (optional)
   * @param outboundLineCount The number of outbound lines to be used in line distribution calculations, instead of current Campaign's Outbound Lines Count (optional)
   * @return CampaignOutboundLinesDistribution
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignOutboundLinesDistribution> getOutboundCampaignLinedistributionWithHttpInfo(String campaignId, Boolean includeOnlyActiveCampaigns, String edgeGroupId, String siteId, Boolean useWeight, Integer relativeWeight, Integer outboundLineCount) throws IOException {
    return getOutboundCampaignLinedistribution(createGetOutboundCampaignLinedistributionRequest(campaignId, includeOnlyActiveCampaigns, edgeGroupId, siteId, useWeight, relativeWeight, outboundLineCount).withHttpInfo());
  }

  private GetOutboundCampaignLinedistributionRequest createGetOutboundCampaignLinedistributionRequest(String campaignId, Boolean includeOnlyActiveCampaigns, String edgeGroupId, String siteId, Boolean useWeight, Integer relativeWeight, Integer outboundLineCount) {
    return GetOutboundCampaignLinedistributionRequest.builder()
            .withCampaignId(campaignId)

            .withIncludeOnlyActiveCampaigns(includeOnlyActiveCampaigns)

            .withEdgeGroupId(edgeGroupId)

            .withSiteId(siteId)

            .withUseWeight(useWeight)

            .withRelativeWeight(relativeWeight)

            .withOutboundLineCount(outboundLineCount)

            .build();
  }

  /**
   * Get line distribution information for campaigns using same Edge Group or Site as given campaign
   * 
   * @param request The request object
   * @return CampaignOutboundLinesDistribution
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignOutboundLinesDistribution getOutboundCampaignLinedistribution(GetOutboundCampaignLinedistributionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignOutboundLinesDistribution> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignOutboundLinesDistribution>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get line distribution information for campaigns using same Edge Group or Site as given campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignOutboundLinesDistribution> getOutboundCampaignLinedistribution(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignOutboundLinesDistribution>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignOutboundLinesDistribution> response = (ApiResponse<CampaignOutboundLinesDistribution>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignOutboundLinesDistribution> response = (ApiResponse<CampaignOutboundLinesDistribution>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignProgress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignProgress getOutboundCampaignProgress(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignProgress(createGetOutboundCampaignProgressRequest(campaignId));
  }

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignProgress
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignProgress> getOutboundCampaignProgressWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignProgress(createGetOutboundCampaignProgressRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignProgressRequest createGetOutboundCampaignProgressRequest(String campaignId) {
    return GetOutboundCampaignProgressRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get campaign progress
   * 
   * @param request The request object
   * @return CampaignProgress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignProgress getOutboundCampaignProgress(GetOutboundCampaignProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignProgress> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignProgress>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get campaign progress
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignProgress> getOutboundCampaignProgress(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignProgress>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the remaining and total contact count for each skill combination in a skills campaign
   * 
   * @param campaignId Campaign ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return PagedSkillCombinationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PagedSkillCombinationListing getOutboundCampaignSkillcombinations(String campaignId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getOutboundCampaignSkillcombinations(createGetOutboundCampaignSkillcombinationsRequest(campaignId, pageNumber, pageSize));
  }

  /**
   * Get the remaining and total contact count for each skill combination in a skills campaign
   * 
   * @param campaignId Campaign ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return PagedSkillCombinationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PagedSkillCombinationListing> getOutboundCampaignSkillcombinationsWithHttpInfo(String campaignId, Integer pageNumber, Integer pageSize) throws IOException {
    return getOutboundCampaignSkillcombinations(createGetOutboundCampaignSkillcombinationsRequest(campaignId, pageNumber, pageSize).withHttpInfo());
  }

  private GetOutboundCampaignSkillcombinationsRequest createGetOutboundCampaignSkillcombinationsRequest(String campaignId, Integer pageNumber, Integer pageSize) {
    return GetOutboundCampaignSkillcombinationsRequest.builder()
            .withCampaignId(campaignId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get the remaining and total contact count for each skill combination in a skills campaign
   * 
   * @param request The request object
   * @return PagedSkillCombinationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PagedSkillCombinationListing getOutboundCampaignSkillcombinations(GetOutboundCampaignSkillcombinationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PagedSkillCombinationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PagedSkillCombinationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the remaining and total contact count for each skill combination in a skills campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PagedSkillCombinationListing> getOutboundCampaignSkillcombinations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PagedSkillCombinationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PagedSkillCombinationListing> response = (ApiResponse<PagedSkillCombinationListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PagedSkillCombinationListing> response = (ApiResponse<PagedSkillCombinationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignStats
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignStats getOutboundCampaignStats(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignStats(createGetOutboundCampaignStatsRequest(campaignId));
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignStats
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignStats> getOutboundCampaignStatsWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignStats(createGetOutboundCampaignStatsRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignStatsRequest createGetOutboundCampaignStatsRequest(String campaignId) {
    return GetOutboundCampaignStatsRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param request The request object
   * @return CampaignStats
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignStats getOutboundCampaignStats(GetOutboundCampaignStatsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignStats> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignStats>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignStats> getOutboundCampaignStats(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignStats>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignStats> response = (ApiResponse<CampaignStats>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignStats> response = (ApiResponse<CampaignStats>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule getOutboundCampaignrule(String campaignRuleId) throws IOException, ApiException {
    return  getOutboundCampaignrule(createGetOutboundCampaignruleRequest(campaignRuleId));
  }

  /**
   * Get Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return CampaignRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> getOutboundCampaignruleWithHttpInfo(String campaignRuleId) throws IOException {
    return getOutboundCampaignrule(createGetOutboundCampaignruleRequest(campaignRuleId).withHttpInfo());
  }

  private GetOutboundCampaignruleRequest createGetOutboundCampaignruleRequest(String campaignRuleId) {
    return GetOutboundCampaignruleRequest.builder()
            .withCampaignRuleId(campaignRuleId)

            .build();
  }

  /**
   * Get Campaign Rule
   * 
   * @param request The request object
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule getOutboundCampaignrule(GetOutboundCampaignruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> getOutboundCampaignrule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query Campaign Rule list
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignRuleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRuleEntityListing getOutboundCampaignrules(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCampaignrules(createGetOutboundCampaignrulesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query Campaign Rule list
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignRuleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRuleEntityListing> getOutboundCampaignrulesWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundCampaignrules(createGetOutboundCampaignrulesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCampaignrulesRequest createGetOutboundCampaignrulesRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundCampaignrulesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query Campaign Rule list
   * 
   * @param request The request object
   * @return CampaignRuleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRuleEntityListing getOutboundCampaignrules(GetOutboundCampaignrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRuleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRuleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query Campaign Rule list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRuleEntityListing> getOutboundCampaignrules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRuleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRuleEntityListing> response = (ApiResponse<CampaignRuleEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRuleEntityListing> response = (ApiResponse<CampaignRuleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param contactListId Contact List ID (optional)
   * @param dncListIds DNC list ID (optional)
   * @param distributionQueueId Distribution queue ID (optional)
   * @param edgeGroupId Edge group ID (optional)
   * @param callAnalysisResponseSetId Call analysis response set ID (optional)
   * @param divisionId Division ID(s) (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignEntityListing getOutboundCampaigns(Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String contactListId, String dncListIds, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, List<String> divisionId, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCampaigns(createGetOutboundCampaignsRequest(pageSize, pageNumber, filterType, name, id, contactListId, dncListIds, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, divisionId, sortBy, sortOrder));
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param contactListId Contact List ID (optional)
   * @param dncListIds DNC list ID (optional)
   * @param distributionQueueId Distribution queue ID (optional)
   * @param edgeGroupId Edge group ID (optional)
   * @param callAnalysisResponseSetId Call analysis response set ID (optional)
   * @param divisionId Division ID(s) (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignEntityListing> getOutboundCampaignsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String contactListId, String dncListIds, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, List<String> divisionId, String sortBy, String sortOrder) throws IOException {
    return getOutboundCampaigns(createGetOutboundCampaignsRequest(pageSize, pageNumber, filterType, name, id, contactListId, dncListIds, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, divisionId, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCampaignsRequest createGetOutboundCampaignsRequest(Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String contactListId, String dncListIds, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, List<String> divisionId, String sortBy, String sortOrder) {
    return GetOutboundCampaignsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withId(id)

            .withContactListId(contactListId)

            .withDncListIds(dncListIds)

            .withDistributionQueueId(distributionQueueId)

            .withEdgeGroupId(edgeGroupId)

            .withCallAnalysisResponseSetId(callAnalysisResponseSetId)

            .withDivisionId(divisionId)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param request The request object
   * @return CampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignEntityListing getOutboundCampaigns(GetOutboundCampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignEntityListing> getOutboundCampaigns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignEntityListing> response = (ApiResponse<CampaignEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignEntityListing> response = (ApiResponse<CampaignEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query across all types of campaigns by division
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id Campaign ID(s) (optional)
   * @param name Campaign name(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @param mediaType Media type(s) (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CommonCampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonCampaignEntityListing getOutboundCampaignsAll(Integer pageSize, Integer pageNumber, List<String> id, String name, List<String> divisionId, List<String> mediaType, String sortOrder) throws IOException, ApiException {
    return  getOutboundCampaignsAll(createGetOutboundCampaignsAllRequest(pageSize, pageNumber, id, name, divisionId, mediaType, sortOrder));
  }

  /**
   * Query across all types of campaigns by division
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id Campaign ID(s) (optional)
   * @param name Campaign name(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @param mediaType Media type(s) (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CommonCampaignEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonCampaignEntityListing> getOutboundCampaignsAllWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, String name, List<String> divisionId, List<String> mediaType, String sortOrder) throws IOException {
    return getOutboundCampaignsAll(createGetOutboundCampaignsAllRequest(pageSize, pageNumber, id, name, divisionId, mediaType, sortOrder).withHttpInfo());
  }

  private GetOutboundCampaignsAllRequest createGetOutboundCampaignsAllRequest(Integer pageSize, Integer pageNumber, List<String> id, String name, List<String> divisionId, List<String> mediaType, String sortOrder) {
    return GetOutboundCampaignsAllRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .withMediaType(mediaType)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query across all types of campaigns by division
   * 
   * @param request The request object
   * @return CommonCampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonCampaignEntityListing getOutboundCampaignsAll(GetOutboundCampaignsAllRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonCampaignEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonCampaignEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query across all types of campaigns by division
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonCampaignEntityListing> getOutboundCampaignsAll(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonCampaignEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonCampaignEntityListing> response = (ApiResponse<CommonCampaignEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CommonCampaignEntityListing> response = (ApiResponse<CommonCampaignEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query across all types of campaigns
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id Campaign ID(s) (optional)
   * @param name Campaign name(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @param mediaType Media type(s) (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CommonCampaignDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonCampaignDivisionViewEntityListing getOutboundCampaignsAllDivisionviews(Integer pageSize, Integer pageNumber, List<String> id, String name, List<String> divisionId, List<String> mediaType, String sortOrder) throws IOException, ApiException {
    return  getOutboundCampaignsAllDivisionviews(createGetOutboundCampaignsAllDivisionviewsRequest(pageSize, pageNumber, id, name, divisionId, mediaType, sortOrder));
  }

  /**
   * Query across all types of campaigns
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param id Campaign ID(s) (optional)
   * @param name Campaign name(s) (optional)
   * @param divisionId Division ID(s) (optional)
   * @param mediaType Media type(s) (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CommonCampaignDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonCampaignDivisionViewEntityListing> getOutboundCampaignsAllDivisionviewsWithHttpInfo(Integer pageSize, Integer pageNumber, List<String> id, String name, List<String> divisionId, List<String> mediaType, String sortOrder) throws IOException {
    return getOutboundCampaignsAllDivisionviews(createGetOutboundCampaignsAllDivisionviewsRequest(pageSize, pageNumber, id, name, divisionId, mediaType, sortOrder).withHttpInfo());
  }

  private GetOutboundCampaignsAllDivisionviewsRequest createGetOutboundCampaignsAllDivisionviewsRequest(Integer pageSize, Integer pageNumber, List<String> id, String name, List<String> divisionId, List<String> mediaType, String sortOrder) {
    return GetOutboundCampaignsAllDivisionviewsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .withMediaType(mediaType)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query across all types of campaigns
   * 
   * @param request The request object
   * @return CommonCampaignDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CommonCampaignDivisionViewEntityListing getOutboundCampaignsAllDivisionviews(GetOutboundCampaignsAllDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CommonCampaignDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CommonCampaignDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query across all types of campaigns
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CommonCampaignDivisionViewEntityListing> getOutboundCampaignsAllDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CommonCampaignDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CommonCampaignDivisionViewEntityListing> response = (ApiResponse<CommonCampaignDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CommonCampaignDivisionViewEntityListing> response = (ApiResponse<CommonCampaignDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a basic Campaign information object
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param campaignId Campaign ID (required)
   * @return CampaignDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDivisionView getOutboundCampaignsDivisionview(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignsDivisionview(createGetOutboundCampaignsDivisionviewRequest(campaignId));
  }

  /**
   * Get a basic Campaign information object
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param campaignId Campaign ID (required)
   * @return CampaignDivisionView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDivisionView> getOutboundCampaignsDivisionviewWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignsDivisionview(createGetOutboundCampaignsDivisionviewRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignsDivisionviewRequest createGetOutboundCampaignsDivisionviewRequest(String campaignId) {
    return GetOutboundCampaignsDivisionviewRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get a basic Campaign information object
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request The request object
   * @return CampaignDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDivisionView getOutboundCampaignsDivisionview(GetOutboundCampaignsDivisionviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignDivisionView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignDivisionView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a basic Campaign information object
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDivisionView> getOutboundCampaignsDivisionview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignDivisionView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignDivisionView> response = (ApiResponse<CampaignDivisionView>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignDivisionView> response = (ApiResponse<CampaignDivisionView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of basic Campaign information objects
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignDivisionViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDivisionViewListing getOutboundCampaignsDivisionviews(Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCampaignsDivisionviews(createGetOutboundCampaignsDivisionviewsRequest(pageSize, pageNumber, filterType, name, id, sortBy, sortOrder));
  }

  /**
   * Query a list of basic Campaign information objects
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignDivisionViewListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDivisionViewListing> getOutboundCampaignsDivisionviewsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String sortBy, String sortOrder) throws IOException {
    return getOutboundCampaignsDivisionviews(createGetOutboundCampaignsDivisionviewsRequest(pageSize, pageNumber, filterType, name, id, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCampaignsDivisionviewsRequest createGetOutboundCampaignsDivisionviewsRequest(Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String sortBy, String sortOrder) {
    return GetOutboundCampaignsDivisionviewsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withId(id)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of basic Campaign information objects
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request The request object
   * @return CampaignDivisionViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDivisionViewListing getOutboundCampaignsDivisionviews(GetOutboundCampaignsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignDivisionViewListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignDivisionViewListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of basic Campaign information objects
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDivisionViewListing> getOutboundCampaignsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignDivisionViewListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignDivisionViewListing> response = (ApiResponse<CampaignDivisionViewListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignDivisionViewListing> response = (ApiResponse<CampaignDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList getOutboundContactlist(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return  getOutboundContactlist(createGetOutboundContactlistRequest(contactListId, includeImportStatus, includeSize));
  }

  /**
   * Get a dialer contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> getOutboundContactlistWithHttpInfo(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException {
    return getOutboundContactlist(createGetOutboundContactlistRequest(contactListId, includeImportStatus, includeSize).withHttpInfo());
  }

  private GetOutboundContactlistRequest createGetOutboundContactlistRequest(String contactListId, Boolean includeImportStatus, Boolean includeSize) {
    return GetOutboundContactlistRequest.builder()
            .withContactListId(contactListId)

            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .build();
  }

  /**
   * Get a dialer contact list.
   * 
   * @param request The request object
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList getOutboundContactlist(GetOutboundContactlistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> getOutboundContactlist(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact getOutboundContactlistContact(String contactListId, String contactId) throws IOException, ApiException {
    return  getOutboundContactlistContact(createGetOutboundContactlistContactRequest(contactListId, contactId));
  }

  /**
   * Get a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return DialerContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> getOutboundContactlistContactWithHttpInfo(String contactListId, String contactId) throws IOException {
    return getOutboundContactlistContact(createGetOutboundContactlistContactRequest(contactListId, contactId).withHttpInfo());
  }

  private GetOutboundContactlistContactRequest createGetOutboundContactlistContactRequest(String contactListId, String contactId) {
    return GetOutboundContactlistContactRequest.builder()
            .withContactListId(contactListId)

            .withContactId(contactId)

            .build();
  }

  /**
   * Get a contact.
   * 
   * @param request The request object
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact getOutboundContactlistContact(GetOutboundContactlistContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DialerContact> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DialerContact>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> getOutboundContactlistContact(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DialerContact>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get bulk operation job.
   * 
   * @param contactListId Contact List ID (required)
   * @param jobId Job ID (required)
   * @return ContactsBulkOperationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJob getOutboundContactlistContactsBulkJob(String contactListId, String jobId) throws IOException, ApiException {
    return  getOutboundContactlistContactsBulkJob(createGetOutboundContactlistContactsBulkJobRequest(contactListId, jobId));
  }

  /**
   * Get bulk operation job.
   * 
   * @param contactListId Contact List ID (required)
   * @param jobId Job ID (required)
   * @return ContactsBulkOperationJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJob> getOutboundContactlistContactsBulkJobWithHttpInfo(String contactListId, String jobId) throws IOException {
    return getOutboundContactlistContactsBulkJob(createGetOutboundContactlistContactsBulkJobRequest(contactListId, jobId).withHttpInfo());
  }

  private GetOutboundContactlistContactsBulkJobRequest createGetOutboundContactlistContactsBulkJobRequest(String contactListId, String jobId) {
    return GetOutboundContactlistContactsBulkJobRequest.builder()
            .withContactListId(contactListId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get bulk operation job.
   * 
   * @param request The request object
   * @return ContactsBulkOperationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJob getOutboundContactlistContactsBulkJob(GetOutboundContactlistContactsBulkJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactsBulkOperationJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get bulk operation job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJob> getOutboundContactlistContactsBulkJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactsBulkOperationJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get 10 most recent bulk operation jobs associated with contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @return ContactsBulkOperationJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJobListing getOutboundContactlistContactsBulkJobs(String contactListId) throws IOException, ApiException {
    return  getOutboundContactlistContactsBulkJobs(createGetOutboundContactlistContactsBulkJobsRequest(contactListId));
  }

  /**
   * Get 10 most recent bulk operation jobs associated with contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @return ContactsBulkOperationJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJobListing> getOutboundContactlistContactsBulkJobsWithHttpInfo(String contactListId) throws IOException {
    return getOutboundContactlistContactsBulkJobs(createGetOutboundContactlistContactsBulkJobsRequest(contactListId).withHttpInfo());
  }

  private GetOutboundContactlistContactsBulkJobsRequest createGetOutboundContactlistContactsBulkJobsRequest(String contactListId) {
    return GetOutboundContactlistContactsBulkJobsRequest.builder()
            .withContactListId(contactListId)

            .build();
  }

  /**
   * Get 10 most recent bulk operation jobs associated with contact list.
   * 
   * @param request The request object
   * @return ContactsBulkOperationJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJobListing getOutboundContactlistContactsBulkJobs(GetOutboundContactlistContactsBulkJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactsBulkOperationJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get 10 most recent bulk operation jobs associated with contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJobListing> getOutboundContactlistContactsBulkJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactsBulkOperationJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJobListing> response = (ApiResponse<ContactsBulkOperationJobListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJobListing> response = (ApiResponse<ContactsBulkOperationJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param contactListId ContactList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundContactlistExport(String contactListId, String download) throws IOException, ApiException {
    return  getOutboundContactlistExport(createGetOutboundContactlistExportRequest(contactListId, download));
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param contactListId ContactList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundContactlistExportWithHttpInfo(String contactListId, String download) throws IOException {
    return getOutboundContactlistExport(createGetOutboundContactlistExportRequest(contactListId, download).withHttpInfo());
  }

  private GetOutboundContactlistExportRequest createGetOutboundContactlistExportRequest(String contactListId, String download) {
    return GetOutboundContactlistExportRequest.builder()
            .withContactListId(contactListId)

            .withDownload(download)

            .build();
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param request The request object
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundContactlistExport(GetOutboundContactlistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExportUri> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExportUri>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundContactlistExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExportUri>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundContactlistImportstatus(String contactListId) throws IOException, ApiException {
    return  getOutboundContactlistImportstatus(createGetOutboundContactlistImportstatusRequest(contactListId));
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return ImportStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundContactlistImportstatusWithHttpInfo(String contactListId) throws IOException {
    return getOutboundContactlistImportstatus(createGetOutboundContactlistImportstatusRequest(contactListId).withHttpInfo());
  }

  private GetOutboundContactlistImportstatusRequest createGetOutboundContactlistImportstatusRequest(String contactListId) {
    return GetOutboundContactlistImportstatusRequest.builder()
            .withContactListId(contactListId)

            .build();
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param request The request object
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundContactlistImportstatus(GetOutboundContactlistImportstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundContactlistImportstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Preview the result of applying Automatic Time Zone Mapping to a contact list
   * 
   * @param contactListId ContactList ID (required)
   * @return TimeZoneMappingPreview
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeZoneMappingPreview getOutboundContactlistTimezonemappingpreview(String contactListId) throws IOException, ApiException {
    return  getOutboundContactlistTimezonemappingpreview(createGetOutboundContactlistTimezonemappingpreviewRequest(contactListId));
  }

  /**
   * Preview the result of applying Automatic Time Zone Mapping to a contact list
   * 
   * @param contactListId ContactList ID (required)
   * @return TimeZoneMappingPreview
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeZoneMappingPreview> getOutboundContactlistTimezonemappingpreviewWithHttpInfo(String contactListId) throws IOException {
    return getOutboundContactlistTimezonemappingpreview(createGetOutboundContactlistTimezonemappingpreviewRequest(contactListId).withHttpInfo());
  }

  private GetOutboundContactlistTimezonemappingpreviewRequest createGetOutboundContactlistTimezonemappingpreviewRequest(String contactListId) {
    return GetOutboundContactlistTimezonemappingpreviewRequest.builder()
            .withContactListId(contactListId)

            .build();
  }

  /**
   * Preview the result of applying Automatic Time Zone Mapping to a contact list
   * 
   * @param request The request object
   * @return TimeZoneMappingPreview
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeZoneMappingPreview getOutboundContactlistTimezonemappingpreview(GetOutboundContactlistTimezonemappingpreviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeZoneMappingPreview> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeZoneMappingPreview>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Preview the result of applying Automatic Time Zone Mapping to a contact list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeZoneMappingPreview> getOutboundContactlistTimezonemappingpreview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeZoneMappingPreview>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeZoneMappingPreview> response = (ApiResponse<TimeZoneMappingPreview>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeZoneMappingPreview> response = (ApiResponse<TimeZoneMappingPreview>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Contact list filter
   * 
   * @param contactListFilterId Contact List Filter ID (required)
   * @return ContactListFilter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilter getOutboundContactlistfilter(String contactListFilterId) throws IOException, ApiException {
    return  getOutboundContactlistfilter(createGetOutboundContactlistfilterRequest(contactListFilterId));
  }

  /**
   * Get Contact list filter
   * 
   * @param contactListFilterId Contact List Filter ID (required)
   * @return ContactListFilter
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilter> getOutboundContactlistfilterWithHttpInfo(String contactListFilterId) throws IOException {
    return getOutboundContactlistfilter(createGetOutboundContactlistfilterRequest(contactListFilterId).withHttpInfo());
  }

  private GetOutboundContactlistfilterRequest createGetOutboundContactlistfilterRequest(String contactListFilterId) {
    return GetOutboundContactlistfilterRequest.builder()
            .withContactListFilterId(contactListFilterId)

            .build();
  }

  /**
   * Get Contact list filter
   * 
   * @param request The request object
   * @return ContactListFilter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilter getOutboundContactlistfilter(GetOutboundContactlistfilterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListFilter> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListFilter>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Contact list filter
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilter> getOutboundContactlistfilter(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListFilter>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query Contact list filters
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @param contactListId Contact List ID (optional)
   * @return ContactListFilterEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilterEntityListing getOutboundContactlistfilters(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder, String contactListId) throws IOException, ApiException {
    return  getOutboundContactlistfilters(createGetOutboundContactlistfiltersRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder, contactListId));
  }

  /**
   * Query Contact list filters
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @param contactListId Contact List ID (optional)
   * @return ContactListFilterEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilterEntityListing> getOutboundContactlistfiltersWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder, String contactListId) throws IOException {
    return getOutboundContactlistfilters(createGetOutboundContactlistfiltersRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder, contactListId).withHttpInfo());
  }

  private GetOutboundContactlistfiltersRequest createGetOutboundContactlistfiltersRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder, String contactListId) {
    return GetOutboundContactlistfiltersRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withContactListId(contactListId)

            .build();
  }

  /**
   * Query Contact list filters
   * 
   * @param request The request object
   * @return ContactListFilterEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilterEntityListing getOutboundContactlistfilters(GetOutboundContactlistfiltersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListFilterEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListFilterEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query Contact list filters
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilterEntityListing> getOutboundContactlistfilters(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListFilterEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of contact lists.
   * 
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param divisionId Division ID(s) (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListEntityListing getOutboundContactlists(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, List<String> id, List<String> divisionId, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundContactlists(createGetOutboundContactlistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, allowEmptyResult, filterType, name, id, divisionId, sortBy, sortOrder));
  }

  /**
   * Query a list of contact lists.
   * 
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param divisionId Division ID(s) (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListEntityListing> getOutboundContactlistsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, List<String> id, List<String> divisionId, String sortBy, String sortOrder) throws IOException {
    return getOutboundContactlists(createGetOutboundContactlistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, allowEmptyResult, filterType, name, id, divisionId, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundContactlistsRequest createGetOutboundContactlistsRequest(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, List<String> id, List<String> divisionId, String sortBy, String sortOrder) {
    return GetOutboundContactlistsRequest.builder()
            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withId(id)

            .withDivisionId(divisionId)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of contact lists.
   * 
   * @param request The request object
   * @return ContactListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListEntityListing getOutboundContactlists(GetOutboundContactlistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of contact lists.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListEntityListing> getOutboundContactlists(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListEntityListing> response = (ApiResponse<ContactListEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListEntityListing> response = (ApiResponse<ContactListEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a basic ContactList information object
   * This returns a simplified version of a ContactList, consisting of the name, division, column names, phone columns, import status, and size.
   * @param contactListId Contactlist ID (required)
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactListDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListDivisionView getOutboundContactlistsDivisionview(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return  getOutboundContactlistsDivisionview(createGetOutboundContactlistsDivisionviewRequest(contactListId, includeImportStatus, includeSize));
  }

  /**
   * Get a basic ContactList information object
   * This returns a simplified version of a ContactList, consisting of the name, division, column names, phone columns, import status, and size.
   * @param contactListId Contactlist ID (required)
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactListDivisionView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListDivisionView> getOutboundContactlistsDivisionviewWithHttpInfo(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException {
    return getOutboundContactlistsDivisionview(createGetOutboundContactlistsDivisionviewRequest(contactListId, includeImportStatus, includeSize).withHttpInfo());
  }

  private GetOutboundContactlistsDivisionviewRequest createGetOutboundContactlistsDivisionviewRequest(String contactListId, Boolean includeImportStatus, Boolean includeSize) {
    return GetOutboundContactlistsDivisionviewRequest.builder()
            .withContactListId(contactListId)

            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .build();
  }

  /**
   * Get a basic ContactList information object
   * This returns a simplified version of a ContactList, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request The request object
   * @return ContactListDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListDivisionView getOutboundContactlistsDivisionview(GetOutboundContactlistsDivisionviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListDivisionView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListDivisionView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a basic ContactList information object
   * This returns a simplified version of a ContactList, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListDivisionView> getOutboundContactlistsDivisionview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListDivisionView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListDivisionView> response = (ApiResponse<ContactListDivisionView>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListDivisionView> response = (ApiResponse<ContactListDivisionView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of simplified contact list objects.
   * This return a simplified version of contact lists, consisting of the name, division, column names, phone columns, import status, and size.
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListDivisionViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListDivisionViewListing getOutboundContactlistsDivisionviews(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundContactlistsDivisionviews(createGetOutboundContactlistsDivisionviewsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, id, sortBy, sortOrder));
  }

  /**
   * Query a list of simplified contact list objects.
   * This return a simplified version of contact lists, consisting of the name, division, column names, phone columns, import status, and size.
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param id id (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListDivisionViewListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListDivisionViewListing> getOutboundContactlistsDivisionviewsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String sortBy, String sortOrder) throws IOException {
    return getOutboundContactlistsDivisionviews(createGetOutboundContactlistsDivisionviewsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, id, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundContactlistsDivisionviewsRequest createGetOutboundContactlistsDivisionviewsRequest(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, List<String> id, String sortBy, String sortOrder) {
    return GetOutboundContactlistsDivisionviewsRequest.builder()
            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withId(id)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of simplified contact list objects.
   * This return a simplified version of contact lists, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request The request object
   * @return ContactListDivisionViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListDivisionViewListing getOutboundContactlistsDivisionviews(GetOutboundContactlistsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListDivisionViewListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListDivisionViewListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of simplified contact list objects.
   * This return a simplified version of contact lists, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListDivisionViewListing> getOutboundContactlistsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListDivisionViewListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListDivisionViewListing> response = (ApiResponse<ContactListDivisionViewListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListDivisionViewListing> response = (ApiResponse<ContactListDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Contact List Template
   * 
   * @param contactListTemplateId ContactListTemplate ID (required)
   * @return ContactListTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplate getOutboundContactlisttemplate(String contactListTemplateId) throws IOException, ApiException {
    return  getOutboundContactlisttemplate(createGetOutboundContactlisttemplateRequest(contactListTemplateId));
  }

  /**
   * Get Contact List Template
   * 
   * @param contactListTemplateId ContactListTemplate ID (required)
   * @return ContactListTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplate> getOutboundContactlisttemplateWithHttpInfo(String contactListTemplateId) throws IOException {
    return getOutboundContactlisttemplate(createGetOutboundContactlisttemplateRequest(contactListTemplateId).withHttpInfo());
  }

  private GetOutboundContactlisttemplateRequest createGetOutboundContactlisttemplateRequest(String contactListTemplateId) {
    return GetOutboundContactlisttemplateRequest.builder()
            .withContactListTemplateId(contactListTemplateId)

            .build();
  }

  /**
   * Get Contact List Template
   * 
   * @param request The request object
   * @return ContactListTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplate getOutboundContactlisttemplate(GetOutboundContactlisttemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Contact List Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplate> getOutboundContactlisttemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of contact list templates
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplateEntityListing getOutboundContactlisttemplates(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundContactlisttemplates(createGetOutboundContactlisttemplatesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of contact list templates
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListTemplateEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplateEntityListing> getOutboundContactlisttemplatesWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundContactlisttemplates(createGetOutboundContactlisttemplatesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundContactlisttemplatesRequest createGetOutboundContactlisttemplatesRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundContactlisttemplatesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of contact list templates
   * 
   * @param request The request object
   * @return ContactListTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplateEntityListing getOutboundContactlisttemplates(GetOutboundContactlisttemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListTemplateEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListTemplateEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of contact list templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplateEntityListing> getOutboundContactlisttemplates(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListTemplateEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an Outbound Digital Rule Set
   * 
   * @param digitalRuleSetId The Digital Rule Set ID (required)
   * @return DigitalRuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSet getOutboundDigitalruleset(String digitalRuleSetId) throws IOException, ApiException {
    return  getOutboundDigitalruleset(createGetOutboundDigitalrulesetRequest(digitalRuleSetId));
  }

  /**
   * Get an Outbound Digital Rule Set
   * 
   * @param digitalRuleSetId The Digital Rule Set ID (required)
   * @return DigitalRuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSet> getOutboundDigitalrulesetWithHttpInfo(String digitalRuleSetId) throws IOException {
    return getOutboundDigitalruleset(createGetOutboundDigitalrulesetRequest(digitalRuleSetId).withHttpInfo());
  }

  private GetOutboundDigitalrulesetRequest createGetOutboundDigitalrulesetRequest(String digitalRuleSetId) {
    return GetOutboundDigitalrulesetRequest.builder()
            .withDigitalRuleSetId(digitalRuleSetId)

            .build();
  }

  /**
   * Get an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @return DigitalRuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSet getOutboundDigitalruleset(GetOutboundDigitalrulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DigitalRuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DigitalRuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSet> getOutboundDigitalruleset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DigitalRuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of Outbound Digital Rule Sets
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy The field to sort by (optional, default to name)
   * @param sortOrder The direction to sort (optional, default to ascending)
   * @param name Name (optional)
   * @param id A list of digital rule set ids to bulk fetch (optional)
   * @return DigitalRuleSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSetEntityListing getOutboundDigitalrulesets(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id) throws IOException, ApiException {
    return  getOutboundDigitalrulesets(createGetOutboundDigitalrulesetsRequest(pageSize, pageNumber, sortBy, sortOrder, name, id));
  }

  /**
   * Query a list of Outbound Digital Rule Sets
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy The field to sort by (optional, default to name)
   * @param sortOrder The direction to sort (optional, default to ascending)
   * @param name Name (optional)
   * @param id A list of digital rule set ids to bulk fetch (optional)
   * @return DigitalRuleSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSetEntityListing> getOutboundDigitalrulesetsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id) throws IOException {
    return getOutboundDigitalrulesets(createGetOutboundDigitalrulesetsRequest(pageSize, pageNumber, sortBy, sortOrder, name, id).withHttpInfo());
  }

  private GetOutboundDigitalrulesetsRequest createGetOutboundDigitalrulesetsRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, List<String> id) {
    return GetOutboundDigitalrulesetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withId(id)

            .build();
  }

  /**
   * Query a list of Outbound Digital Rule Sets
   * 
   * @param request The request object
   * @return DigitalRuleSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSetEntityListing getOutboundDigitalrulesets(GetOutboundDigitalrulesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DigitalRuleSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DigitalRuleSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of Outbound Digital Rule Sets
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSetEntityListing> getOutboundDigitalrulesets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DigitalRuleSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSetEntityListing> response = (ApiResponse<DigitalRuleSetEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSetEntityListing> response = (ApiResponse<DigitalRuleSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList getOutboundDnclist(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return  getOutboundDnclist(createGetOutboundDnclistRequest(dncListId, includeImportStatus, includeSize));
  }

  /**
   * Get dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> getOutboundDnclistWithHttpInfo(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException {
    return getOutboundDnclist(createGetOutboundDnclistRequest(dncListId, includeImportStatus, includeSize).withHttpInfo());
  }

  private GetOutboundDnclistRequest createGetOutboundDnclistRequest(String dncListId, Boolean includeImportStatus, Boolean includeSize) {
    return GetOutboundDnclistRequest.builder()
            .withDncListId(dncListId)

            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .build();
  }

  /**
   * Get dialer DNC list
   * 
   * @param request The request object
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList getOutboundDnclist(GetOutboundDnclistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> getOutboundDnclist(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param dncListId DncList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundDnclistExport(String dncListId, String download) throws IOException, ApiException {
    return  getOutboundDnclistExport(createGetOutboundDnclistExportRequest(dncListId, download));
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param dncListId DncList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundDnclistExportWithHttpInfo(String dncListId, String download) throws IOException {
    return getOutboundDnclistExport(createGetOutboundDnclistExportRequest(dncListId, download).withHttpInfo());
  }

  private GetOutboundDnclistExportRequest createGetOutboundDnclistExportRequest(String dncListId, String download) {
    return GetOutboundDnclistExportRequest.builder()
            .withDncListId(dncListId)

            .withDownload(download)

            .build();
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param request The request object
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundDnclistExport(GetOutboundDnclistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExportUri> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExportUri>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundDnclistExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExportUri>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundDnclistImportstatus(String dncListId) throws IOException, ApiException {
    return  getOutboundDnclistImportstatus(createGetOutboundDnclistImportstatusRequest(dncListId));
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return ImportStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundDnclistImportstatusWithHttpInfo(String dncListId) throws IOException {
    return getOutboundDnclistImportstatus(createGetOutboundDnclistImportstatusRequest(dncListId).withHttpInfo());
  }

  private GetOutboundDnclistImportstatusRequest createGetOutboundDnclistImportstatusRequest(String dncListId) {
    return GetOutboundDnclistImportstatusRequest.builder()
            .withDncListId(dncListId)

            .build();
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param request The request object
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundDnclistImportstatus(GetOutboundDnclistImportstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundDnclistImportstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query dialer DNC lists
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param dncSourceType DncSourceType (optional)
   * @param divisionId Division ID(s) (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional)
   * @return DncListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListEntityListing getOutboundDnclists(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String dncSourceType, List<String> divisionId, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundDnclists(createGetOutboundDnclistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, allowEmptyResult, filterType, name, dncSourceType, divisionId, sortBy, sortOrder));
  }

  /**
   * Query dialer DNC lists
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param dncSourceType DncSourceType (optional)
   * @param divisionId Division ID(s) (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional)
   * @return DncListEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListEntityListing> getOutboundDnclistsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String dncSourceType, List<String> divisionId, String sortBy, String sortOrder) throws IOException {
    return getOutboundDnclists(createGetOutboundDnclistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, allowEmptyResult, filterType, name, dncSourceType, divisionId, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundDnclistsRequest createGetOutboundDnclistsRequest(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String dncSourceType, List<String> divisionId, String sortBy, String sortOrder) {
    return GetOutboundDnclistsRequest.builder()
            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withDncSourceType(dncSourceType)

            .withDivisionId(divisionId)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query dialer DNC lists
   * 
   * @param request The request object
   * @return DncListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListEntityListing getOutboundDnclists(GetOutboundDnclistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncListEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncListEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query dialer DNC lists
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListEntityListing> getOutboundDnclists(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncListEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncListEntityListing> response = (ApiResponse<DncListEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DncListEntityListing> response = (ApiResponse<DncListEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a basic DncList information object
   * This returns a simplified version of a DncList, consisting of the name, division, import status, and size.
   * @param dncListId Dnclist ID (required)
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncListDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListDivisionView getOutboundDnclistsDivisionview(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return  getOutboundDnclistsDivisionview(createGetOutboundDnclistsDivisionviewRequest(dncListId, includeImportStatus, includeSize));
  }

  /**
   * Get a basic DncList information object
   * This returns a simplified version of a DncList, consisting of the name, division, import status, and size.
   * @param dncListId Dnclist ID (required)
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncListDivisionView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListDivisionView> getOutboundDnclistsDivisionviewWithHttpInfo(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException {
    return getOutboundDnclistsDivisionview(createGetOutboundDnclistsDivisionviewRequest(dncListId, includeImportStatus, includeSize).withHttpInfo());
  }

  private GetOutboundDnclistsDivisionviewRequest createGetOutboundDnclistsDivisionviewRequest(String dncListId, Boolean includeImportStatus, Boolean includeSize) {
    return GetOutboundDnclistsDivisionviewRequest.builder()
            .withDncListId(dncListId)

            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .build();
  }

  /**
   * Get a basic DncList information object
   * This returns a simplified version of a DncList, consisting of the name, division, import status, and size.
   * @param request The request object
   * @return DncListDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListDivisionView getOutboundDnclistsDivisionview(GetOutboundDnclistsDivisionviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncListDivisionView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncListDivisionView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a basic DncList information object
   * This returns a simplified version of a DncList, consisting of the name, division, import status, and size.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListDivisionView> getOutboundDnclistsDivisionview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncListDivisionView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncListDivisionView> response = (ApiResponse<DncListDivisionView>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DncListDivisionView> response = (ApiResponse<DncListDivisionView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of simplified dnc list objects.
   * This return a simplified version of dnc lists, consisting of the name, division, import status, and size.
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param dncSourceType DncSourceType (optional)
   * @param id id (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return DncListDivisionViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListDivisionViewListing getOutboundDnclistsDivisionviews(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String dncSourceType, List<String> id, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundDnclistsDivisionviews(createGetOutboundDnclistsDivisionviewsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, dncSourceType, id, sortBy, sortOrder));
  }

  /**
   * Query a list of simplified dnc list objects.
   * This return a simplified version of dnc lists, consisting of the name, division, import status, and size.
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param dncSourceType DncSourceType (optional)
   * @param id id (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return DncListDivisionViewListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListDivisionViewListing> getOutboundDnclistsDivisionviewsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String dncSourceType, List<String> id, String sortBy, String sortOrder) throws IOException {
    return getOutboundDnclistsDivisionviews(createGetOutboundDnclistsDivisionviewsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, dncSourceType, id, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundDnclistsDivisionviewsRequest createGetOutboundDnclistsDivisionviewsRequest(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String dncSourceType, List<String> id, String sortBy, String sortOrder) {
    return GetOutboundDnclistsDivisionviewsRequest.builder()
            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withDncSourceType(dncSourceType)

            .withId(id)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of simplified dnc list objects.
   * This return a simplified version of dnc lists, consisting of the name, division, import status, and size.
   * @param request The request object
   * @return DncListDivisionViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListDivisionViewListing getOutboundDnclistsDivisionviews(GetOutboundDnclistsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncListDivisionViewListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncListDivisionViewListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of simplified dnc list objects.
   * This return a simplified version of dnc lists, consisting of the name, division, import status, and size.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListDivisionViewListing> getOutboundDnclistsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncListDivisionViewListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncListDivisionViewListing> response = (ApiResponse<DncListDivisionViewListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DncListDivisionViewListing> response = (ApiResponse<DncListDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Dialer Event
   * 
   * @param eventId Event Log ID (required)
   * @return EventLog
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventLog getOutboundEvent(String eventId) throws IOException, ApiException {
    return  getOutboundEvent(createGetOutboundEventRequest(eventId));
  }

  /**
   * Get Dialer Event
   * 
   * @param eventId Event Log ID (required)
   * @return EventLog
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventLog> getOutboundEventWithHttpInfo(String eventId) throws IOException {
    return getOutboundEvent(createGetOutboundEventRequest(eventId).withHttpInfo());
  }

  private GetOutboundEventRequest createGetOutboundEventRequest(String eventId) {
    return GetOutboundEventRequest.builder()
            .withEventId(eventId)

            .build();
  }

  /**
   * Get Dialer Event
   * 
   * @param request The request object
   * @return EventLog
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventLog getOutboundEvent(GetOutboundEventRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EventLog> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EventLog>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Dialer Event
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventLog> getOutboundEvent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EventLog>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EventLog> response = (ApiResponse<EventLog>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EventLog> response = (ApiResponse<EventLog>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query Event Logs
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param category Category (optional)
   * @param level Level (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return DialerEventEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerEventEntityListing getOutboundEvents(Integer pageSize, Integer pageNumber, String filterType, String category, String level, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundEvents(createGetOutboundEventsRequest(pageSize, pageNumber, filterType, category, level, sortBy, sortOrder));
  }

  /**
   * Query Event Logs
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param category Category (optional)
   * @param level Level (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return DialerEventEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerEventEntityListing> getOutboundEventsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String category, String level, String sortBy, String sortOrder) throws IOException {
    return getOutboundEvents(createGetOutboundEventsRequest(pageSize, pageNumber, filterType, category, level, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundEventsRequest createGetOutboundEventsRequest(Integer pageSize, Integer pageNumber, String filterType, String category, String level, String sortBy, String sortOrder) {
    return GetOutboundEventsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withCategory(category)

            .withLevel(level)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query Event Logs
   * 
   * @param request The request object
   * @return DialerEventEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerEventEntityListing getOutboundEvents(GetOutboundEventsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DialerEventEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DialerEventEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query Event Logs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerEventEntityListing> getOutboundEvents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DialerEventEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DialerEventEntityListing> response = (ApiResponse<DialerEventEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DialerEventEntityListing> response = (ApiResponse<DialerEventEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get File Specification Template
   * 
   * @param fileSpecificationTemplateId File Specification Template ID (required)
   * @return FileSpecificationTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplate getOutboundFilespecificationtemplate(String fileSpecificationTemplateId) throws IOException, ApiException {
    return  getOutboundFilespecificationtemplate(createGetOutboundFilespecificationtemplateRequest(fileSpecificationTemplateId));
  }

  /**
   * Get File Specification Template
   * 
   * @param fileSpecificationTemplateId File Specification Template ID (required)
   * @return FileSpecificationTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplate> getOutboundFilespecificationtemplateWithHttpInfo(String fileSpecificationTemplateId) throws IOException {
    return getOutboundFilespecificationtemplate(createGetOutboundFilespecificationtemplateRequest(fileSpecificationTemplateId).withHttpInfo());
  }

  private GetOutboundFilespecificationtemplateRequest createGetOutboundFilespecificationtemplateRequest(String fileSpecificationTemplateId) {
    return GetOutboundFilespecificationtemplateRequest.builder()
            .withFileSpecificationTemplateId(fileSpecificationTemplateId)

            .build();
  }

  /**
   * Get File Specification Template
   * 
   * @param request The request object
   * @return FileSpecificationTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplate getOutboundFilespecificationtemplate(GetOutboundFilespecificationtemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FileSpecificationTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FileSpecificationTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get File Specification Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplate> getOutboundFilespecificationtemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FileSpecificationTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query File Specification Templates
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return FileSpecificationTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplateEntityListing getOutboundFilespecificationtemplates(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundFilespecificationtemplates(createGetOutboundFilespecificationtemplatesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query File Specification Templates
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return FileSpecificationTemplateEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplateEntityListing> getOutboundFilespecificationtemplatesWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundFilespecificationtemplates(createGetOutboundFilespecificationtemplatesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundFilespecificationtemplatesRequest createGetOutboundFilespecificationtemplatesRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundFilespecificationtemplatesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query File Specification Templates
   * 
   * @param request The request object
   * @return FileSpecificationTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplateEntityListing getOutboundFilespecificationtemplates(GetOutboundFilespecificationtemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FileSpecificationTemplateEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FileSpecificationTemplateEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query File Specification Templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplateEntityListing> getOutboundFilespecificationtemplates(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FileSpecificationTemplateEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplateEntityListing> response = (ApiResponse<FileSpecificationTemplateEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplateEntityListing> response = (ApiResponse<FileSpecificationTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Import Template
   * 
   * @param importTemplateId Import Template ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @return ImportTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplate getOutboundImporttemplate(String importTemplateId, Boolean includeImportStatus) throws IOException, ApiException {
    return  getOutboundImporttemplate(createGetOutboundImporttemplateRequest(importTemplateId, includeImportStatus));
  }

  /**
   * Get Import Template
   * 
   * @param importTemplateId Import Template ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @return ImportTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplate> getOutboundImporttemplateWithHttpInfo(String importTemplateId, Boolean includeImportStatus) throws IOException {
    return getOutboundImporttemplate(createGetOutboundImporttemplateRequest(importTemplateId, includeImportStatus).withHttpInfo());
  }

  private GetOutboundImporttemplateRequest createGetOutboundImporttemplateRequest(String importTemplateId, Boolean includeImportStatus) {
    return GetOutboundImporttemplateRequest.builder()
            .withImportTemplateId(importTemplateId)

            .withIncludeImportStatus(includeImportStatus)

            .build();
  }

  /**
   * Get Import Template
   * 
   * @param request The request object
   * @return ImportTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplate getOutboundImporttemplate(GetOutboundImporttemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Import Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplate> getOutboundImporttemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the import status for an import template.
   * 
   * @param importTemplateId importTemplateId (required)
   * @param listNamePrefix listNamePrefix (optional)
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundImporttemplateImportstatus(String importTemplateId, String listNamePrefix) throws IOException, ApiException {
    return  getOutboundImporttemplateImportstatus(createGetOutboundImporttemplateImportstatusRequest(importTemplateId, listNamePrefix));
  }

  /**
   * Get the import status for an import template.
   * 
   * @param importTemplateId importTemplateId (required)
   * @param listNamePrefix listNamePrefix (optional)
   * @return ImportStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundImporttemplateImportstatusWithHttpInfo(String importTemplateId, String listNamePrefix) throws IOException {
    return getOutboundImporttemplateImportstatus(createGetOutboundImporttemplateImportstatusRequest(importTemplateId, listNamePrefix).withHttpInfo());
  }

  private GetOutboundImporttemplateImportstatusRequest createGetOutboundImporttemplateImportstatusRequest(String importTemplateId, String listNamePrefix) {
    return GetOutboundImporttemplateImportstatusRequest.builder()
            .withImportTemplateId(importTemplateId)

            .withListNamePrefix(listNamePrefix)

            .build();
  }

  /**
   * Get the import status for an import template.
   * 
   * @param request The request object
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundImporttemplateImportstatus(GetOutboundImporttemplateImportstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the import status for an import template.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundImporttemplateImportstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query Import Templates
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @param contactListTemplateId Contact List Template ID (optional)
   * @return ImportTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplateEntityListing getOutboundImporttemplates(Boolean includeImportStatus, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder, String contactListTemplateId) throws IOException, ApiException {
    return  getOutboundImporttemplates(createGetOutboundImporttemplatesRequest(includeImportStatus, pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder, contactListTemplateId));
  }

  /**
   * Query Import Templates
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @param contactListTemplateId Contact List Template ID (optional)
   * @return ImportTemplateEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplateEntityListing> getOutboundImporttemplatesWithHttpInfo(Boolean includeImportStatus, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder, String contactListTemplateId) throws IOException {
    return getOutboundImporttemplates(createGetOutboundImporttemplatesRequest(includeImportStatus, pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder, contactListTemplateId).withHttpInfo());
  }

  private GetOutboundImporttemplatesRequest createGetOutboundImporttemplatesRequest(Boolean includeImportStatus, Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder, String contactListTemplateId) {
    return GetOutboundImporttemplatesRequest.builder()
            .withIncludeImportStatus(includeImportStatus)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withContactListTemplateId(contactListTemplateId)

            .build();
  }

  /**
   * Query Import Templates
   * 
   * @param request The request object
   * @return ImportTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplateEntityListing getOutboundImporttemplates(GetOutboundImporttemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportTemplateEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportTemplateEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query Import Templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplateEntityListing> getOutboundImporttemplates(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportTemplateEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an Outbound Messaging Campaign
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign getOutboundMessagingcampaign(String messagingCampaignId) throws IOException, ApiException {
    return  getOutboundMessagingcampaign(createGetOutboundMessagingcampaignRequest(messagingCampaignId));
  }

  /**
   * Get an Outbound Messaging Campaign
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> getOutboundMessagingcampaignWithHttpInfo(String messagingCampaignId) throws IOException {
    return getOutboundMessagingcampaign(createGetOutboundMessagingcampaignRequest(messagingCampaignId).withHttpInfo());
  }

  private GetOutboundMessagingcampaignRequest createGetOutboundMessagingcampaignRequest(String messagingCampaignId) {
    return GetOutboundMessagingcampaignRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Get an Outbound Messaging Campaign
   * 
   * @param request The request object
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign getOutboundMessagingcampaign(GetOutboundMessagingcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Outbound Messaging Campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> getOutboundMessagingcampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get messaging campaign diagnostics
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaignDiagnostics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignDiagnostics getOutboundMessagingcampaignDiagnostics(String messagingCampaignId) throws IOException, ApiException {
    return  getOutboundMessagingcampaignDiagnostics(createGetOutboundMessagingcampaignDiagnosticsRequest(messagingCampaignId));
  }

  /**
   * Get messaging campaign diagnostics
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaignDiagnostics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignDiagnostics> getOutboundMessagingcampaignDiagnosticsWithHttpInfo(String messagingCampaignId) throws IOException {
    return getOutboundMessagingcampaignDiagnostics(createGetOutboundMessagingcampaignDiagnosticsRequest(messagingCampaignId).withHttpInfo());
  }

  private GetOutboundMessagingcampaignDiagnosticsRequest createGetOutboundMessagingcampaignDiagnosticsRequest(String messagingCampaignId) {
    return GetOutboundMessagingcampaignDiagnosticsRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Get messaging campaign diagnostics
   * 
   * @param request The request object
   * @return MessagingCampaignDiagnostics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignDiagnostics getOutboundMessagingcampaignDiagnostics(GetOutboundMessagingcampaignDiagnosticsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaignDiagnostics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaignDiagnostics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get messaging campaign diagnostics
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignDiagnostics> getOutboundMessagingcampaignDiagnostics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaignDiagnostics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignDiagnostics> response = (ApiResponse<MessagingCampaignDiagnostics>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignDiagnostics> response = (ApiResponse<MessagingCampaignDiagnostics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get messaging campaign's progress
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return CampaignProgress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignProgress getOutboundMessagingcampaignProgress(String messagingCampaignId) throws IOException, ApiException {
    return  getOutboundMessagingcampaignProgress(createGetOutboundMessagingcampaignProgressRequest(messagingCampaignId));
  }

  /**
   * Get messaging campaign's progress
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return CampaignProgress
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignProgress> getOutboundMessagingcampaignProgressWithHttpInfo(String messagingCampaignId) throws IOException {
    return getOutboundMessagingcampaignProgress(createGetOutboundMessagingcampaignProgressRequest(messagingCampaignId).withHttpInfo());
  }

  private GetOutboundMessagingcampaignProgressRequest createGetOutboundMessagingcampaignProgressRequest(String messagingCampaignId) {
    return GetOutboundMessagingcampaignProgressRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Get messaging campaign's progress
   * 
   * @param request The request object
   * @return CampaignProgress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignProgress getOutboundMessagingcampaignProgress(GetOutboundMessagingcampaignProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignProgress> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignProgress>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get messaging campaign's progress
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignProgress> getOutboundMessagingcampaignProgress(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignProgress>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of Messaging Campaigns
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy The field to sort by (optional, default to name)
   * @param sortOrder The direction to sort (optional, default to ascending)
   * @param name Name (optional)
   * @param contactListId Contact List ID (optional)
   * @param divisionId Division ID(s) (optional)
   * @param type Campaign Type (optional)
   * @param senderSmsPhoneNumber Sender SMS Phone Number (optional)
   * @param id A list of messaging campaign ids to bulk fetch (optional)
   * @param contentTemplateId Content template ID (optional)
   * @param campaignStatus Campaign Status (optional)
   * @return MessagingCampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignEntityListing getOutboundMessagingcampaigns(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String contactListId, List<String> divisionId, String type, String senderSmsPhoneNumber, List<String> id, String contentTemplateId, String campaignStatus) throws IOException, ApiException {
    return  getOutboundMessagingcampaigns(createGetOutboundMessagingcampaignsRequest(pageSize, pageNumber, sortBy, sortOrder, name, contactListId, divisionId, type, senderSmsPhoneNumber, id, contentTemplateId, campaignStatus));
  }

  /**
   * Query a list of Messaging Campaigns
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy The field to sort by (optional, default to name)
   * @param sortOrder The direction to sort (optional, default to ascending)
   * @param name Name (optional)
   * @param contactListId Contact List ID (optional)
   * @param divisionId Division ID(s) (optional)
   * @param type Campaign Type (optional)
   * @param senderSmsPhoneNumber Sender SMS Phone Number (optional)
   * @param id A list of messaging campaign ids to bulk fetch (optional)
   * @param contentTemplateId Content template ID (optional)
   * @param campaignStatus Campaign Status (optional)
   * @return MessagingCampaignEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignEntityListing> getOutboundMessagingcampaignsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String contactListId, List<String> divisionId, String type, String senderSmsPhoneNumber, List<String> id, String contentTemplateId, String campaignStatus) throws IOException {
    return getOutboundMessagingcampaigns(createGetOutboundMessagingcampaignsRequest(pageSize, pageNumber, sortBy, sortOrder, name, contactListId, divisionId, type, senderSmsPhoneNumber, id, contentTemplateId, campaignStatus).withHttpInfo());
  }

  private GetOutboundMessagingcampaignsRequest createGetOutboundMessagingcampaignsRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String name, String contactListId, List<String> divisionId, String type, String senderSmsPhoneNumber, List<String> id, String contentTemplateId, String campaignStatus) {
    return GetOutboundMessagingcampaignsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withContactListId(contactListId)

            .withDivisionId(divisionId)

            .withType(type)

            .withSenderSmsPhoneNumber(senderSmsPhoneNumber)

            .withId(id)

            .withContentTemplateId(contentTemplateId)

            .withCampaignStatus(campaignStatus)

            .build();
  }

  /**
   * Query a list of Messaging Campaigns
   * 
   * @param request The request object
   * @return MessagingCampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignEntityListing getOutboundMessagingcampaigns(GetOutboundMessagingcampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaignEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaignEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of Messaging Campaigns
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignEntityListing> getOutboundMessagingcampaigns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaignEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignEntityListing> response = (ApiResponse<MessagingCampaignEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignEntityListing> response = (ApiResponse<MessagingCampaignEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a basic Messaging Campaign information object
   * This returns a simplified version of a Messaging Campaign, consisting of id, name, and division.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaignDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignDivisionView getOutboundMessagingcampaignsDivisionview(String messagingCampaignId) throws IOException, ApiException {
    return  getOutboundMessagingcampaignsDivisionview(createGetOutboundMessagingcampaignsDivisionviewRequest(messagingCampaignId));
  }

  /**
   * Get a basic Messaging Campaign information object
   * This returns a simplified version of a Messaging Campaign, consisting of id, name, and division.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @return MessagingCampaignDivisionView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignDivisionView> getOutboundMessagingcampaignsDivisionviewWithHttpInfo(String messagingCampaignId) throws IOException {
    return getOutboundMessagingcampaignsDivisionview(createGetOutboundMessagingcampaignsDivisionviewRequest(messagingCampaignId).withHttpInfo());
  }

  private GetOutboundMessagingcampaignsDivisionviewRequest createGetOutboundMessagingcampaignsDivisionviewRequest(String messagingCampaignId) {
    return GetOutboundMessagingcampaignsDivisionviewRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Get a basic Messaging Campaign information object
   * This returns a simplified version of a Messaging Campaign, consisting of id, name, and division.
   * @param request The request object
   * @return MessagingCampaignDivisionView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignDivisionView getOutboundMessagingcampaignsDivisionview(GetOutboundMessagingcampaignsDivisionviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaignDivisionView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaignDivisionView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a basic Messaging Campaign information object
   * This returns a simplified version of a Messaging Campaign, consisting of id, name, and division.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignDivisionView> getOutboundMessagingcampaignsDivisionview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaignDivisionView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignDivisionView> response = (ApiResponse<MessagingCampaignDivisionView>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignDivisionView> response = (ApiResponse<MessagingCampaignDivisionView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of basic Messaging Campaign information objects
   * This returns a listing of simplified Messaging Campaigns, each consisting of id, name, and division.
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder The direction to sort (optional, default to a)
   * @param name Name (optional)
   * @param type Campaign Type (optional)
   * @param id id (optional)
   * @param senderSmsPhoneNumber Sender SMS Phone Number (optional)
   * @param contentTemplateId Content template ID (optional)
   * @param campaignStatus Campaign Status (optional)
   * @return MessagingCampaignDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignDivisionViewEntityListing getOutboundMessagingcampaignsDivisionviews(Integer pageSize, Integer pageNumber, String sortOrder, String name, String type, List<String> id, String senderSmsPhoneNumber, String contentTemplateId, String campaignStatus) throws IOException, ApiException {
    return  getOutboundMessagingcampaignsDivisionviews(createGetOutboundMessagingcampaignsDivisionviewsRequest(pageSize, pageNumber, sortOrder, name, type, id, senderSmsPhoneNumber, contentTemplateId, campaignStatus));
  }

  /**
   * Query a list of basic Messaging Campaign information objects
   * This returns a listing of simplified Messaging Campaigns, each consisting of id, name, and division.
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder The direction to sort (optional, default to a)
   * @param name Name (optional)
   * @param type Campaign Type (optional)
   * @param id id (optional)
   * @param senderSmsPhoneNumber Sender SMS Phone Number (optional)
   * @param contentTemplateId Content template ID (optional)
   * @param campaignStatus Campaign Status (optional)
   * @return MessagingCampaignDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignDivisionViewEntityListing> getOutboundMessagingcampaignsDivisionviewsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder, String name, String type, List<String> id, String senderSmsPhoneNumber, String contentTemplateId, String campaignStatus) throws IOException {
    return getOutboundMessagingcampaignsDivisionviews(createGetOutboundMessagingcampaignsDivisionviewsRequest(pageSize, pageNumber, sortOrder, name, type, id, senderSmsPhoneNumber, contentTemplateId, campaignStatus).withHttpInfo());
  }

  private GetOutboundMessagingcampaignsDivisionviewsRequest createGetOutboundMessagingcampaignsDivisionviewsRequest(Integer pageSize, Integer pageNumber, String sortOrder, String name, String type, List<String> id, String senderSmsPhoneNumber, String contentTemplateId, String campaignStatus) {
    return GetOutboundMessagingcampaignsDivisionviewsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortOrder(sortOrder)

            .withName(name)

            .withType(type)

            .withId(id)

            .withSenderSmsPhoneNumber(senderSmsPhoneNumber)

            .withContentTemplateId(contentTemplateId)

            .withCampaignStatus(campaignStatus)

            .build();
  }

  /**
   * Query a list of basic Messaging Campaign information objects
   * This returns a listing of simplified Messaging Campaigns, each consisting of id, name, and division.
   * @param request The request object
   * @return MessagingCampaignDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignDivisionViewEntityListing getOutboundMessagingcampaignsDivisionviews(GetOutboundMessagingcampaignsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaignDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaignDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of basic Messaging Campaign information objects
   * This returns a listing of simplified Messaging Campaigns, each consisting of id, name, and division.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignDivisionViewEntityListing> getOutboundMessagingcampaignsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaignDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignDivisionViewEntityListing> response = (ApiResponse<MessagingCampaignDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignDivisionViewEntityListing> response = (ApiResponse<MessagingCampaignDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet getOutboundRuleset(String ruleSetId) throws IOException, ApiException {
    return  getOutboundRuleset(createGetOutboundRulesetRequest(ruleSetId));
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return RuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> getOutboundRulesetWithHttpInfo(String ruleSetId) throws IOException {
    return getOutboundRuleset(createGetOutboundRulesetRequest(ruleSetId).withHttpInfo());
  }

  private GetOutboundRulesetRequest createGetOutboundRulesetRequest(String ruleSetId) {
    return GetOutboundRulesetRequest.builder()
            .withRuleSetId(ruleSetId)

            .build();
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param request The request object
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet getOutboundRuleset(GetOutboundRulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> getOutboundRuleset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return RuleSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSetEntityListing getOutboundRulesets(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundRulesets(createGetOutboundRulesetsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return RuleSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSetEntityListing> getOutboundRulesetsWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundRulesets(createGetOutboundRulesetsRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundRulesetsRequest createGetOutboundRulesetsRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundRulesetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param request The request object
   * @return RuleSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSetEntityListing getOutboundRulesets(GetOutboundRulesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSetEntityListing> getOutboundRulesets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSetEntityListing> response = (ApiResponse<RuleSetEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSetEntityListing> response = (ApiResponse<RuleSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule getOutboundSchedulesCampaign(String campaignId) throws IOException, ApiException {
    return  getOutboundSchedulesCampaign(createGetOutboundSchedulesCampaignRequest(campaignId));
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> getOutboundSchedulesCampaignWithHttpInfo(String campaignId) throws IOException {
    return getOutboundSchedulesCampaign(createGetOutboundSchedulesCampaignRequest(campaignId).withHttpInfo());
  }

  private GetOutboundSchedulesCampaignRequest createGetOutboundSchedulesCampaignRequest(String campaignId) {
    return GetOutboundSchedulesCampaignRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param request The request object
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule getOutboundSchedulesCampaign(GetOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> getOutboundSchedulesCampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return List<CampaignSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignSchedule> getOutboundSchedulesCampaigns() throws IOException, ApiException {
    return  getOutboundSchedulesCampaigns(createGetOutboundSchedulesCampaignsRequest());
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return List<CampaignSchedule>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignSchedule>> getOutboundSchedulesCampaignsWithHttpInfo() throws IOException {
    return getOutboundSchedulesCampaigns(createGetOutboundSchedulesCampaignsRequest().withHttpInfo());
  }

  private GetOutboundSchedulesCampaignsRequest createGetOutboundSchedulesCampaignsRequest() {
    return GetOutboundSchedulesCampaignsRequest.builder()
            .build();
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @param request The request object
   * @return List<CampaignSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignSchedule> getOutboundSchedulesCampaigns(GetOutboundSchedulesCampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<CampaignSchedule>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<CampaignSchedule>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignSchedule>> getOutboundSchedulesCampaigns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<CampaignSchedule>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignSchedule>> response = (ApiResponse<List<CampaignSchedule>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignSchedule>> response = (ApiResponse<List<CampaignSchedule>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an email campaign schedule.
   * 
   * @param emailCampaignId Email Campaign ID (required)
   * @return EmailCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailCampaignSchedule getOutboundSchedulesEmailcampaign(String emailCampaignId) throws IOException, ApiException {
    return  getOutboundSchedulesEmailcampaign(createGetOutboundSchedulesEmailcampaignRequest(emailCampaignId));
  }

  /**
   * Get an email campaign schedule.
   * 
   * @param emailCampaignId Email Campaign ID (required)
   * @return EmailCampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailCampaignSchedule> getOutboundSchedulesEmailcampaignWithHttpInfo(String emailCampaignId) throws IOException {
    return getOutboundSchedulesEmailcampaign(createGetOutboundSchedulesEmailcampaignRequest(emailCampaignId).withHttpInfo());
  }

  private GetOutboundSchedulesEmailcampaignRequest createGetOutboundSchedulesEmailcampaignRequest(String emailCampaignId) {
    return GetOutboundSchedulesEmailcampaignRequest.builder()
            .withEmailCampaignId(emailCampaignId)

            .build();
  }

  /**
   * Get an email campaign schedule.
   * 
   * @param request The request object
   * @return EmailCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailCampaignSchedule getOutboundSchedulesEmailcampaign(GetOutboundSchedulesEmailcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailCampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailCampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an email campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailCampaignSchedule> getOutboundSchedulesEmailcampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailCampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for a list of email campaign schedules.
   * 
   * @return EmailCampaignScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailCampaignScheduleEntityListing getOutboundSchedulesEmailcampaigns() throws IOException, ApiException {
    return  getOutboundSchedulesEmailcampaigns(createGetOutboundSchedulesEmailcampaignsRequest());
  }

  /**
   * Query for a list of email campaign schedules.
   * 
   * @return EmailCampaignScheduleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailCampaignScheduleEntityListing> getOutboundSchedulesEmailcampaignsWithHttpInfo() throws IOException {
    return getOutboundSchedulesEmailcampaigns(createGetOutboundSchedulesEmailcampaignsRequest().withHttpInfo());
  }

  private GetOutboundSchedulesEmailcampaignsRequest createGetOutboundSchedulesEmailcampaignsRequest() {
    return GetOutboundSchedulesEmailcampaignsRequest.builder()
            .build();
  }

  /**
   * Query for a list of email campaign schedules.
   * 
   * @param request The request object
   * @return EmailCampaignScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailCampaignScheduleEntityListing getOutboundSchedulesEmailcampaigns(GetOutboundSchedulesEmailcampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailCampaignScheduleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailCampaignScheduleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for a list of email campaign schedules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailCampaignScheduleEntityListing> getOutboundSchedulesEmailcampaigns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailCampaignScheduleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailCampaignScheduleEntityListing> response = (ApiResponse<EmailCampaignScheduleEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmailCampaignScheduleEntityListing> response = (ApiResponse<EmailCampaignScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a messaging campaign schedule.
   * 
   * @param messagingCampaignId Messaging Campaign ID (required)
   * @return MessagingCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignSchedule getOutboundSchedulesMessagingcampaign(String messagingCampaignId) throws IOException, ApiException {
    return  getOutboundSchedulesMessagingcampaign(createGetOutboundSchedulesMessagingcampaignRequest(messagingCampaignId));
  }

  /**
   * Get a messaging campaign schedule.
   * 
   * @param messagingCampaignId Messaging Campaign ID (required)
   * @return MessagingCampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignSchedule> getOutboundSchedulesMessagingcampaignWithHttpInfo(String messagingCampaignId) throws IOException {
    return getOutboundSchedulesMessagingcampaign(createGetOutboundSchedulesMessagingcampaignRequest(messagingCampaignId).withHttpInfo());
  }

  private GetOutboundSchedulesMessagingcampaignRequest createGetOutboundSchedulesMessagingcampaignRequest(String messagingCampaignId) {
    return GetOutboundSchedulesMessagingcampaignRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Get a messaging campaign schedule.
   * 
   * @param request The request object
   * @return MessagingCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignSchedule getOutboundSchedulesMessagingcampaign(GetOutboundSchedulesMessagingcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a messaging campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignSchedule> getOutboundSchedulesMessagingcampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for a list of messaging campaign schedules.
   * 
   * @return MessagingCampaignScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignScheduleEntityListing getOutboundSchedulesMessagingcampaigns() throws IOException, ApiException {
    return  getOutboundSchedulesMessagingcampaigns(createGetOutboundSchedulesMessagingcampaignsRequest());
  }

  /**
   * Query for a list of messaging campaign schedules.
   * 
   * @return MessagingCampaignScheduleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignScheduleEntityListing> getOutboundSchedulesMessagingcampaignsWithHttpInfo() throws IOException {
    return getOutboundSchedulesMessagingcampaigns(createGetOutboundSchedulesMessagingcampaignsRequest().withHttpInfo());
  }

  private GetOutboundSchedulesMessagingcampaignsRequest createGetOutboundSchedulesMessagingcampaignsRequest() {
    return GetOutboundSchedulesMessagingcampaignsRequest.builder()
            .build();
  }

  /**
   * Query for a list of messaging campaign schedules.
   * 
   * @param request The request object
   * @return MessagingCampaignScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignScheduleEntityListing getOutboundSchedulesMessagingcampaigns(GetOutboundSchedulesMessagingcampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaignScheduleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaignScheduleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for a list of messaging campaign schedules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignScheduleEntityListing> getOutboundSchedulesMessagingcampaigns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaignScheduleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignScheduleEntityListing> response = (ApiResponse<MessagingCampaignScheduleEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignScheduleEntityListing> response = (ApiResponse<MessagingCampaignScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule getOutboundSchedulesSequence(String sequenceId) throws IOException, ApiException {
    return  getOutboundSchedulesSequence(createGetOutboundSchedulesSequenceRequest(sequenceId));
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return SequenceSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> getOutboundSchedulesSequenceWithHttpInfo(String sequenceId) throws IOException {
    return getOutboundSchedulesSequence(createGetOutboundSchedulesSequenceRequest(sequenceId).withHttpInfo());
  }

  private GetOutboundSchedulesSequenceRequest createGetOutboundSchedulesSequenceRequest(String sequenceId) {
    return GetOutboundSchedulesSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .build();
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param request The request object
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule getOutboundSchedulesSequence(GetOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SequenceSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> getOutboundSchedulesSequence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SequenceSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return List<SequenceSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SequenceSchedule> getOutboundSchedulesSequences() throws IOException, ApiException {
    return  getOutboundSchedulesSequences(createGetOutboundSchedulesSequencesRequest());
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return List<SequenceSchedule>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SequenceSchedule>> getOutboundSchedulesSequencesWithHttpInfo() throws IOException {
    return getOutboundSchedulesSequences(createGetOutboundSchedulesSequencesRequest().withHttpInfo());
  }

  private GetOutboundSchedulesSequencesRequest createGetOutboundSchedulesSequencesRequest() {
    return GetOutboundSchedulesSequencesRequest.builder()
            .build();
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @param request The request object
   * @return List<SequenceSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SequenceSchedule> getOutboundSchedulesSequences(GetOutboundSchedulesSequencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<SequenceSchedule>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<SequenceSchedule>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SequenceSchedule>> getOutboundSchedulesSequences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<SequenceSchedule>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<SequenceSchedule>> response = (ApiResponse<List<SequenceSchedule>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<SequenceSchedule>> response = (ApiResponse<List<SequenceSchedule>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence getOutboundSequence(String sequenceId) throws IOException, ApiException {
    return  getOutboundSequence(createGetOutboundSequenceRequest(sequenceId));
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return CampaignSequence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> getOutboundSequenceWithHttpInfo(String sequenceId) throws IOException {
    return getOutboundSequence(createGetOutboundSequenceRequest(sequenceId).withHttpInfo());
  }

  private GetOutboundSequenceRequest createGetOutboundSequenceRequest(String sequenceId) {
    return GetOutboundSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .build();
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param request The request object
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence getOutboundSequence(GetOutboundSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> getOutboundSequence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignSequenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequenceEntityListing getOutboundSequences(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundSequences(createGetOutboundSequencesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param pageSize Page size. The max that will be returned is 100. (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param allowEmptyResult Whether to return an empty page when there are no results for that page (optional, default to false)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignSequenceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequenceEntityListing> getOutboundSequencesWithHttpInfo(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundSequences(createGetOutboundSequencesRequest(pageSize, pageNumber, allowEmptyResult, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundSequencesRequest createGetOutboundSequencesRequest(Integer pageSize, Integer pageNumber, Boolean allowEmptyResult, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundSequencesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withAllowEmptyResult(allowEmptyResult)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param request The request object
   * @return CampaignSequenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequenceEntityListing getOutboundSequences(GetOutboundSequencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequenceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequenceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequenceEntityListing> getOutboundSequences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequenceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequenceEntityListing> response = (ApiResponse<CampaignSequenceEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequenceEntityListing> response = (ApiResponse<CampaignSequenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the outbound settings for this organization
   * 
   * @return OutboundSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundSettings getOutboundSettings() throws IOException, ApiException {
    return  getOutboundSettings(createGetOutboundSettingsRequest());
  }

  /**
   * Get the outbound settings for this organization
   * 
   * @return OutboundSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundSettings> getOutboundSettingsWithHttpInfo() throws IOException {
    return getOutboundSettings(createGetOutboundSettingsRequest().withHttpInfo());
  }

  private GetOutboundSettingsRequest createGetOutboundSettingsRequest() {
    return GetOutboundSettingsRequest.builder()
            .build();
  }

  /**
   * Get the outbound settings for this organization
   * 
   * @param request The request object
   * @return OutboundSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutboundSettings getOutboundSettings(GetOutboundSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutboundSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutboundSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the outbound settings for this organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutboundSettings> getOutboundSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutboundSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundSettings> response = (ApiResponse<OutboundSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<OutboundSettings> response = (ApiResponse<OutboundSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping getOutboundWrapupcodemappings() throws IOException, ApiException {
    return  getOutboundWrapupcodemappings(createGetOutboundWrapupcodemappingsRequest());
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return WrapUpCodeMapping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> getOutboundWrapupcodemappingsWithHttpInfo() throws IOException {
    return getOutboundWrapupcodemappings(createGetOutboundWrapupcodemappingsRequest().withHttpInfo());
  }

  private GetOutboundWrapupcodemappingsRequest createGetOutboundWrapupcodemappingsRequest() {
    return GetOutboundWrapupcodemappingsRequest.builder()
            .build();
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping getOutboundWrapupcodemappings(GetOutboundWrapupcodemappingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapUpCodeMapping> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> getOutboundWrapupcodemappings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapUpCodeMapping>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignPatchRequest (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundCampaign(String campaignId, CampaignPatchRequest body) throws IOException, ApiException {
     patchOutboundCampaign(createPatchOutboundCampaignRequest(campaignId, body));
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignPatchRequest (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundCampaignWithHttpInfo(String campaignId, CampaignPatchRequest body) throws IOException {
    return patchOutboundCampaign(createPatchOutboundCampaignRequest(campaignId, body).withHttpInfo());
  }

  private PatchOutboundCampaignRequest createPatchOutboundCampaignRequest(String campaignId, CampaignPatchRequest body) {
    return PatchOutboundCampaignRequest.builder()
            .withCampaignId(campaignId)

            .withBody(body)

            .build();
  }

  /**
   * Update a campaign.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundCampaign(PatchOutboundCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update a campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundCampaign(ApiRequest<CampaignPatchRequest> request) throws IOException {
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
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC Custom exclusion column entries (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistCustomexclusioncolumns(String dncListId, DncPatchCustomExclusionColumnsRequest body) throws IOException, ApiException {
     patchOutboundDnclistCustomexclusioncolumns(createPatchOutboundDnclistCustomexclusioncolumnsRequest(dncListId, body));
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC Custom exclusion column entries (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistCustomexclusioncolumnsWithHttpInfo(String dncListId, DncPatchCustomExclusionColumnsRequest body) throws IOException {
    return patchOutboundDnclistCustomexclusioncolumns(createPatchOutboundDnclistCustomexclusioncolumnsRequest(dncListId, body).withHttpInfo());
  }

  private PatchOutboundDnclistCustomexclusioncolumnsRequest createPatchOutboundDnclistCustomexclusioncolumnsRequest(String dncListId, DncPatchCustomExclusionColumnsRequest body) {
    return PatchOutboundDnclistCustomexclusioncolumnsRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)

            .build();
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistCustomexclusioncolumns(PatchOutboundDnclistCustomexclusioncolumnsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistCustomexclusioncolumns(ApiRequest<DncPatchCustomExclusionColumnsRequest> request) throws IOException {
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
   * Add emails to or Delete emails from a DNC list.
   * Only Internal DNC lists may be added to or deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC Emails (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistEmailaddresses(String dncListId, DncPatchEmailsRequest body) throws IOException, ApiException {
     patchOutboundDnclistEmailaddresses(createPatchOutboundDnclistEmailaddressesRequest(dncListId, body));
  }

  /**
   * Add emails to or Delete emails from a DNC list.
   * Only Internal DNC lists may be added to or deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC Emails (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistEmailaddressesWithHttpInfo(String dncListId, DncPatchEmailsRequest body) throws IOException {
    return patchOutboundDnclistEmailaddresses(createPatchOutboundDnclistEmailaddressesRequest(dncListId, body).withHttpInfo());
  }

  private PatchOutboundDnclistEmailaddressesRequest createPatchOutboundDnclistEmailaddressesRequest(String dncListId, DncPatchEmailsRequest body) {
    return PatchOutboundDnclistEmailaddressesRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)

            .build();
  }

  /**
   * Add emails to or Delete emails from a DNC list.
   * Only Internal DNC lists may be added to or deleted from
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistEmailaddresses(PatchOutboundDnclistEmailaddressesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add emails to or Delete emails from a DNC list.
   * Only Internal DNC lists may be added to or deleted from
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistEmailaddresses(ApiRequest<DncPatchEmailsRequest> request) throws IOException {
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
   * Add numbers to or delete numbers from a DNC list.
   * Only Internal DNC lists may be added to deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistPhonenumbers(String dncListId, DncPatchPhoneNumbersRequest body) throws IOException, ApiException {
     patchOutboundDnclistPhonenumbers(createPatchOutboundDnclistPhonenumbersRequest(dncListId, body));
  }

  /**
   * Add numbers to or delete numbers from a DNC list.
   * Only Internal DNC lists may be added to deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistPhonenumbersWithHttpInfo(String dncListId, DncPatchPhoneNumbersRequest body) throws IOException {
    return patchOutboundDnclistPhonenumbers(createPatchOutboundDnclistPhonenumbersRequest(dncListId, body).withHttpInfo());
  }

  private PatchOutboundDnclistPhonenumbersRequest createPatchOutboundDnclistPhonenumbersRequest(String dncListId, DncPatchPhoneNumbersRequest body) {
    return PatchOutboundDnclistPhonenumbersRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)

            .build();
  }

  /**
   * Add numbers to or delete numbers from a DNC list.
   * Only Internal DNC lists may be added to deleted from
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistPhonenumbers(PatchOutboundDnclistPhonenumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add numbers to or delete numbers from a DNC list.
   * Only Internal DNC lists may be added to deleted from
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistPhonenumbers(ApiRequest<DncPatchPhoneNumbersRequest> request) throws IOException {
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
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC whatsApp numbers (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistWhatsappnumbers(String dncListId, DncPatchWhatsAppNumbersRequest body) throws IOException, ApiException {
     patchOutboundDnclistWhatsappnumbers(createPatchOutboundDnclistWhatsappnumbersRequest(dncListId, body));
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param dncListId DncList ID (required)
   * @param body DNC whatsApp numbers (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistWhatsappnumbersWithHttpInfo(String dncListId, DncPatchWhatsAppNumbersRequest body) throws IOException {
    return patchOutboundDnclistWhatsappnumbers(createPatchOutboundDnclistWhatsappnumbersRequest(dncListId, body).withHttpInfo());
  }

  private PatchOutboundDnclistWhatsappnumbersRequest createPatchOutboundDnclistWhatsappnumbersRequest(String dncListId, DncPatchWhatsAppNumbersRequest body) {
    return PatchOutboundDnclistWhatsappnumbersRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)

            .build();
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundDnclistWhatsappnumbers(PatchOutboundDnclistWhatsappnumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundDnclistWhatsappnumbers(ApiRequest<DncPatchWhatsAppNumbersRequest> request) throws IOException {
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
   * Update the outbound settings for this organization
   * 
   * @param body outboundSettings (required)
   * @param useMaxCallsPerAgentDecimal Use maxCallsPerAgent with decimal precision (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundSettings(OutboundSettings body, Boolean useMaxCallsPerAgentDecimal) throws IOException, ApiException {
     patchOutboundSettings(createPatchOutboundSettingsRequest(body, useMaxCallsPerAgentDecimal));
  }

  /**
   * Update the outbound settings for this organization
   * 
   * @param body outboundSettings (required)
   * @param useMaxCallsPerAgentDecimal Use maxCallsPerAgent with decimal precision (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundSettingsWithHttpInfo(OutboundSettings body, Boolean useMaxCallsPerAgentDecimal) throws IOException {
    return patchOutboundSettings(createPatchOutboundSettingsRequest(body, useMaxCallsPerAgentDecimal).withHttpInfo());
  }

  private PatchOutboundSettingsRequest createPatchOutboundSettingsRequest(OutboundSettings body, Boolean useMaxCallsPerAgentDecimal) {
    return PatchOutboundSettingsRequest.builder()
            .withBody(body)

            .withUseMaxCallsPerAgentDecimal(useMaxCallsPerAgentDecimal)

            .build();
  }

  /**
   * Update the outbound settings for this organization
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchOutboundSettings(PatchOutboundSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the outbound settings for this organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchOutboundSettings(ApiRequest<OutboundSettings> request) throws IOException {
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
   * Create attempt limits
   * 
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits postOutboundAttemptlimits(AttemptLimits body) throws IOException, ApiException {
    return  postOutboundAttemptlimits(createPostOutboundAttemptlimitsRequest(body));
  }

  /**
   * Create attempt limits
   * 
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> postOutboundAttemptlimitsWithHttpInfo(AttemptLimits body) throws IOException {
    return postOutboundAttemptlimits(createPostOutboundAttemptlimitsRequest(body).withHttpInfo());
  }

  private PostOutboundAttemptlimitsRequest createPostOutboundAttemptlimitsRequest(AttemptLimits body) {
    return PostOutboundAttemptlimitsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create attempt limits
   * 
   * @param request The request object
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits postOutboundAttemptlimits(PostOutboundAttemptlimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> postOutboundAttemptlimits(ApiRequest<AttemptLimits> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet postOutboundCallabletimesets(CallableTimeSet body) throws IOException, ApiException {
    return  postOutboundCallabletimesets(createPostOutboundCallabletimesetsRequest(body));
  }

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> postOutboundCallabletimesetsWithHttpInfo(CallableTimeSet body) throws IOException {
    return postOutboundCallabletimesets(createPostOutboundCallabletimesetsRequest(body).withHttpInfo());
  }

  private PostOutboundCallabletimesetsRequest createPostOutboundCallabletimesetsRequest(CallableTimeSet body) {
    return PostOutboundCallabletimesetsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create callable time set
   * 
   * @param request The request object
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet postOutboundCallabletimesets(PostOutboundCallabletimesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> postOutboundCallabletimesets(ApiRequest<CallableTimeSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet postOutboundCallanalysisresponsesets(ResponseSet body) throws IOException, ApiException {
    return  postOutboundCallanalysisresponsesets(createPostOutboundCallanalysisresponsesetsRequest(body));
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> postOutboundCallanalysisresponsesetsWithHttpInfo(ResponseSet body) throws IOException {
    return postOutboundCallanalysisresponsesets(createPostOutboundCallanalysisresponsesetsRequest(body).withHttpInfo());
  }

  private PostOutboundCallanalysisresponsesetsRequest createPostOutboundCallanalysisresponsesetsRequest(ResponseSet body) {
    return PostOutboundCallanalysisresponsesetsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param request The request object
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet postOutboundCallanalysisresponsesets(PostOutboundCallanalysisresponsesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> postOutboundCallanalysisresponsesets(ApiRequest<ResponseSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Initiate request for a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param campaignId Campaign ID (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty postOutboundCampaignAgentownedmappingpreview(String campaignId) throws IOException, ApiException {
    return  postOutboundCampaignAgentownedmappingpreview(createPostOutboundCampaignAgentownedmappingpreviewRequest(campaignId));
  }

  /**
   * Initiate request for a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param campaignId Campaign ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> postOutboundCampaignAgentownedmappingpreviewWithHttpInfo(String campaignId) throws IOException {
    return postOutboundCampaignAgentownedmappingpreview(createPostOutboundCampaignAgentownedmappingpreviewRequest(campaignId).withHttpInfo());
  }

  private PostOutboundCampaignAgentownedmappingpreviewRequest createPostOutboundCampaignAgentownedmappingpreviewRequest(String campaignId) {
    return PostOutboundCampaignAgentownedmappingpreviewRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Initiate request for a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty postOutboundCampaignAgentownedmappingpreview(PostOutboundCampaignAgentownedmappingpreviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Empty> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Empty>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Initiate request for a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> postOutboundCampaignAgentownedmappingpreview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Empty>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \"/conversations/{conversationId}/participants/{participantId}/callbacks instead.\"
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (required)
   * @return ContactCallbackRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ContactCallbackRequest postOutboundCampaignCallbackSchedule(String campaignId, ContactCallbackRequest body) throws IOException, ApiException {
    return  postOutboundCampaignCallbackSchedule(createPostOutboundCampaignCallbackScheduleRequest(campaignId, body));
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \"/conversations/{conversationId}/participants/{participantId}/callbacks instead.\"
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (required)
   * @return ContactCallbackRequest
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ContactCallbackRequest> postOutboundCampaignCallbackScheduleWithHttpInfo(String campaignId, ContactCallbackRequest body) throws IOException {
    return postOutboundCampaignCallbackSchedule(createPostOutboundCampaignCallbackScheduleRequest(campaignId, body).withHttpInfo());
  }

  private PostOutboundCampaignCallbackScheduleRequest createPostOutboundCampaignCallbackScheduleRequest(String campaignId, ContactCallbackRequest body) {
    return PostOutboundCampaignCallbackScheduleRequest.builder()
            .withCampaignId(campaignId)

            .withBody(body)

            .build();
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \"/conversations/{conversationId}/participants/{participantId}/callbacks instead.\"
   * @param request The request object
   * @return ContactCallbackRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ContactCallbackRequest postOutboundCampaignCallbackSchedule(PostOutboundCampaignCallbackScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactCallbackRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactCallbackRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \"/conversations/{conversationId}/participants/{participantId}/callbacks instead.\"
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ContactCallbackRequest> postOutboundCampaignCallbackSchedule(ApiRequest<ContactCallbackRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactCallbackRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactCallbackRequest> response = (ApiResponse<ContactCallbackRequest>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactCallbackRequest> response = (ApiResponse<ContactCallbackRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundCampaignStart(String campaignId) throws IOException, ApiException {
     postOutboundCampaignStart(createPostOutboundCampaignStartRequest(campaignId));
  }

  /**
   * Start the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundCampaignStartWithHttpInfo(String campaignId) throws IOException {
    return postOutboundCampaignStart(createPostOutboundCampaignStartRequest(campaignId).withHttpInfo());
  }

  private PostOutboundCampaignStartRequest createPostOutboundCampaignStartRequest(String campaignId) {
    return PostOutboundCampaignStartRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Start the campaign
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundCampaignStart(PostOutboundCampaignStartRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Start the campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundCampaignStart(ApiRequest<Void> request) throws IOException {
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
   * Stop the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundCampaignStop(String campaignId) throws IOException, ApiException {
     postOutboundCampaignStop(createPostOutboundCampaignStopRequest(campaignId));
  }

  /**
   * Stop the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundCampaignStopWithHttpInfo(String campaignId) throws IOException {
    return postOutboundCampaignStop(createPostOutboundCampaignStopRequest(campaignId).withHttpInfo());
  }

  private PostOutboundCampaignStopRequest createPostOutboundCampaignStopRequest(String campaignId) {
    return PostOutboundCampaignStopRequest.builder()
            .withCampaignId(campaignId)

            .build();
  }

  /**
   * Stop the campaign
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundCampaignStop(PostOutboundCampaignStopRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Stop the campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundCampaignStop(ApiRequest<Void> request) throws IOException {
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
   * Create Campaign Rule
   * 
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule postOutboundCampaignrules(CampaignRule body) throws IOException, ApiException {
    return  postOutboundCampaignrules(createPostOutboundCampaignrulesRequest(body));
  }

  /**
   * Create Campaign Rule
   * 
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> postOutboundCampaignrulesWithHttpInfo(CampaignRule body) throws IOException {
    return postOutboundCampaignrules(createPostOutboundCampaignrulesRequest(body).withHttpInfo());
  }

  private PostOutboundCampaignrulesRequest createPostOutboundCampaignrulesRequest(CampaignRule body) {
    return PostOutboundCampaignrulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create Campaign Rule
   * 
   * @param request The request object
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule postOutboundCampaignrules(PostOutboundCampaignrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> postOutboundCampaignrules(ApiRequest<CampaignRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a campaign.
   * 
   * @param body Campaign (required)
   * @param useMaxCallsPerAgentDecimal Use maxCallsPerAgent with decimal precision (optional)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign postOutboundCampaigns(Campaign body, Boolean useMaxCallsPerAgentDecimal) throws IOException, ApiException {
    return  postOutboundCampaigns(createPostOutboundCampaignsRequest(body, useMaxCallsPerAgentDecimal));
  }

  /**
   * Create a campaign.
   * 
   * @param body Campaign (required)
   * @param useMaxCallsPerAgentDecimal Use maxCallsPerAgent with decimal precision (optional)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> postOutboundCampaignsWithHttpInfo(Campaign body, Boolean useMaxCallsPerAgentDecimal) throws IOException {
    return postOutboundCampaigns(createPostOutboundCampaignsRequest(body, useMaxCallsPerAgentDecimal).withHttpInfo());
  }

  private PostOutboundCampaignsRequest createPostOutboundCampaignsRequest(Campaign body, Boolean useMaxCallsPerAgentDecimal) {
    return PostOutboundCampaignsRequest.builder()
            .withBody(body)

            .withUseMaxCallsPerAgentDecimal(useMaxCallsPerAgentDecimal)

            .build();
  }

  /**
   * Create a campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign postOutboundCampaigns(PostOutboundCampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> postOutboundCampaigns(ApiRequest<Campaign> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignProgress> postOutboundCampaignsProgress(List<String> body) throws IOException, ApiException {
    return  postOutboundCampaignsProgress(createPostOutboundCampaignsProgressRequest(body));
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignProgress>> postOutboundCampaignsProgressWithHttpInfo(List<String> body) throws IOException {
    return postOutboundCampaignsProgress(createPostOutboundCampaignsProgressRequest(body).withHttpInfo());
  }

  private PostOutboundCampaignsProgressRequest createPostOutboundCampaignsProgressRequest(List<String> body) {
    return PostOutboundCampaignsProgressRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param request The request object
   * @return List<CampaignProgress>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignProgress> postOutboundCampaignsProgress(PostOutboundCampaignsProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<CampaignProgress>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<CampaignProgress>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignProgress>> postOutboundCampaignsProgress(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<CampaignProgress>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Deletes all contacts out of a list. All outstanding recalls or rule-scheduled callbacks for non-preview campaigns configured with the contactlist will be cancelled.
   * 
   * @param contactListId Contact List ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundContactlistClear(String contactListId) throws IOException, ApiException {
     postOutboundContactlistClear(createPostOutboundContactlistClearRequest(contactListId));
  }

  /**
   * Deletes all contacts out of a list. All outstanding recalls or rule-scheduled callbacks for non-preview campaigns configured with the contactlist will be cancelled.
   * 
   * @param contactListId Contact List ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundContactlistClearWithHttpInfo(String contactListId) throws IOException {
    return postOutboundContactlistClear(createPostOutboundContactlistClearRequest(contactListId).withHttpInfo());
  }

  private PostOutboundContactlistClearRequest createPostOutboundContactlistClearRequest(String contactListId) {
    return PostOutboundContactlistClearRequest.builder()
            .withContactListId(contactListId)

            .build();
  }

  /**
   * Deletes all contacts out of a list. All outstanding recalls or rule-scheduled callbacks for non-preview campaigns configured with the contactlist will be cancelled.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundContactlistClear(PostOutboundContactlistClearRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes all contacts out of a list. All outstanding recalls or rule-scheduled callbacks for non-preview campaigns configured with the contactlist will be cancelled.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundContactlistClear(ApiRequest<Void> request) throws IOException {
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
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (required)
   * @param priority Contact priority. True means the contact(s) will be dialed next; false means the contact will go to the end of the contact queue. (optional)
   * @param clearSystemData Clear system data. True means the system columns (attempts, callable status, etc) stored on the contact will be cleared if the contact already exists; false means they won't. (optional)
   * @param doNotQueue Do not queue. True means that updated contacts will not have their positions in the queue altered, so contacts that have already been dialed will not be redialed. For new contacts, this parameter has no effect; False means that updated contacts will be re-queued, according to the 'priority' parameter. (optional)
   * @return List<DialerContact>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<DialerContact> postOutboundContactlistContacts(String contactListId, List<WritableDialerContact> body, Boolean priority, Boolean clearSystemData, Boolean doNotQueue) throws IOException, ApiException {
    return  postOutboundContactlistContacts(createPostOutboundContactlistContactsRequest(contactListId, body, priority, clearSystemData, doNotQueue));
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (required)
   * @param priority Contact priority. True means the contact(s) will be dialed next; false means the contact will go to the end of the contact queue. (optional)
   * @param clearSystemData Clear system data. True means the system columns (attempts, callable status, etc) stored on the contact will be cleared if the contact already exists; false means they won't. (optional)
   * @param doNotQueue Do not queue. True means that updated contacts will not have their positions in the queue altered, so contacts that have already been dialed will not be redialed. For new contacts, this parameter has no effect; False means that updated contacts will be re-queued, according to the 'priority' parameter. (optional)
   * @return List<DialerContact>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContactsWithHttpInfo(String contactListId, List<WritableDialerContact> body, Boolean priority, Boolean clearSystemData, Boolean doNotQueue) throws IOException {
    return postOutboundContactlistContacts(createPostOutboundContactlistContactsRequest(contactListId, body, priority, clearSystemData, doNotQueue).withHttpInfo());
  }

  private PostOutboundContactlistContactsRequest createPostOutboundContactlistContactsRequest(String contactListId, List<WritableDialerContact> body, Boolean priority, Boolean clearSystemData, Boolean doNotQueue) {
    return PostOutboundContactlistContactsRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .withPriority(priority)

            .withClearSystemData(clearSystemData)

            .withDoNotQueue(doNotQueue)

            .build();
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param request The request object
   * @return List<DialerContact>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<DialerContact> postOutboundContactlistContacts(PostOutboundContactlistContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<DialerContact>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<DialerContact>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContacts(ApiRequest<List<WritableDialerContact>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<DialerContact>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get contacts from a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body ContactIds to get. (required)
   * @return List<DialerContact>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<DialerContact> postOutboundContactlistContactsBulk(String contactListId, List<String> body) throws IOException, ApiException {
    return  postOutboundContactlistContactsBulk(createPostOutboundContactlistContactsBulkRequest(contactListId, body));
  }

  /**
   * Get contacts from a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body ContactIds to get. (required)
   * @return List<DialerContact>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContactsBulkWithHttpInfo(String contactListId, List<String> body) throws IOException {
    return postOutboundContactlistContactsBulk(createPostOutboundContactlistContactsBulkRequest(contactListId, body).withHttpInfo());
  }

  private PostOutboundContactlistContactsBulkRequest createPostOutboundContactlistContactsBulkRequest(String contactListId, List<String> body) {
    return PostOutboundContactlistContactsBulkRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .build();
  }

  /**
   * Get contacts from a contact list.
   * 
   * @param request The request object
   * @return List<DialerContact>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<DialerContact> postOutboundContactlistContactsBulk(PostOutboundContactlistContactsBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<DialerContact>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<DialerContact>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get contacts from a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContactsBulk(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<DialerContact>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start an async job to delete contacts using a filter.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact filter information. (required)
   * @return ContactsBulkOperationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJob postOutboundContactlistContactsBulkRemove(String contactListId, ContactBulkSearchParameters body) throws IOException, ApiException {
    return  postOutboundContactlistContactsBulkRemove(createPostOutboundContactlistContactsBulkRemoveRequest(contactListId, body));
  }

  /**
   * Start an async job to delete contacts using a filter.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact filter information. (required)
   * @return ContactsBulkOperationJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJob> postOutboundContactlistContactsBulkRemoveWithHttpInfo(String contactListId, ContactBulkSearchParameters body) throws IOException {
    return postOutboundContactlistContactsBulkRemove(createPostOutboundContactlistContactsBulkRemoveRequest(contactListId, body).withHttpInfo());
  }

  private PostOutboundContactlistContactsBulkRemoveRequest createPostOutboundContactlistContactsBulkRemoveRequest(String contactListId, ContactBulkSearchParameters body) {
    return PostOutboundContactlistContactsBulkRemoveRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .build();
  }

  /**
   * Start an async job to delete contacts using a filter.
   * 
   * @param request The request object
   * @return ContactsBulkOperationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJob postOutboundContactlistContactsBulkRemove(PostOutboundContactlistContactsBulkRemoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactsBulkOperationJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start an async job to delete contacts using a filter.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJob> postOutboundContactlistContactsBulkRemove(ApiRequest<ContactBulkSearchParameters> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactsBulkOperationJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start an async job to bulk edit contacts.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact bulk edit request information. (required)
   * @return ContactsBulkOperationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJob postOutboundContactlistContactsBulkUpdate(String contactListId, ContactBulkEditRequest body) throws IOException, ApiException {
    return  postOutboundContactlistContactsBulkUpdate(createPostOutboundContactlistContactsBulkUpdateRequest(contactListId, body));
  }

  /**
   * Start an async job to bulk edit contacts.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact bulk edit request information. (required)
   * @return ContactsBulkOperationJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJob> postOutboundContactlistContactsBulkUpdateWithHttpInfo(String contactListId, ContactBulkEditRequest body) throws IOException {
    return postOutboundContactlistContactsBulkUpdate(createPostOutboundContactlistContactsBulkUpdateRequest(contactListId, body).withHttpInfo());
  }

  private PostOutboundContactlistContactsBulkUpdateRequest createPostOutboundContactlistContactsBulkUpdateRequest(String contactListId, ContactBulkEditRequest body) {
    return PostOutboundContactlistContactsBulkUpdateRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .build();
  }

  /**
   * Start an async job to bulk edit contacts.
   * 
   * @param request The request object
   * @return ContactsBulkOperationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactsBulkOperationJob postOutboundContactlistContactsBulkUpdate(PostOutboundContactlistContactsBulkUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactsBulkOperationJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start an async job to bulk edit contacts.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactsBulkOperationJob> postOutboundContactlistContactsBulkUpdate(ApiRequest<ContactBulkEditRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactsBulkOperationJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query contacts from a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact search parameters. (required)
   * @return ContactListingResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListingResponse postOutboundContactlistContactsSearch(String contactListId, ContactListingRequest body) throws IOException, ApiException {
    return  postOutboundContactlistContactsSearch(createPostOutboundContactlistContactsSearchRequest(contactListId, body));
  }

  /**
   * Query contacts from a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact search parameters. (required)
   * @return ContactListingResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListingResponse> postOutboundContactlistContactsSearchWithHttpInfo(String contactListId, ContactListingRequest body) throws IOException {
    return postOutboundContactlistContactsSearch(createPostOutboundContactlistContactsSearchRequest(contactListId, body).withHttpInfo());
  }

  private PostOutboundContactlistContactsSearchRequest createPostOutboundContactlistContactsSearchRequest(String contactListId, ContactListingRequest body) {
    return PostOutboundContactlistContactsSearchRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .build();
  }

  /**
   * Query contacts from a contact list.
   * 
   * @param request The request object
   * @return ContactListingResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListingResponse postOutboundContactlistContactsSearch(PostOutboundContactlistContactsSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListingResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListingResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query contacts from a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListingResponse> postOutboundContactlistContactsSearch(ApiRequest<ContactListingRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListingResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListingResponse> response = (ApiResponse<ContactListingResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListingResponse> response = (ApiResponse<ContactListingResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @param body Export information to get (optional)
   * @return DomainEntityRef
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityRef postOutboundContactlistExport(String contactListId, ContactsExportRequest body) throws IOException, ApiException {
    return  postOutboundContactlistExport(createPostOutboundContactlistExportRequest(contactListId, body));
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @param body Export information to get (optional)
   * @return DomainEntityRef
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityRef> postOutboundContactlistExportWithHttpInfo(String contactListId, ContactsExportRequest body) throws IOException {
    return postOutboundContactlistExport(createPostOutboundContactlistExportRequest(contactListId, body).withHttpInfo());
  }

  private PostOutboundContactlistExportRequest createPostOutboundContactlistExportRequest(String contactListId, ContactsExportRequest body) {
    return PostOutboundContactlistExportRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .build();
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return DomainEntityRef
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityRef postOutboundContactlistExport(PostOutboundContactlistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainEntityRef> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainEntityRef>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityRef> postOutboundContactlistExport(ApiRequest<ContactsExportRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainEntityRef>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Contact List Filter
   * 
   * @param body ContactListFilter (required)
   * @return ContactListFilter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilter postOutboundContactlistfilters(ContactListFilter body) throws IOException, ApiException {
    return  postOutboundContactlistfilters(createPostOutboundContactlistfiltersRequest(body));
  }

  /**
   * Create Contact List Filter
   * 
   * @param body ContactListFilter (required)
   * @return ContactListFilter
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilter> postOutboundContactlistfiltersWithHttpInfo(ContactListFilter body) throws IOException {
    return postOutboundContactlistfilters(createPostOutboundContactlistfiltersRequest(body).withHttpInfo());
  }

  private PostOutboundContactlistfiltersRequest createPostOutboundContactlistfiltersRequest(ContactListFilter body) {
    return PostOutboundContactlistfiltersRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create Contact List Filter
   * 
   * @param request The request object
   * @return ContactListFilter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilter postOutboundContactlistfilters(PostOutboundContactlistfiltersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListFilter> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListFilter>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Contact List Filter
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilter> postOutboundContactlistfilters(ApiRequest<ContactListFilter> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListFilter>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve multiple contact list filters
   * 
   * @param body The contact list filters to retrieve (required)
   * @return ContactListFilterEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilterEntityListing postOutboundContactlistfiltersBulkRetrieve(ContactListFilterBulkRetrieveBody body) throws IOException, ApiException {
    return  postOutboundContactlistfiltersBulkRetrieve(createPostOutboundContactlistfiltersBulkRetrieveRequest(body));
  }

  /**
   * Retrieve multiple contact list filters
   * 
   * @param body The contact list filters to retrieve (required)
   * @return ContactListFilterEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilterEntityListing> postOutboundContactlistfiltersBulkRetrieveWithHttpInfo(ContactListFilterBulkRetrieveBody body) throws IOException {
    return postOutboundContactlistfiltersBulkRetrieve(createPostOutboundContactlistfiltersBulkRetrieveRequest(body).withHttpInfo());
  }

  private PostOutboundContactlistfiltersBulkRetrieveRequest createPostOutboundContactlistfiltersBulkRetrieveRequest(ContactListFilterBulkRetrieveBody body) {
    return PostOutboundContactlistfiltersBulkRetrieveRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Retrieve multiple contact list filters
   * 
   * @param request The request object
   * @return ContactListFilterEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilterEntityListing postOutboundContactlistfiltersBulkRetrieve(PostOutboundContactlistfiltersBulkRetrieveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListFilterEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListFilterEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve multiple contact list filters
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilterEntityListing> postOutboundContactlistfiltersBulkRetrieve(ApiRequest<ContactListFilterBulkRetrieveBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListFilterEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a preview of the output of a contact list filter
   * 
   * @param body ContactListFilter (required)
   * @return FilterPreviewResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FilterPreviewResponse postOutboundContactlistfiltersPreview(ContactListFilter body) throws IOException, ApiException {
    return  postOutboundContactlistfiltersPreview(createPostOutboundContactlistfiltersPreviewRequest(body));
  }

  /**
   * Get a preview of the output of a contact list filter
   * 
   * @param body ContactListFilter (required)
   * @return FilterPreviewResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FilterPreviewResponse> postOutboundContactlistfiltersPreviewWithHttpInfo(ContactListFilter body) throws IOException {
    return postOutboundContactlistfiltersPreview(createPostOutboundContactlistfiltersPreviewRequest(body).withHttpInfo());
  }

  private PostOutboundContactlistfiltersPreviewRequest createPostOutboundContactlistfiltersPreviewRequest(ContactListFilter body) {
    return PostOutboundContactlistfiltersPreviewRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get a preview of the output of a contact list filter
   * 
   * @param request The request object
   * @return FilterPreviewResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FilterPreviewResponse postOutboundContactlistfiltersPreview(PostOutboundContactlistfiltersPreviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FilterPreviewResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FilterPreviewResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a preview of the output of a contact list filter
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FilterPreviewResponse> postOutboundContactlistfiltersPreview(ApiRequest<ContactListFilter> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FilterPreviewResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FilterPreviewResponse> response = (ApiResponse<FilterPreviewResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FilterPreviewResponse> response = (ApiResponse<FilterPreviewResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a contact List.
   * 
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList postOutboundContactlists(ContactList body) throws IOException, ApiException {
    return  postOutboundContactlists(createPostOutboundContactlistsRequest(body));
  }

  /**
   * Create a contact List.
   * 
   * @param body ContactList (required)
   * @return ContactList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> postOutboundContactlistsWithHttpInfo(ContactList body) throws IOException {
    return postOutboundContactlists(createPostOutboundContactlistsRequest(body).withHttpInfo());
  }

  private PostOutboundContactlistsRequest createPostOutboundContactlistsRequest(ContactList body) {
    return PostOutboundContactlistsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a contact List.
   * 
   * @param request The request object
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList postOutboundContactlists(PostOutboundContactlistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a contact List.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> postOutboundContactlists(ApiRequest<ContactList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Contact List Template
   * 
   * @param body ContactListTemplate (required)
   * @return ContactListTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplate postOutboundContactlisttemplates(ContactListTemplate body) throws IOException, ApiException {
    return  postOutboundContactlisttemplates(createPostOutboundContactlisttemplatesRequest(body));
  }

  /**
   * Create Contact List Template
   * 
   * @param body ContactListTemplate (required)
   * @return ContactListTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplate> postOutboundContactlisttemplatesWithHttpInfo(ContactListTemplate body) throws IOException {
    return postOutboundContactlisttemplates(createPostOutboundContactlisttemplatesRequest(body).withHttpInfo());
  }

  private PostOutboundContactlisttemplatesRequest createPostOutboundContactlisttemplatesRequest(ContactListTemplate body) {
    return PostOutboundContactlisttemplatesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create Contact List Template
   * 
   * @param request The request object
   * @return ContactListTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplate postOutboundContactlisttemplates(PostOutboundContactlisttemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Contact List Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplate> postOutboundContactlisttemplates(ApiRequest<ContactListTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add multiple contact list templates
   * 
   * @param body contact list template(s) to add (required)
   * @return ContactListTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplateEntityListing postOutboundContactlisttemplatesBulkAdd(List<ContactListTemplate> body) throws IOException, ApiException {
    return  postOutboundContactlisttemplatesBulkAdd(createPostOutboundContactlisttemplatesBulkAddRequest(body));
  }

  /**
   * Add multiple contact list templates
   * 
   * @param body contact list template(s) to add (required)
   * @return ContactListTemplateEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplateEntityListing> postOutboundContactlisttemplatesBulkAddWithHttpInfo(List<ContactListTemplate> body) throws IOException {
    return postOutboundContactlisttemplatesBulkAdd(createPostOutboundContactlisttemplatesBulkAddRequest(body).withHttpInfo());
  }

  private PostOutboundContactlisttemplatesBulkAddRequest createPostOutboundContactlisttemplatesBulkAddRequest(List<ContactListTemplate> body) {
    return PostOutboundContactlisttemplatesBulkAddRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Add multiple contact list templates
   * 
   * @param request The request object
   * @return ContactListTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplateEntityListing postOutboundContactlisttemplatesBulkAdd(PostOutboundContactlisttemplatesBulkAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListTemplateEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListTemplateEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add multiple contact list templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplateEntityListing> postOutboundContactlisttemplatesBulkAdd(ApiRequest<List<ContactListTemplate>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListTemplateEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get multiple contact list templates
   * 
   * @param body contact list templates to get (required)
   * @return ContactListTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplateEntityListing postOutboundContactlisttemplatesBulkRetrieve(ContactListTemplateBulkRetrieveBody body) throws IOException, ApiException {
    return  postOutboundContactlisttemplatesBulkRetrieve(createPostOutboundContactlisttemplatesBulkRetrieveRequest(body));
  }

  /**
   * Get multiple contact list templates
   * 
   * @param body contact list templates to get (required)
   * @return ContactListTemplateEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplateEntityListing> postOutboundContactlisttemplatesBulkRetrieveWithHttpInfo(ContactListTemplateBulkRetrieveBody body) throws IOException {
    return postOutboundContactlisttemplatesBulkRetrieve(createPostOutboundContactlisttemplatesBulkRetrieveRequest(body).withHttpInfo());
  }

  private PostOutboundContactlisttemplatesBulkRetrieveRequest createPostOutboundContactlisttemplatesBulkRetrieveRequest(ContactListTemplateBulkRetrieveBody body) {
    return PostOutboundContactlisttemplatesBulkRetrieveRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get multiple contact list templates
   * 
   * @param request The request object
   * @return ContactListTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplateEntityListing postOutboundContactlisttemplatesBulkRetrieve(PostOutboundContactlisttemplatesBulkRetrieveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListTemplateEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListTemplateEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get multiple contact list templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplateEntityListing> postOutboundContactlisttemplatesBulkRetrieve(ApiRequest<ContactListTemplateBulkRetrieveBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListTemplateEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundConversationDnc(String conversationId) throws IOException, ApiException {
     postOutboundConversationDnc(createPostOutboundConversationDncRequest(conversationId));
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundConversationDncWithHttpInfo(String conversationId) throws IOException {
    return postOutboundConversationDnc(createPostOutboundConversationDncRequest(conversationId).withHttpInfo());
  }

  private PostOutboundConversationDncRequest createPostOutboundConversationDncRequest(String conversationId) {
    return PostOutboundConversationDncRequest.builder()
            .withConversationId(conversationId)

            .build();
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundConversationDnc(PostOutboundConversationDncRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundConversationDnc(ApiRequest<Void> request) throws IOException {
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
   * Create an Outbound Digital Rule Set
   * 
   * @param body Digital Rule Set (required)
   * @return DigitalRuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSet postOutboundDigitalrulesets(DigitalRuleSet body) throws IOException, ApiException {
    return  postOutboundDigitalrulesets(createPostOutboundDigitalrulesetsRequest(body));
  }

  /**
   * Create an Outbound Digital Rule Set
   * 
   * @param body Digital Rule Set (required)
   * @return DigitalRuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSet> postOutboundDigitalrulesetsWithHttpInfo(DigitalRuleSet body) throws IOException {
    return postOutboundDigitalrulesets(createPostOutboundDigitalrulesetsRequest(body).withHttpInfo());
  }

  private PostOutboundDigitalrulesetsRequest createPostOutboundDigitalrulesetsRequest(DigitalRuleSet body) {
    return PostOutboundDigitalrulesetsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @return DigitalRuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSet postOutboundDigitalrulesets(PostOutboundDigitalrulesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DigitalRuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DigitalRuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSet> postOutboundDigitalrulesets(ApiRequest<DigitalRuleSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DigitalRuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add email addresses to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC email addresses (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundDnclistEmailaddresses(String dncListId, List<String> body) throws IOException, ApiException {
     postOutboundDnclistEmailaddresses(createPostOutboundDnclistEmailaddressesRequest(dncListId, body));
  }

  /**
   * Add email addresses to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC email addresses (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundDnclistEmailaddressesWithHttpInfo(String dncListId, List<String> body) throws IOException {
    return postOutboundDnclistEmailaddresses(createPostOutboundDnclistEmailaddressesRequest(dncListId, body).withHttpInfo());
  }

  private PostOutboundDnclistEmailaddressesRequest createPostOutboundDnclistEmailaddressesRequest(String dncListId, List<String> body) {
    return PostOutboundDnclistEmailaddressesRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)

            .build();
  }

  /**
   * Add email addresses to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundDnclistEmailaddresses(PostOutboundDnclistEmailaddressesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add email addresses to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundDnclistEmailaddresses(ApiRequest<List<String>> request) throws IOException {
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
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return DomainEntityRef
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityRef postOutboundDnclistExport(String dncListId) throws IOException, ApiException {
    return  postOutboundDnclistExport(createPostOutboundDnclistExportRequest(dncListId));
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return DomainEntityRef
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityRef> postOutboundDnclistExportWithHttpInfo(String dncListId) throws IOException {
    return postOutboundDnclistExport(createPostOutboundDnclistExportRequest(dncListId).withHttpInfo());
  }

  private PostOutboundDnclistExportRequest createPostOutboundDnclistExportRequest(String dncListId) {
    return PostOutboundDnclistExportRequest.builder()
            .withDncListId(dncListId)

            .build();
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return DomainEntityRef
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DomainEntityRef postOutboundDnclistExport(PostOutboundDnclistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DomainEntityRef> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DomainEntityRef>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DomainEntityRef> postOutboundDnclistExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DomainEntityRef>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add phone numbers to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @param expirationDateTime Expiration date for DNC phone numbers in yyyy-MM-ddTHH:mmZ format (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundDnclistPhonenumbers(String dncListId, List<String> body, String expirationDateTime) throws IOException, ApiException {
     postOutboundDnclistPhonenumbers(createPostOutboundDnclistPhonenumbersRequest(dncListId, body, expirationDateTime));
  }

  /**
   * Add phone numbers to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @param expirationDateTime Expiration date for DNC phone numbers in yyyy-MM-ddTHH:mmZ format (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundDnclistPhonenumbersWithHttpInfo(String dncListId, List<String> body, String expirationDateTime) throws IOException {
    return postOutboundDnclistPhonenumbers(createPostOutboundDnclistPhonenumbersRequest(dncListId, body, expirationDateTime).withHttpInfo());
  }

  private PostOutboundDnclistPhonenumbersRequest createPostOutboundDnclistPhonenumbersRequest(String dncListId, List<String> body, String expirationDateTime) {
    return PostOutboundDnclistPhonenumbersRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)

            .withExpirationDateTime(expirationDateTime)

            .build();
  }

  /**
   * Add phone numbers to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundDnclistPhonenumbers(PostOutboundDnclistPhonenumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add phone numbers to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundDnclistPhonenumbers(ApiRequest<List<String>> request) throws IOException {
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
   * Create dialer DNC list
   * 
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList postOutboundDnclists(DncListCreate body) throws IOException, ApiException {
    return  postOutboundDnclists(createPostOutboundDnclistsRequest(body));
  }

  /**
   * Create dialer DNC list
   * 
   * @param body DncList (required)
   * @return DncList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> postOutboundDnclistsWithHttpInfo(DncListCreate body) throws IOException {
    return postOutboundDnclists(createPostOutboundDnclistsRequest(body).withHttpInfo());
  }

  private PostOutboundDnclistsRequest createPostOutboundDnclistsRequest(DncListCreate body) {
    return PostOutboundDnclistsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create dialer DNC list
   * 
   * @param request The request object
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList postOutboundDnclists(PostOutboundDnclistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> postOutboundDnclists(ApiRequest<DncListCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create File Specification Template
   * 
   * @param body FileSpecificationTemplate (required)
   * @return FileSpecificationTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplate postOutboundFilespecificationtemplates(FileSpecificationTemplate body) throws IOException, ApiException {
    return  postOutboundFilespecificationtemplates(createPostOutboundFilespecificationtemplatesRequest(body));
  }

  /**
   * Create File Specification Template
   * 
   * @param body FileSpecificationTemplate (required)
   * @return FileSpecificationTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplate> postOutboundFilespecificationtemplatesWithHttpInfo(FileSpecificationTemplate body) throws IOException {
    return postOutboundFilespecificationtemplates(createPostOutboundFilespecificationtemplatesRequest(body).withHttpInfo());
  }

  private PostOutboundFilespecificationtemplatesRequest createPostOutboundFilespecificationtemplatesRequest(FileSpecificationTemplate body) {
    return PostOutboundFilespecificationtemplatesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create File Specification Template
   * 
   * @param request The request object
   * @return FileSpecificationTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplate postOutboundFilespecificationtemplates(PostOutboundFilespecificationtemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FileSpecificationTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FileSpecificationTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create File Specification Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplate> postOutboundFilespecificationtemplates(ApiRequest<FileSpecificationTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FileSpecificationTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Import Template
   * 
   * @param body ImportTemplate (required)
   * @return ImportTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplate postOutboundImporttemplates(ImportTemplate body) throws IOException, ApiException {
    return  postOutboundImporttemplates(createPostOutboundImporttemplatesRequest(body));
  }

  /**
   * Create Import Template
   * 
   * @param body ImportTemplate (required)
   * @return ImportTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplate> postOutboundImporttemplatesWithHttpInfo(ImportTemplate body) throws IOException {
    return postOutboundImporttemplates(createPostOutboundImporttemplatesRequest(body).withHttpInfo());
  }

  private PostOutboundImporttemplatesRequest createPostOutboundImporttemplatesRequest(ImportTemplate body) {
    return PostOutboundImporttemplatesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create Import Template
   * 
   * @param request The request object
   * @return ImportTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplate postOutboundImporttemplates(PostOutboundImporttemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Import Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplate> postOutboundImporttemplates(ApiRequest<ImportTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add multiple import templates
   * 
   * @param body import template(s) to add (required)
   * @return ImportTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplateEntityListing postOutboundImporttemplatesBulkAdd(List<ImportTemplate> body) throws IOException, ApiException {
    return  postOutboundImporttemplatesBulkAdd(createPostOutboundImporttemplatesBulkAddRequest(body));
  }

  /**
   * Add multiple import templates
   * 
   * @param body import template(s) to add (required)
   * @return ImportTemplateEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplateEntityListing> postOutboundImporttemplatesBulkAddWithHttpInfo(List<ImportTemplate> body) throws IOException {
    return postOutboundImporttemplatesBulkAdd(createPostOutboundImporttemplatesBulkAddRequest(body).withHttpInfo());
  }

  private PostOutboundImporttemplatesBulkAddRequest createPostOutboundImporttemplatesBulkAddRequest(List<ImportTemplate> body) {
    return PostOutboundImporttemplatesBulkAddRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Add multiple import templates
   * 
   * @param request The request object
   * @return ImportTemplateEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplateEntityListing postOutboundImporttemplatesBulkAdd(PostOutboundImporttemplatesBulkAddRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportTemplateEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportTemplateEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add multiple import templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplateEntityListing> postOutboundImporttemplatesBulkAdd(ApiRequest<List<ImportTemplate>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportTemplateEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start the campaign
   * Documented permissions are applicable based on campaign type.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundMessagingcampaignStart(String messagingCampaignId) throws IOException, ApiException {
     postOutboundMessagingcampaignStart(createPostOutboundMessagingcampaignStartRequest(messagingCampaignId));
  }

  /**
   * Start the campaign
   * Documented permissions are applicable based on campaign type.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundMessagingcampaignStartWithHttpInfo(String messagingCampaignId) throws IOException {
    return postOutboundMessagingcampaignStart(createPostOutboundMessagingcampaignStartRequest(messagingCampaignId).withHttpInfo());
  }

  private PostOutboundMessagingcampaignStartRequest createPostOutboundMessagingcampaignStartRequest(String messagingCampaignId) {
    return PostOutboundMessagingcampaignStartRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Start the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundMessagingcampaignStart(PostOutboundMessagingcampaignStartRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Start the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundMessagingcampaignStart(ApiRequest<Void> request) throws IOException {
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
   * Stop the campaign
   * Documented permissions are applicable based on campaign type.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundMessagingcampaignStop(String messagingCampaignId) throws IOException, ApiException {
     postOutboundMessagingcampaignStop(createPostOutboundMessagingcampaignStopRequest(messagingCampaignId));
  }

  /**
   * Stop the campaign
   * Documented permissions are applicable based on campaign type.
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundMessagingcampaignStopWithHttpInfo(String messagingCampaignId) throws IOException {
    return postOutboundMessagingcampaignStop(createPostOutboundMessagingcampaignStopRequest(messagingCampaignId).withHttpInfo());
  }

  private PostOutboundMessagingcampaignStopRequest createPostOutboundMessagingcampaignStopRequest(String messagingCampaignId) {
    return PostOutboundMessagingcampaignStopRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .build();
  }

  /**
   * Stop the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundMessagingcampaignStop(PostOutboundMessagingcampaignStopRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Stop the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundMessagingcampaignStop(ApiRequest<Void> request) throws IOException {
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
   * Create a Messaging Campaign
   * 
   * @param body Messaging Campaign (required)
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign postOutboundMessagingcampaigns(MessagingCampaign body) throws IOException, ApiException {
    return  postOutboundMessagingcampaigns(createPostOutboundMessagingcampaignsRequest(body));
  }

  /**
   * Create a Messaging Campaign
   * 
   * @param body Messaging Campaign (required)
   * @return MessagingCampaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> postOutboundMessagingcampaignsWithHttpInfo(MessagingCampaign body) throws IOException {
    return postOutboundMessagingcampaigns(createPostOutboundMessagingcampaignsRequest(body).withHttpInfo());
  }

  private PostOutboundMessagingcampaignsRequest createPostOutboundMessagingcampaignsRequest(MessagingCampaign body) {
    return PostOutboundMessagingcampaignsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Messaging Campaign
   * 
   * @param request The request object
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign postOutboundMessagingcampaigns(PostOutboundMessagingcampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Messaging Campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> postOutboundMessagingcampaigns(ApiRequest<MessagingCampaign> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get progress for a list of messaging campaigns
   * 
   * @param body Messaging Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignProgress> postOutboundMessagingcampaignsProgress(List<String> body) throws IOException, ApiException {
    return  postOutboundMessagingcampaignsProgress(createPostOutboundMessagingcampaignsProgressRequest(body));
  }

  /**
   * Get progress for a list of messaging campaigns
   * 
   * @param body Messaging Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignProgress>> postOutboundMessagingcampaignsProgressWithHttpInfo(List<String> body) throws IOException {
    return postOutboundMessagingcampaignsProgress(createPostOutboundMessagingcampaignsProgressRequest(body).withHttpInfo());
  }

  private PostOutboundMessagingcampaignsProgressRequest createPostOutboundMessagingcampaignsProgressRequest(List<String> body) {
    return PostOutboundMessagingcampaignsProgressRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get progress for a list of messaging campaigns
   * 
   * @param request The request object
   * @return List<CampaignProgress>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignProgress> postOutboundMessagingcampaignsProgress(PostOutboundMessagingcampaignsProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<CampaignProgress>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<CampaignProgress>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get progress for a list of messaging campaigns
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignProgress>> postOutboundMessagingcampaignsProgress(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<CampaignProgress>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Rule Set.
   * 
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet postOutboundRulesets(RuleSet body) throws IOException, ApiException {
    return  postOutboundRulesets(createPostOutboundRulesetsRequest(body));
  }

  /**
   * Create a Rule Set.
   * 
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> postOutboundRulesetsWithHttpInfo(RuleSet body) throws IOException {
    return postOutboundRulesets(createPostOutboundRulesetsRequest(body).withHttpInfo());
  }

  private PostOutboundRulesetsRequest createPostOutboundRulesetsRequest(RuleSet body) {
    return PostOutboundRulesetsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a Rule Set.
   * 
   * @param request The request object
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet postOutboundRulesets(PostOutboundRulesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Rule Set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> postOutboundRulesets(ApiRequest<RuleSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence postOutboundSequences(CampaignSequence body) throws IOException, ApiException {
    return  postOutboundSequences(createPostOutboundSequencesRequest(body));
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> postOutboundSequencesWithHttpInfo(CampaignSequence body) throws IOException {
    return postOutboundSequences(createPostOutboundSequencesRequest(body).withHttpInfo());
  }

  private PostOutboundSequencesRequest createPostOutboundSequencesRequest(CampaignSequence body) {
    return PostOutboundSequencesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param request The request object
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence postOutboundSequences(PostOutboundSequencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> postOutboundSequences(ApiRequest<CampaignSequence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits putOutboundAttemptlimit(String attemptLimitsId, AttemptLimits body) throws IOException, ApiException {
    return  putOutboundAttemptlimit(createPutOutboundAttemptlimitRequest(attemptLimitsId, body));
  }

  /**
   * Update attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> putOutboundAttemptlimitWithHttpInfo(String attemptLimitsId, AttemptLimits body) throws IOException {
    return putOutboundAttemptlimit(createPutOutboundAttemptlimitRequest(attemptLimitsId, body).withHttpInfo());
  }

  private PutOutboundAttemptlimitRequest createPutOutboundAttemptlimitRequest(String attemptLimitsId, AttemptLimits body) {
    return PutOutboundAttemptlimitRequest.builder()
            .withAttemptLimitsId(attemptLimitsId)

            .withBody(body)

            .build();
  }

  /**
   * Update attempt limits
   * 
   * @param request The request object
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits putOutboundAttemptlimit(PutOutboundAttemptlimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> putOutboundAttemptlimit(ApiRequest<AttemptLimits> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet putOutboundCallabletimeset(String callableTimeSetId, CallableTimeSet body) throws IOException, ApiException {
    return  putOutboundCallabletimeset(createPutOutboundCallabletimesetRequest(callableTimeSetId, body));
  }

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> putOutboundCallabletimesetWithHttpInfo(String callableTimeSetId, CallableTimeSet body) throws IOException {
    return putOutboundCallabletimeset(createPutOutboundCallabletimesetRequest(callableTimeSetId, body).withHttpInfo());
  }

  private PutOutboundCallabletimesetRequest createPutOutboundCallabletimesetRequest(String callableTimeSetId, CallableTimeSet body) {
    return PutOutboundCallabletimesetRequest.builder()
            .withCallableTimeSetId(callableTimeSetId)

            .withBody(body)

            .build();
  }

  /**
   * Update callable time set
   * 
   * @param request The request object
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet putOutboundCallabletimeset(PutOutboundCallabletimesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> putOutboundCallabletimeset(ApiRequest<CallableTimeSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet putOutboundCallanalysisresponseset(String callAnalysisSetId, ResponseSet body) throws IOException, ApiException {
    return  putOutboundCallanalysisresponseset(createPutOutboundCallanalysisresponsesetRequest(callAnalysisSetId, body));
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> putOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId, ResponseSet body) throws IOException {
    return putOutboundCallanalysisresponseset(createPutOutboundCallanalysisresponsesetRequest(callAnalysisSetId, body).withHttpInfo());
  }

  private PutOutboundCallanalysisresponsesetRequest createPutOutboundCallanalysisresponsesetRequest(String callAnalysisSetId, ResponseSet body) {
    return PutOutboundCallanalysisresponsesetRequest.builder()
            .withCallAnalysisSetId(callAnalysisSetId)

            .withBody(body)

            .build();
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param request The request object
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet putOutboundCallanalysisresponseset(PutOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> putOutboundCallanalysisresponseset(ApiRequest<ResponseSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (required)
   * @param useMaxCallsPerAgentDecimal Use maxCallsPerAgent with decimal precision (optional)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign putOutboundCampaign(String campaignId, Campaign body, Boolean useMaxCallsPerAgentDecimal) throws IOException, ApiException {
    return  putOutboundCampaign(createPutOutboundCampaignRequest(campaignId, body, useMaxCallsPerAgentDecimal));
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (required)
   * @param useMaxCallsPerAgentDecimal Use maxCallsPerAgent with decimal precision (optional)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> putOutboundCampaignWithHttpInfo(String campaignId, Campaign body, Boolean useMaxCallsPerAgentDecimal) throws IOException {
    return putOutboundCampaign(createPutOutboundCampaignRequest(campaignId, body, useMaxCallsPerAgentDecimal).withHttpInfo());
  }

  private PutOutboundCampaignRequest createPutOutboundCampaignRequest(String campaignId, Campaign body, Boolean useMaxCallsPerAgentDecimal) {
    return PutOutboundCampaignRequest.builder()
            .withCampaignId(campaignId)

            .withBody(body)

            .withUseMaxCallsPerAgentDecimal(useMaxCallsPerAgentDecimal)

            .build();
  }

  /**
   * Update a campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign putOutboundCampaign(PutOutboundCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> putOutboundCampaign(ApiRequest<Campaign> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Send notification that an agent's state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent's user ID (required)
   * @param body agent (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String putOutboundCampaignAgent(String campaignId, String userId, Agent body) throws IOException, ApiException {
    return  putOutboundCampaignAgent(createPutOutboundCampaignAgentRequest(campaignId, userId, body));
  }

  /**
   * Send notification that an agent's state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent's user ID (required)
   * @param body agent (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> putOutboundCampaignAgentWithHttpInfo(String campaignId, String userId, Agent body) throws IOException {
    return putOutboundCampaignAgent(createPutOutboundCampaignAgentRequest(campaignId, userId, body).withHttpInfo());
  }

  private PutOutboundCampaignAgentRequest createPutOutboundCampaignAgentRequest(String campaignId, String userId, Agent body) {
    return PutOutboundCampaignAgentRequest.builder()
            .withCampaignId(campaignId)

            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Send notification that an agent's state changed 
   * New agent state.
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String putOutboundCampaignAgent(PutOutboundCampaignAgentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send notification that an agent's state changed 
   * New agent state.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> putOutboundCampaignAgent(ApiRequest<Agent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule putOutboundCampaignrule(String campaignRuleId, CampaignRule body) throws IOException, ApiException {
    return  putOutboundCampaignrule(createPutOutboundCampaignruleRequest(campaignRuleId, body));
  }

  /**
   * Update Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> putOutboundCampaignruleWithHttpInfo(String campaignRuleId, CampaignRule body) throws IOException {
    return putOutboundCampaignrule(createPutOutboundCampaignruleRequest(campaignRuleId, body).withHttpInfo());
  }

  private PutOutboundCampaignruleRequest createPutOutboundCampaignruleRequest(String campaignRuleId, CampaignRule body) {
    return PutOutboundCampaignruleRequest.builder()
            .withCampaignRuleId(campaignRuleId)

            .withBody(body)

            .build();
  }

  /**
   * Update Campaign Rule
   * 
   * @param request The request object
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule putOutboundCampaignrule(PutOutboundCampaignruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> putOutboundCampaignrule(ApiRequest<CampaignRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList putOutboundContactlist(String contactListId, ContactList body) throws IOException, ApiException {
    return  putOutboundContactlist(createPutOutboundContactlistRequest(contactListId, body));
  }

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (required)
   * @return ContactList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> putOutboundContactlistWithHttpInfo(String contactListId, ContactList body) throws IOException {
    return putOutboundContactlist(createPutOutboundContactlistRequest(contactListId, body).withHttpInfo());
  }

  private PutOutboundContactlistRequest createPutOutboundContactlistRequest(String contactListId, ContactList body) {
    return PutOutboundContactlistRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .build();
  }

  /**
   * Update a contact list.
   * 
   * @param request The request object
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList putOutboundContactlist(PutOutboundContactlistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> putOutboundContactlist(ApiRequest<ContactList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (required)
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact putOutboundContactlistContact(String contactListId, String contactId, DialerContact body) throws IOException, ApiException {
    return  putOutboundContactlistContact(createPutOutboundContactlistContactRequest(contactListId, contactId, body));
  }

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (required)
   * @return DialerContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> putOutboundContactlistContactWithHttpInfo(String contactListId, String contactId, DialerContact body) throws IOException {
    return putOutboundContactlistContact(createPutOutboundContactlistContactRequest(contactListId, contactId, body).withHttpInfo());
  }

  private PutOutboundContactlistContactRequest createPutOutboundContactlistContactRequest(String contactListId, String contactId, DialerContact body) {
    return PutOutboundContactlistContactRequest.builder()
            .withContactListId(contactListId)

            .withContactId(contactId)

            .withBody(body)

            .build();
  }

  /**
   * Update a contact.
   * 
   * @param request The request object
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact putOutboundContactlistContact(PutOutboundContactlistContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DialerContact> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DialerContact>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> putOutboundContactlistContact(ApiRequest<DialerContact> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DialerContact>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Contact List Filter
   * 
   * @param contactListFilterId Contact List Filter ID (required)
   * @param body ContactListFilter (required)
   * @return ContactListFilter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilter putOutboundContactlistfilter(String contactListFilterId, ContactListFilter body) throws IOException, ApiException {
    return  putOutboundContactlistfilter(createPutOutboundContactlistfilterRequest(contactListFilterId, body));
  }

  /**
   * Update Contact List Filter
   * 
   * @param contactListFilterId Contact List Filter ID (required)
   * @param body ContactListFilter (required)
   * @return ContactListFilter
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilter> putOutboundContactlistfilterWithHttpInfo(String contactListFilterId, ContactListFilter body) throws IOException {
    return putOutboundContactlistfilter(createPutOutboundContactlistfilterRequest(contactListFilterId, body).withHttpInfo());
  }

  private PutOutboundContactlistfilterRequest createPutOutboundContactlistfilterRequest(String contactListFilterId, ContactListFilter body) {
    return PutOutboundContactlistfilterRequest.builder()
            .withContactListFilterId(contactListFilterId)

            .withBody(body)

            .build();
  }

  /**
   * Update Contact List Filter
   * 
   * @param request The request object
   * @return ContactListFilter
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListFilter putOutboundContactlistfilter(PutOutboundContactlistfilterRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListFilter> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListFilter>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Contact List Filter
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListFilter> putOutboundContactlistfilter(ApiRequest<ContactListFilter> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListFilter>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a contact list template.
   * 
   * @param contactListTemplateId ContactListTemplate ID (required)
   * @param body ContactListTemplate (required)
   * @return ContactListTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplate putOutboundContactlisttemplate(String contactListTemplateId, ContactListTemplate body) throws IOException, ApiException {
    return  putOutboundContactlisttemplate(createPutOutboundContactlisttemplateRequest(contactListTemplateId, body));
  }

  /**
   * Update a contact list template.
   * 
   * @param contactListTemplateId ContactListTemplate ID (required)
   * @param body ContactListTemplate (required)
   * @return ContactListTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplate> putOutboundContactlisttemplateWithHttpInfo(String contactListTemplateId, ContactListTemplate body) throws IOException {
    return putOutboundContactlisttemplate(createPutOutboundContactlisttemplateRequest(contactListTemplateId, body).withHttpInfo());
  }

  private PutOutboundContactlisttemplateRequest createPutOutboundContactlisttemplateRequest(String contactListTemplateId, ContactListTemplate body) {
    return PutOutboundContactlisttemplateRequest.builder()
            .withContactListTemplateId(contactListTemplateId)

            .withBody(body)

            .build();
  }

  /**
   * Update a contact list template.
   * 
   * @param request The request object
   * @return ContactListTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListTemplate putOutboundContactlisttemplate(PutOutboundContactlisttemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a contact list template.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListTemplate> putOutboundContactlisttemplate(ApiRequest<ContactListTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an Outbound Digital Rule Set
   * 
   * @param digitalRuleSetId The Digital Rule Set ID (required)
   * @param body Digital Rule Set (required)
   * @return DigitalRuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSet putOutboundDigitalruleset(String digitalRuleSetId, DigitalRuleSet body) throws IOException, ApiException {
    return  putOutboundDigitalruleset(createPutOutboundDigitalrulesetRequest(digitalRuleSetId, body));
  }

  /**
   * Update an Outbound Digital Rule Set
   * 
   * @param digitalRuleSetId The Digital Rule Set ID (required)
   * @param body Digital Rule Set (required)
   * @return DigitalRuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSet> putOutboundDigitalrulesetWithHttpInfo(String digitalRuleSetId, DigitalRuleSet body) throws IOException {
    return putOutboundDigitalruleset(createPutOutboundDigitalrulesetRequest(digitalRuleSetId, body).withHttpInfo());
  }

  private PutOutboundDigitalrulesetRequest createPutOutboundDigitalrulesetRequest(String digitalRuleSetId, DigitalRuleSet body) {
    return PutOutboundDigitalrulesetRequest.builder()
            .withDigitalRuleSetId(digitalRuleSetId)

            .withBody(body)

            .build();
  }

  /**
   * Update an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @return DigitalRuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DigitalRuleSet putOutboundDigitalruleset(PutOutboundDigitalrulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DigitalRuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DigitalRuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an Outbound Digital Rule Set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DigitalRuleSet> putOutboundDigitalruleset(ApiRequest<DigitalRuleSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DigitalRuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList putOutboundDnclist(String dncListId, DncList body) throws IOException, ApiException {
    return  putOutboundDnclist(createPutOutboundDnclistRequest(dncListId, body));
  }

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (required)
   * @return DncList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> putOutboundDnclistWithHttpInfo(String dncListId, DncList body) throws IOException {
    return putOutboundDnclist(createPutOutboundDnclistRequest(dncListId, body).withHttpInfo());
  }

  private PutOutboundDnclistRequest createPutOutboundDnclistRequest(String dncListId, DncList body) {
    return PutOutboundDnclistRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)

            .build();
  }

  /**
   * Update dialer DNC list
   * 
   * @param request The request object
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList putOutboundDnclist(PutOutboundDnclistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> putOutboundDnclist(ApiRequest<DncList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update File Specification Template
   * 
   * @param fileSpecificationTemplateId File Specification Template ID (required)
   * @param body fileSpecificationTemplate (required)
   * @return FileSpecificationTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplate putOutboundFilespecificationtemplate(String fileSpecificationTemplateId, FileSpecificationTemplate body) throws IOException, ApiException {
    return  putOutboundFilespecificationtemplate(createPutOutboundFilespecificationtemplateRequest(fileSpecificationTemplateId, body));
  }

  /**
   * Update File Specification Template
   * 
   * @param fileSpecificationTemplateId File Specification Template ID (required)
   * @param body fileSpecificationTemplate (required)
   * @return FileSpecificationTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplate> putOutboundFilespecificationtemplateWithHttpInfo(String fileSpecificationTemplateId, FileSpecificationTemplate body) throws IOException {
    return putOutboundFilespecificationtemplate(createPutOutboundFilespecificationtemplateRequest(fileSpecificationTemplateId, body).withHttpInfo());
  }

  private PutOutboundFilespecificationtemplateRequest createPutOutboundFilespecificationtemplateRequest(String fileSpecificationTemplateId, FileSpecificationTemplate body) {
    return PutOutboundFilespecificationtemplateRequest.builder()
            .withFileSpecificationTemplateId(fileSpecificationTemplateId)

            .withBody(body)

            .build();
  }

  /**
   * Update File Specification Template
   * 
   * @param request The request object
   * @return FileSpecificationTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FileSpecificationTemplate putOutboundFilespecificationtemplate(PutOutboundFilespecificationtemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FileSpecificationTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FileSpecificationTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update File Specification Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FileSpecificationTemplate> putOutboundFilespecificationtemplate(ApiRequest<FileSpecificationTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FileSpecificationTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Import Template
   * 
   * @param importTemplateId Import Template ID (required)
   * @param body importTemplate (required)
   * @return ImportTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplate putOutboundImporttemplate(String importTemplateId, ImportTemplate body) throws IOException, ApiException {
    return  putOutboundImporttemplate(createPutOutboundImporttemplateRequest(importTemplateId, body));
  }

  /**
   * Update Import Template
   * 
   * @param importTemplateId Import Template ID (required)
   * @param body importTemplate (required)
   * @return ImportTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplate> putOutboundImporttemplateWithHttpInfo(String importTemplateId, ImportTemplate body) throws IOException {
    return putOutboundImporttemplate(createPutOutboundImporttemplateRequest(importTemplateId, body).withHttpInfo());
  }

  private PutOutboundImporttemplateRequest createPutOutboundImporttemplateRequest(String importTemplateId, ImportTemplate body) {
    return PutOutboundImporttemplateRequest.builder()
            .withImportTemplateId(importTemplateId)

            .withBody(body)

            .build();
  }

  /**
   * Update Import Template
   * 
   * @param request The request object
   * @return ImportTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportTemplate putOutboundImporttemplate(PutOutboundImporttemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Import Template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportTemplate> putOutboundImporttemplate(ApiRequest<ImportTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an Outbound Messaging Campaign
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @param body MessagingCampaign (required)
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign putOutboundMessagingcampaign(String messagingCampaignId, MessagingCampaign body) throws IOException, ApiException {
    return  putOutboundMessagingcampaign(createPutOutboundMessagingcampaignRequest(messagingCampaignId, body));
  }

  /**
   * Update an Outbound Messaging Campaign
   * 
   * @param messagingCampaignId The Messaging Campaign ID (required)
   * @param body MessagingCampaign (required)
   * @return MessagingCampaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> putOutboundMessagingcampaignWithHttpInfo(String messagingCampaignId, MessagingCampaign body) throws IOException {
    return putOutboundMessagingcampaign(createPutOutboundMessagingcampaignRequest(messagingCampaignId, body).withHttpInfo());
  }

  private PutOutboundMessagingcampaignRequest createPutOutboundMessagingcampaignRequest(String messagingCampaignId, MessagingCampaign body) {
    return PutOutboundMessagingcampaignRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .withBody(body)

            .build();
  }

  /**
   * Update an Outbound Messaging Campaign
   * 
   * @param request The request object
   * @return MessagingCampaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaign putOutboundMessagingcampaign(PutOutboundMessagingcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an Outbound Messaging Campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaign> putOutboundMessagingcampaign(ApiRequest<MessagingCampaign> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Rule Set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet putOutboundRuleset(String ruleSetId, RuleSet body) throws IOException, ApiException {
    return  putOutboundRuleset(createPutOutboundRulesetRequest(ruleSetId, body));
  }

  /**
   * Update a Rule Set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> putOutboundRulesetWithHttpInfo(String ruleSetId, RuleSet body) throws IOException {
    return putOutboundRuleset(createPutOutboundRulesetRequest(ruleSetId, body).withHttpInfo());
  }

  private PutOutboundRulesetRequest createPutOutboundRulesetRequest(String ruleSetId, RuleSet body) {
    return PutOutboundRulesetRequest.builder()
            .withRuleSetId(ruleSetId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Rule Set.
   * 
   * @param request The request object
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet putOutboundRuleset(PutOutboundRulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Rule Set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> putOutboundRuleset(ApiRequest<RuleSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (required)
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule putOutboundSchedulesCampaign(String campaignId, CampaignSchedule body) throws IOException, ApiException {
    return  putOutboundSchedulesCampaign(createPutOutboundSchedulesCampaignRequest(campaignId, body));
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (required)
   * @return CampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> putOutboundSchedulesCampaignWithHttpInfo(String campaignId, CampaignSchedule body) throws IOException {
    return putOutboundSchedulesCampaign(createPutOutboundSchedulesCampaignRequest(campaignId, body).withHttpInfo());
  }

  private PutOutboundSchedulesCampaignRequest createPutOutboundSchedulesCampaignRequest(String campaignId, CampaignSchedule body) {
    return PutOutboundSchedulesCampaignRequest.builder()
            .withCampaignId(campaignId)

            .withBody(body)

            .build();
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param request The request object
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule putOutboundSchedulesCampaign(PutOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> putOutboundSchedulesCampaign(ApiRequest<CampaignSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an email campaign schedule.
   * 
   * @param emailCampaignId Email Campaign ID (required)
   * @param body EmailCampaignSchedule (required)
   * @return EmailCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailCampaignSchedule putOutboundSchedulesEmailcampaign(String emailCampaignId, EmailCampaignSchedule body) throws IOException, ApiException {
    return  putOutboundSchedulesEmailcampaign(createPutOutboundSchedulesEmailcampaignRequest(emailCampaignId, body));
  }

  /**
   * Update an email campaign schedule.
   * 
   * @param emailCampaignId Email Campaign ID (required)
   * @param body EmailCampaignSchedule (required)
   * @return EmailCampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailCampaignSchedule> putOutboundSchedulesEmailcampaignWithHttpInfo(String emailCampaignId, EmailCampaignSchedule body) throws IOException {
    return putOutboundSchedulesEmailcampaign(createPutOutboundSchedulesEmailcampaignRequest(emailCampaignId, body).withHttpInfo());
  }

  private PutOutboundSchedulesEmailcampaignRequest createPutOutboundSchedulesEmailcampaignRequest(String emailCampaignId, EmailCampaignSchedule body) {
    return PutOutboundSchedulesEmailcampaignRequest.builder()
            .withEmailCampaignId(emailCampaignId)

            .withBody(body)

            .build();
  }

  /**
   * Update an email campaign schedule.
   * 
   * @param request The request object
   * @return EmailCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmailCampaignSchedule putOutboundSchedulesEmailcampaign(PutOutboundSchedulesEmailcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmailCampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmailCampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an email campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmailCampaignSchedule> putOutboundSchedulesEmailcampaign(ApiRequest<EmailCampaignSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmailCampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a new messaging campaign schedule.
   * 
   * @param messagingCampaignId Messaging Campaign ID (required)
   * @param body MessagingCampaignSchedule (required)
   * @return MessagingCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignSchedule putOutboundSchedulesMessagingcampaign(String messagingCampaignId, MessagingCampaignSchedule body) throws IOException, ApiException {
    return  putOutboundSchedulesMessagingcampaign(createPutOutboundSchedulesMessagingcampaignRequest(messagingCampaignId, body));
  }

  /**
   * Update a new messaging campaign schedule.
   * 
   * @param messagingCampaignId Messaging Campaign ID (required)
   * @param body MessagingCampaignSchedule (required)
   * @return MessagingCampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignSchedule> putOutboundSchedulesMessagingcampaignWithHttpInfo(String messagingCampaignId, MessagingCampaignSchedule body) throws IOException {
    return putOutboundSchedulesMessagingcampaign(createPutOutboundSchedulesMessagingcampaignRequest(messagingCampaignId, body).withHttpInfo());
  }

  private PutOutboundSchedulesMessagingcampaignRequest createPutOutboundSchedulesMessagingcampaignRequest(String messagingCampaignId, MessagingCampaignSchedule body) {
    return PutOutboundSchedulesMessagingcampaignRequest.builder()
            .withMessagingCampaignId(messagingCampaignId)

            .withBody(body)

            .build();
  }

  /**
   * Update a new messaging campaign schedule.
   * 
   * @param request The request object
   * @return MessagingCampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MessagingCampaignSchedule putOutboundSchedulesMessagingcampaign(PutOutboundSchedulesMessagingcampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MessagingCampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MessagingCampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a new messaging campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MessagingCampaignSchedule> putOutboundSchedulesMessagingcampaign(ApiRequest<MessagingCampaignSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MessagingCampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (required)
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule putOutboundSchedulesSequence(String sequenceId, SequenceSchedule body) throws IOException, ApiException {
    return  putOutboundSchedulesSequence(createPutOutboundSchedulesSequenceRequest(sequenceId, body));
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (required)
   * @return SequenceSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> putOutboundSchedulesSequenceWithHttpInfo(String sequenceId, SequenceSchedule body) throws IOException {
    return putOutboundSchedulesSequence(createPutOutboundSchedulesSequenceRequest(sequenceId, body).withHttpInfo());
  }

  private PutOutboundSchedulesSequenceRequest createPutOutboundSchedulesSequenceRequest(String sequenceId, SequenceSchedule body) {
    return PutOutboundSchedulesSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .withBody(body)

            .build();
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param request The request object
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule putOutboundSchedulesSequence(PutOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SequenceSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> putOutboundSchedulesSequence(ApiRequest<SequenceSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SequenceSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence putOutboundSequence(String sequenceId, CampaignSequence body) throws IOException, ApiException {
    return  putOutboundSequence(createPutOutboundSequenceRequest(sequenceId, body));
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> putOutboundSequenceWithHttpInfo(String sequenceId, CampaignSequence body) throws IOException {
    return putOutboundSequence(createPutOutboundSequenceRequest(sequenceId, body).withHttpInfo());
  }

  private PutOutboundSequenceRequest createPutOutboundSequenceRequest(String sequenceId, CampaignSequence body) {
    return PutOutboundSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .withBody(body)

            .build();
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param request The request object
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence putOutboundSequence(PutOutboundSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> putOutboundSequence(ApiRequest<CampaignSequence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (required)
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping putOutboundWrapupcodemappings(WrapUpCodeMapping body) throws IOException, ApiException {
    return  putOutboundWrapupcodemappings(createPutOutboundWrapupcodemappingsRequest(body));
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (required)
   * @return WrapUpCodeMapping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> putOutboundWrapupcodemappingsWithHttpInfo(WrapUpCodeMapping body) throws IOException {
    return putOutboundWrapupcodemappings(createPutOutboundWrapupcodemappingsRequest(body).withHttpInfo());
  }

  private PutOutboundWrapupcodemappingsRequest createPutOutboundWrapupcodemappingsRequest(WrapUpCodeMapping body) {
    return PutOutboundWrapupcodemappingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping putOutboundWrapupcodemappings(PutOutboundWrapupcodemappingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapUpCodeMapping> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> putOutboundWrapupcodemappings(ApiRequest<WrapUpCodeMapping> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapUpCodeMapping>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
