package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

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

public class ArchitectApi {
  private final ApiClient pcapiClient;

  public ArchitectApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ArchitectApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Deletes a emergency group by ID
   * 
   * @param emergencyGroupId Emergency group ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectEmergencygroup(String emergencyGroupId) throws IOException, ApiException {
     deleteArchitectEmergencygroup(createDeleteArchitectEmergencygroupRequest(emergencyGroupId));
  }

  /**
   * Deletes a emergency group by ID
   * 
   * @param emergencyGroupId Emergency group ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectEmergencygroupWithHttpInfo(String emergencyGroupId) throws IOException {
    return deleteArchitectEmergencygroup(createDeleteArchitectEmergencygroupRequest(emergencyGroupId).withHttpInfo());
  }

  private DeleteArchitectEmergencygroupRequest createDeleteArchitectEmergencygroupRequest(String emergencyGroupId) {
    return DeleteArchitectEmergencygroupRequest.builder()
            .withEmergencyGroupId(emergencyGroupId)

            .build();
  }

  /**
   * Deletes a emergency group by ID
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectEmergencygroup(DeleteArchitectEmergencygroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a emergency group by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectEmergencygroup(ApiRequest<Void> request) throws IOException {
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
   * Delete a grammar.
   * 
   * @param grammarId grammar ID (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteArchitectGrammar(String grammarId) throws IOException, ApiException {
    return  deleteArchitectGrammar(createDeleteArchitectGrammarRequest(grammarId));
  }

  /**
   * Delete a grammar.
   * 
   * @param grammarId grammar ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteArchitectGrammarWithHttpInfo(String grammarId) throws IOException {
    return deleteArchitectGrammar(createDeleteArchitectGrammarRequest(grammarId).withHttpInfo());
  }

  private DeleteArchitectGrammarRequest createDeleteArchitectGrammarRequest(String grammarId) {
    return DeleteArchitectGrammarRequest.builder()
            .withGrammarId(grammarId)

            .build();
  }

  /**
   * Delete a grammar.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteArchitectGrammar(DeleteArchitectGrammarRequest request) throws IOException, ApiException {
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
   * Delete a grammar.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteArchitectGrammar(ApiRequest<Void> request) throws IOException {
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
   * Delete specified grammar language
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectGrammarLanguage(String grammarId, String languageCode) throws IOException, ApiException {
     deleteArchitectGrammarLanguage(createDeleteArchitectGrammarLanguageRequest(grammarId, languageCode));
  }

  /**
   * Delete specified grammar language
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectGrammarLanguageWithHttpInfo(String grammarId, String languageCode) throws IOException {
    return deleteArchitectGrammarLanguage(createDeleteArchitectGrammarLanguageRequest(grammarId, languageCode).withHttpInfo());
  }

  private DeleteArchitectGrammarLanguageRequest createDeleteArchitectGrammarLanguageRequest(String grammarId, String languageCode) {
    return DeleteArchitectGrammarLanguageRequest.builder()
            .withGrammarId(grammarId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Delete specified grammar language
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectGrammarLanguage(DeleteArchitectGrammarLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete specified grammar language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectGrammarLanguage(ApiRequest<Void> request) throws IOException {
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
   * Clear the DTMF mode file for the grammar language if there is one
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectGrammarLanguageFilesDtmf(String grammarId, String languageCode) throws IOException, ApiException {
     deleteArchitectGrammarLanguageFilesDtmf(createDeleteArchitectGrammarLanguageFilesDtmfRequest(grammarId, languageCode));
  }

  /**
   * Clear the DTMF mode file for the grammar language if there is one
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectGrammarLanguageFilesDtmfWithHttpInfo(String grammarId, String languageCode) throws IOException {
    return deleteArchitectGrammarLanguageFilesDtmf(createDeleteArchitectGrammarLanguageFilesDtmfRequest(grammarId, languageCode).withHttpInfo());
  }

  private DeleteArchitectGrammarLanguageFilesDtmfRequest createDeleteArchitectGrammarLanguageFilesDtmfRequest(String grammarId, String languageCode) {
    return DeleteArchitectGrammarLanguageFilesDtmfRequest.builder()
            .withGrammarId(grammarId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Clear the DTMF mode file for the grammar language if there is one
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectGrammarLanguageFilesDtmf(DeleteArchitectGrammarLanguageFilesDtmfRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Clear the DTMF mode file for the grammar language if there is one
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectGrammarLanguageFilesDtmf(ApiRequest<Void> request) throws IOException {
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
   * Clear the voice mode file for the grammar language if there is one
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectGrammarLanguageFilesVoice(String grammarId, String languageCode) throws IOException, ApiException {
     deleteArchitectGrammarLanguageFilesVoice(createDeleteArchitectGrammarLanguageFilesVoiceRequest(grammarId, languageCode));
  }

  /**
   * Clear the voice mode file for the grammar language if there is one
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectGrammarLanguageFilesVoiceWithHttpInfo(String grammarId, String languageCode) throws IOException {
    return deleteArchitectGrammarLanguageFilesVoice(createDeleteArchitectGrammarLanguageFilesVoiceRequest(grammarId, languageCode).withHttpInfo());
  }

  private DeleteArchitectGrammarLanguageFilesVoiceRequest createDeleteArchitectGrammarLanguageFilesVoiceRequest(String grammarId, String languageCode) {
    return DeleteArchitectGrammarLanguageFilesVoiceRequest.builder()
            .withGrammarId(grammarId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Clear the voice mode file for the grammar language if there is one
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectGrammarLanguageFilesVoice(DeleteArchitectGrammarLanguageFilesVoiceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Clear the voice mode file for the grammar language if there is one
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectGrammarLanguageFilesVoice(ApiRequest<Void> request) throws IOException {
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
   * Delete an IVR Config.
   * 
   * @param ivrId IVR id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectIvr(String ivrId) throws IOException, ApiException {
     deleteArchitectIvr(createDeleteArchitectIvrRequest(ivrId));
  }

  /**
   * Delete an IVR Config.
   * 
   * @param ivrId IVR id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectIvrWithHttpInfo(String ivrId) throws IOException {
    return deleteArchitectIvr(createDeleteArchitectIvrRequest(ivrId).withHttpInfo());
  }

  private DeleteArchitectIvrRequest createDeleteArchitectIvrRequest(String ivrId) {
    return DeleteArchitectIvrRequest.builder()
            .withIvrId(ivrId)

            .build();
  }

  /**
   * Delete an IVR Config.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectIvr(DeleteArchitectIvrRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an IVR Config.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectIvr(ApiRequest<Void> request) throws IOException {
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
   * Delete specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param allResources Whether or not to delete all the prompt resources (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectPrompt(String promptId, Boolean allResources) throws IOException, ApiException {
     deleteArchitectPrompt(createDeleteArchitectPromptRequest(promptId, allResources));
  }

  /**
   * Delete specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param allResources Whether or not to delete all the prompt resources (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectPromptWithHttpInfo(String promptId, Boolean allResources) throws IOException {
    return deleteArchitectPrompt(createDeleteArchitectPromptRequest(promptId, allResources).withHttpInfo());
  }

  private DeleteArchitectPromptRequest createDeleteArchitectPromptRequest(String promptId, Boolean allResources) {
    return DeleteArchitectPromptRequest.builder()
            .withPromptId(promptId)

            .withAllResources(allResources)

            .build();
  }

  /**
   * Delete specified user prompt
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectPrompt(DeleteArchitectPromptRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete specified user prompt
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectPrompt(ApiRequest<Void> request) throws IOException {
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
   * Delete specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectPromptResource(String promptId, String languageCode) throws IOException, ApiException {
     deleteArchitectPromptResource(createDeleteArchitectPromptResourceRequest(promptId, languageCode));
  }

  /**
   * Delete specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectPromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException {
    return deleteArchitectPromptResource(createDeleteArchitectPromptResourceRequest(promptId, languageCode).withHttpInfo());
  }

  private DeleteArchitectPromptResourceRequest createDeleteArchitectPromptResourceRequest(String promptId, String languageCode) {
    return DeleteArchitectPromptResourceRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Delete specified user prompt resource
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectPromptResource(DeleteArchitectPromptResourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete specified user prompt resource
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectPromptResource(ApiRequest<Void> request) throws IOException {
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
   * Delete specified user prompt resource audio
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectPromptResourceAudio(String promptId, String languageCode) throws IOException, ApiException {
     deleteArchitectPromptResourceAudio(createDeleteArchitectPromptResourceAudioRequest(promptId, languageCode));
  }

  /**
   * Delete specified user prompt resource audio
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectPromptResourceAudioWithHttpInfo(String promptId, String languageCode) throws IOException {
    return deleteArchitectPromptResourceAudio(createDeleteArchitectPromptResourceAudioRequest(promptId, languageCode).withHttpInfo());
  }

  private DeleteArchitectPromptResourceAudioRequest createDeleteArchitectPromptResourceAudioRequest(String promptId, String languageCode) {
    return DeleteArchitectPromptResourceAudioRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Delete specified user prompt resource audio
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectPromptResourceAudio(DeleteArchitectPromptResourceAudioRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete specified user prompt resource audio
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectPromptResourceAudio(ApiRequest<Void> request) throws IOException {
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
   * Batch-delete a list of prompts
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param id List of Prompt IDs (required)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation deleteArchitectPrompts(List<String> id) throws IOException, ApiException {
    return  deleteArchitectPrompts(createDeleteArchitectPromptsRequest(id));
  }

  /**
   * Batch-delete a list of prompts
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param id List of Prompt IDs (required)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> deleteArchitectPromptsWithHttpInfo(List<String> id) throws IOException {
    return deleteArchitectPrompts(createDeleteArchitectPromptsRequest(id).withHttpInfo());
  }

  private DeleteArchitectPromptsRequest createDeleteArchitectPromptsRequest(List<String> id) {
    return DeleteArchitectPromptsRequest.builder()
            .withId(id)

            .build();
  }

  /**
   * Batch-delete a list of prompts
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation deleteArchitectPrompts(DeleteArchitectPromptsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Batch-delete a list of prompts
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.  Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> deleteArchitectPrompts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete a schedule by id
   * 
   * @param scheduleId Schedule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectSchedule(String scheduleId) throws IOException, ApiException {
     deleteArchitectSchedule(createDeleteArchitectScheduleRequest(scheduleId));
  }

  /**
   * Delete a schedule by id
   * 
   * @param scheduleId Schedule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectScheduleWithHttpInfo(String scheduleId) throws IOException {
    return deleteArchitectSchedule(createDeleteArchitectScheduleRequest(scheduleId).withHttpInfo());
  }

  private DeleteArchitectScheduleRequest createDeleteArchitectScheduleRequest(String scheduleId) {
    return DeleteArchitectScheduleRequest.builder()
            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * Delete a schedule by id
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectSchedule(DeleteArchitectScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a schedule by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectSchedule(ApiRequest<Void> request) throws IOException {
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
   * Deletes a schedule group by ID
   * 
   * @param scheduleGroupId Schedule group ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectSchedulegroup(String scheduleGroupId) throws IOException, ApiException {
     deleteArchitectSchedulegroup(createDeleteArchitectSchedulegroupRequest(scheduleGroupId));
  }

  /**
   * Deletes a schedule group by ID
   * 
   * @param scheduleGroupId Schedule group ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectSchedulegroupWithHttpInfo(String scheduleGroupId) throws IOException {
    return deleteArchitectSchedulegroup(createDeleteArchitectSchedulegroupRequest(scheduleGroupId).withHttpInfo());
  }

  private DeleteArchitectSchedulegroupRequest createDeleteArchitectSchedulegroupRequest(String scheduleGroupId) {
    return DeleteArchitectSchedulegroupRequest.builder()
            .withScheduleGroupId(scheduleGroupId)

            .build();
  }

  /**
   * Deletes a schedule group by ID
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectSchedulegroup(DeleteArchitectSchedulegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a schedule group by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectSchedulegroup(ApiRequest<Void> request) throws IOException {
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
   * Delete a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectSystempromptResource(String promptId, String languageCode) throws IOException, ApiException {
     deleteArchitectSystempromptResource(createDeleteArchitectSystempromptResourceRequest(promptId, languageCode));
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException {
    return deleteArchitectSystempromptResource(createDeleteArchitectSystempromptResourceRequest(promptId, languageCode).withHttpInfo());
  }

  private DeleteArchitectSystempromptResourceRequest createDeleteArchitectSystempromptResourceRequest(String promptId, String languageCode) {
    return DeleteArchitectSystempromptResourceRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteArchitectSystempromptResource(DeleteArchitectSystempromptResourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteArchitectSystempromptResource(ApiRequest<Void> request) throws IOException {
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
   * Delete flow
   * 
   * @param flowId Flow ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlow(String flowId) throws IOException, ApiException {
     deleteFlow(createDeleteFlowRequest(flowId));
  }

  /**
   * Delete flow
   * 
   * @param flowId Flow ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowWithHttpInfo(String flowId) throws IOException {
    return deleteFlow(createDeleteFlowRequest(flowId).withHttpInfo());
  }

  private DeleteFlowRequest createDeleteFlowRequest(String flowId) {
    return DeleteFlowRequest.builder()
            .withFlowId(flowId)

            .build();
  }

  /**
   * Delete flow
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlow(DeleteFlowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlow(ApiRequest<Void> request) throws IOException {
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
   * Deletes a log level for a flow by flow id.
   * Deletes the associated log level for a flow by flow id
   * @param flowId The flow id to delete the loglevel for (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowInstancesSettingsLoglevels(String flowId) throws IOException, ApiException {
     deleteFlowInstancesSettingsLoglevels(createDeleteFlowInstancesSettingsLoglevelsRequest(flowId));
  }

  /**
   * Deletes a log level for a flow by flow id.
   * Deletes the associated log level for a flow by flow id
   * @param flowId The flow id to delete the loglevel for (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowInstancesSettingsLoglevelsWithHttpInfo(String flowId) throws IOException {
    return deleteFlowInstancesSettingsLoglevels(createDeleteFlowInstancesSettingsLoglevelsRequest(flowId).withHttpInfo());
  }

  private DeleteFlowInstancesSettingsLoglevelsRequest createDeleteFlowInstancesSettingsLoglevelsRequest(String flowId) {
    return DeleteFlowInstancesSettingsLoglevelsRequest.builder()
            .withFlowId(flowId)

            .build();
  }

  /**
   * Deletes a log level for a flow by flow id.
   * Deletes the associated log level for a flow by flow id
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowInstancesSettingsLoglevels(DeleteFlowInstancesSettingsLoglevelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a log level for a flow by flow id.
   * Deletes the associated log level for a flow by flow id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowInstancesSettingsLoglevels(ApiRequest<Void> request) throws IOException {
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
   * Batch-delete a list of flows
   * Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param id List of Flow IDs (required)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation deleteFlows(List<String> id) throws IOException, ApiException {
    return  deleteFlows(createDeleteFlowsRequest(id));
  }

  /**
   * Batch-delete a list of flows
   * Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param id List of Flow IDs (required)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> deleteFlowsWithHttpInfo(List<String> id) throws IOException {
    return deleteFlows(createDeleteFlowsRequest(id).withHttpInfo());
  }

  private DeleteFlowsRequest createDeleteFlowsRequest(List<String> id) {
    return DeleteFlowsRequest.builder()
            .withId(id)

            .build();
  }

  /**
   * Batch-delete a list of flows
   * Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation deleteFlows(DeleteFlowsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Batch-delete a list of flows
   * Multiple IDs can be specified, in which case all specified flows will be deleted.  Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> deleteFlows(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * deletes a specific datatable by id
   * Deletes an entire datatable (including the schema and data) with a given datatableId
   * @param datatableId id of datatable (required)
   * @param force force delete, even if in use (optional, default to false)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowsDatatable(String datatableId, Boolean force) throws IOException, ApiException {
     deleteFlowsDatatable(createDeleteFlowsDatatableRequest(datatableId, force));
  }

  /**
   * deletes a specific datatable by id
   * Deletes an entire datatable (including the schema and data) with a given datatableId
   * @param datatableId id of datatable (required)
   * @param force force delete, even if in use (optional, default to false)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowsDatatableWithHttpInfo(String datatableId, Boolean force) throws IOException {
    return deleteFlowsDatatable(createDeleteFlowsDatatableRequest(datatableId, force).withHttpInfo());
  }

  private DeleteFlowsDatatableRequest createDeleteFlowsDatatableRequest(String datatableId, Boolean force) {
    return DeleteFlowsDatatableRequest.builder()
            .withDatatableId(datatableId)

            .withForce(force)

            .build();
  }

  /**
   * deletes a specific datatable by id
   * Deletes an entire datatable (including the schema and data) with a given datatableId
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowsDatatable(DeleteFlowsDatatableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * deletes a specific datatable by id
   * Deletes an entire datatable (including the schema and data) with a given datatableId
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowsDatatable(ApiRequest<Void> request) throws IOException {
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
   * Delete a row entry
   * Deletes a row with a given rowId (the value of the key field).
   * @param datatableId id of datatable (required)
   * @param rowId the key for the row (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowsDatatableRow(String datatableId, String rowId) throws IOException, ApiException {
     deleteFlowsDatatableRow(createDeleteFlowsDatatableRowRequest(datatableId, rowId));
  }

  /**
   * Delete a row entry
   * Deletes a row with a given rowId (the value of the key field).
   * @param datatableId id of datatable (required)
   * @param rowId the key for the row (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowsDatatableRowWithHttpInfo(String datatableId, String rowId) throws IOException {
    return deleteFlowsDatatableRow(createDeleteFlowsDatatableRowRequest(datatableId, rowId).withHttpInfo());
  }

  private DeleteFlowsDatatableRowRequest createDeleteFlowsDatatableRowRequest(String datatableId, String rowId) {
    return DeleteFlowsDatatableRowRequest.builder()
            .withDatatableId(datatableId)

            .withRowId(rowId)

            .build();
  }

  /**
   * Delete a row entry
   * Deletes a row with a given rowId (the value of the key field).
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowsDatatableRow(DeleteFlowsDatatableRowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a row entry
   * Deletes a row with a given rowId (the value of the key field).
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowsDatatableRow(ApiRequest<Void> request) throws IOException {
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
   * Resets the org log level to default, base
   * Resets the org log level to default, base
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowsInstancesSettingsLoglevelsDefault() throws IOException, ApiException {
     deleteFlowsInstancesSettingsLoglevelsDefault(createDeleteFlowsInstancesSettingsLoglevelsDefaultRequest());
  }

  /**
   * Resets the org log level to default, base
   * Resets the org log level to default, base
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowsInstancesSettingsLoglevelsDefaultWithHttpInfo() throws IOException {
    return deleteFlowsInstancesSettingsLoglevelsDefault(createDeleteFlowsInstancesSettingsLoglevelsDefaultRequest().withHttpInfo());
  }

  private DeleteFlowsInstancesSettingsLoglevelsDefaultRequest createDeleteFlowsInstancesSettingsLoglevelsDefaultRequest() {
    return DeleteFlowsInstancesSettingsLoglevelsDefaultRequest.builder()
            .build();
  }

  /**
   * Resets the org log level to default, base
   * Resets the org log level to default, base
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteFlowsInstancesSettingsLoglevelsDefault(DeleteFlowsInstancesSettingsLoglevelsDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Resets the org log level to default, base
   * Resets the org log level to default, base
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteFlowsInstancesSettingsLoglevelsDefault(ApiRequest<Void> request) throws IOException {
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
   * Delete a flow milestone.
   * 
   * @param milestoneId flow milestone ID (required)
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteFlowsMilestone(String milestoneId) throws IOException, ApiException {
    return  deleteFlowsMilestone(createDeleteFlowsMilestoneRequest(milestoneId));
  }

  /**
   * Delete a flow milestone.
   * 
   * @param milestoneId flow milestone ID (required)
   * @return Empty
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteFlowsMilestoneWithHttpInfo(String milestoneId) throws IOException {
    return deleteFlowsMilestone(createDeleteFlowsMilestoneRequest(milestoneId).withHttpInfo());
  }

  private DeleteFlowsMilestoneRequest createDeleteFlowsMilestoneRequest(String milestoneId) {
    return DeleteFlowsMilestoneRequest.builder()
            .withMilestoneId(milestoneId)

            .build();
  }

  /**
   * Delete a flow milestone.
   * 
   * @param request The request object
   * @return Empty
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Empty deleteFlowsMilestone(DeleteFlowsMilestoneRequest request) throws IOException, ApiException {
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
   * Delete a flow milestone.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Empty> deleteFlowsMilestone(ApiRequest<Void> request) throws IOException {
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
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param name Object name to search for (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Include resources each result item consumes (optional)
   * @param consumingResources Include resources that consume each result item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @return DependencyObjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObjectEntityListing getArchitectDependencytracking(String name, Integer pageNumber, Integer pageSize, List<String> objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType) throws IOException, ApiException {
    return  getArchitectDependencytracking(createGetArchitectDependencytrackingRequest(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType));
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param name Object name to search for (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Include resources each result item consumes (optional)
   * @param consumingResources Include resources that consume each result item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @return DependencyObjectEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingWithHttpInfo(String name, Integer pageNumber, Integer pageSize, List<String> objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType) throws IOException {
    return getArchitectDependencytracking(createGetArchitectDependencytrackingRequest(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType).withHttpInfo());
  }

  private GetArchitectDependencytrackingRequest createGetArchitectDependencytrackingRequest(String name, Integer pageNumber, Integer pageSize, List<String> objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType) {
    return GetArchitectDependencytrackingRequest.builder()
            .withName(name)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withObjectType(objectType)

            .withConsumedResources(consumedResources)

            .withConsumingResources(consumingResources)

            .withConsumedResourceType(consumedResourceType)

            .withConsumingResourceType(consumingResourceType)

            .build();
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param request The request object
   * @return DependencyObjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObjectEntityListing getArchitectDependencytracking(GetArchitectDependencytrackingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyObjectEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytracking(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyObjectEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @return DependencyStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyStatus getArchitectDependencytrackingBuild() throws IOException, ApiException {
    return  getArchitectDependencytrackingBuild(createGetArchitectDependencytrackingBuildRequest());
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @return DependencyStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyStatus> getArchitectDependencytrackingBuildWithHttpInfo() throws IOException {
    return getArchitectDependencytrackingBuild(createGetArchitectDependencytrackingBuildRequest().withHttpInfo());
  }

  private GetArchitectDependencytrackingBuildRequest createGetArchitectDependencytrackingBuildRequest() {
    return GetArchitectDependencytrackingBuildRequest.builder()
            .build();
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @param request The request object
   * @return DependencyStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyStatus getArchitectDependencytrackingBuild(GetArchitectDependencytrackingBuildRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyStatus> getArchitectDependencytrackingBuild(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyStatus> response = (ApiResponse<DependencyStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyStatus> response = (ApiResponse<DependencyStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param id Consuming object ID (required)
   * @param version Consuming object version (required)
   * @param objectType Consuming object type.  Only versioned types are allowed here. (required)
   * @param resourceType Types of consumed resources to show (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ConsumedResourcesEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsumedResourcesEntityListing getArchitectDependencytrackingConsumedresources(String id, String version, String objectType, List<String> resourceType, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getArchitectDependencytrackingConsumedresources(createGetArchitectDependencytrackingConsumedresourcesRequest(id, version, objectType, resourceType, pageNumber, pageSize));
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param id Consuming object ID (required)
   * @param version Consuming object version (required)
   * @param objectType Consuming object type.  Only versioned types are allowed here. (required)
   * @param resourceType Types of consumed resources to show (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ConsumedResourcesEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsumedResourcesEntityListing> getArchitectDependencytrackingConsumedresourcesWithHttpInfo(String id, String version, String objectType, List<String> resourceType, Integer pageNumber, Integer pageSize) throws IOException {
    return getArchitectDependencytrackingConsumedresources(createGetArchitectDependencytrackingConsumedresourcesRequest(id, version, objectType, resourceType, pageNumber, pageSize).withHttpInfo());
  }

  private GetArchitectDependencytrackingConsumedresourcesRequest createGetArchitectDependencytrackingConsumedresourcesRequest(String id, String version, String objectType, List<String> resourceType, Integer pageNumber, Integer pageSize) {
    return GetArchitectDependencytrackingConsumedresourcesRequest.builder()
            .withId(id)

            .withVersion(version)

            .withObjectType(objectType)

            .withResourceType(resourceType)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param request The request object
   * @return ConsumedResourcesEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsumedResourcesEntityListing getArchitectDependencytrackingConsumedresources(GetArchitectDependencytrackingConsumedresourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConsumedResourcesEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConsumedResourcesEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsumedResourcesEntityListing> getArchitectDependencytrackingConsumedresources(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConsumedResourcesEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConsumedResourcesEntityListing> response = (ApiResponse<ConsumedResourcesEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConsumedResourcesEntityListing> response = (ApiResponse<ConsumedResourcesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param id Consumed object ID (required)
   * @param objectType Consumed object type (required)
   * @param resourceType Types of consuming resources to show.  Only versioned types are allowed here. (optional)
   * @param version Object version (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param flowFilter Show only checkedIn or published flows (optional)
   * @return ConsumingResourcesEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsumingResourcesEntityListing getArchitectDependencytrackingConsumingresources(String id, String objectType, List<String> resourceType, String version, Integer pageNumber, Integer pageSize, String flowFilter) throws IOException, ApiException {
    return  getArchitectDependencytrackingConsumingresources(createGetArchitectDependencytrackingConsumingresourcesRequest(id, objectType, resourceType, version, pageNumber, pageSize, flowFilter));
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param id Consumed object ID (required)
   * @param objectType Consumed object type (required)
   * @param resourceType Types of consuming resources to show.  Only versioned types are allowed here. (optional)
   * @param version Object version (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param flowFilter Show only checkedIn or published flows (optional)
   * @return ConsumingResourcesEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsumingResourcesEntityListing> getArchitectDependencytrackingConsumingresourcesWithHttpInfo(String id, String objectType, List<String> resourceType, String version, Integer pageNumber, Integer pageSize, String flowFilter) throws IOException {
    return getArchitectDependencytrackingConsumingresources(createGetArchitectDependencytrackingConsumingresourcesRequest(id, objectType, resourceType, version, pageNumber, pageSize, flowFilter).withHttpInfo());
  }

  private GetArchitectDependencytrackingConsumingresourcesRequest createGetArchitectDependencytrackingConsumingresourcesRequest(String id, String objectType, List<String> resourceType, String version, Integer pageNumber, Integer pageSize, String flowFilter) {
    return GetArchitectDependencytrackingConsumingresourcesRequest.builder()
            .withId(id)

            .withObjectType(objectType)

            .withResourceType(resourceType)

            .withVersion(version)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withFlowFilter(flowFilter)

            .build();
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param request The request object
   * @return ConsumingResourcesEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConsumingResourcesEntityListing getArchitectDependencytrackingConsumingresources(GetArchitectDependencytrackingConsumingresourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConsumingResourcesEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConsumingResourcesEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConsumingResourcesEntityListing> getArchitectDependencytrackingConsumingresources(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConsumingResourcesEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConsumingResourcesEntityListing> response = (ApiResponse<ConsumingResourcesEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConsumingResourcesEntityListing> response = (ApiResponse<ConsumingResourcesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param flowFilter Show only checkedIn or published flows (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingDeletedresourceconsumers(String name, List<String> objectType, String flowFilter, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getArchitectDependencytrackingDeletedresourceconsumers(createGetArchitectDependencytrackingDeletedresourceconsumersRequest(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize));
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param flowFilter Show only checkedIn or published flows (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingDeletedresourceconsumersWithHttpInfo(String name, List<String> objectType, String flowFilter, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException {
    return getArchitectDependencytrackingDeletedresourceconsumers(createGetArchitectDependencytrackingDeletedresourceconsumersRequest(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize).withHttpInfo());
  }

  private GetArchitectDependencytrackingDeletedresourceconsumersRequest createGetArchitectDependencytrackingDeletedresourceconsumersRequest(String name, List<String> objectType, String flowFilter, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) {
    return GetArchitectDependencytrackingDeletedresourceconsumersRequest.builder()
            .withName(name)

            .withObjectType(objectType)

            .withFlowFilter(flowFilter)

            .withConsumedResources(consumedResources)

            .withConsumedResourceType(consumedResourceType)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param request The request object
   * @return DependencyObjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingDeletedresourceconsumers(GetArchitectDependencytrackingDeletedresourceconsumersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyObjectEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingDeletedresourceconsumers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyObjectEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param id Object ID (required)
   * @param version Object version (optional)
   * @param objectType Object type (optional)
   * @param consumedResources Include resources this item consumes (optional)
   * @param consumingResources Include resources that consume this item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @param consumedResourceRequest Indicate that this is going to look up a consumed resource object (optional)
   * @return DependencyObject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObject getArchitectDependencytrackingObject(String id, String version, String objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType, Boolean consumedResourceRequest) throws IOException, ApiException {
    return  getArchitectDependencytrackingObject(createGetArchitectDependencytrackingObjectRequest(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType, consumedResourceRequest));
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param id Object ID (required)
   * @param version Object version (optional)
   * @param objectType Object type (optional)
   * @param consumedResources Include resources this item consumes (optional)
   * @param consumingResources Include resources that consume this item (optional)
   * @param consumedResourceType Types of consumed resources to return, if consumed resources are requested (optional)
   * @param consumingResourceType Types of consuming resources to return, if consuming resources are requested (optional)
   * @param consumedResourceRequest Indicate that this is going to look up a consumed resource object (optional)
   * @return DependencyObject
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObject> getArchitectDependencytrackingObjectWithHttpInfo(String id, String version, String objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType, Boolean consumedResourceRequest) throws IOException {
    return getArchitectDependencytrackingObject(createGetArchitectDependencytrackingObjectRequest(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType, consumedResourceRequest).withHttpInfo());
  }

  private GetArchitectDependencytrackingObjectRequest createGetArchitectDependencytrackingObjectRequest(String id, String version, String objectType, Boolean consumedResources, Boolean consumingResources, List<String> consumedResourceType, List<String> consumingResourceType, Boolean consumedResourceRequest) {
    return GetArchitectDependencytrackingObjectRequest.builder()
            .withId(id)

            .withVersion(version)

            .withObjectType(objectType)

            .withConsumedResources(consumedResources)

            .withConsumingResources(consumingResources)

            .withConsumedResourceType(consumedResourceType)

            .withConsumingResourceType(consumingResourceType)

            .withConsumedResourceRequest(consumedResourceRequest)

            .build();
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param request The request object
   * @return DependencyObject
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObject getArchitectDependencytrackingObject(GetArchitectDependencytrackingObjectRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyObject> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyObject>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObject> getArchitectDependencytrackingObject(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyObject>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObject> response = (ApiResponse<DependencyObject>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObject> response = (ApiResponse<DependencyObject>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param typeId Type ID (required)
   * @return DependencyType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyType getArchitectDependencytrackingType(String typeId) throws IOException, ApiException {
    return  getArchitectDependencytrackingType(createGetArchitectDependencytrackingTypeRequest(typeId));
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param typeId Type ID (required)
   * @return DependencyType
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyType> getArchitectDependencytrackingTypeWithHttpInfo(String typeId) throws IOException {
    return getArchitectDependencytrackingType(createGetArchitectDependencytrackingTypeRequest(typeId).withHttpInfo());
  }

  private GetArchitectDependencytrackingTypeRequest createGetArchitectDependencytrackingTypeRequest(String typeId) {
    return GetArchitectDependencytrackingTypeRequest.builder()
            .withTypeId(typeId)

            .build();
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param request The request object
   * @return DependencyType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyType getArchitectDependencytrackingType(GetArchitectDependencytrackingTypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyType> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyType>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyType> getArchitectDependencytrackingType(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyType>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyType> response = (ApiResponse<DependencyType>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyType> response = (ApiResponse<DependencyType>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyTypeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyTypeEntityListing getArchitectDependencytrackingTypes(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getArchitectDependencytrackingTypes(createGetArchitectDependencytrackingTypesRequest(pageNumber, pageSize));
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyTypeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyTypeEntityListing> getArchitectDependencytrackingTypesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getArchitectDependencytrackingTypes(createGetArchitectDependencytrackingTypesRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetArchitectDependencytrackingTypesRequest createGetArchitectDependencytrackingTypesRequest(Integer pageNumber, Integer pageSize) {
    return GetArchitectDependencytrackingTypesRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param request The request object
   * @return DependencyTypeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyTypeEntityListing getArchitectDependencytrackingTypes(GetArchitectDependencytrackingTypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyTypeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyTypeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyTypeEntityListing> getArchitectDependencytrackingTypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyTypeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyTypeEntityListing> response = (ApiResponse<DependencyTypeEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyTypeEntityListing> response = (ApiResponse<DependencyTypeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingUpdatedresourceconsumers(String name, List<String> objectType, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getArchitectDependencytrackingUpdatedresourceconsumers(createGetArchitectDependencytrackingUpdatedresourceconsumersRequest(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize));
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param name Name to search for (optional)
   * @param objectType Object type(s) to search for (optional)
   * @param consumedResources Return consumed resources? (optional, default to false)
   * @param consumedResourceType Resource type(s) to return (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DependencyObjectEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingUpdatedresourceconsumersWithHttpInfo(String name, List<String> objectType, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) throws IOException {
    return getArchitectDependencytrackingUpdatedresourceconsumers(createGetArchitectDependencytrackingUpdatedresourceconsumersRequest(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize).withHttpInfo());
  }

  private GetArchitectDependencytrackingUpdatedresourceconsumersRequest createGetArchitectDependencytrackingUpdatedresourceconsumersRequest(String name, List<String> objectType, Boolean consumedResources, List<String> consumedResourceType, Integer pageNumber, Integer pageSize) {
    return GetArchitectDependencytrackingUpdatedresourceconsumersRequest.builder()
            .withName(name)

            .withObjectType(objectType)

            .withConsumedResources(consumedResources)

            .withConsumedResourceType(consumedResourceType)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param request The request object
   * @return DependencyObjectEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DependencyObjectEntityListing getArchitectDependencytrackingUpdatedresourceconsumers(GetArchitectDependencytrackingUpdatedresourceconsumersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DependencyObjectEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DependencyObjectEntityListing> getArchitectDependencytrackingUpdatedresourceconsumers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DependencyObjectEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a emergency group by ID
   * 
   * @param emergencyGroupId Emergency group ID (required)
   * @return EmergencyGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroup getArchitectEmergencygroup(String emergencyGroupId) throws IOException, ApiException {
    return  getArchitectEmergencygroup(createGetArchitectEmergencygroupRequest(emergencyGroupId));
  }

  /**
   * Gets a emergency group by ID
   * 
   * @param emergencyGroupId Emergency group ID (required)
   * @return EmergencyGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroup> getArchitectEmergencygroupWithHttpInfo(String emergencyGroupId) throws IOException {
    return getArchitectEmergencygroup(createGetArchitectEmergencygroupRequest(emergencyGroupId).withHttpInfo());
  }

  private GetArchitectEmergencygroupRequest createGetArchitectEmergencygroupRequest(String emergencyGroupId) {
    return GetArchitectEmergencygroupRequest.builder()
            .withEmergencyGroupId(emergencyGroupId)

            .build();
  }

  /**
   * Gets a emergency group by ID
   * 
   * @param request The request object
   * @return EmergencyGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroup getArchitectEmergencygroup(GetArchitectEmergencygroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmergencyGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmergencyGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a emergency group by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroup> getArchitectEmergencygroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmergencyGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of emergency groups.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name of the Emergency Group to filter by. (optional)
   * @return EmergencyGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroupListing getArchitectEmergencygroups(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name) throws IOException, ApiException {
    return  getArchitectEmergencygroups(createGetArchitectEmergencygroupsRequest(pageNumber, pageSize, sortBy, sortOrder, name));
  }

  /**
   * Get a list of emergency groups.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name of the Emergency Group to filter by. (optional)
   * @return EmergencyGroupListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroupListing> getArchitectEmergencygroupsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name) throws IOException {
    return getArchitectEmergencygroups(createGetArchitectEmergencygroupsRequest(pageNumber, pageSize, sortBy, sortOrder, name).withHttpInfo());
  }

  private GetArchitectEmergencygroupsRequest createGetArchitectEmergencygroupsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name) {
    return GetArchitectEmergencygroupsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .build();
  }

  /**
   * Get a list of emergency groups.
   * 
   * @param request The request object
   * @return EmergencyGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroupListing getArchitectEmergencygroups(GetArchitectEmergencygroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmergencyGroupListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmergencyGroupListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of emergency groups.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroupListing> getArchitectEmergencygroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmergencyGroupListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroupListing> response = (ApiResponse<EmergencyGroupListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroupListing> response = (ApiResponse<EmergencyGroupListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic emergency group objects filterable by query parameters.
   * This returns emergency groups consisting of name and division. If one or more IDs are specified, the search will fetch emergency groups that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the Emergency Groups to filter by. (optional)
   * @param name Name of the Emergency Group to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return EmergencyGroupDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroupDivisionViewEntityListing getArchitectEmergencygroupsDivisionviews(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException, ApiException {
    return  getArchitectEmergencygroupsDivisionviews(createGetArchitectEmergencygroupsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId));
  }

  /**
   * Get a pageable list of basic emergency group objects filterable by query parameters.
   * This returns emergency groups consisting of name and division. If one or more IDs are specified, the search will fetch emergency groups that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the Emergency Groups to filter by. (optional)
   * @param name Name of the Emergency Group to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return EmergencyGroupDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroupDivisionViewEntityListing> getArchitectEmergencygroupsDivisionviewsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException {
    return getArchitectEmergencygroupsDivisionviews(createGetArchitectEmergencygroupsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId).withHttpInfo());
  }

  private GetArchitectEmergencygroupsDivisionviewsRequest createGetArchitectEmergencygroupsDivisionviewsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) {
    return GetArchitectEmergencygroupsDivisionviewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of basic emergency group objects filterable by query parameters.
   * This returns emergency groups consisting of name and division. If one or more IDs are specified, the search will fetch emergency groups that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return EmergencyGroupDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroupDivisionViewEntityListing getArchitectEmergencygroupsDivisionviews(GetArchitectEmergencygroupsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmergencyGroupDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmergencyGroupDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic emergency group objects filterable by query parameters.
   * This returns emergency groups consisting of name and division. If one or more IDs are specified, the search will fetch emergency groups that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroupDivisionViewEntityListing> getArchitectEmergencygroupsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmergencyGroupDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroupDivisionViewEntityListing> response = (ApiResponse<EmergencyGroupDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroupDivisionViewEntityListing> response = (ApiResponse<EmergencyGroupDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a grammar
   * Returns a specified grammar
   * @param grammarId grammar ID (required)
   * @param includeFileUrls Include grammar language file URLs (optional)
   * @return Grammar
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Grammar getArchitectGrammar(String grammarId, Boolean includeFileUrls) throws IOException, ApiException {
    return  getArchitectGrammar(createGetArchitectGrammarRequest(grammarId, includeFileUrls));
  }

  /**
   * Get a grammar
   * Returns a specified grammar
   * @param grammarId grammar ID (required)
   * @param includeFileUrls Include grammar language file URLs (optional)
   * @return Grammar
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Grammar> getArchitectGrammarWithHttpInfo(String grammarId, Boolean includeFileUrls) throws IOException {
    return getArchitectGrammar(createGetArchitectGrammarRequest(grammarId, includeFileUrls).withHttpInfo());
  }

  private GetArchitectGrammarRequest createGetArchitectGrammarRequest(String grammarId, Boolean includeFileUrls) {
    return GetArchitectGrammarRequest.builder()
            .withGrammarId(grammarId)

            .withIncludeFileUrls(includeFileUrls)

            .build();
  }

  /**
   * Get a grammar
   * Returns a specified grammar
   * @param request The request object
   * @return Grammar
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Grammar getArchitectGrammar(GetArchitectGrammarRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Grammar> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Grammar>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a grammar
   * Returns a specified grammar
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Grammar> getArchitectGrammar(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Grammar>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a grammar language.
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @return GrammarLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarLanguage getArchitectGrammarLanguage(String grammarId, String languageCode) throws IOException, ApiException {
    return  getArchitectGrammarLanguage(createGetArchitectGrammarLanguageRequest(grammarId, languageCode));
  }

  /**
   * Get a grammar language.
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @return GrammarLanguage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarLanguage> getArchitectGrammarLanguageWithHttpInfo(String grammarId, String languageCode) throws IOException {
    return getArchitectGrammarLanguage(createGetArchitectGrammarLanguageRequest(grammarId, languageCode).withHttpInfo());
  }

  private GetArchitectGrammarLanguageRequest createGetArchitectGrammarLanguageRequest(String grammarId, String languageCode) {
    return GetArchitectGrammarLanguageRequest.builder()
            .withGrammarId(grammarId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Get a grammar language.
   * 
   * @param request The request object
   * @return GrammarLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarLanguage getArchitectGrammarLanguage(GetArchitectGrammarLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GrammarLanguage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GrammarLanguage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a grammar language.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarLanguage> getArchitectGrammarLanguage(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GrammarLanguage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of grammars, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching grammars will be returned, and no other parameters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param includeFileUrls Include grammar language file URLs (optional)
   * @return GrammarListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarListing getArchitectGrammars(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, Boolean includeFileUrls) throws IOException, ApiException {
    return  getArchitectGrammars(createGetArchitectGrammarsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, includeFileUrls));
  }

  /**
   * Get a pageable list of grammars, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching grammars will be returned, and no other parameters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param includeFileUrls Include grammar language file URLs (optional)
   * @return GrammarListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarListing> getArchitectGrammarsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, Boolean includeFileUrls) throws IOException {
    return getArchitectGrammars(createGetArchitectGrammarsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, includeFileUrls).withHttpInfo());
  }

  private GetArchitectGrammarsRequest createGetArchitectGrammarsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, Boolean includeFileUrls) {
    return GetArchitectGrammarsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDescription(description)

            .withNameOrDescription(nameOrDescription)

            .withIncludeFileUrls(includeFileUrls)

            .build();
  }

  /**
   * Get a pageable list of grammars, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching grammars will be returned, and no other parameters will be evaluated.
   * @param request The request object
   * @return GrammarListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarListing getArchitectGrammars(GetArchitectGrammarsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GrammarListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GrammarListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of grammars, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching grammars will be returned, and no other parameters will be evaluated.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarListing> getArchitectGrammars(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GrammarListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarListing> response = (ApiResponse<GrammarListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarListing> response = (ApiResponse<GrammarListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an IVR config.
   * 
   * @param ivrId IVR id (required)
   * @return IVR
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVR getArchitectIvr(String ivrId) throws IOException, ApiException {
    return  getArchitectIvr(createGetArchitectIvrRequest(ivrId));
  }

  /**
   * Get an IVR config.
   * 
   * @param ivrId IVR id (required)
   * @return IVR
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVR> getArchitectIvrWithHttpInfo(String ivrId) throws IOException {
    return getArchitectIvr(createGetArchitectIvrRequest(ivrId).withHttpInfo());
  }

  private GetArchitectIvrRequest createGetArchitectIvrRequest(String ivrId) {
    return GetArchitectIvrRequest.builder()
            .withIvrId(ivrId)

            .build();
  }

  /**
   * Get an IVR config.
   * 
   * @param request The request object
   * @return IVR
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVR getArchitectIvr(GetArchitectIvrRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IVR> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IVR>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an IVR config.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVR> getArchitectIvr(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IVR>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an IVR IdentityResolutionConfig.
   * 
   * @param ivrId IVR id (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getArchitectIvrIdentityresolution(String ivrId) throws IOException, ApiException {
    return  getArchitectIvrIdentityresolution(createGetArchitectIvrIdentityresolutionRequest(ivrId));
  }

  /**
   * Get an IVR IdentityResolutionConfig.
   * 
   * @param ivrId IVR id (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getArchitectIvrIdentityresolutionWithHttpInfo(String ivrId) throws IOException {
    return getArchitectIvrIdentityresolution(createGetArchitectIvrIdentityresolutionRequest(ivrId).withHttpInfo());
  }

  private GetArchitectIvrIdentityresolutionRequest createGetArchitectIvrIdentityresolutionRequest(String ivrId) {
    return GetArchitectIvrIdentityresolutionRequest.builder()
            .withIvrId(ivrId)

            .build();
  }

  /**
   * Get an IVR IdentityResolutionConfig.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig getArchitectIvrIdentityresolution(GetArchitectIvrIdentityresolutionRequest request) throws IOException, ApiException {
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
   * Get an IVR IdentityResolutionConfig.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> getArchitectIvrIdentityresolution(ApiRequest<Void> request) throws IOException {
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
   * Get IVR configs.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name of the IVR to filter by. (optional)
   * @param dnis The phone number of the IVR to filter by. (optional)
   * @param scheduleGroup The Schedule Group of the IVR to filter by. (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return IVREntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVREntityListing getArchitectIvrs(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String dnis, String scheduleGroup, List<String> expand) throws IOException, ApiException {
    return  getArchitectIvrs(createGetArchitectIvrsRequest(pageNumber, pageSize, sortBy, sortOrder, name, dnis, scheduleGroup, expand));
  }

  /**
   * Get IVR configs.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name of the IVR to filter by. (optional)
   * @param dnis The phone number of the IVR to filter by. (optional)
   * @param scheduleGroup The Schedule Group of the IVR to filter by. (optional)
   * @param expand Which fields, if any, to expand (optional)
   * @return IVREntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVREntityListing> getArchitectIvrsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String dnis, String scheduleGroup, List<String> expand) throws IOException {
    return getArchitectIvrs(createGetArchitectIvrsRequest(pageNumber, pageSize, sortBy, sortOrder, name, dnis, scheduleGroup, expand).withHttpInfo());
  }

  private GetArchitectIvrsRequest createGetArchitectIvrsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String dnis, String scheduleGroup, List<String> expand) {
    return GetArchitectIvrsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withDnis(dnis)

            .withScheduleGroup(scheduleGroup)

            .withExpand(expand)

            .build();
  }

  /**
   * Get IVR configs.
   * 
   * @param request The request object
   * @return IVREntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVREntityListing getArchitectIvrs(GetArchitectIvrsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IVREntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IVREntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get IVR configs.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVREntityListing> getArchitectIvrs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IVREntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IVREntityListing> response = (ApiResponse<IVREntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IVREntityListing> response = (ApiResponse<IVREntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic ivr configuration information objects filterable by query parameters.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the IVR to filter by. (optional)
   * @param name Name of the IVR to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return IVRDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVRDivisionViewEntityListing getArchitectIvrsDivisionviews(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException, ApiException {
    return  getArchitectIvrsDivisionviews(createGetArchitectIvrsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId));
  }

  /**
   * Get a pageable list of basic ivr configuration information objects filterable by query parameters.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the IVR to filter by. (optional)
   * @param name Name of the IVR to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return IVRDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVRDivisionViewEntityListing> getArchitectIvrsDivisionviewsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException {
    return getArchitectIvrsDivisionviews(createGetArchitectIvrsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId).withHttpInfo());
  }

  private GetArchitectIvrsDivisionviewsRequest createGetArchitectIvrsDivisionviewsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) {
    return GetArchitectIvrsDivisionviewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of basic ivr configuration information objects filterable by query parameters.
   * 
   * @param request The request object
   * @return IVRDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVRDivisionViewEntityListing getArchitectIvrsDivisionviews(GetArchitectIvrsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IVRDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IVRDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic ivr configuration information objects filterable by query parameters.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVRDivisionViewEntityListing> getArchitectIvrsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IVRDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IVRDivisionViewEntityListing> response = (ApiResponse<IVRDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IVRDivisionViewEntityListing> response = (ApiResponse<IVRDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return Prompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Prompt getArchitectPrompt(String promptId, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException, ApiException {
    return  getArchitectPrompt(createGetArchitectPromptRequest(promptId, includeMediaUris, includeResources, language));
  }

  /**
   * Get specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return Prompt
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Prompt> getArchitectPromptWithHttpInfo(String promptId, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException {
    return getArchitectPrompt(createGetArchitectPromptRequest(promptId, includeMediaUris, includeResources, language).withHttpInfo());
  }

  private GetArchitectPromptRequest createGetArchitectPromptRequest(String promptId, Boolean includeMediaUris, Boolean includeResources, List<String> language) {
    return GetArchitectPromptRequest.builder()
            .withPromptId(promptId)

            .withIncludeMediaUris(includeMediaUris)

            .withIncludeResources(includeResources)

            .withLanguage(language)

            .build();
  }

  /**
   * Get specified user prompt
   * 
   * @param request The request object
   * @return Prompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Prompt getArchitectPrompt(GetArchitectPromptRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Prompt> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Prompt>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get specified user prompt
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Prompt> getArchitectPrompt(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Prompt>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get generated prompt history
   * 
   * @param promptId Prompt ID (required)
   * @param historyId History request ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Sort order (optional, default to desc)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param action Flow actions to include (omit to include all) (optional)
   * @return HistoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoryListing getArchitectPromptHistoryHistoryId(String promptId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) throws IOException, ApiException {
    return  getArchitectPromptHistoryHistoryId(createGetArchitectPromptHistoryHistoryIdRequest(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action));
  }

  /**
   * Get generated prompt history
   * 
   * @param promptId Prompt ID (required)
   * @param historyId History request ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Sort order (optional, default to desc)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param action Flow actions to include (omit to include all) (optional)
   * @return HistoryListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoryListing> getArchitectPromptHistoryHistoryIdWithHttpInfo(String promptId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) throws IOException {
    return getArchitectPromptHistoryHistoryId(createGetArchitectPromptHistoryHistoryIdRequest(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action).withHttpInfo());
  }

  private GetArchitectPromptHistoryHistoryIdRequest createGetArchitectPromptHistoryHistoryIdRequest(String promptId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) {
    return GetArchitectPromptHistoryHistoryIdRequest.builder()
            .withPromptId(promptId)

            .withHistoryId(historyId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .withSortBy(sortBy)

            .withAction(action)

            .build();
  }

  /**
   * Get generated prompt history
   * 
   * @param request The request object
   * @return HistoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoryListing getArchitectPromptHistoryHistoryId(GetArchitectPromptHistoryHistoryIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoryListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoryListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get generated prompt history
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoryListing> getArchitectPromptHistoryHistoryId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoryListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAsset getArchitectPromptResource(String promptId, String languageCode) throws IOException, ApiException {
    return  getArchitectPromptResource(createGetArchitectPromptResourceRequest(promptId, languageCode));
  }

  /**
   * Get specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAsset> getArchitectPromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException {
    return getArchitectPromptResource(createGetArchitectPromptResourceRequest(promptId, languageCode).withHttpInfo());
  }

  private GetArchitectPromptResourceRequest createGetArchitectPromptResourceRequest(String promptId, String languageCode) {
    return GetArchitectPromptResourceRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Get specified user prompt resource
   * 
   * @param request The request object
   * @return PromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAsset getArchitectPromptResource(GetArchitectPromptResourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PromptAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get specified user prompt resource
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAsset> getArchitectPromptResource(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PromptAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return PromptAssetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAssetEntityListing getArchitectPromptResources(String promptId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getArchitectPromptResources(createGetArchitectPromptResourcesRequest(promptId, pageNumber, pageSize));
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return PromptAssetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAssetEntityListing> getArchitectPromptResourcesWithHttpInfo(String promptId, Integer pageNumber, Integer pageSize) throws IOException {
    return getArchitectPromptResources(createGetArchitectPromptResourcesRequest(promptId, pageNumber, pageSize).withHttpInfo());
  }

  private GetArchitectPromptResourcesRequest createGetArchitectPromptResourcesRequest(String promptId, Integer pageNumber, Integer pageSize) {
    return GetArchitectPromptResourcesRequest.builder()
            .withPromptId(promptId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param request The request object
   * @return PromptAssetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAssetEntityListing getArchitectPromptResources(GetArchitectPromptResourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PromptAssetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PromptAssetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAssetEntityListing> getArchitectPromptResources(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PromptAssetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAssetEntityListing> response = (ApiResponse<PromptAssetEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAssetEntityListing> response = (ApiResponse<PromptAssetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return PromptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptEntityListing getArchitectPrompts(Integer pageNumber, Integer pageSize, List<String> name, String description, String nameOrDescription, String sortBy, String sortOrder, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException, ApiException {
    return  getArchitectPrompts(createGetArchitectPromptsRequest(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder, includeMediaUris, includeResources, language));
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return PromptEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptEntityListing> getArchitectPromptsWithHttpInfo(Integer pageNumber, Integer pageSize, List<String> name, String description, String nameOrDescription, String sortBy, String sortOrder, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException {
    return getArchitectPrompts(createGetArchitectPromptsRequest(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder, includeMediaUris, includeResources, language).withHttpInfo());
  }

  private GetArchitectPromptsRequest createGetArchitectPromptsRequest(Integer pageNumber, Integer pageSize, List<String> name, String description, String nameOrDescription, String sortBy, String sortOrder, Boolean includeMediaUris, Boolean includeResources, List<String> language) {
    return GetArchitectPromptsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withName(name)

            .withDescription(description)

            .withNameOrDescription(nameOrDescription)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withIncludeMediaUris(includeMediaUris)

            .withIncludeResources(includeResources)

            .withLanguage(language)

            .build();
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param request The request object
   * @return PromptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptEntityListing getArchitectPrompts(GetArchitectPromptsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PromptEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PromptEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptEntityListing> getArchitectPrompts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PromptEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PromptEntityListing> response = (ApiResponse<PromptEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PromptEntityListing> response = (ApiResponse<PromptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a schedule by ID
   * 
   * @param scheduleId Schedule ID (required)
   * @return Schedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Schedule getArchitectSchedule(String scheduleId) throws IOException, ApiException {
    return  getArchitectSchedule(createGetArchitectScheduleRequest(scheduleId));
  }

  /**
   * Get a schedule by ID
   * 
   * @param scheduleId Schedule ID (required)
   * @return Schedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Schedule> getArchitectScheduleWithHttpInfo(String scheduleId) throws IOException {
    return getArchitectSchedule(createGetArchitectScheduleRequest(scheduleId).withHttpInfo());
  }

  private GetArchitectScheduleRequest createGetArchitectScheduleRequest(String scheduleId) {
    return GetArchitectScheduleRequest.builder()
            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * Get a schedule by ID
   * 
   * @param request The request object
   * @return Schedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Schedule getArchitectSchedule(GetArchitectScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Schedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Schedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a schedule by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Schedule> getArchitectSchedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Schedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a schedule group by ID
   * 
   * @param scheduleGroupId Schedule group ID (required)
   * @return ScheduleGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroup getArchitectSchedulegroup(String scheduleGroupId) throws IOException, ApiException {
    return  getArchitectSchedulegroup(createGetArchitectSchedulegroupRequest(scheduleGroupId));
  }

  /**
   * Gets a schedule group by ID
   * 
   * @param scheduleGroupId Schedule group ID (required)
   * @return ScheduleGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroup> getArchitectSchedulegroupWithHttpInfo(String scheduleGroupId) throws IOException {
    return getArchitectSchedulegroup(createGetArchitectSchedulegroupRequest(scheduleGroupId).withHttpInfo());
  }

  private GetArchitectSchedulegroupRequest createGetArchitectSchedulegroupRequest(String scheduleGroupId) {
    return GetArchitectSchedulegroupRequest.builder()
            .withScheduleGroupId(scheduleGroupId)

            .build();
  }

  /**
   * Gets a schedule group by ID
   * 
   * @param request The request object
   * @return ScheduleGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroup getArchitectSchedulegroup(GetArchitectSchedulegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a schedule group by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroup> getArchitectSchedulegroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of schedule groups.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name of the Schedule Group to filter by. (optional)
   * @param scheduleIds A comma-delimited list of Schedule IDs to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleGroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroupEntityListing getArchitectSchedulegroups(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String scheduleIds, List<String> divisionId) throws IOException, ApiException {
    return  getArchitectSchedulegroups(createGetArchitectSchedulegroupsRequest(pageNumber, pageSize, sortBy, sortOrder, name, scheduleIds, divisionId));
  }

  /**
   * Get a list of schedule groups.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param name Name of the Schedule Group to filter by. (optional)
   * @param scheduleIds A comma-delimited list of Schedule IDs to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleGroupEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroupEntityListing> getArchitectSchedulegroupsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String scheduleIds, List<String> divisionId) throws IOException {
    return getArchitectSchedulegroups(createGetArchitectSchedulegroupsRequest(pageNumber, pageSize, sortBy, sortOrder, name, scheduleIds, divisionId).withHttpInfo());
  }

  private GetArchitectSchedulegroupsRequest createGetArchitectSchedulegroupsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String scheduleIds, List<String> divisionId) {
    return GetArchitectSchedulegroupsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withScheduleIds(scheduleIds)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a list of schedule groups.
   * 
   * @param request The request object
   * @return ScheduleGroupEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroupEntityListing getArchitectSchedulegroups(GetArchitectSchedulegroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleGroupEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleGroupEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of schedule groups.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroupEntityListing> getArchitectSchedulegroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleGroupEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroupEntityListing> response = (ApiResponse<ScheduleGroupEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroupEntityListing> response = (ApiResponse<ScheduleGroupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic schedule group configuration information objects filterable by query parameters.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the schedule group to filter by. (optional)
   * @param name Name of the schedule group to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleGroupDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroupDivisionViewEntityListing getArchitectSchedulegroupsDivisionviews(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException, ApiException {
    return  getArchitectSchedulegroupsDivisionviews(createGetArchitectSchedulegroupsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId));
  }

  /**
   * Get a pageable list of basic schedule group configuration information objects filterable by query parameters.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the schedule group to filter by. (optional)
   * @param name Name of the schedule group to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleGroupDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroupDivisionViewEntityListing> getArchitectSchedulegroupsDivisionviewsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException {
    return getArchitectSchedulegroupsDivisionviews(createGetArchitectSchedulegroupsDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId).withHttpInfo());
  }

  private GetArchitectSchedulegroupsDivisionviewsRequest createGetArchitectSchedulegroupsDivisionviewsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) {
    return GetArchitectSchedulegroupsDivisionviewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of basic schedule group configuration information objects filterable by query parameters.
   * 
   * @param request The request object
   * @return ScheduleGroupDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroupDivisionViewEntityListing getArchitectSchedulegroupsDivisionviews(GetArchitectSchedulegroupsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleGroupDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleGroupDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic schedule group configuration information objects filterable by query parameters.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroupDivisionViewEntityListing> getArchitectSchedulegroupsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleGroupDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroupDivisionViewEntityListing> response = (ApiResponse<ScheduleGroupDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroupDivisionViewEntityListing> response = (ApiResponse<ScheduleGroupDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of schedules.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name of the Schedule to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleEntityListing getArchitectSchedules(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, List<String> divisionId) throws IOException, ApiException {
    return  getArchitectSchedules(createGetArchitectSchedulesRequest(pageNumber, pageSize, sortBy, sortOrder, name, divisionId));
  }

  /**
   * Get a list of schedules.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name of the Schedule to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleEntityListing> getArchitectSchedulesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, List<String> divisionId) throws IOException {
    return getArchitectSchedules(createGetArchitectSchedulesRequest(pageNumber, pageSize, sortBy, sortOrder, name, divisionId).withHttpInfo());
  }

  private GetArchitectSchedulesRequest createGetArchitectSchedulesRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, List<String> divisionId) {
    return GetArchitectSchedulesRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a list of schedules.
   * 
   * @param request The request object
   * @return ScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleEntityListing getArchitectSchedules(GetArchitectSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of schedules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleEntityListing> getArchitectSchedules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleEntityListing> response = (ApiResponse<ScheduleEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleEntityListing> response = (ApiResponse<ScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic schedule configuration information objects filterable by query parameters.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the schedule group to filter by. (optional)
   * @param name Name of the schedule group to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleDivisionViewEntityListing getArchitectSchedulesDivisionviews(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException, ApiException {
    return  getArchitectSchedulesDivisionviews(createGetArchitectSchedulesDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId));
  }

  /**
   * Get a pageable list of basic schedule configuration information objects filterable by query parameters.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to name)
   * @param sortOrder Sort order (optional, default to ASC)
   * @param id ID of the schedule group to filter by. (optional)
   * @param name Name of the schedule group to filter by. (optional)
   * @param divisionId List of divisionIds on which to filter. (optional)
   * @return ScheduleDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleDivisionViewEntityListing> getArchitectSchedulesDivisionviewsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException {
    return getArchitectSchedulesDivisionviews(createGetArchitectSchedulesDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId).withHttpInfo());
  }

  private GetArchitectSchedulesDivisionviewsRequest createGetArchitectSchedulesDivisionviewsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) {
    return GetArchitectSchedulesDivisionviewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of basic schedule configuration information objects filterable by query parameters.
   * 
   * @param request The request object
   * @return ScheduleDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleDivisionViewEntityListing getArchitectSchedulesDivisionviews(GetArchitectSchedulesDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic schedule configuration information objects filterable by query parameters.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleDivisionViewEntityListing> getArchitectSchedulesDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleDivisionViewEntityListing> response = (ApiResponse<ScheduleDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleDivisionViewEntityListing> response = (ApiResponse<ScheduleDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a system prompt
   * 
   * @param promptId promptId (required)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return SystemPrompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPrompt getArchitectSystemprompt(String promptId, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException, ApiException {
    return  getArchitectSystemprompt(createGetArchitectSystempromptRequest(promptId, includeMediaUris, includeResources, language));
  }

  /**
   * Get a system prompt
   * 
   * @param promptId promptId (required)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return SystemPrompt
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPrompt> getArchitectSystempromptWithHttpInfo(String promptId, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException {
    return getArchitectSystemprompt(createGetArchitectSystempromptRequest(promptId, includeMediaUris, includeResources, language).withHttpInfo());
  }

  private GetArchitectSystempromptRequest createGetArchitectSystempromptRequest(String promptId, Boolean includeMediaUris, Boolean includeResources, List<String> language) {
    return GetArchitectSystempromptRequest.builder()
            .withPromptId(promptId)

            .withIncludeMediaUris(includeMediaUris)

            .withIncludeResources(includeResources)

            .withLanguage(language)

            .build();
  }

  /**
   * Get a system prompt
   * 
   * @param request The request object
   * @return SystemPrompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPrompt getArchitectSystemprompt(GetArchitectSystempromptRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SystemPrompt> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SystemPrompt>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a system prompt
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPrompt> getArchitectSystemprompt(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SystemPrompt>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPrompt> response = (ApiResponse<SystemPrompt>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPrompt> response = (ApiResponse<SystemPrompt>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get generated prompt history
   * 
   * @param promptId promptId (required)
   * @param historyId History request ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Sort order (optional, default to desc)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param action Flow actions to include (omit to include all) (optional)
   * @return HistoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoryListing getArchitectSystempromptHistoryHistoryId(String promptId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) throws IOException, ApiException {
    return  getArchitectSystempromptHistoryHistoryId(createGetArchitectSystempromptHistoryHistoryIdRequest(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action));
  }

  /**
   * Get generated prompt history
   * 
   * @param promptId promptId (required)
   * @param historyId History request ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Sort order (optional, default to desc)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param action Flow actions to include (omit to include all) (optional)
   * @return HistoryListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoryListing> getArchitectSystempromptHistoryHistoryIdWithHttpInfo(String promptId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) throws IOException {
    return getArchitectSystempromptHistoryHistoryId(createGetArchitectSystempromptHistoryHistoryIdRequest(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action).withHttpInfo());
  }

  private GetArchitectSystempromptHistoryHistoryIdRequest createGetArchitectSystempromptHistoryHistoryIdRequest(String promptId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) {
    return GetArchitectSystempromptHistoryHistoryIdRequest.builder()
            .withPromptId(promptId)

            .withHistoryId(historyId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .withSortBy(sortBy)

            .withAction(action)

            .build();
  }

  /**
   * Get generated prompt history
   * 
   * @param request The request object
   * @return HistoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoryListing getArchitectSystempromptHistoryHistoryId(GetArchitectSystempromptHistoryHistoryIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoryListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoryListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get generated prompt history
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoryListing> getArchitectSystempromptHistoryHistoryId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoryListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a system prompt resource.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return SystemPromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAsset getArchitectSystempromptResource(String promptId, String languageCode) throws IOException, ApiException {
    return  getArchitectSystempromptResource(createGetArchitectSystempromptResourceRequest(promptId, languageCode));
  }

  /**
   * Get a system prompt resource.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return SystemPromptAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAsset> getArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode) throws IOException {
    return getArchitectSystempromptResource(createGetArchitectSystempromptResourceRequest(promptId, languageCode).withHttpInfo());
  }

  private GetArchitectSystempromptResourceRequest createGetArchitectSystempromptResourceRequest(String promptId, String languageCode) {
    return GetArchitectSystempromptResourceRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Get a system prompt resource.
   * 
   * @param request The request object
   * @return SystemPromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAsset getArchitectSystempromptResource(GetArchitectSystempromptResourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SystemPromptAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a system prompt resource.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAsset> getArchitectSystempromptResource(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SystemPromptAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get system prompt resources.
   * 
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return SystemPromptAssetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAssetEntityListing getArchitectSystempromptResources(String promptId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getArchitectSystempromptResources(createGetArchitectSystempromptResourcesRequest(promptId, pageNumber, pageSize, sortBy, sortOrder));
  }

  /**
   * Get system prompt resources.
   * 
   * @param promptId Prompt ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @return SystemPromptAssetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAssetEntityListing> getArchitectSystempromptResourcesWithHttpInfo(String promptId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) throws IOException {
    return getArchitectSystempromptResources(createGetArchitectSystempromptResourcesRequest(promptId, pageNumber, pageSize, sortBy, sortOrder).withHttpInfo());
  }

  private GetArchitectSystempromptResourcesRequest createGetArchitectSystempromptResourcesRequest(String promptId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) {
    return GetArchitectSystempromptResourcesRequest.builder()
            .withPromptId(promptId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Get system prompt resources.
   * 
   * @param request The request object
   * @return SystemPromptAssetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAssetEntityListing getArchitectSystempromptResources(GetArchitectSystempromptResourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SystemPromptAssetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SystemPromptAssetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get system prompt resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAssetEntityListing> getArchitectSystempromptResources(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SystemPromptAssetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAssetEntityListing> response = (ApiResponse<SystemPromptAssetEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAssetEntityListing> response = (ApiResponse<SystemPromptAssetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get System Prompts
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return SystemPromptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptEntityListing getArchitectSystemprompts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String description, String nameOrDescription, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException, ApiException {
    return  getArchitectSystemprompts(createGetArchitectSystempromptsRequest(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription, includeMediaUris, includeResources, language));
  }

  /**
   * Get System Prompts
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param includeMediaUris Include the media URIs for each resource (optional, default to true)
   * @param includeResources Include the resources for each system prompt (optional, default to true)
   * @param language Filter the resources down to the provided languages (optional)
   * @return SystemPromptEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptEntityListing> getArchitectSystempromptsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String description, String nameOrDescription, Boolean includeMediaUris, Boolean includeResources, List<String> language) throws IOException {
    return getArchitectSystemprompts(createGetArchitectSystempromptsRequest(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription, includeMediaUris, includeResources, language).withHttpInfo());
  }

  private GetArchitectSystempromptsRequest createGetArchitectSystempromptsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String name, String description, String nameOrDescription, Boolean includeMediaUris, Boolean includeResources, List<String> language) {
    return GetArchitectSystempromptsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withName(name)

            .withDescription(description)

            .withNameOrDescription(nameOrDescription)

            .withIncludeMediaUris(includeMediaUris)

            .withIncludeResources(includeResources)

            .withLanguage(language)

            .build();
  }

  /**
   * Get System Prompts
   * 
   * @param request The request object
   * @return SystemPromptEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptEntityListing getArchitectSystemprompts(GetArchitectSystempromptsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SystemPromptEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SystemPromptEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get System Prompts
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptEntityListing> getArchitectSystemprompts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SystemPromptEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptEntityListing> response = (ApiResponse<SystemPromptEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptEntityListing> response = (ApiResponse<SystemPromptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Deleted flows (optional, default to false)
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow getFlow(String flowId, Boolean deleted) throws IOException, ApiException {
    return  getFlow(createGetFlowRequest(flowId, deleted));
  }

  /**
   * Get flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Deleted flows (optional, default to false)
   * @return Flow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> getFlowWithHttpInfo(String flowId, Boolean deleted) throws IOException {
    return getFlow(createGetFlowRequest(flowId, deleted).withHttpInfo());
  }

  private GetFlowRequest createGetFlowRequest(String flowId, Boolean deleted) {
    return GetFlowRequest.builder()
            .withFlowId(flowId)

            .withDeleted(deleted)

            .build();
  }

  /**
   * Get flow
   * 
   * @param request The request object
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow getFlow(GetFlowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Flow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Flow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> getFlow(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Flow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get generated flow history
   * 
   * @param flowId Flow ID (required)
   * @param historyId History request ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Sort order (optional, default to desc)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param action Flow actions to include (omit to include all) (optional)
   * @return HistoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoryListing getFlowHistoryHistoryId(String flowId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) throws IOException, ApiException {
    return  getFlowHistoryHistoryId(createGetFlowHistoryHistoryIdRequest(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action));
  }

  /**
   * Get generated flow history
   * 
   * @param flowId Flow ID (required)
   * @param historyId History request ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortOrder Sort order (optional, default to desc)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param action Flow actions to include (omit to include all) (optional)
   * @return HistoryListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoryListing> getFlowHistoryHistoryIdWithHttpInfo(String flowId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) throws IOException {
    return getFlowHistoryHistoryId(createGetFlowHistoryHistoryIdRequest(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action).withHttpInfo());
  }

  private GetFlowHistoryHistoryIdRequest createGetFlowHistoryHistoryIdRequest(String flowId, String historyId, Integer pageNumber, Integer pageSize, String sortOrder, String sortBy, List<String> action) {
    return GetFlowHistoryHistoryIdRequest.builder()
            .withFlowId(flowId)

            .withHistoryId(historyId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortOrder(sortOrder)

            .withSortBy(sortBy)

            .withAction(action)

            .build();
  }

  /**
   * Get generated flow history
   * 
   * @param request The request object
   * @return HistoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoryListing getFlowHistoryHistoryId(GetFlowHistoryHistoryIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoryListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoryListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get generated flow history
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoryListing> getFlowHistoryHistoryId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoryListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<HistoryListing> response = (ApiResponse<HistoryListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves the log level for a flow by flow id.
   * Retrieves the log level for a flow by flow id.
   * @param flowId The flow id to get the loglevel for (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse getFlowInstancesSettingsLoglevels(String flowId, List<String> expand) throws IOException, ApiException {
    return  getFlowInstancesSettingsLoglevels(createGetFlowInstancesSettingsLoglevelsRequest(flowId, expand));
  }

  /**
   * Retrieves the log level for a flow by flow id.
   * Retrieves the log level for a flow by flow id.
   * @param flowId The flow id to get the loglevel for (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> getFlowInstancesSettingsLoglevelsWithHttpInfo(String flowId, List<String> expand) throws IOException {
    return getFlowInstancesSettingsLoglevels(createGetFlowInstancesSettingsLoglevelsRequest(flowId, expand).withHttpInfo());
  }

  private GetFlowInstancesSettingsLoglevelsRequest createGetFlowInstancesSettingsLoglevelsRequest(String flowId, List<String> expand) {
    return GetFlowInstancesSettingsLoglevelsRequest.builder()
            .withFlowId(flowId)

            .withExpand(expand)

            .build();
  }

  /**
   * Retrieves the log level for a flow by flow id.
   * Retrieves the log level for a flow by flow id.
   * @param request The request object
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse getFlowInstancesSettingsLoglevels(GetFlowInstancesSettingsLoglevelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves the log level for a flow by flow id.
   * Retrieves the log level for a flow by flow id.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> getFlowInstancesSettingsLoglevels(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Deleted flows (optional, default to false)
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getFlowLatestconfiguration(String flowId, Boolean deleted) throws IOException, ApiException {
    return  getFlowLatestconfiguration(createGetFlowLatestconfigurationRequest(flowId, deleted));
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param flowId Flow ID (required)
   * @param deleted Deleted flows (optional, default to false)
   * @return Object
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getFlowLatestconfigurationWithHttpInfo(String flowId, Boolean deleted) throws IOException {
    return getFlowLatestconfiguration(createGetFlowLatestconfigurationRequest(flowId, deleted).withHttpInfo());
  }

  private GetFlowLatestconfigurationRequest createGetFlowLatestconfigurationRequest(String flowId, Boolean deleted) {
    return GetFlowLatestconfigurationRequest.builder()
            .withFlowId(flowId)

            .withDeleted(deleted)

            .build();
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param request The request object
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getFlowLatestconfiguration(GetFlowLatestconfigurationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Object> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Object>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getFlowLatestconfiguration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Object>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get flow version
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Deleted flows (optional)
   * @return FlowVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowVersion getFlowVersion(String flowId, String versionId, String deleted) throws IOException, ApiException {
    return  getFlowVersion(createGetFlowVersionRequest(flowId, versionId, deleted));
  }

  /**
   * Get flow version
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Deleted flows (optional)
   * @return FlowVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowVersion> getFlowVersionWithHttpInfo(String flowId, String versionId, String deleted) throws IOException {
    return getFlowVersion(createGetFlowVersionRequest(flowId, versionId, deleted).withHttpInfo());
  }

  private GetFlowVersionRequest createGetFlowVersionRequest(String flowId, String versionId, String deleted) {
    return GetFlowVersionRequest.builder()
            .withFlowId(flowId)

            .withVersionId(versionId)

            .withDeleted(deleted)

            .build();
  }

  /**
   * Get flow version
   * 
   * @param request The request object
   * @return FlowVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowVersion getFlowVersion(GetFlowVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get flow version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowVersion> getFlowVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get flow version configuration
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Deleted flows (optional)
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getFlowVersionConfiguration(String flowId, String versionId, String deleted) throws IOException, ApiException {
    return  getFlowVersionConfiguration(createGetFlowVersionConfigurationRequest(flowId, versionId, deleted));
  }

  /**
   * Get flow version configuration
   * 
   * @param flowId Flow ID (required)
   * @param versionId Version ID (required)
   * @param deleted Deleted flows (optional)
   * @return Object
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getFlowVersionConfigurationWithHttpInfo(String flowId, String versionId, String deleted) throws IOException {
    return getFlowVersionConfiguration(createGetFlowVersionConfigurationRequest(flowId, versionId, deleted).withHttpInfo());
  }

  private GetFlowVersionConfigurationRequest createGetFlowVersionConfigurationRequest(String flowId, String versionId, String deleted) {
    return GetFlowVersionConfigurationRequest.builder()
            .withFlowId(flowId)

            .withVersionId(versionId)

            .withDeleted(deleted)

            .build();
  }

  /**
   * Get flow version configuration
   * 
   * @param request The request object
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object getFlowVersionConfiguration(GetFlowVersionConfigurationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Object> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Object>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get flow version configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> getFlowVersionConfiguration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Object>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get overall health scores for all intents present in the NLU domain version associated with the bot flow version.
   * 
   * @param flowId Flow ID. (required)
   * @param versionId Version ID. (required)
   * @param language Language to filter for (optional)
   * @return FlowHealth
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowHealth getFlowVersionHealth(String flowId, String versionId, String language) throws IOException, ApiException {
    return  getFlowVersionHealth(createGetFlowVersionHealthRequest(flowId, versionId, language));
  }

  /**
   * Get overall health scores for all intents present in the NLU domain version associated with the bot flow version.
   * 
   * @param flowId Flow ID. (required)
   * @param versionId Version ID. (required)
   * @param language Language to filter for (optional)
   * @return FlowHealth
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowHealth> getFlowVersionHealthWithHttpInfo(String flowId, String versionId, String language) throws IOException {
    return getFlowVersionHealth(createGetFlowVersionHealthRequest(flowId, versionId, language).withHttpInfo());
  }

  private GetFlowVersionHealthRequest createGetFlowVersionHealthRequest(String flowId, String versionId, String language) {
    return GetFlowVersionHealthRequest.builder()
            .withFlowId(flowId)

            .withVersionId(versionId)

            .withLanguage(language)

            .build();
  }

  /**
   * Get overall health scores for all intents present in the NLU domain version associated with the bot flow version.
   * 
   * @param request The request object
   * @return FlowHealth
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowHealth getFlowVersionHealth(GetFlowVersionHealthRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowHealth> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowHealth>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get overall health scores for all intents present in the NLU domain version associated with the bot flow version.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowHealth> getFlowVersionHealth(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowHealth>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowHealth> response = (ApiResponse<FlowHealth>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowHealth> response = (ApiResponse<FlowHealth>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent.
   * 
   * @param flowId Flow ID. (required)
   * @param versionId Version ID. (required)
   * @param intentId Intent ID. (required)
   * @param language Language to filter for (required)
   * @return FlowHealthIntent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowHealthIntent getFlowVersionIntentHealth(String flowId, String versionId, String intentId, String language) throws IOException, ApiException {
    return  getFlowVersionIntentHealth(createGetFlowVersionIntentHealthRequest(flowId, versionId, intentId, language));
  }

  /**
   * Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent.
   * 
   * @param flowId Flow ID. (required)
   * @param versionId Version ID. (required)
   * @param intentId Intent ID. (required)
   * @param language Language to filter for (required)
   * @return FlowHealthIntent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowHealthIntent> getFlowVersionIntentHealthWithHttpInfo(String flowId, String versionId, String intentId, String language) throws IOException {
    return getFlowVersionIntentHealth(createGetFlowVersionIntentHealthRequest(flowId, versionId, intentId, language).withHttpInfo());
  }

  private GetFlowVersionIntentHealthRequest createGetFlowVersionIntentHealthRequest(String flowId, String versionId, String intentId, String language) {
    return GetFlowVersionIntentHealthRequest.builder()
            .withFlowId(flowId)

            .withVersionId(versionId)

            .withIntentId(intentId)

            .withLanguage(language)

            .build();
  }

  /**
   * Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent.
   * 
   * @param request The request object
   * @return FlowHealthIntent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowHealthIntent getFlowVersionIntentHealth(GetFlowVersionIntentHealthRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowHealthIntent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowHealthIntent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get health scores and other health metrics for a specific intent. This includes the health metrics for each utterance in an intent.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowHealthIntent> getFlowVersionIntentHealth(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowHealthIntent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowHealthIntent> response = (ApiResponse<FlowHealthIntent>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowHealthIntent> response = (ApiResponse<FlowHealthIntent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get health metrics associated with a specific utterance of an intent.
   * 
   * @param flowId Flow ID. (required)
   * @param versionId Version ID. (required)
   * @param intentId Intent ID. (required)
   * @param utteranceId Utterance ID. (required)
   * @param language Language to filter for (required)
   * @return FlowHealthUtterance
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowHealthUtterance getFlowVersionIntentUtteranceHealth(String flowId, String versionId, String intentId, String utteranceId, String language) throws IOException, ApiException {
    return  getFlowVersionIntentUtteranceHealth(createGetFlowVersionIntentUtteranceHealthRequest(flowId, versionId, intentId, utteranceId, language));
  }

  /**
   * Get health metrics associated with a specific utterance of an intent.
   * 
   * @param flowId Flow ID. (required)
   * @param versionId Version ID. (required)
   * @param intentId Intent ID. (required)
   * @param utteranceId Utterance ID. (required)
   * @param language Language to filter for (required)
   * @return FlowHealthUtterance
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowHealthUtterance> getFlowVersionIntentUtteranceHealthWithHttpInfo(String flowId, String versionId, String intentId, String utteranceId, String language) throws IOException {
    return getFlowVersionIntentUtteranceHealth(createGetFlowVersionIntentUtteranceHealthRequest(flowId, versionId, intentId, utteranceId, language).withHttpInfo());
  }

  private GetFlowVersionIntentUtteranceHealthRequest createGetFlowVersionIntentUtteranceHealthRequest(String flowId, String versionId, String intentId, String utteranceId, String language) {
    return GetFlowVersionIntentUtteranceHealthRequest.builder()
            .withFlowId(flowId)

            .withVersionId(versionId)

            .withIntentId(intentId)

            .withUtteranceId(utteranceId)

            .withLanguage(language)

            .build();
  }

  /**
   * Get health metrics associated with a specific utterance of an intent.
   * 
   * @param request The request object
   * @return FlowHealthUtterance
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowHealthUtterance getFlowVersionIntentUtteranceHealth(GetFlowVersionIntentUtteranceHealthRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowHealthUtterance> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowHealthUtterance>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get health metrics associated with a specific utterance of an intent.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowHealthUtterance> getFlowVersionIntentUtteranceHealth(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowHealthUtterance>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowHealthUtterance> response = (ApiResponse<FlowHealthUtterance>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowHealthUtterance> response = (ApiResponse<FlowHealthUtterance>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get flow version list
   * 
   * @param flowId Flow ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Include Deleted flows (optional)
   * @return FlowVersionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowVersionEntityListing getFlowVersions(String flowId, Integer pageNumber, Integer pageSize, Boolean deleted) throws IOException, ApiException {
    return  getFlowVersions(createGetFlowVersionsRequest(flowId, pageNumber, pageSize, deleted));
  }

  /**
   * Get flow version list
   * 
   * @param flowId Flow ID (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param deleted Include Deleted flows (optional)
   * @return FlowVersionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowVersionEntityListing> getFlowVersionsWithHttpInfo(String flowId, Integer pageNumber, Integer pageSize, Boolean deleted) throws IOException {
    return getFlowVersions(createGetFlowVersionsRequest(flowId, pageNumber, pageSize, deleted).withHttpInfo());
  }

  private GetFlowVersionsRequest createGetFlowVersionsRequest(String flowId, Integer pageNumber, Integer pageSize, Boolean deleted) {
    return GetFlowVersionsRequest.builder()
            .withFlowId(flowId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withDeleted(deleted)

            .build();
  }

  /**
   * Get flow version list
   * 
   * @param request The request object
   * @return FlowVersionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowVersionEntityListing getFlowVersions(GetFlowVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowVersionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowVersionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get flow version list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowVersionEntityListing> getFlowVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowVersionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowVersionEntityListing> response = (ApiResponse<FlowVersionEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowVersionEntityListing> response = (ApiResponse<FlowVersionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param type Type (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param publishVersionId Publish version ID (optional)
   * @param editableBy Editable by (optional)
   * @param lockedBy Locked by (optional)
   * @param lockedByClientId Locked by client ID (optional)
   * @param secure Secure (optional)
   * @param deleted Include deleted (optional, default to false)
   * @param includeSchemas Include variable schemas (optional, default to false)
   * @param virtualAgentEnabled Include/exclude virtual agent flows (optional)
   * @param publishedAfter Published after (optional, default to null)
   * @param publishedBefore Published before (optional, default to null)
   * @param divisionId division ID(s) (optional)
   * @return FlowEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowEntityListing getFlows(List<String> type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, String publishVersionId, String editableBy, String lockedBy, String lockedByClientId, String secure, Boolean deleted, Boolean includeSchemas, Boolean virtualAgentEnabled, String publishedAfter, String publishedBefore, List<String> divisionId) throws IOException, ApiException {
    return  getFlows(createGetFlowsRequest(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, lockedByClientId, secure, deleted, includeSchemas, virtualAgentEnabled, publishedAfter, publishedBefore, divisionId));
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param type Type (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param publishVersionId Publish version ID (optional)
   * @param editableBy Editable by (optional)
   * @param lockedBy Locked by (optional)
   * @param lockedByClientId Locked by client ID (optional)
   * @param secure Secure (optional)
   * @param deleted Include deleted (optional, default to false)
   * @param includeSchemas Include variable schemas (optional, default to false)
   * @param virtualAgentEnabled Include/exclude virtual agent flows (optional)
   * @param publishedAfter Published after (optional, default to null)
   * @param publishedBefore Published before (optional, default to null)
   * @param divisionId division ID(s) (optional)
   * @return FlowEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowEntityListing> getFlowsWithHttpInfo(List<String> type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, String publishVersionId, String editableBy, String lockedBy, String lockedByClientId, String secure, Boolean deleted, Boolean includeSchemas, Boolean virtualAgentEnabled, String publishedAfter, String publishedBefore, List<String> divisionId) throws IOException {
    return getFlows(createGetFlowsRequest(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, lockedByClientId, secure, deleted, includeSchemas, virtualAgentEnabled, publishedAfter, publishedBefore, divisionId).withHttpInfo());
  }

  private GetFlowsRequest createGetFlowsRequest(List<String> type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, String publishVersionId, String editableBy, String lockedBy, String lockedByClientId, String secure, Boolean deleted, Boolean includeSchemas, Boolean virtualAgentEnabled, String publishedAfter, String publishedBefore, List<String> divisionId) {
    return GetFlowsRequest.builder()
            .withType(type)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDescription(description)

            .withNameOrDescription(nameOrDescription)

            .withPublishVersionId(publishVersionId)

            .withEditableBy(editableBy)

            .withLockedBy(lockedBy)

            .withLockedByClientId(lockedByClientId)

            .withSecure(secure)

            .withDeleted(deleted)

            .withIncludeSchemas(includeSchemas)

            .withVirtualAgentEnabled(virtualAgentEnabled)

            .withPublishedAfter(publishedAfter)

            .withPublishedBefore(publishedBefore)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return FlowEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowEntityListing getFlows(GetFlowsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowEntityListing> getFlows(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowEntityListing> response = (ApiResponse<FlowEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowEntityListing> response = (ApiResponse<FlowEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param datatableId id of datatable (required)
   * @param expand Expand instructions for the result (optional)
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable getFlowsDatatable(String datatableId, String expand) throws IOException, ApiException {
    return  getFlowsDatatable(createGetFlowsDatatableRequest(datatableId, expand));
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param datatableId id of datatable (required)
   * @param expand Expand instructions for the result (optional)
   * @return DataTable
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> getFlowsDatatableWithHttpInfo(String datatableId, String expand) throws IOException {
    return getFlowsDatatable(createGetFlowsDatatableRequest(datatableId, expand).withHttpInfo());
  }

  private GetFlowsDatatableRequest createGetFlowsDatatableRequest(String datatableId, String expand) {
    return GetFlowsDatatableRequest.builder()
            .withDatatableId(datatableId)

            .withExpand(expand)

            .build();
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request The request object
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable getFlowsDatatable(GetFlowsDatatableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTable> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTable>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> getFlowsDatatable(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTable>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns the state information about an export job
   * Returns the state information about an export job.
   * @param datatableId id of datatable (required)
   * @param exportJobId id of export job (required)
   * @return DataTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableExportJob getFlowsDatatableExportJob(String datatableId, String exportJobId) throws IOException, ApiException {
    return  getFlowsDatatableExportJob(createGetFlowsDatatableExportJobRequest(datatableId, exportJobId));
  }

  /**
   * Returns the state information about an export job
   * Returns the state information about an export job.
   * @param datatableId id of datatable (required)
   * @param exportJobId id of export job (required)
   * @return DataTableExportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableExportJob> getFlowsDatatableExportJobWithHttpInfo(String datatableId, String exportJobId) throws IOException {
    return getFlowsDatatableExportJob(createGetFlowsDatatableExportJobRequest(datatableId, exportJobId).withHttpInfo());
  }

  private GetFlowsDatatableExportJobRequest createGetFlowsDatatableExportJobRequest(String datatableId, String exportJobId) {
    return GetFlowsDatatableExportJobRequest.builder()
            .withDatatableId(datatableId)

            .withExportJobId(exportJobId)

            .build();
  }

  /**
   * Returns the state information about an export job
   * Returns the state information about an export job.
   * @param request The request object
   * @return DataTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableExportJob getFlowsDatatableExportJob(GetFlowsDatatableExportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTableExportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTableExportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns the state information about an export job
   * Returns the state information about an export job.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableExportJob> getFlowsDatatableExportJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTableExportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns the state information about an import job
   * Returns the state information about an import job.
   * @param datatableId id of datatable (required)
   * @param importJobId id of import job (required)
   * @return DataTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableImportJob getFlowsDatatableImportJob(String datatableId, String importJobId) throws IOException, ApiException {
    return  getFlowsDatatableImportJob(createGetFlowsDatatableImportJobRequest(datatableId, importJobId));
  }

  /**
   * Returns the state information about an import job
   * Returns the state information about an import job.
   * @param datatableId id of datatable (required)
   * @param importJobId id of import job (required)
   * @return DataTableImportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableImportJob> getFlowsDatatableImportJobWithHttpInfo(String datatableId, String importJobId) throws IOException {
    return getFlowsDatatableImportJob(createGetFlowsDatatableImportJobRequest(datatableId, importJobId).withHttpInfo());
  }

  private GetFlowsDatatableImportJobRequest createGetFlowsDatatableImportJobRequest(String datatableId, String importJobId) {
    return GetFlowsDatatableImportJobRequest.builder()
            .withDatatableId(datatableId)

            .withImportJobId(importJobId)

            .build();
  }

  /**
   * Returns the state information about an import job
   * Returns the state information about an import job.
   * @param request The request object
   * @return DataTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableImportJob getFlowsDatatableImportJob(GetFlowsDatatableImportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTableImportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTableImportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns the state information about an import job
   * Returns the state information about an import job.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableImportJob> getFlowsDatatableImportJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTableImportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all recent import jobs
   * Get all recent import jobs
   * @param datatableId id of datatable (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DataTableImportEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableImportEntityListing getFlowsDatatableImportJobs(String datatableId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getFlowsDatatableImportJobs(createGetFlowsDatatableImportJobsRequest(datatableId, pageNumber, pageSize));
  }

  /**
   * Get all recent import jobs
   * Get all recent import jobs
   * @param datatableId id of datatable (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return DataTableImportEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableImportEntityListing> getFlowsDatatableImportJobsWithHttpInfo(String datatableId, Integer pageNumber, Integer pageSize) throws IOException {
    return getFlowsDatatableImportJobs(createGetFlowsDatatableImportJobsRequest(datatableId, pageNumber, pageSize).withHttpInfo());
  }

  private GetFlowsDatatableImportJobsRequest createGetFlowsDatatableImportJobsRequest(String datatableId, Integer pageNumber, Integer pageSize) {
    return GetFlowsDatatableImportJobsRequest.builder()
            .withDatatableId(datatableId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get all recent import jobs
   * Get all recent import jobs
   * @param request The request object
   * @return DataTableImportEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableImportEntityListing getFlowsDatatableImportJobs(GetFlowsDatatableImportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTableImportEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTableImportEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all recent import jobs
   * Get all recent import jobs
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableImportEntityListing> getFlowsDatatableImportJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTableImportEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableImportEntityListing> response = (ApiResponse<DataTableImportEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableImportEntityListing> response = (ApiResponse<DataTableImportEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns a specific row for the datatable
   * Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.
   * @param datatableId id of datatable (required)
   * @param rowId The key for the row (required)
   * @param showbrief if true returns just the key field for the row (optional, default to true)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getFlowsDatatableRow(String datatableId, String rowId, Boolean showbrief) throws IOException, ApiException {
    return  getFlowsDatatableRow(createGetFlowsDatatableRowRequest(datatableId, rowId, showbrief));
  }

  /**
   * Returns a specific row for the datatable
   * Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.
   * @param datatableId id of datatable (required)
   * @param rowId The key for the row (required)
   * @param showbrief if true returns just the key field for the row (optional, default to true)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getFlowsDatatableRowWithHttpInfo(String datatableId, String rowId, Boolean showbrief) throws IOException {
    return getFlowsDatatableRow(createGetFlowsDatatableRowRequest(datatableId, rowId, showbrief).withHttpInfo());
  }

  private GetFlowsDatatableRowRequest createGetFlowsDatatableRowRequest(String datatableId, String rowId, Boolean showbrief) {
    return GetFlowsDatatableRowRequest.builder()
            .withDatatableId(datatableId)

            .withRowId(rowId)

            .withShowbrief(showbrief)

            .build();
  }

  /**
   * Returns a specific row for the datatable
   * Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> getFlowsDatatableRow(GetFlowsDatatableRowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Map<String, Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a specific row for the datatable
   * Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> getFlowsDatatableRow(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Map<String, Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns the rows for the datatable with the given id
   * Returns all of the rows for the datatable with the given datatableId.  By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.
   * @param datatableId id of datatable (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param showbrief If true returns just the key value of the row (optional, default to true)
   * @param sortOrder Sort order (optional, default to ascending)
   * @return DataTableRowEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableRowEntityListing getFlowsDatatableRows(String datatableId, Integer pageNumber, Integer pageSize, Boolean showbrief, String sortOrder) throws IOException, ApiException {
    return  getFlowsDatatableRows(createGetFlowsDatatableRowsRequest(datatableId, pageNumber, pageSize, showbrief, sortOrder));
  }

  /**
   * Returns the rows for the datatable with the given id
   * Returns all of the rows for the datatable with the given datatableId.  By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.
   * @param datatableId id of datatable (required)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param showbrief If true returns just the key value of the row (optional, default to true)
   * @param sortOrder Sort order (optional, default to ascending)
   * @return DataTableRowEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableRowEntityListing> getFlowsDatatableRowsWithHttpInfo(String datatableId, Integer pageNumber, Integer pageSize, Boolean showbrief, String sortOrder) throws IOException {
    return getFlowsDatatableRows(createGetFlowsDatatableRowsRequest(datatableId, pageNumber, pageSize, showbrief, sortOrder).withHttpInfo());
  }

  private GetFlowsDatatableRowsRequest createGetFlowsDatatableRowsRequest(String datatableId, Integer pageNumber, Integer pageSize, Boolean showbrief, String sortOrder) {
    return GetFlowsDatatableRowsRequest.builder()
            .withDatatableId(datatableId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withShowbrief(showbrief)

            .withSortOrder(sortOrder)

            .build();
  }

  /**
   * Returns the rows for the datatable with the given id
   * Returns all of the rows for the datatable with the given datatableId.  By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.
   * @param request The request object
   * @return DataTableRowEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableRowEntityListing getFlowsDatatableRows(GetFlowsDatatableRowsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTableRowEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTableRowEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns the rows for the datatable with the given id
   * Returns all of the rows for the datatable with the given datatableId.  By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableRowEntityListing> getFlowsDatatableRows(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTableRowEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableRowEntityListing> response = (ApiResponse<DataTableRowEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableRowEntityListing> response = (ApiResponse<DataTableRowEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param expand Expand instructions for the result (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param divisionId division ID(s) (optional)
   * @param name Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive. (optional, default to null)
   * @return DataTablesDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTablesDomainEntityListing getFlowsDatatables(String expand, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> divisionId, String name) throws IOException, ApiException {
    return  getFlowsDatatables(createGetFlowsDatatablesRequest(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name));
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param expand Expand instructions for the result (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param divisionId division ID(s) (optional)
   * @param name Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive. (optional, default to null)
   * @return DataTablesDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTablesDomainEntityListing> getFlowsDatatablesWithHttpInfo(String expand, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> divisionId, String name) throws IOException {
    return getFlowsDatatables(createGetFlowsDatatablesRequest(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name).withHttpInfo());
  }

  private GetFlowsDatatablesRequest createGetFlowsDatatablesRequest(String expand, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> divisionId, String name) {
    return GetFlowsDatatablesRequest.builder()
            .withExpand(expand)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withDivisionId(divisionId)

            .withName(name)

            .build();
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request The request object
   * @return DataTablesDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTablesDomainEntityListing getFlowsDatatables(GetFlowsDatatablesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTablesDomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTablesDomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTablesDomainEntityListing> getFlowsDatatables(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTablesDomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param datatableId id of datatable (required)
   * @param expand Expand instructions for the result (optional)
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable getFlowsDatatablesDivisionview(String datatableId, String expand) throws IOException, ApiException {
    return  getFlowsDatatablesDivisionview(createGetFlowsDatatablesDivisionviewRequest(datatableId, expand));
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param datatableId id of datatable (required)
   * @param expand Expand instructions for the result (optional)
   * @return DataTable
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> getFlowsDatatablesDivisionviewWithHttpInfo(String datatableId, String expand) throws IOException {
    return getFlowsDatatablesDivisionview(createGetFlowsDatatablesDivisionviewRequest(datatableId, expand).withHttpInfo());
  }

  private GetFlowsDatatablesDivisionviewRequest createGetFlowsDatatablesDivisionviewRequest(String datatableId, String expand) {
    return GetFlowsDatatablesDivisionviewRequest.builder()
            .withDatatableId(datatableId)

            .withExpand(expand)

            .build();
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request The request object
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable getFlowsDatatablesDivisionview(GetFlowsDatatablesDivisionviewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTable> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTable>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns a specific datatable by id
   * Given a datatableId returns the datatable object and schema associated with it.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> getFlowsDatatablesDivisionview(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTable>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param expand Expand instructions for the result (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param divisionId division ID(s) (optional)
   * @param name Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive. (optional, default to null)
   * @return DataTablesDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTablesDomainEntityListing getFlowsDatatablesDivisionviews(String expand, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> divisionId, String name) throws IOException, ApiException {
    return  getFlowsDatatablesDivisionviews(createGetFlowsDatatablesDivisionviewsRequest(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name));
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param expand Expand instructions for the result (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param divisionId division ID(s) (optional)
   * @param name Filter by Name. The wildcard character * is supported within the filter. Matches are case-insensitive. (optional, default to null)
   * @return DataTablesDomainEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTablesDomainEntityListing> getFlowsDatatablesDivisionviewsWithHttpInfo(String expand, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> divisionId, String name) throws IOException {
    return getFlowsDatatablesDivisionviews(createGetFlowsDatatablesDivisionviewsRequest(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name).withHttpInfo());
  }

  private GetFlowsDatatablesDivisionviewsRequest createGetFlowsDatatablesDivisionviewsRequest(String expand, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> divisionId, String name) {
    return GetFlowsDatatablesDivisionviewsRequest.builder()
            .withExpand(expand)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withDivisionId(divisionId)

            .withName(name)

            .build();
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request The request object
   * @return DataTablesDomainEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTablesDomainEntityListing getFlowsDatatablesDivisionviews(GetFlowsDatatablesDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTablesDomainEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTablesDomainEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of datatables for the org
   * Returns a metadata list of the datatables associated with this org, including datatableId, name and description.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTablesDomainEntityListing> getFlowsDatatablesDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTablesDomainEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTablesDomainEntityListing> response = (ApiResponse<DataTablesDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic flow information objects filterable by query parameters.
   * This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param type Type (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param publishVersionId Publish version ID (optional)
   * @param publishedAfter Published after (optional, default to null)
   * @param publishedBefore Published before (optional, default to null)
   * @param divisionId division ID(s) (optional)
   * @param includeSchemas Include variable schemas (optional, default to false)
   * @return FlowDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowDivisionViewEntityListing getFlowsDivisionviews(List<String> type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String publishVersionId, String publishedAfter, String publishedBefore, List<String> divisionId, Boolean includeSchemas) throws IOException, ApiException {
    return  getFlowsDivisionviews(createGetFlowsDivisionviewsRequest(type, pageNumber, pageSize, sortBy, sortOrder, id, name, publishVersionId, publishedAfter, publishedBefore, divisionId, includeSchemas));
  }

  /**
   * Get a pageable list of basic flow information objects filterable by query parameters.
   * This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param type Type (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param publishVersionId Publish version ID (optional)
   * @param publishedAfter Published after (optional, default to null)
   * @param publishedBefore Published before (optional, default to null)
   * @param divisionId division ID(s) (optional)
   * @param includeSchemas Include variable schemas (optional, default to false)
   * @return FlowDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowDivisionViewEntityListing> getFlowsDivisionviewsWithHttpInfo(List<String> type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String publishVersionId, String publishedAfter, String publishedBefore, List<String> divisionId, Boolean includeSchemas) throws IOException {
    return getFlowsDivisionviews(createGetFlowsDivisionviewsRequest(type, pageNumber, pageSize, sortBy, sortOrder, id, name, publishVersionId, publishedAfter, publishedBefore, divisionId, includeSchemas).withHttpInfo());
  }

  private GetFlowsDivisionviewsRequest createGetFlowsDivisionviewsRequest(List<String> type, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String publishVersionId, String publishedAfter, String publishedBefore, List<String> divisionId, Boolean includeSchemas) {
    return GetFlowsDivisionviewsRequest.builder()
            .withType(type)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withPublishVersionId(publishVersionId)

            .withPublishedAfter(publishedAfter)

            .withPublishedBefore(publishedBefore)

            .withDivisionId(divisionId)

            .withIncludeSchemas(includeSchemas)

            .build();
  }

  /**
   * Get a pageable list of basic flow information objects filterable by query parameters.
   * This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return FlowDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowDivisionViewEntityListing getFlowsDivisionviews(GetFlowsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic flow information objects filterable by query parameters.
   * This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowDivisionViewEntityListing> getFlowsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowDivisionViewEntityListing> response = (ApiResponse<FlowDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowDivisionViewEntityListing> response = (ApiResponse<FlowDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a flow execution's details. Flow execution details are available for several days after the flow is started.
   * 
   * @param flowExecutionId flow execution ID (required)
   * @return FlowRuntimeExecution
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowRuntimeExecution getFlowsExecution(String flowExecutionId) throws IOException, ApiException {
    return  getFlowsExecution(createGetFlowsExecutionRequest(flowExecutionId));
  }

  /**
   * Get a flow execution's details. Flow execution details are available for several days after the flow is started.
   * 
   * @param flowExecutionId flow execution ID (required)
   * @return FlowRuntimeExecution
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowRuntimeExecution> getFlowsExecutionWithHttpInfo(String flowExecutionId) throws IOException {
    return getFlowsExecution(createGetFlowsExecutionRequest(flowExecutionId).withHttpInfo());
  }

  private GetFlowsExecutionRequest createGetFlowsExecutionRequest(String flowExecutionId) {
    return GetFlowsExecutionRequest.builder()
            .withFlowExecutionId(flowExecutionId)

            .build();
  }

  /**
   * Get a flow execution's details. Flow execution details are available for several days after the flow is started.
   * 
   * @param request The request object
   * @return FlowRuntimeExecution
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowRuntimeExecution getFlowsExecution(GetFlowsExecutionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowRuntimeExecution> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowRuntimeExecution>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a flow execution's details. Flow execution details are available for several days after the flow is started.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowRuntimeExecution> getFlowsExecution(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowRuntimeExecution>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowRuntimeExecution> response = (ApiResponse<FlowRuntimeExecution>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowRuntimeExecution> response = (ApiResponse<FlowRuntimeExecution>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch Architect Export Job Status
   * 
   * @param jobId Job ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return ArchitectExportJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ArchitectExportJobStateResponse getFlowsExportJob(String jobId, List<String> expand) throws IOException, ApiException {
    return  getFlowsExportJob(createGetFlowsExportJobRequest(jobId, expand));
  }

  /**
   * Fetch Architect Export Job Status
   * 
   * @param jobId Job ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return ArchitectExportJobStateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ArchitectExportJobStateResponse> getFlowsExportJobWithHttpInfo(String jobId, List<String> expand) throws IOException {
    return getFlowsExportJob(createGetFlowsExportJobRequest(jobId, expand).withHttpInfo());
  }

  private GetFlowsExportJobRequest createGetFlowsExportJobRequest(String jobId, List<String> expand) {
    return GetFlowsExportJobRequest.builder()
            .withJobId(jobId)

            .withExpand(expand)

            .build();
  }

  /**
   * Fetch Architect Export Job Status
   * 
   * @param request The request object
   * @return ArchitectExportJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ArchitectExportJobStateResponse getFlowsExportJob(GetFlowsExportJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ArchitectExportJobStateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ArchitectExportJobStateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch Architect Export Job Status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ArchitectExportJobStateResponse> getFlowsExportJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ArchitectExportJobStateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ArchitectExportJobStateResponse> response = (ApiResponse<ArchitectExportJobStateResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ArchitectExportJobStateResponse> response = (ApiResponse<ArchitectExportJobStateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start a process (job) to prepare a download of a singular flow execution data instance by Id
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param instanceId Instance ID (required)
   * @param expand Expand various details. (optional)
   * @return GetFlowExecutionDataJobResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetFlowExecutionDataJobResult getFlowsInstance(String instanceId, String expand) throws IOException, ApiException {
    return  getFlowsInstance(createGetFlowsInstanceRequest(instanceId, expand));
  }

  /**
   * Start a process (job) to prepare a download of a singular flow execution data instance by Id
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param instanceId Instance ID (required)
   * @param expand Expand various details. (optional)
   * @return GetFlowExecutionDataJobResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetFlowExecutionDataJobResult> getFlowsInstanceWithHttpInfo(String instanceId, String expand) throws IOException {
    return getFlowsInstance(createGetFlowsInstanceRequest(instanceId, expand).withHttpInfo());
  }

  private GetFlowsInstanceRequest createGetFlowsInstanceRequest(String instanceId, String expand) {
    return GetFlowsInstanceRequest.builder()
            .withInstanceId(instanceId)

            .withExpand(expand)

            .build();
  }

  /**
   * Start a process (job) to prepare a download of a singular flow execution data instance by Id
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request The request object
   * @return GetFlowExecutionDataJobResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetFlowExecutionDataJobResult getFlowsInstance(GetFlowsInstanceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetFlowExecutionDataJobResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetFlowExecutionDataJobResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start a process (job) to prepare a download of a singular flow execution data instance by Id
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetFlowExecutionDataJobResult> getFlowsInstance(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetFlowExecutionDataJobResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the status and/or results of an asynchronous flow execution data retrieval job
   * 
   * @param jobId The asynchronous job ID (required)
   * @return GetFlowExecutionDataJobResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetFlowExecutionDataJobResult getFlowsInstancesJob(String jobId) throws IOException, ApiException {
    return  getFlowsInstancesJob(createGetFlowsInstancesJobRequest(jobId));
  }

  /**
   * Get the status and/or results of an asynchronous flow execution data retrieval job
   * 
   * @param jobId The asynchronous job ID (required)
   * @return GetFlowExecutionDataJobResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetFlowExecutionDataJobResult> getFlowsInstancesJobWithHttpInfo(String jobId) throws IOException {
    return getFlowsInstancesJob(createGetFlowsInstancesJobRequest(jobId).withHttpInfo());
  }

  private GetFlowsInstancesJobRequest createGetFlowsInstancesJobRequest(String jobId) {
    return GetFlowsInstancesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get the status and/or results of an asynchronous flow execution data retrieval job
   * 
   * @param request The request object
   * @return GetFlowExecutionDataJobResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetFlowExecutionDataJobResult getFlowsInstancesJob(GetFlowsInstancesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetFlowExecutionDataJobResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetFlowExecutionDataJobResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status and/or results of an asynchronous flow execution data retrieval job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetFlowExecutionDataJobResult> getFlowsInstancesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetFlowExecutionDataJobResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve a list of capabilities that the org can use to query for execution data
   * Returns the queryable parameters that can be used to build a query for execution data.
   * @param expand Expand various query types. (optional)
   * @return FlowsQueryCriteriaResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowsQueryCriteriaResponse getFlowsInstancesQuerycapabilities(String expand) throws IOException, ApiException {
    return  getFlowsInstancesQuerycapabilities(createGetFlowsInstancesQuerycapabilitiesRequest(expand));
  }

  /**
   * Retrieve a list of capabilities that the org can use to query for execution data
   * Returns the queryable parameters that can be used to build a query for execution data.
   * @param expand Expand various query types. (optional)
   * @return FlowsQueryCriteriaResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowsQueryCriteriaResponse> getFlowsInstancesQuerycapabilitiesWithHttpInfo(String expand) throws IOException {
    return getFlowsInstancesQuerycapabilities(createGetFlowsInstancesQuerycapabilitiesRequest(expand).withHttpInfo());
  }

  private GetFlowsInstancesQuerycapabilitiesRequest createGetFlowsInstancesQuerycapabilitiesRequest(String expand) {
    return GetFlowsInstancesQuerycapabilitiesRequest.builder()
            .withExpand(expand)

            .build();
  }

  /**
   * Retrieve a list of capabilities that the org can use to query for execution data
   * Returns the queryable parameters that can be used to build a query for execution data.
   * @param request The request object
   * @return FlowsQueryCriteriaResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowsQueryCriteriaResponse getFlowsInstancesQuerycapabilities(GetFlowsInstancesQuerycapabilitiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowsQueryCriteriaResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowsQueryCriteriaResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of capabilities that the org can use to query for execution data
   * Returns the queryable parameters that can be used to build a query for execution data.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowsQueryCriteriaResponse> getFlowsInstancesQuerycapabilities(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowsQueryCriteriaResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowsQueryCriteriaResponse> response = (ApiResponse<FlowsQueryCriteriaResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowsQueryCriteriaResponse> response = (ApiResponse<FlowsQueryCriteriaResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @return ExecutionDataFlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataFlowSettingsResponse getFlowsInstancesSettingsExecutiondata() throws IOException, ApiException {
    return  getFlowsInstancesSettingsExecutiondata(createGetFlowsInstancesSettingsExecutiondataRequest());
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @return ExecutionDataFlowSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataFlowSettingsResponse> getFlowsInstancesSettingsExecutiondataWithHttpInfo() throws IOException {
    return getFlowsInstancesSettingsExecutiondata(createGetFlowsInstancesSettingsExecutiondataRequest().withHttpInfo());
  }

  private GetFlowsInstancesSettingsExecutiondataRequest createGetFlowsInstancesSettingsExecutiondataRequest() {
    return GetFlowsInstancesSettingsExecutiondataRequest.builder()
            .build();
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request The request object
   * @return ExecutionDataFlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataFlowSettingsResponse getFlowsInstancesSettingsExecutiondata(GetFlowsInstancesSettingsExecutiondataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExecutionDataFlowSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExecutionDataFlowSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataFlowSettingsResponse> getFlowsInstancesSettingsExecutiondata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExecutionDataFlowSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve a list of LogLevels for the organization.
   * Returns a paged set of LogLevels per flow id
   * @param expand Expand instructions for the result (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return FlowSettingsResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponseEntityListing getFlowsInstancesSettingsLoglevels(List<String> expand, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getFlowsInstancesSettingsLoglevels(createGetFlowsInstancesSettingsLoglevelsRequest(expand, pageNumber, pageSize));
  }

  /**
   * Retrieve a list of LogLevels for the organization.
   * Returns a paged set of LogLevels per flow id
   * @param expand Expand instructions for the result (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Number of entities to return. Maximum of 200. (optional, default to 25)
   * @return FlowSettingsResponseEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponseEntityListing> getFlowsInstancesSettingsLoglevelsWithHttpInfo(List<String> expand, Integer pageNumber, Integer pageSize) throws IOException {
    return getFlowsInstancesSettingsLoglevels(createGetFlowsInstancesSettingsLoglevelsRequest(expand, pageNumber, pageSize).withHttpInfo());
  }

  private GetFlowsInstancesSettingsLoglevelsRequest createGetFlowsInstancesSettingsLoglevelsRequest(List<String> expand, Integer pageNumber, Integer pageSize) {
    return GetFlowsInstancesSettingsLoglevelsRequest.builder()
            .withExpand(expand)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Retrieve a list of LogLevels for the organization.
   * Returns a paged set of LogLevels per flow id
   * @param request The request object
   * @return FlowSettingsResponseEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponseEntityListing getFlowsInstancesSettingsLoglevels(GetFlowsInstancesSettingsLoglevelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowSettingsResponseEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowSettingsResponseEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a list of LogLevels for the organization.
   * Returns a paged set of LogLevels per flow id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponseEntityListing> getFlowsInstancesSettingsLoglevels(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowSettingsResponseEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponseEntityListing> response = (ApiResponse<FlowSettingsResponseEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponseEntityListing> response = (ApiResponse<FlowSettingsResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets the available flow log level characteristics for this organization.
   * Log levels can be customized and this returns the set of available characteristics that can be enabled/disabled.
   * @return FlowLogLevelCharacteristicsDefinitions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowLogLevelCharacteristicsDefinitions getFlowsInstancesSettingsLoglevelsCharacteristics() throws IOException, ApiException {
    return  getFlowsInstancesSettingsLoglevelsCharacteristics(createGetFlowsInstancesSettingsLoglevelsCharacteristicsRequest());
  }

  /**
   * Gets the available flow log level characteristics for this organization.
   * Log levels can be customized and this returns the set of available characteristics that can be enabled/disabled.
   * @return FlowLogLevelCharacteristicsDefinitions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowLogLevelCharacteristicsDefinitions> getFlowsInstancesSettingsLoglevelsCharacteristicsWithHttpInfo() throws IOException {
    return getFlowsInstancesSettingsLoglevelsCharacteristics(createGetFlowsInstancesSettingsLoglevelsCharacteristicsRequest().withHttpInfo());
  }

  private GetFlowsInstancesSettingsLoglevelsCharacteristicsRequest createGetFlowsInstancesSettingsLoglevelsCharacteristicsRequest() {
    return GetFlowsInstancesSettingsLoglevelsCharacteristicsRequest.builder()
            .build();
  }

  /**
   * Gets the available flow log level characteristics for this organization.
   * Log levels can be customized and this returns the set of available characteristics that can be enabled/disabled.
   * @param request The request object
   * @return FlowLogLevelCharacteristicsDefinitions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowLogLevelCharacteristicsDefinitions getFlowsInstancesSettingsLoglevelsCharacteristics(GetFlowsInstancesSettingsLoglevelsCharacteristicsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowLogLevelCharacteristicsDefinitions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowLogLevelCharacteristicsDefinitions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the available flow log level characteristics for this organization.
   * Log levels can be customized and this returns the set of available characteristics that can be enabled/disabled.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowLogLevelCharacteristicsDefinitions> getFlowsInstancesSettingsLoglevelsCharacteristics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowLogLevelCharacteristicsDefinitions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowLogLevelCharacteristicsDefinitions> response = (ApiResponse<FlowLogLevelCharacteristicsDefinitions>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowLogLevelCharacteristicsDefinitions> response = (ApiResponse<FlowLogLevelCharacteristicsDefinitions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Returns the flow default log level.
   * Returns the flow default log level which will be used if no specific flow id log level is found.
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse getFlowsInstancesSettingsLoglevelsDefault(List<String> expand) throws IOException, ApiException {
    return  getFlowsInstancesSettingsLoglevelsDefault(createGetFlowsInstancesSettingsLoglevelsDefaultRequest(expand));
  }

  /**
   * Returns the flow default log level.
   * Returns the flow default log level which will be used if no specific flow id log level is found.
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> getFlowsInstancesSettingsLoglevelsDefaultWithHttpInfo(List<String> expand) throws IOException {
    return getFlowsInstancesSettingsLoglevelsDefault(createGetFlowsInstancesSettingsLoglevelsDefaultRequest(expand).withHttpInfo());
  }

  private GetFlowsInstancesSettingsLoglevelsDefaultRequest createGetFlowsInstancesSettingsLoglevelsDefaultRequest(List<String> expand) {
    return GetFlowsInstancesSettingsLoglevelsDefaultRequest.builder()
            .withExpand(expand)

            .build();
  }

  /**
   * Returns the flow default log level.
   * Returns the flow default log level which will be used if no specific flow id log level is found.
   * @param request The request object
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse getFlowsInstancesSettingsLoglevelsDefault(GetFlowsInstancesSettingsLoglevelsDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Returns the flow default log level.
   * Returns the flow default log level which will be used if no specific flow id log level is found.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> getFlowsInstancesSettingsLoglevelsDefault(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch Architect Job Status
   * 
   * @param jobId Job ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return ArchitectJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ArchitectJobStateResponse getFlowsJob(String jobId, List<String> expand) throws IOException, ApiException {
    return  getFlowsJob(createGetFlowsJobRequest(jobId, expand));
  }

  /**
   * Fetch Architect Job Status
   * 
   * @param jobId Job ID (required)
   * @param expand Which fields, if any, to expand. (optional)
   * @return ArchitectJobStateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ArchitectJobStateResponse> getFlowsJobWithHttpInfo(String jobId, List<String> expand) throws IOException {
    return getFlowsJob(createGetFlowsJobRequest(jobId, expand).withHttpInfo());
  }

  private GetFlowsJobRequest createGetFlowsJobRequest(String jobId, List<String> expand) {
    return GetFlowsJobRequest.builder()
            .withJobId(jobId)

            .withExpand(expand)

            .build();
  }

  /**
   * Fetch Architect Job Status
   * 
   * @param request The request object
   * @return ArchitectJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ArchitectJobStateResponse getFlowsJob(GetFlowsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ArchitectJobStateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ArchitectJobStateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch Architect Job Status
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ArchitectJobStateResponse> getFlowsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ArchitectJobStateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ArchitectJobStateResponse> response = (ApiResponse<ArchitectJobStateResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ArchitectJobStateResponse> response = (ApiResponse<ArchitectJobStateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a flow milestone
   * Returns a specified flow milestone
   * @param milestoneId flow milestone ID (required)
   * @return FlowMilestone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestone getFlowsMilestone(String milestoneId) throws IOException, ApiException {
    return  getFlowsMilestone(createGetFlowsMilestoneRequest(milestoneId));
  }

  /**
   * Get a flow milestone
   * Returns a specified flow milestone
   * @param milestoneId flow milestone ID (required)
   * @return FlowMilestone
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestone> getFlowsMilestoneWithHttpInfo(String milestoneId) throws IOException {
    return getFlowsMilestone(createGetFlowsMilestoneRequest(milestoneId).withHttpInfo());
  }

  private GetFlowsMilestoneRequest createGetFlowsMilestoneRequest(String milestoneId) {
    return GetFlowsMilestoneRequest.builder()
            .withMilestoneId(milestoneId)

            .build();
  }

  /**
   * Get a flow milestone
   * Returns a specified flow milestone
   * @param request The request object
   * @return FlowMilestone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestone getFlowsMilestone(GetFlowsMilestoneRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowMilestone> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowMilestone>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a flow milestone
   * Returns a specified flow milestone
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestone> getFlowsMilestone(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowMilestone>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of flow milestones, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowMilestoneListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestoneListing getFlowsMilestones(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, List<String> divisionId) throws IOException, ApiException {
    return  getFlowsMilestones(createGetFlowsMilestonesRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId));
  }

  /**
   * Get a pageable list of flow milestones, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowMilestoneListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestoneListing> getFlowsMilestonesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, List<String> divisionId) throws IOException {
    return getFlowsMilestones(createGetFlowsMilestonesRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId).withHttpInfo());
  }

  private GetFlowsMilestonesRequest createGetFlowsMilestonesRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, List<String> divisionId) {
    return GetFlowsMilestonesRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDescription(description)

            .withNameOrDescription(nameOrDescription)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of flow milestones, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.
   * @param request The request object
   * @return FlowMilestoneListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestoneListing getFlowsMilestones(GetFlowsMilestonesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowMilestoneListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowMilestoneListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of flow milestones, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestoneListing> getFlowsMilestones(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowMilestoneListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestoneListing> response = (ApiResponse<FlowMilestoneListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestoneListing> response = (ApiResponse<FlowMilestoneListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic flow milestone information objects filterable by query parameters.
   * This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowMilestoneDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestoneDivisionViewEntityListing getFlowsMilestonesDivisionviews(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException, ApiException {
    return  getFlowsMilestonesDivisionviews(createGetFlowsMilestonesDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId));
  }

  /**
   * Get a pageable list of basic flow milestone information objects filterable by query parameters.
   * This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowMilestoneDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestoneDivisionViewEntityListing> getFlowsMilestonesDivisionviewsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException {
    return getFlowsMilestonesDivisionviews(createGetFlowsMilestonesDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId).withHttpInfo());
  }

  private GetFlowsMilestonesDivisionviewsRequest createGetFlowsMilestonesDivisionviewsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) {
    return GetFlowsMilestonesDivisionviewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of basic flow milestone information objects filterable by query parameters.
   * This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return FlowMilestoneDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestoneDivisionViewEntityListing getFlowsMilestonesDivisionviews(GetFlowsMilestonesDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowMilestoneDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowMilestoneDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic flow milestone information objects filterable by query parameters.
   * This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestoneDivisionViewEntityListing> getFlowsMilestonesDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowMilestoneDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestoneDivisionViewEntityListing> response = (ApiResponse<FlowMilestoneDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestoneDivisionViewEntityListing> response = (ApiResponse<FlowMilestoneDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a flow outcome
   * Returns a specified flow outcome
   * @param flowOutcomeId flow outcome ID (required)
   * @return FlowOutcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcome getFlowsOutcome(String flowOutcomeId) throws IOException, ApiException {
    return  getFlowsOutcome(createGetFlowsOutcomeRequest(flowOutcomeId));
  }

  /**
   * Get a flow outcome
   * Returns a specified flow outcome
   * @param flowOutcomeId flow outcome ID (required)
   * @return FlowOutcome
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcome> getFlowsOutcomeWithHttpInfo(String flowOutcomeId) throws IOException {
    return getFlowsOutcome(createGetFlowsOutcomeRequest(flowOutcomeId).withHttpInfo());
  }

  private GetFlowsOutcomeRequest createGetFlowsOutcomeRequest(String flowOutcomeId) {
    return GetFlowsOutcomeRequest.builder()
            .withFlowOutcomeId(flowOutcomeId)

            .build();
  }

  /**
   * Get a flow outcome
   * Returns a specified flow outcome
   * @param request The request object
   * @return FlowOutcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcome getFlowsOutcome(GetFlowsOutcomeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowOutcome> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowOutcome>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a flow outcome
   * Returns a specified flow outcome
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcome> getFlowsOutcome(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowOutcome>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of flow outcomes, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowOutcomeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcomeListing getFlowsOutcomes(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, List<String> divisionId) throws IOException, ApiException {
    return  getFlowsOutcomes(createGetFlowsOutcomesRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId));
  }

  /**
   * Get a pageable list of flow outcomes, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param description Description (optional)
   * @param nameOrDescription Name or description (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowOutcomeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcomeListing> getFlowsOutcomesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, List<String> divisionId) throws IOException {
    return getFlowsOutcomes(createGetFlowsOutcomesRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId).withHttpInfo());
  }

  private GetFlowsOutcomesRequest createGetFlowsOutcomesRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, String description, String nameOrDescription, List<String> divisionId) {
    return GetFlowsOutcomesRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDescription(description)

            .withNameOrDescription(nameOrDescription)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of flow outcomes, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.
   * @param request The request object
   * @return FlowOutcomeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcomeListing getFlowsOutcomes(GetFlowsOutcomesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowOutcomeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowOutcomeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of flow outcomes, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcomeListing> getFlowsOutcomes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowOutcomeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcomeListing> response = (ApiResponse<FlowOutcomeListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcomeListing> response = (ApiResponse<FlowOutcomeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a pageable list of basic flow outcome information objects filterable by query parameters.
   * This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowOutcomeDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcomeDivisionViewEntityListing getFlowsOutcomesDivisionviews(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException, ApiException {
    return  getFlowsOutcomesDivisionviews(createGetFlowsOutcomesDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId));
  }

  /**
   * Get a pageable list of basic flow outcome information objects filterable by query parameters.
   * This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Sort by (optional, default to id)
   * @param sortOrder Sort order (optional, default to asc)
   * @param id ID (optional)
   * @param name Name (optional)
   * @param divisionId division ID(s) (optional)
   * @return FlowOutcomeDivisionViewEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcomeDivisionViewEntityListing> getFlowsOutcomesDivisionviewsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) throws IOException {
    return getFlowsOutcomesDivisionviews(createGetFlowsOutcomesDivisionviewsRequest(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId).withHttpInfo());
  }

  private GetFlowsOutcomesDivisionviewsRequest createGetFlowsOutcomesDivisionviewsRequest(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, List<String> id, String name, List<String> divisionId) {
    return GetFlowsOutcomesDivisionviewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withId(id)

            .withName(name)

            .withDivisionId(divisionId)

            .build();
  }

  /**
   * Get a pageable list of basic flow outcome information objects filterable by query parameters.
   * This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return FlowOutcomeDivisionViewEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcomeDivisionViewEntityListing getFlowsOutcomesDivisionviews(GetFlowsOutcomesDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowOutcomeDivisionViewEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowOutcomeDivisionViewEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a pageable list of basic flow outcome information objects filterable by query parameters.
   * This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcomeDivisionViewEntityListing> getFlowsOutcomesDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowOutcomeDivisionViewEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcomeDivisionViewEntityListing> response = (ApiResponse<FlowOutcomeDivisionViewEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcomeDivisionViewEntityListing> response = (ApiResponse<FlowOutcomeDivisionViewEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a grammar
   * 
   * @param grammarId grammar ID (required)
   * @param body  (optional)
   * @return Grammar
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Grammar patchArchitectGrammar(String grammarId, Grammar body) throws IOException, ApiException {
    return  patchArchitectGrammar(createPatchArchitectGrammarRequest(grammarId, body));
  }

  /**
   * Updates a grammar
   * 
   * @param grammarId grammar ID (required)
   * @param body  (optional)
   * @return Grammar
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Grammar> patchArchitectGrammarWithHttpInfo(String grammarId, Grammar body) throws IOException {
    return patchArchitectGrammar(createPatchArchitectGrammarRequest(grammarId, body).withHttpInfo());
  }

  private PatchArchitectGrammarRequest createPatchArchitectGrammarRequest(String grammarId, Grammar body) {
    return PatchArchitectGrammarRequest.builder()
            .withGrammarId(grammarId)

            .withBody(body)

            .build();
  }

  /**
   * Updates a grammar
   * 
   * @param request The request object
   * @return Grammar
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Grammar patchArchitectGrammar(PatchArchitectGrammarRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Grammar> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Grammar>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a grammar
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Grammar> patchArchitectGrammar(ApiRequest<Grammar> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Grammar>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a grammar language
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @param body  (optional)
   * @return GrammarLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarLanguage patchArchitectGrammarLanguage(String grammarId, String languageCode, GrammarLanguageUpdate body) throws IOException, ApiException {
    return  patchArchitectGrammarLanguage(createPatchArchitectGrammarLanguageRequest(grammarId, languageCode, body));
  }

  /**
   * Updates a grammar language
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @param body  (optional)
   * @return GrammarLanguage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarLanguage> patchArchitectGrammarLanguageWithHttpInfo(String grammarId, String languageCode, GrammarLanguageUpdate body) throws IOException {
    return patchArchitectGrammarLanguage(createPatchArchitectGrammarLanguageRequest(grammarId, languageCode, body).withHttpInfo());
  }

  private PatchArchitectGrammarLanguageRequest createPatchArchitectGrammarLanguageRequest(String grammarId, String languageCode, GrammarLanguageUpdate body) {
    return PatchArchitectGrammarLanguageRequest.builder()
            .withGrammarId(grammarId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Updates a grammar language
   * 
   * @param request The request object
   * @return GrammarLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarLanguage patchArchitectGrammarLanguage(PatchArchitectGrammarLanguageRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GrammarLanguage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GrammarLanguage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a grammar language
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarLanguage> patchArchitectGrammarLanguage(ApiRequest<GrammarLanguageUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GrammarLanguage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Edit the execution history enabled setting.
   * Edit the execution history enabled setting.
   * @param body New Execution Data Setting (required)
   * @return ExecutionDataFlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataFlowSettingsResponse patchFlowsInstancesSettingsExecutiondata(ExecutionDataSettingsRequest body) throws IOException, ApiException {
    return  patchFlowsInstancesSettingsExecutiondata(createPatchFlowsInstancesSettingsExecutiondataRequest(body));
  }

  /**
   * Edit the execution history enabled setting.
   * Edit the execution history enabled setting.
   * @param body New Execution Data Setting (required)
   * @return ExecutionDataFlowSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataFlowSettingsResponse> patchFlowsInstancesSettingsExecutiondataWithHttpInfo(ExecutionDataSettingsRequest body) throws IOException {
    return patchFlowsInstancesSettingsExecutiondata(createPatchFlowsInstancesSettingsExecutiondataRequest(body).withHttpInfo());
  }

  private PatchFlowsInstancesSettingsExecutiondataRequest createPatchFlowsInstancesSettingsExecutiondataRequest(ExecutionDataSettingsRequest body) {
    return PatchFlowsInstancesSettingsExecutiondataRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Edit the execution history enabled setting.
   * Edit the execution history enabled setting.
   * @param request The request object
   * @return ExecutionDataFlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExecutionDataFlowSettingsResponse patchFlowsInstancesSettingsExecutiondata(PatchFlowsInstancesSettingsExecutiondataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExecutionDataFlowSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExecutionDataFlowSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Edit the execution history enabled setting.
   * Edit the execution history enabled setting.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExecutionDataFlowSettingsResponse> patchFlowsInstancesSettingsExecutiondata(ApiRequest<ExecutionDataSettingsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExecutionDataFlowSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ExecutionDataFlowSettingsResponse> response = (ApiResponse<ExecutionDataFlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * Asynchronous.  Notification topic: v2.architect.dependencytracking.build
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postArchitectDependencytrackingBuild() throws IOException, ApiException {
     postArchitectDependencytrackingBuild(createPostArchitectDependencytrackingBuildRequest());
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * Asynchronous.  Notification topic: v2.architect.dependencytracking.build
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postArchitectDependencytrackingBuildWithHttpInfo() throws IOException {
    return postArchitectDependencytrackingBuild(createPostArchitectDependencytrackingBuildRequest().withHttpInfo());
  }

  private PostArchitectDependencytrackingBuildRequest createPostArchitectDependencytrackingBuildRequest() {
    return PostArchitectDependencytrackingBuildRequest.builder()
            .build();
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * Asynchronous.  Notification topic: v2.architect.dependencytracking.build
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postArchitectDependencytrackingBuild(PostArchitectDependencytrackingBuildRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * Asynchronous.  Notification topic: v2.architect.dependencytracking.build
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postArchitectDependencytrackingBuild(ApiRequest<Void> request) throws IOException {
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
   * Creates a new emergency group
   * 
   * @param body  (required)
   * @return EmergencyGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroup postArchitectEmergencygroups(EmergencyGroup body) throws IOException, ApiException {
    return  postArchitectEmergencygroups(createPostArchitectEmergencygroupsRequest(body));
  }

  /**
   * Creates a new emergency group
   * 
   * @param body  (required)
   * @return EmergencyGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroup> postArchitectEmergencygroupsWithHttpInfo(EmergencyGroup body) throws IOException {
    return postArchitectEmergencygroups(createPostArchitectEmergencygroupsRequest(body).withHttpInfo());
  }

  private PostArchitectEmergencygroupsRequest createPostArchitectEmergencygroupsRequest(EmergencyGroup body) {
    return PostArchitectEmergencygroupsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates a new emergency group
   * 
   * @param request The request object
   * @return EmergencyGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroup postArchitectEmergencygroups(PostArchitectEmergencygroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmergencyGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmergencyGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new emergency group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroup> postArchitectEmergencygroups(ApiRequest<EmergencyGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmergencyGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a presigned URL for uploading a grammar DTMF mode file
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postArchitectGrammarLanguageFilesDtmf(String grammarId, String languageCode, GrammarFileUploadRequest body) throws IOException, ApiException {
    return  postArchitectGrammarLanguageFilesDtmf(createPostArchitectGrammarLanguageFilesDtmfRequest(grammarId, languageCode, body));
  }

  /**
   * Creates a presigned URL for uploading a grammar DTMF mode file
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postArchitectGrammarLanguageFilesDtmfWithHttpInfo(String grammarId, String languageCode, GrammarFileUploadRequest body) throws IOException {
    return postArchitectGrammarLanguageFilesDtmf(createPostArchitectGrammarLanguageFilesDtmfRequest(grammarId, languageCode, body).withHttpInfo());
  }

  private PostArchitectGrammarLanguageFilesDtmfRequest createPostArchitectGrammarLanguageFilesDtmfRequest(String grammarId, String languageCode, GrammarFileUploadRequest body) {
    return PostArchitectGrammarLanguageFilesDtmfRequest.builder()
            .withGrammarId(grammarId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Creates a presigned URL for uploading a grammar DTMF mode file
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postArchitectGrammarLanguageFilesDtmf(PostArchitectGrammarLanguageFilesDtmfRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a presigned URL for uploading a grammar DTMF mode file
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postArchitectGrammarLanguageFilesDtmf(ApiRequest<GrammarFileUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a presigned URL for uploading a grammar voice mode file
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postArchitectGrammarLanguageFilesVoice(String grammarId, String languageCode, GrammarFileUploadRequest body) throws IOException, ApiException {
    return  postArchitectGrammarLanguageFilesVoice(createPostArchitectGrammarLanguageFilesVoiceRequest(grammarId, languageCode, body));
  }

  /**
   * Creates a presigned URL for uploading a grammar voice mode file
   * 
   * @param grammarId Grammar ID (required)
   * @param languageCode Language (required)
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postArchitectGrammarLanguageFilesVoiceWithHttpInfo(String grammarId, String languageCode, GrammarFileUploadRequest body) throws IOException {
    return postArchitectGrammarLanguageFilesVoice(createPostArchitectGrammarLanguageFilesVoiceRequest(grammarId, languageCode, body).withHttpInfo());
  }

  private PostArchitectGrammarLanguageFilesVoiceRequest createPostArchitectGrammarLanguageFilesVoiceRequest(String grammarId, String languageCode, GrammarFileUploadRequest body) {
    return PostArchitectGrammarLanguageFilesVoiceRequest.builder()
            .withGrammarId(grammarId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Creates a presigned URL for uploading a grammar voice mode file
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postArchitectGrammarLanguageFilesVoice(PostArchitectGrammarLanguageFilesVoiceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a presigned URL for uploading a grammar voice mode file
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postArchitectGrammarLanguageFilesVoice(ApiRequest<GrammarFileUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new language for a given grammar
   * 
   * @param grammarId Grammar ID (required)
   * @param body  (required)
   * @return GrammarLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarLanguage postArchitectGrammarLanguages(String grammarId, GrammarLanguage body) throws IOException, ApiException {
    return  postArchitectGrammarLanguages(createPostArchitectGrammarLanguagesRequest(grammarId, body));
  }

  /**
   * Create a new language for a given grammar
   * 
   * @param grammarId Grammar ID (required)
   * @param body  (required)
   * @return GrammarLanguage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarLanguage> postArchitectGrammarLanguagesWithHttpInfo(String grammarId, GrammarLanguage body) throws IOException {
    return postArchitectGrammarLanguages(createPostArchitectGrammarLanguagesRequest(grammarId, body).withHttpInfo());
  }

  private PostArchitectGrammarLanguagesRequest createPostArchitectGrammarLanguagesRequest(String grammarId, GrammarLanguage body) {
    return PostArchitectGrammarLanguagesRequest.builder()
            .withGrammarId(grammarId)

            .withBody(body)

            .build();
  }

  /**
   * Create a new language for a given grammar
   * 
   * @param request The request object
   * @return GrammarLanguage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GrammarLanguage postArchitectGrammarLanguages(PostArchitectGrammarLanguagesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GrammarLanguage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GrammarLanguage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new language for a given grammar
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GrammarLanguage> postArchitectGrammarLanguages(ApiRequest<GrammarLanguage> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GrammarLanguage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GrammarLanguage> response = (ApiResponse<GrammarLanguage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new grammar
   * 
   * @param body  (required)
   * @return Grammar
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Grammar postArchitectGrammars(Grammar body) throws IOException, ApiException {
    return  postArchitectGrammars(createPostArchitectGrammarsRequest(body));
  }

  /**
   * Create a new grammar
   * 
   * @param body  (required)
   * @return Grammar
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Grammar> postArchitectGrammarsWithHttpInfo(Grammar body) throws IOException {
    return postArchitectGrammars(createPostArchitectGrammarsRequest(body).withHttpInfo());
  }

  private PostArchitectGrammarsRequest createPostArchitectGrammarsRequest(Grammar body) {
    return PostArchitectGrammarsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new grammar
   * 
   * @param request The request object
   * @return Grammar
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Grammar postArchitectGrammars(PostArchitectGrammarsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Grammar> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Grammar>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new grammar
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Grammar> postArchitectGrammars(ApiRequest<Grammar> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Grammar>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Grammar> response = (ApiResponse<Grammar>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create IVR config.
   * 
   * @param body  (required)
   * @return IVR
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVR postArchitectIvrs(IVR body) throws IOException, ApiException {
    return  postArchitectIvrs(createPostArchitectIvrsRequest(body));
  }

  /**
   * Create IVR config.
   * 
   * @param body  (required)
   * @return IVR
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVR> postArchitectIvrsWithHttpInfo(IVR body) throws IOException {
    return postArchitectIvrs(createPostArchitectIvrsRequest(body).withHttpInfo());
  }

  private PostArchitectIvrsRequest createPostArchitectIvrsRequest(IVR body) {
    return PostArchitectIvrsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create IVR config.
   * 
   * @param request The request object
   * @return IVR
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVR postArchitectIvrs(PostArchitectIvrsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IVR> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IVR>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create IVR config.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVR> postArchitectIvrs(ApiRequest<IVR> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IVR>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Generate prompt history
   * Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param promptId Prompt ID (required)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postArchitectPromptHistory(String promptId) throws IOException, ApiException {
    return  postArchitectPromptHistory(createPostArchitectPromptHistoryRequest(promptId));
  }

  /**
   * Generate prompt history
   * Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param promptId Prompt ID (required)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postArchitectPromptHistoryWithHttpInfo(String promptId) throws IOException {
    return postArchitectPromptHistory(createPostArchitectPromptHistoryRequest(promptId).withHttpInfo());
  }

  private PostArchitectPromptHistoryRequest createPostArchitectPromptHistoryRequest(String promptId) {
    return PostArchitectPromptHistoryRequest.builder()
            .withPromptId(promptId)

            .build();
  }

  /**
   * Generate prompt history
   * Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postArchitectPromptHistory(PostArchitectPromptHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate prompt history
   * Asynchronous.  Notification topic: v2.architect.prompts.{promptId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postArchitectPromptHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a presigned URL for uploading a user prompt file
   * 
   * postArchitectPromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAssetUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAssetUpload postArchitectPromptResourceUploads(String promptId, String languageCode) throws IOException, ApiException {
    return  postArchitectPromptResourceUploads(createPostArchitectPromptResourceUploadsRequest(promptId, languageCode));
  }

  /**
   * Creates a presigned URL for uploading a user prompt file
   * 
   * postArchitectPromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAssetUpload
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAssetUpload> postArchitectPromptResourceUploadsWithHttpInfo(String promptId, String languageCode) throws IOException {
    return postArchitectPromptResourceUploads(createPostArchitectPromptResourceUploadsRequest(promptId, languageCode).withHttpInfo());
  }

  private PostArchitectPromptResourceUploadsRequest createPostArchitectPromptResourceUploadsRequest(String promptId, String languageCode) {
    return PostArchitectPromptResourceUploadsRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Creates a presigned URL for uploading a user prompt file
   * 
   * postArchitectPromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return PromptAssetUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAssetUpload postArchitectPromptResourceUploads(PostArchitectPromptResourceUploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PromptAssetUpload> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PromptAssetUpload>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a presigned URL for uploading a user prompt file
   * 
   * postArchitectPromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAssetUpload> postArchitectPromptResourceUploads(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PromptAssetUpload>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param body  (required)
   * @return PromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAsset postArchitectPromptResources(String promptId, PromptAssetCreate body) throws IOException, ApiException {
    return  postArchitectPromptResources(createPostArchitectPromptResourcesRequest(promptId, body));
  }

  /**
   * Create a new user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param body  (required)
   * @return PromptAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAsset> postArchitectPromptResourcesWithHttpInfo(String promptId, PromptAssetCreate body) throws IOException {
    return postArchitectPromptResources(createPostArchitectPromptResourcesRequest(promptId, body).withHttpInfo());
  }

  private PostArchitectPromptResourcesRequest createPostArchitectPromptResourcesRequest(String promptId, PromptAssetCreate body) {
    return PostArchitectPromptResourcesRequest.builder()
            .withPromptId(promptId)

            .withBody(body)

            .build();
  }

  /**
   * Create a new user prompt resource
   * 
   * @param request The request object
   * @return PromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAsset postArchitectPromptResources(PostArchitectPromptResourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PromptAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new user prompt resource
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAsset> postArchitectPromptResources(ApiRequest<PromptAssetCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PromptAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new user prompt
   * 
   * @param body  (required)
   * @return Prompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Prompt postArchitectPrompts(Prompt body) throws IOException, ApiException {
    return  postArchitectPrompts(createPostArchitectPromptsRequest(body));
  }

  /**
   * Create a new user prompt
   * 
   * @param body  (required)
   * @return Prompt
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Prompt> postArchitectPromptsWithHttpInfo(Prompt body) throws IOException {
    return postArchitectPrompts(createPostArchitectPromptsRequest(body).withHttpInfo());
  }

  private PostArchitectPromptsRequest createPostArchitectPromptsRequest(Prompt body) {
    return PostArchitectPromptsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new user prompt
   * 
   * @param request The request object
   * @return Prompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Prompt postArchitectPrompts(PostArchitectPromptsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Prompt> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Prompt>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new user prompt
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Prompt> postArchitectPrompts(ApiRequest<Prompt> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Prompt>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a new schedule group
   * 
   * @param body  (required)
   * @return ScheduleGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroup postArchitectSchedulegroups(ScheduleGroup body) throws IOException, ApiException {
    return  postArchitectSchedulegroups(createPostArchitectSchedulegroupsRequest(body));
  }

  /**
   * Creates a new schedule group
   * 
   * @param body  (required)
   * @return ScheduleGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroup> postArchitectSchedulegroupsWithHttpInfo(ScheduleGroup body) throws IOException {
    return postArchitectSchedulegroups(createPostArchitectSchedulegroupsRequest(body).withHttpInfo());
  }

  private PostArchitectSchedulegroupsRequest createPostArchitectSchedulegroupsRequest(ScheduleGroup body) {
    return PostArchitectSchedulegroupsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Creates a new schedule group
   * 
   * @param request The request object
   * @return ScheduleGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroup postArchitectSchedulegroups(PostArchitectSchedulegroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new schedule group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroup> postArchitectSchedulegroups(ApiRequest<ScheduleGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new schedule.
   * 
   * @param body  (required)
   * @return Schedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Schedule postArchitectSchedules(Schedule body) throws IOException, ApiException {
    return  postArchitectSchedules(createPostArchitectSchedulesRequest(body));
  }

  /**
   * Create a new schedule.
   * 
   * @param body  (required)
   * @return Schedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Schedule> postArchitectSchedulesWithHttpInfo(Schedule body) throws IOException {
    return postArchitectSchedules(createPostArchitectSchedulesRequest(body).withHttpInfo());
  }

  private PostArchitectSchedulesRequest createPostArchitectSchedulesRequest(Schedule body) {
    return PostArchitectSchedulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new schedule.
   * 
   * @param request The request object
   * @return Schedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Schedule postArchitectSchedules(PostArchitectSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Schedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Schedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Schedule> postArchitectSchedules(ApiRequest<Schedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Schedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Generate system prompt history
   * Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}
   * @param promptId promptId (required)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postArchitectSystempromptHistory(String promptId) throws IOException, ApiException {
    return  postArchitectSystempromptHistory(createPostArchitectSystempromptHistoryRequest(promptId));
  }

  /**
   * Generate system prompt history
   * Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}
   * @param promptId promptId (required)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postArchitectSystempromptHistoryWithHttpInfo(String promptId) throws IOException {
    return postArchitectSystempromptHistory(createPostArchitectSystempromptHistoryRequest(promptId).withHttpInfo());
  }

  private PostArchitectSystempromptHistoryRequest createPostArchitectSystempromptHistoryRequest(String promptId) {
    return PostArchitectSystempromptHistoryRequest.builder()
            .withPromptId(promptId)

            .build();
  }

  /**
   * Generate system prompt history
   * Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postArchitectSystempromptHistory(PostArchitectSystempromptHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate system prompt history
   * Asynchronous.  Notification topic: v2.architect.systemprompts.{systemPromptId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postArchitectSystempromptHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a presigned URL for uploading a system prompt file
   * 
   * postArchitectSystempromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAssetUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAssetUpload postArchitectSystempromptResourceUploads(String promptId, String languageCode) throws IOException, ApiException {
    return  postArchitectSystempromptResourceUploads(createPostArchitectSystempromptResourceUploadsRequest(promptId, languageCode));
  }

  /**
   * Creates a presigned URL for uploading a system prompt file
   * 
   * postArchitectSystempromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @return PromptAssetUpload
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAssetUpload> postArchitectSystempromptResourceUploadsWithHttpInfo(String promptId, String languageCode) throws IOException {
    return postArchitectSystempromptResourceUploads(createPostArchitectSystempromptResourceUploadsRequest(promptId, languageCode).withHttpInfo());
  }

  private PostArchitectSystempromptResourceUploadsRequest createPostArchitectSystempromptResourceUploadsRequest(String promptId, String languageCode) {
    return PostArchitectSystempromptResourceUploadsRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .build();
  }

  /**
   * Creates a presigned URL for uploading a system prompt file
   * 
   * postArchitectSystempromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return PromptAssetUpload
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAssetUpload postArchitectSystempromptResourceUploads(PostArchitectSystempromptResourceUploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PromptAssetUpload> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PromptAssetUpload>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a presigned URL for uploading a system prompt file
   * 
   * postArchitectSystempromptResourceUploads is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAssetUpload> postArchitectSystempromptResourceUploads(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PromptAssetUpload>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAssetUpload> response = (ApiResponse<PromptAssetUpload>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param body  (required)
   * @return SystemPromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAsset postArchitectSystempromptResources(String promptId, SystemPromptAsset body) throws IOException, ApiException {
    return  postArchitectSystempromptResources(createPostArchitectSystempromptResourcesRequest(promptId, body));
  }

  /**
   * Create system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param body  (required)
   * @return SystemPromptAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAsset> postArchitectSystempromptResourcesWithHttpInfo(String promptId, SystemPromptAsset body) throws IOException {
    return postArchitectSystempromptResources(createPostArchitectSystempromptResourcesRequest(promptId, body).withHttpInfo());
  }

  private PostArchitectSystempromptResourcesRequest createPostArchitectSystempromptResourcesRequest(String promptId, SystemPromptAsset body) {
    return PostArchitectSystempromptResourcesRequest.builder()
            .withPromptId(promptId)

            .withBody(body)

            .build();
  }

  /**
   * Create system prompt resource override.
   * 
   * @param request The request object
   * @return SystemPromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAsset postArchitectSystempromptResources(PostArchitectSystempromptResourcesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SystemPromptAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create system prompt resource override.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAsset> postArchitectSystempromptResources(ApiRequest<SystemPromptAsset> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SystemPromptAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Generate flow history
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param flowId Flow ID (required)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postFlowHistory(String flowId) throws IOException, ApiException {
    return  postFlowHistory(createPostFlowHistoryRequest(flowId));
  }

  /**
   * Generate flow history
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param flowId Flow ID (required)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postFlowHistoryWithHttpInfo(String flowId) throws IOException {
    return postFlowHistory(createPostFlowHistoryRequest(flowId).withHttpInfo());
  }

  private PostFlowHistoryRequest createPostFlowHistoryRequest(String flowId) {
    return PostFlowHistoryRequest.builder()
            .withFlowId(flowId)

            .build();
  }

  /**
   * Generate flow history
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postFlowHistory(PostFlowHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate flow history
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postFlowHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Set the logLevel for a particular flow id
   * Assigns a new loglevel to a flow id
   * @param flowId The flow id to set the loglevel for (required)
   * @param body New LogLevel settings (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse postFlowInstancesSettingsLoglevels(String flowId, FlowLogLevelRequest body, List<String> expand) throws IOException, ApiException {
    return  postFlowInstancesSettingsLoglevels(createPostFlowInstancesSettingsLoglevelsRequest(flowId, body, expand));
  }

  /**
   * Set the logLevel for a particular flow id
   * Assigns a new loglevel to a flow id
   * @param flowId The flow id to set the loglevel for (required)
   * @param body New LogLevel settings (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> postFlowInstancesSettingsLoglevelsWithHttpInfo(String flowId, FlowLogLevelRequest body, List<String> expand) throws IOException {
    return postFlowInstancesSettingsLoglevels(createPostFlowInstancesSettingsLoglevelsRequest(flowId, body, expand).withHttpInfo());
  }

  private PostFlowInstancesSettingsLoglevelsRequest createPostFlowInstancesSettingsLoglevelsRequest(String flowId, FlowLogLevelRequest body, List<String> expand) {
    return PostFlowInstancesSettingsLoglevelsRequest.builder()
            .withFlowId(flowId)

            .withBody(body)

            .withExpand(expand)

            .build();
  }

  /**
   * Set the logLevel for a particular flow id
   * Assigns a new loglevel to a flow id
   * @param request The request object
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse postFlowInstancesSettingsLoglevels(PostFlowInstancesSettingsLoglevelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Set the logLevel for a particular flow id
   * Assigns a new loglevel to a flow id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> postFlowInstancesSettingsLoglevels(ApiRequest<FlowLogLevelRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create flow version
   * 
   * @param flowId Flow ID (required)
   * @param body  (required)
   * @return FlowVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowVersion postFlowVersions(String flowId, Object body) throws IOException, ApiException {
    return  postFlowVersions(createPostFlowVersionsRequest(flowId, body));
  }

  /**
   * Create flow version
   * 
   * @param flowId Flow ID (required)
   * @param body  (required)
   * @return FlowVersion
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowVersion> postFlowVersionsWithHttpInfo(String flowId, Object body) throws IOException {
    return postFlowVersions(createPostFlowVersionsRequest(flowId, body).withHttpInfo());
  }

  private PostFlowVersionsRequest createPostFlowVersionsRequest(String flowId, Object body) {
    return PostFlowVersionsRequest.builder()
            .withFlowId(flowId)

            .withBody(body)

            .build();
  }

  /**
   * Create flow version
   * 
   * @param request The request object
   * @return FlowVersion
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowVersion postFlowVersions(PostFlowVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowVersion> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowVersion>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create flow version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowVersion> postFlowVersions(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowVersion>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create flow
   * 
   * @param body  (required)
   * @param language Language (optional)
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlows(Flow body, String language) throws IOException, ApiException {
    return  postFlows(createPostFlowsRequest(body, language));
  }

  /**
   * Create flow
   * 
   * @param body  (required)
   * @param language Language (optional)
   * @return Flow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsWithHttpInfo(Flow body, String language) throws IOException {
    return postFlows(createPostFlowsRequest(body, language).withHttpInfo());
  }

  private PostFlowsRequest createPostFlowsRequest(Flow body, String language) {
    return PostFlowsRequest.builder()
            .withBody(body)

            .withLanguage(language)

            .build();
  }

  /**
   * Create flow
   * 
   * @param request The request object
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlows(PostFlowsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Flow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Flow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlows(ApiRequest<Flow> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Flow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Check-in flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param flow Flow ID (required)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postFlowsActionsCheckin(String flow) throws IOException, ApiException {
    return  postFlowsActionsCheckin(createPostFlowsActionsCheckinRequest(flow));
  }

  /**
   * Check-in flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param flow Flow ID (required)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postFlowsActionsCheckinWithHttpInfo(String flow) throws IOException {
    return postFlowsActionsCheckin(createPostFlowsActionsCheckinRequest(flow).withHttpInfo());
  }

  private PostFlowsActionsCheckinRequest createPostFlowsActionsCheckinRequest(String flow) {
    return PostFlowsActionsCheckinRequest.builder()
            .withFlow(flow)

            .build();
  }

  /**
   * Check-in flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postFlowsActionsCheckin(PostFlowsActionsCheckinRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Check-in flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postFlowsActionsCheckin(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Check-out flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsCheckout(String flow) throws IOException, ApiException {
    return  postFlowsActionsCheckout(createPostFlowsActionsCheckoutRequest(flow));
  }

  /**
   * Check-out flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsCheckoutWithHttpInfo(String flow) throws IOException {
    return postFlowsActionsCheckout(createPostFlowsActionsCheckoutRequest(flow).withHttpInfo());
  }

  private PostFlowsActionsCheckoutRequest createPostFlowsActionsCheckoutRequest(String flow) {
    return PostFlowsActionsCheckoutRequest.builder()
            .withFlow(flow)

            .build();
  }

  /**
   * Check-out flow
   * 
   * @param request The request object
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsCheckout(PostFlowsActionsCheckoutRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Flow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Flow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Check-out flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsCheckout(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Flow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Deactivate flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsDeactivate(String flow) throws IOException, ApiException {
    return  postFlowsActionsDeactivate(createPostFlowsActionsDeactivateRequest(flow));
  }

  /**
   * Deactivate flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsDeactivateWithHttpInfo(String flow) throws IOException {
    return postFlowsActionsDeactivate(createPostFlowsActionsDeactivateRequest(flow).withHttpInfo());
  }

  private PostFlowsActionsDeactivateRequest createPostFlowsActionsDeactivateRequest(String flow) {
    return PostFlowsActionsDeactivateRequest.builder()
            .withFlow(flow)

            .build();
  }

  /**
   * Deactivate flow
   * 
   * @param request The request object
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsDeactivate(PostFlowsActionsDeactivateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Flow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Flow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Deactivate flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsDeactivate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Flow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param flow Flow ID (required)
   * @param version version (optional)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postFlowsActionsPublish(String flow, String version) throws IOException, ApiException {
    return  postFlowsActionsPublish(createPostFlowsActionsPublishRequest(flow, version));
  }

  /**
   * Publish flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param flow Flow ID (required)
   * @param version version (optional)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postFlowsActionsPublishWithHttpInfo(String flow, String version) throws IOException {
    return postFlowsActionsPublish(createPostFlowsActionsPublishRequest(flow, version).withHttpInfo());
  }

  private PostFlowsActionsPublishRequest createPostFlowsActionsPublishRequest(String flow, String version) {
    return PostFlowsActionsPublishRequest.builder()
            .withFlow(flow)

            .withVersion(version)

            .build();
  }

  /**
   * Publish flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation postFlowsActionsPublish(PostFlowsActionsPublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish flow
   * Asynchronous.  Notification topic: v2.flows.{flowId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> postFlowsActionsPublish(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Revert flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsRevert(String flow) throws IOException, ApiException {
    return  postFlowsActionsRevert(createPostFlowsActionsRevertRequest(flow));
  }

  /**
   * Revert flow
   * 
   * @param flow Flow ID (required)
   * @return Flow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsRevertWithHttpInfo(String flow) throws IOException {
    return postFlowsActionsRevert(createPostFlowsActionsRevertRequest(flow).withHttpInfo());
  }

  private PostFlowsActionsRevertRequest createPostFlowsActionsRevertRequest(String flow) {
    return PostFlowsActionsRevertRequest.builder()
            .withFlow(flow)

            .build();
  }

  /**
   * Revert flow
   * 
   * @param request The request object
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsRevert(PostFlowsActionsRevertRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Flow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Flow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Revert flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsRevert(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Flow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param flow Flow ID (required)
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsUnlock(String flow) throws IOException, ApiException {
    return  postFlowsActionsUnlock(createPostFlowsActionsUnlockRequest(flow));
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param flow Flow ID (required)
   * @return Flow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsUnlockWithHttpInfo(String flow) throws IOException {
    return postFlowsActionsUnlock(createPostFlowsActionsUnlockRequest(flow).withHttpInfo());
  }

  private PostFlowsActionsUnlockRequest createPostFlowsActionsUnlockRequest(String flow) {
    return PostFlowsActionsUnlockRequest.builder()
            .withFlow(flow)

            .build();
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param request The request object
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow postFlowsActionsUnlock(PostFlowsActionsUnlockRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Flow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Flow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> postFlowsActionsUnlock(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Flow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Begin an export process for exporting all rows from a datatable
   * Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response
   * @param datatableId id of datatable (required)
   * @return DataTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableExportJob postFlowsDatatableExportJobs(String datatableId) throws IOException, ApiException {
    return  postFlowsDatatableExportJobs(createPostFlowsDatatableExportJobsRequest(datatableId));
  }

  /**
   * Begin an export process for exporting all rows from a datatable
   * Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response
   * @param datatableId id of datatable (required)
   * @return DataTableExportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableExportJob> postFlowsDatatableExportJobsWithHttpInfo(String datatableId) throws IOException {
    return postFlowsDatatableExportJobs(createPostFlowsDatatableExportJobsRequest(datatableId).withHttpInfo());
  }

  private PostFlowsDatatableExportJobsRequest createPostFlowsDatatableExportJobsRequest(String datatableId) {
    return PostFlowsDatatableExportJobsRequest.builder()
            .withDatatableId(datatableId)

            .build();
  }

  /**
   * Begin an export process for exporting all rows from a datatable
   * Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response
   * @param request The request object
   * @return DataTableExportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableExportJob postFlowsDatatableExportJobs(PostFlowsDatatableExportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTableExportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTableExportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Begin an export process for exporting all rows from a datatable
   * Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableExportJob> postFlowsDatatableExportJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTableExportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableExportJob> response = (ApiResponse<DataTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Begin an import process for importing rows into a datatable
   * Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response
   * @param datatableId id of datatable (required)
   * @param body import job information (required)
   * @return DataTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableImportJob postFlowsDatatableImportJobs(String datatableId, DataTableImportJob body) throws IOException, ApiException {
    return  postFlowsDatatableImportJobs(createPostFlowsDatatableImportJobsRequest(datatableId, body));
  }

  /**
   * Begin an import process for importing rows into a datatable
   * Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response
   * @param datatableId id of datatable (required)
   * @param body import job information (required)
   * @return DataTableImportJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableImportJob> postFlowsDatatableImportJobsWithHttpInfo(String datatableId, DataTableImportJob body) throws IOException {
    return postFlowsDatatableImportJobs(createPostFlowsDatatableImportJobsRequest(datatableId, body).withHttpInfo());
  }

  private PostFlowsDatatableImportJobsRequest createPostFlowsDatatableImportJobsRequest(String datatableId, DataTableImportJob body) {
    return PostFlowsDatatableImportJobsRequest.builder()
            .withDatatableId(datatableId)

            .withBody(body)

            .build();
  }

  /**
   * Begin an import process for importing rows into a datatable
   * Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response
   * @param request The request object
   * @return DataTableImportJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTableImportJob postFlowsDatatableImportJobs(PostFlowsDatatableImportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTableImportJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTableImportJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Begin an import process for importing rows into a datatable
   * Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTableImportJob> postFlowsDatatableImportJobs(ApiRequest<DataTableImportJob> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTableImportJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTableImportJob> response = (ApiResponse<DataTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new row entry for the datatable.
   * Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {      \"Field1\": \"XYZZY\",      \"Field2\": false,      \"KEY\": \"27272\"  }
   * @param datatableId id of datatable (required)
   * @param dataTableRow  (required)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> postFlowsDatatableRows(String datatableId, Object dataTableRow) throws IOException, ApiException {
    return  postFlowsDatatableRows(createPostFlowsDatatableRowsRequest(datatableId, dataTableRow));
  }

  /**
   * Create a new row entry for the datatable.
   * Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {      \"Field1\": \"XYZZY\",      \"Field2\": false,      \"KEY\": \"27272\"  }
   * @param datatableId id of datatable (required)
   * @param dataTableRow  (required)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> postFlowsDatatableRowsWithHttpInfo(String datatableId, Object dataTableRow) throws IOException {
    return postFlowsDatatableRows(createPostFlowsDatatableRowsRequest(datatableId, dataTableRow).withHttpInfo());
  }

  private PostFlowsDatatableRowsRequest createPostFlowsDatatableRowsRequest(String datatableId, Object dataTableRow) {
    return PostFlowsDatatableRowsRequest.builder()
            .withDatatableId(datatableId)

            .withDataTableRow(dataTableRow)

            .build();
  }

  /**
   * Create a new row entry for the datatable.
   * Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {      \"Field1\": \"XYZZY\",      \"Field2\": false,      \"KEY\": \"27272\"  }
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> postFlowsDatatableRows(PostFlowsDatatableRowsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Map<String, Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new row entry for the datatable.
   * Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {      \"Field1\": \"XYZZY\",      \"Field2\": false,      \"KEY\": \"27272\"  }
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> postFlowsDatatableRows(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Map<String, Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new datatable with the specified json-schema definition
   * This will create a new datatable with fields that match the property definitions in the JSON schema.  The schema's title field will be overridden by the name field in the DataTable object.  See also http://json-schema.org/
   * @param body datatable json-schema (required)
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable postFlowsDatatables(DataTable body) throws IOException, ApiException {
    return  postFlowsDatatables(createPostFlowsDatatablesRequest(body));
  }

  /**
   * Create a new datatable with the specified json-schema definition
   * This will create a new datatable with fields that match the property definitions in the JSON schema.  The schema's title field will be overridden by the name field in the DataTable object.  See also http://json-schema.org/
   * @param body datatable json-schema (required)
   * @return DataTable
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> postFlowsDatatablesWithHttpInfo(DataTable body) throws IOException {
    return postFlowsDatatables(createPostFlowsDatatablesRequest(body).withHttpInfo());
  }

  private PostFlowsDatatablesRequest createPostFlowsDatatablesRequest(DataTable body) {
    return PostFlowsDatatablesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new datatable with the specified json-schema definition
   * This will create a new datatable with fields that match the property definitions in the JSON schema.  The schema's title field will be overridden by the name field in the DataTable object.  See also http://json-schema.org/
   * @param request The request object
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable postFlowsDatatables(PostFlowsDatatablesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTable> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTable>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new datatable with the specified json-schema definition
   * This will create a new datatable with fields that match the property definitions in the JSON schema.  The schema's title field will be overridden by the name field in the DataTable object.  See also http://json-schema.org/
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> postFlowsDatatables(ApiRequest<DataTable> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTable>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type.
   * The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.
   * @param flowLaunchRequest  (required)
   * @return FlowExecutionLaunchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowExecutionLaunchResponse postFlowsExecutions(FlowExecutionLaunchRequest flowLaunchRequest) throws IOException, ApiException {
    return  postFlowsExecutions(createPostFlowsExecutionsRequest(flowLaunchRequest));
  }

  /**
   * Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type.
   * The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.
   * @param flowLaunchRequest  (required)
   * @return FlowExecutionLaunchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowExecutionLaunchResponse> postFlowsExecutionsWithHttpInfo(FlowExecutionLaunchRequest flowLaunchRequest) throws IOException {
    return postFlowsExecutions(createPostFlowsExecutionsRequest(flowLaunchRequest).withHttpInfo());
  }

  private PostFlowsExecutionsRequest createPostFlowsExecutionsRequest(FlowExecutionLaunchRequest flowLaunchRequest) {
    return PostFlowsExecutionsRequest.builder()
            .withFlowLaunchRequest(flowLaunchRequest)

            .build();
  }

  /**
   * Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type.
   * The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.
   * @param request The request object
   * @return FlowExecutionLaunchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowExecutionLaunchResponse postFlowsExecutions(PostFlowsExecutionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowExecutionLaunchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowExecutionLaunchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Launch an instance of a flow definition, for flow types that support it such as the 'workflow' type.
   * The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowExecutionLaunchResponse> postFlowsExecutions(ApiRequest<FlowExecutionLaunchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowExecutionLaunchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowExecutionLaunchResponse> response = (ApiResponse<FlowExecutionLaunchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowExecutionLaunchResponse> response = (ApiResponse<FlowExecutionLaunchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Register Architect Export Job
   * 
   * @param body  (required)
   * @return RegisterArchitectExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RegisterArchitectExportJobResponse postFlowsExportJobs(RegisterArchitectExportJob body) throws IOException, ApiException {
    return  postFlowsExportJobs(createPostFlowsExportJobsRequest(body));
  }

  /**
   * Register Architect Export Job
   * 
   * @param body  (required)
   * @return RegisterArchitectExportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RegisterArchitectExportJobResponse> postFlowsExportJobsWithHttpInfo(RegisterArchitectExportJob body) throws IOException {
    return postFlowsExportJobs(createPostFlowsExportJobsRequest(body).withHttpInfo());
  }

  private PostFlowsExportJobsRequest createPostFlowsExportJobsRequest(RegisterArchitectExportJob body) {
    return PostFlowsExportJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Register Architect Export Job
   * 
   * @param request The request object
   * @return RegisterArchitectExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RegisterArchitectExportJobResponse postFlowsExportJobs(PostFlowsExportJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RegisterArchitectExportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RegisterArchitectExportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Register Architect Export Job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RegisterArchitectExportJobResponse> postFlowsExportJobs(ApiRequest<RegisterArchitectExportJob> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RegisterArchitectExportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RegisterArchitectExportJobResponse> response = (ApiResponse<RegisterArchitectExportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RegisterArchitectExportJobResponse> response = (ApiResponse<RegisterArchitectExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Start a process (job) that will prepare a list of execution data IDs for download.
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param body Requested Flow Ids (required)
   * @param expand Expand various query types. (optional)
   * @return GetFlowExecutionDataJobResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetFlowExecutionDataJobResult postFlowsInstancesJobs(ExecutionDataRequest body, String expand) throws IOException, ApiException {
    return  postFlowsInstancesJobs(createPostFlowsInstancesJobsRequest(body, expand));
  }

  /**
   * Start a process (job) that will prepare a list of execution data IDs for download.
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param body Requested Flow Ids (required)
   * @param expand Expand various query types. (optional)
   * @return GetFlowExecutionDataJobResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetFlowExecutionDataJobResult> postFlowsInstancesJobsWithHttpInfo(ExecutionDataRequest body, String expand) throws IOException {
    return postFlowsInstancesJobs(createPostFlowsInstancesJobsRequest(body, expand).withHttpInfo());
  }

  private PostFlowsInstancesJobsRequest createPostFlowsInstancesJobsRequest(ExecutionDataRequest body, String expand) {
    return PostFlowsInstancesJobsRequest.builder()
            .withBody(body)

            .withExpand(expand)

            .build();
  }

  /**
   * Start a process (job) that will prepare a list of execution data IDs for download.
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request The request object
   * @return GetFlowExecutionDataJobResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GetFlowExecutionDataJobResult postFlowsInstancesJobs(PostFlowsInstancesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GetFlowExecutionDataJobResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GetFlowExecutionDataJobResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start a process (job) that will prepare a list of execution data IDs for download.
   * Returns a JobResult object that contains an ID that can be used to check status and/or download links when the process (job) is complete.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GetFlowExecutionDataJobResult> postFlowsInstancesJobs(ApiRequest<ExecutionDataRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GetFlowExecutionDataJobResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GetFlowExecutionDataJobResult> response = (ApiResponse<GetFlowExecutionDataJobResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the database of existing flow histories to look for particular flow criteria
   * Returns a list of matching flow histories up to 200 max.
   * @param body query (required)
   * @param indexOnly indexes only (optional)
   * @param pageSize number of results to return (optional, default to 50)
   * @return FlowResultEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowResultEntityListing postFlowsInstancesQuery(CriteriaQuery body, Boolean indexOnly, Integer pageSize) throws IOException, ApiException {
    return  postFlowsInstancesQuery(createPostFlowsInstancesQueryRequest(body, indexOnly, pageSize));
  }

  /**
   * Query the database of existing flow histories to look for particular flow criteria
   * Returns a list of matching flow histories up to 200 max.
   * @param body query (required)
   * @param indexOnly indexes only (optional)
   * @param pageSize number of results to return (optional, default to 50)
   * @return FlowResultEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowResultEntityListing> postFlowsInstancesQueryWithHttpInfo(CriteriaQuery body, Boolean indexOnly, Integer pageSize) throws IOException {
    return postFlowsInstancesQuery(createPostFlowsInstancesQueryRequest(body, indexOnly, pageSize).withHttpInfo());
  }

  private PostFlowsInstancesQueryRequest createPostFlowsInstancesQueryRequest(CriteriaQuery body, Boolean indexOnly, Integer pageSize) {
    return PostFlowsInstancesQueryRequest.builder()
            .withBody(body)

            .withIndexOnly(indexOnly)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Query the database of existing flow histories to look for particular flow criteria
   * Returns a list of matching flow histories up to 200 max.
   * @param request The request object
   * @return FlowResultEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowResultEntityListing postFlowsInstancesQuery(PostFlowsInstancesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowResultEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowResultEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the database of existing flow histories to look for particular flow criteria
   * Returns a list of matching flow histories up to 200 max.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowResultEntityListing> postFlowsInstancesQuery(ApiRequest<CriteriaQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowResultEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowResultEntityListing> response = (ApiResponse<FlowResultEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowResultEntityListing> response = (ApiResponse<FlowResultEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job.
   * 
   * @return RegisterArchitectJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RegisterArchitectJobResponse postFlowsJobs() throws IOException, ApiException {
    return  postFlowsJobs(createPostFlowsJobsRequest());
  }

  /**
   * Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job.
   * 
   * @return RegisterArchitectJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RegisterArchitectJobResponse> postFlowsJobsWithHttpInfo() throws IOException {
    return postFlowsJobs(createPostFlowsJobsRequest().withHttpInfo());
  }

  private PostFlowsJobsRequest createPostFlowsJobsRequest() {
    return PostFlowsJobsRequest.builder()
            .build();
  }

  /**
   * Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job.
   * 
   * @param request The request object
   * @return RegisterArchitectJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RegisterArchitectJobResponse postFlowsJobs(PostFlowsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RegisterArchitectJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RegisterArchitectJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Register Architect Job. Returns a URL where a file, such as an Architect flow YAML file, can be PUT which will then initiate the job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RegisterArchitectJobResponse> postFlowsJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RegisterArchitectJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RegisterArchitectJobResponse> response = (ApiResponse<RegisterArchitectJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RegisterArchitectJobResponse> response = (ApiResponse<RegisterArchitectJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a flow milestone
   * 
   * @param body  (optional)
   * @return FlowMilestone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestone postFlowsMilestones(FlowMilestone body) throws IOException, ApiException {
    return  postFlowsMilestones(createPostFlowsMilestonesRequest(body));
  }

  /**
   * Create a flow milestone
   * 
   * @param body  (optional)
   * @return FlowMilestone
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestone> postFlowsMilestonesWithHttpInfo(FlowMilestone body) throws IOException {
    return postFlowsMilestones(createPostFlowsMilestonesRequest(body).withHttpInfo());
  }

  private PostFlowsMilestonesRequest createPostFlowsMilestonesRequest(FlowMilestone body) {
    return PostFlowsMilestonesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a flow milestone
   * 
   * @param request The request object
   * @return FlowMilestone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestone postFlowsMilestones(PostFlowsMilestonesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowMilestone> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowMilestone>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a flow milestone
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestone> postFlowsMilestones(ApiRequest<FlowMilestone> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowMilestone>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a flow outcome
   * Asynchronous.  Notification topic: v2.flows.outcomes.{flowOutcomeId}
   * @param body  (optional)
   * @return FlowOutcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcome postFlowsOutcomes(FlowOutcome body) throws IOException, ApiException {
    return  postFlowsOutcomes(createPostFlowsOutcomesRequest(body));
  }

  /**
   * Create a flow outcome
   * Asynchronous.  Notification topic: v2.flows.outcomes.{flowOutcomeId}
   * @param body  (optional)
   * @return FlowOutcome
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcome> postFlowsOutcomesWithHttpInfo(FlowOutcome body) throws IOException {
    return postFlowsOutcomes(createPostFlowsOutcomesRequest(body).withHttpInfo());
  }

  private PostFlowsOutcomesRequest createPostFlowsOutcomesRequest(FlowOutcome body) {
    return PostFlowsOutcomesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a flow outcome
   * Asynchronous.  Notification topic: v2.flows.outcomes.{flowOutcomeId}
   * @param request The request object
   * @return FlowOutcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowOutcome postFlowsOutcomes(PostFlowsOutcomesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowOutcome> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowOutcome>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a flow outcome
   * Asynchronous.  Notification topic: v2.flows.outcomes.{flowOutcomeId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowOutcome> postFlowsOutcomes(ApiRequest<FlowOutcome> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowOutcome>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowOutcome> response = (ApiResponse<FlowOutcome>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a emergency group by ID
   * 
   * @param emergencyGroupId Emergency group ID (required)
   * @param body  (required)
   * @return EmergencyGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroup putArchitectEmergencygroup(String emergencyGroupId, EmergencyGroup body) throws IOException, ApiException {
    return  putArchitectEmergencygroup(createPutArchitectEmergencygroupRequest(emergencyGroupId, body));
  }

  /**
   * Updates a emergency group by ID
   * 
   * @param emergencyGroupId Emergency group ID (required)
   * @param body  (required)
   * @return EmergencyGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroup> putArchitectEmergencygroupWithHttpInfo(String emergencyGroupId, EmergencyGroup body) throws IOException {
    return putArchitectEmergencygroup(createPutArchitectEmergencygroupRequest(emergencyGroupId, body).withHttpInfo());
  }

  private PutArchitectEmergencygroupRequest createPutArchitectEmergencygroupRequest(String emergencyGroupId, EmergencyGroup body) {
    return PutArchitectEmergencygroupRequest.builder()
            .withEmergencyGroupId(emergencyGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Updates a emergency group by ID
   * 
   * @param request The request object
   * @return EmergencyGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EmergencyGroup putArchitectEmergencygroup(PutArchitectEmergencygroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EmergencyGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EmergencyGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a emergency group by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EmergencyGroup> putArchitectEmergencygroup(ApiRequest<EmergencyGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EmergencyGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EmergencyGroup> response = (ApiResponse<EmergencyGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an IVR Config.
   * 
   * @param ivrId IVR id (required)
   * @param body  (required)
   * @return IVR
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVR putArchitectIvr(String ivrId, IVR body) throws IOException, ApiException {
    return  putArchitectIvr(createPutArchitectIvrRequest(ivrId, body));
  }

  /**
   * Update an IVR Config.
   * 
   * @param ivrId IVR id (required)
   * @param body  (required)
   * @return IVR
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVR> putArchitectIvrWithHttpInfo(String ivrId, IVR body) throws IOException {
    return putArchitectIvr(createPutArchitectIvrRequest(ivrId, body).withHttpInfo());
  }

  private PutArchitectIvrRequest createPutArchitectIvrRequest(String ivrId, IVR body) {
    return PutArchitectIvrRequest.builder()
            .withIvrId(ivrId)

            .withBody(body)

            .build();
  }

  /**
   * Update an IVR Config.
   * 
   * @param request The request object
   * @return IVR
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IVR putArchitectIvr(PutArchitectIvrRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IVR> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IVR>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an IVR Config.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IVR> putArchitectIvr(ApiRequest<IVR> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IVR>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IVR> response = (ApiResponse<IVR>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an IVR IdentityResolutionConfig.
   * 
   * @param ivrId IVR id (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putArchitectIvrIdentityresolution(String ivrId, IdentityResolutionConfig body) throws IOException, ApiException {
    return  putArchitectIvrIdentityresolution(createPutArchitectIvrIdentityresolutionRequest(ivrId, body));
  }

  /**
   * Update an IVR IdentityResolutionConfig.
   * 
   * @param ivrId IVR id (required)
   * @param body  (required)
   * @return IdentityResolutionConfig
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putArchitectIvrIdentityresolutionWithHttpInfo(String ivrId, IdentityResolutionConfig body) throws IOException {
    return putArchitectIvrIdentityresolution(createPutArchitectIvrIdentityresolutionRequest(ivrId, body).withHttpInfo());
  }

  private PutArchitectIvrIdentityresolutionRequest createPutArchitectIvrIdentityresolutionRequest(String ivrId, IdentityResolutionConfig body) {
    return PutArchitectIvrIdentityresolutionRequest.builder()
            .withIvrId(ivrId)

            .withBody(body)

            .build();
  }

  /**
   * Update an IVR IdentityResolutionConfig.
   * 
   * @param request The request object
   * @return IdentityResolutionConfig
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IdentityResolutionConfig putArchitectIvrIdentityresolution(PutArchitectIvrIdentityresolutionRequest request) throws IOException, ApiException {
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
   * Update an IVR IdentityResolutionConfig.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IdentityResolutionConfig> putArchitectIvrIdentityresolution(ApiRequest<IdentityResolutionConfig> request) throws IOException {
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
   * Update specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param body  (required)
   * @return Prompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Prompt putArchitectPrompt(String promptId, Prompt body) throws IOException, ApiException {
    return  putArchitectPrompt(createPutArchitectPromptRequest(promptId, body));
  }

  /**
   * Update specified user prompt
   * 
   * @param promptId Prompt ID (required)
   * @param body  (required)
   * @return Prompt
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Prompt> putArchitectPromptWithHttpInfo(String promptId, Prompt body) throws IOException {
    return putArchitectPrompt(createPutArchitectPromptRequest(promptId, body).withHttpInfo());
  }

  private PutArchitectPromptRequest createPutArchitectPromptRequest(String promptId, Prompt body) {
    return PutArchitectPromptRequest.builder()
            .withPromptId(promptId)

            .withBody(body)

            .build();
  }

  /**
   * Update specified user prompt
   * 
   * @param request The request object
   * @return Prompt
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Prompt putArchitectPrompt(PutArchitectPromptRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Prompt> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Prompt>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update specified user prompt
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Prompt> putArchitectPrompt(ApiRequest<Prompt> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Prompt>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (required)
   * @return PromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAsset putArchitectPromptResource(String promptId, String languageCode, PromptAsset body) throws IOException, ApiException {
    return  putArchitectPromptResource(createPutArchitectPromptResourceRequest(promptId, languageCode, body));
  }

  /**
   * Update specified user prompt resource
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (required)
   * @return PromptAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAsset> putArchitectPromptResourceWithHttpInfo(String promptId, String languageCode, PromptAsset body) throws IOException {
    return putArchitectPromptResource(createPutArchitectPromptResourceRequest(promptId, languageCode, body).withHttpInfo());
  }

  private PutArchitectPromptResourceRequest createPutArchitectPromptResourceRequest(String promptId, String languageCode, PromptAsset body) {
    return PutArchitectPromptResourceRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Update specified user prompt resource
   * 
   * @param request The request object
   * @return PromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PromptAsset putArchitectPromptResource(PutArchitectPromptResourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PromptAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PromptAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update specified user prompt resource
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PromptAsset> putArchitectPromptResource(ApiRequest<PromptAsset> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PromptAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update schedule by ID
   * 
   * @param scheduleId Schedule ID (required)
   * @param body  (required)
   * @return Schedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Schedule putArchitectSchedule(String scheduleId, Schedule body) throws IOException, ApiException {
    return  putArchitectSchedule(createPutArchitectScheduleRequest(scheduleId, body));
  }

  /**
   * Update schedule by ID
   * 
   * @param scheduleId Schedule ID (required)
   * @param body  (required)
   * @return Schedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Schedule> putArchitectScheduleWithHttpInfo(String scheduleId, Schedule body) throws IOException {
    return putArchitectSchedule(createPutArchitectScheduleRequest(scheduleId, body).withHttpInfo());
  }

  private PutArchitectScheduleRequest createPutArchitectScheduleRequest(String scheduleId, Schedule body) {
    return PutArchitectScheduleRequest.builder()
            .withScheduleId(scheduleId)

            .withBody(body)

            .build();
  }

  /**
   * Update schedule by ID
   * 
   * @param request The request object
   * @return Schedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Schedule putArchitectSchedule(PutArchitectScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Schedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Schedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update schedule by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Schedule> putArchitectSchedule(ApiRequest<Schedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Schedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Schedule> response = (ApiResponse<Schedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a schedule group by ID
   * 
   * @param scheduleGroupId Schedule group ID (required)
   * @param body  (required)
   * @return ScheduleGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroup putArchitectSchedulegroup(String scheduleGroupId, ScheduleGroup body) throws IOException, ApiException {
    return  putArchitectSchedulegroup(createPutArchitectSchedulegroupRequest(scheduleGroupId, body));
  }

  /**
   * Updates a schedule group by ID
   * 
   * @param scheduleGroupId Schedule group ID (required)
   * @param body  (required)
   * @return ScheduleGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroup> putArchitectSchedulegroupWithHttpInfo(String scheduleGroupId, ScheduleGroup body) throws IOException {
    return putArchitectSchedulegroup(createPutArchitectSchedulegroupRequest(scheduleGroupId, body).withHttpInfo());
  }

  private PutArchitectSchedulegroupRequest createPutArchitectSchedulegroupRequest(String scheduleGroupId, ScheduleGroup body) {
    return PutArchitectSchedulegroupRequest.builder()
            .withScheduleGroupId(scheduleGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Updates a schedule group by ID
   * 
   * @param request The request object
   * @return ScheduleGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGroup putArchitectSchedulegroup(PutArchitectSchedulegroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a schedule group by ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGroup> putArchitectSchedulegroup(ApiRequest<ScheduleGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGroup> response = (ApiResponse<ScheduleGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (required)
   * @return SystemPromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAsset putArchitectSystempromptResource(String promptId, String languageCode, SystemPromptAsset body) throws IOException, ApiException {
    return  putArchitectSystempromptResource(createPutArchitectSystempromptResourceRequest(promptId, languageCode, body));
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param promptId Prompt ID (required)
   * @param languageCode Language (required)
   * @param body  (required)
   * @return SystemPromptAsset
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAsset> putArchitectSystempromptResourceWithHttpInfo(String promptId, String languageCode, SystemPromptAsset body) throws IOException {
    return putArchitectSystempromptResource(createPutArchitectSystempromptResourceRequest(promptId, languageCode, body).withHttpInfo());
  }

  private PutArchitectSystempromptResourceRequest createPutArchitectSystempromptResourceRequest(String promptId, String languageCode, SystemPromptAsset body) {
    return PutArchitectSystempromptResourceRequest.builder()
            .withPromptId(promptId)

            .withLanguageCode(languageCode)

            .withBody(body)

            .build();
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param request The request object
   * @return SystemPromptAsset
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SystemPromptAsset putArchitectSystempromptResource(PutArchitectSystempromptResourceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SystemPromptAsset> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SystemPromptAsset> putArchitectSystempromptResource(ApiRequest<SystemPromptAsset> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SystemPromptAsset>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update flow
   * 
   * @param flowId Flow ID (required)
   * @param body  (required)
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow putFlow(String flowId, Flow body) throws IOException, ApiException {
    return  putFlow(createPutFlowRequest(flowId, body));
  }

  /**
   * Update flow
   * 
   * @param flowId Flow ID (required)
   * @param body  (required)
   * @return Flow
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> putFlowWithHttpInfo(String flowId, Flow body) throws IOException {
    return putFlow(createPutFlowRequest(flowId, body).withHttpInfo());
  }

  private PutFlowRequest createPutFlowRequest(String flowId, Flow body) {
    return PutFlowRequest.builder()
            .withFlowId(flowId)

            .withBody(body)

            .build();
  }

  /**
   * Update flow
   * 
   * @param request The request object
   * @return Flow
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Flow putFlow(PutFlowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Flow> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Flow>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update flow
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Flow> putFlow(ApiRequest<Flow> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Flow>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Edit the logLevel for a particular flow id
   * Updates the loglevel for a flow id
   * @param flowId The flow id to edit the loglevel for (required)
   * @param body New LogLevel settings (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse putFlowInstancesSettingsLoglevels(String flowId, FlowLogLevelRequest body, List<String> expand) throws IOException, ApiException {
    return  putFlowInstancesSettingsLoglevels(createPutFlowInstancesSettingsLoglevelsRequest(flowId, body, expand));
  }

  /**
   * Edit the logLevel for a particular flow id
   * Updates the loglevel for a flow id
   * @param flowId The flow id to edit the loglevel for (required)
   * @param body New LogLevel settings (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> putFlowInstancesSettingsLoglevelsWithHttpInfo(String flowId, FlowLogLevelRequest body, List<String> expand) throws IOException {
    return putFlowInstancesSettingsLoglevels(createPutFlowInstancesSettingsLoglevelsRequest(flowId, body, expand).withHttpInfo());
  }

  private PutFlowInstancesSettingsLoglevelsRequest createPutFlowInstancesSettingsLoglevelsRequest(String flowId, FlowLogLevelRequest body, List<String> expand) {
    return PutFlowInstancesSettingsLoglevelsRequest.builder()
            .withFlowId(flowId)

            .withBody(body)

            .withExpand(expand)

            .build();
  }

  /**
   * Edit the logLevel for a particular flow id
   * Updates the loglevel for a flow id
   * @param request The request object
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse putFlowInstancesSettingsLoglevels(PutFlowInstancesSettingsLoglevelsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Edit the logLevel for a particular flow id
   * Updates the loglevel for a flow id
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> putFlowInstancesSettingsLoglevels(ApiRequest<FlowLogLevelRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a specific datatable by id
   * Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.
   * @param datatableId id of datatable (required)
   * @param body datatable json-schema (required)
   * @param expand Expand instructions for the result (optional)
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable putFlowsDatatable(String datatableId, DataTable body, String expand) throws IOException, ApiException {
    return  putFlowsDatatable(createPutFlowsDatatableRequest(datatableId, body, expand));
  }

  /**
   * Updates a specific datatable by id
   * Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.
   * @param datatableId id of datatable (required)
   * @param body datatable json-schema (required)
   * @param expand Expand instructions for the result (optional)
   * @return DataTable
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> putFlowsDatatableWithHttpInfo(String datatableId, DataTable body, String expand) throws IOException {
    return putFlowsDatatable(createPutFlowsDatatableRequest(datatableId, body, expand).withHttpInfo());
  }

  private PutFlowsDatatableRequest createPutFlowsDatatableRequest(String datatableId, DataTable body, String expand) {
    return PutFlowsDatatableRequest.builder()
            .withDatatableId(datatableId)

            .withBody(body)

            .withExpand(expand)

            .build();
  }

  /**
   * Updates a specific datatable by id
   * Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.
   * @param request The request object
   * @return DataTable
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataTable putFlowsDatatable(PutFlowsDatatableRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataTable> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataTable>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a specific datatable by id
   * Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataTable> putFlowsDatatable(ApiRequest<DataTable> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataTable>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataTable> response = (ApiResponse<DataTable>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a row entry
   * Updates a row with the given rowId (the value of the key field) to the new values.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {     \"Field1\": \"XYZZY\",     \"Field2\": false,     \"KEY\": \"27272\" }
   * @param datatableId id of datatable (required)
   * @param rowId the key for the row (required)
   * @param body datatable row (optional)
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> putFlowsDatatableRow(String datatableId, String rowId, Object body) throws IOException, ApiException {
    return  putFlowsDatatableRow(createPutFlowsDatatableRowRequest(datatableId, rowId, body));
  }

  /**
   * Update a row entry
   * Updates a row with the given rowId (the value of the key field) to the new values.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {     \"Field1\": \"XYZZY\",     \"Field2\": false,     \"KEY\": \"27272\" }
   * @param datatableId id of datatable (required)
   * @param rowId the key for the row (required)
   * @param body datatable row (optional)
   * @return Map<String, Object>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> putFlowsDatatableRowWithHttpInfo(String datatableId, String rowId, Object body) throws IOException {
    return putFlowsDatatableRow(createPutFlowsDatatableRowRequest(datatableId, rowId, body).withHttpInfo());
  }

  private PutFlowsDatatableRowRequest createPutFlowsDatatableRowRequest(String datatableId, String rowId, Object body) {
    return PutFlowsDatatableRowRequest.builder()
            .withDatatableId(datatableId)

            .withRowId(rowId)

            .withBody(body)

            .build();
  }

  /**
   * Update a row entry
   * Updates a row with the given rowId (the value of the key field) to the new values.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {     \"Field1\": \"XYZZY\",     \"Field2\": false,     \"KEY\": \"27272\" }
   * @param request The request object
   * @return Map<String, Object>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Map<String, Object> putFlowsDatatableRow(PutFlowsDatatableRowRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Map<String, Object>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a row entry
   * Updates a row with the given rowId (the value of the key field) to the new values.  When building the request body within API Explorer, Pro mode should be used. The DataTableRow should be a json-ized' stream of key -> value pairs {     \"Field1\": \"XYZZY\",     \"Field2\": false,     \"KEY\": \"27272\" }
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Map<String, Object>> putFlowsDatatableRow(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Map<String, Object>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Edit the flow default log level.
   * Edit the flow default log level.
   * @param body New LogLevel settings (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse putFlowsInstancesSettingsLoglevelsDefault(FlowLogLevelRequest body, List<String> expand) throws IOException, ApiException {
    return  putFlowsInstancesSettingsLoglevelsDefault(createPutFlowsInstancesSettingsLoglevelsDefaultRequest(body, expand));
  }

  /**
   * Edit the flow default log level.
   * Edit the flow default log level.
   * @param body New LogLevel settings (required)
   * @param expand Expand instructions for the result (optional)
   * @return FlowSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> putFlowsInstancesSettingsLoglevelsDefaultWithHttpInfo(FlowLogLevelRequest body, List<String> expand) throws IOException {
    return putFlowsInstancesSettingsLoglevelsDefault(createPutFlowsInstancesSettingsLoglevelsDefaultRequest(body, expand).withHttpInfo());
  }

  private PutFlowsInstancesSettingsLoglevelsDefaultRequest createPutFlowsInstancesSettingsLoglevelsDefaultRequest(FlowLogLevelRequest body, List<String> expand) {
    return PutFlowsInstancesSettingsLoglevelsDefaultRequest.builder()
            .withBody(body)

            .withExpand(expand)

            .build();
  }

  /**
   * Edit the flow default log level.
   * Edit the flow default log level.
   * @param request The request object
   * @return FlowSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowSettingsResponse putFlowsInstancesSettingsLoglevelsDefault(PutFlowsInstancesSettingsLoglevelsDefaultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Edit the flow default log level.
   * Edit the flow default log level.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowSettingsResponse> putFlowsInstancesSettingsLoglevelsDefault(ApiRequest<FlowLogLevelRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowSettingsResponse> response = (ApiResponse<FlowSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a flow milestone
   * 
   * @param milestoneId flow milestone ID (required)
   * @param body  (optional)
   * @return FlowMilestone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestone putFlowsMilestone(String milestoneId, FlowMilestone body) throws IOException, ApiException {
    return  putFlowsMilestone(createPutFlowsMilestoneRequest(milestoneId, body));
  }

  /**
   * Updates a flow milestone
   * 
   * @param milestoneId flow milestone ID (required)
   * @param body  (optional)
   * @return FlowMilestone
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestone> putFlowsMilestoneWithHttpInfo(String milestoneId, FlowMilestone body) throws IOException {
    return putFlowsMilestone(createPutFlowsMilestoneRequest(milestoneId, body).withHttpInfo());
  }

  private PutFlowsMilestoneRequest createPutFlowsMilestoneRequest(String milestoneId, FlowMilestone body) {
    return PutFlowsMilestoneRequest.builder()
            .withMilestoneId(milestoneId)

            .withBody(body)

            .build();
  }

  /**
   * Updates a flow milestone
   * 
   * @param request The request object
   * @return FlowMilestone
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowMilestone putFlowsMilestone(PutFlowsMilestoneRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowMilestone> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowMilestone>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a flow milestone
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowMilestone> putFlowsMilestone(ApiRequest<FlowMilestone> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowMilestone>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowMilestone> response = (ApiResponse<FlowMilestone>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a flow outcome
   * Updates a flow outcome.  Asynchronous.  Notification topic: v2.flowoutcomes.{flowoutcomeId}
   * @param flowOutcomeId flow outcome ID (required)
   * @param body  (optional)
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation putFlowsOutcome(String flowOutcomeId, FlowOutcome body) throws IOException, ApiException {
    return  putFlowsOutcome(createPutFlowsOutcomeRequest(flowOutcomeId, body));
  }

  /**
   * Updates a flow outcome
   * Updates a flow outcome.  Asynchronous.  Notification topic: v2.flowoutcomes.{flowoutcomeId}
   * @param flowOutcomeId flow outcome ID (required)
   * @param body  (optional)
   * @return Operation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> putFlowsOutcomeWithHttpInfo(String flowOutcomeId, FlowOutcome body) throws IOException {
    return putFlowsOutcome(createPutFlowsOutcomeRequest(flowOutcomeId, body).withHttpInfo());
  }

  private PutFlowsOutcomeRequest createPutFlowsOutcomeRequest(String flowOutcomeId, FlowOutcome body) {
    return PutFlowsOutcomeRequest.builder()
            .withFlowOutcomeId(flowOutcomeId)

            .withBody(body)

            .build();
  }

  /**
   * Updates a flow outcome
   * Updates a flow outcome.  Asynchronous.  Notification topic: v2.flowoutcomes.{flowoutcomeId}
   * @param request The request object
   * @return Operation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Operation putFlowsOutcome(PutFlowsOutcomeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Operation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Operation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a flow outcome
   * Updates a flow outcome.  Asynchronous.  Notification topic: v2.flowoutcomes.{flowoutcomeId}
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Operation> putFlowsOutcome(ApiRequest<FlowOutcome> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Operation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
