package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
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
import java.util.concurrent.Future;

public class OutboundApiAsync {
  private final ApiClient pcapiClient;

  public OutboundApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public OutboundApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundAttemptlimitAsync(DeleteOutboundAttemptlimitRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundAttemptlimitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundCallabletimesetAsync(DeleteOutboundCallabletimesetRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundCallabletimesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundCallanalysisresponsesetAsync(DeleteOutboundCallanalysisresponsesetRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundCallanalysisresponsesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Campaign> deleteOutboundCampaignAsync(DeleteOutboundCampaignRequest request, final AsyncApiCallback<Campaign> callback) {
    try {
      final SettableFuture<Campaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Campaign>> deleteOutboundCampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Campaign>> callback) {
    try {
      final SettableFuture<ApiResponse<Campaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundCampaignProgressAsync(DeleteOutboundCampaignProgressRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundCampaignProgressAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundCampaignruleAsync(DeleteOutboundCampaignruleRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundCampaignruleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundContactlistAsync(DeleteOutboundContactlistRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundContactlistAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundContactlistContactAsync(DeleteOutboundContactlistContactRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundContactlistContactAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete contacts from a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundContactlistContactsAsync(DeleteOutboundContactlistContactsRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete contacts from a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundContactlistContactsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Contact List Filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundContactlistfilterAsync(DeleteOutboundContactlistfilterRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Contact List Filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundContactlistfilterAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple contact lists.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundContactlistsAsync(DeleteOutboundContactlistsRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple contact lists.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundContactlistsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Contact List Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundContactlisttemplateAsync(DeleteOutboundContactlisttemplateRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Contact List Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundContactlisttemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple contact list templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundContactlisttemplatesAsync(DeleteOutboundContactlisttemplatesRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple contact list templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundContactlisttemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundDigitalrulesetAsync(DeleteOutboundDigitalrulesetRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundDigitalrulesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundDnclistAsync(DeleteOutboundDnclistRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundDnclistAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired custom exclusion column entries from a DNC list.
   * This operation is only for Internal DNC lists of custom exclusion column entries
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundDnclistCustomexclusioncolumnsAsync(DeleteOutboundDnclistCustomexclusioncolumnsRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired custom exclusion column entries from a DNC list.
   * This operation is only for Internal DNC lists of custom exclusion column entries
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundDnclistCustomexclusioncolumnsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired email addresses from a DNC list.
   * This operation is Only for Internal DNC lists of email addresses
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundDnclistEmailaddressesAsync(DeleteOutboundDnclistEmailaddressesRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired email addresses from a DNC list.
   * This operation is Only for Internal DNC lists of email addresses
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundDnclistEmailaddressesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired phone numbers from a DNC list.
   * This operation is Only for Internal DNC lists of phone numbers
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundDnclistPhonenumbersAsync(DeleteOutboundDnclistPhonenumbersRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired phone numbers from a DNC list.
   * This operation is Only for Internal DNC lists of phone numbers
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundDnclistPhonenumbersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired whatsApp numbers from a DNC list.
   * This operation is only for Internal DNC lists of whatsApp numbers
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundDnclistWhatsappnumbersAsync(DeleteOutboundDnclistWhatsappnumbersRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all or expired whatsApp numbers from a DNC list.
   * This operation is only for Internal DNC lists of whatsApp numbers
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundDnclistWhatsappnumbersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundFilespecificationtemplateAsync(DeleteOutboundFilespecificationtemplateRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundFilespecificationtemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple file specification templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundFilespecificationtemplatesBulkAsync(DeleteOutboundFilespecificationtemplatesBulkRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple file specification templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundFilespecificationtemplatesBulkAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundImporttemplateAsync(DeleteOutboundImporttemplateRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundImporttemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple import templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundImporttemplatesAsync(DeleteOutboundImporttemplatesRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete multiple import templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundImporttemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an Outbound Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaign> deleteOutboundMessagingcampaignAsync(DeleteOutboundMessagingcampaignRequest request, final AsyncApiCallback<MessagingCampaign> callback) {
    try {
      final SettableFuture<MessagingCampaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an Outbound Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaign>> deleteOutboundMessagingcampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaign>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reset messaging campaign progress and recycle the messaging campaign
   * Documented permissions are applicable based on campaign type.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundMessagingcampaignProgressAsync(DeleteOutboundMessagingcampaignProgressRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reset messaging campaign progress and recycle the messaging campaign
   * Documented permissions are applicable based on campaign type.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundMessagingcampaignProgressAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Rule Set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundRulesetAsync(DeleteOutboundRulesetRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Rule Set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundRulesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundSchedulesCampaignAsync(DeleteOutboundSchedulesCampaignRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundSchedulesCampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an email campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundSchedulesEmailcampaignAsync(DeleteOutboundSchedulesEmailcampaignRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an email campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundSchedulesEmailcampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a messaging campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundSchedulesMessagingcampaignAsync(DeleteOutboundSchedulesMessagingcampaignRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a messaging campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundSchedulesMessagingcampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundSchedulesSequenceAsync(DeleteOutboundSchedulesSequenceRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundSchedulesSequenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOutboundSequenceAsync(DeleteOutboundSequenceRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOutboundSequenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AttemptLimits> getOutboundAttemptlimitAsync(GetOutboundAttemptlimitRequest request, final AsyncApiCallback<AttemptLimits> callback) {
    try {
      final SettableFuture<AttemptLimits> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AttemptLimits>() {}, new AsyncApiCallback<ApiResponse<AttemptLimits>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimits> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AttemptLimits>> getOutboundAttemptlimitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AttemptLimits>> callback) {
    try {
      final SettableFuture<ApiResponse<AttemptLimits>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AttemptLimits>() {}, new AsyncApiCallback<ApiResponse<AttemptLimits>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimits> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query attempt limits list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AttemptLimitsEntityListing> getOutboundAttemptlimitsAsync(GetOutboundAttemptlimitsRequest request, final AsyncApiCallback<AttemptLimitsEntityListing> callback) {
    try {
      final SettableFuture<AttemptLimitsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AttemptLimitsEntityListing>() {}, new AsyncApiCallback<ApiResponse<AttemptLimitsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimitsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query attempt limits list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AttemptLimitsEntityListing>> getOutboundAttemptlimitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AttemptLimitsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AttemptLimitsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AttemptLimitsEntityListing>() {}, new AsyncApiCallback<ApiResponse<AttemptLimitsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimitsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimitsEntityListing> response = (ApiResponse<AttemptLimitsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimitsEntityListing> response = (ApiResponse<AttemptLimitsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallableTimeSet> getOutboundCallabletimesetAsync(GetOutboundCallabletimesetRequest request, final AsyncApiCallback<CallableTimeSet> callback) {
    try {
      final SettableFuture<CallableTimeSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSet>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallableTimeSet>> getOutboundCallabletimesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CallableTimeSet>> callback) {
    try {
      final SettableFuture<ApiResponse<CallableTimeSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallableTimeSet>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSet>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query callable time set list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallableTimeSetEntityListing> getOutboundCallabletimesetsAsync(GetOutboundCallabletimesetsRequest request, final AsyncApiCallback<CallableTimeSetEntityListing> callback) {
    try {
      final SettableFuture<CallableTimeSetEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallableTimeSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSetEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query callable time set list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallableTimeSetEntityListing>> getOutboundCallabletimesetsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CallableTimeSetEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CallableTimeSetEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallableTimeSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSetEntityListing> response = (ApiResponse<CallableTimeSetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSetEntityListing> response = (ApiResponse<CallableTimeSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ResponseSet> getOutboundCallanalysisresponsesetAsync(GetOutboundCallanalysisresponsesetRequest request, final AsyncApiCallback<ResponseSet> callback) {
    try {
      final SettableFuture<ResponseSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ResponseSet>() {}, new AsyncApiCallback<ApiResponse<ResponseSet>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ResponseSet>> getOutboundCallanalysisresponsesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ResponseSet>> callback) {
    try {
      final SettableFuture<ApiResponse<ResponseSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ResponseSet>() {}, new AsyncApiCallback<ApiResponse<ResponseSet>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ResponseSetEntityListing> getOutboundCallanalysisresponsesetsAsync(GetOutboundCallanalysisresponsesetsRequest request, final AsyncApiCallback<ResponseSetEntityListing> callback) {
    try {
      final SettableFuture<ResponseSetEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ResponseSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<ResponseSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSetEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ResponseSetEntityListing>> getOutboundCallanalysisresponsesetsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ResponseSetEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ResponseSetEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ResponseSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<ResponseSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSetEntityListing> response = (ApiResponse<ResponseSetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSetEntityListing> response = (ApiResponse<ResponseSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Campaign> getOutboundCampaignAsync(GetOutboundCampaignRequest request, final AsyncApiCallback<Campaign> callback) {
    try {
      final SettableFuture<Campaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Campaign>> getOutboundCampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Campaign>> callback) {
    try {
      final SettableFuture<ApiResponse<Campaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgentOwnedMappingPreviewListing> getOutboundCampaignAgentownedmappingpreviewResultsAsync(GetOutboundCampaignAgentownedmappingpreviewResultsRequest request, final AsyncApiCallback<AgentOwnedMappingPreviewListing> callback) {
    try {
      final SettableFuture<AgentOwnedMappingPreviewListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgentOwnedMappingPreviewListing>() {}, new AsyncApiCallback<ApiResponse<AgentOwnedMappingPreviewListing>>() {
        @Override
        public void onCompleted(ApiResponse<AgentOwnedMappingPreviewListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgentOwnedMappingPreviewListing>> getOutboundCampaignAgentownedmappingpreviewResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgentOwnedMappingPreviewListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AgentOwnedMappingPreviewListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgentOwnedMappingPreviewListing>() {}, new AsyncApiCallback<ApiResponse<AgentOwnedMappingPreviewListing>>() {
        @Override
        public void onCompleted(ApiResponse<AgentOwnedMappingPreviewListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentOwnedMappingPreviewListing> response = (ApiResponse<AgentOwnedMappingPreviewListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentOwnedMappingPreviewListing> response = (ApiResponse<AgentOwnedMappingPreviewListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get campaign diagnostics
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignDiagnostics> getOutboundCampaignDiagnosticsAsync(GetOutboundCampaignDiagnosticsRequest request, final AsyncApiCallback<CampaignDiagnostics> callback) {
    try {
      final SettableFuture<CampaignDiagnostics> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignDiagnostics>() {}, new AsyncApiCallback<ApiResponse<CampaignDiagnostics>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignDiagnostics> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get campaign diagnostics
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignDiagnostics>> getOutboundCampaignDiagnosticsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignDiagnostics>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignDiagnostics>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignDiagnostics>() {}, new AsyncApiCallback<ApiResponse<CampaignDiagnostics>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignDiagnostics> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignDiagnostics> response = (ApiResponse<CampaignDiagnostics>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignDiagnostics> response = (ApiResponse<CampaignDiagnostics>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignInteractions> getOutboundCampaignInteractionsAsync(GetOutboundCampaignInteractionsRequest request, final AsyncApiCallback<CampaignInteractions> callback) {
    try {
      final SettableFuture<CampaignInteractions> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignInteractions>() {}, new AsyncApiCallback<ApiResponse<CampaignInteractions>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignInteractions> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignInteractions>> getOutboundCampaignInteractionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignInteractions>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignInteractions>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignInteractions>() {}, new AsyncApiCallback<ApiResponse<CampaignInteractions>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignInteractions> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignInteractions> response = (ApiResponse<CampaignInteractions>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignInteractions> response = (ApiResponse<CampaignInteractions>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get line distribution information for campaigns using same Edge Group or Site as given campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignOutboundLinesDistribution> getOutboundCampaignLinedistributionAsync(GetOutboundCampaignLinedistributionRequest request, final AsyncApiCallback<CampaignOutboundLinesDistribution> callback) {
    try {
      final SettableFuture<CampaignOutboundLinesDistribution> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignOutboundLinesDistribution>() {}, new AsyncApiCallback<ApiResponse<CampaignOutboundLinesDistribution>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignOutboundLinesDistribution> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get line distribution information for campaigns using same Edge Group or Site as given campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignOutboundLinesDistribution>> getOutboundCampaignLinedistributionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignOutboundLinesDistribution>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignOutboundLinesDistribution>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignOutboundLinesDistribution>() {}, new AsyncApiCallback<ApiResponse<CampaignOutboundLinesDistribution>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignOutboundLinesDistribution> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignOutboundLinesDistribution> response = (ApiResponse<CampaignOutboundLinesDistribution>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignOutboundLinesDistribution> response = (ApiResponse<CampaignOutboundLinesDistribution>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get campaign progress
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignProgress> getOutboundCampaignProgressAsync(GetOutboundCampaignProgressRequest request, final AsyncApiCallback<CampaignProgress> callback) {
    try {
      final SettableFuture<CampaignProgress> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignProgress>() {}, new AsyncApiCallback<ApiResponse<CampaignProgress>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignProgress> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get campaign progress
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignProgress>> getOutboundCampaignProgressAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignProgress>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignProgress>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignProgress>() {}, new AsyncApiCallback<ApiResponse<CampaignProgress>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignProgress> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the remaining and total contact count for each skill combination in a skills campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PagedSkillCombinationListing> getOutboundCampaignSkillcombinationsAsync(GetOutboundCampaignSkillcombinationsRequest request, final AsyncApiCallback<PagedSkillCombinationListing> callback) {
    try {
      final SettableFuture<PagedSkillCombinationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PagedSkillCombinationListing>() {}, new AsyncApiCallback<ApiResponse<PagedSkillCombinationListing>>() {
        @Override
        public void onCompleted(ApiResponse<PagedSkillCombinationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the remaining and total contact count for each skill combination in a skills campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PagedSkillCombinationListing>> getOutboundCampaignSkillcombinationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PagedSkillCombinationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<PagedSkillCombinationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PagedSkillCombinationListing>() {}, new AsyncApiCallback<ApiResponse<PagedSkillCombinationListing>>() {
        @Override
        public void onCompleted(ApiResponse<PagedSkillCombinationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedSkillCombinationListing> response = (ApiResponse<PagedSkillCombinationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedSkillCombinationListing> response = (ApiResponse<PagedSkillCombinationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignStats> getOutboundCampaignStatsAsync(GetOutboundCampaignStatsRequest request, final AsyncApiCallback<CampaignStats> callback) {
    try {
      final SettableFuture<CampaignStats> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignStats>() {}, new AsyncApiCallback<ApiResponse<CampaignStats>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignStats> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignStats>> getOutboundCampaignStatsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignStats>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignStats>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignStats>() {}, new AsyncApiCallback<ApiResponse<CampaignStats>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignStats> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignStats> response = (ApiResponse<CampaignStats>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignStats> response = (ApiResponse<CampaignStats>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignRule> getOutboundCampaignruleAsync(GetOutboundCampaignruleRequest request, final AsyncApiCallback<CampaignRule> callback) {
    try {
      final SettableFuture<CampaignRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignRule>() {}, new AsyncApiCallback<ApiResponse<CampaignRule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignRule>> getOutboundCampaignruleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignRule>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignRule>() {}, new AsyncApiCallback<ApiResponse<CampaignRule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Campaign Rule list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignRuleEntityListing> getOutboundCampaignrulesAsync(GetOutboundCampaignrulesRequest request, final AsyncApiCallback<CampaignRuleEntityListing> callback) {
    try {
      final SettableFuture<CampaignRuleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignRuleEntityListing>() {}, new AsyncApiCallback<ApiResponse<CampaignRuleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRuleEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Campaign Rule list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignRuleEntityListing>> getOutboundCampaignrulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignRuleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignRuleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignRuleEntityListing>() {}, new AsyncApiCallback<ApiResponse<CampaignRuleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRuleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRuleEntityListing> response = (ApiResponse<CampaignRuleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRuleEntityListing> response = (ApiResponse<CampaignRuleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignEntityListing> getOutboundCampaignsAsync(GetOutboundCampaignsRequest request, final AsyncApiCallback<CampaignEntityListing> callback) {
    try {
      final SettableFuture<CampaignEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignEntityListing>() {}, new AsyncApiCallback<ApiResponse<CampaignEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignEntityListing>> getOutboundCampaignsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignEntityListing>() {}, new AsyncApiCallback<ApiResponse<CampaignEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignEntityListing> response = (ApiResponse<CampaignEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignEntityListing> response = (ApiResponse<CampaignEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query across all types of campaigns by division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonCampaignEntityListing> getOutboundCampaignsAllAsync(GetOutboundCampaignsAllRequest request, final AsyncApiCallback<CommonCampaignEntityListing> callback) {
    try {
      final SettableFuture<CommonCampaignEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonCampaignEntityListing>() {}, new AsyncApiCallback<ApiResponse<CommonCampaignEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CommonCampaignEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query across all types of campaigns by division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonCampaignEntityListing>> getOutboundCampaignsAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CommonCampaignEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonCampaignEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonCampaignEntityListing>() {}, new AsyncApiCallback<ApiResponse<CommonCampaignEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CommonCampaignEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonCampaignEntityListing> response = (ApiResponse<CommonCampaignEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonCampaignEntityListing> response = (ApiResponse<CommonCampaignEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query across all types of campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonCampaignDivisionViewEntityListing> getOutboundCampaignsAllDivisionviewsAsync(GetOutboundCampaignsAllDivisionviewsRequest request, final AsyncApiCallback<CommonCampaignDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<CommonCampaignDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonCampaignDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<CommonCampaignDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CommonCampaignDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query across all types of campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonCampaignDivisionViewEntityListing>> getOutboundCampaignsAllDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CommonCampaignDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonCampaignDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonCampaignDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<CommonCampaignDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CommonCampaignDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonCampaignDivisionViewEntityListing> response = (ApiResponse<CommonCampaignDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonCampaignDivisionViewEntityListing> response = (ApiResponse<CommonCampaignDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic Campaign information object
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignDivisionView> getOutboundCampaignsDivisionviewAsync(GetOutboundCampaignsDivisionviewRequest request, final AsyncApiCallback<CampaignDivisionView> callback) {
    try {
      final SettableFuture<CampaignDivisionView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignDivisionView>() {}, new AsyncApiCallback<ApiResponse<CampaignDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignDivisionView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic Campaign information object
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignDivisionView>> getOutboundCampaignsDivisionviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignDivisionView>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignDivisionView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignDivisionView>() {}, new AsyncApiCallback<ApiResponse<CampaignDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignDivisionView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignDivisionView> response = (ApiResponse<CampaignDivisionView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignDivisionView> response = (ApiResponse<CampaignDivisionView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of basic Campaign information objects
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignDivisionViewListing> getOutboundCampaignsDivisionviewsAsync(GetOutboundCampaignsDivisionviewsRequest request, final AsyncApiCallback<CampaignDivisionViewListing> callback) {
    try {
      final SettableFuture<CampaignDivisionViewListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<CampaignDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignDivisionViewListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of basic Campaign information objects
   * This returns a simplified version of a Campaign, consisting of name and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignDivisionViewListing>> getOutboundCampaignsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignDivisionViewListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignDivisionViewListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<CampaignDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignDivisionViewListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignDivisionViewListing> response = (ApiResponse<CampaignDivisionViewListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignDivisionViewListing> response = (ApiResponse<CampaignDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactList> getOutboundContactlistAsync(GetOutboundContactlistRequest request, final AsyncApiCallback<ContactList> callback) {
    try {
      final SettableFuture<ContactList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactList>() {}, new AsyncApiCallback<ApiResponse<ContactList>>() {
        @Override
        public void onCompleted(ApiResponse<ContactList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactList>> getOutboundContactlistAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactList>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactList>() {}, new AsyncApiCallback<ApiResponse<ContactList>>() {
        @Override
        public void onCompleted(ApiResponse<ContactList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DialerContact> getOutboundContactlistContactAsync(GetOutboundContactlistContactRequest request, final AsyncApiCallback<DialerContact> callback) {
    try {
      final SettableFuture<DialerContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DialerContact>() {}, new AsyncApiCallback<ApiResponse<DialerContact>>() {
        @Override
        public void onCompleted(ApiResponse<DialerContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DialerContact>> getOutboundContactlistContactAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DialerContact>> callback) {
    try {
      final SettableFuture<ApiResponse<DialerContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DialerContact>() {}, new AsyncApiCallback<ApiResponse<DialerContact>>() {
        @Override
        public void onCompleted(ApiResponse<DialerContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get bulk operation job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactsBulkOperationJob> getOutboundContactlistContactsBulkJobAsync(GetOutboundContactlistContactsBulkJobRequest request, final AsyncApiCallback<ContactsBulkOperationJob> callback) {
    try {
      final SettableFuture<ContactsBulkOperationJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJob>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get bulk operation job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactsBulkOperationJob>> getOutboundContactlistContactsBulkJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactsBulkOperationJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactsBulkOperationJob>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get 10 most recent bulk operation jobs associated with contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactsBulkOperationJobListing> getOutboundContactlistContactsBulkJobsAsync(GetOutboundContactlistContactsBulkJobsRequest request, final AsyncApiCallback<ContactsBulkOperationJobListing> callback) {
    try {
      final SettableFuture<ContactsBulkOperationJobListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJobListing>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJobListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get 10 most recent bulk operation jobs associated with contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactsBulkOperationJobListing>> getOutboundContactlistContactsBulkJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactsBulkOperationJobListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactsBulkOperationJobListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactsBulkOperationJobListing>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJobListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJobListing> response = (ApiResponse<ContactsBulkOperationJobListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJobListing> response = (ApiResponse<ContactsBulkOperationJobListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExportUri> getOutboundContactlistExportAsync(GetOutboundContactlistExportRequest request, final AsyncApiCallback<ExportUri> callback) {
    try {
      final SettableFuture<ExportUri> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExportUri>() {}, new AsyncApiCallback<ApiResponse<ExportUri>>() {
        @Override
        public void onCompleted(ApiResponse<ExportUri> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExportUri>> getOutboundContactlistExportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExportUri>> callback) {
    try {
      final SettableFuture<ApiResponse<ExportUri>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExportUri>() {}, new AsyncApiCallback<ApiResponse<ExportUri>>() {
        @Override
        public void onCompleted(ApiResponse<ExportUri> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportStatus> getOutboundContactlistImportstatusAsync(GetOutboundContactlistImportstatusRequest request, final AsyncApiCallback<ImportStatus> callback) {
    try {
      final SettableFuture<ImportStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportStatus>() {}, new AsyncApiCallback<ApiResponse<ImportStatus>>() {
        @Override
        public void onCompleted(ApiResponse<ImportStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportStatus>> getOutboundContactlistImportstatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ImportStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportStatus>() {}, new AsyncApiCallback<ApiResponse<ImportStatus>>() {
        @Override
        public void onCompleted(ApiResponse<ImportStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Preview the result of applying Automatic Time Zone Mapping to a contact list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeZoneMappingPreview> getOutboundContactlistTimezonemappingpreviewAsync(GetOutboundContactlistTimezonemappingpreviewRequest request, final AsyncApiCallback<TimeZoneMappingPreview> callback) {
    try {
      final SettableFuture<TimeZoneMappingPreview> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeZoneMappingPreview>() {}, new AsyncApiCallback<ApiResponse<TimeZoneMappingPreview>>() {
        @Override
        public void onCompleted(ApiResponse<TimeZoneMappingPreview> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Preview the result of applying Automatic Time Zone Mapping to a contact list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeZoneMappingPreview>> getOutboundContactlistTimezonemappingpreviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeZoneMappingPreview>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeZoneMappingPreview>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeZoneMappingPreview>() {}, new AsyncApiCallback<ApiResponse<TimeZoneMappingPreview>>() {
        @Override
        public void onCompleted(ApiResponse<TimeZoneMappingPreview> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeZoneMappingPreview> response = (ApiResponse<TimeZoneMappingPreview>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeZoneMappingPreview> response = (ApiResponse<TimeZoneMappingPreview>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contact list filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListFilter> getOutboundContactlistfilterAsync(GetOutboundContactlistfilterRequest request, final AsyncApiCallback<ContactListFilter> callback) {
    try {
      final SettableFuture<ContactListFilter> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListFilter>() {}, new AsyncApiCallback<ApiResponse<ContactListFilter>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilter> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contact list filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListFilter>> getOutboundContactlistfilterAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListFilter>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListFilter>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListFilter>() {}, new AsyncApiCallback<ApiResponse<ContactListFilter>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilter> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Contact list filters
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListFilterEntityListing> getOutboundContactlistfiltersAsync(GetOutboundContactlistfiltersRequest request, final AsyncApiCallback<ContactListFilterEntityListing> callback) {
    try {
      final SettableFuture<ContactListFilterEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListFilterEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListFilterEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilterEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Contact list filters
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListFilterEntityListing>> getOutboundContactlistfiltersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListFilterEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListFilterEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListFilterEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListFilterEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilterEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of contact lists.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListEntityListing> getOutboundContactlistsAsync(GetOutboundContactlistsRequest request, final AsyncApiCallback<ContactListEntityListing> callback) {
    try {
      final SettableFuture<ContactListEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of contact lists.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListEntityListing>> getOutboundContactlistsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListEntityListing> response = (ApiResponse<ContactListEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListEntityListing> response = (ApiResponse<ContactListEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic ContactList information object
   * This returns a simplified version of a ContactList, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListDivisionView> getOutboundContactlistsDivisionviewAsync(GetOutboundContactlistsDivisionviewRequest request, final AsyncApiCallback<ContactListDivisionView> callback) {
    try {
      final SettableFuture<ContactListDivisionView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListDivisionView>() {}, new AsyncApiCallback<ApiResponse<ContactListDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListDivisionView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic ContactList information object
   * This returns a simplified version of a ContactList, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListDivisionView>> getOutboundContactlistsDivisionviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListDivisionView>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListDivisionView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListDivisionView>() {}, new AsyncApiCallback<ApiResponse<ContactListDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListDivisionView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListDivisionView> response = (ApiResponse<ContactListDivisionView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListDivisionView> response = (ApiResponse<ContactListDivisionView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of simplified contact list objects.
   * This return a simplified version of contact lists, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListDivisionViewListing> getOutboundContactlistsDivisionviewsAsync(GetOutboundContactlistsDivisionviewsRequest request, final AsyncApiCallback<ContactListDivisionViewListing> callback) {
    try {
      final SettableFuture<ContactListDivisionViewListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<ContactListDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListDivisionViewListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of simplified contact list objects.
   * This return a simplified version of contact lists, consisting of the name, division, column names, phone columns, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListDivisionViewListing>> getOutboundContactlistsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListDivisionViewListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListDivisionViewListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<ContactListDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListDivisionViewListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListDivisionViewListing> response = (ApiResponse<ContactListDivisionViewListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListDivisionViewListing> response = (ApiResponse<ContactListDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contact List Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListTemplate> getOutboundContactlisttemplateAsync(GetOutboundContactlisttemplateRequest request, final AsyncApiCallback<ContactListTemplate> callback) {
    try {
      final SettableFuture<ContactListTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListTemplate>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Contact List Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListTemplate>> getOutboundContactlisttemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListTemplate>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of contact list templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListTemplateEntityListing> getOutboundContactlisttemplatesAsync(GetOutboundContactlisttemplatesRequest request, final AsyncApiCallback<ContactListTemplateEntityListing> callback) {
    try {
      final SettableFuture<ContactListTemplateEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplateEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of contact list templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListTemplateEntityListing>> getOutboundContactlisttemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListTemplateEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplateEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DigitalRuleSet> getOutboundDigitalrulesetAsync(GetOutboundDigitalrulesetRequest request, final AsyncApiCallback<DigitalRuleSet> callback) {
    try {
      final SettableFuture<DigitalRuleSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DigitalRuleSet>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DigitalRuleSet>> getOutboundDigitalrulesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DigitalRuleSet>> callback) {
    try {
      final SettableFuture<ApiResponse<DigitalRuleSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DigitalRuleSet>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of Outbound Digital Rule Sets
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DigitalRuleSetEntityListing> getOutboundDigitalrulesetsAsync(GetOutboundDigitalrulesetsRequest request, final AsyncApiCallback<DigitalRuleSetEntityListing> callback) {
    try {
      final SettableFuture<DigitalRuleSetEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DigitalRuleSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSetEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of Outbound Digital Rule Sets
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DigitalRuleSetEntityListing>> getOutboundDigitalrulesetsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DigitalRuleSetEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DigitalRuleSetEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DigitalRuleSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSetEntityListing> response = (ApiResponse<DigitalRuleSetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSetEntityListing> response = (ApiResponse<DigitalRuleSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DncList> getOutboundDnclistAsync(GetOutboundDnclistRequest request, final AsyncApiCallback<DncList> callback) {
    try {
      final SettableFuture<DncList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DncList>() {}, new AsyncApiCallback<ApiResponse<DncList>>() {
        @Override
        public void onCompleted(ApiResponse<DncList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DncList>> getOutboundDnclistAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DncList>> callback) {
    try {
      final SettableFuture<ApiResponse<DncList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DncList>() {}, new AsyncApiCallback<ApiResponse<DncList>>() {
        @Override
        public void onCompleted(ApiResponse<DncList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExportUri> getOutboundDnclistExportAsync(GetOutboundDnclistExportRequest request, final AsyncApiCallback<ExportUri> callback) {
    try {
      final SettableFuture<ExportUri> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExportUri>() {}, new AsyncApiCallback<ApiResponse<ExportUri>>() {
        @Override
        public void onCompleted(ApiResponse<ExportUri> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExportUri>> getOutboundDnclistExportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExportUri>> callback) {
    try {
      final SettableFuture<ApiResponse<ExportUri>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExportUri>() {}, new AsyncApiCallback<ApiResponse<ExportUri>>() {
        @Override
        public void onCompleted(ApiResponse<ExportUri> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportStatus> getOutboundDnclistImportstatusAsync(GetOutboundDnclistImportstatusRequest request, final AsyncApiCallback<ImportStatus> callback) {
    try {
      final SettableFuture<ImportStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportStatus>() {}, new AsyncApiCallback<ApiResponse<ImportStatus>>() {
        @Override
        public void onCompleted(ApiResponse<ImportStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportStatus>> getOutboundDnclistImportstatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ImportStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportStatus>() {}, new AsyncApiCallback<ApiResponse<ImportStatus>>() {
        @Override
        public void onCompleted(ApiResponse<ImportStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query dialer DNC lists
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DncListEntityListing> getOutboundDnclistsAsync(GetOutboundDnclistsRequest request, final AsyncApiCallback<DncListEntityListing> callback) {
    try {
      final SettableFuture<DncListEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DncListEntityListing>() {}, new AsyncApiCallback<ApiResponse<DncListEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DncListEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query dialer DNC lists
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DncListEntityListing>> getOutboundDnclistsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DncListEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DncListEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DncListEntityListing>() {}, new AsyncApiCallback<ApiResponse<DncListEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DncListEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DncListEntityListing> response = (ApiResponse<DncListEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DncListEntityListing> response = (ApiResponse<DncListEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic DncList information object
   * This returns a simplified version of a DncList, consisting of the name, division, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DncListDivisionView> getOutboundDnclistsDivisionviewAsync(GetOutboundDnclistsDivisionviewRequest request, final AsyncApiCallback<DncListDivisionView> callback) {
    try {
      final SettableFuture<DncListDivisionView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DncListDivisionView>() {}, new AsyncApiCallback<ApiResponse<DncListDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<DncListDivisionView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic DncList information object
   * This returns a simplified version of a DncList, consisting of the name, division, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DncListDivisionView>> getOutboundDnclistsDivisionviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DncListDivisionView>> callback) {
    try {
      final SettableFuture<ApiResponse<DncListDivisionView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DncListDivisionView>() {}, new AsyncApiCallback<ApiResponse<DncListDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<DncListDivisionView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DncListDivisionView> response = (ApiResponse<DncListDivisionView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DncListDivisionView> response = (ApiResponse<DncListDivisionView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of simplified dnc list objects.
   * This return a simplified version of dnc lists, consisting of the name, division, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DncListDivisionViewListing> getOutboundDnclistsDivisionviewsAsync(GetOutboundDnclistsDivisionviewsRequest request, final AsyncApiCallback<DncListDivisionViewListing> callback) {
    try {
      final SettableFuture<DncListDivisionViewListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DncListDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<DncListDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<DncListDivisionViewListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of simplified dnc list objects.
   * This return a simplified version of dnc lists, consisting of the name, division, import status, and size.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DncListDivisionViewListing>> getOutboundDnclistsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DncListDivisionViewListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DncListDivisionViewListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DncListDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<DncListDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<DncListDivisionViewListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DncListDivisionViewListing> response = (ApiResponse<DncListDivisionViewListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DncListDivisionViewListing> response = (ApiResponse<DncListDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dialer Event
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EventLog> getOutboundEventAsync(GetOutboundEventRequest request, final AsyncApiCallback<EventLog> callback) {
    try {
      final SettableFuture<EventLog> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EventLog>() {}, new AsyncApiCallback<ApiResponse<EventLog>>() {
        @Override
        public void onCompleted(ApiResponse<EventLog> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dialer Event
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EventLog>> getOutboundEventAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EventLog>> callback) {
    try {
      final SettableFuture<ApiResponse<EventLog>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EventLog>() {}, new AsyncApiCallback<ApiResponse<EventLog>>() {
        @Override
        public void onCompleted(ApiResponse<EventLog> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EventLog> response = (ApiResponse<EventLog>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EventLog> response = (ApiResponse<EventLog>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Event Logs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DialerEventEntityListing> getOutboundEventsAsync(GetOutboundEventsRequest request, final AsyncApiCallback<DialerEventEntityListing> callback) {
    try {
      final SettableFuture<DialerEventEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DialerEventEntityListing>() {}, new AsyncApiCallback<ApiResponse<DialerEventEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DialerEventEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Event Logs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DialerEventEntityListing>> getOutboundEventsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DialerEventEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DialerEventEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DialerEventEntityListing>() {}, new AsyncApiCallback<ApiResponse<DialerEventEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DialerEventEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DialerEventEntityListing> response = (ApiResponse<DialerEventEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DialerEventEntityListing> response = (ApiResponse<DialerEventEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FileSpecificationTemplate> getOutboundFilespecificationtemplateAsync(GetOutboundFilespecificationtemplateRequest request, final AsyncApiCallback<FileSpecificationTemplate> callback) {
    try {
      final SettableFuture<FileSpecificationTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FileSpecificationTemplate>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FileSpecificationTemplate>> getOutboundFilespecificationtemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FileSpecificationTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<FileSpecificationTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FileSpecificationTemplate>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query File Specification Templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FileSpecificationTemplateEntityListing> getOutboundFilespecificationtemplatesAsync(GetOutboundFilespecificationtemplatesRequest request, final AsyncApiCallback<FileSpecificationTemplateEntityListing> callback) {
    try {
      final SettableFuture<FileSpecificationTemplateEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FileSpecificationTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplateEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query File Specification Templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FileSpecificationTemplateEntityListing>> getOutboundFilespecificationtemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FileSpecificationTemplateEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FileSpecificationTemplateEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FileSpecificationTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplateEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplateEntityListing> response = (ApiResponse<FileSpecificationTemplateEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplateEntityListing> response = (ApiResponse<FileSpecificationTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportTemplate> getOutboundImporttemplateAsync(GetOutboundImporttemplateRequest request, final AsyncApiCallback<ImportTemplate> callback) {
    try {
      final SettableFuture<ImportTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportTemplate>() {}, new AsyncApiCallback<ApiResponse<ImportTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportTemplate>> getOutboundImporttemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ImportTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportTemplate>() {}, new AsyncApiCallback<ApiResponse<ImportTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the import status for an import template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportStatus> getOutboundImporttemplateImportstatusAsync(GetOutboundImporttemplateImportstatusRequest request, final AsyncApiCallback<ImportStatus> callback) {
    try {
      final SettableFuture<ImportStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportStatus>() {}, new AsyncApiCallback<ApiResponse<ImportStatus>>() {
        @Override
        public void onCompleted(ApiResponse<ImportStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the import status for an import template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportStatus>> getOutboundImporttemplateImportstatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ImportStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportStatus>() {}, new AsyncApiCallback<ApiResponse<ImportStatus>>() {
        @Override
        public void onCompleted(ApiResponse<ImportStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Import Templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportTemplateEntityListing> getOutboundImporttemplatesAsync(GetOutboundImporttemplatesRequest request, final AsyncApiCallback<ImportTemplateEntityListing> callback) {
    try {
      final SettableFuture<ImportTemplateEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ImportTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplateEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query Import Templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportTemplateEntityListing>> getOutboundImporttemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ImportTemplateEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportTemplateEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ImportTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplateEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an Outbound Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaign> getOutboundMessagingcampaignAsync(GetOutboundMessagingcampaignRequest request, final AsyncApiCallback<MessagingCampaign> callback) {
    try {
      final SettableFuture<MessagingCampaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an Outbound Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaign>> getOutboundMessagingcampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaign>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get messaging campaign diagnostics
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaignDiagnostics> getOutboundMessagingcampaignDiagnosticsAsync(GetOutboundMessagingcampaignDiagnosticsRequest request, final AsyncApiCallback<MessagingCampaignDiagnostics> callback) {
    try {
      final SettableFuture<MessagingCampaignDiagnostics> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaignDiagnostics>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignDiagnostics>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignDiagnostics> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get messaging campaign diagnostics
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaignDiagnostics>> getOutboundMessagingcampaignDiagnosticsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaignDiagnostics>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaignDiagnostics>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaignDiagnostics>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignDiagnostics>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignDiagnostics> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignDiagnostics> response = (ApiResponse<MessagingCampaignDiagnostics>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignDiagnostics> response = (ApiResponse<MessagingCampaignDiagnostics>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get messaging campaign's progress
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignProgress> getOutboundMessagingcampaignProgressAsync(GetOutboundMessagingcampaignProgressRequest request, final AsyncApiCallback<CampaignProgress> callback) {
    try {
      final SettableFuture<CampaignProgress> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignProgress>() {}, new AsyncApiCallback<ApiResponse<CampaignProgress>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignProgress> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get messaging campaign's progress
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignProgress>> getOutboundMessagingcampaignProgressAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignProgress>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignProgress>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignProgress>() {}, new AsyncApiCallback<ApiResponse<CampaignProgress>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignProgress> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of Messaging Campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaignEntityListing> getOutboundMessagingcampaignsAsync(GetOutboundMessagingcampaignsRequest request, final AsyncApiCallback<MessagingCampaignEntityListing> callback) {
    try {
      final SettableFuture<MessagingCampaignEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaignEntityListing>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of Messaging Campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaignEntityListing>> getOutboundMessagingcampaignsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaignEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaignEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaignEntityListing>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignEntityListing> response = (ApiResponse<MessagingCampaignEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignEntityListing> response = (ApiResponse<MessagingCampaignEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic Messaging Campaign information object
   * This returns a simplified version of a Messaging Campaign, consisting of id, name, and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaignDivisionView> getOutboundMessagingcampaignsDivisionviewAsync(GetOutboundMessagingcampaignsDivisionviewRequest request, final AsyncApiCallback<MessagingCampaignDivisionView> callback) {
    try {
      final SettableFuture<MessagingCampaignDivisionView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaignDivisionView>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignDivisionView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a basic Messaging Campaign information object
   * This returns a simplified version of a Messaging Campaign, consisting of id, name, and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaignDivisionView>> getOutboundMessagingcampaignsDivisionviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaignDivisionView>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaignDivisionView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaignDivisionView>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignDivisionView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignDivisionView> response = (ApiResponse<MessagingCampaignDivisionView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignDivisionView> response = (ApiResponse<MessagingCampaignDivisionView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of basic Messaging Campaign information objects
   * This returns a listing of simplified Messaging Campaigns, each consisting of id, name, and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaignDivisionViewEntityListing> getOutboundMessagingcampaignsDivisionviewsAsync(GetOutboundMessagingcampaignsDivisionviewsRequest request, final AsyncApiCallback<MessagingCampaignDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<MessagingCampaignDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaignDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of basic Messaging Campaign information objects
   * This returns a listing of simplified Messaging Campaigns, each consisting of id, name, and division.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaignDivisionViewEntityListing>> getOutboundMessagingcampaignsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaignDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaignDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaignDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignDivisionViewEntityListing> response = (ApiResponse<MessagingCampaignDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignDivisionViewEntityListing> response = (ApiResponse<MessagingCampaignDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RuleSet> getOutboundRulesetAsync(GetOutboundRulesetRequest request, final AsyncApiCallback<RuleSet> callback) {
    try {
      final SettableFuture<RuleSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RuleSet>() {}, new AsyncApiCallback<ApiResponse<RuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RuleSet>> getOutboundRulesetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RuleSet>> callback) {
    try {
      final SettableFuture<ApiResponse<RuleSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RuleSet>() {}, new AsyncApiCallback<ApiResponse<RuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RuleSetEntityListing> getOutboundRulesetsAsync(GetOutboundRulesetsRequest request, final AsyncApiCallback<RuleSetEntityListing> callback) {
    try {
      final SettableFuture<RuleSetEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RuleSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<RuleSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSetEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RuleSetEntityListing>> getOutboundRulesetsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RuleSetEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<RuleSetEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RuleSetEntityListing>() {}, new AsyncApiCallback<ApiResponse<RuleSetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSetEntityListing> response = (ApiResponse<RuleSetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSetEntityListing> response = (ApiResponse<RuleSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignSchedule> getOutboundSchedulesCampaignAsync(GetOutboundSchedulesCampaignRequest request, final AsyncApiCallback<CampaignSchedule> callback) {
    try {
      final SettableFuture<CampaignSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<CampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignSchedule>> getOutboundSchedulesCampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<CampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<CampaignSchedule>> getOutboundSchedulesCampaignsAsync(GetOutboundSchedulesCampaignsRequest request, final AsyncApiCallback<List<CampaignSchedule>> callback) {
    try {
      final SettableFuture<List<CampaignSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<CampaignSchedule>>() {}, new AsyncApiCallback<ApiResponse<List<CampaignSchedule>>>() {
        @Override
        public void onCompleted(ApiResponse<List<CampaignSchedule>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<CampaignSchedule>>> getOutboundSchedulesCampaignsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<CampaignSchedule>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<CampaignSchedule>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<CampaignSchedule>>() {}, new AsyncApiCallback<ApiResponse<List<CampaignSchedule>>>() {
        @Override
        public void onCompleted(ApiResponse<List<CampaignSchedule>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<CampaignSchedule>> response = (ApiResponse<List<CampaignSchedule>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<CampaignSchedule>> response = (ApiResponse<List<CampaignSchedule>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an email campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailCampaignSchedule> getOutboundSchedulesEmailcampaignAsync(GetOutboundSchedulesEmailcampaignRequest request, final AsyncApiCallback<EmailCampaignSchedule> callback) {
    try {
      final SettableFuture<EmailCampaignSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<EmailCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<EmailCampaignSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an email campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailCampaignSchedule>> getOutboundSchedulesEmailcampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmailCampaignSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<EmailCampaignSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<EmailCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<EmailCampaignSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of email campaign schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailCampaignScheduleEntityListing> getOutboundSchedulesEmailcampaignsAsync(GetOutboundSchedulesEmailcampaignsRequest request, final AsyncApiCallback<EmailCampaignScheduleEntityListing> callback) {
    try {
      final SettableFuture<EmailCampaignScheduleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailCampaignScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<EmailCampaignScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmailCampaignScheduleEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of email campaign schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailCampaignScheduleEntityListing>> getOutboundSchedulesEmailcampaignsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmailCampaignScheduleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EmailCampaignScheduleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailCampaignScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<EmailCampaignScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmailCampaignScheduleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailCampaignScheduleEntityListing> response = (ApiResponse<EmailCampaignScheduleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailCampaignScheduleEntityListing> response = (ApiResponse<EmailCampaignScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a messaging campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaignSchedule> getOutboundSchedulesMessagingcampaignAsync(GetOutboundSchedulesMessagingcampaignRequest request, final AsyncApiCallback<MessagingCampaignSchedule> callback) {
    try {
      final SettableFuture<MessagingCampaignSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a messaging campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaignSchedule>> getOutboundSchedulesMessagingcampaignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaignSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaignSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of messaging campaign schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaignScheduleEntityListing> getOutboundSchedulesMessagingcampaignsAsync(GetOutboundSchedulesMessagingcampaignsRequest request, final AsyncApiCallback<MessagingCampaignScheduleEntityListing> callback) {
    try {
      final SettableFuture<MessagingCampaignScheduleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaignScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignScheduleEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of messaging campaign schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaignScheduleEntityListing>> getOutboundSchedulesMessagingcampaignsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingCampaignScheduleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaignScheduleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaignScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignScheduleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignScheduleEntityListing> response = (ApiResponse<MessagingCampaignScheduleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignScheduleEntityListing> response = (ApiResponse<MessagingCampaignScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SequenceSchedule> getOutboundSchedulesSequenceAsync(GetOutboundSchedulesSequenceRequest request, final AsyncApiCallback<SequenceSchedule> callback) {
    try {
      final SettableFuture<SequenceSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {}, new AsyncApiCallback<ApiResponse<SequenceSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<SequenceSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SequenceSchedule>> getOutboundSchedulesSequenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SequenceSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<SequenceSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SequenceSchedule>() {}, new AsyncApiCallback<ApiResponse<SequenceSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<SequenceSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<SequenceSchedule>> getOutboundSchedulesSequencesAsync(GetOutboundSchedulesSequencesRequest request, final AsyncApiCallback<List<SequenceSchedule>> callback) {
    try {
      final SettableFuture<List<SequenceSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<SequenceSchedule>>() {}, new AsyncApiCallback<ApiResponse<List<SequenceSchedule>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SequenceSchedule>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<SequenceSchedule>>> getOutboundSchedulesSequencesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<SequenceSchedule>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<SequenceSchedule>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<SequenceSchedule>>() {}, new AsyncApiCallback<ApiResponse<List<SequenceSchedule>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SequenceSchedule>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SequenceSchedule>> response = (ApiResponse<List<SequenceSchedule>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SequenceSchedule>> response = (ApiResponse<List<SequenceSchedule>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignSequence> getOutboundSequenceAsync(GetOutboundSequenceRequest request, final AsyncApiCallback<CampaignSequence> callback) {
    try {
      final SettableFuture<CampaignSequence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignSequence>() {}, new AsyncApiCallback<ApiResponse<CampaignSequence>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequence> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignSequence>> getOutboundSequenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignSequence>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignSequence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignSequence>() {}, new AsyncApiCallback<ApiResponse<CampaignSequence>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignSequenceEntityListing> getOutboundSequencesAsync(GetOutboundSequencesRequest request, final AsyncApiCallback<CampaignSequenceEntityListing> callback) {
    try {
      final SettableFuture<CampaignSequenceEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignSequenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<CampaignSequenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequenceEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignSequenceEntityListing>> getOutboundSequencesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CampaignSequenceEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignSequenceEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignSequenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<CampaignSequenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequenceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequenceEntityListing> response = (ApiResponse<CampaignSequenceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequenceEntityListing> response = (ApiResponse<CampaignSequenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the outbound settings for this organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutboundSettings> getOutboundSettingsAsync(GetOutboundSettingsRequest request, final AsyncApiCallback<OutboundSettings> callback) {
    try {
      final SettableFuture<OutboundSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutboundSettings>() {}, new AsyncApiCallback<ApiResponse<OutboundSettings>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the outbound settings for this organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutboundSettings>> getOutboundSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OutboundSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<OutboundSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutboundSettings>() {}, new AsyncApiCallback<ApiResponse<OutboundSettings>>() {
        @Override
        public void onCompleted(ApiResponse<OutboundSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundSettings> response = (ApiResponse<OutboundSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutboundSettings> response = (ApiResponse<OutboundSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapUpCodeMapping> getOutboundWrapupcodemappingsAsync(GetOutboundWrapupcodemappingsRequest request, final AsyncApiCallback<WrapUpCodeMapping> callback) {
    try {
      final SettableFuture<WrapUpCodeMapping> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {}, new AsyncApiCallback<ApiResponse<WrapUpCodeMapping>>() {
        @Override
        public void onCompleted(ApiResponse<WrapUpCodeMapping> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapUpCodeMapping>> getOutboundWrapupcodemappingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WrapUpCodeMapping>> callback) {
    try {
      final SettableFuture<ApiResponse<WrapUpCodeMapping>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapUpCodeMapping>() {}, new AsyncApiCallback<ApiResponse<WrapUpCodeMapping>>() {
        @Override
        public void onCompleted(ApiResponse<WrapUpCodeMapping> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchOutboundCampaignAsync(PatchOutboundCampaignRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchOutboundCampaignAsync(ApiRequest<CampaignPatchRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchOutboundDnclistCustomexclusioncolumnsAsync(PatchOutboundDnclistCustomexclusioncolumnsRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchOutboundDnclistCustomexclusioncolumnsAsync(ApiRequest<DncPatchCustomExclusionColumnsRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add emails to or Delete emails from a DNC list.
   * Only Internal DNC lists may be added to or deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchOutboundDnclistEmailaddressesAsync(PatchOutboundDnclistEmailaddressesRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add emails to or Delete emails from a DNC list.
   * Only Internal DNC lists may be added to or deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchOutboundDnclistEmailaddressesAsync(ApiRequest<DncPatchEmailsRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add numbers to or delete numbers from a DNC list.
   * Only Internal DNC lists may be added to deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchOutboundDnclistPhonenumbersAsync(PatchOutboundDnclistPhonenumbersRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add numbers to or delete numbers from a DNC list.
   * Only Internal DNC lists may be added to deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchOutboundDnclistPhonenumbersAsync(ApiRequest<DncPatchPhoneNumbersRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchOutboundDnclistWhatsappnumbersAsync(PatchOutboundDnclistWhatsappnumbersRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add entries to or delete entries from a DNC list.
   * Only Internal DNC lists may be deleted from
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchOutboundDnclistWhatsappnumbersAsync(ApiRequest<DncPatchWhatsAppNumbersRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the outbound settings for this organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchOutboundSettingsAsync(PatchOutboundSettingsRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the outbound settings for this organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchOutboundSettingsAsync(ApiRequest<OutboundSettings> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AttemptLimits> postOutboundAttemptlimitsAsync(PostOutboundAttemptlimitsRequest request, final AsyncApiCallback<AttemptLimits> callback) {
    try {
      final SettableFuture<AttemptLimits> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AttemptLimits>() {}, new AsyncApiCallback<ApiResponse<AttemptLimits>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimits> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AttemptLimits>> postOutboundAttemptlimitsAsync(ApiRequest<AttemptLimits> request, final AsyncApiCallback<ApiResponse<AttemptLimits>> callback) {
    try {
      final SettableFuture<ApiResponse<AttemptLimits>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AttemptLimits>() {}, new AsyncApiCallback<ApiResponse<AttemptLimits>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimits> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallableTimeSet> postOutboundCallabletimesetsAsync(PostOutboundCallabletimesetsRequest request, final AsyncApiCallback<CallableTimeSet> callback) {
    try {
      final SettableFuture<CallableTimeSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSet>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallableTimeSet>> postOutboundCallabletimesetsAsync(ApiRequest<CallableTimeSet> request, final AsyncApiCallback<ApiResponse<CallableTimeSet>> callback) {
    try {
      final SettableFuture<ApiResponse<CallableTimeSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallableTimeSet>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSet>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ResponseSet> postOutboundCallanalysisresponsesetsAsync(PostOutboundCallanalysisresponsesetsRequest request, final AsyncApiCallback<ResponseSet> callback) {
    try {
      final SettableFuture<ResponseSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ResponseSet>() {}, new AsyncApiCallback<ApiResponse<ResponseSet>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ResponseSet>> postOutboundCallanalysisresponsesetsAsync(ApiRequest<ResponseSet> request, final AsyncApiCallback<ApiResponse<ResponseSet>> callback) {
    try {
      final SettableFuture<ApiResponse<ResponseSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ResponseSet>() {}, new AsyncApiCallback<ApiResponse<ResponseSet>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate request for a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> postOutboundCampaignAgentownedmappingpreviewAsync(PostOutboundCampaignAgentownedmappingpreviewRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate request for a preview of how agents will be mapped to this campaign's contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> postOutboundCampaignAgentownedmappingpreviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \"/conversations/{conversationId}/participants/{participantId}/callbacks instead.\"
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ContactCallbackRequest> postOutboundCampaignCallbackScheduleAsync(PostOutboundCampaignCallbackScheduleRequest request, final AsyncApiCallback<ContactCallbackRequest> callback) {
    try {
      final SettableFuture<ContactCallbackRequest> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactCallbackRequest>() {}, new AsyncApiCallback<ApiResponse<ContactCallbackRequest>>() {
        @Override
        public void onCompleted(ApiResponse<ContactCallbackRequest> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \"/conversations/{conversationId}/participants/{participantId}/callbacks instead.\"
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<ContactCallbackRequest>> postOutboundCampaignCallbackScheduleAsync(ApiRequest<ContactCallbackRequest> request, final AsyncApiCallback<ApiResponse<ContactCallbackRequest>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactCallbackRequest>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactCallbackRequest>() {}, new AsyncApiCallback<ApiResponse<ContactCallbackRequest>>() {
        @Override
        public void onCompleted(ApiResponse<ContactCallbackRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactCallbackRequest> response = (ApiResponse<ContactCallbackRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactCallbackRequest> response = (ApiResponse<ContactCallbackRequest>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start the campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundCampaignStartAsync(PostOutboundCampaignStartRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start the campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundCampaignStartAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Stop the campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundCampaignStopAsync(PostOutboundCampaignStopRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Stop the campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundCampaignStopAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignRule> postOutboundCampaignrulesAsync(PostOutboundCampaignrulesRequest request, final AsyncApiCallback<CampaignRule> callback) {
    try {
      final SettableFuture<CampaignRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignRule>() {}, new AsyncApiCallback<ApiResponse<CampaignRule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignRule>> postOutboundCampaignrulesAsync(ApiRequest<CampaignRule> request, final AsyncApiCallback<ApiResponse<CampaignRule>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignRule>() {}, new AsyncApiCallback<ApiResponse<CampaignRule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Campaign> postOutboundCampaignsAsync(PostOutboundCampaignsRequest request, final AsyncApiCallback<Campaign> callback) {
    try {
      final SettableFuture<Campaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Campaign>> postOutboundCampaignsAsync(ApiRequest<Campaign> request, final AsyncApiCallback<ApiResponse<Campaign>> callback) {
    try {
      final SettableFuture<ApiResponse<Campaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<CampaignProgress>> postOutboundCampaignsProgressAsync(PostOutboundCampaignsProgressRequest request, final AsyncApiCallback<List<CampaignProgress>> callback) {
    try {
      final SettableFuture<List<CampaignProgress>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<CampaignProgress>>() {}, new AsyncApiCallback<ApiResponse<List<CampaignProgress>>>() {
        @Override
        public void onCompleted(ApiResponse<List<CampaignProgress>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<CampaignProgress>>> postOutboundCampaignsProgressAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<List<CampaignProgress>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<CampaignProgress>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<CampaignProgress>>() {}, new AsyncApiCallback<ApiResponse<List<CampaignProgress>>>() {
        @Override
        public void onCompleted(ApiResponse<List<CampaignProgress>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all contacts out of a list. All outstanding recalls or rule-scheduled callbacks for non-preview campaigns configured with the contactlist will be cancelled.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundContactlistClearAsync(PostOutboundContactlistClearRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes all contacts out of a list. All outstanding recalls or rule-scheduled callbacks for non-preview campaigns configured with the contactlist will be cancelled.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundContactlistClearAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<DialerContact>> postOutboundContactlistContactsAsync(PostOutboundContactlistContactsRequest request, final AsyncApiCallback<List<DialerContact>> callback) {
    try {
      final SettableFuture<List<DialerContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<DialerContact>>() {}, new AsyncApiCallback<ApiResponse<List<DialerContact>>>() {
        @Override
        public void onCompleted(ApiResponse<List<DialerContact>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<DialerContact>>> postOutboundContactlistContactsAsync(ApiRequest<List<WritableDialerContact>> request, final AsyncApiCallback<ApiResponse<List<DialerContact>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<DialerContact>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<DialerContact>>() {}, new AsyncApiCallback<ApiResponse<List<DialerContact>>>() {
        @Override
        public void onCompleted(ApiResponse<List<DialerContact>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get contacts from a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<DialerContact>> postOutboundContactlistContactsBulkAsync(PostOutboundContactlistContactsBulkRequest request, final AsyncApiCallback<List<DialerContact>> callback) {
    try {
      final SettableFuture<List<DialerContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<DialerContact>>() {}, new AsyncApiCallback<ApiResponse<List<DialerContact>>>() {
        @Override
        public void onCompleted(ApiResponse<List<DialerContact>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get contacts from a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<DialerContact>>> postOutboundContactlistContactsBulkAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<List<DialerContact>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<DialerContact>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<DialerContact>>() {}, new AsyncApiCallback<ApiResponse<List<DialerContact>>>() {
        @Override
        public void onCompleted(ApiResponse<List<DialerContact>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start an async job to delete contacts using a filter.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactsBulkOperationJob> postOutboundContactlistContactsBulkRemoveAsync(PostOutboundContactlistContactsBulkRemoveRequest request, final AsyncApiCallback<ContactsBulkOperationJob> callback) {
    try {
      final SettableFuture<ContactsBulkOperationJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJob>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start an async job to delete contacts using a filter.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactsBulkOperationJob>> postOutboundContactlistContactsBulkRemoveAsync(ApiRequest<ContactBulkSearchParameters> request, final AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactsBulkOperationJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactsBulkOperationJob>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start an async job to bulk edit contacts.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactsBulkOperationJob> postOutboundContactlistContactsBulkUpdateAsync(PostOutboundContactlistContactsBulkUpdateRequest request, final AsyncApiCallback<ContactsBulkOperationJob> callback) {
    try {
      final SettableFuture<ContactsBulkOperationJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactsBulkOperationJob>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start an async job to bulk edit contacts.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactsBulkOperationJob>> postOutboundContactlistContactsBulkUpdateAsync(ApiRequest<ContactBulkEditRequest> request, final AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactsBulkOperationJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactsBulkOperationJob>() {}, new AsyncApiCallback<ApiResponse<ContactsBulkOperationJob>>() {
        @Override
        public void onCompleted(ApiResponse<ContactsBulkOperationJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactsBulkOperationJob> response = (ApiResponse<ContactsBulkOperationJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query contacts from a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListingResponse> postOutboundContactlistContactsSearchAsync(PostOutboundContactlistContactsSearchRequest request, final AsyncApiCallback<ContactListingResponse> callback) {
    try {
      final SettableFuture<ContactListingResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListingResponse>() {}, new AsyncApiCallback<ApiResponse<ContactListingResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListingResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query contacts from a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListingResponse>> postOutboundContactlistContactsSearchAsync(ApiRequest<ContactListingRequest> request, final AsyncApiCallback<ApiResponse<ContactListingResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListingResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListingResponse>() {}, new AsyncApiCallback<ApiResponse<ContactListingResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListingResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListingResponse> response = (ApiResponse<ContactListingResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListingResponse> response = (ApiResponse<ContactListingResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainEntityRef> postOutboundContactlistExportAsync(PostOutboundContactlistExportRequest request, final AsyncApiCallback<DomainEntityRef> callback) {
    try {
      final SettableFuture<DomainEntityRef> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainEntityRef>() {}, new AsyncApiCallback<ApiResponse<DomainEntityRef>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityRef> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainEntityRef>> postOutboundContactlistExportAsync(ApiRequest<ContactsExportRequest> request, final AsyncApiCallback<ApiResponse<DomainEntityRef>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainEntityRef>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainEntityRef>() {}, new AsyncApiCallback<ApiResponse<DomainEntityRef>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityRef> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Contact List Filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListFilter> postOutboundContactlistfiltersAsync(PostOutboundContactlistfiltersRequest request, final AsyncApiCallback<ContactListFilter> callback) {
    try {
      final SettableFuture<ContactListFilter> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListFilter>() {}, new AsyncApiCallback<ApiResponse<ContactListFilter>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilter> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Contact List Filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListFilter>> postOutboundContactlistfiltersAsync(ApiRequest<ContactListFilter> request, final AsyncApiCallback<ApiResponse<ContactListFilter>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListFilter>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListFilter>() {}, new AsyncApiCallback<ApiResponse<ContactListFilter>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilter> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve multiple contact list filters
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListFilterEntityListing> postOutboundContactlistfiltersBulkRetrieveAsync(PostOutboundContactlistfiltersBulkRetrieveRequest request, final AsyncApiCallback<ContactListFilterEntityListing> callback) {
    try {
      final SettableFuture<ContactListFilterEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListFilterEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListFilterEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilterEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve multiple contact list filters
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListFilterEntityListing>> postOutboundContactlistfiltersBulkRetrieveAsync(ApiRequest<ContactListFilterBulkRetrieveBody> request, final AsyncApiCallback<ApiResponse<ContactListFilterEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListFilterEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListFilterEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListFilterEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilterEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilterEntityListing> response = (ApiResponse<ContactListFilterEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a preview of the output of a contact list filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FilterPreviewResponse> postOutboundContactlistfiltersPreviewAsync(PostOutboundContactlistfiltersPreviewRequest request, final AsyncApiCallback<FilterPreviewResponse> callback) {
    try {
      final SettableFuture<FilterPreviewResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FilterPreviewResponse>() {}, new AsyncApiCallback<ApiResponse<FilterPreviewResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FilterPreviewResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a preview of the output of a contact list filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FilterPreviewResponse>> postOutboundContactlistfiltersPreviewAsync(ApiRequest<ContactListFilter> request, final AsyncApiCallback<ApiResponse<FilterPreviewResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FilterPreviewResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FilterPreviewResponse>() {}, new AsyncApiCallback<ApiResponse<FilterPreviewResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FilterPreviewResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FilterPreviewResponse> response = (ApiResponse<FilterPreviewResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FilterPreviewResponse> response = (ApiResponse<FilterPreviewResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a contact List.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactList> postOutboundContactlistsAsync(PostOutboundContactlistsRequest request, final AsyncApiCallback<ContactList> callback) {
    try {
      final SettableFuture<ContactList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactList>() {}, new AsyncApiCallback<ApiResponse<ContactList>>() {
        @Override
        public void onCompleted(ApiResponse<ContactList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a contact List.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactList>> postOutboundContactlistsAsync(ApiRequest<ContactList> request, final AsyncApiCallback<ApiResponse<ContactList>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactList>() {}, new AsyncApiCallback<ApiResponse<ContactList>>() {
        @Override
        public void onCompleted(ApiResponse<ContactList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Contact List Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListTemplate> postOutboundContactlisttemplatesAsync(PostOutboundContactlisttemplatesRequest request, final AsyncApiCallback<ContactListTemplate> callback) {
    try {
      final SettableFuture<ContactListTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListTemplate>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Contact List Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListTemplate>> postOutboundContactlisttemplatesAsync(ApiRequest<ContactListTemplate> request, final AsyncApiCallback<ApiResponse<ContactListTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListTemplate>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add multiple contact list templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListTemplateEntityListing> postOutboundContactlisttemplatesBulkAddAsync(PostOutboundContactlisttemplatesBulkAddRequest request, final AsyncApiCallback<ContactListTemplateEntityListing> callback) {
    try {
      final SettableFuture<ContactListTemplateEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplateEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add multiple contact list templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListTemplateEntityListing>> postOutboundContactlisttemplatesBulkAddAsync(ApiRequest<List<ContactListTemplate>> request, final AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListTemplateEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplateEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get multiple contact list templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListTemplateEntityListing> postOutboundContactlisttemplatesBulkRetrieveAsync(PostOutboundContactlisttemplatesBulkRetrieveRequest request, final AsyncApiCallback<ContactListTemplateEntityListing> callback) {
    try {
      final SettableFuture<ContactListTemplateEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplateEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get multiple contact list templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListTemplateEntityListing>> postOutboundContactlisttemplatesBulkRetrieveAsync(ApiRequest<ContactListTemplateBulkRetrieveBody> request, final AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListTemplateEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplateEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplateEntityListing> response = (ApiResponse<ContactListTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundConversationDncAsync(PostOutboundConversationDncRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundConversationDncAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DigitalRuleSet> postOutboundDigitalrulesetsAsync(PostOutboundDigitalrulesetsRequest request, final AsyncApiCallback<DigitalRuleSet> callback) {
    try {
      final SettableFuture<DigitalRuleSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DigitalRuleSet>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DigitalRuleSet>> postOutboundDigitalrulesetsAsync(ApiRequest<DigitalRuleSet> request, final AsyncApiCallback<ApiResponse<DigitalRuleSet>> callback) {
    try {
      final SettableFuture<ApiResponse<DigitalRuleSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DigitalRuleSet>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add email addresses to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundDnclistEmailaddressesAsync(PostOutboundDnclistEmailaddressesRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add email addresses to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundDnclistEmailaddressesAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainEntityRef> postOutboundDnclistExportAsync(PostOutboundDnclistExportRequest request, final AsyncApiCallback<DomainEntityRef> callback) {
    try {
      final SettableFuture<DomainEntityRef> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainEntityRef>() {}, new AsyncApiCallback<ApiResponse<DomainEntityRef>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityRef> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainEntityRef>> postOutboundDnclistExportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DomainEntityRef>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainEntityRef>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainEntityRef>() {}, new AsyncApiCallback<ApiResponse<DomainEntityRef>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityRef> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityRef> response = (ApiResponse<DomainEntityRef>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add phone numbers to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundDnclistPhonenumbersAsync(PostOutboundDnclistPhonenumbersRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add phone numbers to a DNC list.
   * Only Internal DNC lists may be appended to
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundDnclistPhonenumbersAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DncList> postOutboundDnclistsAsync(PostOutboundDnclistsRequest request, final AsyncApiCallback<DncList> callback) {
    try {
      final SettableFuture<DncList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DncList>() {}, new AsyncApiCallback<ApiResponse<DncList>>() {
        @Override
        public void onCompleted(ApiResponse<DncList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DncList>> postOutboundDnclistsAsync(ApiRequest<DncListCreate> request, final AsyncApiCallback<ApiResponse<DncList>> callback) {
    try {
      final SettableFuture<ApiResponse<DncList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DncList>() {}, new AsyncApiCallback<ApiResponse<DncList>>() {
        @Override
        public void onCompleted(ApiResponse<DncList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FileSpecificationTemplate> postOutboundFilespecificationtemplatesAsync(PostOutboundFilespecificationtemplatesRequest request, final AsyncApiCallback<FileSpecificationTemplate> callback) {
    try {
      final SettableFuture<FileSpecificationTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FileSpecificationTemplate>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FileSpecificationTemplate>> postOutboundFilespecificationtemplatesAsync(ApiRequest<FileSpecificationTemplate> request, final AsyncApiCallback<ApiResponse<FileSpecificationTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<FileSpecificationTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FileSpecificationTemplate>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportTemplate> postOutboundImporttemplatesAsync(PostOutboundImporttemplatesRequest request, final AsyncApiCallback<ImportTemplate> callback) {
    try {
      final SettableFuture<ImportTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportTemplate>() {}, new AsyncApiCallback<ApiResponse<ImportTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportTemplate>> postOutboundImporttemplatesAsync(ApiRequest<ImportTemplate> request, final AsyncApiCallback<ApiResponse<ImportTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportTemplate>() {}, new AsyncApiCallback<ApiResponse<ImportTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add multiple import templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportTemplateEntityListing> postOutboundImporttemplatesBulkAddAsync(PostOutboundImporttemplatesBulkAddRequest request, final AsyncApiCallback<ImportTemplateEntityListing> callback) {
    try {
      final SettableFuture<ImportTemplateEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ImportTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplateEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add multiple import templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportTemplateEntityListing>> postOutboundImporttemplatesBulkAddAsync(ApiRequest<List<ImportTemplate>> request, final AsyncApiCallback<ApiResponse<ImportTemplateEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportTemplateEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportTemplateEntityListing>() {}, new AsyncApiCallback<ApiResponse<ImportTemplateEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplateEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplateEntityListing> response = (ApiResponse<ImportTemplateEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundMessagingcampaignStartAsync(PostOutboundMessagingcampaignStartRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundMessagingcampaignStartAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Stop the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postOutboundMessagingcampaignStopAsync(PostOutboundMessagingcampaignStopRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Stop the campaign
   * Documented permissions are applicable based on campaign type.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postOutboundMessagingcampaignStopAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaign> postOutboundMessagingcampaignsAsync(PostOutboundMessagingcampaignsRequest request, final AsyncApiCallback<MessagingCampaign> callback) {
    try {
      final SettableFuture<MessagingCampaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaign>> postOutboundMessagingcampaignsAsync(ApiRequest<MessagingCampaign> request, final AsyncApiCallback<ApiResponse<MessagingCampaign>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get progress for a list of messaging campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<CampaignProgress>> postOutboundMessagingcampaignsProgressAsync(PostOutboundMessagingcampaignsProgressRequest request, final AsyncApiCallback<List<CampaignProgress>> callback) {
    try {
      final SettableFuture<List<CampaignProgress>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<CampaignProgress>>() {}, new AsyncApiCallback<ApiResponse<List<CampaignProgress>>>() {
        @Override
        public void onCompleted(ApiResponse<List<CampaignProgress>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get progress for a list of messaging campaigns
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<CampaignProgress>>> postOutboundMessagingcampaignsProgressAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<List<CampaignProgress>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<CampaignProgress>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<CampaignProgress>>() {}, new AsyncApiCallback<ApiResponse<List<CampaignProgress>>>() {
        @Override
        public void onCompleted(ApiResponse<List<CampaignProgress>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Rule Set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RuleSet> postOutboundRulesetsAsync(PostOutboundRulesetsRequest request, final AsyncApiCallback<RuleSet> callback) {
    try {
      final SettableFuture<RuleSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RuleSet>() {}, new AsyncApiCallback<ApiResponse<RuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Rule Set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RuleSet>> postOutboundRulesetsAsync(ApiRequest<RuleSet> request, final AsyncApiCallback<ApiResponse<RuleSet>> callback) {
    try {
      final SettableFuture<ApiResponse<RuleSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RuleSet>() {}, new AsyncApiCallback<ApiResponse<RuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignSequence> postOutboundSequencesAsync(PostOutboundSequencesRequest request, final AsyncApiCallback<CampaignSequence> callback) {
    try {
      final SettableFuture<CampaignSequence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignSequence>() {}, new AsyncApiCallback<ApiResponse<CampaignSequence>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequence> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignSequence>> postOutboundSequencesAsync(ApiRequest<CampaignSequence> request, final AsyncApiCallback<ApiResponse<CampaignSequence>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignSequence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignSequence>() {}, new AsyncApiCallback<ApiResponse<CampaignSequence>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AttemptLimits> putOutboundAttemptlimitAsync(PutOutboundAttemptlimitRequest request, final AsyncApiCallback<AttemptLimits> callback) {
    try {
      final SettableFuture<AttemptLimits> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AttemptLimits>() {}, new AsyncApiCallback<ApiResponse<AttemptLimits>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimits> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update attempt limits
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AttemptLimits>> putOutboundAttemptlimitAsync(ApiRequest<AttemptLimits> request, final AsyncApiCallback<ApiResponse<AttemptLimits>> callback) {
    try {
      final SettableFuture<ApiResponse<AttemptLimits>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AttemptLimits>() {}, new AsyncApiCallback<ApiResponse<AttemptLimits>>() {
        @Override
        public void onCompleted(ApiResponse<AttemptLimits> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CallableTimeSet> putOutboundCallabletimesetAsync(PutOutboundCallabletimesetRequest request, final AsyncApiCallback<CallableTimeSet> callback) {
    try {
      final SettableFuture<CallableTimeSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSet>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update callable time set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CallableTimeSet>> putOutboundCallabletimesetAsync(ApiRequest<CallableTimeSet> request, final AsyncApiCallback<ApiResponse<CallableTimeSet>> callback) {
    try {
      final SettableFuture<ApiResponse<CallableTimeSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CallableTimeSet>() {}, new AsyncApiCallback<ApiResponse<CallableTimeSet>>() {
        @Override
        public void onCompleted(ApiResponse<CallableTimeSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ResponseSet> putOutboundCallanalysisresponsesetAsync(PutOutboundCallanalysisresponsesetRequest request, final AsyncApiCallback<ResponseSet> callback) {
    try {
      final SettableFuture<ResponseSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ResponseSet>() {}, new AsyncApiCallback<ApiResponse<ResponseSet>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ResponseSet>> putOutboundCallanalysisresponsesetAsync(ApiRequest<ResponseSet> request, final AsyncApiCallback<ApiResponse<ResponseSet>> callback) {
    try {
      final SettableFuture<ApiResponse<ResponseSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ResponseSet>() {}, new AsyncApiCallback<ApiResponse<ResponseSet>>() {
        @Override
        public void onCompleted(ApiResponse<ResponseSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Campaign> putOutboundCampaignAsync(PutOutboundCampaignRequest request, final AsyncApiCallback<Campaign> callback) {
    try {
      final SettableFuture<Campaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a campaign.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Campaign>> putOutboundCampaignAsync(ApiRequest<Campaign> request, final AsyncApiCallback<ApiResponse<Campaign>> callback) {
    try {
      final SettableFuture<ApiResponse<Campaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Campaign>() {}, new AsyncApiCallback<ApiResponse<Campaign>>() {
        @Override
        public void onCompleted(ApiResponse<Campaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send notification that an agent's state changed 
   * New agent state.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> putOutboundCampaignAgentAsync(PutOutboundCampaignAgentRequest request, final AsyncApiCallback<String> callback) {
    try {
      final SettableFuture<String> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send notification that an agent's state changed 
   * New agent state.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> putOutboundCampaignAgentAsync(ApiRequest<Agent> request, final AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      final SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignRule> putOutboundCampaignruleAsync(PutOutboundCampaignruleRequest request, final AsyncApiCallback<CampaignRule> callback) {
    try {
      final SettableFuture<CampaignRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignRule>() {}, new AsyncApiCallback<ApiResponse<CampaignRule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Campaign Rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignRule>> putOutboundCampaignruleAsync(ApiRequest<CampaignRule> request, final AsyncApiCallback<ApiResponse<CampaignRule>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignRule>() {}, new AsyncApiCallback<ApiResponse<CampaignRule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactList> putOutboundContactlistAsync(PutOutboundContactlistRequest request, final AsyncApiCallback<ContactList> callback) {
    try {
      final SettableFuture<ContactList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactList>() {}, new AsyncApiCallback<ApiResponse<ContactList>>() {
        @Override
        public void onCompleted(ApiResponse<ContactList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a contact list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactList>> putOutboundContactlistAsync(ApiRequest<ContactList> request, final AsyncApiCallback<ApiResponse<ContactList>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactList>() {}, new AsyncApiCallback<ApiResponse<ContactList>>() {
        @Override
        public void onCompleted(ApiResponse<ContactList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DialerContact> putOutboundContactlistContactAsync(PutOutboundContactlistContactRequest request, final AsyncApiCallback<DialerContact> callback) {
    try {
      final SettableFuture<DialerContact> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DialerContact>() {}, new AsyncApiCallback<ApiResponse<DialerContact>>() {
        @Override
        public void onCompleted(ApiResponse<DialerContact> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DialerContact>> putOutboundContactlistContactAsync(ApiRequest<DialerContact> request, final AsyncApiCallback<ApiResponse<DialerContact>> callback) {
    try {
      final SettableFuture<ApiResponse<DialerContact>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DialerContact>() {}, new AsyncApiCallback<ApiResponse<DialerContact>>() {
        @Override
        public void onCompleted(ApiResponse<DialerContact> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Contact List Filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListFilter> putOutboundContactlistfilterAsync(PutOutboundContactlistfilterRequest request, final AsyncApiCallback<ContactListFilter> callback) {
    try {
      final SettableFuture<ContactListFilter> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListFilter>() {}, new AsyncApiCallback<ApiResponse<ContactListFilter>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilter> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Contact List Filter
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListFilter>> putOutboundContactlistfilterAsync(ApiRequest<ContactListFilter> request, final AsyncApiCallback<ApiResponse<ContactListFilter>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListFilter>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListFilter>() {}, new AsyncApiCallback<ApiResponse<ContactListFilter>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListFilter> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListFilter> response = (ApiResponse<ContactListFilter>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a contact list template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ContactListTemplate> putOutboundContactlisttemplateAsync(PutOutboundContactlisttemplateRequest request, final AsyncApiCallback<ContactListTemplate> callback) {
    try {
      final SettableFuture<ContactListTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ContactListTemplate>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a contact list template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ContactListTemplate>> putOutboundContactlisttemplateAsync(ApiRequest<ContactListTemplate> request, final AsyncApiCallback<ApiResponse<ContactListTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ContactListTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ContactListTemplate>() {}, new AsyncApiCallback<ApiResponse<ContactListTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ContactListTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ContactListTemplate> response = (ApiResponse<ContactListTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DigitalRuleSet> putOutboundDigitalrulesetAsync(PutOutboundDigitalrulesetRequest request, final AsyncApiCallback<DigitalRuleSet> callback) {
    try {
      final SettableFuture<DigitalRuleSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DigitalRuleSet>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an Outbound Digital Rule Set
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DigitalRuleSet>> putOutboundDigitalrulesetAsync(ApiRequest<DigitalRuleSet> request, final AsyncApiCallback<ApiResponse<DigitalRuleSet>> callback) {
    try {
      final SettableFuture<ApiResponse<DigitalRuleSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DigitalRuleSet>() {}, new AsyncApiCallback<ApiResponse<DigitalRuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<DigitalRuleSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DigitalRuleSet> response = (ApiResponse<DigitalRuleSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DncList> putOutboundDnclistAsync(PutOutboundDnclistRequest request, final AsyncApiCallback<DncList> callback) {
    try {
      final SettableFuture<DncList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DncList>() {}, new AsyncApiCallback<ApiResponse<DncList>>() {
        @Override
        public void onCompleted(ApiResponse<DncList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update dialer DNC list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DncList>> putOutboundDnclistAsync(ApiRequest<DncList> request, final AsyncApiCallback<ApiResponse<DncList>> callback) {
    try {
      final SettableFuture<ApiResponse<DncList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DncList>() {}, new AsyncApiCallback<ApiResponse<DncList>>() {
        @Override
        public void onCompleted(ApiResponse<DncList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FileSpecificationTemplate> putOutboundFilespecificationtemplateAsync(PutOutboundFilespecificationtemplateRequest request, final AsyncApiCallback<FileSpecificationTemplate> callback) {
    try {
      final SettableFuture<FileSpecificationTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FileSpecificationTemplate>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update File Specification Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FileSpecificationTemplate>> putOutboundFilespecificationtemplateAsync(ApiRequest<FileSpecificationTemplate> request, final AsyncApiCallback<ApiResponse<FileSpecificationTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<FileSpecificationTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FileSpecificationTemplate>() {}, new AsyncApiCallback<ApiResponse<FileSpecificationTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<FileSpecificationTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FileSpecificationTemplate> response = (ApiResponse<FileSpecificationTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ImportTemplate> putOutboundImporttemplateAsync(PutOutboundImporttemplateRequest request, final AsyncApiCallback<ImportTemplate> callback) {
    try {
      final SettableFuture<ImportTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ImportTemplate>() {}, new AsyncApiCallback<ApiResponse<ImportTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Import Template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ImportTemplate>> putOutboundImporttemplateAsync(ApiRequest<ImportTemplate> request, final AsyncApiCallback<ApiResponse<ImportTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ImportTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ImportTemplate>() {}, new AsyncApiCallback<ApiResponse<ImportTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ImportTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ImportTemplate> response = (ApiResponse<ImportTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an Outbound Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaign> putOutboundMessagingcampaignAsync(PutOutboundMessagingcampaignRequest request, final AsyncApiCallback<MessagingCampaign> callback) {
    try {
      final SettableFuture<MessagingCampaign> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an Outbound Messaging Campaign
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaign>> putOutboundMessagingcampaignAsync(ApiRequest<MessagingCampaign> request, final AsyncApiCallback<ApiResponse<MessagingCampaign>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaign>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaign>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaign>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaign> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaign> response = (ApiResponse<MessagingCampaign>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Rule Set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RuleSet> putOutboundRulesetAsync(PutOutboundRulesetRequest request, final AsyncApiCallback<RuleSet> callback) {
    try {
      final SettableFuture<RuleSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RuleSet>() {}, new AsyncApiCallback<ApiResponse<RuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Rule Set.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RuleSet>> putOutboundRulesetAsync(ApiRequest<RuleSet> request, final AsyncApiCallback<ApiResponse<RuleSet>> callback) {
    try {
      final SettableFuture<ApiResponse<RuleSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RuleSet>() {}, new AsyncApiCallback<ApiResponse<RuleSet>>() {
        @Override
        public void onCompleted(ApiResponse<RuleSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignSchedule> putOutboundSchedulesCampaignAsync(PutOutboundSchedulesCampaignRequest request, final AsyncApiCallback<CampaignSchedule> callback) {
    try {
      final SettableFuture<CampaignSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<CampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignSchedule>> putOutboundSchedulesCampaignAsync(ApiRequest<CampaignSchedule> request, final AsyncApiCallback<ApiResponse<CampaignSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<CampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an email campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailCampaignSchedule> putOutboundSchedulesEmailcampaignAsync(PutOutboundSchedulesEmailcampaignRequest request, final AsyncApiCallback<EmailCampaignSchedule> callback) {
    try {
      final SettableFuture<EmailCampaignSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<EmailCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<EmailCampaignSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an email campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailCampaignSchedule>> putOutboundSchedulesEmailcampaignAsync(ApiRequest<EmailCampaignSchedule> request, final AsyncApiCallback<ApiResponse<EmailCampaignSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<EmailCampaignSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<EmailCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<EmailCampaignSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailCampaignSchedule> response = (ApiResponse<EmailCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new messaging campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MessagingCampaignSchedule> putOutboundSchedulesMessagingcampaignAsync(PutOutboundSchedulesMessagingcampaignRequest request, final AsyncApiCallback<MessagingCampaignSchedule> callback) {
    try {
      final SettableFuture<MessagingCampaignSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new messaging campaign schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MessagingCampaignSchedule>> putOutboundSchedulesMessagingcampaignAsync(ApiRequest<MessagingCampaignSchedule> request, final AsyncApiCallback<ApiResponse<MessagingCampaignSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingCampaignSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingCampaignSchedule>() {}, new AsyncApiCallback<ApiResponse<MessagingCampaignSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingCampaignSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingCampaignSchedule> response = (ApiResponse<MessagingCampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SequenceSchedule> putOutboundSchedulesSequenceAsync(PutOutboundSchedulesSequenceRequest request, final AsyncApiCallback<SequenceSchedule> callback) {
    try {
      final SettableFuture<SequenceSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {}, new AsyncApiCallback<ApiResponse<SequenceSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<SequenceSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SequenceSchedule>> putOutboundSchedulesSequenceAsync(ApiRequest<SequenceSchedule> request, final AsyncApiCallback<ApiResponse<SequenceSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<SequenceSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SequenceSchedule>() {}, new AsyncApiCallback<ApiResponse<SequenceSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<SequenceSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CampaignSequence> putOutboundSequenceAsync(PutOutboundSequenceRequest request, final AsyncApiCallback<CampaignSequence> callback) {
    try {
      final SettableFuture<CampaignSequence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CampaignSequence>() {}, new AsyncApiCallback<ApiResponse<CampaignSequence>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequence> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CampaignSequence>> putOutboundSequenceAsync(ApiRequest<CampaignSequence> request, final AsyncApiCallback<ApiResponse<CampaignSequence>> callback) {
    try {
      final SettableFuture<ApiResponse<CampaignSequence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CampaignSequence>() {}, new AsyncApiCallback<ApiResponse<CampaignSequence>>() {
        @Override
        public void onCompleted(ApiResponse<CampaignSequence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WrapUpCodeMapping> putOutboundWrapupcodemappingsAsync(PutOutboundWrapupcodemappingsRequest request, final AsyncApiCallback<WrapUpCodeMapping> callback) {
    try {
      final SettableFuture<WrapUpCodeMapping> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {}, new AsyncApiCallback<ApiResponse<WrapUpCodeMapping>>() {
        @Override
        public void onCompleted(ApiResponse<WrapUpCodeMapping> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WrapUpCodeMapping>> putOutboundWrapupcodemappingsAsync(ApiRequest<WrapUpCodeMapping> request, final AsyncApiCallback<ApiResponse<WrapUpCodeMapping>> callback) {
    try {
      final SettableFuture<ApiResponse<WrapUpCodeMapping>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WrapUpCodeMapping>() {}, new AsyncApiCallback<ApiResponse<WrapUpCodeMapping>>() {
        @Override
        public void onCompleted(ApiResponse<WrapUpCodeMapping> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }


  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
