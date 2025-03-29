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

import com.mypurecloud.sdk.v2.model.ArchitectExportJobStateResponse;
import com.mypurecloud.sdk.v2.model.ArchitectJobStateResponse;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.CriteriaQuery;
import com.mypurecloud.sdk.v2.model.DataTable;
import com.mypurecloud.sdk.v2.model.DataTableExportJob;
import com.mypurecloud.sdk.v2.model.DataTableImportEntityListing;
import com.mypurecloud.sdk.v2.model.DataTableImportJob;
import com.mypurecloud.sdk.v2.model.DataTableRowEntityListing;
import com.mypurecloud.sdk.v2.model.DataTablesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroup;
import com.mypurecloud.sdk.v2.model.EmergencyGroupDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroupListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataFlowSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataRequest;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchRequest;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchResponse;
import com.mypurecloud.sdk.v2.model.FlowHealth;
import com.mypurecloud.sdk.v2.model.FlowHealthIntent;
import com.mypurecloud.sdk.v2.model.FlowHealthUtterance;
import com.mypurecloud.sdk.v2.model.FlowLogLevelCharacteristicsDefinitions;
import com.mypurecloud.sdk.v2.model.FlowLogLevelRequest;
import com.mypurecloud.sdk.v2.model.FlowMilestone;
import com.mypurecloud.sdk.v2.model.FlowMilestoneDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowMilestoneListing;
import com.mypurecloud.sdk.v2.model.FlowOutcome;
import com.mypurecloud.sdk.v2.model.FlowOutcomeDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowOutcomeListing;
import com.mypurecloud.sdk.v2.model.FlowResultEntityListing;
import com.mypurecloud.sdk.v2.model.FlowRuntimeExecution;
import com.mypurecloud.sdk.v2.model.FlowSettingsResponse;
import com.mypurecloud.sdk.v2.model.FlowSettingsResponseEntityListing;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowsQueryCriteriaResponse;
import com.mypurecloud.sdk.v2.model.GetFlowExecutionDataJobResult;
import com.mypurecloud.sdk.v2.model.Grammar;
import com.mypurecloud.sdk.v2.model.GrammarFileUploadRequest;
import com.mypurecloud.sdk.v2.model.GrammarLanguage;
import com.mypurecloud.sdk.v2.model.GrammarLanguageUpdate;
import com.mypurecloud.sdk.v2.model.GrammarListing;
import com.mypurecloud.sdk.v2.model.HistoryListing;
import com.mypurecloud.sdk.v2.model.IVR;
import com.mypurecloud.sdk.v2.model.IVRDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.IVREntityListing;
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetUpload;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.RegisterArchitectExportJob;
import com.mypurecloud.sdk.v2.model.RegisterArchitectExportJobResponse;
import com.mypurecloud.sdk.v2.model.RegisterArchitectJobResponse;
import com.mypurecloud.sdk.v2.model.Schedule;
import com.mypurecloud.sdk.v2.model.ScheduleDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleGroup;
import com.mypurecloud.sdk.v2.model.ScheduleGroupDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleGroupEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteArchitectEmergencygroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectGrammarRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectGrammarLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectGrammarLanguageFilesDtmfRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectGrammarLanguageFilesVoiceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectIvrRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptResourceAudioRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectSchedulegroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowInstancesSettingsLoglevelsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowsDatatableRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowsDatatableRowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowsInstancesSettingsLoglevelsDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowsMilestoneRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingBuildRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingConsumedresourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingConsumingresourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingDeletedresourceconsumersRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingObjectRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingTypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingUpdatedresourceconsumersRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectEmergencygroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectEmergencygroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectEmergencygroupsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectGrammarRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectGrammarLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectGrammarsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectIvrRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectIvrIdentityresolutionRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectIvrsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectIvrsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptHistoryHistoryIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSchedulegroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSchedulegroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSchedulegroupsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSchedulesDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptHistoryHistoryIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowHistoryHistoryIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowInstancesSettingsLoglevelsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowLatestconfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionConfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionHealthRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionIntentHealthRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionIntentUtteranceHealthRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatableRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatableExportJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatableImportJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatableImportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatableRowRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatableRowsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatablesRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatablesDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDatatablesDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsExecutionRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsExportJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsInstanceRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsInstancesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsInstancesQuerycapabilitiesRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsInstancesSettingsExecutiondataRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsInstancesSettingsLoglevelsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsInstancesSettingsLoglevelsCharacteristicsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsInstancesSettingsLoglevelsDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsMilestoneRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsMilestonesRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsMilestonesDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsOutcomesDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchArchitectGrammarRequest;
import com.mypurecloud.sdk.v2.api.request.PatchArchitectGrammarLanguageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchFlowsInstancesSettingsExecutiondataRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectDependencytrackingBuildRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectEmergencygroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectGrammarLanguageFilesDtmfRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectGrammarLanguageFilesVoiceRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectGrammarLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectGrammarsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectIvrsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptResourceUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSchedulegroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSystempromptHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSystempromptResourceUploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowInstancesSettingsLoglevelsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsCheckinRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsCheckoutRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsDeactivateRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsRevertRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsUnlockRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsDatatableExportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsDatatableImportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsDatatableRowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsDatatablesRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsExecutionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsExportJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsInstancesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsInstancesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsMilestonesRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectEmergencygroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectIvrRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectIvrIdentityresolutionRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectSchedulegroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowInstancesSettingsLoglevelsRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowsDatatableRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowsDatatableRowRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowsInstancesSettingsLoglevelsDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowsMilestoneRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowsOutcomeRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class ArchitectApiAsync {
  private final ApiClient pcapiClient;

  public ArchitectApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ArchitectApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Deletes a emergency group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectEmergencygroupAsync(DeleteArchitectEmergencygroupRequest request, final AsyncApiCallback<Void> callback) {
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
   * Deletes a emergency group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectEmergencygroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a grammar.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteArchitectGrammarAsync(DeleteArchitectGrammarRequest request, final AsyncApiCallback<Empty> callback) {
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
   * Delete a grammar.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteArchitectGrammarAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
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
   * Delete specified grammar language
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectGrammarLanguageAsync(DeleteArchitectGrammarLanguageRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete specified grammar language
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectGrammarLanguageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Clear the DTMF mode file for the grammar language if there is one
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectGrammarLanguageFilesDtmfAsync(DeleteArchitectGrammarLanguageFilesDtmfRequest request, final AsyncApiCallback<Void> callback) {
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
   * Clear the DTMF mode file for the grammar language if there is one
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectGrammarLanguageFilesDtmfAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Clear the voice mode file for the grammar language if there is one
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectGrammarLanguageFilesVoiceAsync(DeleteArchitectGrammarLanguageFilesVoiceRequest request, final AsyncApiCallback<Void> callback) {
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
   * Clear the voice mode file for the grammar language if there is one
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectGrammarLanguageFilesVoiceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete an IVR Config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectIvrAsync(DeleteArchitectIvrRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an IVR Config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectIvrAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectPromptAsync(DeleteArchitectPromptRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectPromptAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectPromptResourceAsync(DeleteArchitectPromptResourceRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectPromptResourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete specified user prompt resource audio
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectPromptResourceAudioAsync(DeleteArchitectPromptResourceAudioRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete specified user prompt resource audio
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectPromptResourceAudioAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Batch-delete a list of prompts
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> deleteArchitectPromptsAsync(DeleteArchitectPromptsRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Batch-delete a list of prompts
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> deleteArchitectPromptsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete a schedule by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectScheduleAsync(DeleteArchitectScheduleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a schedule by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Deletes a schedule group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectSchedulegroupAsync(DeleteArchitectSchedulegroupRequest request, final AsyncApiCallback<Void> callback) {
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
   * Deletes a schedule group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectSchedulegroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectSystempromptResourceAsync(DeleteArchitectSystempromptResourceRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectSystempromptResourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteFlowAsync(DeleteFlowRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteFlowAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Deletes a log level for a flow by flow id.
   * Deletes the associated log level for a flow by flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteFlowInstancesSettingsLoglevelsAsync(DeleteFlowInstancesSettingsLoglevelsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Deletes a log level for a flow by flow id.
   * Deletes the associated log level for a flow by flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteFlowInstancesSettingsLoglevelsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Batch-delete a list of flows
   * Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> deleteFlowsAsync(DeleteFlowsRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Batch-delete a list of flows
   * Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> deleteFlowsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
   * deletes a specific datatable by id
   * Deletes an entire datatable (including the schema and data) with a given datatableId
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteFlowsDatatableAsync(DeleteFlowsDatatableRequest request, final AsyncApiCallback<Void> callback) {
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
   * deletes a specific datatable by id
   * Deletes an entire datatable (including the schema and data) with a given datatableId
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteFlowsDatatableAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a row entry
   * Deletes a row with a given rowId (the value of the key field).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteFlowsDatatableRowAsync(DeleteFlowsDatatableRowRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a row entry
   * Deletes a row with a given rowId (the value of the key field).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteFlowsDatatableRowAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Resets the org log level to default, base
   * Resets the org log level to default, base
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteFlowsInstancesSettingsLoglevelsDefaultAsync(DeleteFlowsInstancesSettingsLoglevelsDefaultRequest request, final AsyncApiCallback<Void> callback) {
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
   * Resets the org log level to default, base
   * Resets the org log level to default, base
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteFlowsInstancesSettingsLoglevelsDefaultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a flow milestone.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteFlowsMilestoneAsync(DeleteFlowsMilestoneRequest request, final AsyncApiCallback<Empty> callback) {
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
   * Delete a flow milestone.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteFlowsMilestoneAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
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
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingAsync(GetArchitectDependencytrackingRequest request, final AsyncApiCallback<DependencyObjectEntityListing> callback) {
    try {
      final SettableFuture<DependencyObjectEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
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
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyObjectEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Dependency Tracking build status for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyStatus> getArchitectDependencytrackingBuildAsync(GetArchitectDependencytrackingBuildRequest request, final AsyncApiCallback<DependencyStatus> callback) {
    try {
      final SettableFuture<DependencyStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyStatus>() {}, new AsyncApiCallback<ApiResponse<DependencyStatus>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyStatus> response) {
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
   * Get Dependency Tracking build status for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyStatus>> getArchitectDependencytrackingBuildAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyStatus>() {}, new AsyncApiCallback<ApiResponse<DependencyStatus>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyStatus> response = (ApiResponse<DependencyStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyStatus> response = (ApiResponse<DependencyStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConsumedResourcesEntityListing> getArchitectDependencytrackingConsumedresourcesAsync(GetArchitectDependencytrackingConsumedresourcesRequest request, final AsyncApiCallback<ConsumedResourcesEntityListing> callback) {
    try {
      final SettableFuture<ConsumedResourcesEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConsumedResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumedResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumedResourcesEntityListing> response) {
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
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConsumedResourcesEntityListing>> getArchitectDependencytrackingConsumedresourcesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ConsumedResourcesEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ConsumedResourcesEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConsumedResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumedResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumedResourcesEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumedResourcesEntityListing> response = (ApiResponse<ConsumedResourcesEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumedResourcesEntityListing> response = (ApiResponse<ConsumedResourcesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConsumingResourcesEntityListing> getArchitectDependencytrackingConsumingresourcesAsync(GetArchitectDependencytrackingConsumingresourcesRequest request, final AsyncApiCallback<ConsumingResourcesEntityListing> callback) {
    try {
      final SettableFuture<ConsumingResourcesEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConsumingResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumingResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumingResourcesEntityListing> response) {
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
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConsumingResourcesEntityListing>> getArchitectDependencytrackingConsumingresourcesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ConsumingResourcesEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ConsumingResourcesEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConsumingResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumingResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumingResourcesEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumingResourcesEntityListing> response = (ApiResponse<ConsumingResourcesEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumingResourcesEntityListing> response = (ApiResponse<ConsumingResourcesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingDeletedresourceconsumersAsync(GetArchitectDependencytrackingDeletedresourceconsumersRequest request, final AsyncApiCallback<DependencyObjectEntityListing> callback) {
    try {
      final SettableFuture<DependencyObjectEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
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
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingDeletedresourceconsumersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyObjectEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObject> getArchitectDependencytrackingObjectAsync(GetArchitectDependencytrackingObjectRequest request, final AsyncApiCallback<DependencyObject> callback) {
    try {
      final SettableFuture<DependencyObject> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObject>() {}, new AsyncApiCallback<ApiResponse<DependencyObject>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObject> response) {
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
   * Get a Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObject>> getArchitectDependencytrackingObjectAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyObject>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyObject>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObject>() {}, new AsyncApiCallback<ApiResponse<DependencyObject>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObject> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObject> response = (ApiResponse<DependencyObject>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObject> response = (ApiResponse<DependencyObject>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a Dependency Tracking type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyType> getArchitectDependencytrackingTypeAsync(GetArchitectDependencytrackingTypeRequest request, final AsyncApiCallback<DependencyType> callback) {
    try {
      final SettableFuture<DependencyType> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyType>() {}, new AsyncApiCallback<ApiResponse<DependencyType>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyType> response) {
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
   * Get a Dependency Tracking type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyType>> getArchitectDependencytrackingTypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyType>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyType>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyType>() {}, new AsyncApiCallback<ApiResponse<DependencyType>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyType> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyType> response = (ApiResponse<DependencyType>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyType> response = (ApiResponse<DependencyType>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Dependency Tracking types.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyTypeEntityListing> getArchitectDependencytrackingTypesAsync(GetArchitectDependencytrackingTypesRequest request, final AsyncApiCallback<DependencyTypeEntityListing> callback) {
    try {
      final SettableFuture<DependencyTypeEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyTypeEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyTypeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyTypeEntityListing> response) {
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
   * Get Dependency Tracking types.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyTypeEntityListing>> getArchitectDependencytrackingTypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyTypeEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyTypeEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyTypeEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyTypeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyTypeEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyTypeEntityListing> response = (ApiResponse<DependencyTypeEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyTypeEntityListing> response = (ApiResponse<DependencyTypeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingUpdatedresourceconsumersAsync(GetArchitectDependencytrackingUpdatedresourceconsumersRequest request, final AsyncApiCallback<DependencyObjectEntityListing> callback) {
    try {
      final SettableFuture<DependencyObjectEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
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
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingUpdatedresourceconsumersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyObjectEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets a emergency group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmergencyGroup> getArchitectEmergencygroupAsync(GetArchitectEmergencygroupRequest request, final AsyncApiCallback<EmergencyGroup> callback) {
    try {
      final SettableFuture<EmergencyGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmergencyGroup>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroup> response) {
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
   * Gets a emergency group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmergencyGroup>> getArchitectEmergencygroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmergencyGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<EmergencyGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmergencyGroup>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of emergency groups.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmergencyGroupListing> getArchitectEmergencygroupsAsync(GetArchitectEmergencygroupsRequest request, final AsyncApiCallback<EmergencyGroupListing> callback) {
    try {
      final SettableFuture<EmergencyGroupListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmergencyGroupListing>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroupListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroupListing> response) {
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
   * Get a list of emergency groups.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmergencyGroupListing>> getArchitectEmergencygroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmergencyGroupListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EmergencyGroupListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmergencyGroupListing>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroupListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroupListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroupListing> response = (ApiResponse<EmergencyGroupListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroupListing> response = (ApiResponse<EmergencyGroupListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of basic emergency group objects filterable by query parameters.
   * This returns emergency groups consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmergencyGroupDivisionViewEntityListing> getArchitectEmergencygroupsDivisionviewsAsync(GetArchitectEmergencygroupsDivisionviewsRequest request, final AsyncApiCallback<EmergencyGroupDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<EmergencyGroupDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmergencyGroupDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroupDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroupDivisionViewEntityListing> response) {
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
   * Get a pageable list of basic emergency group objects filterable by query parameters.
   * This returns emergency groups consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmergencyGroupDivisionViewEntityListing>> getArchitectEmergencygroupsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmergencyGroupDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EmergencyGroupDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmergencyGroupDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroupDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroupDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroupDivisionViewEntityListing> response = (ApiResponse<EmergencyGroupDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroupDivisionViewEntityListing> response = (ApiResponse<EmergencyGroupDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a grammar
   * Returns a specified grammar
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Grammar> getArchitectGrammarAsync(GetArchitectGrammarRequest request, final AsyncApiCallback<Grammar> callback) {
    try {
      final SettableFuture<Grammar> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Grammar>() {}, new AsyncApiCallback<ApiResponse<Grammar>>() {
        @Override
        public void onCompleted(ApiResponse<Grammar> response) {
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
   * Get a grammar
   * Returns a specified grammar
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Grammar>> getArchitectGrammarAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Grammar>> callback) {
    try {
      final SettableFuture<ApiResponse<Grammar>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Grammar>() {}, new AsyncApiCallback<ApiResponse<Grammar>>() {
        @Override
        public void onCompleted(ApiResponse<Grammar> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a grammar language.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GrammarLanguage> getArchitectGrammarLanguageAsync(GetArchitectGrammarLanguageRequest request, final AsyncApiCallback<GrammarLanguage> callback) {
    try {
      final SettableFuture<GrammarLanguage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GrammarLanguage>() {}, new AsyncApiCallback<ApiResponse<GrammarLanguage>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarLanguage> response) {
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
   * Get a grammar language.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GrammarLanguage>> getArchitectGrammarLanguageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GrammarLanguage>> callback) {
    try {
      final SettableFuture<ApiResponse<GrammarLanguage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GrammarLanguage>() {}, new AsyncApiCallback<ApiResponse<GrammarLanguage>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarLanguage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of grammars, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching grammars will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GrammarListing> getArchitectGrammarsAsync(GetArchitectGrammarsRequest request, final AsyncApiCallback<GrammarListing> callback) {
    try {
      final SettableFuture<GrammarListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GrammarListing>() {}, new AsyncApiCallback<ApiResponse<GrammarListing>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarListing> response) {
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
   * Get a pageable list of grammars, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching grammars will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GrammarListing>> getArchitectGrammarsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GrammarListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GrammarListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GrammarListing>() {}, new AsyncApiCallback<ApiResponse<GrammarListing>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarListing> response = (ApiResponse<GrammarListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarListing> response = (ApiResponse<GrammarListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an IVR config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IVR> getArchitectIvrAsync(GetArchitectIvrRequest request, final AsyncApiCallback<IVR> callback) {
    try {
      final SettableFuture<IVR> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IVR>() {}, new AsyncApiCallback<ApiResponse<IVR>>() {
        @Override
        public void onCompleted(ApiResponse<IVR> response) {
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
   * Get an IVR config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IVR>> getArchitectIvrAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IVR>> callback) {
    try {
      final SettableFuture<ApiResponse<IVR>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IVR>() {}, new AsyncApiCallback<ApiResponse<IVR>>() {
        @Override
        public void onCompleted(ApiResponse<IVR> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an IVR IdentityResolutionConfig.
   * 
   * getArchitectIvrIdentityresolution is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IdentityResolutionConfig> getArchitectIvrIdentityresolutionAsync(GetArchitectIvrIdentityresolutionRequest request, final AsyncApiCallback<IdentityResolutionConfig> callback) {
    try {
      final SettableFuture<IdentityResolutionConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {}, new AsyncApiCallback<ApiResponse<IdentityResolutionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<IdentityResolutionConfig> response) {
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
   * Get an IVR IdentityResolutionConfig.
   * 
   * getArchitectIvrIdentityresolution is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IdentityResolutionConfig>> getArchitectIvrIdentityresolutionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IdentityResolutionConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<IdentityResolutionConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IdentityResolutionConfig>() {}, new AsyncApiCallback<ApiResponse<IdentityResolutionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<IdentityResolutionConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get IVR configs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IVREntityListing> getArchitectIvrsAsync(GetArchitectIvrsRequest request, final AsyncApiCallback<IVREntityListing> callback) {
    try {
      final SettableFuture<IVREntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IVREntityListing>() {}, new AsyncApiCallback<ApiResponse<IVREntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IVREntityListing> response) {
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
   * Get IVR configs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IVREntityListing>> getArchitectIvrsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IVREntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<IVREntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IVREntityListing>() {}, new AsyncApiCallback<ApiResponse<IVREntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IVREntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IVREntityListing> response = (ApiResponse<IVREntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IVREntityListing> response = (ApiResponse<IVREntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of basic ivr configuration information objects filterable by query parameters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IVRDivisionViewEntityListing> getArchitectIvrsDivisionviewsAsync(GetArchitectIvrsDivisionviewsRequest request, final AsyncApiCallback<IVRDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<IVRDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IVRDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<IVRDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IVRDivisionViewEntityListing> response) {
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
   * Get a pageable list of basic ivr configuration information objects filterable by query parameters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IVRDivisionViewEntityListing>> getArchitectIvrsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IVRDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<IVRDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IVRDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<IVRDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<IVRDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IVRDivisionViewEntityListing> response = (ApiResponse<IVRDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IVRDivisionViewEntityListing> response = (ApiResponse<IVRDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Prompt> getArchitectPromptAsync(GetArchitectPromptRequest request, final AsyncApiCallback<Prompt> callback) {
    try {
      final SettableFuture<Prompt> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
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
   * Get specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Prompt>> getArchitectPromptAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Prompt>> callback) {
    try {
      final SettableFuture<ApiResponse<Prompt>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get generated prompt history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HistoryListing> getArchitectPromptHistoryHistoryIdAsync(GetArchitectPromptHistoryHistoryIdRequest request, final AsyncApiCallback<HistoryListing> callback) {
    try {
      final SettableFuture<HistoryListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HistoryListing>() {}, new AsyncApiCallback<ApiResponse<HistoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoryListing> response) {
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
   * Get generated prompt history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HistoryListing>> getArchitectPromptHistoryHistoryIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<HistoryListing>> callback) {
    try {
      final SettableFuture<ApiResponse<HistoryListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HistoryListing>() {}, new AsyncApiCallback<ApiResponse<HistoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoryListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAsset> getArchitectPromptResourceAsync(GetArchitectPromptResourceRequest request, final AsyncApiCallback<PromptAsset> callback) {
    try {
      final SettableFuture<PromptAsset> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
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
   * Get specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAsset>> getArchitectPromptResourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    try {
      final SettableFuture<ApiResponse<PromptAsset>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAssetEntityListing> getArchitectPromptResourcesAsync(GetArchitectPromptResourcesRequest request, final AsyncApiCallback<PromptAssetEntityListing> callback) {
    try {
      final SettableFuture<PromptAssetEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetEntityListing> response) {
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
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAssetEntityListing>> getArchitectPromptResourcesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PromptAssetEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<PromptAssetEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetEntityListing> response = (ApiResponse<PromptAssetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetEntityListing> response = (ApiResponse<PromptAssetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptEntityListing> getArchitectPromptsAsync(GetArchitectPromptsRequest request, final AsyncApiCallback<PromptEntityListing> callback) {
    try {
      final SettableFuture<PromptEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptEntityListing> response) {
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
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptEntityListing>> getArchitectPromptsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PromptEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<PromptEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptEntityListing> response = (ApiResponse<PromptEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptEntityListing> response = (ApiResponse<PromptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a schedule by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Schedule> getArchitectScheduleAsync(GetArchitectScheduleRequest request, final AsyncApiCallback<Schedule> callback) {
    try {
      final SettableFuture<Schedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Schedule>() {}, new AsyncApiCallback<ApiResponse<Schedule>>() {
        @Override
        public void onCompleted(ApiResponse<Schedule> response) {
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
   * Get a schedule by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Schedule>> getArchitectScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Schedule>> callback) {
    try {
      final SettableFuture<ApiResponse<Schedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Schedule>() {}, new AsyncApiCallback<ApiResponse<Schedule>>() {
        @Override
        public void onCompleted(ApiResponse<Schedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets a schedule group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleGroup> getArchitectSchedulegroupAsync(GetArchitectSchedulegroupRequest request, final AsyncApiCallback<ScheduleGroup> callback) {
    try {
      final SettableFuture<ScheduleGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleGroup>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroup> response) {
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
   * Gets a schedule group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleGroup>> getArchitectSchedulegroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScheduleGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleGroup>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of schedule groups.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleGroupEntityListing> getArchitectSchedulegroupsAsync(GetArchitectSchedulegroupsRequest request, final AsyncApiCallback<ScheduleGroupEntityListing> callback) {
    try {
      final SettableFuture<ScheduleGroupEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleGroupEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroupEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroupEntityListing> response) {
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
   * Get a list of schedule groups.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleGroupEntityListing>> getArchitectSchedulegroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScheduleGroupEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleGroupEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleGroupEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroupEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroupEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroupEntityListing> response = (ApiResponse<ScheduleGroupEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroupEntityListing> response = (ApiResponse<ScheduleGroupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of basic schedule group configuration information objects filterable by query parameters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleGroupDivisionViewEntityListing> getArchitectSchedulegroupsDivisionviewsAsync(GetArchitectSchedulegroupsDivisionviewsRequest request, final AsyncApiCallback<ScheduleGroupDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<ScheduleGroupDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleGroupDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroupDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroupDivisionViewEntityListing> response) {
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
   * Get a pageable list of basic schedule group configuration information objects filterable by query parameters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleGroupDivisionViewEntityListing>> getArchitectSchedulegroupsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScheduleGroupDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleGroupDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleGroupDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroupDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroupDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroupDivisionViewEntityListing> response = (ApiResponse<ScheduleGroupDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroupDivisionViewEntityListing> response = (ApiResponse<ScheduleGroupDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleEntityListing> getArchitectSchedulesAsync(GetArchitectSchedulesRequest request, final AsyncApiCallback<ScheduleEntityListing> callback) {
    try {
      final SettableFuture<ScheduleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleEntityListing> response) {
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
   * Get a list of schedules.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleEntityListing>> getArchitectSchedulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScheduleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleEntityListing> response = (ApiResponse<ScheduleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleEntityListing> response = (ApiResponse<ScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of basic schedule configuration information objects filterable by query parameters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleDivisionViewEntityListing> getArchitectSchedulesDivisionviewsAsync(GetArchitectSchedulesDivisionviewsRequest request, final AsyncApiCallback<ScheduleDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<ScheduleDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleDivisionViewEntityListing> response) {
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
   * Get a pageable list of basic schedule configuration information objects filterable by query parameters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleDivisionViewEntityListing>> getArchitectSchedulesDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScheduleDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<ScheduleDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleDivisionViewEntityListing> response = (ApiResponse<ScheduleDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleDivisionViewEntityListing> response = (ApiResponse<ScheduleDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a system prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPrompt> getArchitectSystempromptAsync(GetArchitectSystempromptRequest request, final AsyncApiCallback<SystemPrompt> callback) {
    try {
      final SettableFuture<SystemPrompt> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPrompt>() {}, new AsyncApiCallback<ApiResponse<SystemPrompt>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPrompt> response) {
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
   * Get a system prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPrompt>> getArchitectSystempromptAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SystemPrompt>> callback) {
    try {
      final SettableFuture<ApiResponse<SystemPrompt>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPrompt>() {}, new AsyncApiCallback<ApiResponse<SystemPrompt>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPrompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPrompt> response = (ApiResponse<SystemPrompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPrompt> response = (ApiResponse<SystemPrompt>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get generated prompt history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HistoryListing> getArchitectSystempromptHistoryHistoryIdAsync(GetArchitectSystempromptHistoryHistoryIdRequest request, final AsyncApiCallback<HistoryListing> callback) {
    try {
      final SettableFuture<HistoryListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HistoryListing>() {}, new AsyncApiCallback<ApiResponse<HistoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoryListing> response) {
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
   * Get generated prompt history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HistoryListing>> getArchitectSystempromptHistoryHistoryIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<HistoryListing>> callback) {
    try {
      final SettableFuture<ApiResponse<HistoryListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HistoryListing>() {}, new AsyncApiCallback<ApiResponse<HistoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoryListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a system prompt resource.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAsset> getArchitectSystempromptResourceAsync(GetArchitectSystempromptResourceRequest request, final AsyncApiCallback<SystemPromptAsset> callback) {
    try {
      final SettableFuture<SystemPromptAsset> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
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
   * Get a system prompt resource.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAsset>> getArchitectSystempromptResourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    try {
      final SettableFuture<ApiResponse<SystemPromptAsset>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get system prompt resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAssetEntityListing> getArchitectSystempromptResourcesAsync(GetArchitectSystempromptResourcesRequest request, final AsyncApiCallback<SystemPromptAssetEntityListing> callback) {
    try {
      final SettableFuture<SystemPromptAssetEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAssetEntityListing> response) {
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
   * Get system prompt resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAssetEntityListing>> getArchitectSystempromptResourcesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SystemPromptAssetEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SystemPromptAssetEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAssetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAssetEntityListing> response = (ApiResponse<SystemPromptAssetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAssetEntityListing> response = (ApiResponse<SystemPromptAssetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get System Prompts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptEntityListing> getArchitectSystempromptsAsync(GetArchitectSystempromptsRequest request, final AsyncApiCallback<SystemPromptEntityListing> callback) {
    try {
      final SettableFuture<SystemPromptEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptEntityListing> response) {
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
   * Get System Prompts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptEntityListing>> getArchitectSystempromptsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SystemPromptEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SystemPromptEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptEntityListing> response = (ApiResponse<SystemPromptEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptEntityListing> response = (ApiResponse<SystemPromptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> getFlowAsync(GetFlowRequest request, final AsyncApiCallback<Flow> callback) {
    try {
      final SettableFuture<Flow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
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
   * Get flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> getFlowAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      final SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get generated flow history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HistoryListing> getFlowHistoryHistoryIdAsync(GetFlowHistoryHistoryIdRequest request, final AsyncApiCallback<HistoryListing> callback) {
    try {
      final SettableFuture<HistoryListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HistoryListing>() {}, new AsyncApiCallback<ApiResponse<HistoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoryListing> response) {
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
   * Get generated flow history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HistoryListing>> getFlowHistoryHistoryIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<HistoryListing>> callback) {
    try {
      final SettableFuture<ApiResponse<HistoryListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HistoryListing>() {}, new AsyncApiCallback<ApiResponse<HistoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoryListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves the log level for a flow by flow id.
   * Retrieves the log level for a flow by flow id.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowSettingsResponse> getFlowInstancesSettingsLoglevelsAsync(GetFlowInstancesSettingsLoglevelsRequest request, final AsyncApiCallback<FlowSettingsResponse> callback) {
    try {
      final SettableFuture<FlowSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
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
   * Retrieves the log level for a flow by flow id.
   * Retrieves the log level for a flow by flow id.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowSettingsResponse>> getFlowInstancesSettingsLoglevelsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the latest configuration for flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Object> getFlowLatestconfigurationAsync(GetFlowLatestconfigurationRequest request, final AsyncApiCallback<Object> callback) {
    try {
      final SettableFuture<Object> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
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
   * Get the latest configuration for flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Object>> getFlowLatestconfigurationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Object>> callback) {
    try {
      final SettableFuture<ApiResponse<Object>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowVersion> getFlowVersionAsync(GetFlowVersionRequest request, final AsyncApiCallback<FlowVersion> callback) {
    try {
      final SettableFuture<FlowVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
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
   * Get flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowVersion>> getFlowVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get flow version configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Object> getFlowVersionConfigurationAsync(GetFlowVersionConfigurationRequest request, final AsyncApiCallback<Object> callback) {
    try {
      final SettableFuture<Object> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
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
   * Get flow version configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Object>> getFlowVersionConfigurationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Object>> callback) {
    try {
      final SettableFuture<ApiResponse<Object>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get overall health scores for all intents present in the NLU domain version associated with the bot flow version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowHealth> getFlowVersionHealthAsync(GetFlowVersionHealthRequest request, final AsyncApiCallback<FlowHealth> callback) {
    try {
      final SettableFuture<FlowHealth> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowHealth>() {}, new AsyncApiCallback<ApiResponse<FlowHealth>>() {
        @Override
        public void onCompleted(ApiResponse<FlowHealth> response) {
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
   * Get overall health scores for all intents present in the NLU domain version associated with the bot flow version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowHealth>> getFlowVersionHealthAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowHealth>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowHealth>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowHealth>() {}, new AsyncApiCallback<ApiResponse<FlowHealth>>() {
        @Override
        public void onCompleted(ApiResponse<FlowHealth> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowHealth> response = (ApiResponse<FlowHealth>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowHealth> response = (ApiResponse<FlowHealth>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowHealthIntent> getFlowVersionIntentHealthAsync(GetFlowVersionIntentHealthRequest request, final AsyncApiCallback<FlowHealthIntent> callback) {
    try {
      final SettableFuture<FlowHealthIntent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowHealthIntent>() {}, new AsyncApiCallback<ApiResponse<FlowHealthIntent>>() {
        @Override
        public void onCompleted(ApiResponse<FlowHealthIntent> response) {
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
   * Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowHealthIntent>> getFlowVersionIntentHealthAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowHealthIntent>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowHealthIntent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowHealthIntent>() {}, new AsyncApiCallback<ApiResponse<FlowHealthIntent>>() {
        @Override
        public void onCompleted(ApiResponse<FlowHealthIntent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowHealthIntent> response = (ApiResponse<FlowHealthIntent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowHealthIntent> response = (ApiResponse<FlowHealthIntent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get health metrics associated with a specific utterance of an intent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowHealthUtterance> getFlowVersionIntentUtteranceHealthAsync(GetFlowVersionIntentUtteranceHealthRequest request, final AsyncApiCallback<FlowHealthUtterance> callback) {
    try {
      final SettableFuture<FlowHealthUtterance> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowHealthUtterance>() {}, new AsyncApiCallback<ApiResponse<FlowHealthUtterance>>() {
        @Override
        public void onCompleted(ApiResponse<FlowHealthUtterance> response) {
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
   * Get health metrics associated with a specific utterance of an intent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowHealthUtterance>> getFlowVersionIntentUtteranceHealthAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowHealthUtterance>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowHealthUtterance>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowHealthUtterance>() {}, new AsyncApiCallback<ApiResponse<FlowHealthUtterance>>() {
        @Override
        public void onCompleted(ApiResponse<FlowHealthUtterance> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowHealthUtterance> response = (ApiResponse<FlowHealthUtterance>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowHealthUtterance> response = (ApiResponse<FlowHealthUtterance>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get flow version list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowVersionEntityListing> getFlowVersionsAsync(GetFlowVersionsRequest request, final AsyncApiCallback<FlowVersionEntityListing> callback) {
    try {
      final SettableFuture<FlowVersionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersionEntityListing> response) {
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
   * Get flow version list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowVersionEntityListing>> getFlowVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowVersionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowVersionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersionEntityListing> response = (ApiResponse<FlowVersionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersionEntityListing> response = (ApiResponse<FlowVersionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of flows, filtered by query parameters
   * If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowEntityListing> getFlowsAsync(GetFlowsRequest request, final AsyncApiCallback<FlowEntityListing> callback) {
    try {
      final SettableFuture<FlowEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowEntityListing> response) {
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
   * Get a pageable list of flows, filtered by query parameters
   * If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowEntityListing>> getFlowsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowEntityListing> response = (ApiResponse<FlowEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowEntityListing> response = (ApiResponse<FlowEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTable> getFlowsDatatableAsync(GetFlowsDatatableRequest request, final AsyncApiCallback<DataTable> callback) {
    try {
      final SettableFuture<DataTable> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
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
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTable>> getFlowsDatatableAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTable>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTable>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns the state information about an export job
   * Returns the state information about an export job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTableExportJob> getFlowsDatatableExportJobAsync(GetFlowsDatatableExportJobRequest request, final AsyncApiCallback<DataTableExportJob> callback) {
    try {
      final SettableFuture<DataTableExportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableExportJob> response) {
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
   * Returns the state information about an export job
   * Returns the state information about an export job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTableExportJob>> getFlowsDatatableExportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTableExportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTableExportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableExportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns the state information about an import job
   * Returns the state information about an import job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTableImportJob> getFlowsDatatableImportJobAsync(GetFlowsDatatableImportJobRequest request, final AsyncApiCallback<DataTableImportJob> callback) {
    try {
      final SettableFuture<DataTableImportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableImportJob> response) {
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
   * Returns the state information about an import job
   * Returns the state information about an import job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTableImportJob>> getFlowsDatatableImportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTableImportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTableImportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableImportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all recent import jobs
   * Get all recent import jobs
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTableImportEntityListing> getFlowsDatatableImportJobsAsync(GetFlowsDatatableImportJobsRequest request, final AsyncApiCallback<DataTableImportEntityListing> callback) {
    try {
      final SettableFuture<DataTableImportEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTableImportEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTableImportEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableImportEntityListing> response) {
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
   * Get all recent import jobs
   * Get all recent import jobs
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTableImportEntityListing>> getFlowsDatatableImportJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTableImportEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTableImportEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTableImportEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTableImportEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableImportEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableImportEntityListing> response = (ApiResponse<DataTableImportEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableImportEntityListing> response = (ApiResponse<DataTableImportEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns a specific row for the datatable
   * Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Map<String, Object>> getFlowsDatatableRowAsync(GetFlowsDatatableRowRequest request, final AsyncApiCallback<Map<String, Object>> callback) {
    try {
      final SettableFuture<Map<String, Object>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
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
   * Returns a specific row for the datatable
   * Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Map<String, Object>>> getFlowsDatatableRowAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) {
    try {
      final SettableFuture<ApiResponse<Map<String, Object>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns the rows for the datatable with the given id
   * Returns all of the rows for the datatable with the given datatableId.  By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTableRowEntityListing> getFlowsDatatableRowsAsync(GetFlowsDatatableRowsRequest request, final AsyncApiCallback<DataTableRowEntityListing> callback) {
    try {
      final SettableFuture<DataTableRowEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTableRowEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTableRowEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableRowEntityListing> response) {
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
   * Returns the rows for the datatable with the given id
   * Returns all of the rows for the datatable with the given datatableId.  By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTableRowEntityListing>> getFlowsDatatableRowsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTableRowEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTableRowEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTableRowEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTableRowEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableRowEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableRowEntityListing> response = (ApiResponse<DataTableRowEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableRowEntityListing> response = (ApiResponse<DataTableRowEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTablesDomainEntityListing> getFlowsDatatablesAsync(GetFlowsDatatablesRequest request, final AsyncApiCallback<DataTablesDomainEntityListing> callback) {
    try {
      final SettableFuture<DataTablesDomainEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTablesDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTablesDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTablesDomainEntityListing> response) {
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
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTablesDomainEntityListing>> getFlowsDatatablesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTablesDomainEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTablesDomainEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTablesDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTablesDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTablesDomainEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTable> getFlowsDatatablesDivisionviewAsync(GetFlowsDatatablesDivisionviewRequest request, final AsyncApiCallback<DataTable> callback) {
    try {
      final SettableFuture<DataTable> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
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
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTable>> getFlowsDatatablesDivisionviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTable>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTable>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTablesDomainEntityListing> getFlowsDatatablesDivisionviewsAsync(GetFlowsDatatablesDivisionviewsRequest request, final AsyncApiCallback<DataTablesDomainEntityListing> callback) {
    try {
      final SettableFuture<DataTablesDomainEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTablesDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTablesDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTablesDomainEntityListing> response) {
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
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTablesDomainEntityListing>> getFlowsDatatablesDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTablesDomainEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTablesDomainEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTablesDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataTablesDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataTablesDomainEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of basic flow information objects filterable by query parameters.
   * This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowDivisionViewEntityListing> getFlowsDivisionviewsAsync(GetFlowsDivisionviewsRequest request, final AsyncApiCallback<FlowDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<FlowDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowDivisionViewEntityListing> response) {
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
   * Get a pageable list of basic flow information objects filterable by query parameters.
   * This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowDivisionViewEntityListing>> getFlowsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowDivisionViewEntityListing> response = (ApiResponse<FlowDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowDivisionViewEntityListing> response = (ApiResponse<FlowDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a flow execution's details. Flow execution details are available for several days after the flow is started.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowRuntimeExecution> getFlowsExecutionAsync(GetFlowsExecutionRequest request, final AsyncApiCallback<FlowRuntimeExecution> callback) {
    try {
      final SettableFuture<FlowRuntimeExecution> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowRuntimeExecution>() {}, new AsyncApiCallback<ApiResponse<FlowRuntimeExecution>>() {
        @Override
        public void onCompleted(ApiResponse<FlowRuntimeExecution> response) {
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
   * Get a flow execution's details. Flow execution details are available for several days after the flow is started.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowRuntimeExecution>> getFlowsExecutionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowRuntimeExecution>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowRuntimeExecution>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowRuntimeExecution>() {}, new AsyncApiCallback<ApiResponse<FlowRuntimeExecution>>() {
        @Override
        public void onCompleted(ApiResponse<FlowRuntimeExecution> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowRuntimeExecution> response = (ApiResponse<FlowRuntimeExecution>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowRuntimeExecution> response = (ApiResponse<FlowRuntimeExecution>)(ApiResponse<?>)(new ApiException(exception));
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
   * Fetch Architect Export Job Status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ArchitectExportJobStateResponse> getFlowsExportJobAsync(GetFlowsExportJobRequest request, final AsyncApiCallback<ArchitectExportJobStateResponse> callback) {
    try {
      final SettableFuture<ArchitectExportJobStateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ArchitectExportJobStateResponse>() {}, new AsyncApiCallback<ApiResponse<ArchitectExportJobStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ArchitectExportJobStateResponse> response) {
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
   * Fetch Architect Export Job Status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ArchitectExportJobStateResponse>> getFlowsExportJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ArchitectExportJobStateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ArchitectExportJobStateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ArchitectExportJobStateResponse>() {}, new AsyncApiCallback<ApiResponse<ArchitectExportJobStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ArchitectExportJobStateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ArchitectExportJobStateResponse> response = (ApiResponse<ArchitectExportJobStateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ArchitectExportJobStateResponse> response = (ApiResponse<ArchitectExportJobStateResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Start a process (job) to prepare a download of a singular flow execution data instance by Id
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetFlowExecutionDataJobResult> getFlowsInstanceAsync(GetFlowsInstanceRequest request, final AsyncApiCallback<GetFlowExecutionDataJobResult> callback) {
    try {
      final SettableFuture<GetFlowExecutionDataJobResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetFlowExecutionDataJobResult>() {}, new AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>>() {
        @Override
        public void onCompleted(ApiResponse<GetFlowExecutionDataJobResult> response) {
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
   * Start a process (job) to prepare a download of a singular flow execution data instance by Id
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetFlowExecutionDataJobResult>> getFlowsInstanceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>> callback) {
    try {
      final SettableFuture<ApiResponse<GetFlowExecutionDataJobResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetFlowExecutionDataJobResult>() {}, new AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>>() {
        @Override
        public void onCompleted(ApiResponse<GetFlowExecutionDataJobResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status and/or results of an asynchronous flow execution data retrieval job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetFlowExecutionDataJobResult> getFlowsInstancesJobAsync(GetFlowsInstancesJobRequest request, final AsyncApiCallback<GetFlowExecutionDataJobResult> callback) {
    try {
      final SettableFuture<GetFlowExecutionDataJobResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetFlowExecutionDataJobResult>() {}, new AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>>() {
        @Override
        public void onCompleted(ApiResponse<GetFlowExecutionDataJobResult> response) {
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
   * Get the status and/or results of an asynchronous flow execution data retrieval job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetFlowExecutionDataJobResult>> getFlowsInstancesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>> callback) {
    try {
      final SettableFuture<ApiResponse<GetFlowExecutionDataJobResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetFlowExecutionDataJobResult>() {}, new AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>>() {
        @Override
        public void onCompleted(ApiResponse<GetFlowExecutionDataJobResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve a list of capabilities that the org can use to query for execution data
   * Returns the queryable parameters that can be used to build a query for execution data.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowsQueryCriteriaResponse> getFlowsInstancesQuerycapabilitiesAsync(GetFlowsInstancesQuerycapabilitiesRequest request, final AsyncApiCallback<FlowsQueryCriteriaResponse> callback) {
    try {
      final SettableFuture<FlowsQueryCriteriaResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowsQueryCriteriaResponse>() {}, new AsyncApiCallback<ApiResponse<FlowsQueryCriteriaResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowsQueryCriteriaResponse> response) {
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
   * Retrieve a list of capabilities that the org can use to query for execution data
   * Returns the queryable parameters that can be used to build a query for execution data.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowsQueryCriteriaResponse>> getFlowsInstancesQuerycapabilitiesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowsQueryCriteriaResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowsQueryCriteriaResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowsQueryCriteriaResponse>() {}, new AsyncApiCallback<ApiResponse<FlowsQueryCriteriaResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowsQueryCriteriaResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowsQueryCriteriaResponse> response = (ApiResponse<FlowsQueryCriteriaResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowsQueryCriteriaResponse> response = (ApiResponse<FlowsQueryCriteriaResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExecutionDataFlowSettingsResponse> getFlowsInstancesSettingsExecutiondataAsync(GetFlowsInstancesSettingsExecutiondataRequest request, final AsyncApiCallback<ExecutionDataFlowSettingsResponse> callback) {
    try {
      final SettableFuture<ExecutionDataFlowSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExecutionDataFlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataFlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataFlowSettingsResponse> response) {
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
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExecutionDataFlowSettingsResponse>> getFlowsInstancesSettingsExecutiondataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExecutionDataFlowSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ExecutionDataFlowSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExecutionDataFlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataFlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataFlowSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve a list of LogLevels for the organization.
   * Returns a paged set of LogLevels per flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowSettingsResponseEntityListing> getFlowsInstancesSettingsLoglevelsAsync(GetFlowsInstancesSettingsLoglevelsRequest request, final AsyncApiCallback<FlowSettingsResponseEntityListing> callback) {
    try {
      final SettableFuture<FlowSettingsResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowSettingsResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponseEntityListing> response) {
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
   * Retrieve a list of LogLevels for the organization.
   * Returns a paged set of LogLevels per flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowSettingsResponseEntityListing>> getFlowsInstancesSettingsLoglevelsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowSettingsResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowSettingsResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowSettingsResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponseEntityListing> response = (ApiResponse<FlowSettingsResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponseEntityListing> response = (ApiResponse<FlowSettingsResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets the available flow log level characteristics for this organization.
   * Log levels can be customized and this returns the set of available characteristics that can be enabled/disabled.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowLogLevelCharacteristicsDefinitions> getFlowsInstancesSettingsLoglevelsCharacteristicsAsync(GetFlowsInstancesSettingsLoglevelsCharacteristicsRequest request, final AsyncApiCallback<FlowLogLevelCharacteristicsDefinitions> callback) {
    try {
      final SettableFuture<FlowLogLevelCharacteristicsDefinitions> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowLogLevelCharacteristicsDefinitions>() {}, new AsyncApiCallback<ApiResponse<FlowLogLevelCharacteristicsDefinitions>>() {
        @Override
        public void onCompleted(ApiResponse<FlowLogLevelCharacteristicsDefinitions> response) {
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
   * Gets the available flow log level characteristics for this organization.
   * Log levels can be customized and this returns the set of available characteristics that can be enabled/disabled.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowLogLevelCharacteristicsDefinitions>> getFlowsInstancesSettingsLoglevelsCharacteristicsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowLogLevelCharacteristicsDefinitions>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowLogLevelCharacteristicsDefinitions>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowLogLevelCharacteristicsDefinitions>() {}, new AsyncApiCallback<ApiResponse<FlowLogLevelCharacteristicsDefinitions>>() {
        @Override
        public void onCompleted(ApiResponse<FlowLogLevelCharacteristicsDefinitions> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowLogLevelCharacteristicsDefinitions> response = (ApiResponse<FlowLogLevelCharacteristicsDefinitions>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowLogLevelCharacteristicsDefinitions> response = (ApiResponse<FlowLogLevelCharacteristicsDefinitions>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns the flow default log level.
   * Returns the flow default log level which will be used if no specific flow id log level is found.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowSettingsResponse> getFlowsInstancesSettingsLoglevelsDefaultAsync(GetFlowsInstancesSettingsLoglevelsDefaultRequest request, final AsyncApiCallback<FlowSettingsResponse> callback) {
    try {
      final SettableFuture<FlowSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
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
   * Returns the flow default log level.
   * Returns the flow default log level which will be used if no specific flow id log level is found.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowSettingsResponse>> getFlowsInstancesSettingsLoglevelsDefaultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Fetch Architect Job Status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ArchitectJobStateResponse> getFlowsJobAsync(GetFlowsJobRequest request, final AsyncApiCallback<ArchitectJobStateResponse> callback) {
    try {
      final SettableFuture<ArchitectJobStateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ArchitectJobStateResponse>() {}, new AsyncApiCallback<ApiResponse<ArchitectJobStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ArchitectJobStateResponse> response) {
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
   * Fetch Architect Job Status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ArchitectJobStateResponse>> getFlowsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ArchitectJobStateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ArchitectJobStateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ArchitectJobStateResponse>() {}, new AsyncApiCallback<ApiResponse<ArchitectJobStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ArchitectJobStateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ArchitectJobStateResponse> response = (ApiResponse<ArchitectJobStateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ArchitectJobStateResponse> response = (ApiResponse<ArchitectJobStateResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a flow milestone
   * Returns a specified flow milestone
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowMilestone> getFlowsMilestoneAsync(GetFlowsMilestoneRequest request, final AsyncApiCallback<FlowMilestone> callback) {
    try {
      final SettableFuture<FlowMilestone> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowMilestone>() {}, new AsyncApiCallback<ApiResponse<FlowMilestone>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestone> response) {
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
   * Get a flow milestone
   * Returns a specified flow milestone
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowMilestone>> getFlowsMilestoneAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowMilestone>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowMilestone>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowMilestone>() {}, new AsyncApiCallback<ApiResponse<FlowMilestone>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestone> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of flow milestones, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowMilestoneListing> getFlowsMilestonesAsync(GetFlowsMilestonesRequest request, final AsyncApiCallback<FlowMilestoneListing> callback) {
    try {
      final SettableFuture<FlowMilestoneListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowMilestoneListing>() {}, new AsyncApiCallback<ApiResponse<FlowMilestoneListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestoneListing> response) {
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
   * Get a pageable list of flow milestones, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowMilestoneListing>> getFlowsMilestonesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowMilestoneListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowMilestoneListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowMilestoneListing>() {}, new AsyncApiCallback<ApiResponse<FlowMilestoneListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestoneListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestoneListing> response = (ApiResponse<FlowMilestoneListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestoneListing> response = (ApiResponse<FlowMilestoneListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of basic flow milestone information objects filterable by query parameters.
   * This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowMilestoneDivisionViewEntityListing> getFlowsMilestonesDivisionviewsAsync(GetFlowsMilestonesDivisionviewsRequest request, final AsyncApiCallback<FlowMilestoneDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<FlowMilestoneDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowMilestoneDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowMilestoneDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestoneDivisionViewEntityListing> response) {
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
   * Get a pageable list of basic flow milestone information objects filterable by query parameters.
   * This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowMilestoneDivisionViewEntityListing>> getFlowsMilestonesDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowMilestoneDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowMilestoneDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowMilestoneDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowMilestoneDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestoneDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestoneDivisionViewEntityListing> response = (ApiResponse<FlowMilestoneDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestoneDivisionViewEntityListing> response = (ApiResponse<FlowMilestoneDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a flow outcome
   * Returns a specified flow outcome
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowOutcome> getFlowsOutcomeAsync(GetFlowsOutcomeRequest request, final AsyncApiCallback<FlowOutcome> callback) {
    try {
      final SettableFuture<FlowOutcome> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowOutcome>() {}, new AsyncApiCallback<ApiResponse<FlowOutcome>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcome> response) {
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
   * Get a flow outcome
   * Returns a specified flow outcome
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowOutcome>> getFlowsOutcomeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowOutcome>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowOutcome>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowOutcome>() {}, new AsyncApiCallback<ApiResponse<FlowOutcome>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcome> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of flow outcomes, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowOutcomeListing> getFlowsOutcomesAsync(GetFlowsOutcomesRequest request, final AsyncApiCallback<FlowOutcomeListing> callback) {
    try {
      final SettableFuture<FlowOutcomeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowOutcomeListing>() {}, new AsyncApiCallback<ApiResponse<FlowOutcomeListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcomeListing> response) {
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
   * Get a pageable list of flow outcomes, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowOutcomeListing>> getFlowsOutcomesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowOutcomeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowOutcomeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowOutcomeListing>() {}, new AsyncApiCallback<ApiResponse<FlowOutcomeListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcomeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcomeListing> response = (ApiResponse<FlowOutcomeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcomeListing> response = (ApiResponse<FlowOutcomeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a pageable list of basic flow outcome information objects filterable by query parameters.
   * This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowOutcomeDivisionViewEntityListing> getFlowsOutcomesDivisionviewsAsync(GetFlowsOutcomesDivisionviewsRequest request, final AsyncApiCallback<FlowOutcomeDivisionViewEntityListing> callback) {
    try {
      final SettableFuture<FlowOutcomeDivisionViewEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowOutcomeDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowOutcomeDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcomeDivisionViewEntityListing> response) {
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
   * Get a pageable list of basic flow outcome information objects filterable by query parameters.
   * This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowOutcomeDivisionViewEntityListing>> getFlowsOutcomesDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FlowOutcomeDivisionViewEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowOutcomeDivisionViewEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowOutcomeDivisionViewEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowOutcomeDivisionViewEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcomeDivisionViewEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcomeDivisionViewEntityListing> response = (ApiResponse<FlowOutcomeDivisionViewEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcomeDivisionViewEntityListing> response = (ApiResponse<FlowOutcomeDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a grammar
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Grammar> patchArchitectGrammarAsync(PatchArchitectGrammarRequest request, final AsyncApiCallback<Grammar> callback) {
    try {
      final SettableFuture<Grammar> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Grammar>() {}, new AsyncApiCallback<ApiResponse<Grammar>>() {
        @Override
        public void onCompleted(ApiResponse<Grammar> response) {
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
   * Updates a grammar
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Grammar>> patchArchitectGrammarAsync(ApiRequest<Grammar> request, final AsyncApiCallback<ApiResponse<Grammar>> callback) {
    try {
      final SettableFuture<ApiResponse<Grammar>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Grammar>() {}, new AsyncApiCallback<ApiResponse<Grammar>>() {
        @Override
        public void onCompleted(ApiResponse<Grammar> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a grammar language
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GrammarLanguage> patchArchitectGrammarLanguageAsync(PatchArchitectGrammarLanguageRequest request, final AsyncApiCallback<GrammarLanguage> callback) {
    try {
      final SettableFuture<GrammarLanguage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GrammarLanguage>() {}, new AsyncApiCallback<ApiResponse<GrammarLanguage>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarLanguage> response) {
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
   * Updates a grammar language
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GrammarLanguage>> patchArchitectGrammarLanguageAsync(ApiRequest<GrammarLanguageUpdate> request, final AsyncApiCallback<ApiResponse<GrammarLanguage>> callback) {
    try {
      final SettableFuture<ApiResponse<GrammarLanguage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GrammarLanguage>() {}, new AsyncApiCallback<ApiResponse<GrammarLanguage>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarLanguage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Edit the execution history enabled setting.
   * Edit the execution history enabled setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExecutionDataFlowSettingsResponse> patchFlowsInstancesSettingsExecutiondataAsync(PatchFlowsInstancesSettingsExecutiondataRequest request, final AsyncApiCallback<ExecutionDataFlowSettingsResponse> callback) {
    try {
      final SettableFuture<ExecutionDataFlowSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExecutionDataFlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataFlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataFlowSettingsResponse> response) {
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
   * Edit the execution history enabled setting.
   * Edit the execution history enabled setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExecutionDataFlowSettingsResponse>> patchFlowsInstancesSettingsExecutiondataAsync(ApiRequest<ExecutionDataSettingsRequest> request, final AsyncApiCallback<ApiResponse<ExecutionDataFlowSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ExecutionDataFlowSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExecutionDataFlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataFlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataFlowSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Rebuild Dependency Tracking data for an organization
   * Asynchronous.  Notification topic: v2.architect.dependencytracking.build
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postArchitectDependencytrackingBuildAsync(PostArchitectDependencytrackingBuildRequest request, final AsyncApiCallback<Void> callback) {
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
   * Rebuild Dependency Tracking data for an organization
   * Asynchronous.  Notification topic: v2.architect.dependencytracking.build
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postArchitectDependencytrackingBuildAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Creates a new emergency group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmergencyGroup> postArchitectEmergencygroupsAsync(PostArchitectEmergencygroupsRequest request, final AsyncApiCallback<EmergencyGroup> callback) {
    try {
      final SettableFuture<EmergencyGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmergencyGroup>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroup> response) {
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
   * Creates a new emergency group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmergencyGroup>> postArchitectEmergencygroupsAsync(ApiRequest<EmergencyGroup> request, final AsyncApiCallback<ApiResponse<EmergencyGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<EmergencyGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmergencyGroup>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Creates a presigned URL for uploading a grammar DTMF mode file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UploadUrlResponse> postArchitectGrammarLanguageFilesDtmfAsync(PostArchitectGrammarLanguageFilesDtmfRequest request, final AsyncApiCallback<UploadUrlResponse> callback) {
    try {
      final SettableFuture<UploadUrlResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {}, new AsyncApiCallback<ApiResponse<UploadUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UploadUrlResponse> response) {
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
   * Creates a presigned URL for uploading a grammar DTMF mode file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UploadUrlResponse>> postArchitectGrammarLanguageFilesDtmfAsync(ApiRequest<GrammarFileUploadRequest> request, final AsyncApiCallback<ApiResponse<UploadUrlResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UploadUrlResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UploadUrlResponse>() {}, new AsyncApiCallback<ApiResponse<UploadUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UploadUrlResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Creates a presigned URL for uploading a grammar voice mode file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UploadUrlResponse> postArchitectGrammarLanguageFilesVoiceAsync(PostArchitectGrammarLanguageFilesVoiceRequest request, final AsyncApiCallback<UploadUrlResponse> callback) {
    try {
      final SettableFuture<UploadUrlResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {}, new AsyncApiCallback<ApiResponse<UploadUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UploadUrlResponse> response) {
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
   * Creates a presigned URL for uploading a grammar voice mode file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UploadUrlResponse>> postArchitectGrammarLanguageFilesVoiceAsync(ApiRequest<GrammarFileUploadRequest> request, final AsyncApiCallback<ApiResponse<UploadUrlResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UploadUrlResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UploadUrlResponse>() {}, new AsyncApiCallback<ApiResponse<UploadUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UploadUrlResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new language for a given grammar
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GrammarLanguage> postArchitectGrammarLanguagesAsync(PostArchitectGrammarLanguagesRequest request, final AsyncApiCallback<GrammarLanguage> callback) {
    try {
      final SettableFuture<GrammarLanguage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GrammarLanguage>() {}, new AsyncApiCallback<ApiResponse<GrammarLanguage>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarLanguage> response) {
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
   * Create a new language for a given grammar
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GrammarLanguage>> postArchitectGrammarLanguagesAsync(ApiRequest<GrammarLanguage> request, final AsyncApiCallback<ApiResponse<GrammarLanguage>> callback) {
    try {
      final SettableFuture<ApiResponse<GrammarLanguage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GrammarLanguage>() {}, new AsyncApiCallback<ApiResponse<GrammarLanguage>>() {
        @Override
        public void onCompleted(ApiResponse<GrammarLanguage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new grammar
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Grammar> postArchitectGrammarsAsync(PostArchitectGrammarsRequest request, final AsyncApiCallback<Grammar> callback) {
    try {
      final SettableFuture<Grammar> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Grammar>() {}, new AsyncApiCallback<ApiResponse<Grammar>>() {
        @Override
        public void onCompleted(ApiResponse<Grammar> response) {
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
   * Create a new grammar
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Grammar>> postArchitectGrammarsAsync(ApiRequest<Grammar> request, final AsyncApiCallback<ApiResponse<Grammar>> callback) {
    try {
      final SettableFuture<ApiResponse<Grammar>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Grammar>() {}, new AsyncApiCallback<ApiResponse<Grammar>>() {
        @Override
        public void onCompleted(ApiResponse<Grammar> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create IVR config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IVR> postArchitectIvrsAsync(PostArchitectIvrsRequest request, final AsyncApiCallback<IVR> callback) {
    try {
      final SettableFuture<IVR> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IVR>() {}, new AsyncApiCallback<ApiResponse<IVR>>() {
        @Override
        public void onCompleted(ApiResponse<IVR> response) {
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
   * Create IVR config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IVR>> postArchitectIvrsAsync(ApiRequest<IVR> request, final AsyncApiCallback<ApiResponse<IVR>> callback) {
    try {
      final SettableFuture<ApiResponse<IVR>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IVR>() {}, new AsyncApiCallback<ApiResponse<IVR>>() {
        @Override
        public void onCompleted(ApiResponse<IVR> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)(new ApiException(exception));
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
   * Generate prompt history
   * Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> postArchitectPromptHistoryAsync(PostArchitectPromptHistoryRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Generate prompt history
   * Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> postArchitectPromptHistoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Creates a presigned URL for uploading a user prompt file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAssetUpload> postArchitectPromptResourceUploadsAsync(PostArchitectPromptResourceUploadsRequest request, final AsyncApiCallback<PromptAssetUpload> callback) {
    try {
      final SettableFuture<PromptAssetUpload> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAssetUpload>() {}, new AsyncApiCallback<ApiResponse<PromptAssetUpload>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetUpload> response) {
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
   * Creates a presigned URL for uploading a user prompt file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAssetUpload>> postArchitectPromptResourceUploadsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PromptAssetUpload>> callback) {
    try {
      final SettableFuture<ApiResponse<PromptAssetUpload>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAssetUpload>() {}, new AsyncApiCallback<ApiResponse<PromptAssetUpload>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetUpload> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAsset> postArchitectPromptResourcesAsync(PostArchitectPromptResourcesRequest request, final AsyncApiCallback<PromptAsset> callback) {
    try {
      final SettableFuture<PromptAsset> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
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
   * Create a new user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAsset>> postArchitectPromptResourcesAsync(ApiRequest<PromptAssetCreate> request, final AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    try {
      final SettableFuture<ApiResponse<PromptAsset>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Prompt> postArchitectPromptsAsync(PostArchitectPromptsRequest request, final AsyncApiCallback<Prompt> callback) {
    try {
      final SettableFuture<Prompt> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
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
   * Create a new user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Prompt>> postArchitectPromptsAsync(ApiRequest<Prompt> request, final AsyncApiCallback<ApiResponse<Prompt>> callback) {
    try {
      final SettableFuture<ApiResponse<Prompt>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
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
   * Creates a new schedule group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleGroup> postArchitectSchedulegroupsAsync(PostArchitectSchedulegroupsRequest request, final AsyncApiCallback<ScheduleGroup> callback) {
    try {
      final SettableFuture<ScheduleGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleGroup>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroup> response) {
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
   * Creates a new schedule group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleGroup>> postArchitectSchedulegroupsAsync(ApiRequest<ScheduleGroup> request, final AsyncApiCallback<ApiResponse<ScheduleGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleGroup>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Schedule> postArchitectSchedulesAsync(PostArchitectSchedulesRequest request, final AsyncApiCallback<Schedule> callback) {
    try {
      final SettableFuture<Schedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Schedule>() {}, new AsyncApiCallback<ApiResponse<Schedule>>() {
        @Override
        public void onCompleted(ApiResponse<Schedule> response) {
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
   * Create a new schedule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Schedule>> postArchitectSchedulesAsync(ApiRequest<Schedule> request, final AsyncApiCallback<ApiResponse<Schedule>> callback) {
    try {
      final SettableFuture<ApiResponse<Schedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Schedule>() {}, new AsyncApiCallback<ApiResponse<Schedule>>() {
        @Override
        public void onCompleted(ApiResponse<Schedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Generate system prompt history
   * Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> postArchitectSystempromptHistoryAsync(PostArchitectSystempromptHistoryRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Generate system prompt history
   * Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> postArchitectSystempromptHistoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Creates a presigned URL for uploading a system prompt file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAssetUpload> postArchitectSystempromptResourceUploadsAsync(PostArchitectSystempromptResourceUploadsRequest request, final AsyncApiCallback<PromptAssetUpload> callback) {
    try {
      final SettableFuture<PromptAssetUpload> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAssetUpload>() {}, new AsyncApiCallback<ApiResponse<PromptAssetUpload>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetUpload> response) {
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
   * Creates a presigned URL for uploading a system prompt file
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAssetUpload>> postArchitectSystempromptResourceUploadsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PromptAssetUpload>> callback) {
    try {
      final SettableFuture<ApiResponse<PromptAssetUpload>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAssetUpload>() {}, new AsyncApiCallback<ApiResponse<PromptAssetUpload>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetUpload> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAsset> postArchitectSystempromptResourcesAsync(PostArchitectSystempromptResourcesRequest request, final AsyncApiCallback<SystemPromptAsset> callback) {
    try {
      final SettableFuture<SystemPromptAsset> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
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
   * Create system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAsset>> postArchitectSystempromptResourcesAsync(ApiRequest<SystemPromptAsset> request, final AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    try {
      final SettableFuture<ApiResponse<SystemPromptAsset>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
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
   * Generate flow history
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> postFlowHistoryAsync(PostFlowHistoryRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Generate flow history
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> postFlowHistoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Set the logLevel for a particular flow id
   * Assigns a new loglevel to a flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowSettingsResponse> postFlowInstancesSettingsLoglevelsAsync(PostFlowInstancesSettingsLoglevelsRequest request, final AsyncApiCallback<FlowSettingsResponse> callback) {
    try {
      final SettableFuture<FlowSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
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
   * Set the logLevel for a particular flow id
   * Assigns a new loglevel to a flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowSettingsResponse>> postFlowInstancesSettingsLoglevelsAsync(ApiRequest<FlowLogLevelRequest> request, final AsyncApiCallback<ApiResponse<FlowSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowVersion> postFlowVersionsAsync(PostFlowVersionsRequest request, final AsyncApiCallback<FlowVersion> callback) {
    try {
      final SettableFuture<FlowVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
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
   * Create flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowVersion>> postFlowVersionsAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<FlowVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsAsync(PostFlowsRequest request, final AsyncApiCallback<Flow> callback) {
    try {
      final SettableFuture<Flow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
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
   * Create flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsAsync(ApiRequest<Flow> request, final AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      final SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
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
   * Check-in flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> postFlowsActionsCheckinAsync(PostFlowsActionsCheckinRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Check-in flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> postFlowsActionsCheckinAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Check-out flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsCheckoutAsync(PostFlowsActionsCheckoutRequest request, final AsyncApiCallback<Flow> callback) {
    try {
      final SettableFuture<Flow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
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
   * Check-out flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsCheckoutAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      final SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
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
   * Deactivate flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsDeactivateAsync(PostFlowsActionsDeactivateRequest request, final AsyncApiCallback<Flow> callback) {
    try {
      final SettableFuture<Flow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
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
   * Deactivate flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsDeactivateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      final SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
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
   * Publish flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> postFlowsActionsPublishAsync(PostFlowsActionsPublishRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Publish flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> postFlowsActionsPublishAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Revert flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsRevertAsync(PostFlowsActionsRevertRequest request, final AsyncApiCallback<Flow> callback) {
    try {
      final SettableFuture<Flow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
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
   * Revert flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsRevertAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      final SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
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
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsUnlockAsync(PostFlowsActionsUnlockRequest request, final AsyncApiCallback<Flow> callback) {
    try {
      final SettableFuture<Flow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
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
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsUnlockAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      final SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
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
   * Begin an export process for exporting all rows from a datatable
   * Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTableExportJob> postFlowsDatatableExportJobsAsync(PostFlowsDatatableExportJobsRequest request, final AsyncApiCallback<DataTableExportJob> callback) {
    try {
      final SettableFuture<DataTableExportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableExportJob> response) {
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
   * Begin an export process for exporting all rows from a datatable
   * Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTableExportJob>> postFlowsDatatableExportJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataTableExportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTableExportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableExportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Begin an import process for importing rows into a datatable
   * Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTableImportJob> postFlowsDatatableImportJobsAsync(PostFlowsDatatableImportJobsRequest request, final AsyncApiCallback<DataTableImportJob> callback) {
    try {
      final SettableFuture<DataTableImportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableImportJob> response) {
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
   * Begin an import process for importing rows into a datatable
   * Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTableImportJob>> postFlowsDatatableImportJobsAsync(ApiRequest<DataTableImportJob> request, final AsyncApiCallback<ApiResponse<DataTableImportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTableImportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DataTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DataTableImportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new row entry for the datatable.
   * Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {      \"Field1\": \"XYZZY\",      \"Field2\": false,      \"KEY\": \"27272\"  }
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Map<String, Object>> postFlowsDatatableRowsAsync(PostFlowsDatatableRowsRequest request, final AsyncApiCallback<Map<String, Object>> callback) {
    try {
      final SettableFuture<Map<String, Object>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
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
   * Create a new row entry for the datatable.
   * Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {      \"Field1\": \"XYZZY\",      \"Field2\": false,      \"KEY\": \"27272\"  }
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Map<String, Object>>> postFlowsDatatableRowsAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) {
    try {
      final SettableFuture<ApiResponse<Map<String, Object>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new datatable with the specified json-schema definition
   * This will create a new datatable with fields that match the property definitions in the JSON schema.  The schema's title field will be overridden by the name field in the DataTable object.  See also http://json-schema.org/
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTable> postFlowsDatatablesAsync(PostFlowsDatatablesRequest request, final AsyncApiCallback<DataTable> callback) {
    try {
      final SettableFuture<DataTable> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
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
   * Create a new datatable with the specified json-schema definition
   * This will create a new datatable with fields that match the property definitions in the JSON schema.  The schema's title field will be overridden by the name field in the DataTable object.  See also http://json-schema.org/
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTable>> postFlowsDatatablesAsync(ApiRequest<DataTable> request, final AsyncApiCallback<ApiResponse<DataTable>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTable>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
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
   * Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type.
   * The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowExecutionLaunchResponse> postFlowsExecutionsAsync(PostFlowsExecutionsRequest request, final AsyncApiCallback<FlowExecutionLaunchResponse> callback) {
    try {
      final SettableFuture<FlowExecutionLaunchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowExecutionLaunchResponse>() {}, new AsyncApiCallback<ApiResponse<FlowExecutionLaunchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowExecutionLaunchResponse> response) {
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
   * Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type.
   * The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowExecutionLaunchResponse>> postFlowsExecutionsAsync(ApiRequest<FlowExecutionLaunchRequest> request, final AsyncApiCallback<ApiResponse<FlowExecutionLaunchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowExecutionLaunchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowExecutionLaunchResponse>() {}, new AsyncApiCallback<ApiResponse<FlowExecutionLaunchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowExecutionLaunchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowExecutionLaunchResponse> response = (ApiResponse<FlowExecutionLaunchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowExecutionLaunchResponse> response = (ApiResponse<FlowExecutionLaunchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Register Architect Export Job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RegisterArchitectExportJobResponse> postFlowsExportJobsAsync(PostFlowsExportJobsRequest request, final AsyncApiCallback<RegisterArchitectExportJobResponse> callback) {
    try {
      final SettableFuture<RegisterArchitectExportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RegisterArchitectExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<RegisterArchitectExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RegisterArchitectExportJobResponse> response) {
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
   * Register Architect Export Job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RegisterArchitectExportJobResponse>> postFlowsExportJobsAsync(ApiRequest<RegisterArchitectExportJob> request, final AsyncApiCallback<ApiResponse<RegisterArchitectExportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<RegisterArchitectExportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RegisterArchitectExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<RegisterArchitectExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RegisterArchitectExportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RegisterArchitectExportJobResponse> response = (ApiResponse<RegisterArchitectExportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RegisterArchitectExportJobResponse> response = (ApiResponse<RegisterArchitectExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Start a process (job) that will prepare a list of execution data IDs for download.
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GetFlowExecutionDataJobResult> postFlowsInstancesJobsAsync(PostFlowsInstancesJobsRequest request, final AsyncApiCallback<GetFlowExecutionDataJobResult> callback) {
    try {
      final SettableFuture<GetFlowExecutionDataJobResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GetFlowExecutionDataJobResult>() {}, new AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>>() {
        @Override
        public void onCompleted(ApiResponse<GetFlowExecutionDataJobResult> response) {
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
   * Start a process (job) that will prepare a list of execution data IDs for download.
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GetFlowExecutionDataJobResult>> postFlowsInstancesJobsAsync(ApiRequest<ExecutionDataRequest> request, final AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>> callback) {
    try {
      final SettableFuture<ApiResponse<GetFlowExecutionDataJobResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GetFlowExecutionDataJobResult>() {}, new AsyncApiCallback<ApiResponse<GetFlowExecutionDataJobResult>>() {
        @Override
        public void onCompleted(ApiResponse<GetFlowExecutionDataJobResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query the database of existing flow histories to look for particular flow criteria
   * Returns a list of matching flow histories up to 200 max.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowResultEntityListing> postFlowsInstancesQueryAsync(PostFlowsInstancesQueryRequest request, final AsyncApiCallback<FlowResultEntityListing> callback) {
    try {
      final SettableFuture<FlowResultEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowResultEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowResultEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowResultEntityListing> response) {
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
   * Query the database of existing flow histories to look for particular flow criteria
   * Returns a list of matching flow histories up to 200 max.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowResultEntityListing>> postFlowsInstancesQueryAsync(ApiRequest<CriteriaQuery> request, final AsyncApiCallback<ApiResponse<FlowResultEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowResultEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowResultEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowResultEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowResultEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowResultEntityListing> response = (ApiResponse<FlowResultEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowResultEntityListing> response = (ApiResponse<FlowResultEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RegisterArchitectJobResponse> postFlowsJobsAsync(PostFlowsJobsRequest request, final AsyncApiCallback<RegisterArchitectJobResponse> callback) {
    try {
      final SettableFuture<RegisterArchitectJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RegisterArchitectJobResponse>() {}, new AsyncApiCallback<ApiResponse<RegisterArchitectJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RegisterArchitectJobResponse> response) {
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
   * Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RegisterArchitectJobResponse>> postFlowsJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RegisterArchitectJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<RegisterArchitectJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RegisterArchitectJobResponse>() {}, new AsyncApiCallback<ApiResponse<RegisterArchitectJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RegisterArchitectJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RegisterArchitectJobResponse> response = (ApiResponse<RegisterArchitectJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RegisterArchitectJobResponse> response = (ApiResponse<RegisterArchitectJobResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a flow milestone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowMilestone> postFlowsMilestonesAsync(PostFlowsMilestonesRequest request, final AsyncApiCallback<FlowMilestone> callback) {
    try {
      final SettableFuture<FlowMilestone> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowMilestone>() {}, new AsyncApiCallback<ApiResponse<FlowMilestone>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestone> response) {
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
   * Create a flow milestone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowMilestone>> postFlowsMilestonesAsync(ApiRequest<FlowMilestone> request, final AsyncApiCallback<ApiResponse<FlowMilestone>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowMilestone>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowMilestone>() {}, new AsyncApiCallback<ApiResponse<FlowMilestone>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestone> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a flow outcome
   * Asynchronous.  Notification topic: v2.flows.outcomes.{flowOutcomeId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowOutcome> postFlowsOutcomesAsync(PostFlowsOutcomesRequest request, final AsyncApiCallback<FlowOutcome> callback) {
    try {
      final SettableFuture<FlowOutcome> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowOutcome>() {}, new AsyncApiCallback<ApiResponse<FlowOutcome>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcome> response) {
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
   * Create a flow outcome
   * Asynchronous.  Notification topic: v2.flows.outcomes.{flowOutcomeId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowOutcome>> postFlowsOutcomesAsync(ApiRequest<FlowOutcome> request, final AsyncApiCallback<ApiResponse<FlowOutcome>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowOutcome>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowOutcome>() {}, new AsyncApiCallback<ApiResponse<FlowOutcome>>() {
        @Override
        public void onCompleted(ApiResponse<FlowOutcome> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a emergency group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmergencyGroup> putArchitectEmergencygroupAsync(PutArchitectEmergencygroupRequest request, final AsyncApiCallback<EmergencyGroup> callback) {
    try {
      final SettableFuture<EmergencyGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmergencyGroup>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroup> response) {
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
   * Updates a emergency group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmergencyGroup>> putArchitectEmergencygroupAsync(ApiRequest<EmergencyGroup> request, final AsyncApiCallback<ApiResponse<EmergencyGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<EmergencyGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmergencyGroup>() {}, new AsyncApiCallback<ApiResponse<EmergencyGroup>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an IVR Config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IVR> putArchitectIvrAsync(PutArchitectIvrRequest request, final AsyncApiCallback<IVR> callback) {
    try {
      final SettableFuture<IVR> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IVR>() {}, new AsyncApiCallback<ApiResponse<IVR>>() {
        @Override
        public void onCompleted(ApiResponse<IVR> response) {
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
   * Update an IVR Config.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IVR>> putArchitectIvrAsync(ApiRequest<IVR> request, final AsyncApiCallback<ApiResponse<IVR>> callback) {
    try {
      final SettableFuture<ApiResponse<IVR>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IVR>() {}, new AsyncApiCallback<ApiResponse<IVR>>() {
        @Override
        public void onCompleted(ApiResponse<IVR> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an IVR IdentityResolutionConfig.
   * 
   * putArchitectIvrIdentityresolution is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IdentityResolutionConfig> putArchitectIvrIdentityresolutionAsync(PutArchitectIvrIdentityresolutionRequest request, final AsyncApiCallback<IdentityResolutionConfig> callback) {
    try {
      final SettableFuture<IdentityResolutionConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IdentityResolutionConfig>() {}, new AsyncApiCallback<ApiResponse<IdentityResolutionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<IdentityResolutionConfig> response) {
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
   * Update an IVR IdentityResolutionConfig.
   * 
   * putArchitectIvrIdentityresolution is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IdentityResolutionConfig>> putArchitectIvrIdentityresolutionAsync(ApiRequest<IdentityResolutionConfig> request, final AsyncApiCallback<ApiResponse<IdentityResolutionConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<IdentityResolutionConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IdentityResolutionConfig>() {}, new AsyncApiCallback<ApiResponse<IdentityResolutionConfig>>() {
        @Override
        public void onCompleted(ApiResponse<IdentityResolutionConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IdentityResolutionConfig> response = (ApiResponse<IdentityResolutionConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Prompt> putArchitectPromptAsync(PutArchitectPromptRequest request, final AsyncApiCallback<Prompt> callback) {
    try {
      final SettableFuture<Prompt> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
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
   * Update specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Prompt>> putArchitectPromptAsync(ApiRequest<Prompt> request, final AsyncApiCallback<ApiResponse<Prompt>> callback) {
    try {
      final SettableFuture<ApiResponse<Prompt>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAsset> putArchitectPromptResourceAsync(PutArchitectPromptResourceRequest request, final AsyncApiCallback<PromptAsset> callback) {
    try {
      final SettableFuture<PromptAsset> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
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
   * Update specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAsset>> putArchitectPromptResourceAsync(ApiRequest<PromptAsset> request, final AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    try {
      final SettableFuture<ApiResponse<PromptAsset>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update schedule by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Schedule> putArchitectScheduleAsync(PutArchitectScheduleRequest request, final AsyncApiCallback<Schedule> callback) {
    try {
      final SettableFuture<Schedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Schedule>() {}, new AsyncApiCallback<ApiResponse<Schedule>>() {
        @Override
        public void onCompleted(ApiResponse<Schedule> response) {
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
   * Update schedule by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Schedule>> putArchitectScheduleAsync(ApiRequest<Schedule> request, final AsyncApiCallback<ApiResponse<Schedule>> callback) {
    try {
      final SettableFuture<ApiResponse<Schedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Schedule>() {}, new AsyncApiCallback<ApiResponse<Schedule>>() {
        @Override
        public void onCompleted(ApiResponse<Schedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a schedule group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleGroup> putArchitectSchedulegroupAsync(PutArchitectSchedulegroupRequest request, final AsyncApiCallback<ScheduleGroup> callback) {
    try {
      final SettableFuture<ScheduleGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleGroup>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroup> response) {
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
   * Updates a schedule group by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleGroup>> putArchitectSchedulegroupAsync(ApiRequest<ScheduleGroup> request, final AsyncApiCallback<ApiResponse<ScheduleGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleGroup>() {}, new AsyncApiCallback<ApiResponse<ScheduleGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAsset> putArchitectSystempromptResourceAsync(PutArchitectSystempromptResourceRequest request, final AsyncApiCallback<SystemPromptAsset> callback) {
    try {
      final SettableFuture<SystemPromptAsset> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
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
   * Updates a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAsset>> putArchitectSystempromptResourceAsync(ApiRequest<SystemPromptAsset> request, final AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    try {
      final SettableFuture<ApiResponse<SystemPromptAsset>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> putFlowAsync(PutFlowRequest request, final AsyncApiCallback<Flow> callback) {
    try {
      final SettableFuture<Flow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
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
   * Update flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> putFlowAsync(ApiRequest<Flow> request, final AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      final SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
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
   * Edit the logLevel for a particular flow id
   * Updates the loglevel for a flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowSettingsResponse> putFlowInstancesSettingsLoglevelsAsync(PutFlowInstancesSettingsLoglevelsRequest request, final AsyncApiCallback<FlowSettingsResponse> callback) {
    try {
      final SettableFuture<FlowSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
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
   * Edit the logLevel for a particular flow id
   * Updates the loglevel for a flow id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowSettingsResponse>> putFlowInstancesSettingsLoglevelsAsync(ApiRequest<FlowLogLevelRequest> request, final AsyncApiCallback<ApiResponse<FlowSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a specific datatable by id
   * Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataTable> putFlowsDatatableAsync(PutFlowsDatatableRequest request, final AsyncApiCallback<DataTable> callback) {
    try {
      final SettableFuture<DataTable> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
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
   * Updates a specific datatable by id
   * Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataTable>> putFlowsDatatableAsync(ApiRequest<DataTable> request, final AsyncApiCallback<ApiResponse<DataTable>> callback) {
    try {
      final SettableFuture<ApiResponse<DataTable>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataTable>() {}, new AsyncApiCallback<ApiResponse<DataTable>>() {
        @Override
        public void onCompleted(ApiResponse<DataTable> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a row entry
   * Updates a row with the given rowId (the value of the key field) to the new values.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {     \"Field1\": \"XYZZY\",     \"Field2\": false,     \"KEY\": \"27272\" }
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Map<String, Object>> putFlowsDatatableRowAsync(PutFlowsDatatableRowRequest request, final AsyncApiCallback<Map<String, Object>> callback) {
    try {
      final SettableFuture<Map<String, Object>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
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
   * Update a row entry
   * Updates a row with the given rowId (the value of the key field) to the new values.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {     \"Field1\": \"XYZZY\",     \"Field2\": false,     \"KEY\": \"27272\" }
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Map<String, Object>>> putFlowsDatatableRowAsync(ApiRequest<Object> request, final AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) {
    try {
      final SettableFuture<ApiResponse<Map<String, Object>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Edit the flow default log level.
   * Edit the flow default log level.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowSettingsResponse> putFlowsInstancesSettingsLoglevelsDefaultAsync(PutFlowsInstancesSettingsLoglevelsDefaultRequest request, final AsyncApiCallback<FlowSettingsResponse> callback) {
    try {
      final SettableFuture<FlowSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
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
   * Edit the flow default log level.
   * Edit the flow default log level.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowSettingsResponse>> putFlowsInstancesSettingsLoglevelsDefaultAsync(ApiRequest<FlowLogLevelRequest> request, final AsyncApiCallback<ApiResponse<FlowSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<FlowSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a flow milestone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowMilestone> putFlowsMilestoneAsync(PutFlowsMilestoneRequest request, final AsyncApiCallback<FlowMilestone> callback) {
    try {
      final SettableFuture<FlowMilestone> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowMilestone>() {}, new AsyncApiCallback<ApiResponse<FlowMilestone>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestone> response) {
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
   * Updates a flow milestone
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowMilestone>> putFlowsMilestoneAsync(ApiRequest<FlowMilestone> request, final AsyncApiCallback<ApiResponse<FlowMilestone>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowMilestone>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowMilestone>() {}, new AsyncApiCallback<ApiResponse<FlowMilestone>>() {
        @Override
        public void onCompleted(ApiResponse<FlowMilestone> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates a flow outcome
   * Updates a flow outcome.  Asynchronous.  Notification topic: v2.flowoutcomes.{flowoutcomeId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> putFlowsOutcomeAsync(PutFlowsOutcomeRequest request, final AsyncApiCallback<Operation> callback) {
    try {
      final SettableFuture<Operation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
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
   * Updates a flow outcome
   * Updates a flow outcome.  Asynchronous.  Notification topic: v2.flowoutcomes.{flowoutcomeId}
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> putFlowsOutcomeAsync(ApiRequest<FlowOutcome> request, final AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      final SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
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
